/*
 * generated by Xtext 2.15.0
 */
package net.unicoen.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import net.unicoen.ide.contentassist.antlr.internal.InternalUniMapperGeneratorParser;
import net.unicoen.services.UniMapperGeneratorGrammarAccess;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class UniMapperGeneratorParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(UniMapperGeneratorGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, UniMapperGeneratorGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getPrequelConstructAccess().getAlternatives(), "rule__PrequelConstruct__Alternatives");
			builder.put(grammarAccess.getOptionAccess().getAlternatives(), "rule__Option__Alternatives");
			builder.put(grammarAccess.getOptionValueAccess().getAlternatives(), "rule__OptionValue__Alternatives");
			builder.put(grammarAccess.getImportAccess().getAlternatives(), "rule__Import__Alternatives");
			builder.put(grammarAccess.getTokensAccess().getAlternatives(), "rule__Tokens__Alternatives");
			builder.put(grammarAccess.getActionScopeAccess().getAlternatives(), "rule__ActionScope__Alternatives");
			builder.put(grammarAccess.getRuleAccess().getAlternatives(), "rule__Rule__Alternatives");
			builder.put(grammarAccess.getRulePrequelAccess().getAlternatives(), "rule__RulePrequel__Alternatives");
			builder.put(grammarAccess.getElementAccess().getAlternatives(), "rule__Element__Alternatives");
			builder.put(grammarAccess.getLabeledElementAccess().getOpAlternatives_1_0(), "rule__LabeledElement__OpAlternatives_1_0");
			builder.put(grammarAccess.getLabeledElementAccess().getAlternatives_2(), "rule__LabeledElement__Alternatives_2");
			builder.put(grammarAccess.getEbnfSuffixAccess().getAlternatives(), "rule__EbnfSuffix__Alternatives");
			builder.put(grammarAccess.getAtomAccess().getBodyAlternatives_0(), "rule__Atom__BodyAlternatives_0");
			builder.put(grammarAccess.getTerminalAccess().getAlternatives(), "rule__Terminal__Alternatives");
			builder.put(grammarAccess.getTokenRefAccess().getAlternatives(), "rule__TokenRef__Alternatives");
			builder.put(grammarAccess.getNotSetAccess().getAlternatives(), "rule__NotSet__Alternatives");
			builder.put(grammarAccess.getSetElementAccess().getAlternatives(), "rule__SetElement__Alternatives");
			builder.put(grammarAccess.getElementOptionAccess().getAlternatives(), "rule__ElementOption__Alternatives");
			builder.put(grammarAccess.getUnicoenTypeIdentifiersAccess().getAlternatives(), "rule__UnicoenTypeIdentifiers__Alternatives");
			builder.put(grammarAccess.getUnicoenTypeIdentifiersAccess().getDirAlternatives_1_1_0(), "rule__UnicoenTypeIdentifiers__DirAlternatives_1_1_0");
			builder.put(grammarAccess.getLexerElementAccess().getAlternatives(), "rule__LexerElement__Alternatives");
			builder.put(grammarAccess.getLabeledLexerElementAccess().getOpAlternatives_1_0(), "rule__LabeledLexerElement__OpAlternatives_1_0");
			builder.put(grammarAccess.getLabeledLexerElementAccess().getAlternatives_2(), "rule__LabeledLexerElement__Alternatives_2");
			builder.put(grammarAccess.getLexerAtomAccess().getBodyAlternatives_0(), "rule__LexerAtom__BodyAlternatives_0");
			builder.put(grammarAccess.getLexerCommandAccess().getAlternatives(), "rule__LexerCommand__Alternatives");
			builder.put(grammarAccess.getLexerCommandNameAccess().getAlternatives(), "rule__LexerCommandName__Alternatives");
			builder.put(grammarAccess.getLexerCommandExprAccess().getAlternatives(), "rule__LexerCommandExpr__Alternatives");
			builder.put(grammarAccess.getLexerCommandArgAccess().getAlternatives(), "rule__LexerCommandArg__Alternatives");
			builder.put(grammarAccess.getIdAccess().getAlternatives(), "rule__Id__Alternatives");
			builder.put(grammarAccess.getGrammarTypeAccess().getAlternatives(), "rule__GrammarType__Alternatives");
			builder.put(grammarAccess.getGrammarAccess().getGroup(), "rule__Grammar__Group__0");
			builder.put(grammarAccess.getRootSelectionAccess().getGroup(), "rule__RootSelection__Group__0");
			builder.put(grammarAccess.getOptionsAccess().getGroup(), "rule__Options__Group__0");
			builder.put(grammarAccess.getOptionsAccess().getGroup_2(), "rule__Options__Group_2__0");
			builder.put(grammarAccess.getOptionAccess().getGroup_1(), "rule__Option__Group_1__0");
			builder.put(grammarAccess.getTokenVocabAccess().getGroup(), "rule__TokenVocab__Group__0");
			builder.put(grammarAccess.getImportsAccess().getGroup(), "rule__Imports__Group__0");
			builder.put(grammarAccess.getImportsAccess().getGroup_2(), "rule__Imports__Group_2__0");
			builder.put(grammarAccess.getImportAccess().getGroup_0(), "rule__Import__Group_0__0");
			builder.put(grammarAccess.getV4TokensAccess().getGroup(), "rule__V4Tokens__Group__0");
			builder.put(grammarAccess.getV4TokensAccess().getGroup_2(), "rule__V4Tokens__Group_2__0");
			builder.put(grammarAccess.getEmptyTokensAccess().getGroup(), "rule__EmptyTokens__Group__0");
			builder.put(grammarAccess.getV3TokensAccess().getGroup(), "rule__V3Tokens__Group__0");
			builder.put(grammarAccess.getV3TokenAccess().getGroup(), "rule__V3Token__Group__0");
			builder.put(grammarAccess.getV3TokenAccess().getGroup_1(), "rule__V3Token__Group_1__0");
			builder.put(grammarAccess.getGrammarActionAccess().getGroup(), "rule__GrammarAction__Group__0");
			builder.put(grammarAccess.getGrammarActionAccess().getGroup_1(), "rule__GrammarAction__Group_1__0");
			builder.put(grammarAccess.getModeAccess().getGroup(), "rule__Mode__Group__0");
			builder.put(grammarAccess.getParserRuleAccess().getGroup(), "rule__ParserRule__Group__0");
			builder.put(grammarAccess.getExceptionGroupAccess().getGroup(), "rule__ExceptionGroup__Group__0");
			builder.put(grammarAccess.getExceptionHandlerAccess().getGroup(), "rule__ExceptionHandler__Group__0");
			builder.put(grammarAccess.getFinallyClauseAccess().getGroup(), "rule__FinallyClause__Group__0");
			builder.put(grammarAccess.getReturnAccess().getGroup(), "rule__Return__Group__0");
			builder.put(grammarAccess.getExceptionsAccess().getGroup(), "rule__Exceptions__Group__0");
			builder.put(grammarAccess.getExceptionsAccess().getGroup_2(), "rule__Exceptions__Group_2__0");
			builder.put(grammarAccess.getLocalVarsAccess().getGroup(), "rule__LocalVars__Group__0");
			builder.put(grammarAccess.getRuleActionAccess().getGroup(), "rule__RuleAction__Group__0");
			builder.put(grammarAccess.getRuleAltListAccess().getGroup(), "rule__RuleAltList__Group__0");
			builder.put(grammarAccess.getRuleAltListAccess().getGroup_1(), "rule__RuleAltList__Group_1__0");
			builder.put(grammarAccess.getLabeledAltAccess().getGroup(), "rule__LabeledAlt__Group__0");
			builder.put(grammarAccess.getLabeledAltAccess().getGroup_1(), "rule__LabeledAlt__Group_1__0");
			builder.put(grammarAccess.getAlternativeAccess().getGroup(), "rule__Alternative__Group__0");
			builder.put(grammarAccess.getElementAccess().getGroup_0(), "rule__Element__Group_0__0");
			builder.put(grammarAccess.getElementAccess().getGroup_1(), "rule__Element__Group_1__0");
			builder.put(grammarAccess.getElementAccess().getGroup_1_2(), "rule__Element__Group_1_2__0");
			builder.put(grammarAccess.getEbnfAccess().getGroup(), "rule__Ebnf__Group__0");
			builder.put(grammarAccess.getActionElementAccess().getGroup(), "rule__ActionElement__Group__0");
			builder.put(grammarAccess.getLabeledElementAccess().getGroup(), "rule__LabeledElement__Group__0");
			builder.put(grammarAccess.getEbnfSuffixAccess().getGroup_0(), "rule__EbnfSuffix__Group_0__0");
			builder.put(grammarAccess.getEbnfSuffixAccess().getGroup_1(), "rule__EbnfSuffix__Group_1__0");
			builder.put(grammarAccess.getEbnfSuffixAccess().getGroup_2(), "rule__EbnfSuffix__Group_2__0");
			builder.put(grammarAccess.getBlockAccess().getGroup(), "rule__Block__Group__0");
			builder.put(grammarAccess.getBlockAccess().getGroup_1(), "rule__Block__Group_1__0");
			builder.put(grammarAccess.getAltListAccess().getGroup(), "rule__AltList__Group__0");
			builder.put(grammarAccess.getAltListAccess().getGroup_1(), "rule__AltList__Group_1__0");
			builder.put(grammarAccess.getRuleRefAccess().getGroup(), "rule__RuleRef__Group__0");
			builder.put(grammarAccess.getElementOptionsAccess().getGroup(), "rule__ElementOptions__Group__0");
			builder.put(grammarAccess.getElementOptionsAccess().getGroup_2(), "rule__ElementOptions__Group_2__0");
			builder.put(grammarAccess.getElementOptionsAccess().getGroup_2_1(), "rule__ElementOptions__Group_2_1__0");
			builder.put(grammarAccess.getRangeAccess().getGroup(), "rule__Range__Group__0");
			builder.put(grammarAccess.getTerminalAccess().getGroup_0(), "rule__Terminal__Group_0__0");
			builder.put(grammarAccess.getTerminalAccess().getGroup_1(), "rule__Terminal__Group_1__0");
			builder.put(grammarAccess.getNotSetAccess().getGroup_0(), "rule__NotSet__Group_0__0");
			builder.put(grammarAccess.getNotSetAccess().getGroup_1(), "rule__NotSet__Group_1__0");
			builder.put(grammarAccess.getBlockSetAccess().getGroup(), "rule__BlockSet__Group__0");
			builder.put(grammarAccess.getBlockSetAccess().getGroup_2(), "rule__BlockSet__Group_2__0");
			builder.put(grammarAccess.getWildcardAccess().getGroup(), "rule__Wildcard__Group__0");
			builder.put(grammarAccess.getElementOptionAccess().getGroup_1(), "rule__ElementOption__Group_1__0");
			builder.put(grammarAccess.getUnicoenTypeDecAccess().getGroup(), "rule__UnicoenTypeDec__Group__0");
			builder.put(grammarAccess.getUnicoenTypeIdentifiersAccess().getGroup_0(), "rule__UnicoenTypeIdentifiers__Group_0__0");
			builder.put(grammarAccess.getUnicoenTypeIdentifiersAccess().getGroup_0_1(), "rule__UnicoenTypeIdentifiers__Group_0_1__0");
			builder.put(grammarAccess.getUnicoenTypeIdentifiersAccess().getGroup_1(), "rule__UnicoenTypeIdentifiers__Group_1__0");
			builder.put(grammarAccess.getUnicoenTypeIdentifiersAccess().getGroup_1_3(), "rule__UnicoenTypeIdentifiers__Group_1_3__0");
			builder.put(grammarAccess.getLexerRuleAccess().getGroup(), "rule__LexerRule__Group__0");
			builder.put(grammarAccess.getLexerAltListAccess().getGroup(), "rule__LexerAltList__Group__0");
			builder.put(grammarAccess.getLexerAltListAccess().getGroup_1(), "rule__LexerAltList__Group_1__0");
			builder.put(grammarAccess.getLexerAltAccess().getGroup(), "rule__LexerAlt__Group__0");
			builder.put(grammarAccess.getLexerElementsAccess().getGroup(), "rule__LexerElements__Group__0");
			builder.put(grammarAccess.getLexerElementWithDollarAccess().getGroup(), "rule__LexerElementWithDollar__Group__0");
			builder.put(grammarAccess.getLexerElementWithDollarAccess().getGroup_1(), "rule__LexerElementWithDollar__Group_1__0");
			builder.put(grammarAccess.getLexerElementAccess().getGroup_0(), "rule__LexerElement__Group_0__0");
			builder.put(grammarAccess.getLexerElementAccess().getGroup_1(), "rule__LexerElement__Group_1__0");
			builder.put(grammarAccess.getLexerElementAccess().getGroup_2(), "rule__LexerElement__Group_2__0");
			builder.put(grammarAccess.getLabeledLexerElementAccess().getGroup(), "rule__LabeledLexerElement__Group__0");
			builder.put(grammarAccess.getLexerBlockAccess().getGroup(), "rule__LexerBlock__Group__0");
			builder.put(grammarAccess.getLexerBlockAccess().getGroup_1(), "rule__LexerBlock__Group_1__0");
			builder.put(grammarAccess.getLexerCommandsAccess().getGroup(), "rule__LexerCommands__Group__0");
			builder.put(grammarAccess.getLexerCommandsAccess().getGroup_2(), "rule__LexerCommands__Group_2__0");
			builder.put(grammarAccess.getLexerCommandAccess().getGroup_0(), "rule__LexerCommand__Group_0__0");
			builder.put(grammarAccess.getQualifiedIdAccess().getGroup(), "rule__QualifiedId__Group__0");
			builder.put(grammarAccess.getQualifiedIdAccess().getGroup_1(), "rule__QualifiedId__Group_1__0");
			builder.put(grammarAccess.getGrammarAccess().getTypeAssignment_0(), "rule__Grammar__TypeAssignment_0");
			builder.put(grammarAccess.getGrammarAccess().getNameAssignment_2(), "rule__Grammar__NameAssignment_2");
			builder.put(grammarAccess.getGrammarAccess().getRootAssignment_4(), "rule__Grammar__RootAssignment_4");
			builder.put(grammarAccess.getGrammarAccess().getPrequelsAssignment_5(), "rule__Grammar__PrequelsAssignment_5");
			builder.put(grammarAccess.getGrammarAccess().getRulesAssignment_6(), "rule__Grammar__RulesAssignment_6");
			builder.put(grammarAccess.getGrammarAccess().getModesAssignment_7(), "rule__Grammar__ModesAssignment_7");
			builder.put(grammarAccess.getRootSelectionAccess().getRootAssignment_1(), "rule__RootSelection__RootAssignment_1");
			builder.put(grammarAccess.getOptionsAccess().getKeywordAssignment_1(), "rule__Options__KeywordAssignment_1");
			builder.put(grammarAccess.getOptionsAccess().getOptionsAssignment_2_0(), "rule__Options__OptionsAssignment_2_0");
			builder.put(grammarAccess.getOptionAccess().getNameAssignment_1_0(), "rule__Option__NameAssignment_1_0");
			builder.put(grammarAccess.getOptionAccess().getValueAssignment_1_2(), "rule__Option__ValueAssignment_1_2");
			builder.put(grammarAccess.getTokenVocabAccess().getNameAssignment_0(), "rule__TokenVocab__NameAssignment_0");
			builder.put(grammarAccess.getTokenVocabAccess().getImportURIAssignment_2(), "rule__TokenVocab__ImportURIAssignment_2");
			builder.put(grammarAccess.getQualifiedOptionAccess().getValueAssignment(), "rule__QualifiedOption__ValueAssignment");
			builder.put(grammarAccess.getStringOptionAccess().getValueAssignment(), "rule__StringOption__ValueAssignment");
			builder.put(grammarAccess.getActionOptionAccess().getValueAssignment(), "rule__ActionOption__ValueAssignment");
			builder.put(grammarAccess.getIntOptionAccess().getValueAssignment(), "rule__IntOption__ValueAssignment");
			builder.put(grammarAccess.getImportsAccess().getKeywordAssignment_0(), "rule__Imports__KeywordAssignment_0");
			builder.put(grammarAccess.getImportsAccess().getImportsAssignment_1(), "rule__Imports__ImportsAssignment_1");
			builder.put(grammarAccess.getImportsAccess().getImportsAssignment_2_1(), "rule__Imports__ImportsAssignment_2_1");
			builder.put(grammarAccess.getImportAccess().getAliasAssignment_0_0(), "rule__Import__AliasAssignment_0_0");
			builder.put(grammarAccess.getImportAccess().getImportURIAssignment_0_2(), "rule__Import__ImportURIAssignment_0_2");
			builder.put(grammarAccess.getImportAccess().getImportURIAssignment_1(), "rule__Import__ImportURIAssignment_1");
			builder.put(grammarAccess.getV4TokensAccess().getKeywordAssignment_0(), "rule__V4Tokens__KeywordAssignment_0");
			builder.put(grammarAccess.getV4TokensAccess().getTokensAssignment_1(), "rule__V4Tokens__TokensAssignment_1");
			builder.put(grammarAccess.getV4TokensAccess().getTokensAssignment_2_1(), "rule__V4Tokens__TokensAssignment_2_1");
			builder.put(grammarAccess.getV4TokenAccess().getNameAssignment(), "rule__V4Token__NameAssignment");
			builder.put(grammarAccess.getEmptyTokensAccess().getKeywordAssignment_1(), "rule__EmptyTokens__KeywordAssignment_1");
			builder.put(grammarAccess.getV3TokensAccess().getKeywordAssignment_0(), "rule__V3Tokens__KeywordAssignment_0");
			builder.put(grammarAccess.getV3TokensAccess().getTokensAssignment_1(), "rule__V3Tokens__TokensAssignment_1");
			builder.put(grammarAccess.getV3TokenAccess().getNameAssignment_0(), "rule__V3Token__NameAssignment_0");
			builder.put(grammarAccess.getV3TokenAccess().getValueAssignment_1_1(), "rule__V3Token__ValueAssignment_1_1");
			builder.put(grammarAccess.getGrammarActionAccess().getScopeAssignment_1_0(), "rule__GrammarAction__ScopeAssignment_1_0");
			builder.put(grammarAccess.getGrammarActionAccess().getColonSymbolAssignment_1_1(), "rule__GrammarAction__ColonSymbolAssignment_1_1");
			builder.put(grammarAccess.getGrammarActionAccess().getNameAssignment_2(), "rule__GrammarAction__NameAssignment_2");
			builder.put(grammarAccess.getGrammarActionAccess().getActionAssignment_3(), "rule__GrammarAction__ActionAssignment_3");
			builder.put(grammarAccess.getModeAccess().getIdAssignment_1(), "rule__Mode__IdAssignment_1");
			builder.put(grammarAccess.getModeAccess().getRulesAssignment_3(), "rule__Mode__RulesAssignment_3");
			builder.put(grammarAccess.getParserRuleAccess().getNameAssignment_0(), "rule__ParserRule__NameAssignment_0");
			builder.put(grammarAccess.getParserRuleAccess().getArgsAssignment_1(), "rule__ParserRule__ArgsAssignment_1");
			builder.put(grammarAccess.getParserRuleAccess().getReturnAssignment_2(), "rule__ParserRule__ReturnAssignment_2");
			builder.put(grammarAccess.getParserRuleAccess().getThrowsAssignment_3(), "rule__ParserRule__ThrowsAssignment_3");
			builder.put(grammarAccess.getParserRuleAccess().getLocalsAssignment_4(), "rule__ParserRule__LocalsAssignment_4");
			builder.put(grammarAccess.getParserRuleAccess().getPrequelsAssignment_5(), "rule__ParserRule__PrequelsAssignment_5");
			builder.put(grammarAccess.getParserRuleAccess().getTypeAssignment_6(), "rule__ParserRule__TypeAssignment_6");
			builder.put(grammarAccess.getParserRuleAccess().getBodyAssignment_8(), "rule__ParserRule__BodyAssignment_8");
			builder.put(grammarAccess.getParserRuleAccess().getCaughtAssignment_9(), "rule__ParserRule__CaughtAssignment_9");
			builder.put(grammarAccess.getParserRuleAccess().getSemicolonSymbolAssignment_10(), "rule__ParserRule__SemicolonSymbolAssignment_10");
			builder.put(grammarAccess.getExceptionGroupAccess().getHandlersAssignment_1(), "rule__ExceptionGroup__HandlersAssignment_1");
			builder.put(grammarAccess.getExceptionGroupAccess().getFinallyAssignment_2(), "rule__ExceptionGroup__FinallyAssignment_2");
			builder.put(grammarAccess.getExceptionHandlerAccess().getExceptionAssignment_1(), "rule__ExceptionHandler__ExceptionAssignment_1");
			builder.put(grammarAccess.getExceptionHandlerAccess().getBodyAssignment_2(), "rule__ExceptionHandler__BodyAssignment_2");
			builder.put(grammarAccess.getFinallyClauseAccess().getBodyAssignment_1(), "rule__FinallyClause__BodyAssignment_1");
			builder.put(grammarAccess.getReturnAccess().getBodyAssignment_1(), "rule__Return__BodyAssignment_1");
			builder.put(grammarAccess.getExceptionsAccess().getExceptionsAssignment_1(), "rule__Exceptions__ExceptionsAssignment_1");
			builder.put(grammarAccess.getExceptionsAccess().getExceptionsAssignment_2_1(), "rule__Exceptions__ExceptionsAssignment_2_1");
			builder.put(grammarAccess.getLocalVarsAccess().getBodyAssignment_1(), "rule__LocalVars__BodyAssignment_1");
			builder.put(grammarAccess.getRuleActionAccess().getNameAssignment_1(), "rule__RuleAction__NameAssignment_1");
			builder.put(grammarAccess.getRuleActionAccess().getBodyAssignment_2(), "rule__RuleAction__BodyAssignment_2");
			builder.put(grammarAccess.getRuleAltListAccess().getAlternativesAssignment_0(), "rule__RuleAltList__AlternativesAssignment_0");
			builder.put(grammarAccess.getRuleAltListAccess().getAlternativesAssignment_1_1(), "rule__RuleAltList__AlternativesAssignment_1_1");
			builder.put(grammarAccess.getLabeledAltAccess().getBodyAssignment_0(), "rule__LabeledAlt__BodyAssignment_0");
			builder.put(grammarAccess.getLabeledAltAccess().getLabelAssignment_1_1(), "rule__LabeledAlt__LabelAssignment_1_1");
			builder.put(grammarAccess.getAlternativeAccess().getOptionsAssignment_1(), "rule__Alternative__OptionsAssignment_1");
			builder.put(grammarAccess.getAlternativeAccess().getElementsAssignment_2(), "rule__Alternative__ElementsAssignment_2");
			builder.put(grammarAccess.getElementAccess().getBodyAssignment_0_0(), "rule__Element__BodyAssignment_0_0");
			builder.put(grammarAccess.getElementAccess().getOperatorAssignment_0_1(), "rule__Element__OperatorAssignment_0_1");
			builder.put(grammarAccess.getElementAccess().getBodyAssignment_1_0(), "rule__Element__BodyAssignment_1_0");
			builder.put(grammarAccess.getElementAccess().getOperatorAssignment_1_1(), "rule__Element__OperatorAssignment_1_1");
			builder.put(grammarAccess.getElementAccess().getOpAssignment_1_2_1(), "rule__Element__OpAssignment_1_2_1");
			builder.put(grammarAccess.getElementAccess().getBodyAssignment_2(), "rule__Element__BodyAssignment_2");
			builder.put(grammarAccess.getElementAccess().getBodyAssignment_3(), "rule__Element__BodyAssignment_3");
			builder.put(grammarAccess.getEbnfAccess().getBodyAssignment_0(), "rule__Ebnf__BodyAssignment_0");
			builder.put(grammarAccess.getEbnfAccess().getOperatorAssignment_1(), "rule__Ebnf__OperatorAssignment_1");
			builder.put(grammarAccess.getActionElementAccess().getBodyAssignment_0(), "rule__ActionElement__BodyAssignment_0");
			builder.put(grammarAccess.getActionElementAccess().getOptionsAssignment_1(), "rule__ActionElement__OptionsAssignment_1");
			builder.put(grammarAccess.getLabeledElementAccess().getNameAssignment_0(), "rule__LabeledElement__NameAssignment_0");
			builder.put(grammarAccess.getLabeledElementAccess().getOpAssignment_1(), "rule__LabeledElement__OpAssignment_1");
			builder.put(grammarAccess.getLabeledElementAccess().getBodyAssignment_2_0(), "rule__LabeledElement__BodyAssignment_2_0");
			builder.put(grammarAccess.getLabeledElementAccess().getBodyAssignment_2_1(), "rule__LabeledElement__BodyAssignment_2_1");
			builder.put(grammarAccess.getEbnfSuffixAccess().getOperatorAssignment_0_0(), "rule__EbnfSuffix__OperatorAssignment_0_0");
			builder.put(grammarAccess.getEbnfSuffixAccess().getNongreedyAssignment_0_1(), "rule__EbnfSuffix__NongreedyAssignment_0_1");
			builder.put(grammarAccess.getEbnfSuffixAccess().getOperatorAssignment_1_0(), "rule__EbnfSuffix__OperatorAssignment_1_0");
			builder.put(grammarAccess.getEbnfSuffixAccess().getNongreedyAssignment_1_1(), "rule__EbnfSuffix__NongreedyAssignment_1_1");
			builder.put(grammarAccess.getEbnfSuffixAccess().getOperatorAssignment_2_0(), "rule__EbnfSuffix__OperatorAssignment_2_0");
			builder.put(grammarAccess.getEbnfSuffixAccess().getNongreedyAssignment_2_1(), "rule__EbnfSuffix__NongreedyAssignment_2_1");
			builder.put(grammarAccess.getBlockAccess().getOptionsAssignment_1_0(), "rule__Block__OptionsAssignment_1_0");
			builder.put(grammarAccess.getBlockAccess().getActionsAssignment_1_1(), "rule__Block__ActionsAssignment_1_1");
			builder.put(grammarAccess.getBlockAccess().getColonAssignment_1_2(), "rule__Block__ColonAssignment_1_2");
			builder.put(grammarAccess.getBlockAccess().getBodyAssignment_2(), "rule__Block__BodyAssignment_2");
			builder.put(grammarAccess.getAltListAccess().getAlternativesAssignment_0(), "rule__AltList__AlternativesAssignment_0");
			builder.put(grammarAccess.getAltListAccess().getAlternativesAssignment_1_1(), "rule__AltList__AlternativesAssignment_1_1");
			builder.put(grammarAccess.getAtomAccess().getBodyAssignment(), "rule__Atom__BodyAssignment");
			builder.put(grammarAccess.getRuleRefAccess().getReferenceAssignment_0(), "rule__RuleRef__ReferenceAssignment_0");
			builder.put(grammarAccess.getRuleRefAccess().getOptionsAssignment_1(), "rule__RuleRef__OptionsAssignment_1");
			builder.put(grammarAccess.getElementOptionsAccess().getOptionsAssignment_2_0(), "rule__ElementOptions__OptionsAssignment_2_0");
			builder.put(grammarAccess.getElementOptionsAccess().getOptionsAssignment_2_1_1(), "rule__ElementOptions__OptionsAssignment_2_1_1");
			builder.put(grammarAccess.getRangeAccess().getFromAssignment_0(), "rule__Range__FromAssignment_0");
			builder.put(grammarAccess.getRangeAccess().getToAssignment_2(), "rule__Range__ToAssignment_2");
			builder.put(grammarAccess.getTerminalAccess().getReferenceAssignment_0_0(), "rule__Terminal__ReferenceAssignment_0_0");
			builder.put(grammarAccess.getTerminalAccess().getOptionsAssignment_0_1(), "rule__Terminal__OptionsAssignment_0_1");
			builder.put(grammarAccess.getTerminalAccess().getLiteralAssignment_1_0(), "rule__Terminal__LiteralAssignment_1_0");
			builder.put(grammarAccess.getTerminalAccess().getOptionsAssignment_1_1(), "rule__Terminal__OptionsAssignment_1_1");
			builder.put(grammarAccess.getTerminalAccess().getEofAssignment_2(), "rule__Terminal__EofAssignment_2");
			builder.put(grammarAccess.getNotSetAccess().getBodyAssignment_0_1(), "rule__NotSet__BodyAssignment_0_1");
			builder.put(grammarAccess.getNotSetAccess().getBodyAssignment_1_1(), "rule__NotSet__BodyAssignment_1_1");
			builder.put(grammarAccess.getBlockSetAccess().getElementsAssignment_1(), "rule__BlockSet__ElementsAssignment_1");
			builder.put(grammarAccess.getBlockSetAccess().getElementsAssignment_2_1(), "rule__BlockSet__ElementsAssignment_2_1");
			builder.put(grammarAccess.getSetElementAccess().getTokenRefAssignment_0(), "rule__SetElement__TokenRefAssignment_0");
			builder.put(grammarAccess.getSetElementAccess().getStringLiteralAssignment_1(), "rule__SetElement__StringLiteralAssignment_1");
			builder.put(grammarAccess.getSetElementAccess().getRangeAssignment_2(), "rule__SetElement__RangeAssignment_2");
			builder.put(grammarAccess.getSetElementAccess().getCharSetAssignment_3(), "rule__SetElement__CharSetAssignment_3");
			builder.put(grammarAccess.getWildcardAccess().getDotAssignment_0(), "rule__Wildcard__DotAssignment_0");
			builder.put(grammarAccess.getWildcardAccess().getOptionsAssignment_1(), "rule__Wildcard__OptionsAssignment_1");
			builder.put(grammarAccess.getElementOptionAccess().getQualifiedIdAssignment_0(), "rule__ElementOption__QualifiedIdAssignment_0");
			builder.put(grammarAccess.getElementOptionAccess().getIdAssignment_1_0(), "rule__ElementOption__IdAssignment_1_0");
			builder.put(grammarAccess.getElementOptionAccess().getAssignAssignment_1_1(), "rule__ElementOption__AssignAssignment_1_1");
			builder.put(grammarAccess.getElementOptionAccess().getValueAssignment_1_2(), "rule__ElementOption__ValueAssignment_1_2");
			builder.put(grammarAccess.getUnicoenTypeDecAccess().getTypeAssignment_1(), "rule__UnicoenTypeDec__TypeAssignment_1");
			builder.put(grammarAccess.getUnicoenTypeIdentifiersAccess().getNameAssignment_0_0(), "rule__UnicoenTypeIdentifiers__NameAssignment_0_0");
			builder.put(grammarAccess.getUnicoenTypeIdentifiersAccess().getTypevalueAssignment_0_1_1(), "rule__UnicoenTypeIdentifiers__TypevalueAssignment_0_1_1");
			builder.put(grammarAccess.getUnicoenTypeIdentifiersAccess().getDirAssignment_1_1(), "rule__UnicoenTypeIdentifiers__DirAssignment_1_1");
			builder.put(grammarAccess.getUnicoenTypeIdentifiersAccess().getFieldvalueAssignment_1_2(), "rule__UnicoenTypeIdentifiers__FieldvalueAssignment_1_2");
			builder.put(grammarAccess.getUnicoenTypeIdentifiersAccess().getFieldvalueAssignment_1_3_1(), "rule__UnicoenTypeIdentifiers__FieldvalueAssignment_1_3_1");
			builder.put(grammarAccess.getLexerRuleAccess().getFragmentAssignment_0(), "rule__LexerRule__FragmentAssignment_0");
			builder.put(grammarAccess.getLexerRuleAccess().getNameAssignment_1(), "rule__LexerRule__NameAssignment_1");
			builder.put(grammarAccess.getLexerRuleAccess().getTypeAssignment_2(), "rule__LexerRule__TypeAssignment_2");
			builder.put(grammarAccess.getLexerRuleAccess().getBodyAssignment_4(), "rule__LexerRule__BodyAssignment_4");
			builder.put(grammarAccess.getLexerAltListAccess().getAlternativesAssignment_0(), "rule__LexerAltList__AlternativesAssignment_0");
			builder.put(grammarAccess.getLexerAltListAccess().getAlternativesAssignment_1_1(), "rule__LexerAltList__AlternativesAssignment_1_1");
			builder.put(grammarAccess.getLexerAltAccess().getBodyAssignment_0(), "rule__LexerAlt__BodyAssignment_0");
			builder.put(grammarAccess.getLexerAltAccess().getCommandsAssignment_1(), "rule__LexerAlt__CommandsAssignment_1");
			builder.put(grammarAccess.getLexerElementsAccess().getElementsAssignment_1(), "rule__LexerElements__ElementsAssignment_1");
			builder.put(grammarAccess.getLexerElementWithDollarAccess().getBodyAssignment_0(), "rule__LexerElementWithDollar__BodyAssignment_0");
			builder.put(grammarAccess.getLexerElementWithDollarAccess().getOpAssignment_1_1(), "rule__LexerElementWithDollar__OpAssignment_1_1");
			builder.put(grammarAccess.getLexerElementAccess().getBodyAssignment_0_0(), "rule__LexerElement__BodyAssignment_0_0");
			builder.put(grammarAccess.getLexerElementAccess().getOperatorAssignment_0_1(), "rule__LexerElement__OperatorAssignment_0_1");
			builder.put(grammarAccess.getLexerElementAccess().getBodyAssignment_1_0(), "rule__LexerElement__BodyAssignment_1_0");
			builder.put(grammarAccess.getLexerElementAccess().getOperatorAssignment_1_1(), "rule__LexerElement__OperatorAssignment_1_1");
			builder.put(grammarAccess.getLexerElementAccess().getBodyAssignment_2_0(), "rule__LexerElement__BodyAssignment_2_0");
			builder.put(grammarAccess.getLexerElementAccess().getOperatorAssignment_2_1(), "rule__LexerElement__OperatorAssignment_2_1");
			builder.put(grammarAccess.getLexerElementAccess().getBodyAssignment_3(), "rule__LexerElement__BodyAssignment_3");
			builder.put(grammarAccess.getLabeledLexerElementAccess().getLabelAssignment_0(), "rule__LabeledLexerElement__LabelAssignment_0");
			builder.put(grammarAccess.getLabeledLexerElementAccess().getOpAssignment_1(), "rule__LabeledLexerElement__OpAssignment_1");
			builder.put(grammarAccess.getLabeledLexerElementAccess().getBodyAssignment_2_0(), "rule__LabeledLexerElement__BodyAssignment_2_0");
			builder.put(grammarAccess.getLabeledLexerElementAccess().getBodyAssignment_2_1(), "rule__LabeledLexerElement__BodyAssignment_2_1");
			builder.put(grammarAccess.getLexerAtomAccess().getBodyAssignment(), "rule__LexerAtom__BodyAssignment");
			builder.put(grammarAccess.getLexerCharSetAccess().getBodyAssignment(), "rule__LexerCharSet__BodyAssignment");
			builder.put(grammarAccess.getLexerBlockAccess().getOptionsAssignment_1_0(), "rule__LexerBlock__OptionsAssignment_1_0");
			builder.put(grammarAccess.getLexerBlockAccess().getBodyAssignment_2(), "rule__LexerBlock__BodyAssignment_2");
			builder.put(grammarAccess.getLexerCommandsAccess().getKeywordAssignment_0(), "rule__LexerCommands__KeywordAssignment_0");
			builder.put(grammarAccess.getLexerCommandsAccess().getCommandsAssignment_1(), "rule__LexerCommands__CommandsAssignment_1");
			builder.put(grammarAccess.getLexerCommandsAccess().getCommandsAssignment_2_1(), "rule__LexerCommands__CommandsAssignment_2_1");
			builder.put(grammarAccess.getLexerCommandAccess().getNameAssignment_0_0(), "rule__LexerCommand__NameAssignment_0_0");
			builder.put(grammarAccess.getLexerCommandAccess().getArgsAssignment_0_2(), "rule__LexerCommand__ArgsAssignment_0_2");
			builder.put(grammarAccess.getLexerCommandAccess().getNameAssignment_1(), "rule__LexerCommand__NameAssignment_1");
			builder.put(grammarAccess.getLexerCommandExprAccess().getRefAssignment_0(), "rule__LexerCommandExpr__RefAssignment_0");
			builder.put(grammarAccess.getLexerCommandExprAccess().getValueAssignment_1(), "rule__LexerCommandExpr__ValueAssignment_1");
			builder.put(grammarAccess.getQualifiedIdAccess().getNameAssignment_0(), "rule__QualifiedId__NameAssignment_0");
			builder.put(grammarAccess.getQualifiedIdAccess().getNameAssignment_1_1(), "rule__QualifiedId__NameAssignment_1_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private UniMapperGeneratorGrammarAccess grammarAccess;

	@Override
	protected InternalUniMapperGeneratorParser createParser() {
		InternalUniMapperGeneratorParser result = new InternalUniMapperGeneratorParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public UniMapperGeneratorGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(UniMapperGeneratorGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
