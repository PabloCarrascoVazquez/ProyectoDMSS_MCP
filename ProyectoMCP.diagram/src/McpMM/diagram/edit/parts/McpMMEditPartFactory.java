/*
 * 
 */
package McpMM.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

/**
 * @generated
 */
public class McpMMEditPartFactory implements EditPartFactory {

	/**
	* @generated
	*/
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (McpMM.diagram.part.McpMMVisualIDRegistry.getVisualID(view)) {

			case McpMM.diagram.edit.parts.ServiceMCPEditPart.VISUAL_ID:
				return new McpMM.diagram.edit.parts.ServiceMCPEditPart(view);

			case McpMM.diagram.edit.parts.AgenteEditPart.VISUAL_ID:
				return new McpMM.diagram.edit.parts.AgenteEditPart(view);

			case McpMM.diagram.edit.parts.AgenteNombreEditPart.VISUAL_ID:
				return new McpMM.diagram.edit.parts.AgenteNombreEditPart(view);

			case McpMM.diagram.edit.parts.ServerMCPEditPart.VISUAL_ID:
				return new McpMM.diagram.edit.parts.ServerMCPEditPart(view);

			case McpMM.diagram.edit.parts.ServerMCPNombreServerEditPart.VISUAL_ID:
				return new McpMM.diagram.edit.parts.ServerMCPNombreServerEditPart(view);

			case McpMM.diagram.edit.parts.WorkflowEditPart.VISUAL_ID:
				return new McpMM.diagram.edit.parts.WorkflowEditPart(view);

			case McpMM.diagram.edit.parts.WorkflowNombreWorkflowEditPart.VISUAL_ID:
				return new McpMM.diagram.edit.parts.WorkflowNombreWorkflowEditPart(view);

			case McpMM.diagram.edit.parts.ContextoEditPart.VISUAL_ID:
				return new McpMM.diagram.edit.parts.ContextoEditPart(view);

			case McpMM.diagram.edit.parts.ContextoNombreContextoEditPart.VISUAL_ID:
				return new McpMM.diagram.edit.parts.ContextoNombreContextoEditPart(view);

			case McpMM.diagram.edit.parts.PropiedadEditPart.VISUAL_ID:
				return new McpMM.diagram.edit.parts.PropiedadEditPart(view);

			case McpMM.diagram.edit.parts.PropiedadNombrePropiedadEditPart.VISUAL_ID:
				return new McpMM.diagram.edit.parts.PropiedadNombrePropiedadEditPart(view);

			case McpMM.diagram.edit.parts.OperacionMCPEditPart.VISUAL_ID:
				return new McpMM.diagram.edit.parts.OperacionMCPEditPart(view);

			case McpMM.diagram.edit.parts.OperacionMCPNombreOperacionEditPart.VISUAL_ID:
				return new McpMM.diagram.edit.parts.OperacionMCPNombreOperacionEditPart(view);

			case McpMM.diagram.edit.parts.TareaTransformacionDatosEditPart.VISUAL_ID:
				return new McpMM.diagram.edit.parts.TareaTransformacionDatosEditPart(view);

			case McpMM.diagram.edit.parts.TareaTransformacionDatosNombreTareaEditPart.VISUAL_ID:
				return new McpMM.diagram.edit.parts.TareaTransformacionDatosNombreTareaEditPart(view);

			case McpMM.diagram.edit.parts.EscrituraEditPart.VISUAL_ID:
				return new McpMM.diagram.edit.parts.EscrituraEditPart(view);

			case McpMM.diagram.edit.parts.EscrituraNombreAccionEditPart.VISUAL_ID:
				return new McpMM.diagram.edit.parts.EscrituraNombreAccionEditPart(view);

			case McpMM.diagram.edit.parts.LecturaEditPart.VISUAL_ID:
				return new McpMM.diagram.edit.parts.LecturaEditPart(view);

			case McpMM.diagram.edit.parts.LecturaNombreAccionEditPart.VISUAL_ID:
				return new McpMM.diagram.edit.parts.LecturaNombreAccionEditPart(view);

			case McpMM.diagram.edit.parts.TareaLLMEditPart.VISUAL_ID:
				return new McpMM.diagram.edit.parts.TareaLLMEditPart(view);

			case McpMM.diagram.edit.parts.TareaLLMNombreTareaEditPart.VISUAL_ID:
				return new McpMM.diagram.edit.parts.TareaLLMNombreTareaEditPart(view);

			case McpMM.diagram.edit.parts.TareaUsuarioEditPart.VISUAL_ID:
				return new McpMM.diagram.edit.parts.TareaUsuarioEditPart(view);

			case McpMM.diagram.edit.parts.TareaUsuarioNombreTareaEditPart.VISUAL_ID:
				return new McpMM.diagram.edit.parts.TareaUsuarioNombreTareaEditPart(view);

			case McpMM.diagram.edit.parts.TareaAnalisisEditPart.VISUAL_ID:
				return new McpMM.diagram.edit.parts.TareaAnalisisEditPart(view);

			case McpMM.diagram.edit.parts.TareaAnalisisNombreTareaEditPart.VISUAL_ID:
				return new McpMM.diagram.edit.parts.TareaAnalisisNombreTareaEditPart(view);

			case McpMM.diagram.edit.parts.TareaEnvioContextoEditPart.VISUAL_ID:
				return new McpMM.diagram.edit.parts.TareaEnvioContextoEditPart(view);

			case McpMM.diagram.edit.parts.TareaEnvioContextoNombreTareaEditPart.VISUAL_ID:
				return new McpMM.diagram.edit.parts.TareaEnvioContextoNombreTareaEditPart(view);

			case McpMM.diagram.edit.parts.TareaRecepcionContextoEditPart.VISUAL_ID:
				return new McpMM.diagram.edit.parts.TareaRecepcionContextoEditPart(view);

			case McpMM.diagram.edit.parts.TareaRecepcionContextoNombreTareaEditPart.VISUAL_ID:
				return new McpMM.diagram.edit.parts.TareaRecepcionContextoNombreTareaEditPart(view);

			case McpMM.diagram.edit.parts.TareaServerMCPEditPart.VISUAL_ID:
				return new McpMM.diagram.edit.parts.TareaServerMCPEditPart(view);

			case McpMM.diagram.edit.parts.TareaServerMCPNombreTareaEditPart.VISUAL_ID:
				return new McpMM.diagram.edit.parts.TareaServerMCPNombreTareaEditPart(view);

			case McpMM.diagram.edit.parts.InicioEditPart.VISUAL_ID:
				return new McpMM.diagram.edit.parts.InicioEditPart(view);

			case McpMM.diagram.edit.parts.InicioNombreTareaEditPart.VISUAL_ID:
				return new McpMM.diagram.edit.parts.InicioNombreTareaEditPart(view);

			case McpMM.diagram.edit.parts.FinalEditPart.VISUAL_ID:
				return new McpMM.diagram.edit.parts.FinalEditPart(view);

			case McpMM.diagram.edit.parts.FinalNombreTareaEditPart.VISUAL_ID:
				return new McpMM.diagram.edit.parts.FinalNombreTareaEditPart(view);

			case McpMM.diagram.edit.parts.AgenteAgenteContextosCompartmentEditPart.VISUAL_ID:
				return new McpMM.diagram.edit.parts.AgenteAgenteContextosCompartmentEditPart(view);

			case McpMM.diagram.edit.parts.ContextoContextoPropiedadesCompartmentEditPart.VISUAL_ID:
				return new McpMM.diagram.edit.parts.ContextoContextoPropiedadesCompartmentEditPart(view);

			case McpMM.diagram.edit.parts.ServerMCPServerMCPOperacionesCompartmentEditPart.VISUAL_ID:
				return new McpMM.diagram.edit.parts.ServerMCPServerMCPOperacionesCompartmentEditPart(view);

			case McpMM.diagram.edit.parts.WorkflowWorkflowTareasCompartmentEditPart.VISUAL_ID:
				return new McpMM.diagram.edit.parts.WorkflowWorkflowTareasCompartmentEditPart(view);

			case McpMM.diagram.edit.parts.TareaTransformacionDatosTareaTransformacionDatosAccionCompartmentEditPart.VISUAL_ID:
				return new McpMM.diagram.edit.parts.TareaTransformacionDatosTareaTransformacionDatosAccionCompartmentEditPart(
						view);

			case McpMM.diagram.edit.parts.TareaLLMTareaLLMAccionCompartmentEditPart.VISUAL_ID:
				return new McpMM.diagram.edit.parts.TareaLLMTareaLLMAccionCompartmentEditPart(view);

			case McpMM.diagram.edit.parts.TareaUsuarioTareaUsuarioAccionCompartmentEditPart.VISUAL_ID:
				return new McpMM.diagram.edit.parts.TareaUsuarioTareaUsuarioAccionCompartmentEditPart(view);

			case McpMM.diagram.edit.parts.TareaAnalisisTareaAnalisisAccionCompartmentEditPart.VISUAL_ID:
				return new McpMM.diagram.edit.parts.TareaAnalisisTareaAnalisisAccionCompartmentEditPart(view);

			case McpMM.diagram.edit.parts.TareaEnvioContextoTareaEnvioContextoAccionCompartmentEditPart.VISUAL_ID:
				return new McpMM.diagram.edit.parts.TareaEnvioContextoTareaEnvioContextoAccionCompartmentEditPart(view);

			case McpMM.diagram.edit.parts.TareaRecepcionContextoTareaRecepcionContextoAccionCompartmentEditPart.VISUAL_ID:
				return new McpMM.diagram.edit.parts.TareaRecepcionContextoTareaRecepcionContextoAccionCompartmentEditPart(
						view);

			case McpMM.diagram.edit.parts.TareaServerMCPTareaServerMCPAccionCompartmentEditPart.VISUAL_ID:
				return new McpMM.diagram.edit.parts.TareaServerMCPTareaServerMCPAccionCompartmentEditPart(view);

			case McpMM.diagram.edit.parts.InicioInicioAccionCompartmentEditPart.VISUAL_ID:
				return new McpMM.diagram.edit.parts.InicioInicioAccionCompartmentEditPart(view);

			case McpMM.diagram.edit.parts.FinalFinalAccionCompartmentEditPart.VISUAL_ID:
				return new McpMM.diagram.edit.parts.FinalFinalAccionCompartmentEditPart(view);

			case McpMM.diagram.edit.parts.AgenteTareasEditPart.VISUAL_ID:
				return new McpMM.diagram.edit.parts.AgenteTareasEditPart(view);

			case McpMM.diagram.edit.parts.AgenteTareasExternalLabelEditPart.VISUAL_ID:
				return new McpMM.diagram.edit.parts.AgenteTareasExternalLabelEditPart(view);

			case McpMM.diagram.edit.parts.TareaSigueEditPart.VISUAL_ID:
				return new McpMM.diagram.edit.parts.TareaSigueEditPart(view);

			case McpMM.diagram.edit.parts.TareaSigueExternalLabelEditPart.VISUAL_ID:
				return new McpMM.diagram.edit.parts.TareaSigueExternalLabelEditPart(view);

			case McpMM.diagram.edit.parts.TareaAnalisisSigueElseEditPart.VISUAL_ID:
				return new McpMM.diagram.edit.parts.TareaAnalisisSigueElseEditPart(view);

			case McpMM.diagram.edit.parts.TareaAnalisisSigueElseExternalLabelEditPart.VISUAL_ID:
				return new McpMM.diagram.edit.parts.TareaAnalisisSigueElseExternalLabelEditPart(view);

			case McpMM.diagram.edit.parts.TareaServerMCPEjecutaOperacionEditPart.VISUAL_ID:
				return new McpMM.diagram.edit.parts.TareaServerMCPEjecutaOperacionEditPart(view);

			case McpMM.diagram.edit.parts.TareaServerMCPEjecutaOperacionExternalLabelEditPart.VISUAL_ID:
				return new McpMM.diagram.edit.parts.TareaServerMCPEjecutaOperacionExternalLabelEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	* @generated
	*/
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	* @generated
	*/
	public static CellEditorLocator getTextCellEditorLocator(ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE.getTextCellEditorLocator(source);
	}

}
