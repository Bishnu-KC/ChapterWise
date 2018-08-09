package com.h.inputoutput.practise;

import java.io.FileInputStream;
import java.io.IOException;

public class FileDemo11 {
	public static void main(String args[]) throws IOException
	{
		FileInputStream myFile=null;
		try
		{
			myFile=new FileInputStream("/Users/bishnu/eclipse-workspace/JavaIO/src/com/java/io/abc.txt");
			boolean eof=false;
			while(!eof)
			{
				int byteValue=myFile.read();
				System.out.println(byteValue+  "");
				//System.getProperty("user.dir");
				if(byteValue==-1)
				{
					eof=true;
				}
			}
			//myFile.close();
		}
		catch(IOException e)
		{
			System.out.println("Could not read file:"+  e.toString());
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
