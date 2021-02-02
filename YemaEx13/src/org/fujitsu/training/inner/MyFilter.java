package org.fujitsu.training.inner;

public class MyFilter {
	
	public static String[] filter(String[] a, IFilter f) {
		byte count = 0;

		//count the length first so array can be initialized
		for(int i = 0; i < a.length; i++) {
			if(f.accept(a[i])) {
				count++;
			}
		}
		
		String accepted[] = new String[count];
		count = 0;
		
		//transfer the accepted strings to new array
		for(int i = 0; i < a.length; i++) {
			if(f.accept(a[i])) {
				accepted[count] = a[i];
				count++;
			}
		}
		
		return accepted;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
