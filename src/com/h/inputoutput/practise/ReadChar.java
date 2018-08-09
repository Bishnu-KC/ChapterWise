package com.h.inputoutput.practise;
import java.io.*;

public class ReadChar {

	public static void main(String[] args) throws IOException
	{
		try
		{
			FileInputStream fis=new FileInputStream("testout.txt");
			int i=fis.read();
			System.out.println((char)i);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
