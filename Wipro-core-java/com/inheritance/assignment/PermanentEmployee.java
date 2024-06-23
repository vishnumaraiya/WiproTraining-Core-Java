package com.inheritance.assignment;

public class PermanentEmployee extends Employee {
	
	private double bonus;

	public PermanentEmployee(int id, String name, double salary) {
		super(id, name, salary);
		this.bonus = bonus;
	}
	
	public double calculateNetSalary() {
		double getSalary = salary + bonus;
	}

}
