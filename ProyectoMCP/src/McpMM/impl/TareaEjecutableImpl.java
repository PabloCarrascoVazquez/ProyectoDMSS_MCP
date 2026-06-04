/**
 */
package McpMM.impl;

import McpMM.McpMMPackage;
import McpMM.TareaEjecutable;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tarea Ejecutable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link McpMM.impl.TareaEjecutableImpl#getIdTarea <em>Id Tarea</em>}</li>
 *   <li>{@link McpMM.impl.TareaEjecutableImpl#getDescTarea <em>Desc Tarea</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TareaEjecutableImpl extends TareaImpl implements TareaEjecutable {
	/**
	 * The default value of the '{@link #getIdTarea() <em>Id Tarea</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdTarea()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_TAREA_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIdTarea() <em>Id Tarea</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdTarea()
	 * @generated
	 * @ordered
	 */
	protected int idTarea = ID_TAREA_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescTarea() <em>Desc Tarea</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescTarea()
	 * @generated
	 * @ordered
	 */
	protected static final String DESC_TAREA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescTarea() <em>Desc Tarea</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescTarea()
	 * @generated
	 * @ordered
	 */
	protected String descTarea = DESC_TAREA_EDEFAULT;

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
	public int getIdTarea() {
		return idTarea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdTarea(int newIdTarea) {
		int oldIdTarea = idTarea;
		idTarea = newIdTarea;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, McpMMPackage.TAREA_EJECUTABLE__ID_TAREA, oldIdTarea, idTarea));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescTarea() {
		return descTarea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescTarea(String newDescTarea) {
		String oldDescTarea = descTarea;
		descTarea = newDescTarea;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, McpMMPackage.TAREA_EJECUTABLE__DESC_TAREA, oldDescTarea, descTarea));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case McpMMPackage.TAREA_EJECUTABLE__ID_TAREA:
				return getIdTarea();
			case McpMMPackage.TAREA_EJECUTABLE__DESC_TAREA:
				return getDescTarea();
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
			case McpMMPackage.TAREA_EJECUTABLE__ID_TAREA:
				setIdTarea((Integer)newValue);
				return;
			case McpMMPackage.TAREA_EJECUTABLE__DESC_TAREA:
				setDescTarea((String)newValue);
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
			case McpMMPackage.TAREA_EJECUTABLE__ID_TAREA:
				setIdTarea(ID_TAREA_EDEFAULT);
				return;
			case McpMMPackage.TAREA_EJECUTABLE__DESC_TAREA:
				setDescTarea(DESC_TAREA_EDEFAULT);
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
			case McpMMPackage.TAREA_EJECUTABLE__ID_TAREA:
				return idTarea != ID_TAREA_EDEFAULT;
			case McpMMPackage.TAREA_EJECUTABLE__DESC_TAREA:
				return DESC_TAREA_EDEFAULT == null ? descTarea != null : !DESC_TAREA_EDEFAULT.equals(descTarea);
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
		result.append(" (idTarea: ");
		result.append(idTarea);
		result.append(", descTarea: ");
		result.append(descTarea);
		result.append(')');
		return result.toString();
	}

} //TareaEjecutableImpl
