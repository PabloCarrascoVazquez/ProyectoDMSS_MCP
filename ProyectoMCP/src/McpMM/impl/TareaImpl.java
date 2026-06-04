/**
 */
package McpMM.impl;

import McpMM.Accion;
import McpMM.Agente;
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
 *   <li>{@link McpMM.impl.TareaImpl#getAccion <em>Accion</em>}</li>
 *   <li>{@link McpMM.impl.TareaImpl#getPrecede <em>Precede</em>}</li>
 *   <li>{@link McpMM.impl.TareaImpl#getSigue <em>Sigue</em>}</li>
 *   <li>{@link McpMM.impl.TareaImpl#getPrecedeElse <em>Precede Else</em>}</li>
 *   <li>{@link McpMM.impl.TareaImpl#getAgenteAsignado <em>Agente Asignado</em>}</li>
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
	 * The cached value of the '{@link #getAccion() <em>Accion</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccion()
	 * @generated
	 * @ordered
	 */
	protected EList<Accion> accion;

	/**
	 * The cached value of the '{@link #getPrecede() <em>Precede</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecede()
	 * @generated
	 * @ordered
	 */
	protected Tarea precede;

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
	 * The cached value of the '{@link #getPrecedeElse() <em>Precede Else</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecedeElse()
	 * @generated
	 * @ordered
	 */
	protected TareaAnalisis precedeElse;

	/**
	 * The cached value of the '{@link #getAgenteAsignado() <em>Agente Asignado</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgenteAsignado()
	 * @generated
	 * @ordered
	 */
	protected Agente agenteAsignado;

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
	public Tarea getPrecede() {
		if (precede != null && precede.eIsProxy()) {
			InternalEObject oldPrecede = (InternalEObject)precede;
			precede = (Tarea)eResolveProxy(oldPrecede);
			if (precede != oldPrecede) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, McpMMPackage.TAREA__PRECEDE, oldPrecede, precede));
			}
		}
		return precede;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tarea basicGetPrecede() {
		return precede;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrecede(Tarea newPrecede, NotificationChain msgs) {
		Tarea oldPrecede = precede;
		precede = newPrecede;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, McpMMPackage.TAREA__PRECEDE, oldPrecede, newPrecede);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrecede(Tarea newPrecede) {
		if (newPrecede != precede) {
			NotificationChain msgs = null;
			if (precede != null)
				msgs = ((InternalEObject)precede).eInverseRemove(this, McpMMPackage.TAREA__SIGUE, Tarea.class, msgs);
			if (newPrecede != null)
				msgs = ((InternalEObject)newPrecede).eInverseAdd(this, McpMMPackage.TAREA__SIGUE, Tarea.class, msgs);
			msgs = basicSetPrecede(newPrecede, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, McpMMPackage.TAREA__PRECEDE, newPrecede, newPrecede));
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
	public TareaAnalisis getPrecedeElse() {
		if (precedeElse != null && precedeElse.eIsProxy()) {
			InternalEObject oldPrecedeElse = (InternalEObject)precedeElse;
			precedeElse = (TareaAnalisis)eResolveProxy(oldPrecedeElse);
			if (precedeElse != oldPrecedeElse) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, McpMMPackage.TAREA__PRECEDE_ELSE, oldPrecedeElse, precedeElse));
			}
		}
		return precedeElse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TareaAnalisis basicGetPrecedeElse() {
		return precedeElse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrecedeElse(TareaAnalisis newPrecedeElse, NotificationChain msgs) {
		TareaAnalisis oldPrecedeElse = precedeElse;
		precedeElse = newPrecedeElse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, McpMMPackage.TAREA__PRECEDE_ELSE, oldPrecedeElse, newPrecedeElse);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrecedeElse(TareaAnalisis newPrecedeElse) {
		if (newPrecedeElse != precedeElse) {
			NotificationChain msgs = null;
			if (precedeElse != null)
				msgs = ((InternalEObject)precedeElse).eInverseRemove(this, McpMMPackage.TAREA_ANALISIS__SIGUE_ELSE, TareaAnalisis.class, msgs);
			if (newPrecedeElse != null)
				msgs = ((InternalEObject)newPrecedeElse).eInverseAdd(this, McpMMPackage.TAREA_ANALISIS__SIGUE_ELSE, TareaAnalisis.class, msgs);
			msgs = basicSetPrecedeElse(newPrecedeElse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, McpMMPackage.TAREA__PRECEDE_ELSE, newPrecedeElse, newPrecedeElse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Agente getAgenteAsignado() {
		if (agenteAsignado != null && agenteAsignado.eIsProxy()) {
			InternalEObject oldAgenteAsignado = (InternalEObject)agenteAsignado;
			agenteAsignado = (Agente)eResolveProxy(oldAgenteAsignado);
			if (agenteAsignado != oldAgenteAsignado) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, McpMMPackage.TAREA__AGENTE_ASIGNADO, oldAgenteAsignado, agenteAsignado));
			}
		}
		return agenteAsignado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Agente basicGetAgenteAsignado() {
		return agenteAsignado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAgenteAsignado(Agente newAgenteAsignado, NotificationChain msgs) {
		Agente oldAgenteAsignado = agenteAsignado;
		agenteAsignado = newAgenteAsignado;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, McpMMPackage.TAREA__AGENTE_ASIGNADO, oldAgenteAsignado, newAgenteAsignado);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAgenteAsignado(Agente newAgenteAsignado) {
		if (newAgenteAsignado != agenteAsignado) {
			NotificationChain msgs = null;
			if (agenteAsignado != null)
				msgs = ((InternalEObject)agenteAsignado).eInverseRemove(this, McpMMPackage.AGENTE__REALIZA, Agente.class, msgs);
			if (newAgenteAsignado != null)
				msgs = ((InternalEObject)newAgenteAsignado).eInverseAdd(this, McpMMPackage.AGENTE__REALIZA, Agente.class, msgs);
			msgs = basicSetAgenteAsignado(newAgenteAsignado, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, McpMMPackage.TAREA__AGENTE_ASIGNADO, newAgenteAsignado, newAgenteAsignado));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case McpMMPackage.TAREA__PRECEDE:
				if (precede != null)
					msgs = ((InternalEObject)precede).eInverseRemove(this, McpMMPackage.TAREA__SIGUE, Tarea.class, msgs);
				return basicSetPrecede((Tarea)otherEnd, msgs);
			case McpMMPackage.TAREA__SIGUE:
				if (sigue != null)
					msgs = ((InternalEObject)sigue).eInverseRemove(this, McpMMPackage.TAREA__PRECEDE, Tarea.class, msgs);
				return basicSetSigue((Tarea)otherEnd, msgs);
			case McpMMPackage.TAREA__PRECEDE_ELSE:
				if (precedeElse != null)
					msgs = ((InternalEObject)precedeElse).eInverseRemove(this, McpMMPackage.TAREA_ANALISIS__SIGUE_ELSE, TareaAnalisis.class, msgs);
				return basicSetPrecedeElse((TareaAnalisis)otherEnd, msgs);
			case McpMMPackage.TAREA__AGENTE_ASIGNADO:
				if (agenteAsignado != null)
					msgs = ((InternalEObject)agenteAsignado).eInverseRemove(this, McpMMPackage.AGENTE__REALIZA, Agente.class, msgs);
				return basicSetAgenteAsignado((Agente)otherEnd, msgs);
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
				return basicSetPrecede(null, msgs);
			case McpMMPackage.TAREA__SIGUE:
				return basicSetSigue(null, msgs);
			case McpMMPackage.TAREA__PRECEDE_ELSE:
				return basicSetPrecedeElse(null, msgs);
			case McpMMPackage.TAREA__AGENTE_ASIGNADO:
				return basicSetAgenteAsignado(null, msgs);
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
			case McpMMPackage.TAREA__ACCION:
				return getAccion();
			case McpMMPackage.TAREA__PRECEDE:
				if (resolve) return getPrecede();
				return basicGetPrecede();
			case McpMMPackage.TAREA__SIGUE:
				if (resolve) return getSigue();
				return basicGetSigue();
			case McpMMPackage.TAREA__PRECEDE_ELSE:
				if (resolve) return getPrecedeElse();
				return basicGetPrecedeElse();
			case McpMMPackage.TAREA__AGENTE_ASIGNADO:
				if (resolve) return getAgenteAsignado();
				return basicGetAgenteAsignado();
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
			case McpMMPackage.TAREA__ACCION:
				getAccion().clear();
				getAccion().addAll((Collection<? extends Accion>)newValue);
				return;
			case McpMMPackage.TAREA__PRECEDE:
				setPrecede((Tarea)newValue);
				return;
			case McpMMPackage.TAREA__SIGUE:
				setSigue((Tarea)newValue);
				return;
			case McpMMPackage.TAREA__PRECEDE_ELSE:
				setPrecedeElse((TareaAnalisis)newValue);
				return;
			case McpMMPackage.TAREA__AGENTE_ASIGNADO:
				setAgenteAsignado((Agente)newValue);
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
			case McpMMPackage.TAREA__ACCION:
				getAccion().clear();
				return;
			case McpMMPackage.TAREA__PRECEDE:
				setPrecede((Tarea)null);
				return;
			case McpMMPackage.TAREA__SIGUE:
				setSigue((Tarea)null);
				return;
			case McpMMPackage.TAREA__PRECEDE_ELSE:
				setPrecedeElse((TareaAnalisis)null);
				return;
			case McpMMPackage.TAREA__AGENTE_ASIGNADO:
				setAgenteAsignado((Agente)null);
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
			case McpMMPackage.TAREA__ACCION:
				return accion != null && !accion.isEmpty();
			case McpMMPackage.TAREA__PRECEDE:
				return precede != null;
			case McpMMPackage.TAREA__SIGUE:
				return sigue != null;
			case McpMMPackage.TAREA__PRECEDE_ELSE:
				return precedeElse != null;
			case McpMMPackage.TAREA__AGENTE_ASIGNADO:
				return agenteAsignado != null;
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
		result.append(')');
		return result.toString();
	}

} //TareaImpl
