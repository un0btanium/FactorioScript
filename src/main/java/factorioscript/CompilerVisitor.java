package factorioscript;

import antlr.FactorioScriptBaseVisitor;
import antlr.FactorioScriptParser.AddStatementAssignContext;
import antlr.FactorioScriptParser.AddSubExpContext;
import antlr.FactorioScriptParser.CompilerAliasContext;
import antlr.FactorioScriptParser.CompilerStandardContext;
import antlr.FactorioScriptParser.MulDivExpContext;
import antlr.FactorioScriptParser.MultipleStatementListContext;
import antlr.FactorioScriptParser.NumExpContext;
import antlr.FactorioScriptParser.OverwriteStatementAssignContext;
import antlr.FactorioScriptParser.PriorityExpContext;
import antlr.FactorioScriptParser.SingleStatementListContext;
import antlr.FactorioScriptParser.StatementContext;
import antlr.FactorioScriptParser.SubStatementAssignContext;
import antlr.FactorioScriptParser.VarExpContext;
import entities.blueprint.Signal;
import entities.compiler.ArithmeticCombinator;
import entities.compiler.CompilerEntity;
import entities.compiler.Statement;
import entities.compiler.StatementAdd;
import entities.compiler.StatementList;
import entities.compiler.StatementNone;
import entities.compiler.StatementOverwrite;
import entities.compiler.StatementSub;
import entities.compiler.Number;
import entities.compiler.Variable;

public class CompilerVisitor  extends FactorioScriptBaseVisitor<CompilerEntity> {
	
	public static String standard_left;
	public static String standard_right;
	
	static {
		standard_left = "signal-Y";
		standard_right = "signal-Z";
	}
	
	@Override
	public CompilerEntity visitMultipleStatementList(MultipleStatementListContext ctx) {
		
		Statement statement = (Statement) visit(ctx.s);
		
		StatementList statementList = (StatementList) visit(ctx.sl);
		
		statementList.addStatement(0, statement);
		
		return statementList;
	}
	
	@Override
	public CompilerEntity visitSingleStatementList(SingleStatementListContext ctx) {
		
		Statement statement = (Statement) visit(ctx.s);
		
		StatementList statementList = new StatementList();
		
		statementList.addStatement(0, statement);
		
		return statementList;
	}
	
	@Override
	public CompilerEntity visitStatement(StatementContext ctx) {
		return visit(ctx.getChild(0));
	}
	
	@Override
	public CompilerEntity visitCompilerStandard(CompilerStandardContext ctx) {
		standard_left = ctx.varLeft.getText();
		standard_right = ctx.varRight.getText();
		return new StatementNone();
	}
	
	@Override
	public CompilerEntity visitCompilerAlias(CompilerAliasContext ctx) {
		Signal.addAlias(ctx.varOld.getText(), ctx.varAlias.getText());
		return new StatementNone();
	}
	
//	@Override
//	public CompilerEntity visitCompilerComment(CompilerCommentContext ctx) {
//		return new StatementNone();
//	}
	
	@Override
	public CompilerEntity visitOverwriteStatementAssign(OverwriteStatementAssignContext ctx) {

		Variable variable = new Variable(ctx.var.getText());
		CompilerEntity expression = visit(ctx.expr);
		
		return new StatementOverwrite(variable, expression);
	}
	
	@Override
	public CompilerEntity visitAddStatementAssign(AddStatementAssignContext ctx) {

		Variable variable = new Variable(ctx.var.getText());
		CompilerEntity expression = visit(ctx.expr);
		
		return new StatementAdd(variable, expression);
	}
	
	@Override
	public CompilerEntity visitSubStatementAssign(SubStatementAssignContext ctx) {

		Variable variable = new Variable(ctx.var.getText());
		CompilerEntity expression = visit(ctx.expr);
		
		return new StatementSub(variable, expression);
	}
	
	@Override
	public CompilerEntity visitPriorityExp(PriorityExpContext ctx) {
		return visit(ctx.expr);
	}
	
