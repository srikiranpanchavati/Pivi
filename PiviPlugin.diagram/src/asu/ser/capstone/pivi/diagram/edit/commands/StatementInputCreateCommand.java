package asu.ser.capstone.pivi.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;

import asu.ser.capstone.pivi.PiviFactory;
import asu.ser.capstone.pivi.Statement;
import asu.ser.capstone.pivi.StatementInput;
import asu.ser.capstone.pivi.diagram.edit.policies.PiviBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class StatementInputCreateCommand extends EditElementCommand {

	/**
	* @generated
	*/
	private final EObject source;

	/**
	* @generated
	*/
	private final EObject target;

	/**
	* @generated
	*/
	public StatementInputCreateCommand(CreateRelationshipRequest request, EObject source, EObject target) {
		super(request.getLabel(), null, request);
		this.source = source;
		this.target = target;
	}

	/**
	* @generated
	*/
	public boolean canExecute() {
		if (source == null && target == null) {
			return false;
		}
		if (source != null && false == source instanceof Statement) {
			return false;
		}
		if (target != null && false == target instanceof Statement) {
			return false;
		}
		if (getSource() == null) {
			return true; // link creation is in progress; source is not defined yet
		}
		// target may be null here but it's possible to check constraint
		return PiviBaseItemSemanticEditPolicy.getLinkConstraints().canCreateStatementInput_4002(getSource(),
				getTarget());
	}

	/**
	* @generated
	*/
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException("Invalid arguments in create link command"); //$NON-NLS-1$
		}

		StatementInput newElement = PiviFactory.eINSTANCE.createStatementInput();
		getSource().getInputs().add(newElement);
		newElement.setStatement(getTarget());
		doConfigure(newElement, monitor, info);
		((CreateElementRequest) getRequest()).setNewElement(newElement);
		return CommandResult.newOKCommandResult(newElement);

	}

	/**
	* @generated
	*/
	protected void doConfigure(StatementInput newElement, IProgressMonitor monitor, IAdaptable info)
			throws ExecutionException {
		IElementType elementType = ((CreateElementRequest) getRequest()).getElementType();
		ConfigureRequest configureRequest = new ConfigureRequest(getEditingDomain(), newElement, elementType);
		configureRequest.setClientContext(((CreateElementRequest) getRequest()).getClientContext());
		configureRequest.addParameters(getRequest().getParameters());
		configureRequest.setParameter(CreateRelationshipRequest.SOURCE, getSource());
		configureRequest.setParameter(CreateRelationshipRequest.TARGET, getTarget());
		ICommand configureCommand = elementType.getEditCommand(configureRequest);
		if (configureCommand != null && configureCommand.canExecute()) {
			configureCommand.execute(monitor, info);
		}
	}

	/**
	* @generated
	*/
	protected void setElementToEdit(EObject element) {
		throw new UnsupportedOperationException();
	}

	/**
	* @generated
	*/
	protected Statement getSource() {
		return (Statement) source;
	}

	/**
	* @generated
	*/
	protected Statement getTarget() {
		return (Statement) target;
	}

}
