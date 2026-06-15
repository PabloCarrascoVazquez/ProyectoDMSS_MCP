/*
 * 
 */
package McpMM.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

/**
 * @generated
 */
public class McpMMElementTypes {

	/**
	* @generated
	*/
	private McpMMElementTypes() {
	}

	/**
	* @generated
	*/
	private static Map<IElementType, ENamedElement> elements;

	/**
	* @generated
	*/
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			McpMM.diagram.part.McpMMDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());

	/**
	* @generated
	*/
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	* @generated
	*/
	public static final IElementType ServiceMCP_1000 = getElementType("ProyectoMCP.diagram.ServiceMCP_1000"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Agente_2001 = getElementType("ProyectoMCP.diagram.Agente_2001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ServerMCP_2002 = getElementType("ProyectoMCP.diagram.ServerMCP_2002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Workflow_2003 = getElementType("ProyectoMCP.diagram.Workflow_2003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Contexto_3001 = getElementType("ProyectoMCP.diagram.Contexto_3001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Propiedad_3002 = getElementType("ProyectoMCP.diagram.Propiedad_3002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType OperacionMCP_3003 = getElementType("ProyectoMCP.diagram.OperacionMCP_3003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType TareaTransformacionDatos_3004 = getElementType(
			"ProyectoMCP.diagram.TareaTransformacionDatos_3004"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Escritura_3005 = getElementType("ProyectoMCP.diagram.Escritura_3005"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Lectura_3006 = getElementType("ProyectoMCP.diagram.Lectura_3006"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType TareaLLM_3007 = getElementType("ProyectoMCP.diagram.TareaLLM_3007"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType TareaUsuario_3008 = getElementType("ProyectoMCP.diagram.TareaUsuario_3008"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType TareaAnalisis_3009 = getElementType("ProyectoMCP.diagram.TareaAnalisis_3009"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType TareaEnvioContexto_3010 = getElementType(
			"ProyectoMCP.diagram.TareaEnvioContexto_3010"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType TareaRecepcionContexto_3011 = getElementType(
			"ProyectoMCP.diagram.TareaRecepcionContexto_3011"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType TareaServerMCP_3012 = getElementType("ProyectoMCP.diagram.TareaServerMCP_3012"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Inicio_3013 = getElementType("ProyectoMCP.diagram.Inicio_3013"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Final_3014 = getElementType("ProyectoMCP.diagram.Final_3014"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AgenteTareas_4001 = getElementType("ProyectoMCP.diagram.AgenteTareas_4001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType TareaSigue_4002 = getElementType("ProyectoMCP.diagram.TareaSigue_4002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType TareaAnalisisSigueElse_4003 = getElementType(
			"ProyectoMCP.diagram.TareaAnalisisSigueElse_4003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType TareaServerMCPEjecutaOperacion_4004 = getElementType(
			"ProyectoMCP.diagram.TareaServerMCPEjecutaOperacion_4004"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	* @generated
	*/
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	* @generated
	*/
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	* Returns 'type' of the ecore object associated with the hint.
	* 
	* @generated
	*/
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(ServiceMCP_1000, McpMM.McpMMPackage.eINSTANCE.getServiceMCP());

			elements.put(Agente_2001, McpMM.McpMMPackage.eINSTANCE.getAgente());

			elements.put(ServerMCP_2002, McpMM.McpMMPackage.eINSTANCE.getServerMCP());

			elements.put(Workflow_2003, McpMM.McpMMPackage.eINSTANCE.getWorkflow());

			elements.put(Contexto_3001, McpMM.McpMMPackage.eINSTANCE.getContexto());

			elements.put(Propiedad_3002, McpMM.McpMMPackage.eINSTANCE.getPropiedad());

			elements.put(OperacionMCP_3003, McpMM.McpMMPackage.eINSTANCE.getOperacionMCP());

			elements.put(TareaTransformacionDatos_3004, McpMM.McpMMPackage.eINSTANCE.getTareaTransformacionDatos());

			elements.put(Escritura_3005, McpMM.McpMMPackage.eINSTANCE.getEscritura());

			elements.put(Lectura_3006, McpMM.McpMMPackage.eINSTANCE.getLectura());

			elements.put(TareaLLM_3007, McpMM.McpMMPackage.eINSTANCE.getTareaLLM());

			elements.put(TareaUsuario_3008, McpMM.McpMMPackage.eINSTANCE.getTareaUsuario());

			elements.put(TareaAnalisis_3009, McpMM.McpMMPackage.eINSTANCE.getTareaAnalisis());

			elements.put(TareaEnvioContexto_3010, McpMM.McpMMPackage.eINSTANCE.getTareaEnvioContexto());

			elements.put(TareaRecepcionContexto_3011, McpMM.McpMMPackage.eINSTANCE.getTareaRecepcionContexto());

			elements.put(TareaServerMCP_3012, McpMM.McpMMPackage.eINSTANCE.getTareaServerMCP());

			elements.put(Inicio_3013, McpMM.McpMMPackage.eINSTANCE.getInicio());

			elements.put(Final_3014, McpMM.McpMMPackage.eINSTANCE.getFinal());

			elements.put(AgenteTareas_4001, McpMM.McpMMPackage.eINSTANCE.getAgente_Tareas());

			elements.put(TareaSigue_4002, McpMM.McpMMPackage.eINSTANCE.getTarea_Sigue());

			elements.put(TareaAnalisisSigueElse_4003, McpMM.McpMMPackage.eINSTANCE.getTareaAnalisis_SigueElse());

			elements.put(TareaServerMCPEjecutaOperacion_4004,
					McpMM.McpMMPackage.eINSTANCE.getTareaServerMCP_EjecutaOperacion());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	* @generated
	*/
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	* @generated
	*/
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(ServiceMCP_1000);
			KNOWN_ELEMENT_TYPES.add(Agente_2001);
			KNOWN_ELEMENT_TYPES.add(ServerMCP_2002);
			KNOWN_ELEMENT_TYPES.add(Workflow_2003);
			KNOWN_ELEMENT_TYPES.add(Contexto_3001);
			KNOWN_ELEMENT_TYPES.add(Propiedad_3002);
			KNOWN_ELEMENT_TYPES.add(OperacionMCP_3003);
			KNOWN_ELEMENT_TYPES.add(TareaTransformacionDatos_3004);
			KNOWN_ELEMENT_TYPES.add(Escritura_3005);
			KNOWN_ELEMENT_TYPES.add(Lectura_3006);
			KNOWN_ELEMENT_TYPES.add(TareaLLM_3007);
			KNOWN_ELEMENT_TYPES.add(TareaUsuario_3008);
			KNOWN_ELEMENT_TYPES.add(TareaAnalisis_3009);
			KNOWN_ELEMENT_TYPES.add(TareaEnvioContexto_3010);
			KNOWN_ELEMENT_TYPES.add(TareaRecepcionContexto_3011);
			KNOWN_ELEMENT_TYPES.add(TareaServerMCP_3012);
			KNOWN_ELEMENT_TYPES.add(Inicio_3013);
			KNOWN_ELEMENT_TYPES.add(Final_3014);
			KNOWN_ELEMENT_TYPES.add(AgenteTareas_4001);
			KNOWN_ELEMENT_TYPES.add(TareaSigue_4002);
			KNOWN_ELEMENT_TYPES.add(TareaAnalisisSigueElse_4003);
			KNOWN_ELEMENT_TYPES.add(TareaServerMCPEjecutaOperacion_4004);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	* @generated
	*/
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case McpMM.diagram.edit.parts.ServiceMCPEditPart.VISUAL_ID:
			return ServiceMCP_1000;
		case McpMM.diagram.edit.parts.AgenteEditPart.VISUAL_ID:
			return Agente_2001;
		case McpMM.diagram.edit.parts.ServerMCPEditPart.VISUAL_ID:
			return ServerMCP_2002;
		case McpMM.diagram.edit.parts.WorkflowEditPart.VISUAL_ID:
			return Workflow_2003;
		case McpMM.diagram.edit.parts.ContextoEditPart.VISUAL_ID:
			return Contexto_3001;
		case McpMM.diagram.edit.parts.PropiedadEditPart.VISUAL_ID:
			return Propiedad_3002;
		case McpMM.diagram.edit.parts.OperacionMCPEditPart.VISUAL_ID:
			return OperacionMCP_3003;
		case McpMM.diagram.edit.parts.TareaTransformacionDatosEditPart.VISUAL_ID:
			return TareaTransformacionDatos_3004;
		case McpMM.diagram.edit.parts.EscrituraEditPart.VISUAL_ID:
			return Escritura_3005;
		case McpMM.diagram.edit.parts.LecturaEditPart.VISUAL_ID:
			return Lectura_3006;
		case McpMM.diagram.edit.parts.TareaLLMEditPart.VISUAL_ID:
			return TareaLLM_3007;
		case McpMM.diagram.edit.parts.TareaUsuarioEditPart.VISUAL_ID:
			return TareaUsuario_3008;
		case McpMM.diagram.edit.parts.TareaAnalisisEditPart.VISUAL_ID:
			return TareaAnalisis_3009;
		case McpMM.diagram.edit.parts.TareaEnvioContextoEditPart.VISUAL_ID:
			return TareaEnvioContexto_3010;
		case McpMM.diagram.edit.parts.TareaRecepcionContextoEditPart.VISUAL_ID:
			return TareaRecepcionContexto_3011;
		case McpMM.diagram.edit.parts.TareaServerMCPEditPart.VISUAL_ID:
			return TareaServerMCP_3012;
		case McpMM.diagram.edit.parts.InicioEditPart.VISUAL_ID:
			return Inicio_3013;
		case McpMM.diagram.edit.parts.FinalEditPart.VISUAL_ID:
			return Final_3014;
		case McpMM.diagram.edit.parts.AgenteTareasEditPart.VISUAL_ID:
			return AgenteTareas_4001;
		case McpMM.diagram.edit.parts.TareaSigueEditPart.VISUAL_ID:
			return TareaSigue_4002;
		case McpMM.diagram.edit.parts.TareaAnalisisSigueElseEditPart.VISUAL_ID:
			return TareaAnalisisSigueElse_4003;
		case McpMM.diagram.edit.parts.TareaServerMCPEjecutaOperacionEditPart.VISUAL_ID:
			return TareaServerMCPEjecutaOperacion_4004;
		}
		return null;
	}

	/**
	* @generated
	*/
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(elementTypeImages) {

		/**
		* @generated
		*/
		@Override

		public boolean isKnownElementType(IElementType elementType) {
			return McpMM.diagram.providers.McpMMElementTypes.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return McpMM.diagram.providers.McpMMElementTypes.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return McpMM.diagram.providers.McpMMElementTypes.getElement(elementTypeAdapter);
		}
	};

}
