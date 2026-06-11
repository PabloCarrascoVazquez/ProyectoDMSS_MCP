/**
 */
package McpMM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Agente</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link McpMM.Agente#getNombre <em>Nombre</em>}</li>
 *   <li>{@link McpMM.Agente#getRol <em>Rol</em>}</li>
 *   <li>{@link McpMM.Agente#getFlujo <em>Flujo</em>}</li>
 *   <li>{@link McpMM.Agente#getContextos <em>Contextos</em>}</li>
 * </ul>
 *
 * @see McpMM.McpMMPackage#getAgente()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='R05_LimiteCargaTrabajo'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot R05_LimiteCargaTrabajo='self.flujo.tareas->select(t | t.oclIsKindOf(TareaEjecutable))->size() <= 10'"
 *        annotation="gmf.node label='nombre' figure='rectangle' color='255,200,200'"
 * @generated
 */
public interface Agente extends EObject {
	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see McpMM.McpMMPackage#getAgente_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link McpMM.Agente#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Rol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rol</em>' attribute.
	 * @see #setRol(String)
	 * @see McpMM.McpMMPackage#getAgente_Rol()
	 * @model
	 * @generated
	 */
	String getRol();

	/**
	 * Sets the value of the '{@link McpMM.Agente#getRol <em>Rol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rol</em>' attribute.
	 * @see #getRol()
	 * @generated
	 */
	void setRol(String value);

	/**
	 * Returns the value of the '<em><b>Flujo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flujo</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flujo</em>' containment reference.
	 * @see #setFlujo(Workflow)
	 * @see McpMM.McpMMPackage#getAgente_Flujo()
	 * @model containment="true" required="true"
	 *        annotation="gmf.compartment layout='free'"
	 * @generated
	 */
	Workflow getFlujo();

	/**
	 * Sets the value of the '{@link McpMM.Agente#getFlujo <em>Flujo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flujo</em>' containment reference.
	 * @see #getFlujo()
	 * @generated
	 */
	void setFlujo(Workflow value);

	/**
	 * Returns the value of the '<em><b>Contextos</b></em>' containment reference list.
	 * The list contents are of type {@link McpMM.Contexto}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contextos</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contextos</em>' containment reference list.
	 * @see McpMM.McpMMPackage#getAgente_Contextos()
	 * @model containment="true"
	 *        annotation="gmf.compartment layout='list'"
	 * @generated
	 */
	EList<Contexto> getContextos();

} // Agente
