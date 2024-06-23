package com.Assignment1;

public class Address {
	
	private int addId;
	private String city;
	private String state;
	private String pinched;
	
	
	public Address() {
		
		// TODO Auto-generated constructor stub
	}


	public Address(int addId, String city, String state, String i) {
		
		this.addId = addId;
		this.city = city;
		this.state = state;
		this.pinched = i;
	}


	public int getAddId() {
		return addId;
	}


	public void setAddId(int addId) {
		this.addId = addId;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getPinched() {
		return pinched;
	}


	public void setPinched(String pinched) {
		this.pinched = pinched;
	}
	
	public void displayAddress() {
		
		System.out.println("Address ID: " + addId);
        System.out.println("City: " + city);
        System.out.println("State: " + state);
        System.out.println("Pin Code: " + pinched);
	}
	
	
	
	
	
	
	

}
