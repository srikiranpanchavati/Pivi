package asu.ser.capstone.pivi.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import asu.ser.capstone.pivi.diagram.providers.PiviElementTypes;
import asu.ser.capstone.pivi.diagram.providers.PiviModelingAssistantProvider;

/**
 * @generated
 */
public class PiviModelingAssistantProviderOfProgramDiagramEditPart extends PiviModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(5);
		types.add(PiviElementTypes.IfStatement_2001);
		types.add(PiviElementTypes.InstructionStatement_2002);
		types.add(PiviElementTypes.WhileStatement_2003);
		types.add(PiviElementTypes.Start_2004);
		types.add(PiviElementTypes.End_2005);
		return types;
	}

}
