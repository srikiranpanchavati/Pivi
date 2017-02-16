package asu.ser.capstone.pivi.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import asu.ser.capstone.pivi.diagram.edit.parts.IfStatementEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.InstructionStatementEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.WhileStatementEditPart;
import asu.ser.capstone.pivi.diagram.providers.PiviElementTypes;
import asu.ser.capstone.pivi.diagram.providers.PiviModelingAssistantProvider;

/**
 * @generated
 */
public class PiviModelingAssistantProviderOfWhileStatementEditPart extends PiviModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((WhileStatementEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(WhileStatementEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(PiviElementTypes.StatementOutput_4001);
		types.add(PiviElementTypes.StatementInput_4002);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((WhileStatementEditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(WhileStatementEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof IfStatementEditPart) {
			types.add(PiviElementTypes.StatementOutput_4001);
		}
		if (targetEditPart instanceof InstructionStatementEditPart) {
			types.add(PiviElementTypes.StatementOutput_4001);
		}
		if (targetEditPart instanceof WhileStatementEditPart) {
			types.add(PiviElementTypes.StatementOutput_4001);
		}
		if (targetEditPart instanceof IfStatementEditPart) {
			types.add(PiviElementTypes.StatementInput_4002);
		}
		if (targetEditPart instanceof InstructionStatementEditPart) {
			types.add(PiviElementTypes.StatementInput_4002);
		}
		if (targetEditPart instanceof WhileStatementEditPart) {
			types.add(PiviElementTypes.StatementInput_4002);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((WhileStatementEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(WhileStatementEditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == PiviElementTypes.StatementOutput_4001) {
			types.add(PiviElementTypes.IfStatement_2001);
			types.add(PiviElementTypes.InstructionStatement_2002);
			types.add(PiviElementTypes.WhileStatement_2003);
		} else if (relationshipType == PiviElementTypes.StatementInput_4002) {
			types.add(PiviElementTypes.IfStatement_2001);
			types.add(PiviElementTypes.InstructionStatement_2002);
			types.add(PiviElementTypes.WhileStatement_2003);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((WhileStatementEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(WhileStatementEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(PiviElementTypes.StatementOutput_4001);
		types.add(PiviElementTypes.StatementInput_4002);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((WhileStatementEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(WhileStatementEditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == PiviElementTypes.StatementOutput_4001) {
			types.add(PiviElementTypes.IfStatement_2001);
			types.add(PiviElementTypes.InstructionStatement_2002);
			types.add(PiviElementTypes.WhileStatement_2003);
		} else if (relationshipType == PiviElementTypes.StatementInput_4002) {
			types.add(PiviElementTypes.IfStatement_2001);
			types.add(PiviElementTypes.InstructionStatement_2002);
			types.add(PiviElementTypes.WhileStatement_2003);
		}
		return types;
	}

}
