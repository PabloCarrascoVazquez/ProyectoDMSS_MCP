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
	private IParser serverMCPNombreServer_5002Parser;

	/**
	* @generated
	*/
	private IParser getServerMCPNombreServer_5002Parser() {
		if (serverMCPNombreServer_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { McpMM.McpMMPackage.eINSTANCE.getServerMCP_NombreServer() };
			McpMM.diagram.parsers.MessageFormatParser parser = new McpMM.diagram.parsers.MessageFormatParser(features);
			serverMCPNombreServer_5002Parser = parser;
		}
		return serverMCPNombreServer_5002Parser;
	}

	/**
	* @generated
	*/
	private IParser agenteNombreAgente_5003Parser;

	/**
	* @generated
	*/
	private IParser getAgenteNombreAgente_5003Parser() {
		if (agenteNombreAgente_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { McpMM.McpMMPackage.eINSTANCE.getAgente_NombreAgente() };
			McpMM.diagram.parsers.MessageFormatParser parser = new McpMM.diagram.parsers.MessageFormatParser(features);
			agenteNombreAgente_5003Parser = parser;
		}
		return agenteNombreAgente_5003Parser;
	}

	/**
	* @generated
	*/
	private IParser workflowNombreWorkflow_5017Parser;

	/**
	* @generated
	*/
	private IParser getWorkflowNombreWorkflow_5017Parser() {
		if (workflowNombreWorkflow_5017Parser == null) {
			EAttribute[] features = new EAttribute[] { McpMM.McpMMPackage.eINSTANCE.getWorkflow_NombreWorkflow() };
			McpMM.diagram.parsers.MessageFormatParser parser = new McpMM.diagram.parsers.MessageFormatParser(features);
			workflowNombreWorkflow_5017Parser = parser;
		}
		return workflowNombreWorkflow_5017Parser;
	}

	/**
	* @generated
	*/
	private IParser operacionMCPNombreOperacion_5001Parser;

	/**
	* @generated
	*/
	private IParser getOperacionMCPNombreOperacion_5001Parser() {
		if (operacionMCPNombreOperacion_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { McpMM.McpMMPackage.eINSTANCE.getOperacionMCP_NombreOperacion() };
			McpMM.diagram.parsers.MessageFormatParser parser = new McpMM.diagram.parsers.MessageFormatParser(features);
			operacionMCPNombreOperacion_5001Parser = parser;
		}
		return operacionMCPNombreOperacion_5001Parser;
	}

	/**
	* @generated
	*/
	private IParser tareaTransformacionDatosNombreTarea_5006Parser;

	/**
	* @generated
	*/
	private IParser getTareaTransformacionDatosNombreTarea_5006Parser() {
		if (tareaTransformacionDatosNombreTarea_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { McpMM.McpMMPackage.eINSTANCE.getTarea_NombreTarea() };
			McpMM.diagram.parsers.MessageFormatParser parser = new McpMM.diagram.parsers.MessageFormatParser(features);
			tareaTransformacionDatosNombreTarea_5006Parser = parser;
		}
		return tareaTransformacionDatosNombreTarea_5006Parser;
	}

	/**
	* @generated
	*/
	private IParser escrituraNombreAccion_5004Parser;

	/**
	* @generated
	*/
	private IParser getEscrituraNombreAccion_5004Parser() {
		if (escrituraNombreAccion_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { McpMM.McpMMPackage.eINSTANCE.getAccion_NombreAccion() };
			McpMM.diagram.parsers.MessageFormatParser parser = new McpMM.diagram.parsers.MessageFormatParser(features);
			escrituraNombreAccion_5004Parser = parser;
		}
		return escrituraNombreAccion_5004Parser;
	}

	/**
	* @generated
	*/
	private IParser lecturaNombreAccion_5005Parser;

	/**
	* @generated
	*/
	private IParser getLecturaNombreAccion_5005Parser() {
		if (lecturaNombreAccion_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { McpMM.McpMMPackage.eINSTANCE.getAccion_NombreAccion() };
			McpMM.diagram.parsers.MessageFormatParser parser = new McpMM.diagram.parsers.MessageFormatParser(features);
			lecturaNombreAccion_5005Parser = parser;
		}
		return lecturaNombreAccion_5005Parser;
	}

	/**
	* @generated
	*/
	private IParser tareaLLMNombreTarea_5007Parser;

	/**
	* @generated
	*/
	private IParser getTareaLLMNombreTarea_5007Parser() {
		if (tareaLLMNombreTarea_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { McpMM.McpMMPackage.eINSTANCE.getTarea_NombreTarea() };
			McpMM.diagram.parsers.MessageFormatParser parser = new McpMM.diagram.parsers.MessageFormatParser(features);
			tareaLLMNombreTarea_5007Parser = parser;
		}
		return tareaLLMNombreTarea_5007Parser;
	}

	/**
	* @generated
	*/
	private IParser tareaUsuarioNombreTarea_5008Parser;

	/**
	* @generated
	*/
	private IParser getTareaUsuarioNombreTarea_5008Parser() {
		if (tareaUsuarioNombreTarea_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { McpMM.McpMMPackage.eINSTANCE.getTarea_NombreTarea() };
			McpMM.diagram.parsers.MessageFormatParser parser = new McpMM.diagram.parsers.MessageFormatParser(features);
			tareaUsuarioNombreTarea_5008Parser = parser;
		}
		return tareaUsuarioNombreTarea_5008Parser;
	}

	/**
	* @generated
	*/
	private IParser tareaAnalisisNombreTarea_5009Parser;

	/**
	* @generated
	*/
	private IParser getTareaAnalisisNombreTarea_5009Parser() {
		if (tareaAnalisisNombreTarea_5009Parser == null) {
			EAttribute[] features = new EAttribute[] { McpMM.McpMMPackage.eINSTANCE.getTarea_NombreTarea() };
			McpMM.diagram.parsers.MessageFormatParser parser = new McpMM.diagram.parsers.MessageFormatParser(features);
			tareaAnalisisNombreTarea_5009Parser = parser;
		}
		return tareaAnalisisNombreTarea_5009Parser;
	}

	/**
	* @generated
	*/
	private IParser tareaEnvioContextoNombreTarea_5010Parser;

	/**
	* @generated
	*/
	private IParser getTareaEnvioContextoNombreTarea_5010Parser() {
		if (tareaEnvioContextoNombreTarea_5010Parser == null) {
			EAttribute[] features = new EAttribute[] { McpMM.McpMMPackage.eINSTANCE.getTarea_NombreTarea() };
			McpMM.diagram.parsers.MessageFormatParser parser = new McpMM.diagram.parsers.MessageFormatParser(features);
			tareaEnvioContextoNombreTarea_5010Parser = parser;
		}
		return tareaEnvioContextoNombreTarea_5010Parser;
	}

	/**
	* @generated
	*/
	private IParser tareaRecepcionContextoNombreTarea_5011Parser;

	/**
	* @generated
	*/
	private IParser getTareaRecepcionContextoNombreTarea_5011Parser() {
		if (tareaRecepcionContextoNombreTarea_5011Parser == null) {
			EAttribute[] features = new EAttribute[] { McpMM.McpMMPackage.eINSTANCE.getTarea_NombreTarea() };
			McpMM.diagram.parsers.MessageFormatParser parser = new McpMM.diagram.parsers.MessageFormatParser(features);
			tareaRecepcionContextoNombreTarea_5011Parser = parser;
		}
		return tareaRecepcionContextoNombreTarea_5011Parser;
	}

	/**
	* @generated
	*/
	private IParser tareaServerMCPNombreTarea_5012Parser;

	/**
	* @generated
	*/
	private IParser getTareaServerMCPNombreTarea_5012Parser() {
		if (tareaServerMCPNombreTarea_5012Parser == null) {
			EAttribute[] features = new EAttribute[] { McpMM.McpMMPackage.eINSTANCE.getTarea_NombreTarea() };
			McpMM.diagram.parsers.MessageFormatParser parser = new McpMM.diagram.parsers.MessageFormatParser(features);
			tareaServerMCPNombreTarea_5012Parser = parser;
		}
		return tareaServerMCPNombreTarea_5012Parser;
	}

	/**
	* @generated
	*/
	private IParser tareaFinalNombreTarea_5013Parser;

	/**
	* @generated
	*/
	private IParser getTareaFinalNombreTarea_5013Parser() {
		if (tareaFinalNombreTarea_5013Parser == null) {
			EAttribute[] features = new EAttribute[] { McpMM.McpMMPackage.eINSTANCE.getTarea_NombreTarea() };
			McpMM.diagram.parsers.MessageFormatParser parser = new McpMM.diagram.parsers.MessageFormatParser(features);
			tareaFinalNombreTarea_5013Parser = parser;
		}
		return tareaFinalNombreTarea_5013Parser;
	}

	/**
	* @generated
	*/
	private IParser tareaInicialNombreTarea_5014Parser;

	/**
	* @generated
	*/
	private IParser getTareaInicialNombreTarea_5014Parser() {
		if (tareaInicialNombreTarea_5014Parser == null) {
			EAttribute[] features = new EAttribute[] { McpMM.McpMMPackage.eINSTANCE.getTarea_NombreTarea() };
			McpMM.diagram.parsers.MessageFormatParser parser = new McpMM.diagram.parsers.MessageFormatParser(features);
			tareaInicialNombreTarea_5014Parser = parser;
		}
		return tareaInicialNombreTarea_5014Parser;
	}

	/**
	* @generated
	*/
	private IParser contextoNombreContexto_5016Parser;

	/**
	* @generated
	*/
	private IParser getContextoNombreContexto_5016Parser() {
		if (contextoNombreContexto_5016Parser == null) {
			EAttribute[] features = new EAttribute[] { McpMM.McpMMPackage.eINSTANCE.getContexto_NombreContexto() };
			McpMM.diagram.parsers.MessageFormatParser parser = new McpMM.diagram.parsers.MessageFormatParser(features);
			contextoNombreContexto_5016Parser = parser;
		}
		return contextoNombreContexto_5016Parser;
	}

	/**
	* @generated
	*/
	private IParser propiedadNombrePropiedad_5015Parser;

	/**
	* @generated
	*/
	private IParser getPropiedadNombrePropiedad_5015Parser() {
		if (propiedadNombrePropiedad_5015Parser == null) {
			EAttribute[] features = new EAttribute[] { McpMM.McpMMPackage.eINSTANCE.getPropiedad_NombrePropiedad() };
			McpMM.diagram.parsers.MessageFormatParser parser = new McpMM.diagram.parsers.MessageFormatParser(features);
			propiedadNombrePropiedad_5015Parser = parser;
		}
		return propiedadNombrePropiedad_5015Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case McpMM.diagram.edit.parts.ServerMCPNombreServerEditPart.VISUAL_ID:
			return getServerMCPNombreServer_5002Parser();
		case McpMM.diagram.edit.parts.AgenteNombreAgenteEditPart.VISUAL_ID:
			return getAgenteNombreAgente_5003Parser();
		case McpMM.diagram.edit.parts.WorkflowNombreWorkflowEditPart.VISUAL_ID:
			return getWorkflowNombreWorkflow_5017Parser();
		case McpMM.diagram.edit.parts.OperacionMCPNombreOperacionEditPart.VISUAL_ID:
			return getOperacionMCPNombreOperacion_5001Parser();
		case McpMM.diagram.edit.parts.TareaTransformacionDatosNombreTareaEditPart.VISUAL_ID:
			return getTareaTransformacionDatosNombreTarea_5006Parser();
		case McpMM.diagram.edit.parts.EscrituraNombreAccionEditPart.VISUAL_ID:
			return getEscrituraNombreAccion_5004Parser();
		case McpMM.diagram.edit.parts.LecturaNombreAccionEditPart.VISUAL_ID:
			return getLecturaNombreAccion_5005Parser();
		case McpMM.diagram.edit.parts.TareaLLMNombreTareaEditPart.VISUAL_ID:
			return getTareaLLMNombreTarea_5007Parser();
		case McpMM.diagram.edit.parts.TareaUsuarioNombreTareaEditPart.VISUAL_ID:
			return getTareaUsuarioNombreTarea_5008Parser();
		case McpMM.diagram.edit.parts.TareaAnalisisNombreTareaEditPart.VISUAL_ID:
			return getTareaAnalisisNombreTarea_5009Parser();
		case McpMM.diagram.edit.parts.TareaEnvioContextoNombreTareaEditPart.VISUAL_ID:
			return getTareaEnvioContextoNombreTarea_5010Parser();
		case McpMM.diagram.edit.parts.TareaRecepcionContextoNombreTareaEditPart.VISUAL_ID:
			return getTareaRecepcionContextoNombreTarea_5011Parser();
		case McpMM.diagram.edit.parts.TareaServerMCPNombreTareaEditPart.VISUAL_ID:
			return getTareaServerMCPNombreTarea_5012Parser();
		case McpMM.diagram.edit.parts.TareaFinalNombreTareaEditPart.VISUAL_ID:
			return getTareaFinalNombreTarea_5013Parser();
		case McpMM.diagram.edit.parts.TareaInicialNombreTareaEditPart.VISUAL_ID:
			return getTareaInicialNombreTarea_5014Parser();
		case McpMM.diagram.edit.parts.ContextoNombreContextoEditPart.VISUAL_ID:
			return getContextoNombreContexto_5016Parser();
		case McpMM.diagram.edit.parts.PropiedadNombrePropiedadEditPart.VISUAL_ID:
			return getPropiedadNombrePropiedad_5015Parser();
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
