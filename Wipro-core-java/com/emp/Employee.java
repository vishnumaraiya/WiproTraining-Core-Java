package com.emp;

public class Employee {

	public int id;
	public String empName;
	public float Salary;
	
	//constructor
	public Employee() {
		
	}
    // parameterized constructor
	public Employee(int id, String empName, float Salary) {
		this.id = id;
		this.empName = empName;
		this.Salary = Salary;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public float getSalary() {
		return Salary;
	}
	public void setSalary(float salary) {
		Salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", empName=" + empName + ", Salary=" + Salary + "]";
	}
	
	public void displayEmployeeData() {
		
		System.out.println(id);
		System.out.println(empName);
		System.out.println(Salary);
	}
	
}
