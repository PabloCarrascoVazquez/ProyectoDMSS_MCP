/**
 */
package McpMM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workflow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link McpMM.Workflow#getNombreWorkflow <em>Nombre Workflow</em>}</li>
 *   <li>{@link McpMM.Workflow#getTareas <em>Tareas</em>}</li>
 * </ul>
 *
 * @see McpMM.McpMMPackage#getWorkflow()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='R01_UnaTareaInicio R02_UnaTareaFin'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot R01_UnaTareaInicio='self.tareas->select(t | t.oclIsTypeOf(Inicio))->size() = 1' R02_UnaTareaFin='self.tareas->select(t | t.oclIsTypeOf(Final))->size() = 1'"
 *        annotation="gmf.node label='nombreWorkflow' figure='rounded' color='200,255,200'"
 *        annotation="DSLDoc descripcion='Define el flujo de trabajo o comportamiento que sigue un agente mediante una secuencia de tareas.'"
 * @generated
 */
public interface Workflow extends EObject {
	/**
	 * Returns the value of the '<em><b>Nombre Workflow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Workflow</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Workflow</em>' attribute.
	 * @see #setNombreWorkflow(String)
	 * @see McpMM.McpMMPackage#getWorkflow_NombreWorkflow()
	 * @model
	 * @generated
	 */
	String getNombreWorkflow();

	/**
	 * Sets the value of the '{@link McpMM.Workflow#getNombreWorkflow <em>Nombre Workflow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Workflow</em>' attribute.
	 * @see #getNombreWorkflow()
	 * @generated
	 */
	void setNombreWorkflow(String value);

	/**
	 * Returns the value of the '<em><b>Tareas</b></em>' containment reference list.
	 * The list contents are of type {@link McpMM.Tarea}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tareas</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tareas</em>' containment reference list.
	 * @see McpMM.McpMMPackage#getWorkflow_Tareas()
	 * @model containment="true" required="true"
	 *        annotation="gmf.compartment layout='free'"
	 * @generated
	 */
	EList<Tarea> getTareas();

} // Workflow
