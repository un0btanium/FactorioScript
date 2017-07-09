package entities.blueprint;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;
import java.util.HashMap;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Entity implements FactorioEntity {
	
	private static int entity_id = 0;

	public int entity_number;
	public String name;
	public Position position;
	public int direction;
	public ControlBehavior control_behavior;
	public HashMap<String, Connection> connections;
	
	public Entity(String name) {
		this.entity_number = entity_id++;
		this.name = name;
	}
	
	
	/**
	 * Connects the entity with the entity associated with the given id.
	 * @param circuitId if the wire should start at the input or output
	 * @param color the wire color
	 * @param entityId the entity to connect to
	 * @param circuitIdDestination connect to the input or output of the entity
	 */
	public void addConnection(String circuitId, String color, int entityId, int circuitIdDestination) {
		if (connections == null)
			connections = new HashMap<>();
		if (!connections.containsKey(circuitId))
				connections.put(circuitId, new Connection());
		if (color.equals("green")) {
			if (connections.get(circuitId).green == null)
				connections.get(circuitId).green = new ArrayList<>();
			connections.get(circuitId).green.add(new ConnectionDetail(entityId, circuitIdDestination));
		} else if (color.equals("red")) {
			if (connections.get(circuitId).red == null)
				connections.get(circuitId).red = new ArrayList<>();
			connections.get(circuitId).red.add(new ConnectionDetail(entityId, circuitIdDestination));
		}
	}
	
}
