/*
 * 
 */
package activitydiagram.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import activitydiagram.diagram.providers.ActivitydiagramElementTypes;
import activitydiagram.diagram.providers.ActivitydiagramModelingAssistantProvider;

/**
 * @generated
 */
public class ActivitydiagramModelingAssistantProviderOfActivityDiagramEditPart
		extends ActivitydiagramModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(6);
		types.add(ActivitydiagramElementTypes.InitialNode_2001);
		types.add(ActivitydiagramElementTypes.FinalNode_2002);
		types.add(ActivitydiagramElementTypes.ActivityNode_2003);
		types.add(ActivitydiagramElementTypes.ForkNode_2004);
		types.add(ActivitydiagramElementTypes.JoinNode_2005);
		types.add(ActivitydiagramElementTypes.DecisionNode_2006);
		return types;
	}

}
