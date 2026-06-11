/**
 */
package McpMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tarea Transformacion Datos</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link McpMM.TareaTransformacionDatos#getPrompt <em>Prompt</em>}</li>
 * </ul>
 *
 * @see McpMM.McpMMPackage#getTareaTransformacionDatos()
 * @model annotation="gmf.node label='nombreTarea' figure='rectangle' color='200,255,255'"
 *        annotation="DSLDoc descripcion='Tarea encargada de transformar o reformatear un conjunto de datos en base a una regla o prompt.'"
 * @generated
 */
public interface TareaTransformacionDatos extends TareaEjecutable {
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
	 * @see McpMM.McpMMPackage#getTareaTransformacionDatos_Prompt()
	 * @model
	 * @generated
	 */
	String getPrompt();

	/**
	 * Sets the value of the '{@link McpMM.TareaTransformacionDatos#getPrompt <em>Prompt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prompt</em>' attribute.
	 * @see #getPrompt()
	 * @generated
	 */
	void setPrompt(String value);

} // TareaTransformacionDatos
