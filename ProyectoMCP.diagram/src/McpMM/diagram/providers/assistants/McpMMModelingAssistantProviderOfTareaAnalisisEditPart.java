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
public class McpMMModelingAssistantProviderOfTareaAnalisisEditPart
		extends McpMM.diagram.providers.McpMMModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(McpMM.diagram.providers.McpMMElementTypes.Escritura_3005);
		types.add(McpMM.diagram.providers.McpMMElementTypes.Lectura_3006);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((McpMM.diagram.edit.parts.TareaAnalisisEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(McpMM.diagram.edit.parts.TareaAnalisisEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(McpMM.diagram.providers.McpMMElementTypes.TareaSigue_4002);
		types.add(McpMM.diagram.providers.McpMMElementTypes.TareaAnalisisSigueElse_4003);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((McpMM.diagram.edit.parts.TareaAnalisisEditPart) sourceEditPart,
				targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(McpMM.diagram.edit.parts.TareaAnalisisEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof McpMM.diagram.edit.parts.TareaTransformacionDatosEditPart) {
			types.add(McpMM.diagram.providers.McpMMElementTypes.TareaSigue_4002);
		}
		if (targetEditPart instanceof McpMM.diagram.edit.parts.TareaLLMEditPart) {
			types.add(McpMM.diagram.providers.McpMMElementTypes.TareaSigue_4002);
		}
		if (targetEditPart instanceof McpMM.diagram.edit.parts.TareaUsuarioEditPart) {
			types.add(McpMM.diagram.providers.McpMMElementTypes.TareaSigue_4002);
		}
		if (targetEditPart instanceof McpMM.diagram.edit.parts.TareaAnalisisEditPart) {
			types.add(McpMM.diagram.providers.McpMMElementTypes.TareaSigue_4002);
		}
		if (targetEditPart instanceof McpMM.diagram.edit.parts.TareaEnvioContextoEditPart) {
			types.add(McpMM.diagram.providers.McpMMElementTypes.TareaSigue_4002);
		}
		if (targetEditPart instanceof McpMM.diagram.edit.parts.TareaRecepcionContextoEditPart) {
			types.add(McpMM.diagram.providers.McpMMElementTypes.TareaSigue_4002);
		}
		if (targetEditPart instanceof McpMM.diagram.edit.parts.TareaServerMCPEditPart) {
			types.add(McpMM.diagram.providers.McpMMElementTypes.TareaSigue_4002);
		}
		if (targetEditPart instanceof McpMM.diagram.edit.parts.InicioEditPart) {
			types.add(McpMM.diagram.providers.McpMMElementTypes.TareaSigue_4002);
		}
		if (targetEditPart instanceof McpMM.diagram.edit.parts.FinalEditPart) {
			types.add(McpMM.diagram.providers.McpMMElementTypes.TareaSigue_4002);
		}
		if (targetEditPart instanceof McpMM.diagram.edit.parts.TareaTransformacionDatosEditPart) {
			types.add(McpMM.diagram.providers.McpMMElementTypes.TareaAnalisisSigueElse_4003);
		}
		if (targetEditPart instanceof McpMM.diagram.edit.parts.TareaLLMEditPart) {
			types.add(McpMM.diagram.providers.McpMMElementTypes.TareaAnalisisSigueElse_4003);
		}
		if (targetEditPart instanceof McpMM.diagram.edit.parts.TareaUsuarioEditPart) {
			types.add(McpMM.diagram.providers.McpMMElementTypes.TareaAnalisisSigueElse_4003);
		}
		if (targetEditPart instanceof McpMM.diagram.edit.parts.TareaAnalisisEditPart) {
			types.add(McpMM.diagram.providers.McpMMElementTypes.TareaAnalisisSigueElse_4003);
		}
		if (targetEditPart instanceof McpMM.diagram.edit.parts.TareaEnvioContextoEditPart) {
			types.add(McpMM.diagram.providers.McpMMElementTypes.TareaAnalisisSigueElse_4003);
		}
		if (targetEditPart instanceof McpMM.diagram.edit.parts.TareaRecepcionContextoEditPart) {
			types.add(McpMM.diagram.providers.McpMMElementTypes.TareaAnalisisSigueElse_4003);
		}
		if (targetEditPart instanceof McpMM.diagram.edit.parts.TareaServerMCPEditPart) {
			types.add(McpMM.diagram.providers.McpMMElementTypes.TareaAnalisisSigueElse_4003);
		}
		if (targetEditPart instanceof McpMM.diagram.edit.parts.InicioEditPart) {
			types.add(McpMM.diagram.providers.McpMMElementTypes.TareaAnalisisSigueElse_4003);
		}
		if (targetEditPart instanceof McpMM.diagram.edit.parts.FinalEditPart) {
			types.add(McpMM.diagram.providers.McpMMElementTypes.TareaAnalisisSigueElse_4003);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((McpMM.diagram.edit.parts.TareaAnalisisEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(McpMM.diagram.edit.parts.TareaAnalisisEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == McpMM.diagram.providers.McpMMElementTypes.TareaSigue_4002) {
			types.add(McpMM.diagram.providers.McpMMElementTypes.TareaTransformacionDatos_3004);
			types.add(McpMM.diagram.providers.McpMMElementTypes.TareaLLM_3007);
			types.add(McpMM.diagram.providers.McpMMElementTypes.TareaUsuario_3008);
			types.add(McpMM.diagram.providers.McpMMElementTypes.TareaAnalisis_3009);
			types.add(McpMM.diagram.providers.McpMMElementTypes.TareaEnvioContexto_3010);
			types.add(McpMM.diagram.providers.McpMMElementTypes.TareaRecepcionContexto_3011);
			types.add(McpMM.diagram.providers.McpMMElementTypes.TareaServerMCP_3012);
			types.add(McpMM.diagram.providers.McpMMElementTypes.Inicio_3013);
			types.add(McpMM.diagram.providers.McpMMElementTypes.Final_3014);
		} else if (relationshipType == McpMM.diagram.providers.McpMMElementTypes.TareaAnalisisSigueElse_4003) {
			types.add(McpMM.diagram.providers.McpMMElementTypes.TareaTransformacionDatos_3004);
			types.add(McpMM.diagram.providers.McpMMElementTypes.TareaLLM_3007);
			types.add(McpMM.diagram.providers.McpMMElementTypes.TareaUsuario_3008);
			types.add(McpMM.diagram.providers.McpMMElementTypes.TareaAnalisis_3009);
			types.add(McpMM.diagram.providers.McpMMElementTypes.TareaEnvioContexto_3010);
			types.add(McpMM.diagram.providers.McpMMElementTypes.TareaRecepcionContexto_3011);
			types.add(McpMM.diagram.providers.McpMMElementTypes.TareaServerMCP_3012);
			types.add(McpMM.diagram.providers.McpMMElementTypes.Inicio_3013);
			types.add(McpMM.diagram.providers.McpMMElementTypes.Final_3014);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((McpMM.diagram.edit.parts.TareaAnalisisEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(McpMM.diagram.edit.parts.TareaAnalisisEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(3);
		types.add(McpMM.diagram.providers.McpMMElementTypes.AgenteTareas_4001);
		types.add(McpMM.diagram.providers.McpMMElementTypes.TareaSigue_4002);
		types.add(McpMM.diagram.providers.McpMMElementTypes.TareaAnalisisSigueElse_4003);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((McpMM.diagram.edit.parts.TareaAnalisisEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(McpMM.diagram.edit.parts.TareaAnalisisEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == McpMM.diagram.providers.McpMMElementTypes.AgenteTareas_4001) {
			types.add(McpMM.diagram.providers.McpMMElementTypes.Agente_2001);
		} else if (relationshipType == McpMM.diagram.providers.McpMMElementTypes.TareaSigue_4002) {
			types.add(McpMM.diagram.providers.McpMMElementTypes.TareaTransformacionDatos_3004);
			types.add(McpMM.diagram.providers.McpMMElementTypes.TareaLLM_3007);
			types.add(McpMM.diagram.providers.McpMMElementTypes.TareaUsuario_3008);
			types.add(McpMM.diagram.providers.McpMMElementTypes.TareaAnalisis_3009);
			types.add(McpMM.diagram.providers.McpMMElementTypes.TareaEnvioContexto_3010);
			types.add(McpMM.diagram.providers.McpMMElementTypes.TareaRecepcionContexto_3011);
			types.add(McpMM.diagram.providers.McpMMElementTypes.TareaServerMCP_3012);
			types.add(McpMM.diagram.providers.McpMMElementTypes.Inicio_3013);
			types.add(McpMM.diagram.providers.McpMMElementTypes.Final_3014);
		} else if (relationshipType == McpMM.diagram.providers.McpMMElementTypes.TareaAnalisisSigueElse_4003) {
			types.add(McpMM.diagram.providers.McpMMElementTypes.TareaAnalisis_3009);
		}
		return types;
	}

}
