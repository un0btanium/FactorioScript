package entities.compiler;

import java.util.ArrayList;

import entities.blueprint.Entity;
import entities.blueprint.Position;

public class EntityGatherer {

	public int offsetX;
	public int offsetY;
	public ArrayList<Entity> entities;
	public PowerPoleType pole;
	public Entity lastOutputEntity;
	public Entity lastInputEntity;
	
	public EntityGatherer(String powerPole) {
		this.offsetX = 0;
		this.offsetY = 0;
		this.entities = new ArrayList<>();
		this.pole = PowerPole.powerPoleTypes.get(powerPole);
		this.lastOutputEntity = null;
	}
	
	public void checkForPowerPole() {
		if (offsetY%(pole.maxSpace+pole.size) == 0) {
			// TODO improve power pole horizontal placement
			for (int i = 0; i < 3; i++) {
				Entity entity = new Entity(pole.name);
				entity.position = new Position(i*(pole.maxSpace+pole.size), offsetY);
				entities.add(entity);
			}
			offsetY += pole.size;
		}
	}
	
}
