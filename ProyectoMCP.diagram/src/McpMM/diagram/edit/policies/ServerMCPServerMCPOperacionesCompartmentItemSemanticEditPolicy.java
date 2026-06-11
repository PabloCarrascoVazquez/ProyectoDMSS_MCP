/*
* 
*/
package McpMM.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class ServerMCPServerMCPOperacionesCompartmentItemSemanticEditPolicy
		extends McpMM.diagram.edit.policies.McpMMBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public ServerMCPServerMCPOperacionesCompartmentItemSemanticEditPolicy() {
		super(McpMM.diagram.providers.McpMMElementTypes.ServerMCP_2002);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (McpMM.diagram.providers.McpMMElementTypes.OperacionMCP_3015 == req.getElementType()) {
			return getGEFWrapper(new McpMM.diagram.edit.commands.OperacionMCPCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
