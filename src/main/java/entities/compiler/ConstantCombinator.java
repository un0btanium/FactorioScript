package entities.compiler;

import java.util.ArrayList;
import java.util.HashMap;

import entities.blueprint.Connection;
import entities.blueprint.ConnectionDetail;
import entities.blueprint.ControlBehavior;
import entities.blueprint.Entity;
import entities.blueprint.Filter;
import entities.blueprint.Position;
import entities.blueprint.Signal;

public class ConstantCombinator implements Combinator {
	
	private Entity entity;
	
	private ArrayList<Filter> filters;
	private Connection connections;
	
	public ConstantCombinator() {
		entity = new Entity("constant-combinator");
		filters = new ArrayList<>();
	}
	
	/**
	 * Adds a new signal with the given amount to the constant combinator.
	 * @param name the signal name
	 * @param amount the signal value
	 */
	public void addSignal(String name, int amount) {
		filters.add(new Filter(new Signal(name), amount, filters.size()+1));
	}

	/**
	 * 
	 * @return the first signal in the constant combinator
	 */
	public Signal getSignal() {
		return filters.get(0).signal;
	}
	
	/**
	 * Connects the constant combinator output with the entity associated with the given entity.
	 * @param color the wire color
	 * @param entityId the entity to connect to
	 * @param circuitId connect to the input or output of the entity
	 */
	public void addConnectionOut(String color, int entityId, int circuitId) {
		if (connections == null)
			connections = new Connection();
		if (color.equals("green")) {
			if (connections.green == null)
				connections.green = new ArrayList<>();
			connections.green.add(new ConnectionDetail(entityId, circuitId));
		} else if (color.equals("red")) {
			if (connections.red == null)
				connections.red = new ArrayList<>();
			connections.red.add(new ConnectionDetail(entityId, circuitId));
		}
	}
	
	/**
	 * Returns the blueprint entity version with the information available.
	 * @return the blueprint entity
	 */
	@Override
	public Entity getEntity(double x, double y) {
		if (filters.size() > 0) {
			entity.control_behavior = new ControlBehavior();
			entity.control_behavior.filters = this.filters;
		}
		if (connections != null) {
			entity.connections = new HashMap<>();
			entity.connections.put("1", connections);
		}
		
		entity.position = new Position(x, y);
		
		return entity;
	}



	@Override
	public void traverseEntities(EntityGatherer eg) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public int getId() {
		return entity.entity_number;
	}
	
}
