/**
 * generated by Xtext 2.13.0
 */
package net.unicoen.uniMapperGenerator.impl;

import java.util.Collection;

import net.unicoen.uniMapperGenerator.Exceptions;
import net.unicoen.uniMapperGenerator.QualifiedId;
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
 * An implementation of the model object '<em><b>Exceptions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.unicoen.uniMapperGenerator.impl.ExceptionsImpl#getExceptions <em>Exceptions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExceptionsImpl extends MinimalEObjectImpl.Container implements Exceptions
{
  /**
   * The cached value of the '{@link #getExceptions() <em>Exceptions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExceptions()
   * @generated
   * @ordered
   */
  protected EList<QualifiedId> exceptions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExceptionsImpl()
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
    return UniMapperGeneratorPackage.Literals.EXCEPTIONS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<QualifiedId> getExceptions()
  {
    if (exceptions == null)
    {
      exceptions = new EObjectContainmentEList<QualifiedId>(QualifiedId.class, this, UniMapperGeneratorPackage.EXCEPTIONS__EXCEPTIONS);
    }
    return exceptions;
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
      case UniMapperGeneratorPackage.EXCEPTIONS__EXCEPTIONS:
        return ((InternalEList<?>)getExceptions()).basicRemove(otherEnd, msgs);
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
      case UniMapperGeneratorPackage.EXCEPTIONS__EXCEPTIONS:
        return getExceptions();
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
      case UniMapperGeneratorPackage.EXCEPTIONS__EXCEPTIONS:
        getExceptions().clear();
        getExceptions().addAll((Collection<? extends QualifiedId>)newValue);
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
      case UniMapperGeneratorPackage.EXCEPTIONS__EXCEPTIONS:
        getExceptions().clear();
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
      case UniMapperGeneratorPackage.EXCEPTIONS__EXCEPTIONS:
        return exceptions != null && !exceptions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ExceptionsImpl
