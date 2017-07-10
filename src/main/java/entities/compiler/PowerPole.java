package entities.compiler;

import java.util.HashMap;

public class PowerPole implements CompilerEntity {
	
	
	public static String powerPole;
	public static HashMap<String, PowerPoleType> powerPoleTypes;
	
	static {
		powerPole = "small";
		
		powerPoleTypes = new HashMap<>();

		PowerPoleType small = new PowerPoleType("small-electric-pole", 4, 1);
		PowerPoleType medium = new PowerPoleType("medium-electric-pole", 6, 1);
//		PowerPoleType big = new PowerPoleType("big-electric-pole", 2, 2);
		PowerPoleType substation = new PowerPoleType("substation", 16, 2);
		

		powerPoleTypes.put("small", small);
		powerPoleTypes.put("SMALL", small);
		powerPoleTypes.put("medium", medium);
		powerPoleTypes.put("MEDIUM", medium);
//		powerPoleTypes.put("big", big);
//		powerPoleTypes.put("BIG", big);
		powerPoleTypes.put("substation", substation);
		powerPoleTypes.put("SUBSTATION", substation);
	}
	
}
