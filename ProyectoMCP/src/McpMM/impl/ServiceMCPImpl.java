/**
 */
package McpMM.impl;

import McpMM.Agente;
import McpMM.McpMMPackage;
import McpMM.ServerMCP;
import McpMM.ServiceMCP;
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
 * An implementation of the model object '<em><b>Service MCP</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link McpMM.impl.ServiceMCPImpl#getNombreServicio <em>Nombre Servicio</em>}</li>
 *   <li>{@link McpMM.impl.ServiceMCPImpl#getServermcp <em>Servermcp</em>}</li>
 *   <li>{@link McpMM.impl.ServiceMCPImpl#getAgente <em>Agente</em>}</li>
 *   <li>{@link McpMM.impl.ServiceMCPImpl#getWorkflow <em>Workflow</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceMCPImpl extends EObjectImpl implements ServiceMCP {
	/**
	 * The default value of the '{@link #getNombreServicio() <em>Nombre Servicio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreServicio()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_SERVICIO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombreServicio() <em>Nombre Servicio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreServicio()
	 * @generated
	 * @ordered
	 */
	protected String nombreServicio = NOMBRE_SERVICIO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getServermcp() <em>Servermcp</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServermcp()
	 * @generated
	 * @ordered
	 */
	protected EList<ServerMCP> servermcp;

	/**
	 * The cached value of the '{@link #getAgente() <em>Agente</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgente()
	 * @generated
	 * @ordered
	 */
	protected EList<Agente> agente;

	/**
	 * The cached value of the '{@link #getWorkflow() <em>Workflow</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkflow()
	 * @generated
	 * @ordered
	 */
	protected EList<Workflow> workflow;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceMCPImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return McpMMPackage.Literals.SERVICE_MCP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNombreServicio() {
		return nombreServicio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreServicio(String newNombreServicio) {
		String oldNombreServicio = nombreServicio;
		nombreServicio = newNombreServicio;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, McpMMPackage.SERVICE_MCP__NOMBRE_SERVICIO, oldNombreServicio, nombreServicio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServerMCP> getServermcp() {
		if (servermcp == null) {
			servermcp = new EObjectContainmentEList<ServerMCP>(ServerMCP.class, this, McpMMPackage.SERVICE_MCP__SERVERMCP);
		}
		return servermcp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Agente> getAgente() {
		if (agente == null) {
			agente = new EObjectContainmentEList<Agente>(Agente.class, this, McpMMPackage.SERVICE_MCP__AGENTE);
		}
		return agente;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Workflow> getWorkflow() {
		if (workflow == null) {
			workflow = new EObjectContainmentEList<Workflow>(Workflow.class, this, McpMMPackage.SERVICE_MCP__WORKFLOW);
		}
		return workflow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case McpMMPackage.SERVICE_MCP__SERVERMCP:
				return ((InternalEList<?>)getServermcp()).basicRemove(otherEnd, msgs);
			case McpMMPackage.SERVICE_MCP__AGENTE:
				return ((InternalEList<?>)getAgente()).basicRemove(otherEnd, msgs);
			case McpMMPackage.SERVICE_MCP__WORKFLOW:
				return ((InternalEList<?>)getWorkflow()).basicRemove(otherEnd, msgs);
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
			case McpMMPackage.SERVICE_MCP__NOMBRE_SERVICIO:
				return getNombreServicio();
			case McpMMPackage.SERVICE_MCP__SERVERMCP:
				return getServermcp();
			case McpMMPackage.SERVICE_MCP__AGENTE:
				return getAgente();
			case McpMMPackage.SERVICE_MCP__WORKFLOW:
				return getWorkflow();
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
			case McpMMPackage.SERVICE_MCP__NOMBRE_SERVICIO:
				setNombreServicio((String)newValue);
				return;
			case McpMMPackage.SERVICE_MCP__SERVERMCP:
				getServermcp().clear();
				getServermcp().addAll((Collection<? extends ServerMCP>)newValue);
				return;
			case McpMMPackage.SERVICE_MCP__AGENTE:
				getAgente().clear();
				getAgente().addAll((Collection<? extends Agente>)newValue);
				return;
			case McpMMPackage.SERVICE_MCP__WORKFLOW:
				getWorkflow().clear();
				getWorkflow().addAll((Collection<? extends Workflow>)newValue);
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
			case McpMMPackage.SERVICE_MCP__NOMBRE_SERVICIO:
				setNombreServicio(NOMBRE_SERVICIO_EDEFAULT);
				return;
			case McpMMPackage.SERVICE_MCP__SERVERMCP:
				getServermcp().clear();
				return;
			case McpMMPackage.SERVICE_MCP__AGENTE:
				getAgente().clear();
				return;
			case McpMMPackage.SERVICE_MCP__WORKFLOW:
				getWorkflow().clear();
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
			case McpMMPackage.SERVICE_MCP__NOMBRE_SERVICIO:
				return NOMBRE_SERVICIO_EDEFAULT == null ? nombreServicio != null : !NOMBRE_SERVICIO_EDEFAULT.equals(nombreServicio);
			case McpMMPackage.SERVICE_MCP__SERVERMCP:
				return servermcp != null && !servermcp.isEmpty();
			case McpMMPackage.SERVICE_MCP__AGENTE:
				return agente != null && !agente.isEmpty();
			case McpMMPackage.SERVICE_MCP__WORKFLOW:
				return workflow != null && !workflow.isEmpty();
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
		result.append(" (nombreServicio: ");
		result.append(nombreServicio);
		result.append(')');
		return result.toString();
	}

} //ServiceMCPImpl
