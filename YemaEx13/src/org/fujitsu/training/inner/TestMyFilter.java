package org.fujitsu.training.inner;

public class TestMyFilter {
	
	public static void main(String[] args) {

		
		IFilter filter1 = new IFilter() {

			@Override
			public boolean accept(String x) {
				if(x.length() <= 3) {
					return true;
				} else {
					return false;
				}	
			}
		};
		
		IFilter filter2 = new IFilter() {

			@Override
			public boolean accept(String x) {
				if(x.charAt(x.length()-1) == 's' || x.charAt(x.length()-1) == 'S') {
					return true;
				} else {
					return false;
				}	
			}
		};
		
		IFilter filter3 = new IFilter() {

			@Override
			public boolean accept(String x) {
				String temp = "";
				
				for ( int i = x.length() - 1; i >= 0; i-- ) {
					temp = temp + x.charAt(i);
			    }
			         
				if (x.equals(temp)) {
					return true;
				} else {
					return false;
				}
			    	  	
			}
		};
		
		IFilter filter4 = new IFilter() {

			@Override
			public boolean accept(String x) {
				if(x.charAt(0) > '0' && x.charAt(0) <= '9') {
					return true;
				} else {
					return false;
				}	
			}
		};
		
		IFilter filter5 = new IFilter() {

			@Override
			public boolean accept(String x) {
				if(x.length() % 2 == 1) {
					return true;
				} else {
					return false;
				}	
			}
		};
		
		String word[] = {"Hi", "racecar", "madam", "123hello", "javabootcamps", "FETEC", "3alcohol", "dry", "set", "Head"};
		String accepted1[] = MyFilter.filter(word, filter1);
		String accepted2[] = MyFilter.filter(word, filter2);
		String accepted3[] = MyFilter.filter(word, filter3);
		String accepted4[] = MyFilter.filter(word, filter4);
		String accepted5[] = MyFilter.filter(word, filter5);
		
		System.out.println("Filter 1:");
		for(String lookup: accepted1) {
			System.out.print(lookup + " ");
		}
		System.out.println();
		System.out.println("Filter 2:");
		for(String lookup: accepted2) {
			System.out.print(lookup + " ");
		}
		System.out.println();
		System.out.println("Filter 3:");
		for(String lookup: accepted3) {
			System.out.print(lookup + " ");
		}
		System.out.println();
		System.out.println("Filter 4:");
		for(String lookup: accepted4) {
			System.out.print(lookup + " ");
		}
		System.out.println();
		System.out.println("Filter 5:");
		for(String lookup: accepted5) {
			System.out.print(lookup + " ");
		}
		System.out.println();
		
	}
}
