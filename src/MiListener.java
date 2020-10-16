import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.HashMap;
import java.util.LinkedList;

public class MiListener extends TACBaseListener {


    static HashMap<String, Integer> ids = new HashMap<>();
    static HashMap<String, Integer> labels = new HashMap<>();
    static LinkedList<Node> ll = new LinkedList<>();

    int tempValue = 0;
    Node tempNode;

    @Override public void exitProgram(TACParser.ProgramContext ctx) {
        int i = 0;
        while (i < ll.size()) {
            if (ll.get(i) instanceof Goto) {
                i = ll.get(i).ejec();
                continue;
            }
            if (ll.get(i) instanceof BoolExpr) {
                int x = ll.get(i).ejec();
                if (x >= 0) {
                    i = x;
                    continue;
                }
            }
            ll.get(i).ejec();
            i++;
        }
    }

    @Override public void exitEmptyStmnt(TACParser.EmptyStmntContext ctx) { }
    @Override public void exitStmntsStmnt(TACParser.StmntsStmntContext ctx) { }

    @Override public void exitPrintAccStmnt(TACParser.PrintAccStmntContext ctx) {
        //if stmnt is labeled add label to Hashmap
        if (ctx.ID() != null) {
            labels.put(ctx.ID().getText(), ll.size());
        }

        //String accText = ctx.ID().getText();
        //Acc acc = new Acc(new Id(accText));
        Acc acc = (Acc)tempNode;

        ll.add(new Print(acc));

    }

    @Override public void exitPrintFactStmnt(TACParser.PrintFactStmntContext ctx) {
        //if stmnt is labeled add label to Hashmap
        if (ctx.ID() != null) {
            labels.put(ctx.ID().getText(), ll.size());
        }

        Factor factor;
        //Check if factor is a variable or an int
        try {
            int value = Integer.parseInt(ctx.factor().getText());
            factor = new Factor(value);
        }
        catch (Exception e){
            String value = ctx.factor().getText();
            factor = new Factor(new Id(value));
        }

        //Add Stmnt to the linked list
        ll.add(new Print(factor));
    }

    @Override public void exitAssStmnt(TACParser.AssStmntContext ctx) {
        //if stmnt is labeled add label to Hashmap
        if (ctx.ID() != null) {
            labels.put(ctx.ID().getText(), ll.size());
        }
    }


    @Override public void exitAssignmentFact(TACParser.AssignmentFactContext ctx) {
        String acc = ctx.acc().getText();
        Factor factor;
        //Check if factor is a variable or an int
        try {
            int value = Integer.parseInt(ctx.factor().getText());
            factor = new Factor(value);
        }
        catch (Exception e){
            String value = ctx.factor().getText();
            factor = new Factor(new Id(value));
        }
        ll.add(new Assignment(acc, factor));

    }


    @Override public void exitAssignmentOp(TACParser.AssignmentOpContext ctx) {
        //TODO: No tengo idea como hacerlo aqui

        String acc = ctx.acc().getText();
        Op op = (Op)tempNode;

        ll.add(new Assignment(acc, op));
    }

    @Override public void exitPlusOperator(TACParser.PlusOperatorContext ctx) {
        Factor factor;
        Factor factor2;

        try {
            int value = Integer.parseInt(ctx.factor(0).getText());
            factor = new Factor(value);
        }
        catch (Exception e){
            String value = ctx.factor(0).getText();
            factor = new Factor(new Id(value));
        }
        try {
            int value = Integer.parseInt(ctx.factor(1).getText());
            factor2 = new Factor(value);
        }
        catch (Exception e){
            String value = ctx.factor(1).getText();
            factor2 = new Factor(new Id(value));
        }

        tempNode = new Op(factor, "+", factor2);
    }

    @Override public void exitMultOperator(TACParser.MultOperatorContext ctx) {
        Factor factor;
        Factor factor2;

        try {
            int value = Integer.parseInt(ctx.factor(0).getText());
            factor = new Factor(value);
        }
        catch (Exception e){
            String value = ctx.factor(0).getText();
            factor = new Factor(new Id(value));
        }
        try {
            int value = Integer.parseInt(ctx.factor(1).getText());
            factor2 = new Factor(value);
        }
        catch (Exception e){
            String value = ctx.factor(1).getText();
            factor2 = new Factor(new Id(value));
        }

        tempNode = new Op(factor, "*", factor2);
    }



