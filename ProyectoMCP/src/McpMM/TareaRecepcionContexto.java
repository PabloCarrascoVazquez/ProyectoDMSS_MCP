/**
 */
package McpMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tarea Recepcion Contexto</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link McpMM.TareaRecepcionContexto#getRecibeDe <em>Recibe De</em>}</li>
 *   <li>{@link McpMM.TareaRecepcionContexto#getRecepcionAsociada <em>Recepcion Asociada</em>}</li>
 * </ul>
 *
 * @see McpMM.McpMMPackage#getTareaRecepcionContexto()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='R07_RecepcionPrecedidaEnvio R11_MismasPropiedadesEnvioRecepcion'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot R07_RecepcionPrecedidaEnvio='not self.precede.oclIsUndefined() and self.precede.oclIsTypeOf(TareaEnvioContexto)' R11_MismasPropiedadesEnvioRecepcion='if not self.precede.oclIsUndefined() and self.precede.oclIsTypeOf(TareaEnvioContexto) then self.accion->collect(usa)->asSet() = self.precede.accion->collect(usa)->asSet() else true endif'"
 *        annotation="gmf.node label='nombreTarea' figure='rectangle' color='150,150,255'"
 * @generated
 */
public interface TareaRecepcionContexto extends TareaEjecutable {

	/**
	 * Returns the value of the '<em><b>Recibe De</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recibe De</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recibe De</em>' reference.
	 * @see #setRecibeDe(TareaEnvioContexto)
	 * @see McpMM.McpMMPackage#getTareaRecepcionContexto_RecibeDe()
	 * @model annotation="gmf.link target.decoration='arrow' color='100,100,100' label='recibe de'"
	 * @generated
	 */
	TareaEnvioContexto getRecibeDe();

	/**
	 * Sets the value of the '{@link McpMM.TareaRecepcionContexto#getRecibeDe <em>Recibe De</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recibe De</em>' reference.
	 * @see #getRecibeDe()
	 * @generated
	 */
	void setRecibeDe(TareaEnvioContexto value);

	/**
	 * Returns the value of the '<em><b>Recepcion Asociada</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recepcion Asociada</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recepcion Asociada</em>' reference.
	 * @see #setRecepcionAsociada(Propiedad)
	 * @see McpMM.McpMMPackage#getTareaRecepcionContexto_RecepcionAsociada()
	 * @model annotation="gmf.link target.decoration='arrow' style='dash' color='200,100,0' label='recibe prop.'"
	 * @generated
	 */
	Propiedad getRecepcionAsociada();

	/**
	 * Sets the value of the '{@link McpMM.TareaRecepcionContexto#getRecepcionAsociada <em>Recepcion Asociada</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recepcion Asociada</em>' reference.
	 * @see #getRecepcionAsociada()
	 * @generated
	 */
	void setRecepcionAsociada(Propiedad value);
} // TareaRecepcionContexto
