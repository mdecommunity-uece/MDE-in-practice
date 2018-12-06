/*
* 
*/
package activitydiagram.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import activitydiagram.diagram.part.ActivitydiagramVisualIDRegistry;

/**
 * @generated
 */
public class ActivitydiagramNavigatorSorter extends ViewerSorter {

	/**
	* @generated
	*/
	private static final int GROUP_CATEGORY = 4003;

	/**
	* @generated
	*/
	private static final int SHORTCUTS_CATEGORY = 4002;

	/**
	* @generated
	*/
	public int category(Object element) {
		if (element instanceof ActivitydiagramNavigatorItem) {
			ActivitydiagramNavigatorItem item = (ActivitydiagramNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return ActivitydiagramVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
