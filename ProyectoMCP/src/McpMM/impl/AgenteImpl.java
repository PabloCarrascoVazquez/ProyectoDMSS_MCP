/**
 */
package McpMM.impl;

import McpMM.Agente;
import McpMM.Contexto;
import McpMM.McpMMPackage;
import McpMM.TareaEjecutable;
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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Agente</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link McpMM.impl.AgenteImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link McpMM.impl.AgenteImpl#getRol <em>Rol</em>}</li>
 *   <li>{@link McpMM.impl.AgenteImpl#getTareas <em>Tareas</em>}</li>
 *   <li>{@link McpMM.impl.AgenteImpl#getContextos <em>Contextos</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AgenteImpl extends EObjectImpl implements Agente {
	/**
	 * The default value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected String nombre = NOMBRE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRol() <em>Rol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRol()
	 * @generated
	 * @ordered
	 */
	protected static final String ROL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRol() <em>Rol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRol()
	 * @generated
	 * @ordered
	 */
	protected String rol = ROL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTareas() <em>Tareas</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTareas()
	 * @generated
	 * @ordered
	 */
	protected EList<TareaEjecutable> tareas;

	/**
	 * The cached value of the '{@link #getContextos() <em>Contextos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextos()
	 * @generated
	 * @ordered
	 */
	protected EList<Contexto> contextos;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AgenteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return McpMMPackage.Literals.AGENTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombre(String newNombre) {
		String oldNombre = nombre;
		nombre = newNombre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, McpMMPackage.AGENTE__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRol() {
		return rol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRol(String newRol) {
		String oldRol = rol;
		rol = newRol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, McpMMPackage.AGENTE__ROL, oldRol, rol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TareaEjecutable> getTareas() {
		if (tareas == null) {
			tareas = new EObjectWithInverseResolvingEList<TareaEjecutable>(TareaEjecutable.class, this, McpMMPackage.AGENTE__TAREAS, McpMMPackage.TAREA_EJECUTABLE__EJECUTADA_POR);
		}
		return tareas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Contexto> getContextos() {
		if (contextos == null) {
			contextos = new EObjectContainmentEList<Contexto>(Contexto.class, this, McpMMPackage.AGENTE__CONTEXTOS);
		}
		return contextos;
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
			case McpMMPackage.AGENTE__TAREAS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTareas()).basicAdd(otherEnd, msgs);
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
			case McpMMPackage.AGENTE__TAREAS:
				return ((InternalEList<?>)getTareas()).basicRemove(otherEnd, msgs);
			case McpMMPackage.AGENTE__CONTEXTOS:
				return ((InternalEList<?>)getContextos()).basicRemove(otherEnd, msgs);
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
			case McpMMPackage.AGENTE__NOMBRE:
				return getNombre();
			case McpMMPackage.AGENTE__ROL:
				return getRol();
			case McpMMPackage.AGENTE__TAREAS:
				return getTareas();
			case McpMMPackage.AGENTE__CONTEXTOS:
				return getContextos();
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
			case McpMMPackage.AGENTE__NOMBRE:
				setNombre((String)newValue);
				return;
			case McpMMPackage.AGENTE__ROL:
				setRol((String)newValue);
				return;
			case McpMMPackage.AGENTE__TAREAS:
				getTareas().clear();
				getTareas().addAll((Collection<? extends TareaEjecutable>)newValue);
				return;
			case McpMMPackage.AGENTE__CONTEXTOS:
				getContextos().clear();
				getContextos().addAll((Collection<? extends Contexto>)newValue);
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
			case McpMMPackage.AGENTE__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case McpMMPackage.AGENTE__ROL:
				setRol(ROL_EDEFAULT);
				return;
			case McpMMPackage.AGENTE__TAREAS:
				getTareas().clear();
				return;
			case McpMMPackage.AGENTE__CONTEXTOS:
				getContextos().clear();
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
			case McpMMPackage.AGENTE__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case McpMMPackage.AGENTE__ROL:
				return ROL_EDEFAULT == null ? rol != null : !ROL_EDEFAULT.equals(rol);
			case McpMMPackage.AGENTE__TAREAS:
				return tareas != null && !tareas.isEmpty();
			case McpMMPackage.AGENTE__CONTEXTOS:
				return contextos != null && !contextos.isEmpty();
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
		result.append(" (nombre: ");
		result.append(nombre);
		result.append(", rol: ");
		result.append(rol);
		result.append(')');
		return result.toString();
	}

} //AgenteImpl
