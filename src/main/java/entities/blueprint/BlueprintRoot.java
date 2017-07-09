package entities.blueprint;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BlueprintRoot implements FactorioEntity {

	public BlueprintBook blueprint_book;
	public Blueprint blueprint;
	
	
}
