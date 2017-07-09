package entities.blueprint;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BlueprintBook implements FactorioEntity {
	
	public Blueprint[] blueprints;
	public String item;
	public int active_index;
	public long version;
	public String label;

}
