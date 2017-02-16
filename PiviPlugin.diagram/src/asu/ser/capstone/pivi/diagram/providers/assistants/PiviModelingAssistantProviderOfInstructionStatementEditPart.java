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
public class PiviModelingAssistantProviderOfInstructionStatementEditPart extends PiviModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((InstructionStatementEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(InstructionStatementEditPart source) {
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
		return doGetRelTypesOnSourceAndTarget((InstructionStatementEditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(InstructionStatementEditPart source,
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
		return doGetTypesForTarget((InstructionStatementEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(InstructionStatementEditPart source, IElementType relationshipType) {
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
		return doGetRelTypesOnTarget((InstructionStatementEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(InstructionStatementEditPart target) {
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
		return doGetTypesForSource((InstructionStatementEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(InstructionStatementEditPart target, IElementType relationshipType) {
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
