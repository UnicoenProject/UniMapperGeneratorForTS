/**
 * generated by Xtext 2.15.0
 */
package net.unicoen.uniMapperGenerator.impl;

import net.unicoen.uniMapperGenerator.UniMapperGeneratorPackage;
import net.unicoen.uniMapperGenerator.UnicoenTypeDec;
import net.unicoen.uniMapperGenerator.UnicoenTypeIdentifiers;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unicoen Type Dec</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.unicoen.uniMapperGenerator.impl.UnicoenTypeDecImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnicoenTypeDecImpl extends MinimalEObjectImpl.Container implements UnicoenTypeDec
{
  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected UnicoenTypeIdentifiers type;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UnicoenTypeDecImpl()
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
    return UniMapperGeneratorPackage.Literals.UNICOEN_TYPE_DEC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnicoenTypeIdentifiers getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(UnicoenTypeIdentifiers newType, NotificationChain msgs)
  {
    UnicoenTypeIdentifiers oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UniMapperGeneratorPackage.UNICOEN_TYPE_DEC__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(UnicoenTypeIdentifiers newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UniMapperGeneratorPackage.UNICOEN_TYPE_DEC__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UniMapperGeneratorPackage.UNICOEN_TYPE_DEC__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UniMapperGeneratorPackage.UNICOEN_TYPE_DEC__TYPE, newType, newType));
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
      case UniMapperGeneratorPackage.UNICOEN_TYPE_DEC__TYPE:
        return basicSetType(null, msgs);
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
      case UniMapperGeneratorPackage.UNICOEN_TYPE_DEC__TYPE:
        return getType();
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
      case UniMapperGeneratorPackage.UNICOEN_TYPE_DEC__TYPE:
        setType((UnicoenTypeIdentifiers)newValue);
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
      case UniMapperGeneratorPackage.UNICOEN_TYPE_DEC__TYPE:
        setType((UnicoenTypeIdentifiers)null);
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
      case UniMapperGeneratorPackage.UNICOEN_TYPE_DEC__TYPE:
        return type != null;
    }
    return super.eIsSet(featureID);
  }

} //UnicoenTypeDecImpl
