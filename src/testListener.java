// Generated from C:/Users/A01207573/IdeaProjects/Compiladores2/src\test.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link testParser}.
 */
public interface testListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link testParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(testParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(testParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(testParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(testParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#fragmentDef}.
	 * @param ctx the parse tree
	 */
	void enterFragmentDef(testParser.FragmentDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#fragmentDef}.
	 * @param ctx the parse tree
	 */
	void exitFragmentDef(testParser.FragmentDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#queryblocks}.
	 * @param ctx the parse tree
	 */
	void enterQueryblocks(testParser.QueryblocksContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#queryblocks}.
	 * @param ctx the parse tree
	 */
	void exitQueryblocks(testParser.QueryblocksContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#queryblock}.
	 * @param ctx the parse tree
	 */
	void enterQueryblock(testParser.QueryblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#queryblock}.
	 * @param ctx the parse tree
	 */
	void exitQueryblock(testParser.QueryblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#conditions}.
	 * @param ctx the parse tree
	 */
	void enterConditions(testParser.ConditionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#conditions}.
	 * @param ctx the parse tree
	 */
	void exitConditions(testParser.ConditionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(testParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(testParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(testParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(testParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#fragmentQ}.
	 * @param ctx the parse tree
	 */
	void enterFragmentQ(testParser.FragmentQContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#fragmentQ}.
	 * @param ctx the parse tree
	 */
	void exitFragmentQ(testParser.FragmentQContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(testParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(testParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(testParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(testParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(testParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(testParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#table}.
	 * @param ctx the parse tree
	 */
	void enterTable(testParser.TableContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#table}.
	 * @param ctx the parse tree
	 */
	void exitTable(testParser.TableContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#alias}.
	 * @param ctx the parse tree
	 */
	void enterAlias(testParser.AliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#alias}.
	 * @param ctx the parse tree
	 */
	void exitAlias(testParser.AliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(testParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(testParser.FieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(testParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(testParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#logop}.
	 * @param ctx the parse tree
	 */
	void enterLogop(testParser.LogopContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#logop}.
	 * @param ctx the parse tree
	 */
	void exitLogop(testParser.LogopContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(testParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(testParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#directive}.
	 * @param ctx the parse tree
	 */
	void enterDirective(testParser.DirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#directive}.
	 * @param ctx the parse tree
	 */
	void exitDirective(testParser.DirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#introspection}.
	 * @param ctx the parse tree
	 */
	void enterIntrospection(testParser.IntrospectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#introspection}.
	 * @param ctx the parse tree
	 */
	void exitIntrospection(testParser.IntrospectionContext ctx);
}