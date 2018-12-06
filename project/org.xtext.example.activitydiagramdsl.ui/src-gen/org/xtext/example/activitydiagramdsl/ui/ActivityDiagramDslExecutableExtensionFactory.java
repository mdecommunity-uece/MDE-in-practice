/*
 * generated by Xtext 2.14.0
 */
package org.xtext.example.activitydiagramdsl.ui;

import com.google.inject.Injector;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.xtext.example.activitydiagramdsl.ui.internal.ActivitydiagramdslActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class ActivityDiagramDslExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(ActivitydiagramdslActivator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		ActivitydiagramdslActivator activator = ActivitydiagramdslActivator.getInstance();
		return activator != null ? activator.getInjector(ActivitydiagramdslActivator.ORG_XTEXT_EXAMPLE_ACTIVITYDIAGRAMDSL_ACTIVITYDIAGRAMDSL) : null;
	}

}