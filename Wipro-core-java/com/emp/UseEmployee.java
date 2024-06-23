package com.emp;

public class UseEmployee {

	public static void main(String[] args) {
		
		Employee empObj = new Employee();
		empObj.id = 101;
		empObj.empName = "XYZ";
		empObj.Salary = 10000;
		
		System.out.println(empObj.id);
		System.out.println(empObj.empName);
		System.out.println(empObj.Salary);
		
		Employee empObj1 = new Employee(100, "XYZW",180000);
		
//		System.out.println(empObj.id);
//		System.out.println(empObj.empName);
//		System.out.println(empObj.Salary);
		
		System.out.println(empObj1);
		
		empObj.displayEmployeeData();
		empObj1.displayEmployeeData();
	}

}
