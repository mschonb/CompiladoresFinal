// Generated from C:/Users/A01207573/IdeaProjects/Compiladores2/src\TAC.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TACParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TACVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TACParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(TACParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EmptyStmnt}
	 * labeled alternative in {@link TACParser#stmnts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyStmnt(TACParser.EmptyStmntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StmntsStmnt}
	 * labeled alternative in {@link TACParser#stmnts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmntsStmnt(TACParser.StmntsStmntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrintStmnt}
	 * labeled alternative in {@link TACParser#stmnt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStmnt(TACParser.PrintStmntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GotoStmnt}
	 * labeled alternative in {@link TACParser#stmnt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGotoStmnt(TACParser.GotoStmntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssStmnt}
	 * labeled alternative in {@link TACParser#stmnt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssStmnt(TACParser.AssStmntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfTrueStmnt}
	 * labeled alternative in {@link TACParser#stmnt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfTrueStmnt(TACParser.IfTrueStmntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfFalseStmnt}
	 * labeled alternative in {@link TACParser#stmnt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfFalseStmnt(TACParser.IfFalseStmntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MultOperator}
	 * labeled alternative in {@link TACParser#op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultOperator(TACParser.MultOperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DivOperator}
	 * labeled alternative in {@link TACParser#op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivOperator(TACParser.DivOperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PlusOperator}
	 * labeled alternative in {@link TACParser#op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusOperator(TACParser.PlusOperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MinusOperator}
	 * labeled alternative in {@link TACParser#op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinusOperator(TACParser.MinusOperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RelationalOperator}
	 * labeled alternative in {@link TACParser#op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalOperator(TACParser.RelationalOperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdFact}
	 * labeled alternative in {@link TACParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdFact(TACParser.IdFactContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumFact}
	 * labeled alternative in {@link TACParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumFact(TACParser.NumFactContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IDAcc}
	 * labeled alternative in {@link TACParser#acc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIDAcc(TACParser.IDAccContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprAcc}
	 * labeled alternative in {@link TACParser#acc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAcc(TACParser.ExprAccContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignmentOp}
	 * labeled alternative in {@link TACParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOp(TACParser.AssignmentOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignmentFact}
	 * labeled alternative in {@link TACParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentFact(TACParser.AssignmentFactContext ctx);
}