/*
 * 
 */
package McpMM.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class McpMMParserProvider extends AbstractProvider implements IParserProvider {

	/**
	* @generated
	*/
	private IParser agenteNombre_5015Parser;

	/**
	* @generated
	*/
	private IParser getAgenteNombre_5015Parser() {
		if (agenteNombre_5015Parser == null) {
			EAttribute[] features = new EAttribute[] { McpMM.McpMMPackage.eINSTANCE.getAgente_Nombre() };
			McpMM.diagram.parsers.MessageFormatParser parser = new McpMM.diagram.parsers.MessageFormatParser(features);
			agenteNombre_5015Parser = parser;
		}
		return agenteNombre_5015Parser;
	}

	/**
	* @generated
	*/
	private IParser serverMCPNombreServer_5017Parser;

	/**
	* @generated
	*/
	private IParser getServerMCPNombreServer_5017Parser() {
		if (serverMCPNombreServer_5017Parser == null) {
			EAttribute[] features = new EAttribute[] { McpMM.McpMMPackage.eINSTANCE.getServerMCP_NombreServer() };
			McpMM.diagram.parsers.MessageFormatParser parser = new McpMM.diagram.parsers.MessageFormatParser(features);
			serverMCPNombreServer_5017Parser = parser;
		}
		return serverMCPNombreServer_5017Parser;
	}

	/**
	* @generated
	*/
	private IParser workflowNombreWorkflow_5012Parser;

	/**
	* @generated
	*/
	private IParser getWorkflowNombreWorkflow_5012Parser() {
		if (workflowNombreWorkflow_5012Parser == null) {
			EAttribute[] features = new EAttribute[] { McpMM.McpMMPackage.eINSTANCE.getWorkflow_NombreWorkflow() };
			McpMM.diagram.parsers.MessageFormatParser parser = new McpMM.diagram.parsers.MessageFormatParser(features);
			workflowNombreWorkflow_5012Parser = parser;
		}
		return workflowNombreWorkflow_5012Parser;
	}

	/**
	* @generated
	*/
	private IParser tareaTransformacionDatosNombreTarea_5003Parser;

	/**
	* @generated
	*/
	private IParser getTareaTransformacionDatosNombreTarea_5003Parser() {
		if (tareaTransformacionDatosNombreTarea_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { McpMM.McpMMPackage.eINSTANCE.getTarea_NombreTarea() };
			McpMM.diagram.parsers.MessageFormatParser parser = new McpMM.diagram.parsers.MessageFormatParser(features);
			tareaTransformacionDatosNombreTarea_5003Parser = parser;
		}
		return tareaTransformacionDatosNombreTarea_5003Parser;
	}

	/**
	* @generated
	*/
	private IParser escrituraNombreAccion_5001Parser;

	/**
	* @generated
	*/
	private IParser getEscrituraNombreAccion_5001Parser() {
		if (escrituraNombreAccion_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { McpMM.McpMMPackage.eINSTANCE.getAccion_NombreAccion() };
			McpMM.diagram.parsers.MessageFormatParser parser = new McpMM.diagram.parsers.MessageFormatParser(features);
			escrituraNombreAccion_5001Parser = parser;
		}
		return escrituraNombreAccion_5001Parser;
	}

	/**
	* @generated
	*/
	private IParser lecturaNombreAccion_5002Parser;

	/**
	* @generated
	*/
	private IParser getLecturaNombreAccion_5002Parser() {
		if (lecturaNombreAccion_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { McpMM.McpMMPackage.eINSTANCE.getAccion_NombreAccion() };
			McpMM.diagram.parsers.MessageFormatParser parser = new McpMM.diagram.parsers.MessageFormatParser(features);
			lecturaNombreAccion_5002Parser = parser;
		}
		return lecturaNombreAccion_5002Parser;
	}

	/**
	* @generated
	*/
	private IParser tareaLLMNombreTarea_5004Parser;

	/**
	* @generated
	*/
	private IParser getTareaLLMNombreTarea_5004Parser() {
		if (tareaLLMNombreTarea_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { McpMM.McpMMPackage.eINSTANCE.getTarea_NombreTarea() };
			McpMM.diagram.parsers.MessageFormatParser parser = new McpMM.diagram.parsers.MessageFormatParser(features);
			tareaLLMNombreTarea_5004Parser = parser;
		}
		return tareaLLMNombreTarea_5004Parser;
	}

	/**
	* @generated
	*/
	private IParser tareaUsuarioNombreTarea_5005Parser;

	/**
	* @generated
	*/
	private IParser getTareaUsuarioNombreTarea_5005Parser() {
		if (tareaUsuarioNombreTarea_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { McpMM.McpMMPackage.eINSTANCE.getTarea_NombreTarea() };
			McpMM.diagram.parsers.MessageFormatParser parser = new McpMM.diagram.parsers.MessageFormatParser(features);
			tareaUsuarioNombreTarea_5005Parser = parser;
		}
		return tareaUsuarioNombreTarea_5005Parser;
	}

	/**
	* @generated
	*/
	private IParser tareaAnalisisNombreTarea_5006Parser;

	/**
	* @generated
	*/
	private IParser getTareaAnalisisNombreTarea_5006Parser() {
		if (tareaAnalisisNombreTarea_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { McpMM.McpMMPackage.eINSTANCE.getTarea_NombreTarea() };
			McpMM.diagram.parsers.MessageFormatParser parser = new McpMM.diagram.parsers.MessageFormatParser(features);
			tareaAnalisisNombreTarea_5006Parser = parser;
		}
		return tareaAnalisisNombreTarea_5006Parser;
	}

	/**
	* @generated
	*/
	private IParser tareaEnvioContextoNombreTarea_5007Parser;

	/**
	* @generated
	*/
	private IParser getTareaEnvioContextoNombreTarea_5007Parser() {
		if (tareaEnvioContextoNombreTarea_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { McpMM.McpMMPackage.eINSTANCE.getTarea_NombreTarea() };
			McpMM.diagram.parsers.MessageFormatParser parser = new McpMM.diagram.parsers.MessageFormatParser(features);
			tareaEnvioContextoNombreTarea_5007Parser = parser;
		}
		return tareaEnvioContextoNombreTarea_5007Parser;
	}

	/**
	* @generated
	*/
	private IParser tareaRecepcionContextoNombreTarea_5008Parser;

	/**
	* @generated
	*/
	private IParser getTareaRecepcionContextoNombreTarea_5008Parser() {
		if (tareaRecepcionContextoNombreTarea_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { McpMM.McpMMPackage.eINSTANCE.getTarea_NombreTarea() };
			McpMM.diagram.parsers.MessageFormatParser parser = new McpMM.diagram.parsers.MessageFormatParser(features);
			tareaRecepcionContextoNombreTarea_5008Parser = parser;
		}
		return tareaRecepcionContextoNombreTarea_5008Parser;
	}

	/**
	* @generated
	*/
	private IParser tareaServerMCPNombreTarea_5009Parser;

	/**
	* @generated
	*/
	private IParser getTareaServerMCPNombreTarea_5009Parser() {
		if (tareaServerMCPNombreTarea_5009Parser == null) {
			EAttribute[] features = new EAttribute[] { McpMM.McpMMPackage.eINSTANCE.getTarea_NombreTarea() };
			McpMM.diagram.parsers.MessageFormatParser parser = new McpMM.diagram.parsers.MessageFormatParser(features);
			tareaServerMCPNombreTarea_5009Parser = parser;
		}
		return tareaServerMCPNombreTarea_5009Parser;
	}

	/**
	* @generated
	*/
	private IParser inicioNombreTarea_5010Parser;

	/**
	* @generated
	*/
	private IParser getInicioNombreTarea_5010Parser() {
		if (inicioNombreTarea_5010Parser == null) {
			EAttribute[] features = new EAttribute[] { McpMM.McpMMPackage.eINSTANCE.getTarea_NombreTarea() };
			McpMM.diagram.parsers.MessageFormatParser parser = new McpMM.diagram.parsers.MessageFormatParser(features);
			inicioNombreTarea_5010Parser = parser;
		}
		return inicioNombreTarea_5010Parser;
	}

	/**
	* @generated
	*/
	private IParser finalNombreTarea_5011Parser;

	/**
	* @generated
	*/
	private IParser getFinalNombreTarea_5011Parser() {
		if (finalNombreTarea_5011Parser == null) {
			EAttribute[] features = new EAttribute[] { McpMM.McpMMPackage.eINSTANCE.getTarea_NombreTarea() };
			McpMM.diagram.parsers.MessageFormatParser parser = new McpMM.diagram.parsers.MessageFormatParser(features);
			finalNombreTarea_5011Parser = parser;
		}
		return finalNombreTarea_5011Parser;
	}

	/**
	* @generated
	*/
	private IParser contextoNombreContexto_5014Parser;

	/**
	* @generated
	*/
	private IParser getContextoNombreContexto_5014Parser() {
		if (contextoNombreContexto_5014Parser == null) {
			EAttribute[] features = new EAttribute[] { McpMM.McpMMPackage.eINSTANCE.getContexto_NombreContexto() };
			McpMM.diagram.parsers.MessageFormatParser parser = new McpMM.diagram.parsers.MessageFormatParser(features);
			contextoNombreContexto_5014Parser = parser;
		}
		return contextoNombreContexto_5014Parser;
	}

	/**
	* @generated
	*/
	private IParser propiedadNombrePropiedad_5013Parser;

	/**
	* @generated
	*/
	private IParser getPropiedadNombrePropiedad_5013Parser() {
		if (propiedadNombrePropiedad_5013Parser == null) {
			EAttribute[] features = new EAttribute[] { McpMM.McpMMPackage.eINSTANCE.getPropiedad_NombrePropiedad() };
			McpMM.diagram.parsers.MessageFormatParser parser = new McpMM.diagram.parsers.MessageFormatParser(features);
			propiedadNombrePropiedad_5013Parser = parser;
		}
		return propiedadNombrePropiedad_5013Parser;
	}

	/**
	* @generated
	*/
	private IParser operacionMCPNombreOperacion_5016Parser;

	/**
	* @generated
	*/
	private IParser getOperacionMCPNombreOperacion_5016Parser() {
		if (operacionMCPNombreOperacion_5016Parser == null) {
			EAttribute[] features = new EAttribute[] { McpMM.McpMMPackage.eINSTANCE.getOperacionMCP_NombreOperacion() };
			McpMM.diagram.parsers.MessageFormatParser parser = new McpMM.diagram.parsers.MessageFormatParser(features);
			operacionMCPNombreOperacion_5016Parser = parser;
		}
		return operacionMCPNombreOperacion_5016Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case McpMM.diagram.edit.parts.AgenteNombreEditPart.VISUAL_ID:
			return getAgenteNombre_5015Parser();
		case McpMM.diagram.edit.parts.ServerMCPNombreServerEditPart.VISUAL_ID:
			return getServerMCPNombreServer_5017Parser();
		case McpMM.diagram.edit.parts.WorkflowNombreWorkflowEditPart.VISUAL_ID:
			return getWorkflowNombreWorkflow_5012Parser();
		case McpMM.diagram.edit.parts.TareaTransformacionDatosNombreTareaEditPart.VISUAL_ID:
			return getTareaTransformacionDatosNombreTarea_5003Parser();
		case McpMM.diagram.edit.parts.EscrituraNombreAccionEditPart.VISUAL_ID:
			return getEscrituraNombreAccion_5001Parser();
		case McpMM.diagram.edit.parts.LecturaNombreAccionEditPart.VISUAL_ID:
			return getLecturaNombreAccion_5002Parser();
		case McpMM.diagram.edit.parts.TareaLLMNombreTareaEditPart.VISUAL_ID:
			return getTareaLLMNombreTarea_5004Parser();
		case McpMM.diagram.edit.parts.TareaUsuarioNombreTareaEditPart.VISUAL_ID:
			return getTareaUsuarioNombreTarea_5005Parser();
		case McpMM.diagram.edit.parts.TareaAnalisisNombreTareaEditPart.VISUAL_ID:
			return getTareaAnalisisNombreTarea_5006Parser();
		case McpMM.diagram.edit.parts.TareaEnvioContextoNombreTareaEditPart.VISUAL_ID:
			return getTareaEnvioContextoNombreTarea_5007Parser();
		case McpMM.diagram.edit.parts.TareaRecepcionContextoNombreTareaEditPart.VISUAL_ID:
			return getTareaRecepcionContextoNombreTarea_5008Parser();
		case McpMM.diagram.edit.parts.TareaServerMCPNombreTareaEditPart.VISUAL_ID:
			return getTareaServerMCPNombreTarea_5009Parser();
		case McpMM.diagram.edit.parts.InicioNombreTareaEditPart.VISUAL_ID:
			return getInicioNombreTarea_5010Parser();
		case McpMM.diagram.edit.parts.FinalNombreTareaEditPart.VISUAL_ID:
			return getFinalNombreTarea_5011Parser();
		case McpMM.diagram.edit.parts.ContextoNombreContextoEditPart.VISUAL_ID:
			return getContextoNombreContexto_5014Parser();
		case McpMM.diagram.edit.parts.PropiedadNombrePropiedadEditPart.VISUAL_ID:
			return getPropiedadNombrePropiedad_5013Parser();
		case McpMM.diagram.edit.parts.OperacionMCPNombreOperacionEditPart.VISUAL_ID:
			return getOperacionMCPNombreOperacion_5016Parser();
		}
		return null;
	}

	/**
	* Utility method that consults ParserService
	* @generated
	*/
	public static IParser getParser(IElementType type, EObject object, String parserHint) {
		return ParserService.getInstance().getParser(new HintAdapter(type, object, parserHint));
	}

	/**
	* @generated
	*/
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(McpMM.diagram.part.McpMMVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(McpMM.diagram.part.McpMMVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (McpMM.diagram.providers.McpMMElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	* @generated
	*/
	private static class HintAdapter extends ParserHintAdapter {

		/**
		* @generated
		*/
		private final IElementType elementType;

		/**
		* @generated
		*/
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		* @generated
		*/
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
