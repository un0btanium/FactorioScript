package entities.compiler;

import entities.blueprint.ArithmeticConditions;
import entities.blueprint.ControlBehavior;
import entities.blueprint.Entity;
import entities.blueprint.Position;
import entities.blueprint.Signal;

public class ArithmeticCombinator implements Combinator {
	
	private Entity entity;
	
	public CompilerEntity leftEntity;
	public CompilerEntity rightEntity;
	public String operation;
	public CompilerEntity outputEntity;
	public String outputSignal;
	
	
	public ArithmeticCombinator() {
		entity = new Entity("arithmetic-combinator");
	}
	
	@Override
	public Entity getEntity(double x, double y) {
		ArithmeticConditions arithmetic_conditions = new ArithmeticConditions();
		
		if (leftEntity.getClass() == Variable.class) {
			Variable var = (Variable) leftEntity;
			arithmetic_conditions.first_signal = new Signal(var.getVariable());
		} else if (leftEntity.getClass() == ArithmeticCombinator.class) {
			ArithmeticCombinator ac = (ArithmeticCombinator) leftEntity;
			arithmetic_conditions.first_signal = new Signal(ac.outputSignal);
		} else if (leftEntity.getClass() == ConstantCombinator.class) {
			ConstantCombinator cc = (ConstantCombinator) leftEntity;
			cc.addConnectionOut("green", entity.entity_number, 1);
			arithmetic_conditions.first_signal = cc.getSignal();
		}
		
		arithmetic_conditions.operation = operation;
		
		if (rightEntity.getClass() == Variable.class) {
			Variable var = (Variable) rightEntity;
			arithmetic_conditions.second_signal = new Signal(var.getVariable());
		} else if (rightEntity.getClass() == Number.class) {
			Number number = (Number) rightEntity;
			arithmetic_conditions.constant = number.getValue();
		} else if (rightEntity.getClass() == ArithmeticCombinator.class) {
			ArithmeticCombinator ac = (ArithmeticCombinator) rightEntity;
			arithmetic_conditions.second_signal = new Signal(ac.outputSignal);
		}
		
		arithmetic_conditions.output_signal = new Signal(outputSignal);
		
		if(outputEntity != null) {
			if (outputEntity.getClass() == ArithmeticCombinator.class) {
				ArithmeticCombinator ac = (ArithmeticCombinator) outputEntity;
				entity.addConnection("2", "green", ac.getId(), 1);
			}
		}
		
		entity.control_behavior = new ControlBehavior();
		entity.control_behavior.arithmetic_conditions = arithmetic_conditions;
		entity.position = new Position(x, y+0.5);
		entity.direction = 4;
		
		return entity;
	}
	
	@Override
	public void traverseEntities(EntityGatherer eg) {
		
		// CREATE CONNECTION
		if (leftEntity.getClass() == Variable.class || rightEntity.getClass() == Variable.class) {
			entity.addConnection("1", "red", eg.lastInputEntity.entity_number, 1);
			eg.lastInputEntity = entity;
		}
		
		// ADD ENTITIES
		if (leftEntity.getClass() == ArithmeticCombinator.class || leftEntity.getClass() == ConstantCombinator.class || leftEntity.getClass() == DeciderCombinator.class) {
			Combinator combinatorLeft = (Combinator) leftEntity;
			eg.entities.add(combinatorLeft.getEntity(eg.offsetX++, eg.offsetY));
		}
		
		if (rightEntity.getClass() == ArithmeticCombinator.class || rightEntity.getClass() == ConstantCombinator.class || rightEntity.getClass() == DeciderCombinator.class) {
			Combinator combinatorRight = (Combinator) rightEntity;
			eg.entities.add(combinatorRight.getEntity(eg.offsetX++, eg.offsetY));
		}
		
		// TRAVERSE ENTITIES
		if (leftEntity.getClass() == ArithmeticCombinator.class || leftEntity.getClass() == ConstantCombinator.class || leftEntity.getClass() == DeciderCombinator.class) {
			Combinator combinatorLeft = (Combinator) leftEntity;
			combinatorLeft.traverseEntities(eg);
		}
		
		if (rightEntity.getClass() == ArithmeticCombinator.class || rightEntity.getClass() == ConstantCombinator.class || rightEntity.getClass() == DeciderCombinator.class) {
			Combinator combinatorRight = (Combinator) rightEntity;
			combinatorRight.traverseEntities(eg);
		}
		
	}


	@Override
	public int getId() {
		return entity.entity_number;
	}
	
}
