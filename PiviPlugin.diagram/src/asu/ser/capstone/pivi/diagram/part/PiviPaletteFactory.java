
package asu.ser.capstone.pivi.diagram.part;

import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

import asu.ser.capstone.pivi.diagram.providers.PiviElementTypes;

/**
 * @generated
 */
public class PiviPaletteFactory {

	/**
	* @generated
	*/
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createPivi1Group());
	}

	/**
	* Creates "pivi" palette tool group
	* @generated
	*/
	private PaletteContainer createPivi1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(Messages.Pivi1Group_title);
		paletteContainer.setId("createPivi1Group"); //$NON-NLS-1$
		paletteContainer.add(createEnd1CreationTool());
		paletteContainer.add(createEndStatementOutput2CreationTool());
		paletteContainer.add(createIfStatement3CreationTool());
		paletteContainer.add(createInstructionStatement4CreationTool());
		paletteContainer.add(createStart5CreationTool());
		paletteContainer.add(createStartInputs6CreationTool());
		paletteContainer.add(createStatementInput7CreationTool());
		paletteContainer.add(createStatementOutput8CreationTool());
		paletteContainer.add(createWhileStatement9CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createEnd1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.End1CreationTool_title,
				Messages.End1CreationTool_desc, Collections.singletonList(PiviElementTypes.IfStatement_2001));
		entry.setId("createEnd1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PiviElementTypes.getImageDescriptor(PiviElementTypes.IfStatement_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createEndStatementOutput2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.EndStatementOutput2CreationTool_title,
				Messages.EndStatementOutput2CreationTool_desc,
				Collections.singletonList(PiviElementTypes.InstructionStatement_2002));
		entry.setId("createEndStatementOutput2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PiviElementTypes.getImageDescriptor(PiviElementTypes.InstructionStatement_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createIfStatement3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.IfStatement3CreationTool_title,
				Messages.IfStatement3CreationTool_desc,
				Collections.singletonList(PiviElementTypes.WhileStatement_2003));
		entry.setId("createIfStatement3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PiviElementTypes.getImageDescriptor(PiviElementTypes.WhileStatement_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createInstructionStatement4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.InstructionStatement4CreationTool_title,
				Messages.InstructionStatement4CreationTool_desc,
				Collections.singletonList(PiviElementTypes.Start_2004));
		entry.setId("createInstructionStatement4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PiviElementTypes.getImageDescriptor(PiviElementTypes.Start_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createStart5CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Start5CreationTool_title,
				Messages.Start5CreationTool_desc, Collections.singletonList(PiviElementTypes.End_2005));
		entry.setId("createStart5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PiviElementTypes.getImageDescriptor(PiviElementTypes.End_2005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createStartInputs6CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.StartInputs6CreationTool_title,
				Messages.StartInputs6CreationTool_desc,
				Collections.singletonList(PiviElementTypes.StatementOutput_4001));
		entry.setId("createStartInputs6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PiviElementTypes.getImageDescriptor(PiviElementTypes.StatementOutput_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createStatementInput7CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.StatementInput7CreationTool_title,
				Messages.StatementInput7CreationTool_desc,
				Collections.singletonList(PiviElementTypes.StatementInput_4002));
		entry.setId("createStatementInput7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PiviElementTypes.getImageDescriptor(PiviElementTypes.StatementInput_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createStatementOutput8CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.StatementOutput8CreationTool_title,
				Messages.StatementOutput8CreationTool_desc,
				Collections.singletonList(PiviElementTypes.StartInputs_4003));
		entry.setId("createStatementOutput8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PiviElementTypes.getImageDescriptor(PiviElementTypes.StartInputs_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createWhileStatement9CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.WhileStatement9CreationTool_title,
				Messages.WhileStatement9CreationTool_desc,
				Collections.singletonList(PiviElementTypes.EndStatementOutput_4004));
		entry.setId("createWhileStatement9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PiviElementTypes.getImageDescriptor(PiviElementTypes.EndStatementOutput_4004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
