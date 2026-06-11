/**
 */
package McpMM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Server MCP</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link McpMM.ServerMCP#getNombreServer <em>Nombre Server</em>}</li>
 *   <li>{@link McpMM.ServerMCP#getOperaciones <em>Operaciones</em>}</li>
 * </ul>
 *
 * @see McpMM.McpMMPackage#getServerMCP()
 * @model annotation="gmf.node label='nombreServer' figure='rectangle' color='200,200,255'"
 *        annotation="DSLDoc descripcion='Representa un servidor o infraestructura externa que expone operaciones MCP a las que los agentes pueden conectarse.'"
 * @generated
 */
public interface ServerMCP extends EObject {
	/**
	 * Returns the value of the '<em><b>Nombre Server</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Server</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Server</em>' attribute.
	 * @see #setNombreServer(String)
	 * @see McpMM.McpMMPackage#getServerMCP_NombreServer()
	 * @model
	 * @generated
	 */
	String getNombreServer();

	/**
	 * Sets the value of the '{@link McpMM.ServerMCP#getNombreServer <em>Nombre Server</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Server</em>' attribute.
	 * @see #getNombreServer()
	 * @generated
	 */
	void setNombreServer(String value);

	/**
	 * Returns the value of the '<em><b>Operaciones</b></em>' containment reference list.
	 * The list contents are of type {@link McpMM.OperacionMCP}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operaciones</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operaciones</em>' containment reference list.
	 * @see McpMM.McpMMPackage#getServerMCP_Operaciones()
	 * @model containment="true"
	 *        annotation="gmf.compartment layout='list'"
	 * @generated
	 */
	EList<OperacionMCP> getOperaciones();

} // ServerMCP
