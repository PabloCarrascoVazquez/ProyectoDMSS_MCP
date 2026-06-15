/*
 * 
 */
package McpMM.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

/**
 * @generated
 */
public class TareaServerMCPEjecutaOperacionReorientCommand extends EditElementCommand {

	/**
	* @generated
	*/
	private final int reorientDirection;

	/**
	* @generated
	*/
	private final EObject referenceOwner;

	/**
	* @generated
	*/
	private final EObject oldEnd;

	/**
	* @generated
	*/
	private final EObject newEnd;

	/**
	* @generated
	*/
	public TareaServerMCPEjecutaOperacionReorientCommand(ReorientReferenceRelationshipRequest request) {
		super(request.getLabel(), null, request);
		reorientDirection = request.getDirection();
		referenceOwner = request.getReferenceOwner();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	* @generated
	*/
	public boolean canExecute() {
		if (false == referenceOwner instanceof McpMM.TareaServerMCP) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	* @generated
	*/
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof McpMM.OperacionMCP && newEnd instanceof McpMM.TareaServerMCP)) {
			return false;
		}
		return McpMM.diagram.edit.policies.McpMMBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistTareaServerMCPEjecutaOperacion_4004(getNewSource(), getOldTarget());
	}

	/**
	* @generated
	*/
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof McpMM.OperacionMCP && newEnd instanceof McpMM.OperacionMCP)) {
			return false;
		}
		return McpMM.diagram.edit.policies.McpMMBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistTareaServerMCPEjecutaOperacion_4004(getOldSource(), getNewTarget());
	}

	/**
	* @generated
	*/
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException("Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	* @generated
	*/
	protected CommandResult reorientSource() throws ExecutionException {
		getOldSource().setEjecutaOperacion(null);
		getNewSource().setEjecutaOperacion(getOldTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	* @generated
	*/
	protected CommandResult reorientTarget() throws ExecutionException {
		getOldSource().setEjecutaOperacion(getNewTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	* @generated
	*/
	protected McpMM.TareaServerMCP getOldSource() {
		return (McpMM.TareaServerMCP) referenceOwner;
	}

	/**
	* @generated
	*/
	protected McpMM.TareaServerMCP getNewSource() {
		return (McpMM.TareaServerMCP) newEnd;
	}

	/**
	* @generated
	*/
	protected McpMM.OperacionMCP getOldTarget() {
		return (McpMM.OperacionMCP) oldEnd;
	}

	/**
	* @generated
	*/
	protected McpMM.OperacionMCP getNewTarget() {
		return (McpMM.OperacionMCP) newEnd;
	}
}
