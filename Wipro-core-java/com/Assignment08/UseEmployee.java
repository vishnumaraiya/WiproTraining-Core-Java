package com.Assignment08;

public class UseEmployee {

	public static void main(String[] args) {
		
		String s1 = new String("vishnu");
		String s2 = new String("vishnu");
		
		Employee e1 = new Employee(1,"vishnu");
		Employee e2 = new Employee(2,"Lucky");
		
		System.out.println(e1.equals(e2));
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());

	}

}
