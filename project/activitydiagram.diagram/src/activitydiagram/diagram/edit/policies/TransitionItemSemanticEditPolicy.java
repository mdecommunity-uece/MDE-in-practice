/*
* 
*/
package activitydiagram.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import activitydiagram.diagram.providers.ActivitydiagramElementTypes;

/**
 * @generated
 */
public class TransitionItemSemanticEditPolicy extends ActivitydiagramBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public TransitionItemSemanticEditPolicy() {
		super(ActivitydiagramElementTypes.Transition_4001);
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
