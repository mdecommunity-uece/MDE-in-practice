package figures;

import org.eclipse.draw2d.ImageFigure;

import activitydiagram.figures.activator.PluginActivator;

public class ActivityDiagramDecisionFigure extends ImageFigure {
	
	public ActivityDiagramDecisionFigure() {
		// TODO Auto-generated constructor stub
		super(PluginActivator.imageDescriptorFromPlugin(PluginActivator.ID, "images/decisionNode.png").createImage(), 0);
	}

}
