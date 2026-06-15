/**
 */
package McpMM.impl;

import McpMM.Accion;
import McpMM.Agente;
import McpMM.Contexto;
import McpMM.Escritura;
import McpMM.Final;
import McpMM.Inicio;
import McpMM.Lectura;
import McpMM.McpMMFactory;
import McpMM.McpMMPackage;
import McpMM.OperacionMCP;
import McpMM.Propiedad;
import McpMM.ServerMCP;
import McpMM.ServiceMCP;
import McpMM.Tarea;
import McpMM.TareaAnalisis;
import McpMM.TareaEjecutable;
import McpMM.TareaEnvioContexto;
import McpMM.TareaLLM;
import McpMM.TareaRecepcionContexto;
import McpMM.TareaServerMCP;
import McpMM.TareaTransformacionDatos;
import McpMM.TareaUsuario;
import McpMM.TipoContexto;
import McpMM.VersionContexto;
import McpMM.Workflow;

import McpMM.util.McpMMValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class McpMMPackageImpl extends EPackageImpl implements McpMMPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass versionContextoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceMCPEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serverMCPEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass agenteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propiedadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tareaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tareaEjecutableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inicioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass escrituraEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lecturaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operacionMCPEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tareaTransformacionDatosEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tareaLLMEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tareaUsuarioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tareaAnalisisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tareaEnvioContextoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tareaRecepcionContextoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tareaServerMCPEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tipoContextoEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see McpMM.McpMMPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private McpMMPackageImpl() {
		super(eNS_URI, McpMMFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link McpMMPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static McpMMPackage init() {
		if (isInited) return (McpMMPackage)EPackage.Registry.INSTANCE.getEPackage(McpMMPackage.eNS_URI);

		// Obtain or create and register package
		McpMMPackageImpl theMcpMMPackage = (McpMMPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof McpMMPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new McpMMPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theMcpMMPackage.createPackageContents();

		// Initialize created meta-data
		theMcpMMPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theMcpMMPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return McpMMValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theMcpMMPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(McpMMPackage.eNS_URI, theMcpMMPackage);
		return theMcpMMPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVersionContexto() {
		return versionContextoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVersionContexto_ValorAnterior() {
		return (EAttribute)versionContextoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVersionContexto_FechaModificacion() {
		return (EAttribute)versionContextoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVersionContexto_PropiedadAsociada() {
		return (EReference)versionContextoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceMCP() {
		return serviceMCPEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceMCP_NombreServicio() {
		return (EAttribute)serviceMCPEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceMCP_Agentes() {
		return (EReference)serviceMCPEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceMCP_Servicios() {
		return (EReference)serviceMCPEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceMCP_Servidores() {
		return (EReference)serviceMCPEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceMCP_Workflows() {
		return (EReference)serviceMCPEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServerMCP() {
		return serverMCPEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServerMCP_NombreServer() {
		return (EAttribute)serverMCPEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServerMCP_Operaciones() {
		return (EReference)serverMCPEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAgente() {
		return agenteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAgente_Nombre() {
		return (EAttribute)agenteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAgente_Rol() {
		return (EAttribute)agenteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAgente_Tareas() {
		return (EReference)agenteEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAgente_Contextos() {
		return (EReference)agenteEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkflow() {
		return workflowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkflow_NombreWorkflow() {
		return (EAttribute)workflowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkflow_Tareas() {
		return (EReference)workflowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContexto() {
		return contextoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContexto_NombreContexto() {
		return (EAttribute)contextoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContexto_Propiedades() {
		return (EReference)contextoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContexto_EsApuntadoPor() {
		return (EReference)contextoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropiedad() {
		return propiedadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropiedad_NombrePropiedad() {
		return (EAttribute)propiedadEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropiedad_TipoPropiedad() {
		return (EAttribute)propiedadEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropiedad_ExtensionPermitida() {
		return (EAttribute)propiedadEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropiedad_PesoMaxMB() {
		return (EAttribute)propiedadEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropiedad_EsUsada() {
		return (EReference)propiedadEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropiedad_Versiones() {
		return (EReference)propiedadEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTarea() {
		return tareaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTarea_NombreTarea() {
		return (EAttribute)tareaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTarea_TaskId() {
		return (EAttribute)tareaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTarea_TaskDesc() {
		return (EAttribute)tareaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTarea_Accion() {
		return (EReference)tareaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTarea_Precede() {
		return (EReference)tareaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTarea_Sigue() {
		return (EReference)tareaEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTarea_PrecedeElse() {
		return (EReference)tareaEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTareaEjecutable() {
		return tareaEjecutableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTareaEjecutable_EjecutadaPor() {
		return (EReference)tareaEjecutableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInicio() {
		return inicioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFinal() {
		return finalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAccion() {
		return accionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccion_NombreAccion() {
		return (EAttribute)accionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccion_Apunta() {
		return (EReference)accionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccion_Usa() {
		return (EReference)accionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEscritura() {
		return escrituraEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLectura() {
		return lecturaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperacionMCP() {
		return operacionMCPEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperacionMCP_NombreOperacion() {
		return (EAttribute)operacionMCPEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperacionMCP_DescOperacion() {
		return (EAttribute)operacionMCPEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperacionMCP_EsEjecutadaOperacion() {
		return (EReference)operacionMCPEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTareaTransformacionDatos() {
		return tareaTransformacionDatosEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTareaTransformacionDatos_Prompt() {
		return (EAttribute)tareaTransformacionDatosEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTareaLLM() {
		return tareaLLMEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTareaLLM_Prompt() {
		return (EAttribute)tareaLLMEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTareaUsuario() {
		return tareaUsuarioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTareaAnalisis() {
		return tareaAnalisisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTareaAnalisis_SigueElse() {
		return (EReference)tareaAnalisisEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTareaAnalisis_Prompt() {
		return (EAttribute)tareaAnalisisEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTareaEnvioContexto() {
		return tareaEnvioContextoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTareaRecepcionContexto() {
		return tareaRecepcionContextoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTareaServerMCP() {
		return tareaServerMCPEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTareaServerMCP_EjecutaOperacion() {
		return (EReference)tareaServerMCPEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTareaServerMCP_Prompt() {
		return (EAttribute)tareaServerMCPEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTipoContexto() {
		return tipoContextoEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public McpMMFactory getMcpMMFactory() {
		return (McpMMFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		versionContextoEClass = createEClass(VERSION_CONTEXTO);
		createEAttribute(versionContextoEClass, VERSION_CONTEXTO__VALOR_ANTERIOR);
		createEAttribute(versionContextoEClass, VERSION_CONTEXTO__FECHA_MODIFICACION);
		createEReference(versionContextoEClass, VERSION_CONTEXTO__PROPIEDAD_ASOCIADA);

		serviceMCPEClass = createEClass(SERVICE_MCP);
		createEAttribute(serviceMCPEClass, SERVICE_MCP__NOMBRE_SERVICIO);
		createEReference(serviceMCPEClass, SERVICE_MCP__AGENTES);
		createEReference(serviceMCPEClass, SERVICE_MCP__SERVICIOS);
		createEReference(serviceMCPEClass, SERVICE_MCP__SERVIDORES);
		createEReference(serviceMCPEClass, SERVICE_MCP__WORKFLOWS);

		serverMCPEClass = createEClass(SERVER_MCP);
		createEAttribute(serverMCPEClass, SERVER_MCP__NOMBRE_SERVER);
		createEReference(serverMCPEClass, SERVER_MCP__OPERACIONES);

		agenteEClass = createEClass(AGENTE);
		createEAttribute(agenteEClass, AGENTE__NOMBRE);
		createEAttribute(agenteEClass, AGENTE__ROL);
		createEReference(agenteEClass, AGENTE__TAREAS);
		createEReference(agenteEClass, AGENTE__CONTEXTOS);

		workflowEClass = createEClass(WORKFLOW);
		createEAttribute(workflowEClass, WORKFLOW__NOMBRE_WORKFLOW);
		createEReference(workflowEClass, WORKFLOW__TAREAS);

		contextoEClass = createEClass(CONTEXTO);
		createEAttribute(contextoEClass, CONTEXTO__NOMBRE_CONTEXTO);
		createEReference(contextoEClass, CONTEXTO__PROPIEDADES);
		createEReference(contextoEClass, CONTEXTO__ES_APUNTADO_POR);

		propiedadEClass = createEClass(PROPIEDAD);
		createEAttribute(propiedadEClass, PROPIEDAD__NOMBRE_PROPIEDAD);
		createEAttribute(propiedadEClass, PROPIEDAD__TIPO_PROPIEDAD);
		createEAttribute(propiedadEClass, PROPIEDAD__EXTENSION_PERMITIDA);
		createEAttribute(propiedadEClass, PROPIEDAD__PESO_MAX_MB);
		createEReference(propiedadEClass, PROPIEDAD__ES_USADA);
		createEReference(propiedadEClass, PROPIEDAD__VERSIONES);

		tareaEClass = createEClass(TAREA);
		createEAttribute(tareaEClass, TAREA__NOMBRE_TAREA);
		createEAttribute(tareaEClass, TAREA__TASK_ID);
		createEAttribute(tareaEClass, TAREA__TASK_DESC);
		createEReference(tareaEClass, TAREA__ACCION);
		createEReference(tareaEClass, TAREA__PRECEDE);
		createEReference(tareaEClass, TAREA__SIGUE);
		createEReference(tareaEClass, TAREA__PRECEDE_ELSE);

		tareaEjecutableEClass = createEClass(TAREA_EJECUTABLE);
		createEReference(tareaEjecutableEClass, TAREA_EJECUTABLE__EJECUTADA_POR);

		inicioEClass = createEClass(INICIO);

		finalEClass = createEClass(FINAL);

		accionEClass = createEClass(ACCION);
		createEAttribute(accionEClass, ACCION__NOMBRE_ACCION);
		createEReference(accionEClass, ACCION__APUNTA);
		createEReference(accionEClass, ACCION__USA);

		escrituraEClass = createEClass(ESCRITURA);

		lecturaEClass = createEClass(LECTURA);

		operacionMCPEClass = createEClass(OPERACION_MCP);
		createEAttribute(operacionMCPEClass, OPERACION_MCP__NOMBRE_OPERACION);
		createEAttribute(operacionMCPEClass, OPERACION_MCP__DESC_OPERACION);
		createEReference(operacionMCPEClass, OPERACION_MCP__ES_EJECUTADA_OPERACION);

		tareaTransformacionDatosEClass = createEClass(TAREA_TRANSFORMACION_DATOS);
		createEAttribute(tareaTransformacionDatosEClass, TAREA_TRANSFORMACION_DATOS__PROMPT);

		tareaLLMEClass = createEClass(TAREA_LLM);
		createEAttribute(tareaLLMEClass, TAREA_LLM__PROMPT);

		tareaUsuarioEClass = createEClass(TAREA_USUARIO);

		tareaAnalisisEClass = createEClass(TAREA_ANALISIS);
		createEReference(tareaAnalisisEClass, TAREA_ANALISIS__SIGUE_ELSE);
		createEAttribute(tareaAnalisisEClass, TAREA_ANALISIS__PROMPT);

		tareaEnvioContextoEClass = createEClass(TAREA_ENVIO_CONTEXTO);

		tareaRecepcionContextoEClass = createEClass(TAREA_RECEPCION_CONTEXTO);

		tareaServerMCPEClass = createEClass(TAREA_SERVER_MCP);
		createEReference(tareaServerMCPEClass, TAREA_SERVER_MCP__EJECUTA_OPERACION);
		createEAttribute(tareaServerMCPEClass, TAREA_SERVER_MCP__PROMPT);

		// Create enums
		tipoContextoEEnum = createEEnum(TIPO_CONTEXTO);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		tareaEjecutableEClass.getESuperTypes().add(this.getTarea());
		inicioEClass.getESuperTypes().add(this.getTarea());
		finalEClass.getESuperTypes().add(this.getTarea());
		escrituraEClass.getESuperTypes().add(this.getAccion());
		lecturaEClass.getESuperTypes().add(this.getAccion());
		tareaTransformacionDatosEClass.getESuperTypes().add(this.getTareaEjecutable());
		tareaLLMEClass.getESuperTypes().add(this.getTareaEjecutable());
		tareaUsuarioEClass.getESuperTypes().add(this.getTareaEjecutable());
		tareaAnalisisEClass.getESuperTypes().add(this.getTareaEjecutable());
		tareaEnvioContextoEClass.getESuperTypes().add(this.getTareaEjecutable());
		tareaRecepcionContextoEClass.getESuperTypes().add(this.getTareaEjecutable());
		tareaServerMCPEClass.getESuperTypes().add(this.getTareaEjecutable());

		// Initialize classes and features; add operations and parameters
		initEClass(versionContextoEClass, VersionContexto.class, "VersionContexto", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVersionContexto_ValorAnterior(), ecorePackage.getEString(), "valorAnterior", null, 0, 1, VersionContexto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVersionContexto_FechaModificacion(), ecorePackage.getEString(), "fechaModificacion", null, 0, 1, VersionContexto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVersionContexto_PropiedadAsociada(), this.getPropiedad(), this.getPropiedad_Versiones(), "propiedadAsociada", null, 0, 1, VersionContexto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceMCPEClass, ServiceMCP.class, "ServiceMCP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceMCP_NombreServicio(), ecorePackage.getEString(), "nombreServicio", null, 0, 1, ServiceMCP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceMCP_Agentes(), this.getAgente(), null, "agentes", null, 0, -1, ServiceMCP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceMCP_Servicios(), this.getServiceMCP(), null, "servicios", null, 0, -1, ServiceMCP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceMCP_Servidores(), this.getServerMCP(), null, "servidores", null, 0, -1, ServiceMCP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceMCP_Workflows(), this.getWorkflow(), null, "workflows", null, 0, -1, ServiceMCP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serverMCPEClass, ServerMCP.class, "ServerMCP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServerMCP_NombreServer(), ecorePackage.getEString(), "nombreServer", null, 0, 1, ServerMCP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServerMCP_Operaciones(), this.getOperacionMCP(), null, "operaciones", null, 0, -1, ServerMCP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(agenteEClass, Agente.class, "Agente", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAgente_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, Agente.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgente_Rol(), ecorePackage.getEString(), "rol", null, 0, 1, Agente.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAgente_Tareas(), this.getTareaEjecutable(), this.getTareaEjecutable_EjecutadaPor(), "tareas", null, 0, -1, Agente.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAgente_Contextos(), this.getContexto(), null, "contextos", null, 0, -1, Agente.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workflowEClass, Workflow.class, "Workflow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWorkflow_NombreWorkflow(), ecorePackage.getEString(), "nombreWorkflow", null, 0, 1, Workflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflow_Tareas(), this.getTarea(), null, "tareas", null, 1, -1, Workflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contextoEClass, Contexto.class, "Contexto", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContexto_NombreContexto(), ecorePackage.getEString(), "nombreContexto", null, 0, 1, Contexto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContexto_Propiedades(), this.getPropiedad(), null, "propiedades", null, 0, -1, Contexto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContexto_EsApuntadoPor(), this.getAccion(), this.getAccion_Apunta(), "esApuntadoPor", null, 0, -1, Contexto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propiedadEClass, Propiedad.class, "Propiedad", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPropiedad_NombrePropiedad(), ecorePackage.getEString(), "nombrePropiedad", null, 0, 1, Propiedad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropiedad_TipoPropiedad(), this.getTipoContexto(), "tipoPropiedad", null, 0, 1, Propiedad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropiedad_ExtensionPermitida(), ecorePackage.getEString(), "extensionPermitida", null, 0, 1, Propiedad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropiedad_PesoMaxMB(), ecorePackage.getEInt(), "pesoMaxMB", null, 0, 1, Propiedad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropiedad_EsUsada(), this.getAccion(), this.getAccion_Usa(), "esUsada", null, 0, -1, Propiedad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropiedad_Versiones(), this.getVersionContexto(), this.getVersionContexto_PropiedadAsociada(), "versiones", null, 0, -1, Propiedad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tareaEClass, Tarea.class, "Tarea", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTarea_NombreTarea(), ecorePackage.getEString(), "nombreTarea", null, 0, 1, Tarea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTarea_TaskId(), ecorePackage.getEInt(), "taskId", null, 0, 1, Tarea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTarea_TaskDesc(), ecorePackage.getEString(), "taskDesc", null, 0, 1, Tarea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTarea_Accion(), this.getAccion(), null, "accion", null, 0, -1, Tarea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTarea_Precede(), this.getTarea(), this.getTarea_Sigue(), "precede", null, 0, -1, Tarea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTarea_Sigue(), this.getTarea(), this.getTarea_Precede(), "sigue", null, 0, 1, Tarea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTarea_PrecedeElse(), this.getTareaAnalisis(), this.getTareaAnalisis_SigueElse(), "precedeElse", null, 0, -1, Tarea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tareaEjecutableEClass, TareaEjecutable.class, "TareaEjecutable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTareaEjecutable_EjecutadaPor(), this.getAgente(), this.getAgente_Tareas(), "ejecutadaPor", null, 1, 1, TareaEjecutable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inicioEClass, Inicio.class, "Inicio", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(finalEClass, Final.class, "Final", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(accionEClass, Accion.class, "Accion", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAccion_NombreAccion(), ecorePackage.getEString(), "nombreAccion", null, 0, 1, Accion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAccion_Apunta(), this.getContexto(), this.getContexto_EsApuntadoPor(), "apunta", null, 1, 1, Accion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAccion_Usa(), this.getPropiedad(), this.getPropiedad_EsUsada(), "usa", null, 0, -1, Accion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(escrituraEClass, Escritura.class, "Escritura", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lecturaEClass, Lectura.class, "Lectura", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(operacionMCPEClass, OperacionMCP.class, "OperacionMCP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOperacionMCP_NombreOperacion(), ecorePackage.getEString(), "nombreOperacion", null, 0, 1, OperacionMCP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperacionMCP_DescOperacion(), ecorePackage.getEString(), "descOperacion", null, 0, 1, OperacionMCP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperacionMCP_EsEjecutadaOperacion(), this.getTareaServerMCP(), this.getTareaServerMCP_EjecutaOperacion(), "esEjecutadaOperacion", null, 0, 1, OperacionMCP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tareaTransformacionDatosEClass, TareaTransformacionDatos.class, "TareaTransformacionDatos", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTareaTransformacionDatos_Prompt(), ecorePackage.getEString(), "prompt", null, 0, 1, TareaTransformacionDatos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tareaLLMEClass, TareaLLM.class, "TareaLLM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTareaLLM_Prompt(), ecorePackage.getEString(), "prompt", null, 0, 1, TareaLLM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tareaUsuarioEClass, TareaUsuario.class, "TareaUsuario", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tareaAnalisisEClass, TareaAnalisis.class, "TareaAnalisis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTareaAnalisis_SigueElse(), this.getTarea(), this.getTarea_PrecedeElse(), "sigueElse", null, 1, 1, TareaAnalisis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTareaAnalisis_Prompt(), ecorePackage.getEString(), "prompt", null, 0, 1, TareaAnalisis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tareaEnvioContextoEClass, TareaEnvioContexto.class, "TareaEnvioContexto", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tareaRecepcionContextoEClass, TareaRecepcionContexto.class, "TareaRecepcionContexto", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tareaServerMCPEClass, TareaServerMCP.class, "TareaServerMCP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTareaServerMCP_EjecutaOperacion(), this.getOperacionMCP(), this.getOperacionMCP_EsEjecutadaOperacion(), "ejecutaOperacion", null, 1, 1, TareaServerMCP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTareaServerMCP_Prompt(), ecorePackage.getEString(), "prompt", null, 0, 1, TareaServerMCP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(tipoContextoEEnum, TipoContexto.class, "TipoContexto");
		addEEnumLiteral(tipoContextoEEnum, TipoContexto.ENTERO);
		addEEnumLiteral(tipoContextoEEnum, TipoContexto.CADENA);
		addEEnumLiteral(tipoContextoEEnum, TipoContexto.REAL);
		addEEnumLiteral(tipoContextoEEnum, TipoContexto.BOOLEANO);
		addEEnumLiteral(tipoContextoEEnum, TipoContexto.TEXTO_EXTENSO);
		addEEnumLiteral(tipoContextoEEnum, TipoContexto.ARCHIVO);
		addEEnumLiteral(tipoContextoEEnum, TipoContexto.COLECCION_ARCHIVOS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// gmf.diagram
		createGmfAnnotations();
		// DSLDoc
		createDSLDocAnnotations();
		// gmf.node
		createGmf_1Annotations();
		// gmf.compartment
		createGmf_2Annotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
		// gmf.link
		createGmf_3Annotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "ecore", "http://www.eclipse.org/emf/2002/Ecore"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
		   });	
		addAnnotation
		  (agenteEClass, 
		   source, 
		   new String[] {
			 "constraints", "R05_LimiteCargaTrabajo"
		   });	
		addAnnotation
		  (workflowEClass, 
		   source, 
		   new String[] {
			 "constraints", "R01_UnaTareaInicio R02_UnaTareaFin"
		   });	
		addAnnotation
		  (tareaEClass, 
		   source, 
		   new String[] {
			 "constraints", "R10_NoBuclePropio"
		   });	
		addAnnotation
		  (tareaEjecutableEClass, 
		   source, 
		   new String[] {
			 "constraints", "R09_EntradaYSalida"
		   });	
		addAnnotation
		  (inicioEClass, 
		   source, 
		   new String[] {
			 "constraints", "R03_InicioSinEntradas"
		   });	
		addAnnotation
		  (finalEClass, 
		   source, 
		   new String[] {
			 "constraints", "R04_FinSinSalidas"
		   });	
		addAnnotation
		  (accionEClass, 
		   source, 
		   new String[] {
			 "constraints", "R12_CoherenciaContexto"
		   });	
		addAnnotation
		  (tareaRecepcionContextoEClass, 
		   source, 
		   new String[] {
			 "constraints", "R07_RecepcionPrecedidaEnvio R11_MismasPropiedadesEnvioRecepcion R08_DistintosAgentes"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.diagram</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations() {
		String source = "gmf.diagram";	
		addAnnotation
		  (serviceMCPEClass, 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>DSLDoc</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDSLDocAnnotations() {
		String source = "DSLDoc";	
		addAnnotation
		  (serviceMCPEClass, 
		   source, 
		   new String[] {
			 "descripcion", "Clase ra\u00edz que act\u00faa como contenedor principal de todo el modelo de agentes y servicios."
		   });	
		addAnnotation
		  (serverMCPEClass, 
		   source, 
		   new String[] {
			 "descripcion", "Representa un servidor o infraestructura externa que expone operaciones MCP a las que los agentes pueden conectarse."
		   });	
		addAnnotation
		  (workflowEClass, 
		   source, 
		   new String[] {
			 "descripcion", "Define el flujo de trabajo o comportamiento que sigue un agente mediante una secuencia de tareas."
		   });	
		addAnnotation
		  (contextoEClass, 
		   source, 
		   new String[] {
			 "descripcion", "Representa el estado o conjunto de datos compartidos durante la ejecuci\u00f3n del workflow de un agente."
		   });	
		addAnnotation
		  (tareaEClass, 
		   source, 
		   new String[] {
			 "descripcion", "Clase base abstracta para todos los pasos ejecutables y puntos de control dentro de un workflow."
		   });	
		addAnnotation
		  (tareaEjecutableEClass, 
		   source, 
		   new String[] {
			 "descripcion", "Clase base para aquellas tareas."
		   });	
		addAnnotation
		  (finalEClass, 
		   source, 
		   new String[] {
			 "descripcion", "Nodo final que indica la terminaci\u00f3n l\u00f3gica de un workflow."
		   });	
		addAnnotation
		  (accionEClass, 
		   source, 
		   new String[] {
			 "descripcion", "Clase abstracta que modela las interacciones (lectura/escritura) que una tarea realiza sobre un contexto de datos."
		   });	
		addAnnotation
		  (escrituraEClass, 
		   source, 
		   new String[] {
			 "descripcion", "Acci\u00f3n que modifica, actualiza o inserta nuevos datos en un contexto."
		   });	
		addAnnotation
		  (lecturaEClass, 
		   source, 
		   new String[] {
			 "descripcion", "Acci\u00f3n que obtiene o consume datos de un contexto para su procesamiento."
		   });	
		addAnnotation
		  (tipoContextoEEnum, 
		   source, 
		   new String[] {
			 "descripcion", "Enumeraci\u00f3n de los tipos de datos b\u00e1sicos y complejos permitidos en las propiedades de un contexto."
		   });	
		addAnnotation
		  (operacionMCPEClass, 
		   source, 
		   new String[] {
			 "descripcion", "Define una operaci\u00f3n espec\u00edfica disponible en un ServerMCP que puede ser invocada de manera remota."
		   });	
		addAnnotation
		  (tareaTransformacionDatosEClass, 
		   source, 
		   new String[] {
			 "descripcion", "Tarea encargada de transformar o reformatear un conjunto de datos en base a una regla o prompt."
		   });	
		addAnnotation
		  (tareaLLMEClass, 
		   source, 
		   new String[] {
			 "descripcion", "Tarea que invoca a un Modelo de Lenguaje Grande (LLM) utilizando un prompt espec\u00edfico para razonamiento o generaci\u00f3n de texto."
		   });	
		addAnnotation
		  (tareaUsuarioEClass, 
		   source, 
		   new String[] {
			 "descripcion", "Tarea interactiva que detiene el flujo para requerir intervenci\u00f3n o entrada de datos manual por parte de un usuario humano."
		   });	
		addAnnotation
		  (tareaAnalisisEClass, 
		   source, 
		   new String[] {
			 "descripcion", "Tarea de bifurcaci\u00f3n condicional que eval\u00faa un estado para decidir continuar por el flujo principal o por un flujo alternativo (Else)."
		   });	
		addAnnotation
		  (tareaEnvioContextoEClass, 
		   source, 
		   new String[] {
			 "descripcion", "Subclase de TareaEjecutable que permite exportar el contexto actual de un flujo para que sea procesado por otro agente."
		   });	
		addAnnotation
		  (tareaServerMCPEClass, 
		   source, 
		   new String[] {
			 "descripcion", "Tarea automatizada que se conecta a un ServerMCP para invocar remotamente una OperacionMCP espec\u00edfica."
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.node</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations() {
		String source = "gmf.node";	
		addAnnotation
		  (serverMCPEClass, 
		   source, 
		   new String[] {
			 "label", "nombreServer",
			 "figure", "rectangle",
			 "color", "200,200,255"
		   });	
		addAnnotation
		  (agenteEClass, 
		   source, 
		   new String[] {
			 "label", "nombre",
			 "figure", "rectangle",
			 "color", "255,200,200"
		   });	
		addAnnotation
		  (workflowEClass, 
		   source, 
		   new String[] {
			 "label", "nombreWorkflow",
			 "figure", "rounded",
			 "color", "200,255,200"
		   });	
		addAnnotation
		  (contextoEClass, 
		   source, 
		   new String[] {
			 "label", "nombreContexto",
			 "figure", "rectangle",
			 "color", "255,255,200"
		   });	
		addAnnotation
		  (propiedadEClass, 
		   source, 
		   new String[] {
			 "label", "nombrePropiedad"
		   });	
		addAnnotation
		  (inicioEClass, 
		   source, 
		   new String[] {
			 "label", "nombreTarea",
			 "figure", "ellipse",
			 "color", "0,255,0",
			 "size", "30,30"
		   });	
		addAnnotation
		  (finalEClass, 
		   source, 
		   new String[] {
			 "label", "nombreTarea",
			 "figure", "ellipse",
			 "color", "255,0,0",
			 "size", "30,30"
		   });	
		addAnnotation
		  (escrituraEClass, 
		   source, 
		   new String[] {
			 "label", "nombreAccion",
			 "figure", "rectangle"
		   });	
		addAnnotation
		  (lecturaEClass, 
		   source, 
		   new String[] {
			 "label", "nombreAccion",
			 "figure", "rectangle"
		   });	
		addAnnotation
		  (operacionMCPEClass, 
		   source, 
		   new String[] {
			 "label", "nombreOperacion"
		   });	
		addAnnotation
		  (tareaTransformacionDatosEClass, 
		   source, 
		   new String[] {
			 "label", "nombreTarea",
			 "figure", "rectangle",
			 "color", "200,255,255"
		   });	
		addAnnotation
		  (tareaLLMEClass, 
		   source, 
		   new String[] {
			 "label", "nombreTarea",
			 "figure", "rectangle",
			 "color", "255,200,255"
		   });	
		addAnnotation
		  (tareaUsuarioEClass, 
		   source, 
		   new String[] {
			 "label", "nombreTarea",
			 "figure", "rectangle",
			 "color", "255,255,255"
		   });	
		addAnnotation
		  (tareaAnalisisEClass, 
		   source, 
		   new String[] {
			 "label", "nombreTarea",
			 "figure", "rectangle",
			 "color", "255,255,150"
		   });	
		addAnnotation
		  (tareaEnvioContextoEClass, 
		   source, 
		   new String[] {
			 "label", "nombreTarea",
			 "figure", "rectangle",
			 "color", "150,255,150"
		   });	
		addAnnotation
		  (tareaRecepcionContextoEClass, 
		   source, 
		   new String[] {
			 "label", "nombreTarea",
			 "figure", "rectangle",
			 "color", "150,150,255"
		   });	
		addAnnotation
		  (tareaServerMCPEClass, 
		   source, 
		   new String[] {
			 "label", "nombreTarea",
			 "figure", "rectangle",
			 "color", "200,200,200"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.compartment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_2Annotations() {
		String source = "gmf.compartment";	
		addAnnotation
		  (getServerMCP_Operaciones(), 
		   source, 
		   new String[] {
			 "layout", "list"
		   });	
		addAnnotation
		  (getAgente_Contextos(), 
		   source, 
		   new String[] {
			 "layout", "list"
		   });	
		addAnnotation
		  (getWorkflow_Tareas(), 
		   source, 
		   new String[] {
			 "layout", "free"
		   });	
		addAnnotation
		  (getContexto_Propiedades(), 
		   source, 
		   new String[] {
			 "layout", "list"
		   });	
		addAnnotation
		  (getTarea_Accion(), 
		   source, 
		   new String[] {
			 "layout", "list"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";	
		addAnnotation
		  (agenteEClass, 
		   source, 
		   new String[] {
			 "R05_LimiteCargaTrabajo", "self.tareas->size() <= 10"
		   });	
		addAnnotation
		  (workflowEClass, 
		   source, 
		   new String[] {
			 "R01_UnaTareaInicio", "self.tareas->select(t | t.oclIsTypeOf(Inicio))->size() = 1",
			 "R02_UnaTareaFin", "self.tareas->select(t | t.oclIsTypeOf(Final))->size() = 1"
		   });	
		addAnnotation
		  (tareaEClass, 
		   source, 
		   new String[] {
			 "R10_NoBuclePropio", "self.sigue <> self"
		   });	
		addAnnotation
		  (tareaEjecutableEClass, 
		   source, 
		   new String[] {
			 "R09_EntradaYSalida", "(self.precede->notEmpty() or self.precedeElse->notEmpty()) and not self.sigue.oclIsUndefined()"
		   });	
		addAnnotation
		  (inicioEClass, 
		   source, 
		   new String[] {
			 "R03_InicioSinEntradas", "self.precede->isEmpty() and self.precedeElse->isEmpty()"
		   });	
		addAnnotation
		  (finalEClass, 
		   source, 
		   new String[] {
			 "R04_FinSinSalidas", "self.sigue.oclIsUndefined()"
		   });	
		addAnnotation
		  (accionEClass, 
		   source, 
		   new String[] {
			 "R12_CoherenciaContexto", "self.usa->forAll(p | self.apunta.propiedades->includes(p))"
		   });	
		addAnnotation
		  (tareaRecepcionContextoEClass, 
		   source, 
		   new String[] {
			 "R07_RecepcionPrecedidaEnvio", "self.precede->exists(t | t.oclIsTypeOf(TareaEnvioContexto))",
			 "R11_MismasPropiedadesEnvioRecepcion", "self.precede->select(t | t.oclIsTypeOf(TareaEnvioContexto))->forAll(e | self.accion->collect(usa)->asSet() = e.accion->collect(usa)->asSet())",
			 "R08_DistintosAgentes", "self.precede->select(t | t.oclIsTypeOf(TareaEnvioContexto))->forAll(e | self.ejecutadaPor <> e.oclAsType(TareaEjecutable).ejecutadaPor)"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_3Annotations() {
		String source = "gmf.link";	
		addAnnotation
		  (getAgente_Tareas(), 
		   source, 
		   new String[] {
			 "target.decoration", "arrow",
			 "style", "solid",
			 "color", "0,0,0",
			 "label", "ejecuta"
		   });	
		addAnnotation
		  (getTarea_Sigue(), 
		   source, 
		   new String[] {
			 "target.decoration", "arrow",
			 "color", "0,0,0",
			 "label", "sigue"
		   });	
		addAnnotation
		  (getTareaAnalisis_SigueElse(), 
		   source, 
		   new String[] {
			 "target.decoration", "arrow",
			 "label", "sigue Else"
		   });	
		addAnnotation
		  (getTareaServerMCP_EjecutaOperacion(), 
		   source, 
		   new String[] {
			 "target.decoration", "arrow",
			 "style", "dash",
			 "label", "ejecuta oper."
		   });
	}

} //McpMMPackageImpl
