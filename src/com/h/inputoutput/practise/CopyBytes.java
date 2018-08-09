package com.h.inputoutput.practise;
import java.io.*;

public class CopyBytes {

	public static void main(String[] args) throws IOException
	{
		//declare input and output file streams
		FileInputStream fis=null;
		FileOutputStream fos=null;
		
		//declare a variable to hold a byte
		byte b;
		try
		{
			//connect fis in in.txt
			fis=new FileInputStream("in.txt");
			
			//connect fos to out.txt
			fos=new FileOutputStream("out.txt");
			
			//reading bytes from in.txt and writing to out.txt
			
			do
			{
				b=(byte)fis.read();
				fos.write(b);
			}
			while(b!=-1);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fis.close();
				fos.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}

}
