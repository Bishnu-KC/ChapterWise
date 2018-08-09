package com.h.inputoutput.practise;
import java.io.*;

public class WriteBytes1 {

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		try
		{
			FileOutputStream fout=new FileOutputStream("testout.txt");
			fout.write(65);
			fout.close();
			System.out.print("Success..");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
