/**
 */
package McpMM.util;

import McpMM.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see McpMM.McpMMPackage
 * @generated
 */
public class McpMMValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final McpMMValidator INSTANCE = new McpMMValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "McpMM";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public McpMMValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return McpMMPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case McpMMPackage.VERSION_CONTEXTO:
				return validateVersionContexto((VersionContexto)value, diagnostics, context);
			case McpMMPackage.SERVICE_MCP:
				return validateServiceMCP((ServiceMCP)value, diagnostics, context);
			case McpMMPackage.SERVER_MCP:
				return validateServerMCP((ServerMCP)value, diagnostics, context);
			case McpMMPackage.AGENTE:
				return validateAgente((Agente)value, diagnostics, context);
			case McpMMPackage.WORKFLOW:
				return validateWorkflow((Workflow)value, diagnostics, context);
			case McpMMPackage.CONTEXTO:
				return validateContexto((Contexto)value, diagnostics, context);
			case McpMMPackage.PROPIEDAD:
				return validatePropiedad((Propiedad)value, diagnostics, context);
			case McpMMPackage.TAREA:
				return validateTarea((Tarea)value, diagnostics, context);
			case McpMMPackage.TAREA_EJECUTABLE:
				return validateTareaEjecutable((TareaEjecutable)value, diagnostics, context);
			case McpMMPackage.INICIO:
				return validateInicio((Inicio)value, diagnostics, context);
			case McpMMPackage.FINAL:
				return validateFinal((Final)value, diagnostics, context);
			case McpMMPackage.ACCION:
				return validateAccion((Accion)value, diagnostics, context);
			case McpMMPackage.ESCRITURA:
				return validateEscritura((Escritura)value, diagnostics, context);
			case McpMMPackage.LECTURA:
				return validateLectura((Lectura)value, diagnostics, context);
			case McpMMPackage.OPERACION_MCP:
				return validateOperacionMCP((OperacionMCP)value, diagnostics, context);
			case McpMMPackage.TAREA_TRANSFORMACION_DATOS:
				return validateTareaTransformacionDatos((TareaTransformacionDatos)value, diagnostics, context);
			case McpMMPackage.TAREA_LLM:
				return validateTareaLLM((TareaLLM)value, diagnostics, context);
			case McpMMPackage.TAREA_USUARIO:
				return validateTareaUsuario((TareaUsuario)value, diagnostics, context);
			case McpMMPackage.TAREA_ANALISIS:
				return validateTareaAnalisis((TareaAnalisis)value, diagnostics, context);
			case McpMMPackage.TAREA_ENVIO_CONTEXTO:
				return validateTareaEnvioContexto((TareaEnvioContexto)value, diagnostics, context);
			case McpMMPackage.TAREA_RECEPCION_CONTEXTO:
				return validateTareaRecepcionContexto((TareaRecepcionContexto)value, diagnostics, context);
			case McpMMPackage.TAREA_SERVER_MCP:
				return validateTareaServerMCP((TareaServerMCP)value, diagnostics, context);
			case McpMMPackage.TIPO_CONTEXTO:
				return validateTipoContexto((TipoContexto)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVersionContexto(VersionContexto versionContexto, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(versionContexto, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceMCP(ServiceMCP serviceMCP, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(serviceMCP, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServerMCP(ServerMCP serverMCP, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(serverMCP, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAgente(Agente agente, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(agente, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(agente, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(agente, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(agente, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(agente, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(agente, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(agente, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(agente, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(agente, diagnostics, context);
		if (result || diagnostics != null) result &= validateAgente_R05_LimiteCargaTrabajo(agente, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the R05_LimiteCargaTrabajo constraint of '<em>Agente</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String AGENTE__R05_LIMITE_CARGA_TRABAJO__EEXPRESSION = "self.tareas->size() <= 10";

	/**
	 * Validates the R05_LimiteCargaTrabajo constraint of '<em>Agente</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAgente_R05_LimiteCargaTrabajo(Agente agente, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(McpMMPackage.Literals.AGENTE,
				 agente,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "R05_LimiteCargaTrabajo",
				 AGENTE__R05_LIMITE_CARGA_TRABAJO__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWorkflow(Workflow workflow, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(workflow, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(workflow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(workflow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(workflow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(workflow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(workflow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(workflow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(workflow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(workflow, diagnostics, context);
		if (result || diagnostics != null) result &= validateWorkflow_R01_UnaTareaInicio(workflow, diagnostics, context);
		if (result || diagnostics != null) result &= validateWorkflow_R02_UnaTareaFin(workflow, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the R01_UnaTareaInicio constraint of '<em>Workflow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String WORKFLOW__R01_UNA_TAREA_INICIO__EEXPRESSION = "self.tareas->select(t | t.oclIsTypeOf(Inicio))->size() = 1";

	/**
	 * Validates the R01_UnaTareaInicio constraint of '<em>Workflow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWorkflow_R01_UnaTareaInicio(Workflow workflow, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(McpMMPackage.Literals.WORKFLOW,
				 workflow,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "R01_UnaTareaInicio",
				 WORKFLOW__R01_UNA_TAREA_INICIO__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the R02_UnaTareaFin constraint of '<em>Workflow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String WORKFLOW__R02_UNA_TAREA_FIN__EEXPRESSION = "self.tareas->select(t | t.oclIsTypeOf(Final))->size() = 1";

	/**
	 * Validates the R02_UnaTareaFin constraint of '<em>Workflow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWorkflow_R02_UnaTareaFin(Workflow workflow, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(McpMMPackage.Literals.WORKFLOW,
				 workflow,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "R02_UnaTareaFin",
				 WORKFLOW__R02_UNA_TAREA_FIN__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContexto(Contexto contexto, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contexto, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropiedad(Propiedad propiedad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(propiedad, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTarea(Tarea tarea, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tarea, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tarea, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tarea, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tarea, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(tarea, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tarea, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tarea, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tarea, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tarea, diagnostics, context);
		if (result || diagnostics != null) result &= validateTarea_R10_NoBuclePropio(tarea, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the R10_NoBuclePropio constraint of '<em>Tarea</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TAREA__R10_NO_BUCLE_PROPIO__EEXPRESSION = "self.sigue <> self";

	/**
	 * Validates the R10_NoBuclePropio constraint of '<em>Tarea</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTarea_R10_NoBuclePropio(Tarea tarea, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(McpMMPackage.Literals.TAREA,
				 tarea,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "R10_NoBuclePropio",
				 TAREA__R10_NO_BUCLE_PROPIO__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTareaEjecutable(TareaEjecutable tareaEjecutable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tareaEjecutable, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tareaEjecutable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tareaEjecutable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tareaEjecutable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(tareaEjecutable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tareaEjecutable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tareaEjecutable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tareaEjecutable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tareaEjecutable, diagnostics, context);
		if (result || diagnostics != null) result &= validateTarea_R10_NoBuclePropio(tareaEjecutable, diagnostics, context);
		if (result || diagnostics != null) result &= validateTareaEjecutable_R09_EntradaYSalida(tareaEjecutable, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the R09_EntradaYSalida constraint of '<em>Tarea Ejecutable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TAREA_EJECUTABLE__R09_ENTRADA_YSALIDA__EEXPRESSION = "(self.precede->notEmpty() or self.precedeElse->notEmpty()) and not self.sigue.oclIsUndefined()";

	/**
	 * Validates the R09_EntradaYSalida constraint of '<em>Tarea Ejecutable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTareaEjecutable_R09_EntradaYSalida(TareaEjecutable tareaEjecutable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(McpMMPackage.Literals.TAREA_EJECUTABLE,
				 tareaEjecutable,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "R09_EntradaYSalida",
				 TAREA_EJECUTABLE__R09_ENTRADA_YSALIDA__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInicio(Inicio inicio, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(inicio, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(inicio, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(inicio, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(inicio, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(inicio, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(inicio, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(inicio, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(inicio, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(inicio, diagnostics, context);
		if (result || diagnostics != null) result &= validateTarea_R10_NoBuclePropio(inicio, diagnostics, context);
		if (result || diagnostics != null) result &= validateInicio_R03_InicioSinEntradas(inicio, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the R03_InicioSinEntradas constraint of '<em>Inicio</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String INICIO__R03_INICIO_SIN_ENTRADAS__EEXPRESSION = "self.precede->isEmpty() and self.precedeElse->isEmpty()";

	/**
	 * Validates the R03_InicioSinEntradas constraint of '<em>Inicio</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInicio_R03_InicioSinEntradas(Inicio inicio, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(McpMMPackage.Literals.INICIO,
				 inicio,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "R03_InicioSinEntradas",
				 INICIO__R03_INICIO_SIN_ENTRADAS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFinal(Final final_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(final_, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(final_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(final_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(final_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(final_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(final_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(final_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(final_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(final_, diagnostics, context);
		if (result || diagnostics != null) result &= validateTarea_R10_NoBuclePropio(final_, diagnostics, context);
		if (result || diagnostics != null) result &= validateFinal_R04_FinSinSalidas(final_, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the R04_FinSinSalidas constraint of '<em>Final</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String FINAL__R04_FIN_SIN_SALIDAS__EEXPRESSION = "self.sigue.oclIsUndefined()";

	/**
	 * Validates the R04_FinSinSalidas constraint of '<em>Final</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFinal_R04_FinSinSalidas(Final final_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(McpMMPackage.Literals.FINAL,
				 final_,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "R04_FinSinSalidas",
				 FINAL__R04_FIN_SIN_SALIDAS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccion(Accion accion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(accion, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(accion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(accion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(accion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(accion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(accion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(accion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(accion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(accion, diagnostics, context);
		if (result || diagnostics != null) result &= validateAccion_R12_CoherenciaContexto(accion, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the R12_CoherenciaContexto constraint of '<em>Accion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ACCION__R12_COHERENCIA_CONTEXTO__EEXPRESSION = "self.usa->forAll(p | self.apunta.propiedades->includes(p))";

	/**
	 * Validates the R12_CoherenciaContexto constraint of '<em>Accion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccion_R12_CoherenciaContexto(Accion accion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(McpMMPackage.Literals.ACCION,
				 accion,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "R12_CoherenciaContexto",
				 ACCION__R12_COHERENCIA_CONTEXTO__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEscritura(Escritura escritura, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(escritura, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(escritura, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(escritura, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(escritura, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(escritura, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(escritura, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(escritura, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(escritura, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(escritura, diagnostics, context);
		if (result || diagnostics != null) result &= validateAccion_R12_CoherenciaContexto(escritura, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLectura(Lectura lectura, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(lectura, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(lectura, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(lectura, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(lectura, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(lectura, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(lectura, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(lectura, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(lectura, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(lectura, diagnostics, context);
		if (result || diagnostics != null) result &= validateAccion_R12_CoherenciaContexto(lectura, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperacionMCP(OperacionMCP operacionMCP, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(operacionMCP, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTareaTransformacionDatos(TareaTransformacionDatos tareaTransformacionDatos, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tareaTransformacionDatos, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tareaTransformacionDatos, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tareaTransformacionDatos, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tareaTransformacionDatos, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(tareaTransformacionDatos, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tareaTransformacionDatos, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tareaTransformacionDatos, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tareaTransformacionDatos, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tareaTransformacionDatos, diagnostics, context);
		if (result || diagnostics != null) result &= validateTarea_R10_NoBuclePropio(tareaTransformacionDatos, diagnostics, context);
		if (result || diagnostics != null) result &= validateTareaEjecutable_R09_EntradaYSalida(tareaTransformacionDatos, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTareaLLM(TareaLLM tareaLLM, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tareaLLM, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tareaLLM, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tareaLLM, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tareaLLM, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(tareaLLM, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tareaLLM, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tareaLLM, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tareaLLM, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tareaLLM, diagnostics, context);
		if (result || diagnostics != null) result &= validateTarea_R10_NoBuclePropio(tareaLLM, diagnostics, context);
		if (result || diagnostics != null) result &= validateTareaEjecutable_R09_EntradaYSalida(tareaLLM, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTareaUsuario(TareaUsuario tareaUsuario, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tareaUsuario, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tareaUsuario, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tareaUsuario, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tareaUsuario, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(tareaUsuario, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tareaUsuario, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tareaUsuario, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tareaUsuario, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tareaUsuario, diagnostics, context);
		if (result || diagnostics != null) result &= validateTarea_R10_NoBuclePropio(tareaUsuario, diagnostics, context);
		if (result || diagnostics != null) result &= validateTareaEjecutable_R09_EntradaYSalida(tareaUsuario, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTareaAnalisis(TareaAnalisis tareaAnalisis, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tareaAnalisis, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tareaAnalisis, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tareaAnalisis, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tareaAnalisis, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(tareaAnalisis, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tareaAnalisis, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tareaAnalisis, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tareaAnalisis, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tareaAnalisis, diagnostics, context);
		if (result || diagnostics != null) result &= validateTarea_R10_NoBuclePropio(tareaAnalisis, diagnostics, context);
		if (result || diagnostics != null) result &= validateTareaEjecutable_R09_EntradaYSalida(tareaAnalisis, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTareaEnvioContexto(TareaEnvioContexto tareaEnvioContexto, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tareaEnvioContexto, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tareaEnvioContexto, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tareaEnvioContexto, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tareaEnvioContexto, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(tareaEnvioContexto, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tareaEnvioContexto, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tareaEnvioContexto, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tareaEnvioContexto, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tareaEnvioContexto, diagnostics, context);
		if (result || diagnostics != null) result &= validateTarea_R10_NoBuclePropio(tareaEnvioContexto, diagnostics, context);
		if (result || diagnostics != null) result &= validateTareaEjecutable_R09_EntradaYSalida(tareaEnvioContexto, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTareaRecepcionContexto(TareaRecepcionContexto tareaRecepcionContexto, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tareaRecepcionContexto, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tareaRecepcionContexto, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tareaRecepcionContexto, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tareaRecepcionContexto, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(tareaRecepcionContexto, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tareaRecepcionContexto, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tareaRecepcionContexto, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tareaRecepcionContexto, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tareaRecepcionContexto, diagnostics, context);
		if (result || diagnostics != null) result &= validateTarea_R10_NoBuclePropio(tareaRecepcionContexto, diagnostics, context);
		if (result || diagnostics != null) result &= validateTareaEjecutable_R09_EntradaYSalida(tareaRecepcionContexto, diagnostics, context);
		if (result || diagnostics != null) result &= validateTareaRecepcionContexto_R07_RecepcionPrecedidaEnvio(tareaRecepcionContexto, diagnostics, context);
		if (result || diagnostics != null) result &= validateTareaRecepcionContexto_R11_MismasPropiedadesEnvioRecepcion(tareaRecepcionContexto, diagnostics, context);
		if (result || diagnostics != null) result &= validateTareaRecepcionContexto_R08_DistintosAgentes(tareaRecepcionContexto, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the R07_RecepcionPrecedidaEnvio constraint of '<em>Tarea Recepcion Contexto</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TAREA_RECEPCION_CONTEXTO__R07_RECEPCION_PRECEDIDA_ENVIO__EEXPRESSION = "self.precede->exists(t | t.oclIsTypeOf(TareaEnvioContexto))";

	/**
	 * Validates the R07_RecepcionPrecedidaEnvio constraint of '<em>Tarea Recepcion Contexto</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTareaRecepcionContexto_R07_RecepcionPrecedidaEnvio(TareaRecepcionContexto tareaRecepcionContexto, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(McpMMPackage.Literals.TAREA_RECEPCION_CONTEXTO,
				 tareaRecepcionContexto,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "R07_RecepcionPrecedidaEnvio",
				 TAREA_RECEPCION_CONTEXTO__R07_RECEPCION_PRECEDIDA_ENVIO__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the R11_MismasPropiedadesEnvioRecepcion constraint of '<em>Tarea Recepcion Contexto</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TAREA_RECEPCION_CONTEXTO__R11_MISMAS_PROPIEDADES_ENVIO_RECEPCION__EEXPRESSION = "self.precede->select(t | t.oclIsTypeOf(TareaEnvioContexto))->forAll(e | self.accion->collect(usa)->asSet() = e.accion->collect(usa)->asSet())";

	/**
	 * Validates the R11_MismasPropiedadesEnvioRecepcion constraint of '<em>Tarea Recepcion Contexto</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTareaRecepcionContexto_R11_MismasPropiedadesEnvioRecepcion(TareaRecepcionContexto tareaRecepcionContexto, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(McpMMPackage.Literals.TAREA_RECEPCION_CONTEXTO,
				 tareaRecepcionContexto,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "R11_MismasPropiedadesEnvioRecepcion",
				 TAREA_RECEPCION_CONTEXTO__R11_MISMAS_PROPIEDADES_ENVIO_RECEPCION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the R08_DistintosAgentes constraint of '<em>Tarea Recepcion Contexto</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TAREA_RECEPCION_CONTEXTO__R08_DISTINTOS_AGENTES__EEXPRESSION = "self.precede->select(t | t.oclIsTypeOf(TareaEnvioContexto))->forAll(e | self.ejecutadaPor <> e.oclAsType(TareaEjecutable).ejecutadaPor)";

	/**
	 * Validates the R08_DistintosAgentes constraint of '<em>Tarea Recepcion Contexto</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTareaRecepcionContexto_R08_DistintosAgentes(TareaRecepcionContexto tareaRecepcionContexto, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(McpMMPackage.Literals.TAREA_RECEPCION_CONTEXTO,
				 tareaRecepcionContexto,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "R08_DistintosAgentes",
				 TAREA_RECEPCION_CONTEXTO__R08_DISTINTOS_AGENTES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTareaServerMCP(TareaServerMCP tareaServerMCP, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tareaServerMCP, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tareaServerMCP, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tareaServerMCP, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tareaServerMCP, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(tareaServerMCP, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tareaServerMCP, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tareaServerMCP, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tareaServerMCP, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tareaServerMCP, diagnostics, context);
		if (result || diagnostics != null) result &= validateTarea_R10_NoBuclePropio(tareaServerMCP, diagnostics, context);
		if (result || diagnostics != null) result &= validateTareaEjecutable_R09_EntradaYSalida(tareaServerMCP, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTipoContexto(TipoContexto tipoContexto, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //McpMMValidator
