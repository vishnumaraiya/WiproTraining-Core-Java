package com.Assignment1;

public class UseAddress {

	public static void main(String[] args) {
		// create a address using parameterized constructor
		
		Address address = new Address(101, "Gwalior", "MP", "474010");
		
		System.out.println("Original Address");
		address.displayAddress();
		
		address.setCity("pune");
		address.setState("Maharastra");
		
		System.out.println("\nupdated address");
		address.displayAddress();
		
		
		
	}

}
