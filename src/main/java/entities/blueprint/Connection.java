package entities.blueprint;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Connection {

	public ArrayList<ConnectionDetail> red;
	public ArrayList<ConnectionDetail> green;
	
}
