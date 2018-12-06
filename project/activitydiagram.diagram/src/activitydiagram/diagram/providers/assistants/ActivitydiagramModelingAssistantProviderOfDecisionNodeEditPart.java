/*
 * 
 */
package activitydiagram.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import activitydiagram.diagram.edit.parts.ActivityNodeEditPart;
import activitydiagram.diagram.edit.parts.DecisionNodeEditPart;
import activitydiagram.diagram.edit.parts.FinalNodeEditPart;
import activitydiagram.diagram.edit.parts.ForkNodeEditPart;
import activitydiagram.diagram.edit.parts.InitialNodeEditPart;
import activitydiagram.diagram.edit.parts.JoinNodeEditPart;
import activitydiagram.diagram.providers.ActivitydiagramElementTypes;
import activitydiagram.diagram.providers.ActivitydiagramModelingAssistantProvider;

/**
 * @generated
 */
public class ActivitydiagramModelingAssistantProviderOfDecisionNodeEditPart
		extends ActivitydiagramModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((DecisionNodeEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(DecisionNodeEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(ActivitydiagramElementTypes.Transition_4001);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((DecisionNodeEditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(DecisionNodeEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof InitialNodeEditPart) {
			types.add(ActivitydiagramElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof FinalNodeEditPart) {
			types.add(ActivitydiagramElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof ActivityNodeEditPart) {
			types.add(ActivitydiagramElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof ForkNodeEditPart) {
			types.add(ActivitydiagramElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof JoinNodeEditPart) {
			types.add(ActivitydiagramElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof DecisionNodeEditPart) {
			types.add(ActivitydiagramElementTypes.Transition_4001);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((DecisionNodeEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(DecisionNodeEditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == ActivitydiagramElementTypes.Transition_4001) {
			types.add(ActivitydiagramElementTypes.InitialNode_2001);
			types.add(ActivitydiagramElementTypes.FinalNode_2002);
			types.add(ActivitydiagramElementTypes.ActivityNode_2003);
			types.add(ActivitydiagramElementTypes.ForkNode_2004);
			types.add(ActivitydiagramElementTypes.JoinNode_2005);
			types.add(ActivitydiagramElementTypes.DecisionNode_2006);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((DecisionNodeEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(DecisionNodeEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(ActivitydiagramElementTypes.Transition_4001);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((DecisionNodeEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(DecisionNodeEditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == ActivitydiagramElementTypes.Transition_4001) {
			types.add(ActivitydiagramElementTypes.InitialNode_2001);
			types.add(ActivitydiagramElementTypes.FinalNode_2002);
			types.add(ActivitydiagramElementTypes.ActivityNode_2003);
			types.add(ActivitydiagramElementTypes.ForkNode_2004);
			types.add(ActivitydiagramElementTypes.JoinNode_2005);
			types.add(ActivitydiagramElementTypes.DecisionNode_2006);
		}
		return types;
	}

}
