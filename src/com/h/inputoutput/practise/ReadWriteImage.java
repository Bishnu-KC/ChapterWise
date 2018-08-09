package com.h.inputoutput.practise;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadWriteImage {
	static byte[] bytes;
	static void readFileArray(String fn)
	{
		File f=new File(fn);
		long length=f.length();
		FileInputStream fis=null;
		try
		{
			fis=new FileInputStream(f);
			int intLength=(int)length;
			bytes=new byte[intLength];
			fis.read(bytes);
		}
		catch(IOException e)
		{
			System.err.println(e);
		}
		finally
		{
			try
			{
				fis.close();
			}
			catch(IOException e)
			{
				e.printStackTrace();
				System.err.println(e);
			}
		}
	}
	static void writeArrayToFile(String fn)
	{
		File f=new File(fn);
		FileOutputStream fos=null;
		try
		{
			fos=new FileOutputStream(f);
			fos.write(bytes);
		}
		catch(IOException e)
		{
			System.err.println(e);
		}
		finally
		{
			try
			{
				fos.close();
			}
			catch(IOException e)
			{
				System.err.println(e);
			}
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName="//Users/bishnu/eclipse-workspace/JavaIO/src/com/java/io/a.jpg";
		readFileArray(fileName);
		String fileName2="//Users/bishnu/eclipse-workspace/JavaIO/src/com/java/io/a2.jpg";
		writeArrayToFile(fileName2);
		
	}


}
