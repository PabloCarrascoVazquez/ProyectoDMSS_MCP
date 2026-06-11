/*
* 
*/
package McpMM.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class AgenteAgenteFlujoCompartmentItemSemanticEditPolicy
		extends McpMM.diagram.edit.policies.McpMMBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public AgenteAgenteFlujoCompartmentItemSemanticEditPolicy() {
		super(McpMM.diagram.providers.McpMMElementTypes.Agente_2001);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (McpMM.diagram.providers.McpMMElementTypes.Workflow_3001 == req.getElementType()) {
			return getGEFWrapper(new McpMM.diagram.edit.commands.WorkflowCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
