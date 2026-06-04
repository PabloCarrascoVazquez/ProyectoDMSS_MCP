/**
 */
package McpMM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service MCP</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link McpMM.ServiceMCP#getNombreServicio <em>Nombre Servicio</em>}</li>
 *   <li>{@link McpMM.ServiceMCP#getServermcp <em>Servermcp</em>}</li>
 *   <li>{@link McpMM.ServiceMCP#getAgente <em>Agente</em>}</li>
 *   <li>{@link McpMM.ServiceMCP#getWorkflow <em>Workflow</em>}</li>
 * </ul>
 *
 * @see McpMM.McpMMPackage#getServiceMCP()
 * @model
 * @generated
 */
public interface ServiceMCP extends EObject {
	/**
	 * Returns the value of the '<em><b>Nombre Servicio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Servicio</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Servicio</em>' attribute.
	 * @see #setNombreServicio(String)
	 * @see McpMM.McpMMPackage#getServiceMCP_NombreServicio()
	 * @model
	 * @generated
	 */
	String getNombreServicio();

	/**
	 * Sets the value of the '{@link McpMM.ServiceMCP#getNombreServicio <em>Nombre Servicio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Servicio</em>' attribute.
	 * @see #getNombreServicio()
	 * @generated
	 */
	void setNombreServicio(String value);

	/**
	 * Returns the value of the '<em><b>Servermcp</b></em>' containment reference list.
	 * The list contents are of type {@link McpMM.ServerMCP}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Servermcp</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Servermcp</em>' containment reference list.
	 * @see McpMM.McpMMPackage#getServiceMCP_Servermcp()
	 * @model containment="true"
	 * @generated
	 */
	EList<ServerMCP> getServermcp();

	/**
	 * Returns the value of the '<em><b>Agente</b></em>' containment reference list.
	 * The list contents are of type {@link McpMM.Agente}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Agente</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agente</em>' containment reference list.
	 * @see McpMM.McpMMPackage#getServiceMCP_Agente()
	 * @model containment="true"
	 * @generated
	 */
	EList<Agente> getAgente();

	/**
	 * Returns the value of the '<em><b>Workflow</b></em>' containment reference list.
	 * The list contents are of type {@link McpMM.Workflow}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Workflow</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workflow</em>' containment reference list.
	 * @see McpMM.McpMMPackage#getServiceMCP_Workflow()
	 * @model containment="true"
	 * @generated
	 */
	EList<Workflow> getWorkflow();

} // ServiceMCP
