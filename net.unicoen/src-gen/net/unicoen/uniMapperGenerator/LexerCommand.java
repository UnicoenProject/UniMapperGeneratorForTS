/**
 * generated by Xtext 2.15.0
 */
package net.unicoen.uniMapperGenerator;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lexer Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.unicoen.uniMapperGenerator.LexerCommand#getName <em>Name</em>}</li>
 *   <li>{@link net.unicoen.uniMapperGenerator.LexerCommand#getArgs <em>Args</em>}</li>
 * </ul>
 *
 * @see net.unicoen.uniMapperGenerator.UniMapperGeneratorPackage#getLexerCommand()
 * @model
 * @generated
 */
public interface LexerCommand extends EObject
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
   * @see net.unicoen.uniMapperGenerator.UniMapperGeneratorPackage#getLexerCommand_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link net.unicoen.uniMapperGenerator.LexerCommand#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Args</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Args</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Args</em>' containment reference.
   * @see #setArgs(LexerCommandExpr)
   * @see net.unicoen.uniMapperGenerator.UniMapperGeneratorPackage#getLexerCommand_Args()
   * @model containment="true"
   * @generated
   */
  LexerCommandExpr getArgs();

  /**
   * Sets the value of the '{@link net.unicoen.uniMapperGenerator.LexerCommand#getArgs <em>Args</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Args</em>' containment reference.
   * @see #getArgs()
   * @generated
   */
  void setArgs(LexerCommandExpr value);

} // LexerCommand
