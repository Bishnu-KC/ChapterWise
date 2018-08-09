package com.h.inputoutput.practise;
import java.io.*;
public class WritableReadOnly {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File myfile = new File("newfile.txt");	
    	if (myfile.canWrite())
    	{
    	   System.out.println("File is writable.");
    	}
    	else
    	{
    	   System.out.println("File is read only.");
    	}

	}

}
