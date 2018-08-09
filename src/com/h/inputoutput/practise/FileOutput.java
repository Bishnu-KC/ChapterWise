package com.h.inputoutput.practise;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutput {
	public static void main(String args[]) throws IOException
	{
		// byte values are represented by integers from 0 to 255
		int somedata[]= {56,230,123,43,11,37};
		FileOutputStream myFile=null;
		try
		{
			myFile =new FileOutputStream("/Users/bishnu/eclipse-workspace/JavaIO/src/com/java/io/xyz.txt");
			//System.out.println(System.getProperty("user.dir"));
		    //File file = new File("file.txt");
			for(int i=0;i<somedata.length;i++)
			{
				myFile.write(somedata[i]);
				
			}
		}
		catch(IOException e)
		{
			System.out.println("Could not write to a file: s"+e.toString());
		}
		finally
		{
			if(myFile!=null)
			{
				try
				{
					myFile.close();
				}
				catch(Exception e1)
				{
					e1.printStackTrace();
				}
			}
		}
		
	}

}
