/**
 */
package McpMM.impl;

import McpMM.Agente;
import McpMM.McpMMPackage;
import McpMM.TareaEjecutable;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tarea Ejecutable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link McpMM.impl.TareaEjecutableImpl#getEjecutadaPor <em>Ejecutada Por</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TareaEjecutableImpl extends TareaImpl implements TareaEjecutable {
	/**
	 * The cached value of the '{@link #getEjecutadaPor() <em>Ejecutada Por</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEjecutadaPor()
	 * @generated
	 * @ordered
	 */
	protected Agente ejecutadaPor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TareaEjecutableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return McpMMPackage.Literals.TAREA_EJECUTABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Agente getEjecutadaPor() {
		if (ejecutadaPor != null && ejecutadaPor.eIsProxy()) {
			InternalEObject oldEjecutadaPor = (InternalEObject)ejecutadaPor;
			ejecutadaPor = (Agente)eResolveProxy(oldEjecutadaPor);
			if (ejecutadaPor != oldEjecutadaPor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, McpMMPackage.TAREA_EJECUTABLE__EJECUTADA_POR, oldEjecutadaPor, ejecutadaPor));
			}
		}
		return ejecutadaPor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Agente basicGetEjecutadaPor() {
		return ejecutadaPor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEjecutadaPor(Agente newEjecutadaPor, NotificationChain msgs) {
		Agente oldEjecutadaPor = ejecutadaPor;
		ejecutadaPor = newEjecutadaPor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, McpMMPackage.TAREA_EJECUTABLE__EJECUTADA_POR, oldEjecutadaPor, newEjecutadaPor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEjecutadaPor(Agente newEjecutadaPor) {
		if (newEjecutadaPor != ejecutadaPor) {
			NotificationChain msgs = null;
			if (ejecutadaPor != null)
				msgs = ((InternalEObject)ejecutadaPor).eInverseRemove(this, McpMMPackage.AGENTE__TAREAS, Agente.class, msgs);
			if (newEjecutadaPor != null)
				msgs = ((InternalEObject)newEjecutadaPor).eInverseAdd(this, McpMMPackage.AGENTE__TAREAS, Agente.class, msgs);
			msgs = basicSetEjecutadaPor(newEjecutadaPor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, McpMMPackage.TAREA_EJECUTABLE__EJECUTADA_POR, newEjecutadaPor, newEjecutadaPor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case McpMMPackage.TAREA_EJECUTABLE__EJECUTADA_POR:
				if (ejecutadaPor != null)
					msgs = ((InternalEObject)ejecutadaPor).eInverseRemove(this, McpMMPackage.AGENTE__TAREAS, Agente.class, msgs);
				return basicSetEjecutadaPor((Agente)otherEnd, msgs);
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
			case McpMMPackage.TAREA_EJECUTABLE__EJECUTADA_POR:
				return basicSetEjecutadaPor(null, msgs);
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
			case McpMMPackage.TAREA_EJECUTABLE__EJECUTADA_POR:
				if (resolve) return getEjecutadaPor();
				return basicGetEjecutadaPor();
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
			case McpMMPackage.TAREA_EJECUTABLE__EJECUTADA_POR:
				setEjecutadaPor((Agente)newValue);
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
			case McpMMPackage.TAREA_EJECUTABLE__EJECUTADA_POR:
				setEjecutadaPor((Agente)null);
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
			case McpMMPackage.TAREA_EJECUTABLE__EJECUTADA_POR:
				return ejecutadaPor != null;
		}
		return super.eIsSet(featureID);
	}

} //TareaEjecutableImpl
