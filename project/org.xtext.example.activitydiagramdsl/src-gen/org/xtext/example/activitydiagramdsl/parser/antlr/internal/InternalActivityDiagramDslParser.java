package org.xtext.example.activitydiagramdsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.activitydiagramdsl.services.ActivityDiagramDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalActivityDiagramDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ActivityDiagram'", "'{'", "'initialNode'", "'finalNode'", "'trasitions'", "','", "'}'", "'activityNodes'", "'forkNodes'", "'joinNodes'", "'decisionNodes'", "'InitialNode'", "'incoming'", "'('", "')'", "'outgoing'", "'FinalNode'", "'Transition'", "'target'", "'source'", "'ActivityNode'", "'ForkNode'", "'JoinNode'", "'DecisionNode'", "'Node'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalActivityDiagramDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalActivityDiagramDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalActivityDiagramDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalActivityDiagramDsl.g"; }



     	private ActivityDiagramDslGrammarAccess grammarAccess;

        public InternalActivityDiagramDslParser(TokenStream input, ActivityDiagramDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "ActivityDiagram";
       	}

       	@Override
       	protected ActivityDiagramDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleActivityDiagram"
    // InternalActivityDiagramDsl.g:64:1: entryRuleActivityDiagram returns [EObject current=null] : iv_ruleActivityDiagram= ruleActivityDiagram EOF ;
    public final EObject entryRuleActivityDiagram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivityDiagram = null;


        try {
            // InternalActivityDiagramDsl.g:64:56: (iv_ruleActivityDiagram= ruleActivityDiagram EOF )
            // InternalActivityDiagramDsl.g:65:2: iv_ruleActivityDiagram= ruleActivityDiagram EOF
            {
             newCompositeNode(grammarAccess.getActivityDiagramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActivityDiagram=ruleActivityDiagram();

            state._fsp--;

             current =iv_ruleActivityDiagram; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActivityDiagram"


    // $ANTLR start "ruleActivityDiagram"
    // InternalActivityDiagramDsl.g:71:1: ruleActivityDiagram returns [EObject current=null] : ( () otherlv_1= 'ActivityDiagram' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'initialNode' ( (lv_initialNode_5_0= ruleInitialNode ) ) )? (otherlv_6= 'finalNode' ( (lv_finalNode_7_0= ruleFinalNode ) ) )? (otherlv_8= 'trasitions' otherlv_9= '{' ( (lv_trasitions_10_0= ruleTransition ) ) (otherlv_11= ',' ( (lv_trasitions_12_0= ruleTransition ) ) )* otherlv_13= '}' )? (otherlv_14= 'activityNodes' otherlv_15= '{' ( (lv_activityNodes_16_0= ruleActivityNode ) ) (otherlv_17= ',' ( (lv_activityNodes_18_0= ruleActivityNode ) ) )* otherlv_19= '}' )? (otherlv_20= 'forkNodes' otherlv_21= '{' ( (lv_forkNodes_22_0= ruleForkNode ) ) (otherlv_23= ',' ( (lv_forkNodes_24_0= ruleForkNode ) ) )* otherlv_25= '}' )? (otherlv_26= 'joinNodes' otherlv_27= '{' ( (lv_joinNodes_28_0= ruleJoinNode ) ) (otherlv_29= ',' ( (lv_joinNodes_30_0= ruleJoinNode ) ) )* otherlv_31= '}' )? (otherlv_32= 'decisionNodes' otherlv_33= '{' ( (lv_decisionNodes_34_0= ruleDecisionNode ) ) (otherlv_35= ',' ( (lv_decisionNodes_36_0= ruleDecisionNode ) ) )* otherlv_37= '}' )? otherlv_38= '}' ) ;
    public final EObject ruleActivityDiagram() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        Token otherlv_35=null;
        Token otherlv_37=null;
        Token otherlv_38=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_initialNode_5_0 = null;

        EObject lv_finalNode_7_0 = null;

        EObject lv_trasitions_10_0 = null;

        EObject lv_trasitions_12_0 = null;

        EObject lv_activityNodes_16_0 = null;

        EObject lv_activityNodes_18_0 = null;

        EObject lv_forkNodes_22_0 = null;

        EObject lv_forkNodes_24_0 = null;

        EObject lv_joinNodes_28_0 = null;

        EObject lv_joinNodes_30_0 = null;

        EObject lv_decisionNodes_34_0 = null;

        EObject lv_decisionNodes_36_0 = null;



        	enterRule();

        try {
            // InternalActivityDiagramDsl.g:77:2: ( ( () otherlv_1= 'ActivityDiagram' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'initialNode' ( (lv_initialNode_5_0= ruleInitialNode ) ) )? (otherlv_6= 'finalNode' ( (lv_finalNode_7_0= ruleFinalNode ) ) )? (otherlv_8= 'trasitions' otherlv_9= '{' ( (lv_trasitions_10_0= ruleTransition ) ) (otherlv_11= ',' ( (lv_trasitions_12_0= ruleTransition ) ) )* otherlv_13= '}' )? (otherlv_14= 'activityNodes' otherlv_15= '{' ( (lv_activityNodes_16_0= ruleActivityNode ) ) (otherlv_17= ',' ( (lv_activityNodes_18_0= ruleActivityNode ) ) )* otherlv_19= '}' )? (otherlv_20= 'forkNodes' otherlv_21= '{' ( (lv_forkNodes_22_0= ruleForkNode ) ) (otherlv_23= ',' ( (lv_forkNodes_24_0= ruleForkNode ) ) )* otherlv_25= '}' )? (otherlv_26= 'joinNodes' otherlv_27= '{' ( (lv_joinNodes_28_0= ruleJoinNode ) ) (otherlv_29= ',' ( (lv_joinNodes_30_0= ruleJoinNode ) ) )* otherlv_31= '}' )? (otherlv_32= 'decisionNodes' otherlv_33= '{' ( (lv_decisionNodes_34_0= ruleDecisionNode ) ) (otherlv_35= ',' ( (lv_decisionNodes_36_0= ruleDecisionNode ) ) )* otherlv_37= '}' )? otherlv_38= '}' ) )
            // InternalActivityDiagramDsl.g:78:2: ( () otherlv_1= 'ActivityDiagram' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'initialNode' ( (lv_initialNode_5_0= ruleInitialNode ) ) )? (otherlv_6= 'finalNode' ( (lv_finalNode_7_0= ruleFinalNode ) ) )? (otherlv_8= 'trasitions' otherlv_9= '{' ( (lv_trasitions_10_0= ruleTransition ) ) (otherlv_11= ',' ( (lv_trasitions_12_0= ruleTransition ) ) )* otherlv_13= '}' )? (otherlv_14= 'activityNodes' otherlv_15= '{' ( (lv_activityNodes_16_0= ruleActivityNode ) ) (otherlv_17= ',' ( (lv_activityNodes_18_0= ruleActivityNode ) ) )* otherlv_19= '}' )? (otherlv_20= 'forkNodes' otherlv_21= '{' ( (lv_forkNodes_22_0= ruleForkNode ) ) (otherlv_23= ',' ( (lv_forkNodes_24_0= ruleForkNode ) ) )* otherlv_25= '}' )? (otherlv_26= 'joinNodes' otherlv_27= '{' ( (lv_joinNodes_28_0= ruleJoinNode ) ) (otherlv_29= ',' ( (lv_joinNodes_30_0= ruleJoinNode ) ) )* otherlv_31= '}' )? (otherlv_32= 'decisionNodes' otherlv_33= '{' ( (lv_decisionNodes_34_0= ruleDecisionNode ) ) (otherlv_35= ',' ( (lv_decisionNodes_36_0= ruleDecisionNode ) ) )* otherlv_37= '}' )? otherlv_38= '}' )
            {
            // InternalActivityDiagramDsl.g:78:2: ( () otherlv_1= 'ActivityDiagram' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'initialNode' ( (lv_initialNode_5_0= ruleInitialNode ) ) )? (otherlv_6= 'finalNode' ( (lv_finalNode_7_0= ruleFinalNode ) ) )? (otherlv_8= 'trasitions' otherlv_9= '{' ( (lv_trasitions_10_0= ruleTransition ) ) (otherlv_11= ',' ( (lv_trasitions_12_0= ruleTransition ) ) )* otherlv_13= '}' )? (otherlv_14= 'activityNodes' otherlv_15= '{' ( (lv_activityNodes_16_0= ruleActivityNode ) ) (otherlv_17= ',' ( (lv_activityNodes_18_0= ruleActivityNode ) ) )* otherlv_19= '}' )? (otherlv_20= 'forkNodes' otherlv_21= '{' ( (lv_forkNodes_22_0= ruleForkNode ) ) (otherlv_23= ',' ( (lv_forkNodes_24_0= ruleForkNode ) ) )* otherlv_25= '}' )? (otherlv_26= 'joinNodes' otherlv_27= '{' ( (lv_joinNodes_28_0= ruleJoinNode ) ) (otherlv_29= ',' ( (lv_joinNodes_30_0= ruleJoinNode ) ) )* otherlv_31= '}' )? (otherlv_32= 'decisionNodes' otherlv_33= '{' ( (lv_decisionNodes_34_0= ruleDecisionNode ) ) (otherlv_35= ',' ( (lv_decisionNodes_36_0= ruleDecisionNode ) ) )* otherlv_37= '}' )? otherlv_38= '}' )
            // InternalActivityDiagramDsl.g:79:3: () otherlv_1= 'ActivityDiagram' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'initialNode' ( (lv_initialNode_5_0= ruleInitialNode ) ) )? (otherlv_6= 'finalNode' ( (lv_finalNode_7_0= ruleFinalNode ) ) )? (otherlv_8= 'trasitions' otherlv_9= '{' ( (lv_trasitions_10_0= ruleTransition ) ) (otherlv_11= ',' ( (lv_trasitions_12_0= ruleTransition ) ) )* otherlv_13= '}' )? (otherlv_14= 'activityNodes' otherlv_15= '{' ( (lv_activityNodes_16_0= ruleActivityNode ) ) (otherlv_17= ',' ( (lv_activityNodes_18_0= ruleActivityNode ) ) )* otherlv_19= '}' )? (otherlv_20= 'forkNodes' otherlv_21= '{' ( (lv_forkNodes_22_0= ruleForkNode ) ) (otherlv_23= ',' ( (lv_forkNodes_24_0= ruleForkNode ) ) )* otherlv_25= '}' )? (otherlv_26= 'joinNodes' otherlv_27= '{' ( (lv_joinNodes_28_0= ruleJoinNode ) ) (otherlv_29= ',' ( (lv_joinNodes_30_0= ruleJoinNode ) ) )* otherlv_31= '}' )? (otherlv_32= 'decisionNodes' otherlv_33= '{' ( (lv_decisionNodes_34_0= ruleDecisionNode ) ) (otherlv_35= ',' ( (lv_decisionNodes_36_0= ruleDecisionNode ) ) )* otherlv_37= '}' )? otherlv_38= '}'
            {
            // InternalActivityDiagramDsl.g:79:3: ()
            // InternalActivityDiagramDsl.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getActivityDiagramAccess().getActivityDiagramAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getActivityDiagramAccess().getActivityDiagramKeyword_1());
            		
            // InternalActivityDiagramDsl.g:90:3: ( (lv_name_2_0= ruleEString ) )
            // InternalActivityDiagramDsl.g:91:4: (lv_name_2_0= ruleEString )
            {
            // InternalActivityDiagramDsl.g:91:4: (lv_name_2_0= ruleEString )
            // InternalActivityDiagramDsl.g:92:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getActivityDiagramAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActivityDiagramRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.activitydiagramdsl.ActivityDiagramDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getActivityDiagramAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalActivityDiagramDsl.g:113:3: (otherlv_4= 'initialNode' ( (lv_initialNode_5_0= ruleInitialNode ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalActivityDiagramDsl.g:114:4: otherlv_4= 'initialNode' ( (lv_initialNode_5_0= ruleInitialNode ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getActivityDiagramAccess().getInitialNodeKeyword_4_0());
                    			
                    // InternalActivityDiagramDsl.g:118:4: ( (lv_initialNode_5_0= ruleInitialNode ) )
                    // InternalActivityDiagramDsl.g:119:5: (lv_initialNode_5_0= ruleInitialNode )
                    {
                    // InternalActivityDiagramDsl.g:119:5: (lv_initialNode_5_0= ruleInitialNode )
                    // InternalActivityDiagramDsl.g:120:6: lv_initialNode_5_0= ruleInitialNode
                    {

                    						newCompositeNode(grammarAccess.getActivityDiagramAccess().getInitialNodeInitialNodeParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_initialNode_5_0=ruleInitialNode();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActivityDiagramRule());
                    						}
                    						set(
                    							current,
                    							"initialNode",
                    							lv_initialNode_5_0,
                    							"org.xtext.example.activitydiagramdsl.ActivityDiagramDsl.InitialNode");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalActivityDiagramDsl.g:138:3: (otherlv_6= 'finalNode' ( (lv_finalNode_7_0= ruleFinalNode ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalActivityDiagramDsl.g:139:4: otherlv_6= 'finalNode' ( (lv_finalNode_7_0= ruleFinalNode ) )
                    {
                    otherlv_6=(Token)match(input,14,FOLLOW_8); 

                    				newLeafNode(otherlv_6, grammarAccess.getActivityDiagramAccess().getFinalNodeKeyword_5_0());
                    			
                    // InternalActivityDiagramDsl.g:143:4: ( (lv_finalNode_7_0= ruleFinalNode ) )
                    // InternalActivityDiagramDsl.g:144:5: (lv_finalNode_7_0= ruleFinalNode )
                    {
                    // InternalActivityDiagramDsl.g:144:5: (lv_finalNode_7_0= ruleFinalNode )
                    // InternalActivityDiagramDsl.g:145:6: lv_finalNode_7_0= ruleFinalNode
                    {

                    						newCompositeNode(grammarAccess.getActivityDiagramAccess().getFinalNodeFinalNodeParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_finalNode_7_0=ruleFinalNode();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActivityDiagramRule());
                    						}
                    						set(
                    							current,
                    							"finalNode",
                    							lv_finalNode_7_0,
                    							"org.xtext.example.activitydiagramdsl.ActivityDiagramDsl.FinalNode");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalActivityDiagramDsl.g:163:3: (otherlv_8= 'trasitions' otherlv_9= '{' ( (lv_trasitions_10_0= ruleTransition ) ) (otherlv_11= ',' ( (lv_trasitions_12_0= ruleTransition ) ) )* otherlv_13= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalActivityDiagramDsl.g:164:4: otherlv_8= 'trasitions' otherlv_9= '{' ( (lv_trasitions_10_0= ruleTransition ) ) (otherlv_11= ',' ( (lv_trasitions_12_0= ruleTransition ) ) )* otherlv_13= '}'
                    {
                    otherlv_8=(Token)match(input,15,FOLLOW_4); 

                    				newLeafNode(otherlv_8, grammarAccess.getActivityDiagramAccess().getTrasitionsKeyword_6_0());
                    			
                    otherlv_9=(Token)match(input,12,FOLLOW_10); 

                    				newLeafNode(otherlv_9, grammarAccess.getActivityDiagramAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalActivityDiagramDsl.g:172:4: ( (lv_trasitions_10_0= ruleTransition ) )
                    // InternalActivityDiagramDsl.g:173:5: (lv_trasitions_10_0= ruleTransition )
                    {
                    // InternalActivityDiagramDsl.g:173:5: (lv_trasitions_10_0= ruleTransition )
                    // InternalActivityDiagramDsl.g:174:6: lv_trasitions_10_0= ruleTransition
                    {

                    						newCompositeNode(grammarAccess.getActivityDiagramAccess().getTrasitionsTransitionParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_trasitions_10_0=ruleTransition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActivityDiagramRule());
                    						}
                    						add(
                    							current,
                    							"trasitions",
                    							lv_trasitions_10_0,
                    							"org.xtext.example.activitydiagramdsl.ActivityDiagramDsl.Transition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalActivityDiagramDsl.g:191:4: (otherlv_11= ',' ( (lv_trasitions_12_0= ruleTransition ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==16) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalActivityDiagramDsl.g:192:5: otherlv_11= ',' ( (lv_trasitions_12_0= ruleTransition ) )
                    	    {
                    	    otherlv_11=(Token)match(input,16,FOLLOW_10); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getActivityDiagramAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalActivityDiagramDsl.g:196:5: ( (lv_trasitions_12_0= ruleTransition ) )
                    	    // InternalActivityDiagramDsl.g:197:6: (lv_trasitions_12_0= ruleTransition )
                    	    {
                    	    // InternalActivityDiagramDsl.g:197:6: (lv_trasitions_12_0= ruleTransition )
                    	    // InternalActivityDiagramDsl.g:198:7: lv_trasitions_12_0= ruleTransition
                    	    {

                    	    							newCompositeNode(grammarAccess.getActivityDiagramAccess().getTrasitionsTransitionParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_trasitions_12_0=ruleTransition();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getActivityDiagramRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"trasitions",
                    	    								lv_trasitions_12_0,
                    	    								"org.xtext.example.activitydiagramdsl.ActivityDiagramDsl.Transition");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,17,FOLLOW_12); 

                    				newLeafNode(otherlv_13, grammarAccess.getActivityDiagramAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalActivityDiagramDsl.g:221:3: (otherlv_14= 'activityNodes' otherlv_15= '{' ( (lv_activityNodes_16_0= ruleActivityNode ) ) (otherlv_17= ',' ( (lv_activityNodes_18_0= ruleActivityNode ) ) )* otherlv_19= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalActivityDiagramDsl.g:222:4: otherlv_14= 'activityNodes' otherlv_15= '{' ( (lv_activityNodes_16_0= ruleActivityNode ) ) (otherlv_17= ',' ( (lv_activityNodes_18_0= ruleActivityNode ) ) )* otherlv_19= '}'
                    {
                    otherlv_14=(Token)match(input,18,FOLLOW_4); 

                    				newLeafNode(otherlv_14, grammarAccess.getActivityDiagramAccess().getActivityNodesKeyword_7_0());
                    			
                    otherlv_15=(Token)match(input,12,FOLLOW_13); 

                    				newLeafNode(otherlv_15, grammarAccess.getActivityDiagramAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalActivityDiagramDsl.g:230:4: ( (lv_activityNodes_16_0= ruleActivityNode ) )
                    // InternalActivityDiagramDsl.g:231:5: (lv_activityNodes_16_0= ruleActivityNode )
                    {
                    // InternalActivityDiagramDsl.g:231:5: (lv_activityNodes_16_0= ruleActivityNode )
                    // InternalActivityDiagramDsl.g:232:6: lv_activityNodes_16_0= ruleActivityNode
                    {

                    						newCompositeNode(grammarAccess.getActivityDiagramAccess().getActivityNodesActivityNodeParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_activityNodes_16_0=ruleActivityNode();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActivityDiagramRule());
                    						}
                    						add(
                    							current,
                    							"activityNodes",
                    							lv_activityNodes_16_0,
                    							"org.xtext.example.activitydiagramdsl.ActivityDiagramDsl.ActivityNode");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalActivityDiagramDsl.g:249:4: (otherlv_17= ',' ( (lv_activityNodes_18_0= ruleActivityNode ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==16) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalActivityDiagramDsl.g:250:5: otherlv_17= ',' ( (lv_activityNodes_18_0= ruleActivityNode ) )
                    	    {
                    	    otherlv_17=(Token)match(input,16,FOLLOW_13); 

                    	    					newLeafNode(otherlv_17, grammarAccess.getActivityDiagramAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalActivityDiagramDsl.g:254:5: ( (lv_activityNodes_18_0= ruleActivityNode ) )
                    	    // InternalActivityDiagramDsl.g:255:6: (lv_activityNodes_18_0= ruleActivityNode )
                    	    {
                    	    // InternalActivityDiagramDsl.g:255:6: (lv_activityNodes_18_0= ruleActivityNode )
                    	    // InternalActivityDiagramDsl.g:256:7: lv_activityNodes_18_0= ruleActivityNode
                    	    {

                    	    							newCompositeNode(grammarAccess.getActivityDiagramAccess().getActivityNodesActivityNodeParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_activityNodes_18_0=ruleActivityNode();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getActivityDiagramRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"activityNodes",
                    	    								lv_activityNodes_18_0,
                    	    								"org.xtext.example.activitydiagramdsl.ActivityDiagramDsl.ActivityNode");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,17,FOLLOW_14); 

                    				newLeafNode(otherlv_19, grammarAccess.getActivityDiagramAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalActivityDiagramDsl.g:279:3: (otherlv_20= 'forkNodes' otherlv_21= '{' ( (lv_forkNodes_22_0= ruleForkNode ) ) (otherlv_23= ',' ( (lv_forkNodes_24_0= ruleForkNode ) ) )* otherlv_25= '}' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalActivityDiagramDsl.g:280:4: otherlv_20= 'forkNodes' otherlv_21= '{' ( (lv_forkNodes_22_0= ruleForkNode ) ) (otherlv_23= ',' ( (lv_forkNodes_24_0= ruleForkNode ) ) )* otherlv_25= '}'
                    {
                    otherlv_20=(Token)match(input,19,FOLLOW_4); 

                    				newLeafNode(otherlv_20, grammarAccess.getActivityDiagramAccess().getForkNodesKeyword_8_0());
                    			
                    otherlv_21=(Token)match(input,12,FOLLOW_15); 

                    				newLeafNode(otherlv_21, grammarAccess.getActivityDiagramAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalActivityDiagramDsl.g:288:4: ( (lv_forkNodes_22_0= ruleForkNode ) )
                    // InternalActivityDiagramDsl.g:289:5: (lv_forkNodes_22_0= ruleForkNode )
                    {
                    // InternalActivityDiagramDsl.g:289:5: (lv_forkNodes_22_0= ruleForkNode )
                    // InternalActivityDiagramDsl.g:290:6: lv_forkNodes_22_0= ruleForkNode
                    {

                    						newCompositeNode(grammarAccess.getActivityDiagramAccess().getForkNodesForkNodeParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_forkNodes_22_0=ruleForkNode();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActivityDiagramRule());
                    						}
                    						add(
                    							current,
                    							"forkNodes",
                    							lv_forkNodes_22_0,
                    							"org.xtext.example.activitydiagramdsl.ActivityDiagramDsl.ForkNode");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalActivityDiagramDsl.g:307:4: (otherlv_23= ',' ( (lv_forkNodes_24_0= ruleForkNode ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==16) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalActivityDiagramDsl.g:308:5: otherlv_23= ',' ( (lv_forkNodes_24_0= ruleForkNode ) )
                    	    {
                    	    otherlv_23=(Token)match(input,16,FOLLOW_15); 

                    	    					newLeafNode(otherlv_23, grammarAccess.getActivityDiagramAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalActivityDiagramDsl.g:312:5: ( (lv_forkNodes_24_0= ruleForkNode ) )
                    	    // InternalActivityDiagramDsl.g:313:6: (lv_forkNodes_24_0= ruleForkNode )
                    	    {
                    	    // InternalActivityDiagramDsl.g:313:6: (lv_forkNodes_24_0= ruleForkNode )
                    	    // InternalActivityDiagramDsl.g:314:7: lv_forkNodes_24_0= ruleForkNode
                    	    {

                    	    							newCompositeNode(grammarAccess.getActivityDiagramAccess().getForkNodesForkNodeParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_forkNodes_24_0=ruleForkNode();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getActivityDiagramRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"forkNodes",
                    	    								lv_forkNodes_24_0,
                    	    								"org.xtext.example.activitydiagramdsl.ActivityDiagramDsl.ForkNode");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_25=(Token)match(input,17,FOLLOW_16); 

                    				newLeafNode(otherlv_25, grammarAccess.getActivityDiagramAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            // InternalActivityDiagramDsl.g:337:3: (otherlv_26= 'joinNodes' otherlv_27= '{' ( (lv_joinNodes_28_0= ruleJoinNode ) ) (otherlv_29= ',' ( (lv_joinNodes_30_0= ruleJoinNode ) ) )* otherlv_31= '}' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalActivityDiagramDsl.g:338:4: otherlv_26= 'joinNodes' otherlv_27= '{' ( (lv_joinNodes_28_0= ruleJoinNode ) ) (otherlv_29= ',' ( (lv_joinNodes_30_0= ruleJoinNode ) ) )* otherlv_31= '}'
                    {
                    otherlv_26=(Token)match(input,20,FOLLOW_4); 

                    				newLeafNode(otherlv_26, grammarAccess.getActivityDiagramAccess().getJoinNodesKeyword_9_0());
                    			
                    otherlv_27=(Token)match(input,12,FOLLOW_17); 

                    				newLeafNode(otherlv_27, grammarAccess.getActivityDiagramAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalActivityDiagramDsl.g:346:4: ( (lv_joinNodes_28_0= ruleJoinNode ) )
                    // InternalActivityDiagramDsl.g:347:5: (lv_joinNodes_28_0= ruleJoinNode )
                    {
                    // InternalActivityDiagramDsl.g:347:5: (lv_joinNodes_28_0= ruleJoinNode )
                    // InternalActivityDiagramDsl.g:348:6: lv_joinNodes_28_0= ruleJoinNode
                    {

                    						newCompositeNode(grammarAccess.getActivityDiagramAccess().getJoinNodesJoinNodeParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_joinNodes_28_0=ruleJoinNode();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActivityDiagramRule());
                    						}
                    						add(
                    							current,
                    							"joinNodes",
                    							lv_joinNodes_28_0,
                    							"org.xtext.example.activitydiagramdsl.ActivityDiagramDsl.JoinNode");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalActivityDiagramDsl.g:365:4: (otherlv_29= ',' ( (lv_joinNodes_30_0= ruleJoinNode ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==16) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalActivityDiagramDsl.g:366:5: otherlv_29= ',' ( (lv_joinNodes_30_0= ruleJoinNode ) )
                    	    {
                    	    otherlv_29=(Token)match(input,16,FOLLOW_17); 

                    	    					newLeafNode(otherlv_29, grammarAccess.getActivityDiagramAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalActivityDiagramDsl.g:370:5: ( (lv_joinNodes_30_0= ruleJoinNode ) )
                    	    // InternalActivityDiagramDsl.g:371:6: (lv_joinNodes_30_0= ruleJoinNode )
                    	    {
                    	    // InternalActivityDiagramDsl.g:371:6: (lv_joinNodes_30_0= ruleJoinNode )
                    	    // InternalActivityDiagramDsl.g:372:7: lv_joinNodes_30_0= ruleJoinNode
                    	    {

                    	    							newCompositeNode(grammarAccess.getActivityDiagramAccess().getJoinNodesJoinNodeParserRuleCall_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_joinNodes_30_0=ruleJoinNode();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getActivityDiagramRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"joinNodes",
                    	    								lv_joinNodes_30_0,
                    	    								"org.xtext.example.activitydiagramdsl.ActivityDiagramDsl.JoinNode");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_31=(Token)match(input,17,FOLLOW_18); 

                    				newLeafNode(otherlv_31, grammarAccess.getActivityDiagramAccess().getRightCurlyBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            // InternalActivityDiagramDsl.g:395:3: (otherlv_32= 'decisionNodes' otherlv_33= '{' ( (lv_decisionNodes_34_0= ruleDecisionNode ) ) (otherlv_35= ',' ( (lv_decisionNodes_36_0= ruleDecisionNode ) ) )* otherlv_37= '}' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==21) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalActivityDiagramDsl.g:396:4: otherlv_32= 'decisionNodes' otherlv_33= '{' ( (lv_decisionNodes_34_0= ruleDecisionNode ) ) (otherlv_35= ',' ( (lv_decisionNodes_36_0= ruleDecisionNode ) ) )* otherlv_37= '}'
                    {
                    otherlv_32=(Token)match(input,21,FOLLOW_4); 

                    				newLeafNode(otherlv_32, grammarAccess.getActivityDiagramAccess().getDecisionNodesKeyword_10_0());
                    			
                    otherlv_33=(Token)match(input,12,FOLLOW_19); 

                    				newLeafNode(otherlv_33, grammarAccess.getActivityDiagramAccess().getLeftCurlyBracketKeyword_10_1());
                    			
                    // InternalActivityDiagramDsl.g:404:4: ( (lv_decisionNodes_34_0= ruleDecisionNode ) )
                    // InternalActivityDiagramDsl.g:405:5: (lv_decisionNodes_34_0= ruleDecisionNode )
                    {
                    // InternalActivityDiagramDsl.g:405:5: (lv_decisionNodes_34_0= ruleDecisionNode )
                    // InternalActivityDiagramDsl.g:406:6: lv_decisionNodes_34_0= ruleDecisionNode
                    {

                    						newCompositeNode(grammarAccess.getActivityDiagramAccess().getDecisionNodesDecisionNodeParserRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_decisionNodes_34_0=ruleDecisionNode();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActivityDiagramRule());
                    						}
                    						add(
                    							current,
                    							"decisionNodes",
                    							lv_decisionNodes_34_0,
                    							"org.xtext.example.activitydiagramdsl.ActivityDiagramDsl.DecisionNode");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalActivityDiagramDsl.g:423:4: (otherlv_35= ',' ( (lv_decisionNodes_36_0= ruleDecisionNode ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==16) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalActivityDiagramDsl.g:424:5: otherlv_35= ',' ( (lv_decisionNodes_36_0= ruleDecisionNode ) )
                    	    {
                    	    otherlv_35=(Token)match(input,16,FOLLOW_19); 

                    	    					newLeafNode(otherlv_35, grammarAccess.getActivityDiagramAccess().getCommaKeyword_10_3_0());
                    	    				
                    	    // InternalActivityDiagramDsl.g:428:5: ( (lv_decisionNodes_36_0= ruleDecisionNode ) )
                    	    // InternalActivityDiagramDsl.g:429:6: (lv_decisionNodes_36_0= ruleDecisionNode )
                    	    {
                    	    // InternalActivityDiagramDsl.g:429:6: (lv_decisionNodes_36_0= ruleDecisionNode )
                    	    // InternalActivityDiagramDsl.g:430:7: lv_decisionNodes_36_0= ruleDecisionNode
                    	    {

                    	    							newCompositeNode(grammarAccess.getActivityDiagramAccess().getDecisionNodesDecisionNodeParserRuleCall_10_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_decisionNodes_36_0=ruleDecisionNode();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getActivityDiagramRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"decisionNodes",
                    	    								lv_decisionNodes_36_0,
                    	    								"org.xtext.example.activitydiagramdsl.ActivityDiagramDsl.DecisionNode");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_37=(Token)match(input,17,FOLLOW_20); 

                    				newLeafNode(otherlv_37, grammarAccess.getActivityDiagramAccess().getRightCurlyBracketKeyword_10_4());
                    			

                    }
                    break;

            }

            otherlv_38=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_38, grammarAccess.getActivityDiagramAccess().getRightCurlyBracketKeyword_11());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActivityDiagram"


    // $ANTLR start "entryRuleEString"
    // InternalActivityDiagramDsl.g:461:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalActivityDiagramDsl.g:461:47: (iv_ruleEString= ruleEString EOF )
            // InternalActivityDiagramDsl.g:462:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalActivityDiagramDsl.g:468:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalActivityDiagramDsl.g:474:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalActivityDiagramDsl.g:475:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalActivityDiagramDsl.g:475:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_STRING) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_ID) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalActivityDiagramDsl.g:476:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalActivityDiagramDsl.g:484:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleInitialNode"
    // InternalActivityDiagramDsl.g:495:1: entryRuleInitialNode returns [EObject current=null] : iv_ruleInitialNode= ruleInitialNode EOF ;
    public final EObject entryRuleInitialNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitialNode = null;


        try {
            // InternalActivityDiagramDsl.g:495:52: (iv_ruleInitialNode= ruleInitialNode EOF )
            // InternalActivityDiagramDsl.g:496:2: iv_ruleInitialNode= ruleInitialNode EOF
            {
             newCompositeNode(grammarAccess.getInitialNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInitialNode=ruleInitialNode();

            state._fsp--;

             current =iv_ruleInitialNode; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInitialNode"


    // $ANTLR start "ruleInitialNode"
    // InternalActivityDiagramDsl.g:502:1: ruleInitialNode returns [EObject current=null] : ( () otherlv_1= 'InitialNode' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'incoming' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'outgoing' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' ) ;
    public final EObject ruleInitialNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalActivityDiagramDsl.g:508:2: ( ( () otherlv_1= 'InitialNode' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'incoming' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'outgoing' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' ) )
            // InternalActivityDiagramDsl.g:509:2: ( () otherlv_1= 'InitialNode' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'incoming' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'outgoing' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' )
            {
            // InternalActivityDiagramDsl.g:509:2: ( () otherlv_1= 'InitialNode' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'incoming' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'outgoing' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' )
            // InternalActivityDiagramDsl.g:510:3: () otherlv_1= 'InitialNode' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'incoming' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'outgoing' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}'
            {
            // InternalActivityDiagramDsl.g:510:3: ()
            // InternalActivityDiagramDsl.g:511:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInitialNodeAccess().getInitialNodeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getInitialNodeAccess().getInitialNodeKeyword_1());
            		
            // InternalActivityDiagramDsl.g:521:3: ( (lv_name_2_0= ruleEString ) )
            // InternalActivityDiagramDsl.g:522:4: (lv_name_2_0= ruleEString )
            {
            // InternalActivityDiagramDsl.g:522:4: (lv_name_2_0= ruleEString )
            // InternalActivityDiagramDsl.g:523:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getInitialNodeAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInitialNodeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.activitydiagramdsl.ActivityDiagramDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getInitialNodeAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalActivityDiagramDsl.g:544:3: (otherlv_4= 'incoming' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==23) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalActivityDiagramDsl.g:545:4: otherlv_4= 'incoming' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,23,FOLLOW_22); 

                    				newLeafNode(otherlv_4, grammarAccess.getInitialNodeAccess().getIncomingKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getInitialNodeAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalActivityDiagramDsl.g:553:4: ( ( ruleEString ) )
                    // InternalActivityDiagramDsl.g:554:5: ( ruleEString )
                    {
                    // InternalActivityDiagramDsl.g:554:5: ( ruleEString )
                    // InternalActivityDiagramDsl.g:555:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getInitialNodeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getInitialNodeAccess().getIncomingTransitionCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_23);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalActivityDiagramDsl.g:569:4: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==16) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalActivityDiagramDsl.g:570:5: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,16,FOLLOW_3); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getInitialNodeAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalActivityDiagramDsl.g:574:5: ( ( ruleEString ) )
                    	    // InternalActivityDiagramDsl.g:575:6: ( ruleEString )
                    	    {
                    	    // InternalActivityDiagramDsl.g:575:6: ( ruleEString )
                    	    // InternalActivityDiagramDsl.g:576:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getInitialNodeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getInitialNodeAccess().getIncomingTransitionCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_23);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,25,FOLLOW_24); 

                    				newLeafNode(otherlv_9, grammarAccess.getInitialNodeAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalActivityDiagramDsl.g:596:3: (otherlv_10= 'outgoing' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==26) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalActivityDiagramDsl.g:597:4: otherlv_10= 'outgoing' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')'
                    {
                    otherlv_10=(Token)match(input,26,FOLLOW_22); 

                    				newLeafNode(otherlv_10, grammarAccess.getInitialNodeAccess().getOutgoingKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getInitialNodeAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalActivityDiagramDsl.g:605:4: ( ( ruleEString ) )
                    // InternalActivityDiagramDsl.g:606:5: ( ruleEString )
                    {
                    // InternalActivityDiagramDsl.g:606:5: ( ruleEString )
                    // InternalActivityDiagramDsl.g:607:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getInitialNodeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getInitialNodeAccess().getOutgoingTransitionCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_23);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalActivityDiagramDsl.g:621:4: (otherlv_13= ',' ( ( ruleEString ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==16) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalActivityDiagramDsl.g:622:5: otherlv_13= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_13=(Token)match(input,16,FOLLOW_3); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getInitialNodeAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalActivityDiagramDsl.g:626:5: ( ( ruleEString ) )
                    	    // InternalActivityDiagramDsl.g:627:6: ( ruleEString )
                    	    {
                    	    // InternalActivityDiagramDsl.g:627:6: ( ruleEString )
                    	    // InternalActivityDiagramDsl.g:628:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getInitialNodeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getInitialNodeAccess().getOutgoingTransitionCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_23);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,25,FOLLOW_20); 

                    				newLeafNode(otherlv_15, grammarAccess.getInitialNodeAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getInitialNodeAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInitialNode"


    // $ANTLR start "entryRuleFinalNode"
    // InternalActivityDiagramDsl.g:656:1: entryRuleFinalNode returns [EObject current=null] : iv_ruleFinalNode= ruleFinalNode EOF ;
    public final EObject entryRuleFinalNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFinalNode = null;


        try {
            // InternalActivityDiagramDsl.g:656:50: (iv_ruleFinalNode= ruleFinalNode EOF )
            // InternalActivityDiagramDsl.g:657:2: iv_ruleFinalNode= ruleFinalNode EOF
            {
             newCompositeNode(grammarAccess.getFinalNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFinalNode=ruleFinalNode();

            state._fsp--;

             current =iv_ruleFinalNode; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFinalNode"


    // $ANTLR start "ruleFinalNode"
    // InternalActivityDiagramDsl.g:663:1: ruleFinalNode returns [EObject current=null] : ( () otherlv_1= 'FinalNode' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'incoming' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'outgoing' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' ) ;
    public final EObject ruleFinalNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalActivityDiagramDsl.g:669:2: ( ( () otherlv_1= 'FinalNode' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'incoming' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'outgoing' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' ) )
            // InternalActivityDiagramDsl.g:670:2: ( () otherlv_1= 'FinalNode' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'incoming' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'outgoing' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' )
            {
            // InternalActivityDiagramDsl.g:670:2: ( () otherlv_1= 'FinalNode' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'incoming' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'outgoing' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' )
            // InternalActivityDiagramDsl.g:671:3: () otherlv_1= 'FinalNode' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'incoming' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'outgoing' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}'
            {
            // InternalActivityDiagramDsl.g:671:3: ()
            // InternalActivityDiagramDsl.g:672:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFinalNodeAccess().getFinalNodeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getFinalNodeAccess().getFinalNodeKeyword_1());
            		
            // InternalActivityDiagramDsl.g:682:3: ( (lv_name_2_0= ruleEString ) )
            // InternalActivityDiagramDsl.g:683:4: (lv_name_2_0= ruleEString )
            {
            // InternalActivityDiagramDsl.g:683:4: (lv_name_2_0= ruleEString )
            // InternalActivityDiagramDsl.g:684:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFinalNodeAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFinalNodeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.activitydiagramdsl.ActivityDiagramDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getFinalNodeAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalActivityDiagramDsl.g:705:3: (otherlv_4= 'incoming' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==23) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalActivityDiagramDsl.g:706:4: otherlv_4= 'incoming' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,23,FOLLOW_22); 

                    				newLeafNode(otherlv_4, grammarAccess.getFinalNodeAccess().getIncomingKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getFinalNodeAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalActivityDiagramDsl.g:714:4: ( ( ruleEString ) )
                    // InternalActivityDiagramDsl.g:715:5: ( ruleEString )
                    {
                    // InternalActivityDiagramDsl.g:715:5: ( ruleEString )
                    // InternalActivityDiagramDsl.g:716:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFinalNodeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getFinalNodeAccess().getIncomingTransitionCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_23);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalActivityDiagramDsl.g:730:4: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==16) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalActivityDiagramDsl.g:731:5: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,16,FOLLOW_3); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getFinalNodeAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalActivityDiagramDsl.g:735:5: ( ( ruleEString ) )
                    	    // InternalActivityDiagramDsl.g:736:6: ( ruleEString )
                    	    {
                    	    // InternalActivityDiagramDsl.g:736:6: ( ruleEString )
                    	    // InternalActivityDiagramDsl.g:737:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getFinalNodeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getFinalNodeAccess().getIncomingTransitionCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_23);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,25,FOLLOW_24); 

                    				newLeafNode(otherlv_9, grammarAccess.getFinalNodeAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalActivityDiagramDsl.g:757:3: (otherlv_10= 'outgoing' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==26) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalActivityDiagramDsl.g:758:4: otherlv_10= 'outgoing' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')'
                    {
                    otherlv_10=(Token)match(input,26,FOLLOW_22); 

                    				newLeafNode(otherlv_10, grammarAccess.getFinalNodeAccess().getOutgoingKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getFinalNodeAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalActivityDiagramDsl.g:766:4: ( ( ruleEString ) )
                    // InternalActivityDiagramDsl.g:767:5: ( ruleEString )
                    {
                    // InternalActivityDiagramDsl.g:767:5: ( ruleEString )
                    // InternalActivityDiagramDsl.g:768:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFinalNodeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getFinalNodeAccess().getOutgoingTransitionCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_23);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalActivityDiagramDsl.g:782:4: (otherlv_13= ',' ( ( ruleEString ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==16) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalActivityDiagramDsl.g:783:5: otherlv_13= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_13=(Token)match(input,16,FOLLOW_3); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getFinalNodeAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalActivityDiagramDsl.g:787:5: ( ( ruleEString ) )
                    	    // InternalActivityDiagramDsl.g:788:6: ( ruleEString )
                    	    {
                    	    // InternalActivityDiagramDsl.g:788:6: ( ruleEString )
                    	    // InternalActivityDiagramDsl.g:789:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getFinalNodeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getFinalNodeAccess().getOutgoingTransitionCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_23);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,25,FOLLOW_20); 

                    				newLeafNode(otherlv_15, grammarAccess.getFinalNodeAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getFinalNodeAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFinalNode"


    // $ANTLR start "entryRuleTransition"
    // InternalActivityDiagramDsl.g:817:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalActivityDiagramDsl.g:817:51: (iv_ruleTransition= ruleTransition EOF )
            // InternalActivityDiagramDsl.g:818:2: iv_ruleTransition= ruleTransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // InternalActivityDiagramDsl.g:824:1: ruleTransition returns [EObject current=null] : ( () otherlv_1= 'Transition' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'target' ( ( ruleEString ) ) )? (otherlv_6= 'source' ( ( ruleEString ) ) )? otherlv_8= '}' ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalActivityDiagramDsl.g:830:2: ( ( () otherlv_1= 'Transition' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'target' ( ( ruleEString ) ) )? (otherlv_6= 'source' ( ( ruleEString ) ) )? otherlv_8= '}' ) )
            // InternalActivityDiagramDsl.g:831:2: ( () otherlv_1= 'Transition' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'target' ( ( ruleEString ) ) )? (otherlv_6= 'source' ( ( ruleEString ) ) )? otherlv_8= '}' )
            {
            // InternalActivityDiagramDsl.g:831:2: ( () otherlv_1= 'Transition' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'target' ( ( ruleEString ) ) )? (otherlv_6= 'source' ( ( ruleEString ) ) )? otherlv_8= '}' )
            // InternalActivityDiagramDsl.g:832:3: () otherlv_1= 'Transition' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'target' ( ( ruleEString ) ) )? (otherlv_6= 'source' ( ( ruleEString ) ) )? otherlv_8= '}'
            {
            // InternalActivityDiagramDsl.g:832:3: ()
            // InternalActivityDiagramDsl.g:833:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTransitionAccess().getTransitionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTransitionAccess().getTransitionKeyword_1());
            		
            // InternalActivityDiagramDsl.g:843:3: ( (lv_name_2_0= ruleEString ) )
            // InternalActivityDiagramDsl.g:844:4: (lv_name_2_0= ruleEString )
            {
            // InternalActivityDiagramDsl.g:844:4: (lv_name_2_0= ruleEString )
            // InternalActivityDiagramDsl.g:845:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTransitionAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTransitionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.activitydiagramdsl.ActivityDiagramDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_25); 

            			newLeafNode(otherlv_3, grammarAccess.getTransitionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalActivityDiagramDsl.g:866:3: (otherlv_4= 'target' ( ( ruleEString ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==29) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalActivityDiagramDsl.g:867:4: otherlv_4= 'target' ( ( ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,29,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getTransitionAccess().getTargetKeyword_4_0());
                    			
                    // InternalActivityDiagramDsl.g:871:4: ( ( ruleEString ) )
                    // InternalActivityDiagramDsl.g:872:5: ( ruleEString )
                    {
                    // InternalActivityDiagramDsl.g:872:5: ( ruleEString )
                    // InternalActivityDiagramDsl.g:873:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTransitionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getTransitionAccess().getTargetNodeCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_26);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalActivityDiagramDsl.g:888:3: (otherlv_6= 'source' ( ( ruleEString ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==30) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalActivityDiagramDsl.g:889:4: otherlv_6= 'source' ( ( ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,30,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getTransitionAccess().getSourceKeyword_5_0());
                    			
                    // InternalActivityDiagramDsl.g:893:4: ( ( ruleEString ) )
                    // InternalActivityDiagramDsl.g:894:5: ( ruleEString )
                    {
                    // InternalActivityDiagramDsl.g:894:5: ( ruleEString )
                    // InternalActivityDiagramDsl.g:895:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTransitionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getTransitionAccess().getSourceNodeCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_20);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getTransitionAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleActivityNode"
    // InternalActivityDiagramDsl.g:918:1: entryRuleActivityNode returns [EObject current=null] : iv_ruleActivityNode= ruleActivityNode EOF ;
    public final EObject entryRuleActivityNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivityNode = null;


        try {
            // InternalActivityDiagramDsl.g:918:53: (iv_ruleActivityNode= ruleActivityNode EOF )
            // InternalActivityDiagramDsl.g:919:2: iv_ruleActivityNode= ruleActivityNode EOF
            {
             newCompositeNode(grammarAccess.getActivityNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActivityNode=ruleActivityNode();

            state._fsp--;

             current =iv_ruleActivityNode; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActivityNode"


    // $ANTLR start "ruleActivityNode"
    // InternalActivityDiagramDsl.g:925:1: ruleActivityNode returns [EObject current=null] : ( () otherlv_1= 'ActivityNode' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'incoming' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'outgoing' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' ) ;
    public final EObject ruleActivityNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalActivityDiagramDsl.g:931:2: ( ( () otherlv_1= 'ActivityNode' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'incoming' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'outgoing' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' ) )
            // InternalActivityDiagramDsl.g:932:2: ( () otherlv_1= 'ActivityNode' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'incoming' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'outgoing' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' )
            {
            // InternalActivityDiagramDsl.g:932:2: ( () otherlv_1= 'ActivityNode' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'incoming' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'outgoing' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' )
            // InternalActivityDiagramDsl.g:933:3: () otherlv_1= 'ActivityNode' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'incoming' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'outgoing' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}'
            {
            // InternalActivityDiagramDsl.g:933:3: ()
            // InternalActivityDiagramDsl.g:934:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getActivityNodeAccess().getActivityNodeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getActivityNodeAccess().getActivityNodeKeyword_1());
            		
            // InternalActivityDiagramDsl.g:944:3: ( (lv_name_2_0= ruleEString ) )
            // InternalActivityDiagramDsl.g:945:4: (lv_name_2_0= ruleEString )
            {
            // InternalActivityDiagramDsl.g:945:4: (lv_name_2_0= ruleEString )
            // InternalActivityDiagramDsl.g:946:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getActivityNodeAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActivityNodeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.activitydiagramdsl.ActivityDiagramDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getActivityNodeAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalActivityDiagramDsl.g:967:3: (otherlv_4= 'incoming' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==23) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalActivityDiagramDsl.g:968:4: otherlv_4= 'incoming' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,23,FOLLOW_22); 

                    				newLeafNode(otherlv_4, grammarAccess.getActivityNodeAccess().getIncomingKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getActivityNodeAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalActivityDiagramDsl.g:976:4: ( ( ruleEString ) )
                    // InternalActivityDiagramDsl.g:977:5: ( ruleEString )
                    {
                    // InternalActivityDiagramDsl.g:977:5: ( ruleEString )
                    // InternalActivityDiagramDsl.g:978:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getActivityNodeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getActivityNodeAccess().getIncomingTransitionCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_23);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalActivityDiagramDsl.g:992:4: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==16) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalActivityDiagramDsl.g:993:5: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,16,FOLLOW_3); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getActivityNodeAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalActivityDiagramDsl.g:997:5: ( ( ruleEString ) )
                    	    // InternalActivityDiagramDsl.g:998:6: ( ruleEString )
                    	    {
                    	    // InternalActivityDiagramDsl.g:998:6: ( ruleEString )
                    	    // InternalActivityDiagramDsl.g:999:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getActivityNodeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getActivityNodeAccess().getIncomingTransitionCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_23);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,25,FOLLOW_24); 

                    				newLeafNode(otherlv_9, grammarAccess.getActivityNodeAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalActivityDiagramDsl.g:1019:3: (otherlv_10= 'outgoing' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==26) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalActivityDiagramDsl.g:1020:4: otherlv_10= 'outgoing' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')'
                    {
                    otherlv_10=(Token)match(input,26,FOLLOW_22); 

                    				newLeafNode(otherlv_10, grammarAccess.getActivityNodeAccess().getOutgoingKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getActivityNodeAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalActivityDiagramDsl.g:1028:4: ( ( ruleEString ) )
                    // InternalActivityDiagramDsl.g:1029:5: ( ruleEString )
                    {
                    // InternalActivityDiagramDsl.g:1029:5: ( ruleEString )
                    // InternalActivityDiagramDsl.g:1030:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getActivityNodeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getActivityNodeAccess().getOutgoingTransitionCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_23);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalActivityDiagramDsl.g:1044:4: (otherlv_13= ',' ( ( ruleEString ) ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==16) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // InternalActivityDiagramDsl.g:1045:5: otherlv_13= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_13=(Token)match(input,16,FOLLOW_3); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getActivityNodeAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalActivityDiagramDsl.g:1049:5: ( ( ruleEString ) )
                    	    // InternalActivityDiagramDsl.g:1050:6: ( ruleEString )
                    	    {
                    	    // InternalActivityDiagramDsl.g:1050:6: ( ruleEString )
                    	    // InternalActivityDiagramDsl.g:1051:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getActivityNodeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getActivityNodeAccess().getOutgoingTransitionCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_23);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,25,FOLLOW_20); 

                    				newLeafNode(otherlv_15, grammarAccess.getActivityNodeAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getActivityNodeAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActivityNode"


    // $ANTLR start "entryRuleForkNode"
    // InternalActivityDiagramDsl.g:1079:1: entryRuleForkNode returns [EObject current=null] : iv_ruleForkNode= ruleForkNode EOF ;
    public final EObject entryRuleForkNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForkNode = null;


        try {
            // InternalActivityDiagramDsl.g:1079:49: (iv_ruleForkNode= ruleForkNode EOF )
            // InternalActivityDiagramDsl.g:1080:2: iv_ruleForkNode= ruleForkNode EOF
            {
             newCompositeNode(grammarAccess.getForkNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleForkNode=ruleForkNode();

            state._fsp--;

             current =iv_ruleForkNode; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleForkNode"


    // $ANTLR start "ruleForkNode"
    // InternalActivityDiagramDsl.g:1086:1: ruleForkNode returns [EObject current=null] : ( () otherlv_1= 'ForkNode' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'incoming' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'outgoing' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' ) ;
    public final EObject ruleForkNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalActivityDiagramDsl.g:1092:2: ( ( () otherlv_1= 'ForkNode' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'incoming' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'outgoing' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' ) )
            // InternalActivityDiagramDsl.g:1093:2: ( () otherlv_1= 'ForkNode' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'incoming' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'outgoing' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' )
            {
            // InternalActivityDiagramDsl.g:1093:2: ( () otherlv_1= 'ForkNode' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'incoming' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'outgoing' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' )
            // InternalActivityDiagramDsl.g:1094:3: () otherlv_1= 'ForkNode' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'incoming' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'outgoing' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}'
            {
            // InternalActivityDiagramDsl.g:1094:3: ()
            // InternalActivityDiagramDsl.g:1095:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getForkNodeAccess().getForkNodeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getForkNodeAccess().getForkNodeKeyword_1());
            		
            // InternalActivityDiagramDsl.g:1105:3: ( (lv_name_2_0= ruleEString ) )
            // InternalActivityDiagramDsl.g:1106:4: (lv_name_2_0= ruleEString )
            {
            // InternalActivityDiagramDsl.g:1106:4: (lv_name_2_0= ruleEString )
            // InternalActivityDiagramDsl.g:1107:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getForkNodeAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getForkNodeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.activitydiagramdsl.ActivityDiagramDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getForkNodeAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalActivityDiagramDsl.g:1128:3: (otherlv_4= 'incoming' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==23) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalActivityDiagramDsl.g:1129:4: otherlv_4= 'incoming' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,23,FOLLOW_22); 

                    				newLeafNode(otherlv_4, grammarAccess.getForkNodeAccess().getIncomingKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getForkNodeAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalActivityDiagramDsl.g:1137:4: ( ( ruleEString ) )
                    // InternalActivityDiagramDsl.g:1138:5: ( ruleEString )
                    {
                    // InternalActivityDiagramDsl.g:1138:5: ( ruleEString )
                    // InternalActivityDiagramDsl.g:1139:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getForkNodeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getForkNodeAccess().getIncomingTransitionCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_23);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalActivityDiagramDsl.g:1153:4: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==16) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // InternalActivityDiagramDsl.g:1154:5: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,16,FOLLOW_3); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getForkNodeAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalActivityDiagramDsl.g:1158:5: ( ( ruleEString ) )
                    	    // InternalActivityDiagramDsl.g:1159:6: ( ruleEString )
                    	    {
                    	    // InternalActivityDiagramDsl.g:1159:6: ( ruleEString )
                    	    // InternalActivityDiagramDsl.g:1160:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getForkNodeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getForkNodeAccess().getIncomingTransitionCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_23);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,25,FOLLOW_24); 

                    				newLeafNode(otherlv_9, grammarAccess.getForkNodeAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalActivityDiagramDsl.g:1180:3: (otherlv_10= 'outgoing' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==26) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalActivityDiagramDsl.g:1181:4: otherlv_10= 'outgoing' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')'
                    {
                    otherlv_10=(Token)match(input,26,FOLLOW_22); 

                    				newLeafNode(otherlv_10, grammarAccess.getForkNodeAccess().getOutgoingKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getForkNodeAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalActivityDiagramDsl.g:1189:4: ( ( ruleEString ) )
                    // InternalActivityDiagramDsl.g:1190:5: ( ruleEString )
                    {
                    // InternalActivityDiagramDsl.g:1190:5: ( ruleEString )
                    // InternalActivityDiagramDsl.g:1191:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getForkNodeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getForkNodeAccess().getOutgoingTransitionCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_23);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalActivityDiagramDsl.g:1205:4: (otherlv_13= ',' ( ( ruleEString ) ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==16) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // InternalActivityDiagramDsl.g:1206:5: otherlv_13= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_13=(Token)match(input,16,FOLLOW_3); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getForkNodeAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalActivityDiagramDsl.g:1210:5: ( ( ruleEString ) )
                    	    // InternalActivityDiagramDsl.g:1211:6: ( ruleEString )
                    	    {
                    	    // InternalActivityDiagramDsl.g:1211:6: ( ruleEString )
                    	    // InternalActivityDiagramDsl.g:1212:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getForkNodeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getForkNodeAccess().getOutgoingTransitionCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_23);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,25,FOLLOW_20); 

                    				newLeafNode(otherlv_15, grammarAccess.getForkNodeAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getForkNodeAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleForkNode"


    // $ANTLR start "entryRuleJoinNode"
    // InternalActivityDiagramDsl.g:1240:1: entryRuleJoinNode returns [EObject current=null] : iv_ruleJoinNode= ruleJoinNode EOF ;
    public final EObject entryRuleJoinNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJoinNode = null;


        try {
            // InternalActivityDiagramDsl.g:1240:49: (iv_ruleJoinNode= ruleJoinNode EOF )
            // InternalActivityDiagramDsl.g:1241:2: iv_ruleJoinNode= ruleJoinNode EOF
            {
             newCompositeNode(grammarAccess.getJoinNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJoinNode=ruleJoinNode();

            state._fsp--;

             current =iv_ruleJoinNode; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJoinNode"


    // $ANTLR start "ruleJoinNode"
    // InternalActivityDiagramDsl.g:1247:1: ruleJoinNode returns [EObject current=null] : ( () otherlv_1= 'JoinNode' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'incoming' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'outgoing' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' ) ;
    public final EObject ruleJoinNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalActivityDiagramDsl.g:1253:2: ( ( () otherlv_1= 'JoinNode' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'incoming' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'outgoing' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' ) )
            // InternalActivityDiagramDsl.g:1254:2: ( () otherlv_1= 'JoinNode' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'incoming' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'outgoing' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' )
            {
            // InternalActivityDiagramDsl.g:1254:2: ( () otherlv_1= 'JoinNode' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'incoming' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'outgoing' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' )
            // InternalActivityDiagramDsl.g:1255:3: () otherlv_1= 'JoinNode' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'incoming' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'outgoing' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}'
            {
            // InternalActivityDiagramDsl.g:1255:3: ()
            // InternalActivityDiagramDsl.g:1256:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getJoinNodeAccess().getJoinNodeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getJoinNodeAccess().getJoinNodeKeyword_1());
            		
            // InternalActivityDiagramDsl.g:1266:3: ( (lv_name_2_0= ruleEString ) )
            // InternalActivityDiagramDsl.g:1267:4: (lv_name_2_0= ruleEString )
            {
            // InternalActivityDiagramDsl.g:1267:4: (lv_name_2_0= ruleEString )
            // InternalActivityDiagramDsl.g:1268:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getJoinNodeAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJoinNodeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.activitydiagramdsl.ActivityDiagramDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getJoinNodeAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalActivityDiagramDsl.g:1289:3: (otherlv_4= 'incoming' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==23) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalActivityDiagramDsl.g:1290:4: otherlv_4= 'incoming' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,23,FOLLOW_22); 

                    				newLeafNode(otherlv_4, grammarAccess.getJoinNodeAccess().getIncomingKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getJoinNodeAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalActivityDiagramDsl.g:1298:4: ( ( ruleEString ) )
                    // InternalActivityDiagramDsl.g:1299:5: ( ruleEString )
                    {
                    // InternalActivityDiagramDsl.g:1299:5: ( ruleEString )
                    // InternalActivityDiagramDsl.g:1300:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getJoinNodeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getJoinNodeAccess().getIncomingTransitionCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_23);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalActivityDiagramDsl.g:1314:4: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==16) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // InternalActivityDiagramDsl.g:1315:5: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,16,FOLLOW_3); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getJoinNodeAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalActivityDiagramDsl.g:1319:5: ( ( ruleEString ) )
                    	    // InternalActivityDiagramDsl.g:1320:6: ( ruleEString )
                    	    {
                    	    // InternalActivityDiagramDsl.g:1320:6: ( ruleEString )
                    	    // InternalActivityDiagramDsl.g:1321:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getJoinNodeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getJoinNodeAccess().getIncomingTransitionCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_23);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,25,FOLLOW_24); 

                    				newLeafNode(otherlv_9, grammarAccess.getJoinNodeAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalActivityDiagramDsl.g:1341:3: (otherlv_10= 'outgoing' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==26) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalActivityDiagramDsl.g:1342:4: otherlv_10= 'outgoing' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')'
                    {
                    otherlv_10=(Token)match(input,26,FOLLOW_22); 

                    				newLeafNode(otherlv_10, grammarAccess.getJoinNodeAccess().getOutgoingKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getJoinNodeAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalActivityDiagramDsl.g:1350:4: ( ( ruleEString ) )
                    // InternalActivityDiagramDsl.g:1351:5: ( ruleEString )
                    {
                    // InternalActivityDiagramDsl.g:1351:5: ( ruleEString )
                    // InternalActivityDiagramDsl.g:1352:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getJoinNodeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getJoinNodeAccess().getOutgoingTransitionCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_23);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalActivityDiagramDsl.g:1366:4: (otherlv_13= ',' ( ( ruleEString ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==16) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // InternalActivityDiagramDsl.g:1367:5: otherlv_13= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_13=(Token)match(input,16,FOLLOW_3); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getJoinNodeAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalActivityDiagramDsl.g:1371:5: ( ( ruleEString ) )
                    	    // InternalActivityDiagramDsl.g:1372:6: ( ruleEString )
                    	    {
                    	    // InternalActivityDiagramDsl.g:1372:6: ( ruleEString )
                    	    // InternalActivityDiagramDsl.g:1373:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getJoinNodeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getJoinNodeAccess().getOutgoingTransitionCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_23);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,25,FOLLOW_20); 

                    				newLeafNode(otherlv_15, grammarAccess.getJoinNodeAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getJoinNodeAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJoinNode"


    // $ANTLR start "entryRuleDecisionNode"
    // InternalActivityDiagramDsl.g:1401:1: entryRuleDecisionNode returns [EObject current=null] : iv_ruleDecisionNode= ruleDecisionNode EOF ;
    public final EObject entryRuleDecisionNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecisionNode = null;


        try {
            // InternalActivityDiagramDsl.g:1401:53: (iv_ruleDecisionNode= ruleDecisionNode EOF )
            // InternalActivityDiagramDsl.g:1402:2: iv_ruleDecisionNode= ruleDecisionNode EOF
            {
             newCompositeNode(grammarAccess.getDecisionNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDecisionNode=ruleDecisionNode();

            state._fsp--;

             current =iv_ruleDecisionNode; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDecisionNode"


    // $ANTLR start "ruleDecisionNode"
    // InternalActivityDiagramDsl.g:1408:1: ruleDecisionNode returns [EObject current=null] : ( () otherlv_1= 'DecisionNode' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'incoming' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'outgoing' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' ) ;
    public final EObject ruleDecisionNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalActivityDiagramDsl.g:1414:2: ( ( () otherlv_1= 'DecisionNode' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'incoming' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'outgoing' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' ) )
            // InternalActivityDiagramDsl.g:1415:2: ( () otherlv_1= 'DecisionNode' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'incoming' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'outgoing' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' )
            {
            // InternalActivityDiagramDsl.g:1415:2: ( () otherlv_1= 'DecisionNode' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'incoming' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'outgoing' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' )
            // InternalActivityDiagramDsl.g:1416:3: () otherlv_1= 'DecisionNode' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'incoming' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'outgoing' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}'
            {
            // InternalActivityDiagramDsl.g:1416:3: ()
            // InternalActivityDiagramDsl.g:1417:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDecisionNodeAccess().getDecisionNodeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getDecisionNodeAccess().getDecisionNodeKeyword_1());
            		
            // InternalActivityDiagramDsl.g:1427:3: ( (lv_name_2_0= ruleEString ) )
            // InternalActivityDiagramDsl.g:1428:4: (lv_name_2_0= ruleEString )
            {
            // InternalActivityDiagramDsl.g:1428:4: (lv_name_2_0= ruleEString )
            // InternalActivityDiagramDsl.g:1429:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDecisionNodeAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDecisionNodeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.activitydiagramdsl.ActivityDiagramDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getDecisionNodeAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalActivityDiagramDsl.g:1450:3: (otherlv_4= 'incoming' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==23) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalActivityDiagramDsl.g:1451:4: otherlv_4= 'incoming' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,23,FOLLOW_22); 

                    				newLeafNode(otherlv_4, grammarAccess.getDecisionNodeAccess().getIncomingKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getDecisionNodeAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalActivityDiagramDsl.g:1459:4: ( ( ruleEString ) )
                    // InternalActivityDiagramDsl.g:1460:5: ( ruleEString )
                    {
                    // InternalActivityDiagramDsl.g:1460:5: ( ruleEString )
                    // InternalActivityDiagramDsl.g:1461:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDecisionNodeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getDecisionNodeAccess().getIncomingTransitionCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_23);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalActivityDiagramDsl.g:1475:4: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==16) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // InternalActivityDiagramDsl.g:1476:5: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,16,FOLLOW_3); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getDecisionNodeAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalActivityDiagramDsl.g:1480:5: ( ( ruleEString ) )
                    	    // InternalActivityDiagramDsl.g:1481:6: ( ruleEString )
                    	    {
                    	    // InternalActivityDiagramDsl.g:1481:6: ( ruleEString )
                    	    // InternalActivityDiagramDsl.g:1482:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getDecisionNodeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getDecisionNodeAccess().getIncomingTransitionCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_23);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,25,FOLLOW_24); 

                    				newLeafNode(otherlv_9, grammarAccess.getDecisionNodeAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalActivityDiagramDsl.g:1502:3: (otherlv_10= 'outgoing' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==26) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalActivityDiagramDsl.g:1503:4: otherlv_10= 'outgoing' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')'
                    {
                    otherlv_10=(Token)match(input,26,FOLLOW_22); 

                    				newLeafNode(otherlv_10, grammarAccess.getDecisionNodeAccess().getOutgoingKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getDecisionNodeAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalActivityDiagramDsl.g:1511:4: ( ( ruleEString ) )
                    // InternalActivityDiagramDsl.g:1512:5: ( ruleEString )
                    {
                    // InternalActivityDiagramDsl.g:1512:5: ( ruleEString )
                    // InternalActivityDiagramDsl.g:1513:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDecisionNodeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getDecisionNodeAccess().getOutgoingTransitionCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_23);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalActivityDiagramDsl.g:1527:4: (otherlv_13= ',' ( ( ruleEString ) ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==16) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // InternalActivityDiagramDsl.g:1528:5: otherlv_13= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_13=(Token)match(input,16,FOLLOW_3); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getDecisionNodeAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalActivityDiagramDsl.g:1532:5: ( ( ruleEString ) )
                    	    // InternalActivityDiagramDsl.g:1533:6: ( ruleEString )
                    	    {
                    	    // InternalActivityDiagramDsl.g:1533:6: ( ruleEString )
                    	    // InternalActivityDiagramDsl.g:1534:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getDecisionNodeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getDecisionNodeAccess().getOutgoingTransitionCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_23);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,25,FOLLOW_20); 

                    				newLeafNode(otherlv_15, grammarAccess.getDecisionNodeAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getDecisionNodeAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDecisionNode"


    // $ANTLR start "entryRuleNode_Impl"
    // InternalActivityDiagramDsl.g:1562:1: entryRuleNode_Impl returns [EObject current=null] : iv_ruleNode_Impl= ruleNode_Impl EOF ;
    public final EObject entryRuleNode_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode_Impl = null;


        try {
            // InternalActivityDiagramDsl.g:1562:50: (iv_ruleNode_Impl= ruleNode_Impl EOF )
            // InternalActivityDiagramDsl.g:1563:2: iv_ruleNode_Impl= ruleNode_Impl EOF
            {
             newCompositeNode(grammarAccess.getNode_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNode_Impl=ruleNode_Impl();

            state._fsp--;

             current =iv_ruleNode_Impl; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNode_Impl"


    // $ANTLR start "ruleNode_Impl"
    // InternalActivityDiagramDsl.g:1569:1: ruleNode_Impl returns [EObject current=null] : ( () otherlv_1= 'Node' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'incoming' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'outgoing' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' ) ;
    public final EObject ruleNode_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalActivityDiagramDsl.g:1575:2: ( ( () otherlv_1= 'Node' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'incoming' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'outgoing' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' ) )
            // InternalActivityDiagramDsl.g:1576:2: ( () otherlv_1= 'Node' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'incoming' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'outgoing' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' )
            {
            // InternalActivityDiagramDsl.g:1576:2: ( () otherlv_1= 'Node' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'incoming' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'outgoing' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' )
            // InternalActivityDiagramDsl.g:1577:3: () otherlv_1= 'Node' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'incoming' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'outgoing' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}'
            {
            // InternalActivityDiagramDsl.g:1577:3: ()
            // InternalActivityDiagramDsl.g:1578:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNode_ImplAccess().getNodeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getNode_ImplAccess().getNodeKeyword_1());
            		
            // InternalActivityDiagramDsl.g:1588:3: ( (lv_name_2_0= ruleEString ) )
            // InternalActivityDiagramDsl.g:1589:4: (lv_name_2_0= ruleEString )
            {
            // InternalActivityDiagramDsl.g:1589:4: (lv_name_2_0= ruleEString )
            // InternalActivityDiagramDsl.g:1590:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getNode_ImplAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNode_ImplRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.activitydiagramdsl.ActivityDiagramDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getNode_ImplAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalActivityDiagramDsl.g:1611:3: (otherlv_4= 'incoming' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==23) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalActivityDiagramDsl.g:1612:4: otherlv_4= 'incoming' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,23,FOLLOW_22); 

                    				newLeafNode(otherlv_4, grammarAccess.getNode_ImplAccess().getIncomingKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getNode_ImplAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalActivityDiagramDsl.g:1620:4: ( ( ruleEString ) )
                    // InternalActivityDiagramDsl.g:1621:5: ( ruleEString )
                    {
                    // InternalActivityDiagramDsl.g:1621:5: ( ruleEString )
                    // InternalActivityDiagramDsl.g:1622:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNode_ImplRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getNode_ImplAccess().getIncomingTransitionCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_23);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalActivityDiagramDsl.g:1636:4: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==16) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // InternalActivityDiagramDsl.g:1637:5: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,16,FOLLOW_3); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getNode_ImplAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalActivityDiagramDsl.g:1641:5: ( ( ruleEString ) )
                    	    // InternalActivityDiagramDsl.g:1642:6: ( ruleEString )
                    	    {
                    	    // InternalActivityDiagramDsl.g:1642:6: ( ruleEString )
                    	    // InternalActivityDiagramDsl.g:1643:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getNode_ImplRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getNode_ImplAccess().getIncomingTransitionCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_23);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop40;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,25,FOLLOW_24); 

                    				newLeafNode(otherlv_9, grammarAccess.getNode_ImplAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalActivityDiagramDsl.g:1663:3: (otherlv_10= 'outgoing' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==26) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalActivityDiagramDsl.g:1664:4: otherlv_10= 'outgoing' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')'
                    {
                    otherlv_10=(Token)match(input,26,FOLLOW_22); 

                    				newLeafNode(otherlv_10, grammarAccess.getNode_ImplAccess().getOutgoingKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getNode_ImplAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalActivityDiagramDsl.g:1672:4: ( ( ruleEString ) )
                    // InternalActivityDiagramDsl.g:1673:5: ( ruleEString )
                    {
                    // InternalActivityDiagramDsl.g:1673:5: ( ruleEString )
                    // InternalActivityDiagramDsl.g:1674:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNode_ImplRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getNode_ImplAccess().getOutgoingTransitionCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_23);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalActivityDiagramDsl.g:1688:4: (otherlv_13= ',' ( ( ruleEString ) ) )*
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==16) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // InternalActivityDiagramDsl.g:1689:5: otherlv_13= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_13=(Token)match(input,16,FOLLOW_3); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getNode_ImplAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalActivityDiagramDsl.g:1693:5: ( ( ruleEString ) )
                    	    // InternalActivityDiagramDsl.g:1694:6: ( ruleEString )
                    	    {
                    	    // InternalActivityDiagramDsl.g:1694:6: ( ruleEString )
                    	    // InternalActivityDiagramDsl.g:1695:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getNode_ImplRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getNode_ImplAccess().getOutgoingTransitionCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_23);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop42;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,25,FOLLOW_20); 

                    				newLeafNode(otherlv_15, grammarAccess.getNode_ImplAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getNode_ImplAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNode_Impl"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000003EE000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000003EC000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000003E8000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000003E0000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000003A0000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000320000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000220000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004820000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000002010000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000004020000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000060020000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000040020000L});

}