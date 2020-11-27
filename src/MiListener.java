import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class MiListener extends testBaseListener {

    private List<Condition> conditions = new ArrayList<>();

    @Override public void enterExpr(testParser.ExprContext ctx) { }
    
    @Override public void exitExpr(testParser.ExprContext ctx) { }
    
    @Override public void enterQuery(testParser.QueryContext ctx) { }
    
    @Override public void exitQuery(testParser.QueryContext ctx) { }

    @Override public void enterFragmentDef(testParser.FragmentDefContext ctx) { }
    
    @Override public void exitFragmentDef(testParser.FragmentDefContext ctx) { }
    
    @Override public void enterQueryblocks(testParser.QueryblocksContext ctx) { }
    
    @Override public void exitQueryblocks(testParser.QueryblocksContext ctx) { }
    
    @Override public void enterQueryblock(testParser.QueryblockContext ctx) {
        System.out.println("entered QueryBlock");
        System.out.println(ctx.table().ID().getText());

    }
    
    @Override public void exitQueryblock(testParser.QueryblockContext ctx) {
        Query query  = new Query(conditions);
        System.out.println(query.stringify());
    }
    
    @Override public void enterConditions(testParser.ConditionsContext ctx) { }

    @Override public void exitConditions(testParser.ConditionsContext ctx) {
    }
    
    @Override public void enterParams(testParser.ParamsContext ctx) { }
    
    @Override public void exitParams(testParser.ParamsContext ctx) { }
    
    @Override public void enterParam(testParser.ParamContext ctx) { }
    
    @Override public void exitParam(testParser.ParamContext ctx) { }
    
    @Override public void enterFragmentQ(testParser.FragmentQContext ctx) { }
    
    @Override public void exitFragmentQ(testParser.FragmentQContext ctx) { }
    
    @Override public void enterCondition(testParser.ConditionContext ctx) {
        //TODO logic for not INT

        Factor fact = new Factor(Integer.parseInt(ctx.factor().getText()));
        Value val = new Value(ctx.value().getText());
        LogOp op = new LogOp(ctx.logop().getText());

        Condition condition = new Condition(val, op, fact);
        conditions.add(condition);

    }
    
    @Override public void exitCondition(testParser.ConditionContext ctx) { }
    
    @Override public void enterFactor(testParser.FactorContext ctx) { }
    
    @Override public void exitFactor(testParser.FactorContext ctx) { }
    
    @Override public void enterAssignment(testParser.AssignmentContext ctx) { }
    
    @Override public void exitAssignment(testParser.AssignmentContext ctx) { }
    
    @Override public void enterTable(testParser.TableContext ctx) { }
    
    @Override public void exitTable(testParser.TableContext ctx) { }
    
    @Override public void enterAlias(testParser.AliasContext ctx) { }
    
    @Override public void exitAlias(testParser.AliasContext ctx) { }
    
    @Override public void enterField(testParser.FieldContext ctx) { }
    
    @Override public void exitField(testParser.FieldContext ctx) { }
    
    @Override public void enterValue(testParser.ValueContext ctx) { }
    
    @Override public void exitValue(testParser.ValueContext ctx) { }
    
    @Override public void enterLogop(testParser.LogopContext ctx) { }
    
    @Override public void exitLogop(testParser.LogopContext ctx) { }
    
    @Override public void enterVariable(testParser.VariableContext ctx) { }
    
    @Override public void exitVariable(testParser.VariableContext ctx) { }
    
    @Override public void enterDirective(testParser.DirectiveContext ctx) { }
    
    @Override public void exitDirective(testParser.DirectiveContext ctx) { }
    
    @Override public void enterIntrospection(testParser.IntrospectionContext ctx) { }
    
    @Override public void exitIntrospection(testParser.IntrospectionContext ctx) { }

    
    @Override public void enterEveryRule(ParserRuleContext ctx) { }
    
    @Override public void exitEveryRule(ParserRuleContext ctx) { }
    
    @Override public void visitTerminal(TerminalNode node) { }
    
    @Override public void visitErrorNode(ErrorNode node) { }

}
