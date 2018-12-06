/*
 * generated by Xtext 2.14.0
 */
package org.xtext.example.activitydiagramdsl.ide

import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2
import org.xtext.example.activitydiagramdsl.ActivityDiagramDslRuntimeModule
import org.xtext.example.activitydiagramdsl.ActivityDiagramDslStandaloneSetup

/**
 * Initialization support for running Xtext languages as language servers.
 */
class ActivityDiagramDslIdeSetup extends ActivityDiagramDslStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new ActivityDiagramDslRuntimeModule, new ActivityDiagramDslIdeModule))
	}
	
}