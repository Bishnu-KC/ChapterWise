package com.h.inputoutput.practise;

import java.io.File;
import java.io.IOException;

public class FileInfo {

	public static void main(String args[]) throws IOException
	{
		File file=new File("/abc.txt");
		System.out.println("This is the file size:"+ file.length());
		System.out.println("This is the file name:"+ file.getName());
		try
		{
			System.out.println(file.getName()+""+"File Path"+file.getCanonicalPath());
		}
		catch(IOException e)
		{
			System.out.println("You have error.");
		}
				
		
	}

}
