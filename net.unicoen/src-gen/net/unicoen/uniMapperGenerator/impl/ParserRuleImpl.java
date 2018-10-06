/**
 * generated by Xtext 2.15.0
 */
package net.unicoen.uniMapperGenerator.impl;

import java.util.Collection;

import net.unicoen.uniMapperGenerator.ExceptionGroup;
import net.unicoen.uniMapperGenerator.Exceptions;
import net.unicoen.uniMapperGenerator.LocalVars;
import net.unicoen.uniMapperGenerator.ParserRule;
import net.unicoen.uniMapperGenerator.Return;
import net.unicoen.uniMapperGenerator.RuleAltList;
import net.unicoen.uniMapperGenerator.RulePrequel;
import net.unicoen.uniMapperGenerator.UniMapperGeneratorPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parser Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.unicoen.uniMapperGenerator.impl.ParserRuleImpl#getArgs <em>Args</em>}</li>
 *   <li>{@link net.unicoen.uniMapperGenerator.impl.ParserRuleImpl#getReturn <em>Return</em>}</li>
 *   <li>{@link net.unicoen.uniMapperGenerator.impl.ParserRuleImpl#getThrows <em>Throws</em>}</li>
 *   <li>{@link net.unicoen.uniMapperGenerator.impl.ParserRuleImpl#getLocals <em>Locals</em>}</li>
 *   <li>{@link net.unicoen.uniMapperGenerator.impl.ParserRuleImpl#getPrequels <em>Prequels</em>}</li>
 *   <li>{@link net.unicoen.uniMapperGenerator.impl.ParserRuleImpl#getBody <em>Body</em>}</li>
 *   <li>{@link net.unicoen.uniMapperGenerator.impl.ParserRuleImpl#getCaught <em>Caught</em>}</li>
 *   <li>{@link net.unicoen.uniMapperGenerator.impl.ParserRuleImpl#getSemicolonSymbol <em>Semicolon Symbol</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParserRuleImpl extends RuleImpl implements ParserRule
{
  /**
   * The default value of the '{@link #getArgs() <em>Args</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArgs()
   * @generated
   * @ordered
   */
  protected static final String ARGS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getArgs() <em>Args</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArgs()
   * @generated
   * @ordered
   */
  protected String args = ARGS_EDEFAULT;

  /**
   * The cached value of the '{@link #getReturn() <em>Return</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReturn()
   * @generated
   * @ordered
   */
  protected Return return_;

  /**
   * The cached value of the '{@link #getThrows() <em>Throws</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getThrows()
   * @generated
   * @ordered
   */
  protected Exceptions throws_;

  /**
   * The cached value of the '{@link #getLocals() <em>Locals</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLocals()
   * @generated
   * @ordered
   */
  protected LocalVars locals;

  /**
   * The cached value of the '{@link #getPrequels() <em>Prequels</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrequels()
   * @generated
   * @ordered
   */
  protected EList<RulePrequel> prequels;

  /**
   * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBody()
   * @generated
   * @ordered
   */
  protected RuleAltList body;

  /**
   * The cached value of the '{@link #getCaught() <em>Caught</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCaught()
   * @generated
   * @ordered
   */
  protected ExceptionGroup caught;

  /**
   * The default value of the '{@link #getSemicolonSymbol() <em>Semicolon Symbol</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSemicolonSymbol()
   * @generated
   * @ordered
   */
  protected static final String SEMICOLON_SYMBOL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSemicolonSymbol() <em>Semicolon Symbol</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSemicolonSymbol()
   * @generated
   * @ordered
   */
  protected String semicolonSymbol = SEMICOLON_SYMBOL_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ParserRuleImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return UniMapperGeneratorPackage.Literals.PARSER_RULE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getArgs()
  {
    return args;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArgs(String newArgs)
  {
    String oldArgs = args;
    args = newArgs;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UniMapperGeneratorPackage.PARSER_RULE__ARGS, oldArgs, args));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Return getReturn()
  {
    return return_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetReturn(Return newReturn, NotificationChain msgs)
  {
    Return oldReturn = return_;
    return_ = newReturn;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UniMapperGeneratorPackage.PARSER_RULE__RETURN, oldReturn, newReturn);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReturn(Return newReturn)
  {
    if (newReturn != return_)
    {
      NotificationChain msgs = null;
      if (return_ != null)
        msgs = ((InternalEObject)return_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UniMapperGeneratorPackage.PARSER_RULE__RETURN, null, msgs);
      if (newReturn != null)
        msgs = ((InternalEObject)newReturn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UniMapperGeneratorPackage.PARSER_RULE__RETURN, null, msgs);
      msgs = basicSetReturn(newReturn, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UniMapperGeneratorPackage.PARSER_RULE__RETURN, newReturn, newReturn));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Exceptions getThrows()
  {
    return throws_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetThrows(Exceptions newThrows, NotificationChain msgs)
  {
    Exceptions oldThrows = throws_;
    throws_ = newThrows;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UniMapperGeneratorPackage.PARSER_RULE__THROWS, oldThrows, newThrows);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setThrows(Exceptions newThrows)
  {
    if (newThrows != throws_)
    {
      NotificationChain msgs = null;
      if (throws_ != null)
        msgs = ((InternalEObject)throws_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UniMapperGeneratorPackage.PARSER_RULE__THROWS, null, msgs);
      if (newThrows != null)
        msgs = ((InternalEObject)newThrows).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UniMapperGeneratorPackage.PARSER_RULE__THROWS, null, msgs);
      msgs = basicSetThrows(newThrows, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UniMapperGeneratorPackage.PARSER_RULE__THROWS, newThrows, newThrows));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LocalVars getLocals()
  {
    return locals;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLocals(LocalVars newLocals, NotificationChain msgs)
  {
    LocalVars oldLocals = locals;
    locals = newLocals;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UniMapperGeneratorPackage.PARSER_RULE__LOCALS, oldLocals, newLocals);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLocals(LocalVars newLocals)
  {
    if (newLocals != locals)
    {
      NotificationChain msgs = null;
      if (locals != null)
        msgs = ((InternalEObject)locals).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UniMapperGeneratorPackage.PARSER_RULE__LOCALS, null, msgs);
      if (newLocals != null)
        msgs = ((InternalEObject)newLocals).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UniMapperGeneratorPackage.PARSER_RULE__LOCALS, null, msgs);
      msgs = basicSetLocals(newLocals, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UniMapperGeneratorPackage.PARSER_RULE__LOCALS, newLocals, newLocals));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<RulePrequel> getPrequels()
  {
    if (prequels == null)
    {
      prequels = new EObjectContainmentEList<RulePrequel>(RulePrequel.class, this, UniMapperGeneratorPackage.PARSER_RULE__PREQUELS);
    }
    return prequels;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RuleAltList getBody()
  {
    return body;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBody(RuleAltList newBody, NotificationChain msgs)
  {
    RuleAltList oldBody = body;
    body = newBody;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UniMapperGeneratorPackage.PARSER_RULE__BODY, oldBody, newBody);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBody(RuleAltList newBody)
  {
    if (newBody != body)
    {
      NotificationChain msgs = null;
      if (body != null)
        msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UniMapperGeneratorPackage.PARSER_RULE__BODY, null, msgs);
      if (newBody != null)
        msgs = ((InternalEObject)newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UniMapperGeneratorPackage.PARSER_RULE__BODY, null, msgs);
      msgs = basicSetBody(newBody, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UniMapperGeneratorPackage.PARSER_RULE__BODY, newBody, newBody));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExceptionGroup getCaught()
  {
    return caught;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCaught(ExceptionGroup newCaught, NotificationChain msgs)
  {
    ExceptionGroup oldCaught = caught;
    caught = newCaught;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UniMapperGeneratorPackage.PARSER_RULE__CAUGHT, oldCaught, newCaught);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCaught(ExceptionGroup newCaught)
  {
    if (newCaught != caught)
    {
      NotificationChain msgs = null;
      if (caught != null)
        msgs = ((InternalEObject)caught).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UniMapperGeneratorPackage.PARSER_RULE__CAUGHT, null, msgs);
      if (newCaught != null)
        msgs = ((InternalEObject)newCaught).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UniMapperGeneratorPackage.PARSER_RULE__CAUGHT, null, msgs);
      msgs = basicSetCaught(newCaught, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UniMapperGeneratorPackage.PARSER_RULE__CAUGHT, newCaught, newCaught));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSemicolonSymbol()
  {
    return semicolonSymbol;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSemicolonSymbol(String newSemicolonSymbol)
  {
    String oldSemicolonSymbol = semicolonSymbol;
    semicolonSymbol = newSemicolonSymbol;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UniMapperGeneratorPackage.PARSER_RULE__SEMICOLON_SYMBOL, oldSemicolonSymbol, semicolonSymbol));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case UniMapperGeneratorPackage.PARSER_RULE__RETURN:
        return basicSetReturn(null, msgs);
      case UniMapperGeneratorPackage.PARSER_RULE__THROWS:
        return basicSetThrows(null, msgs);
      case UniMapperGeneratorPackage.PARSER_RULE__LOCALS:
        return basicSetLocals(null, msgs);
      case UniMapperGeneratorPackage.PARSER_RULE__PREQUELS:
        return ((InternalEList<?>)getPrequels()).basicRemove(otherEnd, msgs);
      case UniMapperGeneratorPackage.PARSER_RULE__BODY:
        return basicSetBody(null, msgs);
      case UniMapperGeneratorPackage.PARSER_RULE__CAUGHT:
        return basicSetCaught(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case UniMapperGeneratorPackage.PARSER_RULE__ARGS:
        return getArgs();
      case UniMapperGeneratorPackage.PARSER_RULE__RETURN:
        return getReturn();
      case UniMapperGeneratorPackage.PARSER_RULE__THROWS:
        return getThrows();
      case UniMapperGeneratorPackage.PARSER_RULE__LOCALS:
        return getLocals();
      case UniMapperGeneratorPackage.PARSER_RULE__PREQUELS:
        return getPrequels();
      case UniMapperGeneratorPackage.PARSER_RULE__BODY:
        return getBody();
      case UniMapperGeneratorPackage.PARSER_RULE__CAUGHT:
        return getCaught();
      case UniMapperGeneratorPackage.PARSER_RULE__SEMICOLON_SYMBOL:
        return getSemicolonSymbol();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case UniMapperGeneratorPackage.PARSER_RULE__ARGS:
        setArgs((String)newValue);
        return;
      case UniMapperGeneratorPackage.PARSER_RULE__RETURN:
        setReturn((Return)newValue);
        return;
      case UniMapperGeneratorPackage.PARSER_RULE__THROWS:
        setThrows((Exceptions)newValue);
        return;
      case UniMapperGeneratorPackage.PARSER_RULE__LOCALS:
        setLocals((LocalVars)newValue);
        return;
      case UniMapperGeneratorPackage.PARSER_RULE__PREQUELS:
        getPrequels().clear();
        getPrequels().addAll((Collection<? extends RulePrequel>)newValue);
        return;
      case UniMapperGeneratorPackage.PARSER_RULE__BODY:
        setBody((RuleAltList)newValue);
        return;
      case UniMapperGeneratorPackage.PARSER_RULE__CAUGHT:
        setCaught((ExceptionGroup)newValue);
        return;
      case UniMapperGeneratorPackage.PARSER_RULE__SEMICOLON_SYMBOL:
        setSemicolonSymbol((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case UniMapperGeneratorPackage.PARSER_RULE__ARGS:
        setArgs(ARGS_EDEFAULT);
        return;
      case UniMapperGeneratorPackage.PARSER_RULE__RETURN:
        setReturn((Return)null);
        return;
      case UniMapperGeneratorPackage.PARSER_RULE__THROWS:
        setThrows((Exceptions)null);
        return;
      case UniMapperGeneratorPackage.PARSER_RULE__LOCALS:
        setLocals((LocalVars)null);
        return;
      case UniMapperGeneratorPackage.PARSER_RULE__PREQUELS:
        getPrequels().clear();
        return;
      case UniMapperGeneratorPackage.PARSER_RULE__BODY:
        setBody((RuleAltList)null);
        return;
      case UniMapperGeneratorPackage.PARSER_RULE__CAUGHT:
        setCaught((ExceptionGroup)null);
        return;
      case UniMapperGeneratorPackage.PARSER_RULE__SEMICOLON_SYMBOL:
        setSemicolonSymbol(SEMICOLON_SYMBOL_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case UniMapperGeneratorPackage.PARSER_RULE__ARGS:
        return ARGS_EDEFAULT == null ? args != null : !ARGS_EDEFAULT.equals(args);
      case UniMapperGeneratorPackage.PARSER_RULE__RETURN:
        return return_ != null;
      case UniMapperGeneratorPackage.PARSER_RULE__THROWS:
        return throws_ != null;
      case UniMapperGeneratorPackage.PARSER_RULE__LOCALS:
        return locals != null;
      case UniMapperGeneratorPackage.PARSER_RULE__PREQUELS:
        return prequels != null && !prequels.isEmpty();
      case UniMapperGeneratorPackage.PARSER_RULE__BODY:
        return body != null;
      case UniMapperGeneratorPackage.PARSER_RULE__CAUGHT:
        return caught != null;
      case UniMapperGeneratorPackage.PARSER_RULE__SEMICOLON_SYMBOL:
        return SEMICOLON_SYMBOL_EDEFAULT == null ? semicolonSymbol != null : !SEMICOLON_SYMBOL_EDEFAULT.equals(semicolonSymbol);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (args: ");
    result.append(args);
    result.append(", semicolonSymbol: ");
    result.append(semicolonSymbol);
    result.append(')');
    return result.toString();
  }

} //ParserRuleImpl
