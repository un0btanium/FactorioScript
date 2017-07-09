package entities.blueprint;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Position {
	
	public double x;
	public double y;
	
	public Position(double x, double y) {
		this.x = x;
		this.y = y;
	}
}
