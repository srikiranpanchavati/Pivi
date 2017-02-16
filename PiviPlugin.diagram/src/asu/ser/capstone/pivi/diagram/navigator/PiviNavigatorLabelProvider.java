package asu.ser.capstone.pivi.diagram.navigator;

import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

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
import asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry;
import asu.ser.capstone.pivi.diagram.providers.PiviElementTypes;

/**
 * @generated
 */
public class PiviNavigatorLabelProvider extends LabelProvider implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	* @generated
	*/
	static {
		PiviDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?UnknownElement", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
		PiviDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?ImageNotFound", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
	}

	/**
	* @generated
	*/
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof PiviNavigatorItem && !isOwnView(((PiviNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	* @generated
	*/
	public Image getImage(Object element) {
		if (element instanceof PiviNavigatorGroup) {
			PiviNavigatorGroup group = (PiviNavigatorGroup) element;
			return PiviDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof PiviNavigatorItem) {
			PiviNavigatorItem navigatorItem = (PiviNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	* @generated
	*/
	public Image getImage(View view) {
		switch (PiviVisualIDRegistry.getVisualID(view)) {
		case ProgramDiagramEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?http:///asu/ser/capstone/pivi.ecore?ProgramDiagram", //$NON-NLS-1$
					PiviElementTypes.ProgramDiagram_1000);
		case IfStatementEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http:///asu/ser/capstone/pivi.ecore?IfStatement", //$NON-NLS-1$
					PiviElementTypes.IfStatement_2001);
		case InstructionStatementEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http:///asu/ser/capstone/pivi.ecore?InstructionStatement", //$NON-NLS-1$
					PiviElementTypes.InstructionStatement_2002);
		case WhileStatementEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http:///asu/ser/capstone/pivi.ecore?WhileStatement", //$NON-NLS-1$
					PiviElementTypes.WhileStatement_2003);
		case StartEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http:///asu/ser/capstone/pivi.ecore?Start", //$NON-NLS-1$
					PiviElementTypes.Start_2004);
		case EndEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http:///asu/ser/capstone/pivi.ecore?End", //$NON-NLS-1$
					PiviElementTypes.End_2005);
		case StatementOutputEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http:///asu/ser/capstone/pivi.ecore?StatementOutput", //$NON-NLS-1$
					PiviElementTypes.StatementOutput_4001);
		case StatementInputEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http:///asu/ser/capstone/pivi.ecore?StatementInput", //$NON-NLS-1$
					PiviElementTypes.StatementInput_4002);
		case StartInputsEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http:///asu/ser/capstone/pivi.ecore?Start?inputs", //$NON-NLS-1$
					PiviElementTypes.StartInputs_4003);
		case EndStatementOutputEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http:///asu/ser/capstone/pivi.ecore?End?statementOutput", //$NON-NLS-1$
					PiviElementTypes.EndStatementOutput_4004);
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = PiviDiagramEditorPlugin.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null && PiviElementTypes.isKnownElementType(elementType)) {
			image = PiviElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	* @generated
	*/
	public String getText(Object element) {
		if (element instanceof PiviNavigatorGroup) {
			PiviNavigatorGroup group = (PiviNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof PiviNavigatorItem) {
			PiviNavigatorItem navigatorItem = (PiviNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	* @generated
	*/
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (PiviVisualIDRegistry.getVisualID(view)) {
		case ProgramDiagramEditPart.VISUAL_ID:
			return getProgramDiagram_1000Text(view);
		case IfStatementEditPart.VISUAL_ID:
			return getIfStatement_2001Text(view);
		case InstructionStatementEditPart.VISUAL_ID:
			return getInstructionStatement_2002Text(view);
		case WhileStatementEditPart.VISUAL_ID:
			return getWhileStatement_2003Text(view);
		case StartEditPart.VISUAL_ID:
			return getStart_2004Text(view);
		case EndEditPart.VISUAL_ID:
			return getEnd_2005Text(view);
		case StatementOutputEditPart.VISUAL_ID:
			return getStatementOutput_4001Text(view);
		case StatementInputEditPart.VISUAL_ID:
			return getStatementInput_4002Text(view);
		case StartInputsEditPart.VISUAL_ID:
			return getStartInputs_4003Text(view);
		case EndStatementOutputEditPart.VISUAL_ID:
			return getEndStatementOutput_4004Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	* @generated
	*/
	private String getProgramDiagram_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getIfStatement_2001Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getInstructionStatement_2002Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getWhileStatement_2003Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getStart_2004Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getEnd_2005Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getStatementOutput_4001Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getStatementInput_4002Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getStartInputs_4003Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getEndStatementOutput_4004Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	* @generated
	*/
	public void restoreState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public void saveState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	* @generated
	*/
	private boolean isOwnView(View view) {
		return ProgramDiagramEditPart.MODEL_ID.equals(PiviVisualIDRegistry.getModelID(view));
	}

}
