/*
 * generated by Xtext 2.13.0
 */
package net.unicoen.parser.antlr;

import com.google.inject.Inject;
import net.unicoen.parser.antlr.internal.InternalUniMapperGeneratorParser;
import net.unicoen.services.UniMapperGeneratorGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class UniMapperGeneratorParser extends AbstractAntlrParser {

	@Inject
	private UniMapperGeneratorGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalUniMapperGeneratorParser createParser(XtextTokenStream stream) {
		return new InternalUniMapperGeneratorParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Grammar";
	}

	public UniMapperGeneratorGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(UniMapperGeneratorGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
