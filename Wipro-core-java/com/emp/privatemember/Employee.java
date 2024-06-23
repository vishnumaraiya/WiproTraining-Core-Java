package com.emp.privatemember;

public class Employee {

		private int id;
		private String empName;
		private float Salary;
		private Address address;
		
		//constructor
		public Employee() {
			
		}
	    // parameterized constructor
		
		public Employee(int id, String empName, float salary, Address address) {
			super();
			this.id = id;
			this.empName = empName;
			Salary = salary;
			this.address = address;
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
		
		
		
		public Address getAddress() {
			return address;
		}

		public void setAddress(Address address) {
			this.address = address;
		}
		
		

		@Override
		public String toString() {
			return "Employee [id=" + id + ", empName=" + empName + ", Salary=" + Salary + ", address=" + address + "]";
		}

		public void displayEmployeeData() {
			
			System.out.println(id);
			System.out.println(empName);
			System.out.println(Salary);
			System.out.println(address);
		}
		
	
		
	}

	
