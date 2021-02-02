package org.sunlife.training.codeA;

public class Oops {
	public static void main(String[] args) {
		
		int smaller = 0;
		int a = 7;
		int b = 42;
		
		minimum(a, b);
		if ( smaller == a ) {
			System.out.println("a is the smallest!");
		}
	}
	
	
	//returns which int is smaller
	public static int minimum(int a, int b) {
		
		int smaller = 0;
		
		if ( a < b ) {
			smaller = a;
		} 
		else if ( a <= b ) {
			smaller = b;
		}
		return smaller;
	}
}
