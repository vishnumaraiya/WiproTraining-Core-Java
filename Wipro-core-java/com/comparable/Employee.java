package com.comparable;

public class Employee implements Comparable<Employee> {
	int id;
	String empName;
	float Salary;
	
    // parameterized constructor
	public Employee(int id, String empName, float Salary) {
		this.id = id;
		this.empName = empName;
		this.Salary = Salary;
	}
	@Override
	public int compareTo(Employee employee) {
		if(this.id == employee.id) {
			return 0;
		}else if(this.id<employee.id)
		return -1;
		else
	    return 1;
}
}