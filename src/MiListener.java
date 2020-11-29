import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class MiListener extends testBaseListener {

    private List<Condition> conditions = new ArrayList<>();
    private List<Table> tables = new ArrayList<>();
    static int tableIndex = -1;

    @Override public void enterExpr(testParser.ExprContext ctx) { }
    
    @Override public void exitExpr(testParser.ExprContext ctx) {

    }
    
    @Override public void enterQuery(testParser.QueryContext ctx) { }
    
    @Override public void exitQuery(testParser.QueryContext ctx) { }

    @Override public void enterFragmentDef(testParser.FragmentDefContext ctx) { }
    
    @Override public void exitFragmentDef(testParser.FragmentDefContext ctx) { }
    
    @Override public void enterQueryblocks(testParser.QueryblocksContext ctx) { }
    
    @Override public void exitQueryblocks(testParser.QueryblocksContext ctx) {

    }
    //query { tabla {  } } == SELECT * FROM TABLA
    
    @Override public void enterQueryblock(testParser.QueryblockContext ctx) {
        tables.add(new Table(ctx.table().getText(), new ArrayList<VarName>()));
        //keeping track of which table index we're in
        tableIndex++;

    }
    
    @Override public void exitQueryblock(testParser.QueryblockContext ctx) {
        Query query  = new Query(tables.get(tableIndex), conditions);
        System.out.println(query.stringify());
    }
    
    @Override public void enterConditions(testParser.ConditionsContext ctx) { }

    @Override public void exitConditions(testParser.ConditionsContext ctx) {
    }
    
    @Override public void enterParams(testParser.ParamsContext ctx) { }
    
    @Override public void exitParams(testParser.ParamsContext ctx) { }
    
    @Override public void enterParam(testParser.ParamContext ctx) {
        VarName id = new VarName(ctx.field().getText());
        tables.get(tableIndex).addField(id);
    }
    
    @Override public void exitParam(testParser.ParamContext ctx) { }
    
    @Override public void enterFragmentQ(testParser.FragmentQContext ctx) { }
    
    @Override public void exitFragmentQ(testParser.FragmentQContext ctx) { }
    
    @Override public void enterCondition(testParser.ConditionContext ctx) {
        Value valFact = new Value(ctx.factor().getText());
        //datatype check
        valFact = checkValue(valFact);
        Factor fact = new Factor(valFact);
        Value val = new Value(ctx.value().getText());
        //datatype check
        val = checkValue(val);
        LogOp op = new LogOp(ctx.logop().getText());

        Condition condition = new Condition(val, op, fact);
        conditions.add(condition);
    }
    
    @Override public void exitCondition(testParser.ConditionContext ctx) { }
    
    @Override public void enterFactor(testParser.FactorContext ctx) { }
    
    @Override public void exitFactor(testParser.FactorContext ctx) { }
    
    @Override public void enterTable(testParser.TableContext ctx) { }
    
    @Override public void exitTable(testParser.TableContext ctx) { }
    
    @Override public void enterAlias(testParser.AliasContext ctx) { }
    
    @Override public void exitAlias(testParser.AliasContext ctx) { }

    @Override public void enterField(testParser.FieldContext ctx) {
    }
    
    @Override public void exitField(testParser.FieldContext ctx) { }
    
    @Override public void enterValue(testParser.ValueContext ctx) { }
    
    @Override public void exitValue(testParser.ValueContext ctx) { }
    
    @Override public void enterLogop(testParser.LogopContext ctx) { }
    
    @Override public void exitLogop(testParser.LogopContext ctx) { }
    
    @Override public void enterDirective(testParser.DirectiveContext ctx) { }
    
    @Override public void exitDirective(testParser.DirectiveContext ctx) { }
    
    @Override public void enterIntrospection(testParser.IntrospectionContext ctx) { }
    
    @Override public void exitIntrospection(testParser.IntrospectionContext ctx) { }

    @Override public void enterEveryRule(ParserRuleContext ctx) { }
    
    @Override public void exitEveryRule(ParserRuleContext ctx) { }
    
    @Override public void visitTerminal(TerminalNode node) { }
    
    @Override public void visitErrorNode(ErrorNode node) { }

    public Value checkValue(Value value) {
        Integer intVal = null;
        Float floatVal = null;
        Bool boolVal = null;
        VarName stringVal = null;

        //try catch for val = int
        try {
            intVal = Integer.parseInt(value.getValue());
        }
        //try for val = float
        catch (NumberFormatException ne) {
            try {
                floatVal = Float.parseFloat(value.getValue());
                //boolean (new class which throws exception)
            } catch (NumberFormatException nee) {
                try {
                    boolVal = new Bool(value.getValue());
                    //is string, variable ($var), or id
                } catch (IllegalArgumentException ia) {
                    stringVal = new VarName(value.getValue());
                }

            }

        }
        if (intVal != null) {
            return new Int(intVal);
        }else if (floatVal != null) {
            return new MiFloat(floatVal);
        }else if (boolVal != null) {
            //bool obj already exists
            return boolVal;
        }
        //worst case:
        return stringVal;

    }
}
