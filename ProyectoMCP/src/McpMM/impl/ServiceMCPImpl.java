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
 *   <li>{@link McpMM.impl.ServiceMCPImpl#getAgentes <em>Agentes</em>}</li>
 *   <li>{@link McpMM.impl.ServiceMCPImpl#getServicios <em>Servicios</em>}</li>
 *   <li>{@link McpMM.impl.ServiceMCPImpl#getServidores <em>Servidores</em>}</li>
 *   <li>{@link McpMM.impl.ServiceMCPImpl#getWorkflows <em>Workflows</em>}</li>
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
	 * The cached value of the '{@link #getAgentes() <em>Agentes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgentes()
	 * @generated
	 * @ordered
	 */
	protected EList<Agente> agentes;

	/**
	 * The cached value of the '{@link #getServicios() <em>Servicios</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServicios()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceMCP> servicios;

	/**
	 * The cached value of the '{@link #getServidores() <em>Servidores</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServidores()
	 * @generated
	 * @ordered
	 */
	protected EList<ServerMCP> servidores;

	/**
	 * The cached value of the '{@link #getWorkflows() <em>Workflows</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkflows()
	 * @generated
	 * @ordered
	 */
	protected EList<Workflow> workflows;

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
	public EList<Agente> getAgentes() {
		if (agentes == null) {
			agentes = new EObjectContainmentEList<Agente>(Agente.class, this, McpMMPackage.SERVICE_MCP__AGENTES);
		}
		return agentes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceMCP> getServicios() {
		if (servicios == null) {
			servicios = new EObjectContainmentEList<ServiceMCP>(ServiceMCP.class, this, McpMMPackage.SERVICE_MCP__SERVICIOS);
		}
		return servicios;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServerMCP> getServidores() {
		if (servidores == null) {
			servidores = new EObjectContainmentEList<ServerMCP>(ServerMCP.class, this, McpMMPackage.SERVICE_MCP__SERVIDORES);
		}
		return servidores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Workflow> getWorkflows() {
		if (workflows == null) {
			workflows = new EObjectContainmentEList<Workflow>(Workflow.class, this, McpMMPackage.SERVICE_MCP__WORKFLOWS);
		}
		return workflows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case McpMMPackage.SERVICE_MCP__AGENTES:
				return ((InternalEList<?>)getAgentes()).basicRemove(otherEnd, msgs);
			case McpMMPackage.SERVICE_MCP__SERVICIOS:
				return ((InternalEList<?>)getServicios()).basicRemove(otherEnd, msgs);
			case McpMMPackage.SERVICE_MCP__SERVIDORES:
				return ((InternalEList<?>)getServidores()).basicRemove(otherEnd, msgs);
			case McpMMPackage.SERVICE_MCP__WORKFLOWS:
				return ((InternalEList<?>)getWorkflows()).basicRemove(otherEnd, msgs);
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
			case McpMMPackage.SERVICE_MCP__AGENTES:
				return getAgentes();
			case McpMMPackage.SERVICE_MCP__SERVICIOS:
				return getServicios();
			case McpMMPackage.SERVICE_MCP__SERVIDORES:
				return getServidores();
			case McpMMPackage.SERVICE_MCP__WORKFLOWS:
				return getWorkflows();
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
			case McpMMPackage.SERVICE_MCP__AGENTES:
				getAgentes().clear();
				getAgentes().addAll((Collection<? extends Agente>)newValue);
				return;
			case McpMMPackage.SERVICE_MCP__SERVICIOS:
				getServicios().clear();
				getServicios().addAll((Collection<? extends ServiceMCP>)newValue);
				return;
			case McpMMPackage.SERVICE_MCP__SERVIDORES:
				getServidores().clear();
				getServidores().addAll((Collection<? extends ServerMCP>)newValue);
				return;
			case McpMMPackage.SERVICE_MCP__WORKFLOWS:
				getWorkflows().clear();
				getWorkflows().addAll((Collection<? extends Workflow>)newValue);
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
			case McpMMPackage.SERVICE_MCP__AGENTES:
				getAgentes().clear();
				return;
			case McpMMPackage.SERVICE_MCP__SERVICIOS:
				getServicios().clear();
				return;
			case McpMMPackage.SERVICE_MCP__SERVIDORES:
				getServidores().clear();
				return;
			case McpMMPackage.SERVICE_MCP__WORKFLOWS:
				getWorkflows().clear();
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
			case McpMMPackage.SERVICE_MCP__AGENTES:
				return agentes != null && !agentes.isEmpty();
			case McpMMPackage.SERVICE_MCP__SERVICIOS:
				return servicios != null && !servicios.isEmpty();
			case McpMMPackage.SERVICE_MCP__SERVIDORES:
				return servidores != null && !servidores.isEmpty();
			case McpMMPackage.SERVICE_MCP__WORKFLOWS:
				return workflows != null && !workflows.isEmpty();
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
