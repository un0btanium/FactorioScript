package entities.compiler;

public class Variable implements CompilerEntity {

	private String name;
	
	public Variable (String name) {
		this.name = name;
	}
	
	public String getVariable() {
		return name;
	}
	
}
