/**
 */
package McpMM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tarea</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link McpMM.Tarea#getNombreTarea <em>Nombre Tarea</em>}</li>
 *   <li>{@link McpMM.Tarea#getTaskId <em>Task Id</em>}</li>
 *   <li>{@link McpMM.Tarea#getTaskDesc <em>Task Desc</em>}</li>
 *   <li>{@link McpMM.Tarea#getAccion <em>Accion</em>}</li>
 *   <li>{@link McpMM.Tarea#getPrecede <em>Precede</em>}</li>
 *   <li>{@link McpMM.Tarea#getSigue <em>Sigue</em>}</li>
 *   <li>{@link McpMM.Tarea#getPrecedeElse <em>Precede Else</em>}</li>
 * </ul>
 *
 * @see McpMM.McpMMPackage#getTarea()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='R10_NoBuclePropio'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot R10_NoBuclePropio='self.sigue <> self'"
 *        annotation="DSLDoc descripcion='Clase base abstracta para todos los pasos ejecutables y puntos de control dentro de un workflow.'"
 * @generated
 */
public interface Tarea extends EObject {
	/**
	 * Returns the value of the '<em><b>Nombre Tarea</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Tarea</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Tarea</em>' attribute.
	 * @see #setNombreTarea(String)
	 * @see McpMM.McpMMPackage#getTarea_NombreTarea()
	 * @model
	 * @generated
	 */
	String getNombreTarea();

	/**
	 * Sets the value of the '{@link McpMM.Tarea#getNombreTarea <em>Nombre Tarea</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Tarea</em>' attribute.
	 * @see #getNombreTarea()
	 * @generated
	 */
	void setNombreTarea(String value);

	/**
	 * Returns the value of the '<em><b>Task Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task Id</em>' attribute.
	 * @see #setTaskId(int)
	 * @see McpMM.McpMMPackage#getTarea_TaskId()
	 * @model
	 * @generated
	 */
	int getTaskId();

	/**
	 * Sets the value of the '{@link McpMM.Tarea#getTaskId <em>Task Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task Id</em>' attribute.
	 * @see #getTaskId()
	 * @generated
	 */
	void setTaskId(int value);

	/**
	 * Returns the value of the '<em><b>Task Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task Desc</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task Desc</em>' attribute.
	 * @see #setTaskDesc(String)
	 * @see McpMM.McpMMPackage#getTarea_TaskDesc()
	 * @model
	 * @generated
	 */
	String getTaskDesc();

	/**
	 * Sets the value of the '{@link McpMM.Tarea#getTaskDesc <em>Task Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task Desc</em>' attribute.
	 * @see #getTaskDesc()
	 * @generated
	 */
	void setTaskDesc(String value);

	/**
	 * Returns the value of the '<em><b>Accion</b></em>' containment reference list.
	 * The list contents are of type {@link McpMM.Accion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accion</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accion</em>' containment reference list.
	 * @see McpMM.McpMMPackage#getTarea_Accion()
	 * @model containment="true"
	 *        annotation="gmf.compartment layout='list'"
	 * @generated
	 */
	EList<Accion> getAccion();

	/**
	 * Returns the value of the '<em><b>Precede</b></em>' reference list.
	 * The list contents are of type {@link McpMM.Tarea}.
	 * It is bidirectional and its opposite is '{@link McpMM.Tarea#getSigue <em>Sigue</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precede</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precede</em>' reference list.
	 * @see McpMM.McpMMPackage#getTarea_Precede()
	 * @see McpMM.Tarea#getSigue
	 * @model opposite="sigue"
	 * @generated
	 */
	EList<Tarea> getPrecede();

	/**
	 * Returns the value of the '<em><b>Sigue</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link McpMM.Tarea#getPrecede <em>Precede</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sigue</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sigue</em>' reference.
	 * @see #setSigue(Tarea)
	 * @see McpMM.McpMMPackage#getTarea_Sigue()
	 * @see McpMM.Tarea#getPrecede
	 * @model opposite="precede"
	 *        annotation="gmf.link target.decoration='arrow' color='0,0,0' label='sigue'"
	 * @generated
	 */
	Tarea getSigue();

	/**
	 * Sets the value of the '{@link McpMM.Tarea#getSigue <em>Sigue</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sigue</em>' reference.
	 * @see #getSigue()
	 * @generated
	 */
	void setSigue(Tarea value);

	/**
	 * Returns the value of the '<em><b>Precede Else</b></em>' reference list.
	 * The list contents are of type {@link McpMM.TareaAnalisis}.
	 * It is bidirectional and its opposite is '{@link McpMM.TareaAnalisis#getSigueElse <em>Sigue Else</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precede Else</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precede Else</em>' reference list.
	 * @see McpMM.McpMMPackage#getTarea_PrecedeElse()
	 * @see McpMM.TareaAnalisis#getSigueElse
	 * @model opposite="sigueElse"
	 * @generated
	 */
	EList<TareaAnalisis> getPrecedeElse();

} // Tarea
