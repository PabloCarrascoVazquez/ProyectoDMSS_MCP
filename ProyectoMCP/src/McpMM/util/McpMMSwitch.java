/**
 */
package McpMM.util;

import McpMM.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see McpMM.McpMMPackage
 * @generated
 */
public class McpMMSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static McpMMPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public McpMMSwitch() {
		if (modelPackage == null) {
			modelPackage = McpMMPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case McpMMPackage.VERSION_CONTEXTO: {
				VersionContexto versionContexto = (VersionContexto)theEObject;
				T result = caseVersionContexto(versionContexto);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case McpMMPackage.SERVICE_MCP: {
				ServiceMCP serviceMCP = (ServiceMCP)theEObject;
				T result = caseServiceMCP(serviceMCP);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case McpMMPackage.SERVER_MCP: {
				ServerMCP serverMCP = (ServerMCP)theEObject;
				T result = caseServerMCP(serverMCP);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case McpMMPackage.AGENTE: {
				Agente agente = (Agente)theEObject;
				T result = caseAgente(agente);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case McpMMPackage.WORKFLOW: {
				Workflow workflow = (Workflow)theEObject;
				T result = caseWorkflow(workflow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case McpMMPackage.CONTEXTO: {
				Contexto contexto = (Contexto)theEObject;
				T result = caseContexto(contexto);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case McpMMPackage.PROPIEDAD: {
				Propiedad propiedad = (Propiedad)theEObject;
				T result = casePropiedad(propiedad);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case McpMMPackage.TAREA: {
				Tarea tarea = (Tarea)theEObject;
				T result = caseTarea(tarea);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case McpMMPackage.TAREA_EJECUTABLE: {
				TareaEjecutable tareaEjecutable = (TareaEjecutable)theEObject;
				T result = caseTareaEjecutable(tareaEjecutable);
				if (result == null) result = caseTarea(tareaEjecutable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case McpMMPackage.INICIO: {
				Inicio inicio = (Inicio)theEObject;
				T result = caseInicio(inicio);
				if (result == null) result = caseTarea(inicio);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case McpMMPackage.FINAL: {
				Final final_ = (Final)theEObject;
				T result = caseFinal(final_);
				if (result == null) result = caseTarea(final_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case McpMMPackage.ACCION: {
				Accion accion = (Accion)theEObject;
				T result = caseAccion(accion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case McpMMPackage.ESCRITURA: {
				Escritura escritura = (Escritura)theEObject;
				T result = caseEscritura(escritura);
				if (result == null) result = caseAccion(escritura);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case McpMMPackage.LECTURA: {
				Lectura lectura = (Lectura)theEObject;
				T result = caseLectura(lectura);
				if (result == null) result = caseAccion(lectura);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case McpMMPackage.OPERACION_MCP: {
				OperacionMCP operacionMCP = (OperacionMCP)theEObject;
				T result = caseOperacionMCP(operacionMCP);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case McpMMPackage.TAREA_TRANSFORMACION_DATOS: {
				TareaTransformacionDatos tareaTransformacionDatos = (TareaTransformacionDatos)theEObject;
				T result = caseTareaTransformacionDatos(tareaTransformacionDatos);
				if (result == null) result = caseTareaEjecutable(tareaTransformacionDatos);
				if (result == null) result = caseTarea(tareaTransformacionDatos);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case McpMMPackage.TAREA_LLM: {
				TareaLLM tareaLLM = (TareaLLM)theEObject;
				T result = caseTareaLLM(tareaLLM);
				if (result == null) result = caseTareaEjecutable(tareaLLM);
				if (result == null) result = caseTarea(tareaLLM);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case McpMMPackage.TAREA_USUARIO: {
				TareaUsuario tareaUsuario = (TareaUsuario)theEObject;
				T result = caseTareaUsuario(tareaUsuario);
				if (result == null) result = caseTareaEjecutable(tareaUsuario);
				if (result == null) result = caseTarea(tareaUsuario);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case McpMMPackage.TAREA_ANALISIS: {
				TareaAnalisis tareaAnalisis = (TareaAnalisis)theEObject;
				T result = caseTareaAnalisis(tareaAnalisis);
				if (result == null) result = caseTareaEjecutable(tareaAnalisis);
				if (result == null) result = caseTarea(tareaAnalisis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case McpMMPackage.TAREA_ENVIO_CONTEXTO: {
				TareaEnvioContexto tareaEnvioContexto = (TareaEnvioContexto)theEObject;
				T result = caseTareaEnvioContexto(tareaEnvioContexto);
				if (result == null) result = caseTareaEjecutable(tareaEnvioContexto);
				if (result == null) result = caseTarea(tareaEnvioContexto);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case McpMMPackage.TAREA_RECEPCION_CONTEXTO: {
				TareaRecepcionContexto tareaRecepcionContexto = (TareaRecepcionContexto)theEObject;
				T result = caseTareaRecepcionContexto(tareaRecepcionContexto);
				if (result == null) result = caseTareaEjecutable(tareaRecepcionContexto);
				if (result == null) result = caseTarea(tareaRecepcionContexto);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case McpMMPackage.TAREA_SERVER_MCP: {
				TareaServerMCP tareaServerMCP = (TareaServerMCP)theEObject;
				T result = caseTareaServerMCP(tareaServerMCP);
				if (result == null) result = caseTareaEjecutable(tareaServerMCP);
				if (result == null) result = caseTarea(tareaServerMCP);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Version Contexto</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Version Contexto</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVersionContexto(VersionContexto object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service MCP</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service MCP</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceMCP(ServiceMCP object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Server MCP</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Server MCP</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServerMCP(ServerMCP object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Agente</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Agente</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAgente(Agente object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Workflow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Workflow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkflow(Workflow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contexto</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contexto</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContexto(Contexto object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Propiedad</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Propiedad</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropiedad(Propiedad object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tarea</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tarea</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTarea(Tarea object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tarea Ejecutable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tarea Ejecutable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTareaEjecutable(TareaEjecutable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inicio</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inicio</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInicio(Inicio object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Final</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Final</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFinal(Final object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Accion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Accion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccion(Accion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Escritura</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Escritura</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEscritura(Escritura object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lectura</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lectura</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLectura(Lectura object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operacion MCP</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operacion MCP</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperacionMCP(OperacionMCP object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tarea Transformacion Datos</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tarea Transformacion Datos</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTareaTransformacionDatos(TareaTransformacionDatos object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tarea LLM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tarea LLM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTareaLLM(TareaLLM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tarea Usuario</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tarea Usuario</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTareaUsuario(TareaUsuario object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tarea Analisis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tarea Analisis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTareaAnalisis(TareaAnalisis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tarea Envio Contexto</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tarea Envio Contexto</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTareaEnvioContexto(TareaEnvioContexto object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tarea Recepcion Contexto</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tarea Recepcion Contexto</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTareaRecepcionContexto(TareaRecepcionContexto object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tarea Server MCP</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tarea Server MCP</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTareaServerMCP(TareaServerMCP object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //McpMMSwitch
