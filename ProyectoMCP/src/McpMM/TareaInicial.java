/**
 */
package McpMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tarea Inicial</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link McpMM.TareaInicial#getEmpieza <em>Empieza</em>}</li>
 * </ul>
 *
 * @see McpMM.McpMMPackage#getTareaInicial()
 * @model annotation="gmf.node label='nombreTarea' figure='ellipse' color='0,255,0' size='30,30'"
 * @generated
 */
public interface TareaInicial extends Tarea {
	/**
	 * Returns the value of the '<em><b>Empieza</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link McpMM.Workflow#getEmpiezaCon <em>Empieza Con</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Empieza</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Empieza</em>' reference.
	 * @see #setEmpieza(Workflow)
	 * @see McpMM.McpMMPackage#getTareaInicial_Empieza()
	 * @see McpMM.Workflow#getEmpiezaCon
	 * @model opposite="empiezaCon" required="true"
	 * @generated
	 */
	Workflow getEmpieza();

	/**
	 * Sets the value of the '{@link McpMM.TareaInicial#getEmpieza <em>Empieza</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Empieza</em>' reference.
	 * @see #getEmpieza()
	 * @generated
	 */
	void setEmpieza(Workflow value);

} // TareaInicial
