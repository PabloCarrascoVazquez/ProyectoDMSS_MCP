/**
 */
package McpMM.impl;

import McpMM.Accion;
import McpMM.Contexto;
import McpMM.McpMMPackage;
import McpMM.Propiedad;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contexto</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link McpMM.impl.ContextoImpl#getNombreContexto <em>Nombre Contexto</em>}</li>
 *   <li>{@link McpMM.impl.ContextoImpl#getPropiedades <em>Propiedades</em>}</li>
 *   <li>{@link McpMM.impl.ContextoImpl#getEsApuntadoPor <em>Es Apuntado Por</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContextoImpl extends EObjectImpl implements Contexto {
	/**
	 * The default value of the '{@link #getNombreContexto() <em>Nombre Contexto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreContexto()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_CONTEXTO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombreContexto() <em>Nombre Contexto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreContexto()
	 * @generated
	 * @ordered
	 */
	protected String nombreContexto = NOMBRE_CONTEXTO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPropiedades() <em>Propiedades</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropiedades()
	 * @generated
	 * @ordered
	 */
	protected EList<Propiedad> propiedades;

	/**
	 * The cached value of the '{@link #getEsApuntadoPor() <em>Es Apuntado Por</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEsApuntadoPor()
	 * @generated
	 * @ordered
	 */
	protected EList<Accion> esApuntadoPor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContextoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return McpMMPackage.Literals.CONTEXTO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNombreContexto() {
		return nombreContexto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreContexto(String newNombreContexto) {
		String oldNombreContexto = nombreContexto;
		nombreContexto = newNombreContexto;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, McpMMPackage.CONTEXTO__NOMBRE_CONTEXTO, oldNombreContexto, nombreContexto));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Propiedad> getPropiedades() {
		if (propiedades == null) {
			propiedades = new EObjectContainmentEList<Propiedad>(Propiedad.class, this, McpMMPackage.CONTEXTO__PROPIEDADES);
		}
		return propiedades;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Accion> getEsApuntadoPor() {
		if (esApuntadoPor == null) {
			esApuntadoPor = new EObjectWithInverseResolvingEList<Accion>(Accion.class, this, McpMMPackage.CONTEXTO__ES_APUNTADO_POR, McpMMPackage.ACCION__APUNTA);
		}
		return esApuntadoPor;
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
			case McpMMPackage.CONTEXTO__ES_APUNTADO_POR:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEsApuntadoPor()).basicAdd(otherEnd, msgs);
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
			case McpMMPackage.CONTEXTO__PROPIEDADES:
				return ((InternalEList<?>)getPropiedades()).basicRemove(otherEnd, msgs);
			case McpMMPackage.CONTEXTO__ES_APUNTADO_POR:
				return ((InternalEList<?>)getEsApuntadoPor()).basicRemove(otherEnd, msgs);
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
			case McpMMPackage.CONTEXTO__NOMBRE_CONTEXTO:
				return getNombreContexto();
			case McpMMPackage.CONTEXTO__PROPIEDADES:
				return getPropiedades();
			case McpMMPackage.CONTEXTO__ES_APUNTADO_POR:
				return getEsApuntadoPor();
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
			case McpMMPackage.CONTEXTO__NOMBRE_CONTEXTO:
				setNombreContexto((String)newValue);
				return;
			case McpMMPackage.CONTEXTO__PROPIEDADES:
				getPropiedades().clear();
				getPropiedades().addAll((Collection<? extends Propiedad>)newValue);
				return;
			case McpMMPackage.CONTEXTO__ES_APUNTADO_POR:
				getEsApuntadoPor().clear();
				getEsApuntadoPor().addAll((Collection<? extends Accion>)newValue);
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
			case McpMMPackage.CONTEXTO__NOMBRE_CONTEXTO:
				setNombreContexto(NOMBRE_CONTEXTO_EDEFAULT);
				return;
			case McpMMPackage.CONTEXTO__PROPIEDADES:
				getPropiedades().clear();
				return;
			case McpMMPackage.CONTEXTO__ES_APUNTADO_POR:
				getEsApuntadoPor().clear();
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
			case McpMMPackage.CONTEXTO__NOMBRE_CONTEXTO:
				return NOMBRE_CONTEXTO_EDEFAULT == null ? nombreContexto != null : !NOMBRE_CONTEXTO_EDEFAULT.equals(nombreContexto);
			case McpMMPackage.CONTEXTO__PROPIEDADES:
				return propiedades != null && !propiedades.isEmpty();
			case McpMMPackage.CONTEXTO__ES_APUNTADO_POR:
				return esApuntadoPor != null && !esApuntadoPor.isEmpty();
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
		result.append(" (nombreContexto: ");
		result.append(nombreContexto);
		result.append(')');
		return result.toString();
	}

} //ContextoImpl
