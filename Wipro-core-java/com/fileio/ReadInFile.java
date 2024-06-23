package com.fileio;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadInFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//specify the path of the file here
		File file = new File("");
		BufferedInputStream bis = null;
		FileInputStream fis = null;
		
		try

		  {   //FileInputStream to read the file

		        fis = new FileInputStream(file);
		 
		        /*Passed the FileInputStream to BufferedInputStream

		         *For Fast read using the buffer array.*/

		        bis = new BufferedInputStream(fis);
		 
		        /*available() method of BufferedInputStream

		         * returns 0 when there are no more bytes

		         * present in the file to be read*/

		        while( bis.available() > 0 ){             	

		            System.out.print((char)bis.read());

		        }

		    //close the file

		   }catch(FileNotFoundException fnfe)

	      {

	          System.out.println("The specified file not found" + fnfe);

	      }

	      catch(IOException ioe)

	      {

	          System.out.println("I/O Exception: " + ioe); 

	      }

	      finally // always executes whether it is happy path or not 

	      {

	          try{

	             if(bis != null && fis!=null)

	             {

	     	          fis.close();

	                  bis.close();

	             }      

	           }catch(IOException ioe)

	            {

	                System.out.println("Error in InputStream close(): " + ioe);

	            }  

	}

}
	}
