/**
 */
package McpMM.impl;

import McpMM.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class McpMMFactoryImpl extends EFactoryImpl implements McpMMFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static McpMMFactory init() {
		try {
			McpMMFactory theMcpMMFactory = (McpMMFactory)EPackage.Registry.INSTANCE.getEFactory(McpMMPackage.eNS_URI);
			if (theMcpMMFactory != null) {
				return theMcpMMFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new McpMMFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public McpMMFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case McpMMPackage.SERVICE_MCP: return createServiceMCP();
			case McpMMPackage.SERVER_MCP: return createServerMCP();
			case McpMMPackage.AGENTE: return createAgente();
			case McpMMPackage.WORKFLOW: return createWorkflow();
			case McpMMPackage.CONTEXTO: return createContexto();
			case McpMMPackage.PROPIEDAD: return createPropiedad();
			case McpMMPackage.TAREA_FINAL: return createTareaFinal();
			case McpMMPackage.TAREA_INICIAL: return createTareaInicial();
			case McpMMPackage.ESCRITURA: return createEscritura();
			case McpMMPackage.LECTURA: return createLectura();
			case McpMMPackage.OPERACION_MCP: return createOperacionMCP();
			case McpMMPackage.TAREA_TRANSFORMACION_DATOS: return createTareaTransformacionDatos();
			case McpMMPackage.TAREA_LLM: return createTareaLLM();
			case McpMMPackage.TAREA_USUARIO: return createTareaUsuario();
			case McpMMPackage.TAREA_ANALISIS: return createTareaAnalisis();
			case McpMMPackage.TAREA_ENVIO_CONTEXTO: return createTareaEnvioContexto();
			case McpMMPackage.TAREA_RECEPCION_CONTEXTO: return createTareaRecepcionContexto();
			case McpMMPackage.TAREA_SERVER_MCP: return createTareaServerMCP();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case McpMMPackage.TIPO_CONTEXTO:
				return createTipoContextoFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case McpMMPackage.TIPO_CONTEXTO:
				return convertTipoContextoToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceMCP createServiceMCP() {
		ServiceMCPImpl serviceMCP = new ServiceMCPImpl();
		return serviceMCP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServerMCP createServerMCP() {
		ServerMCPImpl serverMCP = new ServerMCPImpl();
		return serverMCP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Agente createAgente() {
		AgenteImpl agente = new AgenteImpl();
		return agente;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Workflow createWorkflow() {
		WorkflowImpl workflow = new WorkflowImpl();
		return workflow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Contexto createContexto() {
		ContextoImpl contexto = new ContextoImpl();
		return contexto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Propiedad createPropiedad() {
		PropiedadImpl propiedad = new PropiedadImpl();
		return propiedad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TareaFinal createTareaFinal() {
		TareaFinalImpl tareaFinal = new TareaFinalImpl();
		return tareaFinal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TareaInicial createTareaInicial() {
		TareaInicialImpl tareaInicial = new TareaInicialImpl();
		return tareaInicial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Escritura createEscritura() {
		EscrituraImpl escritura = new EscrituraImpl();
		return escritura;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lectura createLectura() {
		LecturaImpl lectura = new LecturaImpl();
		return lectura;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperacionMCP createOperacionMCP() {
		OperacionMCPImpl operacionMCP = new OperacionMCPImpl();
		return operacionMCP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TareaTransformacionDatos createTareaTransformacionDatos() {
		TareaTransformacionDatosImpl tareaTransformacionDatos = new TareaTransformacionDatosImpl();
		return tareaTransformacionDatos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TareaLLM createTareaLLM() {
		TareaLLMImpl tareaLLM = new TareaLLMImpl();
		return tareaLLM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TareaUsuario createTareaUsuario() {
		TareaUsuarioImpl tareaUsuario = new TareaUsuarioImpl();
		return tareaUsuario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TareaAnalisis createTareaAnalisis() {
		TareaAnalisisImpl tareaAnalisis = new TareaAnalisisImpl();
		return tareaAnalisis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TareaEnvioContexto createTareaEnvioContexto() {
		TareaEnvioContextoImpl tareaEnvioContexto = new TareaEnvioContextoImpl();
		return tareaEnvioContexto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TareaRecepcionContexto createTareaRecepcionContexto() {
		TareaRecepcionContextoImpl tareaRecepcionContexto = new TareaRecepcionContextoImpl();
		return tareaRecepcionContexto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TareaServerMCP createTareaServerMCP() {
		TareaServerMCPImpl tareaServerMCP = new TareaServerMCPImpl();
		return tareaServerMCP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoContexto createTipoContextoFromString(EDataType eDataType, String initialValue) {
		TipoContexto result = TipoContexto.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTipoContextoToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public McpMMPackage getMcpMMPackage() {
		return (McpMMPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static McpMMPackage getPackage() {
		return McpMMPackage.eINSTANCE;
	}

} //McpMMFactoryImpl
