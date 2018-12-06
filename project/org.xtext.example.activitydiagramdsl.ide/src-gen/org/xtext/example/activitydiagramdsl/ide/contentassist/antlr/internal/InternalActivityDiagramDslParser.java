package org.xtext.example.activitydiagramdsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.activitydiagramdsl.services.ActivityDiagramDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalActivityDiagramDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ActivityDiagram'", "'{'", "'}'", "'initialNode'", "'finalNode'", "'trasitions'", "','", "'activityNodes'", "'forkNodes'", "'joinNodes'", "'decisionNodes'", "'InitialNode'", "'incoming'", "'('", "')'", "'outgoing'", "'FinalNode'", "'Transition'", "'target'", "'source'", "'ActivityNode'", "'ForkNode'", "'JoinNode'", "'DecisionNode'", "'Node'"
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

    	public void setGrammarAccess(ActivityDiagramDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleActivityDiagram"
    // InternalActivityDiagramDsl.g:53:1: entryRuleActivityDiagram : ruleActivityDiagram EOF ;
    public final void entryRuleActivityDiagram() throws RecognitionException {
        try {
            // InternalActivityDiagramDsl.g:54:1: ( ruleActivityDiagram EOF )
            // InternalActivityDiagramDsl.g:55:1: ruleActivityDiagram EOF
            {
             before(grammarAccess.getActivityDiagramRule()); 
            pushFollow(FOLLOW_1);
            ruleActivityDiagram();

            state._fsp--;

             after(grammarAccess.getActivityDiagramRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleActivityDiagram"


    // $ANTLR start "ruleActivityDiagram"
    // InternalActivityDiagramDsl.g:62:1: ruleActivityDiagram : ( ( rule__ActivityDiagram__Group__0 ) ) ;
    public final void ruleActivityDiagram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:66:2: ( ( ( rule__ActivityDiagram__Group__0 ) ) )
            // InternalActivityDiagramDsl.g:67:2: ( ( rule__ActivityDiagram__Group__0 ) )
            {
            // InternalActivityDiagramDsl.g:67:2: ( ( rule__ActivityDiagram__Group__0 ) )
            // InternalActivityDiagramDsl.g:68:3: ( rule__ActivityDiagram__Group__0 )
            {
             before(grammarAccess.getActivityDiagramAccess().getGroup()); 
            // InternalActivityDiagramDsl.g:69:3: ( rule__ActivityDiagram__Group__0 )
            // InternalActivityDiagramDsl.g:69:4: rule__ActivityDiagram__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ActivityDiagram__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActivityDiagramAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActivityDiagram"


    // $ANTLR start "entryRuleEString"
    // InternalActivityDiagramDsl.g:78:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalActivityDiagramDsl.g:79:1: ( ruleEString EOF )
            // InternalActivityDiagramDsl.g:80:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalActivityDiagramDsl.g:87:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:91:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalActivityDiagramDsl.g:92:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalActivityDiagramDsl.g:92:2: ( ( rule__EString__Alternatives ) )
            // InternalActivityDiagramDsl.g:93:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalActivityDiagramDsl.g:94:3: ( rule__EString__Alternatives )
            // InternalActivityDiagramDsl.g:94:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleInitialNode"
    // InternalActivityDiagramDsl.g:103:1: entryRuleInitialNode : ruleInitialNode EOF ;
    public final void entryRuleInitialNode() throws RecognitionException {
        try {
            // InternalActivityDiagramDsl.g:104:1: ( ruleInitialNode EOF )
            // InternalActivityDiagramDsl.g:105:1: ruleInitialNode EOF
            {
             before(grammarAccess.getInitialNodeRule()); 
            pushFollow(FOLLOW_1);
            ruleInitialNode();

            state._fsp--;

             after(grammarAccess.getInitialNodeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInitialNode"


    // $ANTLR start "ruleInitialNode"
    // InternalActivityDiagramDsl.g:112:1: ruleInitialNode : ( ( rule__InitialNode__Group__0 ) ) ;
    public final void ruleInitialNode() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:116:2: ( ( ( rule__InitialNode__Group__0 ) ) )
            // InternalActivityDiagramDsl.g:117:2: ( ( rule__InitialNode__Group__0 ) )
            {
            // InternalActivityDiagramDsl.g:117:2: ( ( rule__InitialNode__Group__0 ) )
            // InternalActivityDiagramDsl.g:118:3: ( rule__InitialNode__Group__0 )
            {
             before(grammarAccess.getInitialNodeAccess().getGroup()); 
            // InternalActivityDiagramDsl.g:119:3: ( rule__InitialNode__Group__0 )
            // InternalActivityDiagramDsl.g:119:4: rule__InitialNode__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InitialNode__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInitialNodeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInitialNode"


    // $ANTLR start "entryRuleFinalNode"
    // InternalActivityDiagramDsl.g:128:1: entryRuleFinalNode : ruleFinalNode EOF ;
    public final void entryRuleFinalNode() throws RecognitionException {
        try {
            // InternalActivityDiagramDsl.g:129:1: ( ruleFinalNode EOF )
            // InternalActivityDiagramDsl.g:130:1: ruleFinalNode EOF
            {
             before(grammarAccess.getFinalNodeRule()); 
            pushFollow(FOLLOW_1);
            ruleFinalNode();

            state._fsp--;

             after(grammarAccess.getFinalNodeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFinalNode"


    // $ANTLR start "ruleFinalNode"
    // InternalActivityDiagramDsl.g:137:1: ruleFinalNode : ( ( rule__FinalNode__Group__0 ) ) ;
    public final void ruleFinalNode() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:141:2: ( ( ( rule__FinalNode__Group__0 ) ) )
            // InternalActivityDiagramDsl.g:142:2: ( ( rule__FinalNode__Group__0 ) )
            {
            // InternalActivityDiagramDsl.g:142:2: ( ( rule__FinalNode__Group__0 ) )
            // InternalActivityDiagramDsl.g:143:3: ( rule__FinalNode__Group__0 )
            {
             before(grammarAccess.getFinalNodeAccess().getGroup()); 
            // InternalActivityDiagramDsl.g:144:3: ( rule__FinalNode__Group__0 )
            // InternalActivityDiagramDsl.g:144:4: rule__FinalNode__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FinalNode__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFinalNodeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFinalNode"


    // $ANTLR start "entryRuleTransition"
    // InternalActivityDiagramDsl.g:153:1: entryRuleTransition : ruleTransition EOF ;
    public final void entryRuleTransition() throws RecognitionException {
        try {
            // InternalActivityDiagramDsl.g:154:1: ( ruleTransition EOF )
            // InternalActivityDiagramDsl.g:155:1: ruleTransition EOF
            {
             before(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_1);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getTransitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // InternalActivityDiagramDsl.g:162:1: ruleTransition : ( ( rule__Transition__Group__0 ) ) ;
    public final void ruleTransition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:166:2: ( ( ( rule__Transition__Group__0 ) ) )
            // InternalActivityDiagramDsl.g:167:2: ( ( rule__Transition__Group__0 ) )
            {
            // InternalActivityDiagramDsl.g:167:2: ( ( rule__Transition__Group__0 ) )
            // InternalActivityDiagramDsl.g:168:3: ( rule__Transition__Group__0 )
            {
             before(grammarAccess.getTransitionAccess().getGroup()); 
            // InternalActivityDiagramDsl.g:169:3: ( rule__Transition__Group__0 )
            // InternalActivityDiagramDsl.g:169:4: rule__Transition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleActivityNode"
    // InternalActivityDiagramDsl.g:178:1: entryRuleActivityNode : ruleActivityNode EOF ;
    public final void entryRuleActivityNode() throws RecognitionException {
        try {
            // InternalActivityDiagramDsl.g:179:1: ( ruleActivityNode EOF )
            // InternalActivityDiagramDsl.g:180:1: ruleActivityNode EOF
            {
             before(grammarAccess.getActivityNodeRule()); 
            pushFollow(FOLLOW_1);
            ruleActivityNode();

            state._fsp--;

             after(grammarAccess.getActivityNodeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleActivityNode"


    // $ANTLR start "ruleActivityNode"
    // InternalActivityDiagramDsl.g:187:1: ruleActivityNode : ( ( rule__ActivityNode__Group__0 ) ) ;
    public final void ruleActivityNode() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:191:2: ( ( ( rule__ActivityNode__Group__0 ) ) )
            // InternalActivityDiagramDsl.g:192:2: ( ( rule__ActivityNode__Group__0 ) )
            {
            // InternalActivityDiagramDsl.g:192:2: ( ( rule__ActivityNode__Group__0 ) )
            // InternalActivityDiagramDsl.g:193:3: ( rule__ActivityNode__Group__0 )
            {
             before(grammarAccess.getActivityNodeAccess().getGroup()); 
            // InternalActivityDiagramDsl.g:194:3: ( rule__ActivityNode__Group__0 )
            // InternalActivityDiagramDsl.g:194:4: rule__ActivityNode__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ActivityNode__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActivityNodeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActivityNode"


    // $ANTLR start "entryRuleForkNode"
    // InternalActivityDiagramDsl.g:203:1: entryRuleForkNode : ruleForkNode EOF ;
    public final void entryRuleForkNode() throws RecognitionException {
        try {
            // InternalActivityDiagramDsl.g:204:1: ( ruleForkNode EOF )
            // InternalActivityDiagramDsl.g:205:1: ruleForkNode EOF
            {
             before(grammarAccess.getForkNodeRule()); 
            pushFollow(FOLLOW_1);
            ruleForkNode();

            state._fsp--;

             after(grammarAccess.getForkNodeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleForkNode"


    // $ANTLR start "ruleForkNode"
    // InternalActivityDiagramDsl.g:212:1: ruleForkNode : ( ( rule__ForkNode__Group__0 ) ) ;
    public final void ruleForkNode() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:216:2: ( ( ( rule__ForkNode__Group__0 ) ) )
            // InternalActivityDiagramDsl.g:217:2: ( ( rule__ForkNode__Group__0 ) )
            {
            // InternalActivityDiagramDsl.g:217:2: ( ( rule__ForkNode__Group__0 ) )
            // InternalActivityDiagramDsl.g:218:3: ( rule__ForkNode__Group__0 )
            {
             before(grammarAccess.getForkNodeAccess().getGroup()); 
            // InternalActivityDiagramDsl.g:219:3: ( rule__ForkNode__Group__0 )
            // InternalActivityDiagramDsl.g:219:4: rule__ForkNode__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ForkNode__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getForkNodeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleForkNode"


    // $ANTLR start "entryRuleJoinNode"
    // InternalActivityDiagramDsl.g:228:1: entryRuleJoinNode : ruleJoinNode EOF ;
    public final void entryRuleJoinNode() throws RecognitionException {
        try {
            // InternalActivityDiagramDsl.g:229:1: ( ruleJoinNode EOF )
            // InternalActivityDiagramDsl.g:230:1: ruleJoinNode EOF
            {
             before(grammarAccess.getJoinNodeRule()); 
            pushFollow(FOLLOW_1);
            ruleJoinNode();

            state._fsp--;

             after(grammarAccess.getJoinNodeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleJoinNode"


    // $ANTLR start "ruleJoinNode"
    // InternalActivityDiagramDsl.g:237:1: ruleJoinNode : ( ( rule__JoinNode__Group__0 ) ) ;
    public final void ruleJoinNode() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:241:2: ( ( ( rule__JoinNode__Group__0 ) ) )
            // InternalActivityDiagramDsl.g:242:2: ( ( rule__JoinNode__Group__0 ) )
            {
            // InternalActivityDiagramDsl.g:242:2: ( ( rule__JoinNode__Group__0 ) )
            // InternalActivityDiagramDsl.g:243:3: ( rule__JoinNode__Group__0 )
            {
             before(grammarAccess.getJoinNodeAccess().getGroup()); 
            // InternalActivityDiagramDsl.g:244:3: ( rule__JoinNode__Group__0 )
            // InternalActivityDiagramDsl.g:244:4: rule__JoinNode__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__JoinNode__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getJoinNodeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJoinNode"


    // $ANTLR start "entryRuleDecisionNode"
    // InternalActivityDiagramDsl.g:253:1: entryRuleDecisionNode : ruleDecisionNode EOF ;
    public final void entryRuleDecisionNode() throws RecognitionException {
        try {
            // InternalActivityDiagramDsl.g:254:1: ( ruleDecisionNode EOF )
            // InternalActivityDiagramDsl.g:255:1: ruleDecisionNode EOF
            {
             before(grammarAccess.getDecisionNodeRule()); 
            pushFollow(FOLLOW_1);
            ruleDecisionNode();

            state._fsp--;

             after(grammarAccess.getDecisionNodeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDecisionNode"


    // $ANTLR start "ruleDecisionNode"
    // InternalActivityDiagramDsl.g:262:1: ruleDecisionNode : ( ( rule__DecisionNode__Group__0 ) ) ;
    public final void ruleDecisionNode() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:266:2: ( ( ( rule__DecisionNode__Group__0 ) ) )
            // InternalActivityDiagramDsl.g:267:2: ( ( rule__DecisionNode__Group__0 ) )
            {
            // InternalActivityDiagramDsl.g:267:2: ( ( rule__DecisionNode__Group__0 ) )
            // InternalActivityDiagramDsl.g:268:3: ( rule__DecisionNode__Group__0 )
            {
             before(grammarAccess.getDecisionNodeAccess().getGroup()); 
            // InternalActivityDiagramDsl.g:269:3: ( rule__DecisionNode__Group__0 )
            // InternalActivityDiagramDsl.g:269:4: rule__DecisionNode__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DecisionNode__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDecisionNodeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDecisionNode"


    // $ANTLR start "entryRuleNode_Impl"
    // InternalActivityDiagramDsl.g:278:1: entryRuleNode_Impl : ruleNode_Impl EOF ;
    public final void entryRuleNode_Impl() throws RecognitionException {
        try {
            // InternalActivityDiagramDsl.g:279:1: ( ruleNode_Impl EOF )
            // InternalActivityDiagramDsl.g:280:1: ruleNode_Impl EOF
            {
             before(grammarAccess.getNode_ImplRule()); 
            pushFollow(FOLLOW_1);
            ruleNode_Impl();

            state._fsp--;

             after(grammarAccess.getNode_ImplRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNode_Impl"


    // $ANTLR start "ruleNode_Impl"
    // InternalActivityDiagramDsl.g:287:1: ruleNode_Impl : ( ( rule__Node_Impl__Group__0 ) ) ;
    public final void ruleNode_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:291:2: ( ( ( rule__Node_Impl__Group__0 ) ) )
            // InternalActivityDiagramDsl.g:292:2: ( ( rule__Node_Impl__Group__0 ) )
            {
            // InternalActivityDiagramDsl.g:292:2: ( ( rule__Node_Impl__Group__0 ) )
            // InternalActivityDiagramDsl.g:293:3: ( rule__Node_Impl__Group__0 )
            {
             before(grammarAccess.getNode_ImplAccess().getGroup()); 
            // InternalActivityDiagramDsl.g:294:3: ( rule__Node_Impl__Group__0 )
            // InternalActivityDiagramDsl.g:294:4: rule__Node_Impl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Node_Impl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNode_ImplAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNode_Impl"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalActivityDiagramDsl.g:302:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:306:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalActivityDiagramDsl.g:307:2: ( RULE_STRING )
                    {
                    // InternalActivityDiagramDsl.g:307:2: ( RULE_STRING )
                    // InternalActivityDiagramDsl.g:308:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalActivityDiagramDsl.g:313:2: ( RULE_ID )
                    {
                    // InternalActivityDiagramDsl.g:313:2: ( RULE_ID )
                    // InternalActivityDiagramDsl.g:314:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__ActivityDiagram__Group__0"
    // InternalActivityDiagramDsl.g:323:1: rule__ActivityDiagram__Group__0 : rule__ActivityDiagram__Group__0__Impl rule__ActivityDiagram__Group__1 ;
    public final void rule__ActivityDiagram__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:327:1: ( rule__ActivityDiagram__Group__0__Impl rule__ActivityDiagram__Group__1 )
            // InternalActivityDiagramDsl.g:328:2: rule__ActivityDiagram__Group__0__Impl rule__ActivityDiagram__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ActivityDiagram__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivityDiagram__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityDiagram__Group__0"


    // $ANTLR start "rule__ActivityDiagram__Group__0__Impl"
    // InternalActivityDiagramDsl.g:335:1: rule__ActivityDiagram__Group__0__Impl : ( () ) ;
    public final void rule__ActivityDiagram__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:339:1: ( ( () ) )
            // InternalActivityDiagramDsl.g:340:1: ( () )
            {
            // InternalActivityDiagramDsl.g:340:1: ( () )
            // InternalActivityDiagramDsl.g:341:2: ()
            {
             before(grammarAccess.getActivityDiagramAccess().getActivityDiagramAction_0()); 
            // InternalActivityDiagramDsl.g:342:2: ()
            // InternalActivityDiagramDsl.g:342:3: 
            {
            }

             after(grammarAccess.getActivityDiagramAccess().getActivityDiagramAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityDiagram__Group__0__Impl"


    // $ANTLR start "rule__ActivityDiagram__Group__1"
    // InternalActivityDiagramDsl.g:350:1: rule__ActivityDiagram__Group__1 : rule__ActivityDiagram__Group__1__Impl rule__ActivityDiagram__Group__2 ;
    public final void rule__ActivityDiagram__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:354:1: ( rule__ActivityDiagram__Group__1__Impl rule__ActivityDiagram__Group__2 )
            // InternalActivityDiagramDsl.g:355:2: rule__ActivityDiagram__Group__1__Impl rule__ActivityDiagram__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ActivityDiagram__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivityDiagram__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityDiagram__Group__1"


    // $ANTLR start "rule__ActivityDiagram__Group__1__Impl"
    // InternalActivityDiagramDsl.g:362:1: rule__ActivityDiagram__Group__1__Impl : ( 'ActivityDiagram' ) ;
    public final void rule__ActivityDiagram__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:366:1: ( ( 'ActivityDiagram' ) )
            // InternalActivityDiagramDsl.g:367:1: ( 'ActivityDiagram' )
            {
            // InternalActivityDiagramDsl.g:367:1: ( 'ActivityDiagram' )
            // InternalActivityDiagramDsl.g:368:2: 'ActivityDiagram'
            {
             before(grammarAccess.getActivityDiagramAccess().getActivityDiagramKeyword_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getActivityDiagramAccess().getActivityDiagramKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityDiagram__Group__1__Impl"


    // $ANTLR start "rule__ActivityDiagram__Group__2"
    // InternalActivityDiagramDsl.g:377:1: rule__ActivityDiagram__Group__2 : rule__ActivityDiagram__Group__2__Impl rule__ActivityDiagram__Group__3 ;
    public final void rule__ActivityDiagram__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:381:1: ( rule__ActivityDiagram__Group__2__Impl rule__ActivityDiagram__Group__3 )
            // InternalActivityDiagramDsl.g:382:2: rule__ActivityDiagram__Group__2__Impl rule__ActivityDiagram__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__ActivityDiagram__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivityDiagram__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityDiagram__Group__2"


    // $ANTLR start "rule__ActivityDiagram__Group__2__Impl"
    // InternalActivityDiagramDsl.g:389:1: rule__ActivityDiagram__Group__2__Impl : ( ( rule__ActivityDiagram__NameAssignment_2 ) ) ;
    public final void rule__ActivityDiagram__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:393:1: ( ( ( rule__ActivityDiagram__NameAssignment_2 ) ) )
            // InternalActivityDiagramDsl.g:394:1: ( ( rule__ActivityDiagram__NameAssignment_2 ) )
            {
            // InternalActivityDiagramDsl.g:394:1: ( ( rule__ActivityDiagram__NameAssignment_2 ) )
            // InternalActivityDiagramDsl.g:395:2: ( rule__ActivityDiagram__NameAssignment_2 )
            {
             before(grammarAccess.getActivityDiagramAccess().getNameAssignment_2()); 
            // InternalActivityDiagramDsl.g:396:2: ( rule__ActivityDiagram__NameAssignment_2 )
            // InternalActivityDiagramDsl.g:396:3: rule__ActivityDiagram__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ActivityDiagram__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getActivityDiagramAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityDiagram__Group__2__Impl"


    // $ANTLR start "rule__ActivityDiagram__Group__3"
    // InternalActivityDiagramDsl.g:404:1: rule__ActivityDiagram__Group__3 : rule__ActivityDiagram__Group__3__Impl rule__ActivityDiagram__Group__4 ;
    public final void rule__ActivityDiagram__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:408:1: ( rule__ActivityDiagram__Group__3__Impl rule__ActivityDiagram__Group__4 )
            // InternalActivityDiagramDsl.g:409:2: rule__ActivityDiagram__Group__3__Impl rule__ActivityDiagram__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__ActivityDiagram__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivityDiagram__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityDiagram__Group__3"


    // $ANTLR start "rule__ActivityDiagram__Group__3__Impl"
    // InternalActivityDiagramDsl.g:416:1: rule__ActivityDiagram__Group__3__Impl : ( '{' ) ;
    public final void rule__ActivityDiagram__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:420:1: ( ( '{' ) )
            // InternalActivityDiagramDsl.g:421:1: ( '{' )
            {
            // InternalActivityDiagramDsl.g:421:1: ( '{' )
            // InternalActivityDiagramDsl.g:422:2: '{'
            {
             before(grammarAccess.getActivityDiagramAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getActivityDiagramAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityDiagram__Group__3__Impl"


    // $ANTLR start "rule__ActivityDiagram__Group__4"
    // InternalActivityDiagramDsl.g:431:1: rule__ActivityDiagram__Group__4 : rule__ActivityDiagram__Group__4__Impl rule__ActivityDiagram__Group__5 ;
    public final void rule__ActivityDiagram__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:435:1: ( rule__ActivityDiagram__Group__4__Impl rule__ActivityDiagram__Group__5 )
            // InternalActivityDiagramDsl.g:436:2: rule__ActivityDiagram__Group__4__Impl rule__ActivityDiagram__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__ActivityDiagram__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivityDiagram__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityDiagram__Group__4"


    // $ANTLR start "rule__ActivityDiagram__Group__4__Impl"
    // InternalActivityDiagramDsl.g:443:1: rule__ActivityDiagram__Group__4__Impl : ( ( rule__ActivityDiagram__Group_4__0 )? ) ;
    public final void rule__ActivityDiagram__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:447:1: ( ( ( rule__ActivityDiagram__Group_4__0 )? ) )
            // InternalActivityDiagramDsl.g:448:1: ( ( rule__ActivityDiagram__Group_4__0 )? )
            {
            // InternalActivityDiagramDsl.g:448:1: ( ( rule__ActivityDiagram__Group_4__0 )? )
            // InternalActivityDiagramDsl.g:449:2: ( rule__ActivityDiagram__Group_4__0 )?
            {
             before(grammarAccess.getActivityDiagramAccess().getGroup_4()); 
            // InternalActivityDiagramDsl.g:450:2: ( rule__ActivityDiagram__Group_4__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalActivityDiagramDsl.g:450:3: rule__ActivityDiagram__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ActivityDiagram__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActivityDiagramAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityDiagram__Group__4__Impl"


    // $ANTLR start "rule__ActivityDiagram__Group__5"
    // InternalActivityDiagramDsl.g:458:1: rule__ActivityDiagram__Group__5 : rule__ActivityDiagram__Group__5__Impl rule__ActivityDiagram__Group__6 ;
    public final void rule__ActivityDiagram__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:462:1: ( rule__ActivityDiagram__Group__5__Impl rule__ActivityDiagram__Group__6 )
            // InternalActivityDiagramDsl.g:463:2: rule__ActivityDiagram__Group__5__Impl rule__ActivityDiagram__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__ActivityDiagram__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivityDiagram__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityDiagram__Group__5"


    // $ANTLR start "rule__ActivityDiagram__Group__5__Impl"
    // InternalActivityDiagramDsl.g:470:1: rule__ActivityDiagram__Group__5__Impl : ( ( rule__ActivityDiagram__Group_5__0 )? ) ;
    public final void rule__ActivityDiagram__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:474:1: ( ( ( rule__ActivityDiagram__Group_5__0 )? ) )
            // InternalActivityDiagramDsl.g:475:1: ( ( rule__ActivityDiagram__Group_5__0 )? )
            {
            // InternalActivityDiagramDsl.g:475:1: ( ( rule__ActivityDiagram__Group_5__0 )? )
            // InternalActivityDiagramDsl.g:476:2: ( rule__ActivityDiagram__Group_5__0 )?
            {
             before(grammarAccess.getActivityDiagramAccess().getGroup_5()); 
            // InternalActivityDiagramDsl.g:477:2: ( rule__ActivityDiagram__Group_5__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalActivityDiagramDsl.g:477:3: rule__ActivityDiagram__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ActivityDiagram__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActivityDiagramAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityDiagram__Group__5__Impl"


    // $ANTLR start "rule__ActivityDiagram__Group__6"
    // InternalActivityDiagramDsl.g:485:1: rule__ActivityDiagram__Group__6 : rule__ActivityDiagram__Group__6__Impl rule__ActivityDiagram__Group__7 ;
    public final void rule__ActivityDiagram__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:489:1: ( rule__ActivityDiagram__Group__6__Impl rule__ActivityDiagram__Group__7 )
            // InternalActivityDiagramDsl.g:490:2: rule__ActivityDiagram__Group__6__Impl rule__ActivityDiagram__Group__7
            {
            pushFollow(FOLLOW_6);
            rule__ActivityDiagram__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivityDiagram__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityDiagram__Group__6"


    // $ANTLR start "rule__ActivityDiagram__Group__6__Impl"
    // InternalActivityDiagramDsl.g:497:1: rule__ActivityDiagram__Group__6__Impl : ( ( rule__ActivityDiagram__Group_6__0 )? ) ;
    public final void rule__ActivityDiagram__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:501:1: ( ( ( rule__ActivityDiagram__Group_6__0 )? ) )
            // InternalActivityDiagramDsl.g:502:1: ( ( rule__ActivityDiagram__Group_6__0 )? )
            {
            // InternalActivityDiagramDsl.g:502:1: ( ( rule__ActivityDiagram__Group_6__0 )? )
            // InternalActivityDiagramDsl.g:503:2: ( rule__ActivityDiagram__Group_6__0 )?
            {
             before(grammarAccess.getActivityDiagramAccess().getGroup_6()); 
            // InternalActivityDiagramDsl.g:504:2: ( rule__ActivityDiagram__Group_6__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalActivityDiagramDsl.g:504:3: rule__ActivityDiagram__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ActivityDiagram__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActivityDiagramAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityDiagram__Group__6__Impl"


    // $ANTLR start "rule__ActivityDiagram__Group__7"
    // InternalActivityDiagramDsl.g:512:1: rule__ActivityDiagram__Group__7 : rule__ActivityDiagram__Group__7__Impl rule__ActivityDiagram__Group__8 ;
    public final void rule__ActivityDiagram__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:516:1: ( rule__ActivityDiagram__Group__7__Impl rule__ActivityDiagram__Group__8 )
            // InternalActivityDiagramDsl.g:517:2: rule__ActivityDiagram__Group__7__Impl rule__ActivityDiagram__Group__8
            {
            pushFollow(FOLLOW_6);
            rule__ActivityDiagram__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivityDiagram__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityDiagram__Group__7"


    // $ANTLR start "rule__ActivityDiagram__Group__7__Impl"
    // InternalActivityDiagramDsl.g:524:1: rule__ActivityDiagram__Group__7__Impl : ( ( rule__ActivityDiagram__Group_7__0 )? ) ;
    public final void rule__ActivityDiagram__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:528:1: ( ( ( rule__ActivityDiagram__Group_7__0 )? ) )
            // InternalActivityDiagramDsl.g:529:1: ( ( rule__ActivityDiagram__Group_7__0 )? )
            {
            // InternalActivityDiagramDsl.g:529:1: ( ( rule__ActivityDiagram__Group_7__0 )? )
            // InternalActivityDiagramDsl.g:530:2: ( rule__ActivityDiagram__Group_7__0 )?
            {
             before(grammarAccess.getActivityDiagramAccess().getGroup_7()); 
            // InternalActivityDiagramDsl.g:531:2: ( rule__ActivityDiagram__Group_7__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalActivityDiagramDsl.g:531:3: rule__ActivityDiagram__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ActivityDiagram__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActivityDiagramAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityDiagram__Group__7__Impl"


    // $ANTLR start "rule__ActivityDiagram__Group__8"
    // InternalActivityDiagramDsl.g:539:1: rule__ActivityDiagram__Group__8 : rule__ActivityDiagram__Group__8__Impl rule__ActivityDiagram__Group__9 ;
    public final void rule__ActivityDiagram__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:543:1: ( rule__ActivityDiagram__Group__8__Impl rule__ActivityDiagram__Group__9 )
            // InternalActivityDiagramDsl.g:544:2: rule__ActivityDiagram__Group__8__Impl rule__ActivityDiagram__Group__9
            {
            pushFollow(FOLLOW_6);
            rule__ActivityDiagram__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivityDiagram__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityDiagram__Group__8"


    // $ANTLR start "rule__ActivityDiagram__Group__8__Impl"
    // InternalActivityDiagramDsl.g:551:1: rule__ActivityDiagram__Group__8__Impl : ( ( rule__ActivityDiagram__Group_8__0 )? ) ;
    public final void rule__ActivityDiagram__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:555:1: ( ( ( rule__ActivityDiagram__Group_8__0 )? ) )
            // InternalActivityDiagramDsl.g:556:1: ( ( rule__ActivityDiagram__Group_8__0 )? )
            {
            // InternalActivityDiagramDsl.g:556:1: ( ( rule__ActivityDiagram__Group_8__0 )? )
            // InternalActivityDiagramDsl.g:557:2: ( rule__ActivityDiagram__Group_8__0 )?
            {
             before(grammarAccess.getActivityDiagramAccess().getGroup_8()); 
            // InternalActivityDiagramDsl.g:558:2: ( rule__ActivityDiagram__Group_8__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalActivityDiagramDsl.g:558:3: rule__ActivityDiagram__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ActivityDiagram__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActivityDiagramAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityDiagram__Group__8__Impl"


    // $ANTLR start "rule__ActivityDiagram__Group__9"
    // InternalActivityDiagramDsl.g:566:1: rule__ActivityDiagram__Group__9 : rule__ActivityDiagram__Group__9__Impl rule__ActivityDiagram__Group__10 ;
    public final void rule__ActivityDiagram__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:570:1: ( rule__ActivityDiagram__Group__9__Impl rule__ActivityDiagram__Group__10 )
            // InternalActivityDiagramDsl.g:571:2: rule__ActivityDiagram__Group__9__Impl rule__ActivityDiagram__Group__10
            {
            pushFollow(FOLLOW_6);
            rule__ActivityDiagram__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivityDiagram__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityDiagram__Group__9"


    // $ANTLR start "rule__ActivityDiagram__Group__9__Impl"
    // InternalActivityDiagramDsl.g:578:1: rule__ActivityDiagram__Group__9__Impl : ( ( rule__ActivityDiagram__Group_9__0 )? ) ;
    public final void rule__ActivityDiagram__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:582:1: ( ( ( rule__ActivityDiagram__Group_9__0 )? ) )
            // InternalActivityDiagramDsl.g:583:1: ( ( rule__ActivityDiagram__Group_9__0 )? )
            {
            // InternalActivityDiagramDsl.g:583:1: ( ( rule__ActivityDiagram__Group_9__0 )? )
            // InternalActivityDiagramDsl.g:584:2: ( rule__ActivityDiagram__Group_9__0 )?
            {
             before(grammarAccess.getActivityDiagramAccess().getGroup_9()); 
            // InternalActivityDiagramDsl.g:585:2: ( rule__ActivityDiagram__Group_9__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalActivityDiagramDsl.g:585:3: rule__ActivityDiagram__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ActivityDiagram__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActivityDiagramAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityDiagram__Group__9__Impl"


    // $ANTLR start "rule__ActivityDiagram__Group__10"
    // InternalActivityDiagramDsl.g:593:1: rule__ActivityDiagram__Group__10 : rule__ActivityDiagram__Group__10__Impl rule__ActivityDiagram__Group__11 ;
    public final void rule__ActivityDiagram__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:597:1: ( rule__ActivityDiagram__Group__10__Impl rule__ActivityDiagram__Group__11 )
            // InternalActivityDiagramDsl.g:598:2: rule__ActivityDiagram__Group__10__Impl rule__ActivityDiagram__Group__11
            {
            pushFollow(FOLLOW_6);
            rule__ActivityDiagram__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivityDiagram__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityDiagram__Group__10"


    // $ANTLR start "rule__ActivityDiagram__Group__10__Impl"
    // InternalActivityDiagramDsl.g:605:1: rule__ActivityDiagram__Group__10__Impl : ( ( rule__ActivityDiagram__Group_10__0 )? ) ;
    public final void rule__ActivityDiagram__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:609:1: ( ( ( rule__ActivityDiagram__Group_10__0 )? ) )
            // InternalActivityDiagramDsl.g:610:1: ( ( rule__ActivityDiagram__Group_10__0 )? )
            {
            // InternalActivityDiagramDsl.g:610:1: ( ( rule__ActivityDiagram__Group_10__0 )? )
            // InternalActivityDiagramDsl.g:611:2: ( rule__ActivityDiagram__Group_10__0 )?
            {
             before(grammarAccess.getActivityDiagramAccess().getGroup_10()); 
            // InternalActivityDiagramDsl.g:612:2: ( rule__ActivityDiagram__Group_10__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalActivityDiagramDsl.g:612:3: rule__ActivityDiagram__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ActivityDiagram__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActivityDiagramAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityDiagram__Group__10__Impl"


    // $ANTLR start "rule__ActivityDiagram__Group__11"
    // InternalActivityDiagramDsl.g:620:1: rule__ActivityDiagram__Group__11 : rule__ActivityDiagram__Group__11__Impl ;
    public final void rule__ActivityDiagram__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:624:1: ( rule__ActivityDiagram__Group__11__Impl )
            // InternalActivityDiagramDsl.g:625:2: rule__ActivityDiagram__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ActivityDiagram__Group__11__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityDiagram__Group__11"


    // $ANTLR start "rule__ActivityDiagram__Group__11__Impl"
    // InternalActivityDiagramDsl.g:631:1: rule__ActivityDiagram__Group__11__Impl : ( '}' ) ;
    public final void rule__ActivityDiagram__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:635:1: ( ( '}' ) )
            // InternalActivityDiagramDsl.g:636:1: ( '}' )
            {
            // InternalActivityDiagramDsl.g:636:1: ( '}' )
            // InternalActivityDiagramDsl.g:637:2: '}'
            {
             before(grammarAccess.getActivityDiagramAccess().getRightCurlyBracketKeyword_11()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getActivityDiagramAccess().getRightCurlyBracketKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityDiagram__Group__11__Impl"


    // $ANTLR start "rule__ActivityDiagram__Group_4__0"
    // InternalActivityDiagramDsl.g:647:1: rule__ActivityDiagram__Group_4__0 : rule__ActivityDiagram__Group_4__0__Impl rule__ActivityDiagram__Group_4__1 ;
    public final void rule__ActivityDiagram__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:651:1: ( rule__ActivityDiagram__Group_4__0__Impl rule__ActivityDiagram__Group_4__1 )
            // InternalActivityDiagramDsl.g:652:2: rule__ActivityDiagram__Group_4__0__Impl rule__ActivityDiagram__Group_4__1
            {
            pushFollow(FOLLOW_7);
            rule__ActivityDiagram__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivityDiagram__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityDiagram__Group_4__0"


    // $ANTLR start "rule__ActivityDiagram__Group_4__0__Impl"
    // InternalActivityDiagramDsl.g:659:1: rule__ActivityDiagram__Group_4__0__Impl : ( 'initialNode' ) ;
    public final void rule__ActivityDiagram__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:663:1: ( ( 'initialNode' ) )
            // InternalActivityDiagramDsl.g:664:1: ( 'initialNode' )
            {
            // InternalActivityDiagramDsl.g:664:1: ( 'initialNode' )
            // InternalActivityDiagramDsl.g:665:2: 'initialNode'
            {
             before(grammarAccess.getActivityDiagramAccess().getInitialNodeKeyword_4_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getActivityDiagramAccess().getInitialNodeKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityDiagram__Group_4__0__Impl"


    // $ANTLR start "rule__ActivityDiagram__Group_4__1"
    // InternalActivityDiagramDsl.g:674:1: rule__ActivityDiagram__Group_4__1 : rule__ActivityDiagram__Group_4__1__Impl ;
    public final void rule__ActivityDiagram__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:678:1: ( rule__ActivityDiagram__Group_4__1__Impl )
            // InternalActivityDiagramDsl.g:679:2: rule__ActivityDiagram__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ActivityDiagram__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityDiagram__Group_4__1"


    // $ANTLR start "rule__ActivityDiagram__Group_4__1__Impl"
    // InternalActivityDiagramDsl.g:685:1: rule__ActivityDiagram__Group_4__1__Impl : ( ( rule__ActivityDiagram__InitialNodeAssignment_4_1 ) ) ;
    public final void rule__ActivityDiagram__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:689:1: ( ( ( rule__ActivityDiagram__InitialNodeAssignment_4_1 ) ) )
            // InternalActivityDiagramDsl.g:690:1: ( ( rule__ActivityDiagram__InitialNodeAssignment_4_1 ) )
            {
            // InternalActivityDiagramDsl.g:690:1: ( ( rule__ActivityDiagram__InitialNodeAssignment_4_1 ) )
            // InternalActivityDiagramDsl.g:691:2: ( rule__ActivityDiagram__InitialNodeAssignment_4_1 )
            {
             before(grammarAccess.getActivityDiagramAccess().getInitialNodeAssignment_4_1()); 
            // InternalActivityDiagramDsl.g:692:2: ( rule__ActivityDiagram__InitialNodeAssignment_4_1 )
            // InternalActivityDiagramDsl.g:692:3: rule__ActivityDiagram__InitialNodeAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__ActivityDiagram__InitialNodeAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getActivityDiagramAccess().getInitialNodeAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityDiagram__Group_4__1__Impl"


    // $ANTLR start "rule__ActivityDiagram__Group_5__0"
    // InternalActivityDiagramDsl.g:701:1: rule__ActivityDiagram__Group_5__0 : rule__ActivityDiagram__Group_5__0__Impl rule__ActivityDiagram__Group_5__1 ;
    public final void rule__ActivityDiagram__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:705:1: ( rule__ActivityDiagram__Group_5__0__Impl rule__ActivityDiagram__Group_5__1 )
            // InternalActivityDiagramDsl.g:706:2: rule__ActivityDiagram__Group_5__0__Impl rule__ActivityDiagram__Group_5__1
            {
            pushFollow(FOLLOW_8);
            rule__ActivityDiagram__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivityDiagram__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityDiagram__Group_5__0"


    // $ANTLR start "rule__ActivityDiagram__Group_5__0__Impl"
    // InternalActivityDiagramDsl.g:713:1: rule__ActivityDiagram__Group_5__0__Impl : ( 'finalNode' ) ;
    public final void rule__ActivityDiagram__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:717:1: ( ( 'finalNode' ) )
            // InternalActivityDiagramDsl.g:718:1: ( 'finalNode' )
            {
            // InternalActivityDiagramDsl.g:718:1: ( 'finalNode' )
            // InternalActivityDiagramDsl.g:719:2: 'finalNode'
            {
             before(grammarAccess.getActivityDiagramAccess().getFinalNodeKeyword_5_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getActivityDiagramAccess().getFinalNodeKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityDiagram__Group_5__0__Impl"


    // $ANTLR start "rule__ActivityDiagram__Group_5__1"
    // InternalActivityDiagramDsl.g:728:1: rule__ActivityDiagram__Group_5__1 : rule__ActivityDiagram__Group_5__1__Impl ;
    public final void rule__ActivityDiagram__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:732:1: ( rule__ActivityDiagram__Group_5__1__Impl )
            // InternalActivityDiagramDsl.g:733:2: rule__ActivityDiagram__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ActivityDiagram__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityDiagram__Group_5__1"


    // $ANTLR start "rule__ActivityDiagram__Group_5__1__Impl"
    // InternalActivityDiagramDsl.g:739:1: rule__ActivityDiagram__Group_5__1__Impl : ( ( rule__ActivityDiagram__FinalNodeAssignment_5_1 ) ) ;
    public final void rule__ActivityDiagram__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:743:1: ( ( ( rule__ActivityDiagram__FinalNodeAssignment_5_1 ) ) )
            // InternalActivityDiagramDsl.g:744:1: ( ( rule__ActivityDiagram__FinalNodeAssignment_5_1 ) )
            {
            // InternalActivityDiagramDsl.g:744:1: ( ( rule__ActivityDiagram__FinalNodeAssignment_5_1 ) )
            // InternalActivityDiagramDsl.g:745:2: ( rule__ActivityDiagram__FinalNodeAssignment_5_1 )
            {
             before(grammarAccess.getActivityDiagramAccess().getFinalNodeAssignment_5_1()); 
            // InternalActivityDiagramDsl.g:746:2: ( rule__ActivityDiagram__FinalNodeAssignment_5_1 )
            // InternalActivityDiagramDsl.g:746:3: rule__ActivityDiagram__FinalNodeAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__ActivityDiagram__FinalNodeAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getActivityDiagramAccess().getFinalNodeAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityDiagram__Group_5__1__Impl"


    // $ANTLR start "rule__ActivityDiagram__Group_6__0"
    // InternalActivityDiagramDsl.g:755:1: rule__ActivityDiagram__Group_6__0 : rule__ActivityDiagram__Group_6__0__Impl rule__ActivityDiagram__Group_6__1 ;
    public final void rule__ActivityDiagram__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:759:1: ( rule__ActivityDiagram__Group_6__0__Impl rule__ActivityDiagram__Group_6__1 )
            // InternalActivityDiagramDsl.g:760:2: rule__ActivityDiagram__Group_6__0__Impl rule__ActivityDiagram__Group_6__1
            {
            pushFollow(FOLLOW_5);
            rule__ActivityDiagram__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivityDiagram__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityDiagram__Group_6__0"


    // $ANTLR start "rule__ActivityDiagram__Group_6__0__Impl"
    // InternalActivityDiagramDsl.g:767:1: rule__ActivityDiagram__Group_6__0__Impl : ( 'trasitions' ) ;
    public final void rule__ActivityDiagram__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:771:1: ( ( 'trasitions' ) )
            // InternalActivityDiagramDsl.g:772:1: ( 'trasitions' )
            {
            // InternalActivityDiagramDsl.g:772:1: ( 'trasitions' )
            // InternalActivityDiagramDsl.g:773:2: 'trasitions'
            {
             before(grammarAccess.getActivityDiagramAccess().getTrasitionsKeyword_6_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getActivityDiagramAccess().getTrasitionsKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityDiagram__Group_6__0__Impl"


    // $ANTLR start "rule__ActivityDiagram__Group_6__1"
    // InternalActivityDiagramDsl.g:782:1: rule__ActivityDiagram__Group_6__1 : rule__ActivityDiagram__Group_6__1__Impl rule__ActivityDiagram__Group_6__2 ;
    public final void rule__ActivityDiagram__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:786:1: ( rule__ActivityDiagram__Group_6__1__Impl rule__ActivityDiagram__Group_6__2 )
            // InternalActivityDiagramDsl.g:787:2: rule__ActivityDiagram__Group_6__1__Impl rule__ActivityDiagram__Group_6__2
            {
            pushFollow(FOLLOW_9);
            rule__ActivityDiagram__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivityDiagram__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityDiagram__Group_6__1"


    // $ANTLR start "rule__ActivityDiagram__Group_6__1__Impl"
    // InternalActivityDiagramDsl.g:794:1: rule__ActivityDiagram__Group_6__1__Impl : ( '{' ) ;
    public final void rule__ActivityDiagram__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:798:1: ( ( '{' ) )
            // InternalActivityDiagramDsl.g:799:1: ( '{' )
            {
            // InternalActivityDiagramDsl.g:799:1: ( '{' )
            // InternalActivityDiagramDsl.g:800:2: '{'
            {
             before(grammarAccess.getActivityDiagramAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getActivityDiagramAccess().getLeftCurlyBracketKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityDiagram__Group_6__1__Impl"


    // $ANTLR start "rule__ActivityDiagram__Group_6__2"
    // InternalActivityDiagramDsl.g:809:1: rule__ActivityDiagram__Group_6__2 : rule__ActivityDiagram__Group_6__2__Impl rule__ActivityDiagram__Group_6__3 ;
    public final void rule__ActivityDiagram__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:813:1: ( rule__ActivityDiagram__Group_6__2__Impl rule__ActivityDiagram__Group_6__3 )
            // InternalActivityDiagramDsl.g:814:2: rule__ActivityDiagram__Group_6__2__Impl rule__ActivityDiagram__Group_6__3
            {
            pushFollow(FOLLOW_10);
            rule__ActivityDiagram__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivityDiagram__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityDiagram__Group_6__2"


    // $ANTLR start "rule__ActivityDiagram__Group_6__2__Impl"
    // InternalActivityDiagramDsl.g:821:1: rule__ActivityDiagram__Group_6__2__Impl : ( ( rule__ActivityDiagram__TrasitionsAssignment_6_2 ) ) ;
    public final void rule__ActivityDiagram__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:825:1: ( ( ( rule__ActivityDiagram__TrasitionsAssignment_6_2 ) ) )
            // InternalActivityDiagramDsl.g:826:1: ( ( rule__ActivityDiagram__TrasitionsAssignment_6_2 ) )
            {
            // InternalActivityDiagramDsl.g:826:1: ( ( rule__ActivityDiagram__TrasitionsAssignment_6_2 ) )
            // InternalActivityDiagramDsl.g:827:2: ( rule__ActivityDiagram__TrasitionsAssignment_6_2 )
            {
             before(grammarAccess.getActivityDiagramAccess().getTrasitionsAssignment_6_2()); 
            // InternalActivityDiagramDsl.g:828:2: ( rule__ActivityDiagram__TrasitionsAssignment_6_2 )
            // InternalActivityDiagramDsl.g:828:3: rule__ActivityDiagram__TrasitionsAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__ActivityDiagram__TrasitionsAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getActivityDiagramAccess().getTrasitionsAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityDiagram__Group_6__2__Impl"


    // $ANTLR start "rule__ActivityDiagram__Group_6__3"
    // InternalActivityDiagramDsl.g:836:1: rule__ActivityDiagram__Group_6__3 : rule__ActivityDiagram__Group_6__3__Impl rule__ActivityDiagram__Group_6__4 ;
    public final void rule__ActivityDiagram__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:840:1: ( rule__ActivityDiagram__Group_6__3__Impl rule__ActivityDiagram__Group_6__4 )
            // InternalActivityDiagramDsl.g:841:2: rule__ActivityDiagram__Group_6__3__Impl rule__ActivityDiagram__Group_6__4
            {
            pushFollow(FOLLOW_10);
            rule__ActivityDiagram__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivityDiagram__Group_6__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityDiagram__Group_6__3"


    // $ANTLR start "rule__ActivityDiagram__Group_6__3__Impl"
    // InternalActivityDiagramDsl.g:848:1: rule__ActivityDiagram__Group_6__3__Impl : ( ( rule__ActivityDiagram__Group_6_3__0 )* ) ;
    public final void rule__ActivityDiagram__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:852:1: ( ( ( rule__ActivityDiagram__Group_6_3__0 )* ) )
            // InternalActivityDiagramDsl.g:853:1: ( ( rule__ActivityDiagram__Group_6_3__0 )* )
            {
            // InternalActivityDiagramDsl.g:853:1: ( ( rule__ActivityDiagram__Group_6_3__0 )* )
            // InternalActivityDiagramDsl.g:854:2: ( rule__ActivityDiagram__Group_6_3__0 )*
            {
             before(grammarAccess.getActivityDiagramAccess().getGroup_6_3()); 
            // InternalActivityDiagramDsl.g:855:2: ( rule__ActivityDiagram__Group_6_3__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==17) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalActivityDiagramDsl.g:855:3: rule__ActivityDiagram__Group_6_3__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__ActivityDiagram__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getActivityDiagramAccess().getGroup_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityDiagram__Group_6__3__Impl"


    // $ANTLR start "rule__ActivityDiagram__Group_6__4"
    // InternalActivityDiagramDsl.g:863:1: rule__ActivityDiagram__Group_6__4 : rule__ActivityDiagram__Group_6__4__Impl ;
    public final void rule__ActivityDiagram__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:867:1: ( rule__ActivityDiagram__Group_6__4__Impl )
            // InternalActivityDiagramDsl.g:868:2: rule__ActivityDiagram__Group_6__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ActivityDiagram__Group_6__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityDiagram__Group_6__4"


    // $ANTLR start "rule__ActivityDiagram__Group_6__4__Impl"
    // InternalActivityDiagramDsl.g:874:1: rule__ActivityDiagram__Group_6__4__Impl : ( '}' ) ;
    public final void rule__ActivityDiagram__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:878:1: ( ( '}' ) )
            // InternalActivityDiagramDsl.g:879:1: ( '}' )
            {
            // InternalActivityDiagramDsl.g:879:1: ( '}' )
            // InternalActivityDiagramDsl.g:880:2: '}'
            {
             before(grammarAccess.getActivityDiagramAccess().getRightCurlyBracketKeyword_6_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getActivityDiagramAccess().getRightCurlyBracketKeyword_6_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityDiagram__Group_6__4__Impl"


    // $ANTLR start "rule__ActivityDiagram__Group_6_3__0"
    // InternalActivityDiagramDsl.g:890:1: rule__ActivityDiagram__Group_6_3__0 : rule__ActivityDiagram__Group_6_3__0__Impl rule__ActivityDiagram__Group_6_3__1 ;
    public final void rule__ActivityDiagram__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:894:1: ( rule__ActivityDiagram__Group_6_3__0__Impl rule__ActivityDiagram__Group_6_3__1 )
            // InternalActivityDiagramDsl.g:895:2: rule__ActivityDiagram__Group_6_3__0__Impl rule__ActivityDiagram__Group_6_3__1
            {
            pushFollow(FOLLOW_9);
            rule__ActivityDiagram__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivityDiagram__Group_6_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityDiagram__Group_6_3__0"


    // $ANTLR start "rule__ActivityDiagram__Group_6_3__0__Impl"
    // InternalActivityDiagramDsl.g:902:1: rule__ActivityDiagram__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__ActivityDiagram__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:906:1: ( ( ',' ) )
            // InternalActivityDiagramDsl.g:907:1: ( ',' )
            {
            // InternalActivityDiagramDsl.g:907:1: ( ',' )
            // InternalActivityDiagramDsl.g:908:2: ','
            {
             before(grammarAccess.getActivityDiagramAccess().getCommaKeyword_6_3_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getActivityDiagramAccess().getCommaKeyword_6_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityDiagram__Group_6_3__0__Impl"


    // $ANTLR start "rule__ActivityDiagram__Group_6_3__1"
    // InternalActivityDiagramDsl.g:917:1: rule__ActivityDiagram__Group_6_3__1 : rule__ActivityDiagram__Group_6_3__1__Impl ;
    public final void rule__ActivityDiagram__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:921:1: ( rule__ActivityDiagram__Group_6_3__1__Impl )
            // InternalActivityDiagramDsl.g:922:2: rule__ActivityDiagram__Group_6_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ActivityDiagram__Group_6_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityDiagram__Group_6_3__1"


    // $ANTLR start "rule__ActivityDiagram__Group_6_3__1__Impl"
    // InternalActivityDiagramDsl.g:928:1: rule__ActivityDiagram__Group_6_3__1__Impl : ( ( rule__ActivityDiagram__TrasitionsAssignment_6_3_1 ) ) ;
    public final void rule__ActivityDiagram__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:932:1: ( ( ( rule__ActivityDiagram__TrasitionsAssignment_6_3_1 ) ) )
            // InternalActivityDiagramDsl.g:933:1: ( ( rule__ActivityDiagram__TrasitionsAssignment_6_3_1 ) )
            {
            // InternalActivityDiagramDsl.g:933:1: ( ( rule__ActivityDiagram__TrasitionsAssignment_6_3_1 ) )
            // InternalActivityDiagramDsl.g:934:2: ( rule__ActivityDiagram__TrasitionsAssignment_6_3_1 )
            {
             before(grammarAccess.getActivityDiagramAccess().getTrasitionsAssignment_6_3_1()); 
            // InternalActivityDiagramDsl.g:935:2: ( rule__ActivityDiagram__TrasitionsAssignment_6_3_1 )
            // InternalActivityDiagramDsl.g:935:3: rule__ActivityDiagram__TrasitionsAssignment_6_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ActivityDiagram__TrasitionsAssignment_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getActivityDiagramAccess().getTrasitionsAssignment_6_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityDiagram__Group_6_3__1__Impl"


    // $ANTLR start "rule__ActivityDiagram__Group_7__0"
    // InternalActivityDiagramDsl.g:944:1: rule__ActivityDiagram__Group_7__0 : rule__ActivityDiagram__Group_7__0__Impl rule__ActivityDiagram__Group_7__1 ;
    public final void rule__ActivityDiagram__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:948:1: ( rule__ActivityDiagram__Group_7__0__Impl rule__ActivityDiagram__Group_7__1 )
            // InternalActivityDiagramDsl.g:949:2: rule__ActivityDiagram__Group_7__0__Impl rule__ActivityDiagram__Group_7__1
            {
            pushFollow(FOLLOW_5);
            rule__ActivityDiagram__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivityDiagram__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityDiagram__Group_7__0"


    // $ANTLR start "rule__ActivityDiagram__Group_7__0__Impl"
    // InternalActivityDiagramDsl.g:956:1: rule__ActivityDiagram__Group_7__0__Impl : ( 'activityNodes' ) ;
    public final void rule__ActivityDiagram__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:960:1: ( ( 'activityNodes' ) )
            // InternalActivityDiagramDsl.g:961:1: ( 'activityNodes' )
            {
            // InternalActivityDiagramDsl.g:961:1: ( 'activityNodes' )
            // InternalActivityDiagramDsl.g:962:2: 'activityNodes'
            {
             before(grammarAccess.getActivityDiagramAccess().getActivityNodesKeyword_7_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getActivityDiagramAccess().getActivityNodesKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityDiagram__Group_7__0__Impl"


    // $ANTLR start "rule__ActivityDiagram__Group_7__1"
    // InternalActivityDiagramDsl.g:971:1: rule__ActivityDiagram__Group_7__1 : rule__ActivityDiagram__Group_7__1__Impl rule__ActivityDiagram__Group_7__2 ;
    public final void rule__ActivityDiagram__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:975:1: ( rule__ActivityDiagram__Group_7__1__Impl rule__ActivityDiagram__Group_7__2 )
            // InternalActivityDiagramDsl.g:976:2: rule__ActivityDiagram__Group_7__1__Impl rule__ActivityDiagram__Group_7__2
            {
            pushFollow(FOLLOW_12);
            rule__ActivityDiagram__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivityDiagram__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityDiagram__Group_7__1"


    // $ANTLR start "rule__ActivityDiagram__Group_7__1__Impl"
    // InternalActivityDiagramDsl.g:983:1: rule__ActivityDiagram__Group_7__1__Impl : ( '{' ) ;
    public final void rule__ActivityDiagram__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:987:1: ( ( '{' ) )
            // InternalActivityDiagramDsl.g:988:1: ( '{' )
            {
            // InternalActivityDiagramDsl.g:988:1: ( '{' )
            // InternalActivityDiagramDsl.g:989:2: '{'
            {
             before(grammarAccess.getActivityDiagramAccess().getLeftCurlyBracketKeyword_7_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getActivityDiagramAccess().getLeftCurlyBracketKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityDiagram__Group_7__1__Impl"


    // $ANTLR start "rule__ActivityDiagram__Group_7__2"
    // InternalActivityDiagramDsl.g:998:1: rule__ActivityDiagram__Group_7__2 : rule__ActivityDiagram__Group_7__2__Impl rule__ActivityDiagram__Group_7__3 ;
    public final void rule__ActivityDiagram__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:1002:1: ( rule__ActivityDiagram__Group_7__2__Impl rule__ActivityDiagram__Group_7__3 )
            // InternalActivityDiagramDsl.g:1003:2: rule__ActivityDiagram__Group_7__2__Impl rule__ActivityDiagram__Group_7__3
            {
            pushFollow(FOLLOW_10);
            rule__ActivityDiagram__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivityDiagram__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityDiagram__Group_7__2"


    // $ANTLR start "rule__ActivityDiagram__Group_7__2__Impl"
    // InternalActivityDiagramDsl.g:1010:1: rule__ActivityDiagram__Group_7__2__Impl : ( ( rule__ActivityDiagram__ActivityNodesAssignment_7_2 ) ) ;
    public final void rule__ActivityDiagram__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:1014:1: ( ( ( rule__ActivityDiagram__ActivityNodesAssignment_7_2 ) ) )
            // InternalActivityDiagramDsl.g:1015:1: ( ( rule__ActivityDiagram__ActivityNodesAssignment_7_2 ) )
            {
            // InternalActivityDiagramDsl.g:1015:1: ( ( rule__ActivityDiagram__ActivityNodesAssignment_7_2 ) )
            // InternalActivityDiagramDsl.g:1016:2: ( rule__ActivityDiagram__ActivityNodesAssignment_7_2 )
            {
             before(grammarAccess.getActivityDiagramAccess().getActivityNodesAssignment_7_2()); 
            // InternalActivityDiagramDsl.g:1017:2: ( rule__ActivityDiagram__ActivityNodesAssignment_7_2 )
            // InternalActivityDiagramDsl.g:1017:3: rule__ActivityDiagram__ActivityNodesAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__ActivityDiagram__ActivityNodesAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getActivityDiagramAccess().getActivityNodesAssignment_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityDiagram__Group_7__2__Impl"


    // $ANTLR start "rule__ActivityDiagram__Group_7__3"
    // InternalActivityDiagramDsl.g:1025:1: rule__ActivityDiagram__Group_7__3 : rule__ActivityDiagram__Group_7__3__Impl rule__ActivityDiagram__Group_7__4 ;
    public final void rule__ActivityDiagram__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:1029:1: ( rule__ActivityDiagram__Group_7__3__Impl rule__ActivityDiagram__Group_7__4 )
            // InternalActivityDiagramDsl.g:1030:2: rule__ActivityDiagram__Group_7__3__Impl rule__ActivityDiagram__Group_7__4
            {
            pushFollow(FOLLOW_10);
            rule__ActivityDiagram__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivityDiagram__Group_7__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityDiagram__Group_7__3"


    // $ANTLR start "rule__ActivityDiagram__Group_7__3__Impl"
    // InternalActivityDiagramDsl.g:1037:1: rule__ActivityDiagram__Group_7__3__Impl : ( ( rule__ActivityDiagram__Group_7_3__0 )* ) ;
    public final void rule__ActivityDiagram__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:1041:1: ( ( ( rule__ActivityDiagram__Group_7_3__0 )* ) )
            // InternalActivityDiagramDsl.g:1042:1: ( ( rule__ActivityDiagram__Group_7_3__0 )* )
            {
            // InternalActivityDiagramDsl.g:1042:1: ( ( rule__ActivityDiagram__Group_7_3__0 )* )
            // InternalActivityDiagramDsl.g:1043:2: ( rule__ActivityDiagram__Group_7_3__0 )*
            {
             before(grammarAccess.getActivityDiagramAccess().getGroup_7_3()); 
            // InternalActivityDiagramDsl.g:1044:2: ( rule__ActivityDiagram__Group_7_3__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==17) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalActivityDiagramDsl.g:1044:3: rule__ActivityDiagram__Group_7_3__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__ActivityDiagram__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getActivityDiagramAccess().getGroup_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityDiagram__Group_7__3__Impl"


    // $ANTLR start "rule__ActivityDiagram__Group_7__4"
    // InternalActivityDiagramDsl.g:1052:1: rule__ActivityDiagram__Group_7__4 : rule__ActivityDiagram__Group_7__4__Impl ;
    public final void rule__ActivityDiagram__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:1056:1: ( rule__ActivityDiagram__Group_7__4__Impl )
            // InternalActivityDiagramDsl.g:1057:2: rule__ActivityDiagram__Group_7__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ActivityDiagram__Group_7__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityDiagram__Group_7__4"


    // $ANTLR start "rule__ActivityDiagram__Group_7__4__Impl"
    // InternalActivityDiagramDsl.g:1063:1: rule__ActivityDiagram__Group_7__4__Impl : ( '}' ) ;
    public final void rule__ActivityDiagram__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:1067:1: ( ( '}' ) )
            // InternalActivityDiagramDsl.g:1068:1: ( '}' )
            {
            // InternalActivityDiagramDsl.g:1068:1: ( '}' )
            // InternalActivityDiagramDsl.g:1069:2: '}'
            {
             before(grammarAccess.getActivityDiagramAccess().getRightCurlyBracketKeyword_7_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getActivityDiagramAccess().getRightCurlyBracketKeyword_7_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityDiagram__Group_7__4__Impl"


    // $ANTLR start "rule__ActivityDiagram__Group_7_3__0"
    // InternalActivityDiagramDsl.g:1079:1: rule__ActivityDiagram__Group_7_3__0 : rule__ActivityDiagram__Group_7_3__0__Impl rule__ActivityDiagram__Group_7_3__1 ;
    public final void rule__ActivityDiagram__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:1083:1: ( rule__ActivityDiagram__Group_7_3__0__Impl rule__ActivityDiagram__Group_7_3__1 )
            // InternalActivityDiagramDsl.g:1084:2: rule__ActivityDiagram__Group_7_3__0__Impl rule__ActivityDiagram__Group_7_3__1
            {
            pushFollow(FOLLOW_12);
            rule__ActivityDiagram__Group_7_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivityDiagram__Group_7_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityDiagram__Group_7_3__0"


    // $ANTLR start "rule__ActivityDiagram__Group_7_3__0__Impl"
    // InternalActivityDiagramDsl.g:1091:1: rule__ActivityDiagram__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__ActivityDiagram__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:1095:1: ( ( ',' ) )
            // InternalActivityDiagramDsl.g:1096:1: ( ',' )
            {
            // InternalActivityDiagramDsl.g:1096:1: ( ',' )
            // InternalActivityDiagramDsl.g:1097:2: ','
            {
             before(grammarAccess.getActivityDiagramAccess().getCommaKeyword_7_3_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getActivityDiagramAccess().getCommaKeyword_7_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityDiagram__Group_7_3__0__Impl"


    // $ANTLR start "rule__ActivityDiagram__Group_7_3__1"
    // InternalActivityDiagramDsl.g:1106:1: rule__ActivityDiagram__Group_7_3__1 : rule__ActivityDiagram__Group_7_3__1__Impl ;
    public final void rule__ActivityDiagram__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:1110:1: ( rule__ActivityDiagram__Group_7_3__1__Impl )
            // InternalActivityDiagramDsl.g:1111:2: rule__ActivityDiagram__Group_7_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ActivityDiagram__Group_7_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityDiagram__Group_7_3__1"


    // $ANTLR start "rule__ActivityDiagram__Group_7_3__1__Impl"
    // InternalActivityDiagramDsl.g:1117:1: rule__ActivityDiagram__Group_7_3__1__Impl : ( ( rule__ActivityDiagram__ActivityNodesAssignment_7_3_1 ) ) ;
    public final void rule__ActivityDiagram__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:1121:1: ( ( ( rule__ActivityDiagram__ActivityNodesAssignment_7_3_1 ) ) )
            // InternalActivityDiagramDsl.g:1122:1: ( ( rule__ActivityDiagram__ActivityNodesAssignment_7_3_1 ) )
            {
            // InternalActivityDiagramDsl.g:1122:1: ( ( rule__ActivityDiagram__ActivityNodesAssignment_7_3_1 ) )
            // InternalActivityDiagramDsl.g:1123:2: ( rule__ActivityDiagram__ActivityNodesAssignment_7_3_1 )
            {
             before(grammarAccess.getActivityDiagramAccess().getActivityNodesAssignment_7_3_1()); 
            // InternalActivityDiagramDsl.g:1124:2: ( rule__ActivityDiagram__ActivityNodesAssignment_7_3_1 )
            // InternalActivityDiagramDsl.g:1124:3: rule__ActivityDiagram__ActivityNodesAssignment_7_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ActivityDiagram__ActivityNodesAssignment_7_3_1();

            state._fsp--;


            }

             after(grammarAccess.getActivityDiagramAccess().getActivityNodesAssignment_7_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityDiagram__Group_7_3__1__Impl"


    // $ANTLR start "rule__ActivityDiagram__Group_8__0"
    // InternalActivityDiagramDsl.g:1133:1: rule__ActivityDiagram__Group_8__0 : rule__ActivityDiagram__Group_8__0__Impl rule__ActivityDiagram__Group_8__1 ;
    public final void rule__ActivityDiagram__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:1137:1: ( rule__ActivityDiagram__Group_8__0__Impl rule__ActivityDiagram__Group_8__1 )
            // InternalActivityDiagramDsl.g:1138:2: rule__ActivityDiagram__Group_8__0__Impl rule__ActivityDiagram__Group_8__1
            {
            pushFollow(FOLLOW_5);
            rule__ActivityDiagram__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivityDiagram__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityDiagram__Group_8__0"


    // $ANTLR start "rule__ActivityDiagram__Group_8__0__Impl"
    // InternalActivityDiagramDsl.g:1145:1: rule__ActivityDiagram__Group_8__0__Impl : ( 'forkNodes' ) ;
    public final void rule__ActivityDiagram__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:1149:1: ( ( 'forkNodes' ) )
            // InternalActivityDiagramDsl.g:1150:1: ( 'forkNodes' )
            {
            // InternalActivityDiagramDsl.g:1150:1: ( 'forkNodes' )
            // InternalActivityDiagramDsl.g:1151:2: 'forkNodes'
            {
             before(grammarAccess.getActivityDiagramAccess().getForkNodesKeyword_8_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getActivityDiagramAccess().getForkNodesKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityDiagram__Group_8__0__Impl"


    // $ANTLR start "rule__ActivityDiagram__Group_8__1"
    // InternalActivityDiagramDsl.g:1160:1: rule__ActivityDiagram__Group_8__1 : rule__ActivityDiagram__Group_8__1__Impl rule__ActivityDiagram__Group_8__2 ;
    public final void rule__ActivityDiagram__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:1164:1: ( rule__ActivityDiagram__Group_8__1__Impl rule__ActivityDiagram__Group_8__2 )
            // InternalActivityDiagramDsl.g:1165:2: rule__ActivityDiagram__Group_8__1__Impl rule__ActivityDiagram__Group_8__2
            {
            pushFollow(FOLLOW_13);
            rule__ActivityDiagram__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivityDiagram__Group_8__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityDiagram__Group_8__1"


    // $ANTLR start "rule__ActivityDiagram__Group_8__1__Impl"
    // InternalActivityDiagramDsl.g:1172:1: rule__ActivityDiagram__Group_8__1__Impl : ( '{' ) ;
    public final void rule__ActivityDiagram__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:1176:1: ( ( '{' ) )
            // InternalActivityDiagramDsl.g:1177:1: ( '{' )
            {
            // InternalActivityDiagramDsl.g:1177:1: ( '{' )
            // InternalActivityDiagramDsl.g:1178:2: '{'
            {
             before(grammarAccess.getActivityDiagramAccess().getLeftCurlyBracketKeyword_8_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getActivityDiagramAccess().getLeftCurlyBracketKeyword_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityDiagram__Group_8__1__Impl"


    // $ANTLR start "rule__ActivityDiagram__Group_8__2"
    // InternalActivityDiagramDsl.g:1187:1: rule__ActivityDiagram__Group_8__2 : rule__ActivityDiagram__Group_8__2__Impl rule__ActivityDiagram__Group_8__3 ;
    public final void rule__ActivityDiagram__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:1191:1: ( rule__ActivityDiagram__Group_8__2__Impl rule__ActivityDiagram__Group_8__3 )
            // InternalActivityDiagramDsl.g:1192:2: rule__ActivityDiagram__Group_8__2__Impl rule__ActivityDiagram__Group_8__3
            {
            pushFollow(FOLLOW_10);
            rule__ActivityDiagram__Group_8__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivityDiagram__Group_8__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityDiagram__Group_8__2"


    // $ANTLR start "rule__ActivityDiagram__Group_8__2__Impl"
    // InternalActivityDiagramDsl.g:1199:1: rule__ActivityDiagram__Group_8__2__Impl : ( ( rule__ActivityDiagram__ForkNodesAssignment_8_2 ) ) ;
    public final void rule__ActivityDiagram__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:1203:1: ( ( ( rule__ActivityDiagram__ForkNodesAssignment_8_2 ) ) )
            // InternalActivityDiagramDsl.g:1204:1: ( ( rule__ActivityDiagram__ForkNodesAssignment_8_2 ) )
            {
            // InternalActivityDiagramDsl.g:1204:1: ( ( rule__ActivityDiagram__ForkNodesAssignment_8_2 ) )
            // InternalActivityDiagramDsl.g:1205:2: ( rule__ActivityDiagram__ForkNodesAssignment_8_2 )
            {
             before(grammarAccess.getActivityDiagramAccess().getForkNodesAssignment_8_2()); 
            // InternalActivityDiagramDsl.g:1206:2: ( rule__ActivityDiagram__ForkNodesAssignment_8_2 )
            // InternalActivityDiagramDsl.g:1206:3: rule__ActivityDiagram__ForkNodesAssignment_8_2
            {
            pushFollow(FOLLOW_2);
            rule__ActivityDiagram__ForkNodesAssignment_8_2();

            state._fsp--;


            }

             after(grammarAccess.getActivityDiagramAccess().getForkNodesAssignment_8_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityDiagram__Group_8__2__Impl"


    // $ANTLR start "rule__ActivityDiagram__Group_8__3"
    // InternalActivityDiagramDsl.g:1214:1: rule__ActivityDiagram__Group_8__3 : rule__ActivityDiagram__Group_8__3__Impl rule__ActivityDiagram__Group_8__4 ;
    public final void rule__ActivityDiagram__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:1218:1: ( rule__ActivityDiagram__Group_8__3__Impl rule__ActivityDiagram__Group_8__4 )
            // InternalActivityDiagramDsl.g:1219:2: rule__ActivityDiagram__Group_8__3__Impl rule__ActivityDiagram__Group_8__4
            {
            pushFollow(FOLLOW_10);
            rule__ActivityDiagram__Group_8__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivityDiagram__Group_8__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityDiagram__Group_8__3"


    // $ANTLR start "rule__ActivityDiagram__Group_8__3__Impl"
    // InternalActivityDiagramDsl.g:1226:1: rule__ActivityDiagram__Group_8__3__Impl : ( ( rule__ActivityDiagram__Group_8_3__0 )* ) ;
    public final void rule__ActivityDiagram__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:1230:1: ( ( ( rule__ActivityDiagram__Group_8_3__0 )* ) )
            // InternalActivityDiagramDsl.g:1231:1: ( ( rule__ActivityDiagram__Group_8_3__0 )* )
            {
            // InternalActivityDiagramDsl.g:1231:1: ( ( rule__ActivityDiagram__Group_8_3__0 )* )
            // InternalActivityDiagramDsl.g:1232:2: ( rule__ActivityDiagram__Group_8_3__0 )*
            {
             before(grammarAccess.getActivityDiagramAccess().getGroup_8_3()); 
            // InternalActivityDiagramDsl.g:1233:2: ( rule__ActivityDiagram__Group_8_3__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==17) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalActivityDiagramDsl.g:1233:3: rule__ActivityDiagram__Group_8_3__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__ActivityDiagram__Group_8_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getActivityDiagramAccess().getGroup_8_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityDiagram__Group_8__3__Impl"


    // $ANTLR start "rule__ActivityDiagram__Group_8__4"
    // InternalActivityDiagramDsl.g:1241:1: rule__ActivityDiagram__Group_8__4 : rule__ActivityDiagram__Group_8__4__Impl ;
    public final void rule__ActivityDiagram__Group_8__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:1245:1: ( rule__ActivityDiagram__Group_8__4__Impl )
            // InternalActivityDiagramDsl.g:1246:2: rule__ActivityDiagram__Group_8__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ActivityDiagram__Group_8__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityDiagram__Group_8__4"


    // $ANTLR start "rule__ActivityDiagram__Group_8__4__Impl"
    // InternalActivityDiagramDsl.g:1252:1: rule__ActivityDiagram__Group_8__4__Impl : ( '}' ) ;
    public final void rule__ActivityDiagram__Group_8__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:1256:1: ( ( '}' ) )
            // InternalActivityDiagramDsl.g:1257:1: ( '}' )
            {
            // InternalActivityDiagramDsl.g:1257:1: ( '}' )
            // InternalActivityDiagramDsl.g:1258:2: '}'
            {
             before(grammarAccess.getActivityDiagramAccess().getRightCurlyBracketKeyword_8_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getActivityDiagramAccess().getRightCurlyBracketKeyword_8_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityDiagram__Group_8__4__Impl"


    // $ANTLR start "rule__ActivityDiagram__Group_8_3__0"
    // InternalActivityDiagramDsl.g:1268:1: rule__ActivityDiagram__Group_8_3__0 : rule__ActivityDiagram__Group_8_3__0__Impl rule__ActivityDiagram__Group_8_3__1 ;
    public final void rule__ActivityDiagram__Group_8_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:1272:1: ( rule__ActivityDiagram__Group_8_3__0__Impl rule__ActivityDiagram__Group_8_3__1 )
            // InternalActivityDiagramDsl.g:1273:2: rule__ActivityDiagram__Group_8_3__0__Impl rule__ActivityDiagram__Group_8_3__1
            {
            pushFollow(FOLLOW_13);
            rule__ActivityDiagram__Group_8_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivityDiagram__Group_8_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityDiagram__Group_8_3__0"


    // $ANTLR start "rule__ActivityDiagram__Group_8_3__0__Impl"
    // InternalActivityDiagramDsl.g:1280:1: rule__ActivityDiagram__Group_8_3__0__Impl : ( ',' ) ;
    public final void rule__ActivityDiagram__Group_8_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:1284:1: ( ( ',' ) )
            // InternalActivityDiagramDsl.g:1285:1: ( ',' )
            {
            // InternalActivityDiagramDsl.g:1285:1: ( ',' )
            // InternalActivityDiagramDsl.g:1286:2: ','
            {
             before(grammarAccess.getActivityDiagramAccess().getCommaKeyword_8_3_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getActivityDiagramAccess().getCommaKeyword_8_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityDiagram__Group_8_3__0__Impl"


    // $ANTLR start "rule__ActivityDiagram__Group_8_3__1"
    // InternalActivityDiagramDsl.g:1295:1: rule__ActivityDiagram__Group_8_3__1 : rule__ActivityDiagram__Group_8_3__1__Impl ;
    public final void rule__ActivityDiagram__Group_8_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:1299:1: ( rule__ActivityDiagram__Group_8_3__1__Impl )
            // InternalActivityDiagramDsl.g:1300:2: rule__ActivityDiagram__Group_8_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ActivityDiagram__Group_8_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityDiagram__Group_8_3__1"


    // $ANTLR start "rule__ActivityDiagram__Group_8_3__1__Impl"
    // InternalActivityDiagramDsl.g:1306:1: rule__ActivityDiagram__Group_8_3__1__Impl : ( ( rule__ActivityDiagram__ForkNodesAssignment_8_3_1 ) ) ;
    public final void rule__ActivityDiagram__Group_8_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:1310:1: ( ( ( rule__ActivityDiagram__ForkNodesAssignment_8_3_1 ) ) )
            // InternalActivityDiagramDsl.g:1311:1: ( ( rule__ActivityDiagram__ForkNodesAssignment_8_3_1 ) )
            {
            // InternalActivityDiagramDsl.g:1311:1: ( ( rule__ActivityDiagram__ForkNodesAssignment_8_3_1 ) )
            // InternalActivityDiagramDsl.g:1312:2: ( rule__ActivityDiagram__ForkNodesAssignment_8_3_1 )
            {
             before(grammarAccess.getActivityDiagramAccess().getForkNodesAssignment_8_3_1()); 
            // InternalActivityDiagramDsl.g:1313:2: ( rule__ActivityDiagram__ForkNodesAssignment_8_3_1 )
            // InternalActivityDiagramDsl.g:1313:3: rule__ActivityDiagram__ForkNodesAssignment_8_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ActivityDiagram__ForkNodesAssignment_8_3_1();

            state._fsp--;


            }

             after(grammarAccess.getActivityDiagramAccess().getForkNodesAssignment_8_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityDiagram__Group_8_3__1__Impl"


    // $ANTLR start "rule__ActivityDiagram__Group_9__0"
    // InternalActivityDiagramDsl.g:1322:1: rule__ActivityDiagram__Group_9__0 : rule__ActivityDiagram__Group_9__0__Impl rule__ActivityDiagram__Group_9__1 ;
    public final void rule__ActivityDiagram__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:1326:1: ( rule__ActivityDiagram__Group_9__0__Impl rule__ActivityDiagram__Group_9__1 )
            // InternalActivityDiagramDsl.g:1327:2: rule__ActivityDiagram__Group_9__0__Impl rule__ActivityDiagram__Group_9__1
            {
            pushFollow(FOLLOW_5);
            rule__ActivityDiagram__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivityDiagram__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityDiagram__Group_9__0"


    // $ANTLR start "rule__ActivityDiagram__Group_9__0__Impl"
    // InternalActivityDiagramDsl.g:1334:1: rule__ActivityDiagram__Group_9__0__Impl : ( 'joinNodes' ) ;
    public final void rule__ActivityDiagram__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:1338:1: ( ( 'joinNodes' ) )
            // InternalActivityDiagramDsl.g:1339:1: ( 'joinNodes' )
            {
            // InternalActivityDiagramDsl.g:1339:1: ( 'joinNodes' )
            // InternalActivityDiagramDsl.g:1340:2: 'joinNodes'
            {
             before(grammarAccess.getActivityDiagramAccess().getJoinNodesKeyword_9_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getActivityDiagramAccess().getJoinNodesKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityDiagram__Group_9__0__Impl"


    // $ANTLR start "rule__ActivityDiagram__Group_9__1"
    // InternalActivityDiagramDsl.g:1349:1: rule__ActivityDiagram__Group_9__1 : rule__ActivityDiagram__Group_9__1__Impl rule__ActivityDiagram__Group_9__2 ;
    public final void rule__ActivityDiagram__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:1353:1: ( rule__ActivityDiagram__Group_9__1__Impl rule__ActivityDiagram__Group_9__2 )
            // InternalActivityDiagramDsl.g:1354:2: rule__ActivityDiagram__Group_9__1__Impl rule__ActivityDiagram__Group_9__2
            {
            pushFollow(FOLLOW_14);
            rule__ActivityDiagram__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivityDiagram__Group_9__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityDiagram__Group_9__1"


    // $ANTLR start "rule__ActivityDiagram__Group_9__1__Impl"
    // InternalActivityDiagramDsl.g:1361:1: rule__ActivityDiagram__Group_9__1__Impl : ( '{' ) ;
    public final void rule__ActivityDiagram__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:1365:1: ( ( '{' ) )
            // InternalActivityDiagramDsl.g:1366:1: ( '{' )
            {
            // InternalActivityDiagramDsl.g:1366:1: ( '{' )
            // InternalActivityDiagramDsl.g:1367:2: '{'
            {
             before(grammarAccess.getActivityDiagramAccess().getLeftCurlyBracketKeyword_9_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getActivityDiagramAccess().getLeftCurlyBracketKeyword_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityDiagram__Group_9__1__Impl"


    // $ANTLR start "rule__ActivityDiagram__Group_9__2"
    // InternalActivityDiagramDsl.g:1376:1: rule__ActivityDiagram__Group_9__2 : rule__ActivityDiagram__Group_9__2__Impl rule__ActivityDiagram__Group_9__3 ;
    public final void rule__ActivityDiagram__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:1380:1: ( rule__ActivityDiagram__Group_9__2__Impl rule__ActivityDiagram__Group_9__3 )
            // InternalActivityDiagramDsl.g:1381:2: rule__ActivityDiagram__Group_9__2__Impl rule__ActivityDiagram__Group_9__3
            {
            pushFollow(FOLLOW_10);
            rule__ActivityDiagram__Group_9__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivityDiagram__Group_9__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityDiagram__Group_9__2"


    // $ANTLR start "rule__ActivityDiagram__Group_9__2__Impl"
    // InternalActivityDiagramDsl.g:1388:1: rule__ActivityDiagram__Group_9__2__Impl : ( ( rule__ActivityDiagram__JoinNodesAssignment_9_2 ) ) ;
    public final void rule__ActivityDiagram__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:1392:1: ( ( ( rule__ActivityDiagram__JoinNodesAssignment_9_2 ) ) )
            // InternalActivityDiagramDsl.g:1393:1: ( ( rule__ActivityDiagram__JoinNodesAssignment_9_2 ) )
            {
            // InternalActivityDiagramDsl.g:1393:1: ( ( rule__ActivityDiagram__JoinNodesAssignment_9_2 ) )
            // InternalActivityDiagramDsl.g:1394:2: ( rule__ActivityDiagram__JoinNodesAssignment_9_2 )
            {
             before(grammarAccess.getActivityDiagramAccess().getJoinNodesAssignment_9_2()); 
            // InternalActivityDiagramDsl.g:1395:2: ( rule__ActivityDiagram__JoinNodesAssignment_9_2 )
            // InternalActivityDiagramDsl.g:1395:3: rule__ActivityDiagram__JoinNodesAssignment_9_2
            {
            pushFollow(FOLLOW_2);
            rule__ActivityDiagram__JoinNodesAssignment_9_2();

            state._fsp--;


            }

             after(grammarAccess.getActivityDiagramAccess().getJoinNodesAssignment_9_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityDiagram__Group_9__2__Impl"


    // $ANTLR start "rule__ActivityDiagram__Group_9__3"
    // InternalActivityDiagramDsl.g:1403:1: rule__ActivityDiagram__Group_9__3 : rule__ActivityDiagram__Group_9__3__Impl rule__ActivityDiagram__Group_9__4 ;
    public final void rule__ActivityDiagram__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:1407:1: ( rule__ActivityDiagram__Group_9__3__Impl rule__ActivityDiagram__Group_9__4 )
            // InternalActivityDiagramDsl.g:1408:2: rule__ActivityDiagram__Group_9__3__Impl rule__ActivityDiagram__Group_9__4
            {
            pushFollow(FOLLOW_10);
            rule__ActivityDiagram__Group_9__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivityDiagram__Group_9__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityDiagram__Group_9__3"


    // $ANTLR start "rule__ActivityDiagram__Group_9__3__Impl"
    // InternalActivityDiagramDsl.g:1415:1: rule__ActivityDiagram__Group_9__3__Impl : ( ( rule__ActivityDiagram__Group_9_3__0 )* ) ;
    public final void rule__ActivityDiagram__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:1419:1: ( ( ( rule__ActivityDiagram__Group_9_3__0 )* ) )
            // InternalActivityDiagramDsl.g:1420:1: ( ( rule__ActivityDiagram__Group_9_3__0 )* )
            {
            // InternalActivityDiagramDsl.g:1420:1: ( ( rule__ActivityDiagram__Group_9_3__0 )* )
            // InternalActivityDiagramDsl.g:1421:2: ( rule__ActivityDiagram__Group_9_3__0 )*
            {
             before(grammarAccess.getActivityDiagramAccess().getGroup_9_3()); 
            // InternalActivityDiagramDsl.g:1422:2: ( rule__ActivityDiagram__Group_9_3__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==17) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalActivityDiagramDsl.g:1422:3: rule__ActivityDiagram__Group_9_3__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__ActivityDiagram__Group_9_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getActivityDiagramAccess().getGroup_9_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityDiagram__Group_9__3__Impl"


    // $ANTLR start "rule__ActivityDiagram__Group_9__4"
    // InternalActivityDiagramDsl.g:1430:1: rule__ActivityDiagram__Group_9__4 : rule__ActivityDiagram__Group_9__4__Impl ;
    public final void rule__ActivityDiagram__Group_9__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:1434:1: ( rule__ActivityDiagram__Group_9__4__Impl )
            // InternalActivityDiagramDsl.g:1435:2: rule__ActivityDiagram__Group_9__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ActivityDiagram__Group_9__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityDiagram__Group_9__4"


    // $ANTLR start "rule__ActivityDiagram__Group_9__4__Impl"
    // InternalActivityDiagramDsl.g:1441:1: rule__ActivityDiagram__Group_9__4__Impl : ( '}' ) ;
    public final void rule__ActivityDiagram__Group_9__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:1445:1: ( ( '}' ) )
            // InternalActivityDiagramDsl.g:1446:1: ( '}' )
            {
            // InternalActivityDiagramDsl.g:1446:1: ( '}' )
            // InternalActivityDiagramDsl.g:1447:2: '}'
            {
             before(grammarAccess.getActivityDiagramAccess().getRightCurlyBracketKeyword_9_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getActivityDiagramAccess().getRightCurlyBracketKeyword_9_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityDiagram__Group_9__4__Impl"


    // $ANTLR start "rule__ActivityDiagram__Group_9_3__0"
    // InternalActivityDiagramDsl.g:1457:1: rule__ActivityDiagram__Group_9_3__0 : rule__ActivityDiagram__Group_9_3__0__Impl rule__ActivityDiagram__Group_9_3__1 ;
    public final void rule__ActivityDiagram__Group_9_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:1461:1: ( rule__ActivityDiagram__Group_9_3__0__Impl rule__ActivityDiagram__Group_9_3__1 )
            // InternalActivityDiagramDsl.g:1462:2: rule__ActivityDiagram__Group_9_3__0__Impl rule__ActivityDiagram__Group_9_3__1
            {
            pushFollow(FOLLOW_14);
            rule__ActivityDiagram__Group_9_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivityDiagram__Group_9_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityDiagram__Group_9_3__0"


    // $ANTLR start "rule__ActivityDiagram__Group_9_3__0__Impl"
    // InternalActivityDiagramDsl.g:1469:1: rule__ActivityDiagram__Group_9_3__0__Impl : ( ',' ) ;
    public final void rule__ActivityDiagram__Group_9_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:1473:1: ( ( ',' ) )
            // InternalActivityDiagramDsl.g:1474:1: ( ',' )
            {
            // InternalActivityDiagramDsl.g:1474:1: ( ',' )
            // InternalActivityDiagramDsl.g:1475:2: ','
            {
             before(grammarAccess.getActivityDiagramAccess().getCommaKeyword_9_3_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getActivityDiagramAccess().getCommaKeyword_9_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityDiagram__Group_9_3__0__Impl"


    // $ANTLR start "rule__ActivityDiagram__Group_9_3__1"
    // InternalActivityDiagramDsl.g:1484:1: rule__ActivityDiagram__Group_9_3__1 : rule__ActivityDiagram__Group_9_3__1__Impl ;
    public final void rule__ActivityDiagram__Group_9_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:1488:1: ( rule__ActivityDiagram__Group_9_3__1__Impl )
            // InternalActivityDiagramDsl.g:1489:2: rule__ActivityDiagram__Group_9_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ActivityDiagram__Group_9_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityDiagram__Group_9_3__1"


    // $ANTLR start "rule__ActivityDiagram__Group_9_3__1__Impl"
    // InternalActivityDiagramDsl.g:1495:1: rule__ActivityDiagram__Group_9_3__1__Impl : ( ( rule__ActivityDiagram__JoinNodesAssignment_9_3_1 ) ) ;
    public final void rule__ActivityDiagram__Group_9_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:1499:1: ( ( ( rule__ActivityDiagram__JoinNodesAssignment_9_3_1 ) ) )
            // InternalActivityDiagramDsl.g:1500:1: ( ( rule__ActivityDiagram__JoinNodesAssignment_9_3_1 ) )
            {
            // InternalActivityDiagramDsl.g:1500:1: ( ( rule__ActivityDiagram__JoinNodesAssignment_9_3_1 ) )
            // InternalActivityDiagramDsl.g:1501:2: ( rule__ActivityDiagram__JoinNodesAssignment_9_3_1 )
            {
             before(grammarAccess.getActivityDiagramAccess().getJoinNodesAssignment_9_3_1()); 
            // InternalActivityDiagramDsl.g:1502:2: ( rule__ActivityDiagram__JoinNodesAssignment_9_3_1 )
            // InternalActivityDiagramDsl.g:1502:3: rule__ActivityDiagram__JoinNodesAssignment_9_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ActivityDiagram__JoinNodesAssignment_9_3_1();

            state._fsp--;


            }

             after(grammarAccess.getActivityDiagramAccess().getJoinNodesAssignment_9_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityDiagram__Group_9_3__1__Impl"


    // $ANTLR start "rule__ActivityDiagram__Group_10__0"
    // InternalActivityDiagramDsl.g:1511:1: rule__ActivityDiagram__Group_10__0 : rule__ActivityDiagram__Group_10__0__Impl rule__ActivityDiagram__Group_10__1 ;
    public final void rule__ActivityDiagram__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:1515:1: ( rule__ActivityDiagram__Group_10__0__Impl rule__ActivityDiagram__Group_10__1 )
            // InternalActivityDiagramDsl.g:1516:2: rule__ActivityDiagram__Group_10__0__Impl rule__ActivityDiagram__Group_10__1
            {
            pushFollow(FOLLOW_5);
            rule__ActivityDiagram__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivityDiagram__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityDiagram__Group_10__0"


    // $ANTLR start "rule__ActivityDiagram__Group_10__0__Impl"
    // InternalActivityDiagramDsl.g:1523:1: rule__ActivityDiagram__Group_10__0__Impl : ( 'decisionNodes' ) ;
    public final void rule__ActivityDiagram__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:1527:1: ( ( 'decisionNodes' ) )
            // InternalActivityDiagramDsl.g:1528:1: ( 'decisionNodes' )
            {
            // InternalActivityDiagramDsl.g:1528:1: ( 'decisionNodes' )
            // InternalActivityDiagramDsl.g:1529:2: 'decisionNodes'
            {
             before(grammarAccess.getActivityDiagramAccess().getDecisionNodesKeyword_10_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getActivityDiagramAccess().getDecisionNodesKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityDiagram__Group_10__0__Impl"


    // $ANTLR start "rule__ActivityDiagram__Group_10__1"
    // InternalActivityDiagramDsl.g:1538:1: rule__ActivityDiagram__Group_10__1 : rule__ActivityDiagram__Group_10__1__Impl rule__ActivityDiagram__Group_10__2 ;
    public final void rule__ActivityDiagram__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:1542:1: ( rule__ActivityDiagram__Group_10__1__Impl rule__ActivityDiagram__Group_10__2 )
            // InternalActivityDiagramDsl.g:1543:2: rule__ActivityDiagram__Group_10__1__Impl rule__ActivityDiagram__Group_10__2
            {
            pushFollow(FOLLOW_15);
            rule__ActivityDiagram__Group_10__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivityDiagram__Group_10__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityDiagram__Group_10__1"


    // $ANTLR start "rule__ActivityDiagram__Group_10__1__Impl"
    // InternalActivityDiagramDsl.g:1550:1: rule__ActivityDiagram__Group_10__1__Impl : ( '{' ) ;
    public final void rule__ActivityDiagram__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:1554:1: ( ( '{' ) )
            // InternalActivityDiagramDsl.g:1555:1: ( '{' )
            {
            // InternalActivityDiagramDsl.g:1555:1: ( '{' )
            // InternalActivityDiagramDsl.g:1556:2: '{'
            {
             before(grammarAccess.getActivityDiagramAccess().getLeftCurlyBracketKeyword_10_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getActivityDiagramAccess().getLeftCurlyBracketKeyword_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityDiagram__Group_10__1__Impl"


    // $ANTLR start "rule__ActivityDiagram__Group_10__2"
    // InternalActivityDiagramDsl.g:1565:1: rule__ActivityDiagram__Group_10__2 : rule__ActivityDiagram__Group_10__2__Impl rule__ActivityDiagram__Group_10__3 ;
    public final void rule__ActivityDiagram__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:1569:1: ( rule__ActivityDiagram__Group_10__2__Impl rule__ActivityDiagram__Group_10__3 )
            // InternalActivityDiagramDsl.g:1570:2: rule__ActivityDiagram__Group_10__2__Impl rule__ActivityDiagram__Group_10__3
            {
            pushFollow(FOLLOW_10);
            rule__ActivityDiagram__Group_10__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivityDiagram__Group_10__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityDiagram__Group_10__2"


    // $ANTLR start "rule__ActivityDiagram__Group_10__2__Impl"
    // InternalActivityDiagramDsl.g:1577:1: rule__ActivityDiagram__Group_10__2__Impl : ( ( rule__ActivityDiagram__DecisionNodesAssignment_10_2 ) ) ;
    public final void rule__ActivityDiagram__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:1581:1: ( ( ( rule__ActivityDiagram__DecisionNodesAssignment_10_2 ) ) )
            // InternalActivityDiagramDsl.g:1582:1: ( ( rule__ActivityDiagram__DecisionNodesAssignment_10_2 ) )
            {
            // InternalActivityDiagramDsl.g:1582:1: ( ( rule__ActivityDiagram__DecisionNodesAssignment_10_2 ) )
            // InternalActivityDiagramDsl.g:1583:2: ( rule__ActivityDiagram__DecisionNodesAssignment_10_2 )
            {
             before(grammarAccess.getActivityDiagramAccess().getDecisionNodesAssignment_10_2()); 
            // InternalActivityDiagramDsl.g:1584:2: ( rule__ActivityDiagram__DecisionNodesAssignment_10_2 )
            // InternalActivityDiagramDsl.g:1584:3: rule__ActivityDiagram__DecisionNodesAssignment_10_2
            {
            pushFollow(FOLLOW_2);
            rule__ActivityDiagram__DecisionNodesAssignment_10_2();

            state._fsp--;


            }

             after(grammarAccess.getActivityDiagramAccess().getDecisionNodesAssignment_10_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityDiagram__Group_10__2__Impl"


    // $ANTLR start "rule__ActivityDiagram__Group_10__3"
    // InternalActivityDiagramDsl.g:1592:1: rule__ActivityDiagram__Group_10__3 : rule__ActivityDiagram__Group_10__3__Impl rule__ActivityDiagram__Group_10__4 ;
    public final void rule__ActivityDiagram__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:1596:1: ( rule__ActivityDiagram__Group_10__3__Impl rule__ActivityDiagram__Group_10__4 )
            // InternalActivityDiagramDsl.g:1597:2: rule__ActivityDiagram__Group_10__3__Impl rule__ActivityDiagram__Group_10__4
            {
            pushFollow(FOLLOW_10);
            rule__ActivityDiagram__Group_10__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivityDiagram__Group_10__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityDiagram__Group_10__3"


    // $ANTLR start "rule__ActivityDiagram__Group_10__3__Impl"
    // InternalActivityDiagramDsl.g:1604:1: rule__ActivityDiagram__Group_10__3__Impl : ( ( rule__ActivityDiagram__Group_10_3__0 )* ) ;
    public final void rule__ActivityDiagram__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:1608:1: ( ( ( rule__ActivityDiagram__Group_10_3__0 )* ) )
            // InternalActivityDiagramDsl.g:1609:1: ( ( rule__ActivityDiagram__Group_10_3__0 )* )
            {
            // InternalActivityDiagramDsl.g:1609:1: ( ( rule__ActivityDiagram__Group_10_3__0 )* )
            // InternalActivityDiagramDsl.g:1610:2: ( rule__ActivityDiagram__Group_10_3__0 )*
            {
             before(grammarAccess.getActivityDiagramAccess().getGroup_10_3()); 
            // InternalActivityDiagramDsl.g:1611:2: ( rule__ActivityDiagram__Group_10_3__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==17) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalActivityDiagramDsl.g:1611:3: rule__ActivityDiagram__Group_10_3__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__ActivityDiagram__Group_10_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getActivityDiagramAccess().getGroup_10_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityDiagram__Group_10__3__Impl"


    // $ANTLR start "rule__ActivityDiagram__Group_10__4"
    // InternalActivityDiagramDsl.g:1619:1: rule__ActivityDiagram__Group_10__4 : rule__ActivityDiagram__Group_10__4__Impl ;
    public final void rule__ActivityDiagram__Group_10__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:1623:1: ( rule__ActivityDiagram__Group_10__4__Impl )
            // InternalActivityDiagramDsl.g:1624:2: rule__ActivityDiagram__Group_10__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ActivityDiagram__Group_10__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityDiagram__Group_10__4"


    // $ANTLR start "rule__ActivityDiagram__Group_10__4__Impl"
    // InternalActivityDiagramDsl.g:1630:1: rule__ActivityDiagram__Group_10__4__Impl : ( '}' ) ;
    public final void rule__ActivityDiagram__Group_10__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:1634:1: ( ( '}' ) )
            // InternalActivityDiagramDsl.g:1635:1: ( '}' )
            {
            // InternalActivityDiagramDsl.g:1635:1: ( '}' )
            // InternalActivityDiagramDsl.g:1636:2: '}'
            {
             before(grammarAccess.getActivityDiagramAccess().getRightCurlyBracketKeyword_10_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getActivityDiagramAccess().getRightCurlyBracketKeyword_10_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityDiagram__Group_10__4__Impl"


    // $ANTLR start "rule__ActivityDiagram__Group_10_3__0"
    // InternalActivityDiagramDsl.g:1646:1: rule__ActivityDiagram__Group_10_3__0 : rule__ActivityDiagram__Group_10_3__0__Impl rule__ActivityDiagram__Group_10_3__1 ;
    public final void rule__ActivityDiagram__Group_10_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:1650:1: ( rule__ActivityDiagram__Group_10_3__0__Impl rule__ActivityDiagram__Group_10_3__1 )
            // InternalActivityDiagramDsl.g:1651:2: rule__ActivityDiagram__Group_10_3__0__Impl rule__ActivityDiagram__Group_10_3__1
            {
            pushFollow(FOLLOW_15);
            rule__ActivityDiagram__Group_10_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivityDiagram__Group_10_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityDiagram__Group_10_3__0"


    // $ANTLR start "rule__ActivityDiagram__Group_10_3__0__Impl"
    // InternalActivityDiagramDsl.g:1658:1: rule__ActivityDiagram__Group_10_3__0__Impl : ( ',' ) ;
    public final void rule__ActivityDiagram__Group_10_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:1662:1: ( ( ',' ) )
            // InternalActivityDiagramDsl.g:1663:1: ( ',' )
            {
            // InternalActivityDiagramDsl.g:1663:1: ( ',' )
            // InternalActivityDiagramDsl.g:1664:2: ','
            {
             before(grammarAccess.getActivityDiagramAccess().getCommaKeyword_10_3_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getActivityDiagramAccess().getCommaKeyword_10_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityDiagram__Group_10_3__0__Impl"


    // $ANTLR start "rule__ActivityDiagram__Group_10_3__1"
    // InternalActivityDiagramDsl.g:1673:1: rule__ActivityDiagram__Group_10_3__1 : rule__ActivityDiagram__Group_10_3__1__Impl ;
    public final void rule__ActivityDiagram__Group_10_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:1677:1: ( rule__ActivityDiagram__Group_10_3__1__Impl )
            // InternalActivityDiagramDsl.g:1678:2: rule__ActivityDiagram__Group_10_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ActivityDiagram__Group_10_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityDiagram__Group_10_3__1"


    // $ANTLR start "rule__ActivityDiagram__Group_10_3__1__Impl"
    // InternalActivityDiagramDsl.g:1684:1: rule__ActivityDiagram__Group_10_3__1__Impl : ( ( rule__ActivityDiagram__DecisionNodesAssignment_10_3_1 ) ) ;
    public final void rule__ActivityDiagram__Group_10_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:1688:1: ( ( ( rule__ActivityDiagram__DecisionNodesAssignment_10_3_1 ) ) )
            // InternalActivityDiagramDsl.g:1689:1: ( ( rule__ActivityDiagram__DecisionNodesAssignment_10_3_1 ) )
            {
            // InternalActivityDiagramDsl.g:1689:1: ( ( rule__ActivityDiagram__DecisionNodesAssignment_10_3_1 ) )
            // InternalActivityDiagramDsl.g:1690:2: ( rule__ActivityDiagram__DecisionNodesAssignment_10_3_1 )
            {
             before(grammarAccess.getActivityDiagramAccess().getDecisionNodesAssignment_10_3_1()); 
            // InternalActivityDiagramDsl.g:1691:2: ( rule__ActivityDiagram__DecisionNodesAssignment_10_3_1 )
            // InternalActivityDiagramDsl.g:1691:3: rule__ActivityDiagram__DecisionNodesAssignment_10_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ActivityDiagram__DecisionNodesAssignment_10_3_1();

            state._fsp--;


            }

             after(grammarAccess.getActivityDiagramAccess().getDecisionNodesAssignment_10_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityDiagram__Group_10_3__1__Impl"


    // $ANTLR start "rule__InitialNode__Group__0"
    // InternalActivityDiagramDsl.g:1700:1: rule__InitialNode__Group__0 : rule__InitialNode__Group__0__Impl rule__InitialNode__Group__1 ;
    public final void rule__InitialNode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:1704:1: ( rule__InitialNode__Group__0__Impl rule__InitialNode__Group__1 )
            // InternalActivityDiagramDsl.g:1705:2: rule__InitialNode__Group__0__Impl rule__InitialNode__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__InitialNode__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InitialNode__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialNode__Group__0"


    // $ANTLR start "rule__InitialNode__Group__0__Impl"
    // InternalActivityDiagramDsl.g:1712:1: rule__InitialNode__Group__0__Impl : ( () ) ;
    public final void rule__InitialNode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:1716:1: ( ( () ) )
            // InternalActivityDiagramDsl.g:1717:1: ( () )
            {
            // InternalActivityDiagramDsl.g:1717:1: ( () )
            // InternalActivityDiagramDsl.g:1718:2: ()
            {
             before(grammarAccess.getInitialNodeAccess().getInitialNodeAction_0()); 
            // InternalActivityDiagramDsl.g:1719:2: ()
            // InternalActivityDiagramDsl.g:1719:3: 
            {
            }

             after(grammarAccess.getInitialNodeAccess().getInitialNodeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialNode__Group__0__Impl"


    // $ANTLR start "rule__InitialNode__Group__1"
    // InternalActivityDiagramDsl.g:1727:1: rule__InitialNode__Group__1 : rule__InitialNode__Group__1__Impl rule__InitialNode__Group__2 ;
    public final void rule__InitialNode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:1731:1: ( rule__InitialNode__Group__1__Impl rule__InitialNode__Group__2 )
            // InternalActivityDiagramDsl.g:1732:2: rule__InitialNode__Group__1__Impl rule__InitialNode__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__InitialNode__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InitialNode__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialNode__Group__1"


    // $ANTLR start "rule__InitialNode__Group__1__Impl"
    // InternalActivityDiagramDsl.g:1739:1: rule__InitialNode__Group__1__Impl : ( 'InitialNode' ) ;
    public final void rule__InitialNode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:1743:1: ( ( 'InitialNode' ) )
            // InternalActivityDiagramDsl.g:1744:1: ( 'InitialNode' )
            {
            // InternalActivityDiagramDsl.g:1744:1: ( 'InitialNode' )
            // InternalActivityDiagramDsl.g:1745:2: 'InitialNode'
            {
             before(grammarAccess.getInitialNodeAccess().getInitialNodeKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getInitialNodeAccess().getInitialNodeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialNode__Group__1__Impl"


    // $ANTLR start "rule__InitialNode__Group__2"
    // InternalActivityDiagramDsl.g:1754:1: rule__InitialNode__Group__2 : rule__InitialNode__Group__2__Impl rule__InitialNode__Group__3 ;
    public final void rule__InitialNode__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:1758:1: ( rule__InitialNode__Group__2__Impl rule__InitialNode__Group__3 )
            // InternalActivityDiagramDsl.g:1759:2: rule__InitialNode__Group__2__Impl rule__InitialNode__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__InitialNode__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InitialNode__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialNode__Group__2"


    // $ANTLR start "rule__InitialNode__Group__2__Impl"
    // InternalActivityDiagramDsl.g:1766:1: rule__InitialNode__Group__2__Impl : ( ( rule__InitialNode__NameAssignment_2 ) ) ;
    public final void rule__InitialNode__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:1770:1: ( ( ( rule__InitialNode__NameAssignment_2 ) ) )
            // InternalActivityDiagramDsl.g:1771:1: ( ( rule__InitialNode__NameAssignment_2 ) )
            {
            // InternalActivityDiagramDsl.g:1771:1: ( ( rule__InitialNode__NameAssignment_2 ) )
            // InternalActivityDiagramDsl.g:1772:2: ( rule__InitialNode__NameAssignment_2 )
            {
             before(grammarAccess.getInitialNodeAccess().getNameAssignment_2()); 
            // InternalActivityDiagramDsl.g:1773:2: ( rule__InitialNode__NameAssignment_2 )
            // InternalActivityDiagramDsl.g:1773:3: rule__InitialNode__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__InitialNode__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getInitialNodeAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialNode__Group__2__Impl"


    // $ANTLR start "rule__InitialNode__Group__3"
    // InternalActivityDiagramDsl.g:1781:1: rule__InitialNode__Group__3 : rule__InitialNode__Group__3__Impl rule__InitialNode__Group__4 ;
    public final void rule__InitialNode__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:1785:1: ( rule__InitialNode__Group__3__Impl rule__InitialNode__Group__4 )
            // InternalActivityDiagramDsl.g:1786:2: rule__InitialNode__Group__3__Impl rule__InitialNode__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__InitialNode__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InitialNode__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialNode__Group__3"


    // $ANTLR start "rule__InitialNode__Group__3__Impl"
    // InternalActivityDiagramDsl.g:1793:1: rule__InitialNode__Group__3__Impl : ( '{' ) ;
    public final void rule__InitialNode__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:1797:1: ( ( '{' ) )
            // InternalActivityDiagramDsl.g:1798:1: ( '{' )
            {
            // InternalActivityDiagramDsl.g:1798:1: ( '{' )
            // InternalActivityDiagramDsl.g:1799:2: '{'
            {
             before(grammarAccess.getInitialNodeAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getInitialNodeAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialNode__Group__3__Impl"


    // $ANTLR start "rule__InitialNode__Group__4"
    // InternalActivityDiagramDsl.g:1808:1: rule__InitialNode__Group__4 : rule__InitialNode__Group__4__Impl rule__InitialNode__Group__5 ;
    public final void rule__InitialNode__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:1812:1: ( rule__InitialNode__Group__4__Impl rule__InitialNode__Group__5 )
            // InternalActivityDiagramDsl.g:1813:2: rule__InitialNode__Group__4__Impl rule__InitialNode__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__InitialNode__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InitialNode__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialNode__Group__4"


    // $ANTLR start "rule__InitialNode__Group__4__Impl"
    // InternalActivityDiagramDsl.g:1820:1: rule__InitialNode__Group__4__Impl : ( ( rule__InitialNode__Group_4__0 )? ) ;
    public final void rule__InitialNode__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:1824:1: ( ( ( rule__InitialNode__Group_4__0 )? ) )
            // InternalActivityDiagramDsl.g:1825:1: ( ( rule__InitialNode__Group_4__0 )? )
            {
            // InternalActivityDiagramDsl.g:1825:1: ( ( rule__InitialNode__Group_4__0 )? )
            // InternalActivityDiagramDsl.g:1826:2: ( rule__InitialNode__Group_4__0 )?
            {
             before(grammarAccess.getInitialNodeAccess().getGroup_4()); 
            // InternalActivityDiagramDsl.g:1827:2: ( rule__InitialNode__Group_4__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==23) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalActivityDiagramDsl.g:1827:3: rule__InitialNode__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__InitialNode__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInitialNodeAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialNode__Group__4__Impl"


    // $ANTLR start "rule__InitialNode__Group__5"
    // InternalActivityDiagramDsl.g:1835:1: rule__InitialNode__Group__5 : rule__InitialNode__Group__5__Impl rule__InitialNode__Group__6 ;
    public final void rule__InitialNode__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:1839:1: ( rule__InitialNode__Group__5__Impl rule__InitialNode__Group__6 )
            // InternalActivityDiagramDsl.g:1840:2: rule__InitialNode__Group__5__Impl rule__InitialNode__Group__6
            {
            pushFollow(FOLLOW_16);
            rule__InitialNode__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InitialNode__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialNode__Group__5"


    // $ANTLR start "rule__InitialNode__Group__5__Impl"
    // InternalActivityDiagramDsl.g:1847:1: rule__InitialNode__Group__5__Impl : ( ( rule__InitialNode__Group_5__0 )? ) ;
    public final void rule__InitialNode__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:1851:1: ( ( ( rule__InitialNode__Group_5__0 )? ) )
            // InternalActivityDiagramDsl.g:1852:1: ( ( rule__InitialNode__Group_5__0 )? )
            {
            // InternalActivityDiagramDsl.g:1852:1: ( ( rule__InitialNode__Group_5__0 )? )
            // InternalActivityDiagramDsl.g:1853:2: ( rule__InitialNode__Group_5__0 )?
            {
             before(grammarAccess.getInitialNodeAccess().getGroup_5()); 
            // InternalActivityDiagramDsl.g:1854:2: ( rule__InitialNode__Group_5__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==26) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalActivityDiagramDsl.g:1854:3: rule__InitialNode__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__InitialNode__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInitialNodeAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialNode__Group__5__Impl"


    // $ANTLR start "rule__InitialNode__Group__6"
    // InternalActivityDiagramDsl.g:1862:1: rule__InitialNode__Group__6 : rule__InitialNode__Group__6__Impl ;
    public final void rule__InitialNode__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:1866:1: ( rule__InitialNode__Group__6__Impl )
            // InternalActivityDiagramDsl.g:1867:2: rule__InitialNode__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InitialNode__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialNode__Group__6"


    // $ANTLR start "rule__InitialNode__Group__6__Impl"
    // InternalActivityDiagramDsl.g:1873:1: rule__InitialNode__Group__6__Impl : ( '}' ) ;
    public final void rule__InitialNode__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:1877:1: ( ( '}' ) )
            // InternalActivityDiagramDsl.g:1878:1: ( '}' )
            {
            // InternalActivityDiagramDsl.g:1878:1: ( '}' )
            // InternalActivityDiagramDsl.g:1879:2: '}'
            {
             before(grammarAccess.getInitialNodeAccess().getRightCurlyBracketKeyword_6()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getInitialNodeAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialNode__Group__6__Impl"


    // $ANTLR start "rule__InitialNode__Group_4__0"
    // InternalActivityDiagramDsl.g:1889:1: rule__InitialNode__Group_4__0 : rule__InitialNode__Group_4__0__Impl rule__InitialNode__Group_4__1 ;
    public final void rule__InitialNode__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:1893:1: ( rule__InitialNode__Group_4__0__Impl rule__InitialNode__Group_4__1 )
            // InternalActivityDiagramDsl.g:1894:2: rule__InitialNode__Group_4__0__Impl rule__InitialNode__Group_4__1
            {
            pushFollow(FOLLOW_17);
            rule__InitialNode__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InitialNode__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialNode__Group_4__0"


    // $ANTLR start "rule__InitialNode__Group_4__0__Impl"
    // InternalActivityDiagramDsl.g:1901:1: rule__InitialNode__Group_4__0__Impl : ( 'incoming' ) ;
    public final void rule__InitialNode__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:1905:1: ( ( 'incoming' ) )
            // InternalActivityDiagramDsl.g:1906:1: ( 'incoming' )
            {
            // InternalActivityDiagramDsl.g:1906:1: ( 'incoming' )
            // InternalActivityDiagramDsl.g:1907:2: 'incoming'
            {
             before(grammarAccess.getInitialNodeAccess().getIncomingKeyword_4_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getInitialNodeAccess().getIncomingKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialNode__Group_4__0__Impl"


    // $ANTLR start "rule__InitialNode__Group_4__1"
    // InternalActivityDiagramDsl.g:1916:1: rule__InitialNode__Group_4__1 : rule__InitialNode__Group_4__1__Impl rule__InitialNode__Group_4__2 ;
    public final void rule__InitialNode__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:1920:1: ( rule__InitialNode__Group_4__1__Impl rule__InitialNode__Group_4__2 )
            // InternalActivityDiagramDsl.g:1921:2: rule__InitialNode__Group_4__1__Impl rule__InitialNode__Group_4__2
            {
            pushFollow(FOLLOW_4);
            rule__InitialNode__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InitialNode__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialNode__Group_4__1"


    // $ANTLR start "rule__InitialNode__Group_4__1__Impl"
    // InternalActivityDiagramDsl.g:1928:1: rule__InitialNode__Group_4__1__Impl : ( '(' ) ;
    public final void rule__InitialNode__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:1932:1: ( ( '(' ) )
            // InternalActivityDiagramDsl.g:1933:1: ( '(' )
            {
            // InternalActivityDiagramDsl.g:1933:1: ( '(' )
            // InternalActivityDiagramDsl.g:1934:2: '('
            {
             before(grammarAccess.getInitialNodeAccess().getLeftParenthesisKeyword_4_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getInitialNodeAccess().getLeftParenthesisKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialNode__Group_4__1__Impl"


    // $ANTLR start "rule__InitialNode__Group_4__2"
    // InternalActivityDiagramDsl.g:1943:1: rule__InitialNode__Group_4__2 : rule__InitialNode__Group_4__2__Impl rule__InitialNode__Group_4__3 ;
    public final void rule__InitialNode__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:1947:1: ( rule__InitialNode__Group_4__2__Impl rule__InitialNode__Group_4__3 )
            // InternalActivityDiagramDsl.g:1948:2: rule__InitialNode__Group_4__2__Impl rule__InitialNode__Group_4__3
            {
            pushFollow(FOLLOW_18);
            rule__InitialNode__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InitialNode__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialNode__Group_4__2"


    // $ANTLR start "rule__InitialNode__Group_4__2__Impl"
    // InternalActivityDiagramDsl.g:1955:1: rule__InitialNode__Group_4__2__Impl : ( ( rule__InitialNode__IncomingAssignment_4_2 ) ) ;
    public final void rule__InitialNode__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:1959:1: ( ( ( rule__InitialNode__IncomingAssignment_4_2 ) ) )
            // InternalActivityDiagramDsl.g:1960:1: ( ( rule__InitialNode__IncomingAssignment_4_2 ) )
            {
            // InternalActivityDiagramDsl.g:1960:1: ( ( rule__InitialNode__IncomingAssignment_4_2 ) )
            // InternalActivityDiagramDsl.g:1961:2: ( rule__InitialNode__IncomingAssignment_4_2 )
            {
             before(grammarAccess.getInitialNodeAccess().getIncomingAssignment_4_2()); 
            // InternalActivityDiagramDsl.g:1962:2: ( rule__InitialNode__IncomingAssignment_4_2 )
            // InternalActivityDiagramDsl.g:1962:3: rule__InitialNode__IncomingAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__InitialNode__IncomingAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getInitialNodeAccess().getIncomingAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialNode__Group_4__2__Impl"


    // $ANTLR start "rule__InitialNode__Group_4__3"
    // InternalActivityDiagramDsl.g:1970:1: rule__InitialNode__Group_4__3 : rule__InitialNode__Group_4__3__Impl rule__InitialNode__Group_4__4 ;
    public final void rule__InitialNode__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:1974:1: ( rule__InitialNode__Group_4__3__Impl rule__InitialNode__Group_4__4 )
            // InternalActivityDiagramDsl.g:1975:2: rule__InitialNode__Group_4__3__Impl rule__InitialNode__Group_4__4
            {
            pushFollow(FOLLOW_18);
            rule__InitialNode__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InitialNode__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialNode__Group_4__3"


    // $ANTLR start "rule__InitialNode__Group_4__3__Impl"
    // InternalActivityDiagramDsl.g:1982:1: rule__InitialNode__Group_4__3__Impl : ( ( rule__InitialNode__Group_4_3__0 )* ) ;
    public final void rule__InitialNode__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:1986:1: ( ( ( rule__InitialNode__Group_4_3__0 )* ) )
            // InternalActivityDiagramDsl.g:1987:1: ( ( rule__InitialNode__Group_4_3__0 )* )
            {
            // InternalActivityDiagramDsl.g:1987:1: ( ( rule__InitialNode__Group_4_3__0 )* )
            // InternalActivityDiagramDsl.g:1988:2: ( rule__InitialNode__Group_4_3__0 )*
            {
             before(grammarAccess.getInitialNodeAccess().getGroup_4_3()); 
            // InternalActivityDiagramDsl.g:1989:2: ( rule__InitialNode__Group_4_3__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==17) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalActivityDiagramDsl.g:1989:3: rule__InitialNode__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__InitialNode__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getInitialNodeAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialNode__Group_4__3__Impl"


    // $ANTLR start "rule__InitialNode__Group_4__4"
    // InternalActivityDiagramDsl.g:1997:1: rule__InitialNode__Group_4__4 : rule__InitialNode__Group_4__4__Impl ;
    public final void rule__InitialNode__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:2001:1: ( rule__InitialNode__Group_4__4__Impl )
            // InternalActivityDiagramDsl.g:2002:2: rule__InitialNode__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InitialNode__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialNode__Group_4__4"


    // $ANTLR start "rule__InitialNode__Group_4__4__Impl"
    // InternalActivityDiagramDsl.g:2008:1: rule__InitialNode__Group_4__4__Impl : ( ')' ) ;
    public final void rule__InitialNode__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:2012:1: ( ( ')' ) )
            // InternalActivityDiagramDsl.g:2013:1: ( ')' )
            {
            // InternalActivityDiagramDsl.g:2013:1: ( ')' )
            // InternalActivityDiagramDsl.g:2014:2: ')'
            {
             before(grammarAccess.getInitialNodeAccess().getRightParenthesisKeyword_4_4()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getInitialNodeAccess().getRightParenthesisKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialNode__Group_4__4__Impl"


    // $ANTLR start "rule__InitialNode__Group_4_3__0"
    // InternalActivityDiagramDsl.g:2024:1: rule__InitialNode__Group_4_3__0 : rule__InitialNode__Group_4_3__0__Impl rule__InitialNode__Group_4_3__1 ;
    public final void rule__InitialNode__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:2028:1: ( rule__InitialNode__Group_4_3__0__Impl rule__InitialNode__Group_4_3__1 )
            // InternalActivityDiagramDsl.g:2029:2: rule__InitialNode__Group_4_3__0__Impl rule__InitialNode__Group_4_3__1
            {
            pushFollow(FOLLOW_4);
            rule__InitialNode__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InitialNode__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialNode__Group_4_3__0"


    // $ANTLR start "rule__InitialNode__Group_4_3__0__Impl"
    // InternalActivityDiagramDsl.g:2036:1: rule__InitialNode__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__InitialNode__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:2040:1: ( ( ',' ) )
            // InternalActivityDiagramDsl.g:2041:1: ( ',' )
            {
            // InternalActivityDiagramDsl.g:2041:1: ( ',' )
            // InternalActivityDiagramDsl.g:2042:2: ','
            {
             before(grammarAccess.getInitialNodeAccess().getCommaKeyword_4_3_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getInitialNodeAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialNode__Group_4_3__0__Impl"


    // $ANTLR start "rule__InitialNode__Group_4_3__1"
    // InternalActivityDiagramDsl.g:2051:1: rule__InitialNode__Group_4_3__1 : rule__InitialNode__Group_4_3__1__Impl ;
    public final void rule__InitialNode__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:2055:1: ( rule__InitialNode__Group_4_3__1__Impl )
            // InternalActivityDiagramDsl.g:2056:2: rule__InitialNode__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InitialNode__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialNode__Group_4_3__1"


    // $ANTLR start "rule__InitialNode__Group_4_3__1__Impl"
    // InternalActivityDiagramDsl.g:2062:1: rule__InitialNode__Group_4_3__1__Impl : ( ( rule__InitialNode__IncomingAssignment_4_3_1 ) ) ;
    public final void rule__InitialNode__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:2066:1: ( ( ( rule__InitialNode__IncomingAssignment_4_3_1 ) ) )
            // InternalActivityDiagramDsl.g:2067:1: ( ( rule__InitialNode__IncomingAssignment_4_3_1 ) )
            {
            // InternalActivityDiagramDsl.g:2067:1: ( ( rule__InitialNode__IncomingAssignment_4_3_1 ) )
            // InternalActivityDiagramDsl.g:2068:2: ( rule__InitialNode__IncomingAssignment_4_3_1 )
            {
             before(grammarAccess.getInitialNodeAccess().getIncomingAssignment_4_3_1()); 
            // InternalActivityDiagramDsl.g:2069:2: ( rule__InitialNode__IncomingAssignment_4_3_1 )
            // InternalActivityDiagramDsl.g:2069:3: rule__InitialNode__IncomingAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__InitialNode__IncomingAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getInitialNodeAccess().getIncomingAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialNode__Group_4_3__1__Impl"


    // $ANTLR start "rule__InitialNode__Group_5__0"
    // InternalActivityDiagramDsl.g:2078:1: rule__InitialNode__Group_5__0 : rule__InitialNode__Group_5__0__Impl rule__InitialNode__Group_5__1 ;
    public final void rule__InitialNode__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:2082:1: ( rule__InitialNode__Group_5__0__Impl rule__InitialNode__Group_5__1 )
            // InternalActivityDiagramDsl.g:2083:2: rule__InitialNode__Group_5__0__Impl rule__InitialNode__Group_5__1
            {
            pushFollow(FOLLOW_17);
            rule__InitialNode__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InitialNode__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialNode__Group_5__0"


    // $ANTLR start "rule__InitialNode__Group_5__0__Impl"
    // InternalActivityDiagramDsl.g:2090:1: rule__InitialNode__Group_5__0__Impl : ( 'outgoing' ) ;
    public final void rule__InitialNode__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:2094:1: ( ( 'outgoing' ) )
            // InternalActivityDiagramDsl.g:2095:1: ( 'outgoing' )
            {
            // InternalActivityDiagramDsl.g:2095:1: ( 'outgoing' )
            // InternalActivityDiagramDsl.g:2096:2: 'outgoing'
            {
             before(grammarAccess.getInitialNodeAccess().getOutgoingKeyword_5_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getInitialNodeAccess().getOutgoingKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialNode__Group_5__0__Impl"


    // $ANTLR start "rule__InitialNode__Group_5__1"
    // InternalActivityDiagramDsl.g:2105:1: rule__InitialNode__Group_5__1 : rule__InitialNode__Group_5__1__Impl rule__InitialNode__Group_5__2 ;
    public final void rule__InitialNode__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:2109:1: ( rule__InitialNode__Group_5__1__Impl rule__InitialNode__Group_5__2 )
            // InternalActivityDiagramDsl.g:2110:2: rule__InitialNode__Group_5__1__Impl rule__InitialNode__Group_5__2
            {
            pushFollow(FOLLOW_4);
            rule__InitialNode__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InitialNode__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialNode__Group_5__1"


    // $ANTLR start "rule__InitialNode__Group_5__1__Impl"
    // InternalActivityDiagramDsl.g:2117:1: rule__InitialNode__Group_5__1__Impl : ( '(' ) ;
    public final void rule__InitialNode__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:2121:1: ( ( '(' ) )
            // InternalActivityDiagramDsl.g:2122:1: ( '(' )
            {
            // InternalActivityDiagramDsl.g:2122:1: ( '(' )
            // InternalActivityDiagramDsl.g:2123:2: '('
            {
             before(grammarAccess.getInitialNodeAccess().getLeftParenthesisKeyword_5_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getInitialNodeAccess().getLeftParenthesisKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialNode__Group_5__1__Impl"


    // $ANTLR start "rule__InitialNode__Group_5__2"
    // InternalActivityDiagramDsl.g:2132:1: rule__InitialNode__Group_5__2 : rule__InitialNode__Group_5__2__Impl rule__InitialNode__Group_5__3 ;
    public final void rule__InitialNode__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:2136:1: ( rule__InitialNode__Group_5__2__Impl rule__InitialNode__Group_5__3 )
            // InternalActivityDiagramDsl.g:2137:2: rule__InitialNode__Group_5__2__Impl rule__InitialNode__Group_5__3
            {
            pushFollow(FOLLOW_18);
            rule__InitialNode__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InitialNode__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialNode__Group_5__2"


    // $ANTLR start "rule__InitialNode__Group_5__2__Impl"
    // InternalActivityDiagramDsl.g:2144:1: rule__InitialNode__Group_5__2__Impl : ( ( rule__InitialNode__OutgoingAssignment_5_2 ) ) ;
    public final void rule__InitialNode__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:2148:1: ( ( ( rule__InitialNode__OutgoingAssignment_5_2 ) ) )
            // InternalActivityDiagramDsl.g:2149:1: ( ( rule__InitialNode__OutgoingAssignment_5_2 ) )
            {
            // InternalActivityDiagramDsl.g:2149:1: ( ( rule__InitialNode__OutgoingAssignment_5_2 ) )
            // InternalActivityDiagramDsl.g:2150:2: ( rule__InitialNode__OutgoingAssignment_5_2 )
            {
             before(grammarAccess.getInitialNodeAccess().getOutgoingAssignment_5_2()); 
            // InternalActivityDiagramDsl.g:2151:2: ( rule__InitialNode__OutgoingAssignment_5_2 )
            // InternalActivityDiagramDsl.g:2151:3: rule__InitialNode__OutgoingAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__InitialNode__OutgoingAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getInitialNodeAccess().getOutgoingAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialNode__Group_5__2__Impl"


    // $ANTLR start "rule__InitialNode__Group_5__3"
    // InternalActivityDiagramDsl.g:2159:1: rule__InitialNode__Group_5__3 : rule__InitialNode__Group_5__3__Impl rule__InitialNode__Group_5__4 ;
    public final void rule__InitialNode__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:2163:1: ( rule__InitialNode__Group_5__3__Impl rule__InitialNode__Group_5__4 )
            // InternalActivityDiagramDsl.g:2164:2: rule__InitialNode__Group_5__3__Impl rule__InitialNode__Group_5__4
            {
            pushFollow(FOLLOW_18);
            rule__InitialNode__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InitialNode__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialNode__Group_5__3"


    // $ANTLR start "rule__InitialNode__Group_5__3__Impl"
    // InternalActivityDiagramDsl.g:2171:1: rule__InitialNode__Group_5__3__Impl : ( ( rule__InitialNode__Group_5_3__0 )* ) ;
    public final void rule__InitialNode__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:2175:1: ( ( ( rule__InitialNode__Group_5_3__0 )* ) )
            // InternalActivityDiagramDsl.g:2176:1: ( ( rule__InitialNode__Group_5_3__0 )* )
            {
            // InternalActivityDiagramDsl.g:2176:1: ( ( rule__InitialNode__Group_5_3__0 )* )
            // InternalActivityDiagramDsl.g:2177:2: ( rule__InitialNode__Group_5_3__0 )*
            {
             before(grammarAccess.getInitialNodeAccess().getGroup_5_3()); 
            // InternalActivityDiagramDsl.g:2178:2: ( rule__InitialNode__Group_5_3__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==17) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalActivityDiagramDsl.g:2178:3: rule__InitialNode__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__InitialNode__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getInitialNodeAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialNode__Group_5__3__Impl"


    // $ANTLR start "rule__InitialNode__Group_5__4"
    // InternalActivityDiagramDsl.g:2186:1: rule__InitialNode__Group_5__4 : rule__InitialNode__Group_5__4__Impl ;
    public final void rule__InitialNode__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:2190:1: ( rule__InitialNode__Group_5__4__Impl )
            // InternalActivityDiagramDsl.g:2191:2: rule__InitialNode__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InitialNode__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialNode__Group_5__4"


    // $ANTLR start "rule__InitialNode__Group_5__4__Impl"
    // InternalActivityDiagramDsl.g:2197:1: rule__InitialNode__Group_5__4__Impl : ( ')' ) ;
    public final void rule__InitialNode__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:2201:1: ( ( ')' ) )
            // InternalActivityDiagramDsl.g:2202:1: ( ')' )
            {
            // InternalActivityDiagramDsl.g:2202:1: ( ')' )
            // InternalActivityDiagramDsl.g:2203:2: ')'
            {
             before(grammarAccess.getInitialNodeAccess().getRightParenthesisKeyword_5_4()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getInitialNodeAccess().getRightParenthesisKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialNode__Group_5__4__Impl"


    // $ANTLR start "rule__InitialNode__Group_5_3__0"
    // InternalActivityDiagramDsl.g:2213:1: rule__InitialNode__Group_5_3__0 : rule__InitialNode__Group_5_3__0__Impl rule__InitialNode__Group_5_3__1 ;
    public final void rule__InitialNode__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:2217:1: ( rule__InitialNode__Group_5_3__0__Impl rule__InitialNode__Group_5_3__1 )
            // InternalActivityDiagramDsl.g:2218:2: rule__InitialNode__Group_5_3__0__Impl rule__InitialNode__Group_5_3__1
            {
            pushFollow(FOLLOW_4);
            rule__InitialNode__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InitialNode__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialNode__Group_5_3__0"


    // $ANTLR start "rule__InitialNode__Group_5_3__0__Impl"
    // InternalActivityDiagramDsl.g:2225:1: rule__InitialNode__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__InitialNode__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:2229:1: ( ( ',' ) )
            // InternalActivityDiagramDsl.g:2230:1: ( ',' )
            {
            // InternalActivityDiagramDsl.g:2230:1: ( ',' )
            // InternalActivityDiagramDsl.g:2231:2: ','
            {
             before(grammarAccess.getInitialNodeAccess().getCommaKeyword_5_3_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getInitialNodeAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialNode__Group_5_3__0__Impl"


    // $ANTLR start "rule__InitialNode__Group_5_3__1"
    // InternalActivityDiagramDsl.g:2240:1: rule__InitialNode__Group_5_3__1 : rule__InitialNode__Group_5_3__1__Impl ;
    public final void rule__InitialNode__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:2244:1: ( rule__InitialNode__Group_5_3__1__Impl )
            // InternalActivityDiagramDsl.g:2245:2: rule__InitialNode__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InitialNode__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialNode__Group_5_3__1"


    // $ANTLR start "rule__InitialNode__Group_5_3__1__Impl"
    // InternalActivityDiagramDsl.g:2251:1: rule__InitialNode__Group_5_3__1__Impl : ( ( rule__InitialNode__OutgoingAssignment_5_3_1 ) ) ;
    public final void rule__InitialNode__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:2255:1: ( ( ( rule__InitialNode__OutgoingAssignment_5_3_1 ) ) )
            // InternalActivityDiagramDsl.g:2256:1: ( ( rule__InitialNode__OutgoingAssignment_5_3_1 ) )
            {
            // InternalActivityDiagramDsl.g:2256:1: ( ( rule__InitialNode__OutgoingAssignment_5_3_1 ) )
            // InternalActivityDiagramDsl.g:2257:2: ( rule__InitialNode__OutgoingAssignment_5_3_1 )
            {
             before(grammarAccess.getInitialNodeAccess().getOutgoingAssignment_5_3_1()); 
            // InternalActivityDiagramDsl.g:2258:2: ( rule__InitialNode__OutgoingAssignment_5_3_1 )
            // InternalActivityDiagramDsl.g:2258:3: rule__InitialNode__OutgoingAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__InitialNode__OutgoingAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getInitialNodeAccess().getOutgoingAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialNode__Group_5_3__1__Impl"


    // $ANTLR start "rule__FinalNode__Group__0"
    // InternalActivityDiagramDsl.g:2267:1: rule__FinalNode__Group__0 : rule__FinalNode__Group__0__Impl rule__FinalNode__Group__1 ;
    public final void rule__FinalNode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:2271:1: ( rule__FinalNode__Group__0__Impl rule__FinalNode__Group__1 )
            // InternalActivityDiagramDsl.g:2272:2: rule__FinalNode__Group__0__Impl rule__FinalNode__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__FinalNode__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FinalNode__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FinalNode__Group__0"


    // $ANTLR start "rule__FinalNode__Group__0__Impl"
    // InternalActivityDiagramDsl.g:2279:1: rule__FinalNode__Group__0__Impl : ( () ) ;
    public final void rule__FinalNode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:2283:1: ( ( () ) )
            // InternalActivityDiagramDsl.g:2284:1: ( () )
            {
            // InternalActivityDiagramDsl.g:2284:1: ( () )
            // InternalActivityDiagramDsl.g:2285:2: ()
            {
             before(grammarAccess.getFinalNodeAccess().getFinalNodeAction_0()); 
            // InternalActivityDiagramDsl.g:2286:2: ()
            // InternalActivityDiagramDsl.g:2286:3: 
            {
            }

             after(grammarAccess.getFinalNodeAccess().getFinalNodeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FinalNode__Group__0__Impl"


    // $ANTLR start "rule__FinalNode__Group__1"
    // InternalActivityDiagramDsl.g:2294:1: rule__FinalNode__Group__1 : rule__FinalNode__Group__1__Impl rule__FinalNode__Group__2 ;
    public final void rule__FinalNode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:2298:1: ( rule__FinalNode__Group__1__Impl rule__FinalNode__Group__2 )
            // InternalActivityDiagramDsl.g:2299:2: rule__FinalNode__Group__1__Impl rule__FinalNode__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__FinalNode__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FinalNode__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FinalNode__Group__1"


    // $ANTLR start "rule__FinalNode__Group__1__Impl"
    // InternalActivityDiagramDsl.g:2306:1: rule__FinalNode__Group__1__Impl : ( 'FinalNode' ) ;
    public final void rule__FinalNode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:2310:1: ( ( 'FinalNode' ) )
            // InternalActivityDiagramDsl.g:2311:1: ( 'FinalNode' )
            {
            // InternalActivityDiagramDsl.g:2311:1: ( 'FinalNode' )
            // InternalActivityDiagramDsl.g:2312:2: 'FinalNode'
            {
             before(grammarAccess.getFinalNodeAccess().getFinalNodeKeyword_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getFinalNodeAccess().getFinalNodeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FinalNode__Group__1__Impl"


    // $ANTLR start "rule__FinalNode__Group__2"
    // InternalActivityDiagramDsl.g:2321:1: rule__FinalNode__Group__2 : rule__FinalNode__Group__2__Impl rule__FinalNode__Group__3 ;
    public final void rule__FinalNode__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:2325:1: ( rule__FinalNode__Group__2__Impl rule__FinalNode__Group__3 )
            // InternalActivityDiagramDsl.g:2326:2: rule__FinalNode__Group__2__Impl rule__FinalNode__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__FinalNode__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FinalNode__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FinalNode__Group__2"


    // $ANTLR start "rule__FinalNode__Group__2__Impl"
    // InternalActivityDiagramDsl.g:2333:1: rule__FinalNode__Group__2__Impl : ( ( rule__FinalNode__NameAssignment_2 ) ) ;
    public final void rule__FinalNode__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:2337:1: ( ( ( rule__FinalNode__NameAssignment_2 ) ) )
            // InternalActivityDiagramDsl.g:2338:1: ( ( rule__FinalNode__NameAssignment_2 ) )
            {
            // InternalActivityDiagramDsl.g:2338:1: ( ( rule__FinalNode__NameAssignment_2 ) )
            // InternalActivityDiagramDsl.g:2339:2: ( rule__FinalNode__NameAssignment_2 )
            {
             before(grammarAccess.getFinalNodeAccess().getNameAssignment_2()); 
            // InternalActivityDiagramDsl.g:2340:2: ( rule__FinalNode__NameAssignment_2 )
            // InternalActivityDiagramDsl.g:2340:3: rule__FinalNode__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__FinalNode__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFinalNodeAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FinalNode__Group__2__Impl"


    // $ANTLR start "rule__FinalNode__Group__3"
    // InternalActivityDiagramDsl.g:2348:1: rule__FinalNode__Group__3 : rule__FinalNode__Group__3__Impl rule__FinalNode__Group__4 ;
    public final void rule__FinalNode__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:2352:1: ( rule__FinalNode__Group__3__Impl rule__FinalNode__Group__4 )
            // InternalActivityDiagramDsl.g:2353:2: rule__FinalNode__Group__3__Impl rule__FinalNode__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__FinalNode__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FinalNode__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FinalNode__Group__3"


    // $ANTLR start "rule__FinalNode__Group__3__Impl"
    // InternalActivityDiagramDsl.g:2360:1: rule__FinalNode__Group__3__Impl : ( '{' ) ;
    public final void rule__FinalNode__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:2364:1: ( ( '{' ) )
            // InternalActivityDiagramDsl.g:2365:1: ( '{' )
            {
            // InternalActivityDiagramDsl.g:2365:1: ( '{' )
            // InternalActivityDiagramDsl.g:2366:2: '{'
            {
             before(grammarAccess.getFinalNodeAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getFinalNodeAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FinalNode__Group__3__Impl"


    // $ANTLR start "rule__FinalNode__Group__4"
    // InternalActivityDiagramDsl.g:2375:1: rule__FinalNode__Group__4 : rule__FinalNode__Group__4__Impl rule__FinalNode__Group__5 ;
    public final void rule__FinalNode__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:2379:1: ( rule__FinalNode__Group__4__Impl rule__FinalNode__Group__5 )
            // InternalActivityDiagramDsl.g:2380:2: rule__FinalNode__Group__4__Impl rule__FinalNode__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__FinalNode__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FinalNode__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FinalNode__Group__4"


    // $ANTLR start "rule__FinalNode__Group__4__Impl"
    // InternalActivityDiagramDsl.g:2387:1: rule__FinalNode__Group__4__Impl : ( ( rule__FinalNode__Group_4__0 )? ) ;
    public final void rule__FinalNode__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:2391:1: ( ( ( rule__FinalNode__Group_4__0 )? ) )
            // InternalActivityDiagramDsl.g:2392:1: ( ( rule__FinalNode__Group_4__0 )? )
            {
            // InternalActivityDiagramDsl.g:2392:1: ( ( rule__FinalNode__Group_4__0 )? )
            // InternalActivityDiagramDsl.g:2393:2: ( rule__FinalNode__Group_4__0 )?
            {
             before(grammarAccess.getFinalNodeAccess().getGroup_4()); 
            // InternalActivityDiagramDsl.g:2394:2: ( rule__FinalNode__Group_4__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==23) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalActivityDiagramDsl.g:2394:3: rule__FinalNode__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FinalNode__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFinalNodeAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FinalNode__Group__4__Impl"


    // $ANTLR start "rule__FinalNode__Group__5"
    // InternalActivityDiagramDsl.g:2402:1: rule__FinalNode__Group__5 : rule__FinalNode__Group__5__Impl rule__FinalNode__Group__6 ;
    public final void rule__FinalNode__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:2406:1: ( rule__FinalNode__Group__5__Impl rule__FinalNode__Group__6 )
            // InternalActivityDiagramDsl.g:2407:2: rule__FinalNode__Group__5__Impl rule__FinalNode__Group__6
            {
            pushFollow(FOLLOW_16);
            rule__FinalNode__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FinalNode__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FinalNode__Group__5"


    // $ANTLR start "rule__FinalNode__Group__5__Impl"
    // InternalActivityDiagramDsl.g:2414:1: rule__FinalNode__Group__5__Impl : ( ( rule__FinalNode__Group_5__0 )? ) ;
    public final void rule__FinalNode__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:2418:1: ( ( ( rule__FinalNode__Group_5__0 )? ) )
            // InternalActivityDiagramDsl.g:2419:1: ( ( rule__FinalNode__Group_5__0 )? )
            {
            // InternalActivityDiagramDsl.g:2419:1: ( ( rule__FinalNode__Group_5__0 )? )
            // InternalActivityDiagramDsl.g:2420:2: ( rule__FinalNode__Group_5__0 )?
            {
             before(grammarAccess.getFinalNodeAccess().getGroup_5()); 
            // InternalActivityDiagramDsl.g:2421:2: ( rule__FinalNode__Group_5__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==26) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalActivityDiagramDsl.g:2421:3: rule__FinalNode__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FinalNode__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFinalNodeAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FinalNode__Group__5__Impl"


    // $ANTLR start "rule__FinalNode__Group__6"
    // InternalActivityDiagramDsl.g:2429:1: rule__FinalNode__Group__6 : rule__FinalNode__Group__6__Impl ;
    public final void rule__FinalNode__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:2433:1: ( rule__FinalNode__Group__6__Impl )
            // InternalActivityDiagramDsl.g:2434:2: rule__FinalNode__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FinalNode__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FinalNode__Group__6"


    // $ANTLR start "rule__FinalNode__Group__6__Impl"
    // InternalActivityDiagramDsl.g:2440:1: rule__FinalNode__Group__6__Impl : ( '}' ) ;
    public final void rule__FinalNode__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:2444:1: ( ( '}' ) )
            // InternalActivityDiagramDsl.g:2445:1: ( '}' )
            {
            // InternalActivityDiagramDsl.g:2445:1: ( '}' )
            // InternalActivityDiagramDsl.g:2446:2: '}'
            {
             before(grammarAccess.getFinalNodeAccess().getRightCurlyBracketKeyword_6()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getFinalNodeAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FinalNode__Group__6__Impl"


    // $ANTLR start "rule__FinalNode__Group_4__0"
    // InternalActivityDiagramDsl.g:2456:1: rule__FinalNode__Group_4__0 : rule__FinalNode__Group_4__0__Impl rule__FinalNode__Group_4__1 ;
    public final void rule__FinalNode__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:2460:1: ( rule__FinalNode__Group_4__0__Impl rule__FinalNode__Group_4__1 )
            // InternalActivityDiagramDsl.g:2461:2: rule__FinalNode__Group_4__0__Impl rule__FinalNode__Group_4__1
            {
            pushFollow(FOLLOW_17);
            rule__FinalNode__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FinalNode__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FinalNode__Group_4__0"


    // $ANTLR start "rule__FinalNode__Group_4__0__Impl"
    // InternalActivityDiagramDsl.g:2468:1: rule__FinalNode__Group_4__0__Impl : ( 'incoming' ) ;
    public final void rule__FinalNode__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:2472:1: ( ( 'incoming' ) )
            // InternalActivityDiagramDsl.g:2473:1: ( 'incoming' )
            {
            // InternalActivityDiagramDsl.g:2473:1: ( 'incoming' )
            // InternalActivityDiagramDsl.g:2474:2: 'incoming'
            {
             before(grammarAccess.getFinalNodeAccess().getIncomingKeyword_4_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getFinalNodeAccess().getIncomingKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FinalNode__Group_4__0__Impl"


    // $ANTLR start "rule__FinalNode__Group_4__1"
    // InternalActivityDiagramDsl.g:2483:1: rule__FinalNode__Group_4__1 : rule__FinalNode__Group_4__1__Impl rule__FinalNode__Group_4__2 ;
    public final void rule__FinalNode__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:2487:1: ( rule__FinalNode__Group_4__1__Impl rule__FinalNode__Group_4__2 )
            // InternalActivityDiagramDsl.g:2488:2: rule__FinalNode__Group_4__1__Impl rule__FinalNode__Group_4__2
            {
            pushFollow(FOLLOW_4);
            rule__FinalNode__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FinalNode__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FinalNode__Group_4__1"


    // $ANTLR start "rule__FinalNode__Group_4__1__Impl"
    // InternalActivityDiagramDsl.g:2495:1: rule__FinalNode__Group_4__1__Impl : ( '(' ) ;
    public final void rule__FinalNode__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:2499:1: ( ( '(' ) )
            // InternalActivityDiagramDsl.g:2500:1: ( '(' )
            {
            // InternalActivityDiagramDsl.g:2500:1: ( '(' )
            // InternalActivityDiagramDsl.g:2501:2: '('
            {
             before(grammarAccess.getFinalNodeAccess().getLeftParenthesisKeyword_4_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getFinalNodeAccess().getLeftParenthesisKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FinalNode__Group_4__1__Impl"


    // $ANTLR start "rule__FinalNode__Group_4__2"
    // InternalActivityDiagramDsl.g:2510:1: rule__FinalNode__Group_4__2 : rule__FinalNode__Group_4__2__Impl rule__FinalNode__Group_4__3 ;
    public final void rule__FinalNode__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:2514:1: ( rule__FinalNode__Group_4__2__Impl rule__FinalNode__Group_4__3 )
            // InternalActivityDiagramDsl.g:2515:2: rule__FinalNode__Group_4__2__Impl rule__FinalNode__Group_4__3
            {
            pushFollow(FOLLOW_18);
            rule__FinalNode__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FinalNode__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FinalNode__Group_4__2"


    // $ANTLR start "rule__FinalNode__Group_4__2__Impl"
    // InternalActivityDiagramDsl.g:2522:1: rule__FinalNode__Group_4__2__Impl : ( ( rule__FinalNode__IncomingAssignment_4_2 ) ) ;
    public final void rule__FinalNode__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:2526:1: ( ( ( rule__FinalNode__IncomingAssignment_4_2 ) ) )
            // InternalActivityDiagramDsl.g:2527:1: ( ( rule__FinalNode__IncomingAssignment_4_2 ) )
            {
            // InternalActivityDiagramDsl.g:2527:1: ( ( rule__FinalNode__IncomingAssignment_4_2 ) )
            // InternalActivityDiagramDsl.g:2528:2: ( rule__FinalNode__IncomingAssignment_4_2 )
            {
             before(grammarAccess.getFinalNodeAccess().getIncomingAssignment_4_2()); 
            // InternalActivityDiagramDsl.g:2529:2: ( rule__FinalNode__IncomingAssignment_4_2 )
            // InternalActivityDiagramDsl.g:2529:3: rule__FinalNode__IncomingAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__FinalNode__IncomingAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getFinalNodeAccess().getIncomingAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FinalNode__Group_4__2__Impl"


    // $ANTLR start "rule__FinalNode__Group_4__3"
    // InternalActivityDiagramDsl.g:2537:1: rule__FinalNode__Group_4__3 : rule__FinalNode__Group_4__3__Impl rule__FinalNode__Group_4__4 ;
    public final void rule__FinalNode__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:2541:1: ( rule__FinalNode__Group_4__3__Impl rule__FinalNode__Group_4__4 )
            // InternalActivityDiagramDsl.g:2542:2: rule__FinalNode__Group_4__3__Impl rule__FinalNode__Group_4__4
            {
            pushFollow(FOLLOW_18);
            rule__FinalNode__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FinalNode__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FinalNode__Group_4__3"


    // $ANTLR start "rule__FinalNode__Group_4__3__Impl"
    // InternalActivityDiagramDsl.g:2549:1: rule__FinalNode__Group_4__3__Impl : ( ( rule__FinalNode__Group_4_3__0 )* ) ;
    public final void rule__FinalNode__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:2553:1: ( ( ( rule__FinalNode__Group_4_3__0 )* ) )
            // InternalActivityDiagramDsl.g:2554:1: ( ( rule__FinalNode__Group_4_3__0 )* )
            {
            // InternalActivityDiagramDsl.g:2554:1: ( ( rule__FinalNode__Group_4_3__0 )* )
            // InternalActivityDiagramDsl.g:2555:2: ( rule__FinalNode__Group_4_3__0 )*
            {
             before(grammarAccess.getFinalNodeAccess().getGroup_4_3()); 
            // InternalActivityDiagramDsl.g:2556:2: ( rule__FinalNode__Group_4_3__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==17) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalActivityDiagramDsl.g:2556:3: rule__FinalNode__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__FinalNode__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getFinalNodeAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FinalNode__Group_4__3__Impl"


    // $ANTLR start "rule__FinalNode__Group_4__4"
    // InternalActivityDiagramDsl.g:2564:1: rule__FinalNode__Group_4__4 : rule__FinalNode__Group_4__4__Impl ;
    public final void rule__FinalNode__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:2568:1: ( rule__FinalNode__Group_4__4__Impl )
            // InternalActivityDiagramDsl.g:2569:2: rule__FinalNode__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FinalNode__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FinalNode__Group_4__4"


    // $ANTLR start "rule__FinalNode__Group_4__4__Impl"
    // InternalActivityDiagramDsl.g:2575:1: rule__FinalNode__Group_4__4__Impl : ( ')' ) ;
    public final void rule__FinalNode__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:2579:1: ( ( ')' ) )
            // InternalActivityDiagramDsl.g:2580:1: ( ')' )
            {
            // InternalActivityDiagramDsl.g:2580:1: ( ')' )
            // InternalActivityDiagramDsl.g:2581:2: ')'
            {
             before(grammarAccess.getFinalNodeAccess().getRightParenthesisKeyword_4_4()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getFinalNodeAccess().getRightParenthesisKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FinalNode__Group_4__4__Impl"


    // $ANTLR start "rule__FinalNode__Group_4_3__0"
    // InternalActivityDiagramDsl.g:2591:1: rule__FinalNode__Group_4_3__0 : rule__FinalNode__Group_4_3__0__Impl rule__FinalNode__Group_4_3__1 ;
    public final void rule__FinalNode__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:2595:1: ( rule__FinalNode__Group_4_3__0__Impl rule__FinalNode__Group_4_3__1 )
            // InternalActivityDiagramDsl.g:2596:2: rule__FinalNode__Group_4_3__0__Impl rule__FinalNode__Group_4_3__1
            {
            pushFollow(FOLLOW_4);
            rule__FinalNode__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FinalNode__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FinalNode__Group_4_3__0"


    // $ANTLR start "rule__FinalNode__Group_4_3__0__Impl"
    // InternalActivityDiagramDsl.g:2603:1: rule__FinalNode__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__FinalNode__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:2607:1: ( ( ',' ) )
            // InternalActivityDiagramDsl.g:2608:1: ( ',' )
            {
            // InternalActivityDiagramDsl.g:2608:1: ( ',' )
            // InternalActivityDiagramDsl.g:2609:2: ','
            {
             before(grammarAccess.getFinalNodeAccess().getCommaKeyword_4_3_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getFinalNodeAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FinalNode__Group_4_3__0__Impl"


    // $ANTLR start "rule__FinalNode__Group_4_3__1"
    // InternalActivityDiagramDsl.g:2618:1: rule__FinalNode__Group_4_3__1 : rule__FinalNode__Group_4_3__1__Impl ;
    public final void rule__FinalNode__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:2622:1: ( rule__FinalNode__Group_4_3__1__Impl )
            // InternalActivityDiagramDsl.g:2623:2: rule__FinalNode__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FinalNode__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FinalNode__Group_4_3__1"


    // $ANTLR start "rule__FinalNode__Group_4_3__1__Impl"
    // InternalActivityDiagramDsl.g:2629:1: rule__FinalNode__Group_4_3__1__Impl : ( ( rule__FinalNode__IncomingAssignment_4_3_1 ) ) ;
    public final void rule__FinalNode__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:2633:1: ( ( ( rule__FinalNode__IncomingAssignment_4_3_1 ) ) )
            // InternalActivityDiagramDsl.g:2634:1: ( ( rule__FinalNode__IncomingAssignment_4_3_1 ) )
            {
            // InternalActivityDiagramDsl.g:2634:1: ( ( rule__FinalNode__IncomingAssignment_4_3_1 ) )
            // InternalActivityDiagramDsl.g:2635:2: ( rule__FinalNode__IncomingAssignment_4_3_1 )
            {
             before(grammarAccess.getFinalNodeAccess().getIncomingAssignment_4_3_1()); 
            // InternalActivityDiagramDsl.g:2636:2: ( rule__FinalNode__IncomingAssignment_4_3_1 )
            // InternalActivityDiagramDsl.g:2636:3: rule__FinalNode__IncomingAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__FinalNode__IncomingAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getFinalNodeAccess().getIncomingAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FinalNode__Group_4_3__1__Impl"


    // $ANTLR start "rule__FinalNode__Group_5__0"
    // InternalActivityDiagramDsl.g:2645:1: rule__FinalNode__Group_5__0 : rule__FinalNode__Group_5__0__Impl rule__FinalNode__Group_5__1 ;
    public final void rule__FinalNode__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:2649:1: ( rule__FinalNode__Group_5__0__Impl rule__FinalNode__Group_5__1 )
            // InternalActivityDiagramDsl.g:2650:2: rule__FinalNode__Group_5__0__Impl rule__FinalNode__Group_5__1
            {
            pushFollow(FOLLOW_17);
            rule__FinalNode__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FinalNode__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FinalNode__Group_5__0"


    // $ANTLR start "rule__FinalNode__Group_5__0__Impl"
    // InternalActivityDiagramDsl.g:2657:1: rule__FinalNode__Group_5__0__Impl : ( 'outgoing' ) ;
    public final void rule__FinalNode__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:2661:1: ( ( 'outgoing' ) )
            // InternalActivityDiagramDsl.g:2662:1: ( 'outgoing' )
            {
            // InternalActivityDiagramDsl.g:2662:1: ( 'outgoing' )
            // InternalActivityDiagramDsl.g:2663:2: 'outgoing'
            {
             before(grammarAccess.getFinalNodeAccess().getOutgoingKeyword_5_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getFinalNodeAccess().getOutgoingKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FinalNode__Group_5__0__Impl"


    // $ANTLR start "rule__FinalNode__Group_5__1"
    // InternalActivityDiagramDsl.g:2672:1: rule__FinalNode__Group_5__1 : rule__FinalNode__Group_5__1__Impl rule__FinalNode__Group_5__2 ;
    public final void rule__FinalNode__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:2676:1: ( rule__FinalNode__Group_5__1__Impl rule__FinalNode__Group_5__2 )
            // InternalActivityDiagramDsl.g:2677:2: rule__FinalNode__Group_5__1__Impl rule__FinalNode__Group_5__2
            {
            pushFollow(FOLLOW_4);
            rule__FinalNode__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FinalNode__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FinalNode__Group_5__1"


    // $ANTLR start "rule__FinalNode__Group_5__1__Impl"
    // InternalActivityDiagramDsl.g:2684:1: rule__FinalNode__Group_5__1__Impl : ( '(' ) ;
    public final void rule__FinalNode__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:2688:1: ( ( '(' ) )
            // InternalActivityDiagramDsl.g:2689:1: ( '(' )
            {
            // InternalActivityDiagramDsl.g:2689:1: ( '(' )
            // InternalActivityDiagramDsl.g:2690:2: '('
            {
             before(grammarAccess.getFinalNodeAccess().getLeftParenthesisKeyword_5_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getFinalNodeAccess().getLeftParenthesisKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FinalNode__Group_5__1__Impl"


    // $ANTLR start "rule__FinalNode__Group_5__2"
    // InternalActivityDiagramDsl.g:2699:1: rule__FinalNode__Group_5__2 : rule__FinalNode__Group_5__2__Impl rule__FinalNode__Group_5__3 ;
    public final void rule__FinalNode__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:2703:1: ( rule__FinalNode__Group_5__2__Impl rule__FinalNode__Group_5__3 )
            // InternalActivityDiagramDsl.g:2704:2: rule__FinalNode__Group_5__2__Impl rule__FinalNode__Group_5__3
            {
            pushFollow(FOLLOW_18);
            rule__FinalNode__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FinalNode__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FinalNode__Group_5__2"


    // $ANTLR start "rule__FinalNode__Group_5__2__Impl"
    // InternalActivityDiagramDsl.g:2711:1: rule__FinalNode__Group_5__2__Impl : ( ( rule__FinalNode__OutgoingAssignment_5_2 ) ) ;
    public final void rule__FinalNode__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:2715:1: ( ( ( rule__FinalNode__OutgoingAssignment_5_2 ) ) )
            // InternalActivityDiagramDsl.g:2716:1: ( ( rule__FinalNode__OutgoingAssignment_5_2 ) )
            {
            // InternalActivityDiagramDsl.g:2716:1: ( ( rule__FinalNode__OutgoingAssignment_5_2 ) )
            // InternalActivityDiagramDsl.g:2717:2: ( rule__FinalNode__OutgoingAssignment_5_2 )
            {
             before(grammarAccess.getFinalNodeAccess().getOutgoingAssignment_5_2()); 
            // InternalActivityDiagramDsl.g:2718:2: ( rule__FinalNode__OutgoingAssignment_5_2 )
            // InternalActivityDiagramDsl.g:2718:3: rule__FinalNode__OutgoingAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__FinalNode__OutgoingAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getFinalNodeAccess().getOutgoingAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FinalNode__Group_5__2__Impl"


    // $ANTLR start "rule__FinalNode__Group_5__3"
    // InternalActivityDiagramDsl.g:2726:1: rule__FinalNode__Group_5__3 : rule__FinalNode__Group_5__3__Impl rule__FinalNode__Group_5__4 ;
    public final void rule__FinalNode__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:2730:1: ( rule__FinalNode__Group_5__3__Impl rule__FinalNode__Group_5__4 )
            // InternalActivityDiagramDsl.g:2731:2: rule__FinalNode__Group_5__3__Impl rule__FinalNode__Group_5__4
            {
            pushFollow(FOLLOW_18);
            rule__FinalNode__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FinalNode__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FinalNode__Group_5__3"


    // $ANTLR start "rule__FinalNode__Group_5__3__Impl"
    // InternalActivityDiagramDsl.g:2738:1: rule__FinalNode__Group_5__3__Impl : ( ( rule__FinalNode__Group_5_3__0 )* ) ;
    public final void rule__FinalNode__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:2742:1: ( ( ( rule__FinalNode__Group_5_3__0 )* ) )
            // InternalActivityDiagramDsl.g:2743:1: ( ( rule__FinalNode__Group_5_3__0 )* )
            {
            // InternalActivityDiagramDsl.g:2743:1: ( ( rule__FinalNode__Group_5_3__0 )* )
            // InternalActivityDiagramDsl.g:2744:2: ( rule__FinalNode__Group_5_3__0 )*
            {
             before(grammarAccess.getFinalNodeAccess().getGroup_5_3()); 
            // InternalActivityDiagramDsl.g:2745:2: ( rule__FinalNode__Group_5_3__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==17) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalActivityDiagramDsl.g:2745:3: rule__FinalNode__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__FinalNode__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getFinalNodeAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FinalNode__Group_5__3__Impl"


    // $ANTLR start "rule__FinalNode__Group_5__4"
    // InternalActivityDiagramDsl.g:2753:1: rule__FinalNode__Group_5__4 : rule__FinalNode__Group_5__4__Impl ;
    public final void rule__FinalNode__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:2757:1: ( rule__FinalNode__Group_5__4__Impl )
            // InternalActivityDiagramDsl.g:2758:2: rule__FinalNode__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FinalNode__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FinalNode__Group_5__4"


    // $ANTLR start "rule__FinalNode__Group_5__4__Impl"
    // InternalActivityDiagramDsl.g:2764:1: rule__FinalNode__Group_5__4__Impl : ( ')' ) ;
    public final void rule__FinalNode__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:2768:1: ( ( ')' ) )
            // InternalActivityDiagramDsl.g:2769:1: ( ')' )
            {
            // InternalActivityDiagramDsl.g:2769:1: ( ')' )
            // InternalActivityDiagramDsl.g:2770:2: ')'
            {
             before(grammarAccess.getFinalNodeAccess().getRightParenthesisKeyword_5_4()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getFinalNodeAccess().getRightParenthesisKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FinalNode__Group_5__4__Impl"


    // $ANTLR start "rule__FinalNode__Group_5_3__0"
    // InternalActivityDiagramDsl.g:2780:1: rule__FinalNode__Group_5_3__0 : rule__FinalNode__Group_5_3__0__Impl rule__FinalNode__Group_5_3__1 ;
    public final void rule__FinalNode__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:2784:1: ( rule__FinalNode__Group_5_3__0__Impl rule__FinalNode__Group_5_3__1 )
            // InternalActivityDiagramDsl.g:2785:2: rule__FinalNode__Group_5_3__0__Impl rule__FinalNode__Group_5_3__1
            {
            pushFollow(FOLLOW_4);
            rule__FinalNode__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FinalNode__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FinalNode__Group_5_3__0"


    // $ANTLR start "rule__FinalNode__Group_5_3__0__Impl"
    // InternalActivityDiagramDsl.g:2792:1: rule__FinalNode__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__FinalNode__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:2796:1: ( ( ',' ) )
            // InternalActivityDiagramDsl.g:2797:1: ( ',' )
            {
            // InternalActivityDiagramDsl.g:2797:1: ( ',' )
            // InternalActivityDiagramDsl.g:2798:2: ','
            {
             before(grammarAccess.getFinalNodeAccess().getCommaKeyword_5_3_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getFinalNodeAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FinalNode__Group_5_3__0__Impl"


    // $ANTLR start "rule__FinalNode__Group_5_3__1"
    // InternalActivityDiagramDsl.g:2807:1: rule__FinalNode__Group_5_3__1 : rule__FinalNode__Group_5_3__1__Impl ;
    public final void rule__FinalNode__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:2811:1: ( rule__FinalNode__Group_5_3__1__Impl )
            // InternalActivityDiagramDsl.g:2812:2: rule__FinalNode__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FinalNode__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FinalNode__Group_5_3__1"


    // $ANTLR start "rule__FinalNode__Group_5_3__1__Impl"
    // InternalActivityDiagramDsl.g:2818:1: rule__FinalNode__Group_5_3__1__Impl : ( ( rule__FinalNode__OutgoingAssignment_5_3_1 ) ) ;
    public final void rule__FinalNode__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:2822:1: ( ( ( rule__FinalNode__OutgoingAssignment_5_3_1 ) ) )
            // InternalActivityDiagramDsl.g:2823:1: ( ( rule__FinalNode__OutgoingAssignment_5_3_1 ) )
            {
            // InternalActivityDiagramDsl.g:2823:1: ( ( rule__FinalNode__OutgoingAssignment_5_3_1 ) )
            // InternalActivityDiagramDsl.g:2824:2: ( rule__FinalNode__OutgoingAssignment_5_3_1 )
            {
             before(grammarAccess.getFinalNodeAccess().getOutgoingAssignment_5_3_1()); 
            // InternalActivityDiagramDsl.g:2825:2: ( rule__FinalNode__OutgoingAssignment_5_3_1 )
            // InternalActivityDiagramDsl.g:2825:3: rule__FinalNode__OutgoingAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__FinalNode__OutgoingAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getFinalNodeAccess().getOutgoingAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FinalNode__Group_5_3__1__Impl"


    // $ANTLR start "rule__Transition__Group__0"
    // InternalActivityDiagramDsl.g:2834:1: rule__Transition__Group__0 : rule__Transition__Group__0__Impl rule__Transition__Group__1 ;
    public final void rule__Transition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:2838:1: ( rule__Transition__Group__0__Impl rule__Transition__Group__1 )
            // InternalActivityDiagramDsl.g:2839:2: rule__Transition__Group__0__Impl rule__Transition__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Transition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__0"


    // $ANTLR start "rule__Transition__Group__0__Impl"
    // InternalActivityDiagramDsl.g:2846:1: rule__Transition__Group__0__Impl : ( () ) ;
    public final void rule__Transition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:2850:1: ( ( () ) )
            // InternalActivityDiagramDsl.g:2851:1: ( () )
            {
            // InternalActivityDiagramDsl.g:2851:1: ( () )
            // InternalActivityDiagramDsl.g:2852:2: ()
            {
             before(grammarAccess.getTransitionAccess().getTransitionAction_0()); 
            // InternalActivityDiagramDsl.g:2853:2: ()
            // InternalActivityDiagramDsl.g:2853:3: 
            {
            }

             after(grammarAccess.getTransitionAccess().getTransitionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__0__Impl"


    // $ANTLR start "rule__Transition__Group__1"
    // InternalActivityDiagramDsl.g:2861:1: rule__Transition__Group__1 : rule__Transition__Group__1__Impl rule__Transition__Group__2 ;
    public final void rule__Transition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:2865:1: ( rule__Transition__Group__1__Impl rule__Transition__Group__2 )
            // InternalActivityDiagramDsl.g:2866:2: rule__Transition__Group__1__Impl rule__Transition__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Transition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__1"


    // $ANTLR start "rule__Transition__Group__1__Impl"
    // InternalActivityDiagramDsl.g:2873:1: rule__Transition__Group__1__Impl : ( 'Transition' ) ;
    public final void rule__Transition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:2877:1: ( ( 'Transition' ) )
            // InternalActivityDiagramDsl.g:2878:1: ( 'Transition' )
            {
            // InternalActivityDiagramDsl.g:2878:1: ( 'Transition' )
            // InternalActivityDiagramDsl.g:2879:2: 'Transition'
            {
             before(grammarAccess.getTransitionAccess().getTransitionKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getTransitionKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__1__Impl"


    // $ANTLR start "rule__Transition__Group__2"
    // InternalActivityDiagramDsl.g:2888:1: rule__Transition__Group__2 : rule__Transition__Group__2__Impl rule__Transition__Group__3 ;
    public final void rule__Transition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:2892:1: ( rule__Transition__Group__2__Impl rule__Transition__Group__3 )
            // InternalActivityDiagramDsl.g:2893:2: rule__Transition__Group__2__Impl rule__Transition__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Transition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__2"


    // $ANTLR start "rule__Transition__Group__2__Impl"
    // InternalActivityDiagramDsl.g:2900:1: rule__Transition__Group__2__Impl : ( ( rule__Transition__NameAssignment_2 ) ) ;
    public final void rule__Transition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:2904:1: ( ( ( rule__Transition__NameAssignment_2 ) ) )
            // InternalActivityDiagramDsl.g:2905:1: ( ( rule__Transition__NameAssignment_2 ) )
            {
            // InternalActivityDiagramDsl.g:2905:1: ( ( rule__Transition__NameAssignment_2 ) )
            // InternalActivityDiagramDsl.g:2906:2: ( rule__Transition__NameAssignment_2 )
            {
             before(grammarAccess.getTransitionAccess().getNameAssignment_2()); 
            // InternalActivityDiagramDsl.g:2907:2: ( rule__Transition__NameAssignment_2 )
            // InternalActivityDiagramDsl.g:2907:3: rule__Transition__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Transition__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__2__Impl"


    // $ANTLR start "rule__Transition__Group__3"
    // InternalActivityDiagramDsl.g:2915:1: rule__Transition__Group__3 : rule__Transition__Group__3__Impl rule__Transition__Group__4 ;
    public final void rule__Transition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:2919:1: ( rule__Transition__Group__3__Impl rule__Transition__Group__4 )
            // InternalActivityDiagramDsl.g:2920:2: rule__Transition__Group__3__Impl rule__Transition__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__Transition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__3"


    // $ANTLR start "rule__Transition__Group__3__Impl"
    // InternalActivityDiagramDsl.g:2927:1: rule__Transition__Group__3__Impl : ( '{' ) ;
    public final void rule__Transition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:2931:1: ( ( '{' ) )
            // InternalActivityDiagramDsl.g:2932:1: ( '{' )
            {
            // InternalActivityDiagramDsl.g:2932:1: ( '{' )
            // InternalActivityDiagramDsl.g:2933:2: '{'
            {
             before(grammarAccess.getTransitionAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__3__Impl"


    // $ANTLR start "rule__Transition__Group__4"
    // InternalActivityDiagramDsl.g:2942:1: rule__Transition__Group__4 : rule__Transition__Group__4__Impl rule__Transition__Group__5 ;
    public final void rule__Transition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:2946:1: ( rule__Transition__Group__4__Impl rule__Transition__Group__5 )
            // InternalActivityDiagramDsl.g:2947:2: rule__Transition__Group__4__Impl rule__Transition__Group__5
            {
            pushFollow(FOLLOW_19);
            rule__Transition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__4"


    // $ANTLR start "rule__Transition__Group__4__Impl"
    // InternalActivityDiagramDsl.g:2954:1: rule__Transition__Group__4__Impl : ( ( rule__Transition__Group_4__0 )? ) ;
    public final void rule__Transition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:2958:1: ( ( ( rule__Transition__Group_4__0 )? ) )
            // InternalActivityDiagramDsl.g:2959:1: ( ( rule__Transition__Group_4__0 )? )
            {
            // InternalActivityDiagramDsl.g:2959:1: ( ( rule__Transition__Group_4__0 )? )
            // InternalActivityDiagramDsl.g:2960:2: ( rule__Transition__Group_4__0 )?
            {
             before(grammarAccess.getTransitionAccess().getGroup_4()); 
            // InternalActivityDiagramDsl.g:2961:2: ( rule__Transition__Group_4__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==29) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalActivityDiagramDsl.g:2961:3: rule__Transition__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Transition__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTransitionAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__4__Impl"


    // $ANTLR start "rule__Transition__Group__5"
    // InternalActivityDiagramDsl.g:2969:1: rule__Transition__Group__5 : rule__Transition__Group__5__Impl rule__Transition__Group__6 ;
    public final void rule__Transition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:2973:1: ( rule__Transition__Group__5__Impl rule__Transition__Group__6 )
            // InternalActivityDiagramDsl.g:2974:2: rule__Transition__Group__5__Impl rule__Transition__Group__6
            {
            pushFollow(FOLLOW_19);
            rule__Transition__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__5"


    // $ANTLR start "rule__Transition__Group__5__Impl"
    // InternalActivityDiagramDsl.g:2981:1: rule__Transition__Group__5__Impl : ( ( rule__Transition__Group_5__0 )? ) ;
    public final void rule__Transition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:2985:1: ( ( ( rule__Transition__Group_5__0 )? ) )
            // InternalActivityDiagramDsl.g:2986:1: ( ( rule__Transition__Group_5__0 )? )
            {
            // InternalActivityDiagramDsl.g:2986:1: ( ( rule__Transition__Group_5__0 )? )
            // InternalActivityDiagramDsl.g:2987:2: ( rule__Transition__Group_5__0 )?
            {
             before(grammarAccess.getTransitionAccess().getGroup_5()); 
            // InternalActivityDiagramDsl.g:2988:2: ( rule__Transition__Group_5__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==30) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalActivityDiagramDsl.g:2988:3: rule__Transition__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Transition__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTransitionAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__5__Impl"


    // $ANTLR start "rule__Transition__Group__6"
    // InternalActivityDiagramDsl.g:2996:1: rule__Transition__Group__6 : rule__Transition__Group__6__Impl ;
    public final void rule__Transition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:3000:1: ( rule__Transition__Group__6__Impl )
            // InternalActivityDiagramDsl.g:3001:2: rule__Transition__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__6"


    // $ANTLR start "rule__Transition__Group__6__Impl"
    // InternalActivityDiagramDsl.g:3007:1: rule__Transition__Group__6__Impl : ( '}' ) ;
    public final void rule__Transition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:3011:1: ( ( '}' ) )
            // InternalActivityDiagramDsl.g:3012:1: ( '}' )
            {
            // InternalActivityDiagramDsl.g:3012:1: ( '}' )
            // InternalActivityDiagramDsl.g:3013:2: '}'
            {
             before(grammarAccess.getTransitionAccess().getRightCurlyBracketKeyword_6()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__6__Impl"


    // $ANTLR start "rule__Transition__Group_4__0"
    // InternalActivityDiagramDsl.g:3023:1: rule__Transition__Group_4__0 : rule__Transition__Group_4__0__Impl rule__Transition__Group_4__1 ;
    public final void rule__Transition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:3027:1: ( rule__Transition__Group_4__0__Impl rule__Transition__Group_4__1 )
            // InternalActivityDiagramDsl.g:3028:2: rule__Transition__Group_4__0__Impl rule__Transition__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__Transition__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_4__0"


    // $ANTLR start "rule__Transition__Group_4__0__Impl"
    // InternalActivityDiagramDsl.g:3035:1: rule__Transition__Group_4__0__Impl : ( 'target' ) ;
    public final void rule__Transition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:3039:1: ( ( 'target' ) )
            // InternalActivityDiagramDsl.g:3040:1: ( 'target' )
            {
            // InternalActivityDiagramDsl.g:3040:1: ( 'target' )
            // InternalActivityDiagramDsl.g:3041:2: 'target'
            {
             before(grammarAccess.getTransitionAccess().getTargetKeyword_4_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getTargetKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_4__0__Impl"


    // $ANTLR start "rule__Transition__Group_4__1"
    // InternalActivityDiagramDsl.g:3050:1: rule__Transition__Group_4__1 : rule__Transition__Group_4__1__Impl ;
    public final void rule__Transition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:3054:1: ( rule__Transition__Group_4__1__Impl )
            // InternalActivityDiagramDsl.g:3055:2: rule__Transition__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_4__1"


    // $ANTLR start "rule__Transition__Group_4__1__Impl"
    // InternalActivityDiagramDsl.g:3061:1: rule__Transition__Group_4__1__Impl : ( ( rule__Transition__TargetAssignment_4_1 ) ) ;
    public final void rule__Transition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:3065:1: ( ( ( rule__Transition__TargetAssignment_4_1 ) ) )
            // InternalActivityDiagramDsl.g:3066:1: ( ( rule__Transition__TargetAssignment_4_1 ) )
            {
            // InternalActivityDiagramDsl.g:3066:1: ( ( rule__Transition__TargetAssignment_4_1 ) )
            // InternalActivityDiagramDsl.g:3067:2: ( rule__Transition__TargetAssignment_4_1 )
            {
             before(grammarAccess.getTransitionAccess().getTargetAssignment_4_1()); 
            // InternalActivityDiagramDsl.g:3068:2: ( rule__Transition__TargetAssignment_4_1 )
            // InternalActivityDiagramDsl.g:3068:3: rule__Transition__TargetAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Transition__TargetAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getTargetAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_4__1__Impl"


    // $ANTLR start "rule__Transition__Group_5__0"
    // InternalActivityDiagramDsl.g:3077:1: rule__Transition__Group_5__0 : rule__Transition__Group_5__0__Impl rule__Transition__Group_5__1 ;
    public final void rule__Transition__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:3081:1: ( rule__Transition__Group_5__0__Impl rule__Transition__Group_5__1 )
            // InternalActivityDiagramDsl.g:3082:2: rule__Transition__Group_5__0__Impl rule__Transition__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__Transition__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_5__0"


    // $ANTLR start "rule__Transition__Group_5__0__Impl"
    // InternalActivityDiagramDsl.g:3089:1: rule__Transition__Group_5__0__Impl : ( 'source' ) ;
    public final void rule__Transition__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:3093:1: ( ( 'source' ) )
            // InternalActivityDiagramDsl.g:3094:1: ( 'source' )
            {
            // InternalActivityDiagramDsl.g:3094:1: ( 'source' )
            // InternalActivityDiagramDsl.g:3095:2: 'source'
            {
             before(grammarAccess.getTransitionAccess().getSourceKeyword_5_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getSourceKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_5__0__Impl"


    // $ANTLR start "rule__Transition__Group_5__1"
    // InternalActivityDiagramDsl.g:3104:1: rule__Transition__Group_5__1 : rule__Transition__Group_5__1__Impl ;
    public final void rule__Transition__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:3108:1: ( rule__Transition__Group_5__1__Impl )
            // InternalActivityDiagramDsl.g:3109:2: rule__Transition__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_5__1"


    // $ANTLR start "rule__Transition__Group_5__1__Impl"
    // InternalActivityDiagramDsl.g:3115:1: rule__Transition__Group_5__1__Impl : ( ( rule__Transition__SourceAssignment_5_1 ) ) ;
    public final void rule__Transition__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:3119:1: ( ( ( rule__Transition__SourceAssignment_5_1 ) ) )
            // InternalActivityDiagramDsl.g:3120:1: ( ( rule__Transition__SourceAssignment_5_1 ) )
            {
            // InternalActivityDiagramDsl.g:3120:1: ( ( rule__Transition__SourceAssignment_5_1 ) )
            // InternalActivityDiagramDsl.g:3121:2: ( rule__Transition__SourceAssignment_5_1 )
            {
             before(grammarAccess.getTransitionAccess().getSourceAssignment_5_1()); 
            // InternalActivityDiagramDsl.g:3122:2: ( rule__Transition__SourceAssignment_5_1 )
            // InternalActivityDiagramDsl.g:3122:3: rule__Transition__SourceAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Transition__SourceAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getSourceAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_5__1__Impl"


    // $ANTLR start "rule__ActivityNode__Group__0"
    // InternalActivityDiagramDsl.g:3131:1: rule__ActivityNode__Group__0 : rule__ActivityNode__Group__0__Impl rule__ActivityNode__Group__1 ;
    public final void rule__ActivityNode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:3135:1: ( rule__ActivityNode__Group__0__Impl rule__ActivityNode__Group__1 )
            // InternalActivityDiagramDsl.g:3136:2: rule__ActivityNode__Group__0__Impl rule__ActivityNode__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__ActivityNode__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivityNode__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityNode__Group__0"


    // $ANTLR start "rule__ActivityNode__Group__0__Impl"
    // InternalActivityDiagramDsl.g:3143:1: rule__ActivityNode__Group__0__Impl : ( () ) ;
    public final void rule__ActivityNode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:3147:1: ( ( () ) )
            // InternalActivityDiagramDsl.g:3148:1: ( () )
            {
            // InternalActivityDiagramDsl.g:3148:1: ( () )
            // InternalActivityDiagramDsl.g:3149:2: ()
            {
             before(grammarAccess.getActivityNodeAccess().getActivityNodeAction_0()); 
            // InternalActivityDiagramDsl.g:3150:2: ()
            // InternalActivityDiagramDsl.g:3150:3: 
            {
            }

             after(grammarAccess.getActivityNodeAccess().getActivityNodeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityNode__Group__0__Impl"


    // $ANTLR start "rule__ActivityNode__Group__1"
    // InternalActivityDiagramDsl.g:3158:1: rule__ActivityNode__Group__1 : rule__ActivityNode__Group__1__Impl rule__ActivityNode__Group__2 ;
    public final void rule__ActivityNode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:3162:1: ( rule__ActivityNode__Group__1__Impl rule__ActivityNode__Group__2 )
            // InternalActivityDiagramDsl.g:3163:2: rule__ActivityNode__Group__1__Impl rule__ActivityNode__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ActivityNode__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivityNode__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityNode__Group__1"


    // $ANTLR start "rule__ActivityNode__Group__1__Impl"
    // InternalActivityDiagramDsl.g:3170:1: rule__ActivityNode__Group__1__Impl : ( 'ActivityNode' ) ;
    public final void rule__ActivityNode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:3174:1: ( ( 'ActivityNode' ) )
            // InternalActivityDiagramDsl.g:3175:1: ( 'ActivityNode' )
            {
            // InternalActivityDiagramDsl.g:3175:1: ( 'ActivityNode' )
            // InternalActivityDiagramDsl.g:3176:2: 'ActivityNode'
            {
             before(grammarAccess.getActivityNodeAccess().getActivityNodeKeyword_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getActivityNodeAccess().getActivityNodeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityNode__Group__1__Impl"


    // $ANTLR start "rule__ActivityNode__Group__2"
    // InternalActivityDiagramDsl.g:3185:1: rule__ActivityNode__Group__2 : rule__ActivityNode__Group__2__Impl rule__ActivityNode__Group__3 ;
    public final void rule__ActivityNode__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:3189:1: ( rule__ActivityNode__Group__2__Impl rule__ActivityNode__Group__3 )
            // InternalActivityDiagramDsl.g:3190:2: rule__ActivityNode__Group__2__Impl rule__ActivityNode__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__ActivityNode__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivityNode__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityNode__Group__2"


    // $ANTLR start "rule__ActivityNode__Group__2__Impl"
    // InternalActivityDiagramDsl.g:3197:1: rule__ActivityNode__Group__2__Impl : ( ( rule__ActivityNode__NameAssignment_2 ) ) ;
    public final void rule__ActivityNode__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:3201:1: ( ( ( rule__ActivityNode__NameAssignment_2 ) ) )
            // InternalActivityDiagramDsl.g:3202:1: ( ( rule__ActivityNode__NameAssignment_2 ) )
            {
            // InternalActivityDiagramDsl.g:3202:1: ( ( rule__ActivityNode__NameAssignment_2 ) )
            // InternalActivityDiagramDsl.g:3203:2: ( rule__ActivityNode__NameAssignment_2 )
            {
             before(grammarAccess.getActivityNodeAccess().getNameAssignment_2()); 
            // InternalActivityDiagramDsl.g:3204:2: ( rule__ActivityNode__NameAssignment_2 )
            // InternalActivityDiagramDsl.g:3204:3: rule__ActivityNode__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ActivityNode__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getActivityNodeAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityNode__Group__2__Impl"


    // $ANTLR start "rule__ActivityNode__Group__3"
    // InternalActivityDiagramDsl.g:3212:1: rule__ActivityNode__Group__3 : rule__ActivityNode__Group__3__Impl rule__ActivityNode__Group__4 ;
    public final void rule__ActivityNode__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:3216:1: ( rule__ActivityNode__Group__3__Impl rule__ActivityNode__Group__4 )
            // InternalActivityDiagramDsl.g:3217:2: rule__ActivityNode__Group__3__Impl rule__ActivityNode__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__ActivityNode__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivityNode__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityNode__Group__3"


    // $ANTLR start "rule__ActivityNode__Group__3__Impl"
    // InternalActivityDiagramDsl.g:3224:1: rule__ActivityNode__Group__3__Impl : ( '{' ) ;
    public final void rule__ActivityNode__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:3228:1: ( ( '{' ) )
            // InternalActivityDiagramDsl.g:3229:1: ( '{' )
            {
            // InternalActivityDiagramDsl.g:3229:1: ( '{' )
            // InternalActivityDiagramDsl.g:3230:2: '{'
            {
             before(grammarAccess.getActivityNodeAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getActivityNodeAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityNode__Group__3__Impl"


    // $ANTLR start "rule__ActivityNode__Group__4"
    // InternalActivityDiagramDsl.g:3239:1: rule__ActivityNode__Group__4 : rule__ActivityNode__Group__4__Impl rule__ActivityNode__Group__5 ;
    public final void rule__ActivityNode__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:3243:1: ( rule__ActivityNode__Group__4__Impl rule__ActivityNode__Group__5 )
            // InternalActivityDiagramDsl.g:3244:2: rule__ActivityNode__Group__4__Impl rule__ActivityNode__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__ActivityNode__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivityNode__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityNode__Group__4"


    // $ANTLR start "rule__ActivityNode__Group__4__Impl"
    // InternalActivityDiagramDsl.g:3251:1: rule__ActivityNode__Group__4__Impl : ( ( rule__ActivityNode__Group_4__0 )? ) ;
    public final void rule__ActivityNode__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:3255:1: ( ( ( rule__ActivityNode__Group_4__0 )? ) )
            // InternalActivityDiagramDsl.g:3256:1: ( ( rule__ActivityNode__Group_4__0 )? )
            {
            // InternalActivityDiagramDsl.g:3256:1: ( ( rule__ActivityNode__Group_4__0 )? )
            // InternalActivityDiagramDsl.g:3257:2: ( rule__ActivityNode__Group_4__0 )?
            {
             before(grammarAccess.getActivityNodeAccess().getGroup_4()); 
            // InternalActivityDiagramDsl.g:3258:2: ( rule__ActivityNode__Group_4__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==23) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalActivityDiagramDsl.g:3258:3: rule__ActivityNode__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ActivityNode__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActivityNodeAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityNode__Group__4__Impl"


    // $ANTLR start "rule__ActivityNode__Group__5"
    // InternalActivityDiagramDsl.g:3266:1: rule__ActivityNode__Group__5 : rule__ActivityNode__Group__5__Impl rule__ActivityNode__Group__6 ;
    public final void rule__ActivityNode__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:3270:1: ( rule__ActivityNode__Group__5__Impl rule__ActivityNode__Group__6 )
            // InternalActivityDiagramDsl.g:3271:2: rule__ActivityNode__Group__5__Impl rule__ActivityNode__Group__6
            {
            pushFollow(FOLLOW_16);
            rule__ActivityNode__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivityNode__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityNode__Group__5"


    // $ANTLR start "rule__ActivityNode__Group__5__Impl"
    // InternalActivityDiagramDsl.g:3278:1: rule__ActivityNode__Group__5__Impl : ( ( rule__ActivityNode__Group_5__0 )? ) ;
    public final void rule__ActivityNode__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:3282:1: ( ( ( rule__ActivityNode__Group_5__0 )? ) )
            // InternalActivityDiagramDsl.g:3283:1: ( ( rule__ActivityNode__Group_5__0 )? )
            {
            // InternalActivityDiagramDsl.g:3283:1: ( ( rule__ActivityNode__Group_5__0 )? )
            // InternalActivityDiagramDsl.g:3284:2: ( rule__ActivityNode__Group_5__0 )?
            {
             before(grammarAccess.getActivityNodeAccess().getGroup_5()); 
            // InternalActivityDiagramDsl.g:3285:2: ( rule__ActivityNode__Group_5__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==26) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalActivityDiagramDsl.g:3285:3: rule__ActivityNode__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ActivityNode__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActivityNodeAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityNode__Group__5__Impl"


    // $ANTLR start "rule__ActivityNode__Group__6"
    // InternalActivityDiagramDsl.g:3293:1: rule__ActivityNode__Group__6 : rule__ActivityNode__Group__6__Impl ;
    public final void rule__ActivityNode__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:3297:1: ( rule__ActivityNode__Group__6__Impl )
            // InternalActivityDiagramDsl.g:3298:2: rule__ActivityNode__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ActivityNode__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityNode__Group__6"


    // $ANTLR start "rule__ActivityNode__Group__6__Impl"
    // InternalActivityDiagramDsl.g:3304:1: rule__ActivityNode__Group__6__Impl : ( '}' ) ;
    public final void rule__ActivityNode__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:3308:1: ( ( '}' ) )
            // InternalActivityDiagramDsl.g:3309:1: ( '}' )
            {
            // InternalActivityDiagramDsl.g:3309:1: ( '}' )
            // InternalActivityDiagramDsl.g:3310:2: '}'
            {
             before(grammarAccess.getActivityNodeAccess().getRightCurlyBracketKeyword_6()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getActivityNodeAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityNode__Group__6__Impl"


    // $ANTLR start "rule__ActivityNode__Group_4__0"
    // InternalActivityDiagramDsl.g:3320:1: rule__ActivityNode__Group_4__0 : rule__ActivityNode__Group_4__0__Impl rule__ActivityNode__Group_4__1 ;
    public final void rule__ActivityNode__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:3324:1: ( rule__ActivityNode__Group_4__0__Impl rule__ActivityNode__Group_4__1 )
            // InternalActivityDiagramDsl.g:3325:2: rule__ActivityNode__Group_4__0__Impl rule__ActivityNode__Group_4__1
            {
            pushFollow(FOLLOW_17);
            rule__ActivityNode__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivityNode__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityNode__Group_4__0"


    // $ANTLR start "rule__ActivityNode__Group_4__0__Impl"
    // InternalActivityDiagramDsl.g:3332:1: rule__ActivityNode__Group_4__0__Impl : ( 'incoming' ) ;
    public final void rule__ActivityNode__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:3336:1: ( ( 'incoming' ) )
            // InternalActivityDiagramDsl.g:3337:1: ( 'incoming' )
            {
            // InternalActivityDiagramDsl.g:3337:1: ( 'incoming' )
            // InternalActivityDiagramDsl.g:3338:2: 'incoming'
            {
             before(grammarAccess.getActivityNodeAccess().getIncomingKeyword_4_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getActivityNodeAccess().getIncomingKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityNode__Group_4__0__Impl"


    // $ANTLR start "rule__ActivityNode__Group_4__1"
    // InternalActivityDiagramDsl.g:3347:1: rule__ActivityNode__Group_4__1 : rule__ActivityNode__Group_4__1__Impl rule__ActivityNode__Group_4__2 ;
    public final void rule__ActivityNode__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:3351:1: ( rule__ActivityNode__Group_4__1__Impl rule__ActivityNode__Group_4__2 )
            // InternalActivityDiagramDsl.g:3352:2: rule__ActivityNode__Group_4__1__Impl rule__ActivityNode__Group_4__2
            {
            pushFollow(FOLLOW_4);
            rule__ActivityNode__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivityNode__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityNode__Group_4__1"


    // $ANTLR start "rule__ActivityNode__Group_4__1__Impl"
    // InternalActivityDiagramDsl.g:3359:1: rule__ActivityNode__Group_4__1__Impl : ( '(' ) ;
    public final void rule__ActivityNode__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:3363:1: ( ( '(' ) )
            // InternalActivityDiagramDsl.g:3364:1: ( '(' )
            {
            // InternalActivityDiagramDsl.g:3364:1: ( '(' )
            // InternalActivityDiagramDsl.g:3365:2: '('
            {
             before(grammarAccess.getActivityNodeAccess().getLeftParenthesisKeyword_4_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getActivityNodeAccess().getLeftParenthesisKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityNode__Group_4__1__Impl"


    // $ANTLR start "rule__ActivityNode__Group_4__2"
    // InternalActivityDiagramDsl.g:3374:1: rule__ActivityNode__Group_4__2 : rule__ActivityNode__Group_4__2__Impl rule__ActivityNode__Group_4__3 ;
    public final void rule__ActivityNode__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:3378:1: ( rule__ActivityNode__Group_4__2__Impl rule__ActivityNode__Group_4__3 )
            // InternalActivityDiagramDsl.g:3379:2: rule__ActivityNode__Group_4__2__Impl rule__ActivityNode__Group_4__3
            {
            pushFollow(FOLLOW_18);
            rule__ActivityNode__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivityNode__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityNode__Group_4__2"


    // $ANTLR start "rule__ActivityNode__Group_4__2__Impl"
    // InternalActivityDiagramDsl.g:3386:1: rule__ActivityNode__Group_4__2__Impl : ( ( rule__ActivityNode__IncomingAssignment_4_2 ) ) ;
    public final void rule__ActivityNode__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:3390:1: ( ( ( rule__ActivityNode__IncomingAssignment_4_2 ) ) )
            // InternalActivityDiagramDsl.g:3391:1: ( ( rule__ActivityNode__IncomingAssignment_4_2 ) )
            {
            // InternalActivityDiagramDsl.g:3391:1: ( ( rule__ActivityNode__IncomingAssignment_4_2 ) )
            // InternalActivityDiagramDsl.g:3392:2: ( rule__ActivityNode__IncomingAssignment_4_2 )
            {
             before(grammarAccess.getActivityNodeAccess().getIncomingAssignment_4_2()); 
            // InternalActivityDiagramDsl.g:3393:2: ( rule__ActivityNode__IncomingAssignment_4_2 )
            // InternalActivityDiagramDsl.g:3393:3: rule__ActivityNode__IncomingAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__ActivityNode__IncomingAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getActivityNodeAccess().getIncomingAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityNode__Group_4__2__Impl"


    // $ANTLR start "rule__ActivityNode__Group_4__3"
    // InternalActivityDiagramDsl.g:3401:1: rule__ActivityNode__Group_4__3 : rule__ActivityNode__Group_4__3__Impl rule__ActivityNode__Group_4__4 ;
    public final void rule__ActivityNode__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:3405:1: ( rule__ActivityNode__Group_4__3__Impl rule__ActivityNode__Group_4__4 )
            // InternalActivityDiagramDsl.g:3406:2: rule__ActivityNode__Group_4__3__Impl rule__ActivityNode__Group_4__4
            {
            pushFollow(FOLLOW_18);
            rule__ActivityNode__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivityNode__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityNode__Group_4__3"


    // $ANTLR start "rule__ActivityNode__Group_4__3__Impl"
    // InternalActivityDiagramDsl.g:3413:1: rule__ActivityNode__Group_4__3__Impl : ( ( rule__ActivityNode__Group_4_3__0 )* ) ;
    public final void rule__ActivityNode__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:3417:1: ( ( ( rule__ActivityNode__Group_4_3__0 )* ) )
            // InternalActivityDiagramDsl.g:3418:1: ( ( rule__ActivityNode__Group_4_3__0 )* )
            {
            // InternalActivityDiagramDsl.g:3418:1: ( ( rule__ActivityNode__Group_4_3__0 )* )
            // InternalActivityDiagramDsl.g:3419:2: ( rule__ActivityNode__Group_4_3__0 )*
            {
             before(grammarAccess.getActivityNodeAccess().getGroup_4_3()); 
            // InternalActivityDiagramDsl.g:3420:2: ( rule__ActivityNode__Group_4_3__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==17) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalActivityDiagramDsl.g:3420:3: rule__ActivityNode__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__ActivityNode__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getActivityNodeAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityNode__Group_4__3__Impl"


    // $ANTLR start "rule__ActivityNode__Group_4__4"
    // InternalActivityDiagramDsl.g:3428:1: rule__ActivityNode__Group_4__4 : rule__ActivityNode__Group_4__4__Impl ;
    public final void rule__ActivityNode__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:3432:1: ( rule__ActivityNode__Group_4__4__Impl )
            // InternalActivityDiagramDsl.g:3433:2: rule__ActivityNode__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ActivityNode__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityNode__Group_4__4"


    // $ANTLR start "rule__ActivityNode__Group_4__4__Impl"
    // InternalActivityDiagramDsl.g:3439:1: rule__ActivityNode__Group_4__4__Impl : ( ')' ) ;
    public final void rule__ActivityNode__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:3443:1: ( ( ')' ) )
            // InternalActivityDiagramDsl.g:3444:1: ( ')' )
            {
            // InternalActivityDiagramDsl.g:3444:1: ( ')' )
            // InternalActivityDiagramDsl.g:3445:2: ')'
            {
             before(grammarAccess.getActivityNodeAccess().getRightParenthesisKeyword_4_4()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getActivityNodeAccess().getRightParenthesisKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityNode__Group_4__4__Impl"


    // $ANTLR start "rule__ActivityNode__Group_4_3__0"
    // InternalActivityDiagramDsl.g:3455:1: rule__ActivityNode__Group_4_3__0 : rule__ActivityNode__Group_4_3__0__Impl rule__ActivityNode__Group_4_3__1 ;
    public final void rule__ActivityNode__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:3459:1: ( rule__ActivityNode__Group_4_3__0__Impl rule__ActivityNode__Group_4_3__1 )
            // InternalActivityDiagramDsl.g:3460:2: rule__ActivityNode__Group_4_3__0__Impl rule__ActivityNode__Group_4_3__1
            {
            pushFollow(FOLLOW_4);
            rule__ActivityNode__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivityNode__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityNode__Group_4_3__0"


    // $ANTLR start "rule__ActivityNode__Group_4_3__0__Impl"
    // InternalActivityDiagramDsl.g:3467:1: rule__ActivityNode__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__ActivityNode__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:3471:1: ( ( ',' ) )
            // InternalActivityDiagramDsl.g:3472:1: ( ',' )
            {
            // InternalActivityDiagramDsl.g:3472:1: ( ',' )
            // InternalActivityDiagramDsl.g:3473:2: ','
            {
             before(grammarAccess.getActivityNodeAccess().getCommaKeyword_4_3_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getActivityNodeAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityNode__Group_4_3__0__Impl"


    // $ANTLR start "rule__ActivityNode__Group_4_3__1"
    // InternalActivityDiagramDsl.g:3482:1: rule__ActivityNode__Group_4_3__1 : rule__ActivityNode__Group_4_3__1__Impl ;
    public final void rule__ActivityNode__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:3486:1: ( rule__ActivityNode__Group_4_3__1__Impl )
            // InternalActivityDiagramDsl.g:3487:2: rule__ActivityNode__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ActivityNode__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityNode__Group_4_3__1"


    // $ANTLR start "rule__ActivityNode__Group_4_3__1__Impl"
    // InternalActivityDiagramDsl.g:3493:1: rule__ActivityNode__Group_4_3__1__Impl : ( ( rule__ActivityNode__IncomingAssignment_4_3_1 ) ) ;
    public final void rule__ActivityNode__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:3497:1: ( ( ( rule__ActivityNode__IncomingAssignment_4_3_1 ) ) )
            // InternalActivityDiagramDsl.g:3498:1: ( ( rule__ActivityNode__IncomingAssignment_4_3_1 ) )
            {
            // InternalActivityDiagramDsl.g:3498:1: ( ( rule__ActivityNode__IncomingAssignment_4_3_1 ) )
            // InternalActivityDiagramDsl.g:3499:2: ( rule__ActivityNode__IncomingAssignment_4_3_1 )
            {
             before(grammarAccess.getActivityNodeAccess().getIncomingAssignment_4_3_1()); 
            // InternalActivityDiagramDsl.g:3500:2: ( rule__ActivityNode__IncomingAssignment_4_3_1 )
            // InternalActivityDiagramDsl.g:3500:3: rule__ActivityNode__IncomingAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ActivityNode__IncomingAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getActivityNodeAccess().getIncomingAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityNode__Group_4_3__1__Impl"


    // $ANTLR start "rule__ActivityNode__Group_5__0"
    // InternalActivityDiagramDsl.g:3509:1: rule__ActivityNode__Group_5__0 : rule__ActivityNode__Group_5__0__Impl rule__ActivityNode__Group_5__1 ;
    public final void rule__ActivityNode__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:3513:1: ( rule__ActivityNode__Group_5__0__Impl rule__ActivityNode__Group_5__1 )
            // InternalActivityDiagramDsl.g:3514:2: rule__ActivityNode__Group_5__0__Impl rule__ActivityNode__Group_5__1
            {
            pushFollow(FOLLOW_17);
            rule__ActivityNode__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivityNode__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityNode__Group_5__0"


    // $ANTLR start "rule__ActivityNode__Group_5__0__Impl"
    // InternalActivityDiagramDsl.g:3521:1: rule__ActivityNode__Group_5__0__Impl : ( 'outgoing' ) ;
    public final void rule__ActivityNode__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:3525:1: ( ( 'outgoing' ) )
            // InternalActivityDiagramDsl.g:3526:1: ( 'outgoing' )
            {
            // InternalActivityDiagramDsl.g:3526:1: ( 'outgoing' )
            // InternalActivityDiagramDsl.g:3527:2: 'outgoing'
            {
             before(grammarAccess.getActivityNodeAccess().getOutgoingKeyword_5_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getActivityNodeAccess().getOutgoingKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityNode__Group_5__0__Impl"


    // $ANTLR start "rule__ActivityNode__Group_5__1"
    // InternalActivityDiagramDsl.g:3536:1: rule__ActivityNode__Group_5__1 : rule__ActivityNode__Group_5__1__Impl rule__ActivityNode__Group_5__2 ;
    public final void rule__ActivityNode__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:3540:1: ( rule__ActivityNode__Group_5__1__Impl rule__ActivityNode__Group_5__2 )
            // InternalActivityDiagramDsl.g:3541:2: rule__ActivityNode__Group_5__1__Impl rule__ActivityNode__Group_5__2
            {
            pushFollow(FOLLOW_4);
            rule__ActivityNode__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivityNode__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityNode__Group_5__1"


    // $ANTLR start "rule__ActivityNode__Group_5__1__Impl"
    // InternalActivityDiagramDsl.g:3548:1: rule__ActivityNode__Group_5__1__Impl : ( '(' ) ;
    public final void rule__ActivityNode__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:3552:1: ( ( '(' ) )
            // InternalActivityDiagramDsl.g:3553:1: ( '(' )
            {
            // InternalActivityDiagramDsl.g:3553:1: ( '(' )
            // InternalActivityDiagramDsl.g:3554:2: '('
            {
             before(grammarAccess.getActivityNodeAccess().getLeftParenthesisKeyword_5_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getActivityNodeAccess().getLeftParenthesisKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityNode__Group_5__1__Impl"


    // $ANTLR start "rule__ActivityNode__Group_5__2"
    // InternalActivityDiagramDsl.g:3563:1: rule__ActivityNode__Group_5__2 : rule__ActivityNode__Group_5__2__Impl rule__ActivityNode__Group_5__3 ;
    public final void rule__ActivityNode__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:3567:1: ( rule__ActivityNode__Group_5__2__Impl rule__ActivityNode__Group_5__3 )
            // InternalActivityDiagramDsl.g:3568:2: rule__ActivityNode__Group_5__2__Impl rule__ActivityNode__Group_5__3
            {
            pushFollow(FOLLOW_18);
            rule__ActivityNode__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivityNode__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityNode__Group_5__2"


    // $ANTLR start "rule__ActivityNode__Group_5__2__Impl"
    // InternalActivityDiagramDsl.g:3575:1: rule__ActivityNode__Group_5__2__Impl : ( ( rule__ActivityNode__OutgoingAssignment_5_2 ) ) ;
    public final void rule__ActivityNode__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:3579:1: ( ( ( rule__ActivityNode__OutgoingAssignment_5_2 ) ) )
            // InternalActivityDiagramDsl.g:3580:1: ( ( rule__ActivityNode__OutgoingAssignment_5_2 ) )
            {
            // InternalActivityDiagramDsl.g:3580:1: ( ( rule__ActivityNode__OutgoingAssignment_5_2 ) )
            // InternalActivityDiagramDsl.g:3581:2: ( rule__ActivityNode__OutgoingAssignment_5_2 )
            {
             before(grammarAccess.getActivityNodeAccess().getOutgoingAssignment_5_2()); 
            // InternalActivityDiagramDsl.g:3582:2: ( rule__ActivityNode__OutgoingAssignment_5_2 )
            // InternalActivityDiagramDsl.g:3582:3: rule__ActivityNode__OutgoingAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__ActivityNode__OutgoingAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getActivityNodeAccess().getOutgoingAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityNode__Group_5__2__Impl"


    // $ANTLR start "rule__ActivityNode__Group_5__3"
    // InternalActivityDiagramDsl.g:3590:1: rule__ActivityNode__Group_5__3 : rule__ActivityNode__Group_5__3__Impl rule__ActivityNode__Group_5__4 ;
    public final void rule__ActivityNode__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:3594:1: ( rule__ActivityNode__Group_5__3__Impl rule__ActivityNode__Group_5__4 )
            // InternalActivityDiagramDsl.g:3595:2: rule__ActivityNode__Group_5__3__Impl rule__ActivityNode__Group_5__4
            {
            pushFollow(FOLLOW_18);
            rule__ActivityNode__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivityNode__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityNode__Group_5__3"


    // $ANTLR start "rule__ActivityNode__Group_5__3__Impl"
    // InternalActivityDiagramDsl.g:3602:1: rule__ActivityNode__Group_5__3__Impl : ( ( rule__ActivityNode__Group_5_3__0 )* ) ;
    public final void rule__ActivityNode__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:3606:1: ( ( ( rule__ActivityNode__Group_5_3__0 )* ) )
            // InternalActivityDiagramDsl.g:3607:1: ( ( rule__ActivityNode__Group_5_3__0 )* )
            {
            // InternalActivityDiagramDsl.g:3607:1: ( ( rule__ActivityNode__Group_5_3__0 )* )
            // InternalActivityDiagramDsl.g:3608:2: ( rule__ActivityNode__Group_5_3__0 )*
            {
             before(grammarAccess.getActivityNodeAccess().getGroup_5_3()); 
            // InternalActivityDiagramDsl.g:3609:2: ( rule__ActivityNode__Group_5_3__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==17) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalActivityDiagramDsl.g:3609:3: rule__ActivityNode__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__ActivityNode__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getActivityNodeAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityNode__Group_5__3__Impl"


    // $ANTLR start "rule__ActivityNode__Group_5__4"
    // InternalActivityDiagramDsl.g:3617:1: rule__ActivityNode__Group_5__4 : rule__ActivityNode__Group_5__4__Impl ;
    public final void rule__ActivityNode__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:3621:1: ( rule__ActivityNode__Group_5__4__Impl )
            // InternalActivityDiagramDsl.g:3622:2: rule__ActivityNode__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ActivityNode__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityNode__Group_5__4"


    // $ANTLR start "rule__ActivityNode__Group_5__4__Impl"
    // InternalActivityDiagramDsl.g:3628:1: rule__ActivityNode__Group_5__4__Impl : ( ')' ) ;
    public final void rule__ActivityNode__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:3632:1: ( ( ')' ) )
            // InternalActivityDiagramDsl.g:3633:1: ( ')' )
            {
            // InternalActivityDiagramDsl.g:3633:1: ( ')' )
            // InternalActivityDiagramDsl.g:3634:2: ')'
            {
             before(grammarAccess.getActivityNodeAccess().getRightParenthesisKeyword_5_4()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getActivityNodeAccess().getRightParenthesisKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityNode__Group_5__4__Impl"


    // $ANTLR start "rule__ActivityNode__Group_5_3__0"
    // InternalActivityDiagramDsl.g:3644:1: rule__ActivityNode__Group_5_3__0 : rule__ActivityNode__Group_5_3__0__Impl rule__ActivityNode__Group_5_3__1 ;
    public final void rule__ActivityNode__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:3648:1: ( rule__ActivityNode__Group_5_3__0__Impl rule__ActivityNode__Group_5_3__1 )
            // InternalActivityDiagramDsl.g:3649:2: rule__ActivityNode__Group_5_3__0__Impl rule__ActivityNode__Group_5_3__1
            {
            pushFollow(FOLLOW_4);
            rule__ActivityNode__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivityNode__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityNode__Group_5_3__0"


    // $ANTLR start "rule__ActivityNode__Group_5_3__0__Impl"
    // InternalActivityDiagramDsl.g:3656:1: rule__ActivityNode__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__ActivityNode__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:3660:1: ( ( ',' ) )
            // InternalActivityDiagramDsl.g:3661:1: ( ',' )
            {
            // InternalActivityDiagramDsl.g:3661:1: ( ',' )
            // InternalActivityDiagramDsl.g:3662:2: ','
            {
             before(grammarAccess.getActivityNodeAccess().getCommaKeyword_5_3_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getActivityNodeAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityNode__Group_5_3__0__Impl"


    // $ANTLR start "rule__ActivityNode__Group_5_3__1"
    // InternalActivityDiagramDsl.g:3671:1: rule__ActivityNode__Group_5_3__1 : rule__ActivityNode__Group_5_3__1__Impl ;
    public final void rule__ActivityNode__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:3675:1: ( rule__ActivityNode__Group_5_3__1__Impl )
            // InternalActivityDiagramDsl.g:3676:2: rule__ActivityNode__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ActivityNode__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityNode__Group_5_3__1"


    // $ANTLR start "rule__ActivityNode__Group_5_3__1__Impl"
    // InternalActivityDiagramDsl.g:3682:1: rule__ActivityNode__Group_5_3__1__Impl : ( ( rule__ActivityNode__OutgoingAssignment_5_3_1 ) ) ;
    public final void rule__ActivityNode__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:3686:1: ( ( ( rule__ActivityNode__OutgoingAssignment_5_3_1 ) ) )
            // InternalActivityDiagramDsl.g:3687:1: ( ( rule__ActivityNode__OutgoingAssignment_5_3_1 ) )
            {
            // InternalActivityDiagramDsl.g:3687:1: ( ( rule__ActivityNode__OutgoingAssignment_5_3_1 ) )
            // InternalActivityDiagramDsl.g:3688:2: ( rule__ActivityNode__OutgoingAssignment_5_3_1 )
            {
             before(grammarAccess.getActivityNodeAccess().getOutgoingAssignment_5_3_1()); 
            // InternalActivityDiagramDsl.g:3689:2: ( rule__ActivityNode__OutgoingAssignment_5_3_1 )
            // InternalActivityDiagramDsl.g:3689:3: rule__ActivityNode__OutgoingAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ActivityNode__OutgoingAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getActivityNodeAccess().getOutgoingAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityNode__Group_5_3__1__Impl"


    // $ANTLR start "rule__ForkNode__Group__0"
    // InternalActivityDiagramDsl.g:3698:1: rule__ForkNode__Group__0 : rule__ForkNode__Group__0__Impl rule__ForkNode__Group__1 ;
    public final void rule__ForkNode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:3702:1: ( rule__ForkNode__Group__0__Impl rule__ForkNode__Group__1 )
            // InternalActivityDiagramDsl.g:3703:2: rule__ForkNode__Group__0__Impl rule__ForkNode__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__ForkNode__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForkNode__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForkNode__Group__0"


    // $ANTLR start "rule__ForkNode__Group__0__Impl"
    // InternalActivityDiagramDsl.g:3710:1: rule__ForkNode__Group__0__Impl : ( () ) ;
    public final void rule__ForkNode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:3714:1: ( ( () ) )
            // InternalActivityDiagramDsl.g:3715:1: ( () )
            {
            // InternalActivityDiagramDsl.g:3715:1: ( () )
            // InternalActivityDiagramDsl.g:3716:2: ()
            {
             before(grammarAccess.getForkNodeAccess().getForkNodeAction_0()); 
            // InternalActivityDiagramDsl.g:3717:2: ()
            // InternalActivityDiagramDsl.g:3717:3: 
            {
            }

             after(grammarAccess.getForkNodeAccess().getForkNodeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForkNode__Group__0__Impl"


    // $ANTLR start "rule__ForkNode__Group__1"
    // InternalActivityDiagramDsl.g:3725:1: rule__ForkNode__Group__1 : rule__ForkNode__Group__1__Impl rule__ForkNode__Group__2 ;
    public final void rule__ForkNode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:3729:1: ( rule__ForkNode__Group__1__Impl rule__ForkNode__Group__2 )
            // InternalActivityDiagramDsl.g:3730:2: rule__ForkNode__Group__1__Impl rule__ForkNode__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ForkNode__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForkNode__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForkNode__Group__1"


    // $ANTLR start "rule__ForkNode__Group__1__Impl"
    // InternalActivityDiagramDsl.g:3737:1: rule__ForkNode__Group__1__Impl : ( 'ForkNode' ) ;
    public final void rule__ForkNode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:3741:1: ( ( 'ForkNode' ) )
            // InternalActivityDiagramDsl.g:3742:1: ( 'ForkNode' )
            {
            // InternalActivityDiagramDsl.g:3742:1: ( 'ForkNode' )
            // InternalActivityDiagramDsl.g:3743:2: 'ForkNode'
            {
             before(grammarAccess.getForkNodeAccess().getForkNodeKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getForkNodeAccess().getForkNodeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForkNode__Group__1__Impl"


    // $ANTLR start "rule__ForkNode__Group__2"
    // InternalActivityDiagramDsl.g:3752:1: rule__ForkNode__Group__2 : rule__ForkNode__Group__2__Impl rule__ForkNode__Group__3 ;
    public final void rule__ForkNode__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:3756:1: ( rule__ForkNode__Group__2__Impl rule__ForkNode__Group__3 )
            // InternalActivityDiagramDsl.g:3757:2: rule__ForkNode__Group__2__Impl rule__ForkNode__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__ForkNode__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForkNode__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForkNode__Group__2"


    // $ANTLR start "rule__ForkNode__Group__2__Impl"
    // InternalActivityDiagramDsl.g:3764:1: rule__ForkNode__Group__2__Impl : ( ( rule__ForkNode__NameAssignment_2 ) ) ;
    public final void rule__ForkNode__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:3768:1: ( ( ( rule__ForkNode__NameAssignment_2 ) ) )
            // InternalActivityDiagramDsl.g:3769:1: ( ( rule__ForkNode__NameAssignment_2 ) )
            {
            // InternalActivityDiagramDsl.g:3769:1: ( ( rule__ForkNode__NameAssignment_2 ) )
            // InternalActivityDiagramDsl.g:3770:2: ( rule__ForkNode__NameAssignment_2 )
            {
             before(grammarAccess.getForkNodeAccess().getNameAssignment_2()); 
            // InternalActivityDiagramDsl.g:3771:2: ( rule__ForkNode__NameAssignment_2 )
            // InternalActivityDiagramDsl.g:3771:3: rule__ForkNode__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ForkNode__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getForkNodeAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForkNode__Group__2__Impl"


    // $ANTLR start "rule__ForkNode__Group__3"
    // InternalActivityDiagramDsl.g:3779:1: rule__ForkNode__Group__3 : rule__ForkNode__Group__3__Impl rule__ForkNode__Group__4 ;
    public final void rule__ForkNode__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:3783:1: ( rule__ForkNode__Group__3__Impl rule__ForkNode__Group__4 )
            // InternalActivityDiagramDsl.g:3784:2: rule__ForkNode__Group__3__Impl rule__ForkNode__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__ForkNode__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForkNode__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForkNode__Group__3"


    // $ANTLR start "rule__ForkNode__Group__3__Impl"
    // InternalActivityDiagramDsl.g:3791:1: rule__ForkNode__Group__3__Impl : ( '{' ) ;
    public final void rule__ForkNode__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:3795:1: ( ( '{' ) )
            // InternalActivityDiagramDsl.g:3796:1: ( '{' )
            {
            // InternalActivityDiagramDsl.g:3796:1: ( '{' )
            // InternalActivityDiagramDsl.g:3797:2: '{'
            {
             before(grammarAccess.getForkNodeAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getForkNodeAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForkNode__Group__3__Impl"


    // $ANTLR start "rule__ForkNode__Group__4"
    // InternalActivityDiagramDsl.g:3806:1: rule__ForkNode__Group__4 : rule__ForkNode__Group__4__Impl rule__ForkNode__Group__5 ;
    public final void rule__ForkNode__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:3810:1: ( rule__ForkNode__Group__4__Impl rule__ForkNode__Group__5 )
            // InternalActivityDiagramDsl.g:3811:2: rule__ForkNode__Group__4__Impl rule__ForkNode__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__ForkNode__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForkNode__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForkNode__Group__4"


    // $ANTLR start "rule__ForkNode__Group__4__Impl"
    // InternalActivityDiagramDsl.g:3818:1: rule__ForkNode__Group__4__Impl : ( ( rule__ForkNode__Group_4__0 )? ) ;
    public final void rule__ForkNode__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:3822:1: ( ( ( rule__ForkNode__Group_4__0 )? ) )
            // InternalActivityDiagramDsl.g:3823:1: ( ( rule__ForkNode__Group_4__0 )? )
            {
            // InternalActivityDiagramDsl.g:3823:1: ( ( rule__ForkNode__Group_4__0 )? )
            // InternalActivityDiagramDsl.g:3824:2: ( rule__ForkNode__Group_4__0 )?
            {
             before(grammarAccess.getForkNodeAccess().getGroup_4()); 
            // InternalActivityDiagramDsl.g:3825:2: ( rule__ForkNode__Group_4__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==23) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalActivityDiagramDsl.g:3825:3: rule__ForkNode__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ForkNode__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getForkNodeAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForkNode__Group__4__Impl"


    // $ANTLR start "rule__ForkNode__Group__5"
    // InternalActivityDiagramDsl.g:3833:1: rule__ForkNode__Group__5 : rule__ForkNode__Group__5__Impl rule__ForkNode__Group__6 ;
    public final void rule__ForkNode__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:3837:1: ( rule__ForkNode__Group__5__Impl rule__ForkNode__Group__6 )
            // InternalActivityDiagramDsl.g:3838:2: rule__ForkNode__Group__5__Impl rule__ForkNode__Group__6
            {
            pushFollow(FOLLOW_16);
            rule__ForkNode__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForkNode__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForkNode__Group__5"


    // $ANTLR start "rule__ForkNode__Group__5__Impl"
    // InternalActivityDiagramDsl.g:3845:1: rule__ForkNode__Group__5__Impl : ( ( rule__ForkNode__Group_5__0 )? ) ;
    public final void rule__ForkNode__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:3849:1: ( ( ( rule__ForkNode__Group_5__0 )? ) )
            // InternalActivityDiagramDsl.g:3850:1: ( ( rule__ForkNode__Group_5__0 )? )
            {
            // InternalActivityDiagramDsl.g:3850:1: ( ( rule__ForkNode__Group_5__0 )? )
            // InternalActivityDiagramDsl.g:3851:2: ( rule__ForkNode__Group_5__0 )?
            {
             before(grammarAccess.getForkNodeAccess().getGroup_5()); 
            // InternalActivityDiagramDsl.g:3852:2: ( rule__ForkNode__Group_5__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==26) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalActivityDiagramDsl.g:3852:3: rule__ForkNode__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ForkNode__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getForkNodeAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForkNode__Group__5__Impl"


    // $ANTLR start "rule__ForkNode__Group__6"
    // InternalActivityDiagramDsl.g:3860:1: rule__ForkNode__Group__6 : rule__ForkNode__Group__6__Impl ;
    public final void rule__ForkNode__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:3864:1: ( rule__ForkNode__Group__6__Impl )
            // InternalActivityDiagramDsl.g:3865:2: rule__ForkNode__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ForkNode__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForkNode__Group__6"


    // $ANTLR start "rule__ForkNode__Group__6__Impl"
    // InternalActivityDiagramDsl.g:3871:1: rule__ForkNode__Group__6__Impl : ( '}' ) ;
    public final void rule__ForkNode__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:3875:1: ( ( '}' ) )
            // InternalActivityDiagramDsl.g:3876:1: ( '}' )
            {
            // InternalActivityDiagramDsl.g:3876:1: ( '}' )
            // InternalActivityDiagramDsl.g:3877:2: '}'
            {
             before(grammarAccess.getForkNodeAccess().getRightCurlyBracketKeyword_6()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getForkNodeAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForkNode__Group__6__Impl"


    // $ANTLR start "rule__ForkNode__Group_4__0"
    // InternalActivityDiagramDsl.g:3887:1: rule__ForkNode__Group_4__0 : rule__ForkNode__Group_4__0__Impl rule__ForkNode__Group_4__1 ;
    public final void rule__ForkNode__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:3891:1: ( rule__ForkNode__Group_4__0__Impl rule__ForkNode__Group_4__1 )
            // InternalActivityDiagramDsl.g:3892:2: rule__ForkNode__Group_4__0__Impl rule__ForkNode__Group_4__1
            {
            pushFollow(FOLLOW_17);
            rule__ForkNode__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForkNode__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForkNode__Group_4__0"


    // $ANTLR start "rule__ForkNode__Group_4__0__Impl"
    // InternalActivityDiagramDsl.g:3899:1: rule__ForkNode__Group_4__0__Impl : ( 'incoming' ) ;
    public final void rule__ForkNode__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:3903:1: ( ( 'incoming' ) )
            // InternalActivityDiagramDsl.g:3904:1: ( 'incoming' )
            {
            // InternalActivityDiagramDsl.g:3904:1: ( 'incoming' )
            // InternalActivityDiagramDsl.g:3905:2: 'incoming'
            {
             before(grammarAccess.getForkNodeAccess().getIncomingKeyword_4_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getForkNodeAccess().getIncomingKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForkNode__Group_4__0__Impl"


    // $ANTLR start "rule__ForkNode__Group_4__1"
    // InternalActivityDiagramDsl.g:3914:1: rule__ForkNode__Group_4__1 : rule__ForkNode__Group_4__1__Impl rule__ForkNode__Group_4__2 ;
    public final void rule__ForkNode__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:3918:1: ( rule__ForkNode__Group_4__1__Impl rule__ForkNode__Group_4__2 )
            // InternalActivityDiagramDsl.g:3919:2: rule__ForkNode__Group_4__1__Impl rule__ForkNode__Group_4__2
            {
            pushFollow(FOLLOW_4);
            rule__ForkNode__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForkNode__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForkNode__Group_4__1"


    // $ANTLR start "rule__ForkNode__Group_4__1__Impl"
    // InternalActivityDiagramDsl.g:3926:1: rule__ForkNode__Group_4__1__Impl : ( '(' ) ;
    public final void rule__ForkNode__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:3930:1: ( ( '(' ) )
            // InternalActivityDiagramDsl.g:3931:1: ( '(' )
            {
            // InternalActivityDiagramDsl.g:3931:1: ( '(' )
            // InternalActivityDiagramDsl.g:3932:2: '('
            {
             before(grammarAccess.getForkNodeAccess().getLeftParenthesisKeyword_4_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getForkNodeAccess().getLeftParenthesisKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForkNode__Group_4__1__Impl"


    // $ANTLR start "rule__ForkNode__Group_4__2"
    // InternalActivityDiagramDsl.g:3941:1: rule__ForkNode__Group_4__2 : rule__ForkNode__Group_4__2__Impl rule__ForkNode__Group_4__3 ;
    public final void rule__ForkNode__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:3945:1: ( rule__ForkNode__Group_4__2__Impl rule__ForkNode__Group_4__3 )
            // InternalActivityDiagramDsl.g:3946:2: rule__ForkNode__Group_4__2__Impl rule__ForkNode__Group_4__3
            {
            pushFollow(FOLLOW_18);
            rule__ForkNode__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForkNode__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForkNode__Group_4__2"


    // $ANTLR start "rule__ForkNode__Group_4__2__Impl"
    // InternalActivityDiagramDsl.g:3953:1: rule__ForkNode__Group_4__2__Impl : ( ( rule__ForkNode__IncomingAssignment_4_2 ) ) ;
    public final void rule__ForkNode__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:3957:1: ( ( ( rule__ForkNode__IncomingAssignment_4_2 ) ) )
            // InternalActivityDiagramDsl.g:3958:1: ( ( rule__ForkNode__IncomingAssignment_4_2 ) )
            {
            // InternalActivityDiagramDsl.g:3958:1: ( ( rule__ForkNode__IncomingAssignment_4_2 ) )
            // InternalActivityDiagramDsl.g:3959:2: ( rule__ForkNode__IncomingAssignment_4_2 )
            {
             before(grammarAccess.getForkNodeAccess().getIncomingAssignment_4_2()); 
            // InternalActivityDiagramDsl.g:3960:2: ( rule__ForkNode__IncomingAssignment_4_2 )
            // InternalActivityDiagramDsl.g:3960:3: rule__ForkNode__IncomingAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__ForkNode__IncomingAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getForkNodeAccess().getIncomingAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForkNode__Group_4__2__Impl"


    // $ANTLR start "rule__ForkNode__Group_4__3"
    // InternalActivityDiagramDsl.g:3968:1: rule__ForkNode__Group_4__3 : rule__ForkNode__Group_4__3__Impl rule__ForkNode__Group_4__4 ;
    public final void rule__ForkNode__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:3972:1: ( rule__ForkNode__Group_4__3__Impl rule__ForkNode__Group_4__4 )
            // InternalActivityDiagramDsl.g:3973:2: rule__ForkNode__Group_4__3__Impl rule__ForkNode__Group_4__4
            {
            pushFollow(FOLLOW_18);
            rule__ForkNode__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForkNode__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForkNode__Group_4__3"


    // $ANTLR start "rule__ForkNode__Group_4__3__Impl"
    // InternalActivityDiagramDsl.g:3980:1: rule__ForkNode__Group_4__3__Impl : ( ( rule__ForkNode__Group_4_3__0 )* ) ;
    public final void rule__ForkNode__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:3984:1: ( ( ( rule__ForkNode__Group_4_3__0 )* ) )
            // InternalActivityDiagramDsl.g:3985:1: ( ( rule__ForkNode__Group_4_3__0 )* )
            {
            // InternalActivityDiagramDsl.g:3985:1: ( ( rule__ForkNode__Group_4_3__0 )* )
            // InternalActivityDiagramDsl.g:3986:2: ( rule__ForkNode__Group_4_3__0 )*
            {
             before(grammarAccess.getForkNodeAccess().getGroup_4_3()); 
            // InternalActivityDiagramDsl.g:3987:2: ( rule__ForkNode__Group_4_3__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==17) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalActivityDiagramDsl.g:3987:3: rule__ForkNode__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__ForkNode__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getForkNodeAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForkNode__Group_4__3__Impl"


    // $ANTLR start "rule__ForkNode__Group_4__4"
    // InternalActivityDiagramDsl.g:3995:1: rule__ForkNode__Group_4__4 : rule__ForkNode__Group_4__4__Impl ;
    public final void rule__ForkNode__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:3999:1: ( rule__ForkNode__Group_4__4__Impl )
            // InternalActivityDiagramDsl.g:4000:2: rule__ForkNode__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ForkNode__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForkNode__Group_4__4"


    // $ANTLR start "rule__ForkNode__Group_4__4__Impl"
    // InternalActivityDiagramDsl.g:4006:1: rule__ForkNode__Group_4__4__Impl : ( ')' ) ;
    public final void rule__ForkNode__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:4010:1: ( ( ')' ) )
            // InternalActivityDiagramDsl.g:4011:1: ( ')' )
            {
            // InternalActivityDiagramDsl.g:4011:1: ( ')' )
            // InternalActivityDiagramDsl.g:4012:2: ')'
            {
             before(grammarAccess.getForkNodeAccess().getRightParenthesisKeyword_4_4()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getForkNodeAccess().getRightParenthesisKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForkNode__Group_4__4__Impl"


    // $ANTLR start "rule__ForkNode__Group_4_3__0"
    // InternalActivityDiagramDsl.g:4022:1: rule__ForkNode__Group_4_3__0 : rule__ForkNode__Group_4_3__0__Impl rule__ForkNode__Group_4_3__1 ;
    public final void rule__ForkNode__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:4026:1: ( rule__ForkNode__Group_4_3__0__Impl rule__ForkNode__Group_4_3__1 )
            // InternalActivityDiagramDsl.g:4027:2: rule__ForkNode__Group_4_3__0__Impl rule__ForkNode__Group_4_3__1
            {
            pushFollow(FOLLOW_4);
            rule__ForkNode__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForkNode__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForkNode__Group_4_3__0"


    // $ANTLR start "rule__ForkNode__Group_4_3__0__Impl"
    // InternalActivityDiagramDsl.g:4034:1: rule__ForkNode__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__ForkNode__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:4038:1: ( ( ',' ) )
            // InternalActivityDiagramDsl.g:4039:1: ( ',' )
            {
            // InternalActivityDiagramDsl.g:4039:1: ( ',' )
            // InternalActivityDiagramDsl.g:4040:2: ','
            {
             before(grammarAccess.getForkNodeAccess().getCommaKeyword_4_3_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getForkNodeAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForkNode__Group_4_3__0__Impl"


    // $ANTLR start "rule__ForkNode__Group_4_3__1"
    // InternalActivityDiagramDsl.g:4049:1: rule__ForkNode__Group_4_3__1 : rule__ForkNode__Group_4_3__1__Impl ;
    public final void rule__ForkNode__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:4053:1: ( rule__ForkNode__Group_4_3__1__Impl )
            // InternalActivityDiagramDsl.g:4054:2: rule__ForkNode__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ForkNode__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForkNode__Group_4_3__1"


    // $ANTLR start "rule__ForkNode__Group_4_3__1__Impl"
    // InternalActivityDiagramDsl.g:4060:1: rule__ForkNode__Group_4_3__1__Impl : ( ( rule__ForkNode__IncomingAssignment_4_3_1 ) ) ;
    public final void rule__ForkNode__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:4064:1: ( ( ( rule__ForkNode__IncomingAssignment_4_3_1 ) ) )
            // InternalActivityDiagramDsl.g:4065:1: ( ( rule__ForkNode__IncomingAssignment_4_3_1 ) )
            {
            // InternalActivityDiagramDsl.g:4065:1: ( ( rule__ForkNode__IncomingAssignment_4_3_1 ) )
            // InternalActivityDiagramDsl.g:4066:2: ( rule__ForkNode__IncomingAssignment_4_3_1 )
            {
             before(grammarAccess.getForkNodeAccess().getIncomingAssignment_4_3_1()); 
            // InternalActivityDiagramDsl.g:4067:2: ( rule__ForkNode__IncomingAssignment_4_3_1 )
            // InternalActivityDiagramDsl.g:4067:3: rule__ForkNode__IncomingAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ForkNode__IncomingAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getForkNodeAccess().getIncomingAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForkNode__Group_4_3__1__Impl"


    // $ANTLR start "rule__ForkNode__Group_5__0"
    // InternalActivityDiagramDsl.g:4076:1: rule__ForkNode__Group_5__0 : rule__ForkNode__Group_5__0__Impl rule__ForkNode__Group_5__1 ;
    public final void rule__ForkNode__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:4080:1: ( rule__ForkNode__Group_5__0__Impl rule__ForkNode__Group_5__1 )
            // InternalActivityDiagramDsl.g:4081:2: rule__ForkNode__Group_5__0__Impl rule__ForkNode__Group_5__1
            {
            pushFollow(FOLLOW_17);
            rule__ForkNode__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForkNode__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForkNode__Group_5__0"


    // $ANTLR start "rule__ForkNode__Group_5__0__Impl"
    // InternalActivityDiagramDsl.g:4088:1: rule__ForkNode__Group_5__0__Impl : ( 'outgoing' ) ;
    public final void rule__ForkNode__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:4092:1: ( ( 'outgoing' ) )
            // InternalActivityDiagramDsl.g:4093:1: ( 'outgoing' )
            {
            // InternalActivityDiagramDsl.g:4093:1: ( 'outgoing' )
            // InternalActivityDiagramDsl.g:4094:2: 'outgoing'
            {
             before(grammarAccess.getForkNodeAccess().getOutgoingKeyword_5_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getForkNodeAccess().getOutgoingKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForkNode__Group_5__0__Impl"


    // $ANTLR start "rule__ForkNode__Group_5__1"
    // InternalActivityDiagramDsl.g:4103:1: rule__ForkNode__Group_5__1 : rule__ForkNode__Group_5__1__Impl rule__ForkNode__Group_5__2 ;
    public final void rule__ForkNode__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:4107:1: ( rule__ForkNode__Group_5__1__Impl rule__ForkNode__Group_5__2 )
            // InternalActivityDiagramDsl.g:4108:2: rule__ForkNode__Group_5__1__Impl rule__ForkNode__Group_5__2
            {
            pushFollow(FOLLOW_4);
            rule__ForkNode__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForkNode__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForkNode__Group_5__1"


    // $ANTLR start "rule__ForkNode__Group_5__1__Impl"
    // InternalActivityDiagramDsl.g:4115:1: rule__ForkNode__Group_5__1__Impl : ( '(' ) ;
    public final void rule__ForkNode__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:4119:1: ( ( '(' ) )
            // InternalActivityDiagramDsl.g:4120:1: ( '(' )
            {
            // InternalActivityDiagramDsl.g:4120:1: ( '(' )
            // InternalActivityDiagramDsl.g:4121:2: '('
            {
             before(grammarAccess.getForkNodeAccess().getLeftParenthesisKeyword_5_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getForkNodeAccess().getLeftParenthesisKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForkNode__Group_5__1__Impl"


    // $ANTLR start "rule__ForkNode__Group_5__2"
    // InternalActivityDiagramDsl.g:4130:1: rule__ForkNode__Group_5__2 : rule__ForkNode__Group_5__2__Impl rule__ForkNode__Group_5__3 ;
    public final void rule__ForkNode__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:4134:1: ( rule__ForkNode__Group_5__2__Impl rule__ForkNode__Group_5__3 )
            // InternalActivityDiagramDsl.g:4135:2: rule__ForkNode__Group_5__2__Impl rule__ForkNode__Group_5__3
            {
            pushFollow(FOLLOW_18);
            rule__ForkNode__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForkNode__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForkNode__Group_5__2"


    // $ANTLR start "rule__ForkNode__Group_5__2__Impl"
    // InternalActivityDiagramDsl.g:4142:1: rule__ForkNode__Group_5__2__Impl : ( ( rule__ForkNode__OutgoingAssignment_5_2 ) ) ;
    public final void rule__ForkNode__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:4146:1: ( ( ( rule__ForkNode__OutgoingAssignment_5_2 ) ) )
            // InternalActivityDiagramDsl.g:4147:1: ( ( rule__ForkNode__OutgoingAssignment_5_2 ) )
            {
            // InternalActivityDiagramDsl.g:4147:1: ( ( rule__ForkNode__OutgoingAssignment_5_2 ) )
            // InternalActivityDiagramDsl.g:4148:2: ( rule__ForkNode__OutgoingAssignment_5_2 )
            {
             before(grammarAccess.getForkNodeAccess().getOutgoingAssignment_5_2()); 
            // InternalActivityDiagramDsl.g:4149:2: ( rule__ForkNode__OutgoingAssignment_5_2 )
            // InternalActivityDiagramDsl.g:4149:3: rule__ForkNode__OutgoingAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__ForkNode__OutgoingAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getForkNodeAccess().getOutgoingAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForkNode__Group_5__2__Impl"


    // $ANTLR start "rule__ForkNode__Group_5__3"
    // InternalActivityDiagramDsl.g:4157:1: rule__ForkNode__Group_5__3 : rule__ForkNode__Group_5__3__Impl rule__ForkNode__Group_5__4 ;
    public final void rule__ForkNode__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:4161:1: ( rule__ForkNode__Group_5__3__Impl rule__ForkNode__Group_5__4 )
            // InternalActivityDiagramDsl.g:4162:2: rule__ForkNode__Group_5__3__Impl rule__ForkNode__Group_5__4
            {
            pushFollow(FOLLOW_18);
            rule__ForkNode__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForkNode__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForkNode__Group_5__3"


    // $ANTLR start "rule__ForkNode__Group_5__3__Impl"
    // InternalActivityDiagramDsl.g:4169:1: rule__ForkNode__Group_5__3__Impl : ( ( rule__ForkNode__Group_5_3__0 )* ) ;
    public final void rule__ForkNode__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:4173:1: ( ( ( rule__ForkNode__Group_5_3__0 )* ) )
            // InternalActivityDiagramDsl.g:4174:1: ( ( rule__ForkNode__Group_5_3__0 )* )
            {
            // InternalActivityDiagramDsl.g:4174:1: ( ( rule__ForkNode__Group_5_3__0 )* )
            // InternalActivityDiagramDsl.g:4175:2: ( rule__ForkNode__Group_5_3__0 )*
            {
             before(grammarAccess.getForkNodeAccess().getGroup_5_3()); 
            // InternalActivityDiagramDsl.g:4176:2: ( rule__ForkNode__Group_5_3__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==17) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalActivityDiagramDsl.g:4176:3: rule__ForkNode__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__ForkNode__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getForkNodeAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForkNode__Group_5__3__Impl"


    // $ANTLR start "rule__ForkNode__Group_5__4"
    // InternalActivityDiagramDsl.g:4184:1: rule__ForkNode__Group_5__4 : rule__ForkNode__Group_5__4__Impl ;
    public final void rule__ForkNode__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:4188:1: ( rule__ForkNode__Group_5__4__Impl )
            // InternalActivityDiagramDsl.g:4189:2: rule__ForkNode__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ForkNode__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForkNode__Group_5__4"


    // $ANTLR start "rule__ForkNode__Group_5__4__Impl"
    // InternalActivityDiagramDsl.g:4195:1: rule__ForkNode__Group_5__4__Impl : ( ')' ) ;
    public final void rule__ForkNode__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:4199:1: ( ( ')' ) )
            // InternalActivityDiagramDsl.g:4200:1: ( ')' )
            {
            // InternalActivityDiagramDsl.g:4200:1: ( ')' )
            // InternalActivityDiagramDsl.g:4201:2: ')'
            {
             before(grammarAccess.getForkNodeAccess().getRightParenthesisKeyword_5_4()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getForkNodeAccess().getRightParenthesisKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForkNode__Group_5__4__Impl"


    // $ANTLR start "rule__ForkNode__Group_5_3__0"
    // InternalActivityDiagramDsl.g:4211:1: rule__ForkNode__Group_5_3__0 : rule__ForkNode__Group_5_3__0__Impl rule__ForkNode__Group_5_3__1 ;
    public final void rule__ForkNode__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:4215:1: ( rule__ForkNode__Group_5_3__0__Impl rule__ForkNode__Group_5_3__1 )
            // InternalActivityDiagramDsl.g:4216:2: rule__ForkNode__Group_5_3__0__Impl rule__ForkNode__Group_5_3__1
            {
            pushFollow(FOLLOW_4);
            rule__ForkNode__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForkNode__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForkNode__Group_5_3__0"


    // $ANTLR start "rule__ForkNode__Group_5_3__0__Impl"
    // InternalActivityDiagramDsl.g:4223:1: rule__ForkNode__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__ForkNode__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:4227:1: ( ( ',' ) )
            // InternalActivityDiagramDsl.g:4228:1: ( ',' )
            {
            // InternalActivityDiagramDsl.g:4228:1: ( ',' )
            // InternalActivityDiagramDsl.g:4229:2: ','
            {
             before(grammarAccess.getForkNodeAccess().getCommaKeyword_5_3_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getForkNodeAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForkNode__Group_5_3__0__Impl"


    // $ANTLR start "rule__ForkNode__Group_5_3__1"
    // InternalActivityDiagramDsl.g:4238:1: rule__ForkNode__Group_5_3__1 : rule__ForkNode__Group_5_3__1__Impl ;
    public final void rule__ForkNode__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:4242:1: ( rule__ForkNode__Group_5_3__1__Impl )
            // InternalActivityDiagramDsl.g:4243:2: rule__ForkNode__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ForkNode__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForkNode__Group_5_3__1"


    // $ANTLR start "rule__ForkNode__Group_5_3__1__Impl"
    // InternalActivityDiagramDsl.g:4249:1: rule__ForkNode__Group_5_3__1__Impl : ( ( rule__ForkNode__OutgoingAssignment_5_3_1 ) ) ;
    public final void rule__ForkNode__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:4253:1: ( ( ( rule__ForkNode__OutgoingAssignment_5_3_1 ) ) )
            // InternalActivityDiagramDsl.g:4254:1: ( ( rule__ForkNode__OutgoingAssignment_5_3_1 ) )
            {
            // InternalActivityDiagramDsl.g:4254:1: ( ( rule__ForkNode__OutgoingAssignment_5_3_1 ) )
            // InternalActivityDiagramDsl.g:4255:2: ( rule__ForkNode__OutgoingAssignment_5_3_1 )
            {
             before(grammarAccess.getForkNodeAccess().getOutgoingAssignment_5_3_1()); 
            // InternalActivityDiagramDsl.g:4256:2: ( rule__ForkNode__OutgoingAssignment_5_3_1 )
            // InternalActivityDiagramDsl.g:4256:3: rule__ForkNode__OutgoingAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ForkNode__OutgoingAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getForkNodeAccess().getOutgoingAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForkNode__Group_5_3__1__Impl"


    // $ANTLR start "rule__JoinNode__Group__0"
    // InternalActivityDiagramDsl.g:4265:1: rule__JoinNode__Group__0 : rule__JoinNode__Group__0__Impl rule__JoinNode__Group__1 ;
    public final void rule__JoinNode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:4269:1: ( rule__JoinNode__Group__0__Impl rule__JoinNode__Group__1 )
            // InternalActivityDiagramDsl.g:4270:2: rule__JoinNode__Group__0__Impl rule__JoinNode__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__JoinNode__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JoinNode__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoinNode__Group__0"


    // $ANTLR start "rule__JoinNode__Group__0__Impl"
    // InternalActivityDiagramDsl.g:4277:1: rule__JoinNode__Group__0__Impl : ( () ) ;
    public final void rule__JoinNode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:4281:1: ( ( () ) )
            // InternalActivityDiagramDsl.g:4282:1: ( () )
            {
            // InternalActivityDiagramDsl.g:4282:1: ( () )
            // InternalActivityDiagramDsl.g:4283:2: ()
            {
             before(grammarAccess.getJoinNodeAccess().getJoinNodeAction_0()); 
            // InternalActivityDiagramDsl.g:4284:2: ()
            // InternalActivityDiagramDsl.g:4284:3: 
            {
            }

             after(grammarAccess.getJoinNodeAccess().getJoinNodeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoinNode__Group__0__Impl"


    // $ANTLR start "rule__JoinNode__Group__1"
    // InternalActivityDiagramDsl.g:4292:1: rule__JoinNode__Group__1 : rule__JoinNode__Group__1__Impl rule__JoinNode__Group__2 ;
    public final void rule__JoinNode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:4296:1: ( rule__JoinNode__Group__1__Impl rule__JoinNode__Group__2 )
            // InternalActivityDiagramDsl.g:4297:2: rule__JoinNode__Group__1__Impl rule__JoinNode__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__JoinNode__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JoinNode__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoinNode__Group__1"


    // $ANTLR start "rule__JoinNode__Group__1__Impl"
    // InternalActivityDiagramDsl.g:4304:1: rule__JoinNode__Group__1__Impl : ( 'JoinNode' ) ;
    public final void rule__JoinNode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:4308:1: ( ( 'JoinNode' ) )
            // InternalActivityDiagramDsl.g:4309:1: ( 'JoinNode' )
            {
            // InternalActivityDiagramDsl.g:4309:1: ( 'JoinNode' )
            // InternalActivityDiagramDsl.g:4310:2: 'JoinNode'
            {
             before(grammarAccess.getJoinNodeAccess().getJoinNodeKeyword_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getJoinNodeAccess().getJoinNodeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoinNode__Group__1__Impl"


    // $ANTLR start "rule__JoinNode__Group__2"
    // InternalActivityDiagramDsl.g:4319:1: rule__JoinNode__Group__2 : rule__JoinNode__Group__2__Impl rule__JoinNode__Group__3 ;
    public final void rule__JoinNode__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:4323:1: ( rule__JoinNode__Group__2__Impl rule__JoinNode__Group__3 )
            // InternalActivityDiagramDsl.g:4324:2: rule__JoinNode__Group__2__Impl rule__JoinNode__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__JoinNode__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JoinNode__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoinNode__Group__2"


    // $ANTLR start "rule__JoinNode__Group__2__Impl"
    // InternalActivityDiagramDsl.g:4331:1: rule__JoinNode__Group__2__Impl : ( ( rule__JoinNode__NameAssignment_2 ) ) ;
    public final void rule__JoinNode__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:4335:1: ( ( ( rule__JoinNode__NameAssignment_2 ) ) )
            // InternalActivityDiagramDsl.g:4336:1: ( ( rule__JoinNode__NameAssignment_2 ) )
            {
            // InternalActivityDiagramDsl.g:4336:1: ( ( rule__JoinNode__NameAssignment_2 ) )
            // InternalActivityDiagramDsl.g:4337:2: ( rule__JoinNode__NameAssignment_2 )
            {
             before(grammarAccess.getJoinNodeAccess().getNameAssignment_2()); 
            // InternalActivityDiagramDsl.g:4338:2: ( rule__JoinNode__NameAssignment_2 )
            // InternalActivityDiagramDsl.g:4338:3: rule__JoinNode__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__JoinNode__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getJoinNodeAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoinNode__Group__2__Impl"


    // $ANTLR start "rule__JoinNode__Group__3"
    // InternalActivityDiagramDsl.g:4346:1: rule__JoinNode__Group__3 : rule__JoinNode__Group__3__Impl rule__JoinNode__Group__4 ;
    public final void rule__JoinNode__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:4350:1: ( rule__JoinNode__Group__3__Impl rule__JoinNode__Group__4 )
            // InternalActivityDiagramDsl.g:4351:2: rule__JoinNode__Group__3__Impl rule__JoinNode__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__JoinNode__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JoinNode__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoinNode__Group__3"


    // $ANTLR start "rule__JoinNode__Group__3__Impl"
    // InternalActivityDiagramDsl.g:4358:1: rule__JoinNode__Group__3__Impl : ( '{' ) ;
    public final void rule__JoinNode__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:4362:1: ( ( '{' ) )
            // InternalActivityDiagramDsl.g:4363:1: ( '{' )
            {
            // InternalActivityDiagramDsl.g:4363:1: ( '{' )
            // InternalActivityDiagramDsl.g:4364:2: '{'
            {
             before(grammarAccess.getJoinNodeAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getJoinNodeAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoinNode__Group__3__Impl"


    // $ANTLR start "rule__JoinNode__Group__4"
    // InternalActivityDiagramDsl.g:4373:1: rule__JoinNode__Group__4 : rule__JoinNode__Group__4__Impl rule__JoinNode__Group__5 ;
    public final void rule__JoinNode__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:4377:1: ( rule__JoinNode__Group__4__Impl rule__JoinNode__Group__5 )
            // InternalActivityDiagramDsl.g:4378:2: rule__JoinNode__Group__4__Impl rule__JoinNode__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__JoinNode__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JoinNode__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoinNode__Group__4"


    // $ANTLR start "rule__JoinNode__Group__4__Impl"
    // InternalActivityDiagramDsl.g:4385:1: rule__JoinNode__Group__4__Impl : ( ( rule__JoinNode__Group_4__0 )? ) ;
    public final void rule__JoinNode__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:4389:1: ( ( ( rule__JoinNode__Group_4__0 )? ) )
            // InternalActivityDiagramDsl.g:4390:1: ( ( rule__JoinNode__Group_4__0 )? )
            {
            // InternalActivityDiagramDsl.g:4390:1: ( ( rule__JoinNode__Group_4__0 )? )
            // InternalActivityDiagramDsl.g:4391:2: ( rule__JoinNode__Group_4__0 )?
            {
             before(grammarAccess.getJoinNodeAccess().getGroup_4()); 
            // InternalActivityDiagramDsl.g:4392:2: ( rule__JoinNode__Group_4__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==23) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalActivityDiagramDsl.g:4392:3: rule__JoinNode__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__JoinNode__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getJoinNodeAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoinNode__Group__4__Impl"


    // $ANTLR start "rule__JoinNode__Group__5"
    // InternalActivityDiagramDsl.g:4400:1: rule__JoinNode__Group__5 : rule__JoinNode__Group__5__Impl rule__JoinNode__Group__6 ;
    public final void rule__JoinNode__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:4404:1: ( rule__JoinNode__Group__5__Impl rule__JoinNode__Group__6 )
            // InternalActivityDiagramDsl.g:4405:2: rule__JoinNode__Group__5__Impl rule__JoinNode__Group__6
            {
            pushFollow(FOLLOW_16);
            rule__JoinNode__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JoinNode__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoinNode__Group__5"


    // $ANTLR start "rule__JoinNode__Group__5__Impl"
    // InternalActivityDiagramDsl.g:4412:1: rule__JoinNode__Group__5__Impl : ( ( rule__JoinNode__Group_5__0 )? ) ;
    public final void rule__JoinNode__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:4416:1: ( ( ( rule__JoinNode__Group_5__0 )? ) )
            // InternalActivityDiagramDsl.g:4417:1: ( ( rule__JoinNode__Group_5__0 )? )
            {
            // InternalActivityDiagramDsl.g:4417:1: ( ( rule__JoinNode__Group_5__0 )? )
            // InternalActivityDiagramDsl.g:4418:2: ( rule__JoinNode__Group_5__0 )?
            {
             before(grammarAccess.getJoinNodeAccess().getGroup_5()); 
            // InternalActivityDiagramDsl.g:4419:2: ( rule__JoinNode__Group_5__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==26) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalActivityDiagramDsl.g:4419:3: rule__JoinNode__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__JoinNode__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getJoinNodeAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoinNode__Group__5__Impl"


    // $ANTLR start "rule__JoinNode__Group__6"
    // InternalActivityDiagramDsl.g:4427:1: rule__JoinNode__Group__6 : rule__JoinNode__Group__6__Impl ;
    public final void rule__JoinNode__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:4431:1: ( rule__JoinNode__Group__6__Impl )
            // InternalActivityDiagramDsl.g:4432:2: rule__JoinNode__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JoinNode__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoinNode__Group__6"


    // $ANTLR start "rule__JoinNode__Group__6__Impl"
    // InternalActivityDiagramDsl.g:4438:1: rule__JoinNode__Group__6__Impl : ( '}' ) ;
    public final void rule__JoinNode__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:4442:1: ( ( '}' ) )
            // InternalActivityDiagramDsl.g:4443:1: ( '}' )
            {
            // InternalActivityDiagramDsl.g:4443:1: ( '}' )
            // InternalActivityDiagramDsl.g:4444:2: '}'
            {
             before(grammarAccess.getJoinNodeAccess().getRightCurlyBracketKeyword_6()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getJoinNodeAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoinNode__Group__6__Impl"


    // $ANTLR start "rule__JoinNode__Group_4__0"
    // InternalActivityDiagramDsl.g:4454:1: rule__JoinNode__Group_4__0 : rule__JoinNode__Group_4__0__Impl rule__JoinNode__Group_4__1 ;
    public final void rule__JoinNode__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:4458:1: ( rule__JoinNode__Group_4__0__Impl rule__JoinNode__Group_4__1 )
            // InternalActivityDiagramDsl.g:4459:2: rule__JoinNode__Group_4__0__Impl rule__JoinNode__Group_4__1
            {
            pushFollow(FOLLOW_17);
            rule__JoinNode__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JoinNode__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoinNode__Group_4__0"


    // $ANTLR start "rule__JoinNode__Group_4__0__Impl"
    // InternalActivityDiagramDsl.g:4466:1: rule__JoinNode__Group_4__0__Impl : ( 'incoming' ) ;
    public final void rule__JoinNode__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:4470:1: ( ( 'incoming' ) )
            // InternalActivityDiagramDsl.g:4471:1: ( 'incoming' )
            {
            // InternalActivityDiagramDsl.g:4471:1: ( 'incoming' )
            // InternalActivityDiagramDsl.g:4472:2: 'incoming'
            {
             before(grammarAccess.getJoinNodeAccess().getIncomingKeyword_4_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getJoinNodeAccess().getIncomingKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoinNode__Group_4__0__Impl"


    // $ANTLR start "rule__JoinNode__Group_4__1"
    // InternalActivityDiagramDsl.g:4481:1: rule__JoinNode__Group_4__1 : rule__JoinNode__Group_4__1__Impl rule__JoinNode__Group_4__2 ;
    public final void rule__JoinNode__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:4485:1: ( rule__JoinNode__Group_4__1__Impl rule__JoinNode__Group_4__2 )
            // InternalActivityDiagramDsl.g:4486:2: rule__JoinNode__Group_4__1__Impl rule__JoinNode__Group_4__2
            {
            pushFollow(FOLLOW_4);
            rule__JoinNode__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JoinNode__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoinNode__Group_4__1"


    // $ANTLR start "rule__JoinNode__Group_4__1__Impl"
    // InternalActivityDiagramDsl.g:4493:1: rule__JoinNode__Group_4__1__Impl : ( '(' ) ;
    public final void rule__JoinNode__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:4497:1: ( ( '(' ) )
            // InternalActivityDiagramDsl.g:4498:1: ( '(' )
            {
            // InternalActivityDiagramDsl.g:4498:1: ( '(' )
            // InternalActivityDiagramDsl.g:4499:2: '('
            {
             before(grammarAccess.getJoinNodeAccess().getLeftParenthesisKeyword_4_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getJoinNodeAccess().getLeftParenthesisKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoinNode__Group_4__1__Impl"


    // $ANTLR start "rule__JoinNode__Group_4__2"
    // InternalActivityDiagramDsl.g:4508:1: rule__JoinNode__Group_4__2 : rule__JoinNode__Group_4__2__Impl rule__JoinNode__Group_4__3 ;
    public final void rule__JoinNode__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:4512:1: ( rule__JoinNode__Group_4__2__Impl rule__JoinNode__Group_4__3 )
            // InternalActivityDiagramDsl.g:4513:2: rule__JoinNode__Group_4__2__Impl rule__JoinNode__Group_4__3
            {
            pushFollow(FOLLOW_18);
            rule__JoinNode__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JoinNode__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoinNode__Group_4__2"


    // $ANTLR start "rule__JoinNode__Group_4__2__Impl"
    // InternalActivityDiagramDsl.g:4520:1: rule__JoinNode__Group_4__2__Impl : ( ( rule__JoinNode__IncomingAssignment_4_2 ) ) ;
    public final void rule__JoinNode__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:4524:1: ( ( ( rule__JoinNode__IncomingAssignment_4_2 ) ) )
            // InternalActivityDiagramDsl.g:4525:1: ( ( rule__JoinNode__IncomingAssignment_4_2 ) )
            {
            // InternalActivityDiagramDsl.g:4525:1: ( ( rule__JoinNode__IncomingAssignment_4_2 ) )
            // InternalActivityDiagramDsl.g:4526:2: ( rule__JoinNode__IncomingAssignment_4_2 )
            {
             before(grammarAccess.getJoinNodeAccess().getIncomingAssignment_4_2()); 
            // InternalActivityDiagramDsl.g:4527:2: ( rule__JoinNode__IncomingAssignment_4_2 )
            // InternalActivityDiagramDsl.g:4527:3: rule__JoinNode__IncomingAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__JoinNode__IncomingAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getJoinNodeAccess().getIncomingAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoinNode__Group_4__2__Impl"


    // $ANTLR start "rule__JoinNode__Group_4__3"
    // InternalActivityDiagramDsl.g:4535:1: rule__JoinNode__Group_4__3 : rule__JoinNode__Group_4__3__Impl rule__JoinNode__Group_4__4 ;
    public final void rule__JoinNode__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:4539:1: ( rule__JoinNode__Group_4__3__Impl rule__JoinNode__Group_4__4 )
            // InternalActivityDiagramDsl.g:4540:2: rule__JoinNode__Group_4__3__Impl rule__JoinNode__Group_4__4
            {
            pushFollow(FOLLOW_18);
            rule__JoinNode__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JoinNode__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoinNode__Group_4__3"


    // $ANTLR start "rule__JoinNode__Group_4__3__Impl"
    // InternalActivityDiagramDsl.g:4547:1: rule__JoinNode__Group_4__3__Impl : ( ( rule__JoinNode__Group_4_3__0 )* ) ;
    public final void rule__JoinNode__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:4551:1: ( ( ( rule__JoinNode__Group_4_3__0 )* ) )
            // InternalActivityDiagramDsl.g:4552:1: ( ( rule__JoinNode__Group_4_3__0 )* )
            {
            // InternalActivityDiagramDsl.g:4552:1: ( ( rule__JoinNode__Group_4_3__0 )* )
            // InternalActivityDiagramDsl.g:4553:2: ( rule__JoinNode__Group_4_3__0 )*
            {
             before(grammarAccess.getJoinNodeAccess().getGroup_4_3()); 
            // InternalActivityDiagramDsl.g:4554:2: ( rule__JoinNode__Group_4_3__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==17) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalActivityDiagramDsl.g:4554:3: rule__JoinNode__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__JoinNode__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

             after(grammarAccess.getJoinNodeAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoinNode__Group_4__3__Impl"


    // $ANTLR start "rule__JoinNode__Group_4__4"
    // InternalActivityDiagramDsl.g:4562:1: rule__JoinNode__Group_4__4 : rule__JoinNode__Group_4__4__Impl ;
    public final void rule__JoinNode__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:4566:1: ( rule__JoinNode__Group_4__4__Impl )
            // InternalActivityDiagramDsl.g:4567:2: rule__JoinNode__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JoinNode__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoinNode__Group_4__4"


    // $ANTLR start "rule__JoinNode__Group_4__4__Impl"
    // InternalActivityDiagramDsl.g:4573:1: rule__JoinNode__Group_4__4__Impl : ( ')' ) ;
    public final void rule__JoinNode__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:4577:1: ( ( ')' ) )
            // InternalActivityDiagramDsl.g:4578:1: ( ')' )
            {
            // InternalActivityDiagramDsl.g:4578:1: ( ')' )
            // InternalActivityDiagramDsl.g:4579:2: ')'
            {
             before(grammarAccess.getJoinNodeAccess().getRightParenthesisKeyword_4_4()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getJoinNodeAccess().getRightParenthesisKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoinNode__Group_4__4__Impl"


    // $ANTLR start "rule__JoinNode__Group_4_3__0"
    // InternalActivityDiagramDsl.g:4589:1: rule__JoinNode__Group_4_3__0 : rule__JoinNode__Group_4_3__0__Impl rule__JoinNode__Group_4_3__1 ;
    public final void rule__JoinNode__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:4593:1: ( rule__JoinNode__Group_4_3__0__Impl rule__JoinNode__Group_4_3__1 )
            // InternalActivityDiagramDsl.g:4594:2: rule__JoinNode__Group_4_3__0__Impl rule__JoinNode__Group_4_3__1
            {
            pushFollow(FOLLOW_4);
            rule__JoinNode__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JoinNode__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoinNode__Group_4_3__0"


    // $ANTLR start "rule__JoinNode__Group_4_3__0__Impl"
    // InternalActivityDiagramDsl.g:4601:1: rule__JoinNode__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__JoinNode__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:4605:1: ( ( ',' ) )
            // InternalActivityDiagramDsl.g:4606:1: ( ',' )
            {
            // InternalActivityDiagramDsl.g:4606:1: ( ',' )
            // InternalActivityDiagramDsl.g:4607:2: ','
            {
             before(grammarAccess.getJoinNodeAccess().getCommaKeyword_4_3_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getJoinNodeAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoinNode__Group_4_3__0__Impl"


    // $ANTLR start "rule__JoinNode__Group_4_3__1"
    // InternalActivityDiagramDsl.g:4616:1: rule__JoinNode__Group_4_3__1 : rule__JoinNode__Group_4_3__1__Impl ;
    public final void rule__JoinNode__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:4620:1: ( rule__JoinNode__Group_4_3__1__Impl )
            // InternalActivityDiagramDsl.g:4621:2: rule__JoinNode__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JoinNode__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoinNode__Group_4_3__1"


    // $ANTLR start "rule__JoinNode__Group_4_3__1__Impl"
    // InternalActivityDiagramDsl.g:4627:1: rule__JoinNode__Group_4_3__1__Impl : ( ( rule__JoinNode__IncomingAssignment_4_3_1 ) ) ;
    public final void rule__JoinNode__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:4631:1: ( ( ( rule__JoinNode__IncomingAssignment_4_3_1 ) ) )
            // InternalActivityDiagramDsl.g:4632:1: ( ( rule__JoinNode__IncomingAssignment_4_3_1 ) )
            {
            // InternalActivityDiagramDsl.g:4632:1: ( ( rule__JoinNode__IncomingAssignment_4_3_1 ) )
            // InternalActivityDiagramDsl.g:4633:2: ( rule__JoinNode__IncomingAssignment_4_3_1 )
            {
             before(grammarAccess.getJoinNodeAccess().getIncomingAssignment_4_3_1()); 
            // InternalActivityDiagramDsl.g:4634:2: ( rule__JoinNode__IncomingAssignment_4_3_1 )
            // InternalActivityDiagramDsl.g:4634:3: rule__JoinNode__IncomingAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__JoinNode__IncomingAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getJoinNodeAccess().getIncomingAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoinNode__Group_4_3__1__Impl"


    // $ANTLR start "rule__JoinNode__Group_5__0"
    // InternalActivityDiagramDsl.g:4643:1: rule__JoinNode__Group_5__0 : rule__JoinNode__Group_5__0__Impl rule__JoinNode__Group_5__1 ;
    public final void rule__JoinNode__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:4647:1: ( rule__JoinNode__Group_5__0__Impl rule__JoinNode__Group_5__1 )
            // InternalActivityDiagramDsl.g:4648:2: rule__JoinNode__Group_5__0__Impl rule__JoinNode__Group_5__1
            {
            pushFollow(FOLLOW_17);
            rule__JoinNode__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JoinNode__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoinNode__Group_5__0"


    // $ANTLR start "rule__JoinNode__Group_5__0__Impl"
    // InternalActivityDiagramDsl.g:4655:1: rule__JoinNode__Group_5__0__Impl : ( 'outgoing' ) ;
    public final void rule__JoinNode__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:4659:1: ( ( 'outgoing' ) )
            // InternalActivityDiagramDsl.g:4660:1: ( 'outgoing' )
            {
            // InternalActivityDiagramDsl.g:4660:1: ( 'outgoing' )
            // InternalActivityDiagramDsl.g:4661:2: 'outgoing'
            {
             before(grammarAccess.getJoinNodeAccess().getOutgoingKeyword_5_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getJoinNodeAccess().getOutgoingKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoinNode__Group_5__0__Impl"


    // $ANTLR start "rule__JoinNode__Group_5__1"
    // InternalActivityDiagramDsl.g:4670:1: rule__JoinNode__Group_5__1 : rule__JoinNode__Group_5__1__Impl rule__JoinNode__Group_5__2 ;
    public final void rule__JoinNode__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:4674:1: ( rule__JoinNode__Group_5__1__Impl rule__JoinNode__Group_5__2 )
            // InternalActivityDiagramDsl.g:4675:2: rule__JoinNode__Group_5__1__Impl rule__JoinNode__Group_5__2
            {
            pushFollow(FOLLOW_4);
            rule__JoinNode__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JoinNode__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoinNode__Group_5__1"


    // $ANTLR start "rule__JoinNode__Group_5__1__Impl"
    // InternalActivityDiagramDsl.g:4682:1: rule__JoinNode__Group_5__1__Impl : ( '(' ) ;
    public final void rule__JoinNode__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:4686:1: ( ( '(' ) )
            // InternalActivityDiagramDsl.g:4687:1: ( '(' )
            {
            // InternalActivityDiagramDsl.g:4687:1: ( '(' )
            // InternalActivityDiagramDsl.g:4688:2: '('
            {
             before(grammarAccess.getJoinNodeAccess().getLeftParenthesisKeyword_5_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getJoinNodeAccess().getLeftParenthesisKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoinNode__Group_5__1__Impl"


    // $ANTLR start "rule__JoinNode__Group_5__2"
    // InternalActivityDiagramDsl.g:4697:1: rule__JoinNode__Group_5__2 : rule__JoinNode__Group_5__2__Impl rule__JoinNode__Group_5__3 ;
    public final void rule__JoinNode__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:4701:1: ( rule__JoinNode__Group_5__2__Impl rule__JoinNode__Group_5__3 )
            // InternalActivityDiagramDsl.g:4702:2: rule__JoinNode__Group_5__2__Impl rule__JoinNode__Group_5__3
            {
            pushFollow(FOLLOW_18);
            rule__JoinNode__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JoinNode__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoinNode__Group_5__2"


    // $ANTLR start "rule__JoinNode__Group_5__2__Impl"
    // InternalActivityDiagramDsl.g:4709:1: rule__JoinNode__Group_5__2__Impl : ( ( rule__JoinNode__OutgoingAssignment_5_2 ) ) ;
    public final void rule__JoinNode__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:4713:1: ( ( ( rule__JoinNode__OutgoingAssignment_5_2 ) ) )
            // InternalActivityDiagramDsl.g:4714:1: ( ( rule__JoinNode__OutgoingAssignment_5_2 ) )
            {
            // InternalActivityDiagramDsl.g:4714:1: ( ( rule__JoinNode__OutgoingAssignment_5_2 ) )
            // InternalActivityDiagramDsl.g:4715:2: ( rule__JoinNode__OutgoingAssignment_5_2 )
            {
             before(grammarAccess.getJoinNodeAccess().getOutgoingAssignment_5_2()); 
            // InternalActivityDiagramDsl.g:4716:2: ( rule__JoinNode__OutgoingAssignment_5_2 )
            // InternalActivityDiagramDsl.g:4716:3: rule__JoinNode__OutgoingAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__JoinNode__OutgoingAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getJoinNodeAccess().getOutgoingAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoinNode__Group_5__2__Impl"


    // $ANTLR start "rule__JoinNode__Group_5__3"
    // InternalActivityDiagramDsl.g:4724:1: rule__JoinNode__Group_5__3 : rule__JoinNode__Group_5__3__Impl rule__JoinNode__Group_5__4 ;
    public final void rule__JoinNode__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:4728:1: ( rule__JoinNode__Group_5__3__Impl rule__JoinNode__Group_5__4 )
            // InternalActivityDiagramDsl.g:4729:2: rule__JoinNode__Group_5__3__Impl rule__JoinNode__Group_5__4
            {
            pushFollow(FOLLOW_18);
            rule__JoinNode__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JoinNode__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoinNode__Group_5__3"


    // $ANTLR start "rule__JoinNode__Group_5__3__Impl"
    // InternalActivityDiagramDsl.g:4736:1: rule__JoinNode__Group_5__3__Impl : ( ( rule__JoinNode__Group_5_3__0 )* ) ;
    public final void rule__JoinNode__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:4740:1: ( ( ( rule__JoinNode__Group_5_3__0 )* ) )
            // InternalActivityDiagramDsl.g:4741:1: ( ( rule__JoinNode__Group_5_3__0 )* )
            {
            // InternalActivityDiagramDsl.g:4741:1: ( ( rule__JoinNode__Group_5_3__0 )* )
            // InternalActivityDiagramDsl.g:4742:2: ( rule__JoinNode__Group_5_3__0 )*
            {
             before(grammarAccess.getJoinNodeAccess().getGroup_5_3()); 
            // InternalActivityDiagramDsl.g:4743:2: ( rule__JoinNode__Group_5_3__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==17) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalActivityDiagramDsl.g:4743:3: rule__JoinNode__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__JoinNode__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

             after(grammarAccess.getJoinNodeAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoinNode__Group_5__3__Impl"


    // $ANTLR start "rule__JoinNode__Group_5__4"
    // InternalActivityDiagramDsl.g:4751:1: rule__JoinNode__Group_5__4 : rule__JoinNode__Group_5__4__Impl ;
    public final void rule__JoinNode__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:4755:1: ( rule__JoinNode__Group_5__4__Impl )
            // InternalActivityDiagramDsl.g:4756:2: rule__JoinNode__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JoinNode__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoinNode__Group_5__4"


    // $ANTLR start "rule__JoinNode__Group_5__4__Impl"
    // InternalActivityDiagramDsl.g:4762:1: rule__JoinNode__Group_5__4__Impl : ( ')' ) ;
    public final void rule__JoinNode__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:4766:1: ( ( ')' ) )
            // InternalActivityDiagramDsl.g:4767:1: ( ')' )
            {
            // InternalActivityDiagramDsl.g:4767:1: ( ')' )
            // InternalActivityDiagramDsl.g:4768:2: ')'
            {
             before(grammarAccess.getJoinNodeAccess().getRightParenthesisKeyword_5_4()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getJoinNodeAccess().getRightParenthesisKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoinNode__Group_5__4__Impl"


    // $ANTLR start "rule__JoinNode__Group_5_3__0"
    // InternalActivityDiagramDsl.g:4778:1: rule__JoinNode__Group_5_3__0 : rule__JoinNode__Group_5_3__0__Impl rule__JoinNode__Group_5_3__1 ;
    public final void rule__JoinNode__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:4782:1: ( rule__JoinNode__Group_5_3__0__Impl rule__JoinNode__Group_5_3__1 )
            // InternalActivityDiagramDsl.g:4783:2: rule__JoinNode__Group_5_3__0__Impl rule__JoinNode__Group_5_3__1
            {
            pushFollow(FOLLOW_4);
            rule__JoinNode__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JoinNode__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoinNode__Group_5_3__0"


    // $ANTLR start "rule__JoinNode__Group_5_3__0__Impl"
    // InternalActivityDiagramDsl.g:4790:1: rule__JoinNode__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__JoinNode__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:4794:1: ( ( ',' ) )
            // InternalActivityDiagramDsl.g:4795:1: ( ',' )
            {
            // InternalActivityDiagramDsl.g:4795:1: ( ',' )
            // InternalActivityDiagramDsl.g:4796:2: ','
            {
             before(grammarAccess.getJoinNodeAccess().getCommaKeyword_5_3_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getJoinNodeAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoinNode__Group_5_3__0__Impl"


    // $ANTLR start "rule__JoinNode__Group_5_3__1"
    // InternalActivityDiagramDsl.g:4805:1: rule__JoinNode__Group_5_3__1 : rule__JoinNode__Group_5_3__1__Impl ;
    public final void rule__JoinNode__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:4809:1: ( rule__JoinNode__Group_5_3__1__Impl )
            // InternalActivityDiagramDsl.g:4810:2: rule__JoinNode__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JoinNode__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoinNode__Group_5_3__1"


    // $ANTLR start "rule__JoinNode__Group_5_3__1__Impl"
    // InternalActivityDiagramDsl.g:4816:1: rule__JoinNode__Group_5_3__1__Impl : ( ( rule__JoinNode__OutgoingAssignment_5_3_1 ) ) ;
    public final void rule__JoinNode__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:4820:1: ( ( ( rule__JoinNode__OutgoingAssignment_5_3_1 ) ) )
            // InternalActivityDiagramDsl.g:4821:1: ( ( rule__JoinNode__OutgoingAssignment_5_3_1 ) )
            {
            // InternalActivityDiagramDsl.g:4821:1: ( ( rule__JoinNode__OutgoingAssignment_5_3_1 ) )
            // InternalActivityDiagramDsl.g:4822:2: ( rule__JoinNode__OutgoingAssignment_5_3_1 )
            {
             before(grammarAccess.getJoinNodeAccess().getOutgoingAssignment_5_3_1()); 
            // InternalActivityDiagramDsl.g:4823:2: ( rule__JoinNode__OutgoingAssignment_5_3_1 )
            // InternalActivityDiagramDsl.g:4823:3: rule__JoinNode__OutgoingAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__JoinNode__OutgoingAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getJoinNodeAccess().getOutgoingAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoinNode__Group_5_3__1__Impl"


    // $ANTLR start "rule__DecisionNode__Group__0"
    // InternalActivityDiagramDsl.g:4832:1: rule__DecisionNode__Group__0 : rule__DecisionNode__Group__0__Impl rule__DecisionNode__Group__1 ;
    public final void rule__DecisionNode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:4836:1: ( rule__DecisionNode__Group__0__Impl rule__DecisionNode__Group__1 )
            // InternalActivityDiagramDsl.g:4837:2: rule__DecisionNode__Group__0__Impl rule__DecisionNode__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__DecisionNode__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DecisionNode__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecisionNode__Group__0"


    // $ANTLR start "rule__DecisionNode__Group__0__Impl"
    // InternalActivityDiagramDsl.g:4844:1: rule__DecisionNode__Group__0__Impl : ( () ) ;
    public final void rule__DecisionNode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:4848:1: ( ( () ) )
            // InternalActivityDiagramDsl.g:4849:1: ( () )
            {
            // InternalActivityDiagramDsl.g:4849:1: ( () )
            // InternalActivityDiagramDsl.g:4850:2: ()
            {
             before(grammarAccess.getDecisionNodeAccess().getDecisionNodeAction_0()); 
            // InternalActivityDiagramDsl.g:4851:2: ()
            // InternalActivityDiagramDsl.g:4851:3: 
            {
            }

             after(grammarAccess.getDecisionNodeAccess().getDecisionNodeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecisionNode__Group__0__Impl"


    // $ANTLR start "rule__DecisionNode__Group__1"
    // InternalActivityDiagramDsl.g:4859:1: rule__DecisionNode__Group__1 : rule__DecisionNode__Group__1__Impl rule__DecisionNode__Group__2 ;
    public final void rule__DecisionNode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:4863:1: ( rule__DecisionNode__Group__1__Impl rule__DecisionNode__Group__2 )
            // InternalActivityDiagramDsl.g:4864:2: rule__DecisionNode__Group__1__Impl rule__DecisionNode__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__DecisionNode__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DecisionNode__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecisionNode__Group__1"


    // $ANTLR start "rule__DecisionNode__Group__1__Impl"
    // InternalActivityDiagramDsl.g:4871:1: rule__DecisionNode__Group__1__Impl : ( 'DecisionNode' ) ;
    public final void rule__DecisionNode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:4875:1: ( ( 'DecisionNode' ) )
            // InternalActivityDiagramDsl.g:4876:1: ( 'DecisionNode' )
            {
            // InternalActivityDiagramDsl.g:4876:1: ( 'DecisionNode' )
            // InternalActivityDiagramDsl.g:4877:2: 'DecisionNode'
            {
             before(grammarAccess.getDecisionNodeAccess().getDecisionNodeKeyword_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getDecisionNodeAccess().getDecisionNodeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecisionNode__Group__1__Impl"


    // $ANTLR start "rule__DecisionNode__Group__2"
    // InternalActivityDiagramDsl.g:4886:1: rule__DecisionNode__Group__2 : rule__DecisionNode__Group__2__Impl rule__DecisionNode__Group__3 ;
    public final void rule__DecisionNode__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:4890:1: ( rule__DecisionNode__Group__2__Impl rule__DecisionNode__Group__3 )
            // InternalActivityDiagramDsl.g:4891:2: rule__DecisionNode__Group__2__Impl rule__DecisionNode__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__DecisionNode__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DecisionNode__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecisionNode__Group__2"


    // $ANTLR start "rule__DecisionNode__Group__2__Impl"
    // InternalActivityDiagramDsl.g:4898:1: rule__DecisionNode__Group__2__Impl : ( ( rule__DecisionNode__NameAssignment_2 ) ) ;
    public final void rule__DecisionNode__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:4902:1: ( ( ( rule__DecisionNode__NameAssignment_2 ) ) )
            // InternalActivityDiagramDsl.g:4903:1: ( ( rule__DecisionNode__NameAssignment_2 ) )
            {
            // InternalActivityDiagramDsl.g:4903:1: ( ( rule__DecisionNode__NameAssignment_2 ) )
            // InternalActivityDiagramDsl.g:4904:2: ( rule__DecisionNode__NameAssignment_2 )
            {
             before(grammarAccess.getDecisionNodeAccess().getNameAssignment_2()); 
            // InternalActivityDiagramDsl.g:4905:2: ( rule__DecisionNode__NameAssignment_2 )
            // InternalActivityDiagramDsl.g:4905:3: rule__DecisionNode__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__DecisionNode__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDecisionNodeAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecisionNode__Group__2__Impl"


    // $ANTLR start "rule__DecisionNode__Group__3"
    // InternalActivityDiagramDsl.g:4913:1: rule__DecisionNode__Group__3 : rule__DecisionNode__Group__3__Impl rule__DecisionNode__Group__4 ;
    public final void rule__DecisionNode__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:4917:1: ( rule__DecisionNode__Group__3__Impl rule__DecisionNode__Group__4 )
            // InternalActivityDiagramDsl.g:4918:2: rule__DecisionNode__Group__3__Impl rule__DecisionNode__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__DecisionNode__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DecisionNode__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecisionNode__Group__3"


    // $ANTLR start "rule__DecisionNode__Group__3__Impl"
    // InternalActivityDiagramDsl.g:4925:1: rule__DecisionNode__Group__3__Impl : ( '{' ) ;
    public final void rule__DecisionNode__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:4929:1: ( ( '{' ) )
            // InternalActivityDiagramDsl.g:4930:1: ( '{' )
            {
            // InternalActivityDiagramDsl.g:4930:1: ( '{' )
            // InternalActivityDiagramDsl.g:4931:2: '{'
            {
             before(grammarAccess.getDecisionNodeAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getDecisionNodeAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecisionNode__Group__3__Impl"


    // $ANTLR start "rule__DecisionNode__Group__4"
    // InternalActivityDiagramDsl.g:4940:1: rule__DecisionNode__Group__4 : rule__DecisionNode__Group__4__Impl rule__DecisionNode__Group__5 ;
    public final void rule__DecisionNode__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:4944:1: ( rule__DecisionNode__Group__4__Impl rule__DecisionNode__Group__5 )
            // InternalActivityDiagramDsl.g:4945:2: rule__DecisionNode__Group__4__Impl rule__DecisionNode__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__DecisionNode__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DecisionNode__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecisionNode__Group__4"


    // $ANTLR start "rule__DecisionNode__Group__4__Impl"
    // InternalActivityDiagramDsl.g:4952:1: rule__DecisionNode__Group__4__Impl : ( ( rule__DecisionNode__Group_4__0 )? ) ;
    public final void rule__DecisionNode__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:4956:1: ( ( ( rule__DecisionNode__Group_4__0 )? ) )
            // InternalActivityDiagramDsl.g:4957:1: ( ( rule__DecisionNode__Group_4__0 )? )
            {
            // InternalActivityDiagramDsl.g:4957:1: ( ( rule__DecisionNode__Group_4__0 )? )
            // InternalActivityDiagramDsl.g:4958:2: ( rule__DecisionNode__Group_4__0 )?
            {
             before(grammarAccess.getDecisionNodeAccess().getGroup_4()); 
            // InternalActivityDiagramDsl.g:4959:2: ( rule__DecisionNode__Group_4__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==23) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalActivityDiagramDsl.g:4959:3: rule__DecisionNode__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DecisionNode__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDecisionNodeAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecisionNode__Group__4__Impl"


    // $ANTLR start "rule__DecisionNode__Group__5"
    // InternalActivityDiagramDsl.g:4967:1: rule__DecisionNode__Group__5 : rule__DecisionNode__Group__5__Impl rule__DecisionNode__Group__6 ;
    public final void rule__DecisionNode__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:4971:1: ( rule__DecisionNode__Group__5__Impl rule__DecisionNode__Group__6 )
            // InternalActivityDiagramDsl.g:4972:2: rule__DecisionNode__Group__5__Impl rule__DecisionNode__Group__6
            {
            pushFollow(FOLLOW_16);
            rule__DecisionNode__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DecisionNode__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecisionNode__Group__5"


    // $ANTLR start "rule__DecisionNode__Group__5__Impl"
    // InternalActivityDiagramDsl.g:4979:1: rule__DecisionNode__Group__5__Impl : ( ( rule__DecisionNode__Group_5__0 )? ) ;
    public final void rule__DecisionNode__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:4983:1: ( ( ( rule__DecisionNode__Group_5__0 )? ) )
            // InternalActivityDiagramDsl.g:4984:1: ( ( rule__DecisionNode__Group_5__0 )? )
            {
            // InternalActivityDiagramDsl.g:4984:1: ( ( rule__DecisionNode__Group_5__0 )? )
            // InternalActivityDiagramDsl.g:4985:2: ( rule__DecisionNode__Group_5__0 )?
            {
             before(grammarAccess.getDecisionNodeAccess().getGroup_5()); 
            // InternalActivityDiagramDsl.g:4986:2: ( rule__DecisionNode__Group_5__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==26) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalActivityDiagramDsl.g:4986:3: rule__DecisionNode__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DecisionNode__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDecisionNodeAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecisionNode__Group__5__Impl"


    // $ANTLR start "rule__DecisionNode__Group__6"
    // InternalActivityDiagramDsl.g:4994:1: rule__DecisionNode__Group__6 : rule__DecisionNode__Group__6__Impl ;
    public final void rule__DecisionNode__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:4998:1: ( rule__DecisionNode__Group__6__Impl )
            // InternalActivityDiagramDsl.g:4999:2: rule__DecisionNode__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DecisionNode__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecisionNode__Group__6"


    // $ANTLR start "rule__DecisionNode__Group__6__Impl"
    // InternalActivityDiagramDsl.g:5005:1: rule__DecisionNode__Group__6__Impl : ( '}' ) ;
    public final void rule__DecisionNode__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:5009:1: ( ( '}' ) )
            // InternalActivityDiagramDsl.g:5010:1: ( '}' )
            {
            // InternalActivityDiagramDsl.g:5010:1: ( '}' )
            // InternalActivityDiagramDsl.g:5011:2: '}'
            {
             before(grammarAccess.getDecisionNodeAccess().getRightCurlyBracketKeyword_6()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getDecisionNodeAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecisionNode__Group__6__Impl"


    // $ANTLR start "rule__DecisionNode__Group_4__0"
    // InternalActivityDiagramDsl.g:5021:1: rule__DecisionNode__Group_4__0 : rule__DecisionNode__Group_4__0__Impl rule__DecisionNode__Group_4__1 ;
    public final void rule__DecisionNode__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:5025:1: ( rule__DecisionNode__Group_4__0__Impl rule__DecisionNode__Group_4__1 )
            // InternalActivityDiagramDsl.g:5026:2: rule__DecisionNode__Group_4__0__Impl rule__DecisionNode__Group_4__1
            {
            pushFollow(FOLLOW_17);
            rule__DecisionNode__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DecisionNode__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecisionNode__Group_4__0"


    // $ANTLR start "rule__DecisionNode__Group_4__0__Impl"
    // InternalActivityDiagramDsl.g:5033:1: rule__DecisionNode__Group_4__0__Impl : ( 'incoming' ) ;
    public final void rule__DecisionNode__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:5037:1: ( ( 'incoming' ) )
            // InternalActivityDiagramDsl.g:5038:1: ( 'incoming' )
            {
            // InternalActivityDiagramDsl.g:5038:1: ( 'incoming' )
            // InternalActivityDiagramDsl.g:5039:2: 'incoming'
            {
             before(grammarAccess.getDecisionNodeAccess().getIncomingKeyword_4_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getDecisionNodeAccess().getIncomingKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecisionNode__Group_4__0__Impl"


    // $ANTLR start "rule__DecisionNode__Group_4__1"
    // InternalActivityDiagramDsl.g:5048:1: rule__DecisionNode__Group_4__1 : rule__DecisionNode__Group_4__1__Impl rule__DecisionNode__Group_4__2 ;
    public final void rule__DecisionNode__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:5052:1: ( rule__DecisionNode__Group_4__1__Impl rule__DecisionNode__Group_4__2 )
            // InternalActivityDiagramDsl.g:5053:2: rule__DecisionNode__Group_4__1__Impl rule__DecisionNode__Group_4__2
            {
            pushFollow(FOLLOW_4);
            rule__DecisionNode__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DecisionNode__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecisionNode__Group_4__1"


    // $ANTLR start "rule__DecisionNode__Group_4__1__Impl"
    // InternalActivityDiagramDsl.g:5060:1: rule__DecisionNode__Group_4__1__Impl : ( '(' ) ;
    public final void rule__DecisionNode__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:5064:1: ( ( '(' ) )
            // InternalActivityDiagramDsl.g:5065:1: ( '(' )
            {
            // InternalActivityDiagramDsl.g:5065:1: ( '(' )
            // InternalActivityDiagramDsl.g:5066:2: '('
            {
             before(grammarAccess.getDecisionNodeAccess().getLeftParenthesisKeyword_4_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getDecisionNodeAccess().getLeftParenthesisKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecisionNode__Group_4__1__Impl"


    // $ANTLR start "rule__DecisionNode__Group_4__2"
    // InternalActivityDiagramDsl.g:5075:1: rule__DecisionNode__Group_4__2 : rule__DecisionNode__Group_4__2__Impl rule__DecisionNode__Group_4__3 ;
    public final void rule__DecisionNode__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:5079:1: ( rule__DecisionNode__Group_4__2__Impl rule__DecisionNode__Group_4__3 )
            // InternalActivityDiagramDsl.g:5080:2: rule__DecisionNode__Group_4__2__Impl rule__DecisionNode__Group_4__3
            {
            pushFollow(FOLLOW_18);
            rule__DecisionNode__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DecisionNode__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecisionNode__Group_4__2"


    // $ANTLR start "rule__DecisionNode__Group_4__2__Impl"
    // InternalActivityDiagramDsl.g:5087:1: rule__DecisionNode__Group_4__2__Impl : ( ( rule__DecisionNode__IncomingAssignment_4_2 ) ) ;
    public final void rule__DecisionNode__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:5091:1: ( ( ( rule__DecisionNode__IncomingAssignment_4_2 ) ) )
            // InternalActivityDiagramDsl.g:5092:1: ( ( rule__DecisionNode__IncomingAssignment_4_2 ) )
            {
            // InternalActivityDiagramDsl.g:5092:1: ( ( rule__DecisionNode__IncomingAssignment_4_2 ) )
            // InternalActivityDiagramDsl.g:5093:2: ( rule__DecisionNode__IncomingAssignment_4_2 )
            {
             before(grammarAccess.getDecisionNodeAccess().getIncomingAssignment_4_2()); 
            // InternalActivityDiagramDsl.g:5094:2: ( rule__DecisionNode__IncomingAssignment_4_2 )
            // InternalActivityDiagramDsl.g:5094:3: rule__DecisionNode__IncomingAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__DecisionNode__IncomingAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getDecisionNodeAccess().getIncomingAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecisionNode__Group_4__2__Impl"


    // $ANTLR start "rule__DecisionNode__Group_4__3"
    // InternalActivityDiagramDsl.g:5102:1: rule__DecisionNode__Group_4__3 : rule__DecisionNode__Group_4__3__Impl rule__DecisionNode__Group_4__4 ;
    public final void rule__DecisionNode__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:5106:1: ( rule__DecisionNode__Group_4__3__Impl rule__DecisionNode__Group_4__4 )
            // InternalActivityDiagramDsl.g:5107:2: rule__DecisionNode__Group_4__3__Impl rule__DecisionNode__Group_4__4
            {
            pushFollow(FOLLOW_18);
            rule__DecisionNode__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DecisionNode__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecisionNode__Group_4__3"


    // $ANTLR start "rule__DecisionNode__Group_4__3__Impl"
    // InternalActivityDiagramDsl.g:5114:1: rule__DecisionNode__Group_4__3__Impl : ( ( rule__DecisionNode__Group_4_3__0 )* ) ;
    public final void rule__DecisionNode__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:5118:1: ( ( ( rule__DecisionNode__Group_4_3__0 )* ) )
            // InternalActivityDiagramDsl.g:5119:1: ( ( rule__DecisionNode__Group_4_3__0 )* )
            {
            // InternalActivityDiagramDsl.g:5119:1: ( ( rule__DecisionNode__Group_4_3__0 )* )
            // InternalActivityDiagramDsl.g:5120:2: ( rule__DecisionNode__Group_4_3__0 )*
            {
             before(grammarAccess.getDecisionNodeAccess().getGroup_4_3()); 
            // InternalActivityDiagramDsl.g:5121:2: ( rule__DecisionNode__Group_4_3__0 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==17) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalActivityDiagramDsl.g:5121:3: rule__DecisionNode__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__DecisionNode__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

             after(grammarAccess.getDecisionNodeAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecisionNode__Group_4__3__Impl"


    // $ANTLR start "rule__DecisionNode__Group_4__4"
    // InternalActivityDiagramDsl.g:5129:1: rule__DecisionNode__Group_4__4 : rule__DecisionNode__Group_4__4__Impl ;
    public final void rule__DecisionNode__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:5133:1: ( rule__DecisionNode__Group_4__4__Impl )
            // InternalActivityDiagramDsl.g:5134:2: rule__DecisionNode__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DecisionNode__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecisionNode__Group_4__4"


    // $ANTLR start "rule__DecisionNode__Group_4__4__Impl"
    // InternalActivityDiagramDsl.g:5140:1: rule__DecisionNode__Group_4__4__Impl : ( ')' ) ;
    public final void rule__DecisionNode__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:5144:1: ( ( ')' ) )
            // InternalActivityDiagramDsl.g:5145:1: ( ')' )
            {
            // InternalActivityDiagramDsl.g:5145:1: ( ')' )
            // InternalActivityDiagramDsl.g:5146:2: ')'
            {
             before(grammarAccess.getDecisionNodeAccess().getRightParenthesisKeyword_4_4()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getDecisionNodeAccess().getRightParenthesisKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecisionNode__Group_4__4__Impl"


    // $ANTLR start "rule__DecisionNode__Group_4_3__0"
    // InternalActivityDiagramDsl.g:5156:1: rule__DecisionNode__Group_4_3__0 : rule__DecisionNode__Group_4_3__0__Impl rule__DecisionNode__Group_4_3__1 ;
    public final void rule__DecisionNode__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:5160:1: ( rule__DecisionNode__Group_4_3__0__Impl rule__DecisionNode__Group_4_3__1 )
            // InternalActivityDiagramDsl.g:5161:2: rule__DecisionNode__Group_4_3__0__Impl rule__DecisionNode__Group_4_3__1
            {
            pushFollow(FOLLOW_4);
            rule__DecisionNode__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DecisionNode__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecisionNode__Group_4_3__0"


    // $ANTLR start "rule__DecisionNode__Group_4_3__0__Impl"
    // InternalActivityDiagramDsl.g:5168:1: rule__DecisionNode__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__DecisionNode__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:5172:1: ( ( ',' ) )
            // InternalActivityDiagramDsl.g:5173:1: ( ',' )
            {
            // InternalActivityDiagramDsl.g:5173:1: ( ',' )
            // InternalActivityDiagramDsl.g:5174:2: ','
            {
             before(grammarAccess.getDecisionNodeAccess().getCommaKeyword_4_3_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getDecisionNodeAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecisionNode__Group_4_3__0__Impl"


    // $ANTLR start "rule__DecisionNode__Group_4_3__1"
    // InternalActivityDiagramDsl.g:5183:1: rule__DecisionNode__Group_4_3__1 : rule__DecisionNode__Group_4_3__1__Impl ;
    public final void rule__DecisionNode__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:5187:1: ( rule__DecisionNode__Group_4_3__1__Impl )
            // InternalActivityDiagramDsl.g:5188:2: rule__DecisionNode__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DecisionNode__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecisionNode__Group_4_3__1"


    // $ANTLR start "rule__DecisionNode__Group_4_3__1__Impl"
    // InternalActivityDiagramDsl.g:5194:1: rule__DecisionNode__Group_4_3__1__Impl : ( ( rule__DecisionNode__IncomingAssignment_4_3_1 ) ) ;
    public final void rule__DecisionNode__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:5198:1: ( ( ( rule__DecisionNode__IncomingAssignment_4_3_1 ) ) )
            // InternalActivityDiagramDsl.g:5199:1: ( ( rule__DecisionNode__IncomingAssignment_4_3_1 ) )
            {
            // InternalActivityDiagramDsl.g:5199:1: ( ( rule__DecisionNode__IncomingAssignment_4_3_1 ) )
            // InternalActivityDiagramDsl.g:5200:2: ( rule__DecisionNode__IncomingAssignment_4_3_1 )
            {
             before(grammarAccess.getDecisionNodeAccess().getIncomingAssignment_4_3_1()); 
            // InternalActivityDiagramDsl.g:5201:2: ( rule__DecisionNode__IncomingAssignment_4_3_1 )
            // InternalActivityDiagramDsl.g:5201:3: rule__DecisionNode__IncomingAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__DecisionNode__IncomingAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getDecisionNodeAccess().getIncomingAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecisionNode__Group_4_3__1__Impl"


    // $ANTLR start "rule__DecisionNode__Group_5__0"
    // InternalActivityDiagramDsl.g:5210:1: rule__DecisionNode__Group_5__0 : rule__DecisionNode__Group_5__0__Impl rule__DecisionNode__Group_5__1 ;
    public final void rule__DecisionNode__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:5214:1: ( rule__DecisionNode__Group_5__0__Impl rule__DecisionNode__Group_5__1 )
            // InternalActivityDiagramDsl.g:5215:2: rule__DecisionNode__Group_5__0__Impl rule__DecisionNode__Group_5__1
            {
            pushFollow(FOLLOW_17);
            rule__DecisionNode__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DecisionNode__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecisionNode__Group_5__0"


    // $ANTLR start "rule__DecisionNode__Group_5__0__Impl"
    // InternalActivityDiagramDsl.g:5222:1: rule__DecisionNode__Group_5__0__Impl : ( 'outgoing' ) ;
    public final void rule__DecisionNode__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:5226:1: ( ( 'outgoing' ) )
            // InternalActivityDiagramDsl.g:5227:1: ( 'outgoing' )
            {
            // InternalActivityDiagramDsl.g:5227:1: ( 'outgoing' )
            // InternalActivityDiagramDsl.g:5228:2: 'outgoing'
            {
             before(grammarAccess.getDecisionNodeAccess().getOutgoingKeyword_5_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getDecisionNodeAccess().getOutgoingKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecisionNode__Group_5__0__Impl"


    // $ANTLR start "rule__DecisionNode__Group_5__1"
    // InternalActivityDiagramDsl.g:5237:1: rule__DecisionNode__Group_5__1 : rule__DecisionNode__Group_5__1__Impl rule__DecisionNode__Group_5__2 ;
    public final void rule__DecisionNode__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:5241:1: ( rule__DecisionNode__Group_5__1__Impl rule__DecisionNode__Group_5__2 )
            // InternalActivityDiagramDsl.g:5242:2: rule__DecisionNode__Group_5__1__Impl rule__DecisionNode__Group_5__2
            {
            pushFollow(FOLLOW_4);
            rule__DecisionNode__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DecisionNode__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecisionNode__Group_5__1"


    // $ANTLR start "rule__DecisionNode__Group_5__1__Impl"
    // InternalActivityDiagramDsl.g:5249:1: rule__DecisionNode__Group_5__1__Impl : ( '(' ) ;
    public final void rule__DecisionNode__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:5253:1: ( ( '(' ) )
            // InternalActivityDiagramDsl.g:5254:1: ( '(' )
            {
            // InternalActivityDiagramDsl.g:5254:1: ( '(' )
            // InternalActivityDiagramDsl.g:5255:2: '('
            {
             before(grammarAccess.getDecisionNodeAccess().getLeftParenthesisKeyword_5_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getDecisionNodeAccess().getLeftParenthesisKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecisionNode__Group_5__1__Impl"


    // $ANTLR start "rule__DecisionNode__Group_5__2"
    // InternalActivityDiagramDsl.g:5264:1: rule__DecisionNode__Group_5__2 : rule__DecisionNode__Group_5__2__Impl rule__DecisionNode__Group_5__3 ;
    public final void rule__DecisionNode__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:5268:1: ( rule__DecisionNode__Group_5__2__Impl rule__DecisionNode__Group_5__3 )
            // InternalActivityDiagramDsl.g:5269:2: rule__DecisionNode__Group_5__2__Impl rule__DecisionNode__Group_5__3
            {
            pushFollow(FOLLOW_18);
            rule__DecisionNode__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DecisionNode__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecisionNode__Group_5__2"


    // $ANTLR start "rule__DecisionNode__Group_5__2__Impl"
    // InternalActivityDiagramDsl.g:5276:1: rule__DecisionNode__Group_5__2__Impl : ( ( rule__DecisionNode__OutgoingAssignment_5_2 ) ) ;
    public final void rule__DecisionNode__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:5280:1: ( ( ( rule__DecisionNode__OutgoingAssignment_5_2 ) ) )
            // InternalActivityDiagramDsl.g:5281:1: ( ( rule__DecisionNode__OutgoingAssignment_5_2 ) )
            {
            // InternalActivityDiagramDsl.g:5281:1: ( ( rule__DecisionNode__OutgoingAssignment_5_2 ) )
            // InternalActivityDiagramDsl.g:5282:2: ( rule__DecisionNode__OutgoingAssignment_5_2 )
            {
             before(grammarAccess.getDecisionNodeAccess().getOutgoingAssignment_5_2()); 
            // InternalActivityDiagramDsl.g:5283:2: ( rule__DecisionNode__OutgoingAssignment_5_2 )
            // InternalActivityDiagramDsl.g:5283:3: rule__DecisionNode__OutgoingAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__DecisionNode__OutgoingAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getDecisionNodeAccess().getOutgoingAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecisionNode__Group_5__2__Impl"


    // $ANTLR start "rule__DecisionNode__Group_5__3"
    // InternalActivityDiagramDsl.g:5291:1: rule__DecisionNode__Group_5__3 : rule__DecisionNode__Group_5__3__Impl rule__DecisionNode__Group_5__4 ;
    public final void rule__DecisionNode__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:5295:1: ( rule__DecisionNode__Group_5__3__Impl rule__DecisionNode__Group_5__4 )
            // InternalActivityDiagramDsl.g:5296:2: rule__DecisionNode__Group_5__3__Impl rule__DecisionNode__Group_5__4
            {
            pushFollow(FOLLOW_18);
            rule__DecisionNode__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DecisionNode__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecisionNode__Group_5__3"


    // $ANTLR start "rule__DecisionNode__Group_5__3__Impl"
    // InternalActivityDiagramDsl.g:5303:1: rule__DecisionNode__Group_5__3__Impl : ( ( rule__DecisionNode__Group_5_3__0 )* ) ;
    public final void rule__DecisionNode__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:5307:1: ( ( ( rule__DecisionNode__Group_5_3__0 )* ) )
            // InternalActivityDiagramDsl.g:5308:1: ( ( rule__DecisionNode__Group_5_3__0 )* )
            {
            // InternalActivityDiagramDsl.g:5308:1: ( ( rule__DecisionNode__Group_5_3__0 )* )
            // InternalActivityDiagramDsl.g:5309:2: ( rule__DecisionNode__Group_5_3__0 )*
            {
             before(grammarAccess.getDecisionNodeAccess().getGroup_5_3()); 
            // InternalActivityDiagramDsl.g:5310:2: ( rule__DecisionNode__Group_5_3__0 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==17) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalActivityDiagramDsl.g:5310:3: rule__DecisionNode__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__DecisionNode__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

             after(grammarAccess.getDecisionNodeAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecisionNode__Group_5__3__Impl"


    // $ANTLR start "rule__DecisionNode__Group_5__4"
    // InternalActivityDiagramDsl.g:5318:1: rule__DecisionNode__Group_5__4 : rule__DecisionNode__Group_5__4__Impl ;
    public final void rule__DecisionNode__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:5322:1: ( rule__DecisionNode__Group_5__4__Impl )
            // InternalActivityDiagramDsl.g:5323:2: rule__DecisionNode__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DecisionNode__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecisionNode__Group_5__4"


    // $ANTLR start "rule__DecisionNode__Group_5__4__Impl"
    // InternalActivityDiagramDsl.g:5329:1: rule__DecisionNode__Group_5__4__Impl : ( ')' ) ;
    public final void rule__DecisionNode__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:5333:1: ( ( ')' ) )
            // InternalActivityDiagramDsl.g:5334:1: ( ')' )
            {
            // InternalActivityDiagramDsl.g:5334:1: ( ')' )
            // InternalActivityDiagramDsl.g:5335:2: ')'
            {
             before(grammarAccess.getDecisionNodeAccess().getRightParenthesisKeyword_5_4()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getDecisionNodeAccess().getRightParenthesisKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecisionNode__Group_5__4__Impl"


    // $ANTLR start "rule__DecisionNode__Group_5_3__0"
    // InternalActivityDiagramDsl.g:5345:1: rule__DecisionNode__Group_5_3__0 : rule__DecisionNode__Group_5_3__0__Impl rule__DecisionNode__Group_5_3__1 ;
    public final void rule__DecisionNode__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:5349:1: ( rule__DecisionNode__Group_5_3__0__Impl rule__DecisionNode__Group_5_3__1 )
            // InternalActivityDiagramDsl.g:5350:2: rule__DecisionNode__Group_5_3__0__Impl rule__DecisionNode__Group_5_3__1
            {
            pushFollow(FOLLOW_4);
            rule__DecisionNode__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DecisionNode__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecisionNode__Group_5_3__0"


    // $ANTLR start "rule__DecisionNode__Group_5_3__0__Impl"
    // InternalActivityDiagramDsl.g:5357:1: rule__DecisionNode__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__DecisionNode__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:5361:1: ( ( ',' ) )
            // InternalActivityDiagramDsl.g:5362:1: ( ',' )
            {
            // InternalActivityDiagramDsl.g:5362:1: ( ',' )
            // InternalActivityDiagramDsl.g:5363:2: ','
            {
             before(grammarAccess.getDecisionNodeAccess().getCommaKeyword_5_3_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getDecisionNodeAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecisionNode__Group_5_3__0__Impl"


    // $ANTLR start "rule__DecisionNode__Group_5_3__1"
    // InternalActivityDiagramDsl.g:5372:1: rule__DecisionNode__Group_5_3__1 : rule__DecisionNode__Group_5_3__1__Impl ;
    public final void rule__DecisionNode__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:5376:1: ( rule__DecisionNode__Group_5_3__1__Impl )
            // InternalActivityDiagramDsl.g:5377:2: rule__DecisionNode__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DecisionNode__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecisionNode__Group_5_3__1"


    // $ANTLR start "rule__DecisionNode__Group_5_3__1__Impl"
    // InternalActivityDiagramDsl.g:5383:1: rule__DecisionNode__Group_5_3__1__Impl : ( ( rule__DecisionNode__OutgoingAssignment_5_3_1 ) ) ;
    public final void rule__DecisionNode__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:5387:1: ( ( ( rule__DecisionNode__OutgoingAssignment_5_3_1 ) ) )
            // InternalActivityDiagramDsl.g:5388:1: ( ( rule__DecisionNode__OutgoingAssignment_5_3_1 ) )
            {
            // InternalActivityDiagramDsl.g:5388:1: ( ( rule__DecisionNode__OutgoingAssignment_5_3_1 ) )
            // InternalActivityDiagramDsl.g:5389:2: ( rule__DecisionNode__OutgoingAssignment_5_3_1 )
            {
             before(grammarAccess.getDecisionNodeAccess().getOutgoingAssignment_5_3_1()); 
            // InternalActivityDiagramDsl.g:5390:2: ( rule__DecisionNode__OutgoingAssignment_5_3_1 )
            // InternalActivityDiagramDsl.g:5390:3: rule__DecisionNode__OutgoingAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__DecisionNode__OutgoingAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getDecisionNodeAccess().getOutgoingAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecisionNode__Group_5_3__1__Impl"


    // $ANTLR start "rule__Node_Impl__Group__0"
    // InternalActivityDiagramDsl.g:5399:1: rule__Node_Impl__Group__0 : rule__Node_Impl__Group__0__Impl rule__Node_Impl__Group__1 ;
    public final void rule__Node_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:5403:1: ( rule__Node_Impl__Group__0__Impl rule__Node_Impl__Group__1 )
            // InternalActivityDiagramDsl.g:5404:2: rule__Node_Impl__Group__0__Impl rule__Node_Impl__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__Node_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node_Impl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__Group__0"


    // $ANTLR start "rule__Node_Impl__Group__0__Impl"
    // InternalActivityDiagramDsl.g:5411:1: rule__Node_Impl__Group__0__Impl : ( () ) ;
    public final void rule__Node_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:5415:1: ( ( () ) )
            // InternalActivityDiagramDsl.g:5416:1: ( () )
            {
            // InternalActivityDiagramDsl.g:5416:1: ( () )
            // InternalActivityDiagramDsl.g:5417:2: ()
            {
             before(grammarAccess.getNode_ImplAccess().getNodeAction_0()); 
            // InternalActivityDiagramDsl.g:5418:2: ()
            // InternalActivityDiagramDsl.g:5418:3: 
            {
            }

             after(grammarAccess.getNode_ImplAccess().getNodeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__Group__0__Impl"


    // $ANTLR start "rule__Node_Impl__Group__1"
    // InternalActivityDiagramDsl.g:5426:1: rule__Node_Impl__Group__1 : rule__Node_Impl__Group__1__Impl rule__Node_Impl__Group__2 ;
    public final void rule__Node_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:5430:1: ( rule__Node_Impl__Group__1__Impl rule__Node_Impl__Group__2 )
            // InternalActivityDiagramDsl.g:5431:2: rule__Node_Impl__Group__1__Impl rule__Node_Impl__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Node_Impl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node_Impl__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__Group__1"


    // $ANTLR start "rule__Node_Impl__Group__1__Impl"
    // InternalActivityDiagramDsl.g:5438:1: rule__Node_Impl__Group__1__Impl : ( 'Node' ) ;
    public final void rule__Node_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:5442:1: ( ( 'Node' ) )
            // InternalActivityDiagramDsl.g:5443:1: ( 'Node' )
            {
            // InternalActivityDiagramDsl.g:5443:1: ( 'Node' )
            // InternalActivityDiagramDsl.g:5444:2: 'Node'
            {
             before(grammarAccess.getNode_ImplAccess().getNodeKeyword_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getNode_ImplAccess().getNodeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__Group__1__Impl"


    // $ANTLR start "rule__Node_Impl__Group__2"
    // InternalActivityDiagramDsl.g:5453:1: rule__Node_Impl__Group__2 : rule__Node_Impl__Group__2__Impl rule__Node_Impl__Group__3 ;
    public final void rule__Node_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:5457:1: ( rule__Node_Impl__Group__2__Impl rule__Node_Impl__Group__3 )
            // InternalActivityDiagramDsl.g:5458:2: rule__Node_Impl__Group__2__Impl rule__Node_Impl__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Node_Impl__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node_Impl__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__Group__2"


    // $ANTLR start "rule__Node_Impl__Group__2__Impl"
    // InternalActivityDiagramDsl.g:5465:1: rule__Node_Impl__Group__2__Impl : ( ( rule__Node_Impl__NameAssignment_2 ) ) ;
    public final void rule__Node_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:5469:1: ( ( ( rule__Node_Impl__NameAssignment_2 ) ) )
            // InternalActivityDiagramDsl.g:5470:1: ( ( rule__Node_Impl__NameAssignment_2 ) )
            {
            // InternalActivityDiagramDsl.g:5470:1: ( ( rule__Node_Impl__NameAssignment_2 ) )
            // InternalActivityDiagramDsl.g:5471:2: ( rule__Node_Impl__NameAssignment_2 )
            {
             before(grammarAccess.getNode_ImplAccess().getNameAssignment_2()); 
            // InternalActivityDiagramDsl.g:5472:2: ( rule__Node_Impl__NameAssignment_2 )
            // InternalActivityDiagramDsl.g:5472:3: rule__Node_Impl__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Node_Impl__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getNode_ImplAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__Group__2__Impl"


    // $ANTLR start "rule__Node_Impl__Group__3"
    // InternalActivityDiagramDsl.g:5480:1: rule__Node_Impl__Group__3 : rule__Node_Impl__Group__3__Impl rule__Node_Impl__Group__4 ;
    public final void rule__Node_Impl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:5484:1: ( rule__Node_Impl__Group__3__Impl rule__Node_Impl__Group__4 )
            // InternalActivityDiagramDsl.g:5485:2: rule__Node_Impl__Group__3__Impl rule__Node_Impl__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__Node_Impl__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node_Impl__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__Group__3"


    // $ANTLR start "rule__Node_Impl__Group__3__Impl"
    // InternalActivityDiagramDsl.g:5492:1: rule__Node_Impl__Group__3__Impl : ( '{' ) ;
    public final void rule__Node_Impl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:5496:1: ( ( '{' ) )
            // InternalActivityDiagramDsl.g:5497:1: ( '{' )
            {
            // InternalActivityDiagramDsl.g:5497:1: ( '{' )
            // InternalActivityDiagramDsl.g:5498:2: '{'
            {
             before(grammarAccess.getNode_ImplAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getNode_ImplAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__Group__3__Impl"


    // $ANTLR start "rule__Node_Impl__Group__4"
    // InternalActivityDiagramDsl.g:5507:1: rule__Node_Impl__Group__4 : rule__Node_Impl__Group__4__Impl rule__Node_Impl__Group__5 ;
    public final void rule__Node_Impl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:5511:1: ( rule__Node_Impl__Group__4__Impl rule__Node_Impl__Group__5 )
            // InternalActivityDiagramDsl.g:5512:2: rule__Node_Impl__Group__4__Impl rule__Node_Impl__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__Node_Impl__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node_Impl__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__Group__4"


    // $ANTLR start "rule__Node_Impl__Group__4__Impl"
    // InternalActivityDiagramDsl.g:5519:1: rule__Node_Impl__Group__4__Impl : ( ( rule__Node_Impl__Group_4__0 )? ) ;
    public final void rule__Node_Impl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:5523:1: ( ( ( rule__Node_Impl__Group_4__0 )? ) )
            // InternalActivityDiagramDsl.g:5524:1: ( ( rule__Node_Impl__Group_4__0 )? )
            {
            // InternalActivityDiagramDsl.g:5524:1: ( ( rule__Node_Impl__Group_4__0 )? )
            // InternalActivityDiagramDsl.g:5525:2: ( rule__Node_Impl__Group_4__0 )?
            {
             before(grammarAccess.getNode_ImplAccess().getGroup_4()); 
            // InternalActivityDiagramDsl.g:5526:2: ( rule__Node_Impl__Group_4__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==23) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalActivityDiagramDsl.g:5526:3: rule__Node_Impl__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Node_Impl__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNode_ImplAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__Group__4__Impl"


    // $ANTLR start "rule__Node_Impl__Group__5"
    // InternalActivityDiagramDsl.g:5534:1: rule__Node_Impl__Group__5 : rule__Node_Impl__Group__5__Impl rule__Node_Impl__Group__6 ;
    public final void rule__Node_Impl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:5538:1: ( rule__Node_Impl__Group__5__Impl rule__Node_Impl__Group__6 )
            // InternalActivityDiagramDsl.g:5539:2: rule__Node_Impl__Group__5__Impl rule__Node_Impl__Group__6
            {
            pushFollow(FOLLOW_16);
            rule__Node_Impl__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node_Impl__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__Group__5"


    // $ANTLR start "rule__Node_Impl__Group__5__Impl"
    // InternalActivityDiagramDsl.g:5546:1: rule__Node_Impl__Group__5__Impl : ( ( rule__Node_Impl__Group_5__0 )? ) ;
    public final void rule__Node_Impl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:5550:1: ( ( ( rule__Node_Impl__Group_5__0 )? ) )
            // InternalActivityDiagramDsl.g:5551:1: ( ( rule__Node_Impl__Group_5__0 )? )
            {
            // InternalActivityDiagramDsl.g:5551:1: ( ( rule__Node_Impl__Group_5__0 )? )
            // InternalActivityDiagramDsl.g:5552:2: ( rule__Node_Impl__Group_5__0 )?
            {
             before(grammarAccess.getNode_ImplAccess().getGroup_5()); 
            // InternalActivityDiagramDsl.g:5553:2: ( rule__Node_Impl__Group_5__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==26) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalActivityDiagramDsl.g:5553:3: rule__Node_Impl__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Node_Impl__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNode_ImplAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__Group__5__Impl"


    // $ANTLR start "rule__Node_Impl__Group__6"
    // InternalActivityDiagramDsl.g:5561:1: rule__Node_Impl__Group__6 : rule__Node_Impl__Group__6__Impl ;
    public final void rule__Node_Impl__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:5565:1: ( rule__Node_Impl__Group__6__Impl )
            // InternalActivityDiagramDsl.g:5566:2: rule__Node_Impl__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Node_Impl__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__Group__6"


    // $ANTLR start "rule__Node_Impl__Group__6__Impl"
    // InternalActivityDiagramDsl.g:5572:1: rule__Node_Impl__Group__6__Impl : ( '}' ) ;
    public final void rule__Node_Impl__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:5576:1: ( ( '}' ) )
            // InternalActivityDiagramDsl.g:5577:1: ( '}' )
            {
            // InternalActivityDiagramDsl.g:5577:1: ( '}' )
            // InternalActivityDiagramDsl.g:5578:2: '}'
            {
             before(grammarAccess.getNode_ImplAccess().getRightCurlyBracketKeyword_6()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getNode_ImplAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__Group__6__Impl"


    // $ANTLR start "rule__Node_Impl__Group_4__0"
    // InternalActivityDiagramDsl.g:5588:1: rule__Node_Impl__Group_4__0 : rule__Node_Impl__Group_4__0__Impl rule__Node_Impl__Group_4__1 ;
    public final void rule__Node_Impl__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:5592:1: ( rule__Node_Impl__Group_4__0__Impl rule__Node_Impl__Group_4__1 )
            // InternalActivityDiagramDsl.g:5593:2: rule__Node_Impl__Group_4__0__Impl rule__Node_Impl__Group_4__1
            {
            pushFollow(FOLLOW_17);
            rule__Node_Impl__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node_Impl__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__Group_4__0"


    // $ANTLR start "rule__Node_Impl__Group_4__0__Impl"
    // InternalActivityDiagramDsl.g:5600:1: rule__Node_Impl__Group_4__0__Impl : ( 'incoming' ) ;
    public final void rule__Node_Impl__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:5604:1: ( ( 'incoming' ) )
            // InternalActivityDiagramDsl.g:5605:1: ( 'incoming' )
            {
            // InternalActivityDiagramDsl.g:5605:1: ( 'incoming' )
            // InternalActivityDiagramDsl.g:5606:2: 'incoming'
            {
             before(grammarAccess.getNode_ImplAccess().getIncomingKeyword_4_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getNode_ImplAccess().getIncomingKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__Group_4__0__Impl"


    // $ANTLR start "rule__Node_Impl__Group_4__1"
    // InternalActivityDiagramDsl.g:5615:1: rule__Node_Impl__Group_4__1 : rule__Node_Impl__Group_4__1__Impl rule__Node_Impl__Group_4__2 ;
    public final void rule__Node_Impl__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:5619:1: ( rule__Node_Impl__Group_4__1__Impl rule__Node_Impl__Group_4__2 )
            // InternalActivityDiagramDsl.g:5620:2: rule__Node_Impl__Group_4__1__Impl rule__Node_Impl__Group_4__2
            {
            pushFollow(FOLLOW_4);
            rule__Node_Impl__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node_Impl__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__Group_4__1"


    // $ANTLR start "rule__Node_Impl__Group_4__1__Impl"
    // InternalActivityDiagramDsl.g:5627:1: rule__Node_Impl__Group_4__1__Impl : ( '(' ) ;
    public final void rule__Node_Impl__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:5631:1: ( ( '(' ) )
            // InternalActivityDiagramDsl.g:5632:1: ( '(' )
            {
            // InternalActivityDiagramDsl.g:5632:1: ( '(' )
            // InternalActivityDiagramDsl.g:5633:2: '('
            {
             before(grammarAccess.getNode_ImplAccess().getLeftParenthesisKeyword_4_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getNode_ImplAccess().getLeftParenthesisKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__Group_4__1__Impl"


    // $ANTLR start "rule__Node_Impl__Group_4__2"
    // InternalActivityDiagramDsl.g:5642:1: rule__Node_Impl__Group_4__2 : rule__Node_Impl__Group_4__2__Impl rule__Node_Impl__Group_4__3 ;
    public final void rule__Node_Impl__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:5646:1: ( rule__Node_Impl__Group_4__2__Impl rule__Node_Impl__Group_4__3 )
            // InternalActivityDiagramDsl.g:5647:2: rule__Node_Impl__Group_4__2__Impl rule__Node_Impl__Group_4__3
            {
            pushFollow(FOLLOW_18);
            rule__Node_Impl__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node_Impl__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__Group_4__2"


    // $ANTLR start "rule__Node_Impl__Group_4__2__Impl"
    // InternalActivityDiagramDsl.g:5654:1: rule__Node_Impl__Group_4__2__Impl : ( ( rule__Node_Impl__IncomingAssignment_4_2 ) ) ;
    public final void rule__Node_Impl__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:5658:1: ( ( ( rule__Node_Impl__IncomingAssignment_4_2 ) ) )
            // InternalActivityDiagramDsl.g:5659:1: ( ( rule__Node_Impl__IncomingAssignment_4_2 ) )
            {
            // InternalActivityDiagramDsl.g:5659:1: ( ( rule__Node_Impl__IncomingAssignment_4_2 ) )
            // InternalActivityDiagramDsl.g:5660:2: ( rule__Node_Impl__IncomingAssignment_4_2 )
            {
             before(grammarAccess.getNode_ImplAccess().getIncomingAssignment_4_2()); 
            // InternalActivityDiagramDsl.g:5661:2: ( rule__Node_Impl__IncomingAssignment_4_2 )
            // InternalActivityDiagramDsl.g:5661:3: rule__Node_Impl__IncomingAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Node_Impl__IncomingAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getNode_ImplAccess().getIncomingAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__Group_4__2__Impl"


    // $ANTLR start "rule__Node_Impl__Group_4__3"
    // InternalActivityDiagramDsl.g:5669:1: rule__Node_Impl__Group_4__3 : rule__Node_Impl__Group_4__3__Impl rule__Node_Impl__Group_4__4 ;
    public final void rule__Node_Impl__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:5673:1: ( rule__Node_Impl__Group_4__3__Impl rule__Node_Impl__Group_4__4 )
            // InternalActivityDiagramDsl.g:5674:2: rule__Node_Impl__Group_4__3__Impl rule__Node_Impl__Group_4__4
            {
            pushFollow(FOLLOW_18);
            rule__Node_Impl__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node_Impl__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__Group_4__3"


    // $ANTLR start "rule__Node_Impl__Group_4__3__Impl"
    // InternalActivityDiagramDsl.g:5681:1: rule__Node_Impl__Group_4__3__Impl : ( ( rule__Node_Impl__Group_4_3__0 )* ) ;
    public final void rule__Node_Impl__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:5685:1: ( ( ( rule__Node_Impl__Group_4_3__0 )* ) )
            // InternalActivityDiagramDsl.g:5686:1: ( ( rule__Node_Impl__Group_4_3__0 )* )
            {
            // InternalActivityDiagramDsl.g:5686:1: ( ( rule__Node_Impl__Group_4_3__0 )* )
            // InternalActivityDiagramDsl.g:5687:2: ( rule__Node_Impl__Group_4_3__0 )*
            {
             before(grammarAccess.getNode_ImplAccess().getGroup_4_3()); 
            // InternalActivityDiagramDsl.g:5688:2: ( rule__Node_Impl__Group_4_3__0 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==17) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalActivityDiagramDsl.g:5688:3: rule__Node_Impl__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Node_Impl__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

             after(grammarAccess.getNode_ImplAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__Group_4__3__Impl"


    // $ANTLR start "rule__Node_Impl__Group_4__4"
    // InternalActivityDiagramDsl.g:5696:1: rule__Node_Impl__Group_4__4 : rule__Node_Impl__Group_4__4__Impl ;
    public final void rule__Node_Impl__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:5700:1: ( rule__Node_Impl__Group_4__4__Impl )
            // InternalActivityDiagramDsl.g:5701:2: rule__Node_Impl__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Node_Impl__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__Group_4__4"


    // $ANTLR start "rule__Node_Impl__Group_4__4__Impl"
    // InternalActivityDiagramDsl.g:5707:1: rule__Node_Impl__Group_4__4__Impl : ( ')' ) ;
    public final void rule__Node_Impl__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:5711:1: ( ( ')' ) )
            // InternalActivityDiagramDsl.g:5712:1: ( ')' )
            {
            // InternalActivityDiagramDsl.g:5712:1: ( ')' )
            // InternalActivityDiagramDsl.g:5713:2: ')'
            {
             before(grammarAccess.getNode_ImplAccess().getRightParenthesisKeyword_4_4()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getNode_ImplAccess().getRightParenthesisKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__Group_4__4__Impl"


    // $ANTLR start "rule__Node_Impl__Group_4_3__0"
    // InternalActivityDiagramDsl.g:5723:1: rule__Node_Impl__Group_4_3__0 : rule__Node_Impl__Group_4_3__0__Impl rule__Node_Impl__Group_4_3__1 ;
    public final void rule__Node_Impl__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:5727:1: ( rule__Node_Impl__Group_4_3__0__Impl rule__Node_Impl__Group_4_3__1 )
            // InternalActivityDiagramDsl.g:5728:2: rule__Node_Impl__Group_4_3__0__Impl rule__Node_Impl__Group_4_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Node_Impl__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node_Impl__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__Group_4_3__0"


    // $ANTLR start "rule__Node_Impl__Group_4_3__0__Impl"
    // InternalActivityDiagramDsl.g:5735:1: rule__Node_Impl__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Node_Impl__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:5739:1: ( ( ',' ) )
            // InternalActivityDiagramDsl.g:5740:1: ( ',' )
            {
            // InternalActivityDiagramDsl.g:5740:1: ( ',' )
            // InternalActivityDiagramDsl.g:5741:2: ','
            {
             before(grammarAccess.getNode_ImplAccess().getCommaKeyword_4_3_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getNode_ImplAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__Group_4_3__0__Impl"


    // $ANTLR start "rule__Node_Impl__Group_4_3__1"
    // InternalActivityDiagramDsl.g:5750:1: rule__Node_Impl__Group_4_3__1 : rule__Node_Impl__Group_4_3__1__Impl ;
    public final void rule__Node_Impl__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:5754:1: ( rule__Node_Impl__Group_4_3__1__Impl )
            // InternalActivityDiagramDsl.g:5755:2: rule__Node_Impl__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Node_Impl__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__Group_4_3__1"


    // $ANTLR start "rule__Node_Impl__Group_4_3__1__Impl"
    // InternalActivityDiagramDsl.g:5761:1: rule__Node_Impl__Group_4_3__1__Impl : ( ( rule__Node_Impl__IncomingAssignment_4_3_1 ) ) ;
    public final void rule__Node_Impl__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:5765:1: ( ( ( rule__Node_Impl__IncomingAssignment_4_3_1 ) ) )
            // InternalActivityDiagramDsl.g:5766:1: ( ( rule__Node_Impl__IncomingAssignment_4_3_1 ) )
            {
            // InternalActivityDiagramDsl.g:5766:1: ( ( rule__Node_Impl__IncomingAssignment_4_3_1 ) )
            // InternalActivityDiagramDsl.g:5767:2: ( rule__Node_Impl__IncomingAssignment_4_3_1 )
            {
             before(grammarAccess.getNode_ImplAccess().getIncomingAssignment_4_3_1()); 
            // InternalActivityDiagramDsl.g:5768:2: ( rule__Node_Impl__IncomingAssignment_4_3_1 )
            // InternalActivityDiagramDsl.g:5768:3: rule__Node_Impl__IncomingAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Node_Impl__IncomingAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getNode_ImplAccess().getIncomingAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__Group_4_3__1__Impl"


    // $ANTLR start "rule__Node_Impl__Group_5__0"
    // InternalActivityDiagramDsl.g:5777:1: rule__Node_Impl__Group_5__0 : rule__Node_Impl__Group_5__0__Impl rule__Node_Impl__Group_5__1 ;
    public final void rule__Node_Impl__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:5781:1: ( rule__Node_Impl__Group_5__0__Impl rule__Node_Impl__Group_5__1 )
            // InternalActivityDiagramDsl.g:5782:2: rule__Node_Impl__Group_5__0__Impl rule__Node_Impl__Group_5__1
            {
            pushFollow(FOLLOW_17);
            rule__Node_Impl__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node_Impl__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__Group_5__0"


    // $ANTLR start "rule__Node_Impl__Group_5__0__Impl"
    // InternalActivityDiagramDsl.g:5789:1: rule__Node_Impl__Group_5__0__Impl : ( 'outgoing' ) ;
    public final void rule__Node_Impl__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:5793:1: ( ( 'outgoing' ) )
            // InternalActivityDiagramDsl.g:5794:1: ( 'outgoing' )
            {
            // InternalActivityDiagramDsl.g:5794:1: ( 'outgoing' )
            // InternalActivityDiagramDsl.g:5795:2: 'outgoing'
            {
             before(grammarAccess.getNode_ImplAccess().getOutgoingKeyword_5_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getNode_ImplAccess().getOutgoingKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__Group_5__0__Impl"


    // $ANTLR start "rule__Node_Impl__Group_5__1"
    // InternalActivityDiagramDsl.g:5804:1: rule__Node_Impl__Group_5__1 : rule__Node_Impl__Group_5__1__Impl rule__Node_Impl__Group_5__2 ;
    public final void rule__Node_Impl__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:5808:1: ( rule__Node_Impl__Group_5__1__Impl rule__Node_Impl__Group_5__2 )
            // InternalActivityDiagramDsl.g:5809:2: rule__Node_Impl__Group_5__1__Impl rule__Node_Impl__Group_5__2
            {
            pushFollow(FOLLOW_4);
            rule__Node_Impl__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node_Impl__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__Group_5__1"


    // $ANTLR start "rule__Node_Impl__Group_5__1__Impl"
    // InternalActivityDiagramDsl.g:5816:1: rule__Node_Impl__Group_5__1__Impl : ( '(' ) ;
    public final void rule__Node_Impl__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:5820:1: ( ( '(' ) )
            // InternalActivityDiagramDsl.g:5821:1: ( '(' )
            {
            // InternalActivityDiagramDsl.g:5821:1: ( '(' )
            // InternalActivityDiagramDsl.g:5822:2: '('
            {
             before(grammarAccess.getNode_ImplAccess().getLeftParenthesisKeyword_5_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getNode_ImplAccess().getLeftParenthesisKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__Group_5__1__Impl"


    // $ANTLR start "rule__Node_Impl__Group_5__2"
    // InternalActivityDiagramDsl.g:5831:1: rule__Node_Impl__Group_5__2 : rule__Node_Impl__Group_5__2__Impl rule__Node_Impl__Group_5__3 ;
    public final void rule__Node_Impl__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:5835:1: ( rule__Node_Impl__Group_5__2__Impl rule__Node_Impl__Group_5__3 )
            // InternalActivityDiagramDsl.g:5836:2: rule__Node_Impl__Group_5__2__Impl rule__Node_Impl__Group_5__3
            {
            pushFollow(FOLLOW_18);
            rule__Node_Impl__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node_Impl__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__Group_5__2"


    // $ANTLR start "rule__Node_Impl__Group_5__2__Impl"
    // InternalActivityDiagramDsl.g:5843:1: rule__Node_Impl__Group_5__2__Impl : ( ( rule__Node_Impl__OutgoingAssignment_5_2 ) ) ;
    public final void rule__Node_Impl__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:5847:1: ( ( ( rule__Node_Impl__OutgoingAssignment_5_2 ) ) )
            // InternalActivityDiagramDsl.g:5848:1: ( ( rule__Node_Impl__OutgoingAssignment_5_2 ) )
            {
            // InternalActivityDiagramDsl.g:5848:1: ( ( rule__Node_Impl__OutgoingAssignment_5_2 ) )
            // InternalActivityDiagramDsl.g:5849:2: ( rule__Node_Impl__OutgoingAssignment_5_2 )
            {
             before(grammarAccess.getNode_ImplAccess().getOutgoingAssignment_5_2()); 
            // InternalActivityDiagramDsl.g:5850:2: ( rule__Node_Impl__OutgoingAssignment_5_2 )
            // InternalActivityDiagramDsl.g:5850:3: rule__Node_Impl__OutgoingAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__Node_Impl__OutgoingAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getNode_ImplAccess().getOutgoingAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__Group_5__2__Impl"


    // $ANTLR start "rule__Node_Impl__Group_5__3"
    // InternalActivityDiagramDsl.g:5858:1: rule__Node_Impl__Group_5__3 : rule__Node_Impl__Group_5__3__Impl rule__Node_Impl__Group_5__4 ;
    public final void rule__Node_Impl__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:5862:1: ( rule__Node_Impl__Group_5__3__Impl rule__Node_Impl__Group_5__4 )
            // InternalActivityDiagramDsl.g:5863:2: rule__Node_Impl__Group_5__3__Impl rule__Node_Impl__Group_5__4
            {
            pushFollow(FOLLOW_18);
            rule__Node_Impl__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node_Impl__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__Group_5__3"


    // $ANTLR start "rule__Node_Impl__Group_5__3__Impl"
    // InternalActivityDiagramDsl.g:5870:1: rule__Node_Impl__Group_5__3__Impl : ( ( rule__Node_Impl__Group_5_3__0 )* ) ;
    public final void rule__Node_Impl__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:5874:1: ( ( ( rule__Node_Impl__Group_5_3__0 )* ) )
            // InternalActivityDiagramDsl.g:5875:1: ( ( rule__Node_Impl__Group_5_3__0 )* )
            {
            // InternalActivityDiagramDsl.g:5875:1: ( ( rule__Node_Impl__Group_5_3__0 )* )
            // InternalActivityDiagramDsl.g:5876:2: ( rule__Node_Impl__Group_5_3__0 )*
            {
             before(grammarAccess.getNode_ImplAccess().getGroup_5_3()); 
            // InternalActivityDiagramDsl.g:5877:2: ( rule__Node_Impl__Group_5_3__0 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==17) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalActivityDiagramDsl.g:5877:3: rule__Node_Impl__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Node_Impl__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

             after(grammarAccess.getNode_ImplAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__Group_5__3__Impl"


    // $ANTLR start "rule__Node_Impl__Group_5__4"
    // InternalActivityDiagramDsl.g:5885:1: rule__Node_Impl__Group_5__4 : rule__Node_Impl__Group_5__4__Impl ;
    public final void rule__Node_Impl__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:5889:1: ( rule__Node_Impl__Group_5__4__Impl )
            // InternalActivityDiagramDsl.g:5890:2: rule__Node_Impl__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Node_Impl__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__Group_5__4"


    // $ANTLR start "rule__Node_Impl__Group_5__4__Impl"
    // InternalActivityDiagramDsl.g:5896:1: rule__Node_Impl__Group_5__4__Impl : ( ')' ) ;
    public final void rule__Node_Impl__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:5900:1: ( ( ')' ) )
            // InternalActivityDiagramDsl.g:5901:1: ( ')' )
            {
            // InternalActivityDiagramDsl.g:5901:1: ( ')' )
            // InternalActivityDiagramDsl.g:5902:2: ')'
            {
             before(grammarAccess.getNode_ImplAccess().getRightParenthesisKeyword_5_4()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getNode_ImplAccess().getRightParenthesisKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__Group_5__4__Impl"


    // $ANTLR start "rule__Node_Impl__Group_5_3__0"
    // InternalActivityDiagramDsl.g:5912:1: rule__Node_Impl__Group_5_3__0 : rule__Node_Impl__Group_5_3__0__Impl rule__Node_Impl__Group_5_3__1 ;
    public final void rule__Node_Impl__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:5916:1: ( rule__Node_Impl__Group_5_3__0__Impl rule__Node_Impl__Group_5_3__1 )
            // InternalActivityDiagramDsl.g:5917:2: rule__Node_Impl__Group_5_3__0__Impl rule__Node_Impl__Group_5_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Node_Impl__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node_Impl__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__Group_5_3__0"


    // $ANTLR start "rule__Node_Impl__Group_5_3__0__Impl"
    // InternalActivityDiagramDsl.g:5924:1: rule__Node_Impl__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Node_Impl__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:5928:1: ( ( ',' ) )
            // InternalActivityDiagramDsl.g:5929:1: ( ',' )
            {
            // InternalActivityDiagramDsl.g:5929:1: ( ',' )
            // InternalActivityDiagramDsl.g:5930:2: ','
            {
             before(grammarAccess.getNode_ImplAccess().getCommaKeyword_5_3_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getNode_ImplAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__Group_5_3__0__Impl"


    // $ANTLR start "rule__Node_Impl__Group_5_3__1"
    // InternalActivityDiagramDsl.g:5939:1: rule__Node_Impl__Group_5_3__1 : rule__Node_Impl__Group_5_3__1__Impl ;
    public final void rule__Node_Impl__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:5943:1: ( rule__Node_Impl__Group_5_3__1__Impl )
            // InternalActivityDiagramDsl.g:5944:2: rule__Node_Impl__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Node_Impl__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__Group_5_3__1"


    // $ANTLR start "rule__Node_Impl__Group_5_3__1__Impl"
    // InternalActivityDiagramDsl.g:5950:1: rule__Node_Impl__Group_5_3__1__Impl : ( ( rule__Node_Impl__OutgoingAssignment_5_3_1 ) ) ;
    public final void rule__Node_Impl__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:5954:1: ( ( ( rule__Node_Impl__OutgoingAssignment_5_3_1 ) ) )
            // InternalActivityDiagramDsl.g:5955:1: ( ( rule__Node_Impl__OutgoingAssignment_5_3_1 ) )
            {
            // InternalActivityDiagramDsl.g:5955:1: ( ( rule__Node_Impl__OutgoingAssignment_5_3_1 ) )
            // InternalActivityDiagramDsl.g:5956:2: ( rule__Node_Impl__OutgoingAssignment_5_3_1 )
            {
             before(grammarAccess.getNode_ImplAccess().getOutgoingAssignment_5_3_1()); 
            // InternalActivityDiagramDsl.g:5957:2: ( rule__Node_Impl__OutgoingAssignment_5_3_1 )
            // InternalActivityDiagramDsl.g:5957:3: rule__Node_Impl__OutgoingAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Node_Impl__OutgoingAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getNode_ImplAccess().getOutgoingAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__Group_5_3__1__Impl"


    // $ANTLR start "rule__ActivityDiagram__NameAssignment_2"
    // InternalActivityDiagramDsl.g:5966:1: rule__ActivityDiagram__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__ActivityDiagram__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:5970:1: ( ( ruleEString ) )
            // InternalActivityDiagramDsl.g:5971:2: ( ruleEString )
            {
            // InternalActivityDiagramDsl.g:5971:2: ( ruleEString )
            // InternalActivityDiagramDsl.g:5972:3: ruleEString
            {
             before(grammarAccess.getActivityDiagramAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getActivityDiagramAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityDiagram__NameAssignment_2"


    // $ANTLR start "rule__ActivityDiagram__InitialNodeAssignment_4_1"
    // InternalActivityDiagramDsl.g:5981:1: rule__ActivityDiagram__InitialNodeAssignment_4_1 : ( ruleInitialNode ) ;
    public final void rule__ActivityDiagram__InitialNodeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:5985:1: ( ( ruleInitialNode ) )
            // InternalActivityDiagramDsl.g:5986:2: ( ruleInitialNode )
            {
            // InternalActivityDiagramDsl.g:5986:2: ( ruleInitialNode )
            // InternalActivityDiagramDsl.g:5987:3: ruleInitialNode
            {
             before(grammarAccess.getActivityDiagramAccess().getInitialNodeInitialNodeParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleInitialNode();

            state._fsp--;

             after(grammarAccess.getActivityDiagramAccess().getInitialNodeInitialNodeParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityDiagram__InitialNodeAssignment_4_1"


    // $ANTLR start "rule__ActivityDiagram__FinalNodeAssignment_5_1"
    // InternalActivityDiagramDsl.g:5996:1: rule__ActivityDiagram__FinalNodeAssignment_5_1 : ( ruleFinalNode ) ;
    public final void rule__ActivityDiagram__FinalNodeAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:6000:1: ( ( ruleFinalNode ) )
            // InternalActivityDiagramDsl.g:6001:2: ( ruleFinalNode )
            {
            // InternalActivityDiagramDsl.g:6001:2: ( ruleFinalNode )
            // InternalActivityDiagramDsl.g:6002:3: ruleFinalNode
            {
             before(grammarAccess.getActivityDiagramAccess().getFinalNodeFinalNodeParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFinalNode();

            state._fsp--;

             after(grammarAccess.getActivityDiagramAccess().getFinalNodeFinalNodeParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityDiagram__FinalNodeAssignment_5_1"


    // $ANTLR start "rule__ActivityDiagram__TrasitionsAssignment_6_2"
    // InternalActivityDiagramDsl.g:6011:1: rule__ActivityDiagram__TrasitionsAssignment_6_2 : ( ruleTransition ) ;
    public final void rule__ActivityDiagram__TrasitionsAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:6015:1: ( ( ruleTransition ) )
            // InternalActivityDiagramDsl.g:6016:2: ( ruleTransition )
            {
            // InternalActivityDiagramDsl.g:6016:2: ( ruleTransition )
            // InternalActivityDiagramDsl.g:6017:3: ruleTransition
            {
             before(grammarAccess.getActivityDiagramAccess().getTrasitionsTransitionParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getActivityDiagramAccess().getTrasitionsTransitionParserRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityDiagram__TrasitionsAssignment_6_2"


    // $ANTLR start "rule__ActivityDiagram__TrasitionsAssignment_6_3_1"
    // InternalActivityDiagramDsl.g:6026:1: rule__ActivityDiagram__TrasitionsAssignment_6_3_1 : ( ruleTransition ) ;
    public final void rule__ActivityDiagram__TrasitionsAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:6030:1: ( ( ruleTransition ) )
            // InternalActivityDiagramDsl.g:6031:2: ( ruleTransition )
            {
            // InternalActivityDiagramDsl.g:6031:2: ( ruleTransition )
            // InternalActivityDiagramDsl.g:6032:3: ruleTransition
            {
             before(grammarAccess.getActivityDiagramAccess().getTrasitionsTransitionParserRuleCall_6_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getActivityDiagramAccess().getTrasitionsTransitionParserRuleCall_6_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityDiagram__TrasitionsAssignment_6_3_1"


    // $ANTLR start "rule__ActivityDiagram__ActivityNodesAssignment_7_2"
    // InternalActivityDiagramDsl.g:6041:1: rule__ActivityDiagram__ActivityNodesAssignment_7_2 : ( ruleActivityNode ) ;
    public final void rule__ActivityDiagram__ActivityNodesAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:6045:1: ( ( ruleActivityNode ) )
            // InternalActivityDiagramDsl.g:6046:2: ( ruleActivityNode )
            {
            // InternalActivityDiagramDsl.g:6046:2: ( ruleActivityNode )
            // InternalActivityDiagramDsl.g:6047:3: ruleActivityNode
            {
             before(grammarAccess.getActivityDiagramAccess().getActivityNodesActivityNodeParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_2);
            ruleActivityNode();

            state._fsp--;

             after(grammarAccess.getActivityDiagramAccess().getActivityNodesActivityNodeParserRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityDiagram__ActivityNodesAssignment_7_2"


    // $ANTLR start "rule__ActivityDiagram__ActivityNodesAssignment_7_3_1"
    // InternalActivityDiagramDsl.g:6056:1: rule__ActivityDiagram__ActivityNodesAssignment_7_3_1 : ( ruleActivityNode ) ;
    public final void rule__ActivityDiagram__ActivityNodesAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:6060:1: ( ( ruleActivityNode ) )
            // InternalActivityDiagramDsl.g:6061:2: ( ruleActivityNode )
            {
            // InternalActivityDiagramDsl.g:6061:2: ( ruleActivityNode )
            // InternalActivityDiagramDsl.g:6062:3: ruleActivityNode
            {
             before(grammarAccess.getActivityDiagramAccess().getActivityNodesActivityNodeParserRuleCall_7_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleActivityNode();

            state._fsp--;

             after(grammarAccess.getActivityDiagramAccess().getActivityNodesActivityNodeParserRuleCall_7_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityDiagram__ActivityNodesAssignment_7_3_1"


    // $ANTLR start "rule__ActivityDiagram__ForkNodesAssignment_8_2"
    // InternalActivityDiagramDsl.g:6071:1: rule__ActivityDiagram__ForkNodesAssignment_8_2 : ( ruleForkNode ) ;
    public final void rule__ActivityDiagram__ForkNodesAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:6075:1: ( ( ruleForkNode ) )
            // InternalActivityDiagramDsl.g:6076:2: ( ruleForkNode )
            {
            // InternalActivityDiagramDsl.g:6076:2: ( ruleForkNode )
            // InternalActivityDiagramDsl.g:6077:3: ruleForkNode
            {
             before(grammarAccess.getActivityDiagramAccess().getForkNodesForkNodeParserRuleCall_8_2_0()); 
            pushFollow(FOLLOW_2);
            ruleForkNode();

            state._fsp--;

             after(grammarAccess.getActivityDiagramAccess().getForkNodesForkNodeParserRuleCall_8_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityDiagram__ForkNodesAssignment_8_2"


    // $ANTLR start "rule__ActivityDiagram__ForkNodesAssignment_8_3_1"
    // InternalActivityDiagramDsl.g:6086:1: rule__ActivityDiagram__ForkNodesAssignment_8_3_1 : ( ruleForkNode ) ;
    public final void rule__ActivityDiagram__ForkNodesAssignment_8_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:6090:1: ( ( ruleForkNode ) )
            // InternalActivityDiagramDsl.g:6091:2: ( ruleForkNode )
            {
            // InternalActivityDiagramDsl.g:6091:2: ( ruleForkNode )
            // InternalActivityDiagramDsl.g:6092:3: ruleForkNode
            {
             before(grammarAccess.getActivityDiagramAccess().getForkNodesForkNodeParserRuleCall_8_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleForkNode();

            state._fsp--;

             after(grammarAccess.getActivityDiagramAccess().getForkNodesForkNodeParserRuleCall_8_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityDiagram__ForkNodesAssignment_8_3_1"


    // $ANTLR start "rule__ActivityDiagram__JoinNodesAssignment_9_2"
    // InternalActivityDiagramDsl.g:6101:1: rule__ActivityDiagram__JoinNodesAssignment_9_2 : ( ruleJoinNode ) ;
    public final void rule__ActivityDiagram__JoinNodesAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:6105:1: ( ( ruleJoinNode ) )
            // InternalActivityDiagramDsl.g:6106:2: ( ruleJoinNode )
            {
            // InternalActivityDiagramDsl.g:6106:2: ( ruleJoinNode )
            // InternalActivityDiagramDsl.g:6107:3: ruleJoinNode
            {
             before(grammarAccess.getActivityDiagramAccess().getJoinNodesJoinNodeParserRuleCall_9_2_0()); 
            pushFollow(FOLLOW_2);
            ruleJoinNode();

            state._fsp--;

             after(grammarAccess.getActivityDiagramAccess().getJoinNodesJoinNodeParserRuleCall_9_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityDiagram__JoinNodesAssignment_9_2"


    // $ANTLR start "rule__ActivityDiagram__JoinNodesAssignment_9_3_1"
    // InternalActivityDiagramDsl.g:6116:1: rule__ActivityDiagram__JoinNodesAssignment_9_3_1 : ( ruleJoinNode ) ;
    public final void rule__ActivityDiagram__JoinNodesAssignment_9_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:6120:1: ( ( ruleJoinNode ) )
            // InternalActivityDiagramDsl.g:6121:2: ( ruleJoinNode )
            {
            // InternalActivityDiagramDsl.g:6121:2: ( ruleJoinNode )
            // InternalActivityDiagramDsl.g:6122:3: ruleJoinNode
            {
             before(grammarAccess.getActivityDiagramAccess().getJoinNodesJoinNodeParserRuleCall_9_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleJoinNode();

            state._fsp--;

             after(grammarAccess.getActivityDiagramAccess().getJoinNodesJoinNodeParserRuleCall_9_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityDiagram__JoinNodesAssignment_9_3_1"


    // $ANTLR start "rule__ActivityDiagram__DecisionNodesAssignment_10_2"
    // InternalActivityDiagramDsl.g:6131:1: rule__ActivityDiagram__DecisionNodesAssignment_10_2 : ( ruleDecisionNode ) ;
    public final void rule__ActivityDiagram__DecisionNodesAssignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:6135:1: ( ( ruleDecisionNode ) )
            // InternalActivityDiagramDsl.g:6136:2: ( ruleDecisionNode )
            {
            // InternalActivityDiagramDsl.g:6136:2: ( ruleDecisionNode )
            // InternalActivityDiagramDsl.g:6137:3: ruleDecisionNode
            {
             before(grammarAccess.getActivityDiagramAccess().getDecisionNodesDecisionNodeParserRuleCall_10_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDecisionNode();

            state._fsp--;

             after(grammarAccess.getActivityDiagramAccess().getDecisionNodesDecisionNodeParserRuleCall_10_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityDiagram__DecisionNodesAssignment_10_2"


    // $ANTLR start "rule__ActivityDiagram__DecisionNodesAssignment_10_3_1"
    // InternalActivityDiagramDsl.g:6146:1: rule__ActivityDiagram__DecisionNodesAssignment_10_3_1 : ( ruleDecisionNode ) ;
    public final void rule__ActivityDiagram__DecisionNodesAssignment_10_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:6150:1: ( ( ruleDecisionNode ) )
            // InternalActivityDiagramDsl.g:6151:2: ( ruleDecisionNode )
            {
            // InternalActivityDiagramDsl.g:6151:2: ( ruleDecisionNode )
            // InternalActivityDiagramDsl.g:6152:3: ruleDecisionNode
            {
             before(grammarAccess.getActivityDiagramAccess().getDecisionNodesDecisionNodeParserRuleCall_10_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDecisionNode();

            state._fsp--;

             after(grammarAccess.getActivityDiagramAccess().getDecisionNodesDecisionNodeParserRuleCall_10_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityDiagram__DecisionNodesAssignment_10_3_1"


    // $ANTLR start "rule__InitialNode__NameAssignment_2"
    // InternalActivityDiagramDsl.g:6161:1: rule__InitialNode__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__InitialNode__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:6165:1: ( ( ruleEString ) )
            // InternalActivityDiagramDsl.g:6166:2: ( ruleEString )
            {
            // InternalActivityDiagramDsl.g:6166:2: ( ruleEString )
            // InternalActivityDiagramDsl.g:6167:3: ruleEString
            {
             before(grammarAccess.getInitialNodeAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInitialNodeAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialNode__NameAssignment_2"


    // $ANTLR start "rule__InitialNode__IncomingAssignment_4_2"
    // InternalActivityDiagramDsl.g:6176:1: rule__InitialNode__IncomingAssignment_4_2 : ( ( ruleEString ) ) ;
    public final void rule__InitialNode__IncomingAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:6180:1: ( ( ( ruleEString ) ) )
            // InternalActivityDiagramDsl.g:6181:2: ( ( ruleEString ) )
            {
            // InternalActivityDiagramDsl.g:6181:2: ( ( ruleEString ) )
            // InternalActivityDiagramDsl.g:6182:3: ( ruleEString )
            {
             before(grammarAccess.getInitialNodeAccess().getIncomingTransitionCrossReference_4_2_0()); 
            // InternalActivityDiagramDsl.g:6183:3: ( ruleEString )
            // InternalActivityDiagramDsl.g:6184:4: ruleEString
            {
             before(grammarAccess.getInitialNodeAccess().getIncomingTransitionEStringParserRuleCall_4_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInitialNodeAccess().getIncomingTransitionEStringParserRuleCall_4_2_0_1()); 

            }

             after(grammarAccess.getInitialNodeAccess().getIncomingTransitionCrossReference_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialNode__IncomingAssignment_4_2"


    // $ANTLR start "rule__InitialNode__IncomingAssignment_4_3_1"
    // InternalActivityDiagramDsl.g:6195:1: rule__InitialNode__IncomingAssignment_4_3_1 : ( ( ruleEString ) ) ;
    public final void rule__InitialNode__IncomingAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:6199:1: ( ( ( ruleEString ) ) )
            // InternalActivityDiagramDsl.g:6200:2: ( ( ruleEString ) )
            {
            // InternalActivityDiagramDsl.g:6200:2: ( ( ruleEString ) )
            // InternalActivityDiagramDsl.g:6201:3: ( ruleEString )
            {
             before(grammarAccess.getInitialNodeAccess().getIncomingTransitionCrossReference_4_3_1_0()); 
            // InternalActivityDiagramDsl.g:6202:3: ( ruleEString )
            // InternalActivityDiagramDsl.g:6203:4: ruleEString
            {
             before(grammarAccess.getInitialNodeAccess().getIncomingTransitionEStringParserRuleCall_4_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInitialNodeAccess().getIncomingTransitionEStringParserRuleCall_4_3_1_0_1()); 

            }

             after(grammarAccess.getInitialNodeAccess().getIncomingTransitionCrossReference_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialNode__IncomingAssignment_4_3_1"


    // $ANTLR start "rule__InitialNode__OutgoingAssignment_5_2"
    // InternalActivityDiagramDsl.g:6214:1: rule__InitialNode__OutgoingAssignment_5_2 : ( ( ruleEString ) ) ;
    public final void rule__InitialNode__OutgoingAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:6218:1: ( ( ( ruleEString ) ) )
            // InternalActivityDiagramDsl.g:6219:2: ( ( ruleEString ) )
            {
            // InternalActivityDiagramDsl.g:6219:2: ( ( ruleEString ) )
            // InternalActivityDiagramDsl.g:6220:3: ( ruleEString )
            {
             before(grammarAccess.getInitialNodeAccess().getOutgoingTransitionCrossReference_5_2_0()); 
            // InternalActivityDiagramDsl.g:6221:3: ( ruleEString )
            // InternalActivityDiagramDsl.g:6222:4: ruleEString
            {
             before(grammarAccess.getInitialNodeAccess().getOutgoingTransitionEStringParserRuleCall_5_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInitialNodeAccess().getOutgoingTransitionEStringParserRuleCall_5_2_0_1()); 

            }

             after(grammarAccess.getInitialNodeAccess().getOutgoingTransitionCrossReference_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialNode__OutgoingAssignment_5_2"


    // $ANTLR start "rule__InitialNode__OutgoingAssignment_5_3_1"
    // InternalActivityDiagramDsl.g:6233:1: rule__InitialNode__OutgoingAssignment_5_3_1 : ( ( ruleEString ) ) ;
    public final void rule__InitialNode__OutgoingAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:6237:1: ( ( ( ruleEString ) ) )
            // InternalActivityDiagramDsl.g:6238:2: ( ( ruleEString ) )
            {
            // InternalActivityDiagramDsl.g:6238:2: ( ( ruleEString ) )
            // InternalActivityDiagramDsl.g:6239:3: ( ruleEString )
            {
             before(grammarAccess.getInitialNodeAccess().getOutgoingTransitionCrossReference_5_3_1_0()); 
            // InternalActivityDiagramDsl.g:6240:3: ( ruleEString )
            // InternalActivityDiagramDsl.g:6241:4: ruleEString
            {
             before(grammarAccess.getInitialNodeAccess().getOutgoingTransitionEStringParserRuleCall_5_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInitialNodeAccess().getOutgoingTransitionEStringParserRuleCall_5_3_1_0_1()); 

            }

             after(grammarAccess.getInitialNodeAccess().getOutgoingTransitionCrossReference_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialNode__OutgoingAssignment_5_3_1"


    // $ANTLR start "rule__FinalNode__NameAssignment_2"
    // InternalActivityDiagramDsl.g:6252:1: rule__FinalNode__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__FinalNode__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:6256:1: ( ( ruleEString ) )
            // InternalActivityDiagramDsl.g:6257:2: ( ruleEString )
            {
            // InternalActivityDiagramDsl.g:6257:2: ( ruleEString )
            // InternalActivityDiagramDsl.g:6258:3: ruleEString
            {
             before(grammarAccess.getFinalNodeAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFinalNodeAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FinalNode__NameAssignment_2"


    // $ANTLR start "rule__FinalNode__IncomingAssignment_4_2"
    // InternalActivityDiagramDsl.g:6267:1: rule__FinalNode__IncomingAssignment_4_2 : ( ( ruleEString ) ) ;
    public final void rule__FinalNode__IncomingAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:6271:1: ( ( ( ruleEString ) ) )
            // InternalActivityDiagramDsl.g:6272:2: ( ( ruleEString ) )
            {
            // InternalActivityDiagramDsl.g:6272:2: ( ( ruleEString ) )
            // InternalActivityDiagramDsl.g:6273:3: ( ruleEString )
            {
             before(grammarAccess.getFinalNodeAccess().getIncomingTransitionCrossReference_4_2_0()); 
            // InternalActivityDiagramDsl.g:6274:3: ( ruleEString )
            // InternalActivityDiagramDsl.g:6275:4: ruleEString
            {
             before(grammarAccess.getFinalNodeAccess().getIncomingTransitionEStringParserRuleCall_4_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFinalNodeAccess().getIncomingTransitionEStringParserRuleCall_4_2_0_1()); 

            }

             after(grammarAccess.getFinalNodeAccess().getIncomingTransitionCrossReference_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FinalNode__IncomingAssignment_4_2"


    // $ANTLR start "rule__FinalNode__IncomingAssignment_4_3_1"
    // InternalActivityDiagramDsl.g:6286:1: rule__FinalNode__IncomingAssignment_4_3_1 : ( ( ruleEString ) ) ;
    public final void rule__FinalNode__IncomingAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:6290:1: ( ( ( ruleEString ) ) )
            // InternalActivityDiagramDsl.g:6291:2: ( ( ruleEString ) )
            {
            // InternalActivityDiagramDsl.g:6291:2: ( ( ruleEString ) )
            // InternalActivityDiagramDsl.g:6292:3: ( ruleEString )
            {
             before(grammarAccess.getFinalNodeAccess().getIncomingTransitionCrossReference_4_3_1_0()); 
            // InternalActivityDiagramDsl.g:6293:3: ( ruleEString )
            // InternalActivityDiagramDsl.g:6294:4: ruleEString
            {
             before(grammarAccess.getFinalNodeAccess().getIncomingTransitionEStringParserRuleCall_4_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFinalNodeAccess().getIncomingTransitionEStringParserRuleCall_4_3_1_0_1()); 

            }

             after(grammarAccess.getFinalNodeAccess().getIncomingTransitionCrossReference_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FinalNode__IncomingAssignment_4_3_1"


    // $ANTLR start "rule__FinalNode__OutgoingAssignment_5_2"
    // InternalActivityDiagramDsl.g:6305:1: rule__FinalNode__OutgoingAssignment_5_2 : ( ( ruleEString ) ) ;
    public final void rule__FinalNode__OutgoingAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:6309:1: ( ( ( ruleEString ) ) )
            // InternalActivityDiagramDsl.g:6310:2: ( ( ruleEString ) )
            {
            // InternalActivityDiagramDsl.g:6310:2: ( ( ruleEString ) )
            // InternalActivityDiagramDsl.g:6311:3: ( ruleEString )
            {
             before(grammarAccess.getFinalNodeAccess().getOutgoingTransitionCrossReference_5_2_0()); 
            // InternalActivityDiagramDsl.g:6312:3: ( ruleEString )
            // InternalActivityDiagramDsl.g:6313:4: ruleEString
            {
             before(grammarAccess.getFinalNodeAccess().getOutgoingTransitionEStringParserRuleCall_5_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFinalNodeAccess().getOutgoingTransitionEStringParserRuleCall_5_2_0_1()); 

            }

             after(grammarAccess.getFinalNodeAccess().getOutgoingTransitionCrossReference_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FinalNode__OutgoingAssignment_5_2"


    // $ANTLR start "rule__FinalNode__OutgoingAssignment_5_3_1"
    // InternalActivityDiagramDsl.g:6324:1: rule__FinalNode__OutgoingAssignment_5_3_1 : ( ( ruleEString ) ) ;
    public final void rule__FinalNode__OutgoingAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:6328:1: ( ( ( ruleEString ) ) )
            // InternalActivityDiagramDsl.g:6329:2: ( ( ruleEString ) )
            {
            // InternalActivityDiagramDsl.g:6329:2: ( ( ruleEString ) )
            // InternalActivityDiagramDsl.g:6330:3: ( ruleEString )
            {
             before(grammarAccess.getFinalNodeAccess().getOutgoingTransitionCrossReference_5_3_1_0()); 
            // InternalActivityDiagramDsl.g:6331:3: ( ruleEString )
            // InternalActivityDiagramDsl.g:6332:4: ruleEString
            {
             before(grammarAccess.getFinalNodeAccess().getOutgoingTransitionEStringParserRuleCall_5_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFinalNodeAccess().getOutgoingTransitionEStringParserRuleCall_5_3_1_0_1()); 

            }

             after(grammarAccess.getFinalNodeAccess().getOutgoingTransitionCrossReference_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FinalNode__OutgoingAssignment_5_3_1"


    // $ANTLR start "rule__Transition__NameAssignment_2"
    // InternalActivityDiagramDsl.g:6343:1: rule__Transition__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Transition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:6347:1: ( ( ruleEString ) )
            // InternalActivityDiagramDsl.g:6348:2: ( ruleEString )
            {
            // InternalActivityDiagramDsl.g:6348:2: ( ruleEString )
            // InternalActivityDiagramDsl.g:6349:3: ruleEString
            {
             before(grammarAccess.getTransitionAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__NameAssignment_2"


    // $ANTLR start "rule__Transition__TargetAssignment_4_1"
    // InternalActivityDiagramDsl.g:6358:1: rule__Transition__TargetAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__Transition__TargetAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:6362:1: ( ( ( ruleEString ) ) )
            // InternalActivityDiagramDsl.g:6363:2: ( ( ruleEString ) )
            {
            // InternalActivityDiagramDsl.g:6363:2: ( ( ruleEString ) )
            // InternalActivityDiagramDsl.g:6364:3: ( ruleEString )
            {
             before(grammarAccess.getTransitionAccess().getTargetNodeCrossReference_4_1_0()); 
            // InternalActivityDiagramDsl.g:6365:3: ( ruleEString )
            // InternalActivityDiagramDsl.g:6366:4: ruleEString
            {
             before(grammarAccess.getTransitionAccess().getTargetNodeEStringParserRuleCall_4_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getTargetNodeEStringParserRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getTargetNodeCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__TargetAssignment_4_1"


    // $ANTLR start "rule__Transition__SourceAssignment_5_1"
    // InternalActivityDiagramDsl.g:6377:1: rule__Transition__SourceAssignment_5_1 : ( ( ruleEString ) ) ;
    public final void rule__Transition__SourceAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:6381:1: ( ( ( ruleEString ) ) )
            // InternalActivityDiagramDsl.g:6382:2: ( ( ruleEString ) )
            {
            // InternalActivityDiagramDsl.g:6382:2: ( ( ruleEString ) )
            // InternalActivityDiagramDsl.g:6383:3: ( ruleEString )
            {
             before(grammarAccess.getTransitionAccess().getSourceNodeCrossReference_5_1_0()); 
            // InternalActivityDiagramDsl.g:6384:3: ( ruleEString )
            // InternalActivityDiagramDsl.g:6385:4: ruleEString
            {
             before(grammarAccess.getTransitionAccess().getSourceNodeEStringParserRuleCall_5_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getSourceNodeEStringParserRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getSourceNodeCrossReference_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__SourceAssignment_5_1"


    // $ANTLR start "rule__ActivityNode__NameAssignment_2"
    // InternalActivityDiagramDsl.g:6396:1: rule__ActivityNode__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__ActivityNode__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:6400:1: ( ( ruleEString ) )
            // InternalActivityDiagramDsl.g:6401:2: ( ruleEString )
            {
            // InternalActivityDiagramDsl.g:6401:2: ( ruleEString )
            // InternalActivityDiagramDsl.g:6402:3: ruleEString
            {
             before(grammarAccess.getActivityNodeAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getActivityNodeAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityNode__NameAssignment_2"


    // $ANTLR start "rule__ActivityNode__IncomingAssignment_4_2"
    // InternalActivityDiagramDsl.g:6411:1: rule__ActivityNode__IncomingAssignment_4_2 : ( ( ruleEString ) ) ;
    public final void rule__ActivityNode__IncomingAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:6415:1: ( ( ( ruleEString ) ) )
            // InternalActivityDiagramDsl.g:6416:2: ( ( ruleEString ) )
            {
            // InternalActivityDiagramDsl.g:6416:2: ( ( ruleEString ) )
            // InternalActivityDiagramDsl.g:6417:3: ( ruleEString )
            {
             before(grammarAccess.getActivityNodeAccess().getIncomingTransitionCrossReference_4_2_0()); 
            // InternalActivityDiagramDsl.g:6418:3: ( ruleEString )
            // InternalActivityDiagramDsl.g:6419:4: ruleEString
            {
             before(grammarAccess.getActivityNodeAccess().getIncomingTransitionEStringParserRuleCall_4_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getActivityNodeAccess().getIncomingTransitionEStringParserRuleCall_4_2_0_1()); 

            }

             after(grammarAccess.getActivityNodeAccess().getIncomingTransitionCrossReference_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityNode__IncomingAssignment_4_2"


    // $ANTLR start "rule__ActivityNode__IncomingAssignment_4_3_1"
    // InternalActivityDiagramDsl.g:6430:1: rule__ActivityNode__IncomingAssignment_4_3_1 : ( ( ruleEString ) ) ;
    public final void rule__ActivityNode__IncomingAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:6434:1: ( ( ( ruleEString ) ) )
            // InternalActivityDiagramDsl.g:6435:2: ( ( ruleEString ) )
            {
            // InternalActivityDiagramDsl.g:6435:2: ( ( ruleEString ) )
            // InternalActivityDiagramDsl.g:6436:3: ( ruleEString )
            {
             before(grammarAccess.getActivityNodeAccess().getIncomingTransitionCrossReference_4_3_1_0()); 
            // InternalActivityDiagramDsl.g:6437:3: ( ruleEString )
            // InternalActivityDiagramDsl.g:6438:4: ruleEString
            {
             before(grammarAccess.getActivityNodeAccess().getIncomingTransitionEStringParserRuleCall_4_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getActivityNodeAccess().getIncomingTransitionEStringParserRuleCall_4_3_1_0_1()); 

            }

             after(grammarAccess.getActivityNodeAccess().getIncomingTransitionCrossReference_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityNode__IncomingAssignment_4_3_1"


    // $ANTLR start "rule__ActivityNode__OutgoingAssignment_5_2"
    // InternalActivityDiagramDsl.g:6449:1: rule__ActivityNode__OutgoingAssignment_5_2 : ( ( ruleEString ) ) ;
    public final void rule__ActivityNode__OutgoingAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:6453:1: ( ( ( ruleEString ) ) )
            // InternalActivityDiagramDsl.g:6454:2: ( ( ruleEString ) )
            {
            // InternalActivityDiagramDsl.g:6454:2: ( ( ruleEString ) )
            // InternalActivityDiagramDsl.g:6455:3: ( ruleEString )
            {
             before(grammarAccess.getActivityNodeAccess().getOutgoingTransitionCrossReference_5_2_0()); 
            // InternalActivityDiagramDsl.g:6456:3: ( ruleEString )
            // InternalActivityDiagramDsl.g:6457:4: ruleEString
            {
             before(grammarAccess.getActivityNodeAccess().getOutgoingTransitionEStringParserRuleCall_5_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getActivityNodeAccess().getOutgoingTransitionEStringParserRuleCall_5_2_0_1()); 

            }

             after(grammarAccess.getActivityNodeAccess().getOutgoingTransitionCrossReference_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityNode__OutgoingAssignment_5_2"


    // $ANTLR start "rule__ActivityNode__OutgoingAssignment_5_3_1"
    // InternalActivityDiagramDsl.g:6468:1: rule__ActivityNode__OutgoingAssignment_5_3_1 : ( ( ruleEString ) ) ;
    public final void rule__ActivityNode__OutgoingAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:6472:1: ( ( ( ruleEString ) ) )
            // InternalActivityDiagramDsl.g:6473:2: ( ( ruleEString ) )
            {
            // InternalActivityDiagramDsl.g:6473:2: ( ( ruleEString ) )
            // InternalActivityDiagramDsl.g:6474:3: ( ruleEString )
            {
             before(grammarAccess.getActivityNodeAccess().getOutgoingTransitionCrossReference_5_3_1_0()); 
            // InternalActivityDiagramDsl.g:6475:3: ( ruleEString )
            // InternalActivityDiagramDsl.g:6476:4: ruleEString
            {
             before(grammarAccess.getActivityNodeAccess().getOutgoingTransitionEStringParserRuleCall_5_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getActivityNodeAccess().getOutgoingTransitionEStringParserRuleCall_5_3_1_0_1()); 

            }

             after(grammarAccess.getActivityNodeAccess().getOutgoingTransitionCrossReference_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityNode__OutgoingAssignment_5_3_1"


    // $ANTLR start "rule__ForkNode__NameAssignment_2"
    // InternalActivityDiagramDsl.g:6487:1: rule__ForkNode__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__ForkNode__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:6491:1: ( ( ruleEString ) )
            // InternalActivityDiagramDsl.g:6492:2: ( ruleEString )
            {
            // InternalActivityDiagramDsl.g:6492:2: ( ruleEString )
            // InternalActivityDiagramDsl.g:6493:3: ruleEString
            {
             before(grammarAccess.getForkNodeAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getForkNodeAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForkNode__NameAssignment_2"


    // $ANTLR start "rule__ForkNode__IncomingAssignment_4_2"
    // InternalActivityDiagramDsl.g:6502:1: rule__ForkNode__IncomingAssignment_4_2 : ( ( ruleEString ) ) ;
    public final void rule__ForkNode__IncomingAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:6506:1: ( ( ( ruleEString ) ) )
            // InternalActivityDiagramDsl.g:6507:2: ( ( ruleEString ) )
            {
            // InternalActivityDiagramDsl.g:6507:2: ( ( ruleEString ) )
            // InternalActivityDiagramDsl.g:6508:3: ( ruleEString )
            {
             before(grammarAccess.getForkNodeAccess().getIncomingTransitionCrossReference_4_2_0()); 
            // InternalActivityDiagramDsl.g:6509:3: ( ruleEString )
            // InternalActivityDiagramDsl.g:6510:4: ruleEString
            {
             before(grammarAccess.getForkNodeAccess().getIncomingTransitionEStringParserRuleCall_4_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getForkNodeAccess().getIncomingTransitionEStringParserRuleCall_4_2_0_1()); 

            }

             after(grammarAccess.getForkNodeAccess().getIncomingTransitionCrossReference_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForkNode__IncomingAssignment_4_2"


    // $ANTLR start "rule__ForkNode__IncomingAssignment_4_3_1"
    // InternalActivityDiagramDsl.g:6521:1: rule__ForkNode__IncomingAssignment_4_3_1 : ( ( ruleEString ) ) ;
    public final void rule__ForkNode__IncomingAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:6525:1: ( ( ( ruleEString ) ) )
            // InternalActivityDiagramDsl.g:6526:2: ( ( ruleEString ) )
            {
            // InternalActivityDiagramDsl.g:6526:2: ( ( ruleEString ) )
            // InternalActivityDiagramDsl.g:6527:3: ( ruleEString )
            {
             before(grammarAccess.getForkNodeAccess().getIncomingTransitionCrossReference_4_3_1_0()); 
            // InternalActivityDiagramDsl.g:6528:3: ( ruleEString )
            // InternalActivityDiagramDsl.g:6529:4: ruleEString
            {
             before(grammarAccess.getForkNodeAccess().getIncomingTransitionEStringParserRuleCall_4_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getForkNodeAccess().getIncomingTransitionEStringParserRuleCall_4_3_1_0_1()); 

            }

             after(grammarAccess.getForkNodeAccess().getIncomingTransitionCrossReference_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForkNode__IncomingAssignment_4_3_1"


    // $ANTLR start "rule__ForkNode__OutgoingAssignment_5_2"
    // InternalActivityDiagramDsl.g:6540:1: rule__ForkNode__OutgoingAssignment_5_2 : ( ( ruleEString ) ) ;
    public final void rule__ForkNode__OutgoingAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:6544:1: ( ( ( ruleEString ) ) )
            // InternalActivityDiagramDsl.g:6545:2: ( ( ruleEString ) )
            {
            // InternalActivityDiagramDsl.g:6545:2: ( ( ruleEString ) )
            // InternalActivityDiagramDsl.g:6546:3: ( ruleEString )
            {
             before(grammarAccess.getForkNodeAccess().getOutgoingTransitionCrossReference_5_2_0()); 
            // InternalActivityDiagramDsl.g:6547:3: ( ruleEString )
            // InternalActivityDiagramDsl.g:6548:4: ruleEString
            {
             before(grammarAccess.getForkNodeAccess().getOutgoingTransitionEStringParserRuleCall_5_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getForkNodeAccess().getOutgoingTransitionEStringParserRuleCall_5_2_0_1()); 

            }

             after(grammarAccess.getForkNodeAccess().getOutgoingTransitionCrossReference_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForkNode__OutgoingAssignment_5_2"


    // $ANTLR start "rule__ForkNode__OutgoingAssignment_5_3_1"
    // InternalActivityDiagramDsl.g:6559:1: rule__ForkNode__OutgoingAssignment_5_3_1 : ( ( ruleEString ) ) ;
    public final void rule__ForkNode__OutgoingAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:6563:1: ( ( ( ruleEString ) ) )
            // InternalActivityDiagramDsl.g:6564:2: ( ( ruleEString ) )
            {
            // InternalActivityDiagramDsl.g:6564:2: ( ( ruleEString ) )
            // InternalActivityDiagramDsl.g:6565:3: ( ruleEString )
            {
             before(grammarAccess.getForkNodeAccess().getOutgoingTransitionCrossReference_5_3_1_0()); 
            // InternalActivityDiagramDsl.g:6566:3: ( ruleEString )
            // InternalActivityDiagramDsl.g:6567:4: ruleEString
            {
             before(grammarAccess.getForkNodeAccess().getOutgoingTransitionEStringParserRuleCall_5_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getForkNodeAccess().getOutgoingTransitionEStringParserRuleCall_5_3_1_0_1()); 

            }

             after(grammarAccess.getForkNodeAccess().getOutgoingTransitionCrossReference_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForkNode__OutgoingAssignment_5_3_1"


    // $ANTLR start "rule__JoinNode__NameAssignment_2"
    // InternalActivityDiagramDsl.g:6578:1: rule__JoinNode__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__JoinNode__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:6582:1: ( ( ruleEString ) )
            // InternalActivityDiagramDsl.g:6583:2: ( ruleEString )
            {
            // InternalActivityDiagramDsl.g:6583:2: ( ruleEString )
            // InternalActivityDiagramDsl.g:6584:3: ruleEString
            {
             before(grammarAccess.getJoinNodeAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getJoinNodeAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoinNode__NameAssignment_2"


    // $ANTLR start "rule__JoinNode__IncomingAssignment_4_2"
    // InternalActivityDiagramDsl.g:6593:1: rule__JoinNode__IncomingAssignment_4_2 : ( ( ruleEString ) ) ;
    public final void rule__JoinNode__IncomingAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:6597:1: ( ( ( ruleEString ) ) )
            // InternalActivityDiagramDsl.g:6598:2: ( ( ruleEString ) )
            {
            // InternalActivityDiagramDsl.g:6598:2: ( ( ruleEString ) )
            // InternalActivityDiagramDsl.g:6599:3: ( ruleEString )
            {
             before(grammarAccess.getJoinNodeAccess().getIncomingTransitionCrossReference_4_2_0()); 
            // InternalActivityDiagramDsl.g:6600:3: ( ruleEString )
            // InternalActivityDiagramDsl.g:6601:4: ruleEString
            {
             before(grammarAccess.getJoinNodeAccess().getIncomingTransitionEStringParserRuleCall_4_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getJoinNodeAccess().getIncomingTransitionEStringParserRuleCall_4_2_0_1()); 

            }

             after(grammarAccess.getJoinNodeAccess().getIncomingTransitionCrossReference_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoinNode__IncomingAssignment_4_2"


    // $ANTLR start "rule__JoinNode__IncomingAssignment_4_3_1"
    // InternalActivityDiagramDsl.g:6612:1: rule__JoinNode__IncomingAssignment_4_3_1 : ( ( ruleEString ) ) ;
    public final void rule__JoinNode__IncomingAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:6616:1: ( ( ( ruleEString ) ) )
            // InternalActivityDiagramDsl.g:6617:2: ( ( ruleEString ) )
            {
            // InternalActivityDiagramDsl.g:6617:2: ( ( ruleEString ) )
            // InternalActivityDiagramDsl.g:6618:3: ( ruleEString )
            {
             before(grammarAccess.getJoinNodeAccess().getIncomingTransitionCrossReference_4_3_1_0()); 
            // InternalActivityDiagramDsl.g:6619:3: ( ruleEString )
            // InternalActivityDiagramDsl.g:6620:4: ruleEString
            {
             before(grammarAccess.getJoinNodeAccess().getIncomingTransitionEStringParserRuleCall_4_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getJoinNodeAccess().getIncomingTransitionEStringParserRuleCall_4_3_1_0_1()); 

            }

             after(grammarAccess.getJoinNodeAccess().getIncomingTransitionCrossReference_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoinNode__IncomingAssignment_4_3_1"


    // $ANTLR start "rule__JoinNode__OutgoingAssignment_5_2"
    // InternalActivityDiagramDsl.g:6631:1: rule__JoinNode__OutgoingAssignment_5_2 : ( ( ruleEString ) ) ;
    public final void rule__JoinNode__OutgoingAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:6635:1: ( ( ( ruleEString ) ) )
            // InternalActivityDiagramDsl.g:6636:2: ( ( ruleEString ) )
            {
            // InternalActivityDiagramDsl.g:6636:2: ( ( ruleEString ) )
            // InternalActivityDiagramDsl.g:6637:3: ( ruleEString )
            {
             before(grammarAccess.getJoinNodeAccess().getOutgoingTransitionCrossReference_5_2_0()); 
            // InternalActivityDiagramDsl.g:6638:3: ( ruleEString )
            // InternalActivityDiagramDsl.g:6639:4: ruleEString
            {
             before(grammarAccess.getJoinNodeAccess().getOutgoingTransitionEStringParserRuleCall_5_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getJoinNodeAccess().getOutgoingTransitionEStringParserRuleCall_5_2_0_1()); 

            }

             after(grammarAccess.getJoinNodeAccess().getOutgoingTransitionCrossReference_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoinNode__OutgoingAssignment_5_2"


    // $ANTLR start "rule__JoinNode__OutgoingAssignment_5_3_1"
    // InternalActivityDiagramDsl.g:6650:1: rule__JoinNode__OutgoingAssignment_5_3_1 : ( ( ruleEString ) ) ;
    public final void rule__JoinNode__OutgoingAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:6654:1: ( ( ( ruleEString ) ) )
            // InternalActivityDiagramDsl.g:6655:2: ( ( ruleEString ) )
            {
            // InternalActivityDiagramDsl.g:6655:2: ( ( ruleEString ) )
            // InternalActivityDiagramDsl.g:6656:3: ( ruleEString )
            {
             before(grammarAccess.getJoinNodeAccess().getOutgoingTransitionCrossReference_5_3_1_0()); 
            // InternalActivityDiagramDsl.g:6657:3: ( ruleEString )
            // InternalActivityDiagramDsl.g:6658:4: ruleEString
            {
             before(grammarAccess.getJoinNodeAccess().getOutgoingTransitionEStringParserRuleCall_5_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getJoinNodeAccess().getOutgoingTransitionEStringParserRuleCall_5_3_1_0_1()); 

            }

             after(grammarAccess.getJoinNodeAccess().getOutgoingTransitionCrossReference_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoinNode__OutgoingAssignment_5_3_1"


    // $ANTLR start "rule__DecisionNode__NameAssignment_2"
    // InternalActivityDiagramDsl.g:6669:1: rule__DecisionNode__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__DecisionNode__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:6673:1: ( ( ruleEString ) )
            // InternalActivityDiagramDsl.g:6674:2: ( ruleEString )
            {
            // InternalActivityDiagramDsl.g:6674:2: ( ruleEString )
            // InternalActivityDiagramDsl.g:6675:3: ruleEString
            {
             before(grammarAccess.getDecisionNodeAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDecisionNodeAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecisionNode__NameAssignment_2"


    // $ANTLR start "rule__DecisionNode__IncomingAssignment_4_2"
    // InternalActivityDiagramDsl.g:6684:1: rule__DecisionNode__IncomingAssignment_4_2 : ( ( ruleEString ) ) ;
    public final void rule__DecisionNode__IncomingAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:6688:1: ( ( ( ruleEString ) ) )
            // InternalActivityDiagramDsl.g:6689:2: ( ( ruleEString ) )
            {
            // InternalActivityDiagramDsl.g:6689:2: ( ( ruleEString ) )
            // InternalActivityDiagramDsl.g:6690:3: ( ruleEString )
            {
             before(grammarAccess.getDecisionNodeAccess().getIncomingTransitionCrossReference_4_2_0()); 
            // InternalActivityDiagramDsl.g:6691:3: ( ruleEString )
            // InternalActivityDiagramDsl.g:6692:4: ruleEString
            {
             before(grammarAccess.getDecisionNodeAccess().getIncomingTransitionEStringParserRuleCall_4_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDecisionNodeAccess().getIncomingTransitionEStringParserRuleCall_4_2_0_1()); 

            }

             after(grammarAccess.getDecisionNodeAccess().getIncomingTransitionCrossReference_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecisionNode__IncomingAssignment_4_2"


    // $ANTLR start "rule__DecisionNode__IncomingAssignment_4_3_1"
    // InternalActivityDiagramDsl.g:6703:1: rule__DecisionNode__IncomingAssignment_4_3_1 : ( ( ruleEString ) ) ;
    public final void rule__DecisionNode__IncomingAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:6707:1: ( ( ( ruleEString ) ) )
            // InternalActivityDiagramDsl.g:6708:2: ( ( ruleEString ) )
            {
            // InternalActivityDiagramDsl.g:6708:2: ( ( ruleEString ) )
            // InternalActivityDiagramDsl.g:6709:3: ( ruleEString )
            {
             before(grammarAccess.getDecisionNodeAccess().getIncomingTransitionCrossReference_4_3_1_0()); 
            // InternalActivityDiagramDsl.g:6710:3: ( ruleEString )
            // InternalActivityDiagramDsl.g:6711:4: ruleEString
            {
             before(grammarAccess.getDecisionNodeAccess().getIncomingTransitionEStringParserRuleCall_4_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDecisionNodeAccess().getIncomingTransitionEStringParserRuleCall_4_3_1_0_1()); 

            }

             after(grammarAccess.getDecisionNodeAccess().getIncomingTransitionCrossReference_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecisionNode__IncomingAssignment_4_3_1"


    // $ANTLR start "rule__DecisionNode__OutgoingAssignment_5_2"
    // InternalActivityDiagramDsl.g:6722:1: rule__DecisionNode__OutgoingAssignment_5_2 : ( ( ruleEString ) ) ;
    public final void rule__DecisionNode__OutgoingAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:6726:1: ( ( ( ruleEString ) ) )
            // InternalActivityDiagramDsl.g:6727:2: ( ( ruleEString ) )
            {
            // InternalActivityDiagramDsl.g:6727:2: ( ( ruleEString ) )
            // InternalActivityDiagramDsl.g:6728:3: ( ruleEString )
            {
             before(grammarAccess.getDecisionNodeAccess().getOutgoingTransitionCrossReference_5_2_0()); 
            // InternalActivityDiagramDsl.g:6729:3: ( ruleEString )
            // InternalActivityDiagramDsl.g:6730:4: ruleEString
            {
             before(grammarAccess.getDecisionNodeAccess().getOutgoingTransitionEStringParserRuleCall_5_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDecisionNodeAccess().getOutgoingTransitionEStringParserRuleCall_5_2_0_1()); 

            }

             after(grammarAccess.getDecisionNodeAccess().getOutgoingTransitionCrossReference_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecisionNode__OutgoingAssignment_5_2"


    // $ANTLR start "rule__DecisionNode__OutgoingAssignment_5_3_1"
    // InternalActivityDiagramDsl.g:6741:1: rule__DecisionNode__OutgoingAssignment_5_3_1 : ( ( ruleEString ) ) ;
    public final void rule__DecisionNode__OutgoingAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:6745:1: ( ( ( ruleEString ) ) )
            // InternalActivityDiagramDsl.g:6746:2: ( ( ruleEString ) )
            {
            // InternalActivityDiagramDsl.g:6746:2: ( ( ruleEString ) )
            // InternalActivityDiagramDsl.g:6747:3: ( ruleEString )
            {
             before(grammarAccess.getDecisionNodeAccess().getOutgoingTransitionCrossReference_5_3_1_0()); 
            // InternalActivityDiagramDsl.g:6748:3: ( ruleEString )
            // InternalActivityDiagramDsl.g:6749:4: ruleEString
            {
             before(grammarAccess.getDecisionNodeAccess().getOutgoingTransitionEStringParserRuleCall_5_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDecisionNodeAccess().getOutgoingTransitionEStringParserRuleCall_5_3_1_0_1()); 

            }

             after(grammarAccess.getDecisionNodeAccess().getOutgoingTransitionCrossReference_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecisionNode__OutgoingAssignment_5_3_1"


    // $ANTLR start "rule__Node_Impl__NameAssignment_2"
    // InternalActivityDiagramDsl.g:6760:1: rule__Node_Impl__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Node_Impl__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:6764:1: ( ( ruleEString ) )
            // InternalActivityDiagramDsl.g:6765:2: ( ruleEString )
            {
            // InternalActivityDiagramDsl.g:6765:2: ( ruleEString )
            // InternalActivityDiagramDsl.g:6766:3: ruleEString
            {
             before(grammarAccess.getNode_ImplAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getNode_ImplAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__NameAssignment_2"


    // $ANTLR start "rule__Node_Impl__IncomingAssignment_4_2"
    // InternalActivityDiagramDsl.g:6775:1: rule__Node_Impl__IncomingAssignment_4_2 : ( ( ruleEString ) ) ;
    public final void rule__Node_Impl__IncomingAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:6779:1: ( ( ( ruleEString ) ) )
            // InternalActivityDiagramDsl.g:6780:2: ( ( ruleEString ) )
            {
            // InternalActivityDiagramDsl.g:6780:2: ( ( ruleEString ) )
            // InternalActivityDiagramDsl.g:6781:3: ( ruleEString )
            {
             before(grammarAccess.getNode_ImplAccess().getIncomingTransitionCrossReference_4_2_0()); 
            // InternalActivityDiagramDsl.g:6782:3: ( ruleEString )
            // InternalActivityDiagramDsl.g:6783:4: ruleEString
            {
             before(grammarAccess.getNode_ImplAccess().getIncomingTransitionEStringParserRuleCall_4_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getNode_ImplAccess().getIncomingTransitionEStringParserRuleCall_4_2_0_1()); 

            }

             after(grammarAccess.getNode_ImplAccess().getIncomingTransitionCrossReference_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__IncomingAssignment_4_2"


    // $ANTLR start "rule__Node_Impl__IncomingAssignment_4_3_1"
    // InternalActivityDiagramDsl.g:6794:1: rule__Node_Impl__IncomingAssignment_4_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Node_Impl__IncomingAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:6798:1: ( ( ( ruleEString ) ) )
            // InternalActivityDiagramDsl.g:6799:2: ( ( ruleEString ) )
            {
            // InternalActivityDiagramDsl.g:6799:2: ( ( ruleEString ) )
            // InternalActivityDiagramDsl.g:6800:3: ( ruleEString )
            {
             before(grammarAccess.getNode_ImplAccess().getIncomingTransitionCrossReference_4_3_1_0()); 
            // InternalActivityDiagramDsl.g:6801:3: ( ruleEString )
            // InternalActivityDiagramDsl.g:6802:4: ruleEString
            {
             before(grammarAccess.getNode_ImplAccess().getIncomingTransitionEStringParserRuleCall_4_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getNode_ImplAccess().getIncomingTransitionEStringParserRuleCall_4_3_1_0_1()); 

            }

             after(grammarAccess.getNode_ImplAccess().getIncomingTransitionCrossReference_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__IncomingAssignment_4_3_1"


    // $ANTLR start "rule__Node_Impl__OutgoingAssignment_5_2"
    // InternalActivityDiagramDsl.g:6813:1: rule__Node_Impl__OutgoingAssignment_5_2 : ( ( ruleEString ) ) ;
    public final void rule__Node_Impl__OutgoingAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:6817:1: ( ( ( ruleEString ) ) )
            // InternalActivityDiagramDsl.g:6818:2: ( ( ruleEString ) )
            {
            // InternalActivityDiagramDsl.g:6818:2: ( ( ruleEString ) )
            // InternalActivityDiagramDsl.g:6819:3: ( ruleEString )
            {
             before(grammarAccess.getNode_ImplAccess().getOutgoingTransitionCrossReference_5_2_0()); 
            // InternalActivityDiagramDsl.g:6820:3: ( ruleEString )
            // InternalActivityDiagramDsl.g:6821:4: ruleEString
            {
             before(grammarAccess.getNode_ImplAccess().getOutgoingTransitionEStringParserRuleCall_5_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getNode_ImplAccess().getOutgoingTransitionEStringParserRuleCall_5_2_0_1()); 

            }

             after(grammarAccess.getNode_ImplAccess().getOutgoingTransitionCrossReference_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__OutgoingAssignment_5_2"


    // $ANTLR start "rule__Node_Impl__OutgoingAssignment_5_3_1"
    // InternalActivityDiagramDsl.g:6832:1: rule__Node_Impl__OutgoingAssignment_5_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Node_Impl__OutgoingAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityDiagramDsl.g:6836:1: ( ( ( ruleEString ) ) )
            // InternalActivityDiagramDsl.g:6837:2: ( ( ruleEString ) )
            {
            // InternalActivityDiagramDsl.g:6837:2: ( ( ruleEString ) )
            // InternalActivityDiagramDsl.g:6838:3: ( ruleEString )
            {
             before(grammarAccess.getNode_ImplAccess().getOutgoingTransitionCrossReference_5_3_1_0()); 
            // InternalActivityDiagramDsl.g:6839:3: ( ruleEString )
            // InternalActivityDiagramDsl.g:6840:4: ruleEString
            {
             before(grammarAccess.getNode_ImplAccess().getOutgoingTransitionEStringParserRuleCall_5_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getNode_ImplAccess().getOutgoingTransitionEStringParserRuleCall_5_3_1_0_1()); 

            }

             after(grammarAccess.getNode_ImplAccess().getOutgoingTransitionCrossReference_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__OutgoingAssignment_5_3_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000003DE000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004802000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002020000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000060002000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000800000000L});

}