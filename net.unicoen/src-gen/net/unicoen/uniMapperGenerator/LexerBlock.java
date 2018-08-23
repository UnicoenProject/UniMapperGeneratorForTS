/**
 * generated by Xtext 2.13.0
 */
package net.unicoen.uniMapperGenerator;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lexer Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.unicoen.uniMapperGenerator.LexerBlock#getOptions <em>Options</em>}</li>
 *   <li>{@link net.unicoen.uniMapperGenerator.LexerBlock#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see net.unicoen.uniMapperGenerator.UniMapperGeneratorPackage#getLexerBlock()
 * @model
 * @generated
 */
public interface LexerBlock extends EObject
{
  /**
   * Returns the value of the '<em><b>Options</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Options</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Options</em>' containment reference.
   * @see #setOptions(Options)
   * @see net.unicoen.uniMapperGenerator.UniMapperGeneratorPackage#getLexerBlock_Options()
   * @model containment="true"
   * @generated
   */
  Options getOptions();

  /**
   * Sets the value of the '{@link net.unicoen.uniMapperGenerator.LexerBlock#getOptions <em>Options</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Options</em>' containment reference.
   * @see #getOptions()
   * @generated
   */
  void setOptions(Options value);

  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Body</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference.
   * @see #setBody(LexerAltList)
   * @see net.unicoen.uniMapperGenerator.UniMapperGeneratorPackage#getLexerBlock_Body()
   * @model containment="true"
   * @generated
   */
  LexerAltList getBody();

  /**
   * Sets the value of the '{@link net.unicoen.uniMapperGenerator.LexerBlock#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(LexerAltList value);

} // LexerBlock