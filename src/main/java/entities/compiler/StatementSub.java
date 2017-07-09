package entities.compiler;

import entities.blueprint.Entity;
import factorioscript.CompilerVisitor;

public class StatementSub implements Statement {
	
	private Variable variable;
	private CompilerEntity expression;
	
	public StatementSub(Variable variable, CompilerEntity expression) {
		this.variable = variable;
		this.expression = expression;
	}
	
	@Override
	public void getEntities(EntityGatherer eg) {

		ArithmeticCombinator acEach = new ArithmeticCombinator();
		acEach.leftEntity = new Variable("signal-each");
		acEach.operation = "+";
		acEach.rightEntity = new Number(0);
		acEach.outputSignal = "signal-each";
		Entity entityAcEach = acEach.getEntity(0, eg.offsetY);
		
		if (eg.lastOutputEntity != null) {
			eg.lastOutputEntity.addConnection("2", "red", entityAcEach.entity_number, 1);
		}
		
		eg.lastOutputEntity = entityAcEach;
		
		eg.entities.add(entityAcEach);
		

		if (expression.getClass() == Number.class) {
			Number number = (Number) expression;
			ConstantCombinator cc = new ConstantCombinator();
			cc.addSignal(variable.getVariable(), -1*number.getValue());
			cc.addConnectionOut("red", acEach.getId(), 2);
			eg.entities.add(cc.getEntity(1, eg.offsetY+1));
			
		} else if (expression.getClass() == Variable.class) {
			Variable var = (Variable) expression;
			ArithmeticCombinator ac = new ArithmeticCombinator();
			ac.leftEntity = var;
			ac.operation = "*";
			ac.rightEntity = new Number(-1);
			ac.outputSignal = variable.getVariable();
			Entity entity = ac.getEntity(1, eg.offsetY);
			entity.addConnection("1", "red", entityAcEach.entity_number, 1);
			entity.addConnection("2", "red", entityAcEach.entity_number, 2);
			eg.entities.add(entity);
			
		} else if (expression.getClass() == ArithmeticCombinator.class) {
			ArithmeticCombinator acNullifier = new ArithmeticCombinator();
			
			acNullifier.leftEntity = variable;
			acNullifier.operation = "*";
			acNullifier.rightEntity = new Number(-1);
			acNullifier.outputSignal = variable.getVariable();
			
			Entity entityAcNullifier = acNullifier.getEntity(1, eg.offsetY);
			
			entityAcEach.addConnection("1", "red", entityAcNullifier.entity_number, 1);
			entityAcEach.addConnection("2", "red", entityAcNullifier.entity_number, 2);

			eg.entities.add(entityAcNullifier);

			
			ArithmeticCombinator ac = new ArithmeticCombinator();
			ArithmeticCombinator acExpression = (ArithmeticCombinator) expression;
			acExpression.outputSignal = CompilerVisitor.standard_right;
			acExpression.outputEntity = ac;
			ac.leftEntity = variable;
			ac.operation = "-";
			ac.rightEntity = expression;
			ac.outputSignal = variable.getVariable();
			Entity entity = ac.getEntity(2, eg.offsetY);
			entity.addConnection("1", "red", entityAcNullifier.entity_number, 1);
			entity.addConnection("2", "red", entityAcNullifier.entity_number, 2);
			eg.entities.add(entity);
			eg.offsetX = 3;


			eg.lastInputEntity = entity;
			ac.traverseEntities(eg);
		}
	}
}
