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
	 * The meta object id for the '{@link McpMM.impl.ServiceMCPImpl <em>Service MCP</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see McpMM.impl.ServiceMCPImpl
	 * @see McpMM.impl.McpMMPackageImpl#getServiceMCP()
	 * @generated
	 */
	int SERVICE_MCP = 0;

	/**
	 * The feature id for the '<em><b>Nombre Servicio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_MCP__NOMBRE_SERVICIO = 0;

	/**
	 * The feature id for the '<em><b>Servermcp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_MCP__SERVERMCP = 1;

	/**
	 * The feature id for the '<em><b>Agente</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_MCP__AGENTE = 2;

	/**
	 * The feature id for the '<em><b>Workflow</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_MCP__WORKFLOW = 3;

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
	int SERVER_MCP = 1;

	/**
	 * The feature id for the '<em><b>Nombre Server</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_MCP__NOMBRE_SERVER = 0;

	/**
	 * The feature id for the '<em><b>Operacionmcp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_MCP__OPERACIONMCP = 1;

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
	int AGENTE = 2;

	/**
	 * The feature id for the '<em><b>Nombre Agente</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENTE__NOMBRE_AGENTE = 0;

	/**
	 * The feature id for the '<em><b>Num Tareas</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENTE__NUM_TAREAS = 1;

	/**
	 * The feature id for the '<em><b>Realiza</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENTE__REALIZA = 2;

	/**
	 * The number of structural features of the '<em>Agente</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENTE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link McpMM.impl.WorkflowImpl <em>Workflow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see McpMM.impl.WorkflowImpl
	 * @see McpMM.impl.McpMMPackageImpl#getWorkflow()
	 * @generated
	 */
	int WORKFLOW = 3;

	/**
	 * The feature id for the '<em><b>Nombre Workflow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__NOMBRE_WORKFLOW = 0;

	/**
	 * The feature id for the '<em><b>Contexto</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__CONTEXTO = 1;

	/**
	 * The feature id for the '<em><b>Tarea</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__TAREA = 2;

	/**
	 * The feature id for the '<em><b>Empieza Con</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__EMPIEZA_CON = 3;

	/**
	 * The feature id for the '<em><b>Finaliza Con</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__FINALIZA_CON = 4;

	/**
	 * The number of structural features of the '<em>Workflow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link McpMM.impl.ContextoImpl <em>Contexto</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see McpMM.impl.ContextoImpl
	 * @see McpMM.impl.McpMMPackageImpl#getContexto()
	 * @generated
	 */
	int CONTEXTO = 4;

	/**
	 * The feature id for the '<em><b>Nombre Contexto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTO__NOMBRE_CONTEXTO = 0;

	/**
	 * The feature id for the '<em><b>Propiedad</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTO__PROPIEDAD = 1;

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
	int PROPIEDAD = 5;

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
	 * The feature id for the '<em><b>Es Usada</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPIEDAD__ES_USADA = 2;

	/**
	 * The number of structural features of the '<em>Propiedad</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPIEDAD_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link McpMM.impl.TareaImpl <em>Tarea</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see McpMM.impl.TareaImpl
	 * @see McpMM.impl.McpMMPackageImpl#getTarea()
	 * @generated
	 */
	int TAREA = 6;

	/**
	 * The feature id for the '<em><b>Nombre Tarea</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA__NOMBRE_TAREA = 0;

	/**
	 * The feature id for the '<em><b>Accion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA__ACCION = 1;

	/**
	 * The feature id for the '<em><b>Precede</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA__PRECEDE = 2;

	/**
	 * The feature id for the '<em><b>Sigue</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA__SIGUE = 3;

	/**
	 * The feature id for the '<em><b>Precede Else</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA__PRECEDE_ELSE = 4;

	/**
	 * The feature id for the '<em><b>Agente Asignado</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA__AGENTE_ASIGNADO = 5;

	/**
	 * The number of structural features of the '<em>Tarea</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link McpMM.impl.TareaEjecutableImpl <em>Tarea Ejecutable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see McpMM.impl.TareaEjecutableImpl
	 * @see McpMM.impl.McpMMPackageImpl#getTareaEjecutable()
	 * @generated
	 */
	int TAREA_EJECUTABLE = 7;

	/**
	 * The feature id for the '<em><b>Nombre Tarea</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_EJECUTABLE__NOMBRE_TAREA = TAREA__NOMBRE_TAREA;

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
	 * The feature id for the '<em><b>Agente Asignado</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_EJECUTABLE__AGENTE_ASIGNADO = TAREA__AGENTE_ASIGNADO;

	/**
	 * The feature id for the '<em><b>Id Tarea</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_EJECUTABLE__ID_TAREA = TAREA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Desc Tarea</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_EJECUTABLE__DESC_TAREA = TAREA_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Tarea Ejecutable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_EJECUTABLE_FEATURE_COUNT = TAREA_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link McpMM.impl.TareaFinalImpl <em>Tarea Final</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see McpMM.impl.TareaFinalImpl
	 * @see McpMM.impl.McpMMPackageImpl#getTareaFinal()
	 * @generated
	 */
	int TAREA_FINAL = 8;

	/**
	 * The feature id for the '<em><b>Nombre Tarea</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_FINAL__NOMBRE_TAREA = TAREA__NOMBRE_TAREA;

	/**
	 * The feature id for the '<em><b>Accion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_FINAL__ACCION = TAREA__ACCION;

	/**
	 * The feature id for the '<em><b>Precede</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_FINAL__PRECEDE = TAREA__PRECEDE;

	/**
	 * The feature id for the '<em><b>Sigue</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_FINAL__SIGUE = TAREA__SIGUE;

	/**
	 * The feature id for the '<em><b>Precede Else</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_FINAL__PRECEDE_ELSE = TAREA__PRECEDE_ELSE;

	/**
	 * The feature id for the '<em><b>Agente Asignado</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_FINAL__AGENTE_ASIGNADO = TAREA__AGENTE_ASIGNADO;

	/**
	 * The feature id for the '<em><b>Finaliza</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_FINAL__FINALIZA = TAREA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tarea Final</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_FINAL_FEATURE_COUNT = TAREA_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link McpMM.impl.TareaInicialImpl <em>Tarea Inicial</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see McpMM.impl.TareaInicialImpl
	 * @see McpMM.impl.McpMMPackageImpl#getTareaInicial()
	 * @generated
	 */
	int TAREA_INICIAL = 9;

	/**
	 * The feature id for the '<em><b>Nombre Tarea</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_INICIAL__NOMBRE_TAREA = TAREA__NOMBRE_TAREA;

	/**
	 * The feature id for the '<em><b>Accion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_INICIAL__ACCION = TAREA__ACCION;

	/**
	 * The feature id for the '<em><b>Precede</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_INICIAL__PRECEDE = TAREA__PRECEDE;

	/**
	 * The feature id for the '<em><b>Sigue</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_INICIAL__SIGUE = TAREA__SIGUE;

	/**
	 * The feature id for the '<em><b>Precede Else</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_INICIAL__PRECEDE_ELSE = TAREA__PRECEDE_ELSE;

	/**
	 * The feature id for the '<em><b>Agente Asignado</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_INICIAL__AGENTE_ASIGNADO = TAREA__AGENTE_ASIGNADO;

	/**
	 * The feature id for the '<em><b>Empieza</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_INICIAL__EMPIEZA = TAREA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tarea Inicial</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_INICIAL_FEATURE_COUNT = TAREA_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link McpMM.impl.AccionImpl <em>Accion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see McpMM.impl.AccionImpl
	 * @see McpMM.impl.McpMMPackageImpl#getAccion()
	 * @generated
	 */
	int ACCION = 10;

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
	int ESCRITURA = 11;

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
	int LECTURA = 12;

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
	int OPERACION_MCP = 13;

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
	int TAREA_TRANSFORMACION_DATOS = 14;

	/**
	 * The feature id for the '<em><b>Nombre Tarea</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_TRANSFORMACION_DATOS__NOMBRE_TAREA = TAREA_EJECUTABLE__NOMBRE_TAREA;

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
	 * The feature id for the '<em><b>Agente Asignado</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_TRANSFORMACION_DATOS__AGENTE_ASIGNADO = TAREA_EJECUTABLE__AGENTE_ASIGNADO;

	/**
	 * The feature id for the '<em><b>Id Tarea</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_TRANSFORMACION_DATOS__ID_TAREA = TAREA_EJECUTABLE__ID_TAREA;

	/**
	 * The feature id for the '<em><b>Desc Tarea</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_TRANSFORMACION_DATOS__DESC_TAREA = TAREA_EJECUTABLE__DESC_TAREA;

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
	int TAREA_LLM = 15;

	/**
	 * The feature id for the '<em><b>Nombre Tarea</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_LLM__NOMBRE_TAREA = TAREA_EJECUTABLE__NOMBRE_TAREA;

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
	 * The feature id for the '<em><b>Agente Asignado</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_LLM__AGENTE_ASIGNADO = TAREA_EJECUTABLE__AGENTE_ASIGNADO;

	/**
	 * The feature id for the '<em><b>Id Tarea</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_LLM__ID_TAREA = TAREA_EJECUTABLE__ID_TAREA;

	/**
	 * The feature id for the '<em><b>Desc Tarea</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_LLM__DESC_TAREA = TAREA_EJECUTABLE__DESC_TAREA;

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
	int TAREA_USUARIO = 16;

	/**
	 * The feature id for the '<em><b>Nombre Tarea</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_USUARIO__NOMBRE_TAREA = TAREA_EJECUTABLE__NOMBRE_TAREA;

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
	 * The feature id for the '<em><b>Agente Asignado</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_USUARIO__AGENTE_ASIGNADO = TAREA_EJECUTABLE__AGENTE_ASIGNADO;

	/**
	 * The feature id for the '<em><b>Id Tarea</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_USUARIO__ID_TAREA = TAREA_EJECUTABLE__ID_TAREA;

	/**
	 * The feature id for the '<em><b>Desc Tarea</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_USUARIO__DESC_TAREA = TAREA_EJECUTABLE__DESC_TAREA;

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
	int TAREA_ANALISIS = 17;

	/**
	 * The feature id for the '<em><b>Nombre Tarea</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_ANALISIS__NOMBRE_TAREA = TAREA_EJECUTABLE__NOMBRE_TAREA;

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
	 * The feature id for the '<em><b>Agente Asignado</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_ANALISIS__AGENTE_ASIGNADO = TAREA_EJECUTABLE__AGENTE_ASIGNADO;

	/**
	 * The feature id for the '<em><b>Id Tarea</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_ANALISIS__ID_TAREA = TAREA_EJECUTABLE__ID_TAREA;

	/**
	 * The feature id for the '<em><b>Desc Tarea</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_ANALISIS__DESC_TAREA = TAREA_EJECUTABLE__DESC_TAREA;

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
	int TAREA_ENVIO_CONTEXTO = 18;

	/**
	 * The feature id for the '<em><b>Nombre Tarea</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_ENVIO_CONTEXTO__NOMBRE_TAREA = TAREA_EJECUTABLE__NOMBRE_TAREA;

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
	 * The feature id for the '<em><b>Agente Asignado</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_ENVIO_CONTEXTO__AGENTE_ASIGNADO = TAREA_EJECUTABLE__AGENTE_ASIGNADO;

	/**
	 * The feature id for the '<em><b>Id Tarea</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_ENVIO_CONTEXTO__ID_TAREA = TAREA_EJECUTABLE__ID_TAREA;

	/**
	 * The feature id for the '<em><b>Desc Tarea</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_ENVIO_CONTEXTO__DESC_TAREA = TAREA_EJECUTABLE__DESC_TAREA;

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
	int TAREA_RECEPCION_CONTEXTO = 19;

	/**
	 * The feature id for the '<em><b>Nombre Tarea</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_RECEPCION_CONTEXTO__NOMBRE_TAREA = TAREA_EJECUTABLE__NOMBRE_TAREA;

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
	 * The feature id for the '<em><b>Agente Asignado</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_RECEPCION_CONTEXTO__AGENTE_ASIGNADO = TAREA_EJECUTABLE__AGENTE_ASIGNADO;

	/**
	 * The feature id for the '<em><b>Id Tarea</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_RECEPCION_CONTEXTO__ID_TAREA = TAREA_EJECUTABLE__ID_TAREA;

	/**
	 * The feature id for the '<em><b>Desc Tarea</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_RECEPCION_CONTEXTO__DESC_TAREA = TAREA_EJECUTABLE__DESC_TAREA;

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
	int TAREA_SERVER_MCP = 20;

	/**
	 * The feature id for the '<em><b>Nombre Tarea</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_SERVER_MCP__NOMBRE_TAREA = TAREA_EJECUTABLE__NOMBRE_TAREA;

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
	 * The feature id for the '<em><b>Agente Asignado</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_SERVER_MCP__AGENTE_ASIGNADO = TAREA_EJECUTABLE__AGENTE_ASIGNADO;

	/**
	 * The feature id for the '<em><b>Id Tarea</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_SERVER_MCP__ID_TAREA = TAREA_EJECUTABLE__ID_TAREA;

	/**
	 * The feature id for the '<em><b>Desc Tarea</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_SERVER_MCP__DESC_TAREA = TAREA_EJECUTABLE__DESC_TAREA;

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
	int TIPO_CONTEXTO = 21;


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
	 * Returns the meta object for the containment reference list '{@link McpMM.ServiceMCP#getServermcp <em>Servermcp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Servermcp</em>'.
	 * @see McpMM.ServiceMCP#getServermcp()
	 * @see #getServiceMCP()
	 * @generated
	 */
	EReference getServiceMCP_Servermcp();

	/**
	 * Returns the meta object for the containment reference list '{@link McpMM.ServiceMCP#getAgente <em>Agente</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Agente</em>'.
	 * @see McpMM.ServiceMCP#getAgente()
	 * @see #getServiceMCP()
	 * @generated
	 */
	EReference getServiceMCP_Agente();

	/**
	 * Returns the meta object for the containment reference list '{@link McpMM.ServiceMCP#getWorkflow <em>Workflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Workflow</em>'.
	 * @see McpMM.ServiceMCP#getWorkflow()
	 * @see #getServiceMCP()
	 * @generated
	 */
	EReference getServiceMCP_Workflow();

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
	 * Returns the meta object for the containment reference list '{@link McpMM.ServerMCP#getOperacionmcp <em>Operacionmcp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operacionmcp</em>'.
	 * @see McpMM.ServerMCP#getOperacionmcp()
	 * @see #getServerMCP()
	 * @generated
	 */
	EReference getServerMCP_Operacionmcp();

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
	 * Returns the meta object for the attribute '{@link McpMM.Agente#getNombreAgente <em>Nombre Agente</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre Agente</em>'.
	 * @see McpMM.Agente#getNombreAgente()
	 * @see #getAgente()
	 * @generated
	 */
	EAttribute getAgente_NombreAgente();

	/**
	 * Returns the meta object for the attribute '{@link McpMM.Agente#getNumTareas <em>Num Tareas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Tareas</em>'.
	 * @see McpMM.Agente#getNumTareas()
	 * @see #getAgente()
	 * @generated
	 */
	EAttribute getAgente_NumTareas();

	/**
	 * Returns the meta object for the reference list '{@link McpMM.Agente#getRealiza <em>Realiza</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Realiza</em>'.
	 * @see McpMM.Agente#getRealiza()
	 * @see #getAgente()
	 * @generated
	 */
	EReference getAgente_Realiza();

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
	 * Returns the meta object for the containment reference list '{@link McpMM.Workflow#getContexto <em>Contexto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contexto</em>'.
	 * @see McpMM.Workflow#getContexto()
	 * @see #getWorkflow()
	 * @generated
	 */
	EReference getWorkflow_Contexto();

	/**
	 * Returns the meta object for the containment reference list '{@link McpMM.Workflow#getTarea <em>Tarea</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tarea</em>'.
	 * @see McpMM.Workflow#getTarea()
	 * @see #getWorkflow()
	 * @generated
	 */
	EReference getWorkflow_Tarea();

	/**
	 * Returns the meta object for the reference '{@link McpMM.Workflow#getEmpiezaCon <em>Empieza Con</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Empieza Con</em>'.
	 * @see McpMM.Workflow#getEmpiezaCon()
	 * @see #getWorkflow()
	 * @generated
	 */
	EReference getWorkflow_EmpiezaCon();

	/**
	 * Returns the meta object for the reference list '{@link McpMM.Workflow#getFinalizaCon <em>Finaliza Con</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Finaliza Con</em>'.
	 * @see McpMM.Workflow#getFinalizaCon()
	 * @see #getWorkflow()
	 * @generated
	 */
	EReference getWorkflow_FinalizaCon();

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
	 * Returns the meta object for the containment reference list '{@link McpMM.Contexto#getPropiedad <em>Propiedad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Propiedad</em>'.
	 * @see McpMM.Contexto#getPropiedad()
	 * @see #getContexto()
	 * @generated
	 */
	EReference getContexto_Propiedad();

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
	 * Returns the meta object for the reference '{@link McpMM.Tarea#getAgenteAsignado <em>Agente Asignado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Agente Asignado</em>'.
	 * @see McpMM.Tarea#getAgenteAsignado()
	 * @see #getTarea()
	 * @generated
	 */
	EReference getTarea_AgenteAsignado();

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
	 * Returns the meta object for the attribute '{@link McpMM.TareaEjecutable#getIdTarea <em>Id Tarea</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Tarea</em>'.
	 * @see McpMM.TareaEjecutable#getIdTarea()
	 * @see #getTareaEjecutable()
	 * @generated
	 */
	EAttribute getTareaEjecutable_IdTarea();

	/**
	 * Returns the meta object for the attribute '{@link McpMM.TareaEjecutable#getDescTarea <em>Desc Tarea</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Desc Tarea</em>'.
	 * @see McpMM.TareaEjecutable#getDescTarea()
	 * @see #getTareaEjecutable()
	 * @generated
	 */
	EAttribute getTareaEjecutable_DescTarea();

	/**
	 * Returns the meta object for class '{@link McpMM.TareaFinal <em>Tarea Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tarea Final</em>'.
	 * @see McpMM.TareaFinal
	 * @generated
	 */
	EClass getTareaFinal();

	/**
	 * Returns the meta object for the reference '{@link McpMM.TareaFinal#getFinaliza <em>Finaliza</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Finaliza</em>'.
	 * @see McpMM.TareaFinal#getFinaliza()
	 * @see #getTareaFinal()
	 * @generated
	 */
	EReference getTareaFinal_Finaliza();

	/**
	 * Returns the meta object for class '{@link McpMM.TareaInicial <em>Tarea Inicial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tarea Inicial</em>'.
	 * @see McpMM.TareaInicial
	 * @generated
	 */
	EClass getTareaInicial();

	/**
	 * Returns the meta object for the reference '{@link McpMM.TareaInicial#getEmpieza <em>Empieza</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Empieza</em>'.
	 * @see McpMM.TareaInicial#getEmpieza()
	 * @see #getTareaInicial()
	 * @generated
	 */
	EReference getTareaInicial_Empieza();

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
		 * The meta object literal for the '<em><b>Servermcp</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_MCP__SERVERMCP = eINSTANCE.getServiceMCP_Servermcp();

		/**
		 * The meta object literal for the '<em><b>Agente</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_MCP__AGENTE = eINSTANCE.getServiceMCP_Agente();

		/**
		 * The meta object literal for the '<em><b>Workflow</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_MCP__WORKFLOW = eINSTANCE.getServiceMCP_Workflow();

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
		 * The meta object literal for the '<em><b>Operacionmcp</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVER_MCP__OPERACIONMCP = eINSTANCE.getServerMCP_Operacionmcp();

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
		 * The meta object literal for the '<em><b>Nombre Agente</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENTE__NOMBRE_AGENTE = eINSTANCE.getAgente_NombreAgente();

		/**
		 * The meta object literal for the '<em><b>Num Tareas</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENTE__NUM_TAREAS = eINSTANCE.getAgente_NumTareas();

		/**
		 * The meta object literal for the '<em><b>Realiza</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENTE__REALIZA = eINSTANCE.getAgente_Realiza();

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
		 * The meta object literal for the '<em><b>Contexto</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW__CONTEXTO = eINSTANCE.getWorkflow_Contexto();

		/**
		 * The meta object literal for the '<em><b>Tarea</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW__TAREA = eINSTANCE.getWorkflow_Tarea();

		/**
		 * The meta object literal for the '<em><b>Empieza Con</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW__EMPIEZA_CON = eINSTANCE.getWorkflow_EmpiezaCon();

		/**
		 * The meta object literal for the '<em><b>Finaliza Con</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW__FINALIZA_CON = eINSTANCE.getWorkflow_FinalizaCon();

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
		 * The meta object literal for the '<em><b>Propiedad</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXTO__PROPIEDAD = eINSTANCE.getContexto_Propiedad();

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
		 * The meta object literal for the '<em><b>Es Usada</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPIEDAD__ES_USADA = eINSTANCE.getPropiedad_EsUsada();

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
		 * The meta object literal for the '<em><b>Agente Asignado</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAREA__AGENTE_ASIGNADO = eINSTANCE.getTarea_AgenteAsignado();

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
		 * The meta object literal for the '<em><b>Id Tarea</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAREA_EJECUTABLE__ID_TAREA = eINSTANCE.getTareaEjecutable_IdTarea();

		/**
		 * The meta object literal for the '<em><b>Desc Tarea</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAREA_EJECUTABLE__DESC_TAREA = eINSTANCE.getTareaEjecutable_DescTarea();

		/**
		 * The meta object literal for the '{@link McpMM.impl.TareaFinalImpl <em>Tarea Final</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see McpMM.impl.TareaFinalImpl
		 * @see McpMM.impl.McpMMPackageImpl#getTareaFinal()
		 * @generated
		 */
		EClass TAREA_FINAL = eINSTANCE.getTareaFinal();

		/**
		 * The meta object literal for the '<em><b>Finaliza</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAREA_FINAL__FINALIZA = eINSTANCE.getTareaFinal_Finaliza();

		/**
		 * The meta object literal for the '{@link McpMM.impl.TareaInicialImpl <em>Tarea Inicial</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see McpMM.impl.TareaInicialImpl
		 * @see McpMM.impl.McpMMPackageImpl#getTareaInicial()
		 * @generated
		 */
		EClass TAREA_INICIAL = eINSTANCE.getTareaInicial();

		/**
		 * The meta object literal for the '<em><b>Empieza</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAREA_INICIAL__EMPIEZA = eINSTANCE.getTareaInicial_Empieza();

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
