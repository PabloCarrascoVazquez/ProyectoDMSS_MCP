/**
 */
package McpMM.impl;

import McpMM.McpMMPackage;
import McpMM.Propiedad;
import McpMM.VersionContexto;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Version Contexto</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link McpMM.impl.VersionContextoImpl#getValorAnterior <em>Valor Anterior</em>}</li>
 *   <li>{@link McpMM.impl.VersionContextoImpl#getFechaModificacion <em>Fecha Modificacion</em>}</li>
 *   <li>{@link McpMM.impl.VersionContextoImpl#getPropiedadAsociada <em>Propiedad Asociada</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VersionContextoImpl extends EObjectImpl implements VersionContexto {
	/**
	 * The default value of the '{@link #getValorAnterior() <em>Valor Anterior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValorAnterior()
	 * @generated
	 * @ordered
	 */
	protected static final String VALOR_ANTERIOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValorAnterior() <em>Valor Anterior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValorAnterior()
	 * @generated
	 * @ordered
	 */
	protected String valorAnterior = VALOR_ANTERIOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getFechaModificacion() <em>Fecha Modificacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFechaModificacion()
	 * @generated
	 * @ordered
	 */
	protected static final String FECHA_MODIFICACION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFechaModificacion() <em>Fecha Modificacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFechaModificacion()
	 * @generated
	 * @ordered
	 */
	protected String fechaModificacion = FECHA_MODIFICACION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VersionContextoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return McpMMPackage.Literals.VERSION_CONTEXTO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValorAnterior() {
		return valorAnterior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValorAnterior(String newValorAnterior) {
		String oldValorAnterior = valorAnterior;
		valorAnterior = newValorAnterior;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, McpMMPackage.VERSION_CONTEXTO__VALOR_ANTERIOR, oldValorAnterior, valorAnterior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFechaModificacion() {
		return fechaModificacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFechaModificacion(String newFechaModificacion) {
		String oldFechaModificacion = fechaModificacion;
		fechaModificacion = newFechaModificacion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, McpMMPackage.VERSION_CONTEXTO__FECHA_MODIFICACION, oldFechaModificacion, fechaModificacion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Propiedad getPropiedadAsociada() {
		if (eContainerFeatureID() != McpMMPackage.VERSION_CONTEXTO__PROPIEDAD_ASOCIADA) return null;
		return (Propiedad)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPropiedadAsociada(Propiedad newPropiedadAsociada, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPropiedadAsociada, McpMMPackage.VERSION_CONTEXTO__PROPIEDAD_ASOCIADA, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropiedadAsociada(Propiedad newPropiedadAsociada) {
		if (newPropiedadAsociada != eInternalContainer() || (eContainerFeatureID() != McpMMPackage.VERSION_CONTEXTO__PROPIEDAD_ASOCIADA && newPropiedadAsociada != null)) {
			if (EcoreUtil.isAncestor(this, newPropiedadAsociada))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPropiedadAsociada != null)
				msgs = ((InternalEObject)newPropiedadAsociada).eInverseAdd(this, McpMMPackage.PROPIEDAD__VERSIONES, Propiedad.class, msgs);
			msgs = basicSetPropiedadAsociada(newPropiedadAsociada, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, McpMMPackage.VERSION_CONTEXTO__PROPIEDAD_ASOCIADA, newPropiedadAsociada, newPropiedadAsociada));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case McpMMPackage.VERSION_CONTEXTO__PROPIEDAD_ASOCIADA:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPropiedadAsociada((Propiedad)otherEnd, msgs);
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
			case McpMMPackage.VERSION_CONTEXTO__PROPIEDAD_ASOCIADA:
				return basicSetPropiedadAsociada(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case McpMMPackage.VERSION_CONTEXTO__PROPIEDAD_ASOCIADA:
				return eInternalContainer().eInverseRemove(this, McpMMPackage.PROPIEDAD__VERSIONES, Propiedad.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case McpMMPackage.VERSION_CONTEXTO__VALOR_ANTERIOR:
				return getValorAnterior();
			case McpMMPackage.VERSION_CONTEXTO__FECHA_MODIFICACION:
				return getFechaModificacion();
			case McpMMPackage.VERSION_CONTEXTO__PROPIEDAD_ASOCIADA:
				return getPropiedadAsociada();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case McpMMPackage.VERSION_CONTEXTO__VALOR_ANTERIOR:
				setValorAnterior((String)newValue);
				return;
			case McpMMPackage.VERSION_CONTEXTO__FECHA_MODIFICACION:
				setFechaModificacion((String)newValue);
				return;
			case McpMMPackage.VERSION_CONTEXTO__PROPIEDAD_ASOCIADA:
				setPropiedadAsociada((Propiedad)newValue);
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
			case McpMMPackage.VERSION_CONTEXTO__VALOR_ANTERIOR:
				setValorAnterior(VALOR_ANTERIOR_EDEFAULT);
				return;
			case McpMMPackage.VERSION_CONTEXTO__FECHA_MODIFICACION:
				setFechaModificacion(FECHA_MODIFICACION_EDEFAULT);
				return;
			case McpMMPackage.VERSION_CONTEXTO__PROPIEDAD_ASOCIADA:
				setPropiedadAsociada((Propiedad)null);
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
			case McpMMPackage.VERSION_CONTEXTO__VALOR_ANTERIOR:
				return VALOR_ANTERIOR_EDEFAULT == null ? valorAnterior != null : !VALOR_ANTERIOR_EDEFAULT.equals(valorAnterior);
			case McpMMPackage.VERSION_CONTEXTO__FECHA_MODIFICACION:
				return FECHA_MODIFICACION_EDEFAULT == null ? fechaModificacion != null : !FECHA_MODIFICACION_EDEFAULT.equals(fechaModificacion);
			case McpMMPackage.VERSION_CONTEXTO__PROPIEDAD_ASOCIADA:
				return getPropiedadAsociada() != null;
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
		result.append(" (valorAnterior: ");
		result.append(valorAnterior);
		result.append(", fechaModificacion: ");
		result.append(fechaModificacion);
		result.append(')');
		return result.toString();
	}

} //VersionContextoImpl
