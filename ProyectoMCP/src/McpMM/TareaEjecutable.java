/**
 */
package McpMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tarea Ejecutable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link McpMM.TareaEjecutable#getIdTarea <em>Id Tarea</em>}</li>
 *   <li>{@link McpMM.TareaEjecutable#getDescTarea <em>Desc Tarea</em>}</li>
 * </ul>
 *
 * @see McpMM.McpMMPackage#getTareaEjecutable()
 * @model abstract="true"
 * @generated
 */
public interface TareaEjecutable extends Tarea {
	/**
	 * Returns the value of the '<em><b>Id Tarea</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Tarea</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Tarea</em>' attribute.
	 * @see #setIdTarea(int)
	 * @see McpMM.McpMMPackage#getTareaEjecutable_IdTarea()
	 * @model required="true"
	 * @generated
	 */
	int getIdTarea();

	/**
	 * Sets the value of the '{@link McpMM.TareaEjecutable#getIdTarea <em>Id Tarea</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Tarea</em>' attribute.
	 * @see #getIdTarea()
	 * @generated
	 */
	void setIdTarea(int value);

	/**
	 * Returns the value of the '<em><b>Desc Tarea</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Desc Tarea</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Desc Tarea</em>' attribute.
	 * @see #setDescTarea(String)
	 * @see McpMM.McpMMPackage#getTareaEjecutable_DescTarea()
	 * @model
	 * @generated
	 */
	String getDescTarea();

	/**
	 * Sets the value of the '{@link McpMM.TareaEjecutable#getDescTarea <em>Desc Tarea</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Desc Tarea</em>' attribute.
	 * @see #getDescTarea()
	 * @generated
	 */
	void setDescTarea(String value);

} // TareaEjecutable
