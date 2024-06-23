package com.assignment07_2;

import java.util.Scanner;

public class GradeCalculator {

	public static void main(String[] args) {
		
Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the student's score: ");
        int score = scanner.nextInt();
        
        if (score < 0 || score > 100) {
            System.out.println("Error: Score must be between 0 and 100.");
        } else {
        	
            char grade;
            
            if (score >= 90) {
                grade = 'A';
            } else if (score >= 80) {
                grade = 'B';
            } else if (score >= 70) {
                grade = 'C';
            } else if (score >= 60) {
                grade = 'D';
            } else {
                grade = 'F';
            }
            
            System.out.println("The student's grade is: " + grade);
        }
        
        scanner.close();
    }
	}


