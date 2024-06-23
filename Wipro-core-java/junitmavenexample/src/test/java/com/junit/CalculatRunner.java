package com.junit;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class CalculatRunner {

	public static void main(String[] args) {
		 Result result = JUnitCore.runClasses(CalculatorTest.class);

	      for (Failure failure : result.getFailures()) {
	         System.out.println(failure.toString());
	      }
			
	      System.out.println(" Overall summary : " +  result.wasSuccessful());

	}

}