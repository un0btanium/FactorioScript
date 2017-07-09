package entities.blueprint;

import java.util.ArrayList;

public class FactorioEntityList implements FactorioEntity {
	
	private ArrayList<FactorioEntity> fel;
	
	public FactorioEntityList() {
		fel = new ArrayList<>();
	}
	
	public void add(FactorioEntity factorioEntity){
		fel.add(factorioEntity);
	}
	
	public void add(int index, FactorioEntity factorioEntity) {
		fel.add(index, factorioEntity);
	}
	
	@SuppressWarnings("unchecked")
	public ArrayList<FactorioEntity> getList() {
		return (ArrayList<FactorioEntity>) fel.clone();
	}
	
}
