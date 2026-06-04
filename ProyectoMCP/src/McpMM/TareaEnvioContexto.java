/**
 */
package McpMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tarea Envio Contexto</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link McpMM.TareaEnvioContexto#getEnviaA <em>Envia A</em>}</li>
 *   <li>{@link McpMM.TareaEnvioContexto#getEnvioAsociado <em>Envio Asociado</em>}</li>
 * </ul>
 *
 * @see McpMM.McpMMPackage#getTareaEnvioContexto()
 * @model annotation="gmf.node label='nombreTarea' figure='rectangle' color='150,255,150'"
 * @generated
 */
public interface TareaEnvioContexto extends TareaEjecutable {

	/**
	 * Returns the value of the '<em><b>Envia A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Envia A</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Envia A</em>' reference.
	 * @see #setEnviaA(TareaRecepcionContexto)
	 * @see McpMM.McpMMPackage#getTareaEnvioContexto_EnviaA()
	 * @model annotation="gmf.link target.decoration='arrow' color='100,100,100' label='env\355a a'"
	 * @generated
	 */
	TareaRecepcionContexto getEnviaA();

	/**
	 * Sets the value of the '{@link McpMM.TareaEnvioContexto#getEnviaA <em>Envia A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Envia A</em>' reference.
	 * @see #getEnviaA()
	 * @generated
	 */
	void setEnviaA(TareaRecepcionContexto value);

	/**
	 * Returns the value of the '<em><b>Envio Asociado</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Envio Asociado</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Envio Asociado</em>' reference.
	 * @see #setEnvioAsociado(Propiedad)
	 * @see McpMM.McpMMPackage#getTareaEnvioContexto_EnvioAsociado()
	 * @model annotation="gmf.link target.decoration='arrow' style='dash' color='200,100,0' label='env\355a prop.'"
	 * @generated
	 */
	Propiedad getEnvioAsociado();

	/**
	 * Sets the value of the '{@link McpMM.TareaEnvioContexto#getEnvioAsociado <em>Envio Asociado</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Envio Asociado</em>' reference.
	 * @see #getEnvioAsociado()
	 * @generated
	 */
	void setEnvioAsociado(Propiedad value);
} // TareaEnvioContexto
