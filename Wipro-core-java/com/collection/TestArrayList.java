package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//way to declare an arraylist
		ArrayList<String> list1 = new ArrayList<String>();
		
		
		//Add elements
		list1.add("one");
		list1.add("two");
		list1.add("three");
		list1.add("four");
		list1.add("five");
		list1.add("six");
		list1.add(null);
		
		//Approach 1
		System.out.println("Traverse element using for loop: ");
		for(int i=0; i<5; i++) {
			System.out.println(list1.get(i));
		}
		//Approach2
		System.out.println("Traverse element using for each loop: ");
		for(String num : list1) {
			System.out.println(num);
		}
		
		//Approach3:
		System.out.println("Traverse the element using iterator:");
		Iterator<String> iterat = list1.iterator(); // In forward direction
		
		while(iterat.hasNext()) {
			System.out.println("The Element is: "+iterat.next());
		}
			//Approach 4 To reverse the collection element
			System.out.println("Traverse the element using listIterator");
			ListIterator<String> literat = list1.listIterator(); //moves backward and forward
			
			while(literat.hasNext()) {
				System.out.println("The next element is: "+literat.next());
			}
			while(literat.hasPrevious()) {
				System.out.println("The previous element is: "+literat.previous());
			}
		}

	}


