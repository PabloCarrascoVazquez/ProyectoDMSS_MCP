/**
 */
package McpMM.impl;

import McpMM.McpMMPackage;
import McpMM.TareaInicial;
import McpMM.Workflow;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tarea Inicial</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link McpMM.impl.TareaInicialImpl#getEmpieza <em>Empieza</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TareaInicialImpl extends TareaImpl implements TareaInicial {
	/**
	 * The cached value of the '{@link #getEmpieza() <em>Empieza</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmpieza()
	 * @generated
	 * @ordered
	 */
	protected Workflow empieza;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TareaInicialImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return McpMMPackage.Literals.TAREA_INICIAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Workflow getEmpieza() {
		if (empieza != null && empieza.eIsProxy()) {
			InternalEObject oldEmpieza = (InternalEObject)empieza;
			empieza = (Workflow)eResolveProxy(oldEmpieza);
			if (empieza != oldEmpieza) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, McpMMPackage.TAREA_INICIAL__EMPIEZA, oldEmpieza, empieza));
			}
		}
		return empieza;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Workflow basicGetEmpieza() {
		return empieza;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEmpieza(Workflow newEmpieza, NotificationChain msgs) {
		Workflow oldEmpieza = empieza;
		empieza = newEmpieza;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, McpMMPackage.TAREA_INICIAL__EMPIEZA, oldEmpieza, newEmpieza);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmpieza(Workflow newEmpieza) {
		if (newEmpieza != empieza) {
			NotificationChain msgs = null;
			if (empieza != null)
				msgs = ((InternalEObject)empieza).eInverseRemove(this, McpMMPackage.WORKFLOW__EMPIEZA_CON, Workflow.class, msgs);
			if (newEmpieza != null)
				msgs = ((InternalEObject)newEmpieza).eInverseAdd(this, McpMMPackage.WORKFLOW__EMPIEZA_CON, Workflow.class, msgs);
			msgs = basicSetEmpieza(newEmpieza, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, McpMMPackage.TAREA_INICIAL__EMPIEZA, newEmpieza, newEmpieza));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case McpMMPackage.TAREA_INICIAL__EMPIEZA:
				if (empieza != null)
					msgs = ((InternalEObject)empieza).eInverseRemove(this, McpMMPackage.WORKFLOW__EMPIEZA_CON, Workflow.class, msgs);
				return basicSetEmpieza((Workflow)otherEnd, msgs);
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
			case McpMMPackage.TAREA_INICIAL__EMPIEZA:
				return basicSetEmpieza(null, msgs);
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
			case McpMMPackage.TAREA_INICIAL__EMPIEZA:
				if (resolve) return getEmpieza();
				return basicGetEmpieza();
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
			case McpMMPackage.TAREA_INICIAL__EMPIEZA:
				setEmpieza((Workflow)newValue);
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
			case McpMMPackage.TAREA_INICIAL__EMPIEZA:
				setEmpieza((Workflow)null);
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
			case McpMMPackage.TAREA_INICIAL__EMPIEZA:
				return empieza != null;
		}
		return super.eIsSet(featureID);
	}

} //TareaInicialImpl
