/*
* 
*/
package activitydiagram.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import activitydiagram.diagram.edit.commands.ActivityNodeCreateCommand;
import activitydiagram.diagram.edit.commands.DecisionNodeCreateCommand;
import activitydiagram.diagram.edit.commands.FinalNodeCreateCommand;
import activitydiagram.diagram.edit.commands.ForkNodeCreateCommand;
import activitydiagram.diagram.edit.commands.InitialNodeCreateCommand;
import activitydiagram.diagram.edit.commands.JoinNodeCreateCommand;
import activitydiagram.diagram.providers.ActivitydiagramElementTypes;

/**
 * @generated
 */
public class ActivityDiagramItemSemanticEditPolicy extends ActivitydiagramBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public ActivityDiagramItemSemanticEditPolicy() {
		super(ActivitydiagramElementTypes.ActivityDiagram_1000);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ActivitydiagramElementTypes.InitialNode_2001 == req.getElementType()) {
			return getGEFWrapper(new InitialNodeCreateCommand(req));
		}
		if (ActivitydiagramElementTypes.FinalNode_2002 == req.getElementType()) {
			return getGEFWrapper(new FinalNodeCreateCommand(req));
		}
		if (ActivitydiagramElementTypes.ActivityNode_2003 == req.getElementType()) {
			return getGEFWrapper(new ActivityNodeCreateCommand(req));
		}
		if (ActivitydiagramElementTypes.ForkNode_2004 == req.getElementType()) {
			return getGEFWrapper(new ForkNodeCreateCommand(req));
		}
		if (ActivitydiagramElementTypes.JoinNode_2005 == req.getElementType()) {
			return getGEFWrapper(new JoinNodeCreateCommand(req));
		}
		if (ActivitydiagramElementTypes.DecisionNode_2006 == req.getElementType()) {
			return getGEFWrapper(new DecisionNodeCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	* @generated
	*/
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost()).getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	* @generated
	*/
	private static class DuplicateAnythingCommand extends DuplicateEObjectsCommand {

		/**
		* @generated
		*/
		public DuplicateAnythingCommand(TransactionalEditingDomain editingDomain, DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req.getElementsToBeDuplicated(), req.getAllDuplicatedElementsMap());
		}

	}

}
