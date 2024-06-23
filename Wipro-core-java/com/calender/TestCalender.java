package com.calender;

import java.util.Calendar;

public class TestCalender {

	public static void main(String[] args) {
		//create a new calendar
		Calendar cal = Calendar.getInstance();
		System.out.println("The Current date is: "+cal.getTime());
		//print the first day of the week
		System.out.println("First day is : " + cal.getFirstDayOfWeek());
		
		int day = cal.getFirstDayOfWeek();
		switch(day){
		case(1):
		System.out.println("sunday");
		break;
		case(2):
			System.out.println("monday");
		break;
		case(3):
			System.out.println("tuesday");
		break;
		case(4):
			System.out.println("wednesday");
		break;
		case(5):
			System.out.println("thursday");
		break;
		case(6):
			System.out.println("firday");
		break;
		case(7):
			System.out.println("saturday");
		break;
		}
	}

}
