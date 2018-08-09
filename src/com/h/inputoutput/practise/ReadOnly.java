package com.h.inputoutput.practise;
import java.io.*;
public class ReadOnly {
	public static void main(String args[])
	{
		File myfile = new File("newfile.txt");
    	//making the file read only
    	boolean flag = myfile.setReadOnly();	
    	if (flag==true)
    	{
    	   System.out.println("File successfully converted to Read only mode!!");
    	}
    	else
    	{
    	   System.out.println("Unsuccessful Operation!!");
    	}
	}

}
