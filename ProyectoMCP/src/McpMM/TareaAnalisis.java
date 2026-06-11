/**
 */
package McpMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tarea Analisis</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link McpMM.TareaAnalisis#getSigueElse <em>Sigue Else</em>}</li>
 *   <li>{@link McpMM.TareaAnalisis#getPrompt <em>Prompt</em>}</li>
 * </ul>
 *
 * @see McpMM.McpMMPackage#getTareaAnalisis()
 * @model annotation="gmf.node label='nombreTarea' figure='rectangle' color='255,255,150'"
 *        annotation="DSLDoc descripcion='Tarea de bifurcaci\363n condicional que eval\372a un estado para decidir continuar por el flujo principal o por un flujo alternativo (Else).'"
 * @generated
 */
public interface TareaAnalisis extends TareaEjecutable {
	/**
	 * Returns the value of the '<em><b>Sigue Else</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link McpMM.Tarea#getPrecedeElse <em>Precede Else</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sigue Else</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sigue Else</em>' reference.
	 * @see #setSigueElse(Tarea)
	 * @see McpMM.McpMMPackage#getTareaAnalisis_SigueElse()
	 * @see McpMM.Tarea#getPrecedeElse
	 * @model opposite="precedeElse" required="true"
	 *        annotation="gmf.link target.decoration='arrow' label='sigue Else'"
	 * @generated
	 */
	Tarea getSigueElse();

	/**
	 * Sets the value of the '{@link McpMM.TareaAnalisis#getSigueElse <em>Sigue Else</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sigue Else</em>' reference.
	 * @see #getSigueElse()
	 * @generated
	 */
	void setSigueElse(Tarea value);

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
	 * @see McpMM.McpMMPackage#getTareaAnalisis_Prompt()
	 * @model
	 * @generated
	 */
	String getPrompt();

	/**
	 * Sets the value of the '{@link McpMM.TareaAnalisis#getPrompt <em>Prompt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prompt</em>' attribute.
	 * @see #getPrompt()
	 * @generated
	 */
	void setPrompt(String value);

} // TareaAnalisis
