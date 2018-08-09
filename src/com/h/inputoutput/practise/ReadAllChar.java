package com.h.inputoutput.practise;
import java.io.*;

public class ReadAllChar {

	public static void main(String[] args) throws IOException
	{
		try
		{
			FileInputStream fis=new FileInputStream("testout1.txt");
			int i=0;
			while((i=fis.read())!=-1)
			{
				System.out.print((char)i);
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
