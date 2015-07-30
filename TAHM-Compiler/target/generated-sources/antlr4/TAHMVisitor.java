// Generated from TAHM.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TAHMParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TAHMVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code ifStat}
	 * labeled alternative in {@link TAHMParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStat(@NotNull TAHMParser.IfStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link TAHMParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(@NotNull TAHMParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printStat}
	 * labeled alternative in {@link TAHMParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStat(@NotNull TAHMParser.PrintStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notStat}
	 * labeled alternative in {@link TAHMParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotStat(@NotNull TAHMParser.NotStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link TAHMParser#opt_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_term(@NotNull TAHMParser.Opt_termContext ctx);
	/**
	 * Visit a parse tree produced by {@link TAHMParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(@NotNull TAHMParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link TAHMParser#procedure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedure(@NotNull TAHMParser.ProcedureContext ctx);
	/**
	 * Visit a parse tree produced by {@link TAHMParser#opt_factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_factor(@NotNull TAHMParser.Opt_factorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code beginStat}
	 * labeled alternative in {@link TAHMParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBeginStat(@NotNull TAHMParser.BeginStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberFactor}
	 * labeled alternative in {@link TAHMParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberFactor(@NotNull TAHMParser.NumberFactorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link TAHMParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpr(@NotNull TAHMParser.ParExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link TAHMParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(@NotNull TAHMParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identFactor}
	 * labeled alternative in {@link TAHMParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentFactor(@NotNull TAHMParser.IdentFactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TAHMParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(@NotNull TAHMParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link TAHMParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(@NotNull TAHMParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link TAHMParser#vars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVars(@NotNull TAHMParser.VarsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignStat}
	 * labeled alternative in {@link TAHMParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStat(@NotNull TAHMParser.AssignStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileStat}
	 * labeled alternative in {@link TAHMParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStat(@NotNull TAHMParser.WhileStatContext ctx);
}