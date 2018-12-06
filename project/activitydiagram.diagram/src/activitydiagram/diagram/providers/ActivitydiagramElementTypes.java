/*
 * 
 */
package activitydiagram.diagram.providers;

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

import activitydiagram.ActivitydiagramPackage;
import activitydiagram.diagram.edit.parts.ActivityDiagramEditPart;
import activitydiagram.diagram.edit.parts.ActivityNodeEditPart;
import activitydiagram.diagram.edit.parts.DecisionNodeEditPart;
import activitydiagram.diagram.edit.parts.FinalNodeEditPart;
import activitydiagram.diagram.edit.parts.ForkNodeEditPart;
import activitydiagram.diagram.edit.parts.InitialNodeEditPart;
import activitydiagram.diagram.edit.parts.JoinNodeEditPart;
import activitydiagram.diagram.edit.parts.TransitionEditPart;
import activitydiagram.diagram.part.ActivitydiagramDiagramEditorPlugin;

/**
 * @generated
 */
public class ActivitydiagramElementTypes {

	/**
	* @generated
	*/
	private ActivitydiagramElementTypes() {
	}

	/**
	* @generated
	*/
	private static Map<IElementType, ENamedElement> elements;

	/**
	* @generated
	*/
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			ActivitydiagramDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());

	/**
	* @generated
	*/
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	* @generated
	*/
	public static final IElementType ActivityDiagram_1000 = getElementType(
			"activitydiagram.diagram.ActivityDiagram_1000"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType InitialNode_2001 = getElementType("activitydiagram.diagram.InitialNode_2001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType FinalNode_2002 = getElementType("activitydiagram.diagram.FinalNode_2002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ActivityNode_2003 = getElementType("activitydiagram.diagram.ActivityNode_2003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ForkNode_2004 = getElementType("activitydiagram.diagram.ForkNode_2004"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType JoinNode_2005 = getElementType("activitydiagram.diagram.JoinNode_2005"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType DecisionNode_2006 = getElementType("activitydiagram.diagram.DecisionNode_2006"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Transition_4001 = getElementType("activitydiagram.diagram.Transition_4001"); //$NON-NLS-1$

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

			elements.put(ActivityDiagram_1000, ActivitydiagramPackage.eINSTANCE.getActivityDiagram());

			elements.put(InitialNode_2001, ActivitydiagramPackage.eINSTANCE.getInitialNode());

			elements.put(FinalNode_2002, ActivitydiagramPackage.eINSTANCE.getFinalNode());

			elements.put(ActivityNode_2003, ActivitydiagramPackage.eINSTANCE.getActivityNode());

			elements.put(ForkNode_2004, ActivitydiagramPackage.eINSTANCE.getForkNode());

			elements.put(JoinNode_2005, ActivitydiagramPackage.eINSTANCE.getJoinNode());

			elements.put(DecisionNode_2006, ActivitydiagramPackage.eINSTANCE.getDecisionNode());

			elements.put(Transition_4001, ActivitydiagramPackage.eINSTANCE.getTransition());
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
			KNOWN_ELEMENT_TYPES.add(ActivityDiagram_1000);
			KNOWN_ELEMENT_TYPES.add(InitialNode_2001);
			KNOWN_ELEMENT_TYPES.add(FinalNode_2002);
			KNOWN_ELEMENT_TYPES.add(ActivityNode_2003);
			KNOWN_ELEMENT_TYPES.add(ForkNode_2004);
			KNOWN_ELEMENT_TYPES.add(JoinNode_2005);
			KNOWN_ELEMENT_TYPES.add(DecisionNode_2006);
			KNOWN_ELEMENT_TYPES.add(Transition_4001);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	* @generated
	*/
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case ActivityDiagramEditPart.VISUAL_ID:
			return ActivityDiagram_1000;
		case InitialNodeEditPart.VISUAL_ID:
			return InitialNode_2001;
		case FinalNodeEditPart.VISUAL_ID:
			return FinalNode_2002;
		case ActivityNodeEditPart.VISUAL_ID:
			return ActivityNode_2003;
		case ForkNodeEditPart.VISUAL_ID:
			return ForkNode_2004;
		case JoinNodeEditPart.VISUAL_ID:
			return JoinNode_2005;
		case DecisionNodeEditPart.VISUAL_ID:
			return DecisionNode_2006;
		case TransitionEditPart.VISUAL_ID:
			return Transition_4001;
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
			return activitydiagram.diagram.providers.ActivitydiagramElementTypes.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return activitydiagram.diagram.providers.ActivitydiagramElementTypes.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return activitydiagram.diagram.providers.ActivitydiagramElementTypes.getElement(elementTypeAdapter);
		}
	};

}
