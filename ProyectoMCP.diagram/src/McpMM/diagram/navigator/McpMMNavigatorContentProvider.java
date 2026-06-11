/*
* 
*/
package McpMM.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;

/**
 * @generated
 */
public class McpMMNavigatorContentProvider implements ICommonContentProvider {

	/**
	* @generated
	*/
	private static final Object[] EMPTY_ARRAY = new Object[0];

	/**
	* @generated
	*/
	private Viewer myViewer;

	/**
	* @generated
	*/
	private AdapterFactoryEditingDomain myEditingDomain;

	/**
	* @generated
	*/
	private WorkspaceSynchronizer myWorkspaceSynchronizer;

	/**
	* @generated
	*/
	private Runnable myViewerRefreshRunnable;

	/**
	* @generated
	*/
	@SuppressWarnings({ "unchecked", "serial", "rawtypes" })
	public McpMMNavigatorContentProvider() {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE.createEditingDomain();
		myEditingDomain = (AdapterFactoryEditingDomain) editingDomain;
		myEditingDomain.setResourceToReadOnlyMap(new HashMap() {
			public Object get(Object key) {
				if (!containsKey(key)) {
					put(key, Boolean.TRUE);
				}
				return super.get(key);
			}
		});
		myViewerRefreshRunnable = new Runnable() {
			public void run() {
				if (myViewer != null) {
					myViewer.refresh();
				}
			}
		};
		myWorkspaceSynchronizer = new WorkspaceSynchronizer(editingDomain, new WorkspaceSynchronizer.Delegate() {
			public void dispose() {
			}

			public boolean handleResourceChanged(final Resource resource) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}

			public boolean handleResourceDeleted(Resource resource) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}

			public boolean handleResourceMoved(Resource resource, final URI newURI) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}
		});
	}

	/**
	* @generated
	*/
	public void dispose() {
		myWorkspaceSynchronizer.dispose();
		myWorkspaceSynchronizer = null;
		myViewerRefreshRunnable = null;
		myViewer = null;
		unloadAllResources();
		((TransactionalEditingDomain) myEditingDomain).dispose();
		myEditingDomain = null;
	}

	/**
	* @generated
	*/
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		myViewer = viewer;
	}

	/**
	* @generated
	*/
	void unloadAllResources() {
		for (Resource nextResource : myEditingDomain.getResourceSet().getResources()) {
			nextResource.unload();
		}
	}

	/**
	* @generated
	*/
	void asyncRefresh() {
		if (myViewer != null && !myViewer.getControl().isDisposed()) {
			myViewer.getControl().getDisplay().asyncExec(myViewerRefreshRunnable);
		}
	}

	/**
	* @generated
	*/
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
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
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	* @generated
	*/
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IFile) {
			IFile file = (IFile) parentElement;
			URI fileURI = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
			Resource resource = myEditingDomain.getResourceSet().getResource(fileURI, true);
			ArrayList<McpMM.diagram.navigator.McpMMNavigatorItem> result = new ArrayList<McpMM.diagram.navigator.McpMMNavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			result.addAll(createNavigatorItems(
					selectViewsByType(topViews, McpMM.diagram.edit.parts.ServiceMCPEditPart.MODEL_ID), file, false));
			return result.toArray();
		}

		if (parentElement instanceof McpMM.diagram.navigator.McpMMNavigatorGroup) {
			McpMM.diagram.navigator.McpMMNavigatorGroup group = (McpMM.diagram.navigator.McpMMNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof McpMM.diagram.navigator.McpMMNavigatorItem) {
			McpMM.diagram.navigator.McpMMNavigatorItem navigatorItem = (McpMM.diagram.navigator.McpMMNavigatorItem) parentElement;
			if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
				return EMPTY_ARRAY;
			}
			return getViewChildren(navigatorItem.getView(), parentElement);
		}

		/*
		* Due to plugin.xml restrictions this code will be called only for views representing
		* shortcuts to this diagram elements created on other diagrams. 
		*/
		if (parentElement instanceof IAdaptable) {
			View view = (View) ((IAdaptable) parentElement).getAdapter(View.class);
			if (view != null) {
				return getViewChildren(view, parentElement);
			}
		}

		return EMPTY_ARRAY;
	}

	/**
	* @generated
	*/
	private Object[] getViewChildren(View view, Object parentElement) {
		switch (McpMM.diagram.part.McpMMVisualIDRegistry.getVisualID(view)) {

		case McpMM.diagram.edit.parts.ServiceMCPEditPart.VISUAL_ID: {
			LinkedList<McpMM.diagram.navigator.McpMMAbstractNavigatorItem> result = new LinkedList<McpMM.diagram.navigator.McpMMAbstractNavigatorItem>();
			result.addAll(getForeignShortcuts((Diagram) view, parentElement));
			Diagram sv = (Diagram) view;
			McpMM.diagram.navigator.McpMMNavigatorGroup links = new McpMM.diagram.navigator.McpMMNavigatorGroup(
					McpMM.diagram.part.Messages.NavigatorGroupName_ServiceMCP_1000_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), McpMM.diagram.part.McpMMVisualIDRegistry
					.getType(McpMM.diagram.edit.parts.AgenteEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), McpMM.diagram.part.McpMMVisualIDRegistry
					.getType(McpMM.diagram.edit.parts.ServerMCPEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv), McpMM.diagram.part.McpMMVisualIDRegistry
					.getType(McpMM.diagram.edit.parts.TareaSigueEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv), McpMM.diagram.part.McpMMVisualIDRegistry
					.getType(McpMM.diagram.edit.parts.TareaAnalisisSigueElseEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv), McpMM.diagram.part.McpMMVisualIDRegistry
					.getType(McpMM.diagram.edit.parts.TareaServerMCPEjecutaOperacionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case McpMM.diagram.edit.parts.AgenteEditPart.VISUAL_ID: {
			LinkedList<McpMM.diagram.navigator.McpMMAbstractNavigatorItem> result = new LinkedList<McpMM.diagram.navigator.McpMMAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), McpMM.diagram.part.McpMMVisualIDRegistry
					.getType(McpMM.diagram.edit.parts.AgenteAgenteFlujoCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, McpMM.diagram.part.McpMMVisualIDRegistry
					.getType(McpMM.diagram.edit.parts.WorkflowEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), McpMM.diagram.part.McpMMVisualIDRegistry
					.getType(McpMM.diagram.edit.parts.AgenteAgenteContextosCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, McpMM.diagram.part.McpMMVisualIDRegistry
					.getType(McpMM.diagram.edit.parts.ContextoEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case McpMM.diagram.edit.parts.ServerMCPEditPart.VISUAL_ID: {
			LinkedList<McpMM.diagram.navigator.McpMMAbstractNavigatorItem> result = new LinkedList<McpMM.diagram.navigator.McpMMAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), McpMM.diagram.part.McpMMVisualIDRegistry
					.getType(McpMM.diagram.edit.parts.ServerMCPServerMCPOperacionesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, McpMM.diagram.part.McpMMVisualIDRegistry
					.getType(McpMM.diagram.edit.parts.OperacionMCPEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case McpMM.diagram.edit.parts.WorkflowEditPart.VISUAL_ID: {
			LinkedList<McpMM.diagram.navigator.McpMMAbstractNavigatorItem> result = new LinkedList<McpMM.diagram.navigator.McpMMAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), McpMM.diagram.part.McpMMVisualIDRegistry
					.getType(McpMM.diagram.edit.parts.WorkflowWorkflowTareasCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, McpMM.diagram.part.McpMMVisualIDRegistry
					.getType(McpMM.diagram.edit.parts.TareaTransformacionDatosEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), McpMM.diagram.part.McpMMVisualIDRegistry
					.getType(McpMM.diagram.edit.parts.WorkflowWorkflowTareasCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, McpMM.diagram.part.McpMMVisualIDRegistry
					.getType(McpMM.diagram.edit.parts.TareaLLMEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), McpMM.diagram.part.McpMMVisualIDRegistry
					.getType(McpMM.diagram.edit.parts.WorkflowWorkflowTareasCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, McpMM.diagram.part.McpMMVisualIDRegistry
					.getType(McpMM.diagram.edit.parts.TareaUsuarioEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), McpMM.diagram.part.McpMMVisualIDRegistry
					.getType(McpMM.diagram.edit.parts.WorkflowWorkflowTareasCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, McpMM.diagram.part.McpMMVisualIDRegistry
					.getType(McpMM.diagram.edit.parts.TareaAnalisisEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), McpMM.diagram.part.McpMMVisualIDRegistry
					.getType(McpMM.diagram.edit.parts.WorkflowWorkflowTareasCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, McpMM.diagram.part.McpMMVisualIDRegistry
					.getType(McpMM.diagram.edit.parts.TareaEnvioContextoEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), McpMM.diagram.part.McpMMVisualIDRegistry
					.getType(McpMM.diagram.edit.parts.WorkflowWorkflowTareasCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, McpMM.diagram.part.McpMMVisualIDRegistry
					.getType(McpMM.diagram.edit.parts.TareaRecepcionContextoEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), McpMM.diagram.part.McpMMVisualIDRegistry
					.getType(McpMM.diagram.edit.parts.WorkflowWorkflowTareasCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, McpMM.diagram.part.McpMMVisualIDRegistry
					.getType(McpMM.diagram.edit.parts.TareaServerMCPEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), McpMM.diagram.part.McpMMVisualIDRegistry
					.getType(McpMM.diagram.edit.parts.WorkflowWorkflowTareasCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, McpMM.diagram.part.McpMMVisualIDRegistry
					.getType(McpMM.diagram.edit.parts.InicioEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), McpMM.diagram.part.McpMMVisualIDRegistry
					.getType(McpMM.diagram.edit.parts.WorkflowWorkflowTareasCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					McpMM.diagram.part.McpMMVisualIDRegistry.getType(McpMM.diagram.edit.parts.FinalEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case McpMM.diagram.edit.parts.TareaTransformacionDatosEditPart.VISUAL_ID: {
			LinkedList<McpMM.diagram.navigator.McpMMAbstractNavigatorItem> result = new LinkedList<McpMM.diagram.navigator.McpMMAbstractNavigatorItem>();
			Node sv = (Node) view;
			McpMM.diagram.navigator.McpMMNavigatorGroup incominglinks = new McpMM.diagram.navigator.McpMMNavigatorGroup(
					McpMM.diagram.part.Messages.NavigatorGroupName_TareaTransformacionDatos_3002_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			McpMM.diagram.navigator.McpMMNavigatorGroup outgoinglinks = new McpMM.diagram.navigator.McpMMNavigatorGroup(
					McpMM.diagram.part.Messages.NavigatorGroupName_TareaTransformacionDatos_3002_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					McpMM.diagram.part.McpMMVisualIDRegistry.getType(
							McpMM.diagram.edit.parts.TareaTransformacionDatosTareaTransformacionDatosAccionCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, McpMM.diagram.part.McpMMVisualIDRegistry
					.getType(McpMM.diagram.edit.parts.EscrituraEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					McpMM.diagram.part.McpMMVisualIDRegistry.getType(
							McpMM.diagram.edit.parts.TareaTransformacionDatosTareaTransformacionDatosAccionCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, McpMM.diagram.part.McpMMVisualIDRegistry
					.getType(McpMM.diagram.edit.parts.LecturaEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv), McpMM.diagram.part.McpMMVisualIDRegistry
					.getType(McpMM.diagram.edit.parts.TareaSigueEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv), McpMM.diagram.part.McpMMVisualIDRegistry
					.getType(McpMM.diagram.edit.parts.TareaSigueEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv), McpMM.diagram.part.McpMMVisualIDRegistry
					.getType(McpMM.diagram.edit.parts.TareaAnalisisSigueElseEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case McpMM.diagram.edit.parts.TareaLLMEditPart.VISUAL_ID: {
			LinkedList<McpMM.diagram.navigator.McpMMAbstractNavigatorItem> result = new LinkedList<McpMM.diagram.navigator.McpMMAbstractNavigatorItem>();
			Node sv = (Node) view;
			McpMM.diagram.navigator.McpMMNavigatorGroup incominglinks = new McpMM.diagram.navigator.McpMMNavigatorGroup(
					McpMM.diagram.part.Messages.NavigatorGroupName_TareaLLM_3005_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			McpMM.diagram.navigator.McpMMNavigatorGroup outgoinglinks = new McpMM.diagram.navigator.McpMMNavigatorGroup(
					McpMM.diagram.part.Messages.NavigatorGroupName_TareaLLM_3005_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), McpMM.diagram.part.McpMMVisualIDRegistry
					.getType(McpMM.diagram.edit.parts.TareaLLMTareaLLMAccionCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, McpMM.diagram.part.McpMMVisualIDRegistry
					.getType(McpMM.diagram.edit.parts.EscrituraEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), McpMM.diagram.part.McpMMVisualIDRegistry
					.getType(McpMM.diagram.edit.parts.TareaLLMTareaLLMAccionCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, McpMM.diagram.part.McpMMVisualIDRegistry
					.getType(McpMM.diagram.edit.parts.LecturaEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv), McpMM.diagram.part.McpMMVisualIDRegistry
					.getType(McpMM.diagram.edit.parts.TareaSigueEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv), McpMM.diagram.part.McpMMVisualIDRegistry
					.getType(McpMM.diagram.edit.parts.TareaSigueEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv), McpMM.diagram.part.McpMMVisualIDRegistry
					.getType(McpMM.diagram.edit.parts.TareaAnalisisSigueElseEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case McpMM.diagram.edit.parts.TareaUsuarioEditPart.VISUAL_ID: {
			LinkedList<McpMM.diagram.navigator.McpMMAbstractNavigatorItem> result = new LinkedList<McpMM.diagram.navigator.McpMMAbstractNavigatorItem>();
			Node sv = (Node) view;
			McpMM.diagram.navigator.McpMMNavigatorGroup incominglinks = new McpMM.diagram.navigator.McpMMNavigatorGroup(
					McpMM.diagram.part.Messages.NavigatorGroupName_TareaUsuario_3006_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			McpMM.diagram.navigator.McpMMNavigatorGroup outgoinglinks = new McpMM.diagram.navigator.McpMMNavigatorGroup(
					McpMM.diagram.part.Messages.NavigatorGroupName_TareaUsuario_3006_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), McpMM.diagram.part.McpMMVisualIDRegistry
					.getType(McpMM.diagram.edit.parts.TareaUsuarioTareaUsuarioAccionCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, McpMM.diagram.part.McpMMVisualIDRegistry
					.getType(McpMM.diagram.edit.parts.EscrituraEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), McpMM.diagram.part.McpMMVisualIDRegistry
					.getType(McpMM.diagram.edit.parts.TareaUsuarioTareaUsuarioAccionCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, McpMM.diagram.part.McpMMVisualIDRegistry
					.getType(McpMM.diagram.edit.parts.LecturaEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv), McpMM.diagram.part.McpMMVisualIDRegistry
					.getType(McpMM.diagram.edit.parts.TareaSigueEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv), McpMM.diagram.part.McpMMVisualIDRegistry
					.getType(McpMM.diagram.edit.parts.TareaSigueEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv), McpMM.diagram.part.McpMMVisualIDRegistry
					.getType(McpMM.diagram.edit.parts.TareaAnalisisSigueElseEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case McpMM.diagram.edit.parts.TareaAnalisisEditPart.VISUAL_ID: {
			LinkedList<McpMM.diagram.navigator.McpMMAbstractNavigatorItem> result = new LinkedList<McpMM.diagram.navigator.McpMMAbstractNavigatorItem>();
			Node sv = (Node) view;
			McpMM.diagram.navigator.McpMMNavigatorGroup incominglinks = new McpMM.diagram.navigator.McpMMNavigatorGroup(
					McpMM.diagram.part.Messages.NavigatorGroupName_TareaAnalisis_3007_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			McpMM.diagram.navigator.McpMMNavigatorGroup outgoinglinks = new McpMM.diagram.navigator.McpMMNavigatorGroup(
					McpMM.diagram.part.Messages.NavigatorGroupName_TareaAnalisis_3007_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), McpMM.diagram.part.McpMMVisualIDRegistry
					.getType(McpMM.diagram.edit.parts.TareaAnalisisTareaAnalisisAccionCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, McpMM.diagram.part.McpMMVisualIDRegistry
					.getType(McpMM.diagram.edit.parts.EscrituraEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), McpMM.diagram.part.McpMMVisualIDRegistry
					.getType(McpMM.diagram.edit.parts.TareaAnalisisTareaAnalisisAccionCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, McpMM.diagram.part.McpMMVisualIDRegistry
					.getType(McpMM.diagram.edit.parts.LecturaEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv), McpMM.diagram.part.McpMMVisualIDRegistry
					.getType(McpMM.diagram.edit.parts.TareaSigueEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv), McpMM.diagram.part.McpMMVisualIDRegistry
					.getType(McpMM.diagram.edit.parts.TareaSigueEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv), McpMM.diagram.part.McpMMVisualIDRegistry
					.getType(McpMM.diagram.edit.parts.TareaAnalisisSigueElseEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv), McpMM.diagram.part.McpMMVisualIDRegistry
					.getType(McpMM.diagram.edit.parts.TareaAnalisisSigueElseEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case McpMM.diagram.edit.parts.TareaEnvioContextoEditPart.VISUAL_ID: {
			LinkedList<McpMM.diagram.navigator.McpMMAbstractNavigatorItem> result = new LinkedList<McpMM.diagram.navigator.McpMMAbstractNavigatorItem>();
			Node sv = (Node) view;
			McpMM.diagram.navigator.McpMMNavigatorGroup incominglinks = new McpMM.diagram.navigator.McpMMNavigatorGroup(
					McpMM.diagram.part.Messages.NavigatorGroupName_TareaEnvioContexto_3008_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			McpMM.diagram.navigator.McpMMNavigatorGroup outgoinglinks = new McpMM.diagram.navigator.McpMMNavigatorGroup(
					McpMM.diagram.part.Messages.NavigatorGroupName_TareaEnvioContexto_3008_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					McpMM.diagram.part.McpMMVisualIDRegistry.getType(
							McpMM.diagram.edit.parts.TareaEnvioContextoTareaEnvioContextoAccionCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, McpMM.diagram.part.McpMMVisualIDRegistry
					.getType(McpMM.diagram.edit.parts.EscrituraEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					McpMM.diagram.part.McpMMVisualIDRegistry.getType(
							McpMM.diagram.edit.parts.TareaEnvioContextoTareaEnvioContextoAccionCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, McpMM.diagram.part.McpMMVisualIDRegistry
					.getType(McpMM.diagram.edit.parts.LecturaEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv), McpMM.diagram.part.McpMMVisualIDRegistry
					.getType(McpMM.diagram.edit.parts.TareaSigueEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv), McpMM.diagram.part.McpMMVisualIDRegistry
					.getType(McpMM.diagram.edit.parts.TareaSigueEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv), McpMM.diagram.part.McpMMVisualIDRegistry
					.getType(McpMM.diagram.edit.parts.TareaAnalisisSigueElseEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case McpMM.diagram.edit.parts.TareaRecepcionContextoEditPart.VISUAL_ID: {
			LinkedList<McpMM.diagram.navigator.McpMMAbstractNavigatorItem> result = new LinkedList<McpMM.diagram.navigator.McpMMAbstractNavigatorItem>();
			Node sv = (Node) view;
			McpMM.diagram.navigator.McpMMNavigatorGroup incominglinks = new McpMM.diagram.navigator.McpMMNavigatorGroup(
					McpMM.diagram.part.Messages.NavigatorGroupName_TareaRecepcionContexto_3009_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			McpMM.diagram.navigator.McpMMNavigatorGroup outgoinglinks = new McpMM.diagram.navigator.McpMMNavigatorGroup(
					McpMM.diagram.part.Messages.NavigatorGroupName_TareaRecepcionContexto_3009_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					McpMM.diagram.part.McpMMVisualIDRegistry.getType(
							McpMM.diagram.edit.parts.TareaRecepcionContextoTareaRecepcionContextoAccionCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, McpMM.diagram.part.McpMMVisualIDRegistry
					.getType(McpMM.diagram.edit.parts.EscrituraEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					McpMM.diagram.part.McpMMVisualIDRegistry.getType(
							McpMM.diagram.edit.parts.TareaRecepcionContextoTareaRecepcionContextoAccionCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, McpMM.diagram.part.McpMMVisualIDRegistry
					.getType(McpMM.diagram.edit.parts.LecturaEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv), McpMM.diagram.part.McpMMVisualIDRegistry
					.getType(McpMM.diagram.edit.parts.TareaSigueEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv), McpMM.diagram.part.McpMMVisualIDRegistry
					.getType(McpMM.diagram.edit.parts.TareaSigueEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv), McpMM.diagram.part.McpMMVisualIDRegistry
					.getType(McpMM.diagram.edit.parts.TareaAnalisisSigueElseEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case McpMM.diagram.edit.parts.TareaServerMCPEditPart.VISUAL_ID: {
			LinkedList<McpMM.diagram.navigator.McpMMAbstractNavigatorItem> result = new LinkedList<McpMM.diagram.navigator.McpMMAbstractNavigatorItem>();
			Node sv = (Node) view;
			McpMM.diagram.navigator.McpMMNavigatorGroup incominglinks = new McpMM.diagram.navigator.McpMMNavigatorGroup(
					McpMM.diagram.part.Messages.NavigatorGroupName_TareaServerMCP_3010_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			McpMM.diagram.navigator.McpMMNavigatorGroup outgoinglinks = new McpMM.diagram.navigator.McpMMNavigatorGroup(
					McpMM.diagram.part.Messages.NavigatorGroupName_TareaServerMCP_3010_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), McpMM.diagram.part.McpMMVisualIDRegistry
					.getType(McpMM.diagram.edit.parts.TareaServerMCPTareaServerMCPAccionCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, McpMM.diagram.part.McpMMVisualIDRegistry
					.getType(McpMM.diagram.edit.parts.EscrituraEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), McpMM.diagram.part.McpMMVisualIDRegistry
					.getType(McpMM.diagram.edit.parts.TareaServerMCPTareaServerMCPAccionCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, McpMM.diagram.part.McpMMVisualIDRegistry
					.getType(McpMM.diagram.edit.parts.LecturaEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv), McpMM.diagram.part.McpMMVisualIDRegistry
					.getType(McpMM.diagram.edit.parts.TareaSigueEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv), McpMM.diagram.part.McpMMVisualIDRegistry
					.getType(McpMM.diagram.edit.parts.TareaSigueEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv), McpMM.diagram.part.McpMMVisualIDRegistry
					.getType(McpMM.diagram.edit.parts.TareaAnalisisSigueElseEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv), McpMM.diagram.part.McpMMVisualIDRegistry
					.getType(McpMM.diagram.edit.parts.TareaServerMCPEjecutaOperacionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case McpMM.diagram.edit.parts.InicioEditPart.VISUAL_ID: {
			LinkedList<McpMM.diagram.navigator.McpMMAbstractNavigatorItem> result = new LinkedList<McpMM.diagram.navigator.McpMMAbstractNavigatorItem>();
			Node sv = (Node) view;
			McpMM.diagram.navigator.McpMMNavigatorGroup incominglinks = new McpMM.diagram.navigator.McpMMNavigatorGroup(
					McpMM.diagram.part.Messages.NavigatorGroupName_Inicio_3011_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			McpMM.diagram.navigator.McpMMNavigatorGroup outgoinglinks = new McpMM.diagram.navigator.McpMMNavigatorGroup(
					McpMM.diagram.part.Messages.NavigatorGroupName_Inicio_3011_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), McpMM.diagram.part.McpMMVisualIDRegistry
					.getType(McpMM.diagram.edit.parts.InicioInicioAccionCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, McpMM.diagram.part.McpMMVisualIDRegistry
					.getType(McpMM.diagram.edit.parts.EscrituraEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), McpMM.diagram.part.McpMMVisualIDRegistry
					.getType(McpMM.diagram.edit.parts.InicioInicioAccionCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, McpMM.diagram.part.McpMMVisualIDRegistry
					.getType(McpMM.diagram.edit.parts.LecturaEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv), McpMM.diagram.part.McpMMVisualIDRegistry
					.getType(McpMM.diagram.edit.parts.TareaSigueEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv), McpMM.diagram.part.McpMMVisualIDRegistry
					.getType(McpMM.diagram.edit.parts.TareaSigueEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv), McpMM.diagram.part.McpMMVisualIDRegistry
					.getType(McpMM.diagram.edit.parts.TareaAnalisisSigueElseEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case McpMM.diagram.edit.parts.FinalEditPart.VISUAL_ID: {
			LinkedList<McpMM.diagram.navigator.McpMMAbstractNavigatorItem> result = new LinkedList<McpMM.diagram.navigator.McpMMAbstractNavigatorItem>();
			Node sv = (Node) view;
			McpMM.diagram.navigator.McpMMNavigatorGroup incominglinks = new McpMM.diagram.navigator.McpMMNavigatorGroup(
					McpMM.diagram.part.Messages.NavigatorGroupName_Final_3012_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			McpMM.diagram.navigator.McpMMNavigatorGroup outgoinglinks = new McpMM.diagram.navigator.McpMMNavigatorGroup(
					McpMM.diagram.part.Messages.NavigatorGroupName_Final_3012_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), McpMM.diagram.part.McpMMVisualIDRegistry
					.getType(McpMM.diagram.edit.parts.FinalFinalAccionCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, McpMM.diagram.part.McpMMVisualIDRegistry
					.getType(McpMM.diagram.edit.parts.EscrituraEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), McpMM.diagram.part.McpMMVisualIDRegistry
					.getType(McpMM.diagram.edit.parts.FinalFinalAccionCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, McpMM.diagram.part.McpMMVisualIDRegistry
					.getType(McpMM.diagram.edit.parts.LecturaEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv), McpMM.diagram.part.McpMMVisualIDRegistry
					.getType(McpMM.diagram.edit.parts.TareaSigueEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv), McpMM.diagram.part.McpMMVisualIDRegistry
					.getType(McpMM.diagram.edit.parts.TareaSigueEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv), McpMM.diagram.part.McpMMVisualIDRegistry
					.getType(McpMM.diagram.edit.parts.TareaAnalisisSigueElseEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case McpMM.diagram.edit.parts.ContextoEditPart.VISUAL_ID: {
			LinkedList<McpMM.diagram.navigator.McpMMAbstractNavigatorItem> result = new LinkedList<McpMM.diagram.navigator.McpMMAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), McpMM.diagram.part.McpMMVisualIDRegistry
					.getType(McpMM.diagram.edit.parts.ContextoContextoPropiedadesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, McpMM.diagram.part.McpMMVisualIDRegistry
					.getType(McpMM.diagram.edit.parts.PropiedadEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case McpMM.diagram.edit.parts.OperacionMCPEditPart.VISUAL_ID: {
			LinkedList<McpMM.diagram.navigator.McpMMAbstractNavigatorItem> result = new LinkedList<McpMM.diagram.navigator.McpMMAbstractNavigatorItem>();
			Node sv = (Node) view;
			McpMM.diagram.navigator.McpMMNavigatorGroup incominglinks = new McpMM.diagram.navigator.McpMMNavigatorGroup(
					McpMM.diagram.part.Messages.NavigatorGroupName_OperacionMCP_3015_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv), McpMM.diagram.part.McpMMVisualIDRegistry
					.getType(McpMM.diagram.edit.parts.TareaServerMCPEjecutaOperacionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case McpMM.diagram.edit.parts.TareaSigueEditPart.VISUAL_ID: {
			LinkedList<McpMM.diagram.navigator.McpMMAbstractNavigatorItem> result = new LinkedList<McpMM.diagram.navigator.McpMMAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			McpMM.diagram.navigator.McpMMNavigatorGroup target = new McpMM.diagram.navigator.McpMMNavigatorGroup(
					McpMM.diagram.part.Messages.NavigatorGroupName_TareaSigue_4001_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			McpMM.diagram.navigator.McpMMNavigatorGroup source = new McpMM.diagram.navigator.McpMMNavigatorGroup(
					McpMM.diagram.part.Messages.NavigatorGroupName_TareaSigue_4001_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv), McpMM.diagram.part.McpMMVisualIDRegistry
					.getType(McpMM.diagram.edit.parts.TareaTransformacionDatosEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv), McpMM.diagram.part.McpMMVisualIDRegistry
					.getType(McpMM.diagram.edit.parts.TareaLLMEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv), McpMM.diagram.part.McpMMVisualIDRegistry
					.getType(McpMM.diagram.edit.parts.TareaUsuarioEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv), McpMM.diagram.part.McpMMVisualIDRegistry
					.getType(McpMM.diagram.edit.parts.TareaAnalisisEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv), McpMM.diagram.part.McpMMVisualIDRegistry
					.getType(McpMM.diagram.edit.parts.TareaEnvioContextoEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv), McpMM.diagram.part.McpMMVisualIDRegistry
					.getType(McpMM.diagram.edit.parts.TareaRecepcionContextoEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv), McpMM.diagram.part.McpMMVisualIDRegistry
					.getType(McpMM.diagram.edit.parts.TareaServerMCPEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv), McpMM.diagram.part.McpMMVisualIDRegistry
					.getType(McpMM.diagram.edit.parts.InicioEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					McpMM.diagram.part.McpMMVisualIDRegistry.getType(McpMM.diagram.edit.parts.FinalEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv), McpMM.diagram.part.McpMMVisualIDRegistry
					.getType(McpMM.diagram.edit.parts.TareaTransformacionDatosEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv), McpMM.diagram.part.McpMMVisualIDRegistry
					.getType(McpMM.diagram.edit.parts.TareaLLMEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv), McpMM.diagram.part.McpMMVisualIDRegistry
					.getType(McpMM.diagram.edit.parts.TareaUsuarioEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv), McpMM.diagram.part.McpMMVisualIDRegistry
					.getType(McpMM.diagram.edit.parts.TareaAnalisisEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv), McpMM.diagram.part.McpMMVisualIDRegistry
					.getType(McpMM.diagram.edit.parts.TareaEnvioContextoEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv), McpMM.diagram.part.McpMMVisualIDRegistry
					.getType(McpMM.diagram.edit.parts.TareaRecepcionContextoEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv), McpMM.diagram.part.McpMMVisualIDRegistry
					.getType(McpMM.diagram.edit.parts.TareaServerMCPEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv), McpMM.diagram.part.McpMMVisualIDRegistry
					.getType(McpMM.diagram.edit.parts.InicioEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					McpMM.diagram.part.McpMMVisualIDRegistry.getType(McpMM.diagram.edit.parts.FinalEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case McpMM.diagram.edit.parts.TareaAnalisisSigueElseEditPart.VISUAL_ID: {
			LinkedList<McpMM.diagram.navigator.McpMMAbstractNavigatorItem> result = new LinkedList<McpMM.diagram.navigator.McpMMAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			McpMM.diagram.navigator.McpMMNavigatorGroup target = new McpMM.diagram.navigator.McpMMNavigatorGroup(
					McpMM.diagram.part.Messages.NavigatorGroupName_TareaAnalisisSigueElse_4002_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			McpMM.diagram.navigator.McpMMNavigatorGroup source = new McpMM.diagram.navigator.McpMMNavigatorGroup(
					McpMM.diagram.part.Messages.NavigatorGroupName_TareaAnalisisSigueElse_4002_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv), McpMM.diagram.part.McpMMVisualIDRegistry
					.getType(McpMM.diagram.edit.parts.TareaTransformacionDatosEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv), McpMM.diagram.part.McpMMVisualIDRegistry
					.getType(McpMM.diagram.edit.parts.TareaLLMEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv), McpMM.diagram.part.McpMMVisualIDRegistry
					.getType(McpMM.diagram.edit.parts.TareaUsuarioEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv), McpMM.diagram.part.McpMMVisualIDRegistry
					.getType(McpMM.diagram.edit.parts.TareaAnalisisEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv), McpMM.diagram.part.McpMMVisualIDRegistry
					.getType(McpMM.diagram.edit.parts.TareaEnvioContextoEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv), McpMM.diagram.part.McpMMVisualIDRegistry
					.getType(McpMM.diagram.edit.parts.TareaRecepcionContextoEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv), McpMM.diagram.part.McpMMVisualIDRegistry
					.getType(McpMM.diagram.edit.parts.TareaServerMCPEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv), McpMM.diagram.part.McpMMVisualIDRegistry
					.getType(McpMM.diagram.edit.parts.InicioEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					McpMM.diagram.part.McpMMVisualIDRegistry.getType(McpMM.diagram.edit.parts.FinalEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv), McpMM.diagram.part.McpMMVisualIDRegistry
					.getType(McpMM.diagram.edit.parts.TareaAnalisisEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case McpMM.diagram.edit.parts.TareaServerMCPEjecutaOperacionEditPart.VISUAL_ID: {
			LinkedList<McpMM.diagram.navigator.McpMMAbstractNavigatorItem> result = new LinkedList<McpMM.diagram.navigator.McpMMAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			McpMM.diagram.navigator.McpMMNavigatorGroup target = new McpMM.diagram.navigator.McpMMNavigatorGroup(
					McpMM.diagram.part.Messages.NavigatorGroupName_TareaServerMCPEjecutaOperacion_4003_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			McpMM.diagram.navigator.McpMMNavigatorGroup source = new McpMM.diagram.navigator.McpMMNavigatorGroup(
					McpMM.diagram.part.Messages.NavigatorGroupName_TareaServerMCPEjecutaOperacion_4003_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv), McpMM.diagram.part.McpMMVisualIDRegistry
					.getType(McpMM.diagram.edit.parts.OperacionMCPEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv), McpMM.diagram.part.McpMMVisualIDRegistry
					.getType(McpMM.diagram.edit.parts.TareaServerMCPEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}
		}
		return EMPTY_ARRAY;
	}

	/**
	* @generated
	*/
	private Collection<View> getLinksSourceByType(Collection<Edge> edges, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeSource = nextEdge.getSource();
			if (type.equals(nextEdgeSource.getType()) && isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksTargetByType(Collection<Edge> edges, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeTarget = nextEdge.getTarget();
			if (type.equals(nextEdgeTarget.getType()) && isOwnView(nextEdgeTarget)) {
				result.add(nextEdgeTarget);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getOutgoingLinksByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getIncomingLinksByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getChildrenByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getChildren(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getDiagramLinksByType(Collection<Diagram> diagrams, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (Diagram nextDiagram : diagrams) {
			result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
		}
		return result;
	}

	// TODO refactor as static method
	/**
	 * @generated
	 */
	private Collection<View> selectViewsByType(Collection<View> views, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (View nextView : views) {
			if (type.equals(nextView.getType()) && isOwnView(nextView)) {
				result.add(nextView);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return McpMM.diagram.edit.parts.ServiceMCPEditPart.MODEL_ID
				.equals(McpMM.diagram.part.McpMMVisualIDRegistry.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<McpMM.diagram.navigator.McpMMNavigatorItem> createNavigatorItems(Collection<View> views,
			Object parent, boolean isLeafs) {
		ArrayList<McpMM.diagram.navigator.McpMMNavigatorItem> result = new ArrayList<McpMM.diagram.navigator.McpMMNavigatorItem>(
				views.size());
		for (View nextView : views) {
			result.add(new McpMM.diagram.navigator.McpMMNavigatorItem(nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<McpMM.diagram.navigator.McpMMNavigatorItem> getForeignShortcuts(Diagram diagram, Object parent) {
		LinkedList<View> result = new LinkedList<View>();
		for (Iterator<View> it = diagram.getChildren().iterator(); it.hasNext();) {
			View nextView = it.next();
			if (!isOwnView(nextView) && nextView.getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				result.add(nextView);
			}
		}
		return createNavigatorItems(result, parent, false);
	}

	/**
	* @generated
	*/
	public Object getParent(Object element) {
		if (element instanceof McpMM.diagram.navigator.McpMMAbstractNavigatorItem) {
			McpMM.diagram.navigator.McpMMAbstractNavigatorItem abstractNavigatorItem = (McpMM.diagram.navigator.McpMMAbstractNavigatorItem) element;
			return abstractNavigatorItem.getParent();
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean hasChildren(Object element) {
		return element instanceof IFile || getChildren(element).length > 0;
	}

}
