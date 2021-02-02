package org.fujitsu.training.objects;

import org.fujitsu.training.objects.exceptions.PayFirstForAdditionalException;

public enum LeCreamMenu implements SetOrder{
	
	CHOCOLATE("Chocolate", 60.00F, false),
	VANILLA("Vanilla", 50.00F, false),
	STRAWBERRY("Strawberry", 50.00F, false),
	MANGO("Mango", 50.00F, false),
	TUTTI_FRUIT("Tutti Fruit", 50.00F, false),
	ALMOND_CRUNCH("Almond Crunch", 50.00F, false),
	COFFEE("Coffee", 50.00F, false);
	
	private String name;
	private Float price;
	private boolean hasWafer;
	
	private LeCreamMenu(String name, Float price, Boolean hasWafer) {
		this.name = name;
		this.price = price;
		this.hasWafer = hasWafer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public boolean isHasWafer() {
		return hasWafer;
	}

	public void setHasWafer(boolean hasWafer) {
		this.hasWafer = hasWafer;
	}

	
	@Override
	public void addWafer(LeCreamMenu order) {
		order.hasWafer = true;
	}

	@Override
	public void scoops(LeCreamMenu order, Byte scoop){
		order.price = order.price * scoop;
	}
	
}

interface SetOrder{
	
	public abstract void addWafer(LeCreamMenu order);
	public abstract void scoops(LeCreamMenu order, Byte scoop)  throws PayFirstForAdditionalException, Exception ;
}