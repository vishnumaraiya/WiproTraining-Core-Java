package com.Wrapper;

public class WrapperDemo {

	public static void main(String[] args) {
		// byte data type
		byte a = 1;
		//wrapping around Byte object
		Byte byteobj = new Byte(a); //boxing
		
		//int data type
		int b = 10;
		
		//wrapping around Integer object
		Integer intobj = new Integer(b);
		
		//float data type
		float c = 18.6f;
		
		//wrapping around float object
		Float floatobj = new Float(c);
		
		//double data type
		double d = 250.5;
		
		//wrapping around Double Object
		Double doubleobj = new Double(d);
		
		//char data type
		char e = 'a';
		
		// wrapping around character object
		Character charobj = e;
		
		//printing the values from objects
		System.out.println("values of wrapper objects (printing as object)");
		System.out.println("byte object byteobj: "+byteobj);
		System.out.println("Integer object intobj: "+intobj);
		System.out.println("Float object floatobj: "+floatobj);
		System.out.println("Double object doubleobj: "+doubleobj);
		System.out.println("Character Object charObj" +charobj);
		
		
		//objects to data types (retrieving data types from objects)
		//unwrapping objects to primitive data types
		
		byte bv = byteobj;
		int iv = intobj;
		float fv = floatobj;
		double dv = doubleobj;
		char cv = charobj;
		

	}

}
