/**
 */
package McpMM.impl;

import McpMM.Accion;
import McpMM.Agente;
import McpMM.Contexto;
import McpMM.Escritura;
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
import McpMM.TareaFinal;
import McpMM.TareaInicial;
import McpMM.TareaLLM;
import McpMM.TareaRecepcionContexto;
import McpMM.TareaServerMCP;
import McpMM.TareaTransformacionDatos;
import McpMM.TareaUsuario;
import McpMM.TipoContexto;
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
	private EClass tareaFinalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tareaInicialEClass = null;

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
	public EReference getServiceMCP_Servermcp() {
		return (EReference)serviceMCPEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceMCP_Agente() {
		return (EReference)serviceMCPEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceMCP_Workflow() {
		return (EReference)serviceMCPEClass.getEStructuralFeatures().get(3);
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
	public EReference getServerMCP_Operacionmcp() {
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
	public EAttribute getAgente_NombreAgente() {
		return (EAttribute)agenteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAgente_NumTareas() {
		return (EAttribute)agenteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAgente_Realiza() {
		return (EReference)agenteEClass.getEStructuralFeatures().get(2);
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
	public EReference getWorkflow_Contexto() {
		return (EReference)workflowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkflow_Tarea() {
		return (EReference)workflowEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkflow_EmpiezaCon() {
		return (EReference)workflowEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkflow_FinalizaCon() {
		return (EReference)workflowEClass.getEStructuralFeatures().get(4);
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
	public EReference getContexto_Propiedad() {
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
	public EReference getPropiedad_EsUsada() {
		return (EReference)propiedadEClass.getEStructuralFeatures().get(2);
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
	public EReference getTarea_Accion() {
		return (EReference)tareaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTarea_Precede() {
		return (EReference)tareaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTarea_Sigue() {
		return (EReference)tareaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTarea_PrecedeElse() {
		return (EReference)tareaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTarea_AgenteAsignado() {
		return (EReference)tareaEClass.getEStructuralFeatures().get(5);
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
	public EAttribute getTareaEjecutable_IdTarea() {
		return (EAttribute)tareaEjecutableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTareaEjecutable_DescTarea() {
		return (EAttribute)tareaEjecutableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTareaFinal() {
		return tareaFinalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTareaFinal_Finaliza() {
		return (EReference)tareaFinalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTareaInicial() {
		return tareaInicialEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTareaInicial_Empieza() {
		return (EReference)tareaInicialEClass.getEStructuralFeatures().get(0);
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
		serviceMCPEClass = createEClass(SERVICE_MCP);
		createEAttribute(serviceMCPEClass, SERVICE_MCP__NOMBRE_SERVICIO);
		createEReference(serviceMCPEClass, SERVICE_MCP__SERVERMCP);
		createEReference(serviceMCPEClass, SERVICE_MCP__AGENTE);
		createEReference(serviceMCPEClass, SERVICE_MCP__WORKFLOW);

		serverMCPEClass = createEClass(SERVER_MCP);
		createEAttribute(serverMCPEClass, SERVER_MCP__NOMBRE_SERVER);
		createEReference(serverMCPEClass, SERVER_MCP__OPERACIONMCP);

		agenteEClass = createEClass(AGENTE);
		createEAttribute(agenteEClass, AGENTE__NOMBRE_AGENTE);
		createEAttribute(agenteEClass, AGENTE__NUM_TAREAS);
		createEReference(agenteEClass, AGENTE__REALIZA);

		workflowEClass = createEClass(WORKFLOW);
		createEAttribute(workflowEClass, WORKFLOW__NOMBRE_WORKFLOW);
		createEReference(workflowEClass, WORKFLOW__CONTEXTO);
		createEReference(workflowEClass, WORKFLOW__TAREA);
		createEReference(workflowEClass, WORKFLOW__EMPIEZA_CON);
		createEReference(workflowEClass, WORKFLOW__FINALIZA_CON);

		contextoEClass = createEClass(CONTEXTO);
		createEAttribute(contextoEClass, CONTEXTO__NOMBRE_CONTEXTO);
		createEReference(contextoEClass, CONTEXTO__PROPIEDAD);
		createEReference(contextoEClass, CONTEXTO__ES_APUNTADO_POR);

		propiedadEClass = createEClass(PROPIEDAD);
		createEAttribute(propiedadEClass, PROPIEDAD__NOMBRE_PROPIEDAD);
		createEAttribute(propiedadEClass, PROPIEDAD__TIPO_PROPIEDAD);
		createEReference(propiedadEClass, PROPIEDAD__ES_USADA);

		tareaEClass = createEClass(TAREA);
		createEAttribute(tareaEClass, TAREA__NOMBRE_TAREA);
		createEReference(tareaEClass, TAREA__ACCION);
		createEReference(tareaEClass, TAREA__PRECEDE);
		createEReference(tareaEClass, TAREA__SIGUE);
		createEReference(tareaEClass, TAREA__PRECEDE_ELSE);
		createEReference(tareaEClass, TAREA__AGENTE_ASIGNADO);

		tareaEjecutableEClass = createEClass(TAREA_EJECUTABLE);
		createEAttribute(tareaEjecutableEClass, TAREA_EJECUTABLE__ID_TAREA);
		createEAttribute(tareaEjecutableEClass, TAREA_EJECUTABLE__DESC_TAREA);

		tareaFinalEClass = createEClass(TAREA_FINAL);
		createEReference(tareaFinalEClass, TAREA_FINAL__FINALIZA);

		tareaInicialEClass = createEClass(TAREA_INICIAL);
		createEReference(tareaInicialEClass, TAREA_INICIAL__EMPIEZA);

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
		tareaFinalEClass.getESuperTypes().add(this.getTarea());
		tareaInicialEClass.getESuperTypes().add(this.getTarea());
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
		initEClass(serviceMCPEClass, ServiceMCP.class, "ServiceMCP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceMCP_NombreServicio(), ecorePackage.getEString(), "nombreServicio", null, 0, 1, ServiceMCP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceMCP_Servermcp(), this.getServerMCP(), null, "servermcp", null, 0, -1, ServiceMCP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceMCP_Agente(), this.getAgente(), null, "agente", null, 0, -1, ServiceMCP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceMCP_Workflow(), this.getWorkflow(), null, "workflow", null, 0, -1, ServiceMCP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serverMCPEClass, ServerMCP.class, "ServerMCP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServerMCP_NombreServer(), ecorePackage.getEString(), "nombreServer", null, 0, 1, ServerMCP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServerMCP_Operacionmcp(), this.getOperacionMCP(), null, "operacionmcp", null, 0, -1, ServerMCP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(agenteEClass, Agente.class, "Agente", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAgente_NombreAgente(), ecorePackage.getEString(), "nombreAgente", null, 0, 1, Agente.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgente_NumTareas(), ecorePackage.getEInt(), "numTareas", null, 1, 1, Agente.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAgente_Realiza(), this.getTarea(), this.getTarea_AgenteAsignado(), "realiza", null, 1, -1, Agente.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workflowEClass, Workflow.class, "Workflow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWorkflow_NombreWorkflow(), ecorePackage.getEString(), "nombreWorkflow", null, 0, 1, Workflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflow_Contexto(), this.getContexto(), null, "contexto", null, 0, -1, Workflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflow_Tarea(), this.getTarea(), null, "tarea", null, 0, -1, Workflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflow_EmpiezaCon(), this.getTareaInicial(), this.getTareaInicial_Empieza(), "empiezaCon", null, 1, 1, Workflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflow_FinalizaCon(), this.getTareaFinal(), this.getTareaFinal_Finaliza(), "finalizaCon", null, 1, -1, Workflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contextoEClass, Contexto.class, "Contexto", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContexto_NombreContexto(), ecorePackage.getEString(), "nombreContexto", null, 0, 1, Contexto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContexto_Propiedad(), this.getPropiedad(), null, "propiedad", null, 0, -1, Contexto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContexto_EsApuntadoPor(), this.getAccion(), this.getAccion_Apunta(), "esApuntadoPor", null, 0, -1, Contexto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propiedadEClass, Propiedad.class, "Propiedad", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPropiedad_NombrePropiedad(), ecorePackage.getEString(), "nombrePropiedad", null, 0, 1, Propiedad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropiedad_TipoPropiedad(), this.getTipoContexto(), "tipoPropiedad", null, 0, 1, Propiedad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropiedad_EsUsada(), this.getAccion(), this.getAccion_Usa(), "esUsada", null, 0, -1, Propiedad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tareaEClass, Tarea.class, "Tarea", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTarea_NombreTarea(), ecorePackage.getEString(), "nombreTarea", null, 0, 1, Tarea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTarea_Accion(), this.getAccion(), null, "accion", null, 0, -1, Tarea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTarea_Precede(), this.getTarea(), this.getTarea_Sigue(), "precede", null, 0, 1, Tarea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTarea_Sigue(), this.getTarea(), this.getTarea_Precede(), "sigue", null, 0, 1, Tarea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTarea_PrecedeElse(), this.getTareaAnalisis(), this.getTareaAnalisis_SigueElse(), "precedeElse", null, 0, 1, Tarea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTarea_AgenteAsignado(), this.getAgente(), this.getAgente_Realiza(), "agenteAsignado", null, 0, 1, Tarea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tareaEjecutableEClass, TareaEjecutable.class, "TareaEjecutable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTareaEjecutable_IdTarea(), ecorePackage.getEInt(), "idTarea", null, 1, 1, TareaEjecutable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTareaEjecutable_DescTarea(), ecorePackage.getEString(), "descTarea", null, 0, 1, TareaEjecutable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tareaFinalEClass, TareaFinal.class, "TareaFinal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTareaFinal_Finaliza(), this.getWorkflow(), this.getWorkflow_FinalizaCon(), "finaliza", null, 1, 1, TareaFinal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tareaInicialEClass, TareaInicial.class, "TareaInicial", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTareaInicial_Empieza(), this.getWorkflow(), this.getWorkflow_EmpiezaCon(), "empieza", null, 1, 1, TareaInicial.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(accionEClass, Accion.class, "Accion", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAccion_NombreAccion(), ecorePackage.getEString(), "nombreAccion", null, 0, 1, Accion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAccion_Apunta(), this.getContexto(), this.getContexto_EsApuntadoPor(), "apunta", null, 1, 1, Accion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAccion_Usa(), this.getPropiedad(), this.getPropiedad_EsUsada(), "usa", null, 0, 1, Accion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
			 "constraints", "R05_AlMenosUnaTarea"
		   });	
		addAnnotation
		  (workflowEClass, 
		   source, 
		   new String[] {
			 "constraints", "R01_UnaTareaInicio R02_AlMenosUnaTareaFin"
		   });	
		addAnnotation
		  (tareaEClass, 
		   source, 
		   new String[] {
			 "constraints", "R06_NoBuclePropio R08_ConexionesAgentes R09_EntradaYSalida R10_NoCiclos"
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
			 "constraints", "R07_RecepcionPrecedidaEnvio R11_MismasPropiedadesEnvioRecepcion"
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
			 "label", "nombreAgente",
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
		  (tareaFinalEClass, 
		   source, 
		   new String[] {
			 "label", "nombreTarea",
			 "figure", "ellipse",
			 "color", "255,0,0",
			 "size", "30,30"
		   });	
		addAnnotation
		  (tareaInicialEClass, 
		   source, 
		   new String[] {
			 "label", "nombreTarea",
			 "figure", "ellipse",
			 "color", "0,255,0",
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
		  (getServerMCP_Operacionmcp(), 
		   source, 
		   new String[] {
			 "layout", "list"
		   });	
		addAnnotation
		  (getWorkflow_Contexto(), 
		   source, 
		   new String[] {
			 "layout", "list"
		   });	
		addAnnotation
		  (getWorkflow_Tarea(), 
		   source, 
		   new String[] {
			 "layout", "free"
		   });	
		addAnnotation
		  (getContexto_Propiedad(), 
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
			 "R05_AlMenosUnaTarea", "not (self.realiza->select(t | not t.oclIsTypeOf(TareaInicial) and not t.oclIsTypeOf(TareaFinal))->isEmpty())"
		   });	
		addAnnotation
		  (getAgente_NumTareas(), 
		   source, 
		   new String[] {
			 "derivation", "realiza->size()"
		   });	
		addAnnotation
		  (workflowEClass, 
		   source, 
		   new String[] {
			 "R01_UnaTareaInicio", "self.tarea->select(t | t.oclIsTypeOf(TareaInicial))->size() = 1",
			 "R02_AlMenosUnaTareaFin", "self.tarea->select(t | t.oclIsTypeOf(TareaFinal))->size() >= 1"
		   });	
		addAnnotation
		  (tareaEClass, 
		   source, 
		   new String[] {
			 "R06_NoBuclePropio", "not (self.sigue = self) and (if self.oclIsTypeOf(TareaAnalisis) then not (self.oclAsType(TareaAnalisis).sigueElse = self) else true endif)",
			 "R08_ConexionesAgentes", "if not self.sigue.oclIsUndefined() then if self.oclIsTypeOf(TareaEnvioContexto) and self.sigue.oclIsTypeOf(TareaRecepcionContexto) then not (self.agenteAsignado = self.sigue.agenteAsignado) else self.agenteAsignado = self.sigue.agenteAsignado endif else true endif",
			 "R09_EntradaYSalida", "(if self.oclIsTypeOf(TareaInicial) then true else (not self.precede.oclIsUndefined() or not self.precedeElse.oclIsUndefined()) endif) and (if self.oclIsTypeOf(TareaFinal) then true else not self.sigue.oclIsUndefined() endif)",
			 "R10_NoCiclos", "let siguientes : Set(Tarea) = Set{self.sigue}->union(if self.oclIsTypeOf(TareaAnalisis) then Set{self.oclAsType(TareaAnalisis).sigueElse} else Set{} endif)->select(x | not x.oclIsUndefined()) in siguientes->forAll(s | not s->closure(t : Tarea | Set{t.sigue}->union(if t.oclIsTypeOf(TareaAnalisis) then Set{t.oclAsType(TareaAnalisis).sigueElse} else Set{} endif)->select(x | not x.oclIsUndefined()))->includes(self))"
		   });	
		addAnnotation
		  (accionEClass, 
		   source, 
		   new String[] {
			 "R12_CoherenciaContexto", "self.usa.oclIsUndefined() or self.apunta.propiedad->includes(self.usa)"
		   });	
		addAnnotation
		  (tareaRecepcionContextoEClass, 
		   source, 
		   new String[] {
			 "R07_RecepcionPrecedidaEnvio", "not self.precede.oclIsUndefined() and self.precede.oclIsTypeOf(TareaEnvioContexto)",
			 "R11_MismasPropiedadesEnvioRecepcion", "if not self.precede.oclIsUndefined() and self.precede.oclIsTypeOf(TareaEnvioContexto) then self.accion->collect(usa)->asSet() = self.precede.accion->collect(usa)->asSet() else true endif"
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
		  (getAgente_Realiza(), 
		   source, 
		   new String[] {
			 "target.decoration", "arrow",
			 "style", "dash",
			 "label", "realiza"
		   });	
		addAnnotation
		  (getWorkflow_EmpiezaCon(), 
		   source, 
		   new String[] {
			 "target.decoration", "arrow",
			 "color", "0,200,0",
			 "label", "empieza"
		   });	
		addAnnotation
		  (getWorkflow_FinalizaCon(), 
		   source, 
		   new String[] {
			 "target.decoration", "arrow",
			 "color", "200,0,0",
			 "label", "finaliza"
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
