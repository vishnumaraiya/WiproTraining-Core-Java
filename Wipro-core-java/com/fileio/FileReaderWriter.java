package com.fileio;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriter {

	public static void main(String[] args) throws IOException {
		try {
			
			FileWriter fw = new FileWriter("/Users/luckysiphone/Documents/testout.txt");
			fw.write("Welcome");
			fw.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);}
			System.out.println("successs...");
			
			FileReader fr = new FileReader("/Users/luckysiphone/Documents/testout.txt");
			int i;
			while((i=fr.read()) != -1) {
				System.out.println((char)i);
	
			}
			fr.close();
		}
	

}
