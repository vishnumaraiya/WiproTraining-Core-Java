package com.inheritance;

public class Account {
	protected String accountNumber;
	protected double balance;
	
	//constructer
	public Account(String accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	//Method to deposit money
	public void deposit (double amount) {
		balance += amount;  // balance = balance + amount;
		System.out.println(amount + "deposited. Current Balance: "+balance);
	}
	
	//Method to withdraw Money
	public void withdraw(double amount) {
		if(balance >= amount) {
			balance -= amount;
			System.out.println(amount + "withdrawn . Current Balance :"+balance );
		} else {
			System.out.println("Insufficient funds");
		}
		
	}//method to display account information
		
		public void displayAccountinfo(){
			System.out.println("Account number: "+accountNumber);
			System.out.println("Balance :"+balance);
		}
	
	

}
