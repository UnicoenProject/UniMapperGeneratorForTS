/*
 * generated by Xtext 2.13.0
 */
package net.unicoen.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class UniMapperGeneratorAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("net/unicoen/parser/antlr/internal/InternalUniMapperGenerator.tokens");
	}
}
