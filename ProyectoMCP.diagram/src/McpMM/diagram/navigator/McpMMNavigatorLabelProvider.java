/*
* 
*/
package McpMM.diagram.navigator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.CommonParserHint;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

/**
 * @generated
 */
public class McpMMNavigatorLabelProvider extends LabelProvider implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	* @generated
	*/
	static {
		McpMM.diagram.part.McpMMDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?UnknownElement", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
		McpMM.diagram.part.McpMMDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?ImageNotFound", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
	}

	/**
	* @generated
	*/
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof McpMM.diagram.navigator.McpMMNavigatorItem
				&& !isOwnView(((McpMM.diagram.navigator.McpMMNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	* @generated
	*/
	public Image getImage(Object element) {
		if (element instanceof McpMM.diagram.navigator.McpMMNavigatorGroup) {
			McpMM.diagram.navigator.McpMMNavigatorGroup group = (McpMM.diagram.navigator.McpMMNavigatorGroup) element;
			return McpMM.diagram.part.McpMMDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof McpMM.diagram.navigator.McpMMNavigatorItem) {
			McpMM.diagram.navigator.McpMMNavigatorItem navigatorItem = (McpMM.diagram.navigator.McpMMNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getImage(view);
			}
		}

		return super.getImage(element);
	}

	/**
	* @generated
	*/
	public Image getImage(View view) {
		switch (McpMM.diagram.part.McpMMVisualIDRegistry.getVisualID(view)) {
		case McpMM.diagram.edit.parts.ServiceMCPEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?https://www.example.org/McpMM?ServiceMCP", //$NON-NLS-1$
					McpMM.diagram.providers.McpMMElementTypes.ServiceMCP_1000);
		case McpMM.diagram.edit.parts.AgenteEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?https://www.example.org/McpMM?Agente", //$NON-NLS-1$
					McpMM.diagram.providers.McpMMElementTypes.Agente_2001);
		case McpMM.diagram.edit.parts.ServerMCPEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?https://www.example.org/McpMM?ServerMCP", //$NON-NLS-1$
					McpMM.diagram.providers.McpMMElementTypes.ServerMCP_2002);
		case McpMM.diagram.edit.parts.WorkflowEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?https://www.example.org/McpMM?Workflow", //$NON-NLS-1$
					McpMM.diagram.providers.McpMMElementTypes.Workflow_2003);
		case McpMM.diagram.edit.parts.ContextoEditPart.VISUAL_ID:
			return getImage("Navigator?Node?https://www.example.org/McpMM?Contexto", //$NON-NLS-1$
					McpMM.diagram.providers.McpMMElementTypes.Contexto_3001);
		case McpMM.diagram.edit.parts.PropiedadEditPart.VISUAL_ID:
			return getImage("Navigator?Node?https://www.example.org/McpMM?Propiedad", //$NON-NLS-1$
					McpMM.diagram.providers.McpMMElementTypes.Propiedad_3002);
		case McpMM.diagram.edit.parts.OperacionMCPEditPart.VISUAL_ID:
			return getImage("Navigator?Node?https://www.example.org/McpMM?OperacionMCP", //$NON-NLS-1$
					McpMM.diagram.providers.McpMMElementTypes.OperacionMCP_3003);
		case McpMM.diagram.edit.parts.TareaTransformacionDatosEditPart.VISUAL_ID:
			return getImage("Navigator?Node?https://www.example.org/McpMM?TareaTransformacionDatos", //$NON-NLS-1$
					McpMM.diagram.providers.McpMMElementTypes.TareaTransformacionDatos_3004);
		case McpMM.diagram.edit.parts.EscrituraEditPart.VISUAL_ID:
			return getImage("Navigator?Node?https://www.example.org/McpMM?Escritura", //$NON-NLS-1$
					McpMM.diagram.providers.McpMMElementTypes.Escritura_3005);
		case McpMM.diagram.edit.parts.LecturaEditPart.VISUAL_ID:
			return getImage("Navigator?Node?https://www.example.org/McpMM?Lectura", //$NON-NLS-1$
					McpMM.diagram.providers.McpMMElementTypes.Lectura_3006);
		case McpMM.diagram.edit.parts.TareaLLMEditPart.VISUAL_ID:
			return getImage("Navigator?Node?https://www.example.org/McpMM?TareaLLM", //$NON-NLS-1$
					McpMM.diagram.providers.McpMMElementTypes.TareaLLM_3007);
		case McpMM.diagram.edit.parts.TareaUsuarioEditPart.VISUAL_ID:
			return getImage("Navigator?Node?https://www.example.org/McpMM?TareaUsuario", //$NON-NLS-1$
					McpMM.diagram.providers.McpMMElementTypes.TareaUsuario_3008);
		case McpMM.diagram.edit.parts.TareaAnalisisEditPart.VISUAL_ID:
			return getImage("Navigator?Node?https://www.example.org/McpMM?TareaAnalisis", //$NON-NLS-1$
					McpMM.diagram.providers.McpMMElementTypes.TareaAnalisis_3009);
		case McpMM.diagram.edit.parts.TareaEnvioContextoEditPart.VISUAL_ID:
			return getImage("Navigator?Node?https://www.example.org/McpMM?TareaEnvioContexto", //$NON-NLS-1$
					McpMM.diagram.providers.McpMMElementTypes.TareaEnvioContexto_3010);
		case McpMM.diagram.edit.parts.TareaRecepcionContextoEditPart.VISUAL_ID:
			return getImage("Navigator?Node?https://www.example.org/McpMM?TareaRecepcionContexto", //$NON-NLS-1$
					McpMM.diagram.providers.McpMMElementTypes.TareaRecepcionContexto_3011);
		case McpMM.diagram.edit.parts.TareaServerMCPEditPart.VISUAL_ID:
			return getImage("Navigator?Node?https://www.example.org/McpMM?TareaServerMCP", //$NON-NLS-1$
					McpMM.diagram.providers.McpMMElementTypes.TareaServerMCP_3012);
		case McpMM.diagram.edit.parts.InicioEditPart.VISUAL_ID:
			return getImage("Navigator?Node?https://www.example.org/McpMM?Inicio", //$NON-NLS-1$
					McpMM.diagram.providers.McpMMElementTypes.Inicio_3013);
		case McpMM.diagram.edit.parts.FinalEditPart.VISUAL_ID:
			return getImage("Navigator?Node?https://www.example.org/McpMM?Final", //$NON-NLS-1$
					McpMM.diagram.providers.McpMMElementTypes.Final_3014);
		case McpMM.diagram.edit.parts.AgenteTareasEditPart.VISUAL_ID:
			return getImage("Navigator?Link?https://www.example.org/McpMM?Agente?tareas", //$NON-NLS-1$
					McpMM.diagram.providers.McpMMElementTypes.AgenteTareas_4001);
		case McpMM.diagram.edit.parts.TareaSigueEditPart.VISUAL_ID:
			return getImage("Navigator?Link?https://www.example.org/McpMM?Tarea?sigue", //$NON-NLS-1$
					McpMM.diagram.providers.McpMMElementTypes.TareaSigue_4002);
		case McpMM.diagram.edit.parts.TareaAnalisisSigueElseEditPart.VISUAL_ID:
			return getImage("Navigator?Link?https://www.example.org/McpMM?TareaAnalisis?sigueElse", //$NON-NLS-1$
					McpMM.diagram.providers.McpMMElementTypes.TareaAnalisisSigueElse_4003);
		case McpMM.diagram.edit.parts.TareaServerMCPEjecutaOperacionEditPart.VISUAL_ID:
			return getImage("Navigator?Link?https://www.example.org/McpMM?TareaServerMCP?ejecutaOperacion", //$NON-NLS-1$
					McpMM.diagram.providers.McpMMElementTypes.TareaServerMCPEjecutaOperacion_4004);
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = McpMM.diagram.part.McpMMDiagramEditorPlugin.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& McpMM.diagram.providers.McpMMElementTypes.isKnownElementType(elementType)) {
			image = McpMM.diagram.providers.McpMMElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	* @generated
	*/
	public String getText(Object element) {
		if (element instanceof McpMM.diagram.navigator.McpMMNavigatorGroup) {
			McpMM.diagram.navigator.McpMMNavigatorGroup group = (McpMM.diagram.navigator.McpMMNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof McpMM.diagram.navigator.McpMMNavigatorItem) {
			McpMM.diagram.navigator.McpMMNavigatorItem navigatorItem = (McpMM.diagram.navigator.McpMMNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getText(view);
			}
		}

		return super.getText(element);
	}

	/**
	* @generated
	*/
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (McpMM.diagram.part.McpMMVisualIDRegistry.getVisualID(view)) {
		case McpMM.diagram.edit.parts.ServiceMCPEditPart.VISUAL_ID:
			return getServiceMCP_1000Text(view);
		case McpMM.diagram.edit.parts.AgenteEditPart.VISUAL_ID:
			return getAgente_2001Text(view);
		case McpMM.diagram.edit.parts.ServerMCPEditPart.VISUAL_ID:
			return getServerMCP_2002Text(view);
		case McpMM.diagram.edit.parts.WorkflowEditPart.VISUAL_ID:
			return getWorkflow_2003Text(view);
		case McpMM.diagram.edit.parts.ContextoEditPart.VISUAL_ID:
			return getContexto_3001Text(view);
		case McpMM.diagram.edit.parts.PropiedadEditPart.VISUAL_ID:
			return getPropiedad_3002Text(view);
		case McpMM.diagram.edit.parts.OperacionMCPEditPart.VISUAL_ID:
			return getOperacionMCP_3003Text(view);
		case McpMM.diagram.edit.parts.TareaTransformacionDatosEditPart.VISUAL_ID:
			return getTareaTransformacionDatos_3004Text(view);
		case McpMM.diagram.edit.parts.EscrituraEditPart.VISUAL_ID:
			return getEscritura_3005Text(view);
		case McpMM.diagram.edit.parts.LecturaEditPart.VISUAL_ID:
			return getLectura_3006Text(view);
		case McpMM.diagram.edit.parts.TareaLLMEditPart.VISUAL_ID:
			return getTareaLLM_3007Text(view);
		case McpMM.diagram.edit.parts.TareaUsuarioEditPart.VISUAL_ID:
			return getTareaUsuario_3008Text(view);
		case McpMM.diagram.edit.parts.TareaAnalisisEditPart.VISUAL_ID:
			return getTareaAnalisis_3009Text(view);
		case McpMM.diagram.edit.parts.TareaEnvioContextoEditPart.VISUAL_ID:
			return getTareaEnvioContexto_3010Text(view);
		case McpMM.diagram.edit.parts.TareaRecepcionContextoEditPart.VISUAL_ID:
			return getTareaRecepcionContexto_3011Text(view);
		case McpMM.diagram.edit.parts.TareaServerMCPEditPart.VISUAL_ID:
			return getTareaServerMCP_3012Text(view);
		case McpMM.diagram.edit.parts.InicioEditPart.VISUAL_ID:
			return getInicio_3013Text(view);
		case McpMM.diagram.edit.parts.FinalEditPart.VISUAL_ID:
			return getFinal_3014Text(view);
		case McpMM.diagram.edit.parts.AgenteTareasEditPart.VISUAL_ID:
			return getAgenteTareas_4001Text(view);
		case McpMM.diagram.edit.parts.TareaSigueEditPart.VISUAL_ID:
			return getTareaSigue_4002Text(view);
		case McpMM.diagram.edit.parts.TareaAnalisisSigueElseEditPart.VISUAL_ID:
			return getTareaAnalisisSigueElse_4003Text(view);
		case McpMM.diagram.edit.parts.TareaServerMCPEjecutaOperacionEditPart.VISUAL_ID:
			return getTareaServerMCPEjecutaOperacion_4004Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	* @generated
	*/
	private String getServiceMCP_1000Text(View view) {
		McpMM.ServiceMCP domainModelElement = (McpMM.ServiceMCP) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getNombreServicio();
		} else {
			McpMM.diagram.part.McpMMDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAgente_2001Text(View view) {
		IParser parser = McpMM.diagram.providers.McpMMParserProvider.getParser(
				McpMM.diagram.providers.McpMMElementTypes.Agente_2001,
				view.getElement() != null ? view.getElement() : view, McpMM.diagram.part.McpMMVisualIDRegistry
						.getType(McpMM.diagram.edit.parts.AgenteNombreEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			McpMM.diagram.part.McpMMDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getServerMCP_2002Text(View view) {
		IParser parser = McpMM.diagram.providers.McpMMParserProvider.getParser(
				McpMM.diagram.providers.McpMMElementTypes.ServerMCP_2002,
				view.getElement() != null ? view.getElement() : view, McpMM.diagram.part.McpMMVisualIDRegistry
						.getType(McpMM.diagram.edit.parts.ServerMCPNombreServerEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			McpMM.diagram.part.McpMMDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getWorkflow_2003Text(View view) {
		IParser parser = McpMM.diagram.providers.McpMMParserProvider.getParser(
				McpMM.diagram.providers.McpMMElementTypes.Workflow_2003,
				view.getElement() != null ? view.getElement() : view, McpMM.diagram.part.McpMMVisualIDRegistry
						.getType(McpMM.diagram.edit.parts.WorkflowNombreWorkflowEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			McpMM.diagram.part.McpMMDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5017); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getContexto_3001Text(View view) {
		IParser parser = McpMM.diagram.providers.McpMMParserProvider.getParser(
				McpMM.diagram.providers.McpMMElementTypes.Contexto_3001,
				view.getElement() != null ? view.getElement() : view, McpMM.diagram.part.McpMMVisualIDRegistry
						.getType(McpMM.diagram.edit.parts.ContextoNombreContextoEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			McpMM.diagram.part.McpMMDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPropiedad_3002Text(View view) {
		IParser parser = McpMM.diagram.providers.McpMMParserProvider.getParser(
				McpMM.diagram.providers.McpMMElementTypes.Propiedad_3002,
				view.getElement() != null ? view.getElement() : view, McpMM.diagram.part.McpMMVisualIDRegistry
						.getType(McpMM.diagram.edit.parts.PropiedadNombrePropiedadEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			McpMM.diagram.part.McpMMDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getOperacionMCP_3003Text(View view) {
		IParser parser = McpMM.diagram.providers.McpMMParserProvider.getParser(
				McpMM.diagram.providers.McpMMElementTypes.OperacionMCP_3003,
				view.getElement() != null ? view.getElement() : view, McpMM.diagram.part.McpMMVisualIDRegistry
						.getType(McpMM.diagram.edit.parts.OperacionMCPNombreOperacionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			McpMM.diagram.part.McpMMDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTareaTransformacionDatos_3004Text(View view) {
		IParser parser = McpMM.diagram.providers.McpMMParserProvider.getParser(
				McpMM.diagram.providers.McpMMElementTypes.TareaTransformacionDatos_3004,
				view.getElement() != null ? view.getElement() : view, McpMM.diagram.part.McpMMVisualIDRegistry
						.getType(McpMM.diagram.edit.parts.TareaTransformacionDatosNombreTareaEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			McpMM.diagram.part.McpMMDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getEscritura_3005Text(View view) {
		IParser parser = McpMM.diagram.providers.McpMMParserProvider.getParser(
				McpMM.diagram.providers.McpMMElementTypes.Escritura_3005,
				view.getElement() != null ? view.getElement() : view, McpMM.diagram.part.McpMMVisualIDRegistry
						.getType(McpMM.diagram.edit.parts.EscrituraNombreAccionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			McpMM.diagram.part.McpMMDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getLectura_3006Text(View view) {
		IParser parser = McpMM.diagram.providers.McpMMParserProvider.getParser(
				McpMM.diagram.providers.McpMMElementTypes.Lectura_3006,
				view.getElement() != null ? view.getElement() : view, McpMM.diagram.part.McpMMVisualIDRegistry
						.getType(McpMM.diagram.edit.parts.LecturaNombreAccionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			McpMM.diagram.part.McpMMDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTareaLLM_3007Text(View view) {
		IParser parser = McpMM.diagram.providers.McpMMParserProvider.getParser(
				McpMM.diagram.providers.McpMMElementTypes.TareaLLM_3007,
				view.getElement() != null ? view.getElement() : view, McpMM.diagram.part.McpMMVisualIDRegistry
						.getType(McpMM.diagram.edit.parts.TareaLLMNombreTareaEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			McpMM.diagram.part.McpMMDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTareaUsuario_3008Text(View view) {
		IParser parser = McpMM.diagram.providers.McpMMParserProvider.getParser(
				McpMM.diagram.providers.McpMMElementTypes.TareaUsuario_3008,
				view.getElement() != null ? view.getElement() : view, McpMM.diagram.part.McpMMVisualIDRegistry
						.getType(McpMM.diagram.edit.parts.TareaUsuarioNombreTareaEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			McpMM.diagram.part.McpMMDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTareaAnalisis_3009Text(View view) {
		IParser parser = McpMM.diagram.providers.McpMMParserProvider.getParser(
				McpMM.diagram.providers.McpMMElementTypes.TareaAnalisis_3009,
				view.getElement() != null ? view.getElement() : view, McpMM.diagram.part.McpMMVisualIDRegistry
						.getType(McpMM.diagram.edit.parts.TareaAnalisisNombreTareaEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			McpMM.diagram.part.McpMMDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTareaEnvioContexto_3010Text(View view) {
		IParser parser = McpMM.diagram.providers.McpMMParserProvider.getParser(
				McpMM.diagram.providers.McpMMElementTypes.TareaEnvioContexto_3010,
				view.getElement() != null ? view.getElement() : view, McpMM.diagram.part.McpMMVisualIDRegistry
						.getType(McpMM.diagram.edit.parts.TareaEnvioContextoNombreTareaEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			McpMM.diagram.part.McpMMDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5012); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTareaRecepcionContexto_3011Text(View view) {
		IParser parser = McpMM.diagram.providers.McpMMParserProvider.getParser(
				McpMM.diagram.providers.McpMMElementTypes.TareaRecepcionContexto_3011,
				view.getElement() != null ? view.getElement() : view, McpMM.diagram.part.McpMMVisualIDRegistry
						.getType(McpMM.diagram.edit.parts.TareaRecepcionContextoNombreTareaEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			McpMM.diagram.part.McpMMDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5013); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTareaServerMCP_3012Text(View view) {
		IParser parser = McpMM.diagram.providers.McpMMParserProvider.getParser(
				McpMM.diagram.providers.McpMMElementTypes.TareaServerMCP_3012,
				view.getElement() != null ? view.getElement() : view, McpMM.diagram.part.McpMMVisualIDRegistry
						.getType(McpMM.diagram.edit.parts.TareaServerMCPNombreTareaEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			McpMM.diagram.part.McpMMDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5014); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getInicio_3013Text(View view) {
		IParser parser = McpMM.diagram.providers.McpMMParserProvider.getParser(
				McpMM.diagram.providers.McpMMElementTypes.Inicio_3013,
				view.getElement() != null ? view.getElement() : view, McpMM.diagram.part.McpMMVisualIDRegistry
						.getType(McpMM.diagram.edit.parts.InicioNombreTareaEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			McpMM.diagram.part.McpMMDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5015); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getFinal_3014Text(View view) {
		IParser parser = McpMM.diagram.providers.McpMMParserProvider.getParser(
				McpMM.diagram.providers.McpMMElementTypes.Final_3014,
				view.getElement() != null ? view.getElement() : view, McpMM.diagram.part.McpMMVisualIDRegistry
						.getType(McpMM.diagram.edit.parts.FinalNombreTareaEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			McpMM.diagram.part.McpMMDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5016); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAgenteTareas_4001Text(View view) {
		IParser parser = McpMM.diagram.providers.McpMMParserProvider.getParser(
				McpMM.diagram.providers.McpMMElementTypes.AgenteTareas_4001,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			McpMM.diagram.part.McpMMDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTareaSigue_4002Text(View view) {
		IParser parser = McpMM.diagram.providers.McpMMParserProvider.getParser(
				McpMM.diagram.providers.McpMMElementTypes.TareaSigue_4002,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			McpMM.diagram.part.McpMMDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 6002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTareaAnalisisSigueElse_4003Text(View view) {
		IParser parser = McpMM.diagram.providers.McpMMParserProvider.getParser(
				McpMM.diagram.providers.McpMMElementTypes.TareaAnalisisSigueElse_4003,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			McpMM.diagram.part.McpMMDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 6003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTareaServerMCPEjecutaOperacion_4004Text(View view) {
		IParser parser = McpMM.diagram.providers.McpMMParserProvider.getParser(
				McpMM.diagram.providers.McpMMElementTypes.TareaServerMCPEjecutaOperacion_4004,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			McpMM.diagram.part.McpMMDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 6004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	* @generated
	*/
	public void restoreState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public void saveState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	* @generated
	*/
	private boolean isOwnView(View view) {
		return McpMM.diagram.edit.parts.ServiceMCPEditPart.MODEL_ID
				.equals(McpMM.diagram.part.McpMMVisualIDRegistry.getModelID(view));
	}

}
