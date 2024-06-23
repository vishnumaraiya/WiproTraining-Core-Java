package com.emp.dept;

public class Employee {

	private int id;
	private String empName;
	private float Salary;
	private Department department;
	
	//constructor
	public Employee() {
		
	}
    // parameterized constructor
	
	public Employee(int id, String empName, float salary, Department department) {
		super();
		this.id = id;
		this.empName = empName;
		Salary = salary;
		this.department = department;
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
	
	
	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
	
	

	@Override
	public String toString() {
		return "Employee [id=" + id + ", empName=" + empName + ", Salary=" + Salary + ", department=" + department
				+ "]";
	}

	public void displayEmployeeData() {
		
		System.out.println(id);
		System.out.println(empName);
		System.out.println(Salary);
		System.out.println(department);
	}
	

	
}
