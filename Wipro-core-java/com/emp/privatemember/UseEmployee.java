package com.emp.privatemember;

import java.util.Scanner;

public class UseEmployee {

	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("Enter Employee id : ");
//		int id = scanner.nextInt();
////		System.out.println("ID : ");
//
//		System.out.println("Enter Employee Name : ");
//		String empName =scanner.nextLine();
//		
//		System.out.println("Enter Employee Salary : ");
//		float Salary = scanner.nextFloat();
		
     Employee empObj = new Employee(200, "lucky" ,11245,new Address());
     
     //getter used to read the data
     System.out.println(empObj.getId());
     System.out.println(empObj.getEmpName());
     System.out.println(empObj.getSalary());
     
     empObj.displayEmployeeData();
     
     
     //update the objects values
     empObj.setEmpName("Lucky");
     empObj.setSalary(1800000);
     
     empObj.displayEmployeeData();
		
     
     //Address
     
     Employee e1 = new Employee();
     e1.setId(102);
     e1.setEmpName("Rahul");
     e1.setSalary(6576235);
     e1.setAddress(new Address("pune" ,"MH"));
     System.out.println(e1.getAddress().getCity());
     System.out.println(e1.getAddress().getState());
	}

}
