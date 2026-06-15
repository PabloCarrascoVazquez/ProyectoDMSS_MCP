/**
 */
package McpMM.impl;

import McpMM.Accion;
import McpMM.McpMMPackage;
import McpMM.Tarea;
import McpMM.TareaAnalisis;

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
 * An implementation of the model object '<em><b>Tarea</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link McpMM.impl.TareaImpl#getNombreTarea <em>Nombre Tarea</em>}</li>
 *   <li>{@link McpMM.impl.TareaImpl#getTaskId <em>Task Id</em>}</li>
 *   <li>{@link McpMM.impl.TareaImpl#getTaskDesc <em>Task Desc</em>}</li>
 *   <li>{@link McpMM.impl.TareaImpl#getAccion <em>Accion</em>}</li>
 *   <li>{@link McpMM.impl.TareaImpl#getPrecede <em>Precede</em>}</li>
 *   <li>{@link McpMM.impl.TareaImpl#getSigue <em>Sigue</em>}</li>
 *   <li>{@link McpMM.impl.TareaImpl#getPrecedeElse <em>Precede Else</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TareaImpl extends EObjectImpl implements Tarea {
	/**
	 * The default value of the '{@link #getNombreTarea() <em>Nombre Tarea</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreTarea()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_TAREA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombreTarea() <em>Nombre Tarea</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreTarea()
	 * @generated
	 * @ordered
	 */
	protected String nombreTarea = NOMBRE_TAREA_EDEFAULT;

	/**
	 * The default value of the '{@link #getTaskId() <em>Task Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskId()
	 * @generated
	 * @ordered
	 */
	protected static final int TASK_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTaskId() <em>Task Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskId()
	 * @generated
	 * @ordered
	 */
	protected int taskId = TASK_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTaskDesc() <em>Task Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskDesc()
	 * @generated
	 * @ordered
	 */
	protected static final String TASK_DESC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTaskDesc() <em>Task Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskDesc()
	 * @generated
	 * @ordered
	 */
	protected String taskDesc = TASK_DESC_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAccion() <em>Accion</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccion()
	 * @generated
	 * @ordered
	 */
	protected EList<Accion> accion;

	/**
	 * The cached value of the '{@link #getPrecede() <em>Precede</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecede()
	 * @generated
	 * @ordered
	 */
	protected EList<Tarea> precede;

	/**
	 * The cached value of the '{@link #getSigue() <em>Sigue</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSigue()
	 * @generated
	 * @ordered
	 */
	protected Tarea sigue;

	/**
	 * The cached value of the '{@link #getPrecedeElse() <em>Precede Else</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecedeElse()
	 * @generated
	 * @ordered
	 */
	protected EList<TareaAnalisis> precedeElse;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TareaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return McpMMPackage.Literals.TAREA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNombreTarea() {
		return nombreTarea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreTarea(String newNombreTarea) {
		String oldNombreTarea = nombreTarea;
		nombreTarea = newNombreTarea;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, McpMMPackage.TAREA__NOMBRE_TAREA, oldNombreTarea, nombreTarea));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTaskId() {
		return taskId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaskId(int newTaskId) {
		int oldTaskId = taskId;
		taskId = newTaskId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, McpMMPackage.TAREA__TASK_ID, oldTaskId, taskId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTaskDesc() {
		return taskDesc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaskDesc(String newTaskDesc) {
		String oldTaskDesc = taskDesc;
		taskDesc = newTaskDesc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, McpMMPackage.TAREA__TASK_DESC, oldTaskDesc, taskDesc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Accion> getAccion() {
		if (accion == null) {
			accion = new EObjectContainmentEList<Accion>(Accion.class, this, McpMMPackage.TAREA__ACCION);
		}
		return accion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tarea> getPrecede() {
		if (precede == null) {
			precede = new EObjectWithInverseResolvingEList<Tarea>(Tarea.class, this, McpMMPackage.TAREA__PRECEDE, McpMMPackage.TAREA__SIGUE);
		}
		return precede;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tarea getSigue() {
		if (sigue != null && sigue.eIsProxy()) {
			InternalEObject oldSigue = (InternalEObject)sigue;
			sigue = (Tarea)eResolveProxy(oldSigue);
			if (sigue != oldSigue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, McpMMPackage.TAREA__SIGUE, oldSigue, sigue));
			}
		}
		return sigue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tarea basicGetSigue() {
		return sigue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSigue(Tarea newSigue, NotificationChain msgs) {
		Tarea oldSigue = sigue;
		sigue = newSigue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, McpMMPackage.TAREA__SIGUE, oldSigue, newSigue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSigue(Tarea newSigue) {
		if (newSigue != sigue) {
			NotificationChain msgs = null;
			if (sigue != null)
				msgs = ((InternalEObject)sigue).eInverseRemove(this, McpMMPackage.TAREA__PRECEDE, Tarea.class, msgs);
			if (newSigue != null)
				msgs = ((InternalEObject)newSigue).eInverseAdd(this, McpMMPackage.TAREA__PRECEDE, Tarea.class, msgs);
			msgs = basicSetSigue(newSigue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, McpMMPackage.TAREA__SIGUE, newSigue, newSigue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TareaAnalisis> getPrecedeElse() {
		if (precedeElse == null) {
			precedeElse = new EObjectWithInverseResolvingEList<TareaAnalisis>(TareaAnalisis.class, this, McpMMPackage.TAREA__PRECEDE_ELSE, McpMMPackage.TAREA_ANALISIS__SIGUE_ELSE);
		}
		return precedeElse;
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
			case McpMMPackage.TAREA__PRECEDE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPrecede()).basicAdd(otherEnd, msgs);
			case McpMMPackage.TAREA__SIGUE:
				if (sigue != null)
					msgs = ((InternalEObject)sigue).eInverseRemove(this, McpMMPackage.TAREA__PRECEDE, Tarea.class, msgs);
				return basicSetSigue((Tarea)otherEnd, msgs);
			case McpMMPackage.TAREA__PRECEDE_ELSE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPrecedeElse()).basicAdd(otherEnd, msgs);
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
			case McpMMPackage.TAREA__ACCION:
				return ((InternalEList<?>)getAccion()).basicRemove(otherEnd, msgs);
			case McpMMPackage.TAREA__PRECEDE:
				return ((InternalEList<?>)getPrecede()).basicRemove(otherEnd, msgs);
			case McpMMPackage.TAREA__SIGUE:
				return basicSetSigue(null, msgs);
			case McpMMPackage.TAREA__PRECEDE_ELSE:
				return ((InternalEList<?>)getPrecedeElse()).basicRemove(otherEnd, msgs);
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
			case McpMMPackage.TAREA__NOMBRE_TAREA:
				return getNombreTarea();
			case McpMMPackage.TAREA__TASK_ID:
				return getTaskId();
			case McpMMPackage.TAREA__TASK_DESC:
				return getTaskDesc();
			case McpMMPackage.TAREA__ACCION:
				return getAccion();
			case McpMMPackage.TAREA__PRECEDE:
				return getPrecede();
			case McpMMPackage.TAREA__SIGUE:
				if (resolve) return getSigue();
				return basicGetSigue();
			case McpMMPackage.TAREA__PRECEDE_ELSE:
				return getPrecedeElse();
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
			case McpMMPackage.TAREA__NOMBRE_TAREA:
				setNombreTarea((String)newValue);
				return;
			case McpMMPackage.TAREA__TASK_ID:
				setTaskId((Integer)newValue);
				return;
			case McpMMPackage.TAREA__TASK_DESC:
				setTaskDesc((String)newValue);
				return;
			case McpMMPackage.TAREA__ACCION:
				getAccion().clear();
				getAccion().addAll((Collection<? extends Accion>)newValue);
				return;
			case McpMMPackage.TAREA__PRECEDE:
				getPrecede().clear();
				getPrecede().addAll((Collection<? extends Tarea>)newValue);
				return;
			case McpMMPackage.TAREA__SIGUE:
				setSigue((Tarea)newValue);
				return;
			case McpMMPackage.TAREA__PRECEDE_ELSE:
				getPrecedeElse().clear();
				getPrecedeElse().addAll((Collection<? extends TareaAnalisis>)newValue);
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
			case McpMMPackage.TAREA__NOMBRE_TAREA:
				setNombreTarea(NOMBRE_TAREA_EDEFAULT);
				return;
			case McpMMPackage.TAREA__TASK_ID:
				setTaskId(TASK_ID_EDEFAULT);
				return;
			case McpMMPackage.TAREA__TASK_DESC:
				setTaskDesc(TASK_DESC_EDEFAULT);
				return;
			case McpMMPackage.TAREA__ACCION:
				getAccion().clear();
				return;
			case McpMMPackage.TAREA__PRECEDE:
				getPrecede().clear();
				return;
			case McpMMPackage.TAREA__SIGUE:
				setSigue((Tarea)null);
				return;
			case McpMMPackage.TAREA__PRECEDE_ELSE:
				getPrecedeElse().clear();
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
			case McpMMPackage.TAREA__NOMBRE_TAREA:
				return NOMBRE_TAREA_EDEFAULT == null ? nombreTarea != null : !NOMBRE_TAREA_EDEFAULT.equals(nombreTarea);
			case McpMMPackage.TAREA__TASK_ID:
				return taskId != TASK_ID_EDEFAULT;
			case McpMMPackage.TAREA__TASK_DESC:
				return TASK_DESC_EDEFAULT == null ? taskDesc != null : !TASK_DESC_EDEFAULT.equals(taskDesc);
			case McpMMPackage.TAREA__ACCION:
				return accion != null && !accion.isEmpty();
			case McpMMPackage.TAREA__PRECEDE:
				return precede != null && !precede.isEmpty();
			case McpMMPackage.TAREA__SIGUE:
				return sigue != null;
			case McpMMPackage.TAREA__PRECEDE_ELSE:
				return precedeElse != null && !precedeElse.isEmpty();
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
		result.append(" (nombreTarea: ");
		result.append(nombreTarea);
		result.append(", taskId: ");
		result.append(taskId);
		result.append(", taskDesc: ");
		result.append(taskDesc);
		result.append(')');
		return result.toString();
	}

} //TareaImpl
