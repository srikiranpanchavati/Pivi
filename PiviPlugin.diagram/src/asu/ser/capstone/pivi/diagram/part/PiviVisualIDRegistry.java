package asu.ser.capstone.pivi.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import asu.ser.capstone.pivi.PiviPackage;
import asu.ser.capstone.pivi.ProgramDiagram;
import asu.ser.capstone.pivi.diagram.edit.parts.EndEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.IfStatementEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.InstructionStatementEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.ProgramDiagramEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.StartEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.StatementInputEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.StatementOutputEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.WhileStatementEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class PiviVisualIDRegistry {

	/**
	* @generated
	*/
	private static final String DEBUG_KEY = "PiviPlugin.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	* @generated
	*/
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (ProgramDiagramEditPart.MODEL_ID.equals(view.getType())) {
				return ProgramDiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getVisualID(view.getType());
	}

	/**
	* @generated
	*/
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	* @generated
	*/
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(Platform.getDebugOption(DEBUG_KEY))) {
				PiviDiagramEditorPlugin.getInstance()
						.logError("Unable to parse view type as a visualID number: " + type);
			}
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	* @generated
	*/
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (PiviPackage.eINSTANCE.getProgramDiagram().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((ProgramDiagram) domainElement)) {
			return ProgramDiagramEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getModelID(containerView);
		if (!ProgramDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (ProgramDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ProgramDiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case ProgramDiagramEditPart.VISUAL_ID:
			if (PiviPackage.eINSTANCE.getIfStatement().isSuperTypeOf(domainElement.eClass())) {
				return IfStatementEditPart.VISUAL_ID;
			}
			if (PiviPackage.eINSTANCE.getInstructionStatement().isSuperTypeOf(domainElement.eClass())) {
				return InstructionStatementEditPart.VISUAL_ID;
			}
			if (PiviPackage.eINSTANCE.getWhileStatement().isSuperTypeOf(domainElement.eClass())) {
				return WhileStatementEditPart.VISUAL_ID;
			}
			if (PiviPackage.eINSTANCE.getStart().isSuperTypeOf(domainElement.eClass())) {
				return StartEditPart.VISUAL_ID;
			}
			if (PiviPackage.eINSTANCE.getEnd().isSuperTypeOf(domainElement.eClass())) {
				return EndEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getModelID(containerView);
		if (!ProgramDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (ProgramDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ProgramDiagramEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case ProgramDiagramEditPart.VISUAL_ID:
			if (IfStatementEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InstructionStatementEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WhileStatementEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StartEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EndEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (PiviPackage.eINSTANCE.getStatementOutput().isSuperTypeOf(domainElement.eClass())) {
			return StatementOutputEditPart.VISUAL_ID;
		}
		if (PiviPackage.eINSTANCE.getStatementInput().isSuperTypeOf(domainElement.eClass())) {
			return StatementInputEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* User can change implementation of this method to handle some specific
	* situations not covered by default logic.
	* 
	* @generated
	*/
	private static boolean isDiagram(ProgramDiagram element) {
		return true;
	}

	/**
	* @generated
	*/
	public static boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	* @generated
	*/
	public static boolean isCompartmentVisualID(int visualID) {
		return false;
	}

	/**
	* @generated
	*/
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case ProgramDiagramEditPart.VISUAL_ID:
			return false;
		case IfStatementEditPart.VISUAL_ID:
		case InstructionStatementEditPart.VISUAL_ID:
		case WhileStatementEditPart.VISUAL_ID:
		case StartEditPart.VISUAL_ID:
		case EndEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		* @generated
		*/
		@Override

		public int getVisualID(View view) {
			return asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getNodeVisualID(containerView,
					domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.checkNodeVisualID(containerView,
					domainElement, candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

}
