/**
 */
package McpMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tarea Ejecutable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link McpMM.TareaEjecutable#getEjecutadaPor <em>Ejecutada Por</em>}</li>
 * </ul>
 *
 * @see McpMM.McpMMPackage#getTareaEjecutable()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='R09_EntradaYSalida'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot R09_EntradaYSalida='(self.precede->notEmpty() or self.precedeElse->notEmpty()) and not self.sigue.oclIsUndefined()'"
 *        annotation="DSLDoc descripcion='Clase base para aquellas tareas.'"
 * @generated
 */
public interface TareaEjecutable extends Tarea {

	/**
	 * Returns the value of the '<em><b>Ejecutada Por</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link McpMM.Agente#getTareas <em>Tareas</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ejecutada Por</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ejecutada Por</em>' reference.
	 * @see #setEjecutadaPor(Agente)
	 * @see McpMM.McpMMPackage#getTareaEjecutable_EjecutadaPor()
	 * @see McpMM.Agente#getTareas
	 * @model opposite="tareas" required="true"
	 * @generated
	 */
	Agente getEjecutadaPor();

	/**
	 * Sets the value of the '{@link McpMM.TareaEjecutable#getEjecutadaPor <em>Ejecutada Por</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ejecutada Por</em>' reference.
	 * @see #getEjecutadaPor()
	 * @generated
	 */
	void setEjecutadaPor(Agente value);
} // TareaEjecutable
