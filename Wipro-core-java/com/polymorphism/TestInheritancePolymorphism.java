package com.polymorphism;

public class TestInheritancePolymorphism {

	public static void main(String[] args) {
		//Bank bank = new Bank(); //cannot be instantiated
		
		Bank bank = new SBI();  // Parent class can refer subclass object
		System.out.println("SBI Rate of Interest: " +bank.getRateOfInterest());
		
		bank = new ICICIBank();
		System.out.println("ICICI Rate of Interest: "+bank.getRateOfInterest());
		System.out.println("Country is "+bank.country);
		

	}

}
