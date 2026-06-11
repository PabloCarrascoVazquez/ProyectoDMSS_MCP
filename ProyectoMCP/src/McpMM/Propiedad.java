/**
 */
package McpMM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Propiedad</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link McpMM.Propiedad#getNombrePropiedad <em>Nombre Propiedad</em>}</li>
 *   <li>{@link McpMM.Propiedad#getTipoPropiedad <em>Tipo Propiedad</em>}</li>
 *   <li>{@link McpMM.Propiedad#getExtensionPermitida <em>Extension Permitida</em>}</li>
 *   <li>{@link McpMM.Propiedad#getPesoMaxMB <em>Peso Max MB</em>}</li>
 *   <li>{@link McpMM.Propiedad#getEsUsada <em>Es Usada</em>}</li>
 *   <li>{@link McpMM.Propiedad#getVersiones <em>Versiones</em>}</li>
 * </ul>
 *
 * @see McpMM.McpMMPackage#getPropiedad()
 * @model annotation="gmf.node label='nombrePropiedad'"
 * @generated
 */
public interface Propiedad extends EObject {
	/**
	 * Returns the value of the '<em><b>Nombre Propiedad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Propiedad</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Propiedad</em>' attribute.
	 * @see #setNombrePropiedad(String)
	 * @see McpMM.McpMMPackage#getPropiedad_NombrePropiedad()
	 * @model
	 * @generated
	 */
	String getNombrePropiedad();

	/**
	 * Sets the value of the '{@link McpMM.Propiedad#getNombrePropiedad <em>Nombre Propiedad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Propiedad</em>' attribute.
	 * @see #getNombrePropiedad()
	 * @generated
	 */
	void setNombrePropiedad(String value);

	/**
	 * Returns the value of the '<em><b>Tipo Propiedad</b></em>' attribute.
	 * The literals are from the enumeration {@link McpMM.TipoContexto}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tipo Propiedad</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo Propiedad</em>' attribute.
	 * @see McpMM.TipoContexto
	 * @see #setTipoPropiedad(TipoContexto)
	 * @see McpMM.McpMMPackage#getPropiedad_TipoPropiedad()
	 * @model
	 * @generated
	 */
	TipoContexto getTipoPropiedad();

	/**
	 * Sets the value of the '{@link McpMM.Propiedad#getTipoPropiedad <em>Tipo Propiedad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo Propiedad</em>' attribute.
	 * @see McpMM.TipoContexto
	 * @see #getTipoPropiedad()
	 * @generated
	 */
	void setTipoPropiedad(TipoContexto value);

	/**
	 * Returns the value of the '<em><b>Extension Permitida</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extension Permitida</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension Permitida</em>' attribute.
	 * @see #setExtensionPermitida(String)
	 * @see McpMM.McpMMPackage#getPropiedad_ExtensionPermitida()
	 * @model
	 * @generated
	 */
	String getExtensionPermitida();

	/**
	 * Sets the value of the '{@link McpMM.Propiedad#getExtensionPermitida <em>Extension Permitida</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extension Permitida</em>' attribute.
	 * @see #getExtensionPermitida()
	 * @generated
	 */
	void setExtensionPermitida(String value);

	/**
	 * Returns the value of the '<em><b>Peso Max MB</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Peso Max MB</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Peso Max MB</em>' attribute.
	 * @see #setPesoMaxMB(int)
	 * @see McpMM.McpMMPackage#getPropiedad_PesoMaxMB()
	 * @model
	 * @generated
	 */
	int getPesoMaxMB();

	/**
	 * Sets the value of the '{@link McpMM.Propiedad#getPesoMaxMB <em>Peso Max MB</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Peso Max MB</em>' attribute.
	 * @see #getPesoMaxMB()
	 * @generated
	 */
	void setPesoMaxMB(int value);

	/**
	 * Returns the value of the '<em><b>Es Usada</b></em>' reference list.
	 * The list contents are of type {@link McpMM.Accion}.
	 * It is bidirectional and its opposite is '{@link McpMM.Accion#getUsa <em>Usa</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Es Usada</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Es Usada</em>' reference list.
	 * @see McpMM.McpMMPackage#getPropiedad_EsUsada()
	 * @see McpMM.Accion#getUsa
	 * @model opposite="usa"
	 * @generated
	 */
	EList<Accion> getEsUsada();

	/**
	 * Returns the value of the '<em><b>Versiones</b></em>' containment reference list.
	 * The list contents are of type {@link McpMM.VersionContexto}.
	 * It is bidirectional and its opposite is '{@link McpMM.VersionContexto#getPropiedadAsociada <em>Propiedad Asociada</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Versiones</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Versiones</em>' containment reference list.
	 * @see McpMM.McpMMPackage#getPropiedad_Versiones()
	 * @see McpMM.VersionContexto#getPropiedadAsociada
	 * @model opposite="propiedadAsociada" containment="true"
	 * @generated
	 */
	EList<VersionContexto> getVersiones();

} // Propiedad
