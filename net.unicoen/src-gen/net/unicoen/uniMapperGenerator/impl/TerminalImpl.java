/**
 * generated by Xtext 2.13.0
 */
package net.unicoen.uniMapperGenerator.impl;

import net.unicoen.uniMapperGenerator.ElementOptions;
import net.unicoen.uniMapperGenerator.Terminal;
import net.unicoen.uniMapperGenerator.TokenRef;
import net.unicoen.uniMapperGenerator.UniMapperGeneratorPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Terminal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.unicoen.uniMapperGenerator.impl.TerminalImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link net.unicoen.uniMapperGenerator.impl.TerminalImpl#getOptions <em>Options</em>}</li>
 *   <li>{@link net.unicoen.uniMapperGenerator.impl.TerminalImpl#getLiteral <em>Literal</em>}</li>
 *   <li>{@link net.unicoen.uniMapperGenerator.impl.TerminalImpl#getEof <em>Eof</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TerminalImpl extends MinimalEObjectImpl.Container implements Terminal
{
  /**
   * The cached value of the '{@link #getReference() <em>Reference</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReference()
   * @generated
   * @ordered
   */
  protected TokenRef reference;

  /**
   * The cached value of the '{@link #getOptions() <em>Options</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOptions()
   * @generated
   * @ordered
   */
  protected ElementOptions options;

  /**
   * The default value of the '{@link #getLiteral() <em>Literal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLiteral()
   * @generated
   * @ordered
   */
  protected static final String LITERAL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLiteral() <em>Literal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLiteral()
   * @generated
   * @ordered
   */
  protected String literal = LITERAL_EDEFAULT;

  /**
   * The default value of the '{@link #getEof() <em>Eof</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEof()
   * @generated
   * @ordered
   */
  protected static final String EOF_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEof() <em>Eof</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEof()
   * @generated
   * @ordered
   */
  protected String eof = EOF_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TerminalImpl()
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
    return UniMapperGeneratorPackage.Literals.TERMINAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TokenRef getReference()
  {
    if (reference != null && reference.eIsProxy())
    {
      InternalEObject oldReference = (InternalEObject)reference;
      reference = (TokenRef)eResolveProxy(oldReference);
      if (reference != oldReference)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, UniMapperGeneratorPackage.TERMINAL__REFERENCE, oldReference, reference));
      }
    }
    return reference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TokenRef basicGetReference()
  {
    return reference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReference(TokenRef newReference)
  {
    TokenRef oldReference = reference;
    reference = newReference;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UniMapperGeneratorPackage.TERMINAL__REFERENCE, oldReference, reference));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElementOptions getOptions()
  {
    return options;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOptions(ElementOptions newOptions, NotificationChain msgs)
  {
    ElementOptions oldOptions = options;
    options = newOptions;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UniMapperGeneratorPackage.TERMINAL__OPTIONS, oldOptions, newOptions);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOptions(ElementOptions newOptions)
  {
    if (newOptions != options)
    {
      NotificationChain msgs = null;
      if (options != null)
        msgs = ((InternalEObject)options).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UniMapperGeneratorPackage.TERMINAL__OPTIONS, null, msgs);
      if (newOptions != null)
        msgs = ((InternalEObject)newOptions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UniMapperGeneratorPackage.TERMINAL__OPTIONS, null, msgs);
      msgs = basicSetOptions(newOptions, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UniMapperGeneratorPackage.TERMINAL__OPTIONS, newOptions, newOptions));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLiteral(String newLiteral)
  {
    String oldLiteral = literal;
    literal = newLiteral;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UniMapperGeneratorPackage.TERMINAL__LITERAL, oldLiteral, literal));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getEof()
  {
    return eof;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEof(String newEof)
  {
    String oldEof = eof;
    eof = newEof;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UniMapperGeneratorPackage.TERMINAL__EOF, oldEof, eof));
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
      case UniMapperGeneratorPackage.TERMINAL__OPTIONS:
        return basicSetOptions(null, msgs);
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
      case UniMapperGeneratorPackage.TERMINAL__REFERENCE:
        if (resolve) return getReference();
        return basicGetReference();
      case UniMapperGeneratorPackage.TERMINAL__OPTIONS:
        return getOptions();
      case UniMapperGeneratorPackage.TERMINAL__LITERAL:
        return getLiteral();
      case UniMapperGeneratorPackage.TERMINAL__EOF:
        return getEof();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case UniMapperGeneratorPackage.TERMINAL__REFERENCE:
        setReference((TokenRef)newValue);
        return;
      case UniMapperGeneratorPackage.TERMINAL__OPTIONS:
        setOptions((ElementOptions)newValue);
        return;
      case UniMapperGeneratorPackage.TERMINAL__LITERAL:
        setLiteral((String)newValue);
        return;
      case UniMapperGeneratorPackage.TERMINAL__EOF:
        setEof((String)newValue);
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
      case UniMapperGeneratorPackage.TERMINAL__REFERENCE:
        setReference((TokenRef)null);
        return;
      case UniMapperGeneratorPackage.TERMINAL__OPTIONS:
        setOptions((ElementOptions)null);
        return;
      case UniMapperGeneratorPackage.TERMINAL__LITERAL:
        setLiteral(LITERAL_EDEFAULT);
        return;
      case UniMapperGeneratorPackage.TERMINAL__EOF:
        setEof(EOF_EDEFAULT);
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
      case UniMapperGeneratorPackage.TERMINAL__REFERENCE:
        return reference != null;
      case UniMapperGeneratorPackage.TERMINAL__OPTIONS:
        return options != null;
      case UniMapperGeneratorPackage.TERMINAL__LITERAL:
        return LITERAL_EDEFAULT == null ? literal != null : !LITERAL_EDEFAULT.equals(literal);
      case UniMapperGeneratorPackage.TERMINAL__EOF:
        return EOF_EDEFAULT == null ? eof != null : !EOF_EDEFAULT.equals(eof);
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

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (literal: ");
    result.append(literal);
    result.append(", eof: ");
    result.append(eof);
    result.append(')');
    return result.toString();
  }

} //TerminalImpl
