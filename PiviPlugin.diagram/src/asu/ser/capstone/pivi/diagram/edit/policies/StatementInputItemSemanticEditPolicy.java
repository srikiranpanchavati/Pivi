package asu.ser.capstone.pivi.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;

import asu.ser.capstone.pivi.diagram.edit.commands.StartInputsCreateCommand;
import asu.ser.capstone.pivi.diagram.edit.commands.StartInputsReorientCommand;
import asu.ser.capstone.pivi.diagram.edit.parts.StartInputsEditPart;
import asu.ser.capstone.pivi.diagram.providers.PiviElementTypes;

/**
 * @generated
 */
public class StatementInputItemSemanticEditPolicy extends PiviBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public StatementInputItemSemanticEditPolicy() {
		super(PiviElementTypes.StatementInput_4002);
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (PiviElementTypes.StartInputs_4003 == req.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (PiviElementTypes.StartInputs_4003 == req.getElementType()) {
			return getGEFWrapper(new StartInputsCreateCommand(req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EReference based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(ReorientReferenceRelationshipRequest req) {
		switch (getVisualID(req)) {
		case StartInputsEditPart.VISUAL_ID:
			return getGEFWrapper(new StartInputsReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
