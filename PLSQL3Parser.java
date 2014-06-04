// $ANTLR 3.3 Nov 30, 2010 12:50:56 PLSQL3.g 2014-06-04 15:33:41

import org.antlr.stringtemplate.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.stringtemplate.*;
import org.antlr.stringtemplate.language.*;
import java.util.HashMap;
public class PLSQL3Parser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "N", "WS", "'DECLARE'", "'BEGIN'", "'END'", "'LOOP'", "'IF'", "'THEN'", "'exit;'", "'END IF;'", "'END LOOP;'", "'CREATE OR REPLACE FUNCTION'", "'RETURN'", "';'", "'IS'", "'END;'", "'WHILE'", "'FOR'", "'in'", "'..'", "'CREATE OR REPLACE PROCEDURE'", "'AS'", "'ELSE'", "':='", "'number'", "'varchar'", "'float'", "'dbms_output.put_line('", "');'", "'SELECT'", "'INTO'", "'FROM'", "'='", "'();'", "'('", "'<'", "'>'", "'+'", "')'"
    };
    public static final int EOF=-1;
    public static final int T__7=7;
    public static final int T__8=8;
    public static final int T__9=9;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int ID=4;
    public static final int N=5;
    public static final int WS=6;

    // delegates
    // delegators

    protected static class slist_scope {
        List locals;
        List stats;
    }
    protected Stack slist_stack = new Stack();


        public PLSQL3Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public PLSQL3Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected StringTemplateGroup templateLib =
      new StringTemplateGroup("PLSQL3ParserTemplates", AngleBracketTemplateLexer.class);

    public void setTemplateLib(StringTemplateGroup templateLib) {
      this.templateLib = templateLib;
    }
    public StringTemplateGroup getTemplateLib() {
      return templateLib;
    }
    /** allows convenient multi-value initialization:
     *  "new STAttrMap().put(...).put(...)"
     */
    public static class STAttrMap extends HashMap {
      public STAttrMap put(String attrName, Object value) {
        super.put(attrName, value);
        return this;
      }
      public STAttrMap put(String attrName, int value) {
        super.put(attrName, new Integer(value));
        return this;
      }
    }

    public String[] getTokenNames() { return PLSQL3Parser.tokenNames; }
    public String getGrammarFileName() { return "PLSQL3.g"; }


    protected static class program_scope {
        List globals;
    }
    protected Stack program_stack = new Stack();

    public static class program_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "program"
    // PLSQL3.g:15:1: program : 'DECLARE' ( declaration )+ 'BEGIN' ( block )+ 'END' -> program(globals=$program::globals);
    public final PLSQL3Parser.program_return program() throws RecognitionException {
        program_stack.push(new program_scope());
        PLSQL3Parser.program_return retval = new PLSQL3Parser.program_return();
        retval.start = input.LT(1);


          ((program_scope)program_stack.peek()).globals = new ArrayList();

        try {
            // PLSQL3.g:22:5: ( 'DECLARE' ( declaration )+ 'BEGIN' ( block )+ 'END' -> program(globals=$program::globals))
            // PLSQL3.g:22:9: 'DECLARE' ( declaration )+ 'BEGIN' ( block )+ 'END'
            {
            match(input,7,FOLLOW_7_in_program47); 
            // PLSQL3.g:23:9: ( declaration )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // PLSQL3.g:23:9: declaration
            	    {
            	    pushFollow(FOLLOW_declaration_in_program57);
            	    declaration();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            match(input,8,FOLLOW_8_in_program68); 
            // PLSQL3.g:25:13: ( block )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==ID||(LA2_0>=10 && LA2_0<=11)||LA2_0==16||(LA2_0>=21 && LA2_0<=22)||LA2_0==25||LA2_0==32||LA2_0==34) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // PLSQL3.g:25:13: block
            	    {
            	    pushFollow(FOLLOW_block_in_program82);
            	    block();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            match(input,9,FOLLOW_9_in_program93); 


            // TEMPLATE REWRITE
            // 27:9: -> program(globals=$program::globals)
            {
                retval.st = templateLib.getInstanceOf("program",
              new STAttrMap().put("globals", ((program_scope)program_stack.peek()).globals));
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            program_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "program"

    public static class block_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "block"
    // PLSQL3.g:30:1: block : ( assignment | printstatement | sql_query | conditionals | loops | wloop | floop | procedure | function | funccall | procall );
    public final PLSQL3Parser.block_return block() throws RecognitionException {
        PLSQL3Parser.block_return retval = new PLSQL3Parser.block_return();
        retval.start = input.LT(1);

        PLSQL3Parser.assignment_return assignment1 = null;

        PLSQL3Parser.printstatement_return printstatement2 = null;

        PLSQL3Parser.sql_query_return sql_query3 = null;

        PLSQL3Parser.conditionals_return conditionals4 = null;

        PLSQL3Parser.loops_return loops5 = null;

        PLSQL3Parser.wloop_return wloop6 = null;

        PLSQL3Parser.floop_return floop7 = null;

        PLSQL3Parser.procedure_return procedure8 = null;

        PLSQL3Parser.function_return function9 = null;

        PLSQL3Parser.funccall_return funccall10 = null;

        PLSQL3Parser.procall_return procall11 = null;


        try {
            // PLSQL3.g:31:5: ( assignment | printstatement | sql_query | conditionals | loops | wloop | floop | procedure | function | funccall | procall )
            int alt3=11;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // PLSQL3.g:31:7: assignment
                    {
                    pushFollow(FOLLOW_assignment_in_block127);
                    assignment1=assignment();

                    state._fsp--;

                    ((program_scope)program_stack.peek()).globals.add((assignment1!=null?assignment1.st:null));

                    }
                    break;
                case 2 :
                    // PLSQL3.g:32:7: printstatement
                    {
                    pushFollow(FOLLOW_printstatement_in_block137);
                    printstatement2=printstatement();

                    state._fsp--;

                    ((program_scope)program_stack.peek()).globals.add((printstatement2!=null?printstatement2.st:null));

                    }
                    break;
                case 3 :
                    // PLSQL3.g:33:7: sql_query
                    {
                    pushFollow(FOLLOW_sql_query_in_block148);
                    sql_query3=sql_query();

                    state._fsp--;

                    ((program_scope)program_stack.peek()).globals.add((sql_query3!=null?sql_query3.st:null));

                    }
                    break;
                case 4 :
                    // PLSQL3.g:34:7: conditionals
                    {
                    pushFollow(FOLLOW_conditionals_in_block162);
                    conditionals4=conditionals();

                    state._fsp--;

                    ((program_scope)program_stack.peek()).globals.add((conditionals4!=null?conditionals4.st:null));

                    }
                    break;
                case 5 :
                    // PLSQL3.g:35:7: loops
                    {
                    pushFollow(FOLLOW_loops_in_block173);
                    loops5=loops();

                    state._fsp--;

                    ((program_scope)program_stack.peek()).globals.add((loops5!=null?loops5.st:null));

                    }
                    break;
                case 6 :
                    // PLSQL3.g:36:7: wloop
                    {
                    pushFollow(FOLLOW_wloop_in_block183);
                    wloop6=wloop();

                    state._fsp--;

                    ((program_scope)program_stack.peek()).globals.add((wloop6!=null?wloop6.st:null));

                    }
                    break;
                case 7 :
                    // PLSQL3.g:37:7: floop
                    {
                    pushFollow(FOLLOW_floop_in_block193);
                    floop7=floop();

                    state._fsp--;

                    ((program_scope)program_stack.peek()).globals.add((floop7!=null?floop7.st:null));

                    }
                    break;
                case 8 :
                    // PLSQL3.g:38:7: procedure
                    {
                    pushFollow(FOLLOW_procedure_in_block203);
                    procedure8=procedure();

                    state._fsp--;

                    ((program_scope)program_stack.peek()).globals.add((procedure8!=null?procedure8.st:null));

                    }
                    break;
                case 9 :
                    // PLSQL3.g:39:7: function
                    {
                    pushFollow(FOLLOW_function_in_block213);
                    function9=function();

                    state._fsp--;

                    ((program_scope)program_stack.peek()).globals.add((function9!=null?function9.st:null));

                    }
                    break;
                case 10 :
                    // PLSQL3.g:40:7: funccall
                    {
                    pushFollow(FOLLOW_funccall_in_block223);
                    funccall10=funccall();

                    state._fsp--;

                    ((program_scope)program_stack.peek()).globals.add((funccall10!=null?funccall10.st:null));

                    }
                    break;
                case 11 :
                    // PLSQL3.g:41:7: procall
                    {
                    pushFollow(FOLLOW_procall_in_block233);
                    procall11=procall();

                    state._fsp--;

                    ((program_scope)program_stack.peek()).globals.add((procall11!=null?procall11.st:null));

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "block"

    public static class loops_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "loops"
    // PLSQL3.g:44:1: loops : 'LOOP' ( blockert )+ 'IF' t2= v10 'THEN' 'exit;' 'END IF;' 'END LOOP;' -> findloop(locals=$slist::localst2=$t2.st);
    public final PLSQL3Parser.loops_return loops() throws RecognitionException {
        slist_stack.push(new slist_scope());

        PLSQL3Parser.loops_return retval = new PLSQL3Parser.loops_return();
        retval.start = input.LT(1);

        PLSQL3Parser.v10_return t2 = null;



             ((slist_scope)slist_stack.peek()).locals = new ArrayList();

        try {
            // PLSQL3.g:49:5: ( 'LOOP' ( blockert )+ 'IF' t2= v10 'THEN' 'exit;' 'END IF;' 'END LOOP;' -> findloop(locals=$slist::localst2=$t2.st))
            // PLSQL3.g:49:7: 'LOOP' ( blockert )+ 'IF' t2= v10 'THEN' 'exit;' 'END IF;' 'END LOOP;'
            {
            match(input,10,FOLLOW_10_in_loops263); 
            // PLSQL3.g:50:13: ( blockert )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==11) ) {
                    int LA4_1 = input.LA(2);

                    if ( (LA4_1==39) ) {
                        alt4=1;
                    }


                }
                else if ( (LA4_0==ID||LA4_0==10||LA4_0==16||(LA4_0>=21 && LA4_0<=22)||LA4_0==25||LA4_0==32||LA4_0==34) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // PLSQL3.g:50:13: blockert
            	    {
            	    pushFollow(FOLLOW_blockert_in_loops277);
            	    blockert();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            match(input,11,FOLLOW_11_in_loops287); 
            pushFollow(FOLLOW_v10_in_loops291);
            t2=v10();

            state._fsp--;

            match(input,12,FOLLOW_12_in_loops293); 
            match(input,13,FOLLOW_13_in_loops307); 
            match(input,14,FOLLOW_14_in_loops317); 
            match(input,15,FOLLOW_15_in_loops327); 


            // TEMPLATE REWRITE
            // 55:5: -> findloop(locals=$slist::localst2=$t2.st)
            {
                retval.st = templateLib.getInstanceOf("findloop",
              new STAttrMap().put("locals", ((slist_scope)slist_stack.peek()).locals).put("t2", (t2!=null?t2.st:null)));
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            slist_stack.pop();

        }
        return retval;
    }
    // $ANTLR end "loops"

    public static class function_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "function"
    // PLSQL3.g:58:1: function : 'CREATE OR REPLACE FUNCTION' t1= v1 'RETURN' t2= type ';' 'IS' t3= variable 'BEGIN' ( blockert )+ 'RETURN' t5= variable ';' 'END;' -> function(t1=$t1.stt2=$t2.stt3=$t3.stlocals=$slist::localst5=$t5.st);
    public final PLSQL3Parser.function_return function() throws RecognitionException {
        slist_stack.push(new slist_scope());

        PLSQL3Parser.function_return retval = new PLSQL3Parser.function_return();
        retval.start = input.LT(1);

        PLSQL3Parser.v1_return t1 = null;

        PLSQL3Parser.type_return t2 = null;

        PLSQL3Parser.variable_return t3 = null;

        PLSQL3Parser.variable_return t5 = null;



             ((slist_scope)slist_stack.peek()).locals = new ArrayList();

        try {
            // PLSQL3.g:63:5: ( 'CREATE OR REPLACE FUNCTION' t1= v1 'RETURN' t2= type ';' 'IS' t3= variable 'BEGIN' ( blockert )+ 'RETURN' t5= variable ';' 'END;' -> function(t1=$t1.stt2=$t2.stt3=$t3.stlocals=$slist::localst5=$t5.st))
            // PLSQL3.g:63:7: 'CREATE OR REPLACE FUNCTION' t1= v1 'RETURN' t2= type ';' 'IS' t3= variable 'BEGIN' ( blockert )+ 'RETURN' t5= variable ';' 'END;'
            {
            match(input,16,FOLLOW_16_in_function373); 
            pushFollow(FOLLOW_v1_in_function377);
            t1=v1();

            state._fsp--;

            match(input,17,FOLLOW_17_in_function387); 
            pushFollow(FOLLOW_type_in_function404);
            t2=type();

            state._fsp--;

            match(input,18,FOLLOW_18_in_function406); 
            match(input,19,FOLLOW_19_in_function416); 
            pushFollow(FOLLOW_variable_in_function434);
            t3=variable();

            state._fsp--;

            match(input,8,FOLLOW_8_in_function444); 
            // PLSQL3.g:69:13: ( blockert )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==ID||(LA5_0>=10 && LA5_0<=11)||LA5_0==16||(LA5_0>=21 && LA5_0<=22)||LA5_0==25||LA5_0==32||LA5_0==34) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // PLSQL3.g:69:13: blockert
            	    {
            	    pushFollow(FOLLOW_blockert_in_function458);
            	    blockert();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

            match(input,17,FOLLOW_17_in_function473); 
            pushFollow(FOLLOW_variable_in_function477);
            t5=variable();

            state._fsp--;

            match(input,18,FOLLOW_18_in_function479); 
            match(input,20,FOLLOW_20_in_function489); 


            // TEMPLATE REWRITE
            // 72:9: -> function(t1=$t1.stt2=$t2.stt3=$t3.stlocals=$slist::localst5=$t5.st)
            {
                retval.st = templateLib.getInstanceOf("function",
              new STAttrMap().put("t1", (t1!=null?t1.st:null)).put("t2", (t2!=null?t2.st:null)).put("t3", (t3!=null?t3.st:null)).put("locals", ((slist_scope)slist_stack.peek()).locals).put("t5", (t5!=null?t5.st:null)));
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            slist_stack.pop();

        }
        return retval;
    }
    // $ANTLR end "function"

    public static class wloop_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "wloop"
    // PLSQL3.g:75:1: wloop : 'WHILE' t2= v10 'LOOP' ( blockert )+ 'END LOOP;' -> wloop(locals=$slist::localst2=$t2.st);
    public final PLSQL3Parser.wloop_return wloop() throws RecognitionException {
        slist_stack.push(new slist_scope());

        PLSQL3Parser.wloop_return retval = new PLSQL3Parser.wloop_return();
        retval.start = input.LT(1);

        PLSQL3Parser.v10_return t2 = null;



             ((slist_scope)slist_stack.peek()).locals = new ArrayList();

        try {
            // PLSQL3.g:80:5: ( 'WHILE' t2= v10 'LOOP' ( blockert )+ 'END LOOP;' -> wloop(locals=$slist::localst2=$t2.st))
            // PLSQL3.g:80:7: 'WHILE' t2= v10 'LOOP' ( blockert )+ 'END LOOP;'
            {
            match(input,21,FOLLOW_21_in_wloop558); 
            pushFollow(FOLLOW_v10_in_wloop562);
            t2=v10();

            state._fsp--;

            match(input,10,FOLLOW_10_in_wloop564); 
            // PLSQL3.g:81:13: ( blockert )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==ID||(LA6_0>=10 && LA6_0<=11)||LA6_0==16||(LA6_0>=21 && LA6_0<=22)||LA6_0==25||LA6_0==32||LA6_0==34) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // PLSQL3.g:81:13: blockert
            	    {
            	    pushFollow(FOLLOW_blockert_in_wloop578);
            	    blockert();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);

            match(input,15,FOLLOW_15_in_wloop588); 


            // TEMPLATE REWRITE
            // 83:8: -> wloop(locals=$slist::localst2=$t2.st)
            {
                retval.st = templateLib.getInstanceOf("wloop",
              new STAttrMap().put("locals", ((slist_scope)slist_stack.peek()).locals).put("t2", (t2!=null?t2.st:null)));
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            slist_stack.pop();

        }
        return retval;
    }
    // $ANTLR end "wloop"

    public static class floop_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "floop"
    // PLSQL3.g:86:1: floop : 'FOR' t1= v1 'in' t2= aside1 '..' t3= aside1 'LOOP' ( blockert )+ 'END LOOP;' -> floop(t1=$t1.stt2=$t2.stt3=$t3.stlocals=$slist::locals);
    public final PLSQL3Parser.floop_return floop() throws RecognitionException {
        slist_stack.push(new slist_scope());

        PLSQL3Parser.floop_return retval = new PLSQL3Parser.floop_return();
        retval.start = input.LT(1);

        PLSQL3Parser.v1_return t1 = null;

        PLSQL3Parser.aside1_return t2 = null;

        PLSQL3Parser.aside1_return t3 = null;



             ((slist_scope)slist_stack.peek()).locals = new ArrayList();

        try {
            // PLSQL3.g:92:5: ( 'FOR' t1= v1 'in' t2= aside1 '..' t3= aside1 'LOOP' ( blockert )+ 'END LOOP;' -> floop(t1=$t1.stt2=$t2.stt3=$t3.stlocals=$slist::locals))
            // PLSQL3.g:92:7: 'FOR' t1= v1 'in' t2= aside1 '..' t3= aside1 'LOOP' ( blockert )+ 'END LOOP;'
            {
            match(input,22,FOLLOW_22_in_floop634); 
            pushFollow(FOLLOW_v1_in_floop638);
            t1=v1();

            state._fsp--;

            match(input,23,FOLLOW_23_in_floop640); 
            pushFollow(FOLLOW_aside1_in_floop644);
            t2=aside1();

            state._fsp--;

            match(input,24,FOLLOW_24_in_floop646); 
            pushFollow(FOLLOW_aside1_in_floop650);
            t3=aside1();

            state._fsp--;

            match(input,10,FOLLOW_10_in_floop652); 
            // PLSQL3.g:93:9: ( blockert )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==ID||(LA7_0>=10 && LA7_0<=11)||LA7_0==16||(LA7_0>=21 && LA7_0<=22)||LA7_0==25||LA7_0==32||LA7_0==34) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // PLSQL3.g:93:9: blockert
            	    {
            	    pushFollow(FOLLOW_blockert_in_floop663);
            	    blockert();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);

            match(input,15,FOLLOW_15_in_floop672); 


            // TEMPLATE REWRITE
            // 95:7: -> floop(t1=$t1.stt2=$t2.stt3=$t3.stlocals=$slist::locals)
            {
                retval.st = templateLib.getInstanceOf("floop",
              new STAttrMap().put("t1", (t1!=null?t1.st:null)).put("t2", (t2!=null?t2.st:null)).put("t3", (t3!=null?t3.st:null)).put("locals", ((slist_scope)slist_stack.peek()).locals));
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            slist_stack.pop();

        }
        return retval;
    }
    // $ANTLR end "floop"

    public static class procedure_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "procedure"
    // PLSQL3.g:99:1: procedure : 'CREATE OR REPLACE PROCEDURE' t1= v1 'AS' 'BEGIN' ( blockert )+ 'END;' -> procedure(t1=$t1.stlocals=$slist::locals);
    public final PLSQL3Parser.procedure_return procedure() throws RecognitionException {
        slist_stack.push(new slist_scope());

        PLSQL3Parser.procedure_return retval = new PLSQL3Parser.procedure_return();
        retval.start = input.LT(1);

        PLSQL3Parser.v1_return t1 = null;



             ((slist_scope)slist_stack.peek()).locals = new ArrayList();

        try {
            // PLSQL3.g:104:5: ( 'CREATE OR REPLACE PROCEDURE' t1= v1 'AS' 'BEGIN' ( blockert )+ 'END;' -> procedure(t1=$t1.stlocals=$slist::locals))
            // PLSQL3.g:105:5: 'CREATE OR REPLACE PROCEDURE' t1= v1 'AS' 'BEGIN' ( blockert )+ 'END;'
            {
            match(input,25,FOLLOW_25_in_procedure752); 
            pushFollow(FOLLOW_v1_in_procedure756);
            t1=v1();

            state._fsp--;

            match(input,26,FOLLOW_26_in_procedure762); 
            match(input,8,FOLLOW_8_in_procedure768); 
            // PLSQL3.g:108:9: ( blockert )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==ID||(LA8_0>=10 && LA8_0<=11)||LA8_0==16||(LA8_0>=21 && LA8_0<=22)||LA8_0==25||LA8_0==32||LA8_0==34) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // PLSQL3.g:108:9: blockert
            	    {
            	    pushFollow(FOLLOW_blockert_in_procedure778);
            	    blockert();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);

            match(input,20,FOLLOW_20_in_procedure785); 


            // TEMPLATE REWRITE
            // 110:5: -> procedure(t1=$t1.stlocals=$slist::locals)
            {
                retval.st = templateLib.getInstanceOf("procedure",
              new STAttrMap().put("t1", (t1!=null?t1.st:null)).put("locals", ((slist_scope)slist_stack.peek()).locals));
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            slist_stack.pop();

        }
        return retval;
    }
    // $ANTLR end "procedure"

    public static class conditionals_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "conditionals"
    // PLSQL3.g:116:1: conditionals : 'IF' v4 'THEN' ( blockert )+ 'ELSE' ( blockert1 )+ 'END IF;' -> conditionals(v4=$v4.stlocals=$slist::localsstats=$slist::stats);
    public final PLSQL3Parser.conditionals_return conditionals() throws RecognitionException {
        slist_stack.push(new slist_scope());

        PLSQL3Parser.conditionals_return retval = new PLSQL3Parser.conditionals_return();
        retval.start = input.LT(1);

        PLSQL3Parser.v4_return v412 = null;



             ((slist_scope)slist_stack.peek()).locals = new ArrayList();
             ((slist_scope)slist_stack.peek()).stats = new ArrayList();

        try {
            // PLSQL3.g:122:9: ( 'IF' v4 'THEN' ( blockert )+ 'ELSE' ( blockert1 )+ 'END IF;' -> conditionals(v4=$v4.stlocals=$slist::localsstats=$slist::stats))
            // PLSQL3.g:122:13: 'IF' v4 'THEN' ( blockert )+ 'ELSE' ( blockert1 )+ 'END IF;'
            {
            match(input,11,FOLLOW_11_in_conditionals855); 
            pushFollow(FOLLOW_v4_in_conditionals869);
            v412=v4();

            state._fsp--;

            match(input,12,FOLLOW_12_in_conditionals883); 
            // PLSQL3.g:125:17: ( blockert )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==ID||(LA9_0>=10 && LA9_0<=11)||LA9_0==16||(LA9_0>=21 && LA9_0<=22)||LA9_0==25||LA9_0==32||LA9_0==34) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // PLSQL3.g:125:17: blockert
            	    {
            	    pushFollow(FOLLOW_blockert_in_conditionals901);
            	    blockert();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);

            match(input,27,FOLLOW_27_in_conditionals916); 
            // PLSQL3.g:127:17: ( blockert1 )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==ID||(LA10_0>=10 && LA10_0<=11)||LA10_0==16||(LA10_0>=21 && LA10_0<=22)||LA10_0==25||LA10_0==32||LA10_0==34) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // PLSQL3.g:127:17: blockert1
            	    {
            	    pushFollow(FOLLOW_blockert1_in_conditionals934);
            	    blockert1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);

            match(input,14,FOLLOW_14_in_conditionals949); 


            // TEMPLATE REWRITE
            // 129:13: -> conditionals(v4=$v4.stlocals=$slist::localsstats=$slist::stats)
            {
                retval.st = templateLib.getInstanceOf("conditionals",
              new STAttrMap().put("v4", (v412!=null?v412.st:null)).put("locals", ((slist_scope)slist_stack.peek()).locals).put("stats", ((slist_scope)slist_stack.peek()).stats));
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            slist_stack.pop();

        }
        return retval;
    }
    // $ANTLR end "conditionals"

    public static class blockert_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "blockert"
    // PLSQL3.g:133:1: blockert : ( assignment | assignment1 | printstatement | sql_query | conditionals | loops | wloop | floop | procedure | function );
    public final PLSQL3Parser.blockert_return blockert() throws RecognitionException {
        PLSQL3Parser.blockert_return retval = new PLSQL3Parser.blockert_return();
        retval.start = input.LT(1);

        PLSQL3Parser.assignment_return assignment13 = null;

        PLSQL3Parser.assignment1_return assignment114 = null;

        PLSQL3Parser.printstatement_return printstatement15 = null;

        PLSQL3Parser.sql_query_return sql_query16 = null;

        PLSQL3Parser.conditionals_return conditionals17 = null;

        PLSQL3Parser.loops_return loops18 = null;

        PLSQL3Parser.wloop_return wloop19 = null;

        PLSQL3Parser.floop_return floop20 = null;

        PLSQL3Parser.procedure_return procedure21 = null;

        PLSQL3Parser.function_return function22 = null;


        try {
            // PLSQL3.g:134:3: ( assignment | assignment1 | printstatement | sql_query | conditionals | loops | wloop | floop | procedure | function )
            int alt11=10;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // PLSQL3.g:134:5: assignment
                    {
                    pushFollow(FOLLOW_assignment_in_blockert999);
                    assignment13=assignment();

                    state._fsp--;

                    ((slist_scope)slist_stack.peek()).locals.add((assignment13!=null?assignment13.st:null));

                    }
                    break;
                case 2 :
                    // PLSQL3.g:135:7: assignment1
                    {
                    pushFollow(FOLLOW_assignment1_in_blockert1010);
                    assignment114=assignment1();

                    state._fsp--;

                    ((slist_scope)slist_stack.peek()).locals.add((assignment114!=null?assignment114.st:null));

                    }
                    break;
                case 3 :
                    // PLSQL3.g:136:7: printstatement
                    {
                    pushFollow(FOLLOW_printstatement_in_blockert1020);
                    printstatement15=printstatement();

                    state._fsp--;

                    ((slist_scope)slist_stack.peek()).locals.add((printstatement15!=null?printstatement15.st:null));

                    }
                    break;
                case 4 :
                    // PLSQL3.g:137:7: sql_query
                    {
                    pushFollow(FOLLOW_sql_query_in_blockert1032);
                    sql_query16=sql_query();

                    state._fsp--;

                    ((slist_scope)slist_stack.peek()).locals.add((sql_query16!=null?sql_query16.st:null));

                    }
                    break;
                case 5 :
                    // PLSQL3.g:138:7: conditionals
                    {
                    pushFollow(FOLLOW_conditionals_in_blockert1047);
                    conditionals17=conditionals();

                    state._fsp--;

                    ((slist_scope)slist_stack.peek()).locals.add((conditionals17!=null?conditionals17.st:null));

                    }
                    break;
                case 6 :
                    // PLSQL3.g:139:7: loops
                    {
                    pushFollow(FOLLOW_loops_in_blockert1059);
                    loops18=loops();

                    state._fsp--;

                    ((slist_scope)slist_stack.peek()).locals.add((loops18!=null?loops18.st:null));

                    }
                    break;
                case 7 :
                    // PLSQL3.g:140:7: wloop
                    {
                    pushFollow(FOLLOW_wloop_in_blockert1070);
                    wloop19=wloop();

                    state._fsp--;

                    ((slist_scope)slist_stack.peek()).locals.add((wloop19!=null?wloop19.st:null));

                    }
                    break;
                case 8 :
                    // PLSQL3.g:141:7: floop
                    {
                    pushFollow(FOLLOW_floop_in_blockert1081);
                    floop20=floop();

                    state._fsp--;

                    ((slist_scope)slist_stack.peek()).locals.add((floop20!=null?floop20.st:null));

                    }
                    break;
                case 9 :
                    // PLSQL3.g:142:7: procedure
                    {
                    pushFollow(FOLLOW_procedure_in_blockert1092);
                    procedure21=procedure();

                    state._fsp--;

                    ((slist_scope)slist_stack.peek()).locals.add((procedure21!=null?procedure21.st:null));

                    }
                    break;
                case 10 :
                    // PLSQL3.g:143:7: function
                    {
                    pushFollow(FOLLOW_function_in_blockert1103);
                    function22=function();

                    state._fsp--;

                    ((slist_scope)slist_stack.peek()).locals.add((function22!=null?function22.st:null));

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "blockert"

    public static class blockert1_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "blockert1"
    // PLSQL3.g:146:1: blockert1 : ( assignment | assignment1 | printstatement | sql_query | conditionals | loops | wloop | floop | procedure | function );
    public final PLSQL3Parser.blockert1_return blockert1() throws RecognitionException {
        PLSQL3Parser.blockert1_return retval = new PLSQL3Parser.blockert1_return();
        retval.start = input.LT(1);

        PLSQL3Parser.assignment_return assignment23 = null;

        PLSQL3Parser.assignment1_return assignment124 = null;

        PLSQL3Parser.printstatement_return printstatement25 = null;

        PLSQL3Parser.sql_query_return sql_query26 = null;

        PLSQL3Parser.conditionals_return conditionals27 = null;

        PLSQL3Parser.loops_return loops28 = null;

        PLSQL3Parser.wloop_return wloop29 = null;

        PLSQL3Parser.floop_return floop30 = null;

        PLSQL3Parser.procedure_return procedure31 = null;

        PLSQL3Parser.function_return function32 = null;


        try {
            // PLSQL3.g:147:3: ( assignment | assignment1 | printstatement | sql_query | conditionals | loops | wloop | floop | procedure | function )
            int alt12=10;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // PLSQL3.g:147:5: assignment
                    {
                    pushFollow(FOLLOW_assignment_in_blockert11122);
                    assignment23=assignment();

                    state._fsp--;

                    ((slist_scope)slist_stack.peek()).stats.add((assignment23!=null?assignment23.st:null));

                    }
                    break;
                case 2 :
                    // PLSQL3.g:148:7: assignment1
                    {
                    pushFollow(FOLLOW_assignment1_in_blockert11133);
                    assignment124=assignment1();

                    state._fsp--;

                    ((slist_scope)slist_stack.peek()).stats.add((assignment124!=null?assignment124.st:null));

                    }
                    break;
                case 3 :
                    // PLSQL3.g:149:7: printstatement
                    {
                    pushFollow(FOLLOW_printstatement_in_blockert11143);
                    printstatement25=printstatement();

                    state._fsp--;

                    ((slist_scope)slist_stack.peek()).stats.add((printstatement25!=null?printstatement25.st:null));

                    }
                    break;
                case 4 :
                    // PLSQL3.g:150:7: sql_query
                    {
                    pushFollow(FOLLOW_sql_query_in_blockert11155);
                    sql_query26=sql_query();

                    state._fsp--;

                    ((slist_scope)slist_stack.peek()).stats.add((sql_query26!=null?sql_query26.st:null));

                    }
                    break;
                case 5 :
                    // PLSQL3.g:151:7: conditionals
                    {
                    pushFollow(FOLLOW_conditionals_in_blockert11170);
                    conditionals27=conditionals();

                    state._fsp--;

                    ((slist_scope)slist_stack.peek()).stats.add((conditionals27!=null?conditionals27.st:null));

                    }
                    break;
                case 6 :
                    // PLSQL3.g:152:7: loops
                    {
                    pushFollow(FOLLOW_loops_in_blockert11182);
                    loops28=loops();

                    state._fsp--;

                    ((slist_scope)slist_stack.peek()).stats.add((loops28!=null?loops28.st:null));

                    }
                    break;
                case 7 :
                    // PLSQL3.g:153:7: wloop
                    {
                    pushFollow(FOLLOW_wloop_in_blockert11193);
                    wloop29=wloop();

                    state._fsp--;

                    ((slist_scope)slist_stack.peek()).stats.add((wloop29!=null?wloop29.st:null));

                    }
                    break;
                case 8 :
                    // PLSQL3.g:154:7: floop
                    {
                    pushFollow(FOLLOW_floop_in_blockert11204);
                    floop30=floop();

                    state._fsp--;

                    ((slist_scope)slist_stack.peek()).stats.add((floop30!=null?floop30.st:null));

                    }
                    break;
                case 9 :
                    // PLSQL3.g:155:7: procedure
                    {
                    pushFollow(FOLLOW_procedure_in_blockert11215);
                    procedure31=procedure();

                    state._fsp--;

                    ((slist_scope)slist_stack.peek()).stats.add((procedure31!=null?procedure31.st:null));

                    }
                    break;
                case 10 :
                    // PLSQL3.g:156:7: function
                    {
                    pushFollow(FOLLOW_function_in_blockert11226);
                    function32=function();

                    state._fsp--;

                    ((slist_scope)slist_stack.peek()).stats.add((function32!=null?function32.st:null));

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "blockert1"

    public static class assignment_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "assignment"
    // PLSQL3.g:161:1: assignment : var1 ':=' var2 ';' -> assignme(var1=$var1.stvar2=$var2.st);
    public final PLSQL3Parser.assignment_return assignment() throws RecognitionException {
        PLSQL3Parser.assignment_return retval = new PLSQL3Parser.assignment_return();
        retval.start = input.LT(1);

        PLSQL3Parser.var1_return var133 = null;

        PLSQL3Parser.var2_return var234 = null;


        try {
            // PLSQL3.g:162:5: ( var1 ':=' var2 ';' -> assignme(var1=$var1.stvar2=$var2.st))
            // PLSQL3.g:162:7: var1 ':=' var2 ';'
            {
            pushFollow(FOLLOW_var1_in_assignment1249);
            var133=var1();

            state._fsp--;

            match(input,28,FOLLOW_28_in_assignment1251); 
            pushFollow(FOLLOW_var2_in_assignment1253);
            var234=var2();

            state._fsp--;

            match(input,18,FOLLOW_18_in_assignment1255); 


            // TEMPLATE REWRITE
            // 162:26: -> assignme(var1=$var1.stvar2=$var2.st)
            {
                retval.st = templateLib.getInstanceOf("assignme",
              new STAttrMap().put("var1", (var133!=null?var133.st:null)).put("var2", (var234!=null?var234.st:null)));
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "assignment"

    public static class assignment1_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "assignment1"
    // PLSQL3.g:165:1: assignment1 : var1 ':=' v10 ';' -> giveassign(t1=$var1.stt2=$v10.st);
    public final PLSQL3Parser.assignment1_return assignment1() throws RecognitionException {
        PLSQL3Parser.assignment1_return retval = new PLSQL3Parser.assignment1_return();
        retval.start = input.LT(1);

        PLSQL3Parser.var1_return var135 = null;

        PLSQL3Parser.v10_return v1036 = null;


        try {
            // PLSQL3.g:166:5: ( var1 ':=' v10 ';' -> giveassign(t1=$var1.stt2=$v10.st))
            // PLSQL3.g:166:7: var1 ':=' v10 ';'
            {
            pushFollow(FOLLOW_var1_in_assignment11281);
            var135=var1();

            state._fsp--;

            match(input,28,FOLLOW_28_in_assignment11283); 
            pushFollow(FOLLOW_v10_in_assignment11285);
            v1036=v10();

            state._fsp--;

            match(input,18,FOLLOW_18_in_assignment11287); 


            // TEMPLATE REWRITE
            // 166:25: -> giveassign(t1=$var1.stt2=$v10.st)
            {
                retval.st = templateLib.getInstanceOf("giveassign",
              new STAttrMap().put("t1", (var135!=null?var135.st:null)).put("t2", (v1036!=null?v1036.st:null)));
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "assignment1"

    public static class var1_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "var1"
    // PLSQL3.g:169:1: var1 : ID -> {new StringTemplate($ID.text)};
    public final PLSQL3Parser.var1_return var1() throws RecognitionException {
        PLSQL3Parser.var1_return retval = new PLSQL3Parser.var1_return();
        retval.start = input.LT(1);

        Token ID37=null;

        try {
            // PLSQL3.g:170:5: ( ID -> {new StringTemplate($ID.text)})
            // PLSQL3.g:170:7: ID
            {
            ID37=(Token)match(input,ID,FOLLOW_ID_in_var11315); 


            // TEMPLATE REWRITE
            // 170:10: -> {new StringTemplate($ID.text)}
            {
                retval.st = new StringTemplate((ID37!=null?ID37.getText():null));
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "var1"

    public static class var2_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "var2"
    // PLSQL3.g:173:1: var2 : N -> {new StringTemplate($N.text)};
    public final PLSQL3Parser.var2_return var2() throws RecognitionException {
        PLSQL3Parser.var2_return retval = new PLSQL3Parser.var2_return();
        retval.start = input.LT(1);

        Token N38=null;

        try {
            // PLSQL3.g:174:5: ( N -> {new StringTemplate($N.text)})
            // PLSQL3.g:174:7: N
            {
            N38=(Token)match(input,N,FOLLOW_N_in_var21332); 


            // TEMPLATE REWRITE
            // 174:9: -> {new StringTemplate($N.text)}
            {
                retval.st = new StringTemplate((N38!=null?N38.getText():null));
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "var2"

    public static class declaration_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "declaration"
    // PLSQL3.g:177:1: declaration : variable ;
    public final PLSQL3Parser.declaration_return declaration() throws RecognitionException {
        PLSQL3Parser.declaration_return retval = new PLSQL3Parser.declaration_return();
        retval.start = input.LT(1);

        PLSQL3Parser.variable_return variable39 = null;


        try {
            // PLSQL3.g:178:5: ( variable )
            // PLSQL3.g:178:7: variable
            {
            pushFollow(FOLLOW_variable_in_declaration1349);
            variable39=variable();

            state._fsp--;

            ((program_scope)program_stack.peek()).globals.add((variable39!=null?variable39.st:null));

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "declaration"

    public static class variable_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "variable"
    // PLSQL3.g:181:1: variable : declarator type ';' -> variable(type=$type.stname=$declarator.st);
    public final PLSQL3Parser.variable_return variable() throws RecognitionException {
        PLSQL3Parser.variable_return retval = new PLSQL3Parser.variable_return();
        retval.start = input.LT(1);

        PLSQL3Parser.type_return type40 = null;

        PLSQL3Parser.declarator_return declarator41 = null;


        try {
            // PLSQL3.g:182:5: ( declarator type ';' -> variable(type=$type.stname=$declarator.st))
            // PLSQL3.g:182:9: declarator type ';'
            {
            pushFollow(FOLLOW_declarator_in_variable1372);
            declarator41=declarator();

            state._fsp--;

            pushFollow(FOLLOW_type_in_variable1374);
            type40=type();

            state._fsp--;

            match(input,18,FOLLOW_18_in_variable1376); 


            // TEMPLATE REWRITE
            // 183:9: -> variable(type=$type.stname=$declarator.st)
            {
                retval.st = templateLib.getInstanceOf("variable",
              new STAttrMap().put("type", (type40!=null?type40.st:null)).put("name", (declarator41!=null?declarator41.st:null)));
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "variable"

    public static class declarator_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "declarator"
    // PLSQL3.g:186:1: declarator : ID -> {new StringTemplate($ID.text)};
    public final PLSQL3Parser.declarator_return declarator() throws RecognitionException {
        PLSQL3Parser.declarator_return retval = new PLSQL3Parser.declarator_return();
        retval.start = input.LT(1);

        Token ID42=null;

        try {
            // PLSQL3.g:187:5: ( ID -> {new StringTemplate($ID.text)})
            // PLSQL3.g:187:9: ID
            {
            ID42=(Token)match(input,ID,FOLLOW_ID_in_declarator1416); 


            // TEMPLATE REWRITE
            // 187:12: -> {new StringTemplate($ID.text)}
            {
                retval.st = new StringTemplate((ID42!=null?ID42.getText():null));
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "declarator"

    public static class type_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "type"
    // PLSQL3.g:190:1: type : ( 'number' -> type_int() | 'varchar' -> type_string() | 'float' -> type_float());
    public final PLSQL3Parser.type_return type() throws RecognitionException {
        PLSQL3Parser.type_return retval = new PLSQL3Parser.type_return();
        retval.start = input.LT(1);

        try {
            // PLSQL3.g:191:5: ( 'number' -> type_int() | 'varchar' -> type_string() | 'float' -> type_float())
            int alt13=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt13=1;
                }
                break;
            case 30:
                {
                alt13=2;
                }
                break;
            case 31:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // PLSQL3.g:191:9: 'number'
                    {
                    match(input,29,FOLLOW_29_in_type1439); 


                    // TEMPLATE REWRITE
                    // 191:19: -> type_int()
                    {
                        retval.st = templateLib.getInstanceOf("type_int");
                    }


                    }
                    break;
                case 2 :
                    // PLSQL3.g:192:9: 'varchar'
                    {
                    match(input,30,FOLLOW_30_in_type1456); 


                    // TEMPLATE REWRITE
                    // 192:19: -> type_string()
                    {
                        retval.st = templateLib.getInstanceOf("type_string");
                    }


                    }
                    break;
                case 3 :
                    // PLSQL3.g:193:9: 'float'
                    {
                    match(input,31,FOLLOW_31_in_type1472); 


                    // TEMPLATE REWRITE
                    // 193:17: -> type_float()
                    {
                        retval.st = templateLib.getInstanceOf("type_float");
                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "type"

    public static class printstatement_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "printstatement"
    // PLSQL3.g:196:1: printstatement : 'dbms_output.put_line(' state ');' -> printer(state=$state.st);
    public final PLSQL3Parser.printstatement_return printstatement() throws RecognitionException {
        PLSQL3Parser.printstatement_return retval = new PLSQL3Parser.printstatement_return();
        retval.start = input.LT(1);

        PLSQL3Parser.state_return state43 = null;


        try {
            // PLSQL3.g:197:5: ( 'dbms_output.put_line(' state ');' -> printer(state=$state.st))
            // PLSQL3.g:197:9: 'dbms_output.put_line(' state ');'
            {
            match(input,32,FOLLOW_32_in_printstatement1497); 
            pushFollow(FOLLOW_state_in_printstatement1499);
            state43=state();

            state._fsp--;

            match(input,33,FOLLOW_33_in_printstatement1501); 


            // TEMPLATE REWRITE
            // 197:44: -> printer(state=$state.st)
            {
                retval.st = templateLib.getInstanceOf("printer",
              new STAttrMap().put("state", (state43!=null?state43.st:null)));
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "printstatement"

    public static class state_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "state"
    // PLSQL3.g:200:1: state : ID -> {new StringTemplate($ID.text)};
    public final PLSQL3Parser.state_return state() throws RecognitionException {
        PLSQL3Parser.state_return retval = new PLSQL3Parser.state_return();
        retval.start = input.LT(1);

        Token ID44=null;

        try {
            // PLSQL3.g:201:5: ( ID -> {new StringTemplate($ID.text)})
            // PLSQL3.g:202:9: ID
            {
            ID44=(Token)match(input,ID,FOLLOW_ID_in_state1540); 


            // TEMPLATE REWRITE
            // 202:12: -> {new StringTemplate($ID.text)}
            {
                retval.st = new StringTemplate((ID44!=null?ID44.getText():null));
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "state"

    public static class sql_query_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "sql_query"
    // PLSQL3.g:205:1: sql_query : 'SELECT' v1 'INTO' v2 'FROM' v3 ';' -> sqler(v1=$v1.stv2=$v2.stv3=$v3.st);
    public final PLSQL3Parser.sql_query_return sql_query() throws RecognitionException {
        PLSQL3Parser.sql_query_return retval = new PLSQL3Parser.sql_query_return();
        retval.start = input.LT(1);

        PLSQL3Parser.v1_return v145 = null;

        PLSQL3Parser.v2_return v246 = null;

        PLSQL3Parser.v3_return v347 = null;


        try {
            // PLSQL3.g:206:5: ( 'SELECT' v1 'INTO' v2 'FROM' v3 ';' -> sqler(v1=$v1.stv2=$v2.stv3=$v3.st))
            // PLSQL3.g:206:9: 'SELECT' v1 'INTO' v2 'FROM' v3 ';'
            {
            match(input,34,FOLLOW_34_in_sql_query1567); 
            pushFollow(FOLLOW_v1_in_sql_query1577);
            v145=v1();

            state._fsp--;

            match(input,35,FOLLOW_35_in_sql_query1587); 
            pushFollow(FOLLOW_v2_in_sql_query1597);
            v246=v2();

            state._fsp--;

            match(input,36,FOLLOW_36_in_sql_query1607); 
            pushFollow(FOLLOW_v3_in_sql_query1617);
            v347=v3();

            state._fsp--;

            match(input,18,FOLLOW_18_in_sql_query1627); 


            // TEMPLATE REWRITE
            // 213:9: -> sqler(v1=$v1.stv2=$v2.stv3=$v3.st)
            {
                retval.st = templateLib.getInstanceOf("sqler",
              new STAttrMap().put("v1", (v145!=null?v145.st:null)).put("v2", (v246!=null?v246.st:null)).put("v3", (v347!=null?v347.st:null)));
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "sql_query"

    public static class v1_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "v1"
    // PLSQL3.g:216:1: v1 : ID -> {new StringTemplate($ID.text)};
    public final PLSQL3Parser.v1_return v1() throws RecognitionException {
        PLSQL3Parser.v1_return retval = new PLSQL3Parser.v1_return();
        retval.start = input.LT(1);

        Token ID48=null;

        try {
            // PLSQL3.g:216:4: ( ID -> {new StringTemplate($ID.text)})
            // PLSQL3.g:217:5: ID
            {
            ID48=(Token)match(input,ID,FOLLOW_ID_in_v11670); 


            // TEMPLATE REWRITE
            // 217:8: -> {new StringTemplate($ID.text)}
            {
                retval.st = new StringTemplate((ID48!=null?ID48.getText():null));
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "v1"

    public static class v2_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "v2"
    // PLSQL3.g:220:1: v2 : ID -> {new StringTemplate($ID.text)};
    public final PLSQL3Parser.v2_return v2() throws RecognitionException {
        PLSQL3Parser.v2_return retval = new PLSQL3Parser.v2_return();
        retval.start = input.LT(1);

        Token ID49=null;

        try {
            // PLSQL3.g:220:4: ( ID -> {new StringTemplate($ID.text)})
            // PLSQL3.g:221:6: ID
            {
            ID49=(Token)match(input,ID,FOLLOW_ID_in_v21688); 


            // TEMPLATE REWRITE
            // 221:9: -> {new StringTemplate($ID.text)}
            {
                retval.st = new StringTemplate((ID49!=null?ID49.getText():null));
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "v2"

    public static class v3_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "v3"
    // PLSQL3.g:224:1: v3 : ID -> {new StringTemplate($ID.text)};
    public final PLSQL3Parser.v3_return v3() throws RecognitionException {
        PLSQL3Parser.v3_return retval = new PLSQL3Parser.v3_return();
        retval.start = input.LT(1);

        Token ID50=null;

        try {
            // PLSQL3.g:224:4: ( ID -> {new StringTemplate($ID.text)})
            // PLSQL3.g:225:5: ID
            {
            ID50=(Token)match(input,ID,FOLLOW_ID_in_v31706); 


            // TEMPLATE REWRITE
            // 225:8: -> {new StringTemplate($ID.text)}
            {
                retval.st = new StringTemplate((ID50!=null?ID50.getText():null));
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "v3"

    public static class funccall_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "funccall"
    // PLSQL3.g:228:1: funccall : i= k '=' j= k '();' -> funccall(i=$i.stj=$j.st);
    public final PLSQL3Parser.funccall_return funccall() throws RecognitionException {
        PLSQL3Parser.funccall_return retval = new PLSQL3Parser.funccall_return();
        retval.start = input.LT(1);

        PLSQL3Parser.k_return i = null;

        PLSQL3Parser.k_return j = null;


        try {
            // PLSQL3.g:228:10: (i= k '=' j= k '();' -> funccall(i=$i.stj=$j.st))
            // PLSQL3.g:228:13: i= k '=' j= k '();'
            {
            pushFollow(FOLLOW_k_in_funccall1722);
            i=k();

            state._fsp--;

            match(input,37,FOLLOW_37_in_funccall1724); 
            pushFollow(FOLLOW_k_in_funccall1728);
            j=k();

            state._fsp--;

            match(input,38,FOLLOW_38_in_funccall1730); 


            // TEMPLATE REWRITE
            // 229:1: -> funccall(i=$i.stj=$j.st)
            {
                retval.st = templateLib.getInstanceOf("funccall",
              new STAttrMap().put("i", (i!=null?i.st:null)).put("j", (j!=null?j.st:null)));
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "funccall"

    public static class procall_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "procall"
    // PLSQL3.g:232:1: procall : j= k '();' -> procall(j=$j.st);
    public final PLSQL3Parser.procall_return procall() throws RecognitionException {
        PLSQL3Parser.procall_return retval = new PLSQL3Parser.procall_return();
        retval.start = input.LT(1);

        PLSQL3Parser.k_return j = null;


        try {
            // PLSQL3.g:232:9: (j= k '();' -> procall(j=$j.st))
            // PLSQL3.g:232:12: j= k '();'
            {
            pushFollow(FOLLOW_k_in_procall1756);
            j=k();

            state._fsp--;

            match(input,38,FOLLOW_38_in_procall1758); 


            // TEMPLATE REWRITE
            // 233:1: -> procall(j=$j.st)
            {
                retval.st = templateLib.getInstanceOf("procall",
              new STAttrMap().put("j", (j!=null?j.st:null)));
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "procall"

    public static class k_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "k"
    // PLSQL3.g:236:1: k : ID -> {new StringTemplate($ID.text)};
    public final PLSQL3Parser.k_return k() throws RecognitionException {
        PLSQL3Parser.k_return retval = new PLSQL3Parser.k_return();
        retval.start = input.LT(1);

        Token ID51=null;

        try {
            // PLSQL3.g:236:3: ( ID -> {new StringTemplate($ID.text)})
            // PLSQL3.g:237:5: ID
            {
            ID51=(Token)match(input,ID,FOLLOW_ID_in_k1781); 


            // TEMPLATE REWRITE
            // 237:8: -> {new StringTemplate($ID.text)}
            {
                retval.st = new StringTemplate((ID51!=null?ID51.getText():null));
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "k"

    public static class v4_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "v4"
    // PLSQL3.g:240:1: v4 : '(' a= aside ( ( '=' b= aside1 -> abequals(left=$a.stright=$b.st)) | ( '<' b= aside1 -> abless(left=$a.stright=$b.st)) | ( '>' b= aside1 -> abright(left=$a.stright=$b.st)) | ( '+' b= aside1 -> abplus(left=$a.stright=$b.st)) ) ')' ;
    public final PLSQL3Parser.v4_return v4() throws RecognitionException {
        PLSQL3Parser.v4_return retval = new PLSQL3Parser.v4_return();
        retval.start = input.LT(1);

        PLSQL3Parser.aside_return a = null;

        PLSQL3Parser.aside1_return b = null;


        try {
            // PLSQL3.g:240:4: ( '(' a= aside ( ( '=' b= aside1 -> abequals(left=$a.stright=$b.st)) | ( '<' b= aside1 -> abless(left=$a.stright=$b.st)) | ( '>' b= aside1 -> abright(left=$a.stright=$b.st)) | ( '+' b= aside1 -> abplus(left=$a.stright=$b.st)) ) ')' )
            // PLSQL3.g:241:5: '(' a= aside ( ( '=' b= aside1 -> abequals(left=$a.stright=$b.st)) | ( '<' b= aside1 -> abless(left=$a.stright=$b.st)) | ( '>' b= aside1 -> abright(left=$a.stright=$b.st)) | ( '+' b= aside1 -> abplus(left=$a.stright=$b.st)) ) ')'
            {
            match(input,39,FOLLOW_39_in_v41799); 
            pushFollow(FOLLOW_aside_in_v41807);
            a=aside();

            state._fsp--;

            // PLSQL3.g:243:5: ( ( '=' b= aside1 -> abequals(left=$a.stright=$b.st)) | ( '<' b= aside1 -> abless(left=$a.stright=$b.st)) | ( '>' b= aside1 -> abright(left=$a.stright=$b.st)) | ( '+' b= aside1 -> abplus(left=$a.stright=$b.st)) )
            int alt14=4;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt14=1;
                }
                break;
            case 40:
                {
                alt14=2;
                }
                break;
            case 41:
                {
                alt14=3;
                }
                break;
            case 42:
                {
                alt14=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // PLSQL3.g:244:9: ( '=' b= aside1 -> abequals(left=$a.stright=$b.st))
                    {
                    // PLSQL3.g:244:9: ( '=' b= aside1 -> abequals(left=$a.stright=$b.st))
                    // PLSQL3.g:244:11: '=' b= aside1
                    {
                    match(input,37,FOLLOW_37_in_v41825); 
                    pushFollow(FOLLOW_aside1_in_v41829);
                    b=aside1();

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 244:24: -> abequals(left=$a.stright=$b.st)
                    {
                        retval.st = templateLib.getInstanceOf("abequals",
                      new STAttrMap().put("left", (a!=null?a.st:null)).put("right", (b!=null?b.st:null)));
                    }


                    }


                    }
                    break;
                case 2 :
                    // PLSQL3.g:245:11: ( '<' b= aside1 -> abless(left=$a.stright=$b.st))
                    {
                    // PLSQL3.g:245:11: ( '<' b= aside1 -> abless(left=$a.stright=$b.st))
                    // PLSQL3.g:245:12: '<' b= aside1
                    {
                    match(input,40,FOLLOW_40_in_v41857); 
                    pushFollow(FOLLOW_aside1_in_v41861);
                    b=aside1();

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 245:25: -> abless(left=$a.stright=$b.st)
                    {
                        retval.st = templateLib.getInstanceOf("abless",
                      new STAttrMap().put("left", (a!=null?a.st:null)).put("right", (b!=null?b.st:null)));
                    }


                    }


                    }
                    break;
                case 3 :
                    // PLSQL3.g:246:11: ( '>' b= aside1 -> abright(left=$a.stright=$b.st))
                    {
                    // PLSQL3.g:246:11: ( '>' b= aside1 -> abright(left=$a.stright=$b.st))
                    // PLSQL3.g:246:12: '>' b= aside1
                    {
                    match(input,41,FOLLOW_41_in_v41889); 
                    pushFollow(FOLLOW_aside1_in_v41893);
                    b=aside1();

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 246:25: -> abright(left=$a.stright=$b.st)
                    {
                        retval.st = templateLib.getInstanceOf("abright",
                      new STAttrMap().put("left", (a!=null?a.st:null)).put("right", (b!=null?b.st:null)));
                    }


                    }


                    }
                    break;
                case 4 :
                    // PLSQL3.g:247:11: ( '+' b= aside1 -> abplus(left=$a.stright=$b.st))
                    {
                    // PLSQL3.g:247:11: ( '+' b= aside1 -> abplus(left=$a.stright=$b.st))
                    // PLSQL3.g:247:12: '+' b= aside1
                    {
                    match(input,42,FOLLOW_42_in_v41921); 
                    pushFollow(FOLLOW_aside1_in_v41925);
                    b=aside1();

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 247:25: -> abplus(left=$a.stright=$b.st)
                    {
                        retval.st = templateLib.getInstanceOf("abplus",
                      new STAttrMap().put("left", (a!=null?a.st:null)).put("right", (b!=null?b.st:null)));
                    }


                    }


                    }
                    break;

            }

            match(input,43,FOLLOW_43_in_v41952); 

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "v4"

    public static class v10_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "v10"
    // PLSQL3.g:252:1: v10 : a= aside ( ( '=' b= aside1 -> abequals(left=$a.stright=$b.st)) | ( '<' b= aside1 -> abless(left=$a.stright=$b.st)) | ( '>' b= aside1 -> abright(left=$a.stright=$b.st)) | ( '+' b= aside1 -> abplus(left=$a.stright=$b.st)) ) ;
    public final PLSQL3Parser.v10_return v10() throws RecognitionException {
        PLSQL3Parser.v10_return retval = new PLSQL3Parser.v10_return();
        retval.start = input.LT(1);

        PLSQL3Parser.aside_return a = null;

        PLSQL3Parser.aside1_return b = null;


        try {
            // PLSQL3.g:252:4: (a= aside ( ( '=' b= aside1 -> abequals(left=$a.stright=$b.st)) | ( '<' b= aside1 -> abless(left=$a.stright=$b.st)) | ( '>' b= aside1 -> abright(left=$a.stright=$b.st)) | ( '+' b= aside1 -> abplus(left=$a.stright=$b.st)) ) )
            // PLSQL3.g:253:5: a= aside ( ( '=' b= aside1 -> abequals(left=$a.stright=$b.st)) | ( '<' b= aside1 -> abless(left=$a.stright=$b.st)) | ( '>' b= aside1 -> abright(left=$a.stright=$b.st)) | ( '+' b= aside1 -> abplus(left=$a.stright=$b.st)) )
            {
            pushFollow(FOLLOW_aside_in_v101966);
            a=aside();

            state._fsp--;

            // PLSQL3.g:254:5: ( ( '=' b= aside1 -> abequals(left=$a.stright=$b.st)) | ( '<' b= aside1 -> abless(left=$a.stright=$b.st)) | ( '>' b= aside1 -> abright(left=$a.stright=$b.st)) | ( '+' b= aside1 -> abplus(left=$a.stright=$b.st)) )
            int alt15=4;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt15=1;
                }
                break;
            case 40:
                {
                alt15=2;
                }
                break;
            case 41:
                {
                alt15=3;
                }
                break;
            case 42:
                {
                alt15=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // PLSQL3.g:255:9: ( '=' b= aside1 -> abequals(left=$a.stright=$b.st))
                    {
                    // PLSQL3.g:255:9: ( '=' b= aside1 -> abequals(left=$a.stright=$b.st))
                    // PLSQL3.g:255:11: '=' b= aside1
                    {
                    match(input,37,FOLLOW_37_in_v101984); 
                    pushFollow(FOLLOW_aside1_in_v101988);
                    b=aside1();

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 255:24: -> abequals(left=$a.stright=$b.st)
                    {
                        retval.st = templateLib.getInstanceOf("abequals",
                      new STAttrMap().put("left", (a!=null?a.st:null)).put("right", (b!=null?b.st:null)));
                    }


                    }


                    }
                    break;
                case 2 :
                    // PLSQL3.g:256:11: ( '<' b= aside1 -> abless(left=$a.stright=$b.st))
                    {
                    // PLSQL3.g:256:11: ( '<' b= aside1 -> abless(left=$a.stright=$b.st))
                    // PLSQL3.g:256:12: '<' b= aside1
                    {
                    match(input,40,FOLLOW_40_in_v102016); 
                    pushFollow(FOLLOW_aside1_in_v102020);
                    b=aside1();

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 256:25: -> abless(left=$a.stright=$b.st)
                    {
                        retval.st = templateLib.getInstanceOf("abless",
                      new STAttrMap().put("left", (a!=null?a.st:null)).put("right", (b!=null?b.st:null)));
                    }


                    }


                    }
                    break;
                case 3 :
                    // PLSQL3.g:257:11: ( '>' b= aside1 -> abright(left=$a.stright=$b.st))
                    {
                    // PLSQL3.g:257:11: ( '>' b= aside1 -> abright(left=$a.stright=$b.st))
                    // PLSQL3.g:257:12: '>' b= aside1
                    {
                    match(input,41,FOLLOW_41_in_v102048); 
                    pushFollow(FOLLOW_aside1_in_v102052);
                    b=aside1();

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 257:25: -> abright(left=$a.stright=$b.st)
                    {
                        retval.st = templateLib.getInstanceOf("abright",
                      new STAttrMap().put("left", (a!=null?a.st:null)).put("right", (b!=null?b.st:null)));
                    }


                    }


                    }
                    break;
                case 4 :
                    // PLSQL3.g:258:11: ( '+' b= aside1 -> abplus(left=$a.stright=$b.st))
                    {
                    // PLSQL3.g:258:11: ( '+' b= aside1 -> abplus(left=$a.stright=$b.st))
                    // PLSQL3.g:258:12: '+' b= aside1
                    {
                    match(input,42,FOLLOW_42_in_v102080); 
                    pushFollow(FOLLOW_aside1_in_v102084);
                    b=aside1();

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 258:25: -> abplus(left=$a.stright=$b.st)
                    {
                        retval.st = templateLib.getInstanceOf("abplus",
                      new STAttrMap().put("left", (a!=null?a.st:null)).put("right", (b!=null?b.st:null)));
                    }


                    }


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "v10"

    public static class aside_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "aside"
    // PLSQL3.g:262:1: aside : ID -> refVar(id=$ID.text);
    public final PLSQL3Parser.aside_return aside() throws RecognitionException {
        PLSQL3Parser.aside_return retval = new PLSQL3Parser.aside_return();
        retval.start = input.LT(1);

        Token ID52=null;

        try {
            // PLSQL3.g:262:7: ( ID -> refVar(id=$ID.text))
            // PLSQL3.g:263:5: ID
            {
            ID52=(Token)match(input,ID,FOLLOW_ID_in_aside2118); 


            // TEMPLATE REWRITE
            // 263:8: -> refVar(id=$ID.text)
            {
                retval.st = templateLib.getInstanceOf("refVar",
              new STAttrMap().put("id", (ID52!=null?ID52.getText():null)));
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "aside"

    public static class aside1_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "aside1"
    // PLSQL3.g:267:1: aside1 : N -> iconst(value=$N.text);
    public final PLSQL3Parser.aside1_return aside1() throws RecognitionException {
        PLSQL3Parser.aside1_return retval = new PLSQL3Parser.aside1_return();
        retval.start = input.LT(1);

        Token N53=null;

        try {
            // PLSQL3.g:267:8: ( N -> iconst(value=$N.text))
            // PLSQL3.g:268:5: N
            {
            N53=(Token)match(input,N,FOLLOW_N_in_aside12145); 


            // TEMPLATE REWRITE
            // 268:7: -> iconst(value=$N.text)
            {
                retval.st = templateLib.getInstanceOf("iconst",
              new STAttrMap().put("value", (N53!=null?N53.getText():null)));
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "aside1"

    // Delegated rules


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA11 dfa11 = new DFA11(this);
    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA3_eotS =
        "\15\uffff";
    static final String DFA3_eofS =
        "\15\uffff";
    static final String DFA3_minS =
        "\1\4\1\34\13\uffff";
    static final String DFA3_maxS =
        "\1\42\1\46\13\uffff";
    static final String DFA3_acceptS =
        "\2\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\1\1\12\1\13";
    static final String DFA3_specialS =
        "\15\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\1\5\uffff\1\5\1\4\4\uffff\1\11\4\uffff\1\6\1\7\2\uffff\1"+
            "\10\6\uffff\1\2\1\uffff\1\3",
            "\1\12\10\uffff\1\13\1\14",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "30:1: block : ( assignment | printstatement | sql_query | conditionals | loops | wloop | floop | procedure | function | funccall | procall );";
        }
    }
    static final String DFA11_eotS =
        "\15\uffff";
    static final String DFA11_eofS =
        "\15\uffff";
    static final String DFA11_minS =
        "\1\4\1\34\10\uffff\1\4\2\uffff";
    static final String DFA11_maxS =
        "\1\42\1\34\10\uffff\1\5\2\uffff";
    static final String DFA11_acceptS =
        "\2\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\uffff\1\1\1\2";
    static final String DFA11_specialS =
        "\15\uffff}>";
    static final String[] DFA11_transitionS = {
            "\1\1\5\uffff\1\5\1\4\4\uffff\1\11\4\uffff\1\6\1\7\2\uffff\1"+
            "\10\6\uffff\1\2\1\uffff\1\3",
            "\1\12",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\14\1\13",
            "",
            ""
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "133:1: blockert : ( assignment | assignment1 | printstatement | sql_query | conditionals | loops | wloop | floop | procedure | function );";
        }
    }
    static final String DFA12_eotS =
        "\15\uffff";
    static final String DFA12_eofS =
        "\15\uffff";
    static final String DFA12_minS =
        "\1\4\1\34\10\uffff\1\4\2\uffff";
    static final String DFA12_maxS =
        "\1\42\1\34\10\uffff\1\5\2\uffff";
    static final String DFA12_acceptS =
        "\2\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\uffff\1\1\1\2";
    static final String DFA12_specialS =
        "\15\uffff}>";
    static final String[] DFA12_transitionS = {
            "\1\1\5\uffff\1\5\1\4\4\uffff\1\11\4\uffff\1\6\1\7\2\uffff\1"+
            "\10\6\uffff\1\2\1\uffff\1\3",
            "\1\12",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\14\1\13",
            "",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "146:1: blockert1 : ( assignment | assignment1 | printstatement | sql_query | conditionals | loops | wloop | floop | procedure | function );";
        }
    }
 

    public static final BitSet FOLLOW_7_in_program47 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_declaration_in_program57 = new BitSet(new long[]{0x0000000000000110L});
    public static final BitSet FOLLOW_8_in_program68 = new BitSet(new long[]{0x0000000502610C10L});
    public static final BitSet FOLLOW_block_in_program82 = new BitSet(new long[]{0x0000000502610E10L});
    public static final BitSet FOLLOW_9_in_program93 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_block127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_printstatement_in_block137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sql_query_in_block148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionals_in_block162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_loops_in_block173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_wloop_in_block183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_floop_in_block193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedure_in_block203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_in_block213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funccall_in_block223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procall_in_block233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_loops263 = new BitSet(new long[]{0x0000000502610C10L});
    public static final BitSet FOLLOW_blockert_in_loops277 = new BitSet(new long[]{0x0000000502610C10L});
    public static final BitSet FOLLOW_11_in_loops287 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_v10_in_loops291 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_loops293 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_loops307 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_loops317 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_loops327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_function373 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_v1_in_function377 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_function387 = new BitSet(new long[]{0x00000000E0000000L});
    public static final BitSet FOLLOW_type_in_function404 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_function406 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_function416 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_variable_in_function434 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_function444 = new BitSet(new long[]{0x0000000502610C10L});
    public static final BitSet FOLLOW_blockert_in_function458 = new BitSet(new long[]{0x0000000502630C10L});
    public static final BitSet FOLLOW_17_in_function473 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_variable_in_function477 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_function479 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_function489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_wloop558 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_v10_in_wloop562 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_wloop564 = new BitSet(new long[]{0x0000000502610C10L});
    public static final BitSet FOLLOW_blockert_in_wloop578 = new BitSet(new long[]{0x0000000502618C10L});
    public static final BitSet FOLLOW_15_in_wloop588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_floop634 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_v1_in_floop638 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_floop640 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_aside1_in_floop644 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_floop646 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_aside1_in_floop650 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_floop652 = new BitSet(new long[]{0x0000000502610C10L});
    public static final BitSet FOLLOW_blockert_in_floop663 = new BitSet(new long[]{0x0000000502618C10L});
    public static final BitSet FOLLOW_15_in_floop672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_procedure752 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_v1_in_procedure756 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_procedure762 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_procedure768 = new BitSet(new long[]{0x0000000502610C10L});
    public static final BitSet FOLLOW_blockert_in_procedure778 = new BitSet(new long[]{0x0000000502710C10L});
    public static final BitSet FOLLOW_20_in_procedure785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_conditionals855 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_v4_in_conditionals869 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_conditionals883 = new BitSet(new long[]{0x0000000502610C10L});
    public static final BitSet FOLLOW_blockert_in_conditionals901 = new BitSet(new long[]{0x000000050A610C10L});
    public static final BitSet FOLLOW_27_in_conditionals916 = new BitSet(new long[]{0x0000000502610C10L});
    public static final BitSet FOLLOW_blockert1_in_conditionals934 = new BitSet(new long[]{0x0000000502614C10L});
    public static final BitSet FOLLOW_14_in_conditionals949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_blockert999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment1_in_blockert1010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_printstatement_in_blockert1020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sql_query_in_blockert1032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionals_in_blockert1047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_loops_in_blockert1059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_wloop_in_blockert1070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_floop_in_blockert1081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedure_in_blockert1092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_in_blockert1103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_blockert11122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment1_in_blockert11133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_printstatement_in_blockert11143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sql_query_in_blockert11155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionals_in_blockert11170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_loops_in_blockert11182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_wloop_in_blockert11193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_floop_in_blockert11204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedure_in_blockert11215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_in_blockert11226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var1_in_assignment1249 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_assignment1251 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_var2_in_assignment1253 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_assignment1255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var1_in_assignment11281 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_assignment11283 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_v10_in_assignment11285 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_assignment11287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_var11315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_N_in_var21332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_declaration1349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declarator_in_variable1372 = new BitSet(new long[]{0x00000000E0000000L});
    public static final BitSet FOLLOW_type_in_variable1374 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_variable1376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_declarator1416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_type1439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_type1456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_type1472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_printstatement1497 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_state_in_printstatement1499 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_printstatement1501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_state1540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_sql_query1567 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_v1_in_sql_query1577 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_sql_query1587 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_v2_in_sql_query1597 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_sql_query1607 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_v3_in_sql_query1617 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_sql_query1627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_v11670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_v21688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_v31706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_k_in_funccall1722 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_funccall1724 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_k_in_funccall1728 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_funccall1730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_k_in_procall1756 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_procall1758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_k1781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_v41799 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_aside_in_v41807 = new BitSet(new long[]{0x0000072000000000L});
    public static final BitSet FOLLOW_37_in_v41825 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_aside1_in_v41829 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_40_in_v41857 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_aside1_in_v41861 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_41_in_v41889 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_aside1_in_v41893 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_42_in_v41921 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_aside1_in_v41925 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_v41952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_aside_in_v101966 = new BitSet(new long[]{0x0000072000000000L});
    public static final BitSet FOLLOW_37_in_v101984 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_aside1_in_v101988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_v102016 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_aside1_in_v102020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_v102048 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_aside1_in_v102052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_v102080 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_aside1_in_v102084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_aside2118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_N_in_aside12145 = new BitSet(new long[]{0x0000000000000002L});

}