package com.h.inputoutput.practise;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public class IODemo {
	public static void main(String args[]) throws IOException
	{
		String str="Java World.";
		Reader rd=new StringReader(str);
		try
		{
			for(int i=0; i<str.length(); i++)
			{
				char c=(char) rd.read();
				System.out.print(c);
			}
		}
		catch(Exception e)
		{
			System.out.println("An exception has occured.");
		}
	}

}
