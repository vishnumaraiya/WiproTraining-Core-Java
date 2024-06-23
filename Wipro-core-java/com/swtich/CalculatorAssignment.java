package com.swtich;

import java.util.Scanner;

public class CalculatorAssignment {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(" 1 - Add \n 2 - Sub \n 3 - Div \n 4 - Mul");
		System.out.println("Choose Your Operator : ");
		int operator = scanner.nextInt();
		
		System.out.println("Enter first number : ");
		int num1 = scanner.nextInt();
		
		System.out.println("Enter Second number : ");
		int num2 = scanner.nextInt();
		
		int result = getCalculator(num1,num2,operator);
		System.out.println("Result is : "+result);
	}
	public static int getCalculator(int num1, int num2, int operator) {
		
		int result =0 ;
		switch(operator) {
		
		case 1:
			result = num1 + num2;
			break;
		case 2:
			result = num1 - num2;
			break;
		case 3:
			result = num1 * num2;
			break;
		case 4:
			result = num1 / num2;
			break;
			
		}
		return result;
		
	}

}
