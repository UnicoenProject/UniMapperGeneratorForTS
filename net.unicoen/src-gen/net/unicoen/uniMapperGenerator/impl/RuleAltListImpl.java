/**
 * generated by Xtext 2.13.0
 */
package net.unicoen.uniMapperGenerator.impl;

import java.util.Collection;

import net.unicoen.uniMapperGenerator.LabeledAlt;
import net.unicoen.uniMapperGenerator.RuleAltList;
import net.unicoen.uniMapperGenerator.UniMapperGeneratorPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule Alt List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.unicoen.uniMapperGenerator.impl.RuleAltListImpl#getAlternatives <em>Alternatives</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RuleAltListImpl extends MinimalEObjectImpl.Container implements RuleAltList
{
  /**
   * The cached value of the '{@link #getAlternatives() <em>Alternatives</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlternatives()
   * @generated
   * @ordered
   */
  protected EList<LabeledAlt> alternatives;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RuleAltListImpl()
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
    return UniMapperGeneratorPackage.Literals.RULE_ALT_LIST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<LabeledAlt> getAlternatives()
  {
    if (alternatives == null)
    {
      alternatives = new EObjectContainmentEList<LabeledAlt>(LabeledAlt.class, this, UniMapperGeneratorPackage.RULE_ALT_LIST__ALTERNATIVES);
    }
    return alternatives;
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
      case UniMapperGeneratorPackage.RULE_ALT_LIST__ALTERNATIVES:
        return ((InternalEList<?>)getAlternatives()).basicRemove(otherEnd, msgs);
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
      case UniMapperGeneratorPackage.RULE_ALT_LIST__ALTERNATIVES:
        return getAlternatives();
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
      case UniMapperGeneratorPackage.RULE_ALT_LIST__ALTERNATIVES:
        getAlternatives().clear();
        getAlternatives().addAll((Collection<? extends LabeledAlt>)newValue);
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
      case UniMapperGeneratorPackage.RULE_ALT_LIST__ALTERNATIVES:
        getAlternatives().clear();
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
      case UniMapperGeneratorPackage.RULE_ALT_LIST__ALTERNATIVES:
        return alternatives != null && !alternatives.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //RuleAltListImpl
