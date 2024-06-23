package coreJava8.lambda;

import java.util.ArrayList;
import java.util.List;

public class TestLambda {

	public static void main(String[] args) {
		
		//case:1
		List<String> al = new ArrayList<String>();
		al.add("jAVA");
		al.add("mysql");
		
		al.forEach(x -> System.out.println(x));
		
		
		//case:2 lambda expression without return
		Addable ad1 =(a,b) ->(a+b);
		System.out.println(ad1.add(20, 30));
		
		
        //case:3 lambda expression with return
		Addable add2 = (int a,int b) -> {return (a+b);};
		System.out.println(add2.add(40,50));
	}

}
