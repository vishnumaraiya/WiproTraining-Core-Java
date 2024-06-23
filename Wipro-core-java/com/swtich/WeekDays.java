package com.swtich;

import java.util.Scanner;

public class WeekDays {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your choice : ");
		int dayNumber = scanner.nextInt();
		
		if(dayNumber < 1 || dayNumber > 7  ) {
			System.out.println("Invalid input! Please enter a number between 1 and 7.");
	}
		else {
            String day = getDayOfWeek(dayNumber);
            System.out.println("Day: " + day);
        }
		
		scanner.close();


}
	public static String getDayOfWeek(int dayNumber) {
        String day;
        switch (dayNumber) {
		case 1:
            day = "Monday";
         break;
        case 2:
            day = "Tuesday";
            break;
        case 3:
            day = "Wednesday";
            break;
        case 4:
            day = "Thursday";
           break;
        case 5:
            day = "Friday";
           break;
        case 6:
            day = "Saturday";
            break;
        case 7:
            day = "Sunday";
            break;
        default:
            day = "Invalid input!";
            break;
		}
		return day;
        
}
}