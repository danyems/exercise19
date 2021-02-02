package org.fujitsu.training.objects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.fujitsu.training.objects.exceptions.PayFirstForAdditionalException;

public class LeCreamDeApp {
	
	public void callApp(){
		List<LeCreamMenu> basket = new ArrayList<>();
		
		String choice;
		String wafer;
		Byte scoop = 0;
		float total = 0;
		float additional = 10.00f;
		try(Scanner sc = new Scanner(System.in);) {
			do {
				
				System.out.println("Choose Flavor:");
				System.out.println("[A]: Chocolate");
				System.out.println("[B]: Vanilla");
				System.out.println("[C]: Strawberry");
				System.out.println("[D]: Mango");
				System.out.println("[E]: Tutti Fruit");
				System.out.println("[F]: Almond Crunch");
				System.out.println("[G]: Coffee");
				System.out.print("Choice: ");
				choice = sc.next();
				if (choice.equalsIgnoreCase("E")) {
					break;
				}
				
				System.out.print("How many scoops?: ");
				scoop = sc.nextByte();
//				try {
//					scoop = getScoops();
//				} catch(PayFirstForAdditionalException e) {
//					e.printStackTrace();
//				}
				System.out.print("Do you want to add Vanilla Wafer? [Y/N]: ");
				wafer = sc.next();
				
				switch(choice) {
					case "A":
						basket.add(LeCreamMenu.CHOCOLATE);
						if(wafer.equalsIgnoreCase("Y")) {
							total += (LeCreamMenu.CHOCOLATE.getPrice() * scoop) + additional;
						} else {
							total += LeCreamMenu.CHOCOLATE.getPrice() * scoop;
						}
						
						break;
					case "B":
						basket.add(LeCreamMenu.VANILLA);
						total += LeCreamMenu.VANILLA.getPrice() * scoop;
						break;
					case "C":
						basket.add(LeCreamMenu.STRAWBERRY);
						total += LeCreamMenu.STRAWBERRY.getPrice() * scoop;
						break;
					case "D":
						basket.add(LeCreamMenu.MANGO);
						total += LeCreamMenu.MANGO.getPrice() * scoop;
						break;
					case "E":
						basket.add(LeCreamMenu.TUTTI_FRUIT);
						total += LeCreamMenu.TUTTI_FRUIT.getPrice() * scoop;
						break;
					case "F":
						basket.add(LeCreamMenu.ALMOND_CRUNCH);
						total += LeCreamMenu.ALMOND_CRUNCH.getPrice() * scoop;
						break;
					case "G":
						basket.add(LeCreamMenu.COFFEE);
						total += LeCreamMenu.COFFEE.getPrice() * scoop;
						break;
				}
				
			} while (true);
			
			System.out.println("---------------------------------------------");
			
			for (LeCreamMenu product: basket) {
				System.out.printf("%s \n", product.getName());
				
			}
			System.out.println("Total:" + total);
			System.out.println("---------------------------------------------");
			
		} catch (Exception e) {
		}	
	}
	
	public byte getScoops() throws PayFirstForAdditionalException, Exception {
		byte scoop = 1;
		try(Scanner sc = new Scanner(System.in);){
			scoop = sc.nextByte();
		} catch (Exception e) {}
		
		if (scoop > 3) {
			throw new PayFirstForAdditionalException();
		} else {
			return scoop;
		}
	}
}

