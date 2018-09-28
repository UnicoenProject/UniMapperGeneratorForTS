package net.unicoen.util;

import com.google.common.base.Objects;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import net.unicoen.uniMapperGenerator.Atom;
import net.unicoen.uniMapperGenerator.Element;
import net.unicoen.uniMapperGenerator.Grammar;
import net.unicoen.uniMapperGenerator.ParserRule;
import net.unicoen.uniMapperGenerator.RuleRef;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class InvokingStateAnalyzer {
  private final HashMap<String, List<Integer>> invokingStates = new HashMap<String, List<Integer>>();
  
  private final HashMap<String, Integer> invokingStateIndexes = new HashMap<String, Integer>();
  
  public InvokingStateAnalyzer(final String code, final Grammar g) {
    final Procedure1<ParserRule> _function = (ParserRule rule) -> {
      boolean _hasNoAnnotations = this.hasNoAnnotations(rule);
      if (_hasNoAnnotations) {
        return;
      }
      final String ruleName = rule.getName();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Parser.prototype.");
      _builder.append(ruleName);
      _builder.append(" = function(");
      int pos = code.indexOf(_builder.toString());
      final ArrayList<Integer> list = Lists.<Integer>newArrayList();
      final int trypos = code.indexOf("try", pos);
      final boolean hasLeftRecursion = code.substring(pos, trypos).contains("enterRecursionRule");
      int recursionState = (-1);
      if (hasLeftRecursion) {
        final int start = code.indexOf("var _startState = ", pos);
        final int last = code.indexOf(";", start);
        final String str = code.substring((start + 18), last);
        recursionState = Integer.parseInt(str);
      }
      final Function1<Element, Boolean> _function_1 = (Element it) -> {
        String _op = it.getOp();
        return Boolean.valueOf((!Objects.equal(_op, null)));
      };
      List<Element> _list = IteratorExtensions.<Element>toList(IteratorExtensions.<Element>filter(Iterators.<Element>filter(rule.eAllContents(), Element.class), _function_1));
      for (final Element element : _list) {
        {
          final EObject atom = element.getBody();
          if ((atom instanceof Atom)) {
            final EObject ref = ((Atom)atom).getBody();
            if ((ref instanceof RuleRef)) {
              if ((Objects.equal(((RuleRef)ref).getReference(), rule) && hasLeftRecursion)) {
                list.add(Integer.valueOf(recursionState));
              } else {
                final String refName = ((RuleRef)ref).getReference().getName();
                StringConcatenation _builder_1 = new StringConcatenation();
                _builder_1.append(refName);
                _builder_1.append("(");
                pos = code.indexOf(_builder_1.toString(), pos);
                final int start_1 = code.lastIndexOf("this.state = ", pos);
                final int last_1 = code.indexOf(";", start_1);
                final String str_1 = code.substring((start_1 + 13), last_1);
                final int state = Integer.parseInt(str_1);
                list.add(Integer.valueOf(state));
                pos++;
              }
            }
          }
        }
      }
      this.invokingStates.put(ruleName, list);
      this.invokingStateIndexes.put(ruleName, Integer.valueOf(0));
    };
    IteratorExtensions.<ParserRule>forEach(Iterators.<ParserRule>filter(g.eAllContents(), ParserRule.class), _function);
  }
  
  public Integer getInvokingState(final ParserRule rule) {
    try {
      final String ruleName = rule.getName();
      final List<Integer> states = this.invokingStates.get(ruleName);
      boolean _isEmpty = states.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        final Integer index = this.invokingStateIndexes.get(ruleName);
        int _size = states.size();
        int _modulo = (((index).intValue() + 1) % _size);
        this.invokingStateIndexes.put(ruleName, Integer.valueOf(_modulo));
        return states.get((index).intValue());
      }
      throw new Exception("Cannot use getInvokingState for not RuleRef objects");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  private boolean hasNoAnnotations(final ParserRule rule) {
    return (Objects.equal(rule.getType(), null) && Objects.equal(IteratorExtensions.<Element>findFirst(Iterators.<Element>filter(rule.eAllContents(), Element.class), ((Function1<Element, Boolean>) (Element it) -> {
      String _op = it.getOp();
      return Boolean.valueOf((!Objects.equal(_op, null)));
    })), null));
  }
}
