/**
 */
package McpMM.impl;

import McpMM.McpMMPackage;
import McpMM.TareaFinal;
import McpMM.Workflow;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tarea Final</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link McpMM.impl.TareaFinalImpl#getFinaliza <em>Finaliza</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TareaFinalImpl extends TareaImpl implements TareaFinal {
	/**
	 * The cached value of the '{@link #getFinaliza() <em>Finaliza</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinaliza()
	 * @generated
	 * @ordered
	 */
	protected Workflow finaliza;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TareaFinalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return McpMMPackage.Literals.TAREA_FINAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Workflow getFinaliza() {
		if (finaliza != null && finaliza.eIsProxy()) {
			InternalEObject oldFinaliza = (InternalEObject)finaliza;
			finaliza = (Workflow)eResolveProxy(oldFinaliza);
			if (finaliza != oldFinaliza) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, McpMMPackage.TAREA_FINAL__FINALIZA, oldFinaliza, finaliza));
			}
		}
		return finaliza;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Workflow basicGetFinaliza() {
		return finaliza;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFinaliza(Workflow newFinaliza, NotificationChain msgs) {
		Workflow oldFinaliza = finaliza;
		finaliza = newFinaliza;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, McpMMPackage.TAREA_FINAL__FINALIZA, oldFinaliza, newFinaliza);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinaliza(Workflow newFinaliza) {
		if (newFinaliza != finaliza) {
			NotificationChain msgs = null;
			if (finaliza != null)
				msgs = ((InternalEObject)finaliza).eInverseRemove(this, McpMMPackage.WORKFLOW__FINALIZA_CON, Workflow.class, msgs);
			if (newFinaliza != null)
				msgs = ((InternalEObject)newFinaliza).eInverseAdd(this, McpMMPackage.WORKFLOW__FINALIZA_CON, Workflow.class, msgs);
			msgs = basicSetFinaliza(newFinaliza, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, McpMMPackage.TAREA_FINAL__FINALIZA, newFinaliza, newFinaliza));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case McpMMPackage.TAREA_FINAL__FINALIZA:
				if (finaliza != null)
					msgs = ((InternalEObject)finaliza).eInverseRemove(this, McpMMPackage.WORKFLOW__FINALIZA_CON, Workflow.class, msgs);
				return basicSetFinaliza((Workflow)otherEnd, msgs);
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
			case McpMMPackage.TAREA_FINAL__FINALIZA:
				return basicSetFinaliza(null, msgs);
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
			case McpMMPackage.TAREA_FINAL__FINALIZA:
				if (resolve) return getFinaliza();
				return basicGetFinaliza();
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
			case McpMMPackage.TAREA_FINAL__FINALIZA:
				setFinaliza((Workflow)newValue);
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
			case McpMMPackage.TAREA_FINAL__FINALIZA:
				setFinaliza((Workflow)null);
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
			case McpMMPackage.TAREA_FINAL__FINALIZA:
				return finaliza != null;
		}
		return super.eIsSet(featureID);
	}

} //TareaFinalImpl
