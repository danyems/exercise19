package org.fujitsu.training.codes;

public class TestSavingsAccount {
	
	public static void main(String[] args) {
		
		SavingsAccount sa = new SavingsAccount(0.1f, 10000.00);
		sa.deposit(10000.00);
		sa.withdraw(5000.00);
		System.out.println(sa.toString());
	}

}
