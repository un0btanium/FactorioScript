package entities.blueprint;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ConnectionDetail {
	
	public int entity_id;
	public int circuit_id;
	
	public ConnectionDetail(int entity_id) {
		this.entity_id = entity_id;
	}
	
	public ConnectionDetail(int entity_id,int circuit_id) {
		this.entity_id = entity_id;
		this.circuit_id = circuit_id;
	}
	
}
