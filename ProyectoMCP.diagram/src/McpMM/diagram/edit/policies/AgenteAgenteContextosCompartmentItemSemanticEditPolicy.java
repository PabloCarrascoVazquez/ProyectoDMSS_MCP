/*
* 
*/
package McpMM.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class AgenteAgenteContextosCompartmentItemSemanticEditPolicy
		extends McpMM.diagram.edit.policies.McpMMBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public AgenteAgenteContextosCompartmentItemSemanticEditPolicy() {
		super(McpMM.diagram.providers.McpMMElementTypes.Agente_2001);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (McpMM.diagram.providers.McpMMElementTypes.Contexto_3001 == req.getElementType()) {
			return getGEFWrapper(new McpMM.diagram.edit.commands.ContextoCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
