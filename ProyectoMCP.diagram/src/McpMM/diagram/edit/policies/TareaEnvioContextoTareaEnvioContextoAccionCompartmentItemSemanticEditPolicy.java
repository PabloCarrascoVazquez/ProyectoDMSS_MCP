/*
* 
*/
package McpMM.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class TareaEnvioContextoTareaEnvioContextoAccionCompartmentItemSemanticEditPolicy
		extends McpMM.diagram.edit.policies.McpMMBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public TareaEnvioContextoTareaEnvioContextoAccionCompartmentItemSemanticEditPolicy() {
		super(McpMM.diagram.providers.McpMMElementTypes.TareaEnvioContexto_3008);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (McpMM.diagram.providers.McpMMElementTypes.Escritura_3003 == req.getElementType()) {
			return getGEFWrapper(new McpMM.diagram.edit.commands.EscrituraCreateCommand(req));
		}
		if (McpMM.diagram.providers.McpMMElementTypes.Lectura_3004 == req.getElementType()) {
			return getGEFWrapper(new McpMM.diagram.edit.commands.LecturaCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
