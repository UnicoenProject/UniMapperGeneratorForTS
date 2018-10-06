/**
 * generated by Xtext 2.15.0
 */
package net.unicoen.uniMapperGenerator;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>V3 Token</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.unicoen.uniMapperGenerator.V3Token#getName <em>Name</em>}</li>
 *   <li>{@link net.unicoen.uniMapperGenerator.V3Token#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see net.unicoen.uniMapperGenerator.UniMapperGeneratorPackage#getV3Token()
 * @model
 * @generated
 */
public interface V3Token extends TokenRef, LexerCommandArg
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see net.unicoen.uniMapperGenerator.UniMapperGeneratorPackage#getV3Token_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link net.unicoen.uniMapperGenerator.V3Token#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see net.unicoen.uniMapperGenerator.UniMapperGeneratorPackage#getV3Token_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link net.unicoen.uniMapperGenerator.V3Token#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

} // V3Token
