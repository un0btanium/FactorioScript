package entities.compiler;

import entities.blueprint.Entity;
import entities.blueprint.Position;

public class DeciderCombinator implements Combinator {
	
	private Entity entity;
	
	
	
	
	
	
	
	/**
	 * 
	 * @return returns the unique entity identifier value
	 */
	@Override
	public int getId() {
		return entity.entity_number;
	}
	
	@Override
	public Entity getEntity(double x, double y) {
		// TODO Auto-generated method stub
		entity.position = new Position(x, y+0.5);
		return null;
	}

	@Override
	public void traverseEntities(EntityGatherer eg) {
		// TODO Auto-generated method stub
		
	}
}
