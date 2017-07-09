package entities.blueprint;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DeciderConditions {

	public Signal first_signal;
	public Signal second_signal;
	public int constant;
	public String comparator;
	public Signal output_signal;
	public boolean copy_count_from_input;
	
}
