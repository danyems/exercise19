package org.fujitsu.training.inner;

import java.util.ArrayList;
import java.util.Iterator;

public class CoffeeCup<E> {
	
	private ArrayList<E> innerObjects;
	
	public CoffeeCup() {
		this.innerObjects = new ArrayList<>();
	}
	
	public CoffeeCup(ArrayList<E> newList) {
		this.innerObjects.addAll(newList);
	}
	
	public void add(Object o) {
		
	}
	
	public Iterator getIterator() {
		return null;
	}
	
	ArrayList<E> getObjects(){
		return this.innerObjects;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
