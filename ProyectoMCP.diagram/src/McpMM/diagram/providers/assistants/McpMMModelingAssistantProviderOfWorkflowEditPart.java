/*
 * 
 */
package McpMM.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class McpMMModelingAssistantProviderOfWorkflowEditPart
		extends McpMM.diagram.providers.McpMMModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(McpMM.diagram.providers.McpMMElementTypes.Contexto_3013);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((McpMM.diagram.edit.parts.WorkflowEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(McpMM.diagram.edit.parts.WorkflowEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(McpMM.diagram.providers.McpMMElementTypes.WorkflowEmpiezaCon_4002);
		types.add(McpMM.diagram.providers.McpMMElementTypes.WorkflowFinalizaCon_4003);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((McpMM.diagram.edit.parts.WorkflowEditPart) sourceEditPart,
				targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(McpMM.diagram.edit.parts.WorkflowEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof McpMM.diagram.edit.parts.TareaInicialEditPart) {
			types.add(McpMM.diagram.providers.McpMMElementTypes.WorkflowEmpiezaCon_4002);
		}
		if (targetEditPart instanceof McpMM.diagram.edit.parts.TareaFinalEditPart) {
			types.add(McpMM.diagram.providers.McpMMElementTypes.WorkflowFinalizaCon_4003);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((McpMM.diagram.edit.parts.WorkflowEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(McpMM.diagram.edit.parts.WorkflowEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == McpMM.diagram.providers.McpMMElementTypes.WorkflowEmpiezaCon_4002) {
			types.add(McpMM.diagram.providers.McpMMElementTypes.TareaInicial_3012);
		} else if (relationshipType == McpMM.diagram.providers.McpMMElementTypes.WorkflowFinalizaCon_4003) {
			types.add(McpMM.diagram.providers.McpMMElementTypes.TareaFinal_3011);
		}
		return types;
	}

}
