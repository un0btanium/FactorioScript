package antlr;
// Generated from FactorioScript.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FactorioScriptParser}.
 */
public interface FactorioScriptListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code multipleStatementList}
	 * labeled alternative in {@link FactorioScriptParser#statementList}.
	 * @param ctx the parse tree
	 */
	void enterMultipleStatementList(FactorioScriptParser.MultipleStatementListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multipleStatementList}
	 * labeled alternative in {@link FactorioScriptParser#statementList}.
	 * @param ctx the parse tree
	 */
	void exitMultipleStatementList(FactorioScriptParser.MultipleStatementListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleStatementList}
	 * labeled alternative in {@link FactorioScriptParser#statementList}.
	 * @param ctx the parse tree
	 */
	void enterSingleStatementList(FactorioScriptParser.SingleStatementListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleStatementList}
	 * labeled alternative in {@link FactorioScriptParser#statementList}.
	 * @param ctx the parse tree
	 */
	void exitSingleStatementList(FactorioScriptParser.SingleStatementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link FactorioScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(FactorioScriptParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FactorioScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(FactorioScriptParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CompilerStandard}
	 * labeled alternative in {@link FactorioScriptParser#statementCompiler}.
	 * @param ctx the parse tree
	 */
	void enterCompilerStandard(FactorioScriptParser.CompilerStandardContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CompilerStandard}
	 * labeled alternative in {@link FactorioScriptParser#statementCompiler}.
	 * @param ctx the parse tree
	 */
	void exitCompilerStandard(FactorioScriptParser.CompilerStandardContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CompilerAlias}
	 * labeled alternative in {@link FactorioScriptParser#statementCompiler}.
	 * @param ctx the parse tree
	 */
	void enterCompilerAlias(FactorioScriptParser.CompilerAliasContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CompilerAlias}
	 * labeled alternative in {@link FactorioScriptParser#statementCompiler}.
	 * @param ctx the parse tree
	 */
	void exitCompilerAlias(FactorioScriptParser.CompilerAliasContext ctx);
	/**
	 * Enter a parse tree produced by the {@code overwriteStatementAssign}
	 * labeled alternative in {@link FactorioScriptParser#statementAssign}.
	 * @param ctx the parse tree
	 */
	void enterOverwriteStatementAssign(FactorioScriptParser.OverwriteStatementAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code overwriteStatementAssign}
	 * labeled alternative in {@link FactorioScriptParser#statementAssign}.
	 * @param ctx the parse tree
	 */
	void exitOverwriteStatementAssign(FactorioScriptParser.OverwriteStatementAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addStatementAssign}
	 * labeled alternative in {@link FactorioScriptParser#statementAssign}.
	 * @param ctx the parse tree
	 */
	void enterAddStatementAssign(FactorioScriptParser.AddStatementAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addStatementAssign}
	 * labeled alternative in {@link FactorioScriptParser#statementAssign}.
	 * @param ctx the parse tree
	 */
	void exitAddStatementAssign(FactorioScriptParser.AddStatementAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subStatementAssign}
	 * labeled alternative in {@link FactorioScriptParser#statementAssign}.
	 * @param ctx the parse tree
	 */
	void enterSubStatementAssign(FactorioScriptParser.SubStatementAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subStatementAssign}
	 * labeled alternative in {@link FactorioScriptParser#statementAssign}.
	 * @param ctx the parse tree
	 */
	void exitSubStatementAssign(FactorioScriptParser.SubStatementAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifElseIfElseStatement}
	 * labeled alternative in {@link FactorioScriptParser#statementIf}.
	 * @param ctx the parse tree
	 */
	void enterIfElseIfElseStatement(FactorioScriptParser.IfElseIfElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifElseIfElseStatement}
	 * labeled alternative in {@link FactorioScriptParser#statementIf}.
	 * @param ctx the parse tree
	 */
	void exitIfElseIfElseStatement(FactorioScriptParser.IfElseIfElseStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifElseStatement}
	 * labeled alternative in {@link FactorioScriptParser#statementIf}.
	 * @param ctx the parse tree
	 */
	void enterIfElseStatement(FactorioScriptParser.IfElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifElseStatement}
	 * labeled alternative in {@link FactorioScriptParser#statementIf}.
	 * @param ctx the parse tree
	 */
	void exitIfElseStatement(FactorioScriptParser.IfElseStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifStatement}
	 * labeled alternative in {@link FactorioScriptParser#statementIf}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(FactorioScriptParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifStatement}
	 * labeled alternative in {@link FactorioScriptParser#statementIf}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(FactorioScriptParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varExp}
	 * labeled alternative in {@link FactorioScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterVarExp(FactorioScriptParser.VarExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varExp}
	 * labeled alternative in {@link FactorioScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitVarExp(FactorioScriptParser.VarExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mulDivExp}
	 * labeled alternative in {@link FactorioScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMulDivExp(FactorioScriptParser.MulDivExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mulDivExp}
	 * labeled alternative in {@link FactorioScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMulDivExp(FactorioScriptParser.MulDivExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code powExp}
	 * labeled alternative in {@link FactorioScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPowExp(FactorioScriptParser.PowExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code powExp}
	 * labeled alternative in {@link FactorioScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPowExp(FactorioScriptParser.PowExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code priorityExp}
	 * labeled alternative in {@link FactorioScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPriorityExp(FactorioScriptParser.PriorityExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code priorityExp}
	 * labeled alternative in {@link FactorioScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPriorityExp(FactorioScriptParser.PriorityExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addSubExp}
	 * labeled alternative in {@link FactorioScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAddSubExp(FactorioScriptParser.AddSubExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addSubExp}
	 * labeled alternative in {@link FactorioScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAddSubExp(FactorioScriptParser.AddSubExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numExp}
	 * labeled alternative in {@link FactorioScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNumExp(FactorioScriptParser.NumExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numExp}
	 * labeled alternative in {@link FactorioScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNumExp(FactorioScriptParser.NumExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link FactorioScriptParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(FactorioScriptParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FactorioScriptParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(FactorioScriptParser.ConditionContext ctx);
}