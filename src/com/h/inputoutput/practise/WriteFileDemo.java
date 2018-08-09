package com.h.inputoutput.practise;
import java.io.*;

public class WriteFileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileOutputStream fos=null;
		File file;
		String myContent="This is a file handling in Java.";
		try
		{
			// Specify the file path here
			file=new File("afile.txt");
			fos=new FileOutputStream(file);
			
			//This logic will check whether the file exists or not
			if(!file.exists())
			{
				file.createNewFile();
			}
			// String content cannot be directly written into a file.
			//It needs to be converted into bytes
			
			byte[] bytesArray=myContent.getBytes();
			fos.write(bytesArray);
			fos.flush();
			System.out.println("File Written Successfully.");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				if(fos!=null)
				{
					fos.close();
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}

	}

}
