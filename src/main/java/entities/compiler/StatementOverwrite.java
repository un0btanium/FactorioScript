package entities.compiler;

import entities.blueprint.Entity;

public class StatementOverwrite implements Statement {
	
	private Variable variable;
	private CompilerEntity expression;
	
	public StatementOverwrite(Variable variable, CompilerEntity expression) {
		this.variable = variable;
		this.expression = expression;
	}

	@Override
	public void getEntities(EntityGatherer eg) {

		ArithmeticCombinator acEach = new ArithmeticCombinator();
		ArithmeticCombinator acNullifier = new ArithmeticCombinator();
		
		acEach.leftEntity = new Variable("signal-each");
		acEach.operation = "+";
		acEach.rightEntity = new Number(0);
		acEach.outputSignal = "signal-each";
		
		acNullifier.leftEntity = variable;
		acNullifier.operation = "*";
		acNullifier.rightEntity = new Number(-1);
		acNullifier.outputSignal = variable.getVariable();
		
		Entity entityAcEach = acEach.getEntity(0, eg.offsetY);
		Entity entityAcNullifier = acNullifier.getEntity(1, eg.offsetY);
		
		entityAcEach.addConnection("1", "red", entityAcNullifier.entity_number, 1);
		entityAcEach.addConnection("2", "red", entityAcNullifier.entity_number, 2);
		
		if (eg.lastOutputEntity != null) {
			eg.lastOutputEntity.addConnection("2", "red", entityAcEach.entity_number, 1);
		}
		
		eg.lastOutputEntity = entityAcEach;
		
		eg.entities.add(entityAcEach);
		eg.entities.add(entityAcNullifier);
		
		if (expression.getClass() == Number.class) {
			// constant combinator
			Number number = (Number) expression;
			ConstantCombinator cc = new ConstantCombinator();
			cc.addSignal(variable.getVariable(), number.getValue());
			cc.addConnectionOut("red", acNullifier.getId(), 2);
			Entity entityCc = cc.getEntity(2,eg.offsetY+1);
			eg.entities.add(entityCc);
			
		} else {
			ArithmeticCombinator ac = null;
			if (expression.getClass() == Variable.class) {
				// arithmetic combinator var + 0
				Variable var = (Variable) expression;
				ac = new ArithmeticCombinator();
				ac.leftEntity = var;
				ac.operation = "+";
				ac.rightEntity = new Number(0);
				
			} else { // ARITHMETICCOMBINATOR
				ac = (ArithmeticCombinator) expression;
			}
			ac.outputSignal = variable.getVariable();
			Entity entityCombinator = ac.getEntity(2, eg.offsetY);
			entityCombinator.addConnection("1", "red", entityAcNullifier.entity_number, 1);
			entityCombinator.addConnection("2", "red", entityAcNullifier.entity_number, 2);
			eg.entities.add(entityCombinator);
			eg.offsetX = 3;
			eg.lastInputEntity = entityCombinator;
			ac.traverseEntities(eg);
		}
	}
}
