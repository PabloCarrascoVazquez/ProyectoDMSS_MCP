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
	public static final IElementType ServerMCP_2001 = getElementType("ProyectoMCP.diagram.ServerMCP_2001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Agente_2002 = getElementType("ProyectoMCP.diagram.Agente_2002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Workflow_2003 = getElementType("ProyectoMCP.diagram.Workflow_2003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType OperacionMCP_3001 = getElementType("ProyectoMCP.diagram.OperacionMCP_3001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType TareaTransformacionDatos_3002 = getElementType(
			"ProyectoMCP.diagram.TareaTransformacionDatos_3002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Escritura_3003 = getElementType("ProyectoMCP.diagram.Escritura_3003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Lectura_3004 = getElementType("ProyectoMCP.diagram.Lectura_3004"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType TareaLLM_3005 = getElementType("ProyectoMCP.diagram.TareaLLM_3005"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType TareaUsuario_3006 = getElementType("ProyectoMCP.diagram.TareaUsuario_3006"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType TareaAnalisis_3007 = getElementType("ProyectoMCP.diagram.TareaAnalisis_3007"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType TareaEnvioContexto_3008 = getElementType(
			"ProyectoMCP.diagram.TareaEnvioContexto_3008"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType TareaRecepcionContexto_3009 = getElementType(
			"ProyectoMCP.diagram.TareaRecepcionContexto_3009"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType TareaServerMCP_3010 = getElementType("ProyectoMCP.diagram.TareaServerMCP_3010"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType TareaFinal_3011 = getElementType("ProyectoMCP.diagram.TareaFinal_3011"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType TareaInicial_3012 = getElementType("ProyectoMCP.diagram.TareaInicial_3012"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Contexto_3013 = getElementType("ProyectoMCP.diagram.Contexto_3013"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Propiedad_3014 = getElementType("ProyectoMCP.diagram.Propiedad_3014"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AgenteRealiza_4001 = getElementType("ProyectoMCP.diagram.AgenteRealiza_4001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType WorkflowEmpiezaCon_4002 = getElementType(
			"ProyectoMCP.diagram.WorkflowEmpiezaCon_4002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType WorkflowFinalizaCon_4003 = getElementType(
			"ProyectoMCP.diagram.WorkflowFinalizaCon_4003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType TareaSigue_4004 = getElementType("ProyectoMCP.diagram.TareaSigue_4004"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType TareaAnalisisSigueElse_4007 = getElementType(
			"ProyectoMCP.diagram.TareaAnalisisSigueElse_4007"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType TareaEnvioContextoEnviaA_4009 = getElementType(
			"ProyectoMCP.diagram.TareaEnvioContextoEnviaA_4009"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType TareaEnvioContextoEnvioAsociado_4010 = getElementType(
			"ProyectoMCP.diagram.TareaEnvioContextoEnvioAsociado_4010"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType TareaRecepcionContextoRecibeDe_4011 = getElementType(
			"ProyectoMCP.diagram.TareaRecepcionContextoRecibeDe_4011"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType TareaRecepcionContextoRecepcionAsociada_4012 = getElementType(
			"ProyectoMCP.diagram.TareaRecepcionContextoRecepcionAsociada_4012"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType TareaServerMCPEjecutaOperacion_4008 = getElementType(
			"ProyectoMCP.diagram.TareaServerMCPEjecutaOperacion_4008"); //$NON-NLS-1$

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

			elements.put(ServerMCP_2001, McpMM.McpMMPackage.eINSTANCE.getServerMCP());

			elements.put(Agente_2002, McpMM.McpMMPackage.eINSTANCE.getAgente());

			elements.put(Workflow_2003, McpMM.McpMMPackage.eINSTANCE.getWorkflow());

			elements.put(OperacionMCP_3001, McpMM.McpMMPackage.eINSTANCE.getOperacionMCP());

			elements.put(TareaTransformacionDatos_3002, McpMM.McpMMPackage.eINSTANCE.getTareaTransformacionDatos());

			elements.put(Escritura_3003, McpMM.McpMMPackage.eINSTANCE.getEscritura());

			elements.put(Lectura_3004, McpMM.McpMMPackage.eINSTANCE.getLectura());

			elements.put(TareaLLM_3005, McpMM.McpMMPackage.eINSTANCE.getTareaLLM());

			elements.put(TareaUsuario_3006, McpMM.McpMMPackage.eINSTANCE.getTareaUsuario());

			elements.put(TareaAnalisis_3007, McpMM.McpMMPackage.eINSTANCE.getTareaAnalisis());

			elements.put(TareaEnvioContexto_3008, McpMM.McpMMPackage.eINSTANCE.getTareaEnvioContexto());

			elements.put(TareaRecepcionContexto_3009, McpMM.McpMMPackage.eINSTANCE.getTareaRecepcionContexto());

			elements.put(TareaServerMCP_3010, McpMM.McpMMPackage.eINSTANCE.getTareaServerMCP());

			elements.put(TareaFinal_3011, McpMM.McpMMPackage.eINSTANCE.getTareaFinal());

			elements.put(TareaInicial_3012, McpMM.McpMMPackage.eINSTANCE.getTareaInicial());

			elements.put(Contexto_3013, McpMM.McpMMPackage.eINSTANCE.getContexto());

			elements.put(Propiedad_3014, McpMM.McpMMPackage.eINSTANCE.getPropiedad());

			elements.put(AgenteRealiza_4001, McpMM.McpMMPackage.eINSTANCE.getAgente_Realiza());

			elements.put(WorkflowEmpiezaCon_4002, McpMM.McpMMPackage.eINSTANCE.getWorkflow_EmpiezaCon());

			elements.put(WorkflowFinalizaCon_4003, McpMM.McpMMPackage.eINSTANCE.getWorkflow_FinalizaCon());

			elements.put(TareaSigue_4004, McpMM.McpMMPackage.eINSTANCE.getTarea_Sigue());

			elements.put(TareaAnalisisSigueElse_4007, McpMM.McpMMPackage.eINSTANCE.getTareaAnalisis_SigueElse());

			elements.put(TareaEnvioContextoEnviaA_4009, McpMM.McpMMPackage.eINSTANCE.getTareaEnvioContexto_EnviaA());

			elements.put(TareaEnvioContextoEnvioAsociado_4010,
					McpMM.McpMMPackage.eINSTANCE.getTareaEnvioContexto_EnvioAsociado());

			elements.put(TareaRecepcionContextoRecibeDe_4011,
					McpMM.McpMMPackage.eINSTANCE.getTareaRecepcionContexto_RecibeDe());

			elements.put(TareaRecepcionContextoRecepcionAsociada_4012,
					McpMM.McpMMPackage.eINSTANCE.getTareaRecepcionContexto_RecepcionAsociada());

			elements.put(TareaServerMCPEjecutaOperacion_4008,
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
			KNOWN_ELEMENT_TYPES.add(ServerMCP_2001);
			KNOWN_ELEMENT_TYPES.add(Agente_2002);
			KNOWN_ELEMENT_TYPES.add(Workflow_2003);
			KNOWN_ELEMENT_TYPES.add(OperacionMCP_3001);
			KNOWN_ELEMENT_TYPES.add(TareaTransformacionDatos_3002);
			KNOWN_ELEMENT_TYPES.add(Escritura_3003);
			KNOWN_ELEMENT_TYPES.add(Lectura_3004);
			KNOWN_ELEMENT_TYPES.add(TareaLLM_3005);
			KNOWN_ELEMENT_TYPES.add(TareaUsuario_3006);
			KNOWN_ELEMENT_TYPES.add(TareaAnalisis_3007);
			KNOWN_ELEMENT_TYPES.add(TareaEnvioContexto_3008);
			KNOWN_ELEMENT_TYPES.add(TareaRecepcionContexto_3009);
			KNOWN_ELEMENT_TYPES.add(TareaServerMCP_3010);
			KNOWN_ELEMENT_TYPES.add(TareaFinal_3011);
			KNOWN_ELEMENT_TYPES.add(TareaInicial_3012);
			KNOWN_ELEMENT_TYPES.add(Contexto_3013);
			KNOWN_ELEMENT_TYPES.add(Propiedad_3014);
			KNOWN_ELEMENT_TYPES.add(AgenteRealiza_4001);
			KNOWN_ELEMENT_TYPES.add(WorkflowEmpiezaCon_4002);
			KNOWN_ELEMENT_TYPES.add(WorkflowFinalizaCon_4003);
			KNOWN_ELEMENT_TYPES.add(TareaSigue_4004);
			KNOWN_ELEMENT_TYPES.add(TareaAnalisisSigueElse_4007);
			KNOWN_ELEMENT_TYPES.add(TareaEnvioContextoEnviaA_4009);
			KNOWN_ELEMENT_TYPES.add(TareaEnvioContextoEnvioAsociado_4010);
			KNOWN_ELEMENT_TYPES.add(TareaRecepcionContextoRecibeDe_4011);
			KNOWN_ELEMENT_TYPES.add(TareaRecepcionContextoRecepcionAsociada_4012);
			KNOWN_ELEMENT_TYPES.add(TareaServerMCPEjecutaOperacion_4008);
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
		case McpMM.diagram.edit.parts.ServerMCPEditPart.VISUAL_ID:
			return ServerMCP_2001;
		case McpMM.diagram.edit.parts.AgenteEditPart.VISUAL_ID:
			return Agente_2002;
		case McpMM.diagram.edit.parts.WorkflowEditPart.VISUAL_ID:
			return Workflow_2003;
		case McpMM.diagram.edit.parts.OperacionMCPEditPart.VISUAL_ID:
			return OperacionMCP_3001;
		case McpMM.diagram.edit.parts.TareaTransformacionDatosEditPart.VISUAL_ID:
			return TareaTransformacionDatos_3002;
		case McpMM.diagram.edit.parts.EscrituraEditPart.VISUAL_ID:
			return Escritura_3003;
		case McpMM.diagram.edit.parts.LecturaEditPart.VISUAL_ID:
			return Lectura_3004;
		case McpMM.diagram.edit.parts.TareaLLMEditPart.VISUAL_ID:
			return TareaLLM_3005;
		case McpMM.diagram.edit.parts.TareaUsuarioEditPart.VISUAL_ID:
			return TareaUsuario_3006;
		case McpMM.diagram.edit.parts.TareaAnalisisEditPart.VISUAL_ID:
			return TareaAnalisis_3007;
		case McpMM.diagram.edit.parts.TareaEnvioContextoEditPart.VISUAL_ID:
			return TareaEnvioContexto_3008;
		case McpMM.diagram.edit.parts.TareaRecepcionContextoEditPart.VISUAL_ID:
			return TareaRecepcionContexto_3009;
		case McpMM.diagram.edit.parts.TareaServerMCPEditPart.VISUAL_ID:
			return TareaServerMCP_3010;
		case McpMM.diagram.edit.parts.TareaFinalEditPart.VISUAL_ID:
			return TareaFinal_3011;
		case McpMM.diagram.edit.parts.TareaInicialEditPart.VISUAL_ID:
			return TareaInicial_3012;
		case McpMM.diagram.edit.parts.ContextoEditPart.VISUAL_ID:
			return Contexto_3013;
		case McpMM.diagram.edit.parts.PropiedadEditPart.VISUAL_ID:
			return Propiedad_3014;
		case McpMM.diagram.edit.parts.AgenteRealizaEditPart.VISUAL_ID:
			return AgenteRealiza_4001;
		case McpMM.diagram.edit.parts.WorkflowEmpiezaConEditPart.VISUAL_ID:
			return WorkflowEmpiezaCon_4002;
		case McpMM.diagram.edit.parts.WorkflowFinalizaConEditPart.VISUAL_ID:
			return WorkflowFinalizaCon_4003;
		case McpMM.diagram.edit.parts.TareaSigueEditPart.VISUAL_ID:
			return TareaSigue_4004;
		case McpMM.diagram.edit.parts.TareaAnalisisSigueElseEditPart.VISUAL_ID:
			return TareaAnalisisSigueElse_4007;
		case McpMM.diagram.edit.parts.TareaEnvioContextoEnviaAEditPart.VISUAL_ID:
			return TareaEnvioContextoEnviaA_4009;
		case McpMM.diagram.edit.parts.TareaEnvioContextoEnvioAsociadoEditPart.VISUAL_ID:
			return TareaEnvioContextoEnvioAsociado_4010;
		case McpMM.diagram.edit.parts.TareaRecepcionContextoRecibeDeEditPart.VISUAL_ID:
			return TareaRecepcionContextoRecibeDe_4011;
		case McpMM.diagram.edit.parts.TareaRecepcionContextoRecepcionAsociadaEditPart.VISUAL_ID:
			return TareaRecepcionContextoRecepcionAsociada_4012;
		case McpMM.diagram.edit.parts.TareaServerMCPEjecutaOperacionEditPart.VISUAL_ID:
			return TareaServerMCPEjecutaOperacion_4008;
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
