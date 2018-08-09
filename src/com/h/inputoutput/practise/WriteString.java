package com.h.inputoutput.practise;
import java.io.*;

public class WriteString {

	public static void main(String[] args) throws IOException
	{
		try
		{
			FileOutputStream fos=new FileOutputStream("testout1.txt");
			String s="Welcome to java learning class.";
			byte b[]=s.getBytes();// converting string into byte array
			fos.write(b);
			fos.close();
			System.out.println("Successssssssss");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
