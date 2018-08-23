package net.unicoen.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalUniMapperGeneratorLexer extends Lexer {
    public static final int RULE_ACTION=12;
    public static final int T__50=50;
    public static final int RULE_ARG_OR_CHARSET=15;
    public static final int RULE_NAME_CHAR=18;
    public static final int T__59=59;
    public static final int RULE_MYSTRING=11;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int RULE_NESTED_ACTION=23;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_TOKEN_VOCAB=10;
    public static final int RULE_ACTION_ESC=24;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ESC=21;
    public static final int RULE_COLON=7;
    public static final int RULE_LEXER_CHAR_SET=28;
    public static final int RULE_ACTION_STRING_LITERAL=25;
    public static final int RULE_INT=13;
    public static final int RULE_ML_COMMENT=30;
    public static final int RULE_TOKENS_SPEC=14;
    public static final int RULE_SEMICOLON=6;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int RULE_TOKEN_REF=4;
    public static final int RULE_DOLLAR=8;
    public static final int RULE_RARROW=16;
    public static final int RULE_ARG_ACTION=27;
    public static final int RULE_SL_COMMENT=29;
    public static final int RULE_OPTIONS_SPEC=9;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_RULE_REF=5;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__32=32;
    public static final int RULE_WS=31;
    public static final int RULE_LITERAL_CHAR=20;
    public static final int RULE_NAME_START_CHAR=19;
    public static final int RULE_ACTION_CHAR_LITERAL=26;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int RULE_XDIGIT=22;
    public static final int T__45=45;
    public static final int RULE_WSNLCHARS=17;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators

    public InternalUniMapperGeneratorLexer() {;} 
    public InternalUniMapperGeneratorLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalUniMapperGeneratorLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalUniMapperGenerator.g"; }

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUniMapperGenerator.g:11:7: ( 'parser' )
            // InternalUniMapperGenerator.g:11:9: 'parser'
            {
            match("parser"); 


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
            // InternalUniMapperGenerator.g:12:7: ( 'lexer' )
            // InternalUniMapperGenerator.g:12:9: 'lexer'
            {
            match("lexer"); 


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
            // InternalUniMapperGenerator.g:13:7: ( 'tree' )
            // InternalUniMapperGenerator.g:13:9: 'tree'
            {
            match("tree"); 


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
            // InternalUniMapperGenerator.g:14:7: ( '=' )
            // InternalUniMapperGenerator.g:14:9: '='
            {
            match('='); 

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
            // InternalUniMapperGenerator.g:15:7: ( '+=' )
            // InternalUniMapperGenerator.g:15:9: '+='
            {
            match("+="); 


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
            // InternalUniMapperGenerator.g:16:7: ( '<' )
            // InternalUniMapperGenerator.g:16:9: '<'
            {
            match('<'); 

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
            // InternalUniMapperGenerator.g:17:7: ( '>' )
            // InternalUniMapperGenerator.g:17:9: '>'
            {
            match('>'); 

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
            // InternalUniMapperGenerator.g:18:7: ( 'mode' )
            // InternalUniMapperGenerator.g:18:9: 'mode'
            {
            match("mode"); 


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
            // InternalUniMapperGenerator.g:19:7: ( 'default_hack_' )
            // InternalUniMapperGenerator.g:19:9: 'default_hack_'
            {
            match("default_hack_"); 


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
            // InternalUniMapperGenerator.g:20:7: ( 'grammar' )
            // InternalUniMapperGenerator.g:20:9: 'grammar'
            {
            match("grammar"); 


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
            // InternalUniMapperGenerator.g:21:7: ( 'root' )
            // InternalUniMapperGenerator.g:21:9: 'root'
            {
            match("root"); 


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
            // InternalUniMapperGenerator.g:22:7: ( '}' )
            // InternalUniMapperGenerator.g:22:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUniMapperGenerator.g:23:7: ( ',' )
            // InternalUniMapperGenerator.g:23:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUniMapperGenerator.g:24:7: ( '@' )
            // InternalUniMapperGenerator.g:24:9: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUniMapperGenerator.g:25:7: ( 'catch' )
            // InternalUniMapperGenerator.g:25:9: 'catch'
            {
            match("catch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUniMapperGenerator.g:26:7: ( 'finally' )
            // InternalUniMapperGenerator.g:26:9: 'finally'
            {
            match("finally"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUniMapperGenerator.g:27:7: ( 'returns' )
            // InternalUniMapperGenerator.g:27:9: 'returns'
            {
            match("returns"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUniMapperGenerator.g:28:7: ( 'throws' )
            // InternalUniMapperGenerator.g:28:9: 'throws'
            {
            match("throws"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUniMapperGenerator.g:29:7: ( 'locals' )
            // InternalUniMapperGenerator.g:29:9: 'locals'
            {
            match("locals"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUniMapperGenerator.g:30:7: ( '|' )
            // InternalUniMapperGenerator.g:30:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUniMapperGenerator.g:31:7: ( '#' )
            // InternalUniMapperGenerator.g:31:9: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUniMapperGenerator.g:32:7: ( '(' )
            // InternalUniMapperGenerator.g:32:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUniMapperGenerator.g:33:7: ( ')' )
            // InternalUniMapperGenerator.g:33:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUniMapperGenerator.g:34:7: ( '..' )
            // InternalUniMapperGenerator.g:34:9: '..'
            {
            match(".."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUniMapperGenerator.g:35:7: ( '~' )
            // InternalUniMapperGenerator.g:35:9: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUniMapperGenerator.g:36:7: ( '=>' )
            // InternalUniMapperGenerator.g:36:9: '=>'
            {
            match("=>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUniMapperGenerator.g:37:7: ( '.' )
            // InternalUniMapperGenerator.g:37:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUniMapperGenerator.g:38:7: ( 'import' )
            // InternalUniMapperGenerator.g:38:9: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUniMapperGenerator.g:39:7: ( '::' )
            // InternalUniMapperGenerator.g:39:9: '::'
            {
            match("::"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUniMapperGenerator.g:40:7: ( '?' )
            // InternalUniMapperGenerator.g:40:9: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUniMapperGenerator.g:41:7: ( '*' )
            // InternalUniMapperGenerator.g:41:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUniMapperGenerator.g:42:7: ( '+' )
            // InternalUniMapperGenerator.g:42:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUniMapperGenerator.g:43:7: ( 'EOF2' )
            // InternalUniMapperGenerator.g:43:9: 'EOF2'
            {
            match("EOF2"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUniMapperGenerator.g:44:7: ( 'fragment' )
            // InternalUniMapperGenerator.g:44:9: 'fragment'
            {
            match("fragment"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "RULE_TOKEN_VOCAB"
    public final void mRULE_TOKEN_VOCAB() throws RecognitionException {
        try {
            int _type = RULE_TOKEN_VOCAB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUniMapperGenerator.g:11081:18: ( 'tokenVocab' )
            // InternalUniMapperGenerator.g:11081:20: 'tokenVocab'
            {
            match("tokenVocab"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TOKEN_VOCAB"

    // $ANTLR start "RULE_COLON"
    public final void mRULE_COLON() throws RecognitionException {
        try {
            int _type = RULE_COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUniMapperGenerator.g:11083:12: ( ':' )
            // InternalUniMapperGenerator.g:11083:14: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COLON"

    // $ANTLR start "RULE_RARROW"
    public final void mRULE_RARROW() throws RecognitionException {
        try {
            int _type = RULE_RARROW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUniMapperGenerator.g:11085:13: ( '->' )
            // InternalUniMapperGenerator.g:11085:15: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RARROW"

    // $ANTLR start "RULE_OPTIONS_SPEC"
    public final void mRULE_OPTIONS_SPEC() throws RecognitionException {
        try {
            int _type = RULE_OPTIONS_SPEC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUniMapperGenerator.g:11087:19: ( 'options' ( RULE_WSNLCHARS )* '{' )
            // InternalUniMapperGenerator.g:11087:21: 'options' ( RULE_WSNLCHARS )* '{'
            {
            match("options"); 

            // InternalUniMapperGenerator.g:11087:31: ( RULE_WSNLCHARS )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\t' && LA1_0<='\n')||(LA1_0>='\f' && LA1_0<='\r')||LA1_0==' ') ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalUniMapperGenerator.g:11087:31: RULE_WSNLCHARS
            	    {
            	    mRULE_WSNLCHARS(); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OPTIONS_SPEC"

    // $ANTLR start "RULE_TOKENS_SPEC"
    public final void mRULE_TOKENS_SPEC() throws RecognitionException {
        try {
            int _type = RULE_TOKENS_SPEC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUniMapperGenerator.g:11089:18: ( 'tokens' ( RULE_WSNLCHARS )* '{' )
            // InternalUniMapperGenerator.g:11089:20: 'tokens' ( RULE_WSNLCHARS )* '{'
            {
            match("tokens"); 

            // InternalUniMapperGenerator.g:11089:29: ( RULE_WSNLCHARS )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='\t' && LA2_0<='\n')||(LA2_0>='\f' && LA2_0<='\r')||LA2_0==' ') ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalUniMapperGenerator.g:11089:29: RULE_WSNLCHARS
            	    {
            	    mRULE_WSNLCHARS(); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TOKENS_SPEC"

    // $ANTLR start "RULE_RULE_REF"
    public final void mRULE_RULE_REF() throws RecognitionException {
        try {
            int _type = RULE_RULE_REF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUniMapperGenerator.g:11091:15: ( 'a' .. 'z' ( RULE_NAME_CHAR )* )
            // InternalUniMapperGenerator.g:11091:17: 'a' .. 'z' ( RULE_NAME_CHAR )*
            {
            matchRange('a','z'); 
            // InternalUniMapperGenerator.g:11091:26: ( RULE_NAME_CHAR )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')||LA3_0=='\u00B7'||(LA3_0>='\u00C0' && LA3_0<='\u00D6')||(LA3_0>='\u00D8' && LA3_0<='\u00F6')||(LA3_0>='\u00F8' && LA3_0<='\u037D')||(LA3_0>='\u037F' && LA3_0<='\u1FFF')||(LA3_0>='\u200C' && LA3_0<='\u200D')||(LA3_0>='\u203F' && LA3_0<='\u2040')||(LA3_0>='\u2070' && LA3_0<='\u218F')||(LA3_0>='\u2C00' && LA3_0<='\u2FEF')||(LA3_0>='\u3001' && LA3_0<='\uD7FF')||(LA3_0>='\uF900' && LA3_0<='\uFDCF')||(LA3_0>='\uFDF0' && LA3_0<='\uFFFD')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalUniMapperGenerator.g:11091:26: RULE_NAME_CHAR
            	    {
            	    mRULE_NAME_CHAR(); 

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RULE_REF"

    // $ANTLR start "RULE_TOKEN_REF"
    public final void mRULE_TOKEN_REF() throws RecognitionException {
        try {
            int _type = RULE_TOKEN_REF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUniMapperGenerator.g:11093:16: ( 'A' .. 'Z' ( RULE_NAME_CHAR )* )
            // InternalUniMapperGenerator.g:11093:18: 'A' .. 'Z' ( RULE_NAME_CHAR )*
            {
            matchRange('A','Z'); 
            // InternalUniMapperGenerator.g:11093:27: ( RULE_NAME_CHAR )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')||LA4_0=='\u00B7'||(LA4_0>='\u00C0' && LA4_0<='\u00D6')||(LA4_0>='\u00D8' && LA4_0<='\u00F6')||(LA4_0>='\u00F8' && LA4_0<='\u037D')||(LA4_0>='\u037F' && LA4_0<='\u1FFF')||(LA4_0>='\u200C' && LA4_0<='\u200D')||(LA4_0>='\u203F' && LA4_0<='\u2040')||(LA4_0>='\u2070' && LA4_0<='\u218F')||(LA4_0>='\u2C00' && LA4_0<='\u2FEF')||(LA4_0>='\u3001' && LA4_0<='\uD7FF')||(LA4_0>='\uF900' && LA4_0<='\uFDCF')||(LA4_0>='\uFDF0' && LA4_0<='\uFFFD')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalUniMapperGenerator.g:11093:27: RULE_NAME_CHAR
            	    {
            	    mRULE_NAME_CHAR(); 

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TOKEN_REF"

    // $ANTLR start "RULE_NAME_CHAR"
    public final void mRULE_NAME_CHAR() throws RecognitionException {
        try {
            // InternalUniMapperGenerator.g:11095:25: ( ( RULE_NAME_START_CHAR | '0' .. '9' | '_' | '\\u00B7' | '\\u0300' .. '\\u036F' | '\\u203F' .. '\\u2040' ) )
            // InternalUniMapperGenerator.g:11095:27: ( RULE_NAME_START_CHAR | '0' .. '9' | '_' | '\\u00B7' | '\\u0300' .. '\\u036F' | '\\u203F' .. '\\u2040' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||input.LA(1)=='\u00B7'||(input.LA(1)>='\u00C0' && input.LA(1)<='\u00D6')||(input.LA(1)>='\u00D8' && input.LA(1)<='\u00F6')||(input.LA(1)>='\u00F8' && input.LA(1)<='\u037D')||(input.LA(1)>='\u037F' && input.LA(1)<='\u1FFF')||(input.LA(1)>='\u200C' && input.LA(1)<='\u200D')||(input.LA(1)>='\u203F' && input.LA(1)<='\u2040')||(input.LA(1)>='\u2070' && input.LA(1)<='\u218F')||(input.LA(1)>='\u2C00' && input.LA(1)<='\u2FEF')||(input.LA(1)>='\u3001' && input.LA(1)<='\uD7FF')||(input.LA(1)>='\uF900' && input.LA(1)<='\uFDCF')||(input.LA(1)>='\uFDF0' && input.LA(1)<='\uFFFD') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_NAME_CHAR"

    // $ANTLR start "RULE_NAME_START_CHAR"
    public final void mRULE_NAME_START_CHAR() throws RecognitionException {
        try {
            // InternalUniMapperGenerator.g:11097:31: ( ( 'A' .. 'Z' | 'a' .. 'z' | '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u02FF' | '\\u0370' .. '\\u037D' | '\\u037F' .. '\\u1FFF' | '\\u200C' .. '\\u200D' | '\\u2070' .. '\\u218F' | '\\u2C00' .. '\\u2FEF' | '\\u3001' .. '\\uD7FF' | '\\uF900' .. '\\uFDCF' | '\\uFDF0' .. '\\uFFFD' ) )
            // InternalUniMapperGenerator.g:11097:33: ( 'A' .. 'Z' | 'a' .. 'z' | '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u02FF' | '\\u0370' .. '\\u037D' | '\\u037F' .. '\\u1FFF' | '\\u200C' .. '\\u200D' | '\\u2070' .. '\\u218F' | '\\u2C00' .. '\\u2FEF' | '\\u3001' .. '\\uD7FF' | '\\uF900' .. '\\uFDCF' | '\\uFDF0' .. '\\uFFFD' )
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z')||(input.LA(1)>='\u00C0' && input.LA(1)<='\u00D6')||(input.LA(1)>='\u00D8' && input.LA(1)<='\u00F6')||(input.LA(1)>='\u00F8' && input.LA(1)<='\u02FF')||(input.LA(1)>='\u0370' && input.LA(1)<='\u037D')||(input.LA(1)>='\u037F' && input.LA(1)<='\u1FFF')||(input.LA(1)>='\u200C' && input.LA(1)<='\u200D')||(input.LA(1)>='\u2070' && input.LA(1)<='\u218F')||(input.LA(1)>='\u2C00' && input.LA(1)<='\u2FEF')||(input.LA(1)>='\u3001' && input.LA(1)<='\uD7FF')||(input.LA(1)>='\uF900' && input.LA(1)<='\uFDCF')||(input.LA(1)>='\uFDF0' && input.LA(1)<='\uFFFD') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_NAME_START_CHAR"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUniMapperGenerator.g:11099:10: ( ( '0' .. '9' )+ )
            // InternalUniMapperGenerator.g:11099:12: ( '0' .. '9' )+
            {
            // InternalUniMapperGenerator.g:11099:12: ( '0' .. '9' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalUniMapperGenerator.g:11099:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_MYSTRING"
    public final void mRULE_MYSTRING() throws RecognitionException {
        try {
            int _type = RULE_MYSTRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUniMapperGenerator.g:11101:15: ( '\\'' ( RULE_LITERAL_CHAR )* '\\'' )
            // InternalUniMapperGenerator.g:11101:17: '\\'' ( RULE_LITERAL_CHAR )* '\\''
            {
            match('\''); 
            // InternalUniMapperGenerator.g:11101:22: ( RULE_LITERAL_CHAR )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='\u0000' && LA6_0<='&')||(LA6_0>='(' && LA6_0<='\uFFFF')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalUniMapperGenerator.g:11101:22: RULE_LITERAL_CHAR
            	    {
            	    mRULE_LITERAL_CHAR(); 

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MYSTRING"

    // $ANTLR start "RULE_LITERAL_CHAR"
    public final void mRULE_LITERAL_CHAR() throws RecognitionException {
        try {
            // InternalUniMapperGenerator.g:11103:28: ( ( RULE_ESC | ~ ( ( '\\'' | '\\\\' ) ) ) )
            // InternalUniMapperGenerator.g:11103:30: ( RULE_ESC | ~ ( ( '\\'' | '\\\\' ) ) )
            {
            // InternalUniMapperGenerator.g:11103:30: ( RULE_ESC | ~ ( ( '\\'' | '\\\\' ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\\') ) {
                alt7=1;
            }
            else if ( ((LA7_0>='\u0000' && LA7_0<='&')||(LA7_0>='(' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalUniMapperGenerator.g:11103:31: RULE_ESC
                    {
                    mRULE_ESC(); 

                    }
                    break;
                case 2 :
                    // InternalUniMapperGenerator.g:11103:40: ~ ( ( '\\'' | '\\\\' ) )
                    {
                    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_LITERAL_CHAR"

    // $ANTLR start "RULE_ESC"
    public final void mRULE_ESC() throws RecognitionException {
        try {
            // InternalUniMapperGenerator.g:11105:19: ( '\\\\' ( 'n' | 'r' | 't' | 'b' | 'f' | '\"' | '\\'' | '\\\\' | '>' | 'u' RULE_XDIGIT RULE_XDIGIT RULE_XDIGIT RULE_XDIGIT | . ) )
            // InternalUniMapperGenerator.g:11105:21: '\\\\' ( 'n' | 'r' | 't' | 'b' | 'f' | '\"' | '\\'' | '\\\\' | '>' | 'u' RULE_XDIGIT RULE_XDIGIT RULE_XDIGIT RULE_XDIGIT | . )
            {
            match('\\'); 
            // InternalUniMapperGenerator.g:11105:26: ( 'n' | 'r' | 't' | 'b' | 'f' | '\"' | '\\'' | '\\\\' | '>' | 'u' RULE_XDIGIT RULE_XDIGIT RULE_XDIGIT RULE_XDIGIT | . )
            int alt8=11;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // InternalUniMapperGenerator.g:11105:27: 'n'
                    {
                    match('n'); 

                    }
                    break;
                case 2 :
                    // InternalUniMapperGenerator.g:11105:31: 'r'
                    {
                    match('r'); 

                    }
                    break;
                case 3 :
                    // InternalUniMapperGenerator.g:11105:35: 't'
                    {
                    match('t'); 

                    }
                    break;
                case 4 :
                    // InternalUniMapperGenerator.g:11105:39: 'b'
                    {
                    match('b'); 

                    }
                    break;
                case 5 :
                    // InternalUniMapperGenerator.g:11105:43: 'f'
                    {
                    match('f'); 

                    }
                    break;
                case 6 :
                    // InternalUniMapperGenerator.g:11105:47: '\"'
                    {
                    match('\"'); 

                    }
                    break;
                case 7 :
                    // InternalUniMapperGenerator.g:11105:51: '\\''
                    {
                    match('\''); 

                    }
                    break;
                case 8 :
                    // InternalUniMapperGenerator.g:11105:56: '\\\\'
                    {
                    match('\\'); 

                    }
                    break;
                case 9 :
                    // InternalUniMapperGenerator.g:11105:61: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 10 :
                    // InternalUniMapperGenerator.g:11105:65: 'u' RULE_XDIGIT RULE_XDIGIT RULE_XDIGIT RULE_XDIGIT
                    {
                    match('u'); 
                    mRULE_XDIGIT(); 
                    mRULE_XDIGIT(); 
                    mRULE_XDIGIT(); 
                    mRULE_XDIGIT(); 

                    }
                    break;
                case 11 :
                    // InternalUniMapperGenerator.g:11105:117: .
                    {
                    matchAny(); 

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_ESC"

    // $ANTLR start "RULE_XDIGIT"
    public final void mRULE_XDIGIT() throws RecognitionException {
        try {
            // InternalUniMapperGenerator.g:11107:22: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // InternalUniMapperGenerator.g:11107:24: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_XDIGIT"

    // $ANTLR start "RULE_ACTION"
    public final void mRULE_ACTION() throws RecognitionException {
        try {
            int _type = RULE_ACTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUniMapperGenerator.g:11109:13: ( RULE_NESTED_ACTION )
            // InternalUniMapperGenerator.g:11109:15: RULE_NESTED_ACTION
            {
            mRULE_NESTED_ACTION(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ACTION"

    // $ANTLR start "RULE_NESTED_ACTION"
    public final void mRULE_NESTED_ACTION() throws RecognitionException {
        try {
            // InternalUniMapperGenerator.g:11111:29: ( '___nested_action_' )
            // InternalUniMapperGenerator.g:11111:31: '___nested_action_'
            {
            match("___nested_action_"); 


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_NESTED_ACTION"

    // $ANTLR start "RULE_ACTION_STRING_LITERAL"
    public final void mRULE_ACTION_STRING_LITERAL() throws RecognitionException {
        try {
            // InternalUniMapperGenerator.g:11113:37: ( '\"' ( RULE_ACTION_ESC | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // InternalUniMapperGenerator.g:11113:39: '\"' ( RULE_ACTION_ESC | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // InternalUniMapperGenerator.g:11113:43: ( RULE_ACTION_ESC | ~ ( ( '\\\\' | '\"' ) ) )*
            loop9:
            do {
                int alt9=3;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='\\') ) {
                    alt9=1;
                }
                else if ( ((LA9_0>='\u0000' && LA9_0<='!')||(LA9_0>='#' && LA9_0<='[')||(LA9_0>=']' && LA9_0<='\uFFFF')) ) {
                    alt9=2;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalUniMapperGenerator.g:11113:44: RULE_ACTION_ESC
            	    {
            	    mRULE_ACTION_ESC(); 

            	    }
            	    break;
            	case 2 :
            	    // InternalUniMapperGenerator.g:11113:60: ~ ( ( '\\\\' | '\"' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            match('\"'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_ACTION_STRING_LITERAL"

    // $ANTLR start "RULE_ACTION_CHAR_LITERAL"
    public final void mRULE_ACTION_CHAR_LITERAL() throws RecognitionException {
        try {
            // InternalUniMapperGenerator.g:11115:35: ( '\\'' ( RULE_ACTION_ESC | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            // InternalUniMapperGenerator.g:11115:37: '\\'' ( RULE_ACTION_ESC | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
            {
            match('\''); 
            // InternalUniMapperGenerator.g:11115:42: ( RULE_ACTION_ESC | ~ ( ( '\\\\' | '\\'' ) ) )*
            loop10:
            do {
                int alt10=3;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='\\') ) {
                    alt10=1;
                }
                else if ( ((LA10_0>='\u0000' && LA10_0<='&')||(LA10_0>='(' && LA10_0<='[')||(LA10_0>=']' && LA10_0<='\uFFFF')) ) {
                    alt10=2;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalUniMapperGenerator.g:11115:43: RULE_ACTION_ESC
            	    {
            	    mRULE_ACTION_ESC(); 

            	    }
            	    break;
            	case 2 :
            	    // InternalUniMapperGenerator.g:11115:59: ~ ( ( '\\\\' | '\\'' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            match('\''); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_ACTION_CHAR_LITERAL"

    // $ANTLR start "RULE_ACTION_ESC"
    public final void mRULE_ACTION_ESC() throws RecognitionException {
        try {
            // InternalUniMapperGenerator.g:11117:26: ( '\\\\' . )
            // InternalUniMapperGenerator.g:11117:28: '\\\\' .
            {
            match('\\'); 
            matchAny(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_ACTION_ESC"

    // $ANTLR start "RULE_DOLLAR"
    public final void mRULE_DOLLAR() throws RecognitionException {
        try {
            int _type = RULE_DOLLAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUniMapperGenerator.g:11119:13: ( '$' )
            // InternalUniMapperGenerator.g:11119:15: '$'
            {
            match('$'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOLLAR"

    // $ANTLR start "RULE_SEMICOLON"
    public final void mRULE_SEMICOLON() throws RecognitionException {
        try {
            int _type = RULE_SEMICOLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUniMapperGenerator.g:11121:16: ( ';' )
            // InternalUniMapperGenerator.g:11121:18: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SEMICOLON"

    // $ANTLR start "RULE_ARG_OR_CHARSET"
    public final void mRULE_ARG_OR_CHARSET() throws RecognitionException {
        try {
            int _type = RULE_ARG_OR_CHARSET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUniMapperGenerator.g:11123:21: ( ( RULE_ARG_ACTION | RULE_LEXER_CHAR_SET ) )
            // InternalUniMapperGenerator.g:11123:23: ( RULE_ARG_ACTION | RULE_LEXER_CHAR_SET )
            {
            // InternalUniMapperGenerator.g:11123:23: ( RULE_ARG_ACTION | RULE_LEXER_CHAR_SET )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='[') ) {
                alt11=1;
            }
            else if ( (LA11_0=='_') ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalUniMapperGenerator.g:11123:24: RULE_ARG_ACTION
                    {
                    mRULE_ARG_ACTION(); 

                    }
                    break;
                case 2 :
                    // InternalUniMapperGenerator.g:11123:40: RULE_LEXER_CHAR_SET
                    {
                    mRULE_LEXER_CHAR_SET(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ARG_OR_CHARSET"

    // $ANTLR start "RULE_LEXER_CHAR_SET"
    public final void mRULE_LEXER_CHAR_SET() throws RecognitionException {
        try {
            // InternalUniMapperGenerator.g:11125:30: ( '___lexer_char_set_' )
            // InternalUniMapperGenerator.g:11125:32: '___lexer_char_set_'
            {
            match("___lexer_char_set_"); 


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_LEXER_CHAR_SET"

    // $ANTLR start "RULE_ARG_ACTION"
    public final void mRULE_ARG_ACTION() throws RecognitionException {
        try {
            // InternalUniMapperGenerator.g:11127:26: ( '[' (~ ( ( '[' | ']' ) ) )* ']' )
            // InternalUniMapperGenerator.g:11127:28: '[' (~ ( ( '[' | ']' ) ) )* ']'
            {
            match('['); 
            // InternalUniMapperGenerator.g:11127:32: (~ ( ( '[' | ']' ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\u0000' && LA12_0<='Z')||LA12_0=='\\'||(LA12_0>='^' && LA12_0<='\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalUniMapperGenerator.g:11127:32: ~ ( ( '[' | ']' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='Z')||input.LA(1)=='\\'||(input.LA(1)>='^' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            match(']'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_ARG_ACTION"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUniMapperGenerator.g:11129:17: ( '//' (~ ( ( '\\r' | '\\n' ) ) )* ( '\\r' )? '\\n' )
            // InternalUniMapperGenerator.g:11129:19: '//' (~ ( ( '\\r' | '\\n' ) ) )* ( '\\r' )? '\\n'
            {
            match("//"); 

            // InternalUniMapperGenerator.g:11129:24: (~ ( ( '\\r' | '\\n' ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\u0000' && LA13_0<='\t')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\uFFFF')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalUniMapperGenerator.g:11129:24: ~ ( ( '\\r' | '\\n' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            // InternalUniMapperGenerator.g:11129:40: ( '\\r' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='\r') ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalUniMapperGenerator.g:11129:40: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUniMapperGenerator.g:11131:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalUniMapperGenerator.g:11131:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalUniMapperGenerator.g:11131:24: ( options {greedy=false; } : . )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0=='*') ) {
                    int LA15_1 = input.LA(2);

                    if ( (LA15_1=='/') ) {
                        alt15=2;
                    }
                    else if ( ((LA15_1>='\u0000' && LA15_1<='.')||(LA15_1>='0' && LA15_1<='\uFFFF')) ) {
                        alt15=1;
                    }


                }
                else if ( ((LA15_0>='\u0000' && LA15_0<=')')||(LA15_0>='+' && LA15_0<='\uFFFF')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalUniMapperGenerator.g:11131:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUniMapperGenerator.g:11133:9: ( ( ' ' | '\\t' | '\\f' | ( '\\r' )? '\\n' )+ )
            // InternalUniMapperGenerator.g:11133:11: ( ' ' | '\\t' | '\\f' | ( '\\r' )? '\\n' )+
            {
            // InternalUniMapperGenerator.g:11133:11: ( ' ' | '\\t' | '\\f' | ( '\\r' )? '\\n' )+
            int cnt17=0;
            loop17:
            do {
                int alt17=5;
                switch ( input.LA(1) ) {
                case ' ':
                    {
                    alt17=1;
                    }
                    break;
                case '\t':
                    {
                    alt17=2;
                    }
                    break;
                case '\f':
                    {
                    alt17=3;
                    }
                    break;
                case '\n':
                case '\r':
                    {
                    alt17=4;
                    }
                    break;

                }

                switch (alt17) {
            	case 1 :
            	    // InternalUniMapperGenerator.g:11133:12: ' '
            	    {
            	    match(' '); 

            	    }
            	    break;
            	case 2 :
            	    // InternalUniMapperGenerator.g:11133:16: '\\t'
            	    {
            	    match('\t'); 

            	    }
            	    break;
            	case 3 :
            	    // InternalUniMapperGenerator.g:11133:21: '\\f'
            	    {
            	    match('\f'); 

            	    }
            	    break;
            	case 4 :
            	    // InternalUniMapperGenerator.g:11133:26: ( '\\r' )? '\\n'
            	    {
            	    // InternalUniMapperGenerator.g:11133:26: ( '\\r' )?
            	    int alt16=2;
            	    int LA16_0 = input.LA(1);

            	    if ( (LA16_0=='\r') ) {
            	        alt16=1;
            	    }
            	    switch (alt16) {
            	        case 1 :
            	            // InternalUniMapperGenerator.g:11133:26: '\\r'
            	            {
            	            match('\r'); 

            	            }
            	            break;

            	    }

            	    match('\n'); 

            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_WSNLCHARS"
    public final void mRULE_WSNLCHARS() throws RecognitionException {
        try {
            // InternalUniMapperGenerator.g:11135:25: ( ( ' ' | '\\t' | '\\f' | '\\n' | '\\r' ) )
            // InternalUniMapperGenerator.g:11135:27: ( ' ' | '\\t' | '\\f' | '\\n' | '\\r' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||(input.LA(1)>='\f' && input.LA(1)<='\r')||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_WSNLCHARS"

    public void mTokens() throws RecognitionException {
        // InternalUniMapperGenerator.g:1:8: ( T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | RULE_TOKEN_VOCAB | RULE_COLON | RULE_RARROW | RULE_OPTIONS_SPEC | RULE_TOKENS_SPEC | RULE_RULE_REF | RULE_TOKEN_REF | RULE_INT | RULE_MYSTRING | RULE_ACTION | RULE_DOLLAR | RULE_SEMICOLON | RULE_ARG_OR_CHARSET | RULE_SL_COMMENT | RULE_ML_COMMENT | RULE_WS )
        int alt18=50;
        alt18 = dfa18.predict(input);
        switch (alt18) {
            case 1 :
                // InternalUniMapperGenerator.g:1:10: T__32
                {
                mT__32(); 

                }
                break;
            case 2 :
                // InternalUniMapperGenerator.g:1:16: T__33
                {
                mT__33(); 

                }
                break;
            case 3 :
                // InternalUniMapperGenerator.g:1:22: T__34
                {
                mT__34(); 

                }
                break;
            case 4 :
                // InternalUniMapperGenerator.g:1:28: T__35
                {
                mT__35(); 

                }
                break;
            case 5 :
                // InternalUniMapperGenerator.g:1:34: T__36
                {
                mT__36(); 

                }
                break;
            case 6 :
                // InternalUniMapperGenerator.g:1:40: T__37
                {
                mT__37(); 

                }
                break;
            case 7 :
                // InternalUniMapperGenerator.g:1:46: T__38
                {
                mT__38(); 

                }
                break;
            case 8 :
                // InternalUniMapperGenerator.g:1:52: T__39
                {
                mT__39(); 

                }
                break;
            case 9 :
                // InternalUniMapperGenerator.g:1:58: T__40
                {
                mT__40(); 

                }
                break;
            case 10 :
                // InternalUniMapperGenerator.g:1:64: T__41
                {
                mT__41(); 

                }
                break;
            case 11 :
                // InternalUniMapperGenerator.g:1:70: T__42
                {
                mT__42(); 

                }
                break;
            case 12 :
                // InternalUniMapperGenerator.g:1:76: T__43
                {
                mT__43(); 

                }
                break;
            case 13 :
                // InternalUniMapperGenerator.g:1:82: T__44
                {
                mT__44(); 

                }
                break;
            case 14 :
                // InternalUniMapperGenerator.g:1:88: T__45
                {
                mT__45(); 

                }
                break;
            case 15 :
                // InternalUniMapperGenerator.g:1:94: T__46
                {
                mT__46(); 

                }
                break;
            case 16 :
                // InternalUniMapperGenerator.g:1:100: T__47
                {
                mT__47(); 

                }
                break;
            case 17 :
                // InternalUniMapperGenerator.g:1:106: T__48
                {
                mT__48(); 

                }
                break;
            case 18 :
                // InternalUniMapperGenerator.g:1:112: T__49
                {
                mT__49(); 

                }
                break;
            case 19 :
                // InternalUniMapperGenerator.g:1:118: T__50
                {
                mT__50(); 

                }
                break;
            case 20 :
                // InternalUniMapperGenerator.g:1:124: T__51
                {
                mT__51(); 

                }
                break;
            case 21 :
                // InternalUniMapperGenerator.g:1:130: T__52
                {
                mT__52(); 

                }
                break;
            case 22 :
                // InternalUniMapperGenerator.g:1:136: T__53
                {
                mT__53(); 

                }
                break;
            case 23 :
                // InternalUniMapperGenerator.g:1:142: T__54
                {
                mT__54(); 

                }
                break;
            case 24 :
                // InternalUniMapperGenerator.g:1:148: T__55
                {
                mT__55(); 

                }
                break;
            case 25 :
                // InternalUniMapperGenerator.g:1:154: T__56
                {
                mT__56(); 

                }
                break;
            case 26 :
                // InternalUniMapperGenerator.g:1:160: T__57
                {
                mT__57(); 

                }
                break;
            case 27 :
                // InternalUniMapperGenerator.g:1:166: T__58
                {
                mT__58(); 

                }
                break;
            case 28 :
                // InternalUniMapperGenerator.g:1:172: T__59
                {
                mT__59(); 

                }
                break;
            case 29 :
                // InternalUniMapperGenerator.g:1:178: T__60
                {
                mT__60(); 

                }
                break;
            case 30 :
                // InternalUniMapperGenerator.g:1:184: T__61
                {
                mT__61(); 

                }
                break;
            case 31 :
                // InternalUniMapperGenerator.g:1:190: T__62
                {
                mT__62(); 

                }
                break;
            case 32 :
                // InternalUniMapperGenerator.g:1:196: T__63
                {
                mT__63(); 

                }
                break;
            case 33 :
                // InternalUniMapperGenerator.g:1:202: T__64
                {
                mT__64(); 

                }
                break;
            case 34 :
                // InternalUniMapperGenerator.g:1:208: T__65
                {
                mT__65(); 

                }
                break;
            case 35 :
                // InternalUniMapperGenerator.g:1:214: RULE_TOKEN_VOCAB
                {
                mRULE_TOKEN_VOCAB(); 

                }
                break;
            case 36 :
                // InternalUniMapperGenerator.g:1:231: RULE_COLON
                {
                mRULE_COLON(); 

                }
                break;
            case 37 :
                // InternalUniMapperGenerator.g:1:242: RULE_RARROW
                {
                mRULE_RARROW(); 

                }
                break;
            case 38 :
                // InternalUniMapperGenerator.g:1:254: RULE_OPTIONS_SPEC
                {
                mRULE_OPTIONS_SPEC(); 

                }
                break;
            case 39 :
                // InternalUniMapperGenerator.g:1:272: RULE_TOKENS_SPEC
                {
                mRULE_TOKENS_SPEC(); 

                }
                break;
            case 40 :
                // InternalUniMapperGenerator.g:1:289: RULE_RULE_REF
                {
                mRULE_RULE_REF(); 

                }
                break;
            case 41 :
                // InternalUniMapperGenerator.g:1:303: RULE_TOKEN_REF
                {
                mRULE_TOKEN_REF(); 

                }
                break;
            case 42 :
                // InternalUniMapperGenerator.g:1:318: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 43 :
                // InternalUniMapperGenerator.g:1:327: RULE_MYSTRING
                {
                mRULE_MYSTRING(); 

                }
                break;
            case 44 :
                // InternalUniMapperGenerator.g:1:341: RULE_ACTION
                {
                mRULE_ACTION(); 

                }
                break;
            case 45 :
                // InternalUniMapperGenerator.g:1:353: RULE_DOLLAR
                {
                mRULE_DOLLAR(); 

                }
                break;
            case 46 :
                // InternalUniMapperGenerator.g:1:365: RULE_SEMICOLON
                {
                mRULE_SEMICOLON(); 

                }
                break;
            case 47 :
                // InternalUniMapperGenerator.g:1:380: RULE_ARG_OR_CHARSET
                {
                mRULE_ARG_OR_CHARSET(); 

                }
                break;
            case 48 :
                // InternalUniMapperGenerator.g:1:400: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 49 :
                // InternalUniMapperGenerator.g:1:416: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 50 :
                // InternalUniMapperGenerator.g:1:432: RULE_WS
                {
                mRULE_WS(); 

                }
                break;

        }

    }


    protected DFA8 dfa8 = new DFA8(this);
    protected DFA18 dfa18 = new DFA18(this);
    static final String DFA8_eotS =
        "\12\uffff\1\13\2\uffff";
    static final String DFA8_eofS =
        "\15\uffff";
    static final String DFA8_minS =
        "\1\0\11\uffff\1\60\2\uffff";
    static final String DFA8_maxS =
        "\1\uffff\11\uffff\1\146\2\uffff";
    static final String DFA8_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\uffff\1\13\1\12";
    static final String DFA8_specialS =
        "\1\0\14\uffff}>";
    static final String[] DFA8_transitionS = {
            "\42\13\1\6\4\13\1\7\26\13\1\11\35\13\1\10\5\13\1\4\3\13\1\5\7\13\1\1\3\13\1\2\1\13\1\3\1\12\uff8a\13",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\14\7\uffff\6\14\32\uffff\6\14",
            "",
            ""
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "11105:26: ( 'n' | 'r' | 't' | 'b' | 'f' | '\"' | '\\'' | '\\\\' | '>' | 'u' RULE_XDIGIT RULE_XDIGIT RULE_XDIGIT RULE_XDIGIT | . )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA8_0 = input.LA(1);

                        s = -1;
                        if ( (LA8_0=='n') ) {s = 1;}

                        else if ( (LA8_0=='r') ) {s = 2;}

                        else if ( (LA8_0=='t') ) {s = 3;}

                        else if ( (LA8_0=='b') ) {s = 4;}

                        else if ( (LA8_0=='f') ) {s = 5;}

                        else if ( (LA8_0=='\"') ) {s = 6;}

                        else if ( (LA8_0=='\'') ) {s = 7;}

                        else if ( (LA8_0=='\\') ) {s = 8;}

                        else if ( (LA8_0=='>') ) {s = 9;}

                        else if ( (LA8_0=='u') ) {s = 10;}

                        else if ( ((LA8_0>='\u0000' && LA8_0<='!')||(LA8_0>='#' && LA8_0<='&')||(LA8_0>='(' && LA8_0<='=')||(LA8_0>='?' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='a')||(LA8_0>='c' && LA8_0<='e')||(LA8_0>='g' && LA8_0<='m')||(LA8_0>='o' && LA8_0<='q')||LA8_0=='s'||(LA8_0>='v' && LA8_0<='\uFFFF')) ) {s = 11;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 8, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA18_eotS =
        "\1\uffff\3\36\1\57\1\61\2\uffff\4\36\3\uffff\2\36\4\uffff\1\73\1\uffff\1\36\1\76\2\uffff\1\37\1\uffff\1\36\12\uffff\6\36\4\uffff\10\36\2\uffff\1\36\2\uffff\1\37\1\36\3\uffff\17\36\1\37\1\36\1\uffff\3\36\1\153\2\36\1\156\2\36\1\161\5\36\1\167\1\36\1\uffff\1\36\1\172\1\36\1\uffff\2\36\1\uffff\2\36\1\uffff\1\36\1\u0082\3\36\1\uffff\1\36\1\u0087\1\uffff\1\u0088\1\u0089\5\36\1\uffff\2\36\1\u0091\1\36\3\uffff\1\36\1\uffff\1\36\1\u0095\1\u0096\1\u0097\1\36\1\uffff\3\36\3\uffff\1\u009c\1\uffff\2\36\1\uffff\1\u009f\1\36\1\uffff\2\36\1\u00a3\1\uffff";
    static final String DFA18_eofS =
        "\u00a4\uffff";
    static final String DFA18_minS =
        "\1\11\1\141\1\145\1\150\1\76\1\75\2\uffff\1\157\1\145\1\162\1\145\3\uffff\1\141\1\151\4\uffff\1\56\1\uffff\1\155\1\72\2\uffff\1\117\1\uffff\1\160\4\uffff\1\137\3\uffff\1\52\1\uffff\1\162\1\170\1\143\1\145\1\162\1\153\4\uffff\1\144\1\146\1\141\1\157\2\164\1\156\1\141\2\uffff\1\160\2\uffff\1\106\1\164\1\137\2\uffff\1\163\1\145\1\141\1\145\1\157\2\145\1\141\1\155\1\164\1\165\1\143\1\141\1\147\1\157\1\62\1\151\1\154\1\145\1\162\1\154\1\60\1\167\1\156\1\60\1\165\1\155\1\60\1\162\1\150\1\154\1\155\1\162\1\60\1\157\1\uffff\1\162\1\60\1\163\1\uffff\1\163\1\126\1\uffff\1\154\1\141\1\uffff\1\156\1\60\1\154\1\145\1\164\1\uffff\1\156\1\60\1\uffff\2\60\1\157\1\11\1\164\1\162\1\163\1\uffff\1\171\1\156\1\60\1\163\3\uffff\1\143\1\uffff\1\137\3\60\1\164\1\uffff\1\11\1\141\1\150\3\uffff\1\60\1\uffff\1\142\1\141\1\uffff\1\60\1\143\1\uffff\1\153\1\137\1\60\1\uffff";
    static final String DFA18_maxS =
        "\1\176\1\141\1\157\1\162\1\76\1\75\2\uffff\1\157\1\145\1\162\1\157\3\uffff\1\141\1\162\4\uffff\1\56\1\uffff\1\155\1\72\2\uffff\1\117\1\uffff\1\160\4\uffff\1\137\3\uffff\1\57\1\uffff\1\162\1\170\1\143\1\145\1\162\1\153\4\uffff\1\144\1\146\1\141\1\157\2\164\1\156\1\141\2\uffff\1\160\2\uffff\1\106\1\164\1\137\2\uffff\1\163\1\145\1\141\1\145\1\157\2\145\1\141\1\155\1\164\1\165\1\143\1\141\1\147\1\157\1\62\1\151\1\156\1\145\1\162\1\154\1\ufffd\1\167\1\156\1\ufffd\1\165\1\155\1\ufffd\1\162\1\150\1\154\1\155\1\162\1\ufffd\1\157\1\uffff\1\162\1\ufffd\1\163\1\uffff\2\163\1\uffff\1\154\1\141\1\uffff\1\156\1\ufffd\1\154\1\145\1\164\1\uffff\1\156\1\ufffd\1\uffff\2\ufffd\1\157\1\173\1\164\1\162\1\163\1\uffff\1\171\1\156\1\ufffd\1\163\3\uffff\1\143\1\uffff\1\137\3\ufffd\1\164\1\uffff\1\173\1\141\1\150\3\uffff\1\ufffd\1\uffff\1\142\1\141\1\uffff\1\ufffd\1\143\1\uffff\1\153\1\137\1\ufffd\1\uffff";
    static final String DFA18_acceptS =
        "\6\uffff\1\6\1\7\4\uffff\1\14\1\15\1\16\2\uffff\1\24\1\25\1\26\1\27\1\uffff\1\31\2\uffff\1\36\1\37\1\uffff\1\45\1\uffff\1\50\1\51\1\52\1\53\1\uffff\1\55\1\56\1\57\1\uffff\1\62\6\uffff\1\32\1\4\1\5\1\40\10\uffff\1\30\1\33\1\uffff\1\35\1\44\3\uffff\1\60\1\61\43\uffff\1\54\3\uffff\1\3\2\uffff\1\10\2\uffff\1\13\5\uffff\1\41\2\uffff\1\2\7\uffff\1\17\4\uffff\1\1\1\23\1\22\1\uffff\1\47\5\uffff\1\34\3\uffff\1\12\1\21\1\20\1\uffff\1\46\2\uffff\1\42\2\uffff\1\43\3\uffff\1\11";
    static final String DFA18_specialS =
        "\u00a4\uffff}>";
    static final String[] DFA18_transitionS = {
            "\2\47\1\uffff\2\47\22\uffff\1\47\2\uffff\1\22\1\43\2\uffff\1\41\1\23\1\24\1\32\1\5\1\15\1\34\1\25\1\46\12\40\1\30\1\44\1\6\1\4\1\7\1\31\1\16\4\37\1\33\25\37\1\45\3\uffff\1\42\1\uffff\2\36\1\17\1\11\1\36\1\20\1\12\1\36\1\27\2\36\1\2\1\10\1\36\1\35\1\1\1\36\1\13\1\36\1\3\6\36\1\uffff\1\21\1\14\1\26",
            "\1\50",
            "\1\51\11\uffff\1\52",
            "\1\54\6\uffff\1\55\2\uffff\1\53",
            "\1\56",
            "\1\60",
            "",
            "",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\66\11\uffff\1\65",
            "",
            "",
            "",
            "\1\67",
            "\1\70\10\uffff\1\71",
            "",
            "",
            "",
            "",
            "\1\72",
            "",
            "\1\74",
            "\1\75",
            "",
            "",
            "\1\77",
            "",
            "\1\100",
            "",
            "",
            "",
            "",
            "\1\101",
            "",
            "",
            "",
            "\1\103\4\uffff\1\102",
            "",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "",
            "",
            "",
            "",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "",
            "",
            "\1\122",
            "",
            "",
            "\1\123",
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
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\45\1\uffff\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36\74\uffff\1\36\10\uffff\27\36\1\uffff\37\36\1\uffff\u0286\36\1\uffff\u1c81\36\14\uffff\2\36\61\uffff\2\36\57\uffff\u0120\36\u0a70\uffff\u03f0\36\21\uffff\ua7ff\36\u2100\uffff\u04d0\36\40\uffff\u020e\36",
            "\1\154",
            "\1\155",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36\74\uffff\1\36\10\uffff\27\36\1\uffff\37\36\1\uffff\u0286\36\1\uffff\u1c81\36\14\uffff\2\36\61\uffff\2\36\57\uffff\u0120\36\u0a70\uffff\u03f0\36\21\uffff\ua7ff\36\u2100\uffff\u04d0\36\40\uffff\u020e\36",
            "\1\157",
            "\1\160",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36\74\uffff\1\36\10\uffff\27\36\1\uffff\37\36\1\uffff\u0286\36\1\uffff\u1c81\36\14\uffff\2\36\61\uffff\2\36\57\uffff\u0120\36\u0a70\uffff\u03f0\36\21\uffff\ua7ff\36\u2100\uffff\u04d0\36\40\uffff\u020e\36",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37\74\uffff\1\37\10\uffff\27\37\1\uffff\37\37\1\uffff\u0286\37\1\uffff\u1c81\37\14\uffff\2\37\61\uffff\2\37\57\uffff\u0120\37\u0a70\uffff\u03f0\37\21\uffff\ua7ff\37\u2100\uffff\u04d0\37\40\uffff\u020e\37",
            "\1\170",
            "",
            "\1\171",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36\74\uffff\1\36\10\uffff\27\36\1\uffff\37\36\1\uffff\u0286\36\1\uffff\u1c81\36\14\uffff\2\36\61\uffff\2\36\57\uffff\u0120\36\u0a70\uffff\u03f0\36\21\uffff\ua7ff\36\u2100\uffff\u04d0\36\40\uffff\u020e\36",
            "\1\173",
            "",
            "\1\174",
            "\1\175\34\uffff\1\176",
            "",
            "\1\177",
            "\1\u0080",
            "",
            "\1\u0081",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36\74\uffff\1\36\10\uffff\27\36\1\uffff\37\36\1\uffff\u0286\36\1\uffff\u1c81\36\14\uffff\2\36\61\uffff\2\36\57\uffff\u0120\36\u0a70\uffff\u03f0\36\21\uffff\ua7ff\36\u2100\uffff\u04d0\36\40\uffff\u020e\36",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "",
            "\1\u0086",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36\74\uffff\1\36\10\uffff\27\36\1\uffff\37\36\1\uffff\u0286\36\1\uffff\u1c81\36\14\uffff\2\36\61\uffff\2\36\57\uffff\u0120\36\u0a70\uffff\u03f0\36\21\uffff\ua7ff\36\u2100\uffff\u04d0\36\40\uffff\u020e\36",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36\74\uffff\1\36\10\uffff\27\36\1\uffff\37\36\1\uffff\u0286\36\1\uffff\u1c81\36\14\uffff\2\36\61\uffff\2\36\57\uffff\u0120\36\u0a70\uffff\u03f0\36\21\uffff\ua7ff\36\u2100\uffff\u04d0\36\40\uffff\u020e\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36\74\uffff\1\36\10\uffff\27\36\1\uffff\37\36\1\uffff\u0286\36\1\uffff\u1c81\36\14\uffff\2\36\61\uffff\2\36\57\uffff\u0120\36\u0a70\uffff\u03f0\36\21\uffff\ua7ff\36\u2100\uffff\u04d0\36\40\uffff\u020e\36",
            "\1\u008a",
            "\2\u008b\1\uffff\2\u008b\22\uffff\1\u008b\132\uffff\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "",
            "\1\u008f",
            "\1\u0090",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36\74\uffff\1\36\10\uffff\27\36\1\uffff\37\36\1\uffff\u0286\36\1\uffff\u1c81\36\14\uffff\2\36\61\uffff\2\36\57\uffff\u0120\36\u0a70\uffff\u03f0\36\21\uffff\ua7ff\36\u2100\uffff\u04d0\36\40\uffff\u020e\36",
            "\1\u0092",
            "",
            "",
            "",
            "\1\u0093",
            "",
            "\1\u0094",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36\74\uffff\1\36\10\uffff\27\36\1\uffff\37\36\1\uffff\u0286\36\1\uffff\u1c81\36\14\uffff\2\36\61\uffff\2\36\57\uffff\u0120\36\u0a70\uffff\u03f0\36\21\uffff\ua7ff\36\u2100\uffff\u04d0\36\40\uffff\u020e\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36\74\uffff\1\36\10\uffff\27\36\1\uffff\37\36\1\uffff\u0286\36\1\uffff\u1c81\36\14\uffff\2\36\61\uffff\2\36\57\uffff\u0120\36\u0a70\uffff\u03f0\36\21\uffff\ua7ff\36\u2100\uffff\u04d0\36\40\uffff\u020e\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36\74\uffff\1\36\10\uffff\27\36\1\uffff\37\36\1\uffff\u0286\36\1\uffff\u1c81\36\14\uffff\2\36\61\uffff\2\36\57\uffff\u0120\36\u0a70\uffff\u03f0\36\21\uffff\ua7ff\36\u2100\uffff\u04d0\36\40\uffff\u020e\36",
            "\1\u0098",
            "",
            "\2\u0099\1\uffff\2\u0099\22\uffff\1\u0099\132\uffff\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "",
            "",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36\74\uffff\1\36\10\uffff\27\36\1\uffff\37\36\1\uffff\u0286\36\1\uffff\u1c81\36\14\uffff\2\36\61\uffff\2\36\57\uffff\u0120\36\u0a70\uffff\u03f0\36\21\uffff\ua7ff\36\u2100\uffff\u04d0\36\40\uffff\u020e\36",
            "",
            "\1\u009d",
            "\1\u009e",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36\74\uffff\1\36\10\uffff\27\36\1\uffff\37\36\1\uffff\u0286\36\1\uffff\u1c81\36\14\uffff\2\36\61\uffff\2\36\57\uffff\u0120\36\u0a70\uffff\u03f0\36\21\uffff\ua7ff\36\u2100\uffff\u04d0\36\40\uffff\u020e\36",
            "\1\u00a0",
            "",
            "\1\u00a1",
            "\1\u00a2",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36\74\uffff\1\36\10\uffff\27\36\1\uffff\37\36\1\uffff\u0286\36\1\uffff\u1c81\36\14\uffff\2\36\61\uffff\2\36\57\uffff\u0120\36\u0a70\uffff\u03f0\36\21\uffff\ua7ff\36\u2100\uffff\u04d0\36\40\uffff\u020e\36",
            ""
    };

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | RULE_TOKEN_VOCAB | RULE_COLON | RULE_RARROW | RULE_OPTIONS_SPEC | RULE_TOKENS_SPEC | RULE_RULE_REF | RULE_TOKEN_REF | RULE_INT | RULE_MYSTRING | RULE_ACTION | RULE_DOLLAR | RULE_SEMICOLON | RULE_ARG_OR_CHARSET | RULE_SL_COMMENT | RULE_ML_COMMENT | RULE_WS );";
        }
    }
 

}