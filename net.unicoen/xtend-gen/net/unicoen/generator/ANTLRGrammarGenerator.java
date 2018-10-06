package net.unicoen.generator;

import com.google.common.base.Objects;
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
import net.unicoen.uniMapperGenerator.GrammarType;
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
import net.unicoen.uniMapperGenerator.LexerCommandArg;
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
import net.unicoen.uniMapperGenerator.OptionValue;
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
import net.unicoen.uniMapperGenerator.RulePrequel;
import net.unicoen.uniMapperGenerator.RuleRef;
import net.unicoen.uniMapperGenerator.SetElement;
import net.unicoen.uniMapperGenerator.StringOption;
import net.unicoen.uniMapperGenerator.Terminal;
import net.unicoen.uniMapperGenerator.TokenRef;
import net.unicoen.uniMapperGenerator.TokenVocab;
import net.unicoen.uniMapperGenerator.V3Token;
import net.unicoen.uniMapperGenerator.V3Tokens;
import net.unicoen.uniMapperGenerator.V4Token;
import net.unicoen.uniMapperGenerator.V4Tokens;
import net.unicoen.uniMapperGenerator.Wildcard;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

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
    {
      if (((!Objects.equal(g.getType(), null)) && (!g.getType().equals(GrammarType.DEFAULT)))) {
        GrammarType _type = g.getType();
        _builder.append(_type);
        _builder.append(" ");
      }
    }
    _builder.append("grammar ");
    String _name = g.getName();
    _builder.append(_name);
    _builder.append(";");
    return _builder;
  }
  
  protected CharSequence _compile(final Options op) {
    StringConcatenation _builder = new StringConcatenation();
    String _keyword = op.getKeyword();
    _builder.append(_keyword);
    {
      EList<Option> _options = op.getOptions();
      for(final Option o : _options) {
        _builder.append(" ");
        Object _compile = this.compile(o);
        _builder.append(_compile);
        _builder.append(";");
      }
    }
    _builder.append("}");
    return _builder;
  }
  
  protected CharSequence _compile(final Option o) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = o.getName();
    _builder.append(_name);
    _builder.append(" = ");
    Object _compile = this.compile(o.getValue());
    _builder.append(_compile);
    return _builder;
  }
  
  protected CharSequence _compile(final TokenVocab tv) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = tv.getName();
    _builder.append(_name);
    _builder.append(" = ");
    Grammar _importURI = tv.getImportURI();
    _builder.append(_importURI);
    return _builder;
  }
  
  protected CharSequence _compile(final QualifiedOption qop) {
    StringConcatenation _builder = new StringConcatenation();
    QualifiedId _value = qop.getValue();
    _builder.append(_value);
    return _builder;
  }
  
  protected CharSequence _compile(final StringOption qop) {
    StringConcatenation _builder = new StringConcatenation();
    String _value = qop.getValue();
    _builder.append(_value);
    return _builder;
  }
  
  protected CharSequence _compile(final ActionOption qop) {
    StringConcatenation _builder = new StringConcatenation();
    String _value = qop.getValue();
    _builder.append(_value);
    return _builder;
  }
  
  protected CharSequence _compile(final IntOption qop) {
    StringConcatenation _builder = new StringConcatenation();
    int _value = qop.getValue();
    _builder.append(_value);
    return _builder;
  }
  
  protected CharSequence _compile(final Imports im) {
    StringConcatenation _builder = new StringConcatenation();
    String _keyword = im.getKeyword();
    _builder.append(_keyword);
    _builder.append(" ");
    {
      EList<Import> _imports = im.getImports();
      for(final Import i : _imports) {
        {
          boolean _equals = im.getImports().get(0).equals(i);
          boolean _not = (!_equals);
          if (_not) {
            _builder.append(", ");
          }
        }
        Object _compile = this.compile(i);
        _builder.append(_compile);
      }
    }
    return _builder;
  }
  
  protected CharSequence _compile(final Import i) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _isEmpty = i.getAlias().isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        String _alias = i.getAlias();
        _builder.append(_alias);
        _builder.append(" = ");
      }
    }
    Grammar _importURI = i.getImportURI();
    _builder.append(_importURI);
    return _builder;
  }
  
  protected CharSequence _compile(final V4Tokens v4) {
    StringConcatenation _builder = new StringConcatenation();
    String _keyword = v4.getKeyword();
    _builder.append(_keyword);
    _builder.append(" ");
    {
      EList<V4Token> _tokens = v4.getTokens();
      for(final V4Token t : _tokens) {
        {
          boolean _equals = v4.getTokens().get(0).equals(t);
          boolean _not = (!_equals);
          if (_not) {
            _builder.append(", ");
          }
        }
        Object _compile = this.compile(t);
        _builder.append(_compile);
      }
    }
    return _builder;
  }
  
  protected CharSequence _compile(final V4Token v4) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = v4.getName();
    _builder.append(_name);
    return _builder;
  }
  
  protected CharSequence _compile(final EmptyTokens et) {
    StringConcatenation _builder = new StringConcatenation();
    String _keyword = et.getKeyword();
    _builder.append(_keyword);
    _builder.append("}");
    return _builder;
  }
  
  protected CharSequence _compile(final V3Tokens v3) {
    StringConcatenation _builder = new StringConcatenation();
    String _keyword = v3.getKeyword();
    _builder.append(_keyword);
    {
      EList<V3Token> _tokens = v3.getTokens();
      for(final V3Token t : _tokens) {
        _builder.append(" ");
        Object _compile = this.compile(t);
        _builder.append(_compile);
      }
    }
    _builder.append("}");
    return _builder;
  }
  
  protected CharSequence _compile(final V3Token v3) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = v3.getName();
    _builder.append(_name);
    {
      boolean _isEmpty = v3.getValue().isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.append(" = ");
        String _value = v3.getValue();
        _builder.append(_value);
      }
    }
    _builder.append(";");
    return _builder;
  }
  
  protected CharSequence _compile(final GrammarAction ga) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("@");
    {
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(ga.getScope());
      boolean _not = (!_isNullOrEmpty);
      if (_not) {
        String _scope = ga.getScope();
        _builder.append(_scope);
        _builder.append(" ");
        String _colonSymbol = ga.getColonSymbol();
        _builder.append(_colonSymbol);
        _builder.append(" ");
      }
    }
    String _name = ga.getName();
    _builder.append(_name);
    _builder.append(" ");
    String _action = ga.getAction();
    _builder.append(_action);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _compile(final Mode m) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("mode ");
    String _id = m.getId();
    _builder.append(_id);
    _builder.append(";");
    {
      EList<LexerRule> _rules = m.getRules();
      for(final LexerRule lr : _rules) {
        Object _compile = this.compile(lr);
        _builder.append(_compile);
      }
    }
    return _builder;
  }
  
  protected CharSequence _compile(final ParserRule pr) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = pr.getName();
    _builder.append(_name);
    {
      Return _return = pr.getReturn();
      boolean _notEquals = (!Objects.equal(_return, null));
      if (_notEquals) {
        _builder.append(" ");
        Object _compile = this.compile(pr.getReturn());
        _builder.append(_compile);
      }
    }
    {
      net.unicoen.uniMapperGenerator.Exceptions _throws = pr.getThrows();
      boolean _notEquals_1 = (!Objects.equal(_throws, null));
      if (_notEquals_1) {
        _builder.append(" ");
        Object _compile_1 = this.compile(pr.getThrows());
        _builder.append(_compile_1);
      }
    }
    {
      LocalVars _locals = pr.getLocals();
      boolean _notEquals_2 = (!Objects.equal(_locals, null));
      if (_notEquals_2) {
        _builder.append(" ");
        Object _compile_2 = this.compile(pr.getLocals());
        _builder.append(_compile_2);
      }
    }
    {
      EList<RulePrequel> _prequels = pr.getPrequels();
      for(final RulePrequel p : _prequels) {
        _builder.append(" ");
        Object _compile_3 = this.compile(p);
        _builder.append(_compile_3);
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append(":");
    Object _compile_4 = this.compile(pr.getBody());
    _builder.append(_compile_4, "\t");
    Object _compile_5 = this.compile(pr.getCaught());
    _builder.append(_compile_5, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    String _semicolonSymbol = pr.getSemicolonSymbol();
    _builder.append(_semicolonSymbol, "\t");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _compile(final ExceptionGroup eg) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<ExceptionHandler> _handlers = eg.getHandlers();
      for(final ExceptionHandler e : _handlers) {
      }
    }
    {
      FinallyClause _finally = eg.getFinally();
      boolean _notEquals = (!Objects.equal(_finally, null));
      if (_notEquals) {
        Object _compile = this.compile(eg.getFinally());
        _builder.append(_compile);
      }
    }
    return _builder;
  }
  
  protected CharSequence _compile(final ExceptionHandler eh) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("catch ");
    String _exception = eh.getException();
    _builder.append(_exception);
    _builder.append(" ");
    String _body = eh.getBody();
    _builder.append(_body);
    return _builder;
  }
  
  protected CharSequence _compile(final FinallyClause fc) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("finally ");
    String _body = fc.getBody();
    _builder.append(_body);
    return _builder;
  }
  
  protected CharSequence _compile(final Return re) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("returns ");
    String _body = re.getBody();
    _builder.append(_body);
    return _builder;
  }
  
  protected CharSequence _compile(final net.unicoen.uniMapperGenerator.Exceptions ex) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("throws ");
    {
      EList<QualifiedId> _exceptions = ex.getExceptions();
      for(final QualifiedId e : _exceptions) {
        {
          boolean _equals = ex.getExceptions().get(0).equals(e);
          boolean _not = (!_equals);
          if (_not) {
            _builder.append(",");
          }
        }
        _builder.append(" ");
        _builder.append(e);
      }
    }
    return _builder;
  }
  
  protected CharSequence _compile(final LocalVars lv) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("locals ");
    String _body = lv.getBody();
    _builder.append(_body);
    return _builder;
  }
  
  protected CharSequence _compile(final RuleAction ra) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("@");
    String _name = ra.getName();
    _builder.append(_name);
    _builder.append(" ");
    String _body = ra.getBody();
    _builder.append(_body);
    return _builder;
  }
  
  protected CharSequence _compile(final RuleAltList ral) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<LabeledAlt> _alternatives = ral.getAlternatives();
      for(final LabeledAlt a : _alternatives) {
        {
          boolean _equals = ral.getAlternatives().get(0).equals(a);
          boolean _not = (!_equals);
          if (_not) {
            _builder.newLineIfNotEmpty();
            _builder.append("|");
          }
        }
        _builder.append("\t");
        Object _compile = this.compile(a);
        _builder.append(_compile);
      }
    }
    return _builder;
  }
  
  protected CharSequence _compile(final LabeledAlt la) {
    StringConcatenation _builder = new StringConcatenation();
    Object _compile = this.compile(la.getBody());
    _builder.append(_compile);
    {
      String _label = la.getLabel();
      boolean _notEquals = (!Objects.equal(_label, null));
      if (_notEquals) {
        _builder.append(" #");
        String _label_1 = la.getLabel();
        _builder.append(_label_1);
      }
    }
    return _builder;
  }
  
  protected CharSequence _compile(final Alternative al) {
    StringConcatenation _builder = new StringConcatenation();
    {
      ElementOptions _options = al.getOptions();
      boolean _notEquals = (!Objects.equal(_options, null));
      if (_notEquals) {
        Object _compile = this.compile(al.getOptions());
        _builder.append(_compile);
        _builder.append(" ");
      }
    }
    {
      EList<Element> _elements = al.getElements();
      for(final Element e : _elements) {
        Object _compile_1 = this.compile(e);
        _builder.append(_compile_1);
      }
    }
    return _builder;
  }
  
  protected CharSequence _compile(final Element el) {
    StringConcatenation _builder = new StringConcatenation();
    Object _compile = this.compile(el.getBody());
    _builder.append(_compile);
    {
      EbnfSuffix _operator = el.getOperator();
      boolean _notEquals = (!Objects.equal(_operator, null));
      if (_notEquals) {
        Object _compile_1 = this.compile(el.getOperator());
        _builder.append(_compile_1);
      }
    }
    _builder.append(" ");
    return _builder;
  }
  
  protected CharSequence _compile(final Ebnf eb) {
    StringConcatenation _builder = new StringConcatenation();
    Object _compile = this.compile(eb.getBody());
    _builder.append(_compile);
    {
      EbnfSuffix _operator = eb.getOperator();
      boolean _notEquals = (!Objects.equal(_operator, null));
      if (_notEquals) {
        Object _compile_1 = this.compile(eb.getOperator());
        _builder.append(_compile_1);
      }
    }
    return _builder;
  }
  
  protected CharSequence _compile(final ActionElement ae) {
    StringConcatenation _builder = new StringConcatenation();
    String _body = ae.getBody();
    _builder.append(_body);
    {
      ElementOptions _options = ae.getOptions();
      boolean _notEquals = (!Objects.equal(_options, null));
      if (_notEquals) {
        Object _compile = this.compile(ae.getOptions());
        _builder.append(_compile);
      }
    }
    return _builder;
  }
  
  protected CharSequence _compile(final LabeledElement le) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = le.getName();
    _builder.append(_name);
    _builder.append(" ");
    String _op = le.getOp();
    _builder.append(_op);
    _builder.append(" ");
    Object _compile = this.compile(le.getBody());
    _builder.append(_compile);
    return _builder;
  }
  
  protected CharSequence _compile(final EbnfSuffix es) {
    StringConcatenation _builder = new StringConcatenation();
    String _operator = es.getOperator();
    _builder.append(_operator);
    {
      String _nongreedy = es.getNongreedy();
      boolean _notEquals = (!Objects.equal(_nongreedy, null));
      if (_notEquals) {
        _builder.append(" ");
        String _nongreedy_1 = es.getNongreedy();
        _builder.append(_nongreedy_1);
      }
    }
    return _builder;
  }
  
  protected CharSequence _compile(final Block bl) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    {
      String _colon = bl.getColon();
      boolean _notEquals = (!Objects.equal(_colon, null));
      if (_notEquals) {
        {
          Options _options = bl.getOptions();
          boolean _notEquals_1 = (!Objects.equal(_options, null));
          if (_notEquals_1) {
            Object _compile = this.compile(bl.getOptions());
            _builder.append(_compile);
          }
        }
        {
          EList<RuleAction> _actions = bl.getActions();
          for(final RuleAction a : _actions) {
            _builder.append(" ");
            Object _compile_1 = this.compile(a);
            _builder.append(_compile_1);
          }
        }
        _builder.append(": ");
      }
    }
    Object _compile_2 = this.compile(bl.getBody());
    _builder.append(_compile_2);
    _builder.append(")");
    return _builder;
  }
  
  protected CharSequence _compile(final AltList al) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Alternative> _alternatives = al.getAlternatives();
      for(final Alternative a : _alternatives) {
        {
          boolean _equals = al.getAlternatives().get(0).equals(a);
          boolean _not = (!_equals);
          if (_not) {
            _builder.append("|");
          }
        }
        Object _compile = this.compile(a);
        _builder.append(_compile);
      }
    }
    return _builder;
  }
  
  protected CharSequence _compile(final Atom at) {
    StringConcatenation _builder = new StringConcatenation();
    Object _compile = this.compile(at.getBody());
    _builder.append(_compile);
    return _builder;
  }
  
  protected CharSequence _compile(final RuleRef rr) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = rr.getReference().getName();
    _builder.append(_name);
    {
      ElementOptions _options = rr.getOptions();
      boolean _notEquals = (!Objects.equal(_options, null));
      if (_notEquals) {
        Object _compile = this.compile(rr.getOptions());
        _builder.append(_compile);
      }
    }
    return _builder;
  }
  
  protected CharSequence _compile(final ElementOptions eo) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<");
    {
      EList<ElementOption> _options = eo.getOptions();
      for(final ElementOption o : _options) {
        Object _compile = this.compile(o);
        _builder.append(_compile);
        _builder.append(",");
      }
    }
    _builder.append(">");
    return _builder;
  }
  
  protected CharSequence _compile(final Range ra) {
    StringConcatenation _builder = new StringConcatenation();
    String _from = ra.getFrom();
    _builder.append(_from);
    _builder.append("..");
    String _to = ra.getTo();
    _builder.append(_to);
    _builder.append(" ");
    return _builder;
  }
  
  protected CharSequence _compile(final Terminal te) {
    StringConcatenation _builder = new StringConcatenation();
    {
      TokenRef _reference = te.getReference();
      boolean _notEquals = (!Objects.equal(_reference, null));
      if (_notEquals) {
        CharSequence _refCompile = this.refCompile(te.getReference());
        _builder.append(_refCompile);
        {
          ElementOptions _options = te.getOptions();
          boolean _notEquals_1 = (!Objects.equal(_options, null));
          if (_notEquals_1) {
            Object _compile = this.compile(te.getOptions());
            _builder.append(_compile);
          }
        }
      } else {
        String _literal = te.getLiteral();
        boolean _notEquals_2 = (!Objects.equal(_literal, null));
        if (_notEquals_2) {
          _builder.newLineIfNotEmpty();
          String _literal_1 = te.getLiteral();
          _builder.append(_literal_1);
          _builder.newLineIfNotEmpty();
          {
            ElementOptions _options_1 = te.getOptions();
            boolean _notEquals_3 = (!Objects.equal(_options_1, null));
            if (_notEquals_3) {
              _builder.append(" ");
              Object _compile_1 = this.compile(te.getOptions());
              _builder.append(_compile_1);
            }
          }
        }
      }
    }
    return _builder;
  }
  
  protected CharSequence _compile(final NotSet ns) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("~");
    Object _compile = this.compile(ns.getBody());
    _builder.append(_compile);
    return _builder;
  }
  
  protected CharSequence _compile(final BlockSet bs) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    {
      EList<SetElement> _elements = bs.getElements();
      for(final SetElement e : _elements) {
        {
          boolean _equals = bs.getElements().get(0).equals(e);
          boolean _not = (!_equals);
          if (_not) {
            _builder.append("|");
          }
        }
        Object _compile = this.compile(e);
        _builder.append(_compile);
      }
    }
    _builder.append(")");
    return _builder;
  }
  
  protected CharSequence _compile(final SetElement se) {
    StringConcatenation _builder = new StringConcatenation();
    {
      String _tokenRef = se.getTokenRef();
      boolean _notEquals = (!Objects.equal(_tokenRef, null));
      if (_notEquals) {
        String _tokenRef_1 = se.getTokenRef();
        _builder.append(_tokenRef_1);
      } else {
        String _stringLiteral = se.getStringLiteral();
        boolean _notEquals_1 = (!Objects.equal(_stringLiteral, null));
        if (_notEquals_1) {
          String _stringLiteral_1 = se.getStringLiteral();
          _builder.append(_stringLiteral_1);
        } else {
          Range _range = se.getRange();
          boolean _notEquals_2 = (!Objects.equal(_range, null));
          if (_notEquals_2) {
            Range _range_1 = se.getRange();
            _builder.append(_range_1);
          } else {
            String _charSet = se.getCharSet();
            _builder.append(_charSet);
          }
        }
      }
    }
    return _builder;
  }
  
  protected CharSequence _compile(final Wildcard wi) {
    StringConcatenation _builder = new StringConcatenation();
    String _dot = wi.getDot();
    _builder.append(_dot);
    {
      ElementOptions _options = wi.getOptions();
      boolean _notEquals = (!Objects.equal(_options, null));
      if (_notEquals) {
        Object _compile = this.compile(wi.getOptions());
        _builder.append(_compile);
      }
    }
    return _builder;
  }
  
  protected CharSequence _compile(final ElementOption eo) {
    StringConcatenation _builder = new StringConcatenation();
    {
      QualifiedId _qualifiedId = eo.getQualifiedId();
      boolean _notEquals = (!Objects.equal(_qualifiedId, null));
      if (_notEquals) {
        Object _compile = this.compile(eo.getQualifiedId());
        _builder.append(_compile);
      } else {
        String _id = eo.getId();
        _builder.append(_id);
        _builder.append(" ");
        String _assign = eo.getAssign();
        _builder.append(_assign);
        _builder.append(" ");
        OptionValue _value = eo.getValue();
        _builder.append(_value);
      }
    }
    return _builder;
  }
  
  protected CharSequence _compile(final LexerRule lr) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _isFragment = lr.isFragment();
      if (_isFragment) {
        _builder.append("fragment");
        _builder.newLineIfNotEmpty();
      }
    }
    String _name = lr.getName();
    _builder.append(_name);
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append(":");
    Object _compile = this.compile(lr.getBody());
    _builder.append(_compile, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append(";");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _compile(final LexerAltList lal) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<LexerAlt> _alternatives = lal.getAlternatives();
      for(final LexerAlt a : _alternatives) {
        {
          boolean _equals = lal.getAlternatives().get(0).equals(a);
          boolean _not = (!_equals);
          if (_not) {
            _builder.append("|");
          }
        }
        _builder.append("\t");
        Object _compile = this.compile(a);
        _builder.append(_compile);
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  protected CharSequence _compile(final LexerAlt la) {
    StringConcatenation _builder = new StringConcatenation();
    Object _compile = this.compile(la.getBody());
    _builder.append(_compile);
    {
      LexerCommands _commands = la.getCommands();
      boolean _notEquals = (!Objects.equal(_commands, null));
      if (_notEquals) {
        _builder.append(" ");
        Object _compile_1 = this.compile(la.getCommands());
        _builder.append(_compile_1);
      }
    }
    return _builder;
  }
  
  protected CharSequence _compile(final LexerElements le) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<LexerElementWithDollar> _elements = le.getElements();
      for(final LexerElementWithDollar e : _elements) {
        Object _compile = this.compile(e);
        _builder.append(_compile);
      }
    }
    return _builder;
  }
  
  protected CharSequence _compile(final LexerElementWithDollar led) {
    StringConcatenation _builder = new StringConcatenation();
    Object _compile = this.compile(led.getBody());
    _builder.append(_compile);
    return _builder;
  }
  
  protected CharSequence _compile(final LexerElement le) {
    StringConcatenation _builder = new StringConcatenation();
    Object _compile = this.compile(le.getBody());
    _builder.append(_compile);
    {
      EbnfSuffix _operator = le.getOperator();
      boolean _notEquals = (!Objects.equal(_operator, null));
      if (_notEquals) {
        Object _compile_1 = this.compile(le.getOperator());
        _builder.append(_compile_1);
      }
    }
    _builder.append(" ");
    return _builder;
  }
  
  protected CharSequence _compile(final LabeledLexerElement lle) {
    StringConcatenation _builder = new StringConcatenation();
    String _label = lle.getLabel();
    _builder.append(_label);
    _builder.append(" ");
    String _op = lle.getOp();
    _builder.append(_op);
    _builder.append(" ");
    Object _compile = this.compile(lle.getBody());
    _builder.append(_compile);
    return _builder;
  }
  
  protected CharSequence _compile(final LexerAtom la) {
    StringConcatenation _builder = new StringConcatenation();
    Object _compile = this.compile(la.getBody());
    _builder.append(_compile);
    return _builder;
  }
  
  protected CharSequence _compile(final LexerCharSet lcs) {
    StringConcatenation _builder = new StringConcatenation();
    String _body = lcs.getBody();
    _builder.append(_body);
    return _builder;
  }
  
  protected CharSequence _compile(final LexerBlock lb) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    {
      Options _options = lb.getOptions();
      boolean _notEquals = (!Objects.equal(_options, null));
      if (_notEquals) {
        Options _options_1 = lb.getOptions();
        _builder.append(_options_1);
        _builder.append(" :");
      }
    }
    Object _compile = this.compile(lb.getBody());
    _builder.append(_compile);
    _builder.append(")");
    return _builder;
  }
  
  protected CharSequence _compile(final LexerCommands lc) {
    StringConcatenation _builder = new StringConcatenation();
    String _keyword = lc.getKeyword();
    _builder.append(_keyword);
    {
      EList<LexerCommand> _commands = lc.getCommands();
      for(final LexerCommand c : _commands) {
        {
          boolean _equals = lc.getCommands().get(0).equals(c);
          boolean _not = (!_equals);
          if (_not) {
            _builder.append("|");
          }
        }
        Object _compile = this.compile(c);
        _builder.append(_compile);
      }
    }
    return _builder;
  }
  
  protected CharSequence _compile(final LexerCommand lc) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = lc.getName();
    _builder.append(_name);
    {
      LexerCommandExpr _args = lc.getArgs();
      boolean _notEquals = (!Objects.equal(_args, null));
      if (_notEquals) {
        _builder.append("(");
        Object _compile = this.compile(lc.getArgs());
        _builder.append(_compile);
        _builder.append(")");
      }
    }
    return _builder;
  }
  
  protected CharSequence _compile(final LexerCommandExpr lce) {
    StringConcatenation _builder = new StringConcatenation();
    {
      LexerCommandArg _ref = lce.getRef();
      boolean _notEquals = (!Objects.equal(_ref, null));
      if (_notEquals) {
        Object _compile = this.compile(lce.getRef());
        _builder.append(_compile);
      } else {
        int _value = lce.getValue();
        _builder.append(_value);
      }
    }
    return _builder;
  }
  
  protected CharSequence _compile(final QualifiedId qi) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<String> _name = qi.getName();
      for(final String n : _name) {
        _builder.append(n);
        _builder.append(".");
      }
    }
    return _builder;
  }
  
  protected CharSequence _refCompile(final V3Token v3) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = v3.getName();
    _builder.append(_name);
    _builder.append(" = ");
    String _value = v3.getValue();
    _builder.append(_value);
    _builder.append(";");
    return _builder;
  }
  
  protected CharSequence _refCompile(final V4Token v4) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = v4.getName();
    _builder.append(_name);
    return _builder;
  }
  
  protected CharSequence _refCompile(final LexerRule lr) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = lr.getName();
    _builder.append(_name);
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
