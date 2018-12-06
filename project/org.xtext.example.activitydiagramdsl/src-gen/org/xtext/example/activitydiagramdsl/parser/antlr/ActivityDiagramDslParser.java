/*
 * generated by Xtext 2.14.0
 */
package org.xtext.example.activitydiagramdsl.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.example.activitydiagramdsl.parser.antlr.internal.InternalActivityDiagramDslParser;
import org.xtext.example.activitydiagramdsl.services.ActivityDiagramDslGrammarAccess;

public class ActivityDiagramDslParser extends AbstractAntlrParser {

	@Inject
	private ActivityDiagramDslGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalActivityDiagramDslParser createParser(XtextTokenStream stream) {
		return new InternalActivityDiagramDslParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "ActivityDiagram";
	}

	public ActivityDiagramDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(ActivityDiagramDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}