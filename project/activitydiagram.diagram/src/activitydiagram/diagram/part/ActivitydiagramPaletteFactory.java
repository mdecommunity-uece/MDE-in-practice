
/*
 * 
 */
package activitydiagram.diagram.part;

import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

import activitydiagram.diagram.providers.ActivitydiagramElementTypes;

/**
 * @generated
 */
public class ActivitydiagramPaletteFactory {

	/**
	* @generated
	*/
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createObjects1Group());
		paletteRoot.add(createConnections2Group());
	}

	/**
	* Creates "Objects" palette tool group
	* @generated
	*/
	private PaletteContainer createObjects1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createActivityNode1CreationTool());
		paletteContainer.add(createDecisionNode2CreationTool());
		paletteContainer.add(createFinalNode3CreationTool());
		paletteContainer.add(createForkNode4CreationTool());
		paletteContainer.add(createInitialNode5CreationTool());
		paletteContainer.add(createJoinNode6CreationTool());
		return paletteContainer;
	}

	/**
	* Creates "Connections" palette tool group
	* @generated
	*/
	private PaletteContainer createConnections2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Connections2Group_title);
		paletteContainer.setId("createConnections2Group"); //$NON-NLS-1$
		paletteContainer.add(createTransition1CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createActivityNode1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.ActivityNode1CreationTool_title,
				Messages.ActivityNode1CreationTool_desc,
				Collections.singletonList(ActivitydiagramElementTypes.ActivityNode_2003));
		entry.setId("createActivityNode1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				ActivitydiagramElementTypes.getImageDescriptor(ActivitydiagramElementTypes.ActivityNode_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createDecisionNode2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.DecisionNode2CreationTool_title,
				Messages.DecisionNode2CreationTool_desc,
				Collections.singletonList(ActivitydiagramElementTypes.DecisionNode_2006));
		entry.setId("createDecisionNode2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ActivitydiagramDiagramEditorPlugin
				.findImageDescriptor("/activitydiagram.edit/icons/full/obj16/decision.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createFinalNode3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.FinalNode3CreationTool_title,
				Messages.FinalNode3CreationTool_desc,
				Collections.singletonList(ActivitydiagramElementTypes.FinalNode_2002));
		entry.setId("createFinalNode3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ActivitydiagramDiagramEditorPlugin
				.findImageDescriptor("/activitydiagram.edit/icons/full/obj16/final.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createForkNode4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.ForkNode4CreationTool_title,
				Messages.ForkNode4CreationTool_desc,
				Collections.singletonList(ActivitydiagramElementTypes.ForkNode_2004));
		entry.setId("createForkNode4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ActivitydiagramDiagramEditorPlugin
				.findImageDescriptor("/activitydiagram.edit/icons/full/obj16/fork.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createInitialNode5CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.InitialNode5CreationTool_title,
				Messages.InitialNode5CreationTool_desc,
				Collections.singletonList(ActivitydiagramElementTypes.InitialNode_2001));
		entry.setId("createInitialNode5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ActivitydiagramDiagramEditorPlugin
				.findImageDescriptor("/activitydiagram.edit/icons/full/obj16/start.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createJoinNode6CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.JoinNode6CreationTool_title,
				Messages.JoinNode6CreationTool_desc,
				Collections.singletonList(ActivitydiagramElementTypes.JoinNode_2005));
		entry.setId("createJoinNode6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ActivitydiagramDiagramEditorPlugin
				.findImageDescriptor("/activitydiagram.edit/icons/full/obj16/fork.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTransition1CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Transition1CreationTool_title,
				Messages.Transition1CreationTool_desc,
				Collections.singletonList(ActivitydiagramElementTypes.Transition_4001));
		entry.setId("createTransition1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ActivitydiagramElementTypes.getImageDescriptor(ActivitydiagramElementTypes.Transition_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
