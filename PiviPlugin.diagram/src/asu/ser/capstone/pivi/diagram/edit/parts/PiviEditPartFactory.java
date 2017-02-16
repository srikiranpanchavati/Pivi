package asu.ser.capstone.pivi.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry;

/**
 * @generated
 */
public class PiviEditPartFactory implements EditPartFactory {

	/**
	* @generated
	*/
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (PiviVisualIDRegistry.getVisualID(view)) {

			case ProgramDiagramEditPart.VISUAL_ID:
				return new ProgramDiagramEditPart(view);

			case IfStatementEditPart.VISUAL_ID:
				return new IfStatementEditPart(view);

			case InstructionStatementEditPart.VISUAL_ID:
				return new InstructionStatementEditPart(view);

			case WhileStatementEditPart.VISUAL_ID:
				return new WhileStatementEditPart(view);

			case StartEditPart.VISUAL_ID:
				return new StartEditPart(view);

			case EndEditPart.VISUAL_ID:
				return new EndEditPart(view);

			case StatementOutputEditPart.VISUAL_ID:
				return new StatementOutputEditPart(view);

			case StatementInputEditPart.VISUAL_ID:
				return new StatementInputEditPart(view);

			case StartInputsEditPart.VISUAL_ID:
				return new StartInputsEditPart(view);

			case EndStatementOutputEditPart.VISUAL_ID:
				return new EndStatementOutputEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	* @generated
	*/
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	* @generated
	*/
	public static CellEditorLocator getTextCellEditorLocator(ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE.getTextCellEditorLocator(source);
	}

}
