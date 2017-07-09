package entities.blueprint;

public class Filter {

	public Signal signal;
	public int count;
	public int index;
	
	public Filter(Signal signal, int count, int index) {
		this.signal = signal;
		this.count = count;
		this.index = index;
	}
}
