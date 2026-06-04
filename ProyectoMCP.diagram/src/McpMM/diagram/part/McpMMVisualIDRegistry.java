/*
* 
*/
package McpMM.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class McpMMVisualIDRegistry {

	/**
	* @generated
	*/
	private static final String DEBUG_KEY = "ProyectoMCP.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	* @generated
	*/
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (McpMM.diagram.edit.parts.ServiceMCPEditPart.MODEL_ID.equals(view.getType())) {
				return McpMM.diagram.edit.parts.ServiceMCPEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return McpMM.diagram.part.McpMMVisualIDRegistry.getVisualID(view.getType());
	}

	/**
	* @generated
	*/
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	* @generated
	*/
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(Platform.getDebugOption(DEBUG_KEY))) {
				McpMM.diagram.part.McpMMDiagramEditorPlugin.getInstance()
						.logError("Unable to parse view type as a visualID number: " + type);
			}
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	* @generated
	*/
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (McpMM.McpMMPackage.eINSTANCE.getServiceMCP().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((McpMM.ServiceMCP) domainElement)) {
			return McpMM.diagram.edit.parts.ServiceMCPEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = McpMM.diagram.part.McpMMVisualIDRegistry.getModelID(containerView);
		if (!McpMM.diagram.edit.parts.ServiceMCPEditPart.MODEL_ID.equals(containerModelID)
				&& !"McpMM".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (McpMM.diagram.edit.parts.ServiceMCPEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = McpMM.diagram.part.McpMMVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = McpMM.diagram.edit.parts.ServiceMCPEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case McpMM.diagram.edit.parts.ServiceMCPEditPart.VISUAL_ID:
			if (McpMM.McpMMPackage.eINSTANCE.getServerMCP().isSuperTypeOf(domainElement.eClass())) {
				return McpMM.diagram.edit.parts.ServerMCPEditPart.VISUAL_ID;
			}
			if (McpMM.McpMMPackage.eINSTANCE.getAgente().isSuperTypeOf(domainElement.eClass())) {
				return McpMM.diagram.edit.parts.AgenteEditPart.VISUAL_ID;
			}
			if (McpMM.McpMMPackage.eINSTANCE.getWorkflow().isSuperTypeOf(domainElement.eClass())) {
				return McpMM.diagram.edit.parts.WorkflowEditPart.VISUAL_ID;
			}
			break;
		case McpMM.diagram.edit.parts.ServerMCPServerMCPOperacionmcpCompartmentEditPart.VISUAL_ID:
			if (McpMM.McpMMPackage.eINSTANCE.getOperacionMCP().isSuperTypeOf(domainElement.eClass())) {
				return McpMM.diagram.edit.parts.OperacionMCPEditPart.VISUAL_ID;
			}
			break;
		case McpMM.diagram.edit.parts.WorkflowWorkflowContextoCompartmentEditPart.VISUAL_ID:
			if (McpMM.McpMMPackage.eINSTANCE.getContexto().isSuperTypeOf(domainElement.eClass())) {
				return McpMM.diagram.edit.parts.ContextoEditPart.VISUAL_ID;
			}
			break;
		case McpMM.diagram.edit.parts.WorkflowWorkflowTareaCompartmentEditPart.VISUAL_ID:
			if (McpMM.McpMMPackage.eINSTANCE.getTareaTransformacionDatos().isSuperTypeOf(domainElement.eClass())) {
				return McpMM.diagram.edit.parts.TareaTransformacionDatosEditPart.VISUAL_ID;
			}
			if (McpMM.McpMMPackage.eINSTANCE.getTareaLLM().isSuperTypeOf(domainElement.eClass())) {
				return McpMM.diagram.edit.parts.TareaLLMEditPart.VISUAL_ID;
			}
			if (McpMM.McpMMPackage.eINSTANCE.getTareaUsuario().isSuperTypeOf(domainElement.eClass())) {
				return McpMM.diagram.edit.parts.TareaUsuarioEditPart.VISUAL_ID;
			}
			if (McpMM.McpMMPackage.eINSTANCE.getTareaAnalisis().isSuperTypeOf(domainElement.eClass())) {
				return McpMM.diagram.edit.parts.TareaAnalisisEditPart.VISUAL_ID;
			}
			if (McpMM.McpMMPackage.eINSTANCE.getTareaEnvioContexto().isSuperTypeOf(domainElement.eClass())) {
				return McpMM.diagram.edit.parts.TareaEnvioContextoEditPart.VISUAL_ID;
			}
			if (McpMM.McpMMPackage.eINSTANCE.getTareaRecepcionContexto().isSuperTypeOf(domainElement.eClass())) {
				return McpMM.diagram.edit.parts.TareaRecepcionContextoEditPart.VISUAL_ID;
			}
			if (McpMM.McpMMPackage.eINSTANCE.getTareaServerMCP().isSuperTypeOf(domainElement.eClass())) {
				return McpMM.diagram.edit.parts.TareaServerMCPEditPart.VISUAL_ID;
			}
			if (McpMM.McpMMPackage.eINSTANCE.getTareaFinal().isSuperTypeOf(domainElement.eClass())) {
				return McpMM.diagram.edit.parts.TareaFinalEditPart.VISUAL_ID;
			}
			if (McpMM.McpMMPackage.eINSTANCE.getTareaInicial().isSuperTypeOf(domainElement.eClass())) {
				return McpMM.diagram.edit.parts.TareaInicialEditPart.VISUAL_ID;
			}
			break;
		case McpMM.diagram.edit.parts.TareaTransformacionDatosTareaTransformacionDatosAccionCompartmentEditPart.VISUAL_ID:
			if (McpMM.McpMMPackage.eINSTANCE.getEscritura().isSuperTypeOf(domainElement.eClass())) {
				return McpMM.diagram.edit.parts.EscrituraEditPart.VISUAL_ID;
			}
			if (McpMM.McpMMPackage.eINSTANCE.getLectura().isSuperTypeOf(domainElement.eClass())) {
				return McpMM.diagram.edit.parts.LecturaEditPart.VISUAL_ID;
			}
			break;
		case McpMM.diagram.edit.parts.TareaLLMTareaLLMAccionCompartmentEditPart.VISUAL_ID:
			if (McpMM.McpMMPackage.eINSTANCE.getEscritura().isSuperTypeOf(domainElement.eClass())) {
				return McpMM.diagram.edit.parts.EscrituraEditPart.VISUAL_ID;
			}
			if (McpMM.McpMMPackage.eINSTANCE.getLectura().isSuperTypeOf(domainElement.eClass())) {
				return McpMM.diagram.edit.parts.LecturaEditPart.VISUAL_ID;
			}
			break;
		case McpMM.diagram.edit.parts.TareaUsuarioTareaUsuarioAccionCompartmentEditPart.VISUAL_ID:
			if (McpMM.McpMMPackage.eINSTANCE.getEscritura().isSuperTypeOf(domainElement.eClass())) {
				return McpMM.diagram.edit.parts.EscrituraEditPart.VISUAL_ID;
			}
			if (McpMM.McpMMPackage.eINSTANCE.getLectura().isSuperTypeOf(domainElement.eClass())) {
				return McpMM.diagram.edit.parts.LecturaEditPart.VISUAL_ID;
			}
			break;
		case McpMM.diagram.edit.parts.TareaAnalisisTareaAnalisisAccionCompartmentEditPart.VISUAL_ID:
			if (McpMM.McpMMPackage.eINSTANCE.getEscritura().isSuperTypeOf(domainElement.eClass())) {
				return McpMM.diagram.edit.parts.EscrituraEditPart.VISUAL_ID;
			}
			if (McpMM.McpMMPackage.eINSTANCE.getLectura().isSuperTypeOf(domainElement.eClass())) {
				return McpMM.diagram.edit.parts.LecturaEditPart.VISUAL_ID;
			}
			break;
		case McpMM.diagram.edit.parts.TareaEnvioContextoTareaEnvioContextoAccionCompartmentEditPart.VISUAL_ID:
			if (McpMM.McpMMPackage.eINSTANCE.getEscritura().isSuperTypeOf(domainElement.eClass())) {
				return McpMM.diagram.edit.parts.EscrituraEditPart.VISUAL_ID;
			}
			if (McpMM.McpMMPackage.eINSTANCE.getLectura().isSuperTypeOf(domainElement.eClass())) {
				return McpMM.diagram.edit.parts.LecturaEditPart.VISUAL_ID;
			}
			break;
		case McpMM.diagram.edit.parts.TareaRecepcionContextoTareaRecepcionContextoAccionCompartmentEditPart.VISUAL_ID:
			if (McpMM.McpMMPackage.eINSTANCE.getEscritura().isSuperTypeOf(domainElement.eClass())) {
				return McpMM.diagram.edit.parts.EscrituraEditPart.VISUAL_ID;
			}
			if (McpMM.McpMMPackage.eINSTANCE.getLectura().isSuperTypeOf(domainElement.eClass())) {
				return McpMM.diagram.edit.parts.LecturaEditPart.VISUAL_ID;
			}
			break;
		case McpMM.diagram.edit.parts.TareaServerMCPTareaServerMCPAccionCompartmentEditPart.VISUAL_ID:
			if (McpMM.McpMMPackage.eINSTANCE.getEscritura().isSuperTypeOf(domainElement.eClass())) {
				return McpMM.diagram.edit.parts.EscrituraEditPart.VISUAL_ID;
			}
			if (McpMM.McpMMPackage.eINSTANCE.getLectura().isSuperTypeOf(domainElement.eClass())) {
				return McpMM.diagram.edit.parts.LecturaEditPart.VISUAL_ID;
			}
			break;
		case McpMM.diagram.edit.parts.TareaFinalTareaFinalAccionCompartmentEditPart.VISUAL_ID:
			if (McpMM.McpMMPackage.eINSTANCE.getEscritura().isSuperTypeOf(domainElement.eClass())) {
				return McpMM.diagram.edit.parts.EscrituraEditPart.VISUAL_ID;
			}
			if (McpMM.McpMMPackage.eINSTANCE.getLectura().isSuperTypeOf(domainElement.eClass())) {
				return McpMM.diagram.edit.parts.LecturaEditPart.VISUAL_ID;
			}
			break;
		case McpMM.diagram.edit.parts.TareaInicialTareaInicialAccionCompartmentEditPart.VISUAL_ID:
			if (McpMM.McpMMPackage.eINSTANCE.getEscritura().isSuperTypeOf(domainElement.eClass())) {
				return McpMM.diagram.edit.parts.EscrituraEditPart.VISUAL_ID;
			}
			if (McpMM.McpMMPackage.eINSTANCE.getLectura().isSuperTypeOf(domainElement.eClass())) {
				return McpMM.diagram.edit.parts.LecturaEditPart.VISUAL_ID;
			}
			break;
		case McpMM.diagram.edit.parts.ContextoContextoPropiedadCompartmentEditPart.VISUAL_ID:
			if (McpMM.McpMMPackage.eINSTANCE.getPropiedad().isSuperTypeOf(domainElement.eClass())) {
				return McpMM.diagram.edit.parts.PropiedadEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = McpMM.diagram.part.McpMMVisualIDRegistry.getModelID(containerView);
		if (!McpMM.diagram.edit.parts.ServiceMCPEditPart.MODEL_ID.equals(containerModelID)
				&& !"McpMM".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (McpMM.diagram.edit.parts.ServiceMCPEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = McpMM.diagram.part.McpMMVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = McpMM.diagram.edit.parts.ServiceMCPEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case McpMM.diagram.edit.parts.ServiceMCPEditPart.VISUAL_ID:
			if (McpMM.diagram.edit.parts.ServerMCPEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (McpMM.diagram.edit.parts.AgenteEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (McpMM.diagram.edit.parts.WorkflowEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case McpMM.diagram.edit.parts.ServerMCPEditPart.VISUAL_ID:
			if (McpMM.diagram.edit.parts.ServerMCPNombreServerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (McpMM.diagram.edit.parts.ServerMCPServerMCPOperacionmcpCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case McpMM.diagram.edit.parts.AgenteEditPart.VISUAL_ID:
			if (McpMM.diagram.edit.parts.AgenteNombreAgenteEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case McpMM.diagram.edit.parts.WorkflowEditPart.VISUAL_ID:
			if (McpMM.diagram.edit.parts.WorkflowNombreWorkflowEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (McpMM.diagram.edit.parts.WorkflowWorkflowContextoCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (McpMM.diagram.edit.parts.WorkflowWorkflowTareaCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case McpMM.diagram.edit.parts.OperacionMCPEditPart.VISUAL_ID:
			if (McpMM.diagram.edit.parts.OperacionMCPNombreOperacionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case McpMM.diagram.edit.parts.TareaTransformacionDatosEditPart.VISUAL_ID:
			if (McpMM.diagram.edit.parts.TareaTransformacionDatosNombreTareaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (McpMM.diagram.edit.parts.TareaTransformacionDatosTareaTransformacionDatosAccionCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case McpMM.diagram.edit.parts.EscrituraEditPart.VISUAL_ID:
			if (McpMM.diagram.edit.parts.EscrituraNombreAccionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case McpMM.diagram.edit.parts.LecturaEditPart.VISUAL_ID:
			if (McpMM.diagram.edit.parts.LecturaNombreAccionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case McpMM.diagram.edit.parts.TareaLLMEditPart.VISUAL_ID:
			if (McpMM.diagram.edit.parts.TareaLLMNombreTareaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (McpMM.diagram.edit.parts.TareaLLMTareaLLMAccionCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case McpMM.diagram.edit.parts.TareaUsuarioEditPart.VISUAL_ID:
			if (McpMM.diagram.edit.parts.TareaUsuarioNombreTareaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (McpMM.diagram.edit.parts.TareaUsuarioTareaUsuarioAccionCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case McpMM.diagram.edit.parts.TareaAnalisisEditPart.VISUAL_ID:
			if (McpMM.diagram.edit.parts.TareaAnalisisNombreTareaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (McpMM.diagram.edit.parts.TareaAnalisisTareaAnalisisAccionCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case McpMM.diagram.edit.parts.TareaEnvioContextoEditPart.VISUAL_ID:
			if (McpMM.diagram.edit.parts.TareaEnvioContextoNombreTareaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (McpMM.diagram.edit.parts.TareaEnvioContextoTareaEnvioContextoAccionCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case McpMM.diagram.edit.parts.TareaRecepcionContextoEditPart.VISUAL_ID:
			if (McpMM.diagram.edit.parts.TareaRecepcionContextoNombreTareaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (McpMM.diagram.edit.parts.TareaRecepcionContextoTareaRecepcionContextoAccionCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case McpMM.diagram.edit.parts.TareaServerMCPEditPart.VISUAL_ID:
			if (McpMM.diagram.edit.parts.TareaServerMCPNombreTareaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (McpMM.diagram.edit.parts.TareaServerMCPTareaServerMCPAccionCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case McpMM.diagram.edit.parts.TareaFinalEditPart.VISUAL_ID:
			if (McpMM.diagram.edit.parts.TareaFinalNombreTareaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (McpMM.diagram.edit.parts.TareaFinalTareaFinalAccionCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case McpMM.diagram.edit.parts.TareaInicialEditPart.VISUAL_ID:
			if (McpMM.diagram.edit.parts.TareaInicialNombreTareaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (McpMM.diagram.edit.parts.TareaInicialTareaInicialAccionCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case McpMM.diagram.edit.parts.ContextoEditPart.VISUAL_ID:
			if (McpMM.diagram.edit.parts.ContextoNombreContextoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (McpMM.diagram.edit.parts.ContextoContextoPropiedadCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case McpMM.diagram.edit.parts.PropiedadEditPart.VISUAL_ID:
			if (McpMM.diagram.edit.parts.PropiedadNombrePropiedadEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case McpMM.diagram.edit.parts.ServerMCPServerMCPOperacionmcpCompartmentEditPart.VISUAL_ID:
			if (McpMM.diagram.edit.parts.OperacionMCPEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case McpMM.diagram.edit.parts.WorkflowWorkflowContextoCompartmentEditPart.VISUAL_ID:
			if (McpMM.diagram.edit.parts.ContextoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case McpMM.diagram.edit.parts.WorkflowWorkflowTareaCompartmentEditPart.VISUAL_ID:
			if (McpMM.diagram.edit.parts.TareaTransformacionDatosEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (McpMM.diagram.edit.parts.TareaLLMEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (McpMM.diagram.edit.parts.TareaUsuarioEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (McpMM.diagram.edit.parts.TareaAnalisisEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (McpMM.diagram.edit.parts.TareaEnvioContextoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (McpMM.diagram.edit.parts.TareaRecepcionContextoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (McpMM.diagram.edit.parts.TareaServerMCPEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (McpMM.diagram.edit.parts.TareaFinalEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (McpMM.diagram.edit.parts.TareaInicialEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case McpMM.diagram.edit.parts.TareaTransformacionDatosTareaTransformacionDatosAccionCompartmentEditPart.VISUAL_ID:
			if (McpMM.diagram.edit.parts.EscrituraEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (McpMM.diagram.edit.parts.LecturaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case McpMM.diagram.edit.parts.TareaLLMTareaLLMAccionCompartmentEditPart.VISUAL_ID:
			if (McpMM.diagram.edit.parts.EscrituraEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (McpMM.diagram.edit.parts.LecturaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case McpMM.diagram.edit.parts.TareaUsuarioTareaUsuarioAccionCompartmentEditPart.VISUAL_ID:
			if (McpMM.diagram.edit.parts.EscrituraEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (McpMM.diagram.edit.parts.LecturaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case McpMM.diagram.edit.parts.TareaAnalisisTareaAnalisisAccionCompartmentEditPart.VISUAL_ID:
			if (McpMM.diagram.edit.parts.EscrituraEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (McpMM.diagram.edit.parts.LecturaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case McpMM.diagram.edit.parts.TareaEnvioContextoTareaEnvioContextoAccionCompartmentEditPart.VISUAL_ID:
			if (McpMM.diagram.edit.parts.EscrituraEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (McpMM.diagram.edit.parts.LecturaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case McpMM.diagram.edit.parts.TareaRecepcionContextoTareaRecepcionContextoAccionCompartmentEditPart.VISUAL_ID:
			if (McpMM.diagram.edit.parts.EscrituraEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (McpMM.diagram.edit.parts.LecturaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case McpMM.diagram.edit.parts.TareaServerMCPTareaServerMCPAccionCompartmentEditPart.VISUAL_ID:
			if (McpMM.diagram.edit.parts.EscrituraEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (McpMM.diagram.edit.parts.LecturaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case McpMM.diagram.edit.parts.TareaFinalTareaFinalAccionCompartmentEditPart.VISUAL_ID:
			if (McpMM.diagram.edit.parts.EscrituraEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (McpMM.diagram.edit.parts.LecturaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case McpMM.diagram.edit.parts.TareaInicialTareaInicialAccionCompartmentEditPart.VISUAL_ID:
			if (McpMM.diagram.edit.parts.EscrituraEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (McpMM.diagram.edit.parts.LecturaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case McpMM.diagram.edit.parts.ContextoContextoPropiedadCompartmentEditPart.VISUAL_ID:
			if (McpMM.diagram.edit.parts.PropiedadEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case McpMM.diagram.edit.parts.AgenteRealizaEditPart.VISUAL_ID:
			if (McpMM.diagram.edit.parts.AgenteRealizaExternalLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case McpMM.diagram.edit.parts.WorkflowEmpiezaConEditPart.VISUAL_ID:
			if (McpMM.diagram.edit.parts.WorkflowEmpiezaConExternalLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case McpMM.diagram.edit.parts.WorkflowFinalizaConEditPart.VISUAL_ID:
			if (McpMM.diagram.edit.parts.WorkflowFinalizaConExternalLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case McpMM.diagram.edit.parts.TareaSigueEditPart.VISUAL_ID:
			if (McpMM.diagram.edit.parts.TareaSigueExternalLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case McpMM.diagram.edit.parts.TareaAnalisisSigueElseEditPart.VISUAL_ID:
			if (McpMM.diagram.edit.parts.TareaAnalisisSigueElseExternalLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case McpMM.diagram.edit.parts.TareaEnvioContextoEnviaAEditPart.VISUAL_ID:
			if (McpMM.diagram.edit.parts.TareaEnvioContextoEnviaAExternalLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case McpMM.diagram.edit.parts.TareaEnvioContextoEnvioAsociadoEditPart.VISUAL_ID:
			if (McpMM.diagram.edit.parts.TareaEnvioContextoEnvioAsociadoExternalLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case McpMM.diagram.edit.parts.TareaRecepcionContextoRecibeDeEditPart.VISUAL_ID:
			if (McpMM.diagram.edit.parts.TareaRecepcionContextoRecibeDeExternalLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case McpMM.diagram.edit.parts.TareaRecepcionContextoRecepcionAsociadaEditPart.VISUAL_ID:
			if (McpMM.diagram.edit.parts.TareaRecepcionContextoRecepcionAsociadaExternalLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case McpMM.diagram.edit.parts.TareaServerMCPEjecutaOperacionEditPart.VISUAL_ID:
			if (McpMM.diagram.edit.parts.TareaServerMCPEjecutaOperacionExternalLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		return -1;
	}

	/**
	* User can change implementation of this method to handle some specific
	* situations not covered by default logic.
	* 
	* @generated
	*/
	private static boolean isDiagram(McpMM.ServiceMCP element) {
		return true;
	}

	/**
	* @generated
	*/
	public static boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	* @generated
	*/
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case McpMM.diagram.edit.parts.ServerMCPServerMCPOperacionmcpCompartmentEditPart.VISUAL_ID:
		case McpMM.diagram.edit.parts.WorkflowWorkflowContextoCompartmentEditPart.VISUAL_ID:
		case McpMM.diagram.edit.parts.WorkflowWorkflowTareaCompartmentEditPart.VISUAL_ID:
		case McpMM.diagram.edit.parts.TareaTransformacionDatosTareaTransformacionDatosAccionCompartmentEditPart.VISUAL_ID:
		case McpMM.diagram.edit.parts.TareaLLMTareaLLMAccionCompartmentEditPart.VISUAL_ID:
		case McpMM.diagram.edit.parts.TareaUsuarioTareaUsuarioAccionCompartmentEditPart.VISUAL_ID:
		case McpMM.diagram.edit.parts.TareaAnalisisTareaAnalisisAccionCompartmentEditPart.VISUAL_ID:
		case McpMM.diagram.edit.parts.TareaEnvioContextoTareaEnvioContextoAccionCompartmentEditPart.VISUAL_ID:
		case McpMM.diagram.edit.parts.TareaRecepcionContextoTareaRecepcionContextoAccionCompartmentEditPart.VISUAL_ID:
		case McpMM.diagram.edit.parts.TareaServerMCPTareaServerMCPAccionCompartmentEditPart.VISUAL_ID:
		case McpMM.diagram.edit.parts.TareaFinalTareaFinalAccionCompartmentEditPart.VISUAL_ID:
		case McpMM.diagram.edit.parts.TareaInicialTareaInicialAccionCompartmentEditPart.VISUAL_ID:
		case McpMM.diagram.edit.parts.ContextoContextoPropiedadCompartmentEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case McpMM.diagram.edit.parts.ServiceMCPEditPart.VISUAL_ID:
			return false;
		case McpMM.diagram.edit.parts.AgenteEditPart.VISUAL_ID:
		case McpMM.diagram.edit.parts.OperacionMCPEditPart.VISUAL_ID:
		case McpMM.diagram.edit.parts.EscrituraEditPart.VISUAL_ID:
		case McpMM.diagram.edit.parts.LecturaEditPart.VISUAL_ID:
		case McpMM.diagram.edit.parts.PropiedadEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		* @generated
		*/
		@Override

		public int getVisualID(View view) {
			return McpMM.diagram.part.McpMMVisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return McpMM.diagram.part.McpMMVisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return McpMM.diagram.part.McpMMVisualIDRegistry.getNodeVisualID(containerView, domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return McpMM.diagram.part.McpMMVisualIDRegistry.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return McpMM.diagram.part.McpMMVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return McpMM.diagram.part.McpMMVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

}
