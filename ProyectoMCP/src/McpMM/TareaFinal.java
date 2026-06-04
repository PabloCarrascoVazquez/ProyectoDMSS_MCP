/**
 */
package McpMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tarea Final</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link McpMM.TareaFinal#getFinaliza <em>Finaliza</em>}</li>
 * </ul>
 *
 * @see McpMM.McpMMPackage#getTareaFinal()
 * @model annotation="gmf.node label='nombreTarea' figure='ellipse' color='255,0,0' size='30,30'"
 * @generated
 */
public interface TareaFinal extends Tarea {
	/**
	 * Returns the value of the '<em><b>Finaliza</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link McpMM.Workflow#getFinalizaCon <em>Finaliza Con</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Finaliza</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Finaliza</em>' reference.
	 * @see #setFinaliza(Workflow)
	 * @see McpMM.McpMMPackage#getTareaFinal_Finaliza()
	 * @see McpMM.Workflow#getFinalizaCon
	 * @model opposite="finalizaCon" required="true"
	 * @generated
	 */
	Workflow getFinaliza();

	/**
	 * Sets the value of the '{@link McpMM.TareaFinal#getFinaliza <em>Finaliza</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Finaliza</em>' reference.
	 * @see #getFinaliza()
	 * @generated
	 */
	void setFinaliza(Workflow value);

} // TareaFinal
