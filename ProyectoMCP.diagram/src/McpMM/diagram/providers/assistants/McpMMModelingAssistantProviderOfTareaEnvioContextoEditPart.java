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
public class McpMMModelingAssistantProviderOfTareaEnvioContextoEditPart
		extends McpMM.diagram.providers.McpMMModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(McpMM.diagram.providers.McpMMElementTypes.Escritura_3003);
		types.add(McpMM.diagram.providers.McpMMElementTypes.Lectura_3004);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((McpMM.diagram.edit.parts.TareaEnvioContextoEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(McpMM.diagram.edit.parts.TareaEnvioContextoEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(3);
		types.add(McpMM.diagram.providers.McpMMElementTypes.TareaSigue_4004);
		types.add(McpMM.diagram.providers.McpMMElementTypes.TareaEnvioContextoEnviaA_4009);
		types.add(McpMM.diagram.providers.McpMMElementTypes.TareaEnvioContextoEnvioAsociado_4010);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((McpMM.diagram.edit.parts.TareaEnvioContextoEditPart) sourceEditPart,
				targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(McpMM.diagram.edit.parts.TareaEnvioContextoEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof McpMM.diagram.edit.parts.TareaTransformacionDatosEditPart) {
			types.add(McpMM.diagram.providers.McpMMElementTypes.TareaSigue_4004);
		}
		if (targetEditPart instanceof McpMM.diagram.edit.parts.TareaLLMEditPart) {
			types.add(McpMM.diagram.providers.McpMMElementTypes.TareaSigue_4004);
		}
		if (targetEditPart instanceof McpMM.diagram.edit.parts.TareaUsuarioEditPart) {
			types.add(McpMM.diagram.providers.McpMMElementTypes.TareaSigue_4004);
		}
		if (targetEditPart instanceof McpMM.diagram.edit.parts.TareaAnalisisEditPart) {
			types.add(McpMM.diagram.providers.McpMMElementTypes.TareaSigue_4004);
		}
		if (targetEditPart instanceof McpMM.diagram.edit.parts.TareaEnvioContextoEditPart) {
			types.add(McpMM.diagram.providers.McpMMElementTypes.TareaSigue_4004);
		}
		if (targetEditPart instanceof McpMM.diagram.edit.parts.TareaRecepcionContextoEditPart) {
			types.add(McpMM.diagram.providers.McpMMElementTypes.TareaSigue_4004);
		}
		if (targetEditPart instanceof McpMM.diagram.edit.parts.TareaServerMCPEditPart) {
			types.add(McpMM.diagram.providers.McpMMElementTypes.TareaSigue_4004);
		}
		if (targetEditPart instanceof McpMM.diagram.edit.parts.TareaFinalEditPart) {
			types.add(McpMM.diagram.providers.McpMMElementTypes.TareaSigue_4004);
		}
		if (targetEditPart instanceof McpMM.diagram.edit.parts.TareaInicialEditPart) {
			types.add(McpMM.diagram.providers.McpMMElementTypes.TareaSigue_4004);
		}
		if (targetEditPart instanceof McpMM.diagram.edit.parts.TareaRecepcionContextoEditPart) {
			types.add(McpMM.diagram.providers.McpMMElementTypes.TareaEnvioContextoEnviaA_4009);
		}
		if (targetEditPart instanceof McpMM.diagram.edit.parts.PropiedadEditPart) {
			types.add(McpMM.diagram.providers.McpMMElementTypes.TareaEnvioContextoEnvioAsociado_4010);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((McpMM.diagram.edit.parts.TareaEnvioContextoEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(McpMM.diagram.edit.parts.TareaEnvioContextoEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == McpMM.diagram.providers.McpMMElementTypes.TareaSigue_4004) {
			types.add(McpMM.diagram.providers.McpMMElementTypes.TareaTransformacionDatos_3002);
			types.add(McpMM.diagram.providers.McpMMElementTypes.TareaLLM_3005);
			types.add(McpMM.diagram.providers.McpMMElementTypes.TareaUsuario_3006);
			types.add(McpMM.diagram.providers.McpMMElementTypes.TareaAnalisis_3007);
			types.add(McpMM.diagram.providers.McpMMElementTypes.TareaEnvioContexto_3008);
			types.add(McpMM.diagram.providers.McpMMElementTypes.TareaRecepcionContexto_3009);
			types.add(McpMM.diagram.providers.McpMMElementTypes.TareaServerMCP_3010);
			types.add(McpMM.diagram.providers.McpMMElementTypes.TareaFinal_3011);
			types.add(McpMM.diagram.providers.McpMMElementTypes.TareaInicial_3012);
		} else if (relationshipType == McpMM.diagram.providers.McpMMElementTypes.TareaEnvioContextoEnviaA_4009) {
			types.add(McpMM.diagram.providers.McpMMElementTypes.TareaRecepcionContexto_3009);
		} else if (relationshipType == McpMM.diagram.providers.McpMMElementTypes.TareaEnvioContextoEnvioAsociado_4010) {
			types.add(McpMM.diagram.providers.McpMMElementTypes.Propiedad_3014);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((McpMM.diagram.edit.parts.TareaEnvioContextoEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(McpMM.diagram.edit.parts.TareaEnvioContextoEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(4);
		types.add(McpMM.diagram.providers.McpMMElementTypes.AgenteRealiza_4001);
		types.add(McpMM.diagram.providers.McpMMElementTypes.TareaSigue_4004);
		types.add(McpMM.diagram.providers.McpMMElementTypes.TareaAnalisisSigueElse_4007);
		types.add(McpMM.diagram.providers.McpMMElementTypes.TareaRecepcionContextoRecibeDe_4011);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((McpMM.diagram.edit.parts.TareaEnvioContextoEditPart) targetEditPart,
				relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(McpMM.diagram.edit.parts.TareaEnvioContextoEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == McpMM.diagram.providers.McpMMElementTypes.AgenteRealiza_4001) {
			types.add(McpMM.diagram.providers.McpMMElementTypes.Agente_2002);
		} else if (relationshipType == McpMM.diagram.providers.McpMMElementTypes.TareaSigue_4004) {
			types.add(McpMM.diagram.providers.McpMMElementTypes.TareaTransformacionDatos_3002);
			types.add(McpMM.diagram.providers.McpMMElementTypes.TareaLLM_3005);
			types.add(McpMM.diagram.providers.McpMMElementTypes.TareaUsuario_3006);
			types.add(McpMM.diagram.providers.McpMMElementTypes.TareaAnalisis_3007);
			types.add(McpMM.diagram.providers.McpMMElementTypes.TareaEnvioContexto_3008);
			types.add(McpMM.diagram.providers.McpMMElementTypes.TareaRecepcionContexto_3009);
			types.add(McpMM.diagram.providers.McpMMElementTypes.TareaServerMCP_3010);
			types.add(McpMM.diagram.providers.McpMMElementTypes.TareaFinal_3011);
			types.add(McpMM.diagram.providers.McpMMElementTypes.TareaInicial_3012);
		} else if (relationshipType == McpMM.diagram.providers.McpMMElementTypes.TareaAnalisisSigueElse_4007) {
			types.add(McpMM.diagram.providers.McpMMElementTypes.TareaAnalisis_3007);
		} else if (relationshipType == McpMM.diagram.providers.McpMMElementTypes.TareaRecepcionContextoRecibeDe_4011) {
			types.add(McpMM.diagram.providers.McpMMElementTypes.TareaRecepcionContexto_3009);
		}
		return types;
	}

}
