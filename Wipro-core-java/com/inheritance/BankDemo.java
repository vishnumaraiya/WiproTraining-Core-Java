package com.inheritance;

public class BankDemo {

	public static void main(String[] args) {
		//create a savings account
		SavingsAccount savingAccount = new SavingsAccount("AB6783", 10000, 100);
		
		//Display initial account information
		System.out.println("Initial savings account information ");
	    System.out.println("Display called");
	    savingAccount.displayAccountinfo();;

	    //Deposit and withdraw money 
	    savingAccount.deposit(300);
	    savingAccount.withdraw(500);
	    
	    //calculate interest
	    System.out.println("\n calculating interest");
	}

}
