package com.h.inputoutput.practise;
import java.io.*;

public class CreateFileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			File f=new File("newfile.txt");
			boolean b=f.createNewFile();
			if(b)
			{
				System.out.println("File has been created successfully.");
			}
			else
			{
				System.out.println("File already present at the specific location.");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
