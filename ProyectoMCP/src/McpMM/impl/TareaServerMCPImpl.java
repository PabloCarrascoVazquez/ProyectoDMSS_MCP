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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tarea Server MCP</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link McpMM.impl.TareaServerMCPImpl#getEjecutaOperacion <em>Ejecuta Operacion</em>}</li>
 *   <li>{@link McpMM.impl.TareaServerMCPImpl#getPrompt <em>Prompt</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TareaServerMCPImpl extends TareaEjecutableImpl implements TareaServerMCP {
	/**
	 * The cached value of the '{@link #getEjecutaOperacion() <em>Ejecuta Operacion</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEjecutaOperacion()
	 * @generated
	 * @ordered
	 */
	protected OperacionMCP ejecutaOperacion;

	/**
	 * The default value of the '{@link #getPrompt() <em>Prompt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrompt()
	 * @generated
	 * @ordered
	 */
	protected static final String PROMPT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrompt() <em>Prompt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrompt()
	 * @generated
	 * @ordered
	 */
	protected String prompt = PROMPT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TareaServerMCPImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return McpMMPackage.Literals.TAREA_SERVER_MCP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperacionMCP getEjecutaOperacion() {
		if (ejecutaOperacion != null && ejecutaOperacion.eIsProxy()) {
			InternalEObject oldEjecutaOperacion = (InternalEObject)ejecutaOperacion;
			ejecutaOperacion = (OperacionMCP)eResolveProxy(oldEjecutaOperacion);
			if (ejecutaOperacion != oldEjecutaOperacion) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, McpMMPackage.TAREA_SERVER_MCP__EJECUTA_OPERACION, oldEjecutaOperacion, ejecutaOperacion));
			}
		}
		return ejecutaOperacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperacionMCP basicGetEjecutaOperacion() {
		return ejecutaOperacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEjecutaOperacion(OperacionMCP newEjecutaOperacion, NotificationChain msgs) {
		OperacionMCP oldEjecutaOperacion = ejecutaOperacion;
		ejecutaOperacion = newEjecutaOperacion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, McpMMPackage.TAREA_SERVER_MCP__EJECUTA_OPERACION, oldEjecutaOperacion, newEjecutaOperacion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEjecutaOperacion(OperacionMCP newEjecutaOperacion) {
		if (newEjecutaOperacion != ejecutaOperacion) {
			NotificationChain msgs = null;
			if (ejecutaOperacion != null)
				msgs = ((InternalEObject)ejecutaOperacion).eInverseRemove(this, McpMMPackage.OPERACION_MCP__ES_EJECUTADA_OPERACION, OperacionMCP.class, msgs);
			if (newEjecutaOperacion != null)
				msgs = ((InternalEObject)newEjecutaOperacion).eInverseAdd(this, McpMMPackage.OPERACION_MCP__ES_EJECUTADA_OPERACION, OperacionMCP.class, msgs);
			msgs = basicSetEjecutaOperacion(newEjecutaOperacion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, McpMMPackage.TAREA_SERVER_MCP__EJECUTA_OPERACION, newEjecutaOperacion, newEjecutaOperacion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrompt() {
		return prompt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrompt(String newPrompt) {
		String oldPrompt = prompt;
		prompt = newPrompt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, McpMMPackage.TAREA_SERVER_MCP__PROMPT, oldPrompt, prompt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case McpMMPackage.TAREA_SERVER_MCP__EJECUTA_OPERACION:
				if (ejecutaOperacion != null)
					msgs = ((InternalEObject)ejecutaOperacion).eInverseRemove(this, McpMMPackage.OPERACION_MCP__ES_EJECUTADA_OPERACION, OperacionMCP.class, msgs);
				return basicSetEjecutaOperacion((OperacionMCP)otherEnd, msgs);
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
			case McpMMPackage.TAREA_SERVER_MCP__EJECUTA_OPERACION:
				return basicSetEjecutaOperacion(null, msgs);
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
			case McpMMPackage.TAREA_SERVER_MCP__EJECUTA_OPERACION:
				if (resolve) return getEjecutaOperacion();
				return basicGetEjecutaOperacion();
			case McpMMPackage.TAREA_SERVER_MCP__PROMPT:
				return getPrompt();
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
			case McpMMPackage.TAREA_SERVER_MCP__EJECUTA_OPERACION:
				setEjecutaOperacion((OperacionMCP)newValue);
				return;
			case McpMMPackage.TAREA_SERVER_MCP__PROMPT:
				setPrompt((String)newValue);
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
			case McpMMPackage.TAREA_SERVER_MCP__EJECUTA_OPERACION:
				setEjecutaOperacion((OperacionMCP)null);
				return;
			case McpMMPackage.TAREA_SERVER_MCP__PROMPT:
				setPrompt(PROMPT_EDEFAULT);
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
			case McpMMPackage.TAREA_SERVER_MCP__EJECUTA_OPERACION:
				return ejecutaOperacion != null;
			case McpMMPackage.TAREA_SERVER_MCP__PROMPT:
				return PROMPT_EDEFAULT == null ? prompt != null : !PROMPT_EDEFAULT.equals(prompt);
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
		result.append(" (prompt: ");
		result.append(prompt);
		result.append(')');
		return result.toString();
	}

} //TareaServerMCPImpl
