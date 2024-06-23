package com;

public class CalculatorWithMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		add();
		sub();
	 	findGreaterValue();
	

	}
	
	public static void add() {
		
		int n1 = 30;
		int n2 = 40;
		
		int n3 = n1 + n2;
		System.out.println("Add is : "+n3);
	}
	
public static void sub() {
		
		int n1 = 30;
		int n2 = 40;
		
		int n3 = n1 - n2;
		System.out.println("Sub is : "+n3);
	}


public static void findGreaterValue() {
	int a = 30;
	int b = 40;
	int c = 50;
	
	if (a >= b && a >= c) {
		System.out.println("The greatest value is: " + a);
	} else if (b >= a && b >= c) {
		System.out.println("The greatest value is: " + b);
	} else {
		System.out.println("The greatest value is: " + c);
	}
}

}