    @Override public void exitDivOperator(TACParser.DivOperatorContext ctx) {
        Factor factor;
        Factor factor2;

        try {
            int value = Integer.parseInt(ctx.factor(0).getText());
            factor = new Factor(value);
        }
        catch (Exception e){
            String value = ctx.factor(0).getText();
            factor = new Factor(new Id(value));
        }
        try {
            int value = Integer.parseInt(ctx.factor(1).getText());
            factor2 = new Factor(value);
        }
        catch (Exception e){
            String value = ctx.factor(1).getText();
            factor2 = new Factor(new Id(value));
        }

        tempNode = new Op(factor, "/", factor2);
    }



    @Override public void exitMinusOperator(TACParser.MinusOperatorContext ctx) {
        Factor factor;
        Factor factor2;

        try {
            int value = Integer.parseInt(ctx.factor(0).getText());
            factor = new Factor(value);
        }
        catch (Exception e){
            String value = ctx.factor(0).getText();
            factor = new Factor(new Id(value));
        }
        try {
            int value = Integer.parseInt(ctx.factor(1).getText());
            factor2 = new Factor(value);
        }
        catch (Exception e){
            String value = ctx.factor(1).getText();
            factor2 = new Factor(new Id(value));
        }

        tempNode = new Op(factor, "/", factor2);
    }

    @Override public void exitRelationalOperator(TACParser.RelationalOperatorContext ctx) {
        Factor factor;
        Factor factor2;

        try {
            int value = Integer.parseInt(ctx.factor(0).getText());
            factor = new Factor(value);
        }
        catch (Exception e){
            String value = ctx.factor(0).getText();
            factor = new Factor(new Id(value));
        }
        try {
            int value = Integer.parseInt(ctx.factor(1).getText());
            factor2 = new Factor(value);
        }
        catch (Exception e){
            String value = ctx.factor(1).getText();
            factor2 = new Factor(new Id(value));
        }

        tempNode = new Op(factor, "<", factor2);
    }


    @Override public void exitGotoStmnt(TACParser.GotoStmntContext ctx) {
        String label;
        if (ctx.ID().size() != 1) {
            labels.put(ctx.ID(0).getText(), ll.size());
            label = ctx.ID(1).getText();
        } else {
            label = ctx.ID(0).getText();
        }


        ll.add(new Goto(label));
    }



    @Override public void exitIfTrueStmnt(TACParser.IfTrueStmntContext ctx) {
        Factor factor;

        try {
            int value = Integer.parseInt(ctx.factor().getText());
            factor = new Factor(value);
        }
        catch (Exception e){
            String value = ctx.factor().getText();
            factor = new Factor(new Id(value));
        }

        ll.add(new BoolExpr(true, factor, new Id(ctx.ID().getText())));
    }

    @Override public void exitIfFalseStmnt(TACParser.IfFalseStmntContext ctx) {
        Factor factor;

        try {
            int value = Integer.parseInt(ctx.factor().getText());
            factor = new Factor(value);
        }
        catch (Exception e){
            String value = ctx.factor().getText();
            factor = new Factor(new Id(value));
        }

        ll.add(new BoolExpr(false, factor, new Id(ctx.ID().getText())));
    }

    @Override public void exitIdFact(TACParser.IdFactContext ctx) {

    }

    @Override public void exitNumFact(TACParser.NumFactContext ctx) {
        tempValue = Integer.parseInt(ctx.NUM().getText());
    }


    @Override public void exitIDAcc(TACParser.IDAccContext ctx) {
        Acc acc;
        Id id = new Id(ctx.ID().getText());
        acc = new Acc(id);

        tempNode = acc;
    }



    @Override public void exitArrayAcc(TACParser.ArrayAccContext ctx) {
        Acc acc;
        Id id = new Id(ctx.getText());
        acc = new Acc(id);

        tempNode = acc;
    }






    @Override public void exitEveryRule(ParserRuleContext ctx) { }

    @Override public void visitTerminal(TerminalNode node) { }

    @Override public void visitErrorNode(ErrorNode node) { }
}
