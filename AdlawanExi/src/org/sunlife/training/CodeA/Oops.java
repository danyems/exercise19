package org.sunlife.training.CodeA;

public class Oops {
	
	public static void main(String[] args) {
		
		int a = 7, b = 42;
		int smaller = minimum (a, b);
		
		if ( smaller == a ) {
			System.out.println( "a is the smaller!" );	
		}
	}
	
	// returns which int is smaller
	
	public static int minimum(int a, int b) {
		
		int smaller;
		
		if( a < b )
		{
			smaller = a;
		} else {
			smaller = b;
		}
		
		return smaller;
	}
}
