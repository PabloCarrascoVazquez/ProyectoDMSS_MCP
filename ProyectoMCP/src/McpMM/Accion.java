/**
 */
package McpMM;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Accion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link McpMM.Accion#getNombreAccion <em>Nombre Accion</em>}</li>
 *   <li>{@link McpMM.Accion#getApunta <em>Apunta</em>}</li>
 *   <li>{@link McpMM.Accion#getUsa <em>Usa</em>}</li>
 * </ul>
 *
 * @see McpMM.McpMMPackage#getAccion()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='R12_CoherenciaContexto'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot R12_CoherenciaContexto='self.usa->forAll(p | self.apunta.propiedades->includes(p))'"
 *        annotation="DSLDoc descripcion='Clase abstracta que modela las interacciones (lectura/escritura) que una tarea realiza sobre un contexto de datos.'"
 * @generated
 */
public interface Accion extends EObject {
	/**
	 * Returns the value of the '<em><b>Nombre Accion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Accion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Accion</em>' attribute.
	 * @see #setNombreAccion(String)
	 * @see McpMM.McpMMPackage#getAccion_NombreAccion()
	 * @model
	 * @generated
	 */
	String getNombreAccion();

	/**
	 * Sets the value of the '{@link McpMM.Accion#getNombreAccion <em>Nombre Accion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Accion</em>' attribute.
	 * @see #getNombreAccion()
	 * @generated
	 */
	void setNombreAccion(String value);

	/**
	 * Returns the value of the '<em><b>Apunta</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link McpMM.Contexto#getEsApuntadoPor <em>Es Apuntado Por</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Apunta</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Apunta</em>' reference.
	 * @see #setApunta(Contexto)
	 * @see McpMM.McpMMPackage#getAccion_Apunta()
	 * @see McpMM.Contexto#getEsApuntadoPor
	 * @model opposite="esApuntadoPor" required="true"
	 * @generated
	 */
	Contexto getApunta();

	/**
	 * Sets the value of the '{@link McpMM.Accion#getApunta <em>Apunta</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Apunta</em>' reference.
	 * @see #getApunta()
	 * @generated
	 */
	void setApunta(Contexto value);

	/**
	 * Returns the value of the '<em><b>Usa</b></em>' reference list.
	 * The list contents are of type {@link McpMM.Propiedad}.
	 * It is bidirectional and its opposite is '{@link McpMM.Propiedad#getEsUsada <em>Es Usada</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usa</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usa</em>' reference list.
	 * @see McpMM.McpMMPackage#getAccion_Usa()
	 * @see McpMM.Propiedad#getEsUsada
	 * @model opposite="esUsada"
	 * @generated
	 */
	EList<Propiedad> getUsa();

} // Accion
