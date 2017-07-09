package entities.compiler;

import java.util.HashMap;

public class PowerPole implements CompilerEntity {

	public static HashMap<String, PowerPoleType> powerPoleTypes;
	
	static {
		powerPoleTypes = new HashMap<>();
		powerPoleTypes.put("small-electric-pole", new PowerPoleType("small-electric-pole", 4, 1));
		powerPoleTypes.put("medium-electric-pole", new PowerPoleType("medium-electric-pole", 6, 1));
		//powerPoleTypes.put("big-electric-pole", new PowerPoleType("big-electric-pole", 2, 2));
		powerPoleTypes.put("substation", new PowerPoleType("substation", 16, 2));
	}
	
}
