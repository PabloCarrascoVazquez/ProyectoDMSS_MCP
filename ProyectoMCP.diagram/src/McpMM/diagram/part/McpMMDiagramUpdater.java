/*
* 
*/
package McpMM.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

/**
 * @generated
 */
public class McpMMDiagramUpdater {

	/**
	* @generated
	*/
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null || view.getElement().eIsProxy();
	}

	/**
	* @generated
	*/
	public static List<McpMM.diagram.part.McpMMNodeDescriptor> getSemanticChildren(View view) {
		switch (McpMM.diagram.part.McpMMVisualIDRegistry.getVisualID(view)) {
		case McpMM.diagram.edit.parts.ServiceMCPEditPart.VISUAL_ID:
			return getServiceMCP_1000SemanticChildren(view);
		case McpMM.diagram.edit.parts.ServerMCPServerMCPOperacionmcpCompartmentEditPart.VISUAL_ID:
			return getServerMCPServerMCPOperacionmcpCompartment_7001SemanticChildren(view);
		case McpMM.diagram.edit.parts.WorkflowWorkflowContextoCompartmentEditPart.VISUAL_ID:
			return getWorkflowWorkflowContextoCompartment_7002SemanticChildren(view);
		case McpMM.diagram.edit.parts.WorkflowWorkflowTareaCompartmentEditPart.VISUAL_ID:
			return getWorkflowWorkflowTareaCompartment_7003SemanticChildren(view);
		case McpMM.diagram.edit.parts.TareaTransformacionDatosTareaTransformacionDatosAccionCompartmentEditPart.VISUAL_ID:
			return getTareaTransformacionDatosTareaTransformacionDatosAccionCompartment_7004SemanticChildren(view);
		case McpMM.diagram.edit.parts.TareaLLMTareaLLMAccionCompartmentEditPart.VISUAL_ID:
			return getTareaLLMTareaLLMAccionCompartment_7005SemanticChildren(view);
		case McpMM.diagram.edit.parts.TareaUsuarioTareaUsuarioAccionCompartmentEditPart.VISUAL_ID:
			return getTareaUsuarioTareaUsuarioAccionCompartment_7006SemanticChildren(view);
		case McpMM.diagram.edit.parts.TareaAnalisisTareaAnalisisAccionCompartmentEditPart.VISUAL_ID:
			return getTareaAnalisisTareaAnalisisAccionCompartment_7007SemanticChildren(view);
		case McpMM.diagram.edit.parts.TareaEnvioContextoTareaEnvioContextoAccionCompartmentEditPart.VISUAL_ID:
			return getTareaEnvioContextoTareaEnvioContextoAccionCompartment_7008SemanticChildren(view);
		case McpMM.diagram.edit.parts.TareaRecepcionContextoTareaRecepcionContextoAccionCompartmentEditPart.VISUAL_ID:
			return getTareaRecepcionContextoTareaRecepcionContextoAccionCompartment_7009SemanticChildren(view);
		case McpMM.diagram.edit.parts.TareaServerMCPTareaServerMCPAccionCompartmentEditPart.VISUAL_ID:
			return getTareaServerMCPTareaServerMCPAccionCompartment_7010SemanticChildren(view);
		case McpMM.diagram.edit.parts.TareaFinalTareaFinalAccionCompartmentEditPart.VISUAL_ID:
			return getTareaFinalTareaFinalAccionCompartment_7011SemanticChildren(view);
		case McpMM.diagram.edit.parts.TareaInicialTareaInicialAccionCompartmentEditPart.VISUAL_ID:
			return getTareaInicialTareaInicialAccionCompartment_7012SemanticChildren(view);
		case McpMM.diagram.edit.parts.ContextoContextoPropiedadCompartmentEditPart.VISUAL_ID:
			return getContextoContextoPropiedadCompartment_7013SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<McpMM.diagram.part.McpMMNodeDescriptor> getServiceMCP_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		McpMM.ServiceMCP modelElement = (McpMM.ServiceMCP) view.getElement();
		LinkedList<McpMM.diagram.part.McpMMNodeDescriptor> result = new LinkedList<McpMM.diagram.part.McpMMNodeDescriptor>();
		for (Iterator<?> it = modelElement.getServermcp().iterator(); it.hasNext();) {
			McpMM.ServerMCP childElement = (McpMM.ServerMCP) it.next();
			int visualID = McpMM.diagram.part.McpMMVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == McpMM.diagram.edit.parts.ServerMCPEditPart.VISUAL_ID) {
				result.add(new McpMM.diagram.part.McpMMNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getAgente().iterator(); it.hasNext();) {
			McpMM.Agente childElement = (McpMM.Agente) it.next();
			int visualID = McpMM.diagram.part.McpMMVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == McpMM.diagram.edit.parts.AgenteEditPart.VISUAL_ID) {
				result.add(new McpMM.diagram.part.McpMMNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getWorkflow().iterator(); it.hasNext();) {
			McpMM.Workflow childElement = (McpMM.Workflow) it.next();
			int visualID = McpMM.diagram.part.McpMMVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == McpMM.diagram.edit.parts.WorkflowEditPart.VISUAL_ID) {
				result.add(new McpMM.diagram.part.McpMMNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<McpMM.diagram.part.McpMMNodeDescriptor> getServerMCPServerMCPOperacionmcpCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		McpMM.ServerMCP modelElement = (McpMM.ServerMCP) containerView.getElement();
		LinkedList<McpMM.diagram.part.McpMMNodeDescriptor> result = new LinkedList<McpMM.diagram.part.McpMMNodeDescriptor>();
		for (Iterator<?> it = modelElement.getOperacionmcp().iterator(); it.hasNext();) {
			McpMM.OperacionMCP childElement = (McpMM.OperacionMCP) it.next();
			int visualID = McpMM.diagram.part.McpMMVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == McpMM.diagram.edit.parts.OperacionMCPEditPart.VISUAL_ID) {
				result.add(new McpMM.diagram.part.McpMMNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<McpMM.diagram.part.McpMMNodeDescriptor> getWorkflowWorkflowContextoCompartment_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		McpMM.Workflow modelElement = (McpMM.Workflow) containerView.getElement();
		LinkedList<McpMM.diagram.part.McpMMNodeDescriptor> result = new LinkedList<McpMM.diagram.part.McpMMNodeDescriptor>();
		for (Iterator<?> it = modelElement.getContexto().iterator(); it.hasNext();) {
			McpMM.Contexto childElement = (McpMM.Contexto) it.next();
			int visualID = McpMM.diagram.part.McpMMVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == McpMM.diagram.edit.parts.ContextoEditPart.VISUAL_ID) {
				result.add(new McpMM.diagram.part.McpMMNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<McpMM.diagram.part.McpMMNodeDescriptor> getWorkflowWorkflowTareaCompartment_7003SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		McpMM.Workflow modelElement = (McpMM.Workflow) containerView.getElement();
		LinkedList<McpMM.diagram.part.McpMMNodeDescriptor> result = new LinkedList<McpMM.diagram.part.McpMMNodeDescriptor>();
		for (Iterator<?> it = modelElement.getTarea().iterator(); it.hasNext();) {
			McpMM.Tarea childElement = (McpMM.Tarea) it.next();
			int visualID = McpMM.diagram.part.McpMMVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == McpMM.diagram.edit.parts.TareaTransformacionDatosEditPart.VISUAL_ID) {
				result.add(new McpMM.diagram.part.McpMMNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == McpMM.diagram.edit.parts.TareaLLMEditPart.VISUAL_ID) {
				result.add(new McpMM.diagram.part.McpMMNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == McpMM.diagram.edit.parts.TareaUsuarioEditPart.VISUAL_ID) {
				result.add(new McpMM.diagram.part.McpMMNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == McpMM.diagram.edit.parts.TareaAnalisisEditPart.VISUAL_ID) {
				result.add(new McpMM.diagram.part.McpMMNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == McpMM.diagram.edit.parts.TareaEnvioContextoEditPart.VISUAL_ID) {
				result.add(new McpMM.diagram.part.McpMMNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == McpMM.diagram.edit.parts.TareaRecepcionContextoEditPart.VISUAL_ID) {
				result.add(new McpMM.diagram.part.McpMMNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == McpMM.diagram.edit.parts.TareaServerMCPEditPart.VISUAL_ID) {
				result.add(new McpMM.diagram.part.McpMMNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == McpMM.diagram.edit.parts.TareaFinalEditPart.VISUAL_ID) {
				result.add(new McpMM.diagram.part.McpMMNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == McpMM.diagram.edit.parts.TareaInicialEditPart.VISUAL_ID) {
				result.add(new McpMM.diagram.part.McpMMNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<McpMM.diagram.part.McpMMNodeDescriptor> getTareaTransformacionDatosTareaTransformacionDatosAccionCompartment_7004SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		McpMM.TareaTransformacionDatos modelElement = (McpMM.TareaTransformacionDatos) containerView.getElement();
		LinkedList<McpMM.diagram.part.McpMMNodeDescriptor> result = new LinkedList<McpMM.diagram.part.McpMMNodeDescriptor>();
		for (Iterator<?> it = modelElement.getAccion().iterator(); it.hasNext();) {
			McpMM.Accion childElement = (McpMM.Accion) it.next();
			int visualID = McpMM.diagram.part.McpMMVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == McpMM.diagram.edit.parts.EscrituraEditPart.VISUAL_ID) {
				result.add(new McpMM.diagram.part.McpMMNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == McpMM.diagram.edit.parts.LecturaEditPart.VISUAL_ID) {
				result.add(new McpMM.diagram.part.McpMMNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<McpMM.diagram.part.McpMMNodeDescriptor> getTareaLLMTareaLLMAccionCompartment_7005SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		McpMM.TareaLLM modelElement = (McpMM.TareaLLM) containerView.getElement();
		LinkedList<McpMM.diagram.part.McpMMNodeDescriptor> result = new LinkedList<McpMM.diagram.part.McpMMNodeDescriptor>();
		for (Iterator<?> it = modelElement.getAccion().iterator(); it.hasNext();) {
			McpMM.Accion childElement = (McpMM.Accion) it.next();
			int visualID = McpMM.diagram.part.McpMMVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == McpMM.diagram.edit.parts.EscrituraEditPart.VISUAL_ID) {
				result.add(new McpMM.diagram.part.McpMMNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == McpMM.diagram.edit.parts.LecturaEditPart.VISUAL_ID) {
				result.add(new McpMM.diagram.part.McpMMNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<McpMM.diagram.part.McpMMNodeDescriptor> getTareaUsuarioTareaUsuarioAccionCompartment_7006SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		McpMM.TareaUsuario modelElement = (McpMM.TareaUsuario) containerView.getElement();
		LinkedList<McpMM.diagram.part.McpMMNodeDescriptor> result = new LinkedList<McpMM.diagram.part.McpMMNodeDescriptor>();
		for (Iterator<?> it = modelElement.getAccion().iterator(); it.hasNext();) {
			McpMM.Accion childElement = (McpMM.Accion) it.next();
			int visualID = McpMM.diagram.part.McpMMVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == McpMM.diagram.edit.parts.EscrituraEditPart.VISUAL_ID) {
				result.add(new McpMM.diagram.part.McpMMNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == McpMM.diagram.edit.parts.LecturaEditPart.VISUAL_ID) {
				result.add(new McpMM.diagram.part.McpMMNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<McpMM.diagram.part.McpMMNodeDescriptor> getTareaAnalisisTareaAnalisisAccionCompartment_7007SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		McpMM.TareaAnalisis modelElement = (McpMM.TareaAnalisis) containerView.getElement();
		LinkedList<McpMM.diagram.part.McpMMNodeDescriptor> result = new LinkedList<McpMM.diagram.part.McpMMNodeDescriptor>();
		for (Iterator<?> it = modelElement.getAccion().iterator(); it.hasNext();) {
			McpMM.Accion childElement = (McpMM.Accion) it.next();
			int visualID = McpMM.diagram.part.McpMMVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == McpMM.diagram.edit.parts.EscrituraEditPart.VISUAL_ID) {
				result.add(new McpMM.diagram.part.McpMMNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == McpMM.diagram.edit.parts.LecturaEditPart.VISUAL_ID) {
				result.add(new McpMM.diagram.part.McpMMNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<McpMM.diagram.part.McpMMNodeDescriptor> getTareaEnvioContextoTareaEnvioContextoAccionCompartment_7008SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		McpMM.TareaEnvioContexto modelElement = (McpMM.TareaEnvioContexto) containerView.getElement();
		LinkedList<McpMM.diagram.part.McpMMNodeDescriptor> result = new LinkedList<McpMM.diagram.part.McpMMNodeDescriptor>();
		for (Iterator<?> it = modelElement.getAccion().iterator(); it.hasNext();) {
			McpMM.Accion childElement = (McpMM.Accion) it.next();
			int visualID = McpMM.diagram.part.McpMMVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == McpMM.diagram.edit.parts.EscrituraEditPart.VISUAL_ID) {
				result.add(new McpMM.diagram.part.McpMMNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == McpMM.diagram.edit.parts.LecturaEditPart.VISUAL_ID) {
				result.add(new McpMM.diagram.part.McpMMNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<McpMM.diagram.part.McpMMNodeDescriptor> getTareaRecepcionContextoTareaRecepcionContextoAccionCompartment_7009SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		McpMM.TareaRecepcionContexto modelElement = (McpMM.TareaRecepcionContexto) containerView.getElement();
		LinkedList<McpMM.diagram.part.McpMMNodeDescriptor> result = new LinkedList<McpMM.diagram.part.McpMMNodeDescriptor>();
		for (Iterator<?> it = modelElement.getAccion().iterator(); it.hasNext();) {
			McpMM.Accion childElement = (McpMM.Accion) it.next();
			int visualID = McpMM.diagram.part.McpMMVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == McpMM.diagram.edit.parts.EscrituraEditPart.VISUAL_ID) {
				result.add(new McpMM.diagram.part.McpMMNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == McpMM.diagram.edit.parts.LecturaEditPart.VISUAL_ID) {
				result.add(new McpMM.diagram.part.McpMMNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<McpMM.diagram.part.McpMMNodeDescriptor> getTareaServerMCPTareaServerMCPAccionCompartment_7010SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		McpMM.TareaServerMCP modelElement = (McpMM.TareaServerMCP) containerView.getElement();
		LinkedList<McpMM.diagram.part.McpMMNodeDescriptor> result = new LinkedList<McpMM.diagram.part.McpMMNodeDescriptor>();
		for (Iterator<?> it = modelElement.getAccion().iterator(); it.hasNext();) {
			McpMM.Accion childElement = (McpMM.Accion) it.next();
			int visualID = McpMM.diagram.part.McpMMVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == McpMM.diagram.edit.parts.EscrituraEditPart.VISUAL_ID) {
				result.add(new McpMM.diagram.part.McpMMNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == McpMM.diagram.edit.parts.LecturaEditPart.VISUAL_ID) {
				result.add(new McpMM.diagram.part.McpMMNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<McpMM.diagram.part.McpMMNodeDescriptor> getTareaFinalTareaFinalAccionCompartment_7011SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		McpMM.TareaFinal modelElement = (McpMM.TareaFinal) containerView.getElement();
		LinkedList<McpMM.diagram.part.McpMMNodeDescriptor> result = new LinkedList<McpMM.diagram.part.McpMMNodeDescriptor>();
		for (Iterator<?> it = modelElement.getAccion().iterator(); it.hasNext();) {
			McpMM.Accion childElement = (McpMM.Accion) it.next();
			int visualID = McpMM.diagram.part.McpMMVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == McpMM.diagram.edit.parts.EscrituraEditPart.VISUAL_ID) {
				result.add(new McpMM.diagram.part.McpMMNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == McpMM.diagram.edit.parts.LecturaEditPart.VISUAL_ID) {
				result.add(new McpMM.diagram.part.McpMMNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<McpMM.diagram.part.McpMMNodeDescriptor> getTareaInicialTareaInicialAccionCompartment_7012SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		McpMM.TareaInicial modelElement = (McpMM.TareaInicial) containerView.getElement();
		LinkedList<McpMM.diagram.part.McpMMNodeDescriptor> result = new LinkedList<McpMM.diagram.part.McpMMNodeDescriptor>();
		for (Iterator<?> it = modelElement.getAccion().iterator(); it.hasNext();) {
			McpMM.Accion childElement = (McpMM.Accion) it.next();
			int visualID = McpMM.diagram.part.McpMMVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == McpMM.diagram.edit.parts.EscrituraEditPart.VISUAL_ID) {
				result.add(new McpMM.diagram.part.McpMMNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == McpMM.diagram.edit.parts.LecturaEditPart.VISUAL_ID) {
				result.add(new McpMM.diagram.part.McpMMNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<McpMM.diagram.part.McpMMNodeDescriptor> getContextoContextoPropiedadCompartment_7013SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		McpMM.Contexto modelElement = (McpMM.Contexto) containerView.getElement();
		LinkedList<McpMM.diagram.part.McpMMNodeDescriptor> result = new LinkedList<McpMM.diagram.part.McpMMNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPropiedad().iterator(); it.hasNext();) {
			McpMM.Propiedad childElement = (McpMM.Propiedad) it.next();
			int visualID = McpMM.diagram.part.McpMMVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == McpMM.diagram.edit.parts.PropiedadEditPart.VISUAL_ID) {
				result.add(new McpMM.diagram.part.McpMMNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<McpMM.diagram.part.McpMMLinkDescriptor> getContainedLinks(View view) {
		switch (McpMM.diagram.part.McpMMVisualIDRegistry.getVisualID(view)) {
		case McpMM.diagram.edit.parts.ServiceMCPEditPart.VISUAL_ID:
			return getServiceMCP_1000ContainedLinks(view);
		case McpMM.diagram.edit.parts.ServerMCPEditPart.VISUAL_ID:
			return getServerMCP_2001ContainedLinks(view);
		case McpMM.diagram.edit.parts.AgenteEditPart.VISUAL_ID:
			return getAgente_2002ContainedLinks(view);
		case McpMM.diagram.edit.parts.WorkflowEditPart.VISUAL_ID:
			return getWorkflow_2003ContainedLinks(view);
		case McpMM.diagram.edit.parts.OperacionMCPEditPart.VISUAL_ID:
			return getOperacionMCP_3001ContainedLinks(view);
		case McpMM.diagram.edit.parts.TareaTransformacionDatosEditPart.VISUAL_ID:
			return getTareaTransformacionDatos_3002ContainedLinks(view);
		case McpMM.diagram.edit.parts.EscrituraEditPart.VISUAL_ID:
			return getEscritura_3003ContainedLinks(view);
		case McpMM.diagram.edit.parts.LecturaEditPart.VISUAL_ID:
			return getLectura_3004ContainedLinks(view);
		case McpMM.diagram.edit.parts.TareaLLMEditPart.VISUAL_ID:
			return getTareaLLM_3005ContainedLinks(view);
		case McpMM.diagram.edit.parts.TareaUsuarioEditPart.VISUAL_ID:
			return getTareaUsuario_3006ContainedLinks(view);
		case McpMM.diagram.edit.parts.TareaAnalisisEditPart.VISUAL_ID:
			return getTareaAnalisis_3007ContainedLinks(view);
		case McpMM.diagram.edit.parts.TareaEnvioContextoEditPart.VISUAL_ID:
			return getTareaEnvioContexto_3008ContainedLinks(view);
		case McpMM.diagram.edit.parts.TareaRecepcionContextoEditPart.VISUAL_ID:
			return getTareaRecepcionContexto_3009ContainedLinks(view);
		case McpMM.diagram.edit.parts.TareaServerMCPEditPart.VISUAL_ID:
			return getTareaServerMCP_3010ContainedLinks(view);
		case McpMM.diagram.edit.parts.TareaFinalEditPart.VISUAL_ID:
			return getTareaFinal_3011ContainedLinks(view);
		case McpMM.diagram.edit.parts.TareaInicialEditPart.VISUAL_ID:
			return getTareaInicial_3012ContainedLinks(view);
		case McpMM.diagram.edit.parts.ContextoEditPart.VISUAL_ID:
			return getContexto_3013ContainedLinks(view);
		case McpMM.diagram.edit.parts.PropiedadEditPart.VISUAL_ID:
			return getPropiedad_3014ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<McpMM.diagram.part.McpMMLinkDescriptor> getIncomingLinks(View view) {
		switch (McpMM.diagram.part.McpMMVisualIDRegistry.getVisualID(view)) {
		case McpMM.diagram.edit.parts.ServerMCPEditPart.VISUAL_ID:
			return getServerMCP_2001IncomingLinks(view);
		case McpMM.diagram.edit.parts.AgenteEditPart.VISUAL_ID:
			return getAgente_2002IncomingLinks(view);
		case McpMM.diagram.edit.parts.WorkflowEditPart.VISUAL_ID:
			return getWorkflow_2003IncomingLinks(view);
		case McpMM.diagram.edit.parts.OperacionMCPEditPart.VISUAL_ID:
			return getOperacionMCP_3001IncomingLinks(view);
		case McpMM.diagram.edit.parts.TareaTransformacionDatosEditPart.VISUAL_ID:
			return getTareaTransformacionDatos_3002IncomingLinks(view);
		case McpMM.diagram.edit.parts.EscrituraEditPart.VISUAL_ID:
			return getEscritura_3003IncomingLinks(view);
		case McpMM.diagram.edit.parts.LecturaEditPart.VISUAL_ID:
			return getLectura_3004IncomingLinks(view);
		case McpMM.diagram.edit.parts.TareaLLMEditPart.VISUAL_ID:
			return getTareaLLM_3005IncomingLinks(view);
		case McpMM.diagram.edit.parts.TareaUsuarioEditPart.VISUAL_ID:
			return getTareaUsuario_3006IncomingLinks(view);
		case McpMM.diagram.edit.parts.TareaAnalisisEditPart.VISUAL_ID:
			return getTareaAnalisis_3007IncomingLinks(view);
		case McpMM.diagram.edit.parts.TareaEnvioContextoEditPart.VISUAL_ID:
			return getTareaEnvioContexto_3008IncomingLinks(view);
		case McpMM.diagram.edit.parts.TareaRecepcionContextoEditPart.VISUAL_ID:
			return getTareaRecepcionContexto_3009IncomingLinks(view);
		case McpMM.diagram.edit.parts.TareaServerMCPEditPart.VISUAL_ID:
			return getTareaServerMCP_3010IncomingLinks(view);
		case McpMM.diagram.edit.parts.TareaFinalEditPart.VISUAL_ID:
			return getTareaFinal_3011IncomingLinks(view);
		case McpMM.diagram.edit.parts.TareaInicialEditPart.VISUAL_ID:
			return getTareaInicial_3012IncomingLinks(view);
		case McpMM.diagram.edit.parts.ContextoEditPart.VISUAL_ID:
			return getContexto_3013IncomingLinks(view);
		case McpMM.diagram.edit.parts.PropiedadEditPart.VISUAL_ID:
			return getPropiedad_3014IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<McpMM.diagram.part.McpMMLinkDescriptor> getOutgoingLinks(View view) {
		switch (McpMM.diagram.part.McpMMVisualIDRegistry.getVisualID(view)) {
		case McpMM.diagram.edit.parts.ServerMCPEditPart.VISUAL_ID:
			return getServerMCP_2001OutgoingLinks(view);
		case McpMM.diagram.edit.parts.AgenteEditPart.VISUAL_ID:
			return getAgente_2002OutgoingLinks(view);
		case McpMM.diagram.edit.parts.WorkflowEditPart.VISUAL_ID:
			return getWorkflow_2003OutgoingLinks(view);
		case McpMM.diagram.edit.parts.OperacionMCPEditPart.VISUAL_ID:
			return getOperacionMCP_3001OutgoingLinks(view);
		case McpMM.diagram.edit.parts.TareaTransformacionDatosEditPart.VISUAL_ID:
			return getTareaTransformacionDatos_3002OutgoingLinks(view);
		case McpMM.diagram.edit.parts.EscrituraEditPart.VISUAL_ID:
			return getEscritura_3003OutgoingLinks(view);
		case McpMM.diagram.edit.parts.LecturaEditPart.VISUAL_ID:
			return getLectura_3004OutgoingLinks(view);
		case McpMM.diagram.edit.parts.TareaLLMEditPart.VISUAL_ID:
			return getTareaLLM_3005OutgoingLinks(view);
		case McpMM.diagram.edit.parts.TareaUsuarioEditPart.VISUAL_ID:
			return getTareaUsuario_3006OutgoingLinks(view);
		case McpMM.diagram.edit.parts.TareaAnalisisEditPart.VISUAL_ID:
			return getTareaAnalisis_3007OutgoingLinks(view);
		case McpMM.diagram.edit.parts.TareaEnvioContextoEditPart.VISUAL_ID:
			return getTareaEnvioContexto_3008OutgoingLinks(view);
		case McpMM.diagram.edit.parts.TareaRecepcionContextoEditPart.VISUAL_ID:
			return getTareaRecepcionContexto_3009OutgoingLinks(view);
		case McpMM.diagram.edit.parts.TareaServerMCPEditPart.VISUAL_ID:
			return getTareaServerMCP_3010OutgoingLinks(view);
		case McpMM.diagram.edit.parts.TareaFinalEditPart.VISUAL_ID:
			return getTareaFinal_3011OutgoingLinks(view);
		case McpMM.diagram.edit.parts.TareaInicialEditPart.VISUAL_ID:
			return getTareaInicial_3012OutgoingLinks(view);
		case McpMM.diagram.edit.parts.ContextoEditPart.VISUAL_ID:
			return getContexto_3013OutgoingLinks(view);
		case McpMM.diagram.edit.parts.PropiedadEditPart.VISUAL_ID:
			return getPropiedad_3014OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<McpMM.diagram.part.McpMMLinkDescriptor> getServiceMCP_1000ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<McpMM.diagram.part.McpMMLinkDescriptor> getServerMCP_2001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<McpMM.diagram.part.McpMMLinkDescriptor> getAgente_2002ContainedLinks(View view) {
		McpMM.Agente modelElement = (McpMM.Agente) view.getElement();
		LinkedList<McpMM.diagram.part.McpMMLinkDescriptor> result = new LinkedList<McpMM.diagram.part.McpMMLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Agente_Realiza_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<McpMM.diagram.part.McpMMLinkDescriptor> getWorkflow_2003ContainedLinks(View view) {
		McpMM.Workflow modelElement = (McpMM.Workflow) view.getElement();
		LinkedList<McpMM.diagram.part.McpMMLinkDescriptor> result = new LinkedList<McpMM.diagram.part.McpMMLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Workflow_EmpiezaCon_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Workflow_FinalizaCon_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<McpMM.diagram.part.McpMMLinkDescriptor> getOperacionMCP_3001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<McpMM.diagram.part.McpMMLinkDescriptor> getTareaTransformacionDatos_3002ContainedLinks(
			View view) {
		McpMM.TareaTransformacionDatos modelElement = (McpMM.TareaTransformacionDatos) view.getElement();
		LinkedList<McpMM.diagram.part.McpMMLinkDescriptor> result = new LinkedList<McpMM.diagram.part.McpMMLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Tarea_Sigue_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<McpMM.diagram.part.McpMMLinkDescriptor> getEscritura_3003ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<McpMM.diagram.part.McpMMLinkDescriptor> getLectura_3004ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<McpMM.diagram.part.McpMMLinkDescriptor> getTareaLLM_3005ContainedLinks(View view) {
		McpMM.TareaLLM modelElement = (McpMM.TareaLLM) view.getElement();
		LinkedList<McpMM.diagram.part.McpMMLinkDescriptor> result = new LinkedList<McpMM.diagram.part.McpMMLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Tarea_Sigue_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<McpMM.diagram.part.McpMMLinkDescriptor> getTareaUsuario_3006ContainedLinks(View view) {
		McpMM.TareaUsuario modelElement = (McpMM.TareaUsuario) view.getElement();
		LinkedList<McpMM.diagram.part.McpMMLinkDescriptor> result = new LinkedList<McpMM.diagram.part.McpMMLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Tarea_Sigue_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<McpMM.diagram.part.McpMMLinkDescriptor> getTareaAnalisis_3007ContainedLinks(View view) {
		McpMM.TareaAnalisis modelElement = (McpMM.TareaAnalisis) view.getElement();
		LinkedList<McpMM.diagram.part.McpMMLinkDescriptor> result = new LinkedList<McpMM.diagram.part.McpMMLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Tarea_Sigue_4004(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_TareaAnalisis_SigueElse_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<McpMM.diagram.part.McpMMLinkDescriptor> getTareaEnvioContexto_3008ContainedLinks(View view) {
		McpMM.TareaEnvioContexto modelElement = (McpMM.TareaEnvioContexto) view.getElement();
		LinkedList<McpMM.diagram.part.McpMMLinkDescriptor> result = new LinkedList<McpMM.diagram.part.McpMMLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Tarea_Sigue_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<McpMM.diagram.part.McpMMLinkDescriptor> getTareaRecepcionContexto_3009ContainedLinks(View view) {
		McpMM.TareaRecepcionContexto modelElement = (McpMM.TareaRecepcionContexto) view.getElement();
		LinkedList<McpMM.diagram.part.McpMMLinkDescriptor> result = new LinkedList<McpMM.diagram.part.McpMMLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Tarea_Sigue_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<McpMM.diagram.part.McpMMLinkDescriptor> getTareaServerMCP_3010ContainedLinks(View view) {
		McpMM.TareaServerMCP modelElement = (McpMM.TareaServerMCP) view.getElement();
		LinkedList<McpMM.diagram.part.McpMMLinkDescriptor> result = new LinkedList<McpMM.diagram.part.McpMMLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Tarea_Sigue_4004(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_TareaServerMCP_EjecutaOperacion_4008(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<McpMM.diagram.part.McpMMLinkDescriptor> getTareaFinal_3011ContainedLinks(View view) {
		McpMM.TareaFinal modelElement = (McpMM.TareaFinal) view.getElement();
		LinkedList<McpMM.diagram.part.McpMMLinkDescriptor> result = new LinkedList<McpMM.diagram.part.McpMMLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Tarea_Sigue_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<McpMM.diagram.part.McpMMLinkDescriptor> getTareaInicial_3012ContainedLinks(View view) {
		McpMM.TareaInicial modelElement = (McpMM.TareaInicial) view.getElement();
		LinkedList<McpMM.diagram.part.McpMMLinkDescriptor> result = new LinkedList<McpMM.diagram.part.McpMMLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Tarea_Sigue_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<McpMM.diagram.part.McpMMLinkDescriptor> getContexto_3013ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<McpMM.diagram.part.McpMMLinkDescriptor> getPropiedad_3014ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<McpMM.diagram.part.McpMMLinkDescriptor> getServerMCP_2001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<McpMM.diagram.part.McpMMLinkDescriptor> getAgente_2002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<McpMM.diagram.part.McpMMLinkDescriptor> getWorkflow_2003IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<McpMM.diagram.part.McpMMLinkDescriptor> getOperacionMCP_3001IncomingLinks(View view) {
		McpMM.OperacionMCP modelElement = (McpMM.OperacionMCP) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<McpMM.diagram.part.McpMMLinkDescriptor> result = new LinkedList<McpMM.diagram.part.McpMMLinkDescriptor>();
		result.addAll(
				getIncomingFeatureModelFacetLinks_TareaServerMCP_EjecutaOperacion_4008(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<McpMM.diagram.part.McpMMLinkDescriptor> getTareaTransformacionDatos_3002IncomingLinks(
			View view) {
		McpMM.TareaTransformacionDatos modelElement = (McpMM.TareaTransformacionDatos) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<McpMM.diagram.part.McpMMLinkDescriptor> result = new LinkedList<McpMM.diagram.part.McpMMLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Agente_Realiza_4001(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Tarea_Sigue_4004(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_TareaAnalisis_SigueElse_4007(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<McpMM.diagram.part.McpMMLinkDescriptor> getEscritura_3003IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<McpMM.diagram.part.McpMMLinkDescriptor> getLectura_3004IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<McpMM.diagram.part.McpMMLinkDescriptor> getTareaLLM_3005IncomingLinks(View view) {
		McpMM.TareaLLM modelElement = (McpMM.TareaLLM) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<McpMM.diagram.part.McpMMLinkDescriptor> result = new LinkedList<McpMM.diagram.part.McpMMLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Agente_Realiza_4001(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Tarea_Sigue_4004(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_TareaAnalisis_SigueElse_4007(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<McpMM.diagram.part.McpMMLinkDescriptor> getTareaUsuario_3006IncomingLinks(View view) {
		McpMM.TareaUsuario modelElement = (McpMM.TareaUsuario) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<McpMM.diagram.part.McpMMLinkDescriptor> result = new LinkedList<McpMM.diagram.part.McpMMLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Agente_Realiza_4001(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Tarea_Sigue_4004(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_TareaAnalisis_SigueElse_4007(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<McpMM.diagram.part.McpMMLinkDescriptor> getTareaAnalisis_3007IncomingLinks(View view) {
		McpMM.TareaAnalisis modelElement = (McpMM.TareaAnalisis) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<McpMM.diagram.part.McpMMLinkDescriptor> result = new LinkedList<McpMM.diagram.part.McpMMLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Agente_Realiza_4001(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Tarea_Sigue_4004(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_TareaAnalisis_SigueElse_4007(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<McpMM.diagram.part.McpMMLinkDescriptor> getTareaEnvioContexto_3008IncomingLinks(View view) {
		McpMM.TareaEnvioContexto modelElement = (McpMM.TareaEnvioContexto) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<McpMM.diagram.part.McpMMLinkDescriptor> result = new LinkedList<McpMM.diagram.part.McpMMLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Agente_Realiza_4001(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Tarea_Sigue_4004(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_TareaAnalisis_SigueElse_4007(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<McpMM.diagram.part.McpMMLinkDescriptor> getTareaRecepcionContexto_3009IncomingLinks(View view) {
		McpMM.TareaRecepcionContexto modelElement = (McpMM.TareaRecepcionContexto) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<McpMM.diagram.part.McpMMLinkDescriptor> result = new LinkedList<McpMM.diagram.part.McpMMLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Agente_Realiza_4001(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Tarea_Sigue_4004(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_TareaAnalisis_SigueElse_4007(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<McpMM.diagram.part.McpMMLinkDescriptor> getTareaServerMCP_3010IncomingLinks(View view) {
		McpMM.TareaServerMCP modelElement = (McpMM.TareaServerMCP) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<McpMM.diagram.part.McpMMLinkDescriptor> result = new LinkedList<McpMM.diagram.part.McpMMLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Agente_Realiza_4001(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Tarea_Sigue_4004(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_TareaAnalisis_SigueElse_4007(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<McpMM.diagram.part.McpMMLinkDescriptor> getTareaFinal_3011IncomingLinks(View view) {
		McpMM.TareaFinal modelElement = (McpMM.TareaFinal) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<McpMM.diagram.part.McpMMLinkDescriptor> result = new LinkedList<McpMM.diagram.part.McpMMLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Agente_Realiza_4001(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Workflow_FinalizaCon_4003(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Tarea_Sigue_4004(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_TareaAnalisis_SigueElse_4007(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<McpMM.diagram.part.McpMMLinkDescriptor> getTareaInicial_3012IncomingLinks(View view) {
		McpMM.TareaInicial modelElement = (McpMM.TareaInicial) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<McpMM.diagram.part.McpMMLinkDescriptor> result = new LinkedList<McpMM.diagram.part.McpMMLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Agente_Realiza_4001(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Workflow_EmpiezaCon_4002(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Tarea_Sigue_4004(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_TareaAnalisis_SigueElse_4007(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<McpMM.diagram.part.McpMMLinkDescriptor> getContexto_3013IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<McpMM.diagram.part.McpMMLinkDescriptor> getPropiedad_3014IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<McpMM.diagram.part.McpMMLinkDescriptor> getServerMCP_2001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<McpMM.diagram.part.McpMMLinkDescriptor> getAgente_2002OutgoingLinks(View view) {
		McpMM.Agente modelElement = (McpMM.Agente) view.getElement();
		LinkedList<McpMM.diagram.part.McpMMLinkDescriptor> result = new LinkedList<McpMM.diagram.part.McpMMLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Agente_Realiza_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<McpMM.diagram.part.McpMMLinkDescriptor> getWorkflow_2003OutgoingLinks(View view) {
		McpMM.Workflow modelElement = (McpMM.Workflow) view.getElement();
		LinkedList<McpMM.diagram.part.McpMMLinkDescriptor> result = new LinkedList<McpMM.diagram.part.McpMMLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Workflow_EmpiezaCon_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Workflow_FinalizaCon_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<McpMM.diagram.part.McpMMLinkDescriptor> getOperacionMCP_3001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<McpMM.diagram.part.McpMMLinkDescriptor> getTareaTransformacionDatos_3002OutgoingLinks(
			View view) {
		McpMM.TareaTransformacionDatos modelElement = (McpMM.TareaTransformacionDatos) view.getElement();
		LinkedList<McpMM.diagram.part.McpMMLinkDescriptor> result = new LinkedList<McpMM.diagram.part.McpMMLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Tarea_Sigue_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<McpMM.diagram.part.McpMMLinkDescriptor> getEscritura_3003OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<McpMM.diagram.part.McpMMLinkDescriptor> getLectura_3004OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<McpMM.diagram.part.McpMMLinkDescriptor> getTareaLLM_3005OutgoingLinks(View view) {
		McpMM.TareaLLM modelElement = (McpMM.TareaLLM) view.getElement();
		LinkedList<McpMM.diagram.part.McpMMLinkDescriptor> result = new LinkedList<McpMM.diagram.part.McpMMLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Tarea_Sigue_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<McpMM.diagram.part.McpMMLinkDescriptor> getTareaUsuario_3006OutgoingLinks(View view) {
		McpMM.TareaUsuario modelElement = (McpMM.TareaUsuario) view.getElement();
		LinkedList<McpMM.diagram.part.McpMMLinkDescriptor> result = new LinkedList<McpMM.diagram.part.McpMMLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Tarea_Sigue_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<McpMM.diagram.part.McpMMLinkDescriptor> getTareaAnalisis_3007OutgoingLinks(View view) {
		McpMM.TareaAnalisis modelElement = (McpMM.TareaAnalisis) view.getElement();
		LinkedList<McpMM.diagram.part.McpMMLinkDescriptor> result = new LinkedList<McpMM.diagram.part.McpMMLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Tarea_Sigue_4004(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_TareaAnalisis_SigueElse_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<McpMM.diagram.part.McpMMLinkDescriptor> getTareaEnvioContexto_3008OutgoingLinks(View view) {
		McpMM.TareaEnvioContexto modelElement = (McpMM.TareaEnvioContexto) view.getElement();
		LinkedList<McpMM.diagram.part.McpMMLinkDescriptor> result = new LinkedList<McpMM.diagram.part.McpMMLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Tarea_Sigue_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<McpMM.diagram.part.McpMMLinkDescriptor> getTareaRecepcionContexto_3009OutgoingLinks(View view) {
		McpMM.TareaRecepcionContexto modelElement = (McpMM.TareaRecepcionContexto) view.getElement();
		LinkedList<McpMM.diagram.part.McpMMLinkDescriptor> result = new LinkedList<McpMM.diagram.part.McpMMLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Tarea_Sigue_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<McpMM.diagram.part.McpMMLinkDescriptor> getTareaServerMCP_3010OutgoingLinks(View view) {
		McpMM.TareaServerMCP modelElement = (McpMM.TareaServerMCP) view.getElement();
		LinkedList<McpMM.diagram.part.McpMMLinkDescriptor> result = new LinkedList<McpMM.diagram.part.McpMMLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Tarea_Sigue_4004(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_TareaServerMCP_EjecutaOperacion_4008(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<McpMM.diagram.part.McpMMLinkDescriptor> getTareaFinal_3011OutgoingLinks(View view) {
		McpMM.TareaFinal modelElement = (McpMM.TareaFinal) view.getElement();
		LinkedList<McpMM.diagram.part.McpMMLinkDescriptor> result = new LinkedList<McpMM.diagram.part.McpMMLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Tarea_Sigue_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<McpMM.diagram.part.McpMMLinkDescriptor> getTareaInicial_3012OutgoingLinks(View view) {
		McpMM.TareaInicial modelElement = (McpMM.TareaInicial) view.getElement();
		LinkedList<McpMM.diagram.part.McpMMLinkDescriptor> result = new LinkedList<McpMM.diagram.part.McpMMLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Tarea_Sigue_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<McpMM.diagram.part.McpMMLinkDescriptor> getContexto_3013OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<McpMM.diagram.part.McpMMLinkDescriptor> getPropiedad_3014OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<McpMM.diagram.part.McpMMLinkDescriptor> getIncomingFeatureModelFacetLinks_Agente_Realiza_4001(
			McpMM.Tarea target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<McpMM.diagram.part.McpMMLinkDescriptor> result = new LinkedList<McpMM.diagram.part.McpMMLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == McpMM.McpMMPackage.eINSTANCE.getAgente_Realiza()) {
				result.add(new McpMM.diagram.part.McpMMLinkDescriptor(setting.getEObject(), target,
						McpMM.diagram.providers.McpMMElementTypes.AgenteRealiza_4001,
						McpMM.diagram.edit.parts.AgenteRealizaEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<McpMM.diagram.part.McpMMLinkDescriptor> getIncomingFeatureModelFacetLinks_Workflow_EmpiezaCon_4002(
			McpMM.TareaInicial target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<McpMM.diagram.part.McpMMLinkDescriptor> result = new LinkedList<McpMM.diagram.part.McpMMLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == McpMM.McpMMPackage.eINSTANCE.getWorkflow_EmpiezaCon()) {
				result.add(new McpMM.diagram.part.McpMMLinkDescriptor(setting.getEObject(), target,
						McpMM.diagram.providers.McpMMElementTypes.WorkflowEmpiezaCon_4002,
						McpMM.diagram.edit.parts.WorkflowEmpiezaConEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<McpMM.diagram.part.McpMMLinkDescriptor> getIncomingFeatureModelFacetLinks_Workflow_FinalizaCon_4003(
			McpMM.TareaFinal target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<McpMM.diagram.part.McpMMLinkDescriptor> result = new LinkedList<McpMM.diagram.part.McpMMLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == McpMM.McpMMPackage.eINSTANCE.getWorkflow_FinalizaCon()) {
				result.add(new McpMM.diagram.part.McpMMLinkDescriptor(setting.getEObject(), target,
						McpMM.diagram.providers.McpMMElementTypes.WorkflowFinalizaCon_4003,
						McpMM.diagram.edit.parts.WorkflowFinalizaConEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<McpMM.diagram.part.McpMMLinkDescriptor> getIncomingFeatureModelFacetLinks_Tarea_Sigue_4004(
			McpMM.Tarea target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<McpMM.diagram.part.McpMMLinkDescriptor> result = new LinkedList<McpMM.diagram.part.McpMMLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == McpMM.McpMMPackage.eINSTANCE.getTarea_Sigue()) {
				result.add(new McpMM.diagram.part.McpMMLinkDescriptor(setting.getEObject(), target,
						McpMM.diagram.providers.McpMMElementTypes.TareaSigue_4004,
						McpMM.diagram.edit.parts.TareaSigueEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<McpMM.diagram.part.McpMMLinkDescriptor> getIncomingFeatureModelFacetLinks_TareaAnalisis_SigueElse_4007(
			McpMM.Tarea target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<McpMM.diagram.part.McpMMLinkDescriptor> result = new LinkedList<McpMM.diagram.part.McpMMLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == McpMM.McpMMPackage.eINSTANCE.getTareaAnalisis_SigueElse()) {
				result.add(new McpMM.diagram.part.McpMMLinkDescriptor(setting.getEObject(), target,
						McpMM.diagram.providers.McpMMElementTypes.TareaAnalisisSigueElse_4007,
						McpMM.diagram.edit.parts.TareaAnalisisSigueElseEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<McpMM.diagram.part.McpMMLinkDescriptor> getIncomingFeatureModelFacetLinks_TareaServerMCP_EjecutaOperacion_4008(
			McpMM.OperacionMCP target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<McpMM.diagram.part.McpMMLinkDescriptor> result = new LinkedList<McpMM.diagram.part.McpMMLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == McpMM.McpMMPackage.eINSTANCE.getTareaServerMCP_EjecutaOperacion()) {
				result.add(new McpMM.diagram.part.McpMMLinkDescriptor(setting.getEObject(), target,
						McpMM.diagram.providers.McpMMElementTypes.TareaServerMCPEjecutaOperacion_4008,
						McpMM.diagram.edit.parts.TareaServerMCPEjecutaOperacionEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<McpMM.diagram.part.McpMMLinkDescriptor> getOutgoingFeatureModelFacetLinks_Agente_Realiza_4001(
			McpMM.Agente source) {
		LinkedList<McpMM.diagram.part.McpMMLinkDescriptor> result = new LinkedList<McpMM.diagram.part.McpMMLinkDescriptor>();
		for (Iterator<?> destinations = source.getRealiza().iterator(); destinations.hasNext();) {
			McpMM.Tarea destination = (McpMM.Tarea) destinations.next();
			result.add(new McpMM.diagram.part.McpMMLinkDescriptor(source, destination,
					McpMM.diagram.providers.McpMMElementTypes.AgenteRealiza_4001,
					McpMM.diagram.edit.parts.AgenteRealizaEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<McpMM.diagram.part.McpMMLinkDescriptor> getOutgoingFeatureModelFacetLinks_Workflow_EmpiezaCon_4002(
			McpMM.Workflow source) {
		LinkedList<McpMM.diagram.part.McpMMLinkDescriptor> result = new LinkedList<McpMM.diagram.part.McpMMLinkDescriptor>();
		McpMM.TareaInicial destination = source.getEmpiezaCon();
		if (destination == null) {
			return result;
		}
		result.add(new McpMM.diagram.part.McpMMLinkDescriptor(source, destination,
				McpMM.diagram.providers.McpMMElementTypes.WorkflowEmpiezaCon_4002,
				McpMM.diagram.edit.parts.WorkflowEmpiezaConEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<McpMM.diagram.part.McpMMLinkDescriptor> getOutgoingFeatureModelFacetLinks_Workflow_FinalizaCon_4003(
			McpMM.Workflow source) {
		LinkedList<McpMM.diagram.part.McpMMLinkDescriptor> result = new LinkedList<McpMM.diagram.part.McpMMLinkDescriptor>();
		for (Iterator<?> destinations = source.getFinalizaCon().iterator(); destinations.hasNext();) {
			McpMM.TareaFinal destination = (McpMM.TareaFinal) destinations.next();
			result.add(new McpMM.diagram.part.McpMMLinkDescriptor(source, destination,
					McpMM.diagram.providers.McpMMElementTypes.WorkflowFinalizaCon_4003,
					McpMM.diagram.edit.parts.WorkflowFinalizaConEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<McpMM.diagram.part.McpMMLinkDescriptor> getOutgoingFeatureModelFacetLinks_Tarea_Sigue_4004(
			McpMM.Tarea source) {
		LinkedList<McpMM.diagram.part.McpMMLinkDescriptor> result = new LinkedList<McpMM.diagram.part.McpMMLinkDescriptor>();
		McpMM.Tarea destination = source.getSigue();
		if (destination == null) {
			return result;
		}
		result.add(new McpMM.diagram.part.McpMMLinkDescriptor(source, destination,
				McpMM.diagram.providers.McpMMElementTypes.TareaSigue_4004,
				McpMM.diagram.edit.parts.TareaSigueEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<McpMM.diagram.part.McpMMLinkDescriptor> getOutgoingFeatureModelFacetLinks_TareaAnalisis_SigueElse_4007(
			McpMM.TareaAnalisis source) {
		LinkedList<McpMM.diagram.part.McpMMLinkDescriptor> result = new LinkedList<McpMM.diagram.part.McpMMLinkDescriptor>();
		McpMM.Tarea destination = source.getSigueElse();
		if (destination == null) {
			return result;
		}
		result.add(new McpMM.diagram.part.McpMMLinkDescriptor(source, destination,
				McpMM.diagram.providers.McpMMElementTypes.TareaAnalisisSigueElse_4007,
				McpMM.diagram.edit.parts.TareaAnalisisSigueElseEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<McpMM.diagram.part.McpMMLinkDescriptor> getOutgoingFeatureModelFacetLinks_TareaServerMCP_EjecutaOperacion_4008(
			McpMM.TareaServerMCP source) {
		LinkedList<McpMM.diagram.part.McpMMLinkDescriptor> result = new LinkedList<McpMM.diagram.part.McpMMLinkDescriptor>();
		McpMM.OperacionMCP destination = source.getEjecutaOperacion();
		if (destination == null) {
			return result;
		}
		result.add(new McpMM.diagram.part.McpMMLinkDescriptor(source, destination,
				McpMM.diagram.providers.McpMMElementTypes.TareaServerMCPEjecutaOperacion_4008,
				McpMM.diagram.edit.parts.TareaServerMCPEjecutaOperacionEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		* @generated
		*/
		@Override

		public List<McpMM.diagram.part.McpMMNodeDescriptor> getSemanticChildren(View view) {
			return McpMMDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<McpMM.diagram.part.McpMMLinkDescriptor> getContainedLinks(View view) {
			return McpMMDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<McpMM.diagram.part.McpMMLinkDescriptor> getIncomingLinks(View view) {
			return McpMMDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<McpMM.diagram.part.McpMMLinkDescriptor> getOutgoingLinks(View view) {
			return McpMMDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
