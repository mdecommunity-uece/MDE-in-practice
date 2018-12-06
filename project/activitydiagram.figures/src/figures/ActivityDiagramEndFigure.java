package figures;

import org.eclipse.draw2d.ImageFigure;

import activitydiagram.figures.activator.PluginActivator;

public class ActivityDiagramEndFigure extends ImageFigure {
	public ActivityDiagramEndFigure() {
		// TODO Auto-generated constructor stub
		super(PluginActivator.imageDescriptorFromPlugin(PluginActivator.ID, "images/finalNode.png").createImage(), 0);
	}

}
