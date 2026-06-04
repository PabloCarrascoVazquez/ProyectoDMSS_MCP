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
 *   <li>{@link McpMM.Workflow#getContexto <em>Contexto</em>}</li>
 *   <li>{@link McpMM.Workflow#getTarea <em>Tarea</em>}</li>
 *   <li>{@link McpMM.Workflow#getEmpiezaCon <em>Empieza Con</em>}</li>
 *   <li>{@link McpMM.Workflow#getFinalizaCon <em>Finaliza Con</em>}</li>
 * </ul>
 *
 * @see McpMM.McpMMPackage#getWorkflow()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='R01_UnaTareaInicio R02_AlMenosUnaTareaFin'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot R01_UnaTareaInicio='self.tarea->select(t | t.oclIsTypeOf(TareaInicial))->size() = 1' R02_AlMenosUnaTareaFin='self.tarea->select(t | t.oclIsTypeOf(TareaFinal))->size() >= 1'"
 *        annotation="gmf.node label='nombreWorkflow' figure='rounded' color='200,255,200'"
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
	 * Returns the value of the '<em><b>Contexto</b></em>' containment reference list.
	 * The list contents are of type {@link McpMM.Contexto}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contexto</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contexto</em>' containment reference list.
	 * @see McpMM.McpMMPackage#getWorkflow_Contexto()
	 * @model containment="true"
	 *        annotation="gmf.compartment layout='list'"
	 * @generated
	 */
	EList<Contexto> getContexto();

	/**
	 * Returns the value of the '<em><b>Tarea</b></em>' containment reference list.
	 * The list contents are of type {@link McpMM.Tarea}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tarea</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tarea</em>' containment reference list.
	 * @see McpMM.McpMMPackage#getWorkflow_Tarea()
	 * @model containment="true"
	 *        annotation="gmf.compartment layout='free'"
	 * @generated
	 */
	EList<Tarea> getTarea();

	/**
	 * Returns the value of the '<em><b>Empieza Con</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link McpMM.TareaInicial#getEmpieza <em>Empieza</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Empieza Con</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Empieza Con</em>' reference.
	 * @see #setEmpiezaCon(TareaInicial)
	 * @see McpMM.McpMMPackage#getWorkflow_EmpiezaCon()
	 * @see McpMM.TareaInicial#getEmpieza
	 * @model opposite="empieza" required="true"
	 *        annotation="gmf.link target.decoration='arrow' color='0,200,0' label='empieza'"
	 * @generated
	 */
	TareaInicial getEmpiezaCon();

	/**
	 * Sets the value of the '{@link McpMM.Workflow#getEmpiezaCon <em>Empieza Con</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Empieza Con</em>' reference.
	 * @see #getEmpiezaCon()
	 * @generated
	 */
	void setEmpiezaCon(TareaInicial value);

	/**
	 * Returns the value of the '<em><b>Finaliza Con</b></em>' reference list.
	 * The list contents are of type {@link McpMM.TareaFinal}.
	 * It is bidirectional and its opposite is '{@link McpMM.TareaFinal#getFinaliza <em>Finaliza</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Finaliza Con</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Finaliza Con</em>' reference list.
	 * @see McpMM.McpMMPackage#getWorkflow_FinalizaCon()
	 * @see McpMM.TareaFinal#getFinaliza
	 * @model opposite="finaliza" required="true"
	 *        annotation="gmf.link target.decoration='arrow' color='200,0,0' label='finaliza'"
	 * @generated
	 */
	EList<TareaFinal> getFinalizaCon();

} // Workflow
