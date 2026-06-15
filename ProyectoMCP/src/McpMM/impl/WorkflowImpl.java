/**
 */
package McpMM.impl;

import McpMM.McpMMPackage;
import McpMM.Tarea;
import McpMM.Workflow;

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
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Workflow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link McpMM.impl.WorkflowImpl#getNombreWorkflow <em>Nombre Workflow</em>}</li>
 *   <li>{@link McpMM.impl.WorkflowImpl#getTareas <em>Tareas</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorkflowImpl extends EObjectImpl implements Workflow {
	/**
	 * The default value of the '{@link #getNombreWorkflow() <em>Nombre Workflow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreWorkflow()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_WORKFLOW_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombreWorkflow() <em>Nombre Workflow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreWorkflow()
	 * @generated
	 * @ordered
	 */
	protected String nombreWorkflow = NOMBRE_WORKFLOW_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTareas() <em>Tareas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTareas()
	 * @generated
	 * @ordered
	 */
	protected EList<Tarea> tareas;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkflowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return McpMMPackage.Literals.WORKFLOW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNombreWorkflow() {
		return nombreWorkflow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreWorkflow(String newNombreWorkflow) {
		String oldNombreWorkflow = nombreWorkflow;
		nombreWorkflow = newNombreWorkflow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, McpMMPackage.WORKFLOW__NOMBRE_WORKFLOW, oldNombreWorkflow, nombreWorkflow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tarea> getTareas() {
		if (tareas == null) {
			tareas = new EObjectContainmentEList<Tarea>(Tarea.class, this, McpMMPackage.WORKFLOW__TAREAS);
		}
		return tareas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case McpMMPackage.WORKFLOW__TAREAS:
				return ((InternalEList<?>)getTareas()).basicRemove(otherEnd, msgs);
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
			case McpMMPackage.WORKFLOW__NOMBRE_WORKFLOW:
				return getNombreWorkflow();
			case McpMMPackage.WORKFLOW__TAREAS:
				return getTareas();
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
			case McpMMPackage.WORKFLOW__NOMBRE_WORKFLOW:
				setNombreWorkflow((String)newValue);
				return;
			case McpMMPackage.WORKFLOW__TAREAS:
				getTareas().clear();
				getTareas().addAll((Collection<? extends Tarea>)newValue);
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
			case McpMMPackage.WORKFLOW__NOMBRE_WORKFLOW:
				setNombreWorkflow(NOMBRE_WORKFLOW_EDEFAULT);
				return;
			case McpMMPackage.WORKFLOW__TAREAS:
				getTareas().clear();
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
			case McpMMPackage.WORKFLOW__NOMBRE_WORKFLOW:
				return NOMBRE_WORKFLOW_EDEFAULT == null ? nombreWorkflow != null : !NOMBRE_WORKFLOW_EDEFAULT.equals(nombreWorkflow);
			case McpMMPackage.WORKFLOW__TAREAS:
				return tareas != null && !tareas.isEmpty();
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
		result.append(" (nombreWorkflow: ");
		result.append(nombreWorkflow);
		result.append(')');
		return result.toString();
	}

} //WorkflowImpl
