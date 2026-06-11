/**
 */
package McpMM.impl;

import McpMM.Accion;
import McpMM.Contexto;
import McpMM.McpMMPackage;
import McpMM.Propiedad;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Accion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link McpMM.impl.AccionImpl#getNombreAccion <em>Nombre Accion</em>}</li>
 *   <li>{@link McpMM.impl.AccionImpl#getApunta <em>Apunta</em>}</li>
 *   <li>{@link McpMM.impl.AccionImpl#getUsa <em>Usa</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AccionImpl extends EObjectImpl implements Accion {
	/**
	 * The default value of the '{@link #getNombreAccion() <em>Nombre Accion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreAccion()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_ACCION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombreAccion() <em>Nombre Accion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreAccion()
	 * @generated
	 * @ordered
	 */
	protected String nombreAccion = NOMBRE_ACCION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getApunta() <em>Apunta</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApunta()
	 * @generated
	 * @ordered
	 */
	protected Contexto apunta;

	/**
	 * The cached value of the '{@link #getUsa() <em>Usa</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsa()
	 * @generated
	 * @ordered
	 */
	protected Propiedad usa;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return McpMMPackage.Literals.ACCION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNombreAccion() {
		return nombreAccion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreAccion(String newNombreAccion) {
		String oldNombreAccion = nombreAccion;
		nombreAccion = newNombreAccion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, McpMMPackage.ACCION__NOMBRE_ACCION, oldNombreAccion, nombreAccion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Contexto getApunta() {
		if (apunta != null && apunta.eIsProxy()) {
			InternalEObject oldApunta = (InternalEObject)apunta;
			apunta = (Contexto)eResolveProxy(oldApunta);
			if (apunta != oldApunta) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, McpMMPackage.ACCION__APUNTA, oldApunta, apunta));
			}
		}
		return apunta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Contexto basicGetApunta() {
		return apunta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApunta(Contexto newApunta, NotificationChain msgs) {
		Contexto oldApunta = apunta;
		apunta = newApunta;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, McpMMPackage.ACCION__APUNTA, oldApunta, newApunta);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApunta(Contexto newApunta) {
		if (newApunta != apunta) {
			NotificationChain msgs = null;
			if (apunta != null)
				msgs = ((InternalEObject)apunta).eInverseRemove(this, McpMMPackage.CONTEXTO__ES_APUNTADO_POR, Contexto.class, msgs);
			if (newApunta != null)
				msgs = ((InternalEObject)newApunta).eInverseAdd(this, McpMMPackage.CONTEXTO__ES_APUNTADO_POR, Contexto.class, msgs);
			msgs = basicSetApunta(newApunta, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, McpMMPackage.ACCION__APUNTA, newApunta, newApunta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Propiedad getUsa() {
		if (usa != null && usa.eIsProxy()) {
			InternalEObject oldUsa = (InternalEObject)usa;
			usa = (Propiedad)eResolveProxy(oldUsa);
			if (usa != oldUsa) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, McpMMPackage.ACCION__USA, oldUsa, usa));
			}
		}
		return usa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Propiedad basicGetUsa() {
		return usa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsa(Propiedad newUsa, NotificationChain msgs) {
		Propiedad oldUsa = usa;
		usa = newUsa;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, McpMMPackage.ACCION__USA, oldUsa, newUsa);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsa(Propiedad newUsa) {
		if (newUsa != usa) {
			NotificationChain msgs = null;
			if (usa != null)
				msgs = ((InternalEObject)usa).eInverseRemove(this, McpMMPackage.PROPIEDAD__ES_USADA, Propiedad.class, msgs);
			if (newUsa != null)
				msgs = ((InternalEObject)newUsa).eInverseAdd(this, McpMMPackage.PROPIEDAD__ES_USADA, Propiedad.class, msgs);
			msgs = basicSetUsa(newUsa, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, McpMMPackage.ACCION__USA, newUsa, newUsa));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case McpMMPackage.ACCION__APUNTA:
				if (apunta != null)
					msgs = ((InternalEObject)apunta).eInverseRemove(this, McpMMPackage.CONTEXTO__ES_APUNTADO_POR, Contexto.class, msgs);
				return basicSetApunta((Contexto)otherEnd, msgs);
			case McpMMPackage.ACCION__USA:
				if (usa != null)
					msgs = ((InternalEObject)usa).eInverseRemove(this, McpMMPackage.PROPIEDAD__ES_USADA, Propiedad.class, msgs);
				return basicSetUsa((Propiedad)otherEnd, msgs);
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
			case McpMMPackage.ACCION__APUNTA:
				return basicSetApunta(null, msgs);
			case McpMMPackage.ACCION__USA:
				return basicSetUsa(null, msgs);
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
			case McpMMPackage.ACCION__NOMBRE_ACCION:
				return getNombreAccion();
			case McpMMPackage.ACCION__APUNTA:
				if (resolve) return getApunta();
				return basicGetApunta();
			case McpMMPackage.ACCION__USA:
				if (resolve) return getUsa();
				return basicGetUsa();
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
			case McpMMPackage.ACCION__NOMBRE_ACCION:
				setNombreAccion((String)newValue);
				return;
			case McpMMPackage.ACCION__APUNTA:
				setApunta((Contexto)newValue);
				return;
			case McpMMPackage.ACCION__USA:
				setUsa((Propiedad)newValue);
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
			case McpMMPackage.ACCION__NOMBRE_ACCION:
				setNombreAccion(NOMBRE_ACCION_EDEFAULT);
				return;
			case McpMMPackage.ACCION__APUNTA:
				setApunta((Contexto)null);
				return;
			case McpMMPackage.ACCION__USA:
				setUsa((Propiedad)null);
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
			case McpMMPackage.ACCION__NOMBRE_ACCION:
				return NOMBRE_ACCION_EDEFAULT == null ? nombreAccion != null : !NOMBRE_ACCION_EDEFAULT.equals(nombreAccion);
			case McpMMPackage.ACCION__APUNTA:
				return apunta != null;
			case McpMMPackage.ACCION__USA:
				return usa != null;
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
		result.append(" (nombreAccion: ");
		result.append(nombreAccion);
		result.append(')');
		return result.toString();
	}

} //AccionImpl
