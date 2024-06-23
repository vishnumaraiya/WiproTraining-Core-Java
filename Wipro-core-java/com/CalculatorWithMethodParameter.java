package com;

public class CalculatorWithMethodParameter {

	public static void main(String[] args) {
		int n1 = 20;//Local variable
		int n2 = 30;
		
		addition(n1, n2);//Method call
		sub(n1, n2);
		

	}
	
	public static void addition(int a, int b) {
		
		int n3 = a + b;
		System.out.println("The addition of n1 and n2 : "+n3);
	}
	
	public static void sub(int a, int b) {
		
		int n3 = a - b;
		System.out.println("The substraction of n1 and n2 : "+n3);
	}

}
