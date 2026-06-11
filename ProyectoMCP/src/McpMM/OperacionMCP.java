/**
 */
package McpMM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operacion MCP</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link McpMM.OperacionMCP#getNombreOperacion <em>Nombre Operacion</em>}</li>
 *   <li>{@link McpMM.OperacionMCP#getDescOperacion <em>Desc Operacion</em>}</li>
 *   <li>{@link McpMM.OperacionMCP#getEsEjecutadaOperacion <em>Es Ejecutada Operacion</em>}</li>
 * </ul>
 *
 * @see McpMM.McpMMPackage#getOperacionMCP()
 * @model annotation="gmf.node label='nombreOperacion'"
 *        annotation="DSLDoc descripcion='Define una operaci\363n espec\355fica disponible en un ServerMCP que puede ser invocada de manera remota.'"
 * @generated
 */
public interface OperacionMCP extends EObject {
	/**
	 * Returns the value of the '<em><b>Nombre Operacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Operacion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Operacion</em>' attribute.
	 * @see #setNombreOperacion(String)
	 * @see McpMM.McpMMPackage#getOperacionMCP_NombreOperacion()
	 * @model
	 * @generated
	 */
	String getNombreOperacion();

	/**
	 * Sets the value of the '{@link McpMM.OperacionMCP#getNombreOperacion <em>Nombre Operacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Operacion</em>' attribute.
	 * @see #getNombreOperacion()
	 * @generated
	 */
	void setNombreOperacion(String value);

	/**
	 * Returns the value of the '<em><b>Desc Operacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Desc Operacion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Desc Operacion</em>' attribute.
	 * @see #setDescOperacion(String)
	 * @see McpMM.McpMMPackage#getOperacionMCP_DescOperacion()
	 * @model
	 * @generated
	 */
	String getDescOperacion();

	/**
	 * Sets the value of the '{@link McpMM.OperacionMCP#getDescOperacion <em>Desc Operacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Desc Operacion</em>' attribute.
	 * @see #getDescOperacion()
	 * @generated
	 */
	void setDescOperacion(String value);

	/**
	 * Returns the value of the '<em><b>Es Ejecutada Operacion</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link McpMM.TareaServerMCP#getEjecutaOperacion <em>Ejecuta Operacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Es Ejecutada Operacion</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Es Ejecutada Operacion</em>' reference.
	 * @see #setEsEjecutadaOperacion(TareaServerMCP)
	 * @see McpMM.McpMMPackage#getOperacionMCP_EsEjecutadaOperacion()
	 * @see McpMM.TareaServerMCP#getEjecutaOperacion
	 * @model opposite="ejecutaOperacion"
	 * @generated
	 */
	TareaServerMCP getEsEjecutadaOperacion();

	/**
	 * Sets the value of the '{@link McpMM.OperacionMCP#getEsEjecutadaOperacion <em>Es Ejecutada Operacion</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Es Ejecutada Operacion</em>' reference.
	 * @see #getEsEjecutadaOperacion()
	 * @generated
	 */
	void setEsEjecutadaOperacion(TareaServerMCP value);

} // OperacionMCP
