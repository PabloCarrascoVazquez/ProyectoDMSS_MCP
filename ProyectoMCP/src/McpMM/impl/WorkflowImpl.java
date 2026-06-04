/**
 */
package McpMM.impl;

import McpMM.Contexto;
import McpMM.McpMMPackage;
import McpMM.Tarea;
import McpMM.TareaFinal;
import McpMM.TareaInicial;
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
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
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
 *   <li>{@link McpMM.impl.WorkflowImpl#getContexto <em>Contexto</em>}</li>
 *   <li>{@link McpMM.impl.WorkflowImpl#getTarea <em>Tarea</em>}</li>
 *   <li>{@link McpMM.impl.WorkflowImpl#getEmpiezaCon <em>Empieza Con</em>}</li>
 *   <li>{@link McpMM.impl.WorkflowImpl#getFinalizaCon <em>Finaliza Con</em>}</li>
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
	 * The cached value of the '{@link #getContexto() <em>Contexto</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContexto()
	 * @generated
	 * @ordered
	 */
	protected EList<Contexto> contexto;

	/**
	 * The cached value of the '{@link #getTarea() <em>Tarea</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarea()
	 * @generated
	 * @ordered
	 */
	protected EList<Tarea> tarea;

	/**
	 * The cached value of the '{@link #getEmpiezaCon() <em>Empieza Con</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmpiezaCon()
	 * @generated
	 * @ordered
	 */
	protected TareaInicial empiezaCon;

	/**
	 * The cached value of the '{@link #getFinalizaCon() <em>Finaliza Con</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinalizaCon()
	 * @generated
	 * @ordered
	 */
	protected EList<TareaFinal> finalizaCon;

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
	public EList<Contexto> getContexto() {
		if (contexto == null) {
			contexto = new EObjectContainmentEList<Contexto>(Contexto.class, this, McpMMPackage.WORKFLOW__CONTEXTO);
		}
		return contexto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tarea> getTarea() {
		if (tarea == null) {
			tarea = new EObjectContainmentEList<Tarea>(Tarea.class, this, McpMMPackage.WORKFLOW__TAREA);
		}
		return tarea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TareaInicial getEmpiezaCon() {
		if (empiezaCon != null && empiezaCon.eIsProxy()) {
			InternalEObject oldEmpiezaCon = (InternalEObject)empiezaCon;
			empiezaCon = (TareaInicial)eResolveProxy(oldEmpiezaCon);
			if (empiezaCon != oldEmpiezaCon) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, McpMMPackage.WORKFLOW__EMPIEZA_CON, oldEmpiezaCon, empiezaCon));
			}
		}
		return empiezaCon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TareaInicial basicGetEmpiezaCon() {
		return empiezaCon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEmpiezaCon(TareaInicial newEmpiezaCon, NotificationChain msgs) {
		TareaInicial oldEmpiezaCon = empiezaCon;
		empiezaCon = newEmpiezaCon;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, McpMMPackage.WORKFLOW__EMPIEZA_CON, oldEmpiezaCon, newEmpiezaCon);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmpiezaCon(TareaInicial newEmpiezaCon) {
		if (newEmpiezaCon != empiezaCon) {
			NotificationChain msgs = null;
			if (empiezaCon != null)
				msgs = ((InternalEObject)empiezaCon).eInverseRemove(this, McpMMPackage.TAREA_INICIAL__EMPIEZA, TareaInicial.class, msgs);
			if (newEmpiezaCon != null)
				msgs = ((InternalEObject)newEmpiezaCon).eInverseAdd(this, McpMMPackage.TAREA_INICIAL__EMPIEZA, TareaInicial.class, msgs);
			msgs = basicSetEmpiezaCon(newEmpiezaCon, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, McpMMPackage.WORKFLOW__EMPIEZA_CON, newEmpiezaCon, newEmpiezaCon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TareaFinal> getFinalizaCon() {
		if (finalizaCon == null) {
			finalizaCon = new EObjectWithInverseResolvingEList<TareaFinal>(TareaFinal.class, this, McpMMPackage.WORKFLOW__FINALIZA_CON, McpMMPackage.TAREA_FINAL__FINALIZA);
		}
		return finalizaCon;
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
			case McpMMPackage.WORKFLOW__EMPIEZA_CON:
				if (empiezaCon != null)
					msgs = ((InternalEObject)empiezaCon).eInverseRemove(this, McpMMPackage.TAREA_INICIAL__EMPIEZA, TareaInicial.class, msgs);
				return basicSetEmpiezaCon((TareaInicial)otherEnd, msgs);
			case McpMMPackage.WORKFLOW__FINALIZA_CON:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFinalizaCon()).basicAdd(otherEnd, msgs);
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
			case McpMMPackage.WORKFLOW__CONTEXTO:
				return ((InternalEList<?>)getContexto()).basicRemove(otherEnd, msgs);
			case McpMMPackage.WORKFLOW__TAREA:
				return ((InternalEList<?>)getTarea()).basicRemove(otherEnd, msgs);
			case McpMMPackage.WORKFLOW__EMPIEZA_CON:
				return basicSetEmpiezaCon(null, msgs);
			case McpMMPackage.WORKFLOW__FINALIZA_CON:
				return ((InternalEList<?>)getFinalizaCon()).basicRemove(otherEnd, msgs);
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
			case McpMMPackage.WORKFLOW__CONTEXTO:
				return getContexto();
			case McpMMPackage.WORKFLOW__TAREA:
				return getTarea();
			case McpMMPackage.WORKFLOW__EMPIEZA_CON:
				if (resolve) return getEmpiezaCon();
				return basicGetEmpiezaCon();
			case McpMMPackage.WORKFLOW__FINALIZA_CON:
				return getFinalizaCon();
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
			case McpMMPackage.WORKFLOW__CONTEXTO:
				getContexto().clear();
				getContexto().addAll((Collection<? extends Contexto>)newValue);
				return;
			case McpMMPackage.WORKFLOW__TAREA:
				getTarea().clear();
				getTarea().addAll((Collection<? extends Tarea>)newValue);
				return;
			case McpMMPackage.WORKFLOW__EMPIEZA_CON:
				setEmpiezaCon((TareaInicial)newValue);
				return;
			case McpMMPackage.WORKFLOW__FINALIZA_CON:
				getFinalizaCon().clear();
				getFinalizaCon().addAll((Collection<? extends TareaFinal>)newValue);
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
			case McpMMPackage.WORKFLOW__CONTEXTO:
				getContexto().clear();
				return;
			case McpMMPackage.WORKFLOW__TAREA:
				getTarea().clear();
				return;
			case McpMMPackage.WORKFLOW__EMPIEZA_CON:
				setEmpiezaCon((TareaInicial)null);
				return;
			case McpMMPackage.WORKFLOW__FINALIZA_CON:
				getFinalizaCon().clear();
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
			case McpMMPackage.WORKFLOW__CONTEXTO:
				return contexto != null && !contexto.isEmpty();
			case McpMMPackage.WORKFLOW__TAREA:
				return tarea != null && !tarea.isEmpty();
			case McpMMPackage.WORKFLOW__EMPIEZA_CON:
				return empiezaCon != null;
			case McpMMPackage.WORKFLOW__FINALIZA_CON:
				return finalizaCon != null && !finalizaCon.isEmpty();
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
