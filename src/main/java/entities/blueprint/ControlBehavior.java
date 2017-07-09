package entities.blueprint;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ControlBehavior {

	public ArithmeticConditions arithmetic_conditions;
	public DeciderConditions decider_conditions;
	public ArrayList<Filter> filters;
	
}
