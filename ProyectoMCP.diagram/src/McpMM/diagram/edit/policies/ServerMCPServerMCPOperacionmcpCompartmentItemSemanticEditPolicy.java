/*
* 
*/
package McpMM.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class ServerMCPServerMCPOperacionmcpCompartmentItemSemanticEditPolicy
		extends McpMM.diagram.edit.policies.McpMMBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public ServerMCPServerMCPOperacionmcpCompartmentItemSemanticEditPolicy() {
		super(McpMM.diagram.providers.McpMMElementTypes.ServerMCP_2001);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (McpMM.diagram.providers.McpMMElementTypes.OperacionMCP_3001 == req.getElementType()) {
			return getGEFWrapper(new McpMM.diagram.edit.commands.OperacionMCPCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
