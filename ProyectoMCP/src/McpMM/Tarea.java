/**
 */
package McpMM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tarea</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link McpMM.Tarea#getNombreTarea <em>Nombre Tarea</em>}</li>
 *   <li>{@link McpMM.Tarea#getAccion <em>Accion</em>}</li>
 *   <li>{@link McpMM.Tarea#getPrecede <em>Precede</em>}</li>
 *   <li>{@link McpMM.Tarea#getSigue <em>Sigue</em>}</li>
 *   <li>{@link McpMM.Tarea#getPrecedeElse <em>Precede Else</em>}</li>
 *   <li>{@link McpMM.Tarea#getAgenteAsignado <em>Agente Asignado</em>}</li>
 * </ul>
 *
 * @see McpMM.McpMMPackage#getTarea()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='R06_NoBuclePropio R08_ConexionesAgentes R09_EntradaYSalida R10_NoCiclos'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot R06_NoBuclePropio='not (self.sigue = self) and (if self.oclIsTypeOf(TareaAnalisis) then not (self.oclAsType(TareaAnalisis).sigueElse = self) else true endif)' R08_ConexionesAgentes='if not self.sigue.oclIsUndefined() then if self.oclIsTypeOf(TareaEnvioContexto) and self.sigue.oclIsTypeOf(TareaRecepcionContexto) then not (self.agenteAsignado = self.sigue.agenteAsignado) else self.agenteAsignado = self.sigue.agenteAsignado endif else true endif' R09_EntradaYSalida='(if self.oclIsTypeOf(TareaInicial) then true else (not self.precede.oclIsUndefined() or not self.precedeElse.oclIsUndefined()) endif) and (if self.oclIsTypeOf(TareaFinal) then true else not self.sigue.oclIsUndefined() endif)' R10_NoCiclos='let siguientes : Set(Tarea) = Set{self.sigue}->union(if self.oclIsTypeOf(TareaAnalisis) then Set{self.oclAsType(TareaAnalisis).sigueElse} else Set{} endif)->select(x | not x.oclIsUndefined()) in siguientes->forAll(s | not s->closure(t : Tarea | Set{t.sigue}->union(if t.oclIsTypeOf(TareaAnalisis) then Set{t.oclAsType(TareaAnalisis).sigueElse} else Set{} endif)->select(x | not x.oclIsUndefined()))->includes(self))'"
 * @generated
 */
public interface Tarea extends EObject {
	/**
	 * Returns the value of the '<em><b>Nombre Tarea</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Tarea</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Tarea</em>' attribute.
	 * @see #setNombreTarea(String)
	 * @see McpMM.McpMMPackage#getTarea_NombreTarea()
	 * @model
	 * @generated
	 */
	String getNombreTarea();

	/**
	 * Sets the value of the '{@link McpMM.Tarea#getNombreTarea <em>Nombre Tarea</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Tarea</em>' attribute.
	 * @see #getNombreTarea()
	 * @generated
	 */
	void setNombreTarea(String value);

	/**
	 * Returns the value of the '<em><b>Accion</b></em>' containment reference list.
	 * The list contents are of type {@link McpMM.Accion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accion</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accion</em>' containment reference list.
	 * @see McpMM.McpMMPackage#getTarea_Accion()
	 * @model containment="true"
	 *        annotation="gmf.compartment layout='list'"
	 * @generated
	 */
	EList<Accion> getAccion();

	/**
	 * Returns the value of the '<em><b>Precede</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link McpMM.Tarea#getSigue <em>Sigue</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precede</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precede</em>' reference.
	 * @see #setPrecede(Tarea)
	 * @see McpMM.McpMMPackage#getTarea_Precede()
	 * @see McpMM.Tarea#getSigue
	 * @model opposite="sigue"
	 * @generated
	 */
	Tarea getPrecede();

	/**
	 * Sets the value of the '{@link McpMM.Tarea#getPrecede <em>Precede</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precede</em>' reference.
	 * @see #getPrecede()
	 * @generated
	 */
	void setPrecede(Tarea value);

	/**
	 * Returns the value of the '<em><b>Sigue</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link McpMM.Tarea#getPrecede <em>Precede</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sigue</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sigue</em>' reference.
	 * @see #setSigue(Tarea)
	 * @see McpMM.McpMMPackage#getTarea_Sigue()
	 * @see McpMM.Tarea#getPrecede
	 * @model opposite="precede"
	 *        annotation="gmf.link target.decoration='arrow' color='0,0,0' label='sigue'"
	 * @generated
	 */
	Tarea getSigue();

	/**
	 * Sets the value of the '{@link McpMM.Tarea#getSigue <em>Sigue</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sigue</em>' reference.
	 * @see #getSigue()
	 * @generated
	 */
	void setSigue(Tarea value);

	/**
	 * Returns the value of the '<em><b>Precede Else</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link McpMM.TareaAnalisis#getSigueElse <em>Sigue Else</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precede Else</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precede Else</em>' reference.
	 * @see #setPrecedeElse(TareaAnalisis)
	 * @see McpMM.McpMMPackage#getTarea_PrecedeElse()
	 * @see McpMM.TareaAnalisis#getSigueElse
	 * @model opposite="sigueElse"
	 * @generated
	 */
	TareaAnalisis getPrecedeElse();

	/**
	 * Sets the value of the '{@link McpMM.Tarea#getPrecedeElse <em>Precede Else</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precede Else</em>' reference.
	 * @see #getPrecedeElse()
	 * @generated
	 */
	void setPrecedeElse(TareaAnalisis value);

	/**
	 * Returns the value of the '<em><b>Agente Asignado</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link McpMM.Agente#getRealiza <em>Realiza</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Agente Asignado</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agente Asignado</em>' reference.
	 * @see #setAgenteAsignado(Agente)
	 * @see McpMM.McpMMPackage#getTarea_AgenteAsignado()
	 * @see McpMM.Agente#getRealiza
	 * @model opposite="realiza"
	 * @generated
	 */
	Agente getAgenteAsignado();

	/**
	 * Sets the value of the '{@link McpMM.Tarea#getAgenteAsignado <em>Agente Asignado</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Agente Asignado</em>' reference.
	 * @see #getAgenteAsignado()
	 * @generated
	 */
	void setAgenteAsignado(Agente value);

} // Tarea
