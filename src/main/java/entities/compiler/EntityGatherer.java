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
	private int powerPolesPlaced;
	private int powerPoleOffset;
	
	public EntityGatherer() {
		this.offsetX = 0;
		this.offsetY = 0;
		this.entities = new ArrayList<>();
		this.pole = PowerPole.powerPoleTypes.get(PowerPole.powerPole);
		this.lastOutputEntity = null;
		this.powerPolesPlaced = 0;
		this.powerPoleOffset = pole.maxSpace/2 + ((PowerPole.powerPole.equals("medium")) ? 1 : 0);
	}
	
	public void checkForPowerPole() {
		// TODO improve power pole horizontal placement
		if (offsetY == powerPoleOffset + powerPolesPlaced * (pole.maxSpace+pole.size)) {
			System.out.println("Space added " + offsetY);
			offsetY += pole.size;
			powerPolesPlaced++;
		}
		if (offsetY == powerPolesPlaced * (pole.maxSpace+pole.size)) {
			System.out.println("Pole placed " + offsetY);
			Entity entity = new Entity(pole.name);
			entity.position = new Position(pole.maxSpace/2, powerPoleOffset + powerPolesPlaced * (pole.maxSpace+pole.size));
			entities.add(entity);
		}
	}
	
}
