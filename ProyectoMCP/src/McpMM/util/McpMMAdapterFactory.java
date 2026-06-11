/**
 */
package McpMM.util;

import McpMM.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see McpMM.McpMMPackage
 * @generated
 */
public class McpMMAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static McpMMPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public McpMMAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = McpMMPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected McpMMSwitch<Adapter> modelSwitch =
		new McpMMSwitch<Adapter>() {
			@Override
			public Adapter caseVersionContexto(VersionContexto object) {
				return createVersionContextoAdapter();
			}
			@Override
			public Adapter caseServiceMCP(ServiceMCP object) {
				return createServiceMCPAdapter();
			}
			@Override
			public Adapter caseServerMCP(ServerMCP object) {
				return createServerMCPAdapter();
			}
			@Override
			public Adapter caseAgente(Agente object) {
				return createAgenteAdapter();
			}
			@Override
			public Adapter caseWorkflow(Workflow object) {
				return createWorkflowAdapter();
			}
			@Override
			public Adapter caseContexto(Contexto object) {
				return createContextoAdapter();
			}
			@Override
			public Adapter casePropiedad(Propiedad object) {
				return createPropiedadAdapter();
			}
			@Override
			public Adapter caseTarea(Tarea object) {
				return createTareaAdapter();
			}
			@Override
			public Adapter caseTareaEjecutable(TareaEjecutable object) {
				return createTareaEjecutableAdapter();
			}
			@Override
			public Adapter caseInicio(Inicio object) {
				return createInicioAdapter();
			}
			@Override
			public Adapter caseFinal(Final object) {
				return createFinalAdapter();
			}
			@Override
			public Adapter caseAccion(Accion object) {
				return createAccionAdapter();
			}
			@Override
			public Adapter caseEscritura(Escritura object) {
				return createEscrituraAdapter();
			}
			@Override
			public Adapter caseLectura(Lectura object) {
				return createLecturaAdapter();
			}
			@Override
			public Adapter caseOperacionMCP(OperacionMCP object) {
				return createOperacionMCPAdapter();
			}
			@Override
			public Adapter caseTareaTransformacionDatos(TareaTransformacionDatos object) {
				return createTareaTransformacionDatosAdapter();
			}
			@Override
			public Adapter caseTareaLLM(TareaLLM object) {
				return createTareaLLMAdapter();
			}
			@Override
			public Adapter caseTareaUsuario(TareaUsuario object) {
				return createTareaUsuarioAdapter();
			}
			@Override
			public Adapter caseTareaAnalisis(TareaAnalisis object) {
				return createTareaAnalisisAdapter();
			}
			@Override
			public Adapter caseTareaEnvioContexto(TareaEnvioContexto object) {
				return createTareaEnvioContextoAdapter();
			}
			@Override
			public Adapter caseTareaRecepcionContexto(TareaRecepcionContexto object) {
				return createTareaRecepcionContextoAdapter();
			}
			@Override
			public Adapter caseTareaServerMCP(TareaServerMCP object) {
				return createTareaServerMCPAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link McpMM.VersionContexto <em>Version Contexto</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see McpMM.VersionContexto
	 * @generated
	 */
	public Adapter createVersionContextoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link McpMM.ServiceMCP <em>Service MCP</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see McpMM.ServiceMCP
	 * @generated
	 */
	public Adapter createServiceMCPAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link McpMM.ServerMCP <em>Server MCP</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see McpMM.ServerMCP
	 * @generated
	 */
	public Adapter createServerMCPAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link McpMM.Agente <em>Agente</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see McpMM.Agente
	 * @generated
	 */
	public Adapter createAgenteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link McpMM.Workflow <em>Workflow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see McpMM.Workflow
	 * @generated
	 */
	public Adapter createWorkflowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link McpMM.Contexto <em>Contexto</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see McpMM.Contexto
	 * @generated
	 */
	public Adapter createContextoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link McpMM.Propiedad <em>Propiedad</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see McpMM.Propiedad
	 * @generated
	 */
	public Adapter createPropiedadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link McpMM.Tarea <em>Tarea</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see McpMM.Tarea
	 * @generated
	 */
	public Adapter createTareaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link McpMM.TareaEjecutable <em>Tarea Ejecutable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see McpMM.TareaEjecutable
	 * @generated
	 */
	public Adapter createTareaEjecutableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link McpMM.Inicio <em>Inicio</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see McpMM.Inicio
	 * @generated
	 */
	public Adapter createInicioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link McpMM.Final <em>Final</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see McpMM.Final
	 * @generated
	 */
	public Adapter createFinalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link McpMM.Accion <em>Accion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see McpMM.Accion
	 * @generated
	 */
	public Adapter createAccionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link McpMM.Escritura <em>Escritura</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see McpMM.Escritura
	 * @generated
	 */
	public Adapter createEscrituraAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link McpMM.Lectura <em>Lectura</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see McpMM.Lectura
	 * @generated
	 */
	public Adapter createLecturaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link McpMM.OperacionMCP <em>Operacion MCP</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see McpMM.OperacionMCP
	 * @generated
	 */
	public Adapter createOperacionMCPAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link McpMM.TareaTransformacionDatos <em>Tarea Transformacion Datos</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see McpMM.TareaTransformacionDatos
	 * @generated
	 */
	public Adapter createTareaTransformacionDatosAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link McpMM.TareaLLM <em>Tarea LLM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see McpMM.TareaLLM
	 * @generated
	 */
	public Adapter createTareaLLMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link McpMM.TareaUsuario <em>Tarea Usuario</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see McpMM.TareaUsuario
	 * @generated
	 */
	public Adapter createTareaUsuarioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link McpMM.TareaAnalisis <em>Tarea Analisis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see McpMM.TareaAnalisis
	 * @generated
	 */
	public Adapter createTareaAnalisisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link McpMM.TareaEnvioContexto <em>Tarea Envio Contexto</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see McpMM.TareaEnvioContexto
	 * @generated
	 */
	public Adapter createTareaEnvioContextoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link McpMM.TareaRecepcionContexto <em>Tarea Recepcion Contexto</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see McpMM.TareaRecepcionContexto
	 * @generated
	 */
	public Adapter createTareaRecepcionContextoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link McpMM.TareaServerMCP <em>Tarea Server MCP</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see McpMM.TareaServerMCP
	 * @generated
	 */
	public Adapter createTareaServerMCPAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //McpMMAdapterFactory
