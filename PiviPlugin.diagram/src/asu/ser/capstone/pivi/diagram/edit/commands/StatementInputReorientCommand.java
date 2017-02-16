package asu.ser.capstone.pivi.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import asu.ser.capstone.pivi.Statement;
import asu.ser.capstone.pivi.StatementInput;
import asu.ser.capstone.pivi.diagram.edit.policies.PiviBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class StatementInputReorientCommand extends EditElementCommand {

	/**
	* @generated
	*/
	private final int reorientDirection;

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
	public StatementInputReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	* @generated
	*/
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof StatementInput) {
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
		if (!(oldEnd instanceof Statement && newEnd instanceof Statement)) {
			return false;
		}
		Statement target = getLink().getStatement();
		return PiviBaseItemSemanticEditPolicy.getLinkConstraints().canExistStatementInput_4002(getLink(),
				getNewSource(), target);
	}

	/**
	* @generated
	*/
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Statement && newEnd instanceof Statement)) {
			return false;
		}
		if (!(getLink().eContainer() instanceof Statement)) {
			return false;
		}
		Statement source = (Statement) getLink().eContainer();
		return PiviBaseItemSemanticEditPolicy.getLinkConstraints().canExistStatementInput_4002(getLink(), source,
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
		getOldSource().getInputs().remove(getLink());
		getNewSource().getInputs().add(getLink());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	* @generated
	*/
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setStatement(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	* @generated
	*/
	protected StatementInput getLink() {
		return (StatementInput) getElementToEdit();
	}

	/**
	* @generated
	*/
	protected Statement getOldSource() {
		return (Statement) oldEnd;
	}

	/**
	* @generated
	*/
	protected Statement getNewSource() {
		return (Statement) newEnd;
	}

	/**
	* @generated
	*/
	protected Statement getOldTarget() {
		return (Statement) oldEnd;
	}

	/**
	* @generated
	*/
	protected Statement getNewTarget() {
		return (Statement) newEnd;
	}
}
