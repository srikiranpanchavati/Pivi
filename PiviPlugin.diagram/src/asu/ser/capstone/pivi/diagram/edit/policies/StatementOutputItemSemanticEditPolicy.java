package asu.ser.capstone.pivi.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;

import asu.ser.capstone.pivi.diagram.edit.commands.EndStatementOutputCreateCommand;
import asu.ser.capstone.pivi.diagram.edit.commands.EndStatementOutputReorientCommand;
import asu.ser.capstone.pivi.diagram.edit.parts.EndStatementOutputEditPart;
import asu.ser.capstone.pivi.diagram.providers.PiviElementTypes;

/**
 * @generated
 */
public class StatementOutputItemSemanticEditPolicy extends PiviBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public StatementOutputItemSemanticEditPolicy() {
		super(PiviElementTypes.StatementOutput_4001);
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
		if (PiviElementTypes.EndStatementOutput_4004 == req.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (PiviElementTypes.EndStatementOutput_4004 == req.getElementType()) {
			return getGEFWrapper(new EndStatementOutputCreateCommand(req, req.getSource(), req.getTarget()));
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
		case EndStatementOutputEditPart.VISUAL_ID:
			return getGEFWrapper(new EndStatementOutputReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
