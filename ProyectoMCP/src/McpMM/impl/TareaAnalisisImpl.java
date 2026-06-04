/**
 */
package McpMM.impl;

import McpMM.McpMMPackage;
import McpMM.Tarea;
import McpMM.TareaAnalisis;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tarea Analisis</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link McpMM.impl.TareaAnalisisImpl#getSigueElse <em>Sigue Else</em>}</li>
 *   <li>{@link McpMM.impl.TareaAnalisisImpl#getPrompt <em>Prompt</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TareaAnalisisImpl extends TareaEjecutableImpl implements TareaAnalisis {
	/**
	 * The cached value of the '{@link #getSigueElse() <em>Sigue Else</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSigueElse()
	 * @generated
	 * @ordered
	 */
	protected Tarea sigueElse;

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
	protected TareaAnalisisImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return McpMMPackage.Literals.TAREA_ANALISIS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tarea getSigueElse() {
		if (sigueElse != null && sigueElse.eIsProxy()) {
			InternalEObject oldSigueElse = (InternalEObject)sigueElse;
			sigueElse = (Tarea)eResolveProxy(oldSigueElse);
			if (sigueElse != oldSigueElse) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, McpMMPackage.TAREA_ANALISIS__SIGUE_ELSE, oldSigueElse, sigueElse));
			}
		}
		return sigueElse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tarea basicGetSigueElse() {
		return sigueElse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSigueElse(Tarea newSigueElse, NotificationChain msgs) {
		Tarea oldSigueElse = sigueElse;
		sigueElse = newSigueElse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, McpMMPackage.TAREA_ANALISIS__SIGUE_ELSE, oldSigueElse, newSigueElse);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSigueElse(Tarea newSigueElse) {
		if (newSigueElse != sigueElse) {
			NotificationChain msgs = null;
			if (sigueElse != null)
				msgs = ((InternalEObject)sigueElse).eInverseRemove(this, McpMMPackage.TAREA__PRECEDE_ELSE, Tarea.class, msgs);
			if (newSigueElse != null)
				msgs = ((InternalEObject)newSigueElse).eInverseAdd(this, McpMMPackage.TAREA__PRECEDE_ELSE, Tarea.class, msgs);
			msgs = basicSetSigueElse(newSigueElse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, McpMMPackage.TAREA_ANALISIS__SIGUE_ELSE, newSigueElse, newSigueElse));
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
			eNotify(new ENotificationImpl(this, Notification.SET, McpMMPackage.TAREA_ANALISIS__PROMPT, oldPrompt, prompt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case McpMMPackage.TAREA_ANALISIS__SIGUE_ELSE:
				if (sigueElse != null)
					msgs = ((InternalEObject)sigueElse).eInverseRemove(this, McpMMPackage.TAREA__PRECEDE_ELSE, Tarea.class, msgs);
				return basicSetSigueElse((Tarea)otherEnd, msgs);
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
			case McpMMPackage.TAREA_ANALISIS__SIGUE_ELSE:
				return basicSetSigueElse(null, msgs);
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
			case McpMMPackage.TAREA_ANALISIS__SIGUE_ELSE:
				if (resolve) return getSigueElse();
				return basicGetSigueElse();
			case McpMMPackage.TAREA_ANALISIS__PROMPT:
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
			case McpMMPackage.TAREA_ANALISIS__SIGUE_ELSE:
				setSigueElse((Tarea)newValue);
				return;
			case McpMMPackage.TAREA_ANALISIS__PROMPT:
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
			case McpMMPackage.TAREA_ANALISIS__SIGUE_ELSE:
				setSigueElse((Tarea)null);
				return;
			case McpMMPackage.TAREA_ANALISIS__PROMPT:
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
			case McpMMPackage.TAREA_ANALISIS__SIGUE_ELSE:
				return sigueElse != null;
			case McpMMPackage.TAREA_ANALISIS__PROMPT:
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

} //TareaAnalisisImpl
