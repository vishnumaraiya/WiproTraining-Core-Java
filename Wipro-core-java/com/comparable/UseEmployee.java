package com.comparable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;


public class UseEmployee  {

	public static void main(String[] args) {
		
		ArrayList<Employee> emplist = new ArrayList<Employee>();
		emplist.add(new Employee(105,"Luvin",62736));
		emplist.add(new Employee(101,"Vishnu",787226));
		emplist.add(new Employee(103,"Jerry",82792));
		
		
		Collections.sort(emplist);
		for(Employee employee : emplist) {
			System.out.println(employee.id+ " "+employee.empName+" "+employee.Salary);
		}
	}


	}


