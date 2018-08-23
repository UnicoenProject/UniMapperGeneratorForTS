package net.unicoen.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import net.unicoen.services.UniMapperGeneratorGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalUniMapperGeneratorParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SEMICOLON", "RULE_RULE_REF", "RULE_OPTIONS_SPEC", "RULE_TOKEN_VOCAB", "RULE_MYSTRING", "RULE_ACTION", "RULE_INT", "RULE_TOKENS_SPEC", "RULE_ARG_OR_CHARSET", "RULE_COLON", "RULE_DOLLAR", "RULE_TOKEN_REF", "RULE_RARROW", "RULE_WSNLCHARS", "RULE_NAME_CHAR", "RULE_NAME_START_CHAR", "RULE_LITERAL_CHAR", "RULE_ESC", "RULE_XDIGIT", "RULE_NESTED_ACTION", "RULE_ACTION_ESC", "RULE_ACTION_STRING_LITERAL", "RULE_ACTION_CHAR_LITERAL", "RULE_ARG_ACTION", "RULE_LEXER_CHAR_SET", "RULE_SL_COMMENT", "RULE_ML_COMMENT", "RULE_WS", "'grammar'", "'root'", "'}'", "'='", "'import'", "','", "'@'", "'::'", "'parser'", "'lexer'", "'tree'", "'mode'", "'catch'", "'finally'", "'returns'", "'throws'", "'locals'", "'|'", "'#'", "'+='", "'?'", "'*'", "'+'", "'('", "')'", "'<'", "'>'", "'..'", "'EOF2'", "'~'", "'.'", "'=>'", "'fragment'", "'default_hack_'"
    };
    public static final int RULE_ACTION=9;
    public static final int T__50=50;
    public static final int RULE_ARG_OR_CHARSET=12;
    public static final int RULE_NAME_CHAR=18;
    public static final int T__59=59;
    public static final int RULE_MYSTRING=8;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int RULE_NESTED_ACTION=23;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_TOKEN_VOCAB=7;
    public static final int RULE_ACTION_ESC=24;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ESC=21;
    public static final int RULE_COLON=13;
    public static final int RULE_LEXER_CHAR_SET=28;
    public static final int RULE_ACTION_STRING_LITERAL=25;
    public static final int RULE_INT=10;
    public static final int RULE_ML_COMMENT=30;
    public static final int RULE_TOKENS_SPEC=11;
    public static final int RULE_SEMICOLON=4;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int RULE_TOKEN_REF=15;
    public static final int RULE_DOLLAR=14;
    public static final int RULE_RARROW=16;
    public static final int RULE_ARG_ACTION=27;
    public static final int RULE_SL_COMMENT=29;
    public static final int RULE_OPTIONS_SPEC=6;
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


        public InternalUniMapperGeneratorParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalUniMapperGeneratorParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalUniMapperGeneratorParser.tokenNames; }
    public String getGrammarFileName() { return "InternalUniMapperGenerator.g"; }



     	private UniMapperGeneratorGrammarAccess grammarAccess;

        public InternalUniMapperGeneratorParser(TokenStream input, UniMapperGeneratorGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Grammar";
       	}

       	@Override
       	protected UniMapperGeneratorGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleGrammar"
    // InternalUniMapperGenerator.g:65:1: entryRuleGrammar returns [EObject current=null] : iv_ruleGrammar= ruleGrammar EOF ;
    public final EObject entryRuleGrammar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGrammar = null;


        try {
            // InternalUniMapperGenerator.g:65:48: (iv_ruleGrammar= ruleGrammar EOF )
            // InternalUniMapperGenerator.g:66:2: iv_ruleGrammar= ruleGrammar EOF
            {
             newCompositeNode(grammarAccess.getGrammarRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGrammar=ruleGrammar();

            state._fsp--;

             current =iv_ruleGrammar; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGrammar"


    // $ANTLR start "ruleGrammar"
    // InternalUniMapperGenerator.g:72:1: ruleGrammar returns [EObject current=null] : ( ( (lv_type_0_0= ruleGrammarType ) )? otherlv_1= 'grammar' ( (lv_name_2_0= ruleId ) ) this_SEMICOLON_3= RULE_SEMICOLON ( (lv_root_4_0= rulerootSelection ) ) ( (lv_prequels_5_0= rulePrequelConstruct ) )* ( (lv_rules_6_0= ruleRule ) )* ( (lv_modes_7_0= ruleMode ) )* ) ;
    public final EObject ruleGrammar() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_SEMICOLON_3=null;
        Enumerator lv_type_0_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_root_4_0 = null;

        EObject lv_prequels_5_0 = null;

        EObject lv_rules_6_0 = null;

        EObject lv_modes_7_0 = null;



        	enterRule();

        try {
            // InternalUniMapperGenerator.g:78:2: ( ( ( (lv_type_0_0= ruleGrammarType ) )? otherlv_1= 'grammar' ( (lv_name_2_0= ruleId ) ) this_SEMICOLON_3= RULE_SEMICOLON ( (lv_root_4_0= rulerootSelection ) ) ( (lv_prequels_5_0= rulePrequelConstruct ) )* ( (lv_rules_6_0= ruleRule ) )* ( (lv_modes_7_0= ruleMode ) )* ) )
            // InternalUniMapperGenerator.g:79:2: ( ( (lv_type_0_0= ruleGrammarType ) )? otherlv_1= 'grammar' ( (lv_name_2_0= ruleId ) ) this_SEMICOLON_3= RULE_SEMICOLON ( (lv_root_4_0= rulerootSelection ) ) ( (lv_prequels_5_0= rulePrequelConstruct ) )* ( (lv_rules_6_0= ruleRule ) )* ( (lv_modes_7_0= ruleMode ) )* )
            {
            // InternalUniMapperGenerator.g:79:2: ( ( (lv_type_0_0= ruleGrammarType ) )? otherlv_1= 'grammar' ( (lv_name_2_0= ruleId ) ) this_SEMICOLON_3= RULE_SEMICOLON ( (lv_root_4_0= rulerootSelection ) ) ( (lv_prequels_5_0= rulePrequelConstruct ) )* ( (lv_rules_6_0= ruleRule ) )* ( (lv_modes_7_0= ruleMode ) )* )
            // InternalUniMapperGenerator.g:80:3: ( (lv_type_0_0= ruleGrammarType ) )? otherlv_1= 'grammar' ( (lv_name_2_0= ruleId ) ) this_SEMICOLON_3= RULE_SEMICOLON ( (lv_root_4_0= rulerootSelection ) ) ( (lv_prequels_5_0= rulePrequelConstruct ) )* ( (lv_rules_6_0= ruleRule ) )* ( (lv_modes_7_0= ruleMode ) )*
            {
            // InternalUniMapperGenerator.g:80:3: ( (lv_type_0_0= ruleGrammarType ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=40 && LA1_0<=42)||LA1_0==65) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalUniMapperGenerator.g:81:4: (lv_type_0_0= ruleGrammarType )
                    {
                    // InternalUniMapperGenerator.g:81:4: (lv_type_0_0= ruleGrammarType )
                    // InternalUniMapperGenerator.g:82:5: lv_type_0_0= ruleGrammarType
                    {

                    					newCompositeNode(grammarAccess.getGrammarAccess().getTypeGrammarTypeEnumRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_3);
                    lv_type_0_0=ruleGrammarType();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getGrammarRule());
                    					}
                    					set(
                    						current,
                    						"type",
                    						lv_type_0_0,
                    						"net.unicoen.UniMapperGenerator.GrammarType");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,32,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getGrammarAccess().getGrammarKeyword_1());
            		
            // InternalUniMapperGenerator.g:103:3: ( (lv_name_2_0= ruleId ) )
            // InternalUniMapperGenerator.g:104:4: (lv_name_2_0= ruleId )
            {
            // InternalUniMapperGenerator.g:104:4: (lv_name_2_0= ruleId )
            // InternalUniMapperGenerator.g:105:5: lv_name_2_0= ruleId
            {

            					newCompositeNode(grammarAccess.getGrammarAccess().getNameIdParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_2_0=ruleId();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGrammarRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"net.unicoen.UniMapperGenerator.Id");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_SEMICOLON_3=(Token)match(input,RULE_SEMICOLON,FOLLOW_6); 

            			newLeafNode(this_SEMICOLON_3, grammarAccess.getGrammarAccess().getSEMICOLONTerminalRuleCall_3());
            		
            // InternalUniMapperGenerator.g:126:3: ( (lv_root_4_0= rulerootSelection ) )
            // InternalUniMapperGenerator.g:127:4: (lv_root_4_0= rulerootSelection )
            {
            // InternalUniMapperGenerator.g:127:4: (lv_root_4_0= rulerootSelection )
            // InternalUniMapperGenerator.g:128:5: lv_root_4_0= rulerootSelection
            {

            					newCompositeNode(grammarAccess.getGrammarAccess().getRootRootSelectionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_7);
            lv_root_4_0=rulerootSelection();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGrammarRule());
            					}
            					set(
            						current,
            						"root",
            						lv_root_4_0,
            						"net.unicoen.UniMapperGenerator.rootSelection");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUniMapperGenerator.g:145:3: ( (lv_prequels_5_0= rulePrequelConstruct ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_OPTIONS_SPEC||LA2_0==RULE_TOKENS_SPEC||LA2_0==36||LA2_0==38) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalUniMapperGenerator.g:146:4: (lv_prequels_5_0= rulePrequelConstruct )
            	    {
            	    // InternalUniMapperGenerator.g:146:4: (lv_prequels_5_0= rulePrequelConstruct )
            	    // InternalUniMapperGenerator.g:147:5: lv_prequels_5_0= rulePrequelConstruct
            	    {

            	    					newCompositeNode(grammarAccess.getGrammarAccess().getPrequelsPrequelConstructParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_prequels_5_0=rulePrequelConstruct();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getGrammarRule());
            	    					}
            	    					add(
            	    						current,
            	    						"prequels",
            	    						lv_prequels_5_0,
            	    						"net.unicoen.UniMapperGenerator.PrequelConstruct");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalUniMapperGenerator.g:164:3: ( (lv_rules_6_0= ruleRule ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_RULE_REF||LA3_0==RULE_TOKEN_REF||LA3_0==64) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalUniMapperGenerator.g:165:4: (lv_rules_6_0= ruleRule )
            	    {
            	    // InternalUniMapperGenerator.g:165:4: (lv_rules_6_0= ruleRule )
            	    // InternalUniMapperGenerator.g:166:5: lv_rules_6_0= ruleRule
            	    {

            	    					newCompositeNode(grammarAccess.getGrammarAccess().getRulesRuleParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_rules_6_0=ruleRule();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getGrammarRule());
            	    					}
            	    					add(
            	    						current,
            	    						"rules",
            	    						lv_rules_6_0,
            	    						"net.unicoen.UniMapperGenerator.Rule");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalUniMapperGenerator.g:183:3: ( (lv_modes_7_0= ruleMode ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==43) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalUniMapperGenerator.g:184:4: (lv_modes_7_0= ruleMode )
            	    {
            	    // InternalUniMapperGenerator.g:184:4: (lv_modes_7_0= ruleMode )
            	    // InternalUniMapperGenerator.g:185:5: lv_modes_7_0= ruleMode
            	    {

            	    					newCompositeNode(grammarAccess.getGrammarAccess().getModesModeParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_modes_7_0=ruleMode();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getGrammarRule());
            	    					}
            	    					add(
            	    						current,
            	    						"modes",
            	    						lv_modes_7_0,
            	    						"net.unicoen.UniMapperGenerator.Mode");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGrammar"


    // $ANTLR start "entryRulerootSelection"
    // InternalUniMapperGenerator.g:206:1: entryRulerootSelection returns [EObject current=null] : iv_rulerootSelection= rulerootSelection EOF ;
    public final EObject entryRulerootSelection() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerootSelection = null;


        try {
            // InternalUniMapperGenerator.g:206:54: (iv_rulerootSelection= rulerootSelection EOF )
            // InternalUniMapperGenerator.g:207:2: iv_rulerootSelection= rulerootSelection EOF
            {
             newCompositeNode(grammarAccess.getRootSelectionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulerootSelection=rulerootSelection();

            state._fsp--;

             current =iv_rulerootSelection; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulerootSelection"


    // $ANTLR start "rulerootSelection"
    // InternalUniMapperGenerator.g:213:1: rulerootSelection returns [EObject current=null] : (otherlv_0= 'root' ( (otherlv_1= RULE_RULE_REF ) ) this_SEMICOLON_2= RULE_SEMICOLON ) ;
    public final EObject rulerootSelection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token this_SEMICOLON_2=null;


        	enterRule();

        try {
            // InternalUniMapperGenerator.g:219:2: ( (otherlv_0= 'root' ( (otherlv_1= RULE_RULE_REF ) ) this_SEMICOLON_2= RULE_SEMICOLON ) )
            // InternalUniMapperGenerator.g:220:2: (otherlv_0= 'root' ( (otherlv_1= RULE_RULE_REF ) ) this_SEMICOLON_2= RULE_SEMICOLON )
            {
            // InternalUniMapperGenerator.g:220:2: (otherlv_0= 'root' ( (otherlv_1= RULE_RULE_REF ) ) this_SEMICOLON_2= RULE_SEMICOLON )
            // InternalUniMapperGenerator.g:221:3: otherlv_0= 'root' ( (otherlv_1= RULE_RULE_REF ) ) this_SEMICOLON_2= RULE_SEMICOLON
            {
            otherlv_0=(Token)match(input,33,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getRootSelectionAccess().getRootKeyword_0());
            		
            // InternalUniMapperGenerator.g:225:3: ( (otherlv_1= RULE_RULE_REF ) )
            // InternalUniMapperGenerator.g:226:4: (otherlv_1= RULE_RULE_REF )
            {
            // InternalUniMapperGenerator.g:226:4: (otherlv_1= RULE_RULE_REF )
            // InternalUniMapperGenerator.g:227:5: otherlv_1= RULE_RULE_REF
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRootSelectionRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_RULE_REF,FOLLOW_5); 

            					newLeafNode(otherlv_1, grammarAccess.getRootSelectionAccess().getRootParserRuleCrossReference_1_0());
            				

            }


            }

            this_SEMICOLON_2=(Token)match(input,RULE_SEMICOLON,FOLLOW_2); 

            			newLeafNode(this_SEMICOLON_2, grammarAccess.getRootSelectionAccess().getSEMICOLONTerminalRuleCall_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulerootSelection"


    // $ANTLR start "entryRulePrequelConstruct"
    // InternalUniMapperGenerator.g:246:1: entryRulePrequelConstruct returns [EObject current=null] : iv_rulePrequelConstruct= rulePrequelConstruct EOF ;
    public final EObject entryRulePrequelConstruct() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrequelConstruct = null;


        try {
            // InternalUniMapperGenerator.g:246:57: (iv_rulePrequelConstruct= rulePrequelConstruct EOF )
            // InternalUniMapperGenerator.g:247:2: iv_rulePrequelConstruct= rulePrequelConstruct EOF
            {
             newCompositeNode(grammarAccess.getPrequelConstructRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrequelConstruct=rulePrequelConstruct();

            state._fsp--;

             current =iv_rulePrequelConstruct; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrequelConstruct"


    // $ANTLR start "rulePrequelConstruct"
    // InternalUniMapperGenerator.g:253:1: rulePrequelConstruct returns [EObject current=null] : (this_Options_0= ruleOptions | this_Imports_1= ruleImports | this_Tokens_2= ruleTokens | this_GrammarAction_3= ruleGrammarAction ) ;
    public final EObject rulePrequelConstruct() throws RecognitionException {
        EObject current = null;

        EObject this_Options_0 = null;

        EObject this_Imports_1 = null;

        EObject this_Tokens_2 = null;

        EObject this_GrammarAction_3 = null;



        	enterRule();

        try {
            // InternalUniMapperGenerator.g:259:2: ( (this_Options_0= ruleOptions | this_Imports_1= ruleImports | this_Tokens_2= ruleTokens | this_GrammarAction_3= ruleGrammarAction ) )
            // InternalUniMapperGenerator.g:260:2: (this_Options_0= ruleOptions | this_Imports_1= ruleImports | this_Tokens_2= ruleTokens | this_GrammarAction_3= ruleGrammarAction )
            {
            // InternalUniMapperGenerator.g:260:2: (this_Options_0= ruleOptions | this_Imports_1= ruleImports | this_Tokens_2= ruleTokens | this_GrammarAction_3= ruleGrammarAction )
            int alt5=4;
            switch ( input.LA(1) ) {
            case RULE_OPTIONS_SPEC:
                {
                alt5=1;
                }
                break;
            case 36:
                {
                alt5=2;
                }
                break;
            case RULE_TOKENS_SPEC:
                {
                alt5=3;
                }
                break;
            case 38:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalUniMapperGenerator.g:261:3: this_Options_0= ruleOptions
                    {

                    			newCompositeNode(grammarAccess.getPrequelConstructAccess().getOptionsParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Options_0=ruleOptions();

                    state._fsp--;


                    			current = this_Options_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUniMapperGenerator.g:270:3: this_Imports_1= ruleImports
                    {

                    			newCompositeNode(grammarAccess.getPrequelConstructAccess().getImportsParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Imports_1=ruleImports();

                    state._fsp--;


                    			current = this_Imports_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalUniMapperGenerator.g:279:3: this_Tokens_2= ruleTokens
                    {

                    			newCompositeNode(grammarAccess.getPrequelConstructAccess().getTokensParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Tokens_2=ruleTokens();

                    state._fsp--;


                    			current = this_Tokens_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalUniMapperGenerator.g:288:3: this_GrammarAction_3= ruleGrammarAction
                    {

                    			newCompositeNode(grammarAccess.getPrequelConstructAccess().getGrammarActionParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_GrammarAction_3=ruleGrammarAction();

                    state._fsp--;


                    			current = this_GrammarAction_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrequelConstruct"


    // $ANTLR start "entryRuleOptions"
    // InternalUniMapperGenerator.g:300:1: entryRuleOptions returns [EObject current=null] : iv_ruleOptions= ruleOptions EOF ;
    public final EObject entryRuleOptions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOptions = null;


        try {
            // InternalUniMapperGenerator.g:300:48: (iv_ruleOptions= ruleOptions EOF )
            // InternalUniMapperGenerator.g:301:2: iv_ruleOptions= ruleOptions EOF
            {
             newCompositeNode(grammarAccess.getOptionsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOptions=ruleOptions();

            state._fsp--;

             current =iv_ruleOptions; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOptions"


    // $ANTLR start "ruleOptions"
    // InternalUniMapperGenerator.g:307:1: ruleOptions returns [EObject current=null] : ( () ( (lv_keyword_1_0= RULE_OPTIONS_SPEC ) ) ( ( (lv_options_2_0= ruleOption ) ) this_SEMICOLON_3= RULE_SEMICOLON )* otherlv_4= '}' ) ;
    public final EObject ruleOptions() throws RecognitionException {
        EObject current = null;

        Token lv_keyword_1_0=null;
        Token this_SEMICOLON_3=null;
        Token otherlv_4=null;
        EObject lv_options_2_0 = null;



        	enterRule();

        try {
            // InternalUniMapperGenerator.g:313:2: ( ( () ( (lv_keyword_1_0= RULE_OPTIONS_SPEC ) ) ( ( (lv_options_2_0= ruleOption ) ) this_SEMICOLON_3= RULE_SEMICOLON )* otherlv_4= '}' ) )
            // InternalUniMapperGenerator.g:314:2: ( () ( (lv_keyword_1_0= RULE_OPTIONS_SPEC ) ) ( ( (lv_options_2_0= ruleOption ) ) this_SEMICOLON_3= RULE_SEMICOLON )* otherlv_4= '}' )
            {
            // InternalUniMapperGenerator.g:314:2: ( () ( (lv_keyword_1_0= RULE_OPTIONS_SPEC ) ) ( ( (lv_options_2_0= ruleOption ) ) this_SEMICOLON_3= RULE_SEMICOLON )* otherlv_4= '}' )
            // InternalUniMapperGenerator.g:315:3: () ( (lv_keyword_1_0= RULE_OPTIONS_SPEC ) ) ( ( (lv_options_2_0= ruleOption ) ) this_SEMICOLON_3= RULE_SEMICOLON )* otherlv_4= '}'
            {
            // InternalUniMapperGenerator.g:315:3: ()
            // InternalUniMapperGenerator.g:316:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOptionsAccess().getOptionsAction_0(),
            					current);
            			

            }

            // InternalUniMapperGenerator.g:322:3: ( (lv_keyword_1_0= RULE_OPTIONS_SPEC ) )
            // InternalUniMapperGenerator.g:323:4: (lv_keyword_1_0= RULE_OPTIONS_SPEC )
            {
            // InternalUniMapperGenerator.g:323:4: (lv_keyword_1_0= RULE_OPTIONS_SPEC )
            // InternalUniMapperGenerator.g:324:5: lv_keyword_1_0= RULE_OPTIONS_SPEC
            {
            lv_keyword_1_0=(Token)match(input,RULE_OPTIONS_SPEC,FOLLOW_11); 

            					newLeafNode(lv_keyword_1_0, grammarAccess.getOptionsAccess().getKeywordOPTIONS_SPECTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOptionsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"keyword",
            						lv_keyword_1_0,
            						"net.unicoen.UniMapperGenerator.OPTIONS_SPEC");
            				

            }


            }

            // InternalUniMapperGenerator.g:340:3: ( ( (lv_options_2_0= ruleOption ) ) this_SEMICOLON_3= RULE_SEMICOLON )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_RULE_REF||LA6_0==RULE_TOKEN_VOCAB||LA6_0==RULE_TOKEN_REF) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalUniMapperGenerator.g:341:4: ( (lv_options_2_0= ruleOption ) ) this_SEMICOLON_3= RULE_SEMICOLON
            	    {
            	    // InternalUniMapperGenerator.g:341:4: ( (lv_options_2_0= ruleOption ) )
            	    // InternalUniMapperGenerator.g:342:5: (lv_options_2_0= ruleOption )
            	    {
            	    // InternalUniMapperGenerator.g:342:5: (lv_options_2_0= ruleOption )
            	    // InternalUniMapperGenerator.g:343:6: lv_options_2_0= ruleOption
            	    {

            	    						newCompositeNode(grammarAccess.getOptionsAccess().getOptionsOptionParserRuleCall_2_0_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_options_2_0=ruleOption();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOptionsRule());
            	    						}
            	    						add(
            	    							current,
            	    							"options",
            	    							lv_options_2_0,
            	    							"net.unicoen.UniMapperGenerator.Option");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    this_SEMICOLON_3=(Token)match(input,RULE_SEMICOLON,FOLLOW_11); 

            	    				newLeafNode(this_SEMICOLON_3, grammarAccess.getOptionsAccess().getSEMICOLONTerminalRuleCall_2_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_4=(Token)match(input,34,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getOptionsAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOptions"


    // $ANTLR start "entryRuleOption"
    // InternalUniMapperGenerator.g:373:1: entryRuleOption returns [EObject current=null] : iv_ruleOption= ruleOption EOF ;
    public final EObject entryRuleOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOption = null;


        try {
            // InternalUniMapperGenerator.g:373:47: (iv_ruleOption= ruleOption EOF )
            // InternalUniMapperGenerator.g:374:2: iv_ruleOption= ruleOption EOF
            {
             newCompositeNode(grammarAccess.getOptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOption=ruleOption();

            state._fsp--;

             current =iv_ruleOption; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOption"


    // $ANTLR start "ruleOption"
    // InternalUniMapperGenerator.g:380:1: ruleOption returns [EObject current=null] : (this_TokenVocab_0= ruleTokenVocab | ( ( (lv_name_1_0= ruleId ) ) otherlv_2= '=' ( (lv_value_3_0= ruleOptionValue ) ) ) ) ;
    public final EObject ruleOption() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_TokenVocab_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalUniMapperGenerator.g:386:2: ( (this_TokenVocab_0= ruleTokenVocab | ( ( (lv_name_1_0= ruleId ) ) otherlv_2= '=' ( (lv_value_3_0= ruleOptionValue ) ) ) ) )
            // InternalUniMapperGenerator.g:387:2: (this_TokenVocab_0= ruleTokenVocab | ( ( (lv_name_1_0= ruleId ) ) otherlv_2= '=' ( (lv_value_3_0= ruleOptionValue ) ) ) )
            {
            // InternalUniMapperGenerator.g:387:2: (this_TokenVocab_0= ruleTokenVocab | ( ( (lv_name_1_0= ruleId ) ) otherlv_2= '=' ( (lv_value_3_0= ruleOptionValue ) ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_TOKEN_VOCAB) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_RULE_REF||LA7_0==RULE_TOKEN_REF) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalUniMapperGenerator.g:388:3: this_TokenVocab_0= ruleTokenVocab
                    {

                    			newCompositeNode(grammarAccess.getOptionAccess().getTokenVocabParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_TokenVocab_0=ruleTokenVocab();

                    state._fsp--;


                    			current = this_TokenVocab_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUniMapperGenerator.g:397:3: ( ( (lv_name_1_0= ruleId ) ) otherlv_2= '=' ( (lv_value_3_0= ruleOptionValue ) ) )
                    {
                    // InternalUniMapperGenerator.g:397:3: ( ( (lv_name_1_0= ruleId ) ) otherlv_2= '=' ( (lv_value_3_0= ruleOptionValue ) ) )
                    // InternalUniMapperGenerator.g:398:4: ( (lv_name_1_0= ruleId ) ) otherlv_2= '=' ( (lv_value_3_0= ruleOptionValue ) )
                    {
                    // InternalUniMapperGenerator.g:398:4: ( (lv_name_1_0= ruleId ) )
                    // InternalUniMapperGenerator.g:399:5: (lv_name_1_0= ruleId )
                    {
                    // InternalUniMapperGenerator.g:399:5: (lv_name_1_0= ruleId )
                    // InternalUniMapperGenerator.g:400:6: lv_name_1_0= ruleId
                    {

                    						newCompositeNode(grammarAccess.getOptionAccess().getNameIdParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_name_1_0=ruleId();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOptionRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_1_0,
                    							"net.unicoen.UniMapperGenerator.Id");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,35,FOLLOW_13); 

                    				newLeafNode(otherlv_2, grammarAccess.getOptionAccess().getEqualsSignKeyword_1_1());
                    			
                    // InternalUniMapperGenerator.g:421:4: ( (lv_value_3_0= ruleOptionValue ) )
                    // InternalUniMapperGenerator.g:422:5: (lv_value_3_0= ruleOptionValue )
                    {
                    // InternalUniMapperGenerator.g:422:5: (lv_value_3_0= ruleOptionValue )
                    // InternalUniMapperGenerator.g:423:6: lv_value_3_0= ruleOptionValue
                    {

                    						newCompositeNode(grammarAccess.getOptionAccess().getValueOptionValueParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_3_0=ruleOptionValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOptionRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_3_0,
                    							"net.unicoen.UniMapperGenerator.OptionValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOption"


    // $ANTLR start "entryRuleTokenVocab"
    // InternalUniMapperGenerator.g:445:1: entryRuleTokenVocab returns [EObject current=null] : iv_ruleTokenVocab= ruleTokenVocab EOF ;
    public final EObject entryRuleTokenVocab() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTokenVocab = null;


        try {
            // InternalUniMapperGenerator.g:445:51: (iv_ruleTokenVocab= ruleTokenVocab EOF )
            // InternalUniMapperGenerator.g:446:2: iv_ruleTokenVocab= ruleTokenVocab EOF
            {
             newCompositeNode(grammarAccess.getTokenVocabRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTokenVocab=ruleTokenVocab();

            state._fsp--;

             current =iv_ruleTokenVocab; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTokenVocab"


    // $ANTLR start "ruleTokenVocab"
    // InternalUniMapperGenerator.g:452:1: ruleTokenVocab returns [EObject current=null] : ( ( (lv_name_0_0= RULE_TOKEN_VOCAB ) ) otherlv_1= '=' ( ( ruleId ) ) ) ;
    public final EObject ruleTokenVocab() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalUniMapperGenerator.g:458:2: ( ( ( (lv_name_0_0= RULE_TOKEN_VOCAB ) ) otherlv_1= '=' ( ( ruleId ) ) ) )
            // InternalUniMapperGenerator.g:459:2: ( ( (lv_name_0_0= RULE_TOKEN_VOCAB ) ) otherlv_1= '=' ( ( ruleId ) ) )
            {
            // InternalUniMapperGenerator.g:459:2: ( ( (lv_name_0_0= RULE_TOKEN_VOCAB ) ) otherlv_1= '=' ( ( ruleId ) ) )
            // InternalUniMapperGenerator.g:460:3: ( (lv_name_0_0= RULE_TOKEN_VOCAB ) ) otherlv_1= '=' ( ( ruleId ) )
            {
            // InternalUniMapperGenerator.g:460:3: ( (lv_name_0_0= RULE_TOKEN_VOCAB ) )
            // InternalUniMapperGenerator.g:461:4: (lv_name_0_0= RULE_TOKEN_VOCAB )
            {
            // InternalUniMapperGenerator.g:461:4: (lv_name_0_0= RULE_TOKEN_VOCAB )
            // InternalUniMapperGenerator.g:462:5: lv_name_0_0= RULE_TOKEN_VOCAB
            {
            lv_name_0_0=(Token)match(input,RULE_TOKEN_VOCAB,FOLLOW_12); 

            					newLeafNode(lv_name_0_0, grammarAccess.getTokenVocabAccess().getNameTOKEN_VOCABTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTokenVocabRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"net.unicoen.UniMapperGenerator.TOKEN_VOCAB");
            				

            }


            }

            otherlv_1=(Token)match(input,35,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getTokenVocabAccess().getEqualsSignKeyword_1());
            		
            // InternalUniMapperGenerator.g:482:3: ( ( ruleId ) )
            // InternalUniMapperGenerator.g:483:4: ( ruleId )
            {
            // InternalUniMapperGenerator.g:483:4: ( ruleId )
            // InternalUniMapperGenerator.g:484:5: ruleId
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTokenVocabRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTokenVocabAccess().getImportURIGrammarCrossReference_2_0());
            				
            pushFollow(FOLLOW_2);
            ruleId();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTokenVocab"


    // $ANTLR start "entryRuleOptionValue"
    // InternalUniMapperGenerator.g:502:1: entryRuleOptionValue returns [EObject current=null] : iv_ruleOptionValue= ruleOptionValue EOF ;
    public final EObject entryRuleOptionValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOptionValue = null;


        try {
            // InternalUniMapperGenerator.g:502:52: (iv_ruleOptionValue= ruleOptionValue EOF )
            // InternalUniMapperGenerator.g:503:2: iv_ruleOptionValue= ruleOptionValue EOF
            {
             newCompositeNode(grammarAccess.getOptionValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOptionValue=ruleOptionValue();

            state._fsp--;

             current =iv_ruleOptionValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOptionValue"


    // $ANTLR start "ruleOptionValue"
    // InternalUniMapperGenerator.g:509:1: ruleOptionValue returns [EObject current=null] : (this_QualifiedOption_0= ruleQualifiedOption | this_StringOption_1= ruleStringOption | this_ActionOption_2= ruleActionOption | this_IntOption_3= ruleIntOption ) ;
    public final EObject ruleOptionValue() throws RecognitionException {
        EObject current = null;

        EObject this_QualifiedOption_0 = null;

        EObject this_StringOption_1 = null;

        EObject this_ActionOption_2 = null;

        EObject this_IntOption_3 = null;



        	enterRule();

        try {
            // InternalUniMapperGenerator.g:515:2: ( (this_QualifiedOption_0= ruleQualifiedOption | this_StringOption_1= ruleStringOption | this_ActionOption_2= ruleActionOption | this_IntOption_3= ruleIntOption ) )
            // InternalUniMapperGenerator.g:516:2: (this_QualifiedOption_0= ruleQualifiedOption | this_StringOption_1= ruleStringOption | this_ActionOption_2= ruleActionOption | this_IntOption_3= ruleIntOption )
            {
            // InternalUniMapperGenerator.g:516:2: (this_QualifiedOption_0= ruleQualifiedOption | this_StringOption_1= ruleStringOption | this_ActionOption_2= ruleActionOption | this_IntOption_3= ruleIntOption )
            int alt8=4;
            switch ( input.LA(1) ) {
            case RULE_RULE_REF:
            case RULE_TOKEN_REF:
                {
                alt8=1;
                }
                break;
            case RULE_MYSTRING:
                {
                alt8=2;
                }
                break;
            case RULE_ACTION:
                {
                alt8=3;
                }
                break;
            case RULE_INT:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalUniMapperGenerator.g:517:3: this_QualifiedOption_0= ruleQualifiedOption
                    {

                    			newCompositeNode(grammarAccess.getOptionValueAccess().getQualifiedOptionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_QualifiedOption_0=ruleQualifiedOption();

                    state._fsp--;


                    			current = this_QualifiedOption_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUniMapperGenerator.g:526:3: this_StringOption_1= ruleStringOption
                    {

                    			newCompositeNode(grammarAccess.getOptionValueAccess().getStringOptionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringOption_1=ruleStringOption();

                    state._fsp--;


                    			current = this_StringOption_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalUniMapperGenerator.g:535:3: this_ActionOption_2= ruleActionOption
                    {

                    			newCompositeNode(grammarAccess.getOptionValueAccess().getActionOptionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ActionOption_2=ruleActionOption();

                    state._fsp--;


                    			current = this_ActionOption_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalUniMapperGenerator.g:544:3: this_IntOption_3= ruleIntOption
                    {

                    			newCompositeNode(grammarAccess.getOptionValueAccess().getIntOptionParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntOption_3=ruleIntOption();

                    state._fsp--;


                    			current = this_IntOption_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOptionValue"


    // $ANTLR start "entryRuleQualifiedOption"
    // InternalUniMapperGenerator.g:556:1: entryRuleQualifiedOption returns [EObject current=null] : iv_ruleQualifiedOption= ruleQualifiedOption EOF ;
    public final EObject entryRuleQualifiedOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualifiedOption = null;


        try {
            // InternalUniMapperGenerator.g:556:56: (iv_ruleQualifiedOption= ruleQualifiedOption EOF )
            // InternalUniMapperGenerator.g:557:2: iv_ruleQualifiedOption= ruleQualifiedOption EOF
            {
             newCompositeNode(grammarAccess.getQualifiedOptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedOption=ruleQualifiedOption();

            state._fsp--;

             current =iv_ruleQualifiedOption; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedOption"


    // $ANTLR start "ruleQualifiedOption"
    // InternalUniMapperGenerator.g:563:1: ruleQualifiedOption returns [EObject current=null] : ( (lv_value_0_0= ruleQualifiedId ) ) ;
    public final EObject ruleQualifiedOption() throws RecognitionException {
        EObject current = null;

        EObject lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalUniMapperGenerator.g:569:2: ( ( (lv_value_0_0= ruleQualifiedId ) ) )
            // InternalUniMapperGenerator.g:570:2: ( (lv_value_0_0= ruleQualifiedId ) )
            {
            // InternalUniMapperGenerator.g:570:2: ( (lv_value_0_0= ruleQualifiedId ) )
            // InternalUniMapperGenerator.g:571:3: (lv_value_0_0= ruleQualifiedId )
            {
            // InternalUniMapperGenerator.g:571:3: (lv_value_0_0= ruleQualifiedId )
            // InternalUniMapperGenerator.g:572:4: lv_value_0_0= ruleQualifiedId
            {

            				newCompositeNode(grammarAccess.getQualifiedOptionAccess().getValueQualifiedIdParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleQualifiedId();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getQualifiedOptionRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"net.unicoen.UniMapperGenerator.QualifiedId");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedOption"


    // $ANTLR start "entryRuleStringOption"
    // InternalUniMapperGenerator.g:592:1: entryRuleStringOption returns [EObject current=null] : iv_ruleStringOption= ruleStringOption EOF ;
    public final EObject entryRuleStringOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringOption = null;


        try {
            // InternalUniMapperGenerator.g:592:53: (iv_ruleStringOption= ruleStringOption EOF )
            // InternalUniMapperGenerator.g:593:2: iv_ruleStringOption= ruleStringOption EOF
            {
             newCompositeNode(grammarAccess.getStringOptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringOption=ruleStringOption();

            state._fsp--;

             current =iv_ruleStringOption; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringOption"


    // $ANTLR start "ruleStringOption"
    // InternalUniMapperGenerator.g:599:1: ruleStringOption returns [EObject current=null] : ( (lv_value_0_0= RULE_MYSTRING ) ) ;
    public final EObject ruleStringOption() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalUniMapperGenerator.g:605:2: ( ( (lv_value_0_0= RULE_MYSTRING ) ) )
            // InternalUniMapperGenerator.g:606:2: ( (lv_value_0_0= RULE_MYSTRING ) )
            {
            // InternalUniMapperGenerator.g:606:2: ( (lv_value_0_0= RULE_MYSTRING ) )
            // InternalUniMapperGenerator.g:607:3: (lv_value_0_0= RULE_MYSTRING )
            {
            // InternalUniMapperGenerator.g:607:3: (lv_value_0_0= RULE_MYSTRING )
            // InternalUniMapperGenerator.g:608:4: lv_value_0_0= RULE_MYSTRING
            {
            lv_value_0_0=(Token)match(input,RULE_MYSTRING,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getStringOptionAccess().getValueMYSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getStringOptionRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"net.unicoen.UniMapperGenerator.MYSTRING");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringOption"


    // $ANTLR start "entryRuleActionOption"
    // InternalUniMapperGenerator.g:627:1: entryRuleActionOption returns [EObject current=null] : iv_ruleActionOption= ruleActionOption EOF ;
    public final EObject entryRuleActionOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionOption = null;


        try {
            // InternalUniMapperGenerator.g:627:53: (iv_ruleActionOption= ruleActionOption EOF )
            // InternalUniMapperGenerator.g:628:2: iv_ruleActionOption= ruleActionOption EOF
            {
             newCompositeNode(grammarAccess.getActionOptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActionOption=ruleActionOption();

            state._fsp--;

             current =iv_ruleActionOption; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActionOption"


    // $ANTLR start "ruleActionOption"
    // InternalUniMapperGenerator.g:634:1: ruleActionOption returns [EObject current=null] : ( (lv_value_0_0= RULE_ACTION ) ) ;
    public final EObject ruleActionOption() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalUniMapperGenerator.g:640:2: ( ( (lv_value_0_0= RULE_ACTION ) ) )
            // InternalUniMapperGenerator.g:641:2: ( (lv_value_0_0= RULE_ACTION ) )
            {
            // InternalUniMapperGenerator.g:641:2: ( (lv_value_0_0= RULE_ACTION ) )
            // InternalUniMapperGenerator.g:642:3: (lv_value_0_0= RULE_ACTION )
            {
            // InternalUniMapperGenerator.g:642:3: (lv_value_0_0= RULE_ACTION )
            // InternalUniMapperGenerator.g:643:4: lv_value_0_0= RULE_ACTION
            {
            lv_value_0_0=(Token)match(input,RULE_ACTION,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getActionOptionAccess().getValueACTIONTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getActionOptionRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"net.unicoen.UniMapperGenerator.ACTION");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActionOption"


    // $ANTLR start "entryRuleIntOption"
    // InternalUniMapperGenerator.g:662:1: entryRuleIntOption returns [EObject current=null] : iv_ruleIntOption= ruleIntOption EOF ;
    public final EObject entryRuleIntOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntOption = null;


        try {
            // InternalUniMapperGenerator.g:662:50: (iv_ruleIntOption= ruleIntOption EOF )
            // InternalUniMapperGenerator.g:663:2: iv_ruleIntOption= ruleIntOption EOF
            {
             newCompositeNode(grammarAccess.getIntOptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntOption=ruleIntOption();

            state._fsp--;

             current =iv_ruleIntOption; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntOption"


    // $ANTLR start "ruleIntOption"
    // InternalUniMapperGenerator.g:669:1: ruleIntOption returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntOption() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalUniMapperGenerator.g:675:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalUniMapperGenerator.g:676:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalUniMapperGenerator.g:676:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalUniMapperGenerator.g:677:3: (lv_value_0_0= RULE_INT )
            {
            // InternalUniMapperGenerator.g:677:3: (lv_value_0_0= RULE_INT )
            // InternalUniMapperGenerator.g:678:4: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getIntOptionAccess().getValueINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getIntOptionRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"net.unicoen.UniMapperGenerator.INT");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntOption"


    // $ANTLR start "entryRuleImports"
    // InternalUniMapperGenerator.g:697:1: entryRuleImports returns [EObject current=null] : iv_ruleImports= ruleImports EOF ;
    public final EObject entryRuleImports() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImports = null;


        try {
            // InternalUniMapperGenerator.g:697:48: (iv_ruleImports= ruleImports EOF )
            // InternalUniMapperGenerator.g:698:2: iv_ruleImports= ruleImports EOF
            {
             newCompositeNode(grammarAccess.getImportsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImports=ruleImports();

            state._fsp--;

             current =iv_ruleImports; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImports"


    // $ANTLR start "ruleImports"
    // InternalUniMapperGenerator.g:704:1: ruleImports returns [EObject current=null] : ( ( (lv_keyword_0_0= 'import' ) ) ( (lv_imports_1_0= ruleImport ) ) (otherlv_2= ',' ( (lv_imports_3_0= ruleImport ) ) )* this_SEMICOLON_4= RULE_SEMICOLON ) ;
    public final EObject ruleImports() throws RecognitionException {
        EObject current = null;

        Token lv_keyword_0_0=null;
        Token otherlv_2=null;
        Token this_SEMICOLON_4=null;
        EObject lv_imports_1_0 = null;

        EObject lv_imports_3_0 = null;



        	enterRule();

        try {
            // InternalUniMapperGenerator.g:710:2: ( ( ( (lv_keyword_0_0= 'import' ) ) ( (lv_imports_1_0= ruleImport ) ) (otherlv_2= ',' ( (lv_imports_3_0= ruleImport ) ) )* this_SEMICOLON_4= RULE_SEMICOLON ) )
            // InternalUniMapperGenerator.g:711:2: ( ( (lv_keyword_0_0= 'import' ) ) ( (lv_imports_1_0= ruleImport ) ) (otherlv_2= ',' ( (lv_imports_3_0= ruleImport ) ) )* this_SEMICOLON_4= RULE_SEMICOLON )
            {
            // InternalUniMapperGenerator.g:711:2: ( ( (lv_keyword_0_0= 'import' ) ) ( (lv_imports_1_0= ruleImport ) ) (otherlv_2= ',' ( (lv_imports_3_0= ruleImport ) ) )* this_SEMICOLON_4= RULE_SEMICOLON )
            // InternalUniMapperGenerator.g:712:3: ( (lv_keyword_0_0= 'import' ) ) ( (lv_imports_1_0= ruleImport ) ) (otherlv_2= ',' ( (lv_imports_3_0= ruleImport ) ) )* this_SEMICOLON_4= RULE_SEMICOLON
            {
            // InternalUniMapperGenerator.g:712:3: ( (lv_keyword_0_0= 'import' ) )
            // InternalUniMapperGenerator.g:713:4: (lv_keyword_0_0= 'import' )
            {
            // InternalUniMapperGenerator.g:713:4: (lv_keyword_0_0= 'import' )
            // InternalUniMapperGenerator.g:714:5: lv_keyword_0_0= 'import'
            {
            lv_keyword_0_0=(Token)match(input,36,FOLLOW_4); 

            					newLeafNode(lv_keyword_0_0, grammarAccess.getImportsAccess().getKeywordImportKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImportsRule());
            					}
            					setWithLastConsumed(current, "keyword", lv_keyword_0_0, "import");
            				

            }


            }

            // InternalUniMapperGenerator.g:726:3: ( (lv_imports_1_0= ruleImport ) )
            // InternalUniMapperGenerator.g:727:4: (lv_imports_1_0= ruleImport )
            {
            // InternalUniMapperGenerator.g:727:4: (lv_imports_1_0= ruleImport )
            // InternalUniMapperGenerator.g:728:5: lv_imports_1_0= ruleImport
            {

            					newCompositeNode(grammarAccess.getImportsAccess().getImportsImportParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_14);
            lv_imports_1_0=ruleImport();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImportsRule());
            					}
            					add(
            						current,
            						"imports",
            						lv_imports_1_0,
            						"net.unicoen.UniMapperGenerator.Import");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUniMapperGenerator.g:745:3: (otherlv_2= ',' ( (lv_imports_3_0= ruleImport ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==37) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalUniMapperGenerator.g:746:4: otherlv_2= ',' ( (lv_imports_3_0= ruleImport ) )
            	    {
            	    otherlv_2=(Token)match(input,37,FOLLOW_4); 

            	    				newLeafNode(otherlv_2, grammarAccess.getImportsAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalUniMapperGenerator.g:750:4: ( (lv_imports_3_0= ruleImport ) )
            	    // InternalUniMapperGenerator.g:751:5: (lv_imports_3_0= ruleImport )
            	    {
            	    // InternalUniMapperGenerator.g:751:5: (lv_imports_3_0= ruleImport )
            	    // InternalUniMapperGenerator.g:752:6: lv_imports_3_0= ruleImport
            	    {

            	    						newCompositeNode(grammarAccess.getImportsAccess().getImportsImportParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_14);
            	    lv_imports_3_0=ruleImport();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getImportsRule());
            	    						}
            	    						add(
            	    							current,
            	    							"imports",
            	    							lv_imports_3_0,
            	    							"net.unicoen.UniMapperGenerator.Import");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            this_SEMICOLON_4=(Token)match(input,RULE_SEMICOLON,FOLLOW_2); 

            			newLeafNode(this_SEMICOLON_4, grammarAccess.getImportsAccess().getSEMICOLONTerminalRuleCall_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImports"


    // $ANTLR start "entryRuleImport"
    // InternalUniMapperGenerator.g:778:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalUniMapperGenerator.g:778:47: (iv_ruleImport= ruleImport EOF )
            // InternalUniMapperGenerator.g:779:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalUniMapperGenerator.g:785:1: ruleImport returns [EObject current=null] : ( ( ( (lv_alias_0_0= ruleId ) ) otherlv_1= '=' ( ( ruleId ) ) ) | ( ( ruleId ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_alias_0_0 = null;



        	enterRule();

        try {
            // InternalUniMapperGenerator.g:791:2: ( ( ( ( (lv_alias_0_0= ruleId ) ) otherlv_1= '=' ( ( ruleId ) ) ) | ( ( ruleId ) ) ) )
            // InternalUniMapperGenerator.g:792:2: ( ( ( (lv_alias_0_0= ruleId ) ) otherlv_1= '=' ( ( ruleId ) ) ) | ( ( ruleId ) ) )
            {
            // InternalUniMapperGenerator.g:792:2: ( ( ( (lv_alias_0_0= ruleId ) ) otherlv_1= '=' ( ( ruleId ) ) ) | ( ( ruleId ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_TOKEN_REF) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==35) ) {
                    alt10=1;
                }
                else if ( (LA10_1==EOF||LA10_1==RULE_SEMICOLON||LA10_1==37) ) {
                    alt10=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA10_0==RULE_RULE_REF) ) {
                int LA10_2 = input.LA(2);

                if ( (LA10_2==EOF||LA10_2==RULE_SEMICOLON||LA10_2==37) ) {
                    alt10=2;
                }
                else if ( (LA10_2==35) ) {
                    alt10=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalUniMapperGenerator.g:793:3: ( ( (lv_alias_0_0= ruleId ) ) otherlv_1= '=' ( ( ruleId ) ) )
                    {
                    // InternalUniMapperGenerator.g:793:3: ( ( (lv_alias_0_0= ruleId ) ) otherlv_1= '=' ( ( ruleId ) ) )
                    // InternalUniMapperGenerator.g:794:4: ( (lv_alias_0_0= ruleId ) ) otherlv_1= '=' ( ( ruleId ) )
                    {
                    // InternalUniMapperGenerator.g:794:4: ( (lv_alias_0_0= ruleId ) )
                    // InternalUniMapperGenerator.g:795:5: (lv_alias_0_0= ruleId )
                    {
                    // InternalUniMapperGenerator.g:795:5: (lv_alias_0_0= ruleId )
                    // InternalUniMapperGenerator.g:796:6: lv_alias_0_0= ruleId
                    {

                    						newCompositeNode(grammarAccess.getImportAccess().getAliasIdParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_alias_0_0=ruleId();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getImportRule());
                    						}
                    						set(
                    							current,
                    							"alias",
                    							lv_alias_0_0,
                    							"net.unicoen.UniMapperGenerator.Id");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,35,FOLLOW_4); 

                    				newLeafNode(otherlv_1, grammarAccess.getImportAccess().getEqualsSignKeyword_0_1());
                    			
                    // InternalUniMapperGenerator.g:817:4: ( ( ruleId ) )
                    // InternalUniMapperGenerator.g:818:5: ( ruleId )
                    {
                    // InternalUniMapperGenerator.g:818:5: ( ruleId )
                    // InternalUniMapperGenerator.g:819:6: ruleId
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getImportRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getImportAccess().getImportURIGrammarCrossReference_0_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    ruleId();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalUniMapperGenerator.g:835:3: ( ( ruleId ) )
                    {
                    // InternalUniMapperGenerator.g:835:3: ( ( ruleId ) )
                    // InternalUniMapperGenerator.g:836:4: ( ruleId )
                    {
                    // InternalUniMapperGenerator.g:836:4: ( ruleId )
                    // InternalUniMapperGenerator.g:837:5: ruleId
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getImportRule());
                    					}
                    				

                    					newCompositeNode(grammarAccess.getImportAccess().getImportURIGrammarCrossReference_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    ruleId();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleTokens"
    // InternalUniMapperGenerator.g:855:1: entryRuleTokens returns [EObject current=null] : iv_ruleTokens= ruleTokens EOF ;
    public final EObject entryRuleTokens() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTokens = null;


        try {
            // InternalUniMapperGenerator.g:855:47: (iv_ruleTokens= ruleTokens EOF )
            // InternalUniMapperGenerator.g:856:2: iv_ruleTokens= ruleTokens EOF
            {
             newCompositeNode(grammarAccess.getTokensRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTokens=ruleTokens();

            state._fsp--;

             current =iv_ruleTokens; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTokens"


    // $ANTLR start "ruleTokens"
    // InternalUniMapperGenerator.g:862:1: ruleTokens returns [EObject current=null] : (this_V4Tokens_0= ruleV4Tokens | this_EmptyTokens_1= ruleEmptyTokens | this_V3Tokens_2= ruleV3Tokens ) ;
    public final EObject ruleTokens() throws RecognitionException {
        EObject current = null;

        EObject this_V4Tokens_0 = null;

        EObject this_EmptyTokens_1 = null;

        EObject this_V3Tokens_2 = null;



        	enterRule();

        try {
            // InternalUniMapperGenerator.g:868:2: ( (this_V4Tokens_0= ruleV4Tokens | this_EmptyTokens_1= ruleEmptyTokens | this_V3Tokens_2= ruleV3Tokens ) )
            // InternalUniMapperGenerator.g:869:2: (this_V4Tokens_0= ruleV4Tokens | this_EmptyTokens_1= ruleEmptyTokens | this_V3Tokens_2= ruleV3Tokens )
            {
            // InternalUniMapperGenerator.g:869:2: (this_V4Tokens_0= ruleV4Tokens | this_EmptyTokens_1= ruleEmptyTokens | this_V3Tokens_2= ruleV3Tokens )
            int alt11=3;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_TOKENS_SPEC) ) {
                switch ( input.LA(2) ) {
                case RULE_TOKEN_REF:
                    {
                    int LA11_2 = input.LA(3);

                    if ( (LA11_2==RULE_SEMICOLON||LA11_2==35) ) {
                        alt11=3;
                    }
                    else if ( (LA11_2==34||LA11_2==37) ) {
                        alt11=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 2, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_RULE_REF:
                    {
                    int LA11_3 = input.LA(3);

                    if ( (LA11_3==RULE_SEMICOLON||LA11_3==35) ) {
                        alt11=3;
                    }
                    else if ( (LA11_3==34||LA11_3==37) ) {
                        alt11=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 3, input);

                        throw nvae;
                    }
                    }
                    break;
                case 34:
                    {
                    alt11=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalUniMapperGenerator.g:870:3: this_V4Tokens_0= ruleV4Tokens
                    {

                    			newCompositeNode(grammarAccess.getTokensAccess().getV4TokensParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_V4Tokens_0=ruleV4Tokens();

                    state._fsp--;


                    			current = this_V4Tokens_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUniMapperGenerator.g:879:3: this_EmptyTokens_1= ruleEmptyTokens
                    {

                    			newCompositeNode(grammarAccess.getTokensAccess().getEmptyTokensParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_EmptyTokens_1=ruleEmptyTokens();

                    state._fsp--;


                    			current = this_EmptyTokens_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalUniMapperGenerator.g:888:3: this_V3Tokens_2= ruleV3Tokens
                    {

                    			newCompositeNode(grammarAccess.getTokensAccess().getV3TokensParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_V3Tokens_2=ruleV3Tokens();

                    state._fsp--;


                    			current = this_V3Tokens_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTokens"


    // $ANTLR start "entryRuleV4Tokens"
    // InternalUniMapperGenerator.g:900:1: entryRuleV4Tokens returns [EObject current=null] : iv_ruleV4Tokens= ruleV4Tokens EOF ;
    public final EObject entryRuleV4Tokens() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleV4Tokens = null;


        try {
            // InternalUniMapperGenerator.g:900:49: (iv_ruleV4Tokens= ruleV4Tokens EOF )
            // InternalUniMapperGenerator.g:901:2: iv_ruleV4Tokens= ruleV4Tokens EOF
            {
             newCompositeNode(grammarAccess.getV4TokensRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleV4Tokens=ruleV4Tokens();

            state._fsp--;

             current =iv_ruleV4Tokens; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleV4Tokens"


    // $ANTLR start "ruleV4Tokens"
    // InternalUniMapperGenerator.g:907:1: ruleV4Tokens returns [EObject current=null] : ( ( (lv_keyword_0_0= RULE_TOKENS_SPEC ) ) ( (lv_tokens_1_0= ruleV4Token ) ) (otherlv_2= ',' ( (lv_tokens_3_0= ruleV4Token ) ) )* otherlv_4= '}' ) ;
    public final EObject ruleV4Tokens() throws RecognitionException {
        EObject current = null;

        Token lv_keyword_0_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_tokens_1_0 = null;

        EObject lv_tokens_3_0 = null;



        	enterRule();

        try {
            // InternalUniMapperGenerator.g:913:2: ( ( ( (lv_keyword_0_0= RULE_TOKENS_SPEC ) ) ( (lv_tokens_1_0= ruleV4Token ) ) (otherlv_2= ',' ( (lv_tokens_3_0= ruleV4Token ) ) )* otherlv_4= '}' ) )
            // InternalUniMapperGenerator.g:914:2: ( ( (lv_keyword_0_0= RULE_TOKENS_SPEC ) ) ( (lv_tokens_1_0= ruleV4Token ) ) (otherlv_2= ',' ( (lv_tokens_3_0= ruleV4Token ) ) )* otherlv_4= '}' )
            {
            // InternalUniMapperGenerator.g:914:2: ( ( (lv_keyword_0_0= RULE_TOKENS_SPEC ) ) ( (lv_tokens_1_0= ruleV4Token ) ) (otherlv_2= ',' ( (lv_tokens_3_0= ruleV4Token ) ) )* otherlv_4= '}' )
            // InternalUniMapperGenerator.g:915:3: ( (lv_keyword_0_0= RULE_TOKENS_SPEC ) ) ( (lv_tokens_1_0= ruleV4Token ) ) (otherlv_2= ',' ( (lv_tokens_3_0= ruleV4Token ) ) )* otherlv_4= '}'
            {
            // InternalUniMapperGenerator.g:915:3: ( (lv_keyword_0_0= RULE_TOKENS_SPEC ) )
            // InternalUniMapperGenerator.g:916:4: (lv_keyword_0_0= RULE_TOKENS_SPEC )
            {
            // InternalUniMapperGenerator.g:916:4: (lv_keyword_0_0= RULE_TOKENS_SPEC )
            // InternalUniMapperGenerator.g:917:5: lv_keyword_0_0= RULE_TOKENS_SPEC
            {
            lv_keyword_0_0=(Token)match(input,RULE_TOKENS_SPEC,FOLLOW_4); 

            					newLeafNode(lv_keyword_0_0, grammarAccess.getV4TokensAccess().getKeywordTOKENS_SPECTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getV4TokensRule());
            					}
            					setWithLastConsumed(
            						current,
            						"keyword",
            						lv_keyword_0_0,
            						"net.unicoen.UniMapperGenerator.TOKENS_SPEC");
            				

            }


            }

            // InternalUniMapperGenerator.g:933:3: ( (lv_tokens_1_0= ruleV4Token ) )
            // InternalUniMapperGenerator.g:934:4: (lv_tokens_1_0= ruleV4Token )
            {
            // InternalUniMapperGenerator.g:934:4: (lv_tokens_1_0= ruleV4Token )
            // InternalUniMapperGenerator.g:935:5: lv_tokens_1_0= ruleV4Token
            {

            					newCompositeNode(grammarAccess.getV4TokensAccess().getTokensV4TokenParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_15);
            lv_tokens_1_0=ruleV4Token();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getV4TokensRule());
            					}
            					add(
            						current,
            						"tokens",
            						lv_tokens_1_0,
            						"net.unicoen.UniMapperGenerator.V4Token");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUniMapperGenerator.g:952:3: (otherlv_2= ',' ( (lv_tokens_3_0= ruleV4Token ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==37) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalUniMapperGenerator.g:953:4: otherlv_2= ',' ( (lv_tokens_3_0= ruleV4Token ) )
            	    {
            	    otherlv_2=(Token)match(input,37,FOLLOW_4); 

            	    				newLeafNode(otherlv_2, grammarAccess.getV4TokensAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalUniMapperGenerator.g:957:4: ( (lv_tokens_3_0= ruleV4Token ) )
            	    // InternalUniMapperGenerator.g:958:5: (lv_tokens_3_0= ruleV4Token )
            	    {
            	    // InternalUniMapperGenerator.g:958:5: (lv_tokens_3_0= ruleV4Token )
            	    // InternalUniMapperGenerator.g:959:6: lv_tokens_3_0= ruleV4Token
            	    {

            	    						newCompositeNode(grammarAccess.getV4TokensAccess().getTokensV4TokenParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_15);
            	    lv_tokens_3_0=ruleV4Token();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getV4TokensRule());
            	    						}
            	    						add(
            	    							current,
            	    							"tokens",
            	    							lv_tokens_3_0,
            	    							"net.unicoen.UniMapperGenerator.V4Token");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_4=(Token)match(input,34,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getV4TokensAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleV4Tokens"


    // $ANTLR start "entryRuleV4Token"
    // InternalUniMapperGenerator.g:985:1: entryRuleV4Token returns [EObject current=null] : iv_ruleV4Token= ruleV4Token EOF ;
    public final EObject entryRuleV4Token() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleV4Token = null;


        try {
            // InternalUniMapperGenerator.g:985:48: (iv_ruleV4Token= ruleV4Token EOF )
            // InternalUniMapperGenerator.g:986:2: iv_ruleV4Token= ruleV4Token EOF
            {
             newCompositeNode(grammarAccess.getV4TokenRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleV4Token=ruleV4Token();

            state._fsp--;

             current =iv_ruleV4Token; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleV4Token"


    // $ANTLR start "ruleV4Token"
    // InternalUniMapperGenerator.g:992:1: ruleV4Token returns [EObject current=null] : ( (lv_name_0_0= ruleId ) ) ;
    public final EObject ruleV4Token() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalUniMapperGenerator.g:998:2: ( ( (lv_name_0_0= ruleId ) ) )
            // InternalUniMapperGenerator.g:999:2: ( (lv_name_0_0= ruleId ) )
            {
            // InternalUniMapperGenerator.g:999:2: ( (lv_name_0_0= ruleId ) )
            // InternalUniMapperGenerator.g:1000:3: (lv_name_0_0= ruleId )
            {
            // InternalUniMapperGenerator.g:1000:3: (lv_name_0_0= ruleId )
            // InternalUniMapperGenerator.g:1001:4: lv_name_0_0= ruleId
            {

            				newCompositeNode(grammarAccess.getV4TokenAccess().getNameIdParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_name_0_0=ruleId();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getV4TokenRule());
            				}
            				set(
            					current,
            					"name",
            					lv_name_0_0,
            					"net.unicoen.UniMapperGenerator.Id");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleV4Token"


    // $ANTLR start "entryRuleEmptyTokens"
    // InternalUniMapperGenerator.g:1021:1: entryRuleEmptyTokens returns [EObject current=null] : iv_ruleEmptyTokens= ruleEmptyTokens EOF ;
    public final EObject entryRuleEmptyTokens() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmptyTokens = null;


        try {
            // InternalUniMapperGenerator.g:1021:52: (iv_ruleEmptyTokens= ruleEmptyTokens EOF )
            // InternalUniMapperGenerator.g:1022:2: iv_ruleEmptyTokens= ruleEmptyTokens EOF
            {
             newCompositeNode(grammarAccess.getEmptyTokensRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEmptyTokens=ruleEmptyTokens();

            state._fsp--;

             current =iv_ruleEmptyTokens; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEmptyTokens"


    // $ANTLR start "ruleEmptyTokens"
    // InternalUniMapperGenerator.g:1028:1: ruleEmptyTokens returns [EObject current=null] : ( () ( (lv_keyword_1_0= RULE_TOKENS_SPEC ) ) otherlv_2= '}' ) ;
    public final EObject ruleEmptyTokens() throws RecognitionException {
        EObject current = null;

        Token lv_keyword_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalUniMapperGenerator.g:1034:2: ( ( () ( (lv_keyword_1_0= RULE_TOKENS_SPEC ) ) otherlv_2= '}' ) )
            // InternalUniMapperGenerator.g:1035:2: ( () ( (lv_keyword_1_0= RULE_TOKENS_SPEC ) ) otherlv_2= '}' )
            {
            // InternalUniMapperGenerator.g:1035:2: ( () ( (lv_keyword_1_0= RULE_TOKENS_SPEC ) ) otherlv_2= '}' )
            // InternalUniMapperGenerator.g:1036:3: () ( (lv_keyword_1_0= RULE_TOKENS_SPEC ) ) otherlv_2= '}'
            {
            // InternalUniMapperGenerator.g:1036:3: ()
            // InternalUniMapperGenerator.g:1037:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEmptyTokensAccess().getEmptyTokensAction_0(),
            					current);
            			

            }

            // InternalUniMapperGenerator.g:1043:3: ( (lv_keyword_1_0= RULE_TOKENS_SPEC ) )
            // InternalUniMapperGenerator.g:1044:4: (lv_keyword_1_0= RULE_TOKENS_SPEC )
            {
            // InternalUniMapperGenerator.g:1044:4: (lv_keyword_1_0= RULE_TOKENS_SPEC )
            // InternalUniMapperGenerator.g:1045:5: lv_keyword_1_0= RULE_TOKENS_SPEC
            {
            lv_keyword_1_0=(Token)match(input,RULE_TOKENS_SPEC,FOLLOW_16); 

            					newLeafNode(lv_keyword_1_0, grammarAccess.getEmptyTokensAccess().getKeywordTOKENS_SPECTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEmptyTokensRule());
            					}
            					setWithLastConsumed(
            						current,
            						"keyword",
            						lv_keyword_1_0,
            						"net.unicoen.UniMapperGenerator.TOKENS_SPEC");
            				

            }


            }

            otherlv_2=(Token)match(input,34,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getEmptyTokensAccess().getRightCurlyBracketKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEmptyTokens"


    // $ANTLR start "entryRuleV3Tokens"
    // InternalUniMapperGenerator.g:1069:1: entryRuleV3Tokens returns [EObject current=null] : iv_ruleV3Tokens= ruleV3Tokens EOF ;
    public final EObject entryRuleV3Tokens() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleV3Tokens = null;


        try {
            // InternalUniMapperGenerator.g:1069:49: (iv_ruleV3Tokens= ruleV3Tokens EOF )
            // InternalUniMapperGenerator.g:1070:2: iv_ruleV3Tokens= ruleV3Tokens EOF
            {
             newCompositeNode(grammarAccess.getV3TokensRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleV3Tokens=ruleV3Tokens();

            state._fsp--;

             current =iv_ruleV3Tokens; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleV3Tokens"


    // $ANTLR start "ruleV3Tokens"
    // InternalUniMapperGenerator.g:1076:1: ruleV3Tokens returns [EObject current=null] : ( ( (lv_keyword_0_0= RULE_TOKENS_SPEC ) ) ( (lv_tokens_1_0= ruleV3Token ) )+ otherlv_2= '}' ) ;
    public final EObject ruleV3Tokens() throws RecognitionException {
        EObject current = null;

        Token lv_keyword_0_0=null;
        Token otherlv_2=null;
        EObject lv_tokens_1_0 = null;



        	enterRule();

        try {
            // InternalUniMapperGenerator.g:1082:2: ( ( ( (lv_keyword_0_0= RULE_TOKENS_SPEC ) ) ( (lv_tokens_1_0= ruleV3Token ) )+ otherlv_2= '}' ) )
            // InternalUniMapperGenerator.g:1083:2: ( ( (lv_keyword_0_0= RULE_TOKENS_SPEC ) ) ( (lv_tokens_1_0= ruleV3Token ) )+ otherlv_2= '}' )
            {
            // InternalUniMapperGenerator.g:1083:2: ( ( (lv_keyword_0_0= RULE_TOKENS_SPEC ) ) ( (lv_tokens_1_0= ruleV3Token ) )+ otherlv_2= '}' )
            // InternalUniMapperGenerator.g:1084:3: ( (lv_keyword_0_0= RULE_TOKENS_SPEC ) ) ( (lv_tokens_1_0= ruleV3Token ) )+ otherlv_2= '}'
            {
            // InternalUniMapperGenerator.g:1084:3: ( (lv_keyword_0_0= RULE_TOKENS_SPEC ) )
            // InternalUniMapperGenerator.g:1085:4: (lv_keyword_0_0= RULE_TOKENS_SPEC )
            {
            // InternalUniMapperGenerator.g:1085:4: (lv_keyword_0_0= RULE_TOKENS_SPEC )
            // InternalUniMapperGenerator.g:1086:5: lv_keyword_0_0= RULE_TOKENS_SPEC
            {
            lv_keyword_0_0=(Token)match(input,RULE_TOKENS_SPEC,FOLLOW_4); 

            					newLeafNode(lv_keyword_0_0, grammarAccess.getV3TokensAccess().getKeywordTOKENS_SPECTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getV3TokensRule());
            					}
            					setWithLastConsumed(
            						current,
            						"keyword",
            						lv_keyword_0_0,
            						"net.unicoen.UniMapperGenerator.TOKENS_SPEC");
            				

            }


            }

            // InternalUniMapperGenerator.g:1102:3: ( (lv_tokens_1_0= ruleV3Token ) )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_RULE_REF||LA13_0==RULE_TOKEN_REF) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalUniMapperGenerator.g:1103:4: (lv_tokens_1_0= ruleV3Token )
            	    {
            	    // InternalUniMapperGenerator.g:1103:4: (lv_tokens_1_0= ruleV3Token )
            	    // InternalUniMapperGenerator.g:1104:5: lv_tokens_1_0= ruleV3Token
            	    {

            	    					newCompositeNode(grammarAccess.getV3TokensAccess().getTokensV3TokenParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_17);
            	    lv_tokens_1_0=ruleV3Token();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getV3TokensRule());
            	    					}
            	    					add(
            	    						current,
            	    						"tokens",
            	    						lv_tokens_1_0,
            	    						"net.unicoen.UniMapperGenerator.V3Token");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);

            otherlv_2=(Token)match(input,34,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getV3TokensAccess().getRightCurlyBracketKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleV3Tokens"


    // $ANTLR start "entryRuleV3Token"
    // InternalUniMapperGenerator.g:1129:1: entryRuleV3Token returns [EObject current=null] : iv_ruleV3Token= ruleV3Token EOF ;
    public final EObject entryRuleV3Token() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleV3Token = null;


        try {
            // InternalUniMapperGenerator.g:1129:48: (iv_ruleV3Token= ruleV3Token EOF )
            // InternalUniMapperGenerator.g:1130:2: iv_ruleV3Token= ruleV3Token EOF
            {
             newCompositeNode(grammarAccess.getV3TokenRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleV3Token=ruleV3Token();

            state._fsp--;

             current =iv_ruleV3Token; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleV3Token"


    // $ANTLR start "ruleV3Token"
    // InternalUniMapperGenerator.g:1136:1: ruleV3Token returns [EObject current=null] : ( ( (lv_name_0_0= ruleId ) ) (otherlv_1= '=' ( (lv_value_2_0= RULE_MYSTRING ) ) )? this_SEMICOLON_3= RULE_SEMICOLON ) ;
    public final EObject ruleV3Token() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Token this_SEMICOLON_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalUniMapperGenerator.g:1142:2: ( ( ( (lv_name_0_0= ruleId ) ) (otherlv_1= '=' ( (lv_value_2_0= RULE_MYSTRING ) ) )? this_SEMICOLON_3= RULE_SEMICOLON ) )
            // InternalUniMapperGenerator.g:1143:2: ( ( (lv_name_0_0= ruleId ) ) (otherlv_1= '=' ( (lv_value_2_0= RULE_MYSTRING ) ) )? this_SEMICOLON_3= RULE_SEMICOLON )
            {
            // InternalUniMapperGenerator.g:1143:2: ( ( (lv_name_0_0= ruleId ) ) (otherlv_1= '=' ( (lv_value_2_0= RULE_MYSTRING ) ) )? this_SEMICOLON_3= RULE_SEMICOLON )
            // InternalUniMapperGenerator.g:1144:3: ( (lv_name_0_0= ruleId ) ) (otherlv_1= '=' ( (lv_value_2_0= RULE_MYSTRING ) ) )? this_SEMICOLON_3= RULE_SEMICOLON
            {
            // InternalUniMapperGenerator.g:1144:3: ( (lv_name_0_0= ruleId ) )
            // InternalUniMapperGenerator.g:1145:4: (lv_name_0_0= ruleId )
            {
            // InternalUniMapperGenerator.g:1145:4: (lv_name_0_0= ruleId )
            // InternalUniMapperGenerator.g:1146:5: lv_name_0_0= ruleId
            {

            					newCompositeNode(grammarAccess.getV3TokenAccess().getNameIdParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_18);
            lv_name_0_0=ruleId();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getV3TokenRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"net.unicoen.UniMapperGenerator.Id");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUniMapperGenerator.g:1163:3: (otherlv_1= '=' ( (lv_value_2_0= RULE_MYSTRING ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==35) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalUniMapperGenerator.g:1164:4: otherlv_1= '=' ( (lv_value_2_0= RULE_MYSTRING ) )
                    {
                    otherlv_1=(Token)match(input,35,FOLLOW_19); 

                    				newLeafNode(otherlv_1, grammarAccess.getV3TokenAccess().getEqualsSignKeyword_1_0());
                    			
                    // InternalUniMapperGenerator.g:1168:4: ( (lv_value_2_0= RULE_MYSTRING ) )
                    // InternalUniMapperGenerator.g:1169:5: (lv_value_2_0= RULE_MYSTRING )
                    {
                    // InternalUniMapperGenerator.g:1169:5: (lv_value_2_0= RULE_MYSTRING )
                    // InternalUniMapperGenerator.g:1170:6: lv_value_2_0= RULE_MYSTRING
                    {
                    lv_value_2_0=(Token)match(input,RULE_MYSTRING,FOLLOW_5); 

                    						newLeafNode(lv_value_2_0, grammarAccess.getV3TokenAccess().getValueMYSTRINGTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getV3TokenRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_2_0,
                    							"net.unicoen.UniMapperGenerator.MYSTRING");
                    					

                    }


                    }


                    }
                    break;

            }

            this_SEMICOLON_3=(Token)match(input,RULE_SEMICOLON,FOLLOW_2); 

            			newLeafNode(this_SEMICOLON_3, grammarAccess.getV3TokenAccess().getSEMICOLONTerminalRuleCall_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleV3Token"


    // $ANTLR start "entryRuleGrammarAction"
    // InternalUniMapperGenerator.g:1195:1: entryRuleGrammarAction returns [EObject current=null] : iv_ruleGrammarAction= ruleGrammarAction EOF ;
    public final EObject entryRuleGrammarAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGrammarAction = null;


        try {
            // InternalUniMapperGenerator.g:1195:54: (iv_ruleGrammarAction= ruleGrammarAction EOF )
            // InternalUniMapperGenerator.g:1196:2: iv_ruleGrammarAction= ruleGrammarAction EOF
            {
             newCompositeNode(grammarAccess.getGrammarActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGrammarAction=ruleGrammarAction();

            state._fsp--;

             current =iv_ruleGrammarAction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGrammarAction"


    // $ANTLR start "ruleGrammarAction"
    // InternalUniMapperGenerator.g:1202:1: ruleGrammarAction returns [EObject current=null] : (otherlv_0= '@' ( ( (lv_scope_1_0= ruleActionScope ) ) ( (lv_colonSymbol_2_0= '::' ) ) )? ( (lv_name_3_0= ruleId ) ) ( (lv_action_4_0= RULE_ACTION ) ) ) ;
    public final EObject ruleGrammarAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_colonSymbol_2_0=null;
        Token lv_action_4_0=null;
        AntlrDatatypeRuleToken lv_scope_1_0 = null;

        AntlrDatatypeRuleToken lv_name_3_0 = null;



        	enterRule();

        try {
            // InternalUniMapperGenerator.g:1208:2: ( (otherlv_0= '@' ( ( (lv_scope_1_0= ruleActionScope ) ) ( (lv_colonSymbol_2_0= '::' ) ) )? ( (lv_name_3_0= ruleId ) ) ( (lv_action_4_0= RULE_ACTION ) ) ) )
            // InternalUniMapperGenerator.g:1209:2: (otherlv_0= '@' ( ( (lv_scope_1_0= ruleActionScope ) ) ( (lv_colonSymbol_2_0= '::' ) ) )? ( (lv_name_3_0= ruleId ) ) ( (lv_action_4_0= RULE_ACTION ) ) )
            {
            // InternalUniMapperGenerator.g:1209:2: (otherlv_0= '@' ( ( (lv_scope_1_0= ruleActionScope ) ) ( (lv_colonSymbol_2_0= '::' ) ) )? ( (lv_name_3_0= ruleId ) ) ( (lv_action_4_0= RULE_ACTION ) ) )
            // InternalUniMapperGenerator.g:1210:3: otherlv_0= '@' ( ( (lv_scope_1_0= ruleActionScope ) ) ( (lv_colonSymbol_2_0= '::' ) ) )? ( (lv_name_3_0= ruleId ) ) ( (lv_action_4_0= RULE_ACTION ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getGrammarActionAccess().getCommercialAtKeyword_0());
            		
            // InternalUniMapperGenerator.g:1214:3: ( ( (lv_scope_1_0= ruleActionScope ) ) ( (lv_colonSymbol_2_0= '::' ) ) )?
            int alt15=2;
            switch ( input.LA(1) ) {
                case 40:
                case 41:
                case 42:
                    {
                    alt15=1;
                    }
                    break;
                case RULE_TOKEN_REF:
                    {
                    int LA15_2 = input.LA(2);

                    if ( (LA15_2==39) ) {
                        alt15=1;
                    }
                    }
                    break;
                case RULE_RULE_REF:
                    {
                    int LA15_3 = input.LA(2);

                    if ( (LA15_3==39) ) {
                        alt15=1;
                    }
                    }
                    break;
            }

            switch (alt15) {
                case 1 :
                    // InternalUniMapperGenerator.g:1215:4: ( (lv_scope_1_0= ruleActionScope ) ) ( (lv_colonSymbol_2_0= '::' ) )
                    {
                    // InternalUniMapperGenerator.g:1215:4: ( (lv_scope_1_0= ruleActionScope ) )
                    // InternalUniMapperGenerator.g:1216:5: (lv_scope_1_0= ruleActionScope )
                    {
                    // InternalUniMapperGenerator.g:1216:5: (lv_scope_1_0= ruleActionScope )
                    // InternalUniMapperGenerator.g:1217:6: lv_scope_1_0= ruleActionScope
                    {

                    						newCompositeNode(grammarAccess.getGrammarActionAccess().getScopeActionScopeParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_scope_1_0=ruleActionScope();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGrammarActionRule());
                    						}
                    						set(
                    							current,
                    							"scope",
                    							lv_scope_1_0,
                    							"net.unicoen.UniMapperGenerator.ActionScope");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalUniMapperGenerator.g:1234:4: ( (lv_colonSymbol_2_0= '::' ) )
                    // InternalUniMapperGenerator.g:1235:5: (lv_colonSymbol_2_0= '::' )
                    {
                    // InternalUniMapperGenerator.g:1235:5: (lv_colonSymbol_2_0= '::' )
                    // InternalUniMapperGenerator.g:1236:6: lv_colonSymbol_2_0= '::'
                    {
                    lv_colonSymbol_2_0=(Token)match(input,39,FOLLOW_4); 

                    						newLeafNode(lv_colonSymbol_2_0, grammarAccess.getGrammarActionAccess().getColonSymbolColonColonKeyword_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getGrammarActionRule());
                    						}
                    						setWithLastConsumed(current, "colonSymbol", lv_colonSymbol_2_0, "::");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalUniMapperGenerator.g:1249:3: ( (lv_name_3_0= ruleId ) )
            // InternalUniMapperGenerator.g:1250:4: (lv_name_3_0= ruleId )
            {
            // InternalUniMapperGenerator.g:1250:4: (lv_name_3_0= ruleId )
            // InternalUniMapperGenerator.g:1251:5: lv_name_3_0= ruleId
            {

            					newCompositeNode(grammarAccess.getGrammarActionAccess().getNameIdParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_22);
            lv_name_3_0=ruleId();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGrammarActionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"net.unicoen.UniMapperGenerator.Id");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUniMapperGenerator.g:1268:3: ( (lv_action_4_0= RULE_ACTION ) )
            // InternalUniMapperGenerator.g:1269:4: (lv_action_4_0= RULE_ACTION )
            {
            // InternalUniMapperGenerator.g:1269:4: (lv_action_4_0= RULE_ACTION )
            // InternalUniMapperGenerator.g:1270:5: lv_action_4_0= RULE_ACTION
            {
            lv_action_4_0=(Token)match(input,RULE_ACTION,FOLLOW_2); 

            					newLeafNode(lv_action_4_0, grammarAccess.getGrammarActionAccess().getActionACTIONTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGrammarActionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"action",
            						lv_action_4_0,
            						"net.unicoen.UniMapperGenerator.ACTION");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGrammarAction"


    // $ANTLR start "entryRuleActionScope"
    // InternalUniMapperGenerator.g:1290:1: entryRuleActionScope returns [String current=null] : iv_ruleActionScope= ruleActionScope EOF ;
    public final String entryRuleActionScope() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleActionScope = null;


        try {
            // InternalUniMapperGenerator.g:1290:51: (iv_ruleActionScope= ruleActionScope EOF )
            // InternalUniMapperGenerator.g:1291:2: iv_ruleActionScope= ruleActionScope EOF
            {
             newCompositeNode(grammarAccess.getActionScopeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActionScope=ruleActionScope();

            state._fsp--;

             current =iv_ruleActionScope.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActionScope"


    // $ANTLR start "ruleActionScope"
    // InternalUniMapperGenerator.g:1297:1: ruleActionScope returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'parser' | kw= 'lexer' | kw= 'tree' | this_Id_3= ruleId ) ;
    public final AntlrDatatypeRuleToken ruleActionScope() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Id_3 = null;



        	enterRule();

        try {
            // InternalUniMapperGenerator.g:1303:2: ( (kw= 'parser' | kw= 'lexer' | kw= 'tree' | this_Id_3= ruleId ) )
            // InternalUniMapperGenerator.g:1304:2: (kw= 'parser' | kw= 'lexer' | kw= 'tree' | this_Id_3= ruleId )
            {
            // InternalUniMapperGenerator.g:1304:2: (kw= 'parser' | kw= 'lexer' | kw= 'tree' | this_Id_3= ruleId )
            int alt16=4;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt16=1;
                }
                break;
            case 41:
                {
                alt16=2;
                }
                break;
            case 42:
                {
                alt16=3;
                }
                break;
            case RULE_RULE_REF:
            case RULE_TOKEN_REF:
                {
                alt16=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalUniMapperGenerator.g:1305:3: kw= 'parser'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getActionScopeAccess().getParserKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalUniMapperGenerator.g:1311:3: kw= 'lexer'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getActionScopeAccess().getLexerKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalUniMapperGenerator.g:1317:3: kw= 'tree'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getActionScopeAccess().getTreeKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalUniMapperGenerator.g:1323:3: this_Id_3= ruleId
                    {

                    			newCompositeNode(grammarAccess.getActionScopeAccess().getIdParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Id_3=ruleId();

                    state._fsp--;


                    			current.merge(this_Id_3);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActionScope"


    // $ANTLR start "entryRuleMode"
    // InternalUniMapperGenerator.g:1337:1: entryRuleMode returns [EObject current=null] : iv_ruleMode= ruleMode EOF ;
    public final EObject entryRuleMode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMode = null;


        try {
            // InternalUniMapperGenerator.g:1337:45: (iv_ruleMode= ruleMode EOF )
            // InternalUniMapperGenerator.g:1338:2: iv_ruleMode= ruleMode EOF
            {
             newCompositeNode(grammarAccess.getModeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMode=ruleMode();

            state._fsp--;

             current =iv_ruleMode; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMode"


    // $ANTLR start "ruleMode"
    // InternalUniMapperGenerator.g:1344:1: ruleMode returns [EObject current=null] : (otherlv_0= 'mode' ( (lv_id_1_0= ruleId ) ) this_SEMICOLON_2= RULE_SEMICOLON ( (lv_rules_3_0= ruleLexerRule ) )* ) ;
    public final EObject ruleMode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_SEMICOLON_2=null;
        AntlrDatatypeRuleToken lv_id_1_0 = null;

        EObject lv_rules_3_0 = null;



        	enterRule();

        try {
            // InternalUniMapperGenerator.g:1350:2: ( (otherlv_0= 'mode' ( (lv_id_1_0= ruleId ) ) this_SEMICOLON_2= RULE_SEMICOLON ( (lv_rules_3_0= ruleLexerRule ) )* ) )
            // InternalUniMapperGenerator.g:1351:2: (otherlv_0= 'mode' ( (lv_id_1_0= ruleId ) ) this_SEMICOLON_2= RULE_SEMICOLON ( (lv_rules_3_0= ruleLexerRule ) )* )
            {
            // InternalUniMapperGenerator.g:1351:2: (otherlv_0= 'mode' ( (lv_id_1_0= ruleId ) ) this_SEMICOLON_2= RULE_SEMICOLON ( (lv_rules_3_0= ruleLexerRule ) )* )
            // InternalUniMapperGenerator.g:1352:3: otherlv_0= 'mode' ( (lv_id_1_0= ruleId ) ) this_SEMICOLON_2= RULE_SEMICOLON ( (lv_rules_3_0= ruleLexerRule ) )*
            {
            otherlv_0=(Token)match(input,43,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getModeAccess().getModeKeyword_0());
            		
            // InternalUniMapperGenerator.g:1356:3: ( (lv_id_1_0= ruleId ) )
            // InternalUniMapperGenerator.g:1357:4: (lv_id_1_0= ruleId )
            {
            // InternalUniMapperGenerator.g:1357:4: (lv_id_1_0= ruleId )
            // InternalUniMapperGenerator.g:1358:5: lv_id_1_0= ruleId
            {

            					newCompositeNode(grammarAccess.getModeAccess().getIdIdParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_id_1_0=ruleId();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModeRule());
            					}
            					set(
            						current,
            						"id",
            						lv_id_1_0,
            						"net.unicoen.UniMapperGenerator.Id");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_SEMICOLON_2=(Token)match(input,RULE_SEMICOLON,FOLLOW_23); 

            			newLeafNode(this_SEMICOLON_2, grammarAccess.getModeAccess().getSEMICOLONTerminalRuleCall_2());
            		
            // InternalUniMapperGenerator.g:1379:3: ( (lv_rules_3_0= ruleLexerRule ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_TOKEN_REF||LA17_0==64) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalUniMapperGenerator.g:1380:4: (lv_rules_3_0= ruleLexerRule )
            	    {
            	    // InternalUniMapperGenerator.g:1380:4: (lv_rules_3_0= ruleLexerRule )
            	    // InternalUniMapperGenerator.g:1381:5: lv_rules_3_0= ruleLexerRule
            	    {

            	    					newCompositeNode(grammarAccess.getModeAccess().getRulesLexerRuleParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_23);
            	    lv_rules_3_0=ruleLexerRule();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"rules",
            	    						lv_rules_3_0,
            	    						"net.unicoen.UniMapperGenerator.LexerRule");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMode"


    // $ANTLR start "entryRuleRule"
    // InternalUniMapperGenerator.g:1402:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalUniMapperGenerator.g:1402:45: (iv_ruleRule= ruleRule EOF )
            // InternalUniMapperGenerator.g:1403:2: iv_ruleRule= ruleRule EOF
            {
             newCompositeNode(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRule=ruleRule();

            state._fsp--;

             current =iv_ruleRule; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalUniMapperGenerator.g:1409:1: ruleRule returns [EObject current=null] : (this_ParserRule_0= ruleParserRule | this_LexerRule_1= ruleLexerRule ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        EObject this_ParserRule_0 = null;

        EObject this_LexerRule_1 = null;



        	enterRule();

        try {
            // InternalUniMapperGenerator.g:1415:2: ( (this_ParserRule_0= ruleParserRule | this_LexerRule_1= ruleLexerRule ) )
            // InternalUniMapperGenerator.g:1416:2: (this_ParserRule_0= ruleParserRule | this_LexerRule_1= ruleLexerRule )
            {
            // InternalUniMapperGenerator.g:1416:2: (this_ParserRule_0= ruleParserRule | this_LexerRule_1= ruleLexerRule )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_RULE_REF) ) {
                alt18=1;
            }
            else if ( (LA18_0==RULE_TOKEN_REF||LA18_0==64) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalUniMapperGenerator.g:1417:3: this_ParserRule_0= ruleParserRule
                    {

                    			newCompositeNode(grammarAccess.getRuleAccess().getParserRuleParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParserRule_0=ruleParserRule();

                    state._fsp--;


                    			current = this_ParserRule_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUniMapperGenerator.g:1426:3: this_LexerRule_1= ruleLexerRule
                    {

                    			newCompositeNode(grammarAccess.getRuleAccess().getLexerRuleParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_LexerRule_1=ruleLexerRule();

                    state._fsp--;


                    			current = this_LexerRule_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleParserRule"
    // InternalUniMapperGenerator.g:1438:1: entryRuleParserRule returns [EObject current=null] : iv_ruleParserRule= ruleParserRule EOF ;
    public final EObject entryRuleParserRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParserRule = null;


        try {
            // InternalUniMapperGenerator.g:1438:51: (iv_ruleParserRule= ruleParserRule EOF )
            // InternalUniMapperGenerator.g:1439:2: iv_ruleParserRule= ruleParserRule EOF
            {
             newCompositeNode(grammarAccess.getParserRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParserRule=ruleParserRule();

            state._fsp--;

             current =iv_ruleParserRule; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParserRule"


    // $ANTLR start "ruleParserRule"
    // InternalUniMapperGenerator.g:1445:1: ruleParserRule returns [EObject current=null] : ( ( (lv_name_0_0= RULE_RULE_REF ) ) ( (lv_args_1_0= RULE_ARG_OR_CHARSET ) )? ( (lv_return_2_0= ruleReturn ) )? ( (lv_throws_3_0= ruleExceptions ) )? ( (lv_locals_4_0= ruleLocalVars ) )? ( (lv_prequels_5_0= ruleRulePrequel ) )* ( (lv_type_6_0= ruleUnicoenTypeDec ) )? this_COLON_7= RULE_COLON ( (lv_body_8_0= ruleRuleAltList ) ) ( (lv_caught_9_0= ruleExceptionGroup ) ) ( (lv_semicolonSymbol_10_0= RULE_SEMICOLON ) ) ) ;
    public final EObject ruleParserRule() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_args_1_0=null;
        Token this_COLON_7=null;
        Token lv_semicolonSymbol_10_0=null;
        EObject lv_return_2_0 = null;

        EObject lv_throws_3_0 = null;

        EObject lv_locals_4_0 = null;

        EObject lv_prequels_5_0 = null;

        EObject lv_type_6_0 = null;

        EObject lv_body_8_0 = null;

        EObject lv_caught_9_0 = null;



        	enterRule();

        try {
            // InternalUniMapperGenerator.g:1451:2: ( ( ( (lv_name_0_0= RULE_RULE_REF ) ) ( (lv_args_1_0= RULE_ARG_OR_CHARSET ) )? ( (lv_return_2_0= ruleReturn ) )? ( (lv_throws_3_0= ruleExceptions ) )? ( (lv_locals_4_0= ruleLocalVars ) )? ( (lv_prequels_5_0= ruleRulePrequel ) )* ( (lv_type_6_0= ruleUnicoenTypeDec ) )? this_COLON_7= RULE_COLON ( (lv_body_8_0= ruleRuleAltList ) ) ( (lv_caught_9_0= ruleExceptionGroup ) ) ( (lv_semicolonSymbol_10_0= RULE_SEMICOLON ) ) ) )
            // InternalUniMapperGenerator.g:1452:2: ( ( (lv_name_0_0= RULE_RULE_REF ) ) ( (lv_args_1_0= RULE_ARG_OR_CHARSET ) )? ( (lv_return_2_0= ruleReturn ) )? ( (lv_throws_3_0= ruleExceptions ) )? ( (lv_locals_4_0= ruleLocalVars ) )? ( (lv_prequels_5_0= ruleRulePrequel ) )* ( (lv_type_6_0= ruleUnicoenTypeDec ) )? this_COLON_7= RULE_COLON ( (lv_body_8_0= ruleRuleAltList ) ) ( (lv_caught_9_0= ruleExceptionGroup ) ) ( (lv_semicolonSymbol_10_0= RULE_SEMICOLON ) ) )
            {
            // InternalUniMapperGenerator.g:1452:2: ( ( (lv_name_0_0= RULE_RULE_REF ) ) ( (lv_args_1_0= RULE_ARG_OR_CHARSET ) )? ( (lv_return_2_0= ruleReturn ) )? ( (lv_throws_3_0= ruleExceptions ) )? ( (lv_locals_4_0= ruleLocalVars ) )? ( (lv_prequels_5_0= ruleRulePrequel ) )* ( (lv_type_6_0= ruleUnicoenTypeDec ) )? this_COLON_7= RULE_COLON ( (lv_body_8_0= ruleRuleAltList ) ) ( (lv_caught_9_0= ruleExceptionGroup ) ) ( (lv_semicolonSymbol_10_0= RULE_SEMICOLON ) ) )
            // InternalUniMapperGenerator.g:1453:3: ( (lv_name_0_0= RULE_RULE_REF ) ) ( (lv_args_1_0= RULE_ARG_OR_CHARSET ) )? ( (lv_return_2_0= ruleReturn ) )? ( (lv_throws_3_0= ruleExceptions ) )? ( (lv_locals_4_0= ruleLocalVars ) )? ( (lv_prequels_5_0= ruleRulePrequel ) )* ( (lv_type_6_0= ruleUnicoenTypeDec ) )? this_COLON_7= RULE_COLON ( (lv_body_8_0= ruleRuleAltList ) ) ( (lv_caught_9_0= ruleExceptionGroup ) ) ( (lv_semicolonSymbol_10_0= RULE_SEMICOLON ) )
            {
            // InternalUniMapperGenerator.g:1453:3: ( (lv_name_0_0= RULE_RULE_REF ) )
            // InternalUniMapperGenerator.g:1454:4: (lv_name_0_0= RULE_RULE_REF )
            {
            // InternalUniMapperGenerator.g:1454:4: (lv_name_0_0= RULE_RULE_REF )
            // InternalUniMapperGenerator.g:1455:5: lv_name_0_0= RULE_RULE_REF
            {
            lv_name_0_0=(Token)match(input,RULE_RULE_REF,FOLLOW_24); 

            					newLeafNode(lv_name_0_0, grammarAccess.getParserRuleAccess().getNameRULE_REFTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParserRuleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"net.unicoen.UniMapperGenerator.RULE_REF");
            				

            }


            }

            // InternalUniMapperGenerator.g:1471:3: ( (lv_args_1_0= RULE_ARG_OR_CHARSET ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ARG_OR_CHARSET) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalUniMapperGenerator.g:1472:4: (lv_args_1_0= RULE_ARG_OR_CHARSET )
                    {
                    // InternalUniMapperGenerator.g:1472:4: (lv_args_1_0= RULE_ARG_OR_CHARSET )
                    // InternalUniMapperGenerator.g:1473:5: lv_args_1_0= RULE_ARG_OR_CHARSET
                    {
                    lv_args_1_0=(Token)match(input,RULE_ARG_OR_CHARSET,FOLLOW_25); 

                    					newLeafNode(lv_args_1_0, grammarAccess.getParserRuleAccess().getArgsARG_OR_CHARSETTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getParserRuleRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"args",
                    						lv_args_1_0,
                    						"net.unicoen.UniMapperGenerator.ARG_OR_CHARSET");
                    				

                    }


                    }
                    break;

            }

            // InternalUniMapperGenerator.g:1489:3: ( (lv_return_2_0= ruleReturn ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==46) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalUniMapperGenerator.g:1490:4: (lv_return_2_0= ruleReturn )
                    {
                    // InternalUniMapperGenerator.g:1490:4: (lv_return_2_0= ruleReturn )
                    // InternalUniMapperGenerator.g:1491:5: lv_return_2_0= ruleReturn
                    {

                    					newCompositeNode(grammarAccess.getParserRuleAccess().getReturnReturnParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_26);
                    lv_return_2_0=ruleReturn();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getParserRuleRule());
                    					}
                    					set(
                    						current,
                    						"return",
                    						lv_return_2_0,
                    						"net.unicoen.UniMapperGenerator.Return");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalUniMapperGenerator.g:1508:3: ( (lv_throws_3_0= ruleExceptions ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==47) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalUniMapperGenerator.g:1509:4: (lv_throws_3_0= ruleExceptions )
                    {
                    // InternalUniMapperGenerator.g:1509:4: (lv_throws_3_0= ruleExceptions )
                    // InternalUniMapperGenerator.g:1510:5: lv_throws_3_0= ruleExceptions
                    {

                    					newCompositeNode(grammarAccess.getParserRuleAccess().getThrowsExceptionsParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_27);
                    lv_throws_3_0=ruleExceptions();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getParserRuleRule());
                    					}
                    					set(
                    						current,
                    						"throws",
                    						lv_throws_3_0,
                    						"net.unicoen.UniMapperGenerator.Exceptions");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalUniMapperGenerator.g:1527:3: ( (lv_locals_4_0= ruleLocalVars ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==48) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalUniMapperGenerator.g:1528:4: (lv_locals_4_0= ruleLocalVars )
                    {
                    // InternalUniMapperGenerator.g:1528:4: (lv_locals_4_0= ruleLocalVars )
                    // InternalUniMapperGenerator.g:1529:5: lv_locals_4_0= ruleLocalVars
                    {

                    					newCompositeNode(grammarAccess.getParserRuleAccess().getLocalsLocalVarsParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_28);
                    lv_locals_4_0=ruleLocalVars();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getParserRuleRule());
                    					}
                    					set(
                    						current,
                    						"locals",
                    						lv_locals_4_0,
                    						"net.unicoen.UniMapperGenerator.LocalVars");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalUniMapperGenerator.g:1546:3: ( (lv_prequels_5_0= ruleRulePrequel ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_OPTIONS_SPEC||LA23_0==38) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalUniMapperGenerator.g:1547:4: (lv_prequels_5_0= ruleRulePrequel )
            	    {
            	    // InternalUniMapperGenerator.g:1547:4: (lv_prequels_5_0= ruleRulePrequel )
            	    // InternalUniMapperGenerator.g:1548:5: lv_prequels_5_0= ruleRulePrequel
            	    {

            	    					newCompositeNode(grammarAccess.getParserRuleAccess().getPrequelsRulePrequelParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_28);
            	    lv_prequels_5_0=ruleRulePrequel();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getParserRuleRule());
            	    					}
            	    					add(
            	    						current,
            	    						"prequels",
            	    						lv_prequels_5_0,
            	    						"net.unicoen.UniMapperGenerator.RulePrequel");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            // InternalUniMapperGenerator.g:1565:3: ( (lv_type_6_0= ruleUnicoenTypeDec ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==63) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalUniMapperGenerator.g:1566:4: (lv_type_6_0= ruleUnicoenTypeDec )
                    {
                    // InternalUniMapperGenerator.g:1566:4: (lv_type_6_0= ruleUnicoenTypeDec )
                    // InternalUniMapperGenerator.g:1567:5: lv_type_6_0= ruleUnicoenTypeDec
                    {

                    					newCompositeNode(grammarAccess.getParserRuleAccess().getTypeUnicoenTypeDecParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_29);
                    lv_type_6_0=ruleUnicoenTypeDec();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getParserRuleRule());
                    					}
                    					set(
                    						current,
                    						"type",
                    						lv_type_6_0,
                    						"net.unicoen.UniMapperGenerator.UnicoenTypeDec");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            this_COLON_7=(Token)match(input,RULE_COLON,FOLLOW_30); 

            			newLeafNode(this_COLON_7, grammarAccess.getParserRuleAccess().getCOLONTerminalRuleCall_7());
            		
            // InternalUniMapperGenerator.g:1588:3: ( (lv_body_8_0= ruleRuleAltList ) )
            // InternalUniMapperGenerator.g:1589:4: (lv_body_8_0= ruleRuleAltList )
            {
            // InternalUniMapperGenerator.g:1589:4: (lv_body_8_0= ruleRuleAltList )
            // InternalUniMapperGenerator.g:1590:5: lv_body_8_0= ruleRuleAltList
            {

            					newCompositeNode(grammarAccess.getParserRuleAccess().getBodyRuleAltListParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_31);
            lv_body_8_0=ruleRuleAltList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParserRuleRule());
            					}
            					set(
            						current,
            						"body",
            						lv_body_8_0,
            						"net.unicoen.UniMapperGenerator.RuleAltList");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUniMapperGenerator.g:1607:3: ( (lv_caught_9_0= ruleExceptionGroup ) )
            // InternalUniMapperGenerator.g:1608:4: (lv_caught_9_0= ruleExceptionGroup )
            {
            // InternalUniMapperGenerator.g:1608:4: (lv_caught_9_0= ruleExceptionGroup )
            // InternalUniMapperGenerator.g:1609:5: lv_caught_9_0= ruleExceptionGroup
            {

            					newCompositeNode(grammarAccess.getParserRuleAccess().getCaughtExceptionGroupParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_5);
            lv_caught_9_0=ruleExceptionGroup();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParserRuleRule());
            					}
            					set(
            						current,
            						"caught",
            						lv_caught_9_0,
            						"net.unicoen.UniMapperGenerator.ExceptionGroup");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUniMapperGenerator.g:1626:3: ( (lv_semicolonSymbol_10_0= RULE_SEMICOLON ) )
            // InternalUniMapperGenerator.g:1627:4: (lv_semicolonSymbol_10_0= RULE_SEMICOLON )
            {
            // InternalUniMapperGenerator.g:1627:4: (lv_semicolonSymbol_10_0= RULE_SEMICOLON )
            // InternalUniMapperGenerator.g:1628:5: lv_semicolonSymbol_10_0= RULE_SEMICOLON
            {
            lv_semicolonSymbol_10_0=(Token)match(input,RULE_SEMICOLON,FOLLOW_2); 

            					newLeafNode(lv_semicolonSymbol_10_0, grammarAccess.getParserRuleAccess().getSemicolonSymbolSEMICOLONTerminalRuleCall_10_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParserRuleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"semicolonSymbol",
            						lv_semicolonSymbol_10_0,
            						"net.unicoen.UniMapperGenerator.SEMICOLON");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParserRule"


    // $ANTLR start "entryRuleExceptionGroup"
    // InternalUniMapperGenerator.g:1648:1: entryRuleExceptionGroup returns [EObject current=null] : iv_ruleExceptionGroup= ruleExceptionGroup EOF ;
    public final EObject entryRuleExceptionGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExceptionGroup = null;


        try {
            // InternalUniMapperGenerator.g:1648:55: (iv_ruleExceptionGroup= ruleExceptionGroup EOF )
            // InternalUniMapperGenerator.g:1649:2: iv_ruleExceptionGroup= ruleExceptionGroup EOF
            {
             newCompositeNode(grammarAccess.getExceptionGroupRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExceptionGroup=ruleExceptionGroup();

            state._fsp--;

             current =iv_ruleExceptionGroup; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExceptionGroup"


    // $ANTLR start "ruleExceptionGroup"
    // InternalUniMapperGenerator.g:1655:1: ruleExceptionGroup returns [EObject current=null] : ( () ( (lv_handlers_1_0= ruleExceptionHandler ) )* ( (lv_finally_2_0= ruleFinallyClause ) )? ) ;
    public final EObject ruleExceptionGroup() throws RecognitionException {
        EObject current = null;

        EObject lv_handlers_1_0 = null;

        EObject lv_finally_2_0 = null;



        	enterRule();

        try {
            // InternalUniMapperGenerator.g:1661:2: ( ( () ( (lv_handlers_1_0= ruleExceptionHandler ) )* ( (lv_finally_2_0= ruleFinallyClause ) )? ) )
            // InternalUniMapperGenerator.g:1662:2: ( () ( (lv_handlers_1_0= ruleExceptionHandler ) )* ( (lv_finally_2_0= ruleFinallyClause ) )? )
            {
            // InternalUniMapperGenerator.g:1662:2: ( () ( (lv_handlers_1_0= ruleExceptionHandler ) )* ( (lv_finally_2_0= ruleFinallyClause ) )? )
            // InternalUniMapperGenerator.g:1663:3: () ( (lv_handlers_1_0= ruleExceptionHandler ) )* ( (lv_finally_2_0= ruleFinallyClause ) )?
            {
            // InternalUniMapperGenerator.g:1663:3: ()
            // InternalUniMapperGenerator.g:1664:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExceptionGroupAccess().getExceptionGroupAction_0(),
            					current);
            			

            }

            // InternalUniMapperGenerator.g:1670:3: ( (lv_handlers_1_0= ruleExceptionHandler ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==44) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalUniMapperGenerator.g:1671:4: (lv_handlers_1_0= ruleExceptionHandler )
            	    {
            	    // InternalUniMapperGenerator.g:1671:4: (lv_handlers_1_0= ruleExceptionHandler )
            	    // InternalUniMapperGenerator.g:1672:5: lv_handlers_1_0= ruleExceptionHandler
            	    {

            	    					newCompositeNode(grammarAccess.getExceptionGroupAccess().getHandlersExceptionHandlerParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_32);
            	    lv_handlers_1_0=ruleExceptionHandler();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getExceptionGroupRule());
            	    					}
            	    					add(
            	    						current,
            	    						"handlers",
            	    						lv_handlers_1_0,
            	    						"net.unicoen.UniMapperGenerator.ExceptionHandler");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            // InternalUniMapperGenerator.g:1689:3: ( (lv_finally_2_0= ruleFinallyClause ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==45) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalUniMapperGenerator.g:1690:4: (lv_finally_2_0= ruleFinallyClause )
                    {
                    // InternalUniMapperGenerator.g:1690:4: (lv_finally_2_0= ruleFinallyClause )
                    // InternalUniMapperGenerator.g:1691:5: lv_finally_2_0= ruleFinallyClause
                    {

                    					newCompositeNode(grammarAccess.getExceptionGroupAccess().getFinallyFinallyClauseParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_finally_2_0=ruleFinallyClause();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getExceptionGroupRule());
                    					}
                    					set(
                    						current,
                    						"finally",
                    						lv_finally_2_0,
                    						"net.unicoen.UniMapperGenerator.FinallyClause");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExceptionGroup"


    // $ANTLR start "entryRuleExceptionHandler"
    // InternalUniMapperGenerator.g:1712:1: entryRuleExceptionHandler returns [EObject current=null] : iv_ruleExceptionHandler= ruleExceptionHandler EOF ;
    public final EObject entryRuleExceptionHandler() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExceptionHandler = null;


        try {
            // InternalUniMapperGenerator.g:1712:57: (iv_ruleExceptionHandler= ruleExceptionHandler EOF )
            // InternalUniMapperGenerator.g:1713:2: iv_ruleExceptionHandler= ruleExceptionHandler EOF
            {
             newCompositeNode(grammarAccess.getExceptionHandlerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExceptionHandler=ruleExceptionHandler();

            state._fsp--;

             current =iv_ruleExceptionHandler; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExceptionHandler"


    // $ANTLR start "ruleExceptionHandler"
    // InternalUniMapperGenerator.g:1719:1: ruleExceptionHandler returns [EObject current=null] : (otherlv_0= 'catch' ( (lv_exception_1_0= RULE_ARG_OR_CHARSET ) ) ( (lv_body_2_0= RULE_ACTION ) ) ) ;
    public final EObject ruleExceptionHandler() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_exception_1_0=null;
        Token lv_body_2_0=null;


        	enterRule();

        try {
            // InternalUniMapperGenerator.g:1725:2: ( (otherlv_0= 'catch' ( (lv_exception_1_0= RULE_ARG_OR_CHARSET ) ) ( (lv_body_2_0= RULE_ACTION ) ) ) )
            // InternalUniMapperGenerator.g:1726:2: (otherlv_0= 'catch' ( (lv_exception_1_0= RULE_ARG_OR_CHARSET ) ) ( (lv_body_2_0= RULE_ACTION ) ) )
            {
            // InternalUniMapperGenerator.g:1726:2: (otherlv_0= 'catch' ( (lv_exception_1_0= RULE_ARG_OR_CHARSET ) ) ( (lv_body_2_0= RULE_ACTION ) ) )
            // InternalUniMapperGenerator.g:1727:3: otherlv_0= 'catch' ( (lv_exception_1_0= RULE_ARG_OR_CHARSET ) ) ( (lv_body_2_0= RULE_ACTION ) )
            {
            otherlv_0=(Token)match(input,44,FOLLOW_33); 

            			newLeafNode(otherlv_0, grammarAccess.getExceptionHandlerAccess().getCatchKeyword_0());
            		
            // InternalUniMapperGenerator.g:1731:3: ( (lv_exception_1_0= RULE_ARG_OR_CHARSET ) )
            // InternalUniMapperGenerator.g:1732:4: (lv_exception_1_0= RULE_ARG_OR_CHARSET )
            {
            // InternalUniMapperGenerator.g:1732:4: (lv_exception_1_0= RULE_ARG_OR_CHARSET )
            // InternalUniMapperGenerator.g:1733:5: lv_exception_1_0= RULE_ARG_OR_CHARSET
            {
            lv_exception_1_0=(Token)match(input,RULE_ARG_OR_CHARSET,FOLLOW_22); 

            					newLeafNode(lv_exception_1_0, grammarAccess.getExceptionHandlerAccess().getExceptionARG_OR_CHARSETTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExceptionHandlerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"exception",
            						lv_exception_1_0,
            						"net.unicoen.UniMapperGenerator.ARG_OR_CHARSET");
            				

            }


            }

            // InternalUniMapperGenerator.g:1749:3: ( (lv_body_2_0= RULE_ACTION ) )
            // InternalUniMapperGenerator.g:1750:4: (lv_body_2_0= RULE_ACTION )
            {
            // InternalUniMapperGenerator.g:1750:4: (lv_body_2_0= RULE_ACTION )
            // InternalUniMapperGenerator.g:1751:5: lv_body_2_0= RULE_ACTION
            {
            lv_body_2_0=(Token)match(input,RULE_ACTION,FOLLOW_2); 

            					newLeafNode(lv_body_2_0, grammarAccess.getExceptionHandlerAccess().getBodyACTIONTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExceptionHandlerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"body",
            						lv_body_2_0,
            						"net.unicoen.UniMapperGenerator.ACTION");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExceptionHandler"


    // $ANTLR start "entryRuleFinallyClause"
    // InternalUniMapperGenerator.g:1771:1: entryRuleFinallyClause returns [EObject current=null] : iv_ruleFinallyClause= ruleFinallyClause EOF ;
    public final EObject entryRuleFinallyClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFinallyClause = null;


        try {
            // InternalUniMapperGenerator.g:1771:54: (iv_ruleFinallyClause= ruleFinallyClause EOF )
            // InternalUniMapperGenerator.g:1772:2: iv_ruleFinallyClause= ruleFinallyClause EOF
            {
             newCompositeNode(grammarAccess.getFinallyClauseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFinallyClause=ruleFinallyClause();

            state._fsp--;

             current =iv_ruleFinallyClause; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFinallyClause"


    // $ANTLR start "ruleFinallyClause"
    // InternalUniMapperGenerator.g:1778:1: ruleFinallyClause returns [EObject current=null] : (otherlv_0= 'finally' ( (lv_body_1_0= RULE_ACTION ) ) ) ;
    public final EObject ruleFinallyClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_body_1_0=null;


        	enterRule();

        try {
            // InternalUniMapperGenerator.g:1784:2: ( (otherlv_0= 'finally' ( (lv_body_1_0= RULE_ACTION ) ) ) )
            // InternalUniMapperGenerator.g:1785:2: (otherlv_0= 'finally' ( (lv_body_1_0= RULE_ACTION ) ) )
            {
            // InternalUniMapperGenerator.g:1785:2: (otherlv_0= 'finally' ( (lv_body_1_0= RULE_ACTION ) ) )
            // InternalUniMapperGenerator.g:1786:3: otherlv_0= 'finally' ( (lv_body_1_0= RULE_ACTION ) )
            {
            otherlv_0=(Token)match(input,45,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getFinallyClauseAccess().getFinallyKeyword_0());
            		
            // InternalUniMapperGenerator.g:1790:3: ( (lv_body_1_0= RULE_ACTION ) )
            // InternalUniMapperGenerator.g:1791:4: (lv_body_1_0= RULE_ACTION )
            {
            // InternalUniMapperGenerator.g:1791:4: (lv_body_1_0= RULE_ACTION )
            // InternalUniMapperGenerator.g:1792:5: lv_body_1_0= RULE_ACTION
            {
            lv_body_1_0=(Token)match(input,RULE_ACTION,FOLLOW_2); 

            					newLeafNode(lv_body_1_0, grammarAccess.getFinallyClauseAccess().getBodyACTIONTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFinallyClauseRule());
            					}
            					setWithLastConsumed(
            						current,
            						"body",
            						lv_body_1_0,
            						"net.unicoen.UniMapperGenerator.ACTION");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFinallyClause"


    // $ANTLR start "entryRuleReturn"
    // InternalUniMapperGenerator.g:1812:1: entryRuleReturn returns [EObject current=null] : iv_ruleReturn= ruleReturn EOF ;
    public final EObject entryRuleReturn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturn = null;


        try {
            // InternalUniMapperGenerator.g:1812:47: (iv_ruleReturn= ruleReturn EOF )
            // InternalUniMapperGenerator.g:1813:2: iv_ruleReturn= ruleReturn EOF
            {
             newCompositeNode(grammarAccess.getReturnRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReturn=ruleReturn();

            state._fsp--;

             current =iv_ruleReturn; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReturn"


    // $ANTLR start "ruleReturn"
    // InternalUniMapperGenerator.g:1819:1: ruleReturn returns [EObject current=null] : (otherlv_0= 'returns' ( (lv_body_1_0= RULE_ARG_OR_CHARSET ) ) ) ;
    public final EObject ruleReturn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_body_1_0=null;


        	enterRule();

        try {
            // InternalUniMapperGenerator.g:1825:2: ( (otherlv_0= 'returns' ( (lv_body_1_0= RULE_ARG_OR_CHARSET ) ) ) )
            // InternalUniMapperGenerator.g:1826:2: (otherlv_0= 'returns' ( (lv_body_1_0= RULE_ARG_OR_CHARSET ) ) )
            {
            // InternalUniMapperGenerator.g:1826:2: (otherlv_0= 'returns' ( (lv_body_1_0= RULE_ARG_OR_CHARSET ) ) )
            // InternalUniMapperGenerator.g:1827:3: otherlv_0= 'returns' ( (lv_body_1_0= RULE_ARG_OR_CHARSET ) )
            {
            otherlv_0=(Token)match(input,46,FOLLOW_33); 

            			newLeafNode(otherlv_0, grammarAccess.getReturnAccess().getReturnsKeyword_0());
            		
            // InternalUniMapperGenerator.g:1831:3: ( (lv_body_1_0= RULE_ARG_OR_CHARSET ) )
            // InternalUniMapperGenerator.g:1832:4: (lv_body_1_0= RULE_ARG_OR_CHARSET )
            {
            // InternalUniMapperGenerator.g:1832:4: (lv_body_1_0= RULE_ARG_OR_CHARSET )
            // InternalUniMapperGenerator.g:1833:5: lv_body_1_0= RULE_ARG_OR_CHARSET
            {
            lv_body_1_0=(Token)match(input,RULE_ARG_OR_CHARSET,FOLLOW_2); 

            					newLeafNode(lv_body_1_0, grammarAccess.getReturnAccess().getBodyARG_OR_CHARSETTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReturnRule());
            					}
            					setWithLastConsumed(
            						current,
            						"body",
            						lv_body_1_0,
            						"net.unicoen.UniMapperGenerator.ARG_OR_CHARSET");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReturn"


    // $ANTLR start "entryRuleExceptions"
    // InternalUniMapperGenerator.g:1853:1: entryRuleExceptions returns [EObject current=null] : iv_ruleExceptions= ruleExceptions EOF ;
    public final EObject entryRuleExceptions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExceptions = null;


        try {
            // InternalUniMapperGenerator.g:1853:51: (iv_ruleExceptions= ruleExceptions EOF )
            // InternalUniMapperGenerator.g:1854:2: iv_ruleExceptions= ruleExceptions EOF
            {
             newCompositeNode(grammarAccess.getExceptionsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExceptions=ruleExceptions();

            state._fsp--;

             current =iv_ruleExceptions; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExceptions"


    // $ANTLR start "ruleExceptions"
    // InternalUniMapperGenerator.g:1860:1: ruleExceptions returns [EObject current=null] : (otherlv_0= 'throws' ( (lv_exceptions_1_0= ruleQualifiedId ) ) (otherlv_2= ',' ( (lv_exceptions_3_0= ruleQualifiedId ) ) )* ) ;
    public final EObject ruleExceptions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_exceptions_1_0 = null;

        EObject lv_exceptions_3_0 = null;



        	enterRule();

        try {
            // InternalUniMapperGenerator.g:1866:2: ( (otherlv_0= 'throws' ( (lv_exceptions_1_0= ruleQualifiedId ) ) (otherlv_2= ',' ( (lv_exceptions_3_0= ruleQualifiedId ) ) )* ) )
            // InternalUniMapperGenerator.g:1867:2: (otherlv_0= 'throws' ( (lv_exceptions_1_0= ruleQualifiedId ) ) (otherlv_2= ',' ( (lv_exceptions_3_0= ruleQualifiedId ) ) )* )
            {
            // InternalUniMapperGenerator.g:1867:2: (otherlv_0= 'throws' ( (lv_exceptions_1_0= ruleQualifiedId ) ) (otherlv_2= ',' ( (lv_exceptions_3_0= ruleQualifiedId ) ) )* )
            // InternalUniMapperGenerator.g:1868:3: otherlv_0= 'throws' ( (lv_exceptions_1_0= ruleQualifiedId ) ) (otherlv_2= ',' ( (lv_exceptions_3_0= ruleQualifiedId ) ) )*
            {
            otherlv_0=(Token)match(input,47,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getExceptionsAccess().getThrowsKeyword_0());
            		
            // InternalUniMapperGenerator.g:1872:3: ( (lv_exceptions_1_0= ruleQualifiedId ) )
            // InternalUniMapperGenerator.g:1873:4: (lv_exceptions_1_0= ruleQualifiedId )
            {
            // InternalUniMapperGenerator.g:1873:4: (lv_exceptions_1_0= ruleQualifiedId )
            // InternalUniMapperGenerator.g:1874:5: lv_exceptions_1_0= ruleQualifiedId
            {

            					newCompositeNode(grammarAccess.getExceptionsAccess().getExceptionsQualifiedIdParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_34);
            lv_exceptions_1_0=ruleQualifiedId();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExceptionsRule());
            					}
            					add(
            						current,
            						"exceptions",
            						lv_exceptions_1_0,
            						"net.unicoen.UniMapperGenerator.QualifiedId");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUniMapperGenerator.g:1891:3: (otherlv_2= ',' ( (lv_exceptions_3_0= ruleQualifiedId ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==37) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalUniMapperGenerator.g:1892:4: otherlv_2= ',' ( (lv_exceptions_3_0= ruleQualifiedId ) )
            	    {
            	    otherlv_2=(Token)match(input,37,FOLLOW_4); 

            	    				newLeafNode(otherlv_2, grammarAccess.getExceptionsAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalUniMapperGenerator.g:1896:4: ( (lv_exceptions_3_0= ruleQualifiedId ) )
            	    // InternalUniMapperGenerator.g:1897:5: (lv_exceptions_3_0= ruleQualifiedId )
            	    {
            	    // InternalUniMapperGenerator.g:1897:5: (lv_exceptions_3_0= ruleQualifiedId )
            	    // InternalUniMapperGenerator.g:1898:6: lv_exceptions_3_0= ruleQualifiedId
            	    {

            	    						newCompositeNode(grammarAccess.getExceptionsAccess().getExceptionsQualifiedIdParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_34);
            	    lv_exceptions_3_0=ruleQualifiedId();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExceptionsRule());
            	    						}
            	    						add(
            	    							current,
            	    							"exceptions",
            	    							lv_exceptions_3_0,
            	    							"net.unicoen.UniMapperGenerator.QualifiedId");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExceptions"


    // $ANTLR start "entryRuleLocalVars"
    // InternalUniMapperGenerator.g:1920:1: entryRuleLocalVars returns [EObject current=null] : iv_ruleLocalVars= ruleLocalVars EOF ;
    public final EObject entryRuleLocalVars() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalVars = null;


        try {
            // InternalUniMapperGenerator.g:1920:50: (iv_ruleLocalVars= ruleLocalVars EOF )
            // InternalUniMapperGenerator.g:1921:2: iv_ruleLocalVars= ruleLocalVars EOF
            {
             newCompositeNode(grammarAccess.getLocalVarsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLocalVars=ruleLocalVars();

            state._fsp--;

             current =iv_ruleLocalVars; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLocalVars"


    // $ANTLR start "ruleLocalVars"
    // InternalUniMapperGenerator.g:1927:1: ruleLocalVars returns [EObject current=null] : (otherlv_0= 'locals' ( (lv_body_1_0= RULE_ARG_OR_CHARSET ) ) ) ;
    public final EObject ruleLocalVars() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_body_1_0=null;


        	enterRule();

        try {
            // InternalUniMapperGenerator.g:1933:2: ( (otherlv_0= 'locals' ( (lv_body_1_0= RULE_ARG_OR_CHARSET ) ) ) )
            // InternalUniMapperGenerator.g:1934:2: (otherlv_0= 'locals' ( (lv_body_1_0= RULE_ARG_OR_CHARSET ) ) )
            {
            // InternalUniMapperGenerator.g:1934:2: (otherlv_0= 'locals' ( (lv_body_1_0= RULE_ARG_OR_CHARSET ) ) )
            // InternalUniMapperGenerator.g:1935:3: otherlv_0= 'locals' ( (lv_body_1_0= RULE_ARG_OR_CHARSET ) )
            {
            otherlv_0=(Token)match(input,48,FOLLOW_33); 

            			newLeafNode(otherlv_0, grammarAccess.getLocalVarsAccess().getLocalsKeyword_0());
            		
            // InternalUniMapperGenerator.g:1939:3: ( (lv_body_1_0= RULE_ARG_OR_CHARSET ) )
            // InternalUniMapperGenerator.g:1940:4: (lv_body_1_0= RULE_ARG_OR_CHARSET )
            {
            // InternalUniMapperGenerator.g:1940:4: (lv_body_1_0= RULE_ARG_OR_CHARSET )
            // InternalUniMapperGenerator.g:1941:5: lv_body_1_0= RULE_ARG_OR_CHARSET
            {
            lv_body_1_0=(Token)match(input,RULE_ARG_OR_CHARSET,FOLLOW_2); 

            					newLeafNode(lv_body_1_0, grammarAccess.getLocalVarsAccess().getBodyARG_OR_CHARSETTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLocalVarsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"body",
            						lv_body_1_0,
            						"net.unicoen.UniMapperGenerator.ARG_OR_CHARSET");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLocalVars"


    // $ANTLR start "entryRuleRulePrequel"
    // InternalUniMapperGenerator.g:1961:1: entryRuleRulePrequel returns [EObject current=null] : iv_ruleRulePrequel= ruleRulePrequel EOF ;
    public final EObject entryRuleRulePrequel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRulePrequel = null;


        try {
            // InternalUniMapperGenerator.g:1961:52: (iv_ruleRulePrequel= ruleRulePrequel EOF )
            // InternalUniMapperGenerator.g:1962:2: iv_ruleRulePrequel= ruleRulePrequel EOF
            {
             newCompositeNode(grammarAccess.getRulePrequelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRulePrequel=ruleRulePrequel();

            state._fsp--;

             current =iv_ruleRulePrequel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRulePrequel"


    // $ANTLR start "ruleRulePrequel"
    // InternalUniMapperGenerator.g:1968:1: ruleRulePrequel returns [EObject current=null] : (this_Options_0= ruleOptions | this_RuleAction_1= ruleRuleAction ) ;
    public final EObject ruleRulePrequel() throws RecognitionException {
        EObject current = null;

        EObject this_Options_0 = null;

        EObject this_RuleAction_1 = null;



        	enterRule();

        try {
            // InternalUniMapperGenerator.g:1974:2: ( (this_Options_0= ruleOptions | this_RuleAction_1= ruleRuleAction ) )
            // InternalUniMapperGenerator.g:1975:2: (this_Options_0= ruleOptions | this_RuleAction_1= ruleRuleAction )
            {
            // InternalUniMapperGenerator.g:1975:2: (this_Options_0= ruleOptions | this_RuleAction_1= ruleRuleAction )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_OPTIONS_SPEC) ) {
                alt28=1;
            }
            else if ( (LA28_0==38) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalUniMapperGenerator.g:1976:3: this_Options_0= ruleOptions
                    {

                    			newCompositeNode(grammarAccess.getRulePrequelAccess().getOptionsParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Options_0=ruleOptions();

                    state._fsp--;


                    			current = this_Options_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUniMapperGenerator.g:1985:3: this_RuleAction_1= ruleRuleAction
                    {

                    			newCompositeNode(grammarAccess.getRulePrequelAccess().getRuleActionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RuleAction_1=ruleRuleAction();

                    state._fsp--;


                    			current = this_RuleAction_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRulePrequel"


    // $ANTLR start "entryRuleRuleAction"
    // InternalUniMapperGenerator.g:1997:1: entryRuleRuleAction returns [EObject current=null] : iv_ruleRuleAction= ruleRuleAction EOF ;
    public final EObject entryRuleRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleAction = null;


        try {
            // InternalUniMapperGenerator.g:1997:51: (iv_ruleRuleAction= ruleRuleAction EOF )
            // InternalUniMapperGenerator.g:1998:2: iv_ruleRuleAction= ruleRuleAction EOF
            {
             newCompositeNode(grammarAccess.getRuleActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRuleAction=ruleRuleAction();

            state._fsp--;

             current =iv_ruleRuleAction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRuleAction"


    // $ANTLR start "ruleRuleAction"
    // InternalUniMapperGenerator.g:2004:1: ruleRuleAction returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleId ) ) ( (lv_body_2_0= RULE_ACTION ) ) ) ;
    public final EObject ruleRuleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_body_2_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalUniMapperGenerator.g:2010:2: ( (otherlv_0= '@' ( (lv_name_1_0= ruleId ) ) ( (lv_body_2_0= RULE_ACTION ) ) ) )
            // InternalUniMapperGenerator.g:2011:2: (otherlv_0= '@' ( (lv_name_1_0= ruleId ) ) ( (lv_body_2_0= RULE_ACTION ) ) )
            {
            // InternalUniMapperGenerator.g:2011:2: (otherlv_0= '@' ( (lv_name_1_0= ruleId ) ) ( (lv_body_2_0= RULE_ACTION ) ) )
            // InternalUniMapperGenerator.g:2012:3: otherlv_0= '@' ( (lv_name_1_0= ruleId ) ) ( (lv_body_2_0= RULE_ACTION ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getRuleActionAccess().getCommercialAtKeyword_0());
            		
            // InternalUniMapperGenerator.g:2016:3: ( (lv_name_1_0= ruleId ) )
            // InternalUniMapperGenerator.g:2017:4: (lv_name_1_0= ruleId )
            {
            // InternalUniMapperGenerator.g:2017:4: (lv_name_1_0= ruleId )
            // InternalUniMapperGenerator.g:2018:5: lv_name_1_0= ruleId
            {

            					newCompositeNode(grammarAccess.getRuleActionAccess().getNameIdParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_22);
            lv_name_1_0=ruleId();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleActionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"net.unicoen.UniMapperGenerator.Id");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUniMapperGenerator.g:2035:3: ( (lv_body_2_0= RULE_ACTION ) )
            // InternalUniMapperGenerator.g:2036:4: (lv_body_2_0= RULE_ACTION )
            {
            // InternalUniMapperGenerator.g:2036:4: (lv_body_2_0= RULE_ACTION )
            // InternalUniMapperGenerator.g:2037:5: lv_body_2_0= RULE_ACTION
            {
            lv_body_2_0=(Token)match(input,RULE_ACTION,FOLLOW_2); 

            					newLeafNode(lv_body_2_0, grammarAccess.getRuleActionAccess().getBodyACTIONTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRuleActionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"body",
            						lv_body_2_0,
            						"net.unicoen.UniMapperGenerator.ACTION");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRuleAction"


    // $ANTLR start "entryRuleRuleAltList"
    // InternalUniMapperGenerator.g:2057:1: entryRuleRuleAltList returns [EObject current=null] : iv_ruleRuleAltList= ruleRuleAltList EOF ;
    public final EObject entryRuleRuleAltList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleAltList = null;


        try {
            // InternalUniMapperGenerator.g:2057:52: (iv_ruleRuleAltList= ruleRuleAltList EOF )
            // InternalUniMapperGenerator.g:2058:2: iv_ruleRuleAltList= ruleRuleAltList EOF
            {
             newCompositeNode(grammarAccess.getRuleAltListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRuleAltList=ruleRuleAltList();

            state._fsp--;

             current =iv_ruleRuleAltList; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRuleAltList"


    // $ANTLR start "ruleRuleAltList"
    // InternalUniMapperGenerator.g:2064:1: ruleRuleAltList returns [EObject current=null] : ( ( (lv_alternatives_0_0= ruleLabeledAlt ) ) (otherlv_1= '|' ( (lv_alternatives_2_0= ruleLabeledAlt ) ) )* ) ;
    public final EObject ruleRuleAltList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_alternatives_0_0 = null;

        EObject lv_alternatives_2_0 = null;



        	enterRule();

        try {
            // InternalUniMapperGenerator.g:2070:2: ( ( ( (lv_alternatives_0_0= ruleLabeledAlt ) ) (otherlv_1= '|' ( (lv_alternatives_2_0= ruleLabeledAlt ) ) )* ) )
            // InternalUniMapperGenerator.g:2071:2: ( ( (lv_alternatives_0_0= ruleLabeledAlt ) ) (otherlv_1= '|' ( (lv_alternatives_2_0= ruleLabeledAlt ) ) )* )
            {
            // InternalUniMapperGenerator.g:2071:2: ( ( (lv_alternatives_0_0= ruleLabeledAlt ) ) (otherlv_1= '|' ( (lv_alternatives_2_0= ruleLabeledAlt ) ) )* )
            // InternalUniMapperGenerator.g:2072:3: ( (lv_alternatives_0_0= ruleLabeledAlt ) ) (otherlv_1= '|' ( (lv_alternatives_2_0= ruleLabeledAlt ) ) )*
            {
            // InternalUniMapperGenerator.g:2072:3: ( (lv_alternatives_0_0= ruleLabeledAlt ) )
            // InternalUniMapperGenerator.g:2073:4: (lv_alternatives_0_0= ruleLabeledAlt )
            {
            // InternalUniMapperGenerator.g:2073:4: (lv_alternatives_0_0= ruleLabeledAlt )
            // InternalUniMapperGenerator.g:2074:5: lv_alternatives_0_0= ruleLabeledAlt
            {

            					newCompositeNode(grammarAccess.getRuleAltListAccess().getAlternativesLabeledAltParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_35);
            lv_alternatives_0_0=ruleLabeledAlt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleAltListRule());
            					}
            					add(
            						current,
            						"alternatives",
            						lv_alternatives_0_0,
            						"net.unicoen.UniMapperGenerator.LabeledAlt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUniMapperGenerator.g:2091:3: (otherlv_1= '|' ( (lv_alternatives_2_0= ruleLabeledAlt ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==49) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalUniMapperGenerator.g:2092:4: otherlv_1= '|' ( (lv_alternatives_2_0= ruleLabeledAlt ) )
            	    {
            	    otherlv_1=(Token)match(input,49,FOLLOW_30); 

            	    				newLeafNode(otherlv_1, grammarAccess.getRuleAltListAccess().getVerticalLineKeyword_1_0());
            	    			
            	    // InternalUniMapperGenerator.g:2096:4: ( (lv_alternatives_2_0= ruleLabeledAlt ) )
            	    // InternalUniMapperGenerator.g:2097:5: (lv_alternatives_2_0= ruleLabeledAlt )
            	    {
            	    // InternalUniMapperGenerator.g:2097:5: (lv_alternatives_2_0= ruleLabeledAlt )
            	    // InternalUniMapperGenerator.g:2098:6: lv_alternatives_2_0= ruleLabeledAlt
            	    {

            	    						newCompositeNode(grammarAccess.getRuleAltListAccess().getAlternativesLabeledAltParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_35);
            	    lv_alternatives_2_0=ruleLabeledAlt();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRuleAltListRule());
            	    						}
            	    						add(
            	    							current,
            	    							"alternatives",
            	    							lv_alternatives_2_0,
            	    							"net.unicoen.UniMapperGenerator.LabeledAlt");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRuleAltList"


    // $ANTLR start "entryRuleLabeledAlt"
    // InternalUniMapperGenerator.g:2120:1: entryRuleLabeledAlt returns [EObject current=null] : iv_ruleLabeledAlt= ruleLabeledAlt EOF ;
    public final EObject entryRuleLabeledAlt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabeledAlt = null;


        try {
            // InternalUniMapperGenerator.g:2120:51: (iv_ruleLabeledAlt= ruleLabeledAlt EOF )
            // InternalUniMapperGenerator.g:2121:2: iv_ruleLabeledAlt= ruleLabeledAlt EOF
            {
             newCompositeNode(grammarAccess.getLabeledAltRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLabeledAlt=ruleLabeledAlt();

            state._fsp--;

             current =iv_ruleLabeledAlt; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLabeledAlt"


    // $ANTLR start "ruleLabeledAlt"
    // InternalUniMapperGenerator.g:2127:1: ruleLabeledAlt returns [EObject current=null] : ( ( (lv_body_0_0= ruleAlternative ) ) (otherlv_1= '#' ( (lv_label_2_0= ruleId ) ) )? ) ;
    public final EObject ruleLabeledAlt() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_body_0_0 = null;

        AntlrDatatypeRuleToken lv_label_2_0 = null;



        	enterRule();

        try {
            // InternalUniMapperGenerator.g:2133:2: ( ( ( (lv_body_0_0= ruleAlternative ) ) (otherlv_1= '#' ( (lv_label_2_0= ruleId ) ) )? ) )
            // InternalUniMapperGenerator.g:2134:2: ( ( (lv_body_0_0= ruleAlternative ) ) (otherlv_1= '#' ( (lv_label_2_0= ruleId ) ) )? )
            {
            // InternalUniMapperGenerator.g:2134:2: ( ( (lv_body_0_0= ruleAlternative ) ) (otherlv_1= '#' ( (lv_label_2_0= ruleId ) ) )? )
            // InternalUniMapperGenerator.g:2135:3: ( (lv_body_0_0= ruleAlternative ) ) (otherlv_1= '#' ( (lv_label_2_0= ruleId ) ) )?
            {
            // InternalUniMapperGenerator.g:2135:3: ( (lv_body_0_0= ruleAlternative ) )
            // InternalUniMapperGenerator.g:2136:4: (lv_body_0_0= ruleAlternative )
            {
            // InternalUniMapperGenerator.g:2136:4: (lv_body_0_0= ruleAlternative )
            // InternalUniMapperGenerator.g:2137:5: lv_body_0_0= ruleAlternative
            {

            					newCompositeNode(grammarAccess.getLabeledAltAccess().getBodyAlternativeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_36);
            lv_body_0_0=ruleAlternative();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLabeledAltRule());
            					}
            					set(
            						current,
            						"body",
            						lv_body_0_0,
            						"net.unicoen.UniMapperGenerator.Alternative");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUniMapperGenerator.g:2154:3: (otherlv_1= '#' ( (lv_label_2_0= ruleId ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==50) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalUniMapperGenerator.g:2155:4: otherlv_1= '#' ( (lv_label_2_0= ruleId ) )
                    {
                    otherlv_1=(Token)match(input,50,FOLLOW_4); 

                    				newLeafNode(otherlv_1, grammarAccess.getLabeledAltAccess().getNumberSignKeyword_1_0());
                    			
                    // InternalUniMapperGenerator.g:2159:4: ( (lv_label_2_0= ruleId ) )
                    // InternalUniMapperGenerator.g:2160:5: (lv_label_2_0= ruleId )
                    {
                    // InternalUniMapperGenerator.g:2160:5: (lv_label_2_0= ruleId )
                    // InternalUniMapperGenerator.g:2161:6: lv_label_2_0= ruleId
                    {

                    						newCompositeNode(grammarAccess.getLabeledAltAccess().getLabelIdParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_label_2_0=ruleId();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLabeledAltRule());
                    						}
                    						set(
                    							current,
                    							"label",
                    							lv_label_2_0,
                    							"net.unicoen.UniMapperGenerator.Id");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLabeledAlt"


    // $ANTLR start "entryRuleAlternative"
    // InternalUniMapperGenerator.g:2183:1: entryRuleAlternative returns [EObject current=null] : iv_ruleAlternative= ruleAlternative EOF ;
    public final EObject entryRuleAlternative() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlternative = null;


        try {
            // InternalUniMapperGenerator.g:2183:52: (iv_ruleAlternative= ruleAlternative EOF )
            // InternalUniMapperGenerator.g:2184:2: iv_ruleAlternative= ruleAlternative EOF
            {
             newCompositeNode(grammarAccess.getAlternativeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAlternative=ruleAlternative();

            state._fsp--;

             current =iv_ruleAlternative; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAlternative"


    // $ANTLR start "ruleAlternative"
    // InternalUniMapperGenerator.g:2190:1: ruleAlternative returns [EObject current=null] : ( () ( (lv_options_1_0= ruleElementOptions ) )? ( (lv_elements_2_0= ruleElement ) )* ) ;
    public final EObject ruleAlternative() throws RecognitionException {
        EObject current = null;

        EObject lv_options_1_0 = null;

        EObject lv_elements_2_0 = null;



        	enterRule();

        try {
            // InternalUniMapperGenerator.g:2196:2: ( ( () ( (lv_options_1_0= ruleElementOptions ) )? ( (lv_elements_2_0= ruleElement ) )* ) )
            // InternalUniMapperGenerator.g:2197:2: ( () ( (lv_options_1_0= ruleElementOptions ) )? ( (lv_elements_2_0= ruleElement ) )* )
            {
            // InternalUniMapperGenerator.g:2197:2: ( () ( (lv_options_1_0= ruleElementOptions ) )? ( (lv_elements_2_0= ruleElement ) )* )
            // InternalUniMapperGenerator.g:2198:3: () ( (lv_options_1_0= ruleElementOptions ) )? ( (lv_elements_2_0= ruleElement ) )*
            {
            // InternalUniMapperGenerator.g:2198:3: ()
            // InternalUniMapperGenerator.g:2199:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAlternativeAccess().getAlternativeAction_0(),
            					current);
            			

            }

            // InternalUniMapperGenerator.g:2205:3: ( (lv_options_1_0= ruleElementOptions ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==57) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalUniMapperGenerator.g:2206:4: (lv_options_1_0= ruleElementOptions )
                    {
                    // InternalUniMapperGenerator.g:2206:4: (lv_options_1_0= ruleElementOptions )
                    // InternalUniMapperGenerator.g:2207:5: lv_options_1_0= ruleElementOptions
                    {

                    					newCompositeNode(grammarAccess.getAlternativeAccess().getOptionsElementOptionsParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_37);
                    lv_options_1_0=ruleElementOptions();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAlternativeRule());
                    					}
                    					set(
                    						current,
                    						"options",
                    						lv_options_1_0,
                    						"net.unicoen.UniMapperGenerator.ElementOptions");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalUniMapperGenerator.g:2224:3: ( (lv_elements_2_0= ruleElement ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_RULE_REF||(LA32_0>=RULE_MYSTRING && LA32_0<=RULE_ACTION)||LA32_0==RULE_TOKEN_REF||LA32_0==55||(LA32_0>=60 && LA32_0<=62)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalUniMapperGenerator.g:2225:4: (lv_elements_2_0= ruleElement )
            	    {
            	    // InternalUniMapperGenerator.g:2225:4: (lv_elements_2_0= ruleElement )
            	    // InternalUniMapperGenerator.g:2226:5: lv_elements_2_0= ruleElement
            	    {

            	    					newCompositeNode(grammarAccess.getAlternativeAccess().getElementsElementParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_37);
            	    lv_elements_2_0=ruleElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAlternativeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_2_0,
            	    						"net.unicoen.UniMapperGenerator.Element");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAlternative"


    // $ANTLR start "entryRuleElement"
    // InternalUniMapperGenerator.g:2247:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // InternalUniMapperGenerator.g:2247:48: (iv_ruleElement= ruleElement EOF )
            // InternalUniMapperGenerator.g:2248:2: iv_ruleElement= ruleElement EOF
            {
             newCompositeNode(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElement=ruleElement();

            state._fsp--;

             current =iv_ruleElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalUniMapperGenerator.g:2254:1: ruleElement returns [EObject current=null] : ( ( ( (lv_body_0_0= ruleLabeledElement ) ) ( (lv_operator_1_0= ruleEbnfSuffix ) )? ) | ( ( (lv_body_2_0= ruleAtom ) ) ( (lv_operator_3_0= ruleEbnfSuffix ) )? (this_DOLLAR_4= RULE_DOLLAR ( (lv_op_5_0= ruleId ) ) )? ) | ( (lv_body_6_0= ruleEbnf ) ) | ( (lv_body_7_0= ruleActionElement ) ) ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        Token this_DOLLAR_4=null;
        EObject lv_body_0_0 = null;

        EObject lv_operator_1_0 = null;

        EObject lv_body_2_0 = null;

        EObject lv_operator_3_0 = null;

        AntlrDatatypeRuleToken lv_op_5_0 = null;

        EObject lv_body_6_0 = null;

        EObject lv_body_7_0 = null;



        	enterRule();

        try {
            // InternalUniMapperGenerator.g:2260:2: ( ( ( ( (lv_body_0_0= ruleLabeledElement ) ) ( (lv_operator_1_0= ruleEbnfSuffix ) )? ) | ( ( (lv_body_2_0= ruleAtom ) ) ( (lv_operator_3_0= ruleEbnfSuffix ) )? (this_DOLLAR_4= RULE_DOLLAR ( (lv_op_5_0= ruleId ) ) )? ) | ( (lv_body_6_0= ruleEbnf ) ) | ( (lv_body_7_0= ruleActionElement ) ) ) )
            // InternalUniMapperGenerator.g:2261:2: ( ( ( (lv_body_0_0= ruleLabeledElement ) ) ( (lv_operator_1_0= ruleEbnfSuffix ) )? ) | ( ( (lv_body_2_0= ruleAtom ) ) ( (lv_operator_3_0= ruleEbnfSuffix ) )? (this_DOLLAR_4= RULE_DOLLAR ( (lv_op_5_0= ruleId ) ) )? ) | ( (lv_body_6_0= ruleEbnf ) ) | ( (lv_body_7_0= ruleActionElement ) ) )
            {
            // InternalUniMapperGenerator.g:2261:2: ( ( ( (lv_body_0_0= ruleLabeledElement ) ) ( (lv_operator_1_0= ruleEbnfSuffix ) )? ) | ( ( (lv_body_2_0= ruleAtom ) ) ( (lv_operator_3_0= ruleEbnfSuffix ) )? (this_DOLLAR_4= RULE_DOLLAR ( (lv_op_5_0= ruleId ) ) )? ) | ( (lv_body_6_0= ruleEbnf ) ) | ( (lv_body_7_0= ruleActionElement ) ) )
            int alt36=4;
            switch ( input.LA(1) ) {
            case RULE_TOKEN_REF:
                {
                int LA36_1 = input.LA(2);

                if ( (LA36_1==EOF||(LA36_1>=RULE_SEMICOLON && LA36_1<=RULE_RULE_REF)||(LA36_1>=RULE_MYSTRING && LA36_1<=RULE_ACTION)||(LA36_1>=RULE_DOLLAR && LA36_1<=RULE_TOKEN_REF)||(LA36_1>=44 && LA36_1<=45)||(LA36_1>=49 && LA36_1<=50)||(LA36_1>=52 && LA36_1<=57)||(LA36_1>=60 && LA36_1<=62)) ) {
                    alt36=2;
                }
                else if ( (LA36_1==35||LA36_1==51) ) {
                    alt36=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 36, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_RULE_REF:
                {
                int LA36_2 = input.LA(2);

                if ( (LA36_2==EOF||(LA36_2>=RULE_SEMICOLON && LA36_2<=RULE_RULE_REF)||(LA36_2>=RULE_MYSTRING && LA36_2<=RULE_ACTION)||(LA36_2>=RULE_DOLLAR && LA36_2<=RULE_TOKEN_REF)||(LA36_2>=44 && LA36_2<=45)||(LA36_2>=49 && LA36_2<=50)||(LA36_2>=52 && LA36_2<=57)||(LA36_2>=60 && LA36_2<=62)) ) {
                    alt36=2;
                }
                else if ( (LA36_2==35||LA36_2==51) ) {
                    alt36=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 36, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_MYSTRING:
            case 60:
            case 61:
            case 62:
                {
                alt36=2;
                }
                break;
            case 55:
                {
                alt36=3;
                }
                break;
            case RULE_ACTION:
                {
                alt36=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // InternalUniMapperGenerator.g:2262:3: ( ( (lv_body_0_0= ruleLabeledElement ) ) ( (lv_operator_1_0= ruleEbnfSuffix ) )? )
                    {
                    // InternalUniMapperGenerator.g:2262:3: ( ( (lv_body_0_0= ruleLabeledElement ) ) ( (lv_operator_1_0= ruleEbnfSuffix ) )? )
                    // InternalUniMapperGenerator.g:2263:4: ( (lv_body_0_0= ruleLabeledElement ) ) ( (lv_operator_1_0= ruleEbnfSuffix ) )?
                    {
                    // InternalUniMapperGenerator.g:2263:4: ( (lv_body_0_0= ruleLabeledElement ) )
                    // InternalUniMapperGenerator.g:2264:5: (lv_body_0_0= ruleLabeledElement )
                    {
                    // InternalUniMapperGenerator.g:2264:5: (lv_body_0_0= ruleLabeledElement )
                    // InternalUniMapperGenerator.g:2265:6: lv_body_0_0= ruleLabeledElement
                    {

                    						newCompositeNode(grammarAccess.getElementAccess().getBodyLabeledElementParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_38);
                    lv_body_0_0=ruleLabeledElement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getElementRule());
                    						}
                    						set(
                    							current,
                    							"body",
                    							lv_body_0_0,
                    							"net.unicoen.UniMapperGenerator.LabeledElement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalUniMapperGenerator.g:2282:4: ( (lv_operator_1_0= ruleEbnfSuffix ) )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( ((LA33_0>=52 && LA33_0<=54)) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // InternalUniMapperGenerator.g:2283:5: (lv_operator_1_0= ruleEbnfSuffix )
                            {
                            // InternalUniMapperGenerator.g:2283:5: (lv_operator_1_0= ruleEbnfSuffix )
                            // InternalUniMapperGenerator.g:2284:6: lv_operator_1_0= ruleEbnfSuffix
                            {

                            						newCompositeNode(grammarAccess.getElementAccess().getOperatorEbnfSuffixParserRuleCall_0_1_0());
                            					
                            pushFollow(FOLLOW_2);
                            lv_operator_1_0=ruleEbnfSuffix();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getElementRule());
                            						}
                            						set(
                            							current,
                            							"operator",
                            							lv_operator_1_0,
                            							"net.unicoen.UniMapperGenerator.EbnfSuffix");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalUniMapperGenerator.g:2303:3: ( ( (lv_body_2_0= ruleAtom ) ) ( (lv_operator_3_0= ruleEbnfSuffix ) )? (this_DOLLAR_4= RULE_DOLLAR ( (lv_op_5_0= ruleId ) ) )? )
                    {
                    // InternalUniMapperGenerator.g:2303:3: ( ( (lv_body_2_0= ruleAtom ) ) ( (lv_operator_3_0= ruleEbnfSuffix ) )? (this_DOLLAR_4= RULE_DOLLAR ( (lv_op_5_0= ruleId ) ) )? )
                    // InternalUniMapperGenerator.g:2304:4: ( (lv_body_2_0= ruleAtom ) ) ( (lv_operator_3_0= ruleEbnfSuffix ) )? (this_DOLLAR_4= RULE_DOLLAR ( (lv_op_5_0= ruleId ) ) )?
                    {
                    // InternalUniMapperGenerator.g:2304:4: ( (lv_body_2_0= ruleAtom ) )
                    // InternalUniMapperGenerator.g:2305:5: (lv_body_2_0= ruleAtom )
                    {
                    // InternalUniMapperGenerator.g:2305:5: (lv_body_2_0= ruleAtom )
                    // InternalUniMapperGenerator.g:2306:6: lv_body_2_0= ruleAtom
                    {

                    						newCompositeNode(grammarAccess.getElementAccess().getBodyAtomParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_39);
                    lv_body_2_0=ruleAtom();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getElementRule());
                    						}
                    						set(
                    							current,
                    							"body",
                    							lv_body_2_0,
                    							"net.unicoen.UniMapperGenerator.Atom");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalUniMapperGenerator.g:2323:4: ( (lv_operator_3_0= ruleEbnfSuffix ) )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( ((LA34_0>=52 && LA34_0<=54)) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // InternalUniMapperGenerator.g:2324:5: (lv_operator_3_0= ruleEbnfSuffix )
                            {
                            // InternalUniMapperGenerator.g:2324:5: (lv_operator_3_0= ruleEbnfSuffix )
                            // InternalUniMapperGenerator.g:2325:6: lv_operator_3_0= ruleEbnfSuffix
                            {

                            						newCompositeNode(grammarAccess.getElementAccess().getOperatorEbnfSuffixParserRuleCall_1_1_0());
                            					
                            pushFollow(FOLLOW_40);
                            lv_operator_3_0=ruleEbnfSuffix();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getElementRule());
                            						}
                            						set(
                            							current,
                            							"operator",
                            							lv_operator_3_0,
                            							"net.unicoen.UniMapperGenerator.EbnfSuffix");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    // InternalUniMapperGenerator.g:2342:4: (this_DOLLAR_4= RULE_DOLLAR ( (lv_op_5_0= ruleId ) ) )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==RULE_DOLLAR) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // InternalUniMapperGenerator.g:2343:5: this_DOLLAR_4= RULE_DOLLAR ( (lv_op_5_0= ruleId ) )
                            {
                            this_DOLLAR_4=(Token)match(input,RULE_DOLLAR,FOLLOW_4); 

                            					newLeafNode(this_DOLLAR_4, grammarAccess.getElementAccess().getDOLLARTerminalRuleCall_1_2_0());
                            				
                            // InternalUniMapperGenerator.g:2347:5: ( (lv_op_5_0= ruleId ) )
                            // InternalUniMapperGenerator.g:2348:6: (lv_op_5_0= ruleId )
                            {
                            // InternalUniMapperGenerator.g:2348:6: (lv_op_5_0= ruleId )
                            // InternalUniMapperGenerator.g:2349:7: lv_op_5_0= ruleId
                            {

                            							newCompositeNode(grammarAccess.getElementAccess().getOpIdParserRuleCall_1_2_1_0());
                            						
                            pushFollow(FOLLOW_2);
                            lv_op_5_0=ruleId();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getElementRule());
                            							}
                            							set(
                            								current,
                            								"op",
                            								lv_op_5_0,
                            								"net.unicoen.UniMapperGenerator.Id");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalUniMapperGenerator.g:2369:3: ( (lv_body_6_0= ruleEbnf ) )
                    {
                    // InternalUniMapperGenerator.g:2369:3: ( (lv_body_6_0= ruleEbnf ) )
                    // InternalUniMapperGenerator.g:2370:4: (lv_body_6_0= ruleEbnf )
                    {
                    // InternalUniMapperGenerator.g:2370:4: (lv_body_6_0= ruleEbnf )
                    // InternalUniMapperGenerator.g:2371:5: lv_body_6_0= ruleEbnf
                    {

                    					newCompositeNode(grammarAccess.getElementAccess().getBodyEbnfParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_body_6_0=ruleEbnf();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getElementRule());
                    					}
                    					set(
                    						current,
                    						"body",
                    						lv_body_6_0,
                    						"net.unicoen.UniMapperGenerator.Ebnf");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalUniMapperGenerator.g:2389:3: ( (lv_body_7_0= ruleActionElement ) )
                    {
                    // InternalUniMapperGenerator.g:2389:3: ( (lv_body_7_0= ruleActionElement ) )
                    // InternalUniMapperGenerator.g:2390:4: (lv_body_7_0= ruleActionElement )
                    {
                    // InternalUniMapperGenerator.g:2390:4: (lv_body_7_0= ruleActionElement )
                    // InternalUniMapperGenerator.g:2391:5: lv_body_7_0= ruleActionElement
                    {

                    					newCompositeNode(grammarAccess.getElementAccess().getBodyActionElementParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_body_7_0=ruleActionElement();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getElementRule());
                    					}
                    					set(
                    						current,
                    						"body",
                    						lv_body_7_0,
                    						"net.unicoen.UniMapperGenerator.ActionElement");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleEbnf"
    // InternalUniMapperGenerator.g:2412:1: entryRuleEbnf returns [EObject current=null] : iv_ruleEbnf= ruleEbnf EOF ;
    public final EObject entryRuleEbnf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEbnf = null;


        try {
            // InternalUniMapperGenerator.g:2412:45: (iv_ruleEbnf= ruleEbnf EOF )
            // InternalUniMapperGenerator.g:2413:2: iv_ruleEbnf= ruleEbnf EOF
            {
             newCompositeNode(grammarAccess.getEbnfRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEbnf=ruleEbnf();

            state._fsp--;

             current =iv_ruleEbnf; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEbnf"


    // $ANTLR start "ruleEbnf"
    // InternalUniMapperGenerator.g:2419:1: ruleEbnf returns [EObject current=null] : ( ( (lv_body_0_0= ruleBlock ) ) ( (lv_operator_1_0= ruleEbnfSuffix ) )? ) ;
    public final EObject ruleEbnf() throws RecognitionException {
        EObject current = null;

        EObject lv_body_0_0 = null;

        EObject lv_operator_1_0 = null;



        	enterRule();

        try {
            // InternalUniMapperGenerator.g:2425:2: ( ( ( (lv_body_0_0= ruleBlock ) ) ( (lv_operator_1_0= ruleEbnfSuffix ) )? ) )
            // InternalUniMapperGenerator.g:2426:2: ( ( (lv_body_0_0= ruleBlock ) ) ( (lv_operator_1_0= ruleEbnfSuffix ) )? )
            {
            // InternalUniMapperGenerator.g:2426:2: ( ( (lv_body_0_0= ruleBlock ) ) ( (lv_operator_1_0= ruleEbnfSuffix ) )? )
            // InternalUniMapperGenerator.g:2427:3: ( (lv_body_0_0= ruleBlock ) ) ( (lv_operator_1_0= ruleEbnfSuffix ) )?
            {
            // InternalUniMapperGenerator.g:2427:3: ( (lv_body_0_0= ruleBlock ) )
            // InternalUniMapperGenerator.g:2428:4: (lv_body_0_0= ruleBlock )
            {
            // InternalUniMapperGenerator.g:2428:4: (lv_body_0_0= ruleBlock )
            // InternalUniMapperGenerator.g:2429:5: lv_body_0_0= ruleBlock
            {

            					newCompositeNode(grammarAccess.getEbnfAccess().getBodyBlockParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_38);
            lv_body_0_0=ruleBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEbnfRule());
            					}
            					set(
            						current,
            						"body",
            						lv_body_0_0,
            						"net.unicoen.UniMapperGenerator.Block");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUniMapperGenerator.g:2446:3: ( (lv_operator_1_0= ruleEbnfSuffix ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( ((LA37_0>=52 && LA37_0<=54)) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalUniMapperGenerator.g:2447:4: (lv_operator_1_0= ruleEbnfSuffix )
                    {
                    // InternalUniMapperGenerator.g:2447:4: (lv_operator_1_0= ruleEbnfSuffix )
                    // InternalUniMapperGenerator.g:2448:5: lv_operator_1_0= ruleEbnfSuffix
                    {

                    					newCompositeNode(grammarAccess.getEbnfAccess().getOperatorEbnfSuffixParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_operator_1_0=ruleEbnfSuffix();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEbnfRule());
                    					}
                    					set(
                    						current,
                    						"operator",
                    						lv_operator_1_0,
                    						"net.unicoen.UniMapperGenerator.EbnfSuffix");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEbnf"


    // $ANTLR start "entryRuleActionElement"
    // InternalUniMapperGenerator.g:2469:1: entryRuleActionElement returns [EObject current=null] : iv_ruleActionElement= ruleActionElement EOF ;
    public final EObject entryRuleActionElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionElement = null;


        try {
            // InternalUniMapperGenerator.g:2469:54: (iv_ruleActionElement= ruleActionElement EOF )
            // InternalUniMapperGenerator.g:2470:2: iv_ruleActionElement= ruleActionElement EOF
            {
             newCompositeNode(grammarAccess.getActionElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActionElement=ruleActionElement();

            state._fsp--;

             current =iv_ruleActionElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActionElement"


    // $ANTLR start "ruleActionElement"
    // InternalUniMapperGenerator.g:2476:1: ruleActionElement returns [EObject current=null] : ( ( (lv_body_0_0= RULE_ACTION ) ) ( (lv_options_1_0= ruleElementOptions ) )? ) ;
    public final EObject ruleActionElement() throws RecognitionException {
        EObject current = null;

        Token lv_body_0_0=null;
        EObject lv_options_1_0 = null;



        	enterRule();

        try {
            // InternalUniMapperGenerator.g:2482:2: ( ( ( (lv_body_0_0= RULE_ACTION ) ) ( (lv_options_1_0= ruleElementOptions ) )? ) )
            // InternalUniMapperGenerator.g:2483:2: ( ( (lv_body_0_0= RULE_ACTION ) ) ( (lv_options_1_0= ruleElementOptions ) )? )
            {
            // InternalUniMapperGenerator.g:2483:2: ( ( (lv_body_0_0= RULE_ACTION ) ) ( (lv_options_1_0= ruleElementOptions ) )? )
            // InternalUniMapperGenerator.g:2484:3: ( (lv_body_0_0= RULE_ACTION ) ) ( (lv_options_1_0= ruleElementOptions ) )?
            {
            // InternalUniMapperGenerator.g:2484:3: ( (lv_body_0_0= RULE_ACTION ) )
            // InternalUniMapperGenerator.g:2485:4: (lv_body_0_0= RULE_ACTION )
            {
            // InternalUniMapperGenerator.g:2485:4: (lv_body_0_0= RULE_ACTION )
            // InternalUniMapperGenerator.g:2486:5: lv_body_0_0= RULE_ACTION
            {
            lv_body_0_0=(Token)match(input,RULE_ACTION,FOLLOW_41); 

            					newLeafNode(lv_body_0_0, grammarAccess.getActionElementAccess().getBodyACTIONTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionElementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"body",
            						lv_body_0_0,
            						"net.unicoen.UniMapperGenerator.ACTION");
            				

            }


            }

            // InternalUniMapperGenerator.g:2502:3: ( (lv_options_1_0= ruleElementOptions ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==57) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalUniMapperGenerator.g:2503:4: (lv_options_1_0= ruleElementOptions )
                    {
                    // InternalUniMapperGenerator.g:2503:4: (lv_options_1_0= ruleElementOptions )
                    // InternalUniMapperGenerator.g:2504:5: lv_options_1_0= ruleElementOptions
                    {

                    					newCompositeNode(grammarAccess.getActionElementAccess().getOptionsElementOptionsParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_options_1_0=ruleElementOptions();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getActionElementRule());
                    					}
                    					set(
                    						current,
                    						"options",
                    						lv_options_1_0,
                    						"net.unicoen.UniMapperGenerator.ElementOptions");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActionElement"


    // $ANTLR start "entryRuleLabeledElement"
    // InternalUniMapperGenerator.g:2525:1: entryRuleLabeledElement returns [EObject current=null] : iv_ruleLabeledElement= ruleLabeledElement EOF ;
    public final EObject entryRuleLabeledElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabeledElement = null;


        try {
            // InternalUniMapperGenerator.g:2525:55: (iv_ruleLabeledElement= ruleLabeledElement EOF )
            // InternalUniMapperGenerator.g:2526:2: iv_ruleLabeledElement= ruleLabeledElement EOF
            {
             newCompositeNode(grammarAccess.getLabeledElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLabeledElement=ruleLabeledElement();

            state._fsp--;

             current =iv_ruleLabeledElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLabeledElement"


    // $ANTLR start "ruleLabeledElement"
    // InternalUniMapperGenerator.g:2532:1: ruleLabeledElement returns [EObject current=null] : ( ( (lv_name_0_0= ruleId ) ) ( ( (lv_op_1_1= '=' | lv_op_1_2= '+=' ) ) ) ( ( (lv_body_2_0= ruleAtom ) ) | ( (lv_body_3_0= ruleBlock ) ) ) ) ;
    public final EObject ruleLabeledElement() throws RecognitionException {
        EObject current = null;

        Token lv_op_1_1=null;
        Token lv_op_1_2=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_body_2_0 = null;

        EObject lv_body_3_0 = null;



        	enterRule();

        try {
            // InternalUniMapperGenerator.g:2538:2: ( ( ( (lv_name_0_0= ruleId ) ) ( ( (lv_op_1_1= '=' | lv_op_1_2= '+=' ) ) ) ( ( (lv_body_2_0= ruleAtom ) ) | ( (lv_body_3_0= ruleBlock ) ) ) ) )
            // InternalUniMapperGenerator.g:2539:2: ( ( (lv_name_0_0= ruleId ) ) ( ( (lv_op_1_1= '=' | lv_op_1_2= '+=' ) ) ) ( ( (lv_body_2_0= ruleAtom ) ) | ( (lv_body_3_0= ruleBlock ) ) ) )
            {
            // InternalUniMapperGenerator.g:2539:2: ( ( (lv_name_0_0= ruleId ) ) ( ( (lv_op_1_1= '=' | lv_op_1_2= '+=' ) ) ) ( ( (lv_body_2_0= ruleAtom ) ) | ( (lv_body_3_0= ruleBlock ) ) ) )
            // InternalUniMapperGenerator.g:2540:3: ( (lv_name_0_0= ruleId ) ) ( ( (lv_op_1_1= '=' | lv_op_1_2= '+=' ) ) ) ( ( (lv_body_2_0= ruleAtom ) ) | ( (lv_body_3_0= ruleBlock ) ) )
            {
            // InternalUniMapperGenerator.g:2540:3: ( (lv_name_0_0= ruleId ) )
            // InternalUniMapperGenerator.g:2541:4: (lv_name_0_0= ruleId )
            {
            // InternalUniMapperGenerator.g:2541:4: (lv_name_0_0= ruleId )
            // InternalUniMapperGenerator.g:2542:5: lv_name_0_0= ruleId
            {

            					newCompositeNode(grammarAccess.getLabeledElementAccess().getNameIdParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_42);
            lv_name_0_0=ruleId();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLabeledElementRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"net.unicoen.UniMapperGenerator.Id");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUniMapperGenerator.g:2559:3: ( ( (lv_op_1_1= '=' | lv_op_1_2= '+=' ) ) )
            // InternalUniMapperGenerator.g:2560:4: ( (lv_op_1_1= '=' | lv_op_1_2= '+=' ) )
            {
            // InternalUniMapperGenerator.g:2560:4: ( (lv_op_1_1= '=' | lv_op_1_2= '+=' ) )
            // InternalUniMapperGenerator.g:2561:5: (lv_op_1_1= '=' | lv_op_1_2= '+=' )
            {
            // InternalUniMapperGenerator.g:2561:5: (lv_op_1_1= '=' | lv_op_1_2= '+=' )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==35) ) {
                alt39=1;
            }
            else if ( (LA39_0==51) ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // InternalUniMapperGenerator.g:2562:6: lv_op_1_1= '='
                    {
                    lv_op_1_1=(Token)match(input,35,FOLLOW_43); 

                    						newLeafNode(lv_op_1_1, grammarAccess.getLabeledElementAccess().getOpEqualsSignKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLabeledElementRule());
                    						}
                    						setWithLastConsumed(current, "op", lv_op_1_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalUniMapperGenerator.g:2573:6: lv_op_1_2= '+='
                    {
                    lv_op_1_2=(Token)match(input,51,FOLLOW_43); 

                    						newLeafNode(lv_op_1_2, grammarAccess.getLabeledElementAccess().getOpPlusSignEqualsSignKeyword_1_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLabeledElementRule());
                    						}
                    						setWithLastConsumed(current, "op", lv_op_1_2, null);
                    					

                    }
                    break;

            }


            }


            }

            // InternalUniMapperGenerator.g:2586:3: ( ( (lv_body_2_0= ruleAtom ) ) | ( (lv_body_3_0= ruleBlock ) ) )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_RULE_REF||LA40_0==RULE_MYSTRING||LA40_0==RULE_TOKEN_REF||(LA40_0>=60 && LA40_0<=62)) ) {
                alt40=1;
            }
            else if ( (LA40_0==55) ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // InternalUniMapperGenerator.g:2587:4: ( (lv_body_2_0= ruleAtom ) )
                    {
                    // InternalUniMapperGenerator.g:2587:4: ( (lv_body_2_0= ruleAtom ) )
                    // InternalUniMapperGenerator.g:2588:5: (lv_body_2_0= ruleAtom )
                    {
                    // InternalUniMapperGenerator.g:2588:5: (lv_body_2_0= ruleAtom )
                    // InternalUniMapperGenerator.g:2589:6: lv_body_2_0= ruleAtom
                    {

                    						newCompositeNode(grammarAccess.getLabeledElementAccess().getBodyAtomParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_body_2_0=ruleAtom();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLabeledElementRule());
                    						}
                    						set(
                    							current,
                    							"body",
                    							lv_body_2_0,
                    							"net.unicoen.UniMapperGenerator.Atom");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalUniMapperGenerator.g:2607:4: ( (lv_body_3_0= ruleBlock ) )
                    {
                    // InternalUniMapperGenerator.g:2607:4: ( (lv_body_3_0= ruleBlock ) )
                    // InternalUniMapperGenerator.g:2608:5: (lv_body_3_0= ruleBlock )
                    {
                    // InternalUniMapperGenerator.g:2608:5: (lv_body_3_0= ruleBlock )
                    // InternalUniMapperGenerator.g:2609:6: lv_body_3_0= ruleBlock
                    {

                    						newCompositeNode(grammarAccess.getLabeledElementAccess().getBodyBlockParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_body_3_0=ruleBlock();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLabeledElementRule());
                    						}
                    						set(
                    							current,
                    							"body",
                    							lv_body_3_0,
                    							"net.unicoen.UniMapperGenerator.Block");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLabeledElement"


    // $ANTLR start "entryRuleEbnfSuffix"
    // InternalUniMapperGenerator.g:2631:1: entryRuleEbnfSuffix returns [EObject current=null] : iv_ruleEbnfSuffix= ruleEbnfSuffix EOF ;
    public final EObject entryRuleEbnfSuffix() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEbnfSuffix = null;


        try {
            // InternalUniMapperGenerator.g:2631:51: (iv_ruleEbnfSuffix= ruleEbnfSuffix EOF )
            // InternalUniMapperGenerator.g:2632:2: iv_ruleEbnfSuffix= ruleEbnfSuffix EOF
            {
             newCompositeNode(grammarAccess.getEbnfSuffixRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEbnfSuffix=ruleEbnfSuffix();

            state._fsp--;

             current =iv_ruleEbnfSuffix; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEbnfSuffix"


    // $ANTLR start "ruleEbnfSuffix"
    // InternalUniMapperGenerator.g:2638:1: ruleEbnfSuffix returns [EObject current=null] : ( ( ( (lv_operator_0_0= '?' ) ) ( (lv_nongreedy_1_0= '?' ) )? ) | ( ( (lv_operator_2_0= '*' ) ) ( (lv_nongreedy_3_0= '?' ) )? ) | ( ( (lv_operator_4_0= '+' ) ) ( (lv_nongreedy_5_0= '?' ) )? ) ) ;
    public final EObject ruleEbnfSuffix() throws RecognitionException {
        EObject current = null;

        Token lv_operator_0_0=null;
        Token lv_nongreedy_1_0=null;
        Token lv_operator_2_0=null;
        Token lv_nongreedy_3_0=null;
        Token lv_operator_4_0=null;
        Token lv_nongreedy_5_0=null;


        	enterRule();

        try {
            // InternalUniMapperGenerator.g:2644:2: ( ( ( ( (lv_operator_0_0= '?' ) ) ( (lv_nongreedy_1_0= '?' ) )? ) | ( ( (lv_operator_2_0= '*' ) ) ( (lv_nongreedy_3_0= '?' ) )? ) | ( ( (lv_operator_4_0= '+' ) ) ( (lv_nongreedy_5_0= '?' ) )? ) ) )
            // InternalUniMapperGenerator.g:2645:2: ( ( ( (lv_operator_0_0= '?' ) ) ( (lv_nongreedy_1_0= '?' ) )? ) | ( ( (lv_operator_2_0= '*' ) ) ( (lv_nongreedy_3_0= '?' ) )? ) | ( ( (lv_operator_4_0= '+' ) ) ( (lv_nongreedy_5_0= '?' ) )? ) )
            {
            // InternalUniMapperGenerator.g:2645:2: ( ( ( (lv_operator_0_0= '?' ) ) ( (lv_nongreedy_1_0= '?' ) )? ) | ( ( (lv_operator_2_0= '*' ) ) ( (lv_nongreedy_3_0= '?' ) )? ) | ( ( (lv_operator_4_0= '+' ) ) ( (lv_nongreedy_5_0= '?' ) )? ) )
            int alt44=3;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt44=1;
                }
                break;
            case 53:
                {
                alt44=2;
                }
                break;
            case 54:
                {
                alt44=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // InternalUniMapperGenerator.g:2646:3: ( ( (lv_operator_0_0= '?' ) ) ( (lv_nongreedy_1_0= '?' ) )? )
                    {
                    // InternalUniMapperGenerator.g:2646:3: ( ( (lv_operator_0_0= '?' ) ) ( (lv_nongreedy_1_0= '?' ) )? )
                    // InternalUniMapperGenerator.g:2647:4: ( (lv_operator_0_0= '?' ) ) ( (lv_nongreedy_1_0= '?' ) )?
                    {
                    // InternalUniMapperGenerator.g:2647:4: ( (lv_operator_0_0= '?' ) )
                    // InternalUniMapperGenerator.g:2648:5: (lv_operator_0_0= '?' )
                    {
                    // InternalUniMapperGenerator.g:2648:5: (lv_operator_0_0= '?' )
                    // InternalUniMapperGenerator.g:2649:6: lv_operator_0_0= '?'
                    {
                    lv_operator_0_0=(Token)match(input,52,FOLLOW_44); 

                    						newLeafNode(lv_operator_0_0, grammarAccess.getEbnfSuffixAccess().getOperatorQuestionMarkKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEbnfSuffixRule());
                    						}
                    						setWithLastConsumed(current, "operator", lv_operator_0_0, "?");
                    					

                    }


                    }

                    // InternalUniMapperGenerator.g:2661:4: ( (lv_nongreedy_1_0= '?' ) )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==52) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // InternalUniMapperGenerator.g:2662:5: (lv_nongreedy_1_0= '?' )
                            {
                            // InternalUniMapperGenerator.g:2662:5: (lv_nongreedy_1_0= '?' )
                            // InternalUniMapperGenerator.g:2663:6: lv_nongreedy_1_0= '?'
                            {
                            lv_nongreedy_1_0=(Token)match(input,52,FOLLOW_2); 

                            						newLeafNode(lv_nongreedy_1_0, grammarAccess.getEbnfSuffixAccess().getNongreedyQuestionMarkKeyword_0_1_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getEbnfSuffixRule());
                            						}
                            						setWithLastConsumed(current, "nongreedy", lv_nongreedy_1_0, "?");
                            					

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalUniMapperGenerator.g:2677:3: ( ( (lv_operator_2_0= '*' ) ) ( (lv_nongreedy_3_0= '?' ) )? )
                    {
                    // InternalUniMapperGenerator.g:2677:3: ( ( (lv_operator_2_0= '*' ) ) ( (lv_nongreedy_3_0= '?' ) )? )
                    // InternalUniMapperGenerator.g:2678:4: ( (lv_operator_2_0= '*' ) ) ( (lv_nongreedy_3_0= '?' ) )?
                    {
                    // InternalUniMapperGenerator.g:2678:4: ( (lv_operator_2_0= '*' ) )
                    // InternalUniMapperGenerator.g:2679:5: (lv_operator_2_0= '*' )
                    {
                    // InternalUniMapperGenerator.g:2679:5: (lv_operator_2_0= '*' )
                    // InternalUniMapperGenerator.g:2680:6: lv_operator_2_0= '*'
                    {
                    lv_operator_2_0=(Token)match(input,53,FOLLOW_44); 

                    						newLeafNode(lv_operator_2_0, grammarAccess.getEbnfSuffixAccess().getOperatorAsteriskKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEbnfSuffixRule());
                    						}
                    						setWithLastConsumed(current, "operator", lv_operator_2_0, "*");
                    					

                    }


                    }

                    // InternalUniMapperGenerator.g:2692:4: ( (lv_nongreedy_3_0= '?' ) )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==52) ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // InternalUniMapperGenerator.g:2693:5: (lv_nongreedy_3_0= '?' )
                            {
                            // InternalUniMapperGenerator.g:2693:5: (lv_nongreedy_3_0= '?' )
                            // InternalUniMapperGenerator.g:2694:6: lv_nongreedy_3_0= '?'
                            {
                            lv_nongreedy_3_0=(Token)match(input,52,FOLLOW_2); 

                            						newLeafNode(lv_nongreedy_3_0, grammarAccess.getEbnfSuffixAccess().getNongreedyQuestionMarkKeyword_1_1_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getEbnfSuffixRule());
                            						}
                            						setWithLastConsumed(current, "nongreedy", lv_nongreedy_3_0, "?");
                            					

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalUniMapperGenerator.g:2708:3: ( ( (lv_operator_4_0= '+' ) ) ( (lv_nongreedy_5_0= '?' ) )? )
                    {
                    // InternalUniMapperGenerator.g:2708:3: ( ( (lv_operator_4_0= '+' ) ) ( (lv_nongreedy_5_0= '?' ) )? )
                    // InternalUniMapperGenerator.g:2709:4: ( (lv_operator_4_0= '+' ) ) ( (lv_nongreedy_5_0= '?' ) )?
                    {
                    // InternalUniMapperGenerator.g:2709:4: ( (lv_operator_4_0= '+' ) )
                    // InternalUniMapperGenerator.g:2710:5: (lv_operator_4_0= '+' )
                    {
                    // InternalUniMapperGenerator.g:2710:5: (lv_operator_4_0= '+' )
                    // InternalUniMapperGenerator.g:2711:6: lv_operator_4_0= '+'
                    {
                    lv_operator_4_0=(Token)match(input,54,FOLLOW_44); 

                    						newLeafNode(lv_operator_4_0, grammarAccess.getEbnfSuffixAccess().getOperatorPlusSignKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEbnfSuffixRule());
                    						}
                    						setWithLastConsumed(current, "operator", lv_operator_4_0, "+");
                    					

                    }


                    }

                    // InternalUniMapperGenerator.g:2723:4: ( (lv_nongreedy_5_0= '?' ) )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==52) ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // InternalUniMapperGenerator.g:2724:5: (lv_nongreedy_5_0= '?' )
                            {
                            // InternalUniMapperGenerator.g:2724:5: (lv_nongreedy_5_0= '?' )
                            // InternalUniMapperGenerator.g:2725:6: lv_nongreedy_5_0= '?'
                            {
                            lv_nongreedy_5_0=(Token)match(input,52,FOLLOW_2); 

                            						newLeafNode(lv_nongreedy_5_0, grammarAccess.getEbnfSuffixAccess().getNongreedyQuestionMarkKeyword_2_1_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getEbnfSuffixRule());
                            						}
                            						setWithLastConsumed(current, "nongreedy", lv_nongreedy_5_0, "?");
                            					

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEbnfSuffix"


    // $ANTLR start "entryRuleBlock"
    // InternalUniMapperGenerator.g:2742:1: entryRuleBlock returns [EObject current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final EObject entryRuleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlock = null;


        try {
            // InternalUniMapperGenerator.g:2742:46: (iv_ruleBlock= ruleBlock EOF )
            // InternalUniMapperGenerator.g:2743:2: iv_ruleBlock= ruleBlock EOF
            {
             newCompositeNode(grammarAccess.getBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBlock=ruleBlock();

            state._fsp--;

             current =iv_ruleBlock; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBlock"


    // $ANTLR start "ruleBlock"
    // InternalUniMapperGenerator.g:2749:1: ruleBlock returns [EObject current=null] : (otherlv_0= '(' ( ( (lv_options_1_0= ruleOptions ) )? ( (lv_actions_2_0= ruleRuleAction ) )* ( (lv_colon_3_0= RULE_COLON ) ) )? ( (lv_body_4_0= ruleAltList ) ) otherlv_5= ')' ) ;
    public final EObject ruleBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_colon_3_0=null;
        Token otherlv_5=null;
        EObject lv_options_1_0 = null;

        EObject lv_actions_2_0 = null;

        EObject lv_body_4_0 = null;



        	enterRule();

        try {
            // InternalUniMapperGenerator.g:2755:2: ( (otherlv_0= '(' ( ( (lv_options_1_0= ruleOptions ) )? ( (lv_actions_2_0= ruleRuleAction ) )* ( (lv_colon_3_0= RULE_COLON ) ) )? ( (lv_body_4_0= ruleAltList ) ) otherlv_5= ')' ) )
            // InternalUniMapperGenerator.g:2756:2: (otherlv_0= '(' ( ( (lv_options_1_0= ruleOptions ) )? ( (lv_actions_2_0= ruleRuleAction ) )* ( (lv_colon_3_0= RULE_COLON ) ) )? ( (lv_body_4_0= ruleAltList ) ) otherlv_5= ')' )
            {
            // InternalUniMapperGenerator.g:2756:2: (otherlv_0= '(' ( ( (lv_options_1_0= ruleOptions ) )? ( (lv_actions_2_0= ruleRuleAction ) )* ( (lv_colon_3_0= RULE_COLON ) ) )? ( (lv_body_4_0= ruleAltList ) ) otherlv_5= ')' )
            // InternalUniMapperGenerator.g:2757:3: otherlv_0= '(' ( ( (lv_options_1_0= ruleOptions ) )? ( (lv_actions_2_0= ruleRuleAction ) )* ( (lv_colon_3_0= RULE_COLON ) ) )? ( (lv_body_4_0= ruleAltList ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,55,FOLLOW_45); 

            			newLeafNode(otherlv_0, grammarAccess.getBlockAccess().getLeftParenthesisKeyword_0());
            		
            // InternalUniMapperGenerator.g:2761:3: ( ( (lv_options_1_0= ruleOptions ) )? ( (lv_actions_2_0= ruleRuleAction ) )* ( (lv_colon_3_0= RULE_COLON ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_OPTIONS_SPEC||LA47_0==RULE_COLON||LA47_0==38) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalUniMapperGenerator.g:2762:4: ( (lv_options_1_0= ruleOptions ) )? ( (lv_actions_2_0= ruleRuleAction ) )* ( (lv_colon_3_0= RULE_COLON ) )
                    {
                    // InternalUniMapperGenerator.g:2762:4: ( (lv_options_1_0= ruleOptions ) )?
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==RULE_OPTIONS_SPEC) ) {
                        alt45=1;
                    }
                    switch (alt45) {
                        case 1 :
                            // InternalUniMapperGenerator.g:2763:5: (lv_options_1_0= ruleOptions )
                            {
                            // InternalUniMapperGenerator.g:2763:5: (lv_options_1_0= ruleOptions )
                            // InternalUniMapperGenerator.g:2764:6: lv_options_1_0= ruleOptions
                            {

                            						newCompositeNode(grammarAccess.getBlockAccess().getOptionsOptionsParserRuleCall_1_0_0());
                            					
                            pushFollow(FOLLOW_46);
                            lv_options_1_0=ruleOptions();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getBlockRule());
                            						}
                            						set(
                            							current,
                            							"options",
                            							lv_options_1_0,
                            							"net.unicoen.UniMapperGenerator.Options");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    // InternalUniMapperGenerator.g:2781:4: ( (lv_actions_2_0= ruleRuleAction ) )*
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==38) ) {
                            alt46=1;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // InternalUniMapperGenerator.g:2782:5: (lv_actions_2_0= ruleRuleAction )
                    	    {
                    	    // InternalUniMapperGenerator.g:2782:5: (lv_actions_2_0= ruleRuleAction )
                    	    // InternalUniMapperGenerator.g:2783:6: lv_actions_2_0= ruleRuleAction
                    	    {

                    	    						newCompositeNode(grammarAccess.getBlockAccess().getActionsRuleActionParserRuleCall_1_1_0());
                    	    					
                    	    pushFollow(FOLLOW_46);
                    	    lv_actions_2_0=ruleRuleAction();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getBlockRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"actions",
                    	    							lv_actions_2_0,
                    	    							"net.unicoen.UniMapperGenerator.RuleAction");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop46;
                        }
                    } while (true);

                    // InternalUniMapperGenerator.g:2800:4: ( (lv_colon_3_0= RULE_COLON ) )
                    // InternalUniMapperGenerator.g:2801:5: (lv_colon_3_0= RULE_COLON )
                    {
                    // InternalUniMapperGenerator.g:2801:5: (lv_colon_3_0= RULE_COLON )
                    // InternalUniMapperGenerator.g:2802:6: lv_colon_3_0= RULE_COLON
                    {
                    lv_colon_3_0=(Token)match(input,RULE_COLON,FOLLOW_45); 

                    						newLeafNode(lv_colon_3_0, grammarAccess.getBlockAccess().getColonCOLONTerminalRuleCall_1_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBlockRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"colon",
                    							lv_colon_3_0,
                    							"net.unicoen.UniMapperGenerator.COLON");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalUniMapperGenerator.g:2819:3: ( (lv_body_4_0= ruleAltList ) )
            // InternalUniMapperGenerator.g:2820:4: (lv_body_4_0= ruleAltList )
            {
            // InternalUniMapperGenerator.g:2820:4: (lv_body_4_0= ruleAltList )
            // InternalUniMapperGenerator.g:2821:5: lv_body_4_0= ruleAltList
            {

            					newCompositeNode(grammarAccess.getBlockAccess().getBodyAltListParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_47);
            lv_body_4_0=ruleAltList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBlockRule());
            					}
            					set(
            						current,
            						"body",
            						lv_body_4_0,
            						"net.unicoen.UniMapperGenerator.AltList");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,56,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getBlockAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBlock"


    // $ANTLR start "entryRuleAltList"
    // InternalUniMapperGenerator.g:2846:1: entryRuleAltList returns [EObject current=null] : iv_ruleAltList= ruleAltList EOF ;
    public final EObject entryRuleAltList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAltList = null;


        try {
            // InternalUniMapperGenerator.g:2846:48: (iv_ruleAltList= ruleAltList EOF )
            // InternalUniMapperGenerator.g:2847:2: iv_ruleAltList= ruleAltList EOF
            {
             newCompositeNode(grammarAccess.getAltListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAltList=ruleAltList();

            state._fsp--;

             current =iv_ruleAltList; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAltList"


    // $ANTLR start "ruleAltList"
    // InternalUniMapperGenerator.g:2853:1: ruleAltList returns [EObject current=null] : ( ( (lv_alternatives_0_0= ruleAlternative ) ) (otherlv_1= '|' ( (lv_alternatives_2_0= ruleAlternative ) ) )* ) ;
    public final EObject ruleAltList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_alternatives_0_0 = null;

        EObject lv_alternatives_2_0 = null;



        	enterRule();

        try {
            // InternalUniMapperGenerator.g:2859:2: ( ( ( (lv_alternatives_0_0= ruleAlternative ) ) (otherlv_1= '|' ( (lv_alternatives_2_0= ruleAlternative ) ) )* ) )
            // InternalUniMapperGenerator.g:2860:2: ( ( (lv_alternatives_0_0= ruleAlternative ) ) (otherlv_1= '|' ( (lv_alternatives_2_0= ruleAlternative ) ) )* )
            {
            // InternalUniMapperGenerator.g:2860:2: ( ( (lv_alternatives_0_0= ruleAlternative ) ) (otherlv_1= '|' ( (lv_alternatives_2_0= ruleAlternative ) ) )* )
            // InternalUniMapperGenerator.g:2861:3: ( (lv_alternatives_0_0= ruleAlternative ) ) (otherlv_1= '|' ( (lv_alternatives_2_0= ruleAlternative ) ) )*
            {
            // InternalUniMapperGenerator.g:2861:3: ( (lv_alternatives_0_0= ruleAlternative ) )
            // InternalUniMapperGenerator.g:2862:4: (lv_alternatives_0_0= ruleAlternative )
            {
            // InternalUniMapperGenerator.g:2862:4: (lv_alternatives_0_0= ruleAlternative )
            // InternalUniMapperGenerator.g:2863:5: lv_alternatives_0_0= ruleAlternative
            {

            					newCompositeNode(grammarAccess.getAltListAccess().getAlternativesAlternativeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_35);
            lv_alternatives_0_0=ruleAlternative();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAltListRule());
            					}
            					add(
            						current,
            						"alternatives",
            						lv_alternatives_0_0,
            						"net.unicoen.UniMapperGenerator.Alternative");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUniMapperGenerator.g:2880:3: (otherlv_1= '|' ( (lv_alternatives_2_0= ruleAlternative ) ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==49) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalUniMapperGenerator.g:2881:4: otherlv_1= '|' ( (lv_alternatives_2_0= ruleAlternative ) )
            	    {
            	    otherlv_1=(Token)match(input,49,FOLLOW_48); 

            	    				newLeafNode(otherlv_1, grammarAccess.getAltListAccess().getVerticalLineKeyword_1_0());
            	    			
            	    // InternalUniMapperGenerator.g:2885:4: ( (lv_alternatives_2_0= ruleAlternative ) )
            	    // InternalUniMapperGenerator.g:2886:5: (lv_alternatives_2_0= ruleAlternative )
            	    {
            	    // InternalUniMapperGenerator.g:2886:5: (lv_alternatives_2_0= ruleAlternative )
            	    // InternalUniMapperGenerator.g:2887:6: lv_alternatives_2_0= ruleAlternative
            	    {

            	    						newCompositeNode(grammarAccess.getAltListAccess().getAlternativesAlternativeParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_35);
            	    lv_alternatives_2_0=ruleAlternative();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAltListRule());
            	    						}
            	    						add(
            	    							current,
            	    							"alternatives",
            	    							lv_alternatives_2_0,
            	    							"net.unicoen.UniMapperGenerator.Alternative");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAltList"


    // $ANTLR start "entryRuleAtom"
    // InternalUniMapperGenerator.g:2909:1: entryRuleAtom returns [EObject current=null] : iv_ruleAtom= ruleAtom EOF ;
    public final EObject entryRuleAtom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtom = null;


        try {
            // InternalUniMapperGenerator.g:2909:45: (iv_ruleAtom= ruleAtom EOF )
            // InternalUniMapperGenerator.g:2910:2: iv_ruleAtom= ruleAtom EOF
            {
             newCompositeNode(grammarAccess.getAtomRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtom=ruleAtom();

            state._fsp--;

             current =iv_ruleAtom; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAtom"


    // $ANTLR start "ruleAtom"
    // InternalUniMapperGenerator.g:2916:1: ruleAtom returns [EObject current=null] : ( ( (lv_body_0_1= ruleRange | lv_body_0_2= ruleTerminal | lv_body_0_3= ruleRuleRef | lv_body_0_4= ruleNotSet | lv_body_0_5= ruleWildcard ) ) ) ;
    public final EObject ruleAtom() throws RecognitionException {
        EObject current = null;

        EObject lv_body_0_1 = null;

        EObject lv_body_0_2 = null;

        EObject lv_body_0_3 = null;

        EObject lv_body_0_4 = null;

        EObject lv_body_0_5 = null;



        	enterRule();

        try {
            // InternalUniMapperGenerator.g:2922:2: ( ( ( (lv_body_0_1= ruleRange | lv_body_0_2= ruleTerminal | lv_body_0_3= ruleRuleRef | lv_body_0_4= ruleNotSet | lv_body_0_5= ruleWildcard ) ) ) )
            // InternalUniMapperGenerator.g:2923:2: ( ( (lv_body_0_1= ruleRange | lv_body_0_2= ruleTerminal | lv_body_0_3= ruleRuleRef | lv_body_0_4= ruleNotSet | lv_body_0_5= ruleWildcard ) ) )
            {
            // InternalUniMapperGenerator.g:2923:2: ( ( (lv_body_0_1= ruleRange | lv_body_0_2= ruleTerminal | lv_body_0_3= ruleRuleRef | lv_body_0_4= ruleNotSet | lv_body_0_5= ruleWildcard ) ) )
            // InternalUniMapperGenerator.g:2924:3: ( (lv_body_0_1= ruleRange | lv_body_0_2= ruleTerminal | lv_body_0_3= ruleRuleRef | lv_body_0_4= ruleNotSet | lv_body_0_5= ruleWildcard ) )
            {
            // InternalUniMapperGenerator.g:2924:3: ( (lv_body_0_1= ruleRange | lv_body_0_2= ruleTerminal | lv_body_0_3= ruleRuleRef | lv_body_0_4= ruleNotSet | lv_body_0_5= ruleWildcard ) )
            // InternalUniMapperGenerator.g:2925:4: (lv_body_0_1= ruleRange | lv_body_0_2= ruleTerminal | lv_body_0_3= ruleRuleRef | lv_body_0_4= ruleNotSet | lv_body_0_5= ruleWildcard )
            {
            // InternalUniMapperGenerator.g:2925:4: (lv_body_0_1= ruleRange | lv_body_0_2= ruleTerminal | lv_body_0_3= ruleRuleRef | lv_body_0_4= ruleNotSet | lv_body_0_5= ruleWildcard )
            int alt49=5;
            switch ( input.LA(1) ) {
            case RULE_MYSTRING:
                {
                int LA49_1 = input.LA(2);

                if ( (LA49_1==EOF||(LA49_1>=RULE_SEMICOLON && LA49_1<=RULE_RULE_REF)||(LA49_1>=RULE_MYSTRING && LA49_1<=RULE_ACTION)||(LA49_1>=RULE_DOLLAR && LA49_1<=RULE_TOKEN_REF)||(LA49_1>=44 && LA49_1<=45)||(LA49_1>=49 && LA49_1<=50)||(LA49_1>=52 && LA49_1<=57)||(LA49_1>=60 && LA49_1<=62)) ) {
                    alt49=2;
                }
                else if ( (LA49_1==59) ) {
                    alt49=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 49, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_TOKEN_REF:
            case 60:
                {
                alt49=2;
                }
                break;
            case RULE_RULE_REF:
                {
                alt49=3;
                }
                break;
            case 61:
                {
                alt49=4;
                }
                break;
            case 62:
                {
                alt49=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }

            switch (alt49) {
                case 1 :
                    // InternalUniMapperGenerator.g:2926:5: lv_body_0_1= ruleRange
                    {

                    					newCompositeNode(grammarAccess.getAtomAccess().getBodyRangeParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_body_0_1=ruleRange();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAtomRule());
                    					}
                    					set(
                    						current,
                    						"body",
                    						lv_body_0_1,
                    						"net.unicoen.UniMapperGenerator.Range");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 2 :
                    // InternalUniMapperGenerator.g:2942:5: lv_body_0_2= ruleTerminal
                    {

                    					newCompositeNode(grammarAccess.getAtomAccess().getBodyTerminalParserRuleCall_0_1());
                    				
                    pushFollow(FOLLOW_2);
                    lv_body_0_2=ruleTerminal();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAtomRule());
                    					}
                    					set(
                    						current,
                    						"body",
                    						lv_body_0_2,
                    						"net.unicoen.UniMapperGenerator.Terminal");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 3 :
                    // InternalUniMapperGenerator.g:2958:5: lv_body_0_3= ruleRuleRef
                    {

                    					newCompositeNode(grammarAccess.getAtomAccess().getBodyRuleRefParserRuleCall_0_2());
                    				
                    pushFollow(FOLLOW_2);
                    lv_body_0_3=ruleRuleRef();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAtomRule());
                    					}
                    					set(
                    						current,
                    						"body",
                    						lv_body_0_3,
                    						"net.unicoen.UniMapperGenerator.RuleRef");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 4 :
                    // InternalUniMapperGenerator.g:2974:5: lv_body_0_4= ruleNotSet
                    {

                    					newCompositeNode(grammarAccess.getAtomAccess().getBodyNotSetParserRuleCall_0_3());
                    				
                    pushFollow(FOLLOW_2);
                    lv_body_0_4=ruleNotSet();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAtomRule());
                    					}
                    					set(
                    						current,
                    						"body",
                    						lv_body_0_4,
                    						"net.unicoen.UniMapperGenerator.NotSet");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 5 :
                    // InternalUniMapperGenerator.g:2990:5: lv_body_0_5= ruleWildcard
                    {

                    					newCompositeNode(grammarAccess.getAtomAccess().getBodyWildcardParserRuleCall_0_4());
                    				
                    pushFollow(FOLLOW_2);
                    lv_body_0_5=ruleWildcard();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAtomRule());
                    					}
                    					set(
                    						current,
                    						"body",
                    						lv_body_0_5,
                    						"net.unicoen.UniMapperGenerator.Wildcard");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAtom"


    // $ANTLR start "entryRuleRuleRef"
    // InternalUniMapperGenerator.g:3011:1: entryRuleRuleRef returns [EObject current=null] : iv_ruleRuleRef= ruleRuleRef EOF ;
    public final EObject entryRuleRuleRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleRef = null;


        try {
            // InternalUniMapperGenerator.g:3011:48: (iv_ruleRuleRef= ruleRuleRef EOF )
            // InternalUniMapperGenerator.g:3012:2: iv_ruleRuleRef= ruleRuleRef EOF
            {
             newCompositeNode(grammarAccess.getRuleRefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRuleRef=ruleRuleRef();

            state._fsp--;

             current =iv_ruleRuleRef; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRuleRef"


    // $ANTLR start "ruleRuleRef"
    // InternalUniMapperGenerator.g:3018:1: ruleRuleRef returns [EObject current=null] : ( ( (otherlv_0= RULE_RULE_REF ) ) ( (lv_options_1_0= ruleElementOptions ) )? ) ;
    public final EObject ruleRuleRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_options_1_0 = null;



        	enterRule();

        try {
            // InternalUniMapperGenerator.g:3024:2: ( ( ( (otherlv_0= RULE_RULE_REF ) ) ( (lv_options_1_0= ruleElementOptions ) )? ) )
            // InternalUniMapperGenerator.g:3025:2: ( ( (otherlv_0= RULE_RULE_REF ) ) ( (lv_options_1_0= ruleElementOptions ) )? )
            {
            // InternalUniMapperGenerator.g:3025:2: ( ( (otherlv_0= RULE_RULE_REF ) ) ( (lv_options_1_0= ruleElementOptions ) )? )
            // InternalUniMapperGenerator.g:3026:3: ( (otherlv_0= RULE_RULE_REF ) ) ( (lv_options_1_0= ruleElementOptions ) )?
            {
            // InternalUniMapperGenerator.g:3026:3: ( (otherlv_0= RULE_RULE_REF ) )
            // InternalUniMapperGenerator.g:3027:4: (otherlv_0= RULE_RULE_REF )
            {
            // InternalUniMapperGenerator.g:3027:4: (otherlv_0= RULE_RULE_REF )
            // InternalUniMapperGenerator.g:3028:5: otherlv_0= RULE_RULE_REF
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRuleRefRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_RULE_REF,FOLLOW_41); 

            					newLeafNode(otherlv_0, grammarAccess.getRuleRefAccess().getReferenceParserRuleCrossReference_0_0());
            				

            }


            }

            // InternalUniMapperGenerator.g:3039:3: ( (lv_options_1_0= ruleElementOptions ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==57) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalUniMapperGenerator.g:3040:4: (lv_options_1_0= ruleElementOptions )
                    {
                    // InternalUniMapperGenerator.g:3040:4: (lv_options_1_0= ruleElementOptions )
                    // InternalUniMapperGenerator.g:3041:5: lv_options_1_0= ruleElementOptions
                    {

                    					newCompositeNode(grammarAccess.getRuleRefAccess().getOptionsElementOptionsParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_options_1_0=ruleElementOptions();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRuleRefRule());
                    					}
                    					set(
                    						current,
                    						"options",
                    						lv_options_1_0,
                    						"net.unicoen.UniMapperGenerator.ElementOptions");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRuleRef"


    // $ANTLR start "entryRuleElementOptions"
    // InternalUniMapperGenerator.g:3062:1: entryRuleElementOptions returns [EObject current=null] : iv_ruleElementOptions= ruleElementOptions EOF ;
    public final EObject entryRuleElementOptions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementOptions = null;


        try {
            // InternalUniMapperGenerator.g:3062:55: (iv_ruleElementOptions= ruleElementOptions EOF )
            // InternalUniMapperGenerator.g:3063:2: iv_ruleElementOptions= ruleElementOptions EOF
            {
             newCompositeNode(grammarAccess.getElementOptionsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElementOptions=ruleElementOptions();

            state._fsp--;

             current =iv_ruleElementOptions; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElementOptions"


    // $ANTLR start "ruleElementOptions"
    // InternalUniMapperGenerator.g:3069:1: ruleElementOptions returns [EObject current=null] : ( () otherlv_1= '<' ( ( (lv_options_2_0= ruleElementOption ) ) (otherlv_3= ',' ( (lv_options_4_0= ruleElementOption ) ) )* )? otherlv_5= '>' ) ;
    public final EObject ruleElementOptions() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_options_2_0 = null;

        EObject lv_options_4_0 = null;



        	enterRule();

        try {
            // InternalUniMapperGenerator.g:3075:2: ( ( () otherlv_1= '<' ( ( (lv_options_2_0= ruleElementOption ) ) (otherlv_3= ',' ( (lv_options_4_0= ruleElementOption ) ) )* )? otherlv_5= '>' ) )
            // InternalUniMapperGenerator.g:3076:2: ( () otherlv_1= '<' ( ( (lv_options_2_0= ruleElementOption ) ) (otherlv_3= ',' ( (lv_options_4_0= ruleElementOption ) ) )* )? otherlv_5= '>' )
            {
            // InternalUniMapperGenerator.g:3076:2: ( () otherlv_1= '<' ( ( (lv_options_2_0= ruleElementOption ) ) (otherlv_3= ',' ( (lv_options_4_0= ruleElementOption ) ) )* )? otherlv_5= '>' )
            // InternalUniMapperGenerator.g:3077:3: () otherlv_1= '<' ( ( (lv_options_2_0= ruleElementOption ) ) (otherlv_3= ',' ( (lv_options_4_0= ruleElementOption ) ) )* )? otherlv_5= '>'
            {
            // InternalUniMapperGenerator.g:3077:3: ()
            // InternalUniMapperGenerator.g:3078:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getElementOptionsAccess().getElementOptionsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,57,FOLLOW_49); 

            			newLeafNode(otherlv_1, grammarAccess.getElementOptionsAccess().getLessThanSignKeyword_1());
            		
            // InternalUniMapperGenerator.g:3088:3: ( ( (lv_options_2_0= ruleElementOption ) ) (otherlv_3= ',' ( (lv_options_4_0= ruleElementOption ) ) )* )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_RULE_REF||LA52_0==RULE_TOKEN_REF) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalUniMapperGenerator.g:3089:4: ( (lv_options_2_0= ruleElementOption ) ) (otherlv_3= ',' ( (lv_options_4_0= ruleElementOption ) ) )*
                    {
                    // InternalUniMapperGenerator.g:3089:4: ( (lv_options_2_0= ruleElementOption ) )
                    // InternalUniMapperGenerator.g:3090:5: (lv_options_2_0= ruleElementOption )
                    {
                    // InternalUniMapperGenerator.g:3090:5: (lv_options_2_0= ruleElementOption )
                    // InternalUniMapperGenerator.g:3091:6: lv_options_2_0= ruleElementOption
                    {

                    						newCompositeNode(grammarAccess.getElementOptionsAccess().getOptionsElementOptionParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_50);
                    lv_options_2_0=ruleElementOption();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getElementOptionsRule());
                    						}
                    						add(
                    							current,
                    							"options",
                    							lv_options_2_0,
                    							"net.unicoen.UniMapperGenerator.ElementOption");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalUniMapperGenerator.g:3108:4: (otherlv_3= ',' ( (lv_options_4_0= ruleElementOption ) ) )*
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==37) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // InternalUniMapperGenerator.g:3109:5: otherlv_3= ',' ( (lv_options_4_0= ruleElementOption ) )
                    	    {
                    	    otherlv_3=(Token)match(input,37,FOLLOW_4); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getElementOptionsAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalUniMapperGenerator.g:3113:5: ( (lv_options_4_0= ruleElementOption ) )
                    	    // InternalUniMapperGenerator.g:3114:6: (lv_options_4_0= ruleElementOption )
                    	    {
                    	    // InternalUniMapperGenerator.g:3114:6: (lv_options_4_0= ruleElementOption )
                    	    // InternalUniMapperGenerator.g:3115:7: lv_options_4_0= ruleElementOption
                    	    {

                    	    							newCompositeNode(grammarAccess.getElementOptionsAccess().getOptionsElementOptionParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_50);
                    	    lv_options_4_0=ruleElementOption();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getElementOptionsRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"options",
                    	    								lv_options_4_0,
                    	    								"net.unicoen.UniMapperGenerator.ElementOption");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop51;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,58,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getElementOptionsAccess().getGreaterThanSignKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElementOptions"


    // $ANTLR start "entryRuleRange"
    // InternalUniMapperGenerator.g:3142:1: entryRuleRange returns [EObject current=null] : iv_ruleRange= ruleRange EOF ;
    public final EObject entryRuleRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRange = null;


        try {
            // InternalUniMapperGenerator.g:3142:46: (iv_ruleRange= ruleRange EOF )
            // InternalUniMapperGenerator.g:3143:2: iv_ruleRange= ruleRange EOF
            {
             newCompositeNode(grammarAccess.getRangeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRange=ruleRange();

            state._fsp--;

             current =iv_ruleRange; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRange"


    // $ANTLR start "ruleRange"
    // InternalUniMapperGenerator.g:3149:1: ruleRange returns [EObject current=null] : ( ( (lv_from_0_0= RULE_MYSTRING ) ) otherlv_1= '..' ( (lv_to_2_0= RULE_MYSTRING ) ) ) ;
    public final EObject ruleRange() throws RecognitionException {
        EObject current = null;

        Token lv_from_0_0=null;
        Token otherlv_1=null;
        Token lv_to_2_0=null;


        	enterRule();

        try {
            // InternalUniMapperGenerator.g:3155:2: ( ( ( (lv_from_0_0= RULE_MYSTRING ) ) otherlv_1= '..' ( (lv_to_2_0= RULE_MYSTRING ) ) ) )
            // InternalUniMapperGenerator.g:3156:2: ( ( (lv_from_0_0= RULE_MYSTRING ) ) otherlv_1= '..' ( (lv_to_2_0= RULE_MYSTRING ) ) )
            {
            // InternalUniMapperGenerator.g:3156:2: ( ( (lv_from_0_0= RULE_MYSTRING ) ) otherlv_1= '..' ( (lv_to_2_0= RULE_MYSTRING ) ) )
            // InternalUniMapperGenerator.g:3157:3: ( (lv_from_0_0= RULE_MYSTRING ) ) otherlv_1= '..' ( (lv_to_2_0= RULE_MYSTRING ) )
            {
            // InternalUniMapperGenerator.g:3157:3: ( (lv_from_0_0= RULE_MYSTRING ) )
            // InternalUniMapperGenerator.g:3158:4: (lv_from_0_0= RULE_MYSTRING )
            {
            // InternalUniMapperGenerator.g:3158:4: (lv_from_0_0= RULE_MYSTRING )
            // InternalUniMapperGenerator.g:3159:5: lv_from_0_0= RULE_MYSTRING
            {
            lv_from_0_0=(Token)match(input,RULE_MYSTRING,FOLLOW_51); 

            					newLeafNode(lv_from_0_0, grammarAccess.getRangeAccess().getFromMYSTRINGTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRangeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"from",
            						lv_from_0_0,
            						"net.unicoen.UniMapperGenerator.MYSTRING");
            				

            }


            }

            otherlv_1=(Token)match(input,59,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getRangeAccess().getFullStopFullStopKeyword_1());
            		
            // InternalUniMapperGenerator.g:3179:3: ( (lv_to_2_0= RULE_MYSTRING ) )
            // InternalUniMapperGenerator.g:3180:4: (lv_to_2_0= RULE_MYSTRING )
            {
            // InternalUniMapperGenerator.g:3180:4: (lv_to_2_0= RULE_MYSTRING )
            // InternalUniMapperGenerator.g:3181:5: lv_to_2_0= RULE_MYSTRING
            {
            lv_to_2_0=(Token)match(input,RULE_MYSTRING,FOLLOW_2); 

            					newLeafNode(lv_to_2_0, grammarAccess.getRangeAccess().getToMYSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRangeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"to",
            						lv_to_2_0,
            						"net.unicoen.UniMapperGenerator.MYSTRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRange"


    // $ANTLR start "entryRuleTerminal"
    // InternalUniMapperGenerator.g:3201:1: entryRuleTerminal returns [EObject current=null] : iv_ruleTerminal= ruleTerminal EOF ;
    public final EObject entryRuleTerminal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminal = null;


        try {
            // InternalUniMapperGenerator.g:3201:49: (iv_ruleTerminal= ruleTerminal EOF )
            // InternalUniMapperGenerator.g:3202:2: iv_ruleTerminal= ruleTerminal EOF
            {
             newCompositeNode(grammarAccess.getTerminalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTerminal=ruleTerminal();

            state._fsp--;

             current =iv_ruleTerminal; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTerminal"


    // $ANTLR start "ruleTerminal"
    // InternalUniMapperGenerator.g:3208:1: ruleTerminal returns [EObject current=null] : ( ( ( (otherlv_0= RULE_TOKEN_REF ) ) ( (lv_options_1_0= ruleElementOptions ) )? ) | ( ( (lv_literal_2_0= RULE_MYSTRING ) ) ( (lv_options_3_0= ruleElementOptions ) )? ) | ( (lv_eof_4_0= 'EOF2' ) ) ) ;
    public final EObject ruleTerminal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_literal_2_0=null;
        Token lv_eof_4_0=null;
        EObject lv_options_1_0 = null;

        EObject lv_options_3_0 = null;



        	enterRule();

        try {
            // InternalUniMapperGenerator.g:3214:2: ( ( ( ( (otherlv_0= RULE_TOKEN_REF ) ) ( (lv_options_1_0= ruleElementOptions ) )? ) | ( ( (lv_literal_2_0= RULE_MYSTRING ) ) ( (lv_options_3_0= ruleElementOptions ) )? ) | ( (lv_eof_4_0= 'EOF2' ) ) ) )
            // InternalUniMapperGenerator.g:3215:2: ( ( ( (otherlv_0= RULE_TOKEN_REF ) ) ( (lv_options_1_0= ruleElementOptions ) )? ) | ( ( (lv_literal_2_0= RULE_MYSTRING ) ) ( (lv_options_3_0= ruleElementOptions ) )? ) | ( (lv_eof_4_0= 'EOF2' ) ) )
            {
            // InternalUniMapperGenerator.g:3215:2: ( ( ( (otherlv_0= RULE_TOKEN_REF ) ) ( (lv_options_1_0= ruleElementOptions ) )? ) | ( ( (lv_literal_2_0= RULE_MYSTRING ) ) ( (lv_options_3_0= ruleElementOptions ) )? ) | ( (lv_eof_4_0= 'EOF2' ) ) )
            int alt55=3;
            switch ( input.LA(1) ) {
            case RULE_TOKEN_REF:
                {
                alt55=1;
                }
                break;
            case RULE_MYSTRING:
                {
                alt55=2;
                }
                break;
            case 60:
                {
                alt55=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }

            switch (alt55) {
                case 1 :
                    // InternalUniMapperGenerator.g:3216:3: ( ( (otherlv_0= RULE_TOKEN_REF ) ) ( (lv_options_1_0= ruleElementOptions ) )? )
                    {
                    // InternalUniMapperGenerator.g:3216:3: ( ( (otherlv_0= RULE_TOKEN_REF ) ) ( (lv_options_1_0= ruleElementOptions ) )? )
                    // InternalUniMapperGenerator.g:3217:4: ( (otherlv_0= RULE_TOKEN_REF ) ) ( (lv_options_1_0= ruleElementOptions ) )?
                    {
                    // InternalUniMapperGenerator.g:3217:4: ( (otherlv_0= RULE_TOKEN_REF ) )
                    // InternalUniMapperGenerator.g:3218:5: (otherlv_0= RULE_TOKEN_REF )
                    {
                    // InternalUniMapperGenerator.g:3218:5: (otherlv_0= RULE_TOKEN_REF )
                    // InternalUniMapperGenerator.g:3219:6: otherlv_0= RULE_TOKEN_REF
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTerminalRule());
                    						}
                    					
                    otherlv_0=(Token)match(input,RULE_TOKEN_REF,FOLLOW_41); 

                    						newLeafNode(otherlv_0, grammarAccess.getTerminalAccess().getReferenceTokenRefCrossReference_0_0_0());
                    					

                    }


                    }

                    // InternalUniMapperGenerator.g:3230:4: ( (lv_options_1_0= ruleElementOptions ) )?
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==57) ) {
                        alt53=1;
                    }
                    switch (alt53) {
                        case 1 :
                            // InternalUniMapperGenerator.g:3231:5: (lv_options_1_0= ruleElementOptions )
                            {
                            // InternalUniMapperGenerator.g:3231:5: (lv_options_1_0= ruleElementOptions )
                            // InternalUniMapperGenerator.g:3232:6: lv_options_1_0= ruleElementOptions
                            {

                            						newCompositeNode(grammarAccess.getTerminalAccess().getOptionsElementOptionsParserRuleCall_0_1_0());
                            					
                            pushFollow(FOLLOW_2);
                            lv_options_1_0=ruleElementOptions();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getTerminalRule());
                            						}
                            						set(
                            							current,
                            							"options",
                            							lv_options_1_0,
                            							"net.unicoen.UniMapperGenerator.ElementOptions");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalUniMapperGenerator.g:3251:3: ( ( (lv_literal_2_0= RULE_MYSTRING ) ) ( (lv_options_3_0= ruleElementOptions ) )? )
                    {
                    // InternalUniMapperGenerator.g:3251:3: ( ( (lv_literal_2_0= RULE_MYSTRING ) ) ( (lv_options_3_0= ruleElementOptions ) )? )
                    // InternalUniMapperGenerator.g:3252:4: ( (lv_literal_2_0= RULE_MYSTRING ) ) ( (lv_options_3_0= ruleElementOptions ) )?
                    {
                    // InternalUniMapperGenerator.g:3252:4: ( (lv_literal_2_0= RULE_MYSTRING ) )
                    // InternalUniMapperGenerator.g:3253:5: (lv_literal_2_0= RULE_MYSTRING )
                    {
                    // InternalUniMapperGenerator.g:3253:5: (lv_literal_2_0= RULE_MYSTRING )
                    // InternalUniMapperGenerator.g:3254:6: lv_literal_2_0= RULE_MYSTRING
                    {
                    lv_literal_2_0=(Token)match(input,RULE_MYSTRING,FOLLOW_41); 

                    						newLeafNode(lv_literal_2_0, grammarAccess.getTerminalAccess().getLiteralMYSTRINGTerminalRuleCall_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTerminalRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"literal",
                    							lv_literal_2_0,
                    							"net.unicoen.UniMapperGenerator.MYSTRING");
                    					

                    }


                    }

                    // InternalUniMapperGenerator.g:3270:4: ( (lv_options_3_0= ruleElementOptions ) )?
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==57) ) {
                        alt54=1;
                    }
                    switch (alt54) {
                        case 1 :
                            // InternalUniMapperGenerator.g:3271:5: (lv_options_3_0= ruleElementOptions )
                            {
                            // InternalUniMapperGenerator.g:3271:5: (lv_options_3_0= ruleElementOptions )
                            // InternalUniMapperGenerator.g:3272:6: lv_options_3_0= ruleElementOptions
                            {

                            						newCompositeNode(grammarAccess.getTerminalAccess().getOptionsElementOptionsParserRuleCall_1_1_0());
                            					
                            pushFollow(FOLLOW_2);
                            lv_options_3_0=ruleElementOptions();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getTerminalRule());
                            						}
                            						set(
                            							current,
                            							"options",
                            							lv_options_3_0,
                            							"net.unicoen.UniMapperGenerator.ElementOptions");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalUniMapperGenerator.g:3291:3: ( (lv_eof_4_0= 'EOF2' ) )
                    {
                    // InternalUniMapperGenerator.g:3291:3: ( (lv_eof_4_0= 'EOF2' ) )
                    // InternalUniMapperGenerator.g:3292:4: (lv_eof_4_0= 'EOF2' )
                    {
                    // InternalUniMapperGenerator.g:3292:4: (lv_eof_4_0= 'EOF2' )
                    // InternalUniMapperGenerator.g:3293:5: lv_eof_4_0= 'EOF2'
                    {
                    lv_eof_4_0=(Token)match(input,60,FOLLOW_2); 

                    					newLeafNode(lv_eof_4_0, grammarAccess.getTerminalAccess().getEofEOF2Keyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTerminalRule());
                    					}
                    					setWithLastConsumed(current, "eof", lv_eof_4_0, "EOF2");
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTerminal"


    // $ANTLR start "entryRuleNotSet"
    // InternalUniMapperGenerator.g:3309:1: entryRuleNotSet returns [EObject current=null] : iv_ruleNotSet= ruleNotSet EOF ;
    public final EObject entryRuleNotSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotSet = null;


        try {
            // InternalUniMapperGenerator.g:3309:47: (iv_ruleNotSet= ruleNotSet EOF )
            // InternalUniMapperGenerator.g:3310:2: iv_ruleNotSet= ruleNotSet EOF
            {
             newCompositeNode(grammarAccess.getNotSetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNotSet=ruleNotSet();

            state._fsp--;

             current =iv_ruleNotSet; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNotSet"


    // $ANTLR start "ruleNotSet"
    // InternalUniMapperGenerator.g:3316:1: ruleNotSet returns [EObject current=null] : ( (otherlv_0= '~' ( (lv_body_1_0= ruleSetElement ) ) ) | (otherlv_2= '~' ( (lv_body_3_0= ruleBlockSet ) ) ) ) ;
    public final EObject ruleNotSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_body_1_0 = null;

        EObject lv_body_3_0 = null;



        	enterRule();

        try {
            // InternalUniMapperGenerator.g:3322:2: ( ( (otherlv_0= '~' ( (lv_body_1_0= ruleSetElement ) ) ) | (otherlv_2= '~' ( (lv_body_3_0= ruleBlockSet ) ) ) ) )
            // InternalUniMapperGenerator.g:3323:2: ( (otherlv_0= '~' ( (lv_body_1_0= ruleSetElement ) ) ) | (otherlv_2= '~' ( (lv_body_3_0= ruleBlockSet ) ) ) )
            {
            // InternalUniMapperGenerator.g:3323:2: ( (otherlv_0= '~' ( (lv_body_1_0= ruleSetElement ) ) ) | (otherlv_2= '~' ( (lv_body_3_0= ruleBlockSet ) ) ) )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==61) ) {
                int LA56_1 = input.LA(2);

                if ( (LA56_1==55) ) {
                    alt56=2;
                }
                else if ( (LA56_1==RULE_MYSTRING||LA56_1==RULE_ARG_OR_CHARSET||LA56_1==RULE_TOKEN_REF) ) {
                    alt56=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 56, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // InternalUniMapperGenerator.g:3324:3: (otherlv_0= '~' ( (lv_body_1_0= ruleSetElement ) ) )
                    {
                    // InternalUniMapperGenerator.g:3324:3: (otherlv_0= '~' ( (lv_body_1_0= ruleSetElement ) ) )
                    // InternalUniMapperGenerator.g:3325:4: otherlv_0= '~' ( (lv_body_1_0= ruleSetElement ) )
                    {
                    otherlv_0=(Token)match(input,61,FOLLOW_52); 

                    				newLeafNode(otherlv_0, grammarAccess.getNotSetAccess().getTildeKeyword_0_0());
                    			
                    // InternalUniMapperGenerator.g:3329:4: ( (lv_body_1_0= ruleSetElement ) )
                    // InternalUniMapperGenerator.g:3330:5: (lv_body_1_0= ruleSetElement )
                    {
                    // InternalUniMapperGenerator.g:3330:5: (lv_body_1_0= ruleSetElement )
                    // InternalUniMapperGenerator.g:3331:6: lv_body_1_0= ruleSetElement
                    {

                    						newCompositeNode(grammarAccess.getNotSetAccess().getBodySetElementParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_body_1_0=ruleSetElement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNotSetRule());
                    						}
                    						set(
                    							current,
                    							"body",
                    							lv_body_1_0,
                    							"net.unicoen.UniMapperGenerator.SetElement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalUniMapperGenerator.g:3350:3: (otherlv_2= '~' ( (lv_body_3_0= ruleBlockSet ) ) )
                    {
                    // InternalUniMapperGenerator.g:3350:3: (otherlv_2= '~' ( (lv_body_3_0= ruleBlockSet ) ) )
                    // InternalUniMapperGenerator.g:3351:4: otherlv_2= '~' ( (lv_body_3_0= ruleBlockSet ) )
                    {
                    otherlv_2=(Token)match(input,61,FOLLOW_53); 

                    				newLeafNode(otherlv_2, grammarAccess.getNotSetAccess().getTildeKeyword_1_0());
                    			
                    // InternalUniMapperGenerator.g:3355:4: ( (lv_body_3_0= ruleBlockSet ) )
                    // InternalUniMapperGenerator.g:3356:5: (lv_body_3_0= ruleBlockSet )
                    {
                    // InternalUniMapperGenerator.g:3356:5: (lv_body_3_0= ruleBlockSet )
                    // InternalUniMapperGenerator.g:3357:6: lv_body_3_0= ruleBlockSet
                    {

                    						newCompositeNode(grammarAccess.getNotSetAccess().getBodyBlockSetParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_body_3_0=ruleBlockSet();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNotSetRule());
                    						}
                    						set(
                    							current,
                    							"body",
                    							lv_body_3_0,
                    							"net.unicoen.UniMapperGenerator.BlockSet");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNotSet"


    // $ANTLR start "entryRuleBlockSet"
    // InternalUniMapperGenerator.g:3379:1: entryRuleBlockSet returns [EObject current=null] : iv_ruleBlockSet= ruleBlockSet EOF ;
    public final EObject entryRuleBlockSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlockSet = null;


        try {
            // InternalUniMapperGenerator.g:3379:49: (iv_ruleBlockSet= ruleBlockSet EOF )
            // InternalUniMapperGenerator.g:3380:2: iv_ruleBlockSet= ruleBlockSet EOF
            {
             newCompositeNode(grammarAccess.getBlockSetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBlockSet=ruleBlockSet();

            state._fsp--;

             current =iv_ruleBlockSet; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBlockSet"


    // $ANTLR start "ruleBlockSet"
    // InternalUniMapperGenerator.g:3386:1: ruleBlockSet returns [EObject current=null] : (otherlv_0= '(' ( (lv_elements_1_0= ruleSetElement ) ) (otherlv_2= '|' ( (lv_elements_3_0= ruleSetElement ) ) )* otherlv_4= ')' ) ;
    public final EObject ruleBlockSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_elements_1_0 = null;

        EObject lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalUniMapperGenerator.g:3392:2: ( (otherlv_0= '(' ( (lv_elements_1_0= ruleSetElement ) ) (otherlv_2= '|' ( (lv_elements_3_0= ruleSetElement ) ) )* otherlv_4= ')' ) )
            // InternalUniMapperGenerator.g:3393:2: (otherlv_0= '(' ( (lv_elements_1_0= ruleSetElement ) ) (otherlv_2= '|' ( (lv_elements_3_0= ruleSetElement ) ) )* otherlv_4= ')' )
            {
            // InternalUniMapperGenerator.g:3393:2: (otherlv_0= '(' ( (lv_elements_1_0= ruleSetElement ) ) (otherlv_2= '|' ( (lv_elements_3_0= ruleSetElement ) ) )* otherlv_4= ')' )
            // InternalUniMapperGenerator.g:3394:3: otherlv_0= '(' ( (lv_elements_1_0= ruleSetElement ) ) (otherlv_2= '|' ( (lv_elements_3_0= ruleSetElement ) ) )* otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,55,FOLLOW_52); 

            			newLeafNode(otherlv_0, grammarAccess.getBlockSetAccess().getLeftParenthesisKeyword_0());
            		
            // InternalUniMapperGenerator.g:3398:3: ( (lv_elements_1_0= ruleSetElement ) )
            // InternalUniMapperGenerator.g:3399:4: (lv_elements_1_0= ruleSetElement )
            {
            // InternalUniMapperGenerator.g:3399:4: (lv_elements_1_0= ruleSetElement )
            // InternalUniMapperGenerator.g:3400:5: lv_elements_1_0= ruleSetElement
            {

            					newCompositeNode(grammarAccess.getBlockSetAccess().getElementsSetElementParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_54);
            lv_elements_1_0=ruleSetElement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBlockSetRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_1_0,
            						"net.unicoen.UniMapperGenerator.SetElement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUniMapperGenerator.g:3417:3: (otherlv_2= '|' ( (lv_elements_3_0= ruleSetElement ) ) )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==49) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // InternalUniMapperGenerator.g:3418:4: otherlv_2= '|' ( (lv_elements_3_0= ruleSetElement ) )
            	    {
            	    otherlv_2=(Token)match(input,49,FOLLOW_52); 

            	    				newLeafNode(otherlv_2, grammarAccess.getBlockSetAccess().getVerticalLineKeyword_2_0());
            	    			
            	    // InternalUniMapperGenerator.g:3422:4: ( (lv_elements_3_0= ruleSetElement ) )
            	    // InternalUniMapperGenerator.g:3423:5: (lv_elements_3_0= ruleSetElement )
            	    {
            	    // InternalUniMapperGenerator.g:3423:5: (lv_elements_3_0= ruleSetElement )
            	    // InternalUniMapperGenerator.g:3424:6: lv_elements_3_0= ruleSetElement
            	    {

            	    						newCompositeNode(grammarAccess.getBlockSetAccess().getElementsSetElementParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_54);
            	    lv_elements_3_0=ruleSetElement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBlockSetRule());
            	    						}
            	    						add(
            	    							current,
            	    							"elements",
            	    							lv_elements_3_0,
            	    							"net.unicoen.UniMapperGenerator.SetElement");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);

            otherlv_4=(Token)match(input,56,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getBlockSetAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBlockSet"


    // $ANTLR start "entryRuleSetElement"
    // InternalUniMapperGenerator.g:3450:1: entryRuleSetElement returns [EObject current=null] : iv_ruleSetElement= ruleSetElement EOF ;
    public final EObject entryRuleSetElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetElement = null;


        try {
            // InternalUniMapperGenerator.g:3450:51: (iv_ruleSetElement= ruleSetElement EOF )
            // InternalUniMapperGenerator.g:3451:2: iv_ruleSetElement= ruleSetElement EOF
            {
             newCompositeNode(grammarAccess.getSetElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSetElement=ruleSetElement();

            state._fsp--;

             current =iv_ruleSetElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSetElement"


    // $ANTLR start "ruleSetElement"
    // InternalUniMapperGenerator.g:3457:1: ruleSetElement returns [EObject current=null] : ( ( (lv_tokenRef_0_0= RULE_TOKEN_REF ) ) | ( (lv_stringLiteral_1_0= RULE_MYSTRING ) ) | ( (lv_range_2_0= ruleRange ) ) | ( (lv_charSet_3_0= RULE_ARG_OR_CHARSET ) ) ) ;
    public final EObject ruleSetElement() throws RecognitionException {
        EObject current = null;

        Token lv_tokenRef_0_0=null;
        Token lv_stringLiteral_1_0=null;
        Token lv_charSet_3_0=null;
        EObject lv_range_2_0 = null;



        	enterRule();

        try {
            // InternalUniMapperGenerator.g:3463:2: ( ( ( (lv_tokenRef_0_0= RULE_TOKEN_REF ) ) | ( (lv_stringLiteral_1_0= RULE_MYSTRING ) ) | ( (lv_range_2_0= ruleRange ) ) | ( (lv_charSet_3_0= RULE_ARG_OR_CHARSET ) ) ) )
            // InternalUniMapperGenerator.g:3464:2: ( ( (lv_tokenRef_0_0= RULE_TOKEN_REF ) ) | ( (lv_stringLiteral_1_0= RULE_MYSTRING ) ) | ( (lv_range_2_0= ruleRange ) ) | ( (lv_charSet_3_0= RULE_ARG_OR_CHARSET ) ) )
            {
            // InternalUniMapperGenerator.g:3464:2: ( ( (lv_tokenRef_0_0= RULE_TOKEN_REF ) ) | ( (lv_stringLiteral_1_0= RULE_MYSTRING ) ) | ( (lv_range_2_0= ruleRange ) ) | ( (lv_charSet_3_0= RULE_ARG_OR_CHARSET ) ) )
            int alt58=4;
            switch ( input.LA(1) ) {
            case RULE_TOKEN_REF:
                {
                alt58=1;
                }
                break;
            case RULE_MYSTRING:
                {
                int LA58_2 = input.LA(2);

                if ( (LA58_2==EOF||(LA58_2>=RULE_SEMICOLON && LA58_2<=RULE_RULE_REF)||(LA58_2>=RULE_MYSTRING && LA58_2<=RULE_ACTION)||LA58_2==RULE_ARG_OR_CHARSET||(LA58_2>=RULE_DOLLAR && LA58_2<=RULE_RARROW)||(LA58_2>=44 && LA58_2<=45)||(LA58_2>=49 && LA58_2<=50)||(LA58_2>=52 && LA58_2<=56)||(LA58_2>=60 && LA58_2<=62)) ) {
                    alt58=2;
                }
                else if ( (LA58_2==59) ) {
                    alt58=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 58, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ARG_OR_CHARSET:
                {
                alt58=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }

            switch (alt58) {
                case 1 :
                    // InternalUniMapperGenerator.g:3465:3: ( (lv_tokenRef_0_0= RULE_TOKEN_REF ) )
                    {
                    // InternalUniMapperGenerator.g:3465:3: ( (lv_tokenRef_0_0= RULE_TOKEN_REF ) )
                    // InternalUniMapperGenerator.g:3466:4: (lv_tokenRef_0_0= RULE_TOKEN_REF )
                    {
                    // InternalUniMapperGenerator.g:3466:4: (lv_tokenRef_0_0= RULE_TOKEN_REF )
                    // InternalUniMapperGenerator.g:3467:5: lv_tokenRef_0_0= RULE_TOKEN_REF
                    {
                    lv_tokenRef_0_0=(Token)match(input,RULE_TOKEN_REF,FOLLOW_2); 

                    					newLeafNode(lv_tokenRef_0_0, grammarAccess.getSetElementAccess().getTokenRefTOKEN_REFTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSetElementRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"tokenRef",
                    						lv_tokenRef_0_0,
                    						"net.unicoen.UniMapperGenerator.TOKEN_REF");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalUniMapperGenerator.g:3484:3: ( (lv_stringLiteral_1_0= RULE_MYSTRING ) )
                    {
                    // InternalUniMapperGenerator.g:3484:3: ( (lv_stringLiteral_1_0= RULE_MYSTRING ) )
                    // InternalUniMapperGenerator.g:3485:4: (lv_stringLiteral_1_0= RULE_MYSTRING )
                    {
                    // InternalUniMapperGenerator.g:3485:4: (lv_stringLiteral_1_0= RULE_MYSTRING )
                    // InternalUniMapperGenerator.g:3486:5: lv_stringLiteral_1_0= RULE_MYSTRING
                    {
                    lv_stringLiteral_1_0=(Token)match(input,RULE_MYSTRING,FOLLOW_2); 

                    					newLeafNode(lv_stringLiteral_1_0, grammarAccess.getSetElementAccess().getStringLiteralMYSTRINGTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSetElementRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"stringLiteral",
                    						lv_stringLiteral_1_0,
                    						"net.unicoen.UniMapperGenerator.MYSTRING");
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalUniMapperGenerator.g:3503:3: ( (lv_range_2_0= ruleRange ) )
                    {
                    // InternalUniMapperGenerator.g:3503:3: ( (lv_range_2_0= ruleRange ) )
                    // InternalUniMapperGenerator.g:3504:4: (lv_range_2_0= ruleRange )
                    {
                    // InternalUniMapperGenerator.g:3504:4: (lv_range_2_0= ruleRange )
                    // InternalUniMapperGenerator.g:3505:5: lv_range_2_0= ruleRange
                    {

                    					newCompositeNode(grammarAccess.getSetElementAccess().getRangeRangeParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_range_2_0=ruleRange();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSetElementRule());
                    					}
                    					set(
                    						current,
                    						"range",
                    						lv_range_2_0,
                    						"net.unicoen.UniMapperGenerator.Range");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalUniMapperGenerator.g:3523:3: ( (lv_charSet_3_0= RULE_ARG_OR_CHARSET ) )
                    {
                    // InternalUniMapperGenerator.g:3523:3: ( (lv_charSet_3_0= RULE_ARG_OR_CHARSET ) )
                    // InternalUniMapperGenerator.g:3524:4: (lv_charSet_3_0= RULE_ARG_OR_CHARSET )
                    {
                    // InternalUniMapperGenerator.g:3524:4: (lv_charSet_3_0= RULE_ARG_OR_CHARSET )
                    // InternalUniMapperGenerator.g:3525:5: lv_charSet_3_0= RULE_ARG_OR_CHARSET
                    {
                    lv_charSet_3_0=(Token)match(input,RULE_ARG_OR_CHARSET,FOLLOW_2); 

                    					newLeafNode(lv_charSet_3_0, grammarAccess.getSetElementAccess().getCharSetARG_OR_CHARSETTerminalRuleCall_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSetElementRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"charSet",
                    						lv_charSet_3_0,
                    						"net.unicoen.UniMapperGenerator.ARG_OR_CHARSET");
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSetElement"


    // $ANTLR start "entryRuleWildcard"
    // InternalUniMapperGenerator.g:3545:1: entryRuleWildcard returns [EObject current=null] : iv_ruleWildcard= ruleWildcard EOF ;
    public final EObject entryRuleWildcard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWildcard = null;


        try {
            // InternalUniMapperGenerator.g:3545:49: (iv_ruleWildcard= ruleWildcard EOF )
            // InternalUniMapperGenerator.g:3546:2: iv_ruleWildcard= ruleWildcard EOF
            {
             newCompositeNode(grammarAccess.getWildcardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWildcard=ruleWildcard();

            state._fsp--;

             current =iv_ruleWildcard; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWildcard"


    // $ANTLR start "ruleWildcard"
    // InternalUniMapperGenerator.g:3552:1: ruleWildcard returns [EObject current=null] : ( ( (lv_dot_0_0= '.' ) ) ( (lv_options_1_0= ruleElementOptions ) )? ) ;
    public final EObject ruleWildcard() throws RecognitionException {
        EObject current = null;

        Token lv_dot_0_0=null;
        EObject lv_options_1_0 = null;



        	enterRule();

        try {
            // InternalUniMapperGenerator.g:3558:2: ( ( ( (lv_dot_0_0= '.' ) ) ( (lv_options_1_0= ruleElementOptions ) )? ) )
            // InternalUniMapperGenerator.g:3559:2: ( ( (lv_dot_0_0= '.' ) ) ( (lv_options_1_0= ruleElementOptions ) )? )
            {
            // InternalUniMapperGenerator.g:3559:2: ( ( (lv_dot_0_0= '.' ) ) ( (lv_options_1_0= ruleElementOptions ) )? )
            // InternalUniMapperGenerator.g:3560:3: ( (lv_dot_0_0= '.' ) ) ( (lv_options_1_0= ruleElementOptions ) )?
            {
            // InternalUniMapperGenerator.g:3560:3: ( (lv_dot_0_0= '.' ) )
            // InternalUniMapperGenerator.g:3561:4: (lv_dot_0_0= '.' )
            {
            // InternalUniMapperGenerator.g:3561:4: (lv_dot_0_0= '.' )
            // InternalUniMapperGenerator.g:3562:5: lv_dot_0_0= '.'
            {
            lv_dot_0_0=(Token)match(input,62,FOLLOW_41); 

            					newLeafNode(lv_dot_0_0, grammarAccess.getWildcardAccess().getDotFullStopKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWildcardRule());
            					}
            					setWithLastConsumed(current, "dot", lv_dot_0_0, ".");
            				

            }


            }

            // InternalUniMapperGenerator.g:3574:3: ( (lv_options_1_0= ruleElementOptions ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==57) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalUniMapperGenerator.g:3575:4: (lv_options_1_0= ruleElementOptions )
                    {
                    // InternalUniMapperGenerator.g:3575:4: (lv_options_1_0= ruleElementOptions )
                    // InternalUniMapperGenerator.g:3576:5: lv_options_1_0= ruleElementOptions
                    {

                    					newCompositeNode(grammarAccess.getWildcardAccess().getOptionsElementOptionsParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_options_1_0=ruleElementOptions();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getWildcardRule());
                    					}
                    					set(
                    						current,
                    						"options",
                    						lv_options_1_0,
                    						"net.unicoen.UniMapperGenerator.ElementOptions");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWildcard"


    // $ANTLR start "entryRuleElementOption"
    // InternalUniMapperGenerator.g:3597:1: entryRuleElementOption returns [EObject current=null] : iv_ruleElementOption= ruleElementOption EOF ;
    public final EObject entryRuleElementOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementOption = null;


        try {
            // InternalUniMapperGenerator.g:3597:54: (iv_ruleElementOption= ruleElementOption EOF )
            // InternalUniMapperGenerator.g:3598:2: iv_ruleElementOption= ruleElementOption EOF
            {
             newCompositeNode(grammarAccess.getElementOptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElementOption=ruleElementOption();

            state._fsp--;

             current =iv_ruleElementOption; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElementOption"


    // $ANTLR start "ruleElementOption"
    // InternalUniMapperGenerator.g:3604:1: ruleElementOption returns [EObject current=null] : ( ( (lv_qualifiedId_0_0= ruleQualifiedId ) ) | ( ( (lv_id_1_0= ruleId ) ) ( (lv_assign_2_0= '=' ) ) ( (lv_value_3_0= ruleOptionValue ) ) ) ) ;
    public final EObject ruleElementOption() throws RecognitionException {
        EObject current = null;

        Token lv_assign_2_0=null;
        EObject lv_qualifiedId_0_0 = null;

        AntlrDatatypeRuleToken lv_id_1_0 = null;

        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalUniMapperGenerator.g:3610:2: ( ( ( (lv_qualifiedId_0_0= ruleQualifiedId ) ) | ( ( (lv_id_1_0= ruleId ) ) ( (lv_assign_2_0= '=' ) ) ( (lv_value_3_0= ruleOptionValue ) ) ) ) )
            // InternalUniMapperGenerator.g:3611:2: ( ( (lv_qualifiedId_0_0= ruleQualifiedId ) ) | ( ( (lv_id_1_0= ruleId ) ) ( (lv_assign_2_0= '=' ) ) ( (lv_value_3_0= ruleOptionValue ) ) ) )
            {
            // InternalUniMapperGenerator.g:3611:2: ( ( (lv_qualifiedId_0_0= ruleQualifiedId ) ) | ( ( (lv_id_1_0= ruleId ) ) ( (lv_assign_2_0= '=' ) ) ( (lv_value_3_0= ruleOptionValue ) ) ) )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==RULE_TOKEN_REF) ) {
                int LA60_1 = input.LA(2);

                if ( (LA60_1==EOF||LA60_1==37||LA60_1==58||LA60_1==62) ) {
                    alt60=1;
                }
                else if ( (LA60_1==35) ) {
                    alt60=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 60, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA60_0==RULE_RULE_REF) ) {
                int LA60_2 = input.LA(2);

                if ( (LA60_2==EOF||LA60_2==37||LA60_2==58||LA60_2==62) ) {
                    alt60=1;
                }
                else if ( (LA60_2==35) ) {
                    alt60=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 60, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // InternalUniMapperGenerator.g:3612:3: ( (lv_qualifiedId_0_0= ruleQualifiedId ) )
                    {
                    // InternalUniMapperGenerator.g:3612:3: ( (lv_qualifiedId_0_0= ruleQualifiedId ) )
                    // InternalUniMapperGenerator.g:3613:4: (lv_qualifiedId_0_0= ruleQualifiedId )
                    {
                    // InternalUniMapperGenerator.g:3613:4: (lv_qualifiedId_0_0= ruleQualifiedId )
                    // InternalUniMapperGenerator.g:3614:5: lv_qualifiedId_0_0= ruleQualifiedId
                    {

                    					newCompositeNode(grammarAccess.getElementOptionAccess().getQualifiedIdQualifiedIdParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_qualifiedId_0_0=ruleQualifiedId();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getElementOptionRule());
                    					}
                    					set(
                    						current,
                    						"qualifiedId",
                    						lv_qualifiedId_0_0,
                    						"net.unicoen.UniMapperGenerator.QualifiedId");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalUniMapperGenerator.g:3632:3: ( ( (lv_id_1_0= ruleId ) ) ( (lv_assign_2_0= '=' ) ) ( (lv_value_3_0= ruleOptionValue ) ) )
                    {
                    // InternalUniMapperGenerator.g:3632:3: ( ( (lv_id_1_0= ruleId ) ) ( (lv_assign_2_0= '=' ) ) ( (lv_value_3_0= ruleOptionValue ) ) )
                    // InternalUniMapperGenerator.g:3633:4: ( (lv_id_1_0= ruleId ) ) ( (lv_assign_2_0= '=' ) ) ( (lv_value_3_0= ruleOptionValue ) )
                    {
                    // InternalUniMapperGenerator.g:3633:4: ( (lv_id_1_0= ruleId ) )
                    // InternalUniMapperGenerator.g:3634:5: (lv_id_1_0= ruleId )
                    {
                    // InternalUniMapperGenerator.g:3634:5: (lv_id_1_0= ruleId )
                    // InternalUniMapperGenerator.g:3635:6: lv_id_1_0= ruleId
                    {

                    						newCompositeNode(grammarAccess.getElementOptionAccess().getIdIdParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_id_1_0=ruleId();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getElementOptionRule());
                    						}
                    						set(
                    							current,
                    							"id",
                    							lv_id_1_0,
                    							"net.unicoen.UniMapperGenerator.Id");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalUniMapperGenerator.g:3652:4: ( (lv_assign_2_0= '=' ) )
                    // InternalUniMapperGenerator.g:3653:5: (lv_assign_2_0= '=' )
                    {
                    // InternalUniMapperGenerator.g:3653:5: (lv_assign_2_0= '=' )
                    // InternalUniMapperGenerator.g:3654:6: lv_assign_2_0= '='
                    {
                    lv_assign_2_0=(Token)match(input,35,FOLLOW_13); 

                    						newLeafNode(lv_assign_2_0, grammarAccess.getElementOptionAccess().getAssignEqualsSignKeyword_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getElementOptionRule());
                    						}
                    						setWithLastConsumed(current, "assign", lv_assign_2_0, "=");
                    					

                    }


                    }

                    // InternalUniMapperGenerator.g:3666:4: ( (lv_value_3_0= ruleOptionValue ) )
                    // InternalUniMapperGenerator.g:3667:5: (lv_value_3_0= ruleOptionValue )
                    {
                    // InternalUniMapperGenerator.g:3667:5: (lv_value_3_0= ruleOptionValue )
                    // InternalUniMapperGenerator.g:3668:6: lv_value_3_0= ruleOptionValue
                    {

                    						newCompositeNode(grammarAccess.getElementOptionAccess().getValueOptionValueParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_3_0=ruleOptionValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getElementOptionRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_3_0,
                    							"net.unicoen.UniMapperGenerator.OptionValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElementOption"


    // $ANTLR start "entryRuleUnicoenTypeDec"
    // InternalUniMapperGenerator.g:3690:1: entryRuleUnicoenTypeDec returns [EObject current=null] : iv_ruleUnicoenTypeDec= ruleUnicoenTypeDec EOF ;
    public final EObject entryRuleUnicoenTypeDec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnicoenTypeDec = null;


        try {
            // InternalUniMapperGenerator.g:3690:55: (iv_ruleUnicoenTypeDec= ruleUnicoenTypeDec EOF )
            // InternalUniMapperGenerator.g:3691:2: iv_ruleUnicoenTypeDec= ruleUnicoenTypeDec EOF
            {
             newCompositeNode(grammarAccess.getUnicoenTypeDecRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnicoenTypeDec=ruleUnicoenTypeDec();

            state._fsp--;

             current =iv_ruleUnicoenTypeDec; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnicoenTypeDec"


    // $ANTLR start "ruleUnicoenTypeDec"
    // InternalUniMapperGenerator.g:3697:1: ruleUnicoenTypeDec returns [EObject current=null] : (otherlv_0= '=>' ( (lv_type_1_0= ruleUnicoenTypeIdentifiers ) ) ) ;
    public final EObject ruleUnicoenTypeDec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalUniMapperGenerator.g:3703:2: ( (otherlv_0= '=>' ( (lv_type_1_0= ruleUnicoenTypeIdentifiers ) ) ) )
            // InternalUniMapperGenerator.g:3704:2: (otherlv_0= '=>' ( (lv_type_1_0= ruleUnicoenTypeIdentifiers ) ) )
            {
            // InternalUniMapperGenerator.g:3704:2: (otherlv_0= '=>' ( (lv_type_1_0= ruleUnicoenTypeIdentifiers ) ) )
            // InternalUniMapperGenerator.g:3705:3: otherlv_0= '=>' ( (lv_type_1_0= ruleUnicoenTypeIdentifiers ) )
            {
            otherlv_0=(Token)match(input,63,FOLLOW_55); 

            			newLeafNode(otherlv_0, grammarAccess.getUnicoenTypeDecAccess().getEqualsSignGreaterThanSignKeyword_0());
            		
            // InternalUniMapperGenerator.g:3709:3: ( (lv_type_1_0= ruleUnicoenTypeIdentifiers ) )
            // InternalUniMapperGenerator.g:3710:4: (lv_type_1_0= ruleUnicoenTypeIdentifiers )
            {
            // InternalUniMapperGenerator.g:3710:4: (lv_type_1_0= ruleUnicoenTypeIdentifiers )
            // InternalUniMapperGenerator.g:3711:5: lv_type_1_0= ruleUnicoenTypeIdentifiers
            {

            					newCompositeNode(grammarAccess.getUnicoenTypeDecAccess().getTypeUnicoenTypeIdentifiersParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_1_0=ruleUnicoenTypeIdentifiers();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUnicoenTypeDecRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_1_0,
            						"net.unicoen.UniMapperGenerator.UnicoenTypeIdentifiers");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnicoenTypeDec"


    // $ANTLR start "entryRuleUnicoenTypeIdentifiers"
    // InternalUniMapperGenerator.g:3732:1: entryRuleUnicoenTypeIdentifiers returns [EObject current=null] : iv_ruleUnicoenTypeIdentifiers= ruleUnicoenTypeIdentifiers EOF ;
    public final EObject entryRuleUnicoenTypeIdentifiers() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnicoenTypeIdentifiers = null;


        try {
            // InternalUniMapperGenerator.g:3732:63: (iv_ruleUnicoenTypeIdentifiers= ruleUnicoenTypeIdentifiers EOF )
            // InternalUniMapperGenerator.g:3733:2: iv_ruleUnicoenTypeIdentifiers= ruleUnicoenTypeIdentifiers EOF
            {
             newCompositeNode(grammarAccess.getUnicoenTypeIdentifiersRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnicoenTypeIdentifiers=ruleUnicoenTypeIdentifiers();

            state._fsp--;

             current =iv_ruleUnicoenTypeIdentifiers; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnicoenTypeIdentifiers"


    // $ANTLR start "ruleUnicoenTypeIdentifiers"
    // InternalUniMapperGenerator.g:3739:1: ruleUnicoenTypeIdentifiers returns [EObject current=null] : ( ( ( (lv_name_0_0= ruleId ) ) (otherlv_1= '<' ( (lv_typevalue_2_0= ruleId ) ) otherlv_3= '>' )? ) | (otherlv_4= '(' ( ( (lv_dir_5_1= '<' | lv_dir_5_2= '>' ) ) ) ( (lv_fieldvalue_6_0= ruleQualifiedId ) ) (otherlv_7= ',' ( (lv_fieldvalue_8_0= ruleQualifiedId ) ) )* otherlv_9= ')' ) ) ;
    public final EObject ruleUnicoenTypeIdentifiers() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_dir_5_1=null;
        Token lv_dir_5_2=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        AntlrDatatypeRuleToken lv_typevalue_2_0 = null;

        EObject lv_fieldvalue_6_0 = null;

        EObject lv_fieldvalue_8_0 = null;



        	enterRule();

        try {
            // InternalUniMapperGenerator.g:3745:2: ( ( ( ( (lv_name_0_0= ruleId ) ) (otherlv_1= '<' ( (lv_typevalue_2_0= ruleId ) ) otherlv_3= '>' )? ) | (otherlv_4= '(' ( ( (lv_dir_5_1= '<' | lv_dir_5_2= '>' ) ) ) ( (lv_fieldvalue_6_0= ruleQualifiedId ) ) (otherlv_7= ',' ( (lv_fieldvalue_8_0= ruleQualifiedId ) ) )* otherlv_9= ')' ) ) )
            // InternalUniMapperGenerator.g:3746:2: ( ( ( (lv_name_0_0= ruleId ) ) (otherlv_1= '<' ( (lv_typevalue_2_0= ruleId ) ) otherlv_3= '>' )? ) | (otherlv_4= '(' ( ( (lv_dir_5_1= '<' | lv_dir_5_2= '>' ) ) ) ( (lv_fieldvalue_6_0= ruleQualifiedId ) ) (otherlv_7= ',' ( (lv_fieldvalue_8_0= ruleQualifiedId ) ) )* otherlv_9= ')' ) )
            {
            // InternalUniMapperGenerator.g:3746:2: ( ( ( (lv_name_0_0= ruleId ) ) (otherlv_1= '<' ( (lv_typevalue_2_0= ruleId ) ) otherlv_3= '>' )? ) | (otherlv_4= '(' ( ( (lv_dir_5_1= '<' | lv_dir_5_2= '>' ) ) ) ( (lv_fieldvalue_6_0= ruleQualifiedId ) ) (otherlv_7= ',' ( (lv_fieldvalue_8_0= ruleQualifiedId ) ) )* otherlv_9= ')' ) )
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==RULE_RULE_REF||LA64_0==RULE_TOKEN_REF) ) {
                alt64=1;
            }
            else if ( (LA64_0==55) ) {
                alt64=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }
            switch (alt64) {
                case 1 :
                    // InternalUniMapperGenerator.g:3747:3: ( ( (lv_name_0_0= ruleId ) ) (otherlv_1= '<' ( (lv_typevalue_2_0= ruleId ) ) otherlv_3= '>' )? )
                    {
                    // InternalUniMapperGenerator.g:3747:3: ( ( (lv_name_0_0= ruleId ) ) (otherlv_1= '<' ( (lv_typevalue_2_0= ruleId ) ) otherlv_3= '>' )? )
                    // InternalUniMapperGenerator.g:3748:4: ( (lv_name_0_0= ruleId ) ) (otherlv_1= '<' ( (lv_typevalue_2_0= ruleId ) ) otherlv_3= '>' )?
                    {
                    // InternalUniMapperGenerator.g:3748:4: ( (lv_name_0_0= ruleId ) )
                    // InternalUniMapperGenerator.g:3749:5: (lv_name_0_0= ruleId )
                    {
                    // InternalUniMapperGenerator.g:3749:5: (lv_name_0_0= ruleId )
                    // InternalUniMapperGenerator.g:3750:6: lv_name_0_0= ruleId
                    {

                    						newCompositeNode(grammarAccess.getUnicoenTypeIdentifiersAccess().getNameIdParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_41);
                    lv_name_0_0=ruleId();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUnicoenTypeIdentifiersRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_0_0,
                    							"net.unicoen.UniMapperGenerator.Id");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalUniMapperGenerator.g:3767:4: (otherlv_1= '<' ( (lv_typevalue_2_0= ruleId ) ) otherlv_3= '>' )?
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==57) ) {
                        alt61=1;
                    }
                    switch (alt61) {
                        case 1 :
                            // InternalUniMapperGenerator.g:3768:5: otherlv_1= '<' ( (lv_typevalue_2_0= ruleId ) ) otherlv_3= '>'
                            {
                            otherlv_1=(Token)match(input,57,FOLLOW_4); 

                            					newLeafNode(otherlv_1, grammarAccess.getUnicoenTypeIdentifiersAccess().getLessThanSignKeyword_0_1_0());
                            				
                            // InternalUniMapperGenerator.g:3772:5: ( (lv_typevalue_2_0= ruleId ) )
                            // InternalUniMapperGenerator.g:3773:6: (lv_typevalue_2_0= ruleId )
                            {
                            // InternalUniMapperGenerator.g:3773:6: (lv_typevalue_2_0= ruleId )
                            // InternalUniMapperGenerator.g:3774:7: lv_typevalue_2_0= ruleId
                            {

                            							newCompositeNode(grammarAccess.getUnicoenTypeIdentifiersAccess().getTypevalueIdParserRuleCall_0_1_1_0());
                            						
                            pushFollow(FOLLOW_56);
                            lv_typevalue_2_0=ruleId();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getUnicoenTypeIdentifiersRule());
                            							}
                            							set(
                            								current,
                            								"typevalue",
                            								lv_typevalue_2_0,
                            								"net.unicoen.UniMapperGenerator.Id");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            otherlv_3=(Token)match(input,58,FOLLOW_2); 

                            					newLeafNode(otherlv_3, grammarAccess.getUnicoenTypeIdentifiersAccess().getGreaterThanSignKeyword_0_1_2());
                            				

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalUniMapperGenerator.g:3798:3: (otherlv_4= '(' ( ( (lv_dir_5_1= '<' | lv_dir_5_2= '>' ) ) ) ( (lv_fieldvalue_6_0= ruleQualifiedId ) ) (otherlv_7= ',' ( (lv_fieldvalue_8_0= ruleQualifiedId ) ) )* otherlv_9= ')' )
                    {
                    // InternalUniMapperGenerator.g:3798:3: (otherlv_4= '(' ( ( (lv_dir_5_1= '<' | lv_dir_5_2= '>' ) ) ) ( (lv_fieldvalue_6_0= ruleQualifiedId ) ) (otherlv_7= ',' ( (lv_fieldvalue_8_0= ruleQualifiedId ) ) )* otherlv_9= ')' )
                    // InternalUniMapperGenerator.g:3799:4: otherlv_4= '(' ( ( (lv_dir_5_1= '<' | lv_dir_5_2= '>' ) ) ) ( (lv_fieldvalue_6_0= ruleQualifiedId ) ) (otherlv_7= ',' ( (lv_fieldvalue_8_0= ruleQualifiedId ) ) )* otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,55,FOLLOW_57); 

                    				newLeafNode(otherlv_4, grammarAccess.getUnicoenTypeIdentifiersAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalUniMapperGenerator.g:3803:4: ( ( (lv_dir_5_1= '<' | lv_dir_5_2= '>' ) ) )
                    // InternalUniMapperGenerator.g:3804:5: ( (lv_dir_5_1= '<' | lv_dir_5_2= '>' ) )
                    {
                    // InternalUniMapperGenerator.g:3804:5: ( (lv_dir_5_1= '<' | lv_dir_5_2= '>' ) )
                    // InternalUniMapperGenerator.g:3805:6: (lv_dir_5_1= '<' | lv_dir_5_2= '>' )
                    {
                    // InternalUniMapperGenerator.g:3805:6: (lv_dir_5_1= '<' | lv_dir_5_2= '>' )
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==57) ) {
                        alt62=1;
                    }
                    else if ( (LA62_0==58) ) {
                        alt62=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 62, 0, input);

                        throw nvae;
                    }
                    switch (alt62) {
                        case 1 :
                            // InternalUniMapperGenerator.g:3806:7: lv_dir_5_1= '<'
                            {
                            lv_dir_5_1=(Token)match(input,57,FOLLOW_4); 

                            							newLeafNode(lv_dir_5_1, grammarAccess.getUnicoenTypeIdentifiersAccess().getDirLessThanSignKeyword_1_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getUnicoenTypeIdentifiersRule());
                            							}
                            							setWithLastConsumed(current, "dir", lv_dir_5_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalUniMapperGenerator.g:3817:7: lv_dir_5_2= '>'
                            {
                            lv_dir_5_2=(Token)match(input,58,FOLLOW_4); 

                            							newLeafNode(lv_dir_5_2, grammarAccess.getUnicoenTypeIdentifiersAccess().getDirGreaterThanSignKeyword_1_1_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getUnicoenTypeIdentifiersRule());
                            							}
                            							setWithLastConsumed(current, "dir", lv_dir_5_2, null);
                            						

                            }
                            break;

                    }


                    }


                    }

                    // InternalUniMapperGenerator.g:3830:4: ( (lv_fieldvalue_6_0= ruleQualifiedId ) )
                    // InternalUniMapperGenerator.g:3831:5: (lv_fieldvalue_6_0= ruleQualifiedId )
                    {
                    // InternalUniMapperGenerator.g:3831:5: (lv_fieldvalue_6_0= ruleQualifiedId )
                    // InternalUniMapperGenerator.g:3832:6: lv_fieldvalue_6_0= ruleQualifiedId
                    {

                    						newCompositeNode(grammarAccess.getUnicoenTypeIdentifiersAccess().getFieldvalueQualifiedIdParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_58);
                    lv_fieldvalue_6_0=ruleQualifiedId();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUnicoenTypeIdentifiersRule());
                    						}
                    						add(
                    							current,
                    							"fieldvalue",
                    							lv_fieldvalue_6_0,
                    							"net.unicoen.UniMapperGenerator.QualifiedId");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalUniMapperGenerator.g:3849:4: (otherlv_7= ',' ( (lv_fieldvalue_8_0= ruleQualifiedId ) ) )*
                    loop63:
                    do {
                        int alt63=2;
                        int LA63_0 = input.LA(1);

                        if ( (LA63_0==37) ) {
                            alt63=1;
                        }


                        switch (alt63) {
                    	case 1 :
                    	    // InternalUniMapperGenerator.g:3850:5: otherlv_7= ',' ( (lv_fieldvalue_8_0= ruleQualifiedId ) )
                    	    {
                    	    otherlv_7=(Token)match(input,37,FOLLOW_4); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getUnicoenTypeIdentifiersAccess().getCommaKeyword_1_3_0());
                    	    				
                    	    // InternalUniMapperGenerator.g:3854:5: ( (lv_fieldvalue_8_0= ruleQualifiedId ) )
                    	    // InternalUniMapperGenerator.g:3855:6: (lv_fieldvalue_8_0= ruleQualifiedId )
                    	    {
                    	    // InternalUniMapperGenerator.g:3855:6: (lv_fieldvalue_8_0= ruleQualifiedId )
                    	    // InternalUniMapperGenerator.g:3856:7: lv_fieldvalue_8_0= ruleQualifiedId
                    	    {

                    	    							newCompositeNode(grammarAccess.getUnicoenTypeIdentifiersAccess().getFieldvalueQualifiedIdParserRuleCall_1_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_58);
                    	    lv_fieldvalue_8_0=ruleQualifiedId();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getUnicoenTypeIdentifiersRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"fieldvalue",
                    	    								lv_fieldvalue_8_0,
                    	    								"net.unicoen.UniMapperGenerator.QualifiedId");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop63;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,56,FOLLOW_2); 

                    				newLeafNode(otherlv_9, grammarAccess.getUnicoenTypeIdentifiersAccess().getRightParenthesisKeyword_1_4());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnicoenTypeIdentifiers"


    // $ANTLR start "entryRuleLexerRule"
    // InternalUniMapperGenerator.g:3883:1: entryRuleLexerRule returns [EObject current=null] : iv_ruleLexerRule= ruleLexerRule EOF ;
    public final EObject entryRuleLexerRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLexerRule = null;


        try {
            // InternalUniMapperGenerator.g:3883:50: (iv_ruleLexerRule= ruleLexerRule EOF )
            // InternalUniMapperGenerator.g:3884:2: iv_ruleLexerRule= ruleLexerRule EOF
            {
             newCompositeNode(grammarAccess.getLexerRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLexerRule=ruleLexerRule();

            state._fsp--;

             current =iv_ruleLexerRule; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLexerRule"


    // $ANTLR start "ruleLexerRule"
    // InternalUniMapperGenerator.g:3890:1: ruleLexerRule returns [EObject current=null] : ( ( (lv_fragment_0_0= 'fragment' ) )? ( (lv_name_1_0= RULE_TOKEN_REF ) ) ( (lv_type_2_0= ruleUnicoenTypeDec ) )? this_COLON_3= RULE_COLON ( (lv_body_4_0= ruleLexerAltList ) ) this_SEMICOLON_5= RULE_SEMICOLON ) ;
    public final EObject ruleLexerRule() throws RecognitionException {
        EObject current = null;

        Token lv_fragment_0_0=null;
        Token lv_name_1_0=null;
        Token this_COLON_3=null;
        Token this_SEMICOLON_5=null;
        EObject lv_type_2_0 = null;

        EObject lv_body_4_0 = null;



        	enterRule();

        try {
            // InternalUniMapperGenerator.g:3896:2: ( ( ( (lv_fragment_0_0= 'fragment' ) )? ( (lv_name_1_0= RULE_TOKEN_REF ) ) ( (lv_type_2_0= ruleUnicoenTypeDec ) )? this_COLON_3= RULE_COLON ( (lv_body_4_0= ruleLexerAltList ) ) this_SEMICOLON_5= RULE_SEMICOLON ) )
            // InternalUniMapperGenerator.g:3897:2: ( ( (lv_fragment_0_0= 'fragment' ) )? ( (lv_name_1_0= RULE_TOKEN_REF ) ) ( (lv_type_2_0= ruleUnicoenTypeDec ) )? this_COLON_3= RULE_COLON ( (lv_body_4_0= ruleLexerAltList ) ) this_SEMICOLON_5= RULE_SEMICOLON )
            {
            // InternalUniMapperGenerator.g:3897:2: ( ( (lv_fragment_0_0= 'fragment' ) )? ( (lv_name_1_0= RULE_TOKEN_REF ) ) ( (lv_type_2_0= ruleUnicoenTypeDec ) )? this_COLON_3= RULE_COLON ( (lv_body_4_0= ruleLexerAltList ) ) this_SEMICOLON_5= RULE_SEMICOLON )
            // InternalUniMapperGenerator.g:3898:3: ( (lv_fragment_0_0= 'fragment' ) )? ( (lv_name_1_0= RULE_TOKEN_REF ) ) ( (lv_type_2_0= ruleUnicoenTypeDec ) )? this_COLON_3= RULE_COLON ( (lv_body_4_0= ruleLexerAltList ) ) this_SEMICOLON_5= RULE_SEMICOLON
            {
            // InternalUniMapperGenerator.g:3898:3: ( (lv_fragment_0_0= 'fragment' ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==64) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalUniMapperGenerator.g:3899:4: (lv_fragment_0_0= 'fragment' )
                    {
                    // InternalUniMapperGenerator.g:3899:4: (lv_fragment_0_0= 'fragment' )
                    // InternalUniMapperGenerator.g:3900:5: lv_fragment_0_0= 'fragment'
                    {
                    lv_fragment_0_0=(Token)match(input,64,FOLLOW_59); 

                    					newLeafNode(lv_fragment_0_0, grammarAccess.getLexerRuleAccess().getFragmentFragmentKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLexerRuleRule());
                    					}
                    					setWithLastConsumed(current, "fragment", true, "fragment");
                    				

                    }


                    }
                    break;

            }

            // InternalUniMapperGenerator.g:3912:3: ( (lv_name_1_0= RULE_TOKEN_REF ) )
            // InternalUniMapperGenerator.g:3913:4: (lv_name_1_0= RULE_TOKEN_REF )
            {
            // InternalUniMapperGenerator.g:3913:4: (lv_name_1_0= RULE_TOKEN_REF )
            // InternalUniMapperGenerator.g:3914:5: lv_name_1_0= RULE_TOKEN_REF
            {
            lv_name_1_0=(Token)match(input,RULE_TOKEN_REF,FOLLOW_60); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLexerRuleAccess().getNameTOKEN_REFTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLexerRuleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"net.unicoen.UniMapperGenerator.TOKEN_REF");
            				

            }


            }

            // InternalUniMapperGenerator.g:3930:3: ( (lv_type_2_0= ruleUnicoenTypeDec ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==63) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalUniMapperGenerator.g:3931:4: (lv_type_2_0= ruleUnicoenTypeDec )
                    {
                    // InternalUniMapperGenerator.g:3931:4: (lv_type_2_0= ruleUnicoenTypeDec )
                    // InternalUniMapperGenerator.g:3932:5: lv_type_2_0= ruleUnicoenTypeDec
                    {

                    					newCompositeNode(grammarAccess.getLexerRuleAccess().getTypeUnicoenTypeDecParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_29);
                    lv_type_2_0=ruleUnicoenTypeDec();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getLexerRuleRule());
                    					}
                    					set(
                    						current,
                    						"type",
                    						lv_type_2_0,
                    						"net.unicoen.UniMapperGenerator.UnicoenTypeDec");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            this_COLON_3=(Token)match(input,RULE_COLON,FOLLOW_61); 

            			newLeafNode(this_COLON_3, grammarAccess.getLexerRuleAccess().getCOLONTerminalRuleCall_3());
            		
            // InternalUniMapperGenerator.g:3953:3: ( (lv_body_4_0= ruleLexerAltList ) )
            // InternalUniMapperGenerator.g:3954:4: (lv_body_4_0= ruleLexerAltList )
            {
            // InternalUniMapperGenerator.g:3954:4: (lv_body_4_0= ruleLexerAltList )
            // InternalUniMapperGenerator.g:3955:5: lv_body_4_0= ruleLexerAltList
            {

            					newCompositeNode(grammarAccess.getLexerRuleAccess().getBodyLexerAltListParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_5);
            lv_body_4_0=ruleLexerAltList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLexerRuleRule());
            					}
            					set(
            						current,
            						"body",
            						lv_body_4_0,
            						"net.unicoen.UniMapperGenerator.LexerAltList");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_SEMICOLON_5=(Token)match(input,RULE_SEMICOLON,FOLLOW_2); 

            			newLeafNode(this_SEMICOLON_5, grammarAccess.getLexerRuleAccess().getSEMICOLONTerminalRuleCall_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLexerRule"


    // $ANTLR start "entryRuleLexerAltList"
    // InternalUniMapperGenerator.g:3980:1: entryRuleLexerAltList returns [EObject current=null] : iv_ruleLexerAltList= ruleLexerAltList EOF ;
    public final EObject entryRuleLexerAltList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLexerAltList = null;


        try {
            // InternalUniMapperGenerator.g:3980:53: (iv_ruleLexerAltList= ruleLexerAltList EOF )
            // InternalUniMapperGenerator.g:3981:2: iv_ruleLexerAltList= ruleLexerAltList EOF
            {
             newCompositeNode(grammarAccess.getLexerAltListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLexerAltList=ruleLexerAltList();

            state._fsp--;

             current =iv_ruleLexerAltList; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLexerAltList"


    // $ANTLR start "ruleLexerAltList"
    // InternalUniMapperGenerator.g:3987:1: ruleLexerAltList returns [EObject current=null] : ( ( (lv_alternatives_0_0= ruleLexerAlt ) ) (otherlv_1= '|' ( (lv_alternatives_2_0= ruleLexerAlt ) ) )* ) ;
    public final EObject ruleLexerAltList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_alternatives_0_0 = null;

        EObject lv_alternatives_2_0 = null;



        	enterRule();

        try {
            // InternalUniMapperGenerator.g:3993:2: ( ( ( (lv_alternatives_0_0= ruleLexerAlt ) ) (otherlv_1= '|' ( (lv_alternatives_2_0= ruleLexerAlt ) ) )* ) )
            // InternalUniMapperGenerator.g:3994:2: ( ( (lv_alternatives_0_0= ruleLexerAlt ) ) (otherlv_1= '|' ( (lv_alternatives_2_0= ruleLexerAlt ) ) )* )
            {
            // InternalUniMapperGenerator.g:3994:2: ( ( (lv_alternatives_0_0= ruleLexerAlt ) ) (otherlv_1= '|' ( (lv_alternatives_2_0= ruleLexerAlt ) ) )* )
            // InternalUniMapperGenerator.g:3995:3: ( (lv_alternatives_0_0= ruleLexerAlt ) ) (otherlv_1= '|' ( (lv_alternatives_2_0= ruleLexerAlt ) ) )*
            {
            // InternalUniMapperGenerator.g:3995:3: ( (lv_alternatives_0_0= ruleLexerAlt ) )
            // InternalUniMapperGenerator.g:3996:4: (lv_alternatives_0_0= ruleLexerAlt )
            {
            // InternalUniMapperGenerator.g:3996:4: (lv_alternatives_0_0= ruleLexerAlt )
            // InternalUniMapperGenerator.g:3997:5: lv_alternatives_0_0= ruleLexerAlt
            {

            					newCompositeNode(grammarAccess.getLexerAltListAccess().getAlternativesLexerAltParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_35);
            lv_alternatives_0_0=ruleLexerAlt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLexerAltListRule());
            					}
            					add(
            						current,
            						"alternatives",
            						lv_alternatives_0_0,
            						"net.unicoen.UniMapperGenerator.LexerAlt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUniMapperGenerator.g:4014:3: (otherlv_1= '|' ( (lv_alternatives_2_0= ruleLexerAlt ) ) )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==49) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // InternalUniMapperGenerator.g:4015:4: otherlv_1= '|' ( (lv_alternatives_2_0= ruleLexerAlt ) )
            	    {
            	    otherlv_1=(Token)match(input,49,FOLLOW_61); 

            	    				newLeafNode(otherlv_1, grammarAccess.getLexerAltListAccess().getVerticalLineKeyword_1_0());
            	    			
            	    // InternalUniMapperGenerator.g:4019:4: ( (lv_alternatives_2_0= ruleLexerAlt ) )
            	    // InternalUniMapperGenerator.g:4020:5: (lv_alternatives_2_0= ruleLexerAlt )
            	    {
            	    // InternalUniMapperGenerator.g:4020:5: (lv_alternatives_2_0= ruleLexerAlt )
            	    // InternalUniMapperGenerator.g:4021:6: lv_alternatives_2_0= ruleLexerAlt
            	    {

            	    						newCompositeNode(grammarAccess.getLexerAltListAccess().getAlternativesLexerAltParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_35);
            	    lv_alternatives_2_0=ruleLexerAlt();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getLexerAltListRule());
            	    						}
            	    						add(
            	    							current,
            	    							"alternatives",
            	    							lv_alternatives_2_0,
            	    							"net.unicoen.UniMapperGenerator.LexerAlt");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop67;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLexerAltList"


    // $ANTLR start "entryRuleLexerAlt"
    // InternalUniMapperGenerator.g:4043:1: entryRuleLexerAlt returns [EObject current=null] : iv_ruleLexerAlt= ruleLexerAlt EOF ;
    public final EObject entryRuleLexerAlt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLexerAlt = null;


        try {
            // InternalUniMapperGenerator.g:4043:49: (iv_ruleLexerAlt= ruleLexerAlt EOF )
            // InternalUniMapperGenerator.g:4044:2: iv_ruleLexerAlt= ruleLexerAlt EOF
            {
             newCompositeNode(grammarAccess.getLexerAltRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLexerAlt=ruleLexerAlt();

            state._fsp--;

             current =iv_ruleLexerAlt; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLexerAlt"


    // $ANTLR start "ruleLexerAlt"
    // InternalUniMapperGenerator.g:4050:1: ruleLexerAlt returns [EObject current=null] : ( ( (lv_body_0_0= ruleLexerElements ) ) ( (lv_commands_1_0= ruleLexerCommands ) )? ) ;
    public final EObject ruleLexerAlt() throws RecognitionException {
        EObject current = null;

        EObject lv_body_0_0 = null;

        EObject lv_commands_1_0 = null;



        	enterRule();

        try {
            // InternalUniMapperGenerator.g:4056:2: ( ( ( (lv_body_0_0= ruleLexerElements ) ) ( (lv_commands_1_0= ruleLexerCommands ) )? ) )
            // InternalUniMapperGenerator.g:4057:2: ( ( (lv_body_0_0= ruleLexerElements ) ) ( (lv_commands_1_0= ruleLexerCommands ) )? )
            {
            // InternalUniMapperGenerator.g:4057:2: ( ( (lv_body_0_0= ruleLexerElements ) ) ( (lv_commands_1_0= ruleLexerCommands ) )? )
            // InternalUniMapperGenerator.g:4058:3: ( (lv_body_0_0= ruleLexerElements ) ) ( (lv_commands_1_0= ruleLexerCommands ) )?
            {
            // InternalUniMapperGenerator.g:4058:3: ( (lv_body_0_0= ruleLexerElements ) )
            // InternalUniMapperGenerator.g:4059:4: (lv_body_0_0= ruleLexerElements )
            {
            // InternalUniMapperGenerator.g:4059:4: (lv_body_0_0= ruleLexerElements )
            // InternalUniMapperGenerator.g:4060:5: lv_body_0_0= ruleLexerElements
            {

            					newCompositeNode(grammarAccess.getLexerAltAccess().getBodyLexerElementsParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_62);
            lv_body_0_0=ruleLexerElements();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLexerAltRule());
            					}
            					set(
            						current,
            						"body",
            						lv_body_0_0,
            						"net.unicoen.UniMapperGenerator.LexerElements");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUniMapperGenerator.g:4077:3: ( (lv_commands_1_0= ruleLexerCommands ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==RULE_RARROW) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalUniMapperGenerator.g:4078:4: (lv_commands_1_0= ruleLexerCommands )
                    {
                    // InternalUniMapperGenerator.g:4078:4: (lv_commands_1_0= ruleLexerCommands )
                    // InternalUniMapperGenerator.g:4079:5: lv_commands_1_0= ruleLexerCommands
                    {

                    					newCompositeNode(grammarAccess.getLexerAltAccess().getCommandsLexerCommandsParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_commands_1_0=ruleLexerCommands();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getLexerAltRule());
                    					}
                    					set(
                    						current,
                    						"commands",
                    						lv_commands_1_0,
                    						"net.unicoen.UniMapperGenerator.LexerCommands");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLexerAlt"


    // $ANTLR start "entryRuleLexerElements"
    // InternalUniMapperGenerator.g:4100:1: entryRuleLexerElements returns [EObject current=null] : iv_ruleLexerElements= ruleLexerElements EOF ;
    public final EObject entryRuleLexerElements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLexerElements = null;


        try {
            // InternalUniMapperGenerator.g:4100:54: (iv_ruleLexerElements= ruleLexerElements EOF )
            // InternalUniMapperGenerator.g:4101:2: iv_ruleLexerElements= ruleLexerElements EOF
            {
             newCompositeNode(grammarAccess.getLexerElementsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLexerElements=ruleLexerElements();

            state._fsp--;

             current =iv_ruleLexerElements; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLexerElements"


    // $ANTLR start "ruleLexerElements"
    // InternalUniMapperGenerator.g:4107:1: ruleLexerElements returns [EObject current=null] : ( () ( (lv_elements_1_0= ruleLexerElementWithDollar ) )* ) ;
    public final EObject ruleLexerElements() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_1_0 = null;



        	enterRule();

        try {
            // InternalUniMapperGenerator.g:4113:2: ( ( () ( (lv_elements_1_0= ruleLexerElementWithDollar ) )* ) )
            // InternalUniMapperGenerator.g:4114:2: ( () ( (lv_elements_1_0= ruleLexerElementWithDollar ) )* )
            {
            // InternalUniMapperGenerator.g:4114:2: ( () ( (lv_elements_1_0= ruleLexerElementWithDollar ) )* )
            // InternalUniMapperGenerator.g:4115:3: () ( (lv_elements_1_0= ruleLexerElementWithDollar ) )*
            {
            // InternalUniMapperGenerator.g:4115:3: ()
            // InternalUniMapperGenerator.g:4116:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLexerElementsAccess().getLexerElementsAction_0(),
            					current);
            			

            }

            // InternalUniMapperGenerator.g:4122:3: ( (lv_elements_1_0= ruleLexerElementWithDollar ) )*
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( (LA69_0==RULE_RULE_REF||(LA69_0>=RULE_MYSTRING && LA69_0<=RULE_ACTION)||LA69_0==RULE_ARG_OR_CHARSET||LA69_0==RULE_TOKEN_REF||LA69_0==55||(LA69_0>=60 && LA69_0<=62)) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // InternalUniMapperGenerator.g:4123:4: (lv_elements_1_0= ruleLexerElementWithDollar )
            	    {
            	    // InternalUniMapperGenerator.g:4123:4: (lv_elements_1_0= ruleLexerElementWithDollar )
            	    // InternalUniMapperGenerator.g:4124:5: lv_elements_1_0= ruleLexerElementWithDollar
            	    {

            	    					newCompositeNode(grammarAccess.getLexerElementsAccess().getElementsLexerElementWithDollarParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_63);
            	    lv_elements_1_0=ruleLexerElementWithDollar();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getLexerElementsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_1_0,
            	    						"net.unicoen.UniMapperGenerator.LexerElementWithDollar");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop69;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLexerElements"


    // $ANTLR start "entryRuleLexerElementWithDollar"
    // InternalUniMapperGenerator.g:4145:1: entryRuleLexerElementWithDollar returns [EObject current=null] : iv_ruleLexerElementWithDollar= ruleLexerElementWithDollar EOF ;
    public final EObject entryRuleLexerElementWithDollar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLexerElementWithDollar = null;


        try {
            // InternalUniMapperGenerator.g:4145:63: (iv_ruleLexerElementWithDollar= ruleLexerElementWithDollar EOF )
            // InternalUniMapperGenerator.g:4146:2: iv_ruleLexerElementWithDollar= ruleLexerElementWithDollar EOF
            {
             newCompositeNode(grammarAccess.getLexerElementWithDollarRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLexerElementWithDollar=ruleLexerElementWithDollar();

            state._fsp--;

             current =iv_ruleLexerElementWithDollar; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLexerElementWithDollar"


    // $ANTLR start "ruleLexerElementWithDollar"
    // InternalUniMapperGenerator.g:4152:1: ruleLexerElementWithDollar returns [EObject current=null] : ( ( (lv_body_0_0= ruleLexerElement ) ) (this_DOLLAR_1= RULE_DOLLAR ( (lv_op_2_0= ruleId ) ) )? ) ;
    public final EObject ruleLexerElementWithDollar() throws RecognitionException {
        EObject current = null;

        Token this_DOLLAR_1=null;
        EObject lv_body_0_0 = null;

        AntlrDatatypeRuleToken lv_op_2_0 = null;



        	enterRule();

        try {
            // InternalUniMapperGenerator.g:4158:2: ( ( ( (lv_body_0_0= ruleLexerElement ) ) (this_DOLLAR_1= RULE_DOLLAR ( (lv_op_2_0= ruleId ) ) )? ) )
            // InternalUniMapperGenerator.g:4159:2: ( ( (lv_body_0_0= ruleLexerElement ) ) (this_DOLLAR_1= RULE_DOLLAR ( (lv_op_2_0= ruleId ) ) )? )
            {
            // InternalUniMapperGenerator.g:4159:2: ( ( (lv_body_0_0= ruleLexerElement ) ) (this_DOLLAR_1= RULE_DOLLAR ( (lv_op_2_0= ruleId ) ) )? )
            // InternalUniMapperGenerator.g:4160:3: ( (lv_body_0_0= ruleLexerElement ) ) (this_DOLLAR_1= RULE_DOLLAR ( (lv_op_2_0= ruleId ) ) )?
            {
            // InternalUniMapperGenerator.g:4160:3: ( (lv_body_0_0= ruleLexerElement ) )
            // InternalUniMapperGenerator.g:4161:4: (lv_body_0_0= ruleLexerElement )
            {
            // InternalUniMapperGenerator.g:4161:4: (lv_body_0_0= ruleLexerElement )
            // InternalUniMapperGenerator.g:4162:5: lv_body_0_0= ruleLexerElement
            {

            					newCompositeNode(grammarAccess.getLexerElementWithDollarAccess().getBodyLexerElementParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_40);
            lv_body_0_0=ruleLexerElement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLexerElementWithDollarRule());
            					}
            					set(
            						current,
            						"body",
            						lv_body_0_0,
            						"net.unicoen.UniMapperGenerator.LexerElement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUniMapperGenerator.g:4179:3: (this_DOLLAR_1= RULE_DOLLAR ( (lv_op_2_0= ruleId ) ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==RULE_DOLLAR) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalUniMapperGenerator.g:4180:4: this_DOLLAR_1= RULE_DOLLAR ( (lv_op_2_0= ruleId ) )
                    {
                    this_DOLLAR_1=(Token)match(input,RULE_DOLLAR,FOLLOW_4); 

                    				newLeafNode(this_DOLLAR_1, grammarAccess.getLexerElementWithDollarAccess().getDOLLARTerminalRuleCall_1_0());
                    			
                    // InternalUniMapperGenerator.g:4184:4: ( (lv_op_2_0= ruleId ) )
                    // InternalUniMapperGenerator.g:4185:5: (lv_op_2_0= ruleId )
                    {
                    // InternalUniMapperGenerator.g:4185:5: (lv_op_2_0= ruleId )
                    // InternalUniMapperGenerator.g:4186:6: lv_op_2_0= ruleId
                    {

                    						newCompositeNode(grammarAccess.getLexerElementWithDollarAccess().getOpIdParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_op_2_0=ruleId();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLexerElementWithDollarRule());
                    						}
                    						set(
                    							current,
                    							"op",
                    							lv_op_2_0,
                    							"net.unicoen.UniMapperGenerator.Id");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLexerElementWithDollar"


    // $ANTLR start "entryRuleLexerElement"
    // InternalUniMapperGenerator.g:4208:1: entryRuleLexerElement returns [EObject current=null] : iv_ruleLexerElement= ruleLexerElement EOF ;
    public final EObject entryRuleLexerElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLexerElement = null;


        try {
            // InternalUniMapperGenerator.g:4208:53: (iv_ruleLexerElement= ruleLexerElement EOF )
            // InternalUniMapperGenerator.g:4209:2: iv_ruleLexerElement= ruleLexerElement EOF
            {
             newCompositeNode(grammarAccess.getLexerElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLexerElement=ruleLexerElement();

            state._fsp--;

             current =iv_ruleLexerElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLexerElement"


    // $ANTLR start "ruleLexerElement"
    // InternalUniMapperGenerator.g:4215:1: ruleLexerElement returns [EObject current=null] : ( ( ( (lv_body_0_0= ruleLabeledLexerElement ) ) ( (lv_operator_1_0= ruleEbnfSuffix ) )? ) | ( ( (lv_body_2_0= ruleLexerAtom ) ) ( (lv_operator_3_0= ruleEbnfSuffix ) )? ) | ( ( (lv_body_4_0= ruleLexerBlock ) ) ( (lv_operator_5_0= ruleEbnfSuffix ) )? ) | ( (lv_body_6_0= ruleActionElement ) ) ) ;
    public final EObject ruleLexerElement() throws RecognitionException {
        EObject current = null;

        EObject lv_body_0_0 = null;

        EObject lv_operator_1_0 = null;

        EObject lv_body_2_0 = null;

        EObject lv_operator_3_0 = null;

        EObject lv_body_4_0 = null;

        EObject lv_operator_5_0 = null;

        EObject lv_body_6_0 = null;



        	enterRule();

        try {
            // InternalUniMapperGenerator.g:4221:2: ( ( ( ( (lv_body_0_0= ruleLabeledLexerElement ) ) ( (lv_operator_1_0= ruleEbnfSuffix ) )? ) | ( ( (lv_body_2_0= ruleLexerAtom ) ) ( (lv_operator_3_0= ruleEbnfSuffix ) )? ) | ( ( (lv_body_4_0= ruleLexerBlock ) ) ( (lv_operator_5_0= ruleEbnfSuffix ) )? ) | ( (lv_body_6_0= ruleActionElement ) ) ) )
            // InternalUniMapperGenerator.g:4222:2: ( ( ( (lv_body_0_0= ruleLabeledLexerElement ) ) ( (lv_operator_1_0= ruleEbnfSuffix ) )? ) | ( ( (lv_body_2_0= ruleLexerAtom ) ) ( (lv_operator_3_0= ruleEbnfSuffix ) )? ) | ( ( (lv_body_4_0= ruleLexerBlock ) ) ( (lv_operator_5_0= ruleEbnfSuffix ) )? ) | ( (lv_body_6_0= ruleActionElement ) ) )
            {
            // InternalUniMapperGenerator.g:4222:2: ( ( ( (lv_body_0_0= ruleLabeledLexerElement ) ) ( (lv_operator_1_0= ruleEbnfSuffix ) )? ) | ( ( (lv_body_2_0= ruleLexerAtom ) ) ( (lv_operator_3_0= ruleEbnfSuffix ) )? ) | ( ( (lv_body_4_0= ruleLexerBlock ) ) ( (lv_operator_5_0= ruleEbnfSuffix ) )? ) | ( (lv_body_6_0= ruleActionElement ) ) )
            int alt74=4;
            switch ( input.LA(1) ) {
            case RULE_TOKEN_REF:
                {
                int LA74_1 = input.LA(2);

                if ( (LA74_1==35||LA74_1==51) ) {
                    alt74=1;
                }
                else if ( (LA74_1==EOF||(LA74_1>=RULE_SEMICOLON && LA74_1<=RULE_RULE_REF)||(LA74_1>=RULE_MYSTRING && LA74_1<=RULE_ACTION)||LA74_1==RULE_ARG_OR_CHARSET||(LA74_1>=RULE_DOLLAR && LA74_1<=RULE_RARROW)||LA74_1==49||(LA74_1>=52 && LA74_1<=57)||(LA74_1>=60 && LA74_1<=62)) ) {
                    alt74=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 74, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_RULE_REF:
                {
                int LA74_2 = input.LA(2);

                if ( (LA74_2==35||LA74_2==51) ) {
                    alt74=1;
                }
                else if ( (LA74_2==EOF||(LA74_2>=RULE_SEMICOLON && LA74_2<=RULE_RULE_REF)||(LA74_2>=RULE_MYSTRING && LA74_2<=RULE_ACTION)||LA74_2==RULE_ARG_OR_CHARSET||(LA74_2>=RULE_DOLLAR && LA74_2<=RULE_RARROW)||LA74_2==49||(LA74_2>=52 && LA74_2<=57)||(LA74_2>=60 && LA74_2<=62)) ) {
                    alt74=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 74, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_MYSTRING:
            case RULE_ARG_OR_CHARSET:
            case 60:
            case 61:
            case 62:
                {
                alt74=2;
                }
                break;
            case 55:
                {
                alt74=3;
                }
                break;
            case RULE_ACTION:
                {
                alt74=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;
            }

            switch (alt74) {
                case 1 :
                    // InternalUniMapperGenerator.g:4223:3: ( ( (lv_body_0_0= ruleLabeledLexerElement ) ) ( (lv_operator_1_0= ruleEbnfSuffix ) )? )
                    {
                    // InternalUniMapperGenerator.g:4223:3: ( ( (lv_body_0_0= ruleLabeledLexerElement ) ) ( (lv_operator_1_0= ruleEbnfSuffix ) )? )
                    // InternalUniMapperGenerator.g:4224:4: ( (lv_body_0_0= ruleLabeledLexerElement ) ) ( (lv_operator_1_0= ruleEbnfSuffix ) )?
                    {
                    // InternalUniMapperGenerator.g:4224:4: ( (lv_body_0_0= ruleLabeledLexerElement ) )
                    // InternalUniMapperGenerator.g:4225:5: (lv_body_0_0= ruleLabeledLexerElement )
                    {
                    // InternalUniMapperGenerator.g:4225:5: (lv_body_0_0= ruleLabeledLexerElement )
                    // InternalUniMapperGenerator.g:4226:6: lv_body_0_0= ruleLabeledLexerElement
                    {

                    						newCompositeNode(grammarAccess.getLexerElementAccess().getBodyLabeledLexerElementParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_38);
                    lv_body_0_0=ruleLabeledLexerElement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLexerElementRule());
                    						}
                    						set(
                    							current,
                    							"body",
                    							lv_body_0_0,
                    							"net.unicoen.UniMapperGenerator.LabeledLexerElement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalUniMapperGenerator.g:4243:4: ( (lv_operator_1_0= ruleEbnfSuffix ) )?
                    int alt71=2;
                    int LA71_0 = input.LA(1);

                    if ( ((LA71_0>=52 && LA71_0<=54)) ) {
                        alt71=1;
                    }
                    switch (alt71) {
                        case 1 :
                            // InternalUniMapperGenerator.g:4244:5: (lv_operator_1_0= ruleEbnfSuffix )
                            {
                            // InternalUniMapperGenerator.g:4244:5: (lv_operator_1_0= ruleEbnfSuffix )
                            // InternalUniMapperGenerator.g:4245:6: lv_operator_1_0= ruleEbnfSuffix
                            {

                            						newCompositeNode(grammarAccess.getLexerElementAccess().getOperatorEbnfSuffixParserRuleCall_0_1_0());
                            					
                            pushFollow(FOLLOW_2);
                            lv_operator_1_0=ruleEbnfSuffix();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getLexerElementRule());
                            						}
                            						set(
                            							current,
                            							"operator",
                            							lv_operator_1_0,
                            							"net.unicoen.UniMapperGenerator.EbnfSuffix");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalUniMapperGenerator.g:4264:3: ( ( (lv_body_2_0= ruleLexerAtom ) ) ( (lv_operator_3_0= ruleEbnfSuffix ) )? )
                    {
                    // InternalUniMapperGenerator.g:4264:3: ( ( (lv_body_2_0= ruleLexerAtom ) ) ( (lv_operator_3_0= ruleEbnfSuffix ) )? )
                    // InternalUniMapperGenerator.g:4265:4: ( (lv_body_2_0= ruleLexerAtom ) ) ( (lv_operator_3_0= ruleEbnfSuffix ) )?
                    {
                    // InternalUniMapperGenerator.g:4265:4: ( (lv_body_2_0= ruleLexerAtom ) )
                    // InternalUniMapperGenerator.g:4266:5: (lv_body_2_0= ruleLexerAtom )
                    {
                    // InternalUniMapperGenerator.g:4266:5: (lv_body_2_0= ruleLexerAtom )
                    // InternalUniMapperGenerator.g:4267:6: lv_body_2_0= ruleLexerAtom
                    {

                    						newCompositeNode(grammarAccess.getLexerElementAccess().getBodyLexerAtomParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_38);
                    lv_body_2_0=ruleLexerAtom();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLexerElementRule());
                    						}
                    						set(
                    							current,
                    							"body",
                    							lv_body_2_0,
                    							"net.unicoen.UniMapperGenerator.LexerAtom");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalUniMapperGenerator.g:4284:4: ( (lv_operator_3_0= ruleEbnfSuffix ) )?
                    int alt72=2;
                    int LA72_0 = input.LA(1);

                    if ( ((LA72_0>=52 && LA72_0<=54)) ) {
                        alt72=1;
                    }
                    switch (alt72) {
                        case 1 :
                            // InternalUniMapperGenerator.g:4285:5: (lv_operator_3_0= ruleEbnfSuffix )
                            {
                            // InternalUniMapperGenerator.g:4285:5: (lv_operator_3_0= ruleEbnfSuffix )
                            // InternalUniMapperGenerator.g:4286:6: lv_operator_3_0= ruleEbnfSuffix
                            {

                            						newCompositeNode(grammarAccess.getLexerElementAccess().getOperatorEbnfSuffixParserRuleCall_1_1_0());
                            					
                            pushFollow(FOLLOW_2);
                            lv_operator_3_0=ruleEbnfSuffix();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getLexerElementRule());
                            						}
                            						set(
                            							current,
                            							"operator",
                            							lv_operator_3_0,
                            							"net.unicoen.UniMapperGenerator.EbnfSuffix");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalUniMapperGenerator.g:4305:3: ( ( (lv_body_4_0= ruleLexerBlock ) ) ( (lv_operator_5_0= ruleEbnfSuffix ) )? )
                    {
                    // InternalUniMapperGenerator.g:4305:3: ( ( (lv_body_4_0= ruleLexerBlock ) ) ( (lv_operator_5_0= ruleEbnfSuffix ) )? )
                    // InternalUniMapperGenerator.g:4306:4: ( (lv_body_4_0= ruleLexerBlock ) ) ( (lv_operator_5_0= ruleEbnfSuffix ) )?
                    {
                    // InternalUniMapperGenerator.g:4306:4: ( (lv_body_4_0= ruleLexerBlock ) )
                    // InternalUniMapperGenerator.g:4307:5: (lv_body_4_0= ruleLexerBlock )
                    {
                    // InternalUniMapperGenerator.g:4307:5: (lv_body_4_0= ruleLexerBlock )
                    // InternalUniMapperGenerator.g:4308:6: lv_body_4_0= ruleLexerBlock
                    {

                    						newCompositeNode(grammarAccess.getLexerElementAccess().getBodyLexerBlockParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_38);
                    lv_body_4_0=ruleLexerBlock();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLexerElementRule());
                    						}
                    						set(
                    							current,
                    							"body",
                    							lv_body_4_0,
                    							"net.unicoen.UniMapperGenerator.LexerBlock");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalUniMapperGenerator.g:4325:4: ( (lv_operator_5_0= ruleEbnfSuffix ) )?
                    int alt73=2;
                    int LA73_0 = input.LA(1);

                    if ( ((LA73_0>=52 && LA73_0<=54)) ) {
                        alt73=1;
                    }
                    switch (alt73) {
                        case 1 :
                            // InternalUniMapperGenerator.g:4326:5: (lv_operator_5_0= ruleEbnfSuffix )
                            {
                            // InternalUniMapperGenerator.g:4326:5: (lv_operator_5_0= ruleEbnfSuffix )
                            // InternalUniMapperGenerator.g:4327:6: lv_operator_5_0= ruleEbnfSuffix
                            {

                            						newCompositeNode(grammarAccess.getLexerElementAccess().getOperatorEbnfSuffixParserRuleCall_2_1_0());
                            					
                            pushFollow(FOLLOW_2);
                            lv_operator_5_0=ruleEbnfSuffix();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getLexerElementRule());
                            						}
                            						set(
                            							current,
                            							"operator",
                            							lv_operator_5_0,
                            							"net.unicoen.UniMapperGenerator.EbnfSuffix");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalUniMapperGenerator.g:4346:3: ( (lv_body_6_0= ruleActionElement ) )
                    {
                    // InternalUniMapperGenerator.g:4346:3: ( (lv_body_6_0= ruleActionElement ) )
                    // InternalUniMapperGenerator.g:4347:4: (lv_body_6_0= ruleActionElement )
                    {
                    // InternalUniMapperGenerator.g:4347:4: (lv_body_6_0= ruleActionElement )
                    // InternalUniMapperGenerator.g:4348:5: lv_body_6_0= ruleActionElement
                    {

                    					newCompositeNode(grammarAccess.getLexerElementAccess().getBodyActionElementParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_body_6_0=ruleActionElement();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getLexerElementRule());
                    					}
                    					set(
                    						current,
                    						"body",
                    						lv_body_6_0,
                    						"net.unicoen.UniMapperGenerator.ActionElement");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLexerElement"


    // $ANTLR start "entryRuleLabeledLexerElement"
    // InternalUniMapperGenerator.g:4369:1: entryRuleLabeledLexerElement returns [EObject current=null] : iv_ruleLabeledLexerElement= ruleLabeledLexerElement EOF ;
    public final EObject entryRuleLabeledLexerElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabeledLexerElement = null;


        try {
            // InternalUniMapperGenerator.g:4369:60: (iv_ruleLabeledLexerElement= ruleLabeledLexerElement EOF )
            // InternalUniMapperGenerator.g:4370:2: iv_ruleLabeledLexerElement= ruleLabeledLexerElement EOF
            {
             newCompositeNode(grammarAccess.getLabeledLexerElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLabeledLexerElement=ruleLabeledLexerElement();

            state._fsp--;

             current =iv_ruleLabeledLexerElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLabeledLexerElement"


    // $ANTLR start "ruleLabeledLexerElement"
    // InternalUniMapperGenerator.g:4376:1: ruleLabeledLexerElement returns [EObject current=null] : ( ( (lv_label_0_0= ruleId ) ) ( ( (lv_op_1_1= '=' | lv_op_1_2= '+=' ) ) ) ( ( (lv_body_2_0= ruleLexerAtom ) ) | ( (lv_body_3_0= ruleLexerBlock ) ) ) ) ;
    public final EObject ruleLabeledLexerElement() throws RecognitionException {
        EObject current = null;

        Token lv_op_1_1=null;
        Token lv_op_1_2=null;
        AntlrDatatypeRuleToken lv_label_0_0 = null;

        EObject lv_body_2_0 = null;

        EObject lv_body_3_0 = null;



        	enterRule();

        try {
            // InternalUniMapperGenerator.g:4382:2: ( ( ( (lv_label_0_0= ruleId ) ) ( ( (lv_op_1_1= '=' | lv_op_1_2= '+=' ) ) ) ( ( (lv_body_2_0= ruleLexerAtom ) ) | ( (lv_body_3_0= ruleLexerBlock ) ) ) ) )
            // InternalUniMapperGenerator.g:4383:2: ( ( (lv_label_0_0= ruleId ) ) ( ( (lv_op_1_1= '=' | lv_op_1_2= '+=' ) ) ) ( ( (lv_body_2_0= ruleLexerAtom ) ) | ( (lv_body_3_0= ruleLexerBlock ) ) ) )
            {
            // InternalUniMapperGenerator.g:4383:2: ( ( (lv_label_0_0= ruleId ) ) ( ( (lv_op_1_1= '=' | lv_op_1_2= '+=' ) ) ) ( ( (lv_body_2_0= ruleLexerAtom ) ) | ( (lv_body_3_0= ruleLexerBlock ) ) ) )
            // InternalUniMapperGenerator.g:4384:3: ( (lv_label_0_0= ruleId ) ) ( ( (lv_op_1_1= '=' | lv_op_1_2= '+=' ) ) ) ( ( (lv_body_2_0= ruleLexerAtom ) ) | ( (lv_body_3_0= ruleLexerBlock ) ) )
            {
            // InternalUniMapperGenerator.g:4384:3: ( (lv_label_0_0= ruleId ) )
            // InternalUniMapperGenerator.g:4385:4: (lv_label_0_0= ruleId )
            {
            // InternalUniMapperGenerator.g:4385:4: (lv_label_0_0= ruleId )
            // InternalUniMapperGenerator.g:4386:5: lv_label_0_0= ruleId
            {

            					newCompositeNode(grammarAccess.getLabeledLexerElementAccess().getLabelIdParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_42);
            lv_label_0_0=ruleId();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLabeledLexerElementRule());
            					}
            					set(
            						current,
            						"label",
            						lv_label_0_0,
            						"net.unicoen.UniMapperGenerator.Id");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUniMapperGenerator.g:4403:3: ( ( (lv_op_1_1= '=' | lv_op_1_2= '+=' ) ) )
            // InternalUniMapperGenerator.g:4404:4: ( (lv_op_1_1= '=' | lv_op_1_2= '+=' ) )
            {
            // InternalUniMapperGenerator.g:4404:4: ( (lv_op_1_1= '=' | lv_op_1_2= '+=' ) )
            // InternalUniMapperGenerator.g:4405:5: (lv_op_1_1= '=' | lv_op_1_2= '+=' )
            {
            // InternalUniMapperGenerator.g:4405:5: (lv_op_1_1= '=' | lv_op_1_2= '+=' )
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==35) ) {
                alt75=1;
            }
            else if ( (LA75_0==51) ) {
                alt75=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }
            switch (alt75) {
                case 1 :
                    // InternalUniMapperGenerator.g:4406:6: lv_op_1_1= '='
                    {
                    lv_op_1_1=(Token)match(input,35,FOLLOW_64); 

                    						newLeafNode(lv_op_1_1, grammarAccess.getLabeledLexerElementAccess().getOpEqualsSignKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLabeledLexerElementRule());
                    						}
                    						setWithLastConsumed(current, "op", lv_op_1_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalUniMapperGenerator.g:4417:6: lv_op_1_2= '+='
                    {
                    lv_op_1_2=(Token)match(input,51,FOLLOW_64); 

                    						newLeafNode(lv_op_1_2, grammarAccess.getLabeledLexerElementAccess().getOpPlusSignEqualsSignKeyword_1_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLabeledLexerElementRule());
                    						}
                    						setWithLastConsumed(current, "op", lv_op_1_2, null);
                    					

                    }
                    break;

            }


            }


            }

            // InternalUniMapperGenerator.g:4430:3: ( ( (lv_body_2_0= ruleLexerAtom ) ) | ( (lv_body_3_0= ruleLexerBlock ) ) )
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==RULE_RULE_REF||LA76_0==RULE_MYSTRING||LA76_0==RULE_ARG_OR_CHARSET||LA76_0==RULE_TOKEN_REF||(LA76_0>=60 && LA76_0<=62)) ) {
                alt76=1;
            }
            else if ( (LA76_0==55) ) {
                alt76=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;
            }
            switch (alt76) {
                case 1 :
                    // InternalUniMapperGenerator.g:4431:4: ( (lv_body_2_0= ruleLexerAtom ) )
                    {
                    // InternalUniMapperGenerator.g:4431:4: ( (lv_body_2_0= ruleLexerAtom ) )
                    // InternalUniMapperGenerator.g:4432:5: (lv_body_2_0= ruleLexerAtom )
                    {
                    // InternalUniMapperGenerator.g:4432:5: (lv_body_2_0= ruleLexerAtom )
                    // InternalUniMapperGenerator.g:4433:6: lv_body_2_0= ruleLexerAtom
                    {

                    						newCompositeNode(grammarAccess.getLabeledLexerElementAccess().getBodyLexerAtomParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_body_2_0=ruleLexerAtom();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLabeledLexerElementRule());
                    						}
                    						set(
                    							current,
                    							"body",
                    							lv_body_2_0,
                    							"net.unicoen.UniMapperGenerator.LexerAtom");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalUniMapperGenerator.g:4451:4: ( (lv_body_3_0= ruleLexerBlock ) )
                    {
                    // InternalUniMapperGenerator.g:4451:4: ( (lv_body_3_0= ruleLexerBlock ) )
                    // InternalUniMapperGenerator.g:4452:5: (lv_body_3_0= ruleLexerBlock )
                    {
                    // InternalUniMapperGenerator.g:4452:5: (lv_body_3_0= ruleLexerBlock )
                    // InternalUniMapperGenerator.g:4453:6: lv_body_3_0= ruleLexerBlock
                    {

                    						newCompositeNode(grammarAccess.getLabeledLexerElementAccess().getBodyLexerBlockParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_body_3_0=ruleLexerBlock();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLabeledLexerElementRule());
                    						}
                    						set(
                    							current,
                    							"body",
                    							lv_body_3_0,
                    							"net.unicoen.UniMapperGenerator.LexerBlock");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLabeledLexerElement"


    // $ANTLR start "entryRuleLexerAtom"
    // InternalUniMapperGenerator.g:4475:1: entryRuleLexerAtom returns [EObject current=null] : iv_ruleLexerAtom= ruleLexerAtom EOF ;
    public final EObject entryRuleLexerAtom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLexerAtom = null;


        try {
            // InternalUniMapperGenerator.g:4475:50: (iv_ruleLexerAtom= ruleLexerAtom EOF )
            // InternalUniMapperGenerator.g:4476:2: iv_ruleLexerAtom= ruleLexerAtom EOF
            {
             newCompositeNode(grammarAccess.getLexerAtomRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLexerAtom=ruleLexerAtom();

            state._fsp--;

             current =iv_ruleLexerAtom; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLexerAtom"


    // $ANTLR start "ruleLexerAtom"
    // InternalUniMapperGenerator.g:4482:1: ruleLexerAtom returns [EObject current=null] : ( ( (lv_body_0_1= ruleRange | lv_body_0_2= ruleTerminal | lv_body_0_3= ruleRuleRef | lv_body_0_4= ruleNotSet | lv_body_0_5= ruleWildcard | lv_body_0_6= ruleLexerCharSet ) ) ) ;
    public final EObject ruleLexerAtom() throws RecognitionException {
        EObject current = null;

        EObject lv_body_0_1 = null;

        EObject lv_body_0_2 = null;

        EObject lv_body_0_3 = null;

        EObject lv_body_0_4 = null;

        EObject lv_body_0_5 = null;

        EObject lv_body_0_6 = null;



        	enterRule();

        try {
            // InternalUniMapperGenerator.g:4488:2: ( ( ( (lv_body_0_1= ruleRange | lv_body_0_2= ruleTerminal | lv_body_0_3= ruleRuleRef | lv_body_0_4= ruleNotSet | lv_body_0_5= ruleWildcard | lv_body_0_6= ruleLexerCharSet ) ) ) )
            // InternalUniMapperGenerator.g:4489:2: ( ( (lv_body_0_1= ruleRange | lv_body_0_2= ruleTerminal | lv_body_0_3= ruleRuleRef | lv_body_0_4= ruleNotSet | lv_body_0_5= ruleWildcard | lv_body_0_6= ruleLexerCharSet ) ) )
            {
            // InternalUniMapperGenerator.g:4489:2: ( ( (lv_body_0_1= ruleRange | lv_body_0_2= ruleTerminal | lv_body_0_3= ruleRuleRef | lv_body_0_4= ruleNotSet | lv_body_0_5= ruleWildcard | lv_body_0_6= ruleLexerCharSet ) ) )
            // InternalUniMapperGenerator.g:4490:3: ( (lv_body_0_1= ruleRange | lv_body_0_2= ruleTerminal | lv_body_0_3= ruleRuleRef | lv_body_0_4= ruleNotSet | lv_body_0_5= ruleWildcard | lv_body_0_6= ruleLexerCharSet ) )
            {
            // InternalUniMapperGenerator.g:4490:3: ( (lv_body_0_1= ruleRange | lv_body_0_2= ruleTerminal | lv_body_0_3= ruleRuleRef | lv_body_0_4= ruleNotSet | lv_body_0_5= ruleWildcard | lv_body_0_6= ruleLexerCharSet ) )
            // InternalUniMapperGenerator.g:4491:4: (lv_body_0_1= ruleRange | lv_body_0_2= ruleTerminal | lv_body_0_3= ruleRuleRef | lv_body_0_4= ruleNotSet | lv_body_0_5= ruleWildcard | lv_body_0_6= ruleLexerCharSet )
            {
            // InternalUniMapperGenerator.g:4491:4: (lv_body_0_1= ruleRange | lv_body_0_2= ruleTerminal | lv_body_0_3= ruleRuleRef | lv_body_0_4= ruleNotSet | lv_body_0_5= ruleWildcard | lv_body_0_6= ruleLexerCharSet )
            int alt77=6;
            switch ( input.LA(1) ) {
            case RULE_MYSTRING:
                {
                int LA77_1 = input.LA(2);

                if ( (LA77_1==EOF||(LA77_1>=RULE_SEMICOLON && LA77_1<=RULE_RULE_REF)||(LA77_1>=RULE_MYSTRING && LA77_1<=RULE_ACTION)||LA77_1==RULE_ARG_OR_CHARSET||(LA77_1>=RULE_DOLLAR && LA77_1<=RULE_RARROW)||LA77_1==49||(LA77_1>=52 && LA77_1<=57)||(LA77_1>=60 && LA77_1<=62)) ) {
                    alt77=2;
                }
                else if ( (LA77_1==59) ) {
                    alt77=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 77, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_TOKEN_REF:
            case 60:
                {
                alt77=2;
                }
                break;
            case RULE_RULE_REF:
                {
                alt77=3;
                }
                break;
            case 61:
                {
                alt77=4;
                }
                break;
            case 62:
                {
                alt77=5;
                }
                break;
            case RULE_ARG_OR_CHARSET:
                {
                alt77=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;
            }

            switch (alt77) {
                case 1 :
                    // InternalUniMapperGenerator.g:4492:5: lv_body_0_1= ruleRange
                    {

                    					newCompositeNode(grammarAccess.getLexerAtomAccess().getBodyRangeParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_body_0_1=ruleRange();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getLexerAtomRule());
                    					}
                    					set(
                    						current,
                    						"body",
                    						lv_body_0_1,
                    						"net.unicoen.UniMapperGenerator.Range");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 2 :
                    // InternalUniMapperGenerator.g:4508:5: lv_body_0_2= ruleTerminal
                    {

                    					newCompositeNode(grammarAccess.getLexerAtomAccess().getBodyTerminalParserRuleCall_0_1());
                    				
                    pushFollow(FOLLOW_2);
                    lv_body_0_2=ruleTerminal();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getLexerAtomRule());
                    					}
                    					set(
                    						current,
                    						"body",
                    						lv_body_0_2,
                    						"net.unicoen.UniMapperGenerator.Terminal");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 3 :
                    // InternalUniMapperGenerator.g:4524:5: lv_body_0_3= ruleRuleRef
                    {

                    					newCompositeNode(grammarAccess.getLexerAtomAccess().getBodyRuleRefParserRuleCall_0_2());
                    				
                    pushFollow(FOLLOW_2);
                    lv_body_0_3=ruleRuleRef();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getLexerAtomRule());
                    					}
                    					set(
                    						current,
                    						"body",
                    						lv_body_0_3,
                    						"net.unicoen.UniMapperGenerator.RuleRef");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 4 :
                    // InternalUniMapperGenerator.g:4540:5: lv_body_0_4= ruleNotSet
                    {

                    					newCompositeNode(grammarAccess.getLexerAtomAccess().getBodyNotSetParserRuleCall_0_3());
                    				
                    pushFollow(FOLLOW_2);
                    lv_body_0_4=ruleNotSet();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getLexerAtomRule());
                    					}
                    					set(
                    						current,
                    						"body",
                    						lv_body_0_4,
                    						"net.unicoen.UniMapperGenerator.NotSet");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 5 :
                    // InternalUniMapperGenerator.g:4556:5: lv_body_0_5= ruleWildcard
                    {

                    					newCompositeNode(grammarAccess.getLexerAtomAccess().getBodyWildcardParserRuleCall_0_4());
                    				
                    pushFollow(FOLLOW_2);
                    lv_body_0_5=ruleWildcard();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getLexerAtomRule());
                    					}
                    					set(
                    						current,
                    						"body",
                    						lv_body_0_5,
                    						"net.unicoen.UniMapperGenerator.Wildcard");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 6 :
                    // InternalUniMapperGenerator.g:4572:5: lv_body_0_6= ruleLexerCharSet
                    {

                    					newCompositeNode(grammarAccess.getLexerAtomAccess().getBodyLexerCharSetParserRuleCall_0_5());
                    				
                    pushFollow(FOLLOW_2);
                    lv_body_0_6=ruleLexerCharSet();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getLexerAtomRule());
                    					}
                    					set(
                    						current,
                    						"body",
                    						lv_body_0_6,
                    						"net.unicoen.UniMapperGenerator.LexerCharSet");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLexerAtom"


    // $ANTLR start "entryRuleLexerCharSet"
    // InternalUniMapperGenerator.g:4593:1: entryRuleLexerCharSet returns [EObject current=null] : iv_ruleLexerCharSet= ruleLexerCharSet EOF ;
    public final EObject entryRuleLexerCharSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLexerCharSet = null;


        try {
            // InternalUniMapperGenerator.g:4593:53: (iv_ruleLexerCharSet= ruleLexerCharSet EOF )
            // InternalUniMapperGenerator.g:4594:2: iv_ruleLexerCharSet= ruleLexerCharSet EOF
            {
             newCompositeNode(grammarAccess.getLexerCharSetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLexerCharSet=ruleLexerCharSet();

            state._fsp--;

             current =iv_ruleLexerCharSet; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLexerCharSet"


    // $ANTLR start "ruleLexerCharSet"
    // InternalUniMapperGenerator.g:4600:1: ruleLexerCharSet returns [EObject current=null] : ( (lv_body_0_0= RULE_ARG_OR_CHARSET ) ) ;
    public final EObject ruleLexerCharSet() throws RecognitionException {
        EObject current = null;

        Token lv_body_0_0=null;


        	enterRule();

        try {
            // InternalUniMapperGenerator.g:4606:2: ( ( (lv_body_0_0= RULE_ARG_OR_CHARSET ) ) )
            // InternalUniMapperGenerator.g:4607:2: ( (lv_body_0_0= RULE_ARG_OR_CHARSET ) )
            {
            // InternalUniMapperGenerator.g:4607:2: ( (lv_body_0_0= RULE_ARG_OR_CHARSET ) )
            // InternalUniMapperGenerator.g:4608:3: (lv_body_0_0= RULE_ARG_OR_CHARSET )
            {
            // InternalUniMapperGenerator.g:4608:3: (lv_body_0_0= RULE_ARG_OR_CHARSET )
            // InternalUniMapperGenerator.g:4609:4: lv_body_0_0= RULE_ARG_OR_CHARSET
            {
            lv_body_0_0=(Token)match(input,RULE_ARG_OR_CHARSET,FOLLOW_2); 

            				newLeafNode(lv_body_0_0, grammarAccess.getLexerCharSetAccess().getBodyARG_OR_CHARSETTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getLexerCharSetRule());
            				}
            				setWithLastConsumed(
            					current,
            					"body",
            					lv_body_0_0,
            					"net.unicoen.UniMapperGenerator.ARG_OR_CHARSET");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLexerCharSet"


    // $ANTLR start "entryRuleLexerBlock"
    // InternalUniMapperGenerator.g:4628:1: entryRuleLexerBlock returns [EObject current=null] : iv_ruleLexerBlock= ruleLexerBlock EOF ;
    public final EObject entryRuleLexerBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLexerBlock = null;


        try {
            // InternalUniMapperGenerator.g:4628:51: (iv_ruleLexerBlock= ruleLexerBlock EOF )
            // InternalUniMapperGenerator.g:4629:2: iv_ruleLexerBlock= ruleLexerBlock EOF
            {
             newCompositeNode(grammarAccess.getLexerBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLexerBlock=ruleLexerBlock();

            state._fsp--;

             current =iv_ruleLexerBlock; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLexerBlock"


    // $ANTLR start "ruleLexerBlock"
    // InternalUniMapperGenerator.g:4635:1: ruleLexerBlock returns [EObject current=null] : (otherlv_0= '(' ( ( (lv_options_1_0= ruleOptions ) ) this_COLON_2= RULE_COLON )? ( (lv_body_3_0= ruleLexerAltList ) ) otherlv_4= ')' ) ;
    public final EObject ruleLexerBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_COLON_2=null;
        Token otherlv_4=null;
        EObject lv_options_1_0 = null;

        EObject lv_body_3_0 = null;



        	enterRule();

        try {
            // InternalUniMapperGenerator.g:4641:2: ( (otherlv_0= '(' ( ( (lv_options_1_0= ruleOptions ) ) this_COLON_2= RULE_COLON )? ( (lv_body_3_0= ruleLexerAltList ) ) otherlv_4= ')' ) )
            // InternalUniMapperGenerator.g:4642:2: (otherlv_0= '(' ( ( (lv_options_1_0= ruleOptions ) ) this_COLON_2= RULE_COLON )? ( (lv_body_3_0= ruleLexerAltList ) ) otherlv_4= ')' )
            {
            // InternalUniMapperGenerator.g:4642:2: (otherlv_0= '(' ( ( (lv_options_1_0= ruleOptions ) ) this_COLON_2= RULE_COLON )? ( (lv_body_3_0= ruleLexerAltList ) ) otherlv_4= ')' )
            // InternalUniMapperGenerator.g:4643:3: otherlv_0= '(' ( ( (lv_options_1_0= ruleOptions ) ) this_COLON_2= RULE_COLON )? ( (lv_body_3_0= ruleLexerAltList ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,55,FOLLOW_65); 

            			newLeafNode(otherlv_0, grammarAccess.getLexerBlockAccess().getLeftParenthesisKeyword_0());
            		
            // InternalUniMapperGenerator.g:4647:3: ( ( (lv_options_1_0= ruleOptions ) ) this_COLON_2= RULE_COLON )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==RULE_OPTIONS_SPEC) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // InternalUniMapperGenerator.g:4648:4: ( (lv_options_1_0= ruleOptions ) ) this_COLON_2= RULE_COLON
                    {
                    // InternalUniMapperGenerator.g:4648:4: ( (lv_options_1_0= ruleOptions ) )
                    // InternalUniMapperGenerator.g:4649:5: (lv_options_1_0= ruleOptions )
                    {
                    // InternalUniMapperGenerator.g:4649:5: (lv_options_1_0= ruleOptions )
                    // InternalUniMapperGenerator.g:4650:6: lv_options_1_0= ruleOptions
                    {

                    						newCompositeNode(grammarAccess.getLexerBlockAccess().getOptionsOptionsParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_29);
                    lv_options_1_0=ruleOptions();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLexerBlockRule());
                    						}
                    						set(
                    							current,
                    							"options",
                    							lv_options_1_0,
                    							"net.unicoen.UniMapperGenerator.Options");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_COLON_2=(Token)match(input,RULE_COLON,FOLLOW_61); 

                    				newLeafNode(this_COLON_2, grammarAccess.getLexerBlockAccess().getCOLONTerminalRuleCall_1_1());
                    			

                    }
                    break;

            }

            // InternalUniMapperGenerator.g:4672:3: ( (lv_body_3_0= ruleLexerAltList ) )
            // InternalUniMapperGenerator.g:4673:4: (lv_body_3_0= ruleLexerAltList )
            {
            // InternalUniMapperGenerator.g:4673:4: (lv_body_3_0= ruleLexerAltList )
            // InternalUniMapperGenerator.g:4674:5: lv_body_3_0= ruleLexerAltList
            {

            					newCompositeNode(grammarAccess.getLexerBlockAccess().getBodyLexerAltListParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_47);
            lv_body_3_0=ruleLexerAltList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLexerBlockRule());
            					}
            					set(
            						current,
            						"body",
            						lv_body_3_0,
            						"net.unicoen.UniMapperGenerator.LexerAltList");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,56,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getLexerBlockAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLexerBlock"


    // $ANTLR start "entryRuleLexerCommands"
    // InternalUniMapperGenerator.g:4699:1: entryRuleLexerCommands returns [EObject current=null] : iv_ruleLexerCommands= ruleLexerCommands EOF ;
    public final EObject entryRuleLexerCommands() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLexerCommands = null;


        try {
            // InternalUniMapperGenerator.g:4699:54: (iv_ruleLexerCommands= ruleLexerCommands EOF )
            // InternalUniMapperGenerator.g:4700:2: iv_ruleLexerCommands= ruleLexerCommands EOF
            {
             newCompositeNode(grammarAccess.getLexerCommandsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLexerCommands=ruleLexerCommands();

            state._fsp--;

             current =iv_ruleLexerCommands; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLexerCommands"


    // $ANTLR start "ruleLexerCommands"
    // InternalUniMapperGenerator.g:4706:1: ruleLexerCommands returns [EObject current=null] : ( ( (lv_keyword_0_0= RULE_RARROW ) ) ( (lv_commands_1_0= ruleLexerCommand ) ) (otherlv_2= ',' ( (lv_commands_3_0= ruleLexerCommand ) ) )* ) ;
    public final EObject ruleLexerCommands() throws RecognitionException {
        EObject current = null;

        Token lv_keyword_0_0=null;
        Token otherlv_2=null;
        EObject lv_commands_1_0 = null;

        EObject lv_commands_3_0 = null;



        	enterRule();

        try {
            // InternalUniMapperGenerator.g:4712:2: ( ( ( (lv_keyword_0_0= RULE_RARROW ) ) ( (lv_commands_1_0= ruleLexerCommand ) ) (otherlv_2= ',' ( (lv_commands_3_0= ruleLexerCommand ) ) )* ) )
            // InternalUniMapperGenerator.g:4713:2: ( ( (lv_keyword_0_0= RULE_RARROW ) ) ( (lv_commands_1_0= ruleLexerCommand ) ) (otherlv_2= ',' ( (lv_commands_3_0= ruleLexerCommand ) ) )* )
            {
            // InternalUniMapperGenerator.g:4713:2: ( ( (lv_keyword_0_0= RULE_RARROW ) ) ( (lv_commands_1_0= ruleLexerCommand ) ) (otherlv_2= ',' ( (lv_commands_3_0= ruleLexerCommand ) ) )* )
            // InternalUniMapperGenerator.g:4714:3: ( (lv_keyword_0_0= RULE_RARROW ) ) ( (lv_commands_1_0= ruleLexerCommand ) ) (otherlv_2= ',' ( (lv_commands_3_0= ruleLexerCommand ) ) )*
            {
            // InternalUniMapperGenerator.g:4714:3: ( (lv_keyword_0_0= RULE_RARROW ) )
            // InternalUniMapperGenerator.g:4715:4: (lv_keyword_0_0= RULE_RARROW )
            {
            // InternalUniMapperGenerator.g:4715:4: (lv_keyword_0_0= RULE_RARROW )
            // InternalUniMapperGenerator.g:4716:5: lv_keyword_0_0= RULE_RARROW
            {
            lv_keyword_0_0=(Token)match(input,RULE_RARROW,FOLLOW_66); 

            					newLeafNode(lv_keyword_0_0, grammarAccess.getLexerCommandsAccess().getKeywordRARROWTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLexerCommandsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"keyword",
            						lv_keyword_0_0,
            						"net.unicoen.UniMapperGenerator.RARROW");
            				

            }


            }

            // InternalUniMapperGenerator.g:4732:3: ( (lv_commands_1_0= ruleLexerCommand ) )
            // InternalUniMapperGenerator.g:4733:4: (lv_commands_1_0= ruleLexerCommand )
            {
            // InternalUniMapperGenerator.g:4733:4: (lv_commands_1_0= ruleLexerCommand )
            // InternalUniMapperGenerator.g:4734:5: lv_commands_1_0= ruleLexerCommand
            {

            					newCompositeNode(grammarAccess.getLexerCommandsAccess().getCommandsLexerCommandParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_34);
            lv_commands_1_0=ruleLexerCommand();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLexerCommandsRule());
            					}
            					add(
            						current,
            						"commands",
            						lv_commands_1_0,
            						"net.unicoen.UniMapperGenerator.LexerCommand");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUniMapperGenerator.g:4751:3: (otherlv_2= ',' ( (lv_commands_3_0= ruleLexerCommand ) ) )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( (LA79_0==37) ) {
                    alt79=1;
                }


                switch (alt79) {
            	case 1 :
            	    // InternalUniMapperGenerator.g:4752:4: otherlv_2= ',' ( (lv_commands_3_0= ruleLexerCommand ) )
            	    {
            	    otherlv_2=(Token)match(input,37,FOLLOW_66); 

            	    				newLeafNode(otherlv_2, grammarAccess.getLexerCommandsAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalUniMapperGenerator.g:4756:4: ( (lv_commands_3_0= ruleLexerCommand ) )
            	    // InternalUniMapperGenerator.g:4757:5: (lv_commands_3_0= ruleLexerCommand )
            	    {
            	    // InternalUniMapperGenerator.g:4757:5: (lv_commands_3_0= ruleLexerCommand )
            	    // InternalUniMapperGenerator.g:4758:6: lv_commands_3_0= ruleLexerCommand
            	    {

            	    						newCompositeNode(grammarAccess.getLexerCommandsAccess().getCommandsLexerCommandParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_34);
            	    lv_commands_3_0=ruleLexerCommand();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getLexerCommandsRule());
            	    						}
            	    						add(
            	    							current,
            	    							"commands",
            	    							lv_commands_3_0,
            	    							"net.unicoen.UniMapperGenerator.LexerCommand");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop79;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLexerCommands"


    // $ANTLR start "entryRuleLexerCommand"
    // InternalUniMapperGenerator.g:4780:1: entryRuleLexerCommand returns [EObject current=null] : iv_ruleLexerCommand= ruleLexerCommand EOF ;
    public final EObject entryRuleLexerCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLexerCommand = null;


        try {
            // InternalUniMapperGenerator.g:4780:53: (iv_ruleLexerCommand= ruleLexerCommand EOF )
            // InternalUniMapperGenerator.g:4781:2: iv_ruleLexerCommand= ruleLexerCommand EOF
            {
             newCompositeNode(grammarAccess.getLexerCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLexerCommand=ruleLexerCommand();

            state._fsp--;

             current =iv_ruleLexerCommand; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLexerCommand"


    // $ANTLR start "ruleLexerCommand"
    // InternalUniMapperGenerator.g:4787:1: ruleLexerCommand returns [EObject current=null] : ( ( ( (lv_name_0_0= ruleLexerCommandName ) ) otherlv_1= '(' ( (lv_args_2_0= ruleLexerCommandExpr ) ) otherlv_3= ')' ) | ( (lv_name_4_0= ruleLexerCommandName ) ) ) ;
    public final EObject ruleLexerCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_args_2_0 = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;



        	enterRule();

        try {
            // InternalUniMapperGenerator.g:4793:2: ( ( ( ( (lv_name_0_0= ruleLexerCommandName ) ) otherlv_1= '(' ( (lv_args_2_0= ruleLexerCommandExpr ) ) otherlv_3= ')' ) | ( (lv_name_4_0= ruleLexerCommandName ) ) ) )
            // InternalUniMapperGenerator.g:4794:2: ( ( ( (lv_name_0_0= ruleLexerCommandName ) ) otherlv_1= '(' ( (lv_args_2_0= ruleLexerCommandExpr ) ) otherlv_3= ')' ) | ( (lv_name_4_0= ruleLexerCommandName ) ) )
            {
            // InternalUniMapperGenerator.g:4794:2: ( ( ( (lv_name_0_0= ruleLexerCommandName ) ) otherlv_1= '(' ( (lv_args_2_0= ruleLexerCommandExpr ) ) otherlv_3= ')' ) | ( (lv_name_4_0= ruleLexerCommandName ) ) )
            int alt80=2;
            switch ( input.LA(1) ) {
            case 43:
                {
                int LA80_1 = input.LA(2);

                if ( (LA80_1==EOF||LA80_1==RULE_SEMICOLON||LA80_1==37||LA80_1==49||LA80_1==56) ) {
                    alt80=2;
                }
                else if ( (LA80_1==55) ) {
                    alt80=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 80, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_TOKEN_REF:
                {
                int LA80_2 = input.LA(2);

                if ( (LA80_2==EOF||LA80_2==RULE_SEMICOLON||LA80_2==37||LA80_2==49||LA80_2==56) ) {
                    alt80=2;
                }
                else if ( (LA80_2==55) ) {
                    alt80=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 80, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_RULE_REF:
                {
                int LA80_3 = input.LA(2);

                if ( (LA80_3==EOF||LA80_3==RULE_SEMICOLON||LA80_3==37||LA80_3==49||LA80_3==56) ) {
                    alt80=2;
                }
                else if ( (LA80_3==55) ) {
                    alt80=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 80, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;
            }

            switch (alt80) {
                case 1 :
                    // InternalUniMapperGenerator.g:4795:3: ( ( (lv_name_0_0= ruleLexerCommandName ) ) otherlv_1= '(' ( (lv_args_2_0= ruleLexerCommandExpr ) ) otherlv_3= ')' )
                    {
                    // InternalUniMapperGenerator.g:4795:3: ( ( (lv_name_0_0= ruleLexerCommandName ) ) otherlv_1= '(' ( (lv_args_2_0= ruleLexerCommandExpr ) ) otherlv_3= ')' )
                    // InternalUniMapperGenerator.g:4796:4: ( (lv_name_0_0= ruleLexerCommandName ) ) otherlv_1= '(' ( (lv_args_2_0= ruleLexerCommandExpr ) ) otherlv_3= ')'
                    {
                    // InternalUniMapperGenerator.g:4796:4: ( (lv_name_0_0= ruleLexerCommandName ) )
                    // InternalUniMapperGenerator.g:4797:5: (lv_name_0_0= ruleLexerCommandName )
                    {
                    // InternalUniMapperGenerator.g:4797:5: (lv_name_0_0= ruleLexerCommandName )
                    // InternalUniMapperGenerator.g:4798:6: lv_name_0_0= ruleLexerCommandName
                    {

                    						newCompositeNode(grammarAccess.getLexerCommandAccess().getNameLexerCommandNameParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_53);
                    lv_name_0_0=ruleLexerCommandName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLexerCommandRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_0_0,
                    							"net.unicoen.UniMapperGenerator.LexerCommandName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,55,FOLLOW_67); 

                    				newLeafNode(otherlv_1, grammarAccess.getLexerCommandAccess().getLeftParenthesisKeyword_0_1());
                    			
                    // InternalUniMapperGenerator.g:4819:4: ( (lv_args_2_0= ruleLexerCommandExpr ) )
                    // InternalUniMapperGenerator.g:4820:5: (lv_args_2_0= ruleLexerCommandExpr )
                    {
                    // InternalUniMapperGenerator.g:4820:5: (lv_args_2_0= ruleLexerCommandExpr )
                    // InternalUniMapperGenerator.g:4821:6: lv_args_2_0= ruleLexerCommandExpr
                    {

                    						newCompositeNode(grammarAccess.getLexerCommandAccess().getArgsLexerCommandExprParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_47);
                    lv_args_2_0=ruleLexerCommandExpr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLexerCommandRule());
                    						}
                    						set(
                    							current,
                    							"args",
                    							lv_args_2_0,
                    							"net.unicoen.UniMapperGenerator.LexerCommandExpr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,56,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getLexerCommandAccess().getRightParenthesisKeyword_0_3());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalUniMapperGenerator.g:4844:3: ( (lv_name_4_0= ruleLexerCommandName ) )
                    {
                    // InternalUniMapperGenerator.g:4844:3: ( (lv_name_4_0= ruleLexerCommandName ) )
                    // InternalUniMapperGenerator.g:4845:4: (lv_name_4_0= ruleLexerCommandName )
                    {
                    // InternalUniMapperGenerator.g:4845:4: (lv_name_4_0= ruleLexerCommandName )
                    // InternalUniMapperGenerator.g:4846:5: lv_name_4_0= ruleLexerCommandName
                    {

                    					newCompositeNode(grammarAccess.getLexerCommandAccess().getNameLexerCommandNameParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_name_4_0=ruleLexerCommandName();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getLexerCommandRule());
                    					}
                    					set(
                    						current,
                    						"name",
                    						lv_name_4_0,
                    						"net.unicoen.UniMapperGenerator.LexerCommandName");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLexerCommand"


    // $ANTLR start "entryRuleLexerCommandName"
    // InternalUniMapperGenerator.g:4867:1: entryRuleLexerCommandName returns [String current=null] : iv_ruleLexerCommandName= ruleLexerCommandName EOF ;
    public final String entryRuleLexerCommandName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLexerCommandName = null;


        try {
            // InternalUniMapperGenerator.g:4867:56: (iv_ruleLexerCommandName= ruleLexerCommandName EOF )
            // InternalUniMapperGenerator.g:4868:2: iv_ruleLexerCommandName= ruleLexerCommandName EOF
            {
             newCompositeNode(grammarAccess.getLexerCommandNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLexerCommandName=ruleLexerCommandName();

            state._fsp--;

             current =iv_ruleLexerCommandName.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLexerCommandName"


    // $ANTLR start "ruleLexerCommandName"
    // InternalUniMapperGenerator.g:4874:1: ruleLexerCommandName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'mode' | this_Id_1= ruleId ) ;
    public final AntlrDatatypeRuleToken ruleLexerCommandName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Id_1 = null;



        	enterRule();

        try {
            // InternalUniMapperGenerator.g:4880:2: ( (kw= 'mode' | this_Id_1= ruleId ) )
            // InternalUniMapperGenerator.g:4881:2: (kw= 'mode' | this_Id_1= ruleId )
            {
            // InternalUniMapperGenerator.g:4881:2: (kw= 'mode' | this_Id_1= ruleId )
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==43) ) {
                alt81=1;
            }
            else if ( (LA81_0==RULE_RULE_REF||LA81_0==RULE_TOKEN_REF) ) {
                alt81=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;
            }
            switch (alt81) {
                case 1 :
                    // InternalUniMapperGenerator.g:4882:3: kw= 'mode'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLexerCommandNameAccess().getModeKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalUniMapperGenerator.g:4888:3: this_Id_1= ruleId
                    {

                    			newCompositeNode(grammarAccess.getLexerCommandNameAccess().getIdParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Id_1=ruleId();

                    state._fsp--;


                    			current.merge(this_Id_1);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLexerCommandName"


    // $ANTLR start "entryRuleLexerCommandExpr"
    // InternalUniMapperGenerator.g:4902:1: entryRuleLexerCommandExpr returns [EObject current=null] : iv_ruleLexerCommandExpr= ruleLexerCommandExpr EOF ;
    public final EObject entryRuleLexerCommandExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLexerCommandExpr = null;


        try {
            // InternalUniMapperGenerator.g:4902:57: (iv_ruleLexerCommandExpr= ruleLexerCommandExpr EOF )
            // InternalUniMapperGenerator.g:4903:2: iv_ruleLexerCommandExpr= ruleLexerCommandExpr EOF
            {
             newCompositeNode(grammarAccess.getLexerCommandExprRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLexerCommandExpr=ruleLexerCommandExpr();

            state._fsp--;

             current =iv_ruleLexerCommandExpr; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLexerCommandExpr"


    // $ANTLR start "ruleLexerCommandExpr"
    // InternalUniMapperGenerator.g:4909:1: ruleLexerCommandExpr returns [EObject current=null] : ( ( ( ruleId ) ) | ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleLexerCommandExpr() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalUniMapperGenerator.g:4915:2: ( ( ( ( ruleId ) ) | ( (lv_value_1_0= RULE_INT ) ) ) )
            // InternalUniMapperGenerator.g:4916:2: ( ( ( ruleId ) ) | ( (lv_value_1_0= RULE_INT ) ) )
            {
            // InternalUniMapperGenerator.g:4916:2: ( ( ( ruleId ) ) | ( (lv_value_1_0= RULE_INT ) ) )
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==RULE_RULE_REF||LA82_0==RULE_TOKEN_REF) ) {
                alt82=1;
            }
            else if ( (LA82_0==RULE_INT) ) {
                alt82=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;
            }
            switch (alt82) {
                case 1 :
                    // InternalUniMapperGenerator.g:4917:3: ( ( ruleId ) )
                    {
                    // InternalUniMapperGenerator.g:4917:3: ( ( ruleId ) )
                    // InternalUniMapperGenerator.g:4918:4: ( ruleId )
                    {
                    // InternalUniMapperGenerator.g:4918:4: ( ruleId )
                    // InternalUniMapperGenerator.g:4919:5: ruleId
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLexerCommandExprRule());
                    					}
                    				

                    					newCompositeNode(grammarAccess.getLexerCommandExprAccess().getRefLexerCommandArgCrossReference_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    ruleId();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalUniMapperGenerator.g:4934:3: ( (lv_value_1_0= RULE_INT ) )
                    {
                    // InternalUniMapperGenerator.g:4934:3: ( (lv_value_1_0= RULE_INT ) )
                    // InternalUniMapperGenerator.g:4935:4: (lv_value_1_0= RULE_INT )
                    {
                    // InternalUniMapperGenerator.g:4935:4: (lv_value_1_0= RULE_INT )
                    // InternalUniMapperGenerator.g:4936:5: lv_value_1_0= RULE_INT
                    {
                    lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    					newLeafNode(lv_value_1_0, grammarAccess.getLexerCommandExprAccess().getValueINTTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLexerCommandExprRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"value",
                    						lv_value_1_0,
                    						"net.unicoen.UniMapperGenerator.INT");
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLexerCommandExpr"


    // $ANTLR start "entryRuleQualifiedId"
    // InternalUniMapperGenerator.g:4956:1: entryRuleQualifiedId returns [EObject current=null] : iv_ruleQualifiedId= ruleQualifiedId EOF ;
    public final EObject entryRuleQualifiedId() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualifiedId = null;


        try {
            // InternalUniMapperGenerator.g:4956:52: (iv_ruleQualifiedId= ruleQualifiedId EOF )
            // InternalUniMapperGenerator.g:4957:2: iv_ruleQualifiedId= ruleQualifiedId EOF
            {
             newCompositeNode(grammarAccess.getQualifiedIdRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedId=ruleQualifiedId();

            state._fsp--;

             current =iv_ruleQualifiedId; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedId"


    // $ANTLR start "ruleQualifiedId"
    // InternalUniMapperGenerator.g:4963:1: ruleQualifiedId returns [EObject current=null] : ( ( (lv_name_0_0= ruleId ) ) (otherlv_1= '.' ( (lv_name_2_0= ruleId ) ) )* ) ;
    public final EObject ruleQualifiedId() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalUniMapperGenerator.g:4969:2: ( ( ( (lv_name_0_0= ruleId ) ) (otherlv_1= '.' ( (lv_name_2_0= ruleId ) ) )* ) )
            // InternalUniMapperGenerator.g:4970:2: ( ( (lv_name_0_0= ruleId ) ) (otherlv_1= '.' ( (lv_name_2_0= ruleId ) ) )* )
            {
            // InternalUniMapperGenerator.g:4970:2: ( ( (lv_name_0_0= ruleId ) ) (otherlv_1= '.' ( (lv_name_2_0= ruleId ) ) )* )
            // InternalUniMapperGenerator.g:4971:3: ( (lv_name_0_0= ruleId ) ) (otherlv_1= '.' ( (lv_name_2_0= ruleId ) ) )*
            {
            // InternalUniMapperGenerator.g:4971:3: ( (lv_name_0_0= ruleId ) )
            // InternalUniMapperGenerator.g:4972:4: (lv_name_0_0= ruleId )
            {
            // InternalUniMapperGenerator.g:4972:4: (lv_name_0_0= ruleId )
            // InternalUniMapperGenerator.g:4973:5: lv_name_0_0= ruleId
            {

            					newCompositeNode(grammarAccess.getQualifiedIdAccess().getNameIdParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_68);
            lv_name_0_0=ruleId();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQualifiedIdRule());
            					}
            					add(
            						current,
            						"name",
            						lv_name_0_0,
            						"net.unicoen.UniMapperGenerator.Id");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUniMapperGenerator.g:4990:3: (otherlv_1= '.' ( (lv_name_2_0= ruleId ) ) )*
            loop83:
            do {
                int alt83=2;
                int LA83_0 = input.LA(1);

                if ( (LA83_0==62) ) {
                    alt83=1;
                }


                switch (alt83) {
            	case 1 :
            	    // InternalUniMapperGenerator.g:4991:4: otherlv_1= '.' ( (lv_name_2_0= ruleId ) )
            	    {
            	    otherlv_1=(Token)match(input,62,FOLLOW_4); 

            	    				newLeafNode(otherlv_1, grammarAccess.getQualifiedIdAccess().getFullStopKeyword_1_0());
            	    			
            	    // InternalUniMapperGenerator.g:4995:4: ( (lv_name_2_0= ruleId ) )
            	    // InternalUniMapperGenerator.g:4996:5: (lv_name_2_0= ruleId )
            	    {
            	    // InternalUniMapperGenerator.g:4996:5: (lv_name_2_0= ruleId )
            	    // InternalUniMapperGenerator.g:4997:6: lv_name_2_0= ruleId
            	    {

            	    						newCompositeNode(grammarAccess.getQualifiedIdAccess().getNameIdParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_68);
            	    lv_name_2_0=ruleId();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getQualifiedIdRule());
            	    						}
            	    						add(
            	    							current,
            	    							"name",
            	    							lv_name_2_0,
            	    							"net.unicoen.UniMapperGenerator.Id");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop83;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedId"


    // $ANTLR start "entryRuleId"
    // InternalUniMapperGenerator.g:5019:1: entryRuleId returns [String current=null] : iv_ruleId= ruleId EOF ;
    public final String entryRuleId() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleId = null;


        try {
            // InternalUniMapperGenerator.g:5019:42: (iv_ruleId= ruleId EOF )
            // InternalUniMapperGenerator.g:5020:2: iv_ruleId= ruleId EOF
            {
             newCompositeNode(grammarAccess.getIdRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleId=ruleId();

            state._fsp--;

             current =iv_ruleId.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleId"


    // $ANTLR start "ruleId"
    // InternalUniMapperGenerator.g:5026:1: ruleId returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_TOKEN_REF_0= RULE_TOKEN_REF | this_RULE_REF_1= RULE_RULE_REF ) ;
    public final AntlrDatatypeRuleToken ruleId() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_TOKEN_REF_0=null;
        Token this_RULE_REF_1=null;


        	enterRule();

        try {
            // InternalUniMapperGenerator.g:5032:2: ( (this_TOKEN_REF_0= RULE_TOKEN_REF | this_RULE_REF_1= RULE_RULE_REF ) )
            // InternalUniMapperGenerator.g:5033:2: (this_TOKEN_REF_0= RULE_TOKEN_REF | this_RULE_REF_1= RULE_RULE_REF )
            {
            // InternalUniMapperGenerator.g:5033:2: (this_TOKEN_REF_0= RULE_TOKEN_REF | this_RULE_REF_1= RULE_RULE_REF )
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==RULE_TOKEN_REF) ) {
                alt84=1;
            }
            else if ( (LA84_0==RULE_RULE_REF) ) {
                alt84=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 84, 0, input);

                throw nvae;
            }
            switch (alt84) {
                case 1 :
                    // InternalUniMapperGenerator.g:5034:3: this_TOKEN_REF_0= RULE_TOKEN_REF
                    {
                    this_TOKEN_REF_0=(Token)match(input,RULE_TOKEN_REF,FOLLOW_2); 

                    			current.merge(this_TOKEN_REF_0);
                    		

                    			newLeafNode(this_TOKEN_REF_0, grammarAccess.getIdAccess().getTOKEN_REFTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalUniMapperGenerator.g:5042:3: this_RULE_REF_1= RULE_RULE_REF
                    {
                    this_RULE_REF_1=(Token)match(input,RULE_RULE_REF,FOLLOW_2); 

                    			current.merge(this_RULE_REF_1);
                    		

                    			newLeafNode(this_RULE_REF_1, grammarAccess.getIdAccess().getRULE_REFTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleId"


    // $ANTLR start "ruleGrammarType"
    // InternalUniMapperGenerator.g:5053:1: ruleGrammarType returns [Enumerator current=null] : ( (enumLiteral_0= 'default_hack_' ) | (enumLiteral_1= 'lexer' ) | (enumLiteral_2= 'parser' ) | (enumLiteral_3= 'tree' ) ) ;
    public final Enumerator ruleGrammarType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalUniMapperGenerator.g:5059:2: ( ( (enumLiteral_0= 'default_hack_' ) | (enumLiteral_1= 'lexer' ) | (enumLiteral_2= 'parser' ) | (enumLiteral_3= 'tree' ) ) )
            // InternalUniMapperGenerator.g:5060:2: ( (enumLiteral_0= 'default_hack_' ) | (enumLiteral_1= 'lexer' ) | (enumLiteral_2= 'parser' ) | (enumLiteral_3= 'tree' ) )
            {
            // InternalUniMapperGenerator.g:5060:2: ( (enumLiteral_0= 'default_hack_' ) | (enumLiteral_1= 'lexer' ) | (enumLiteral_2= 'parser' ) | (enumLiteral_3= 'tree' ) )
            int alt85=4;
            switch ( input.LA(1) ) {
            case 65:
                {
                alt85=1;
                }
                break;
            case 41:
                {
                alt85=2;
                }
                break;
            case 40:
                {
                alt85=3;
                }
                break;
            case 42:
                {
                alt85=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 85, 0, input);

                throw nvae;
            }

            switch (alt85) {
                case 1 :
                    // InternalUniMapperGenerator.g:5061:3: (enumLiteral_0= 'default_hack_' )
                    {
                    // InternalUniMapperGenerator.g:5061:3: (enumLiteral_0= 'default_hack_' )
                    // InternalUniMapperGenerator.g:5062:4: enumLiteral_0= 'default_hack_'
                    {
                    enumLiteral_0=(Token)match(input,65,FOLLOW_2); 

                    				current = grammarAccess.getGrammarTypeAccess().getDEFAULTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getGrammarTypeAccess().getDEFAULTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalUniMapperGenerator.g:5069:3: (enumLiteral_1= 'lexer' )
                    {
                    // InternalUniMapperGenerator.g:5069:3: (enumLiteral_1= 'lexer' )
                    // InternalUniMapperGenerator.g:5070:4: enumLiteral_1= 'lexer'
                    {
                    enumLiteral_1=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getGrammarTypeAccess().getLEXEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getGrammarTypeAccess().getLEXEREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalUniMapperGenerator.g:5077:3: (enumLiteral_2= 'parser' )
                    {
                    // InternalUniMapperGenerator.g:5077:3: (enumLiteral_2= 'parser' )
                    // InternalUniMapperGenerator.g:5078:4: enumLiteral_2= 'parser'
                    {
                    enumLiteral_2=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getGrammarTypeAccess().getPARSEREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getGrammarTypeAccess().getPARSEREnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalUniMapperGenerator.g:5085:3: (enumLiteral_3= 'tree' )
                    {
                    // InternalUniMapperGenerator.g:5085:3: (enumLiteral_3= 'tree' )
                    // InternalUniMapperGenerator.g:5086:4: enumLiteral_3= 'tree'
                    {
                    enumLiteral_3=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getGrammarTypeAccess().getTREEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getGrammarTypeAccess().getTREEEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGrammarType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000085000008862L,0x0000000000000001L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000080000008022L,0x0000000000000001L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000004000080A0L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000008720L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000002000000010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000002400000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000400008020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000800000010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000070000008020L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000008022L,0x0000000000000001L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x8001C04000003040L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x8001C04000002040L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x8001804000002040L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x8001004000002040L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x8000004000002040L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x7284000000008320L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000300000000010L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000300000000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x7080000000008322L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0070000000000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0070000000004002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0008000800000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x7080000000008120L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x728200400000A360L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000004000002040L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x7282000000008320L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0400000000008020L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0400002000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000009100L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0102000000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0080000000008020L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0600000000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0100002000000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x8000000000002000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x7080000000019320L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x7080000000009322L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x7080000000009120L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x7080000000019360L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000080000008020L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000008420L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x4000000000000002L});

}