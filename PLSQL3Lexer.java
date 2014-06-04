// $ANTLR 3.3 Nov 30, 2010 12:50:56 PLSQL3.g 2014-06-04 15:33:41

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class PLSQL3Lexer extends Lexer {
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

    public PLSQL3Lexer() {;} 
    public PLSQL3Lexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public PLSQL3Lexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "PLSQL3.g"; }

    // $ANTLR start "T__7"
    public final void mT__7() throws RecognitionException {
        try {
            int _type = T__7;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQL3.g:3:6: ( 'DECLARE' )
            // PLSQL3.g:3:8: 'DECLARE'
            {
            match("DECLARE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__7"

    // $ANTLR start "T__8"
    public final void mT__8() throws RecognitionException {
        try {
            int _type = T__8;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQL3.g:4:6: ( 'BEGIN' )
            // PLSQL3.g:4:8: 'BEGIN'
            {
            match("BEGIN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__8"

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQL3.g:5:6: ( 'END' )
            // PLSQL3.g:5:8: 'END'
            {
            match("END"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__9"

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQL3.g:6:7: ( 'LOOP' )
            // PLSQL3.g:6:9: 'LOOP'
            {
            match("LOOP"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQL3.g:7:7: ( 'IF' )
            // PLSQL3.g:7:9: 'IF'
            {
            match("IF"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQL3.g:8:7: ( 'THEN' )
            // PLSQL3.g:8:9: 'THEN'
            {
            match("THEN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQL3.g:9:7: ( 'exit;' )
            // PLSQL3.g:9:9: 'exit;'
            {
            match("exit;"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQL3.g:10:7: ( 'END IF;' )
            // PLSQL3.g:10:9: 'END IF;'
            {
            match("END IF;"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQL3.g:11:7: ( 'END LOOP;' )
            // PLSQL3.g:11:9: 'END LOOP;'
            {
            match("END LOOP;"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQL3.g:12:7: ( 'CREATE OR REPLACE FUNCTION' )
            // PLSQL3.g:12:9: 'CREATE OR REPLACE FUNCTION'
            {
            match("CREATE OR REPLACE FUNCTION"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQL3.g:13:7: ( 'RETURN' )
            // PLSQL3.g:13:9: 'RETURN'
            {
            match("RETURN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQL3.g:14:7: ( ';' )
            // PLSQL3.g:14:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQL3.g:15:7: ( 'IS' )
            // PLSQL3.g:15:9: 'IS'
            {
            match("IS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQL3.g:16:7: ( 'END;' )
            // PLSQL3.g:16:9: 'END;'
            {
            match("END;"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQL3.g:17:7: ( 'WHILE' )
            // PLSQL3.g:17:9: 'WHILE'
            {
            match("WHILE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQL3.g:18:7: ( 'FOR' )
            // PLSQL3.g:18:9: 'FOR'
            {
            match("FOR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQL3.g:19:7: ( 'in' )
            // PLSQL3.g:19:9: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQL3.g:20:7: ( '..' )
            // PLSQL3.g:20:9: '..'
            {
            match(".."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQL3.g:21:7: ( 'CREATE OR REPLACE PROCEDURE' )
            // PLSQL3.g:21:9: 'CREATE OR REPLACE PROCEDURE'
            {
            match("CREATE OR REPLACE PROCEDURE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQL3.g:22:7: ( 'AS' )
            // PLSQL3.g:22:9: 'AS'
            {
            match("AS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQL3.g:23:7: ( 'ELSE' )
            // PLSQL3.g:23:9: 'ELSE'
            {
            match("ELSE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQL3.g:24:7: ( ':=' )
            // PLSQL3.g:24:9: ':='
            {
            match(":="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQL3.g:25:7: ( 'number' )
            // PLSQL3.g:25:9: 'number'
            {
            match("number"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQL3.g:26:7: ( 'varchar' )
            // PLSQL3.g:26:9: 'varchar'
            {
            match("varchar"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQL3.g:27:7: ( 'float' )
            // PLSQL3.g:27:9: 'float'
            {
            match("float"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQL3.g:28:7: ( 'dbms_output.put_line(' )
            // PLSQL3.g:28:9: 'dbms_output.put_line('
            {
            match("dbms_output.put_line("); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQL3.g:29:7: ( ');' )
            // PLSQL3.g:29:9: ');'
            {
            match(");"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQL3.g:30:7: ( 'SELECT' )
            // PLSQL3.g:30:9: 'SELECT'
            {
            match("SELECT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQL3.g:31:7: ( 'INTO' )
            // PLSQL3.g:31:9: 'INTO'
            {
            match("INTO"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQL3.g:32:7: ( 'FROM' )
            // PLSQL3.g:32:9: 'FROM'
            {
            match("FROM"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQL3.g:33:7: ( '=' )
            // PLSQL3.g:33:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQL3.g:34:7: ( '();' )
            // PLSQL3.g:34:9: '();'
            {
            match("();"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQL3.g:35:7: ( '(' )
            // PLSQL3.g:35:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQL3.g:36:7: ( '<' )
            // PLSQL3.g:36:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQL3.g:37:7: ( '>' )
            // PLSQL3.g:37:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQL3.g:38:7: ( '+' )
            // PLSQL3.g:38:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQL3.g:39:7: ( ')' )
            // PLSQL3.g:39:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQL3.g:271:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // PLSQL3.g:271:9: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // PLSQL3.g:271:33: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // PLSQL3.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "N"
    public final void mN() throws RecognitionException {
        try {
            int _type = N;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQL3.g:275:5: ( '0' .. '9' ( '0' .. '9' )* )
            // PLSQL3.g:275:7: '0' .. '9' ( '0' .. '9' )*
            {
            matchRange('0','9'); 
            // PLSQL3.g:275:18: ( '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // PLSQL3.g:275:20: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "N"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQL3.g:279:5: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // PLSQL3.g:279:9: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // PLSQL3.g:279:9: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='\t' && LA3_0<='\n')||LA3_0=='\r'||LA3_0==' ') ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // PLSQL3.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // PLSQL3.g:1:8: ( T__7 | T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | ID | N | WS )
        int alt4=40;
        alt4 = dfa4.predict(input);
        switch (alt4) {
            case 1 :
                // PLSQL3.g:1:10: T__7
                {
                mT__7(); 

                }
                break;
            case 2 :
                // PLSQL3.g:1:15: T__8
                {
                mT__8(); 

                }
                break;
            case 3 :
                // PLSQL3.g:1:20: T__9
                {
                mT__9(); 

                }
                break;
            case 4 :
                // PLSQL3.g:1:25: T__10
                {
                mT__10(); 

                }
                break;
            case 5 :
                // PLSQL3.g:1:31: T__11
                {
                mT__11(); 

                }
                break;
            case 6 :
                // PLSQL3.g:1:37: T__12
                {
                mT__12(); 

                }
                break;
            case 7 :
                // PLSQL3.g:1:43: T__13
                {
                mT__13(); 

                }
                break;
            case 8 :
                // PLSQL3.g:1:49: T__14
                {
                mT__14(); 

                }
                break;
            case 9 :
                // PLSQL3.g:1:55: T__15
                {
                mT__15(); 

                }
                break;
            case 10 :
                // PLSQL3.g:1:61: T__16
                {
                mT__16(); 

                }
                break;
            case 11 :
                // PLSQL3.g:1:67: T__17
                {
                mT__17(); 

                }
                break;
            case 12 :
                // PLSQL3.g:1:73: T__18
                {
                mT__18(); 

                }
                break;
            case 13 :
                // PLSQL3.g:1:79: T__19
                {
                mT__19(); 

                }
                break;
            case 14 :
                // PLSQL3.g:1:85: T__20
                {
                mT__20(); 

                }
                break;
            case 15 :
                // PLSQL3.g:1:91: T__21
                {
                mT__21(); 

                }
                break;
            case 16 :
                // PLSQL3.g:1:97: T__22
                {
                mT__22(); 

                }
                break;
            case 17 :
                // PLSQL3.g:1:103: T__23
                {
                mT__23(); 

                }
                break;
            case 18 :
                // PLSQL3.g:1:109: T__24
                {
                mT__24(); 

                }
                break;
            case 19 :
                // PLSQL3.g:1:115: T__25
                {
                mT__25(); 

                }
                break;
            case 20 :
                // PLSQL3.g:1:121: T__26
                {
                mT__26(); 

                }
                break;
            case 21 :
                // PLSQL3.g:1:127: T__27
                {
                mT__27(); 

                }
                break;
            case 22 :
                // PLSQL3.g:1:133: T__28
                {
                mT__28(); 

                }
                break;
            case 23 :
                // PLSQL3.g:1:139: T__29
                {
                mT__29(); 

                }
                break;
            case 24 :
                // PLSQL3.g:1:145: T__30
                {
                mT__30(); 

                }
                break;
            case 25 :
                // PLSQL3.g:1:151: T__31
                {
                mT__31(); 

                }
                break;
            case 26 :
                // PLSQL3.g:1:157: T__32
                {
                mT__32(); 

                }
                break;
            case 27 :
                // PLSQL3.g:1:163: T__33
                {
                mT__33(); 

                }
                break;
            case 28 :
                // PLSQL3.g:1:169: T__34
                {
                mT__34(); 

                }
                break;
            case 29 :
                // PLSQL3.g:1:175: T__35
                {
                mT__35(); 

                }
                break;
            case 30 :
                // PLSQL3.g:1:181: T__36
                {
                mT__36(); 

                }
                break;
            case 31 :
                // PLSQL3.g:1:187: T__37
                {
                mT__37(); 

                }
                break;
            case 32 :
                // PLSQL3.g:1:193: T__38
                {
                mT__38(); 

                }
                break;
            case 33 :
                // PLSQL3.g:1:199: T__39
                {
                mT__39(); 

                }
                break;
            case 34 :
                // PLSQL3.g:1:205: T__40
                {
                mT__40(); 

                }
                break;
            case 35 :
                // PLSQL3.g:1:211: T__41
                {
                mT__41(); 

                }
                break;
            case 36 :
                // PLSQL3.g:1:217: T__42
                {
                mT__42(); 

                }
                break;
            case 37 :
                // PLSQL3.g:1:223: T__43
                {
                mT__43(); 

                }
                break;
            case 38 :
                // PLSQL3.g:1:229: ID
                {
                mID(); 

                }
                break;
            case 39 :
                // PLSQL3.g:1:232: N
                {
                mN(); 

                }
                break;
            case 40 :
                // PLSQL3.g:1:234: WS
                {
                mWS(); 

                }
                break;

        }

    }


    protected DFA4 dfa4 = new DFA4(this);
    static final String DFA4_eotS =
        "\1\uffff\11\34\1\uffff\3\34\1\uffff\1\34\1\uffff\4\34\1\65\1\34"+
        "\1\uffff\1\70\6\uffff\5\34\1\76\1\77\10\34\1\110\1\111\4\34\2\uffff"+
        "\1\34\2\uffff\2\34\1\123\2\34\2\uffff\6\34\1\134\1\34\2\uffff\7"+
        "\34\3\uffff\1\147\1\150\1\151\1\152\4\34\1\uffff\1\157\6\34\1\166"+
        "\7\uffff\2\34\1\171\1\uffff\2\34\1\174\3\34\1\uffff\1\34\1\u0081"+
        "\1\uffff\1\u0082\1\34\1\uffff\1\34\1\u0085\1\u0086\3\uffff\1\u0088"+
        "\1\34\4\uffff\1\34\1\uffff\1\34\1\uffff\1\34\1\uffff\1\34\12\uffff";
    static final String DFA4_eofS =
        "\u009a\uffff";
    static final String DFA4_minS =
        "\1\11\2\105\1\114\1\117\1\106\1\110\1\170\1\122\1\105\1\uffff\1"+
        "\110\1\117\1\156\1\uffff\1\123\1\uffff\1\165\1\141\1\154\1\142\1"+
        "\73\1\105\1\uffff\1\51\6\uffff\1\103\1\107\1\104\1\123\1\117\2\60"+
        "\1\124\1\105\1\151\1\105\1\124\1\111\1\122\1\117\2\60\1\155\1\162"+
        "\1\157\1\155\2\uffff\1\114\2\uffff\1\114\1\111\1\40\1\105\1\120"+
        "\2\uffff\1\117\1\116\1\164\1\101\1\125\1\114\1\60\1\115\2\uffff"+
        "\1\142\1\143\1\141\1\163\1\105\1\101\1\116\1\111\2\uffff\4\60\1"+
        "\73\1\124\1\122\1\105\1\uffff\1\60\1\145\1\150\1\164\1\137\1\103"+
        "\1\122\1\60\7\uffff\1\105\1\116\1\60\1\uffff\1\162\1\141\1\60\1"+
        "\157\1\124\1\105\1\uffff\1\40\1\60\1\uffff\1\60\1\162\1\uffff\1"+
        "\165\2\60\1\117\2\uffff\1\60\1\164\2\uffff\1\122\1\uffff\1\160\1"+
        "\40\1\165\1\122\1\164\1\105\1\56\1\120\1\uffff\1\114\1\101\1\103"+
        "\1\105\1\40\1\106\2\uffff";
    static final String DFA4_maxS =
        "\1\172\2\105\1\116\1\117\1\123\1\110\1\170\1\122\1\105\1\uffff\1"+
        "\110\1\122\1\156\1\uffff\1\123\1\uffff\1\165\1\141\1\154\1\142\1"+
        "\73\1\105\1\uffff\1\51\6\uffff\1\103\1\107\1\104\1\123\1\117\2\172"+
        "\1\124\1\105\1\151\1\105\1\124\1\111\1\122\1\117\2\172\1\155\1\162"+
        "\1\157\1\155\2\uffff\1\114\2\uffff\1\114\1\111\1\172\1\105\1\120"+
        "\2\uffff\1\117\1\116\1\164\1\101\1\125\1\114\1\172\1\115\2\uffff"+
        "\1\142\1\143\1\141\1\163\1\105\1\101\1\116\1\114\2\uffff\4\172\1"+
        "\73\1\124\1\122\1\105\1\uffff\1\172\1\145\1\150\1\164\1\137\1\103"+
        "\1\122\1\172\7\uffff\1\105\1\116\1\172\1\uffff\1\162\1\141\1\172"+
        "\1\157\1\124\1\105\1\uffff\1\40\1\172\1\uffff\1\172\1\162\1\uffff"+
        "\1\165\2\172\1\117\2\uffff\1\172\1\164\2\uffff\1\122\1\uffff\1\160"+
        "\1\40\1\165\1\122\1\164\1\105\1\56\1\120\1\uffff\1\114\1\101\1\103"+
        "\1\105\1\40\1\120\2\uffff";
    static final String DFA4_acceptS =
        "\12\uffff\1\14\3\uffff\1\22\1\uffff\1\26\6\uffff\1\37\1\uffff\1"+
        "\42\1\43\1\44\1\46\1\47\1\50\25\uffff\1\33\1\45\1\uffff\1\40\1\41"+
        "\5\uffff\1\5\1\15\10\uffff\1\21\1\24\10\uffff\1\16\1\3\10\uffff"+
        "\1\20\10\uffff\1\10\1\11\1\25\1\4\1\35\1\6\1\7\3\uffff\1\36\6\uffff"+
        "\1\2\2\uffff\1\17\2\uffff\1\31\4\uffff\1\13\1\27\2\uffff\1\34\1"+
        "\1\1\uffff\1\30\10\uffff\1\32\6\uffff\1\12\1\23";
    static final String DFA4_specialS =
        "\u009a\uffff}>";
    static final String[] DFA4_transitionS = {
            "\2\36\2\uffff\1\36\22\uffff\1\36\7\uffff\1\30\1\25\1\uffff\1"+
            "\33\2\uffff\1\16\1\uffff\12\35\1\20\1\12\1\31\1\27\1\32\2\uffff"+
            "\1\17\1\2\1\10\1\1\1\3\1\14\2\34\1\5\2\34\1\4\5\34\1\11\1\26"+
            "\1\6\2\34\1\13\3\34\4\uffff\1\34\1\uffff\3\34\1\24\1\7\1\23"+
            "\2\34\1\15\4\34\1\21\7\34\1\22\4\34",
            "\1\37",
            "\1\40",
            "\1\42\1\uffff\1\41",
            "\1\43",
            "\1\44\7\uffff\1\46\4\uffff\1\45",
            "\1\47",
            "\1\50",
            "\1\51",
            "\1\52",
            "",
            "\1\53",
            "\1\54\2\uffff\1\55",
            "\1\56",
            "",
            "\1\57",
            "",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\66",
            "",
            "\1\67",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "",
            "",
            "\1\116",
            "",
            "",
            "\1\117",
            "\1\120",
            "\1\121\17\uffff\12\34\1\uffff\1\122\5\uffff\32\34\4\uffff\1"+
            "\34\1\uffff\32\34",
            "\1\124",
            "\1\125",
            "",
            "",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\135",
            "",
            "",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145\2\uffff\1\146",
            "",
            "",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\167",
            "\1\170",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "\1\172",
            "\1\173",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\175",
            "\1\176",
            "\1\177",
            "",
            "\1\u0080",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u0083",
            "",
            "\1\u0084",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u0087",
            "",
            "",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u0089",
            "",
            "",
            "\1\u008a",
            "",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098\11\uffff\1\u0099",
            "",
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__7 | T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | ID | N | WS );";
        }
    }
 

}