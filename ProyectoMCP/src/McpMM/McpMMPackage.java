/**
 */
package McpMM;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see McpMM.McpMMFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel operationReflection='true' tableProviders='true' complianceLevel='8.0'"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface McpMMPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "McpMM";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://www.example.org/McpMM";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "McpMM";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	McpMMPackage eINSTANCE = McpMM.impl.McpMMPackageImpl.init();

	/**
	 * The meta object id for the '{@link McpMM.impl.VersionContextoImpl <em>Version Contexto</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see McpMM.impl.VersionContextoImpl
	 * @see McpMM.impl.McpMMPackageImpl#getVersionContexto()
	 * @generated
	 */
	int VERSION_CONTEXTO = 0;

	/**
	 * The feature id for the '<em><b>Valor Anterior</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_CONTEXTO__VALOR_ANTERIOR = 0;

	/**
	 * The feature id for the '<em><b>Fecha Modificacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_CONTEXTO__FECHA_MODIFICACION = 1;

	/**
	 * The feature id for the '<em><b>Propiedad Asociada</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_CONTEXTO__PROPIEDAD_ASOCIADA = 2;

	/**
	 * The number of structural features of the '<em>Version Contexto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_CONTEXTO_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link McpMM.impl.ServiceMCPImpl <em>Service MCP</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see McpMM.impl.ServiceMCPImpl
	 * @see McpMM.impl.McpMMPackageImpl#getServiceMCP()
	 * @generated
	 */
	int SERVICE_MCP = 1;

	/**
	 * The feature id for the '<em><b>Nombre Servicio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_MCP__NOMBRE_SERVICIO = 0;

	/**
	 * The feature id for the '<em><b>Agentes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_MCP__AGENTES = 1;

	/**
	 * The feature id for the '<em><b>Servicios</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_MCP__SERVICIOS = 2;

	/**
	 * The feature id for the '<em><b>Servidores</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_MCP__SERVIDORES = 3;

	/**
	 * The number of structural features of the '<em>Service MCP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_MCP_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link McpMM.impl.ServerMCPImpl <em>Server MCP</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see McpMM.impl.ServerMCPImpl
	 * @see McpMM.impl.McpMMPackageImpl#getServerMCP()
	 * @generated
	 */
	int SERVER_MCP = 2;

	/**
	 * The feature id for the '<em><b>Nombre Server</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_MCP__NOMBRE_SERVER = 0;

	/**
	 * The feature id for the '<em><b>Operaciones</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_MCP__OPERACIONES = 1;

	/**
	 * The number of structural features of the '<em>Server MCP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_MCP_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link McpMM.impl.AgenteImpl <em>Agente</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see McpMM.impl.AgenteImpl
	 * @see McpMM.impl.McpMMPackageImpl#getAgente()
	 * @generated
	 */
	int AGENTE = 3;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENTE__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Rol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENTE__ROL = 1;

	/**
	 * The feature id for the '<em><b>Flujo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENTE__FLUJO = 2;

	/**
	 * The feature id for the '<em><b>Contextos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENTE__CONTEXTOS = 3;

	/**
	 * The number of structural features of the '<em>Agente</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENTE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link McpMM.impl.WorkflowImpl <em>Workflow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see McpMM.impl.WorkflowImpl
	 * @see McpMM.impl.McpMMPackageImpl#getWorkflow()
	 * @generated
	 */
	int WORKFLOW = 4;

	/**
	 * The feature id for the '<em><b>Nombre Workflow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__NOMBRE_WORKFLOW = 0;

	/**
	 * The feature id for the '<em><b>Tareas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__TAREAS = 1;

	/**
	 * The number of structural features of the '<em>Workflow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link McpMM.impl.ContextoImpl <em>Contexto</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see McpMM.impl.ContextoImpl
	 * @see McpMM.impl.McpMMPackageImpl#getContexto()
	 * @generated
	 */
	int CONTEXTO = 5;

	/**
	 * The feature id for the '<em><b>Nombre Contexto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTO__NOMBRE_CONTEXTO = 0;

	/**
	 * The feature id for the '<em><b>Propiedades</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTO__PROPIEDADES = 1;

	/**
	 * The feature id for the '<em><b>Es Apuntado Por</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTO__ES_APUNTADO_POR = 2;

	/**
	 * The number of structural features of the '<em>Contexto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTO_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link McpMM.impl.PropiedadImpl <em>Propiedad</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see McpMM.impl.PropiedadImpl
	 * @see McpMM.impl.McpMMPackageImpl#getPropiedad()
	 * @generated
	 */
	int PROPIEDAD = 6;

	/**
	 * The feature id for the '<em><b>Nombre Propiedad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPIEDAD__NOMBRE_PROPIEDAD = 0;

	/**
	 * The feature id for the '<em><b>Tipo Propiedad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPIEDAD__TIPO_PROPIEDAD = 1;

	/**
	 * The feature id for the '<em><b>Extension Permitida</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPIEDAD__EXTENSION_PERMITIDA = 2;

	/**
	 * The feature id for the '<em><b>Peso Max MB</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPIEDAD__PESO_MAX_MB = 3;

	/**
	 * The feature id for the '<em><b>Es Usada</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPIEDAD__ES_USADA = 4;

	/**
	 * The feature id for the '<em><b>Versiones</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPIEDAD__VERSIONES = 5;

	/**
	 * The number of structural features of the '<em>Propiedad</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPIEDAD_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link McpMM.impl.TareaImpl <em>Tarea</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see McpMM.impl.TareaImpl
	 * @see McpMM.impl.McpMMPackageImpl#getTarea()
	 * @generated
	 */
	int TAREA = 7;

	/**
	 * The feature id for the '<em><b>Nombre Tarea</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA__NOMBRE_TAREA = 0;

	/**
	 * The feature id for the '<em><b>Task Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA__TASK_ID = 1;

	/**
	 * The feature id for the '<em><b>Task Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA__TASK_DESC = 2;

	/**
	 * The feature id for the '<em><b>Accion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA__ACCION = 3;

	/**
	 * The feature id for the '<em><b>Precede</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA__PRECEDE = 4;

	/**
	 * The feature id for the '<em><b>Sigue</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA__SIGUE = 5;

	/**
	 * The feature id for the '<em><b>Precede Else</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA__PRECEDE_ELSE = 6;

	/**
	 * The number of structural features of the '<em>Tarea</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link McpMM.impl.TareaEjecutableImpl <em>Tarea Ejecutable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see McpMM.impl.TareaEjecutableImpl
	 * @see McpMM.impl.McpMMPackageImpl#getTareaEjecutable()
	 * @generated
	 */
	int TAREA_EJECUTABLE = 8;

	/**
	 * The feature id for the '<em><b>Nombre Tarea</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_EJECUTABLE__NOMBRE_TAREA = TAREA__NOMBRE_TAREA;

	/**
	 * The feature id for the '<em><b>Task Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_EJECUTABLE__TASK_ID = TAREA__TASK_ID;

	/**
	 * The feature id for the '<em><b>Task Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_EJECUTABLE__TASK_DESC = TAREA__TASK_DESC;

	/**
	 * The feature id for the '<em><b>Accion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_EJECUTABLE__ACCION = TAREA__ACCION;

	/**
	 * The feature id for the '<em><b>Precede</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_EJECUTABLE__PRECEDE = TAREA__PRECEDE;

	/**
	 * The feature id for the '<em><b>Sigue</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_EJECUTABLE__SIGUE = TAREA__SIGUE;

	/**
	 * The feature id for the '<em><b>Precede Else</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_EJECUTABLE__PRECEDE_ELSE = TAREA__PRECEDE_ELSE;

	/**
	 * The number of structural features of the '<em>Tarea Ejecutable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_EJECUTABLE_FEATURE_COUNT = TAREA_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link McpMM.impl.InicioImpl <em>Inicio</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see McpMM.impl.InicioImpl
	 * @see McpMM.impl.McpMMPackageImpl#getInicio()
	 * @generated
	 */
	int INICIO = 9;

	/**
	 * The feature id for the '<em><b>Nombre Tarea</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INICIO__NOMBRE_TAREA = TAREA__NOMBRE_TAREA;

	/**
	 * The feature id for the '<em><b>Task Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INICIO__TASK_ID = TAREA__TASK_ID;

	/**
	 * The feature id for the '<em><b>Task Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INICIO__TASK_DESC = TAREA__TASK_DESC;

	/**
	 * The feature id for the '<em><b>Accion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INICIO__ACCION = TAREA__ACCION;

	/**
	 * The feature id for the '<em><b>Precede</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INICIO__PRECEDE = TAREA__PRECEDE;

	/**
	 * The feature id for the '<em><b>Sigue</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INICIO__SIGUE = TAREA__SIGUE;

	/**
	 * The feature id for the '<em><b>Precede Else</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INICIO__PRECEDE_ELSE = TAREA__PRECEDE_ELSE;

	/**
	 * The number of structural features of the '<em>Inicio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INICIO_FEATURE_COUNT = TAREA_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link McpMM.impl.FinalImpl <em>Final</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see McpMM.impl.FinalImpl
	 * @see McpMM.impl.McpMMPackageImpl#getFinal()
	 * @generated
	 */
	int FINAL = 10;

	/**
	 * The feature id for the '<em><b>Nombre Tarea</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL__NOMBRE_TAREA = TAREA__NOMBRE_TAREA;

	/**
	 * The feature id for the '<em><b>Task Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL__TASK_ID = TAREA__TASK_ID;

	/**
	 * The feature id for the '<em><b>Task Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL__TASK_DESC = TAREA__TASK_DESC;

	/**
	 * The feature id for the '<em><b>Accion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL__ACCION = TAREA__ACCION;

	/**
	 * The feature id for the '<em><b>Precede</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL__PRECEDE = TAREA__PRECEDE;

	/**
	 * The feature id for the '<em><b>Sigue</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL__SIGUE = TAREA__SIGUE;

	/**
	 * The feature id for the '<em><b>Precede Else</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL__PRECEDE_ELSE = TAREA__PRECEDE_ELSE;

	/**
	 * The number of structural features of the '<em>Final</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_FEATURE_COUNT = TAREA_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link McpMM.impl.AccionImpl <em>Accion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see McpMM.impl.AccionImpl
	 * @see McpMM.impl.McpMMPackageImpl#getAccion()
	 * @generated
	 */
	int ACCION = 11;

	/**
	 * The feature id for the '<em><b>Nombre Accion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCION__NOMBRE_ACCION = 0;

	/**
	 * The feature id for the '<em><b>Apunta</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCION__APUNTA = 1;

	/**
	 * The feature id for the '<em><b>Usa</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCION__USA = 2;

	/**
	 * The number of structural features of the '<em>Accion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link McpMM.impl.EscrituraImpl <em>Escritura</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see McpMM.impl.EscrituraImpl
	 * @see McpMM.impl.McpMMPackageImpl#getEscritura()
	 * @generated
	 */
	int ESCRITURA = 12;

	/**
	 * The feature id for the '<em><b>Nombre Accion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESCRITURA__NOMBRE_ACCION = ACCION__NOMBRE_ACCION;

	/**
	 * The feature id for the '<em><b>Apunta</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESCRITURA__APUNTA = ACCION__APUNTA;

	/**
	 * The feature id for the '<em><b>Usa</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESCRITURA__USA = ACCION__USA;

	/**
	 * The number of structural features of the '<em>Escritura</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESCRITURA_FEATURE_COUNT = ACCION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link McpMM.impl.LecturaImpl <em>Lectura</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see McpMM.impl.LecturaImpl
	 * @see McpMM.impl.McpMMPackageImpl#getLectura()
	 * @generated
	 */
	int LECTURA = 13;

	/**
	 * The feature id for the '<em><b>Nombre Accion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LECTURA__NOMBRE_ACCION = ACCION__NOMBRE_ACCION;

	/**
	 * The feature id for the '<em><b>Apunta</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LECTURA__APUNTA = ACCION__APUNTA;

	/**
	 * The feature id for the '<em><b>Usa</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LECTURA__USA = ACCION__USA;

	/**
	 * The number of structural features of the '<em>Lectura</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LECTURA_FEATURE_COUNT = ACCION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link McpMM.impl.OperacionMCPImpl <em>Operacion MCP</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see McpMM.impl.OperacionMCPImpl
	 * @see McpMM.impl.McpMMPackageImpl#getOperacionMCP()
	 * @generated
	 */
	int OPERACION_MCP = 14;

	/**
	 * The feature id for the '<em><b>Nombre Operacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERACION_MCP__NOMBRE_OPERACION = 0;

	/**
	 * The feature id for the '<em><b>Desc Operacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERACION_MCP__DESC_OPERACION = 1;

	/**
	 * The feature id for the '<em><b>Es Ejecutada Operacion</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERACION_MCP__ES_EJECUTADA_OPERACION = 2;

	/**
	 * The number of structural features of the '<em>Operacion MCP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERACION_MCP_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link McpMM.impl.TareaTransformacionDatosImpl <em>Tarea Transformacion Datos</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see McpMM.impl.TareaTransformacionDatosImpl
	 * @see McpMM.impl.McpMMPackageImpl#getTareaTransformacionDatos()
	 * @generated
	 */
	int TAREA_TRANSFORMACION_DATOS = 15;

	/**
	 * The feature id for the '<em><b>Nombre Tarea</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_TRANSFORMACION_DATOS__NOMBRE_TAREA = TAREA_EJECUTABLE__NOMBRE_TAREA;

	/**
	 * The feature id for the '<em><b>Task Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_TRANSFORMACION_DATOS__TASK_ID = TAREA_EJECUTABLE__TASK_ID;

	/**
	 * The feature id for the '<em><b>Task Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_TRANSFORMACION_DATOS__TASK_DESC = TAREA_EJECUTABLE__TASK_DESC;

	/**
	 * The feature id for the '<em><b>Accion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_TRANSFORMACION_DATOS__ACCION = TAREA_EJECUTABLE__ACCION;

	/**
	 * The feature id for the '<em><b>Precede</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_TRANSFORMACION_DATOS__PRECEDE = TAREA_EJECUTABLE__PRECEDE;

	/**
	 * The feature id for the '<em><b>Sigue</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_TRANSFORMACION_DATOS__SIGUE = TAREA_EJECUTABLE__SIGUE;

	/**
	 * The feature id for the '<em><b>Precede Else</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_TRANSFORMACION_DATOS__PRECEDE_ELSE = TAREA_EJECUTABLE__PRECEDE_ELSE;

	/**
	 * The feature id for the '<em><b>Prompt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_TRANSFORMACION_DATOS__PROMPT = TAREA_EJECUTABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tarea Transformacion Datos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_TRANSFORMACION_DATOS_FEATURE_COUNT = TAREA_EJECUTABLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link McpMM.impl.TareaLLMImpl <em>Tarea LLM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see McpMM.impl.TareaLLMImpl
	 * @see McpMM.impl.McpMMPackageImpl#getTareaLLM()
	 * @generated
	 */
	int TAREA_LLM = 16;

	/**
	 * The feature id for the '<em><b>Nombre Tarea</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_LLM__NOMBRE_TAREA = TAREA_EJECUTABLE__NOMBRE_TAREA;

	/**
	 * The feature id for the '<em><b>Task Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_LLM__TASK_ID = TAREA_EJECUTABLE__TASK_ID;

	/**
	 * The feature id for the '<em><b>Task Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_LLM__TASK_DESC = TAREA_EJECUTABLE__TASK_DESC;

	/**
	 * The feature id for the '<em><b>Accion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_LLM__ACCION = TAREA_EJECUTABLE__ACCION;

	/**
	 * The feature id for the '<em><b>Precede</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_LLM__PRECEDE = TAREA_EJECUTABLE__PRECEDE;

	/**
	 * The feature id for the '<em><b>Sigue</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_LLM__SIGUE = TAREA_EJECUTABLE__SIGUE;

	/**
	 * The feature id for the '<em><b>Precede Else</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_LLM__PRECEDE_ELSE = TAREA_EJECUTABLE__PRECEDE_ELSE;

	/**
	 * The feature id for the '<em><b>Prompt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_LLM__PROMPT = TAREA_EJECUTABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tarea LLM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_LLM_FEATURE_COUNT = TAREA_EJECUTABLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link McpMM.impl.TareaUsuarioImpl <em>Tarea Usuario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see McpMM.impl.TareaUsuarioImpl
	 * @see McpMM.impl.McpMMPackageImpl#getTareaUsuario()
	 * @generated
	 */
	int TAREA_USUARIO = 17;

	/**
	 * The feature id for the '<em><b>Nombre Tarea</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_USUARIO__NOMBRE_TAREA = TAREA_EJECUTABLE__NOMBRE_TAREA;

	/**
	 * The feature id for the '<em><b>Task Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_USUARIO__TASK_ID = TAREA_EJECUTABLE__TASK_ID;

	/**
	 * The feature id for the '<em><b>Task Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_USUARIO__TASK_DESC = TAREA_EJECUTABLE__TASK_DESC;

	/**
	 * The feature id for the '<em><b>Accion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_USUARIO__ACCION = TAREA_EJECUTABLE__ACCION;

	/**
	 * The feature id for the '<em><b>Precede</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_USUARIO__PRECEDE = TAREA_EJECUTABLE__PRECEDE;

	/**
	 * The feature id for the '<em><b>Sigue</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_USUARIO__SIGUE = TAREA_EJECUTABLE__SIGUE;

	/**
	 * The feature id for the '<em><b>Precede Else</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_USUARIO__PRECEDE_ELSE = TAREA_EJECUTABLE__PRECEDE_ELSE;

	/**
	 * The number of structural features of the '<em>Tarea Usuario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_USUARIO_FEATURE_COUNT = TAREA_EJECUTABLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link McpMM.impl.TareaAnalisisImpl <em>Tarea Analisis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see McpMM.impl.TareaAnalisisImpl
	 * @see McpMM.impl.McpMMPackageImpl#getTareaAnalisis()
	 * @generated
	 */
	int TAREA_ANALISIS = 18;

	/**
	 * The feature id for the '<em><b>Nombre Tarea</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_ANALISIS__NOMBRE_TAREA = TAREA_EJECUTABLE__NOMBRE_TAREA;

	/**
	 * The feature id for the '<em><b>Task Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_ANALISIS__TASK_ID = TAREA_EJECUTABLE__TASK_ID;

	/**
	 * The feature id for the '<em><b>Task Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_ANALISIS__TASK_DESC = TAREA_EJECUTABLE__TASK_DESC;

	/**
	 * The feature id for the '<em><b>Accion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_ANALISIS__ACCION = TAREA_EJECUTABLE__ACCION;

	/**
	 * The feature id for the '<em><b>Precede</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_ANALISIS__PRECEDE = TAREA_EJECUTABLE__PRECEDE;

	/**
	 * The feature id for the '<em><b>Sigue</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_ANALISIS__SIGUE = TAREA_EJECUTABLE__SIGUE;

	/**
	 * The feature id for the '<em><b>Precede Else</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_ANALISIS__PRECEDE_ELSE = TAREA_EJECUTABLE__PRECEDE_ELSE;

	/**
	 * The feature id for the '<em><b>Sigue Else</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_ANALISIS__SIGUE_ELSE = TAREA_EJECUTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Prompt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_ANALISIS__PROMPT = TAREA_EJECUTABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Tarea Analisis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_ANALISIS_FEATURE_COUNT = TAREA_EJECUTABLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link McpMM.impl.TareaEnvioContextoImpl <em>Tarea Envio Contexto</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see McpMM.impl.TareaEnvioContextoImpl
	 * @see McpMM.impl.McpMMPackageImpl#getTareaEnvioContexto()
	 * @generated
	 */
	int TAREA_ENVIO_CONTEXTO = 19;

	/**
	 * The feature id for the '<em><b>Nombre Tarea</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_ENVIO_CONTEXTO__NOMBRE_TAREA = TAREA_EJECUTABLE__NOMBRE_TAREA;

	/**
	 * The feature id for the '<em><b>Task Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_ENVIO_CONTEXTO__TASK_ID = TAREA_EJECUTABLE__TASK_ID;

	/**
	 * The feature id for the '<em><b>Task Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_ENVIO_CONTEXTO__TASK_DESC = TAREA_EJECUTABLE__TASK_DESC;

	/**
	 * The feature id for the '<em><b>Accion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_ENVIO_CONTEXTO__ACCION = TAREA_EJECUTABLE__ACCION;

	/**
	 * The feature id for the '<em><b>Precede</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_ENVIO_CONTEXTO__PRECEDE = TAREA_EJECUTABLE__PRECEDE;

	/**
	 * The feature id for the '<em><b>Sigue</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_ENVIO_CONTEXTO__SIGUE = TAREA_EJECUTABLE__SIGUE;

	/**
	 * The feature id for the '<em><b>Precede Else</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_ENVIO_CONTEXTO__PRECEDE_ELSE = TAREA_EJECUTABLE__PRECEDE_ELSE;

	/**
	 * The number of structural features of the '<em>Tarea Envio Contexto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_ENVIO_CONTEXTO_FEATURE_COUNT = TAREA_EJECUTABLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link McpMM.impl.TareaRecepcionContextoImpl <em>Tarea Recepcion Contexto</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see McpMM.impl.TareaRecepcionContextoImpl
	 * @see McpMM.impl.McpMMPackageImpl#getTareaRecepcionContexto()
	 * @generated
	 */
	int TAREA_RECEPCION_CONTEXTO = 20;

	/**
	 * The feature id for the '<em><b>Nombre Tarea</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_RECEPCION_CONTEXTO__NOMBRE_TAREA = TAREA_EJECUTABLE__NOMBRE_TAREA;

	/**
	 * The feature id for the '<em><b>Task Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_RECEPCION_CONTEXTO__TASK_ID = TAREA_EJECUTABLE__TASK_ID;

	/**
	 * The feature id for the '<em><b>Task Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_RECEPCION_CONTEXTO__TASK_DESC = TAREA_EJECUTABLE__TASK_DESC;

	/**
	 * The feature id for the '<em><b>Accion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_RECEPCION_CONTEXTO__ACCION = TAREA_EJECUTABLE__ACCION;

	/**
	 * The feature id for the '<em><b>Precede</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_RECEPCION_CONTEXTO__PRECEDE = TAREA_EJECUTABLE__PRECEDE;

	/**
	 * The feature id for the '<em><b>Sigue</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_RECEPCION_CONTEXTO__SIGUE = TAREA_EJECUTABLE__SIGUE;

	/**
	 * The feature id for the '<em><b>Precede Else</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_RECEPCION_CONTEXTO__PRECEDE_ELSE = TAREA_EJECUTABLE__PRECEDE_ELSE;

	/**
	 * The number of structural features of the '<em>Tarea Recepcion Contexto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_RECEPCION_CONTEXTO_FEATURE_COUNT = TAREA_EJECUTABLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link McpMM.impl.TareaServerMCPImpl <em>Tarea Server MCP</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see McpMM.impl.TareaServerMCPImpl
	 * @see McpMM.impl.McpMMPackageImpl#getTareaServerMCP()
	 * @generated
	 */
	int TAREA_SERVER_MCP = 21;

	/**
	 * The feature id for the '<em><b>Nombre Tarea</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_SERVER_MCP__NOMBRE_TAREA = TAREA_EJECUTABLE__NOMBRE_TAREA;

	/**
	 * The feature id for the '<em><b>Task Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_SERVER_MCP__TASK_ID = TAREA_EJECUTABLE__TASK_ID;

	/**
	 * The feature id for the '<em><b>Task Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_SERVER_MCP__TASK_DESC = TAREA_EJECUTABLE__TASK_DESC;

	/**
	 * The feature id for the '<em><b>Accion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_SERVER_MCP__ACCION = TAREA_EJECUTABLE__ACCION;

	/**
	 * The feature id for the '<em><b>Precede</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_SERVER_MCP__PRECEDE = TAREA_EJECUTABLE__PRECEDE;

	/**
	 * The feature id for the '<em><b>Sigue</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_SERVER_MCP__SIGUE = TAREA_EJECUTABLE__SIGUE;

	/**
	 * The feature id for the '<em><b>Precede Else</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_SERVER_MCP__PRECEDE_ELSE = TAREA_EJECUTABLE__PRECEDE_ELSE;

	/**
	 * The feature id for the '<em><b>Ejecuta Operacion</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_SERVER_MCP__EJECUTA_OPERACION = TAREA_EJECUTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Prompt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_SERVER_MCP__PROMPT = TAREA_EJECUTABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Tarea Server MCP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_SERVER_MCP_FEATURE_COUNT = TAREA_EJECUTABLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link McpMM.TipoContexto <em>Tipo Contexto</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see McpMM.TipoContexto
	 * @see McpMM.impl.McpMMPackageImpl#getTipoContexto()
	 * @generated
	 */
	int TIPO_CONTEXTO = 22;


	/**
	 * Returns the meta object for class '{@link McpMM.VersionContexto <em>Version Contexto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Version Contexto</em>'.
	 * @see McpMM.VersionContexto
	 * @generated
	 */
	EClass getVersionContexto();

	/**
	 * Returns the meta object for the attribute '{@link McpMM.VersionContexto#getValorAnterior <em>Valor Anterior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valor Anterior</em>'.
	 * @see McpMM.VersionContexto#getValorAnterior()
	 * @see #getVersionContexto()
	 * @generated
	 */
	EAttribute getVersionContexto_ValorAnterior();

	/**
	 * Returns the meta object for the attribute '{@link McpMM.VersionContexto#getFechaModificacion <em>Fecha Modificacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fecha Modificacion</em>'.
	 * @see McpMM.VersionContexto#getFechaModificacion()
	 * @see #getVersionContexto()
	 * @generated
	 */
	EAttribute getVersionContexto_FechaModificacion();

	/**
	 * Returns the meta object for the container reference '{@link McpMM.VersionContexto#getPropiedadAsociada <em>Propiedad Asociada</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Propiedad Asociada</em>'.
	 * @see McpMM.VersionContexto#getPropiedadAsociada()
	 * @see #getVersionContexto()
	 * @generated
	 */
	EReference getVersionContexto_PropiedadAsociada();

	/**
	 * Returns the meta object for class '{@link McpMM.ServiceMCP <em>Service MCP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service MCP</em>'.
	 * @see McpMM.ServiceMCP
	 * @generated
	 */
	EClass getServiceMCP();

	/**
	 * Returns the meta object for the attribute '{@link McpMM.ServiceMCP#getNombreServicio <em>Nombre Servicio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre Servicio</em>'.
	 * @see McpMM.ServiceMCP#getNombreServicio()
	 * @see #getServiceMCP()
	 * @generated
	 */
	EAttribute getServiceMCP_NombreServicio();

	/**
	 * Returns the meta object for the containment reference list '{@link McpMM.ServiceMCP#getAgentes <em>Agentes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Agentes</em>'.
	 * @see McpMM.ServiceMCP#getAgentes()
	 * @see #getServiceMCP()
	 * @generated
	 */
	EReference getServiceMCP_Agentes();

	/**
	 * Returns the meta object for the containment reference list '{@link McpMM.ServiceMCP#getServicios <em>Servicios</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Servicios</em>'.
	 * @see McpMM.ServiceMCP#getServicios()
	 * @see #getServiceMCP()
	 * @generated
	 */
	EReference getServiceMCP_Servicios();

	/**
	 * Returns the meta object for the containment reference list '{@link McpMM.ServiceMCP#getServidores <em>Servidores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Servidores</em>'.
	 * @see McpMM.ServiceMCP#getServidores()
	 * @see #getServiceMCP()
	 * @generated
	 */
	EReference getServiceMCP_Servidores();

	/**
	 * Returns the meta object for class '{@link McpMM.ServerMCP <em>Server MCP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Server MCP</em>'.
	 * @see McpMM.ServerMCP
	 * @generated
	 */
	EClass getServerMCP();

	/**
	 * Returns the meta object for the attribute '{@link McpMM.ServerMCP#getNombreServer <em>Nombre Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre Server</em>'.
	 * @see McpMM.ServerMCP#getNombreServer()
	 * @see #getServerMCP()
	 * @generated
	 */
	EAttribute getServerMCP_NombreServer();

	/**
	 * Returns the meta object for the containment reference list '{@link McpMM.ServerMCP#getOperaciones <em>Operaciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operaciones</em>'.
	 * @see McpMM.ServerMCP#getOperaciones()
	 * @see #getServerMCP()
	 * @generated
	 */
	EReference getServerMCP_Operaciones();

	/**
	 * Returns the meta object for class '{@link McpMM.Agente <em>Agente</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agente</em>'.
	 * @see McpMM.Agente
	 * @generated
	 */
	EClass getAgente();

	/**
	 * Returns the meta object for the attribute '{@link McpMM.Agente#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see McpMM.Agente#getNombre()
	 * @see #getAgente()
	 * @generated
	 */
	EAttribute getAgente_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link McpMM.Agente#getRol <em>Rol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rol</em>'.
	 * @see McpMM.Agente#getRol()
	 * @see #getAgente()
	 * @generated
	 */
	EAttribute getAgente_Rol();

	/**
	 * Returns the meta object for the containment reference '{@link McpMM.Agente#getFlujo <em>Flujo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Flujo</em>'.
	 * @see McpMM.Agente#getFlujo()
	 * @see #getAgente()
	 * @generated
	 */
	EReference getAgente_Flujo();

	/**
	 * Returns the meta object for the containment reference list '{@link McpMM.Agente#getContextos <em>Contextos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contextos</em>'.
	 * @see McpMM.Agente#getContextos()
	 * @see #getAgente()
	 * @generated
	 */
	EReference getAgente_Contextos();

	/**
	 * Returns the meta object for class '{@link McpMM.Workflow <em>Workflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow</em>'.
	 * @see McpMM.Workflow
	 * @generated
	 */
	EClass getWorkflow();

	/**
	 * Returns the meta object for the attribute '{@link McpMM.Workflow#getNombreWorkflow <em>Nombre Workflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre Workflow</em>'.
	 * @see McpMM.Workflow#getNombreWorkflow()
	 * @see #getWorkflow()
	 * @generated
	 */
	EAttribute getWorkflow_NombreWorkflow();

	/**
	 * Returns the meta object for the containment reference list '{@link McpMM.Workflow#getTareas <em>Tareas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tareas</em>'.
	 * @see McpMM.Workflow#getTareas()
	 * @see #getWorkflow()
	 * @generated
	 */
	EReference getWorkflow_Tareas();

	/**
	 * Returns the meta object for class '{@link McpMM.Contexto <em>Contexto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contexto</em>'.
	 * @see McpMM.Contexto
	 * @generated
	 */
	EClass getContexto();

	/**
	 * Returns the meta object for the attribute '{@link McpMM.Contexto#getNombreContexto <em>Nombre Contexto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre Contexto</em>'.
	 * @see McpMM.Contexto#getNombreContexto()
	 * @see #getContexto()
	 * @generated
	 */
	EAttribute getContexto_NombreContexto();

	/**
	 * Returns the meta object for the containment reference list '{@link McpMM.Contexto#getPropiedades <em>Propiedades</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Propiedades</em>'.
	 * @see McpMM.Contexto#getPropiedades()
	 * @see #getContexto()
	 * @generated
	 */
	EReference getContexto_Propiedades();

	/**
	 * Returns the meta object for the reference list '{@link McpMM.Contexto#getEsApuntadoPor <em>Es Apuntado Por</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Es Apuntado Por</em>'.
	 * @see McpMM.Contexto#getEsApuntadoPor()
	 * @see #getContexto()
	 * @generated
	 */
	EReference getContexto_EsApuntadoPor();

	/**
	 * Returns the meta object for class '{@link McpMM.Propiedad <em>Propiedad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Propiedad</em>'.
	 * @see McpMM.Propiedad
	 * @generated
	 */
	EClass getPropiedad();

	/**
	 * Returns the meta object for the attribute '{@link McpMM.Propiedad#getNombrePropiedad <em>Nombre Propiedad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre Propiedad</em>'.
	 * @see McpMM.Propiedad#getNombrePropiedad()
	 * @see #getPropiedad()
	 * @generated
	 */
	EAttribute getPropiedad_NombrePropiedad();

	/**
	 * Returns the meta object for the attribute '{@link McpMM.Propiedad#getTipoPropiedad <em>Tipo Propiedad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo Propiedad</em>'.
	 * @see McpMM.Propiedad#getTipoPropiedad()
	 * @see #getPropiedad()
	 * @generated
	 */
	EAttribute getPropiedad_TipoPropiedad();

	/**
	 * Returns the meta object for the attribute '{@link McpMM.Propiedad#getExtensionPermitida <em>Extension Permitida</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extension Permitida</em>'.
	 * @see McpMM.Propiedad#getExtensionPermitida()
	 * @see #getPropiedad()
	 * @generated
	 */
	EAttribute getPropiedad_ExtensionPermitida();

	/**
	 * Returns the meta object for the attribute '{@link McpMM.Propiedad#getPesoMaxMB <em>Peso Max MB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Peso Max MB</em>'.
	 * @see McpMM.Propiedad#getPesoMaxMB()
	 * @see #getPropiedad()
	 * @generated
	 */
	EAttribute getPropiedad_PesoMaxMB();

	/**
	 * Returns the meta object for the reference list '{@link McpMM.Propiedad#getEsUsada <em>Es Usada</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Es Usada</em>'.
	 * @see McpMM.Propiedad#getEsUsada()
	 * @see #getPropiedad()
	 * @generated
	 */
	EReference getPropiedad_EsUsada();

	/**
	 * Returns the meta object for the containment reference list '{@link McpMM.Propiedad#getVersiones <em>Versiones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Versiones</em>'.
	 * @see McpMM.Propiedad#getVersiones()
	 * @see #getPropiedad()
	 * @generated
	 */
	EReference getPropiedad_Versiones();

	/**
	 * Returns the meta object for class '{@link McpMM.Tarea <em>Tarea</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tarea</em>'.
	 * @see McpMM.Tarea
	 * @generated
	 */
	EClass getTarea();

	/**
	 * Returns the meta object for the attribute '{@link McpMM.Tarea#getNombreTarea <em>Nombre Tarea</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre Tarea</em>'.
	 * @see McpMM.Tarea#getNombreTarea()
	 * @see #getTarea()
	 * @generated
	 */
	EAttribute getTarea_NombreTarea();

	/**
	 * Returns the meta object for the attribute '{@link McpMM.Tarea#getTaskId <em>Task Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Task Id</em>'.
	 * @see McpMM.Tarea#getTaskId()
	 * @see #getTarea()
	 * @generated
	 */
	EAttribute getTarea_TaskId();

	/**
	 * Returns the meta object for the attribute '{@link McpMM.Tarea#getTaskDesc <em>Task Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Task Desc</em>'.
	 * @see McpMM.Tarea#getTaskDesc()
	 * @see #getTarea()
	 * @generated
	 */
	EAttribute getTarea_TaskDesc();

	/**
	 * Returns the meta object for the containment reference list '{@link McpMM.Tarea#getAccion <em>Accion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Accion</em>'.
	 * @see McpMM.Tarea#getAccion()
	 * @see #getTarea()
	 * @generated
	 */
	EReference getTarea_Accion();

	/**
	 * Returns the meta object for the reference '{@link McpMM.Tarea#getPrecede <em>Precede</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Precede</em>'.
	 * @see McpMM.Tarea#getPrecede()
	 * @see #getTarea()
	 * @generated
	 */
	EReference getTarea_Precede();

	/**
	 * Returns the meta object for the reference '{@link McpMM.Tarea#getSigue <em>Sigue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sigue</em>'.
	 * @see McpMM.Tarea#getSigue()
	 * @see #getTarea()
	 * @generated
	 */
	EReference getTarea_Sigue();

	/**
	 * Returns the meta object for the reference '{@link McpMM.Tarea#getPrecedeElse <em>Precede Else</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Precede Else</em>'.
	 * @see McpMM.Tarea#getPrecedeElse()
	 * @see #getTarea()
	 * @generated
	 */
	EReference getTarea_PrecedeElse();

	/**
	 * Returns the meta object for class '{@link McpMM.TareaEjecutable <em>Tarea Ejecutable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tarea Ejecutable</em>'.
	 * @see McpMM.TareaEjecutable
	 * @generated
	 */
	EClass getTareaEjecutable();

	/**
	 * Returns the meta object for class '{@link McpMM.Inicio <em>Inicio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inicio</em>'.
	 * @see McpMM.Inicio
	 * @generated
	 */
	EClass getInicio();

	/**
	 * Returns the meta object for class '{@link McpMM.Final <em>Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Final</em>'.
	 * @see McpMM.Final
	 * @generated
	 */
	EClass getFinal();

	/**
	 * Returns the meta object for class '{@link McpMM.Accion <em>Accion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Accion</em>'.
	 * @see McpMM.Accion
	 * @generated
	 */
	EClass getAccion();

	/**
	 * Returns the meta object for the attribute '{@link McpMM.Accion#getNombreAccion <em>Nombre Accion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre Accion</em>'.
	 * @see McpMM.Accion#getNombreAccion()
	 * @see #getAccion()
	 * @generated
	 */
	EAttribute getAccion_NombreAccion();

	/**
	 * Returns the meta object for the reference '{@link McpMM.Accion#getApunta <em>Apunta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Apunta</em>'.
	 * @see McpMM.Accion#getApunta()
	 * @see #getAccion()
	 * @generated
	 */
	EReference getAccion_Apunta();

	/**
	 * Returns the meta object for the reference '{@link McpMM.Accion#getUsa <em>Usa</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Usa</em>'.
	 * @see McpMM.Accion#getUsa()
	 * @see #getAccion()
	 * @generated
	 */
	EReference getAccion_Usa();

	/**
	 * Returns the meta object for class '{@link McpMM.Escritura <em>Escritura</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Escritura</em>'.
	 * @see McpMM.Escritura
	 * @generated
	 */
	EClass getEscritura();

	/**
	 * Returns the meta object for class '{@link McpMM.Lectura <em>Lectura</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lectura</em>'.
	 * @see McpMM.Lectura
	 * @generated
	 */
	EClass getLectura();

	/**
	 * Returns the meta object for class '{@link McpMM.OperacionMCP <em>Operacion MCP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operacion MCP</em>'.
	 * @see McpMM.OperacionMCP
	 * @generated
	 */
	EClass getOperacionMCP();

	/**
	 * Returns the meta object for the attribute '{@link McpMM.OperacionMCP#getNombreOperacion <em>Nombre Operacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre Operacion</em>'.
	 * @see McpMM.OperacionMCP#getNombreOperacion()
	 * @see #getOperacionMCP()
	 * @generated
	 */
	EAttribute getOperacionMCP_NombreOperacion();

	/**
	 * Returns the meta object for the attribute '{@link McpMM.OperacionMCP#getDescOperacion <em>Desc Operacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Desc Operacion</em>'.
	 * @see McpMM.OperacionMCP#getDescOperacion()
	 * @see #getOperacionMCP()
	 * @generated
	 */
	EAttribute getOperacionMCP_DescOperacion();

	/**
	 * Returns the meta object for the reference '{@link McpMM.OperacionMCP#getEsEjecutadaOperacion <em>Es Ejecutada Operacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Es Ejecutada Operacion</em>'.
	 * @see McpMM.OperacionMCP#getEsEjecutadaOperacion()
	 * @see #getOperacionMCP()
	 * @generated
	 */
	EReference getOperacionMCP_EsEjecutadaOperacion();

	/**
	 * Returns the meta object for class '{@link McpMM.TareaTransformacionDatos <em>Tarea Transformacion Datos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tarea Transformacion Datos</em>'.
	 * @see McpMM.TareaTransformacionDatos
	 * @generated
	 */
	EClass getTareaTransformacionDatos();

	/**
	 * Returns the meta object for the attribute '{@link McpMM.TareaTransformacionDatos#getPrompt <em>Prompt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prompt</em>'.
	 * @see McpMM.TareaTransformacionDatos#getPrompt()
	 * @see #getTareaTransformacionDatos()
	 * @generated
	 */
	EAttribute getTareaTransformacionDatos_Prompt();

	/**
	 * Returns the meta object for class '{@link McpMM.TareaLLM <em>Tarea LLM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tarea LLM</em>'.
	 * @see McpMM.TareaLLM
	 * @generated
	 */
	EClass getTareaLLM();

	/**
	 * Returns the meta object for the attribute '{@link McpMM.TareaLLM#getPrompt <em>Prompt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prompt</em>'.
	 * @see McpMM.TareaLLM#getPrompt()
	 * @see #getTareaLLM()
	 * @generated
	 */
	EAttribute getTareaLLM_Prompt();

	/**
	 * Returns the meta object for class '{@link McpMM.TareaUsuario <em>Tarea Usuario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tarea Usuario</em>'.
	 * @see McpMM.TareaUsuario
	 * @generated
	 */
	EClass getTareaUsuario();

	/**
	 * Returns the meta object for class '{@link McpMM.TareaAnalisis <em>Tarea Analisis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tarea Analisis</em>'.
	 * @see McpMM.TareaAnalisis
	 * @generated
	 */
	EClass getTareaAnalisis();

	/**
	 * Returns the meta object for the reference '{@link McpMM.TareaAnalisis#getSigueElse <em>Sigue Else</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sigue Else</em>'.
	 * @see McpMM.TareaAnalisis#getSigueElse()
	 * @see #getTareaAnalisis()
	 * @generated
	 */
	EReference getTareaAnalisis_SigueElse();

	/**
	 * Returns the meta object for the attribute '{@link McpMM.TareaAnalisis#getPrompt <em>Prompt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prompt</em>'.
	 * @see McpMM.TareaAnalisis#getPrompt()
	 * @see #getTareaAnalisis()
	 * @generated
	 */
	EAttribute getTareaAnalisis_Prompt();

	/**
	 * Returns the meta object for class '{@link McpMM.TareaEnvioContexto <em>Tarea Envio Contexto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tarea Envio Contexto</em>'.
	 * @see McpMM.TareaEnvioContexto
	 * @generated
	 */
	EClass getTareaEnvioContexto();

	/**
	 * Returns the meta object for class '{@link McpMM.TareaRecepcionContexto <em>Tarea Recepcion Contexto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tarea Recepcion Contexto</em>'.
	 * @see McpMM.TareaRecepcionContexto
	 * @generated
	 */
	EClass getTareaRecepcionContexto();

	/**
	 * Returns the meta object for class '{@link McpMM.TareaServerMCP <em>Tarea Server MCP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tarea Server MCP</em>'.
	 * @see McpMM.TareaServerMCP
	 * @generated
	 */
	EClass getTareaServerMCP();

	/**
	 * Returns the meta object for the reference '{@link McpMM.TareaServerMCP#getEjecutaOperacion <em>Ejecuta Operacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ejecuta Operacion</em>'.
	 * @see McpMM.TareaServerMCP#getEjecutaOperacion()
	 * @see #getTareaServerMCP()
	 * @generated
	 */
	EReference getTareaServerMCP_EjecutaOperacion();

	/**
	 * Returns the meta object for the attribute '{@link McpMM.TareaServerMCP#getPrompt <em>Prompt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prompt</em>'.
	 * @see McpMM.TareaServerMCP#getPrompt()
	 * @see #getTareaServerMCP()
	 * @generated
	 */
	EAttribute getTareaServerMCP_Prompt();

	/**
	 * Returns the meta object for enum '{@link McpMM.TipoContexto <em>Tipo Contexto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tipo Contexto</em>'.
	 * @see McpMM.TipoContexto
	 * @generated
	 */
	EEnum getTipoContexto();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	McpMMFactory getMcpMMFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link McpMM.impl.VersionContextoImpl <em>Version Contexto</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see McpMM.impl.VersionContextoImpl
		 * @see McpMM.impl.McpMMPackageImpl#getVersionContexto()
		 * @generated
		 */
		EClass VERSION_CONTEXTO = eINSTANCE.getVersionContexto();

		/**
		 * The meta object literal for the '<em><b>Valor Anterior</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSION_CONTEXTO__VALOR_ANTERIOR = eINSTANCE.getVersionContexto_ValorAnterior();

		/**
		 * The meta object literal for the '<em><b>Fecha Modificacion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSION_CONTEXTO__FECHA_MODIFICACION = eINSTANCE.getVersionContexto_FechaModificacion();

		/**
		 * The meta object literal for the '<em><b>Propiedad Asociada</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERSION_CONTEXTO__PROPIEDAD_ASOCIADA = eINSTANCE.getVersionContexto_PropiedadAsociada();

		/**
		 * The meta object literal for the '{@link McpMM.impl.ServiceMCPImpl <em>Service MCP</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see McpMM.impl.ServiceMCPImpl
		 * @see McpMM.impl.McpMMPackageImpl#getServiceMCP()
		 * @generated
		 */
		EClass SERVICE_MCP = eINSTANCE.getServiceMCP();

		/**
		 * The meta object literal for the '<em><b>Nombre Servicio</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_MCP__NOMBRE_SERVICIO = eINSTANCE.getServiceMCP_NombreServicio();

		/**
		 * The meta object literal for the '<em><b>Agentes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_MCP__AGENTES = eINSTANCE.getServiceMCP_Agentes();

		/**
		 * The meta object literal for the '<em><b>Servicios</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_MCP__SERVICIOS = eINSTANCE.getServiceMCP_Servicios();

		/**
		 * The meta object literal for the '<em><b>Servidores</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_MCP__SERVIDORES = eINSTANCE.getServiceMCP_Servidores();

		/**
		 * The meta object literal for the '{@link McpMM.impl.ServerMCPImpl <em>Server MCP</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see McpMM.impl.ServerMCPImpl
		 * @see McpMM.impl.McpMMPackageImpl#getServerMCP()
		 * @generated
		 */
		EClass SERVER_MCP = eINSTANCE.getServerMCP();

		/**
		 * The meta object literal for the '<em><b>Nombre Server</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVER_MCP__NOMBRE_SERVER = eINSTANCE.getServerMCP_NombreServer();

		/**
		 * The meta object literal for the '<em><b>Operaciones</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVER_MCP__OPERACIONES = eINSTANCE.getServerMCP_Operaciones();

		/**
		 * The meta object literal for the '{@link McpMM.impl.AgenteImpl <em>Agente</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see McpMM.impl.AgenteImpl
		 * @see McpMM.impl.McpMMPackageImpl#getAgente()
		 * @generated
		 */
		EClass AGENTE = eINSTANCE.getAgente();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENTE__NOMBRE = eINSTANCE.getAgente_Nombre();

		/**
		 * The meta object literal for the '<em><b>Rol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENTE__ROL = eINSTANCE.getAgente_Rol();

		/**
		 * The meta object literal for the '<em><b>Flujo</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENTE__FLUJO = eINSTANCE.getAgente_Flujo();

		/**
		 * The meta object literal for the '<em><b>Contextos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENTE__CONTEXTOS = eINSTANCE.getAgente_Contextos();

		/**
		 * The meta object literal for the '{@link McpMM.impl.WorkflowImpl <em>Workflow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see McpMM.impl.WorkflowImpl
		 * @see McpMM.impl.McpMMPackageImpl#getWorkflow()
		 * @generated
		 */
		EClass WORKFLOW = eINSTANCE.getWorkflow();

		/**
		 * The meta object literal for the '<em><b>Nombre Workflow</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKFLOW__NOMBRE_WORKFLOW = eINSTANCE.getWorkflow_NombreWorkflow();

		/**
		 * The meta object literal for the '<em><b>Tareas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW__TAREAS = eINSTANCE.getWorkflow_Tareas();

		/**
		 * The meta object literal for the '{@link McpMM.impl.ContextoImpl <em>Contexto</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see McpMM.impl.ContextoImpl
		 * @see McpMM.impl.McpMMPackageImpl#getContexto()
		 * @generated
		 */
		EClass CONTEXTO = eINSTANCE.getContexto();

		/**
		 * The meta object literal for the '<em><b>Nombre Contexto</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXTO__NOMBRE_CONTEXTO = eINSTANCE.getContexto_NombreContexto();

		/**
		 * The meta object literal for the '<em><b>Propiedades</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXTO__PROPIEDADES = eINSTANCE.getContexto_Propiedades();

		/**
		 * The meta object literal for the '<em><b>Es Apuntado Por</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXTO__ES_APUNTADO_POR = eINSTANCE.getContexto_EsApuntadoPor();

		/**
		 * The meta object literal for the '{@link McpMM.impl.PropiedadImpl <em>Propiedad</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see McpMM.impl.PropiedadImpl
		 * @see McpMM.impl.McpMMPackageImpl#getPropiedad()
		 * @generated
		 */
		EClass PROPIEDAD = eINSTANCE.getPropiedad();

		/**
		 * The meta object literal for the '<em><b>Nombre Propiedad</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPIEDAD__NOMBRE_PROPIEDAD = eINSTANCE.getPropiedad_NombrePropiedad();

		/**
		 * The meta object literal for the '<em><b>Tipo Propiedad</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPIEDAD__TIPO_PROPIEDAD = eINSTANCE.getPropiedad_TipoPropiedad();

		/**
		 * The meta object literal for the '<em><b>Extension Permitida</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPIEDAD__EXTENSION_PERMITIDA = eINSTANCE.getPropiedad_ExtensionPermitida();

		/**
		 * The meta object literal for the '<em><b>Peso Max MB</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPIEDAD__PESO_MAX_MB = eINSTANCE.getPropiedad_PesoMaxMB();

		/**
		 * The meta object literal for the '<em><b>Es Usada</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPIEDAD__ES_USADA = eINSTANCE.getPropiedad_EsUsada();

		/**
		 * The meta object literal for the '<em><b>Versiones</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPIEDAD__VERSIONES = eINSTANCE.getPropiedad_Versiones();

		/**
		 * The meta object literal for the '{@link McpMM.impl.TareaImpl <em>Tarea</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see McpMM.impl.TareaImpl
		 * @see McpMM.impl.McpMMPackageImpl#getTarea()
		 * @generated
		 */
		EClass TAREA = eINSTANCE.getTarea();

		/**
		 * The meta object literal for the '<em><b>Nombre Tarea</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAREA__NOMBRE_TAREA = eINSTANCE.getTarea_NombreTarea();

		/**
		 * The meta object literal for the '<em><b>Task Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAREA__TASK_ID = eINSTANCE.getTarea_TaskId();

		/**
		 * The meta object literal for the '<em><b>Task Desc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAREA__TASK_DESC = eINSTANCE.getTarea_TaskDesc();

		/**
		 * The meta object literal for the '<em><b>Accion</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAREA__ACCION = eINSTANCE.getTarea_Accion();

		/**
		 * The meta object literal for the '<em><b>Precede</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAREA__PRECEDE = eINSTANCE.getTarea_Precede();

		/**
		 * The meta object literal for the '<em><b>Sigue</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAREA__SIGUE = eINSTANCE.getTarea_Sigue();

		/**
		 * The meta object literal for the '<em><b>Precede Else</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAREA__PRECEDE_ELSE = eINSTANCE.getTarea_PrecedeElse();

		/**
		 * The meta object literal for the '{@link McpMM.impl.TareaEjecutableImpl <em>Tarea Ejecutable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see McpMM.impl.TareaEjecutableImpl
		 * @see McpMM.impl.McpMMPackageImpl#getTareaEjecutable()
		 * @generated
		 */
		EClass TAREA_EJECUTABLE = eINSTANCE.getTareaEjecutable();

		/**
		 * The meta object literal for the '{@link McpMM.impl.InicioImpl <em>Inicio</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see McpMM.impl.InicioImpl
		 * @see McpMM.impl.McpMMPackageImpl#getInicio()
		 * @generated
		 */
		EClass INICIO = eINSTANCE.getInicio();

		/**
		 * The meta object literal for the '{@link McpMM.impl.FinalImpl <em>Final</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see McpMM.impl.FinalImpl
		 * @see McpMM.impl.McpMMPackageImpl#getFinal()
		 * @generated
		 */
		EClass FINAL = eINSTANCE.getFinal();

		/**
		 * The meta object literal for the '{@link McpMM.impl.AccionImpl <em>Accion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see McpMM.impl.AccionImpl
		 * @see McpMM.impl.McpMMPackageImpl#getAccion()
		 * @generated
		 */
		EClass ACCION = eINSTANCE.getAccion();

		/**
		 * The meta object literal for the '<em><b>Nombre Accion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCION__NOMBRE_ACCION = eINSTANCE.getAccion_NombreAccion();

		/**
		 * The meta object literal for the '<em><b>Apunta</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCION__APUNTA = eINSTANCE.getAccion_Apunta();

		/**
		 * The meta object literal for the '<em><b>Usa</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCION__USA = eINSTANCE.getAccion_Usa();

		/**
		 * The meta object literal for the '{@link McpMM.impl.EscrituraImpl <em>Escritura</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see McpMM.impl.EscrituraImpl
		 * @see McpMM.impl.McpMMPackageImpl#getEscritura()
		 * @generated
		 */
		EClass ESCRITURA = eINSTANCE.getEscritura();

		/**
		 * The meta object literal for the '{@link McpMM.impl.LecturaImpl <em>Lectura</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see McpMM.impl.LecturaImpl
		 * @see McpMM.impl.McpMMPackageImpl#getLectura()
		 * @generated
		 */
		EClass LECTURA = eINSTANCE.getLectura();

		/**
		 * The meta object literal for the '{@link McpMM.impl.OperacionMCPImpl <em>Operacion MCP</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see McpMM.impl.OperacionMCPImpl
		 * @see McpMM.impl.McpMMPackageImpl#getOperacionMCP()
		 * @generated
		 */
		EClass OPERACION_MCP = eINSTANCE.getOperacionMCP();

		/**
		 * The meta object literal for the '<em><b>Nombre Operacion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERACION_MCP__NOMBRE_OPERACION = eINSTANCE.getOperacionMCP_NombreOperacion();

		/**
		 * The meta object literal for the '<em><b>Desc Operacion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERACION_MCP__DESC_OPERACION = eINSTANCE.getOperacionMCP_DescOperacion();

		/**
		 * The meta object literal for the '<em><b>Es Ejecutada Operacion</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERACION_MCP__ES_EJECUTADA_OPERACION = eINSTANCE.getOperacionMCP_EsEjecutadaOperacion();

		/**
		 * The meta object literal for the '{@link McpMM.impl.TareaTransformacionDatosImpl <em>Tarea Transformacion Datos</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see McpMM.impl.TareaTransformacionDatosImpl
		 * @see McpMM.impl.McpMMPackageImpl#getTareaTransformacionDatos()
		 * @generated
		 */
		EClass TAREA_TRANSFORMACION_DATOS = eINSTANCE.getTareaTransformacionDatos();

		/**
		 * The meta object literal for the '<em><b>Prompt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAREA_TRANSFORMACION_DATOS__PROMPT = eINSTANCE.getTareaTransformacionDatos_Prompt();

		/**
		 * The meta object literal for the '{@link McpMM.impl.TareaLLMImpl <em>Tarea LLM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see McpMM.impl.TareaLLMImpl
		 * @see McpMM.impl.McpMMPackageImpl#getTareaLLM()
		 * @generated
		 */
		EClass TAREA_LLM = eINSTANCE.getTareaLLM();

		/**
		 * The meta object literal for the '<em><b>Prompt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAREA_LLM__PROMPT = eINSTANCE.getTareaLLM_Prompt();

		/**
		 * The meta object literal for the '{@link McpMM.impl.TareaUsuarioImpl <em>Tarea Usuario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see McpMM.impl.TareaUsuarioImpl
		 * @see McpMM.impl.McpMMPackageImpl#getTareaUsuario()
		 * @generated
		 */
		EClass TAREA_USUARIO = eINSTANCE.getTareaUsuario();

		/**
		 * The meta object literal for the '{@link McpMM.impl.TareaAnalisisImpl <em>Tarea Analisis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see McpMM.impl.TareaAnalisisImpl
		 * @see McpMM.impl.McpMMPackageImpl#getTareaAnalisis()
		 * @generated
		 */
		EClass TAREA_ANALISIS = eINSTANCE.getTareaAnalisis();

		/**
		 * The meta object literal for the '<em><b>Sigue Else</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAREA_ANALISIS__SIGUE_ELSE = eINSTANCE.getTareaAnalisis_SigueElse();

		/**
		 * The meta object literal for the '<em><b>Prompt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAREA_ANALISIS__PROMPT = eINSTANCE.getTareaAnalisis_Prompt();

		/**
		 * The meta object literal for the '{@link McpMM.impl.TareaEnvioContextoImpl <em>Tarea Envio Contexto</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see McpMM.impl.TareaEnvioContextoImpl
		 * @see McpMM.impl.McpMMPackageImpl#getTareaEnvioContexto()
		 * @generated
		 */
		EClass TAREA_ENVIO_CONTEXTO = eINSTANCE.getTareaEnvioContexto();

		/**
		 * The meta object literal for the '{@link McpMM.impl.TareaRecepcionContextoImpl <em>Tarea Recepcion Contexto</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see McpMM.impl.TareaRecepcionContextoImpl
		 * @see McpMM.impl.McpMMPackageImpl#getTareaRecepcionContexto()
		 * @generated
		 */
		EClass TAREA_RECEPCION_CONTEXTO = eINSTANCE.getTareaRecepcionContexto();

		/**
		 * The meta object literal for the '{@link McpMM.impl.TareaServerMCPImpl <em>Tarea Server MCP</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see McpMM.impl.TareaServerMCPImpl
		 * @see McpMM.impl.McpMMPackageImpl#getTareaServerMCP()
		 * @generated
		 */
		EClass TAREA_SERVER_MCP = eINSTANCE.getTareaServerMCP();

		/**
		 * The meta object literal for the '<em><b>Ejecuta Operacion</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAREA_SERVER_MCP__EJECUTA_OPERACION = eINSTANCE.getTareaServerMCP_EjecutaOperacion();

		/**
		 * The meta object literal for the '<em><b>Prompt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAREA_SERVER_MCP__PROMPT = eINSTANCE.getTareaServerMCP_Prompt();

		/**
		 * The meta object literal for the '{@link McpMM.TipoContexto <em>Tipo Contexto</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see McpMM.TipoContexto
		 * @see McpMM.impl.McpMMPackageImpl#getTipoContexto()
		 * @generated
		 */
		EEnum TIPO_CONTEXTO = eINSTANCE.getTipoContexto();

	}

} //McpMMPackage
