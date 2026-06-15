/**
 */
package McpMM.impl;

import McpMM.McpMMPackage;
import McpMM.OperacionMCP;
import McpMM.TareaServerMCP;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operacion MCP</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link McpMM.impl.OperacionMCPImpl#getNombreOperacion <em>Nombre Operacion</em>}</li>
 *   <li>{@link McpMM.impl.OperacionMCPImpl#getDescOperacion <em>Desc Operacion</em>}</li>
 *   <li>{@link McpMM.impl.OperacionMCPImpl#getEsEjecutadaOperacion <em>Es Ejecutada Operacion</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperacionMCPImpl extends EObjectImpl implements OperacionMCP {
	/**
	 * The default value of the '{@link #getNombreOperacion() <em>Nombre Operacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreOperacion()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_OPERACION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombreOperacion() <em>Nombre Operacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreOperacion()
	 * @generated
	 * @ordered
	 */
	protected String nombreOperacion = NOMBRE_OPERACION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescOperacion() <em>Desc Operacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescOperacion()
	 * @generated
	 * @ordered
	 */
	protected static final String DESC_OPERACION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescOperacion() <em>Desc Operacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescOperacion()
	 * @generated
	 * @ordered
	 */
	protected String descOperacion = DESC_OPERACION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEsEjecutadaOperacion() <em>Es Ejecutada Operacion</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEsEjecutadaOperacion()
	 * @generated
	 * @ordered
	 */
	protected TareaServerMCP esEjecutadaOperacion;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperacionMCPImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return McpMMPackage.Literals.OPERACION_MCP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNombreOperacion() {
		return nombreOperacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreOperacion(String newNombreOperacion) {
		String oldNombreOperacion = nombreOperacion;
		nombreOperacion = newNombreOperacion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, McpMMPackage.OPERACION_MCP__NOMBRE_OPERACION, oldNombreOperacion, nombreOperacion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescOperacion() {
		return descOperacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescOperacion(String newDescOperacion) {
		String oldDescOperacion = descOperacion;
		descOperacion = newDescOperacion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, McpMMPackage.OPERACION_MCP__DESC_OPERACION, oldDescOperacion, descOperacion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TareaServerMCP getEsEjecutadaOperacion() {
		if (esEjecutadaOperacion != null && esEjecutadaOperacion.eIsProxy()) {
			InternalEObject oldEsEjecutadaOperacion = (InternalEObject)esEjecutadaOperacion;
			esEjecutadaOperacion = (TareaServerMCP)eResolveProxy(oldEsEjecutadaOperacion);
			if (esEjecutadaOperacion != oldEsEjecutadaOperacion) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, McpMMPackage.OPERACION_MCP__ES_EJECUTADA_OPERACION, oldEsEjecutadaOperacion, esEjecutadaOperacion));
			}
		}
		return esEjecutadaOperacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TareaServerMCP basicGetEsEjecutadaOperacion() {
		return esEjecutadaOperacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEsEjecutadaOperacion(TareaServerMCP newEsEjecutadaOperacion, NotificationChain msgs) {
		TareaServerMCP oldEsEjecutadaOperacion = esEjecutadaOperacion;
		esEjecutadaOperacion = newEsEjecutadaOperacion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, McpMMPackage.OPERACION_MCP__ES_EJECUTADA_OPERACION, oldEsEjecutadaOperacion, newEsEjecutadaOperacion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEsEjecutadaOperacion(TareaServerMCP newEsEjecutadaOperacion) {
		if (newEsEjecutadaOperacion != esEjecutadaOperacion) {
			NotificationChain msgs = null;
			if (esEjecutadaOperacion != null)
				msgs = ((InternalEObject)esEjecutadaOperacion).eInverseRemove(this, McpMMPackage.TAREA_SERVER_MCP__EJECUTA_OPERACION, TareaServerMCP.class, msgs);
			if (newEsEjecutadaOperacion != null)
				msgs = ((InternalEObject)newEsEjecutadaOperacion).eInverseAdd(this, McpMMPackage.TAREA_SERVER_MCP__EJECUTA_OPERACION, TareaServerMCP.class, msgs);
			msgs = basicSetEsEjecutadaOperacion(newEsEjecutadaOperacion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, McpMMPackage.OPERACION_MCP__ES_EJECUTADA_OPERACION, newEsEjecutadaOperacion, newEsEjecutadaOperacion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case McpMMPackage.OPERACION_MCP__ES_EJECUTADA_OPERACION:
				if (esEjecutadaOperacion != null)
					msgs = ((InternalEObject)esEjecutadaOperacion).eInverseRemove(this, McpMMPackage.TAREA_SERVER_MCP__EJECUTA_OPERACION, TareaServerMCP.class, msgs);
				return basicSetEsEjecutadaOperacion((TareaServerMCP)otherEnd, msgs);
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
			case McpMMPackage.OPERACION_MCP__ES_EJECUTADA_OPERACION:
				return basicSetEsEjecutadaOperacion(null, msgs);
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
			case McpMMPackage.OPERACION_MCP__NOMBRE_OPERACION:
				return getNombreOperacion();
			case McpMMPackage.OPERACION_MCP__DESC_OPERACION:
				return getDescOperacion();
			case McpMMPackage.OPERACION_MCP__ES_EJECUTADA_OPERACION:
				if (resolve) return getEsEjecutadaOperacion();
				return basicGetEsEjecutadaOperacion();
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
			case McpMMPackage.OPERACION_MCP__NOMBRE_OPERACION:
				setNombreOperacion((String)newValue);
				return;
			case McpMMPackage.OPERACION_MCP__DESC_OPERACION:
				setDescOperacion((String)newValue);
				return;
			case McpMMPackage.OPERACION_MCP__ES_EJECUTADA_OPERACION:
				setEsEjecutadaOperacion((TareaServerMCP)newValue);
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
			case McpMMPackage.OPERACION_MCP__NOMBRE_OPERACION:
				setNombreOperacion(NOMBRE_OPERACION_EDEFAULT);
				return;
			case McpMMPackage.OPERACION_MCP__DESC_OPERACION:
				setDescOperacion(DESC_OPERACION_EDEFAULT);
				return;
			case McpMMPackage.OPERACION_MCP__ES_EJECUTADA_OPERACION:
				setEsEjecutadaOperacion((TareaServerMCP)null);
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
			case McpMMPackage.OPERACION_MCP__NOMBRE_OPERACION:
				return NOMBRE_OPERACION_EDEFAULT == null ? nombreOperacion != null : !NOMBRE_OPERACION_EDEFAULT.equals(nombreOperacion);
			case McpMMPackage.OPERACION_MCP__DESC_OPERACION:
				return DESC_OPERACION_EDEFAULT == null ? descOperacion != null : !DESC_OPERACION_EDEFAULT.equals(descOperacion);
			case McpMMPackage.OPERACION_MCP__ES_EJECUTADA_OPERACION:
				return esEjecutadaOperacion != null;
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
		result.append(" (nombreOperacion: ");
		result.append(nombreOperacion);
		result.append(", descOperacion: ");
		result.append(descOperacion);
		result.append(')');
		return result.toString();
	}

} //OperacionMCPImpl
