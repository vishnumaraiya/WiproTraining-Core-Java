package com.fileio;

public class Employee {
	private int empNo;
	private String Name;
	private float Salary;
	
	
	public Employee(int empNo, String name, float salary) {
		super();
		this.empNo = empNo;
		this.Name = name;
		this.Salary = salary;
	}
	
	public void showData() {
		System.out.println(empNo + " : "+Name+ " : "+Salary);
		System.out.println("Average Salary: "+Math.sqrt(22d));  //without static import
		
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		this.Name = name;
	}

	public float getSalary() {
		return Salary;
	}

	public void setSalary(float salary) {
		this.Salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", name=" + Name + ", salary=" + Salary + "]";
	}
	
	
	

}
