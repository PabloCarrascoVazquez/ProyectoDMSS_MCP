/**
 */
package McpMM.impl;

import McpMM.Agente;
import McpMM.McpMMPackage;
import McpMM.Tarea;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
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
 *   <li>{@link McpMM.impl.AgenteImpl#getNombreAgente <em>Nombre Agente</em>}</li>
 *   <li>{@link McpMM.impl.AgenteImpl#getNumTareas <em>Num Tareas</em>}</li>
 *   <li>{@link McpMM.impl.AgenteImpl#getRealiza <em>Realiza</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AgenteImpl extends EObjectImpl implements Agente {
	/**
	 * The default value of the '{@link #getNombreAgente() <em>Nombre Agente</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreAgente()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_AGENTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombreAgente() <em>Nombre Agente</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreAgente()
	 * @generated
	 * @ordered
	 */
	protected String nombreAgente = NOMBRE_AGENTE_EDEFAULT;

	/**
	 * The cached setting delegate for the '{@link #getNumTareas() <em>Num Tareas</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumTareas()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate NUM_TAREAS__ESETTING_DELEGATE = ((EStructuralFeature.Internal)McpMMPackage.Literals.AGENTE__NUM_TAREAS).getSettingDelegate();

	/**
	 * The cached value of the '{@link #getRealiza() <em>Realiza</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealiza()
	 * @generated
	 * @ordered
	 */
	protected EList<Tarea> realiza;

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
	public String getNombreAgente() {
		return nombreAgente;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreAgente(String newNombreAgente) {
		String oldNombreAgente = nombreAgente;
		nombreAgente = newNombreAgente;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, McpMMPackage.AGENTE__NOMBRE_AGENTE, oldNombreAgente, nombreAgente));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumTareas() {
		return (Integer)NUM_TAREAS__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumTareas(int newNumTareas) {
		NUM_TAREAS__ESETTING_DELEGATE.dynamicSet(this, null, 0, newNumTareas);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tarea> getRealiza() {
		if (realiza == null) {
			realiza = new EObjectWithInverseResolvingEList<Tarea>(Tarea.class, this, McpMMPackage.AGENTE__REALIZA, McpMMPackage.TAREA__AGENTE_ASIGNADO);
		}
		return realiza;
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
			case McpMMPackage.AGENTE__REALIZA:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRealiza()).basicAdd(otherEnd, msgs);
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
			case McpMMPackage.AGENTE__REALIZA:
				return ((InternalEList<?>)getRealiza()).basicRemove(otherEnd, msgs);
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
			case McpMMPackage.AGENTE__NOMBRE_AGENTE:
				return getNombreAgente();
			case McpMMPackage.AGENTE__NUM_TAREAS:
				return getNumTareas();
			case McpMMPackage.AGENTE__REALIZA:
				return getRealiza();
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
			case McpMMPackage.AGENTE__NOMBRE_AGENTE:
				setNombreAgente((String)newValue);
				return;
			case McpMMPackage.AGENTE__NUM_TAREAS:
				setNumTareas((Integer)newValue);
				return;
			case McpMMPackage.AGENTE__REALIZA:
				getRealiza().clear();
				getRealiza().addAll((Collection<? extends Tarea>)newValue);
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
			case McpMMPackage.AGENTE__NOMBRE_AGENTE:
				setNombreAgente(NOMBRE_AGENTE_EDEFAULT);
				return;
			case McpMMPackage.AGENTE__NUM_TAREAS:
				NUM_TAREAS__ESETTING_DELEGATE.dynamicUnset(this, null, 0);
				return;
			case McpMMPackage.AGENTE__REALIZA:
				getRealiza().clear();
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
			case McpMMPackage.AGENTE__NOMBRE_AGENTE:
				return NOMBRE_AGENTE_EDEFAULT == null ? nombreAgente != null : !NOMBRE_AGENTE_EDEFAULT.equals(nombreAgente);
			case McpMMPackage.AGENTE__NUM_TAREAS:
				return NUM_TAREAS__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case McpMMPackage.AGENTE__REALIZA:
				return realiza != null && !realiza.isEmpty();
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
		result.append(" (nombreAgente: ");
		result.append(nombreAgente);
		result.append(')');
		return result.toString();
	}

} //AgenteImpl
