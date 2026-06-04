/**
 */
package McpMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tarea Server MCP</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link McpMM.TareaServerMCP#getEjecutaOperacion <em>Ejecuta Operacion</em>}</li>
 *   <li>{@link McpMM.TareaServerMCP#getPrompt <em>Prompt</em>}</li>
 * </ul>
 *
 * @see McpMM.McpMMPackage#getTareaServerMCP()
 * @model annotation="gmf.node label='nombreTarea' figure='rectangle' color='200,200,200'"
 * @generated
 */
public interface TareaServerMCP extends TareaEjecutable {
	/**
	 * Returns the value of the '<em><b>Ejecuta Operacion</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link McpMM.OperacionMCP#getEsEjecutadaOperacion <em>Es Ejecutada Operacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ejecuta Operacion</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ejecuta Operacion</em>' reference.
	 * @see #setEjecutaOperacion(OperacionMCP)
	 * @see McpMM.McpMMPackage#getTareaServerMCP_EjecutaOperacion()
	 * @see McpMM.OperacionMCP#getEsEjecutadaOperacion
	 * @model opposite="esEjecutadaOperacion" required="true"
	 *        annotation="gmf.link target.decoration='arrow' style='dash' label='ejecuta oper.'"
	 * @generated
	 */
	OperacionMCP getEjecutaOperacion();

	/**
	 * Sets the value of the '{@link McpMM.TareaServerMCP#getEjecutaOperacion <em>Ejecuta Operacion</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ejecuta Operacion</em>' reference.
	 * @see #getEjecutaOperacion()
	 * @generated
	 */
	void setEjecutaOperacion(OperacionMCP value);

	/**
	 * Returns the value of the '<em><b>Prompt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prompt</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prompt</em>' attribute.
	 * @see #setPrompt(String)
	 * @see McpMM.McpMMPackage#getTareaServerMCP_Prompt()
	 * @model
	 * @generated
	 */
	String getPrompt();

	/**
	 * Sets the value of the '{@link McpMM.TareaServerMCP#getPrompt <em>Prompt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prompt</em>' attribute.
	 * @see #getPrompt()
	 * @generated
	 */
	void setPrompt(String value);

} // TareaServerMCP
