package entities.compiler;

import entities.blueprint.Entity;

public interface Combinator extends CompilerEntity {
	
	public Entity getEntity(double x, double y);
	
	public void traverseEntities(EntityGatherer eg);
	
	public int getId();
	
}
