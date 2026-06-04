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
 *   <li>{@link McpMM.Agente#getNombreAgente <em>Nombre Agente</em>}</li>
 *   <li>{@link McpMM.Agente#getNumTareas <em>Num Tareas</em>}</li>
 *   <li>{@link McpMM.Agente#getRealiza <em>Realiza</em>}</li>
 * </ul>
 *
 * @see McpMM.McpMMPackage#getAgente()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='R05_AlMenosUnaTarea'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot R05_AlMenosUnaTarea='not (self.realiza->select(t | not t.oclIsTypeOf(TareaInicial) and not t.oclIsTypeOf(TareaFinal))->isEmpty())'"
 *        annotation="gmf.node label='nombreAgente' figure='rectangle' color='255,200,200'"
 * @generated
 */
public interface Agente extends EObject {
	/**
	 * Returns the value of the '<em><b>Nombre Agente</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Agente</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Agente</em>' attribute.
	 * @see #setNombreAgente(String)
	 * @see McpMM.McpMMPackage#getAgente_NombreAgente()
	 * @model
	 * @generated
	 */
	String getNombreAgente();

	/**
	 * Sets the value of the '{@link McpMM.Agente#getNombreAgente <em>Nombre Agente</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Agente</em>' attribute.
	 * @see #getNombreAgente()
	 * @generated
	 */
	void setNombreAgente(String value);

	/**
	 * Returns the value of the '<em><b>Num Tareas</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num Tareas</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Tareas</em>' attribute.
	 * @see #setNumTareas(int)
	 * @see McpMM.McpMMPackage#getAgente_NumTareas()
	 * @model required="true" transient="true" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='realiza->size()'"
	 * @generated
	 */
	int getNumTareas();

	/**
	 * Sets the value of the '{@link McpMM.Agente#getNumTareas <em>Num Tareas</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Tareas</em>' attribute.
	 * @see #getNumTareas()
	 * @generated
	 */
	void setNumTareas(int value);

	/**
	 * Returns the value of the '<em><b>Realiza</b></em>' reference list.
	 * The list contents are of type {@link McpMM.Tarea}.
	 * It is bidirectional and its opposite is '{@link McpMM.Tarea#getAgenteAsignado <em>Agente Asignado</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realiza</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realiza</em>' reference list.
	 * @see McpMM.McpMMPackage#getAgente_Realiza()
	 * @see McpMM.Tarea#getAgenteAsignado
	 * @model opposite="agenteAsignado" required="true"
	 *        annotation="gmf.link target.decoration='arrow' style='dash' label='realiza'"
	 * @generated
	 */
	EList<Tarea> getRealiza();

} // Agente
