/*
* 
*/
package McpMM.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class WorkflowWorkflowTareasCompartmentItemSemanticEditPolicy
		extends McpMM.diagram.edit.policies.McpMMBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public WorkflowWorkflowTareasCompartmentItemSemanticEditPolicy() {
		super(McpMM.diagram.providers.McpMMElementTypes.Workflow_3001);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (McpMM.diagram.providers.McpMMElementTypes.TareaTransformacionDatos_3002 == req.getElementType()) {
			return getGEFWrapper(new McpMM.diagram.edit.commands.TareaTransformacionDatosCreateCommand(req));
		}
		if (McpMM.diagram.providers.McpMMElementTypes.TareaLLM_3005 == req.getElementType()) {
			return getGEFWrapper(new McpMM.diagram.edit.commands.TareaLLMCreateCommand(req));
		}
		if (McpMM.diagram.providers.McpMMElementTypes.TareaUsuario_3006 == req.getElementType()) {
			return getGEFWrapper(new McpMM.diagram.edit.commands.TareaUsuarioCreateCommand(req));
		}
		if (McpMM.diagram.providers.McpMMElementTypes.TareaAnalisis_3007 == req.getElementType()) {
			return getGEFWrapper(new McpMM.diagram.edit.commands.TareaAnalisisCreateCommand(req));
		}
		if (McpMM.diagram.providers.McpMMElementTypes.TareaEnvioContexto_3008 == req.getElementType()) {
			return getGEFWrapper(new McpMM.diagram.edit.commands.TareaEnvioContextoCreateCommand(req));
		}
		if (McpMM.diagram.providers.McpMMElementTypes.TareaRecepcionContexto_3009 == req.getElementType()) {
			return getGEFWrapper(new McpMM.diagram.edit.commands.TareaRecepcionContextoCreateCommand(req));
		}
		if (McpMM.diagram.providers.McpMMElementTypes.TareaServerMCP_3010 == req.getElementType()) {
			return getGEFWrapper(new McpMM.diagram.edit.commands.TareaServerMCPCreateCommand(req));
		}
		if (McpMM.diagram.providers.McpMMElementTypes.Inicio_3011 == req.getElementType()) {
			return getGEFWrapper(new McpMM.diagram.edit.commands.InicioCreateCommand(req));
		}
		if (McpMM.diagram.providers.McpMMElementTypes.Final_3012 == req.getElementType()) {
			return getGEFWrapper(new McpMM.diagram.edit.commands.FinalCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
