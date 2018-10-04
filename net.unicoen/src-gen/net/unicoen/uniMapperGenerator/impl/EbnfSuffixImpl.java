/**
 * generated by Xtext 2.15.0
 */
package net.unicoen.uniMapperGenerator.impl;

import net.unicoen.uniMapperGenerator.EbnfSuffix;
import net.unicoen.uniMapperGenerator.UniMapperGeneratorPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ebnf Suffix</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.unicoen.uniMapperGenerator.impl.EbnfSuffixImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link net.unicoen.uniMapperGenerator.impl.EbnfSuffixImpl#getNongreedy <em>Nongreedy</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EbnfSuffixImpl extends MinimalEObjectImpl.Container implements EbnfSuffix
{
  /**
   * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperator()
   * @generated
   * @ordered
   */
  protected static final String OPERATOR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperator()
   * @generated
   * @ordered
   */
  protected String operator = OPERATOR_EDEFAULT;

  /**
   * The default value of the '{@link #getNongreedy() <em>Nongreedy</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNongreedy()
   * @generated
   * @ordered
   */
  protected static final String NONGREEDY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNongreedy() <em>Nongreedy</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNongreedy()
   * @generated
   * @ordered
   */
  protected String nongreedy = NONGREEDY_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EbnfSuffixImpl()
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
    return UniMapperGeneratorPackage.Literals.EBNF_SUFFIX;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOperator()
  {
    return operator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOperator(String newOperator)
  {
    String oldOperator = operator;
    operator = newOperator;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UniMapperGeneratorPackage.EBNF_SUFFIX__OPERATOR, oldOperator, operator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNongreedy()
  {
    return nongreedy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNongreedy(String newNongreedy)
  {
    String oldNongreedy = nongreedy;
    nongreedy = newNongreedy;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UniMapperGeneratorPackage.EBNF_SUFFIX__NONGREEDY, oldNongreedy, nongreedy));
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
      case UniMapperGeneratorPackage.EBNF_SUFFIX__OPERATOR:
        return getOperator();
      case UniMapperGeneratorPackage.EBNF_SUFFIX__NONGREEDY:
        return getNongreedy();
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
      case UniMapperGeneratorPackage.EBNF_SUFFIX__OPERATOR:
        setOperator((String)newValue);
        return;
      case UniMapperGeneratorPackage.EBNF_SUFFIX__NONGREEDY:
        setNongreedy((String)newValue);
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
      case UniMapperGeneratorPackage.EBNF_SUFFIX__OPERATOR:
        setOperator(OPERATOR_EDEFAULT);
        return;
      case UniMapperGeneratorPackage.EBNF_SUFFIX__NONGREEDY:
        setNongreedy(NONGREEDY_EDEFAULT);
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
      case UniMapperGeneratorPackage.EBNF_SUFFIX__OPERATOR:
        return OPERATOR_EDEFAULT == null ? operator != null : !OPERATOR_EDEFAULT.equals(operator);
      case UniMapperGeneratorPackage.EBNF_SUFFIX__NONGREEDY:
        return NONGREEDY_EDEFAULT == null ? nongreedy != null : !NONGREEDY_EDEFAULT.equals(nongreedy);
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
    result.append(" (operator: ");
    result.append(operator);
    result.append(", nongreedy: ");
    result.append(nongreedy);
    result.append(')');
    return result.toString();
  }

} //EbnfSuffixImpl
