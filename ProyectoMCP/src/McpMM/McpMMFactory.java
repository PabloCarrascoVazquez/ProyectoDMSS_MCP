/**
 */
package McpMM;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see McpMM.McpMMPackage
 * @generated
 */
public interface McpMMFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	McpMMFactory eINSTANCE = McpMM.impl.McpMMFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Version Contexto</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Version Contexto</em>'.
	 * @generated
	 */
	VersionContexto createVersionContexto();

	/**
	 * Returns a new object of class '<em>Service MCP</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service MCP</em>'.
	 * @generated
	 */
	ServiceMCP createServiceMCP();

	/**
	 * Returns a new object of class '<em>Server MCP</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Server MCP</em>'.
	 * @generated
	 */
	ServerMCP createServerMCP();

	/**
	 * Returns a new object of class '<em>Agente</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Agente</em>'.
	 * @generated
	 */
	Agente createAgente();

	/**
	 * Returns a new object of class '<em>Workflow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Workflow</em>'.
	 * @generated
	 */
	Workflow createWorkflow();

	/**
	 * Returns a new object of class '<em>Contexto</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contexto</em>'.
	 * @generated
	 */
	Contexto createContexto();

	/**
	 * Returns a new object of class '<em>Propiedad</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Propiedad</em>'.
	 * @generated
	 */
	Propiedad createPropiedad();

	/**
	 * Returns a new object of class '<em>Inicio</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inicio</em>'.
	 * @generated
	 */
	Inicio createInicio();

	/**
	 * Returns a new object of class '<em>Final</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Final</em>'.
	 * @generated
	 */
	Final createFinal();

	/**
	 * Returns a new object of class '<em>Escritura</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Escritura</em>'.
	 * @generated
	 */
	Escritura createEscritura();

	/**
	 * Returns a new object of class '<em>Lectura</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lectura</em>'.
	 * @generated
	 */
	Lectura createLectura();

	/**
	 * Returns a new object of class '<em>Operacion MCP</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operacion MCP</em>'.
	 * @generated
	 */
	OperacionMCP createOperacionMCP();

	/**
	 * Returns a new object of class '<em>Tarea Transformacion Datos</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tarea Transformacion Datos</em>'.
	 * @generated
	 */
	TareaTransformacionDatos createTareaTransformacionDatos();

	/**
	 * Returns a new object of class '<em>Tarea LLM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tarea LLM</em>'.
	 * @generated
	 */
	TareaLLM createTareaLLM();

	/**
	 * Returns a new object of class '<em>Tarea Usuario</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tarea Usuario</em>'.
	 * @generated
	 */
	TareaUsuario createTareaUsuario();

	/**
	 * Returns a new object of class '<em>Tarea Analisis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tarea Analisis</em>'.
	 * @generated
	 */
	TareaAnalisis createTareaAnalisis();

	/**
	 * Returns a new object of class '<em>Tarea Envio Contexto</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tarea Envio Contexto</em>'.
	 * @generated
	 */
	TareaEnvioContexto createTareaEnvioContexto();

	/**
	 * Returns a new object of class '<em>Tarea Recepcion Contexto</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tarea Recepcion Contexto</em>'.
	 * @generated
	 */
	TareaRecepcionContexto createTareaRecepcionContexto();

	/**
	 * Returns a new object of class '<em>Tarea Server MCP</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tarea Server MCP</em>'.
	 * @generated
	 */
	TareaServerMCP createTareaServerMCP();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	McpMMPackage getMcpMMPackage();

} //McpMMFactory
