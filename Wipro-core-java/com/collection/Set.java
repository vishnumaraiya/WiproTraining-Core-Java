package com.collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Set {
     
    public static void main(String[] args) {
		List<Integer> listNumbers = Arrays.asList(2,3,7,9,2,5,6,7,3,2,6,5);
		System.out.println(listNumbers);
		
		java.util.Set<Integer> uniqueNumber = new HashSet<>(listNumbers);
		
		java.util.Set<Integer> s = new HashSet<>();
		System.out.println(uniqueNumber);
		
		//Add an element 
		java.util.Set<String> names = new HashSet<>();
		names.add("Tom");
		names.add("Marry");
		
		if(names.add("peter")) {
			System.out.println("peter is added to the set");
		}
		if(!names.add("Tom")) {
			System.out.println("Tom is already added to the set");
		}
		
		//Traverse all the elements
		Iterator<String> iterator = names.iterator();
		while(iterator.hasNext()){
			
			String name = iterator.next();
			System.out.println(name);
		}
		
		//search an element
		if(names.contains("Marry")) {
			System.out.println("Found Marry");
		}

		//Bulk Operation
		//a.subset
		java.util.Set<Integer> s1 = new HashSet<>(Arrays.asList(20,72,56,89,8,5));
		java.util.Set<Integer> s2 = new HashSet<>(Arrays.asList(72,89,5));
		
		if (s1.containsAll(s2)) {
			System.out.println("s2 is a subset of s1");
		}
		
		//b.union
		s1.addAll(s2);
		System.out.println("s1 after union: "+s1);
		
		//c.intersection
		s1.retainAll(s2);
		System.out.println("s1 after intersection: "+s1);
	}

}
