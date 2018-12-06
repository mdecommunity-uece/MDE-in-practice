package figures;

import org.eclipse.draw2d.ImageFigure;

import activitydiagram.figures.activator.PluginActivator;

public class ActivityDiagramJoinFigure extends ImageFigure {
	public ActivityDiagramJoinFigure() {
		// TODO Auto-generated constructor stub
		super(PluginActivator.imageDescriptorFromPlugin(PluginActivator.ID, "images/forkNode.png").createImage(), 0);
	}

}
