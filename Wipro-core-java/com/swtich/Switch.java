package com.swtich;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// get the score from the user
		System.out.println("Enter the student's score : ");
		
		int score = scanner.nextInt();
		
		if(score < 0 || score > 100) {
			System.out.println("Invalid Score! score must be between 0 and 100 ");
			
		}
		else {
			char grade = calculatorGrade(score);
			System.out.println("Grade : " + grade);
		}
		scanner.close();
	}



public static char calculatorGrade(int score) {
	char grade ;
	switch(score / 10) {
	    case 10:
	    	grade = 'A';
	    	break;
	    case 9:	
	    	grade = 'B';
	    	break;
	    case 8:
	    	grade = 'c';
	    	break;
	    case 7:
	    	grade = 'D';
	    	break;
	    case 6:
	    	grade = 'E';
	    	break;
	    default:
	        grade = 'F';
	    	
	}
	return grade;
	
}

}