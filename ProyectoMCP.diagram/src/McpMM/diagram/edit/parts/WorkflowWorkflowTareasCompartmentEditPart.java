/*
 * 
 */
package McpMM.diagram.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ResizableCompartmentEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateUnspecifiedTypeConnectionRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.RequestConstants;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.policies.reparent.CreationEditPolicyWithCustomReparent;

/**
 * @generated
 */
public class WorkflowWorkflowTareasCompartmentEditPart extends ShapeCompartmentEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 7004;

	/**
	* @generated
	*/
	public WorkflowWorkflowTareasCompartmentEditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	public String getCompartmentName() {
		return McpMM.diagram.part.Messages.WorkflowWorkflowTareasCompartmentEditPart_title;
	}

	/**
	* @generated
	*/
	public IFigure createFigure() {
		ResizableCompartmentFigure result = (ResizableCompartmentFigure) super.createFigure();
		result.setTitleVisibility(false);
		return result;
	}

	/**
	* @generated
	*/
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE, new ResizableCompartmentEditPolicy());
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new McpMM.diagram.edit.policies.WorkflowWorkflowTareasCompartmentItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicyWithCustomReparent(McpMM.diagram.part.McpMMVisualIDRegistry.TYPED_INSTANCE));
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE, new DragDropEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new McpMM.diagram.edit.policies.WorkflowWorkflowTareasCompartmentCanonicalEditPolicy());
	}

	/**
	* @generated
	*/
	protected void setRatio(Double ratio) {
		if (getFigure().getParent().getLayoutManager() instanceof ConstrainedToolbarLayout) {
			super.setRatio(ratio);
		}
	}

	/**
	* @generated
	*/
	public EditPart getTargetEditPart(Request request) {
		if (request instanceof CreateViewAndElementRequest) {
			CreateElementRequestAdapter adapter = ((CreateViewAndElementRequest) request).getViewAndElementDescriptor()
					.getCreateElementRequestAdapter();
			IElementType type = (IElementType) adapter.getAdapter(IElementType.class);
			if (type == McpMM.diagram.providers.McpMMElementTypes.TareaTransformacionDatos_3004) {
				return this;
			}
			if (type == McpMM.diagram.providers.McpMMElementTypes.TareaLLM_3007) {
				return this;
			}
			if (type == McpMM.diagram.providers.McpMMElementTypes.TareaUsuario_3008) {
				return this;
			}
			if (type == McpMM.diagram.providers.McpMMElementTypes.TareaAnalisis_3009) {
				return this;
			}
			if (type == McpMM.diagram.providers.McpMMElementTypes.TareaEnvioContexto_3010) {
				return this;
			}
			if (type == McpMM.diagram.providers.McpMMElementTypes.TareaRecepcionContexto_3011) {
				return this;
			}
			if (type == McpMM.diagram.providers.McpMMElementTypes.TareaServerMCP_3012) {
				return this;
			}
			if (type == McpMM.diagram.providers.McpMMElementTypes.Inicio_3013) {
				return this;
			}
			if (type == McpMM.diagram.providers.McpMMElementTypes.Final_3014) {
				return this;
			}
			return getParent().getTargetEditPart(request);
		}
		if (request instanceof CreateUnspecifiedTypeConnectionRequest) {
			if (RequestConstants.REQ_CONNECTION_END.equals(request.getType())) {
				for (Object type : ((CreateUnspecifiedTypeConnectionRequest) request).getElementTypes()) {
					if (type instanceof IElementType) {
						IElementType elementType = (IElementType) type;
						if (elementType.equals(McpMM.diagram.providers.McpMMElementTypes.AgenteTareas_4001)
								|| elementType.equals(McpMM.diagram.providers.McpMMElementTypes.TareaSigue_4002)
								|| elementType
										.equals(McpMM.diagram.providers.McpMMElementTypes.TareaAnalisisSigueElse_4003))
							return super.getTargetEditPart(request);
					}
				}
			}
			return getParent().getTargetEditPart(request);
		}
		return super.getTargetEditPart(request);
	}

}
