/*
 * 
 */
package activitydiagram.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import activitydiagram.diagram.edit.parts.ActivityDiagramEditPart;
import activitydiagram.diagram.edit.parts.ActivitydiagramEditPartFactory;
import activitydiagram.diagram.part.ActivitydiagramVisualIDRegistry;

/**
 * @generated
 */
public class ActivitydiagramEditPartProvider extends DefaultEditPartProvider {

	/**
	* @generated
	*/
	public ActivitydiagramEditPartProvider() {
		super(new ActivitydiagramEditPartFactory(), ActivitydiagramVisualIDRegistry.TYPED_INSTANCE,
				ActivityDiagramEditPart.MODEL_ID);
	}

}
