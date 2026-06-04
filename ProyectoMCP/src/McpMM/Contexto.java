/**
 */
package McpMM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contexto</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link McpMM.Contexto#getNombreContexto <em>Nombre Contexto</em>}</li>
 *   <li>{@link McpMM.Contexto#getPropiedad <em>Propiedad</em>}</li>
 *   <li>{@link McpMM.Contexto#getEsApuntadoPor <em>Es Apuntado Por</em>}</li>
 * </ul>
 *
 * @see McpMM.McpMMPackage#getContexto()
 * @model annotation="gmf.node label='nombreContexto' figure='rectangle' color='255,255,200'"
 * @generated
 */
public interface Contexto extends EObject {
	/**
	 * Returns the value of the '<em><b>Nombre Contexto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Contexto</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Contexto</em>' attribute.
	 * @see #setNombreContexto(String)
	 * @see McpMM.McpMMPackage#getContexto_NombreContexto()
	 * @model
	 * @generated
	 */
	String getNombreContexto();

	/**
	 * Sets the value of the '{@link McpMM.Contexto#getNombreContexto <em>Nombre Contexto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Contexto</em>' attribute.
	 * @see #getNombreContexto()
	 * @generated
	 */
	void setNombreContexto(String value);

	/**
	 * Returns the value of the '<em><b>Propiedad</b></em>' containment reference list.
	 * The list contents are of type {@link McpMM.Propiedad}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Propiedad</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Propiedad</em>' containment reference list.
	 * @see McpMM.McpMMPackage#getContexto_Propiedad()
	 * @model containment="true"
	 *        annotation="gmf.compartment layout='list'"
	 * @generated
	 */
	EList<Propiedad> getPropiedad();

	/**
	 * Returns the value of the '<em><b>Es Apuntado Por</b></em>' reference list.
	 * The list contents are of type {@link McpMM.Accion}.
	 * It is bidirectional and its opposite is '{@link McpMM.Accion#getApunta <em>Apunta</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Es Apuntado Por</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Es Apuntado Por</em>' reference list.
	 * @see McpMM.McpMMPackage#getContexto_EsApuntadoPor()
	 * @see McpMM.Accion#getApunta
	 * @model opposite="apunta"
	 * @generated
	 */
	EList<Accion> getEsApuntadoPor();

} // Contexto
