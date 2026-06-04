/**
 */
package McpMM.impl;

import McpMM.Accion;
import McpMM.McpMMPackage;
import McpMM.Propiedad;
import McpMM.TipoContexto;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
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
 *   <li>{@link McpMM.impl.PropiedadImpl#getEsUsada <em>Es Usada</em>}</li>
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
	 * The cached value of the '{@link #getEsUsada() <em>Es Usada</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEsUsada()
	 * @generated
	 * @ordered
	 */
	protected EList<Accion> esUsada;

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
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case McpMMPackage.PROPIEDAD__ES_USADA:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEsUsada()).basicAdd(otherEnd, msgs);
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
			case McpMMPackage.PROPIEDAD__ES_USADA:
				return getEsUsada();
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
			case McpMMPackage.PROPIEDAD__ES_USADA:
				getEsUsada().clear();
				getEsUsada().addAll((Collection<? extends Accion>)newValue);
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
			case McpMMPackage.PROPIEDAD__ES_USADA:
				getEsUsada().clear();
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
			case McpMMPackage.PROPIEDAD__ES_USADA:
				return esUsada != null && !esUsada.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //PropiedadImpl