	@Override
	public CompilerEntity visitAddSubExp(AddSubExpContext ctx) {
		
		ArithmeticCombinator ac = new ArithmeticCombinator();
		ac.leftEntity = visit(ctx.left);
		ac.operation = ctx.operand.getText();
		ac.rightEntity = visit(ctx.right);
		
		// NUMBER OPTIMIZATION
		boolean leftIsNumber = ac.leftEntity.getClass() == Number.class;
		boolean rightIsNumber = ac.rightEntity.getClass() == Number.class;
		if (ac.operation.equals("+")) {
			if (leftIsNumber && rightIsNumber) {
				// merge two constants
				Number left = (Number) ac.leftEntity;
				Number right = (Number) ac.rightEntity;
				return new Number(left.getValue() + right.getValue());
			} else if (leftIsNumber) {
				// number can be put on the right to avoid unnecessary use of a constant combinator
				CompilerEntity temp = ac.leftEntity;
				ac.leftEntity = ac.rightEntity;
				ac.rightEntity = temp;
			}
		} else {
			if (leftIsNumber && rightIsNumber) {
				// merge two constants
				Number left = (Number) ac.leftEntity;
				Number right = (Number) ac.rightEntity;
				return new Number(left.getValue() - right.getValue());
			}
		}
		
		// SET PARENT OF LEFT AND RIGHT ARITHMETICCOMBINATORS
		if (ac.leftEntity.getClass() == ArithmeticCombinator.class) {
			ArithmeticCombinator left = (ArithmeticCombinator) ac.leftEntity;
			left.outputEntity = ac;
			left.outputSignal = standard_left;
		}
		if (ac.rightEntity.getClass() == ArithmeticCombinator.class) {
			ArithmeticCombinator right = (ArithmeticCombinator) ac.rightEntity;
			right.outputEntity = ac;
			right.outputSignal = standard_right;
		}
		
		return ac;
	}
	
	@Override
	public CompilerEntity visitMulDivExp(MulDivExpContext ctx) {
		
		ArithmeticCombinator ac = new ArithmeticCombinator();
		ac.leftEntity = visit(ctx.left);
		ac.operation = ctx.operand.getText();
		ac.rightEntity = visit(ctx.right);
		
		// NUMBER OPTIMIZATION
		boolean leftIsNumber = ac.leftEntity.getClass() == Number.class;
		boolean rightIsNumber = ac.rightEntity.getClass() == Number.class;
		
		if ( (ac.operation.equals("/") || ac.operation.equals("%") ) && rightIsNumber) {
			Number right = (Number) ac.rightEntity;
			if (right.getValue() == 0)
				System.err.println("Dont divide/modulo by 0, you maniac!");
		}
		
		if (leftIsNumber && rightIsNumber) {
			if (ac.operation.equals("*")) {
				Number left = (Number) ac.leftEntity;
				Number right = (Number) ac.rightEntity;
				return new Number(left.getValue() * right.getValue());
			} else if (ac.operation.equals("/")) {
				Number left = (Number) ac.leftEntity;
				Number right = (Number) ac.rightEntity;
				return new Number((int) ((0d + left.getValue()) / right.getValue()));
			}
		}
		
		// SET PARENT OF LEFT AND RIGHT ARITHMETICCOMBINATORS
		if (ac.leftEntity.getClass() == ArithmeticCombinator.class) {
			ArithmeticCombinator left = (ArithmeticCombinator) ac.leftEntity;
			left.outputEntity = ac;
			left.outputSignal = standard_left;
		}
		if (ac.rightEntity.getClass() == ArithmeticCombinator.class) {
			ArithmeticCombinator right = (ArithmeticCombinator) ac.rightEntity;
			right.outputEntity = ac;
			right.outputSignal = standard_right;
		}
		
		return ac;
	}
	
	@Override
	public CompilerEntity visitNumExp(NumExpContext ctx) {
		return new Number(Integer.parseInt(ctx.number.getText()));
	}
	
	
	@Override
	public CompilerEntity visitVarExp(VarExpContext ctx) {
		if (!Signal.variableExists(ctx.getText()))
			System.err.println("Variable " + ctx.getText() + " does not exist!");
		return new Variable(ctx.getText());
	}
	
}
