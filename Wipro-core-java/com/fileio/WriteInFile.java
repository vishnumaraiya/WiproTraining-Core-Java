package com.fileio;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteInFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileOutputStream fos = null;
		File file;
		String mycontent = "This is my data which needs "
				+" to be written into the file";
		try {
			//specify the file path here 
			file = new File("");
			fos = new FileOutputStream(file);
			
			//this logic will check whether the file 
			//exits or not .if the file is not find at the specified location 
			//it would create a new files
			
			if(!file.exists()) {
				file.createNewFile();
			}
			
			byte[] bytesArray = mycontent.getBytes();
			
			fos.write(bytesArray);
			fos.flush();
			System.out.println("file written Succesfully");
			
		} catch (IOException ioe) {
			// TODO: handle exception
			ioe.printStackTrace();
		}
		finally {
			try {
				if(fos != null) {
					fos.close();
				}
			} catch (IOException ioe) {
				// TODO: handle exception
				System.out.println("error in closinf the stream");
			}
		}

	}

}
