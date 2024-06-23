package com.inheritance;

public class SavingsAccount extends Account {
	
	private double interestRate;

	//constructor
	public SavingsAccount(String accountNumber, double balance, double interestRate) {
		super(accountNumber, balance);
		this.interestRate = interestRate;
	}

	
	// method to calculate interest 
	public void calculateInterest() {
		double interest = balance * interestRate / 100;
		deposit(interest);
	}
	
	public void displayAccountInfo() {
		super.displayAccountinfo();
		System.out.println("Interest is : "+interestRate);
	}	

}
