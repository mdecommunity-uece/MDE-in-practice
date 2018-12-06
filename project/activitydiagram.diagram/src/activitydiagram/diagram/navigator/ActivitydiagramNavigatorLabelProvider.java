/*
* 
*/
package activitydiagram.diagram.navigator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
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

import activitydiagram.ActivityDiagram;
import activitydiagram.DecisionNode;
import activitydiagram.FinalNode;
import activitydiagram.ForkNode;
import activitydiagram.InitialNode;
import activitydiagram.JoinNode;
import activitydiagram.Transition;
import activitydiagram.diagram.edit.parts.ActivityDiagramEditPart;
import activitydiagram.diagram.edit.parts.ActivityNodeEditPart;
import activitydiagram.diagram.edit.parts.ActivityNodeNameEditPart;
import activitydiagram.diagram.edit.parts.DecisionNodeEditPart;
import activitydiagram.diagram.edit.parts.FinalNodeEditPart;
import activitydiagram.diagram.edit.parts.ForkNodeEditPart;
import activitydiagram.diagram.edit.parts.InitialNodeEditPart;
import activitydiagram.diagram.edit.parts.JoinNodeEditPart;
import activitydiagram.diagram.edit.parts.TransitionEditPart;
import activitydiagram.diagram.edit.parts.TransitionNameEditPart;
import activitydiagram.diagram.part.ActivitydiagramDiagramEditorPlugin;
import activitydiagram.diagram.part.ActivitydiagramVisualIDRegistry;
import activitydiagram.diagram.providers.ActivitydiagramElementTypes;
import activitydiagram.diagram.providers.ActivitydiagramParserProvider;

/**
 * @generated
 */
public class ActivitydiagramNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	* @generated
	*/
	static {
		ActivitydiagramDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?UnknownElement", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
		ActivitydiagramDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?ImageNotFound", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
	}

	/**
	* @generated
	*/
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof ActivitydiagramNavigatorItem
				&& !isOwnView(((ActivitydiagramNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	* @generated
	*/
	public Image getImage(Object element) {
		if (element instanceof ActivitydiagramNavigatorGroup) {
			ActivitydiagramNavigatorGroup group = (ActivitydiagramNavigatorGroup) element;
			return ActivitydiagramDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof ActivitydiagramNavigatorItem) {
			ActivitydiagramNavigatorItem navigatorItem = (ActivitydiagramNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getImage(view);
			}
		}

		return super.getImage(element);
	}

	/**
	* @generated
	*/
	public Image getImage(View view) {
		switch (ActivitydiagramVisualIDRegistry.getVisualID(view)) {
		case ActivityDiagramEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?activitydiagram?ActivityDiagram", //$NON-NLS-1$
					ActivitydiagramElementTypes.ActivityDiagram_1000);
		case InitialNodeEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?activitydiagram?InitialNode", //$NON-NLS-1$
					ActivitydiagramElementTypes.InitialNode_2001);
		case FinalNodeEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?activitydiagram?FinalNode", //$NON-NLS-1$
					ActivitydiagramElementTypes.FinalNode_2002);
		case ActivityNodeEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?activitydiagram?ActivityNode", //$NON-NLS-1$
					ActivitydiagramElementTypes.ActivityNode_2003);
		case ForkNodeEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?activitydiagram?ForkNode", //$NON-NLS-1$
					ActivitydiagramElementTypes.ForkNode_2004);
		case JoinNodeEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?activitydiagram?JoinNode", //$NON-NLS-1$
					ActivitydiagramElementTypes.JoinNode_2005);
		case DecisionNodeEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?activitydiagram?DecisionNode", //$NON-NLS-1$
					ActivitydiagramElementTypes.DecisionNode_2006);
		case TransitionEditPart.VISUAL_ID:
			return getImage("Navigator?Link?activitydiagram?Transition", ActivitydiagramElementTypes.Transition_4001); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = ActivitydiagramDiagramEditorPlugin.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null && ActivitydiagramElementTypes.isKnownElementType(elementType)) {
			image = ActivitydiagramElementTypes.getImage(elementType);
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
		if (element instanceof ActivitydiagramNavigatorGroup) {
			ActivitydiagramNavigatorGroup group = (ActivitydiagramNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof ActivitydiagramNavigatorItem) {
			ActivitydiagramNavigatorItem navigatorItem = (ActivitydiagramNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getText(view);
			}
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
		switch (ActivitydiagramVisualIDRegistry.getVisualID(view)) {
		case ActivityDiagramEditPart.VISUAL_ID:
			return getActivityDiagram_1000Text(view);
		case InitialNodeEditPart.VISUAL_ID:
			return getInitialNode_2001Text(view);
		case FinalNodeEditPart.VISUAL_ID:
			return getFinalNode_2002Text(view);
		case ActivityNodeEditPart.VISUAL_ID:
			return getActivityNode_2003Text(view);
		case ForkNodeEditPart.VISUAL_ID:
			return getForkNode_2004Text(view);
		case JoinNodeEditPart.VISUAL_ID:
			return getJoinNode_2005Text(view);
		case DecisionNodeEditPart.VISUAL_ID:
			return getDecisionNode_2006Text(view);
		case TransitionEditPart.VISUAL_ID:
			return getTransition_4001Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	* @generated
	*/
	private String getActivityDiagram_1000Text(View view) {
		ActivityDiagram domainModelElement = (ActivityDiagram) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			ActivitydiagramDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getInitialNode_2001Text(View view) {
		InitialNode domainModelElement = (InitialNode) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			ActivitydiagramDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 2001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getFinalNode_2002Text(View view) {
		FinalNode domainModelElement = (FinalNode) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			ActivitydiagramDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 2002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getActivityNode_2003Text(View view) {
		IParser parser = ActivitydiagramParserProvider.getParser(ActivitydiagramElementTypes.ActivityNode_2003,
				view.getElement() != null ? view.getElement() : view,
				ActivitydiagramVisualIDRegistry.getType(ActivityNodeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActivitydiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getForkNode_2004Text(View view) {
		ForkNode domainModelElement = (ForkNode) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			ActivitydiagramDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 2004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getJoinNode_2005Text(View view) {
		JoinNode domainModelElement = (JoinNode) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			ActivitydiagramDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 2005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDecisionNode_2006Text(View view) {
		DecisionNode domainModelElement = (DecisionNode) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			ActivitydiagramDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 2006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTransition_4001Text(View view) {
		IParser parser = ActivitydiagramParserProvider.getParser(ActivitydiagramElementTypes.Transition_4001,
				view.getElement() != null ? view.getElement() : view,
				ActivitydiagramVisualIDRegistry.getType(TransitionNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ActivitydiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
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
		return ActivityDiagramEditPart.MODEL_ID.equals(ActivitydiagramVisualIDRegistry.getModelID(view));
	}

}
