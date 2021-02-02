package org.fujitsu.training.enums;

public class TestElements {

	public static void main(String[] args) {
		
		CategorizeElements ce = new CategorizeElements();
		System.out.println("Alkali Metals:");
		System.out.println(ce.alkaliMetals());
		System.out.println();
		System.out.println("Transition Metals:");
		System.out.println(ce.transitionMetals());
		System.out.println();
		System.out.println("Metals:");
		System.out.println(ce.metals());
		
		System.out.println("Accesing Gallium");
		System.out.println(Elements.GALLIUM.toString());

	}

}
