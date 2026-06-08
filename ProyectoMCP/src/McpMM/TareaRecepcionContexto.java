/**
 */
package McpMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tarea Recepcion Contexto</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see McpMM.McpMMPackage#getTareaRecepcionContexto()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='R07_RecepcionPrecedidaEnvio R11_MismasPropiedadesEnvioRecepcion'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot R07_RecepcionPrecedidaEnvio='not self.precede.oclIsUndefined() and self.precede.oclIsTypeOf(TareaEnvioContexto)' R11_MismasPropiedadesEnvioRecepcion='if not self.precede.oclIsUndefined() and self.precede.oclIsTypeOf(TareaEnvioContexto) then self.accion->collect(usa)->asSet() = self.precede.accion->collect(usa)->asSet() else true endif'"
 *        annotation="gmf.node label='nombreTarea' figure='rectangle' color='150,150,255'"
 * @generated
 */
public interface TareaRecepcionContexto extends TareaEjecutable {
} // TareaRecepcionContexto
