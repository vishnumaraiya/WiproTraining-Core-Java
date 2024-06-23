package com.emp.dept;

import com.emp.dept.Department;
import com.emp.dept.Employee;

public class UseEmployee {

	public static void main(String[] args) {
		
		Employee empObj = new Employee();
		
		// getter used to read the data
		System.out.println(empObj.getId());
	     System.out.println(empObj.getEmpName());
	     System.out.println(empObj.getSalary());
	     
	     empObj.displayEmployeeData();
	     
	     
	     //update the objects values
	     empObj.setEmpName("Lucky");
	     empObj.setSalary(1800000);
	     
	     empObj.displayEmployeeData();
	     
	   //Department
	     
//	     Employee e1 = new Employee();
//	     e1.setId(102);
//	     e1.setEmpName("Rahul");
//	     e1.setSalary(6576235);
//	     e1.setDepartment(new Department(112,"IT"));
//	     System.out.println(e1.().getCity());
//	     System.out.println(e1.getAddress().getState());
		
	}

}
