package entities.compiler;

import entities.blueprint.Entity;

public class StatementAdd implements Statement {
	
	private Variable variable;
	private CompilerEntity expression;
	
	public StatementAdd(Variable variable, CompilerEntity expression) {
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
			cc.addSignal(variable.getVariable(), number.getValue());
			cc.addConnectionOut("red", acEach.getId(), 2);
			eg.entities.add(cc.getEntity(1, eg.offsetY+1));
			
		} else if (expression.getClass() == Variable.class) {
			Variable var = (Variable) expression;
			ArithmeticCombinator ac = new ArithmeticCombinator();
			ac.leftEntity = var;
			ac.operation = "+";
			ac.rightEntity = new Number(0);
			ac.outputSignal = variable.getVariable();
			Entity entity = ac.getEntity(1, eg.offsetY);
			entity.addConnection("1", "red", entityAcEach.entity_number, 1);
			entity.addConnection("2", "red", entityAcEach.entity_number, 2);
			eg.entities.add(entity);
			
		} else if (expression.getClass() == ArithmeticCombinator.class) {
			ArithmeticCombinator ac = (ArithmeticCombinator) expression;
			ac.outputSignal = variable.getVariable();
			Entity entity = ac.getEntity(1, eg.offsetY);
			entity.addConnection("1", "red", entityAcEach.entity_number, 1);
			entity.addConnection("2", "red", entityAcEach.entity_number, 2);
			eg.entities.add(entity);
			eg.offsetX = 2;
			eg.lastInputEntity = entity;
			ac.traverseEntities(eg);
			
		} else {
			System.err.println("weird error");
		}
	}
}
