/*
 * generated by Xtext 2.14.0
 */
package org.xtext.example.activitydiagramdsl.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import org.xtext.example.activitydiagramdsl.ui.internal.ActivitydiagramdslActivator;

public class ActivityDiagramDslUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return ActivitydiagramdslActivator.getInstance().getInjector("org.xtext.example.activitydiagramdsl.ActivityDiagramDsl");
	}

}
