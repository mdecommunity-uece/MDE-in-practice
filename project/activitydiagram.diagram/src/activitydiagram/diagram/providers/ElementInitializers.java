/*
 * 
 */
package activitydiagram.diagram.providers;

import activitydiagram.diagram.part.ActivitydiagramDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	* @generated
	*/
	public static ElementInitializers getInstance() {
		ElementInitializers cached = ActivitydiagramDiagramEditorPlugin.getInstance().getElementInitializers();
		if (cached == null) {
			ActivitydiagramDiagramEditorPlugin.getInstance().setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
