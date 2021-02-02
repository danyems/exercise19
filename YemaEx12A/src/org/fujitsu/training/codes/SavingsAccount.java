package org.fujitsu.training.codes;

public class SavingsAccount {
	
	private Double interest;
	private Double initialBalance;
	private Float interestRate;

	/* 
	 * 
	 * 2. constructor injection
	 * 
	 * B.
	 * LAZY and EAGER
	 *  -AUTHOR
	 *  
	 *  -BOOK
	 */
	
	public SavingsAccount() {
		this.setInterestRate(0.0f);
		this.initialBalance = 0.0;
	}
	
	public SavingsAccount(float interestRate, double initialBalance) {
		this.setInterestRate(interestRate);
		this.initialBalance = initialBalance;
	}
	
	public Double deposit(double money) {
		this.initialBalance += money;
		return this.initialBalance;
	}
	
	public Double withdraw(double money) {
		this.initialBalance -= money;
		return this.initialBalance;
	}
	
	public Double addInterest() {
		double interestTemp = this.initialBalance * (this.interest / 12);
		this.interest += interestTemp;
		return this.interest;
	}
	

	public Float getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Float interestRate) {
		this.interestRate = interestRate;
	}
	
	@Override
	public String toString() {
		String info = new String("Balance: " + this.initialBalance + "\nInterest: " + this.interest);
		return info;
	}
	
}
