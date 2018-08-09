package com.h.inputoutput.practise;
import java.io.*;

public class WriteBytes {

	public static void main(String[] args) throws IOException
	{
		// declare and initialize a byte array
		byte cities[]= {'K','T','m','\n','B','N','P','\n','P','k','H','\n'};
		//Create an output file stream
		FileOutputStream outFile=null;
		try
		{
			// connect the outfile to city.txt
			outFile=new FileOutputStream("city.txt");
			
			// write data to the stream
			outFile.write(cities);
			outFile.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
