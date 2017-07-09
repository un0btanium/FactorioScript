package entities.compiler;

public class Number implements CompilerEntity {
	
	private int value;
	
	public Number(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	
	
}
