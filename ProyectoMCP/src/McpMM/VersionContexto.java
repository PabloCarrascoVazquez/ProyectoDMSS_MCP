/**
 */
package McpMM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Version Contexto</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link McpMM.VersionContexto#getValorAnterior <em>Valor Anterior</em>}</li>
 *   <li>{@link McpMM.VersionContexto#getFechaModificacion <em>Fecha Modificacion</em>}</li>
 *   <li>{@link McpMM.VersionContexto#getPropiedadAsociada <em>Propiedad Asociada</em>}</li>
 * </ul>
 *
 * @see McpMM.McpMMPackage#getVersionContexto()
 * @model
 * @generated
 */
public interface VersionContexto extends EObject {
	/**
	 * Returns the value of the '<em><b>Valor Anterior</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valor Anterior</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valor Anterior</em>' attribute.
	 * @see #setValorAnterior(String)
	 * @see McpMM.McpMMPackage#getVersionContexto_ValorAnterior()
	 * @model
	 * @generated
	 */
	String getValorAnterior();

	/**
	 * Sets the value of the '{@link McpMM.VersionContexto#getValorAnterior <em>Valor Anterior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valor Anterior</em>' attribute.
	 * @see #getValorAnterior()
	 * @generated
	 */
	void setValorAnterior(String value);

	/**
	 * Returns the value of the '<em><b>Fecha Modificacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fecha Modificacion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fecha Modificacion</em>' attribute.
	 * @see #setFechaModificacion(String)
	 * @see McpMM.McpMMPackage#getVersionContexto_FechaModificacion()
	 * @model
	 * @generated
	 */
	String getFechaModificacion();

	/**
	 * Sets the value of the '{@link McpMM.VersionContexto#getFechaModificacion <em>Fecha Modificacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fecha Modificacion</em>' attribute.
	 * @see #getFechaModificacion()
	 * @generated
	 */
	void setFechaModificacion(String value);

	/**
	 * Returns the value of the '<em><b>Propiedad Asociada</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link McpMM.Propiedad#getVersiones <em>Versiones</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Propiedad Asociada</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Propiedad Asociada</em>' container reference.
	 * @see #setPropiedadAsociada(Propiedad)
	 * @see McpMM.McpMMPackage#getVersionContexto_PropiedadAsociada()
	 * @see McpMM.Propiedad#getVersiones
	 * @model opposite="versiones" transient="false"
	 * @generated
	 */
	Propiedad getPropiedadAsociada();

	/**
	 * Sets the value of the '{@link McpMM.VersionContexto#getPropiedadAsociada <em>Propiedad Asociada</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Propiedad Asociada</em>' container reference.
	 * @see #getPropiedadAsociada()
	 * @generated
	 */
	void setPropiedadAsociada(Propiedad value);

} // VersionContexto
