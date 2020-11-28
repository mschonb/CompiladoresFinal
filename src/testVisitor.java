// Generated from /home/yannsdebian/Documents/TEC/semestre7/compilers/proyecto/CompiladoresFinal/src/test.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link testParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface testVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link testParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(testParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery(testParser.QueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#fragmentDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFragmentDef(testParser.FragmentDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#queryblocks}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryblocks(testParser.QueryblocksContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#queryblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryblock(testParser.QueryblockContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#conditions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditions(testParser.ConditionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(testParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(testParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#fragmentQ}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFragmentQ(testParser.FragmentQContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(testParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(testParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(testParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable(testParser.TableContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlias(testParser.AliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField(testParser.FieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(testParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#logop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogop(testParser.LogopContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(testParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirective(testParser.DirectiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#introspection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntrospection(testParser.IntrospectionContext ctx);
}