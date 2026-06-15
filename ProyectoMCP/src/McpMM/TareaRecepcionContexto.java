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
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='R07_RecepcionPrecedidaEnvio R11_MismasPropiedadesEnvioRecepcion R08_DistintosAgentes'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot R07_RecepcionPrecedidaEnvio='self.precede->exists(t | t.oclIsTypeOf(TareaEnvioContexto))' R11_MismasPropiedadesEnvioRecepcion='self.precede->select(t | t.oclIsTypeOf(TareaEnvioContexto))->forAll(e | self.accion->collect(usa)->asSet() = e.accion->collect(usa)->asSet())' R08_DistintosAgentes='self.precede->select(t | t.oclIsTypeOf(TareaEnvioContexto))->forAll(e | self.ejecutadaPor <> e.oclAsType(TareaEjecutable).ejecutadaPor)'"
 *        annotation="gmf.node label='nombreTarea' figure='rectangle' color='150,150,255'"
 * @generated
 */
public interface TareaRecepcionContexto extends TareaEjecutable {
} // TareaRecepcionContexto
