/**
 * generated by Xtext 2.15.0
 */
package net.unicoen.uniMapperGenerator;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Terminal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.unicoen.uniMapperGenerator.Terminal#getReference <em>Reference</em>}</li>
 *   <li>{@link net.unicoen.uniMapperGenerator.Terminal#getOptions <em>Options</em>}</li>
 *   <li>{@link net.unicoen.uniMapperGenerator.Terminal#getLiteral <em>Literal</em>}</li>
 *   <li>{@link net.unicoen.uniMapperGenerator.Terminal#getEof <em>Eof</em>}</li>
 * </ul>
 *
 * @see net.unicoen.uniMapperGenerator.UniMapperGeneratorPackage#getTerminal()
 * @model
 * @generated
 */
public interface Terminal extends EObject
{
  /**
   * Returns the value of the '<em><b>Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reference</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reference</em>' reference.
   * @see #setReference(TokenRef)
   * @see net.unicoen.uniMapperGenerator.UniMapperGeneratorPackage#getTerminal_Reference()
   * @model
   * @generated
   */
  TokenRef getReference();

  /**
   * Sets the value of the '{@link net.unicoen.uniMapperGenerator.Terminal#getReference <em>Reference</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reference</em>' reference.
   * @see #getReference()
   * @generated
   */
  void setReference(TokenRef value);

  /**
   * Returns the value of the '<em><b>Options</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Options</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Options</em>' containment reference.
   * @see #setOptions(ElementOptions)
   * @see net.unicoen.uniMapperGenerator.UniMapperGeneratorPackage#getTerminal_Options()
   * @model containment="true"
   * @generated
   */
  ElementOptions getOptions();

  /**
   * Sets the value of the '{@link net.unicoen.uniMapperGenerator.Terminal#getOptions <em>Options</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Options</em>' containment reference.
   * @see #getOptions()
   * @generated
   */
  void setOptions(ElementOptions value);

  /**
   * Returns the value of the '<em><b>Literal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Literal</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Literal</em>' attribute.
   * @see #setLiteral(String)
   * @see net.unicoen.uniMapperGenerator.UniMapperGeneratorPackage#getTerminal_Literal()
   * @model
   * @generated
   */
  String getLiteral();

  /**
   * Sets the value of the '{@link net.unicoen.uniMapperGenerator.Terminal#getLiteral <em>Literal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Literal</em>' attribute.
   * @see #getLiteral()
   * @generated
   */
  void setLiteral(String value);

  /**
   * Returns the value of the '<em><b>Eof</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Eof</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Eof</em>' attribute.
   * @see #setEof(String)
   * @see net.unicoen.uniMapperGenerator.UniMapperGeneratorPackage#getTerminal_Eof()
   * @model
   * @generated
   */
  String getEof();

  /**
   * Sets the value of the '{@link net.unicoen.uniMapperGenerator.Terminal#getEof <em>Eof</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Eof</em>' attribute.
   * @see #getEof()
   * @generated
   */
  void setEof(String value);

} // Terminal
