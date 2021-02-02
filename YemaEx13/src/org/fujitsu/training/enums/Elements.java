package org.fujitsu.training.enums;

import java.util.ArrayList;
import java.util.List;

public enum Elements {
	
	HYDROGEN("Hydrogen", (byte) 1, "H"),
	OXYGEN("Oxygen", (byte) 8, "O"),
	POTASSIUM("Potassium", (byte) 19, "K"),
	ZINC("Zinc", (byte) 30, "Zn"),
	GALLIUM("Gallium", (byte) 31, "Ga");
	
	private String name;
	private Byte atomNum;
	private String atomSym;
	
	private Elements(String name, Byte atomNum, String atomSym) {
		this.name = name;
		this.atomNum = atomNum;
		this.atomSym = atomSym;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Byte getAtomNum() {
		return atomNum;
	}

	public void setAtomNum(Byte atomNum) {
		this.atomNum = atomNum;
	}

	public String getAtomSym() {
		return atomSym;
	}

	public void setAtomSym(String atomSym) {
		this.atomSym = atomSym;
	}
	
	@Override
	public String toString() {
		return String.join(" ", name, atomNum+"", atomSym);
	}

}

class CategorizeElements {
	
	private List<Object> alkaliMetals = new ArrayList<>();
	private List<Object> transitionMetals = new ArrayList<>();
	private List<Object> metals = new ArrayList<>();
	
	public List<Object> getAlkaliMetals() {
		return alkaliMetals;
	}

	public void setAlkaliMetals(List<Object> alkaliMetals) {
		this.alkaliMetals = alkaliMetals;
	}

	public List<Object> getTransitionMetals() {
		return transitionMetals;
	}

	public void setTransitionMetals(List<Object> transitionMetals) {
		this.transitionMetals = transitionMetals;
	}

	public List<Object> getMetals() {
		return metals;
	}

	public void setMetals(List<Object> metals) {
		this.metals = metals;
	}
	
	public List<Object> alkaliMetals() {
		
		for(Elements elem : Elements.values()) {
			byte x = elem.getAtomNum();
			
			if (x == 3 || x == 11 || x == 19 || x == 37  || x == 55  || x == 87) {
				this.alkaliMetals.add(elem.getName());
			}
		}
		
		return alkaliMetals;
	}
	
	public List<Object> transitionMetals() {
		
		for(Elements elem : Elements.values()) {
			byte x = elem.getAtomNum();
			
			if ( (x >= 21 && x <= 31) || (x >= 39 && x <= 48) || (x >= 72  && x <= 80)  || (x >= 104 && x <= 112)) {
				this.transitionMetals.add(elem.getName());
			}
		}
		
		return this.transitionMetals;
	}
	
	public List<Object> metals() {
		
		for(Elements elem : Elements.values()) {
			byte x = elem.getAtomNum();
			
			if (x == 13 || x == 49 || x == 50 || (x >= 81  && x <= 83) || (x >= 113 && x <= 116)) {
				this.metals.add(elem.getName());
			}
		}
		
		return this.metals;
		
	}

}


