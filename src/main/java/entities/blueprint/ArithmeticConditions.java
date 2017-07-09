package entities.blueprint;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ArithmeticConditions {

	public Signal first_signal;
	public Signal second_signal;
	public int constant;
	public String operation;
	public Signal output_signal;

}
