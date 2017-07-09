package antlr;
// Generated from FactorioScript.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link FactorioScriptParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface FactorioScriptVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code multipleStatementList}
	 * labeled alternative in {@link FactorioScriptParser#statementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleStatementList(FactorioScriptParser.MultipleStatementListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleStatementList}
	 * labeled alternative in {@link FactorioScriptParser#statementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleStatementList(FactorioScriptParser.SingleStatementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link FactorioScriptParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(FactorioScriptParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CompilerStandard}
	 * labeled alternative in {@link FactorioScriptParser#statementCompiler}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilerStandard(FactorioScriptParser.CompilerStandardContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CompilerAlias}
	 * labeled alternative in {@link FactorioScriptParser#statementCompiler}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilerAlias(FactorioScriptParser.CompilerAliasContext ctx);
	/**
	 * Visit a parse tree produced by the {@code overwriteStatementAssign}
	 * labeled alternative in {@link FactorioScriptParser#statementAssign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOverwriteStatementAssign(FactorioScriptParser.OverwriteStatementAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addStatementAssign}
	 * labeled alternative in {@link FactorioScriptParser#statementAssign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddStatementAssign(FactorioScriptParser.AddStatementAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subStatementAssign}
	 * labeled alternative in {@link FactorioScriptParser#statementAssign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubStatementAssign(FactorioScriptParser.SubStatementAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifElseIfElseStatement}
	 * labeled alternative in {@link FactorioScriptParser#statementIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfElseIfElseStatement(FactorioScriptParser.IfElseIfElseStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifElseStatement}
	 * labeled alternative in {@link FactorioScriptParser#statementIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfElseStatement(FactorioScriptParser.IfElseStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifStatement}
	 * labeled alternative in {@link FactorioScriptParser#statementIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(FactorioScriptParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varExp}
	 * labeled alternative in {@link FactorioScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarExp(FactorioScriptParser.VarExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mulDivExp}
	 * labeled alternative in {@link FactorioScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDivExp(FactorioScriptParser.MulDivExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code powExp}
	 * labeled alternative in {@link FactorioScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPowExp(FactorioScriptParser.PowExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code priorityExp}
	 * labeled alternative in {@link FactorioScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPriorityExp(FactorioScriptParser.PriorityExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addSubExp}
	 * labeled alternative in {@link FactorioScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSubExp(FactorioScriptParser.AddSubExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numExp}
	 * labeled alternative in {@link FactorioScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumExp(FactorioScriptParser.NumExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link FactorioScriptParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(FactorioScriptParser.ConditionContext ctx);
}