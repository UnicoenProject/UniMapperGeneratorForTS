package net.unicoen.generator;

import com.google.common.io.Files;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.function.Consumer;
import net.unicoen.uniMapperGenerator.ActionElement;
import net.unicoen.uniMapperGenerator.ActionOption;
import net.unicoen.uniMapperGenerator.AltList;
import net.unicoen.uniMapperGenerator.Alternative;
import net.unicoen.uniMapperGenerator.Atom;
import net.unicoen.uniMapperGenerator.Block;
import net.unicoen.uniMapperGenerator.BlockSet;
import net.unicoen.uniMapperGenerator.Ebnf;
import net.unicoen.uniMapperGenerator.EbnfSuffix;
import net.unicoen.uniMapperGenerator.Element;
import net.unicoen.uniMapperGenerator.ElementOption;
import net.unicoen.uniMapperGenerator.ElementOptions;
import net.unicoen.uniMapperGenerator.EmptyTokens;
import net.unicoen.uniMapperGenerator.ExceptionGroup;
import net.unicoen.uniMapperGenerator.ExceptionHandler;
import net.unicoen.uniMapperGenerator.FinallyClause;
import net.unicoen.uniMapperGenerator.Grammar;
import net.unicoen.uniMapperGenerator.GrammarAction;
import net.unicoen.uniMapperGenerator.Import;
import net.unicoen.uniMapperGenerator.Imports;
import net.unicoen.uniMapperGenerator.IntOption;
import net.unicoen.uniMapperGenerator.LabeledAlt;
import net.unicoen.uniMapperGenerator.LabeledElement;
import net.unicoen.uniMapperGenerator.LabeledLexerElement;
import net.unicoen.uniMapperGenerator.LexerAlt;
import net.unicoen.uniMapperGenerator.LexerAltList;
import net.unicoen.uniMapperGenerator.LexerAtom;
import net.unicoen.uniMapperGenerator.LexerBlock;
import net.unicoen.uniMapperGenerator.LexerCharSet;
import net.unicoen.uniMapperGenerator.LexerCommand;
import net.unicoen.uniMapperGenerator.LexerCommandExpr;
import net.unicoen.uniMapperGenerator.LexerCommands;
import net.unicoen.uniMapperGenerator.LexerElement;
import net.unicoen.uniMapperGenerator.LexerElementWithDollar;
import net.unicoen.uniMapperGenerator.LexerElements;
import net.unicoen.uniMapperGenerator.LexerRule;
import net.unicoen.uniMapperGenerator.LocalVars;
import net.unicoen.uniMapperGenerator.Mode;
import net.unicoen.uniMapperGenerator.NotSet;
import net.unicoen.uniMapperGenerator.Option;
import net.unicoen.uniMapperGenerator.Options;
import net.unicoen.uniMapperGenerator.ParserRule;
import net.unicoen.uniMapperGenerator.PrequelConstruct;
import net.unicoen.uniMapperGenerator.QualifiedId;
import net.unicoen.uniMapperGenerator.QualifiedOption;
import net.unicoen.uniMapperGenerator.Range;
import net.unicoen.uniMapperGenerator.Return;
import net.unicoen.uniMapperGenerator.Rule;
import net.unicoen.uniMapperGenerator.RuleAction;
import net.unicoen.uniMapperGenerator.RuleAltList;
import net.unicoen.uniMapperGenerator.RuleRef;
import net.unicoen.uniMapperGenerator.SetElement;
import net.unicoen.uniMapperGenerator.StringOption;
import net.unicoen.uniMapperGenerator.Terminal;
import net.unicoen.uniMapperGenerator.TokenVocab;
import net.unicoen.uniMapperGenerator.V3Token;
import net.unicoen.uniMapperGenerator.V3Tokens;
import net.unicoen.uniMapperGenerator.V4Token;
import net.unicoen.uniMapperGenerator.V4Tokens;
import net.unicoen.uniMapperGenerator.Wildcard;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public class ANTLRGrammarGenerator {
  private final IFileSystemAccess _fsa;
  
  private final String _newLine = System.getProperty("line.separator");
  
  private final String _fileSep = File.separator;
  
  private final String _fileExtension = ".g4";
  
  private final String _targetExt = ".ts";
  
  private final String editorProjectName = "UniMapperGenerator";
  
  public ANTLRGrammarGenerator(final IFileSystemAccess fsa) {
    this._fsa = fsa;
  }
  
  public String generate(final String basename, final Grammar grammar) {
    String _xblockexpression = null;
    {
      final String filename = (basename + this._fileExtension);
      this._fsa.generateFile(filename, this.compile(grammar));
      _xblockexpression = this.generateParserCode(basename, filename);
    }
    return _xblockexpression;
  }
  
  public String getProjectDirPath() {
    try {
      String _xblockexpression = null;
      {
        final URL location = this.getClass().getProtectionDomain().getCodeSource().getLocation();
        final String path = location.getPath().replace("/", this._fileSep);
        final String docodePath = URLDecoder.decode(path.replaceAll("\\+", "%2b"), "UTF-8");
        final File file = new File(docodePath);
        boolean _exists = file.exists();
        boolean _not = (!_exists);
        if (_not) {
          throw new FileNotFoundException((docodePath + " is not found."));
        }
        String _absolutePath = file.getAbsolutePath();
        _xblockexpression = (_absolutePath + this._fileSep);
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public String readParserFile(final String srcGenDirPath, final String basename) {
    try {
      String _xblockexpression = null;
      {
        final String parserFilePath = (((srcGenDirPath + basename) + "Parser") + this._targetExt);
        final File parserFile = new File(parserFilePath);
        final BufferedReader reader = Files.newReader(parserFile, StandardCharsets.UTF_8);
        final StringBuilder builder = new StringBuilder();
        String line = "";
        while (((line = reader.readLine()) != null)) {
          {
            builder.append(line);
            builder.append(this._newLine);
          }
        }
        reader.close();
        _xblockexpression = builder.toString();
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public boolean isWindows() {
    return System.getProperty("os.name").toLowerCase().contains("win");
  }
  
  public String generateParserCode(final String basename, final String filename) {
    try {
      String _xblockexpression = null;
      {
        String _projectDirPath = this.getProjectDirPath();
        String _plus = (_projectDirPath + "..");
        final String projectDirPath = (_plus + this._fileSep);
        final String editorProjectDirPath = ((projectDirPath + this.editorProjectName) + this._fileSep);
        final String editorProjectSrcGenDirPath = ((editorProjectDirPath + "src-gen") + this._fileSep);
        final String g4FilePath = (editorProjectSrcGenDirPath + filename);
        {
          String _xifexpression = null;
          boolean _isWindows = this.isWindows();
          if (_isWindows) {
            _xifexpression = "npm.cmd";
          } else {
            _xifexpression = "npm";
          }
          final String npm = _xifexpression;
          final ProcessBuilder pb = new ProcessBuilder(npm, "install", "antlr4ts-cli");
          File _file = new File(projectDirPath);
          pb.directory(_file);
          try {
            pb.start().waitFor();
          } catch (final Throwable _t) {
            if (_t instanceof IOException) {
              System.out.println("npm command cannot be executed!");
              System.out.println("Please install node.js and npm.");
            } else {
              throw Exceptions.sneakyThrow(_t);
            }
          }
        }
        {
          String _xifexpression = null;
          boolean _isWindows = this.isWindows();
          if (_isWindows) {
            _xifexpression = "npx.cmd";
          } else {
            _xifexpression = "npx";
          }
          final String npx = _xifexpression;
          final ProcessBuilder pb = new ProcessBuilder(npx, "antlr4ts", 
            "-visitor", 
            "-no-listener", g4FilePath, 
            "-o", editorProjectSrcGenDirPath);
          File _file = new File(projectDirPath);
          pb.directory(_file);
          try {
            pb.start().waitFor();
          } catch (final Throwable _t) {
            if (_t instanceof Exception) {
              System.out.println("\"npx antlr4ts\" command cannot be executed!");
            } else {
              throw Exceptions.sneakyThrow(_t);
            }
          }
        }
        _xblockexpression = this.readParserFile(editorProjectSrcGenDirPath, basename);
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  protected CharSequence _compile(final Grammar g) {
    String _xblockexpression = null;
    {
      final StringBuilder sb = new StringBuilder();
      CharSequence _nameCompile = this.nameCompile(g);
      String _plus = (_nameCompile + this._newLine);
      String _plus_1 = (_plus + this._newLine);
      sb.append(_plus_1);
      final Consumer<PrequelConstruct> _function = (PrequelConstruct it) -> {
        Object _compile = this.compile(it);
        String _plus_2 = (_compile + this._newLine);
        sb.append(_plus_2);
      };
      g.getPrequels().forEach(_function);
      final Consumer<Rule> _function_1 = (Rule it) -> {
        Object _compile = this.compile(it);
        String _plus_2 = (_compile + this._newLine);
        sb.append(_plus_2);
      };
      g.getRules().forEach(_function_1);
      final Consumer<Mode> _function_2 = (Mode it) -> {
        Object _compile = this.compile(it);
        String _plus_2 = (_compile + this._newLine);
        sb.append(_plus_2);
      };
      g.getModes().forEach(_function_2);
      _xblockexpression = sb.toString();
    }
    return _xblockexpression;
  }
  
  public CharSequence nameCompile(final Grammar g) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("«IF g.type != null && !g.type.equals(GrammarType.DEFAULT)»«g.type» «ENDIF»grammar «g.");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("name»;");
    return _builder;
  }
  
  protected CharSequence _compile(final Options op) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("«op.keyword»«FOR o : op.options» «o.compile»;«ENDFOR»}");
    return _builder;
  }
  
  protected CharSequence _compile(final Option o) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("«o.name» = «o.value.compile»");
    return _builder;
  }
  
  protected CharSequence _compile(final TokenVocab tv) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("«tv.name» = «tv.importURI»");
    return _builder;
  }
  
  protected CharSequence _compile(final QualifiedOption qop) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("«qop.value»");
    return _builder;
  }
  
  protected CharSequence _compile(final StringOption qop) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("«qop.value»");
    return _builder;
  }
  
  protected CharSequence _compile(final ActionOption qop) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("«qop.value»");
    return _builder;
  }
  
  protected CharSequence _compile(final IntOption qop) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("«qop.value»");
    return _builder;
  }
  
  protected CharSequence _compile(final Imports im) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("«im.keyword» «FOR i : im.imports»«IF !im.imports.get(0).equals(i)», «ENDIF»«i.compile»«ENDFOR»");
    return _builder;
  }
  
  protected CharSequence _compile(final Import i) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("«IF !i.alias.empty»«i.alias» = «ENDIF»«i.importURI»");
    return _builder;
  }
  
  protected CharSequence _compile(final V4Tokens v4) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("«v4.keyword» «FOR t : v4.tokens»«IF !v4.tokens.get(0).equals(t)», «ENDIF»«t.compile»«ENDFOR»");
    return _builder;
  }
  
  protected CharSequence _compile(final V4Token v4) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("«v4.name»");
    return _builder;
  }
  
  protected CharSequence _compile(final EmptyTokens et) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("«et.keyword»}");
    return _builder;
  }
  
  protected CharSequence _compile(final V3Tokens v3) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("«v3.keyword»«FOR t : v3.tokens» «t.compile»«ENDFOR»}");
    return _builder;
  }
  
  protected CharSequence _compile(final V3Token v3) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("«v3.name»«IF !v3.value.empty» = «v3.value»«ENDIF»;");
    return _builder;
  }
  
  protected CharSequence _compile(final GrammarAction ga) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("@«IF !ga.scope.nullOrEmpty»«ga.scope» «ga.colonSymbol» «ENDIF»«ga.name» «ga.");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("action»");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _compile(final Mode m) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("mode «m.id»;«FOR lr : m.rules»«lr.compile»«ENDFOR»");
    return _builder;
  }
  
  protected CharSequence _compile(final ParserRule pr) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("«pr.name»«IF pr.^return != null» «pr.^return.compile»«ENDIF»«IF pr.throws != null» «pr.throws.compile»«ENDIF»«IF pr.");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("locals != null» «pr.locals.compile»«ENDIF»«FOR p : pr.prequels» «p.compile»«ENDFOR»");
    _builder.newLine();
    _builder.append("\t");
    _builder.append(":«pr.body.compile»«pr.caught.compile»");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("«pr.semicolonSymbol»");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _compile(final ExceptionGroup eg) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("«FOR e : eg.handlers»«ENDFOR»«IF eg.^finally != null»«eg.^finally.compile»«ENDIF»");
    return _builder;
  }
  
  protected CharSequence _compile(final ExceptionHandler eh) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("catch «eh.exception» «eh.body»");
    return _builder;
  }
  
  protected CharSequence _compile(final FinallyClause fc) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("finally «fc.body»");
    return _builder;
  }
  
  protected CharSequence _compile(final Return re) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("returns «re.body»");
    return _builder;
  }
  
  protected CharSequence _compile(final net.unicoen.uniMapperGenerator.Exceptions ex) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("throws «FOR e : ex.exceptions»«IF !ex.exceptions.get(0).equals(e)»,«ENDIF» «e»«ENDFOR»");
    return _builder;
  }
  
  protected CharSequence _compile(final LocalVars lv) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("locals «lv.body»");
    return _builder;
  }
  
  protected CharSequence _compile(final RuleAction ra) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("@«ra.name» «ra.body»");
    return _builder;
  }
  
  protected CharSequence _compile(final RuleAltList ral) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("«FOR a : ral.alternatives»«IF !ral.alternatives.get(0).equals(a)»");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("|«ENDIF»\t«a.compile»«ENDFOR»");
    return _builder;
  }
  
  protected CharSequence _compile(final LabeledAlt la) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("«la.body.compile»«IF la.label != null» #«la.label»«ENDIF»");
    return _builder;
  }
  
  protected CharSequence _compile(final Alternative al) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("«IF al.options != null»«al.options.compile» «ENDIF»«FOR e : al.elements»«e.");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("compile»«ENDFOR»");
    return _builder;
  }
  
  protected CharSequence _compile(final Element el) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("«el.body.compile»«IF el.operator != null»«el.operator.compile»«ENDIF» ");
    return _builder;
  }
  
  protected CharSequence _compile(final Ebnf eb) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("«eb.body.compile»«IF eb.operator != null»«eb.operator.compile»«ENDIF»");
    return _builder;
  }
  
  protected CharSequence _compile(final ActionElement ae) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("«ae.body»«IF ae.options != null»«ae.options.compile»«ENDIF»");
    return _builder;
  }
  
  protected CharSequence _compile(final LabeledElement le) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("«le.name» «le.op» «le.body.compile»");
    return _builder;
  }
  
  protected CharSequence _compile(final EbnfSuffix es) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("«es.operator»«IF es.nongreedy != null» «es.nongreedy»«ENDIF»");
    return _builder;
  }
  
  protected CharSequence _compile(final Block bl) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(«IF bl.colon != null»«IF bl.options != null»«bl.options.compile»«ENDIF»«FOR a : bl.");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("actions» «a.compile»«ENDFOR»: «ENDIF»«bl.body.compile»)");
    return _builder;
  }
  
  protected CharSequence _compile(final AltList al) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("«FOR a : al.alternatives»«IF !al.alternatives.get(0).equals(a)»|«ENDIF»«a.");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("compile»«ENDFOR»");
    return _builder;
  }
  
  protected CharSequence _compile(final Atom at) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("«at.body.compile»");
    return _builder;
  }
  
  protected CharSequence _compile(final RuleRef rr) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("«rr.reference.name»«IF rr.options != null»«rr.options.compile»«ENDIF»");
    return _builder;
  }
  
  protected CharSequence _compile(final ElementOptions eo) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<«FOR o : eo.options»«o.compile»,«ENDFOR»>");
    return _builder;
  }
  
  protected CharSequence _compile(final Range ra) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("«ra.from»..«ra.to» ");
    return _builder;
  }
  
  protected CharSequence _compile(final Terminal te) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("«IF te.reference != null»«te.reference.refCompile»«IF te.options != null»«te.");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("options.compile»«ENDIF»«ELSEIF te.literal != null»");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("«te.literal»");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("«IF te.options != null» «te.options.compile»«ENDIF»«ENDIF»");
    return _builder;
  }
  
  protected CharSequence _compile(final NotSet ns) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("~«ns.body.compile»");
    return _builder;
  }
  
  protected CharSequence _compile(final BlockSet bs) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(«FOR e : bs.elements»«IF !bs.elements.get(0).equals(e)»|«ENDIF»«e.compile»«ENDFOR»)");
    return _builder;
  }
  
  protected CharSequence _compile(final SetElement se) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("«IF se.tokenRef != null»«se.tokenRef»«ELSEIF se.stringLiteral != null»«se.stringLiteral»«ELSEIF se.");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("range != null»«se.range»«ELSE»«se.charSet»«ENDIF»");
    return _builder;
  }
  
  protected CharSequence _compile(final Wildcard wi) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("«wi.dot»«IF wi.options != null»«wi.options.compile»«ENDIF»");
    return _builder;
  }
  
  protected CharSequence _compile(final ElementOption eo) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("«IF eo.qualifiedId != null»«eo.qualifiedId.compile»«ELSE»«eo.id» «eo.");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("assign» «eo.value»«ENDIF»");
    return _builder;
  }
  
  protected CharSequence _compile(final LexerRule lr) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("«IF lr.^fragment»fragment");
    _builder.newLine();
    _builder.append("«ENDIF»«lr.name»");
    _builder.newLine();
    _builder.append("\t");
    _builder.append(":«lr.body.compile»");
    _builder.newLine();
    _builder.append("\t");
    _builder.append(";");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _compile(final LexerAltList lal) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("«FOR a : lal.alternatives»«IF !lal.alternatives.get(0).equals(a)»|«ENDIF»\t«a.");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("compile»");
    _builder.newLine();
    _builder.append("«ENDFOR»");
    return _builder;
  }
  
  protected CharSequence _compile(final LexerAlt la) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("«la.body.compile»«IF la.commands != null» «la.commands.compile»«ENDIF»");
    return _builder;
  }
  
  protected CharSequence _compile(final LexerElements le) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("«FOR e : le.elements»«e.compile»«ENDFOR»");
    return _builder;
  }
  
  protected CharSequence _compile(final LexerElementWithDollar led) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("«led.body.compile»");
    return _builder;
  }
  
  protected CharSequence _compile(final LexerElement le) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("«le.body.compile»«IF le.operator != null»«le.operator.compile»«ENDIF» ");
    return _builder;
  }
  
  protected CharSequence _compile(final LabeledLexerElement lle) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("«lle.label» «lle.op» «lle.body.compile»");
    return _builder;
  }
  
  protected CharSequence _compile(final LexerAtom la) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("«la.body.compile»");
    return _builder;
  }
  
  protected CharSequence _compile(final LexerCharSet lcs) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("«lcs.body»");
    return _builder;
  }
  
  protected CharSequence _compile(final LexerBlock lb) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(«IF lb.options != null»«lb.options» :«ENDIF»«lb.body.compile»)");
    return _builder;
  }
  
  protected CharSequence _compile(final LexerCommands lc) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("«lc.keyword»«FOR c : lc.commands»«IF !lc.commands.get(0).equals(c)»|«ENDIF»«c.");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("compile»«ENDFOR»");
    return _builder;
  }
  
  protected CharSequence _compile(final LexerCommand lc) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("«lc.name»«IF lc.args != null»(«lc.args.compile»)«ENDIF»");
    return _builder;
  }
  
  protected CharSequence _compile(final LexerCommandExpr lce) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("«IF lce.ref != null»«lce.ref.compile»«ELSE»«lce.value»«ENDIF»");
    return _builder;
  }
  
  protected CharSequence _compile(final QualifiedId qi) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("«FOR n : qi.name»«n».«ENDFOR»");
    return _builder;
  }
  
  protected CharSequence _refCompile(final V3Token v3) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("«v3.name» = «v3.value»;");
    return _builder;
  }
  
  protected CharSequence _refCompile(final V4Token v4) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("«v4.name»");
    return _builder;
  }
  
  protected CharSequence _refCompile(final LexerRule lr) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("«lr.name»");
    return _builder;
  }
  
  public CharSequence compile(final EObject et) {
    if (et instanceof EmptyTokens) {
      return _compile((EmptyTokens)et);
    } else if (et instanceof V3Tokens) {
      return _compile((V3Tokens)et);
    } else if (et instanceof V4Tokens) {
      return _compile((V4Tokens)et);
    } else if (et instanceof ActionOption) {
      return _compile((ActionOption)et);
    } else if (et instanceof GrammarAction) {
      return _compile((GrammarAction)et);
    } else if (et instanceof Imports) {
      return _compile((Imports)et);
    } else if (et instanceof IntOption) {
      return _compile((IntOption)et);
    } else if (et instanceof LexerRule) {
      return _compile((LexerRule)et);
    } else if (et instanceof Mode) {
      return _compile((Mode)et);
    } else if (et instanceof Options) {
      return _compile((Options)et);
    } else if (et instanceof ParserRule) {
      return _compile((ParserRule)et);
    } else if (et instanceof QualifiedOption) {
      return _compile((QualifiedOption)et);
    } else if (et instanceof RuleAction) {
      return _compile((RuleAction)et);
    } else if (et instanceof StringOption) {
      return _compile((StringOption)et);
    } else if (et instanceof TokenVocab) {
      return _compile((TokenVocab)et);
    } else if (et instanceof V3Token) {
      return _compile((V3Token)et);
    } else if (et instanceof V4Token) {
      return _compile((V4Token)et);
    } else if (et instanceof ActionElement) {
      return _compile((ActionElement)et);
    } else if (et instanceof AltList) {
      return _compile((AltList)et);
    } else if (et instanceof Alternative) {
      return _compile((Alternative)et);
    } else if (et instanceof Atom) {
      return _compile((Atom)et);
    } else if (et instanceof Block) {
      return _compile((Block)et);
    } else if (et instanceof BlockSet) {
      return _compile((BlockSet)et);
    } else if (et instanceof Ebnf) {
      return _compile((Ebnf)et);
    } else if (et instanceof EbnfSuffix) {
      return _compile((EbnfSuffix)et);
    } else if (et instanceof Element) {
      return _compile((Element)et);
    } else if (et instanceof ElementOption) {
      return _compile((ElementOption)et);
    } else if (et instanceof ElementOptions) {
      return _compile((ElementOptions)et);
    } else if (et instanceof ExceptionGroup) {
      return _compile((ExceptionGroup)et);
    } else if (et instanceof ExceptionHandler) {
      return _compile((ExceptionHandler)et);
    } else if (et instanceof net.unicoen.uniMapperGenerator.Exceptions) {
      return _compile((net.unicoen.uniMapperGenerator.Exceptions)et);
    } else if (et instanceof FinallyClause) {
      return _compile((FinallyClause)et);
    } else if (et instanceof Grammar) {
      return _compile((Grammar)et);
    } else if (et instanceof Import) {
      return _compile((Import)et);
    } else if (et instanceof LabeledAlt) {
      return _compile((LabeledAlt)et);
    } else if (et instanceof LabeledElement) {
      return _compile((LabeledElement)et);
    } else if (et instanceof LabeledLexerElement) {
      return _compile((LabeledLexerElement)et);
    } else if (et instanceof LexerAlt) {
      return _compile((LexerAlt)et);
    } else if (et instanceof LexerAltList) {
      return _compile((LexerAltList)et);
    } else if (et instanceof LexerAtom) {
      return _compile((LexerAtom)et);
    } else if (et instanceof LexerBlock) {
      return _compile((LexerBlock)et);
    } else if (et instanceof LexerCharSet) {
      return _compile((LexerCharSet)et);
    } else if (et instanceof LexerCommand) {
      return _compile((LexerCommand)et);
    } else if (et instanceof LexerCommandExpr) {
      return _compile((LexerCommandExpr)et);
    } else if (et instanceof LexerCommands) {
      return _compile((LexerCommands)et);
    } else if (et instanceof LexerElement) {
      return _compile((LexerElement)et);
    } else if (et instanceof LexerElementWithDollar) {
      return _compile((LexerElementWithDollar)et);
    } else if (et instanceof LexerElements) {
      return _compile((LexerElements)et);
    } else if (et instanceof LocalVars) {
      return _compile((LocalVars)et);
    } else if (et instanceof NotSet) {
      return _compile((NotSet)et);
    } else if (et instanceof Option) {
      return _compile((Option)et);
    } else if (et instanceof QualifiedId) {
      return _compile((QualifiedId)et);
    } else if (et instanceof Range) {
      return _compile((Range)et);
    } else if (et instanceof Return) {
      return _compile((Return)et);
    } else if (et instanceof RuleAltList) {
      return _compile((RuleAltList)et);
    } else if (et instanceof RuleRef) {
      return _compile((RuleRef)et);
    } else if (et instanceof SetElement) {
      return _compile((SetElement)et);
    } else if (et instanceof Terminal) {
      return _compile((Terminal)et);
    } else if (et instanceof Wildcard) {
      return _compile((Wildcard)et);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(et).toString());
    }
  }
  
  public CharSequence refCompile(final EObject lr) {
    if (lr instanceof LexerRule) {
      return _refCompile((LexerRule)lr);
    } else if (lr instanceof V3Token) {
      return _refCompile((V3Token)lr);
    } else if (lr instanceof V4Token) {
      return _refCompile((V4Token)lr);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(lr).toString());
    }
  }
}
