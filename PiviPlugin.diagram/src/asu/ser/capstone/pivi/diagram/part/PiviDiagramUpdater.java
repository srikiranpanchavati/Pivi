package asu.ser.capstone.pivi.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import asu.ser.capstone.pivi.End;
import asu.ser.capstone.pivi.IfStatement;
import asu.ser.capstone.pivi.InstructionStatement;
import asu.ser.capstone.pivi.PiviPackage;
import asu.ser.capstone.pivi.ProgramDiagram;
import asu.ser.capstone.pivi.Start;
import asu.ser.capstone.pivi.Statement;
import asu.ser.capstone.pivi.StatementInput;
import asu.ser.capstone.pivi.StatementOutput;
import asu.ser.capstone.pivi.WhileStatement;
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
import asu.ser.capstone.pivi.diagram.providers.PiviElementTypes;

/**
 * @generated
 */
public class PiviDiagramUpdater {

	/**
	* @generated
	*/
	public static List<PiviNodeDescriptor> getSemanticChildren(View view) {
		switch (PiviVisualIDRegistry.getVisualID(view)) {
		case ProgramDiagramEditPart.VISUAL_ID:
			return getProgramDiagram_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PiviNodeDescriptor> getProgramDiagram_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		ProgramDiagram modelElement = (ProgramDiagram) view.getElement();
		LinkedList<PiviNodeDescriptor> result = new LinkedList<PiviNodeDescriptor>();
		for (Iterator<?> it = modelElement.getStatements().iterator(); it.hasNext();) {
			Statement childElement = (Statement) it.next();
			int visualID = PiviVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == IfStatementEditPart.VISUAL_ID) {
				result.add(new PiviNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == InstructionStatementEditPart.VISUAL_ID) {
				result.add(new PiviNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == WhileStatementEditPart.VISUAL_ID) {
				result.add(new PiviNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			Start childElement = modelElement.getStart();
			int visualID = PiviVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == StartEditPart.VISUAL_ID) {
				result.add(new PiviNodeDescriptor(childElement, visualID));
			}
		}
		{
			End childElement = modelElement.getEnd();
			int visualID = PiviVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == EndEditPart.VISUAL_ID) {
				result.add(new PiviNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PiviLinkDescriptor> getContainedLinks(View view) {
		switch (PiviVisualIDRegistry.getVisualID(view)) {
		case ProgramDiagramEditPart.VISUAL_ID:
			return getProgramDiagram_1000ContainedLinks(view);
		case IfStatementEditPart.VISUAL_ID:
			return getIfStatement_2001ContainedLinks(view);
		case InstructionStatementEditPart.VISUAL_ID:
			return getInstructionStatement_2002ContainedLinks(view);
		case WhileStatementEditPart.VISUAL_ID:
			return getWhileStatement_2003ContainedLinks(view);
		case StartEditPart.VISUAL_ID:
			return getStart_2004ContainedLinks(view);
		case EndEditPart.VISUAL_ID:
			return getEnd_2005ContainedLinks(view);
		case StatementOutputEditPart.VISUAL_ID:
			return getStatementOutput_4001ContainedLinks(view);
		case StatementInputEditPart.VISUAL_ID:
			return getStatementInput_4002ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PiviLinkDescriptor> getIncomingLinks(View view) {
		switch (PiviVisualIDRegistry.getVisualID(view)) {
		case IfStatementEditPart.VISUAL_ID:
			return getIfStatement_2001IncomingLinks(view);
		case InstructionStatementEditPart.VISUAL_ID:
			return getInstructionStatement_2002IncomingLinks(view);
		case WhileStatementEditPart.VISUAL_ID:
			return getWhileStatement_2003IncomingLinks(view);
		case StartEditPart.VISUAL_ID:
			return getStart_2004IncomingLinks(view);
		case EndEditPart.VISUAL_ID:
			return getEnd_2005IncomingLinks(view);
		case StatementOutputEditPart.VISUAL_ID:
			return getStatementOutput_4001IncomingLinks(view);
		case StatementInputEditPart.VISUAL_ID:
			return getStatementInput_4002IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PiviLinkDescriptor> getOutgoingLinks(View view) {
		switch (PiviVisualIDRegistry.getVisualID(view)) {
		case IfStatementEditPart.VISUAL_ID:
			return getIfStatement_2001OutgoingLinks(view);
		case InstructionStatementEditPart.VISUAL_ID:
			return getInstructionStatement_2002OutgoingLinks(view);
		case WhileStatementEditPart.VISUAL_ID:
			return getWhileStatement_2003OutgoingLinks(view);
		case StartEditPart.VISUAL_ID:
			return getStart_2004OutgoingLinks(view);
		case EndEditPart.VISUAL_ID:
			return getEnd_2005OutgoingLinks(view);
		case StatementOutputEditPart.VISUAL_ID:
			return getStatementOutput_4001OutgoingLinks(view);
		case StatementInputEditPart.VISUAL_ID:
			return getStatementInput_4002OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PiviLinkDescriptor> getProgramDiagram_1000ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PiviLinkDescriptor> getIfStatement_2001ContainedLinks(View view) {
		IfStatement modelElement = (IfStatement) view.getElement();
		LinkedList<PiviLinkDescriptor> result = new LinkedList<PiviLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_StatementOutput_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_StatementInput_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PiviLinkDescriptor> getInstructionStatement_2002ContainedLinks(View view) {
		InstructionStatement modelElement = (InstructionStatement) view.getElement();
		LinkedList<PiviLinkDescriptor> result = new LinkedList<PiviLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_StatementOutput_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_StatementInput_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PiviLinkDescriptor> getWhileStatement_2003ContainedLinks(View view) {
		WhileStatement modelElement = (WhileStatement) view.getElement();
		LinkedList<PiviLinkDescriptor> result = new LinkedList<PiviLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_StatementOutput_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_StatementInput_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PiviLinkDescriptor> getStart_2004ContainedLinks(View view) {
		Start modelElement = (Start) view.getElement();
		LinkedList<PiviLinkDescriptor> result = new LinkedList<PiviLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Start_Inputs_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PiviLinkDescriptor> getEnd_2005ContainedLinks(View view) {
		End modelElement = (End) view.getElement();
		LinkedList<PiviLinkDescriptor> result = new LinkedList<PiviLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_End_StatementOutput_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PiviLinkDescriptor> getStatementOutput_4001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PiviLinkDescriptor> getStatementInput_4002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PiviLinkDescriptor> getIfStatement_2001IncomingLinks(View view) {
		IfStatement modelElement = (IfStatement) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PiviLinkDescriptor> result = new LinkedList<PiviLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_StatementOutput_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_StatementInput_4002(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PiviLinkDescriptor> getInstructionStatement_2002IncomingLinks(View view) {
		InstructionStatement modelElement = (InstructionStatement) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PiviLinkDescriptor> result = new LinkedList<PiviLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_StatementOutput_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_StatementInput_4002(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PiviLinkDescriptor> getWhileStatement_2003IncomingLinks(View view) {
		WhileStatement modelElement = (WhileStatement) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PiviLinkDescriptor> result = new LinkedList<PiviLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_StatementOutput_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_StatementInput_4002(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PiviLinkDescriptor> getStart_2004IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PiviLinkDescriptor> getEnd_2005IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PiviLinkDescriptor> getStatementOutput_4001IncomingLinks(View view) {
		StatementOutput modelElement = (StatementOutput) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PiviLinkDescriptor> result = new LinkedList<PiviLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_End_StatementOutput_4004(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PiviLinkDescriptor> getStatementInput_4002IncomingLinks(View view) {
		StatementInput modelElement = (StatementInput) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PiviLinkDescriptor> result = new LinkedList<PiviLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Start_Inputs_4003(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PiviLinkDescriptor> getIfStatement_2001OutgoingLinks(View view) {
		IfStatement modelElement = (IfStatement) view.getElement();
		LinkedList<PiviLinkDescriptor> result = new LinkedList<PiviLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_StatementOutput_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_StatementInput_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PiviLinkDescriptor> getInstructionStatement_2002OutgoingLinks(View view) {
		InstructionStatement modelElement = (InstructionStatement) view.getElement();
		LinkedList<PiviLinkDescriptor> result = new LinkedList<PiviLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_StatementOutput_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_StatementInput_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PiviLinkDescriptor> getWhileStatement_2003OutgoingLinks(View view) {
		WhileStatement modelElement = (WhileStatement) view.getElement();
		LinkedList<PiviLinkDescriptor> result = new LinkedList<PiviLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_StatementOutput_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_StatementInput_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PiviLinkDescriptor> getStart_2004OutgoingLinks(View view) {
		Start modelElement = (Start) view.getElement();
		LinkedList<PiviLinkDescriptor> result = new LinkedList<PiviLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Start_Inputs_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PiviLinkDescriptor> getEnd_2005OutgoingLinks(View view) {
		End modelElement = (End) view.getElement();
		LinkedList<PiviLinkDescriptor> result = new LinkedList<PiviLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_End_StatementOutput_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PiviLinkDescriptor> getStatementOutput_4001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PiviLinkDescriptor> getStatementInput_4002OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	private static Collection<PiviLinkDescriptor> getContainedTypeModelFacetLinks_StatementOutput_4001(
			Statement container) {
		LinkedList<PiviLinkDescriptor> result = new LinkedList<PiviLinkDescriptor>();
		for (Iterator<?> links = container.getOutputs().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof StatementOutput) {
				continue;
			}
			StatementOutput link = (StatementOutput) linkObject;
			if (StatementOutputEditPart.VISUAL_ID != PiviVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Statement dst = link.getStatement();
			result.add(new PiviLinkDescriptor(container, dst, link, PiviElementTypes.StatementOutput_4001,
					StatementOutputEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<PiviLinkDescriptor> getContainedTypeModelFacetLinks_StatementInput_4002(
			Statement container) {
		LinkedList<PiviLinkDescriptor> result = new LinkedList<PiviLinkDescriptor>();
		for (Iterator<?> links = container.getInputs().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof StatementInput) {
				continue;
			}
			StatementInput link = (StatementInput) linkObject;
			if (StatementInputEditPart.VISUAL_ID != PiviVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Statement dst = link.getStatement();
			result.add(new PiviLinkDescriptor(container, dst, link, PiviElementTypes.StatementInput_4002,
					StatementInputEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<PiviLinkDescriptor> getIncomingTypeModelFacetLinks_StatementOutput_4001(Statement target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<PiviLinkDescriptor> result = new LinkedList<PiviLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != PiviPackage.eINSTANCE.getStatementOutput_Statement()
					|| false == setting.getEObject() instanceof StatementOutput) {
				continue;
			}
			StatementOutput link = (StatementOutput) setting.getEObject();
			if (StatementOutputEditPart.VISUAL_ID != PiviVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			if (false == link.eContainer() instanceof Statement) {
				continue;
			}
			Statement container = (Statement) link.eContainer();
			result.add(new PiviLinkDescriptor(container, target, link, PiviElementTypes.StatementOutput_4001,
					StatementOutputEditPart.VISUAL_ID));

		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<PiviLinkDescriptor> getIncomingTypeModelFacetLinks_StatementInput_4002(Statement target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<PiviLinkDescriptor> result = new LinkedList<PiviLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != PiviPackage.eINSTANCE.getStatementInput_Statement()
					|| false == setting.getEObject() instanceof StatementInput) {
				continue;
			}
			StatementInput link = (StatementInput) setting.getEObject();
			if (StatementInputEditPart.VISUAL_ID != PiviVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			if (false == link.eContainer() instanceof Statement) {
				continue;
			}
			Statement container = (Statement) link.eContainer();
			result.add(new PiviLinkDescriptor(container, target, link, PiviElementTypes.StatementInput_4002,
					StatementInputEditPart.VISUAL_ID));

		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<PiviLinkDescriptor> getIncomingFeatureModelFacetLinks_Start_Inputs_4003(
			StatementInput target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<PiviLinkDescriptor> result = new LinkedList<PiviLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == PiviPackage.eINSTANCE.getStart_Inputs()) {
				result.add(new PiviLinkDescriptor(setting.getEObject(), target, PiviElementTypes.StartInputs_4003,
						StartInputsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<PiviLinkDescriptor> getIncomingFeatureModelFacetLinks_End_StatementOutput_4004(
			StatementOutput target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<PiviLinkDescriptor> result = new LinkedList<PiviLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == PiviPackage.eINSTANCE.getEnd_StatementOutput()) {
				result.add(new PiviLinkDescriptor(setting.getEObject(), target,
						PiviElementTypes.EndStatementOutput_4004, EndStatementOutputEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<PiviLinkDescriptor> getOutgoingFeatureModelFacetLinks_Start_Inputs_4003(Start source) {
		LinkedList<PiviLinkDescriptor> result = new LinkedList<PiviLinkDescriptor>();
		for (Iterator<?> destinations = source.getInputs().iterator(); destinations.hasNext();) {
			StatementInput destination = (StatementInput) destinations.next();
			result.add(new PiviLinkDescriptor(source, destination, PiviElementTypes.StartInputs_4003,
					StartInputsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<PiviLinkDescriptor> getOutgoingFeatureModelFacetLinks_End_StatementOutput_4004(
			End source) {
		LinkedList<PiviLinkDescriptor> result = new LinkedList<PiviLinkDescriptor>();
		for (Iterator<?> destinations = source.getStatementOutput().iterator(); destinations.hasNext();) {
			StatementOutput destination = (StatementOutput) destinations.next();
			result.add(new PiviLinkDescriptor(source, destination, PiviElementTypes.EndStatementOutput_4004,
					EndStatementOutputEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		* @generated
		*/
		@Override

		public List<PiviNodeDescriptor> getSemanticChildren(View view) {
			return PiviDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<PiviLinkDescriptor> getContainedLinks(View view) {
			return PiviDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<PiviLinkDescriptor> getIncomingLinks(View view) {
			return PiviDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<PiviLinkDescriptor> getOutgoingLinks(View view) {
			return PiviDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
