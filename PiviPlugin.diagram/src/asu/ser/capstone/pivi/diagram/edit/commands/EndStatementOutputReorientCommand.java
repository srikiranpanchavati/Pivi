package asu.ser.capstone.pivi.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import asu.ser.capstone.pivi.End;
import asu.ser.capstone.pivi.StatementOutput;
import asu.ser.capstone.pivi.diagram.edit.policies.PiviBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class EndStatementOutputReorientCommand extends EditElementCommand {

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
	public EndStatementOutputReorientCommand(ReorientReferenceRelationshipRequest request) {
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
		if (false == referenceOwner instanceof End) {
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
		if (!(oldEnd instanceof StatementOutput && newEnd instanceof End)) {
			return false;
		}
		return PiviBaseItemSemanticEditPolicy.getLinkConstraints().canExistEndStatementOutput_4004(getNewSource(),
				getOldTarget());
	}

	/**
	* @generated
	*/
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof StatementOutput && newEnd instanceof StatementOutput)) {
			return false;
		}
		return PiviBaseItemSemanticEditPolicy.getLinkConstraints().canExistEndStatementOutput_4004(getOldSource(),
				getNewTarget());
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
		getOldSource().getStatementOutput().remove(getOldTarget());
		getNewSource().getStatementOutput().add(getOldTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	* @generated
	*/
	protected CommandResult reorientTarget() throws ExecutionException {
		getOldSource().getStatementOutput().remove(getOldTarget());
		getOldSource().getStatementOutput().add(getNewTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	* @generated
	*/
	protected End getOldSource() {
		return (End) referenceOwner;
	}

	/**
	* @generated
	*/
	protected End getNewSource() {
		return (End) newEnd;
	}

	/**
	* @generated
	*/
	protected StatementOutput getOldTarget() {
		return (StatementOutput) oldEnd;
	}

	/**
	* @generated
	*/
	protected StatementOutput getNewTarget() {
		return (StatementOutput) newEnd;
	}
}
