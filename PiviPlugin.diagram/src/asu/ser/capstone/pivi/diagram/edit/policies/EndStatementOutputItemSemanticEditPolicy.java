package asu.ser.capstone.pivi.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

import asu.ser.capstone.pivi.diagram.providers.PiviElementTypes;

/**
 * @generated
 */
public class EndStatementOutputItemSemanticEditPolicy extends PiviBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public EndStatementOutputItemSemanticEditPolicy() {
		super(PiviElementTypes.EndStatementOutput_4004);
	}

	/**
	* @generated
	*/
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
