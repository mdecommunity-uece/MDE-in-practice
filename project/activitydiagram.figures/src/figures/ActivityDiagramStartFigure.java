package figures;

import org.eclipse.draw2d.ImageFigure;

import activitydiagram.figures.activator.PluginActivator;

public class ActivityDiagramStartFigure extends ImageFigure {
	
	public ActivityDiagramStartFigure() {
		// TODO Auto-generated constructor stub
		super(PluginActivator.imageDescriptorFromPlugin(PluginActivator.ID, "images/startNode.png").createImage(), 0);
	}

}