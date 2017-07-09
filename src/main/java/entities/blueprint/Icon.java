package entities.blueprint;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Icon {
	
	public int index;
	public Signal signal;
	
	public Icon(int index, Signal signal) {
		this.index = index;
		this.signal = signal;
	}
	
	
	
}
