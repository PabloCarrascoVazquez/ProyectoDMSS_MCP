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
			case McpMMPackage.TAREA_FINAL:
				return validateTareaFinal((TareaFinal)value, diagnostics, context);
			case McpMMPackage.TAREA_INICIAL:
				return validateTareaInicial((TareaInicial)value, diagnostics, context);
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
		if (result || diagnostics != null) result &= validateAgente_R05_AlMenosUnaTarea(agente, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the R05_AlMenosUnaTarea constraint of '<em>Agente</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String AGENTE__R05_AL_MENOS_UNA_TAREA__EEXPRESSION = "not (self.realiza->select(t | not t.oclIsTypeOf(TareaInicial) and not t.oclIsTypeOf(TareaFinal))->isEmpty())";

	/**
	 * Validates the R05_AlMenosUnaTarea constraint of '<em>Agente</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAgente_R05_AlMenosUnaTarea(Agente agente, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(McpMMPackage.Literals.AGENTE,
				 agente,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "R05_AlMenosUnaTarea",
				 AGENTE__R05_AL_MENOS_UNA_TAREA__EEXPRESSION,
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
		if (result || diagnostics != null) result &= validateWorkflow_R02_AlMenosUnaTareaFin(workflow, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the R01_UnaTareaInicio constraint of '<em>Workflow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String WORKFLOW__R01_UNA_TAREA_INICIO__EEXPRESSION = "self.tarea->select(t | t.oclIsTypeOf(TareaInicial))->size() = 1";

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
	 * The cached validation expression for the R02_AlMenosUnaTareaFin constraint of '<em>Workflow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String WORKFLOW__R02_AL_MENOS_UNA_TAREA_FIN__EEXPRESSION = "self.tarea->select(t | t.oclIsTypeOf(TareaFinal))->size() >= 1";

	/**
	 * Validates the R02_AlMenosUnaTareaFin constraint of '<em>Workflow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWorkflow_R02_AlMenosUnaTareaFin(Workflow workflow, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(McpMMPackage.Literals.WORKFLOW,
				 workflow,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "R02_AlMenosUnaTareaFin",
				 WORKFLOW__R02_AL_MENOS_UNA_TAREA_FIN__EEXPRESSION,
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
		if (result || diagnostics != null) result &= validateTarea_R06_NoBuclePropio(tarea, diagnostics, context);
		if (result || diagnostics != null) result &= validateTarea_R08_ConexionesAgentes(tarea, diagnostics, context);
		if (result || diagnostics != null) result &= validateTarea_R09_EntradaYSalida(tarea, diagnostics, context);
		if (result || diagnostics != null) result &= validateTarea_R10_NoCiclos(tarea, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the R06_NoBuclePropio constraint of '<em>Tarea</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TAREA__R06_NO_BUCLE_PROPIO__EEXPRESSION = "not (self.sigue = self) and (if self.oclIsTypeOf(TareaAnalisis) then not (self.oclAsType(TareaAnalisis).sigueElse = self) else true endif)";

	/**
	 * Validates the R06_NoBuclePropio constraint of '<em>Tarea</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTarea_R06_NoBuclePropio(Tarea tarea, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(McpMMPackage.Literals.TAREA,
				 tarea,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "R06_NoBuclePropio",
				 TAREA__R06_NO_BUCLE_PROPIO__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the R08_ConexionesAgentes constraint of '<em>Tarea</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TAREA__R08_CONEXIONES_AGENTES__EEXPRESSION = "if not self.sigue.oclIsUndefined() then if self.oclIsTypeOf(TareaEnvioContexto) and self.sigue.oclIsTypeOf(TareaRecepcionContexto) then not (self.agenteAsignado = self.sigue.agenteAsignado) else self.agenteAsignado = self.sigue.agenteAsignado endif else true endif";

	/**
	 * Validates the R08_ConexionesAgentes constraint of '<em>Tarea</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTarea_R08_ConexionesAgentes(Tarea tarea, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(McpMMPackage.Literals.TAREA,
				 tarea,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "R08_ConexionesAgentes",
				 TAREA__R08_CONEXIONES_AGENTES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the R09_EntradaYSalida constraint of '<em>Tarea</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TAREA__R09_ENTRADA_YSALIDA__EEXPRESSION = "(if self.oclIsTypeOf(TareaInicial) then true else (not self.precede.oclIsUndefined() or not self.precedeElse.oclIsUndefined()) endif) and (if self.oclIsTypeOf(TareaFinal) then true else not self.sigue.oclIsUndefined() endif)";

	/**
	 * Validates the R09_EntradaYSalida constraint of '<em>Tarea</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTarea_R09_EntradaYSalida(Tarea tarea, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(McpMMPackage.Literals.TAREA,
				 tarea,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "R09_EntradaYSalida",
				 TAREA__R09_ENTRADA_YSALIDA__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the R10_NoCiclos constraint of '<em>Tarea</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TAREA__R10_NO_CICLOS__EEXPRESSION = "let siguientes : Set(Tarea) = Set{self.sigue}->union(if self.oclIsTypeOf(TareaAnalisis) then Set{self.oclAsType(TareaAnalisis).sigueElse} else Set{} endif)->select(x | not x.oclIsUndefined()) in siguientes->forAll(s | not s->closure(t : Tarea | Set{t.sigue}->union(if t.oclIsTypeOf(TareaAnalisis) then Set{t.oclAsType(TareaAnalisis).sigueElse} else Set{} endif)->select(x | not x.oclIsUndefined()))->includes(self))";

	/**
	 * Validates the R10_NoCiclos constraint of '<em>Tarea</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTarea_R10_NoCiclos(Tarea tarea, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(McpMMPackage.Literals.TAREA,
				 tarea,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "R10_NoCiclos",
				 TAREA__R10_NO_CICLOS__EEXPRESSION,
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
		if (result || diagnostics != null) result &= validateTarea_R06_NoBuclePropio(tareaEjecutable, diagnostics, context);
		if (result || diagnostics != null) result &= validateTarea_R08_ConexionesAgentes(tareaEjecutable, diagnostics, context);
		if (result || diagnostics != null) result &= validateTarea_R09_EntradaYSalida(tareaEjecutable, diagnostics, context);
		if (result || diagnostics != null) result &= validateTarea_R10_NoCiclos(tareaEjecutable, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTareaFinal(TareaFinal tareaFinal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tareaFinal, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tareaFinal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tareaFinal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tareaFinal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(tareaFinal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tareaFinal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tareaFinal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tareaFinal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tareaFinal, diagnostics, context);
		if (result || diagnostics != null) result &= validateTarea_R06_NoBuclePropio(tareaFinal, diagnostics, context);
		if (result || diagnostics != null) result &= validateTarea_R08_ConexionesAgentes(tareaFinal, diagnostics, context);
		if (result || diagnostics != null) result &= validateTarea_R09_EntradaYSalida(tareaFinal, diagnostics, context);
		if (result || diagnostics != null) result &= validateTarea_R10_NoCiclos(tareaFinal, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTareaInicial(TareaInicial tareaInicial, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tareaInicial, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tareaInicial, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tareaInicial, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tareaInicial, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(tareaInicial, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tareaInicial, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tareaInicial, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tareaInicial, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tareaInicial, diagnostics, context);
		if (result || diagnostics != null) result &= validateTarea_R06_NoBuclePropio(tareaInicial, diagnostics, context);
		if (result || diagnostics != null) result &= validateTarea_R08_ConexionesAgentes(tareaInicial, diagnostics, context);
		if (result || diagnostics != null) result &= validateTarea_R09_EntradaYSalida(tareaInicial, diagnostics, context);
		if (result || diagnostics != null) result &= validateTarea_R10_NoCiclos(tareaInicial, diagnostics, context);
		return result;
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
	protected static final String ACCION__R12_COHERENCIA_CONTEXTO__EEXPRESSION = "self.usa.oclIsUndefined() or self.apunta.propiedad->includes(self.usa)";

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
		if (result || diagnostics != null) result &= validateTarea_R06_NoBuclePropio(tareaTransformacionDatos, diagnostics, context);
		if (result || diagnostics != null) result &= validateTarea_R08_ConexionesAgentes(tareaTransformacionDatos, diagnostics, context);
		if (result || diagnostics != null) result &= validateTarea_R09_EntradaYSalida(tareaTransformacionDatos, diagnostics, context);
		if (result || diagnostics != null) result &= validateTarea_R10_NoCiclos(tareaTransformacionDatos, diagnostics, context);
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
		if (result || diagnostics != null) result &= validateTarea_R06_NoBuclePropio(tareaLLM, diagnostics, context);
		if (result || diagnostics != null) result &= validateTarea_R08_ConexionesAgentes(tareaLLM, diagnostics, context);
		if (result || diagnostics != null) result &= validateTarea_R09_EntradaYSalida(tareaLLM, diagnostics, context);
		if (result || diagnostics != null) result &= validateTarea_R10_NoCiclos(tareaLLM, diagnostics, context);
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
		if (result || diagnostics != null) result &= validateTarea_R06_NoBuclePropio(tareaUsuario, diagnostics, context);
		if (result || diagnostics != null) result &= validateTarea_R08_ConexionesAgentes(tareaUsuario, diagnostics, context);
		if (result || diagnostics != null) result &= validateTarea_R09_EntradaYSalida(tareaUsuario, diagnostics, context);
		if (result || diagnostics != null) result &= validateTarea_R10_NoCiclos(tareaUsuario, diagnostics, context);
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
		if (result || diagnostics != null) result &= validateTarea_R06_NoBuclePropio(tareaAnalisis, diagnostics, context);
		if (result || diagnostics != null) result &= validateTarea_R08_ConexionesAgentes(tareaAnalisis, diagnostics, context);
		if (result || diagnostics != null) result &= validateTarea_R09_EntradaYSalida(tareaAnalisis, diagnostics, context);
		if (result || diagnostics != null) result &= validateTarea_R10_NoCiclos(tareaAnalisis, diagnostics, context);
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
		if (result || diagnostics != null) result &= validateTarea_R06_NoBuclePropio(tareaEnvioContexto, diagnostics, context);
		if (result || diagnostics != null) result &= validateTarea_R08_ConexionesAgentes(tareaEnvioContexto, diagnostics, context);
		if (result || diagnostics != null) result &= validateTarea_R09_EntradaYSalida(tareaEnvioContexto, diagnostics, context);
		if (result || diagnostics != null) result &= validateTarea_R10_NoCiclos(tareaEnvioContexto, diagnostics, context);
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
		if (result || diagnostics != null) result &= validateTarea_R06_NoBuclePropio(tareaRecepcionContexto, diagnostics, context);
		if (result || diagnostics != null) result &= validateTarea_R08_ConexionesAgentes(tareaRecepcionContexto, diagnostics, context);
		if (result || diagnostics != null) result &= validateTarea_R09_EntradaYSalida(tareaRecepcionContexto, diagnostics, context);
		if (result || diagnostics != null) result &= validateTarea_R10_NoCiclos(tareaRecepcionContexto, diagnostics, context);
		if (result || diagnostics != null) result &= validateTareaRecepcionContexto_R07_RecepcionPrecedidaEnvio(tareaRecepcionContexto, diagnostics, context);
		if (result || diagnostics != null) result &= validateTareaRecepcionContexto_R11_MismasPropiedadesEnvioRecepcion(tareaRecepcionContexto, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the R07_RecepcionPrecedidaEnvio constraint of '<em>Tarea Recepcion Contexto</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TAREA_RECEPCION_CONTEXTO__R07_RECEPCION_PRECEDIDA_ENVIO__EEXPRESSION = "not self.precede.oclIsUndefined() and self.precede.oclIsTypeOf(TareaEnvioContexto)";

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
	protected static final String TAREA_RECEPCION_CONTEXTO__R11_MISMAS_PROPIEDADES_ENVIO_RECEPCION__EEXPRESSION = "if not self.precede.oclIsUndefined() and self.precede.oclIsTypeOf(TareaEnvioContexto) then self.accion->collect(usa)->asSet() = self.precede.accion->collect(usa)->asSet() else true endif";

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
		if (result || diagnostics != null) result &= validateTarea_R06_NoBuclePropio(tareaServerMCP, diagnostics, context);
		if (result || diagnostics != null) result &= validateTarea_R08_ConexionesAgentes(tareaServerMCP, diagnostics, context);
		if (result || diagnostics != null) result &= validateTarea_R09_EntradaYSalida(tareaServerMCP, diagnostics, context);
		if (result || diagnostics != null) result &= validateTarea_R10_NoCiclos(tareaServerMCP, diagnostics, context);
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
