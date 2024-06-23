package com.collection;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		

		//creating object of the class linkedlist
		LinkedList<String> l1 = new LinkedList<String>();
		
		//Adding elements to the linked list
		l1.add("A");
		l1.add("B");
		l1.addLast("C");
		l1.addFirst("D");
		l1.add(2, "E");
		
		System.out.println(l1);
		
		l1.remove("B");
		l1.remove(3);
		l1.removeFirst();
		l1.removeLast();
		
		System.out.println(l1);

	}

}
