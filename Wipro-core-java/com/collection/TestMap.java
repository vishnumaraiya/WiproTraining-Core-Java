package com.collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TestMap {

	public static void main(String[] args) {
		//HashMap
		HashMap<String, Integer> hm = new HashMap<String,Integer>();
		
		hm.put("a", 1000);
		hm.put("b",2000);
		hm.put("c", 3000);
		hm.put("d", 4000);
		
		hm.put(null, 4100);
		hm.put(null, 4100);
		
		
		hm.put(null, null);
		hm.put(null, null);
		
		Set<Map.Entry<String,Integer>> st = hm.entrySet(); //return set view
		
		for(Map.Entry<String,Integer> me1 : st) {
			System.out.println(me1.getKey()+ " ");
			System.out.println(me1.getValue()+ " ");
			
			System.out.println(hm.keySet());
			
			System.out.println("Display Data using treemap");
			
			 //TreeSet - Sort s the elements-----------------------------------
		    TreeMap<String,Integer> tm = new TreeMap<String,Integer>();
		    tm.put("a",100);
		    tm.put("c",200);
		    tm.put("b",300);
		    tm.put("d",400);
	 
		    Set<Map.Entry<String,Integer>> st1 = tm.entrySet();
		    for(Map.Entry<String,Integer> me:st1)
		    {
		      System.out.print(me.getKey()+":");
		      System.out.println(me.getValue());
		    }
		   
		    //LinkedHaspMap
		    System.out.println(" Display Data using LinkedHashMap - Maintains insertion order with Linked list");
		    LinkedHashMap<String,Integer> lm = new LinkedHashMap<String,Integer>();
		    lm.put("a",100);
		    lm.put("b1",200);
		    lm.put("c",300);
		    lm.put("d",400);
	 
		    Set<Map.Entry<String,Integer>> s = lm.entrySet();
		    for(Map.Entry<String,Integer> me:s)
		    {
		      System.out.print(me.getKey()+":");
		      System.out.println(me.getValue());
		    }
		  }
		}

	}


