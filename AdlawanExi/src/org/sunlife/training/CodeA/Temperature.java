package org.sunlife.training.CodeA;

public class Temperature {

	public static void main(String[] args) {
		
		double tempF = 98.6;
		double tempC = 0.0;
		
		tempC = fToC(tempF);
		
		System.out.println("Body temp in C is "+ tempC);
	}
	
	//Converts Fahrenhet temperatures to Celsius.
	
	public static double fToC(double tempF) {
		
		double tempC;
		
		tempC = ( tempF - 32 )* 5 / 9;
		
		return tempC;
	}
}
