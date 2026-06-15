/**
 */
package McpMM.impl;

import McpMM.McpMMPackage;
import McpMM.OperacionMCP;
import McpMM.ServerMCP;

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
 * An implementation of the model object '<em><b>Server MCP</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link McpMM.impl.ServerMCPImpl#getNombreServer <em>Nombre Server</em>}</li>
 *   <li>{@link McpMM.impl.ServerMCPImpl#getOperaciones <em>Operaciones</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServerMCPImpl extends EObjectImpl implements ServerMCP {
	/**
	 * The default value of the '{@link #getNombreServer() <em>Nombre Server</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreServer()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_SERVER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombreServer() <em>Nombre Server</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreServer()
	 * @generated
	 * @ordered
	 */
	protected String nombreServer = NOMBRE_SERVER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOperaciones() <em>Operaciones</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperaciones()
	 * @generated
	 * @ordered
	 */
	protected EList<OperacionMCP> operaciones;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServerMCPImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return McpMMPackage.Literals.SERVER_MCP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNombreServer() {
		return nombreServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreServer(String newNombreServer) {
		String oldNombreServer = nombreServer;
		nombreServer = newNombreServer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, McpMMPackage.SERVER_MCP__NOMBRE_SERVER, oldNombreServer, nombreServer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperacionMCP> getOperaciones() {
		if (operaciones == null) {
			operaciones = new EObjectContainmentEList<OperacionMCP>(OperacionMCP.class, this, McpMMPackage.SERVER_MCP__OPERACIONES);
		}
		return operaciones;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case McpMMPackage.SERVER_MCP__OPERACIONES:
				return ((InternalEList<?>)getOperaciones()).basicRemove(otherEnd, msgs);
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
			case McpMMPackage.SERVER_MCP__NOMBRE_SERVER:
				return getNombreServer();
			case McpMMPackage.SERVER_MCP__OPERACIONES:
				return getOperaciones();
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
			case McpMMPackage.SERVER_MCP__NOMBRE_SERVER:
				setNombreServer((String)newValue);
				return;
			case McpMMPackage.SERVER_MCP__OPERACIONES:
				getOperaciones().clear();
				getOperaciones().addAll((Collection<? extends OperacionMCP>)newValue);
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
			case McpMMPackage.SERVER_MCP__NOMBRE_SERVER:
				setNombreServer(NOMBRE_SERVER_EDEFAULT);
				return;
			case McpMMPackage.SERVER_MCP__OPERACIONES:
				getOperaciones().clear();
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
			case McpMMPackage.SERVER_MCP__NOMBRE_SERVER:
				return NOMBRE_SERVER_EDEFAULT == null ? nombreServer != null : !NOMBRE_SERVER_EDEFAULT.equals(nombreServer);
			case McpMMPackage.SERVER_MCP__OPERACIONES:
				return operaciones != null && !operaciones.isEmpty();
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
		result.append(" (nombreServer: ");
		result.append(nombreServer);
		result.append(')');
		return result.toString();
	}

} //ServerMCPImpl
