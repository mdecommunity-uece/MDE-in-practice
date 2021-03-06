/*
 * generated by Xtext 2.14.0
 */
package org.xtext.example.activitydiagramdsl.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.example.activitydiagramdsl.ide.contentassist.antlr.internal.InternalActivityDiagramDslParser;
import org.xtext.example.activitydiagramdsl.services.ActivityDiagramDslGrammarAccess;

public class ActivityDiagramDslParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(ActivityDiagramDslGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, ActivityDiagramDslGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getNodeAccess().getAlternatives(), "rule__Node__Alternatives");
			builder.put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
			builder.put(grammarAccess.getActivityDiagramAccess().getGroup(), "rule__ActivityDiagram__Group__0");
			builder.put(grammarAccess.getActivityDiagramAccess().getGroup_4(), "rule__ActivityDiagram__Group_4__0");
			builder.put(grammarAccess.getActivityDiagramAccess().getGroup_5(), "rule__ActivityDiagram__Group_5__0");
			builder.put(grammarAccess.getActivityDiagramAccess().getGroup_6(), "rule__ActivityDiagram__Group_6__0");
			builder.put(grammarAccess.getActivityDiagramAccess().getGroup_6_3(), "rule__ActivityDiagram__Group_6_3__0");
			builder.put(grammarAccess.getActivityDiagramAccess().getGroup_7(), "rule__ActivityDiagram__Group_7__0");
			builder.put(grammarAccess.getActivityDiagramAccess().getGroup_7_3(), "rule__ActivityDiagram__Group_7_3__0");
			builder.put(grammarAccess.getActivityDiagramAccess().getGroup_8(), "rule__ActivityDiagram__Group_8__0");
			builder.put(grammarAccess.getActivityDiagramAccess().getGroup_8_3(), "rule__ActivityDiagram__Group_8_3__0");
			builder.put(grammarAccess.getActivityDiagramAccess().getGroup_9(), "rule__ActivityDiagram__Group_9__0");
			builder.put(grammarAccess.getActivityDiagramAccess().getGroup_9_3(), "rule__ActivityDiagram__Group_9_3__0");
			builder.put(grammarAccess.getActivityDiagramAccess().getGroup_10(), "rule__ActivityDiagram__Group_10__0");
			builder.put(grammarAccess.getActivityDiagramAccess().getGroup_10_3(), "rule__ActivityDiagram__Group_10_3__0");
			builder.put(grammarAccess.getInitialNodeAccess().getGroup(), "rule__InitialNode__Group__0");
			builder.put(grammarAccess.getInitialNodeAccess().getGroup_4(), "rule__InitialNode__Group_4__0");
			builder.put(grammarAccess.getInitialNodeAccess().getGroup_4_3(), "rule__InitialNode__Group_4_3__0");
			builder.put(grammarAccess.getInitialNodeAccess().getGroup_5(), "rule__InitialNode__Group_5__0");
			builder.put(grammarAccess.getInitialNodeAccess().getGroup_5_3(), "rule__InitialNode__Group_5_3__0");
			builder.put(grammarAccess.getFinalNodeAccess().getGroup(), "rule__FinalNode__Group__0");
			builder.put(grammarAccess.getFinalNodeAccess().getGroup_4(), "rule__FinalNode__Group_4__0");
			builder.put(grammarAccess.getFinalNodeAccess().getGroup_4_3(), "rule__FinalNode__Group_4_3__0");
			builder.put(grammarAccess.getFinalNodeAccess().getGroup_5(), "rule__FinalNode__Group_5__0");
			builder.put(grammarAccess.getFinalNodeAccess().getGroup_5_3(), "rule__FinalNode__Group_5_3__0");
			builder.put(grammarAccess.getTransitionAccess().getGroup(), "rule__Transition__Group__0");
			builder.put(grammarAccess.getTransitionAccess().getGroup_4(), "rule__Transition__Group_4__0");
			builder.put(grammarAccess.getTransitionAccess().getGroup_5(), "rule__Transition__Group_5__0");
			builder.put(grammarAccess.getActivityNodeAccess().getGroup(), "rule__ActivityNode__Group__0");
			builder.put(grammarAccess.getActivityNodeAccess().getGroup_4(), "rule__ActivityNode__Group_4__0");
			builder.put(grammarAccess.getActivityNodeAccess().getGroup_4_3(), "rule__ActivityNode__Group_4_3__0");
			builder.put(grammarAccess.getActivityNodeAccess().getGroup_5(), "rule__ActivityNode__Group_5__0");
			builder.put(grammarAccess.getActivityNodeAccess().getGroup_5_3(), "rule__ActivityNode__Group_5_3__0");
			builder.put(grammarAccess.getForkNodeAccess().getGroup(), "rule__ForkNode__Group__0");
			builder.put(grammarAccess.getForkNodeAccess().getGroup_4(), "rule__ForkNode__Group_4__0");
			builder.put(grammarAccess.getForkNodeAccess().getGroup_4_3(), "rule__ForkNode__Group_4_3__0");
			builder.put(grammarAccess.getForkNodeAccess().getGroup_5(), "rule__ForkNode__Group_5__0");
			builder.put(grammarAccess.getForkNodeAccess().getGroup_5_3(), "rule__ForkNode__Group_5_3__0");
			builder.put(grammarAccess.getJoinNodeAccess().getGroup(), "rule__JoinNode__Group__0");
			builder.put(grammarAccess.getJoinNodeAccess().getGroup_4(), "rule__JoinNode__Group_4__0");
			builder.put(grammarAccess.getJoinNodeAccess().getGroup_4_3(), "rule__JoinNode__Group_4_3__0");
			builder.put(grammarAccess.getJoinNodeAccess().getGroup_5(), "rule__JoinNode__Group_5__0");
			builder.put(grammarAccess.getJoinNodeAccess().getGroup_5_3(), "rule__JoinNode__Group_5_3__0");
			builder.put(grammarAccess.getDecisionNodeAccess().getGroup(), "rule__DecisionNode__Group__0");
			builder.put(grammarAccess.getDecisionNodeAccess().getGroup_4(), "rule__DecisionNode__Group_4__0");
			builder.put(grammarAccess.getDecisionNodeAccess().getGroup_4_3(), "rule__DecisionNode__Group_4_3__0");
			builder.put(grammarAccess.getDecisionNodeAccess().getGroup_5(), "rule__DecisionNode__Group_5__0");
			builder.put(grammarAccess.getDecisionNodeAccess().getGroup_5_3(), "rule__DecisionNode__Group_5_3__0");
			builder.put(grammarAccess.getNode_ImplAccess().getGroup(), "rule__Node_Impl__Group__0");
			builder.put(grammarAccess.getNode_ImplAccess().getGroup_4(), "rule__Node_Impl__Group_4__0");
			builder.put(grammarAccess.getNode_ImplAccess().getGroup_4_3(), "rule__Node_Impl__Group_4_3__0");
			builder.put(grammarAccess.getNode_ImplAccess().getGroup_5(), "rule__Node_Impl__Group_5__0");
			builder.put(grammarAccess.getNode_ImplAccess().getGroup_5_3(), "rule__Node_Impl__Group_5_3__0");
			builder.put(grammarAccess.getActivityDiagramAccess().getNameAssignment_2(), "rule__ActivityDiagram__NameAssignment_2");
			builder.put(grammarAccess.getActivityDiagramAccess().getInitialNodeAssignment_4_1(), "rule__ActivityDiagram__InitialNodeAssignment_4_1");
			builder.put(grammarAccess.getActivityDiagramAccess().getFinalNodeAssignment_5_1(), "rule__ActivityDiagram__FinalNodeAssignment_5_1");
			builder.put(grammarAccess.getActivityDiagramAccess().getTrasitionsAssignment_6_2(), "rule__ActivityDiagram__TrasitionsAssignment_6_2");
			builder.put(grammarAccess.getActivityDiagramAccess().getTrasitionsAssignment_6_3_1(), "rule__ActivityDiagram__TrasitionsAssignment_6_3_1");
			builder.put(grammarAccess.getActivityDiagramAccess().getActivityNodesAssignment_7_2(), "rule__ActivityDiagram__ActivityNodesAssignment_7_2");
			builder.put(grammarAccess.getActivityDiagramAccess().getActivityNodesAssignment_7_3_1(), "rule__ActivityDiagram__ActivityNodesAssignment_7_3_1");
			builder.put(grammarAccess.getActivityDiagramAccess().getForkNodesAssignment_8_2(), "rule__ActivityDiagram__ForkNodesAssignment_8_2");
			builder.put(grammarAccess.getActivityDiagramAccess().getForkNodesAssignment_8_3_1(), "rule__ActivityDiagram__ForkNodesAssignment_8_3_1");
			builder.put(grammarAccess.getActivityDiagramAccess().getJoinNodesAssignment_9_2(), "rule__ActivityDiagram__JoinNodesAssignment_9_2");
			builder.put(grammarAccess.getActivityDiagramAccess().getJoinNodesAssignment_9_3_1(), "rule__ActivityDiagram__JoinNodesAssignment_9_3_1");
			builder.put(grammarAccess.getActivityDiagramAccess().getDecisionNodesAssignment_10_2(), "rule__ActivityDiagram__DecisionNodesAssignment_10_2");
			builder.put(grammarAccess.getActivityDiagramAccess().getDecisionNodesAssignment_10_3_1(), "rule__ActivityDiagram__DecisionNodesAssignment_10_3_1");
			builder.put(grammarAccess.getInitialNodeAccess().getNameAssignment_2(), "rule__InitialNode__NameAssignment_2");
			builder.put(grammarAccess.getInitialNodeAccess().getIncomingAssignment_4_2(), "rule__InitialNode__IncomingAssignment_4_2");
			builder.put(grammarAccess.getInitialNodeAccess().getIncomingAssignment_4_3_1(), "rule__InitialNode__IncomingAssignment_4_3_1");
			builder.put(grammarAccess.getInitialNodeAccess().getOutgoingAssignment_5_2(), "rule__InitialNode__OutgoingAssignment_5_2");
			builder.put(grammarAccess.getInitialNodeAccess().getOutgoingAssignment_5_3_1(), "rule__InitialNode__OutgoingAssignment_5_3_1");
			builder.put(grammarAccess.getFinalNodeAccess().getNameAssignment_2(), "rule__FinalNode__NameAssignment_2");
			builder.put(grammarAccess.getFinalNodeAccess().getIncomingAssignment_4_2(), "rule__FinalNode__IncomingAssignment_4_2");
			builder.put(grammarAccess.getFinalNodeAccess().getIncomingAssignment_4_3_1(), "rule__FinalNode__IncomingAssignment_4_3_1");
			builder.put(grammarAccess.getFinalNodeAccess().getOutgoingAssignment_5_2(), "rule__FinalNode__OutgoingAssignment_5_2");
			builder.put(grammarAccess.getFinalNodeAccess().getOutgoingAssignment_5_3_1(), "rule__FinalNode__OutgoingAssignment_5_3_1");
			builder.put(grammarAccess.getTransitionAccess().getNameAssignment_2(), "rule__Transition__NameAssignment_2");
			builder.put(grammarAccess.getTransitionAccess().getTargetAssignment_4_1(), "rule__Transition__TargetAssignment_4_1");
			builder.put(grammarAccess.getTransitionAccess().getSourceAssignment_5_1(), "rule__Transition__SourceAssignment_5_1");
			builder.put(grammarAccess.getActivityNodeAccess().getNameAssignment_2(), "rule__ActivityNode__NameAssignment_2");
			builder.put(grammarAccess.getActivityNodeAccess().getIncomingAssignment_4_2(), "rule__ActivityNode__IncomingAssignment_4_2");
			builder.put(grammarAccess.getActivityNodeAccess().getIncomingAssignment_4_3_1(), "rule__ActivityNode__IncomingAssignment_4_3_1");
			builder.put(grammarAccess.getActivityNodeAccess().getOutgoingAssignment_5_2(), "rule__ActivityNode__OutgoingAssignment_5_2");
			builder.put(grammarAccess.getActivityNodeAccess().getOutgoingAssignment_5_3_1(), "rule__ActivityNode__OutgoingAssignment_5_3_1");
			builder.put(grammarAccess.getForkNodeAccess().getNameAssignment_2(), "rule__ForkNode__NameAssignment_2");
			builder.put(grammarAccess.getForkNodeAccess().getIncomingAssignment_4_2(), "rule__ForkNode__IncomingAssignment_4_2");
			builder.put(grammarAccess.getForkNodeAccess().getIncomingAssignment_4_3_1(), "rule__ForkNode__IncomingAssignment_4_3_1");
			builder.put(grammarAccess.getForkNodeAccess().getOutgoingAssignment_5_2(), "rule__ForkNode__OutgoingAssignment_5_2");
			builder.put(grammarAccess.getForkNodeAccess().getOutgoingAssignment_5_3_1(), "rule__ForkNode__OutgoingAssignment_5_3_1");
			builder.put(grammarAccess.getJoinNodeAccess().getNameAssignment_2(), "rule__JoinNode__NameAssignment_2");
			builder.put(grammarAccess.getJoinNodeAccess().getIncomingAssignment_4_2(), "rule__JoinNode__IncomingAssignment_4_2");
			builder.put(grammarAccess.getJoinNodeAccess().getIncomingAssignment_4_3_1(), "rule__JoinNode__IncomingAssignment_4_3_1");
			builder.put(grammarAccess.getJoinNodeAccess().getOutgoingAssignment_5_2(), "rule__JoinNode__OutgoingAssignment_5_2");
			builder.put(grammarAccess.getJoinNodeAccess().getOutgoingAssignment_5_3_1(), "rule__JoinNode__OutgoingAssignment_5_3_1");
			builder.put(grammarAccess.getDecisionNodeAccess().getNameAssignment_2(), "rule__DecisionNode__NameAssignment_2");
			builder.put(grammarAccess.getDecisionNodeAccess().getIncomingAssignment_4_2(), "rule__DecisionNode__IncomingAssignment_4_2");
			builder.put(grammarAccess.getDecisionNodeAccess().getIncomingAssignment_4_3_1(), "rule__DecisionNode__IncomingAssignment_4_3_1");
			builder.put(grammarAccess.getDecisionNodeAccess().getOutgoingAssignment_5_2(), "rule__DecisionNode__OutgoingAssignment_5_2");
			builder.put(grammarAccess.getDecisionNodeAccess().getOutgoingAssignment_5_3_1(), "rule__DecisionNode__OutgoingAssignment_5_3_1");
			builder.put(grammarAccess.getNode_ImplAccess().getNameAssignment_2(), "rule__Node_Impl__NameAssignment_2");
			builder.put(grammarAccess.getNode_ImplAccess().getIncomingAssignment_4_2(), "rule__Node_Impl__IncomingAssignment_4_2");
			builder.put(grammarAccess.getNode_ImplAccess().getIncomingAssignment_4_3_1(), "rule__Node_Impl__IncomingAssignment_4_3_1");
			builder.put(grammarAccess.getNode_ImplAccess().getOutgoingAssignment_5_2(), "rule__Node_Impl__OutgoingAssignment_5_2");
			builder.put(grammarAccess.getNode_ImplAccess().getOutgoingAssignment_5_3_1(), "rule__Node_Impl__OutgoingAssignment_5_3_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private ActivityDiagramDslGrammarAccess grammarAccess;

	@Override
	protected InternalActivityDiagramDslParser createParser() {
		InternalActivityDiagramDslParser result = new InternalActivityDiagramDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public ActivityDiagramDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(ActivityDiagramDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
