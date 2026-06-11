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
 *   <li>{@link McpMM.ServiceMCP#getAgentes <em>Agentes</em>}</li>
 *   <li>{@link McpMM.ServiceMCP#getServicios <em>Servicios</em>}</li>
 *   <li>{@link McpMM.ServiceMCP#getServidores <em>Servidores</em>}</li>
 * </ul>
 *
 * @see McpMM.McpMMPackage#getServiceMCP()
 * @model annotation="DSLDoc descripcion='Clase ra\355z que act\372a como contenedor principal de todo el modelo de agentes y servicios.'"
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
	 * Returns the value of the '<em><b>Agentes</b></em>' containment reference list.
	 * The list contents are of type {@link McpMM.Agente}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Agentes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agentes</em>' containment reference list.
	 * @see McpMM.McpMMPackage#getServiceMCP_Agentes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Agente> getAgentes();

	/**
	 * Returns the value of the '<em><b>Servicios</b></em>' containment reference list.
	 * The list contents are of type {@link McpMM.ServiceMCP}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Servicios</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Servicios</em>' containment reference list.
	 * @see McpMM.McpMMPackage#getServiceMCP_Servicios()
	 * @model containment="true"
	 * @generated
	 */
	EList<ServiceMCP> getServicios();

	/**
	 * Returns the value of the '<em><b>Servidores</b></em>' containment reference list.
	 * The list contents are of type {@link McpMM.ServerMCP}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Servidores</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Servidores</em>' containment reference list.
	 * @see McpMM.McpMMPackage#getServiceMCP_Servidores()
	 * @model containment="true"
	 * @generated
	 */
	EList<ServerMCP> getServidores();

} // ServiceMCP
