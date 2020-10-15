// Generated from C:/Users/A01207573/IdeaProjects/Compiladores2/src\TAC.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TACParser}.
 */
public interface TACListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TACParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(TACParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link TACParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(TACParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EmptyStmnt}
	 * labeled alternative in {@link TACParser#stmnts}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStmnt(TACParser.EmptyStmntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EmptyStmnt}
	 * labeled alternative in {@link TACParser#stmnts}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStmnt(TACParser.EmptyStmntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StmntsStmnt}
	 * labeled alternative in {@link TACParser#stmnts}.
	 * @param ctx the parse tree
	 */
	void enterStmntsStmnt(TACParser.StmntsStmntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StmntsStmnt}
	 * labeled alternative in {@link TACParser#stmnts}.
	 * @param ctx the parse tree
	 */
	void exitStmntsStmnt(TACParser.StmntsStmntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrintStmnt}
	 * labeled alternative in {@link TACParser#stmnt}.
	 * @param ctx the parse tree
	 */
	void enterPrintStmnt(TACParser.PrintStmntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrintStmnt}
	 * labeled alternative in {@link TACParser#stmnt}.
	 * @param ctx the parse tree
	 */
	void exitPrintStmnt(TACParser.PrintStmntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GotoStmnt}
	 * labeled alternative in {@link TACParser#stmnt}.
	 * @param ctx the parse tree
	 */
	void enterGotoStmnt(TACParser.GotoStmntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GotoStmnt}
	 * labeled alternative in {@link TACParser#stmnt}.
	 * @param ctx the parse tree
	 */
	void exitGotoStmnt(TACParser.GotoStmntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssStmnt}
	 * labeled alternative in {@link TACParser#stmnt}.
	 * @param ctx the parse tree
	 */
	void enterAssStmnt(TACParser.AssStmntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssStmnt}
	 * labeled alternative in {@link TACParser#stmnt}.
	 * @param ctx the parse tree
	 */
	void exitAssStmnt(TACParser.AssStmntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfTrueStmnt}
	 * labeled alternative in {@link TACParser#stmnt}.
	 * @param ctx the parse tree
	 */
	void enterIfTrueStmnt(TACParser.IfTrueStmntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfTrueStmnt}
	 * labeled alternative in {@link TACParser#stmnt}.
	 * @param ctx the parse tree
	 */
	void exitIfTrueStmnt(TACParser.IfTrueStmntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfFalseStmnt}
	 * labeled alternative in {@link TACParser#stmnt}.
	 * @param ctx the parse tree
	 */
	void enterIfFalseStmnt(TACParser.IfFalseStmntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfFalseStmnt}
	 * labeled alternative in {@link TACParser#stmnt}.
	 * @param ctx the parse tree
	 */
	void exitIfFalseStmnt(TACParser.IfFalseStmntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultOperator}
	 * labeled alternative in {@link TACParser#op}.
	 * @param ctx the parse tree
	 */
	void enterMultOperator(TACParser.MultOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultOperator}
	 * labeled alternative in {@link TACParser#op}.
	 * @param ctx the parse tree
	 */
	void exitMultOperator(TACParser.MultOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DivOperator}
	 * labeled alternative in {@link TACParser#op}.
	 * @param ctx the parse tree
	 */
	void enterDivOperator(TACParser.DivOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DivOperator}
	 * labeled alternative in {@link TACParser#op}.
	 * @param ctx the parse tree
	 */
	void exitDivOperator(TACParser.DivOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PlusOperator}
	 * labeled alternative in {@link TACParser#op}.
	 * @param ctx the parse tree
	 */
	void enterPlusOperator(TACParser.PlusOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PlusOperator}
	 * labeled alternative in {@link TACParser#op}.
	 * @param ctx the parse tree
	 */
	void exitPlusOperator(TACParser.PlusOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MinusOperator}
	 * labeled alternative in {@link TACParser#op}.
	 * @param ctx the parse tree
	 */
	void enterMinusOperator(TACParser.MinusOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MinusOperator}
	 * labeled alternative in {@link TACParser#op}.
	 * @param ctx the parse tree
	 */
	void exitMinusOperator(TACParser.MinusOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RelationalOperator}
	 * labeled alternative in {@link TACParser#op}.
	 * @param ctx the parse tree
	 */
	void enterRelationalOperator(TACParser.RelationalOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RelationalOperator}
	 * labeled alternative in {@link TACParser#op}.
	 * @param ctx the parse tree
	 */
	void exitRelationalOperator(TACParser.RelationalOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdFact}
	 * labeled alternative in {@link TACParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterIdFact(TACParser.IdFactContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdFact}
	 * labeled alternative in {@link TACParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitIdFact(TACParser.IdFactContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumFact}
	 * labeled alternative in {@link TACParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterNumFact(TACParser.NumFactContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumFact}
	 * labeled alternative in {@link TACParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitNumFact(TACParser.NumFactContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IDAcc}
	 * labeled alternative in {@link TACParser#acc}.
	 * @param ctx the parse tree
	 */
	void enterIDAcc(TACParser.IDAccContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IDAcc}
	 * labeled alternative in {@link TACParser#acc}.
	 * @param ctx the parse tree
	 */
	void exitIDAcc(TACParser.IDAccContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprAcc}
	 * labeled alternative in {@link TACParser#acc}.
	 * @param ctx the parse tree
	 */
	void enterExprAcc(TACParser.ExprAccContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprAcc}
	 * labeled alternative in {@link TACParser#acc}.
	 * @param ctx the parse tree
	 */
	void exitExprAcc(TACParser.ExprAccContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignmentOp}
	 * labeled alternative in {@link TACParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOp(TACParser.AssignmentOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignmentOp}
	 * labeled alternative in {@link TACParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOp(TACParser.AssignmentOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignmentFact}
	 * labeled alternative in {@link TACParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentFact(TACParser.AssignmentFactContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignmentFact}
	 * labeled alternative in {@link TACParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentFact(TACParser.AssignmentFactContext ctx);
}