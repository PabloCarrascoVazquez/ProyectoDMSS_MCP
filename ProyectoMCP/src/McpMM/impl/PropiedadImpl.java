/**
 */
package McpMM.impl;

import McpMM.Accion;
import McpMM.McpMMPackage;
import McpMM.Propiedad;
import McpMM.TipoContexto;
import McpMM.VersionContexto;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Propiedad</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link McpMM.impl.PropiedadImpl#getNombrePropiedad <em>Nombre Propiedad</em>}</li>
 *   <li>{@link McpMM.impl.PropiedadImpl#getTipoPropiedad <em>Tipo Propiedad</em>}</li>
 *   <li>{@link McpMM.impl.PropiedadImpl#getExtensionPermitida <em>Extension Permitida</em>}</li>
 *   <li>{@link McpMM.impl.PropiedadImpl#getPesoMaxMB <em>Peso Max MB</em>}</li>
 *   <li>{@link McpMM.impl.PropiedadImpl#getEsUsada <em>Es Usada</em>}</li>
 *   <li>{@link McpMM.impl.PropiedadImpl#getVersiones <em>Versiones</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropiedadImpl extends EObjectImpl implements Propiedad {
	/**
	 * The default value of the '{@link #getNombrePropiedad() <em>Nombre Propiedad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombrePropiedad()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_PROPIEDAD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombrePropiedad() <em>Nombre Propiedad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombrePropiedad()
	 * @generated
	 * @ordered
	 */
	protected String nombrePropiedad = NOMBRE_PROPIEDAD_EDEFAULT;

	/**
	 * The default value of the '{@link #getTipoPropiedad() <em>Tipo Propiedad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipoPropiedad()
	 * @generated
	 * @ordered
	 */
	protected static final TipoContexto TIPO_PROPIEDAD_EDEFAULT = TipoContexto.ENTERO;

	/**
	 * The cached value of the '{@link #getTipoPropiedad() <em>Tipo Propiedad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipoPropiedad()
	 * @generated
	 * @ordered
	 */
	protected TipoContexto tipoPropiedad = TIPO_PROPIEDAD_EDEFAULT;

	/**
	 * The default value of the '{@link #getExtensionPermitida() <em>Extension Permitida</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensionPermitida()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTENSION_PERMITIDA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExtensionPermitida() <em>Extension Permitida</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensionPermitida()
	 * @generated
	 * @ordered
	 */
	protected String extensionPermitida = EXTENSION_PERMITIDA_EDEFAULT;

	/**
	 * The default value of the '{@link #getPesoMaxMB() <em>Peso Max MB</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPesoMaxMB()
	 * @generated
	 * @ordered
	 */
	protected static final int PESO_MAX_MB_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPesoMaxMB() <em>Peso Max MB</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPesoMaxMB()
	 * @generated
	 * @ordered
	 */
	protected int pesoMaxMB = PESO_MAX_MB_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEsUsada() <em>Es Usada</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEsUsada()
	 * @generated
	 * @ordered
	 */
	protected EList<Accion> esUsada;

	/**
	 * The cached value of the '{@link #getVersiones() <em>Versiones</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersiones()
	 * @generated
	 * @ordered
	 */
	protected EList<VersionContexto> versiones;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropiedadImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return McpMMPackage.Literals.PROPIEDAD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNombrePropiedad() {
		return nombrePropiedad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombrePropiedad(String newNombrePropiedad) {
		String oldNombrePropiedad = nombrePropiedad;
		nombrePropiedad = newNombrePropiedad;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, McpMMPackage.PROPIEDAD__NOMBRE_PROPIEDAD, oldNombrePropiedad, nombrePropiedad));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoContexto getTipoPropiedad() {
		return tipoPropiedad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTipoPropiedad(TipoContexto newTipoPropiedad) {
		TipoContexto oldTipoPropiedad = tipoPropiedad;
		tipoPropiedad = newTipoPropiedad == null ? TIPO_PROPIEDAD_EDEFAULT : newTipoPropiedad;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, McpMMPackage.PROPIEDAD__TIPO_PROPIEDAD, oldTipoPropiedad, tipoPropiedad));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExtensionPermitida() {
		return extensionPermitida;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtensionPermitida(String newExtensionPermitida) {
		String oldExtensionPermitida = extensionPermitida;
		extensionPermitida = newExtensionPermitida;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, McpMMPackage.PROPIEDAD__EXTENSION_PERMITIDA, oldExtensionPermitida, extensionPermitida));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPesoMaxMB() {
		return pesoMaxMB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPesoMaxMB(int newPesoMaxMB) {
		int oldPesoMaxMB = pesoMaxMB;
		pesoMaxMB = newPesoMaxMB;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, McpMMPackage.PROPIEDAD__PESO_MAX_MB, oldPesoMaxMB, pesoMaxMB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Accion> getEsUsada() {
		if (esUsada == null) {
			esUsada = new EObjectWithInverseResolvingEList<Accion>(Accion.class, this, McpMMPackage.PROPIEDAD__ES_USADA, McpMMPackage.ACCION__USA);
		}
		return esUsada;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VersionContexto> getVersiones() {
		if (versiones == null) {
			versiones = new EObjectContainmentWithInverseEList<VersionContexto>(VersionContexto.class, this, McpMMPackage.PROPIEDAD__VERSIONES, McpMMPackage.VERSION_CONTEXTO__PROPIEDAD_ASOCIADA);
		}
		return versiones;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case McpMMPackage.PROPIEDAD__ES_USADA:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEsUsada()).basicAdd(otherEnd, msgs);
			case McpMMPackage.PROPIEDAD__VERSIONES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVersiones()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case McpMMPackage.PROPIEDAD__ES_USADA:
				return ((InternalEList<?>)getEsUsada()).basicRemove(otherEnd, msgs);
			case McpMMPackage.PROPIEDAD__VERSIONES:
				return ((InternalEList<?>)getVersiones()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case McpMMPackage.PROPIEDAD__NOMBRE_PROPIEDAD:
				return getNombrePropiedad();
			case McpMMPackage.PROPIEDAD__TIPO_PROPIEDAD:
				return getTipoPropiedad();
			case McpMMPackage.PROPIEDAD__EXTENSION_PERMITIDA:
				return getExtensionPermitida();
			case McpMMPackage.PROPIEDAD__PESO_MAX_MB:
				return getPesoMaxMB();
			case McpMMPackage.PROPIEDAD__ES_USADA:
				return getEsUsada();
			case McpMMPackage.PROPIEDAD__VERSIONES:
				return getVersiones();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case McpMMPackage.PROPIEDAD__NOMBRE_PROPIEDAD:
				setNombrePropiedad((String)newValue);
				return;
			case McpMMPackage.PROPIEDAD__TIPO_PROPIEDAD:
				setTipoPropiedad((TipoContexto)newValue);
				return;
			case McpMMPackage.PROPIEDAD__EXTENSION_PERMITIDA:
				setExtensionPermitida((String)newValue);
				return;
			case McpMMPackage.PROPIEDAD__PESO_MAX_MB:
				setPesoMaxMB((Integer)newValue);
				return;
			case McpMMPackage.PROPIEDAD__ES_USADA:
				getEsUsada().clear();
				getEsUsada().addAll((Collection<? extends Accion>)newValue);
				return;
			case McpMMPackage.PROPIEDAD__VERSIONES:
				getVersiones().clear();
				getVersiones().addAll((Collection<? extends VersionContexto>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case McpMMPackage.PROPIEDAD__NOMBRE_PROPIEDAD:
				setNombrePropiedad(NOMBRE_PROPIEDAD_EDEFAULT);
				return;
			case McpMMPackage.PROPIEDAD__TIPO_PROPIEDAD:
				setTipoPropiedad(TIPO_PROPIEDAD_EDEFAULT);
				return;
			case McpMMPackage.PROPIEDAD__EXTENSION_PERMITIDA:
				setExtensionPermitida(EXTENSION_PERMITIDA_EDEFAULT);
				return;
			case McpMMPackage.PROPIEDAD__PESO_MAX_MB:
				setPesoMaxMB(PESO_MAX_MB_EDEFAULT);
				return;
			case McpMMPackage.PROPIEDAD__ES_USADA:
				getEsUsada().clear();
				return;
			case McpMMPackage.PROPIEDAD__VERSIONES:
				getVersiones().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case McpMMPackage.PROPIEDAD__NOMBRE_PROPIEDAD:
				return NOMBRE_PROPIEDAD_EDEFAULT == null ? nombrePropiedad != null : !NOMBRE_PROPIEDAD_EDEFAULT.equals(nombrePropiedad);
			case McpMMPackage.PROPIEDAD__TIPO_PROPIEDAD:
				return tipoPropiedad != TIPO_PROPIEDAD_EDEFAULT;
			case McpMMPackage.PROPIEDAD__EXTENSION_PERMITIDA:
				return EXTENSION_PERMITIDA_EDEFAULT == null ? extensionPermitida != null : !EXTENSION_PERMITIDA_EDEFAULT.equals(extensionPermitida);
			case McpMMPackage.PROPIEDAD__PESO_MAX_MB:
				return pesoMaxMB != PESO_MAX_MB_EDEFAULT;
			case McpMMPackage.PROPIEDAD__ES_USADA:
				return esUsada != null && !esUsada.isEmpty();
			case McpMMPackage.PROPIEDAD__VERSIONES:
				return versiones != null && !versiones.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (nombrePropiedad: ");
		result.append(nombrePropiedad);
		result.append(", tipoPropiedad: ");
		result.append(tipoPropiedad);
		result.append(", extensionPermitida: ");
		result.append(extensionPermitida);
		result.append(", pesoMaxMB: ");
		result.append(pesoMaxMB);
		result.append(')');
		return result.toString();
	}

} //PropiedadImpl
