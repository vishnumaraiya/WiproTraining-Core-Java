package com.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestEmployeeComparator {

	public static void main(String[] args) {
		List<Employee> emplist = new ArrayList();
		emplist.add(new Employee(102,"john",7871827));
		emplist.add(new Employee(104,"lucky",346723));
		emplist.add(new Employee(101,"tom",1345827));
		emplist.add(new Employee(107,"jerry",743571827));
		
		System.out.println("Sorting by name:");
		Collections.sort(emplist,new EmployeeNameComparator());
		
		Iterator itr = emplist.iterator();
		while(itr.hasNext()) {
			Employee e = (Employee)itr.next();
		    System.out.println(e.id+ " "+e.empName+ " "+e.Salary);
			
		}
		System.out.println("Sorting by ID");


       Collections.sort(emplist,new EmployeeAgeComparator());
		
		Iterator itr1 = emplist.iterator();
		while(itr1.hasNext()) {
			Employee e = (Employee)itr1.next();
		    System.out.println(e.id+ " "+e.empName+ " "+e.Salary);
			
		}
		
	}
}
