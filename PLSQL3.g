grammar PLSQL3;

options {output=template;}

scope slist {
    List locals; 
    List stats;
}


@header {
import org.antlr.stringtemplate.*;
}

program
scope {
  List globals;
}
@init {
  $program::globals = new ArrayList();
}
    :   'DECLARE'
        declaration+
        'BEGIN'
            block+
        'END'
        -> program(globals={$program::globals})
    ;

block
    : assignment {$program::globals.add($assignment.st);}
    | printstatement  {$program::globals.add($printstatement.st);}
    | sql_query     {$program::globals.add($sql_query.st);}
    | conditionals  {$program::globals.add($conditionals.st);}
    | loops {$program::globals.add($loops.st);}
    | wloop {$program::globals.add($wloop.st);}
    | floop {$program::globals.add($floop.st);}
    | procedure {$program::globals.add($procedure.st);}
    | function {$program::globals.add($function.st);}
    | funccall {$program::globals.add($funccall.st);}
    | procall  {$program::globals.add($procall.st);}
    ;

loops
scope slist;
@init {
     $slist::locals = new ArrayList();
}
    : 'LOOP'
            blockert+
       'IF' t2=v10 'THEN'
            'exit;'
        'END IF;'
        'END LOOP;'
    -> findloop(locals={$slist::locals}, t2={$t2.st}) 
    ;

function
scope slist;
@init {
     $slist::locals = new ArrayList();
}
    : 'CREATE OR REPLACE FUNCTION' t1=v1
        'RETURN' 
            t2=type ';'
        'IS'  
            t3=variable
        'BEGIN'
            blockert+
            'RETURN' t5=variable ';'
        'END;'
        -> function(t1={$t1.st}, t2={$t2.st}, t3={$t3.st}, locals={$slist::locals}, t5={$t5.st})
     ;   

wloop 
scope slist;
@init {
     $slist::locals = new ArrayList();
}
    : 'WHILE' t2=v10 'LOOP'
            blockert+
       'END LOOP;'
       -> wloop( locals={$slist::locals}, t2={$t2.st})
;

floop
scope slist;
@init {
     $slist::locals = new ArrayList();
}

    : 'FOR' t1=v1 'in' t2=aside1 '..' t3=aside1 'LOOP' 
        blockert+
      'END LOOP;'
      -> floop(t1={$t1.st}, t2={$t2.st}, t3={$t3.st}, 
                   locals={$slist::locals})  
;

procedure 
scope slist;
@init {
     $slist::locals = new ArrayList();
}
    :
    'CREATE OR REPLACE PROCEDURE' t1=v1
    'AS'
    'BEGIN'
        blockert+
    'END;'
    -> procedure(t1={$t1.st}, 
                   locals={$slist::locals})
;



conditionals 
scope slist;
@init {
     $slist::locals = new ArrayList();
     $slist::stats = new ArrayList();
}
        :   'IF'
            v4
            'THEN'
                blockert+
            'ELSE'
                blockert1+
            'END IF;'
            -> conditionals(v4={$v4.st},locals={$slist::locals},stats={$slist::stats})
        ;


blockert 
  : assignment {$slist::locals.add($assignment.st);} 
    | assignment1 {$slist::locals.add($assignment1.st);}
    | printstatement  {$slist::locals.add($printstatement.st);} 
    | sql_query     {$slist::locals.add($sql_query.st);} 
    | conditionals  {$slist::locals.add($conditionals.st);} 
    | loops {$slist::locals.add($loops.st);} 
    | wloop {$slist::locals.add($wloop.st);} 
    | floop {$slist::locals.add($floop.st);} 
    | procedure {$slist::locals.add($procedure.st);} 
    | function {$slist::locals.add($function.st);} 
    ;

blockert1 
  : assignment {$slist::stats.add($assignment.st);} 
    | assignment1 {$slist::stats.add($assignment1.st);}
    | printstatement  {$slist::stats.add($printstatement.st);} 
    | sql_query     {$slist::stats.add($sql_query.st);} 
    | conditionals  {$slist::stats.add($conditionals.st);} 
    | loops {$slist::stats.add($loops.st);} 
    | wloop {$slist::stats.add($wloop.st);} 
    | floop {$slist::stats.add($floop.st);} 
    | procedure {$slist::stats.add($procedure.st);} 
    | function {$slist::stats.add($function.st);} 
    ;



assignment 
    : var1 ':=' var2 ';' -> assignme(var1={$var1.st},var2={$var2.st})
;

assignment1
    : var1 ':=' v10 ';' -> giveassign(t1={$var1.st}, t2={$v10.st})
; 

var1
    : ID -> {new StringTemplate($ID.text)}
;

var2
    : N -> {new StringTemplate($N.text)}
;

declaration
    : variable   {$program::globals.add($variable.st);}
    ;

variable
    :   declarator type ';'
        -> variable(type={$type.st},name={$declarator.st})
    ;

declarator
    :   ID -> {new StringTemplate($ID.text)}
    ;

type
    :   'number'  -> type_int()
    |   'varchar' -> type_string()
    |   'float' -> type_float()
    ;

printstatement
    :   'dbms_output.put_line(' state ');' -> printer(state={$state.st})  
    ;

state
    :   
        ID -> {new StringTemplate($ID.text)}    
    ;

sql_query
    :   'SELECT'
        v1
        'INTO'
        v2
        'FROM'
        v3
        ';'
        -> sqler(v1={$v1.st},v2={$v2.st},v3={$v3.st})
    ;

v1 : 
    ID -> {new StringTemplate($ID.text)}
;

v2 :
     ID -> {new StringTemplate($ID.text)}
;

v3 : 
    ID -> {new StringTemplate($ID.text)}
;

funccall :  i=k '=' j=k '();'
-> funccall(i={$i.st}, j={$j.st})
;

procall :  j=k '();'
->  procall(j={$j.st})
;

k :
    ID -> {new StringTemplate($ID.text)}
;

v4 : 
    '('
    a=aside
    (
        ( '=' b=aside1 -> abequals(left={$a.st}, right={$b.st}))
        | ('<' b=aside1 -> abless(left={$a.st}, right={$b.st}))
        | ('>' b=aside1 -> abright(left={$a.st}, right={$b.st}))
        | ('+' b=aside1 -> abplus(left={$a.st}, right={$b.st}))
    )
    ')'
;

v10:
    a=aside
    (
        ( '=' b=aside1 -> abequals(left={$a.st}, right={$b.st}))
        | ('<' b=aside1 -> abless(left={$a.st}, right={$b.st}))
        | ('>' b=aside1 -> abright(left={$a.st}, right={$b.st}))
        | ('+' b=aside1 -> abplus(left={$a.st}, right={$b.st}))
    )
;

aside :
    ID -> refVar(id={$ID.text})
    ;


aside1 :
    N -> iconst(value={$N.text})
    ;

ID  :   ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
    ;

N
    : '0' .. '9' ( '0' .. '9' )*
    ;


WS  :   (' ' | '\t' | '\r' | '\n')+ {$channel=HIDDEN;}
    ;   
