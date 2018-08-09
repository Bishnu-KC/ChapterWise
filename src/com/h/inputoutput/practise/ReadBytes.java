package com.h.inputoutput.practise;
import java.io.*;

public class ReadBytes {

	public static void main(String[] args) throws IOException
	{
		// Create an input file stream
		FileInputStream inFile=null;
		int b;
		try
		{
			//connect inFile stream to the required file
			inFile=new FileInputStream("city.txt");
			// read and display data
			while((b=inFile.read())!=-1)
			{
				System.out.println((char)b);
			}
			inFile.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
