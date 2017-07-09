package entities.blueprint;

import java.util.HashMap;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Signal {
	private static String[] types;
	private static HashMap<String, String> nameType;
	private static HashMap<String, String> aliases;
	
	static {
		types = new String[] {"item", "fluid", "virtual"};
		nameType = new HashMap<>();
		aliases = new HashMap<>();
		
		// TODO LOAD ALIASES AND VARIABLES FROM FILES
		
		// ALIASES
		aliases.put("a", "signal-A");
		aliases.put("b", "signal-B");
		aliases.put("c", "signal-C");
		aliases.put("d", "signal-D");
		aliases.put("e", "signal-E");
		aliases.put("f", "signal-F");
		aliases.put("g", "signal-G");
		aliases.put("h", "signal-H");
		aliases.put("i", "signal-I");
		aliases.put("j", "signal-J");
		aliases.put("k", "signal-K");
		aliases.put("l", "signal-L");
		aliases.put("m", "signal-M");
		aliases.put("n", "signal-N");
		aliases.put("o", "signal-O");
		aliases.put("p", "signal-P");
		aliases.put("q", "signal-Q");
		aliases.put("r", "signal-R");
		aliases.put("s", "signal-S");
		aliases.put("t", "signal-T");
		aliases.put("u", "signal-U");
		aliases.put("v", "signal-V");
		aliases.put("w", "signal-W");
		aliases.put("x", "signal-X");
		aliases.put("y", "signal-Y");
		aliases.put("z", "signal-Z");
		

		aliases.put("signal-a", "signal-A");
		aliases.put("signal-b", "signal-B");
		aliases.put("signal-c", "signal-C");
		aliases.put("signal-d", "signal-D");
		aliases.put("signal-e", "signal-E");
		aliases.put("signal-f", "signal-F");
		aliases.put("signal-g", "signal-G");
		aliases.put("signal-h", "signal-H");
		aliases.put("signal-i", "signal-I");
		aliases.put("signal-j", "signal-J");
		aliases.put("signal-k", "signal-K");
		aliases.put("signal-l", "signal-L");
		aliases.put("signal-m", "signal-M");
		aliases.put("signal-n", "signal-N");
		aliases.put("signal-o", "signal-O");
		aliases.put("signal-p", "signal-P");
		aliases.put("signal-q", "signal-Q");
		aliases.put("signal-r", "signal-R");
		aliases.put("signal-s", "signal-S");
		aliases.put("signal-t", "signal-T");
		aliases.put("signal-u", "signal-U");
		aliases.put("signal-v", "signal-V");
		aliases.put("signal-w", "signal-W");
		aliases.put("signal-x", "signal-X");
		aliases.put("signal-y", "signal-Y");
		aliases.put("signal-z", "signal-Z");

		aliases.put("red", "signal-red");
		aliases.put("green", "signal-green");
		aliases.put("blue", "signal-blue");
		aliases.put("yellow", "signal-yellow");
		aliases.put("pink", "signal-pink");
		aliases.put("cyan", "signal-cyan");
		aliases.put("white", "signal-white");
		aliases.put("grey", "signal-grey");
		aliases.put("black", "signal-black");
		
		// VIRTUAL
		nameType.put("signal-each", types[2]);
		nameType.put("signal-anything", types[2]);
		nameType.put("signal-everything", types[2]);
		
		nameType.put("signal-A", types[2]);
		nameType.put("signal-B", types[2]);
		nameType.put("signal-C", types[2]);
		nameType.put("signal-D", types[2]);
		nameType.put("signal-E", types[2]);
		nameType.put("signal-F", types[2]);
		nameType.put("signal-G", types[2]);
		nameType.put("signal-H", types[2]);
		nameType.put("signal-I", types[2]);
		nameType.put("signal-J", types[2]);
		nameType.put("signal-K", types[2]);
		nameType.put("signal-L", types[2]);
		nameType.put("signal-M", types[2]);
		nameType.put("signal-O", types[2]);
		nameType.put("signal-P", types[2]);
		nameType.put("signal-Q", types[2]);
		nameType.put("signal-R", types[2]);
		nameType.put("signal-S", types[2]);
		nameType.put("signal-T", types[2]);
		nameType.put("signal-U", types[2]);
		nameType.put("signal-V", types[2]);
		nameType.put("signal-W", types[2]);
		nameType.put("signal-X", types[2]);
		nameType.put("signal-Y", types[2]);
		nameType.put("signal-Z", types[2]);
		
		nameType.put("signal-0", types[2]);
		nameType.put("signal-1", types[2]);
		nameType.put("signal-2", types[2]);
		nameType.put("signal-3", types[2]);
		nameType.put("signal-4", types[2]);
		nameType.put("signal-6", types[2]);
		nameType.put("signal-7", types[2]);
		nameType.put("signal-8", types[2]);
		nameType.put("signal-9", types[2]);

		nameType.put("signal-red", types[2]);
		nameType.put("signal-green", types[2]);
		nameType.put("signal-blue", types[2]);
		nameType.put("signal-yellow", types[2]);
		nameType.put("signal-pink", types[2]);
		nameType.put("signal-cyan", types[2]);
		nameType.put("signal-white", types[2]);
		nameType.put("signal-grey", types[2]);
		nameType.put("signal-black", types[2]);

		// FLUIDS
		nameType.put("water", types[1]);
		nameType.put("crude-oil", types[1]);
		nameType.put("steam", types[1]);
		nameType.put("heavy-oil", types[1]);
		nameType.put("light-oil", types[1]);
		nameType.put("petroleum-gas", types[1]);
		nameType.put("sulfuric-acid", types[1]);
		nameType.put("lubricant", types[1]);
		
		
		// ITEMS
		//LOGISTICS
		nameType.put("wooden-chest", types[0]);
		nameType.put("iron-chest", types[0]);
		nameType.put("steel-chest", types[0]);
		nameType.put("storage-tank", types[0]);
		
		nameType.put("transport-belt", types[0]);
		nameType.put("fast-transport-belt", types[0]);
		nameType.put("express-transport-belt", types[0]);
		nameType.put("underground-belt", types[0]);
		nameType.put("fast-underground-belt", types[0]);
		nameType.put("express-underground-belt", types[0]);
		nameType.put("splitter", types[0]);
		nameType.put("fast-splitter", types[0]);
		nameType.put("express-splitter", types[0]);
		
		nameType.put("burner-inserter", types[0]);
		nameType.put("inserter", types[0]);
		nameType.put("long-handed-inserter", types[0]);
		nameType.put("fast-inserter", types[0]);
		nameType.put("filter-inserter", types[0]);
		nameType.put("stack-inserter", types[0]);
		nameType.put("stack-filter-inserter", types[0]);
		

		nameType.put("small-electric-pole", types[0]);
		nameType.put("medium-electric-pole", types[0]);
		nameType.put("big-electric-pole", types[0]);
		nameType.put("substation", types[0]);
		nameType.put("pipe", types[0]);
		nameType.put("pipe-to-ground", types[0]);
		nameType.put("pump", types[0]);
		
		nameType.put("rail", types[0]);
		nameType.put("train-stop", types[0]);
		nameType.put("rail-signal", types[0]);
		nameType.put("rail-chain-signal", types[0]);
		nameType.put("locomotive", types[0]);
		nameType.put("cargo-wagon", types[0]);
		nameType.put("fluid-wagon", types[0]);
		nameType.put("car", types[0]);
		nameType.put("tank", types[0]);

		nameType.put("logistic-robot", types[0]);
		nameType.put("construction-robot", types[0]);
		nameType.put("logistic-active-provider-chest", types[0]);
		nameType.put("logistic-passive-provider-chest", types[0]);
		nameType.put("logistic-requester-chest", types[0]);
		nameType.put("logistic-storage-chest", types[0]);
		nameType.put("roboport", types[0]);
		
		nameType.put("lamp", types[0]);
		nameType.put("red-wire", types[0]);
		nameType.put("green-wire", types[0]);
		nameType.put("arithmetic-combinator", types[0]);
		nameType.put("decider-combinator", types[0]);
		nameType.put("constant-combinator", types[0]);
		nameType.put("power-switch", types[0]);
		nameType.put("programmable-speaker", types[0]);
		
		nameType.put("stone-brick", types[0]);
		nameType.put("concrete", types[0]);
		nameType.put("hazard-concrete", types[0]);
		nameType.put("landfill", types[0]);
		
		// PRODUCTION
		nameType.put("iron-axe", types[0]);
		nameType.put("steel-axe", types[0]);
		nameType.put("repair-pack", types[0]);
		nameType.put("blueprint", types[0]);
		nameType.put("deconstruction-planner", types[0]);
		nameType.put("blueprint-book", types[0]);
		
		nameType.put("boiler", types[0]);
		nameType.put("steam-engine", types[0]);
		nameType.put("steam-turbine", types[0]);
		nameType.put("solar-panel", types[0]);
		nameType.put("accumulator", types[0]);
		nameType.put("nuclear-reactor", types[0]);
		nameType.put("heat-exchanger", types[0]);
		nameType.put("heat-pipe", types[0]);
		
		nameType.put("burner-mining-drill", types[0]);
		nameType.put("electric-mining-drill", types[0]);
		nameType.put("offshore-pump", types[0]);
		nameType.put("pumpjack", types[0]);

		nameType.put("stone-furnace", types[0]);
		nameType.put("steel-furnace", types[0]);
		nameType.put("electric-furnace", types[0]);
		
		nameType.put("assembling-machine-1", types[0]);
		nameType.put("assembling-machine-2", types[0]);
		nameType.put("assembling-machine-3", types[0]);
		nameType.put("oil-refinery", types[0]);
		nameType.put("chemical-plant", types[0]);
		nameType.put("centrifuge", types[0]);
		nameType.put("lab", types[0]);

		nameType.put("beacon", types[0]);
		nameType.put("speed-module-1", types[0]);
		nameType.put("speed-module-2", types[0]);
		nameType.put("speed-module-3", types[0]);
		nameType.put("efficiency-module-1", types[0]);
		nameType.put("efficiency-module-2", types[0]);
		nameType.put("efficiency-module-3", types[0]);
		nameType.put("productivity-module-1", types[0]);
		nameType.put("productivity-module-2", types[0]);
		nameType.put("productivity-module-3", types[0]);
		
		// INTERMEDIATE PRODUCTS
		nameType.put("raw-wood", types[0]);
		nameType.put("coal", types[0]);
		nameType.put("stone", types[0]);
		nameType.put("iron-ore", types[0]);
		nameType.put("copper-ore", types[0]);
		nameType.put("uranium-ore", types[0]);
		nameType.put("raw-fish", types[0]);
		
		nameType.put("wood", types[0]);
		nameType.put("iron-plate", types[0]);
		nameType.put("copper-plate", types[0]);
		nameType.put("solid-fuel", types[0]);
		nameType.put("steel-plate", types[0]);
		nameType.put("sulfur", types[0]);
		nameType.put("plastic-bar", types[0]);
		
		nameType.put("crude-oil-barrel", types[0]);
		nameType.put("heavy-oil-barrel", types[0]);
		nameType.put("light-oil-barrel", types[0]);
		nameType.put("lubricant-barrel", types[0]);
		nameType.put("petroleum-gas-barrel", types[0]);
		nameType.put("sulfuric-acid-barrel", types[0]);
		nameType.put("water-barrel", types[0]);
		
		nameType.put("copper-cable", types[0]);
		nameType.put("iron-stick", types[0]);
		nameType.put("iron-gear-wheel", types[0]);
		nameType.put("empty-barrel", types[0]);
		nameType.put("electronic-circuit", types[0]);
		nameType.put("advanced-circuit", types[0]);
		nameType.put("processing-unit", types[0]);
		nameType.put("engine-unit", types[0]);
		nameType.put("electric-engine-unit", types[0]);
		nameType.put("battery", types[0]);
		
		nameType.put("explosives", types[0]);
		nameType.put("flying-robot-frame", types[0]);
		nameType.put("low-density-structure", types[0]);
		nameType.put("rocket-fuel", types[0]);
		nameType.put("rocket-control-unit", types[0]);
		nameType.put("satellite", types[0]);
		nameType.put("uranium-235", types[0]);
		nameType.put("uranium-238", types[0]);
		nameType.put("uranium-fuel-cell", types[0]);
		nameType.put("used-up-uranium-fuel-cell", types[0]);
		
		nameType.put("science-pack-1", types[0]);
		nameType.put("science-pack-2", types[0]);
		nameType.put("science-pack-3", types[0]);
		nameType.put("military-science-pack", types[0]);
		nameType.put("production-science-pack", types[0]);
		nameType.put("high-tech-science-pack", types[0]);
		nameType.put("space-science-pack", types[0]);
		
		nameType.put("pistol", types[0]);
		nameType.put("submachine-gun", types[0]);
		nameType.put("shotgun", types[0]);
		nameType.put("combat-shotgun", types[0]);
		nameType.put("rocket-launcher", types[0]);
		nameType.put("flamethrower", types[0]);
		nameType.put("land-mine", types[0]);
		nameType.put("firearm-magazine", types[0]);
		nameType.put("piercing-rounds-magazine", types[0]);
		nameType.put("uranium-rounds-magazine", types[0]);
		nameType.put("shotgun-shells", types[0]);
		nameType.put("piercing-shotgun-shells", types[0]);
		nameType.put("uranium-shotgun-shells", types[0]);
		nameType.put("cannon-shell", types[0]);
		nameType.put("explosive-cannon-shell", types[0]);
		nameType.put("uranium-cannon-shell", types[0]);
		nameType.put("explosive-uranium-cannon-shell", types[0]);
		nameType.put("rocket", types[0]);
		nameType.put("explosive-rocket", types[0]);
		nameType.put("atomic-bomb", types[0]);
		nameType.put("flamethrower-ammo", types[0]);
		
		nameType.put("grenade", types[0]);
		nameType.put("cluster-grenade", types[0]);
		nameType.put("poison-capsule", types[0]);
		nameType.put("slowdown-capsule", types[0]);
		nameType.put("defender-capsule", types[0]);
		nameType.put("distractor-capsule", types[0]);
		nameType.put("destroyer-capsule", types[0]);
		nameType.put("discharge-defense-remote", types[0]);
		
		nameType.put("light-armor", types[0]);
		nameType.put("heavy-armor", types[0]);
		nameType.put("modular-armor", types[0]);
		nameType.put("power-armor", types[0]);
		nameType.put("power-armor-mk2", types[0]);
		nameType.put("portable-solar-panel", types[0]);
		nameType.put("portable-fusion-reactor", types[0]);
		nameType.put("energy-shield", types[0]);
		nameType.put("energy-shield-mk2", types[0]);
		nameType.put("battery", types[0]);
		nameType.put("battery-mk2", types[0]);
		nameType.put("personal-laser-defense", types[0]);
		nameType.put("discharge-defense", types[0]);
		nameType.put("exoskeleton", types[0]);
		nameType.put("personal-roboport", types[0]);
		nameType.put("personal-roboport-mk2", types[0]);
		nameType.put("nightvision", types[0]);
		
		nameType.put("stone-wall", types[0]);
		nameType.put("gate", types[0]);
		nameType.put("gun-turret", types[0]);
		nameType.put("laser-turret", types[0]);
		nameType.put("flamethrower-turret", types[0]);
		nameType.put("radar", types[0]);
		nameType.put("rocket-silo", types[0]);
	}
	
	public String type;
	public String name;
	
	public Signal (String name) {
		name = convertAlias(name);
		if (!nameType.containsKey(name))
			System.err.println("Signal " + name + " is unknown!");
		this.type = nameType.get(name);
		this.name = name;
	}
	
	public static boolean variableExists(String var) {
		return nameType.containsKey(convertAlias(var));
	}
	
	public static void addAlias(String oldVar, String newVar) {
		if (newVar != oldVar)
			aliases.put(newVar, oldVar);
	}
	
	private static String convertAlias(String var) {
		while (aliases.containsKey(var)) {
			var = aliases.get(var);
		}
		return var;
	}
	
}
