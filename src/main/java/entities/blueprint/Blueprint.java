package entities.blueprint;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Blueprint implements FactorioEntity {

	public Icon[] icons;
	public Entity[] entities;
	public String item;
	public long version;
	public String label;
}
