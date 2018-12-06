/*
* 
*/
package activitydiagram.diagram.part;

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

import activitydiagram.ActivityDiagram;
import activitydiagram.ActivityNode;
import activitydiagram.ActivitydiagramPackage;
import activitydiagram.DecisionNode;
import activitydiagram.FinalNode;
import activitydiagram.ForkNode;
import activitydiagram.InitialNode;
import activitydiagram.JoinNode;
import activitydiagram.Node;
import activitydiagram.Transition;
import activitydiagram.diagram.edit.parts.ActivityDiagramEditPart;
import activitydiagram.diagram.edit.parts.ActivityNodeEditPart;
import activitydiagram.diagram.edit.parts.DecisionNodeEditPart;
import activitydiagram.diagram.edit.parts.FinalNodeEditPart;
import activitydiagram.diagram.edit.parts.ForkNodeEditPart;
import activitydiagram.diagram.edit.parts.InitialNodeEditPart;
import activitydiagram.diagram.edit.parts.JoinNodeEditPart;
import activitydiagram.diagram.edit.parts.TransitionEditPart;
import activitydiagram.diagram.providers.ActivitydiagramElementTypes;

/**
 * @generated
 */
public class ActivitydiagramDiagramUpdater {

	/**
	* @generated
	*/
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null || view.getElement().eIsProxy();
	}

	/**
	* @generated
	*/
	public static List<ActivitydiagramNodeDescriptor> getSemanticChildren(View view) {
		switch (ActivitydiagramVisualIDRegistry.getVisualID(view)) {
		case ActivityDiagramEditPart.VISUAL_ID:
			return getActivityDiagram_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<ActivitydiagramNodeDescriptor> getActivityDiagram_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		ActivityDiagram modelElement = (ActivityDiagram) view.getElement();
		LinkedList<ActivitydiagramNodeDescriptor> result = new LinkedList<ActivitydiagramNodeDescriptor>();
		{
			InitialNode childElement = modelElement.getInitialNode();
			int visualID = ActivitydiagramVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == InitialNodeEditPart.VISUAL_ID) {
				result.add(new ActivitydiagramNodeDescriptor(childElement, visualID));
			}
		}
		{
			FinalNode childElement = modelElement.getFinalNode();
			int visualID = ActivitydiagramVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == FinalNodeEditPart.VISUAL_ID) {
				result.add(new ActivitydiagramNodeDescriptor(childElement, visualID));
			}
		}
		for (Iterator<?> it = modelElement.getActivityNodes().iterator(); it.hasNext();) {
			ActivityNode childElement = (ActivityNode) it.next();
			int visualID = ActivitydiagramVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ActivityNodeEditPart.VISUAL_ID) {
				result.add(new ActivitydiagramNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getForkNodes().iterator(); it.hasNext();) {
			ForkNode childElement = (ForkNode) it.next();
			int visualID = ActivitydiagramVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ForkNodeEditPart.VISUAL_ID) {
				result.add(new ActivitydiagramNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getJoinNodes().iterator(); it.hasNext();) {
			JoinNode childElement = (JoinNode) it.next();
			int visualID = ActivitydiagramVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == JoinNodeEditPart.VISUAL_ID) {
				result.add(new ActivitydiagramNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getDecisionNodes().iterator(); it.hasNext();) {
			DecisionNode childElement = (DecisionNode) it.next();
			int visualID = ActivitydiagramVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == DecisionNodeEditPart.VISUAL_ID) {
				result.add(new ActivitydiagramNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ActivitydiagramLinkDescriptor> getContainedLinks(View view) {
		switch (ActivitydiagramVisualIDRegistry.getVisualID(view)) {
		case ActivityDiagramEditPart.VISUAL_ID:
			return getActivityDiagram_1000ContainedLinks(view);
		case InitialNodeEditPart.VISUAL_ID:
			return getInitialNode_2001ContainedLinks(view);
		case FinalNodeEditPart.VISUAL_ID:
			return getFinalNode_2002ContainedLinks(view);
		case ActivityNodeEditPart.VISUAL_ID:
			return getActivityNode_2003ContainedLinks(view);
		case ForkNodeEditPart.VISUAL_ID:
			return getForkNode_2004ContainedLinks(view);
		case JoinNodeEditPart.VISUAL_ID:
			return getJoinNode_2005ContainedLinks(view);
		case DecisionNodeEditPart.VISUAL_ID:
			return getDecisionNode_2006ContainedLinks(view);
		case TransitionEditPart.VISUAL_ID:
			return getTransition_4001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<ActivitydiagramLinkDescriptor> getIncomingLinks(View view) {
		switch (ActivitydiagramVisualIDRegistry.getVisualID(view)) {
		case InitialNodeEditPart.VISUAL_ID:
			return getInitialNode_2001IncomingLinks(view);
		case FinalNodeEditPart.VISUAL_ID:
			return getFinalNode_2002IncomingLinks(view);
		case ActivityNodeEditPart.VISUAL_ID:
			return getActivityNode_2003IncomingLinks(view);
		case ForkNodeEditPart.VISUAL_ID:
			return getForkNode_2004IncomingLinks(view);
		case JoinNodeEditPart.VISUAL_ID:
			return getJoinNode_2005IncomingLinks(view);
		case DecisionNodeEditPart.VISUAL_ID:
			return getDecisionNode_2006IncomingLinks(view);
		case TransitionEditPart.VISUAL_ID:
			return getTransition_4001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<ActivitydiagramLinkDescriptor> getOutgoingLinks(View view) {
		switch (ActivitydiagramVisualIDRegistry.getVisualID(view)) {
		case InitialNodeEditPart.VISUAL_ID:
			return getInitialNode_2001OutgoingLinks(view);
		case FinalNodeEditPart.VISUAL_ID:
			return getFinalNode_2002OutgoingLinks(view);
		case ActivityNodeEditPart.VISUAL_ID:
			return getActivityNode_2003OutgoingLinks(view);
		case ForkNodeEditPart.VISUAL_ID:
			return getForkNode_2004OutgoingLinks(view);
		case JoinNodeEditPart.VISUAL_ID:
			return getJoinNode_2005OutgoingLinks(view);
		case DecisionNodeEditPart.VISUAL_ID:
			return getDecisionNode_2006OutgoingLinks(view);
		case TransitionEditPart.VISUAL_ID:
			return getTransition_4001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ActivitydiagramLinkDescriptor> getActivityDiagram_1000ContainedLinks(View view) {
		ActivityDiagram modelElement = (ActivityDiagram) view.getElement();
		LinkedList<ActivitydiagramLinkDescriptor> result = new LinkedList<ActivitydiagramLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivitydiagramLinkDescriptor> getInitialNode_2001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ActivitydiagramLinkDescriptor> getFinalNode_2002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ActivitydiagramLinkDescriptor> getActivityNode_2003ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ActivitydiagramLinkDescriptor> getForkNode_2004ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ActivitydiagramLinkDescriptor> getJoinNode_2005ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ActivitydiagramLinkDescriptor> getDecisionNode_2006ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ActivitydiagramLinkDescriptor> getTransition_4001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ActivitydiagramLinkDescriptor> getInitialNode_2001IncomingLinks(View view) {
		InitialNode modelElement = (InitialNode) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ActivitydiagramLinkDescriptor> result = new LinkedList<ActivitydiagramLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivitydiagramLinkDescriptor> getFinalNode_2002IncomingLinks(View view) {
		FinalNode modelElement = (FinalNode) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ActivitydiagramLinkDescriptor> result = new LinkedList<ActivitydiagramLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivitydiagramLinkDescriptor> getActivityNode_2003IncomingLinks(View view) {
		ActivityNode modelElement = (ActivityNode) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ActivitydiagramLinkDescriptor> result = new LinkedList<ActivitydiagramLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivitydiagramLinkDescriptor> getForkNode_2004IncomingLinks(View view) {
		ForkNode modelElement = (ForkNode) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ActivitydiagramLinkDescriptor> result = new LinkedList<ActivitydiagramLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivitydiagramLinkDescriptor> getJoinNode_2005IncomingLinks(View view) {
		JoinNode modelElement = (JoinNode) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ActivitydiagramLinkDescriptor> result = new LinkedList<ActivitydiagramLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivitydiagramLinkDescriptor> getDecisionNode_2006IncomingLinks(View view) {
		DecisionNode modelElement = (DecisionNode) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ActivitydiagramLinkDescriptor> result = new LinkedList<ActivitydiagramLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivitydiagramLinkDescriptor> getTransition_4001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ActivitydiagramLinkDescriptor> getInitialNode_2001OutgoingLinks(View view) {
		InitialNode modelElement = (InitialNode) view.getElement();
		LinkedList<ActivitydiagramLinkDescriptor> result = new LinkedList<ActivitydiagramLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivitydiagramLinkDescriptor> getFinalNode_2002OutgoingLinks(View view) {
		FinalNode modelElement = (FinalNode) view.getElement();
		LinkedList<ActivitydiagramLinkDescriptor> result = new LinkedList<ActivitydiagramLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivitydiagramLinkDescriptor> getActivityNode_2003OutgoingLinks(View view) {
		ActivityNode modelElement = (ActivityNode) view.getElement();
		LinkedList<ActivitydiagramLinkDescriptor> result = new LinkedList<ActivitydiagramLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivitydiagramLinkDescriptor> getForkNode_2004OutgoingLinks(View view) {
		ForkNode modelElement = (ForkNode) view.getElement();
		LinkedList<ActivitydiagramLinkDescriptor> result = new LinkedList<ActivitydiagramLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivitydiagramLinkDescriptor> getJoinNode_2005OutgoingLinks(View view) {
		JoinNode modelElement = (JoinNode) view.getElement();
		LinkedList<ActivitydiagramLinkDescriptor> result = new LinkedList<ActivitydiagramLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivitydiagramLinkDescriptor> getDecisionNode_2006OutgoingLinks(View view) {
		DecisionNode modelElement = (DecisionNode) view.getElement();
		LinkedList<ActivitydiagramLinkDescriptor> result = new LinkedList<ActivitydiagramLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ActivitydiagramLinkDescriptor> getTransition_4001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	private static Collection<ActivitydiagramLinkDescriptor> getContainedTypeModelFacetLinks_Transition_4001(
			ActivityDiagram container) {
		LinkedList<ActivitydiagramLinkDescriptor> result = new LinkedList<ActivitydiagramLinkDescriptor>();
		for (Iterator<?> links = container.getTrasitions().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Transition) {
				continue;
			}
			Transition link = (Transition) linkObject;
			if (TransitionEditPart.VISUAL_ID != ActivitydiagramVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Node dst = link.getTarget();
			Node src = link.getSource();
			result.add(new ActivitydiagramLinkDescriptor(src, dst, link, ActivitydiagramElementTypes.Transition_4001,
					TransitionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ActivitydiagramLinkDescriptor> getIncomingTypeModelFacetLinks_Transition_4001(Node target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ActivitydiagramLinkDescriptor> result = new LinkedList<ActivitydiagramLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ActivitydiagramPackage.eINSTANCE.getTransition_Target()
					|| false == setting.getEObject() instanceof Transition) {
				continue;
			}
			Transition link = (Transition) setting.getEObject();
			if (TransitionEditPart.VISUAL_ID != ActivitydiagramVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Node src = link.getSource();
			result.add(new ActivitydiagramLinkDescriptor(src, target, link, ActivitydiagramElementTypes.Transition_4001,
					TransitionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ActivitydiagramLinkDescriptor> getOutgoingTypeModelFacetLinks_Transition_4001(
			Node source) {
		ActivityDiagram container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof ActivityDiagram) {
				container = (ActivityDiagram) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<ActivitydiagramLinkDescriptor> result = new LinkedList<ActivitydiagramLinkDescriptor>();
		for (Iterator<?> links = container.getTrasitions().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Transition) {
				continue;
			}
			Transition link = (Transition) linkObject;
			if (TransitionEditPart.VISUAL_ID != ActivitydiagramVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Node dst = link.getTarget();
			Node src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new ActivitydiagramLinkDescriptor(src, dst, link, ActivitydiagramElementTypes.Transition_4001,
					TransitionEditPart.VISUAL_ID));
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

		public List<ActivitydiagramNodeDescriptor> getSemanticChildren(View view) {
			return ActivitydiagramDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<ActivitydiagramLinkDescriptor> getContainedLinks(View view) {
			return ActivitydiagramDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<ActivitydiagramLinkDescriptor> getIncomingLinks(View view) {
			return ActivitydiagramDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<ActivitydiagramLinkDescriptor> getOutgoingLinks(View view) {
			return ActivitydiagramDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
