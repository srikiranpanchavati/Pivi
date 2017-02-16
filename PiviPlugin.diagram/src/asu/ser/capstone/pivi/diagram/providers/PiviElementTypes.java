package asu.ser.capstone.pivi.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import asu.ser.capstone.pivi.PiviPackage;
import asu.ser.capstone.pivi.diagram.edit.parts.EndEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.EndStatementOutputEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.IfStatementEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.InstructionStatementEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.ProgramDiagramEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.StartEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.StartInputsEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.StatementInputEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.StatementOutputEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.WhileStatementEditPart;
import asu.ser.capstone.pivi.diagram.part.PiviDiagramEditorPlugin;

/**
 * @generated
 */
public class PiviElementTypes {

	/**
	* @generated
	*/
	private PiviElementTypes() {
	}

	/**
	* @generated
	*/
	private static Map<IElementType, ENamedElement> elements;

	/**
	* @generated
	*/
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			PiviDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());

	/**
	* @generated
	*/
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	* @generated
	*/
	public static final IElementType ProgramDiagram_1000 = getElementType("PiviPlugin.diagram.ProgramDiagram_1000"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType IfStatement_2001 = getElementType("PiviPlugin.diagram.IfStatement_2001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType InstructionStatement_2002 = getElementType(
			"PiviPlugin.diagram.InstructionStatement_2002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType WhileStatement_2003 = getElementType("PiviPlugin.diagram.WhileStatement_2003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Start_2004 = getElementType("PiviPlugin.diagram.Start_2004"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType End_2005 = getElementType("PiviPlugin.diagram.End_2005"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType StatementOutput_4001 = getElementType("PiviPlugin.diagram.StatementOutput_4001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType StatementInput_4002 = getElementType("PiviPlugin.diagram.StatementInput_4002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType StartInputs_4003 = getElementType("PiviPlugin.diagram.StartInputs_4003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType EndStatementOutput_4004 = getElementType(
			"PiviPlugin.diagram.EndStatementOutput_4004"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	* @generated
	*/
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	* @generated
	*/
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	* Returns 'type' of the ecore object associated with the hint.
	* 
	* @generated
	*/
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(ProgramDiagram_1000, PiviPackage.eINSTANCE.getProgramDiagram());

			elements.put(IfStatement_2001, PiviPackage.eINSTANCE.getIfStatement());

			elements.put(InstructionStatement_2002, PiviPackage.eINSTANCE.getInstructionStatement());

			elements.put(WhileStatement_2003, PiviPackage.eINSTANCE.getWhileStatement());

			elements.put(Start_2004, PiviPackage.eINSTANCE.getStart());

			elements.put(End_2005, PiviPackage.eINSTANCE.getEnd());

			elements.put(StatementOutput_4001, PiviPackage.eINSTANCE.getStatementOutput());

			elements.put(StatementInput_4002, PiviPackage.eINSTANCE.getStatementInput());

			elements.put(StartInputs_4003, PiviPackage.eINSTANCE.getStart_Inputs());

			elements.put(EndStatementOutput_4004, PiviPackage.eINSTANCE.getEnd_StatementOutput());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	* @generated
	*/
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	* @generated
	*/
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(ProgramDiagram_1000);
			KNOWN_ELEMENT_TYPES.add(IfStatement_2001);
			KNOWN_ELEMENT_TYPES.add(InstructionStatement_2002);
			KNOWN_ELEMENT_TYPES.add(WhileStatement_2003);
			KNOWN_ELEMENT_TYPES.add(Start_2004);
			KNOWN_ELEMENT_TYPES.add(End_2005);
			KNOWN_ELEMENT_TYPES.add(StatementOutput_4001);
			KNOWN_ELEMENT_TYPES.add(StatementInput_4002);
			KNOWN_ELEMENT_TYPES.add(StartInputs_4003);
			KNOWN_ELEMENT_TYPES.add(EndStatementOutput_4004);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	* @generated
	*/
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case ProgramDiagramEditPart.VISUAL_ID:
			return ProgramDiagram_1000;
		case IfStatementEditPart.VISUAL_ID:
			return IfStatement_2001;
		case InstructionStatementEditPart.VISUAL_ID:
			return InstructionStatement_2002;
		case WhileStatementEditPart.VISUAL_ID:
			return WhileStatement_2003;
		case StartEditPart.VISUAL_ID:
			return Start_2004;
		case EndEditPart.VISUAL_ID:
			return End_2005;
		case StatementOutputEditPart.VISUAL_ID:
			return StatementOutput_4001;
		case StatementInputEditPart.VISUAL_ID:
			return StatementInput_4002;
		case StartInputsEditPart.VISUAL_ID:
			return StartInputs_4003;
		case EndStatementOutputEditPart.VISUAL_ID:
			return EndStatementOutput_4004;
		}
		return null;
	}

	/**
	* @generated
	*/
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(elementTypeImages) {

		/**
		* @generated
		*/
		@Override

		public boolean isKnownElementType(IElementType elementType) {
			return asu.ser.capstone.pivi.diagram.providers.PiviElementTypes.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return asu.ser.capstone.pivi.diagram.providers.PiviElementTypes.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return asu.ser.capstone.pivi.diagram.providers.PiviElementTypes.getElement(elementTypeAdapter);
		}
	};

}
