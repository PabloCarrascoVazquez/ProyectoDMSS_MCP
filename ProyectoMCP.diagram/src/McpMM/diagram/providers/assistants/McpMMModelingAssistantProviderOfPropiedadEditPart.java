/*
 * 
 */
package McpMM.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class McpMMModelingAssistantProviderOfPropiedadEditPart
		extends McpMM.diagram.providers.McpMMModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((McpMM.diagram.edit.parts.PropiedadEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(McpMM.diagram.edit.parts.PropiedadEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(McpMM.diagram.providers.McpMMElementTypes.TareaEnvioContextoEnvioAsociado_4010);
		types.add(McpMM.diagram.providers.McpMMElementTypes.TareaRecepcionContextoRecepcionAsociada_4012);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((McpMM.diagram.edit.parts.PropiedadEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(McpMM.diagram.edit.parts.PropiedadEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == McpMM.diagram.providers.McpMMElementTypes.TareaEnvioContextoEnvioAsociado_4010) {
			types.add(McpMM.diagram.providers.McpMMElementTypes.TareaEnvioContexto_3008);
		} else if (relationshipType == McpMM.diagram.providers.McpMMElementTypes.TareaRecepcionContextoRecepcionAsociada_4012) {
			types.add(McpMM.diagram.providers.McpMMElementTypes.TareaRecepcionContexto_3009);
		}
		return types;
	}

}
