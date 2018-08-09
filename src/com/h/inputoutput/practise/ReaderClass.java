package com.h.inputoutput.practise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;

public class ReaderClass {
	public static void main(String args[]) throws ParseException
	{
		try
		{
			InputStreamReader in=new InputStreamReader(System.in);
			BufferedReader scanf=new BufferedReader(in);
			String text=scanf.readLine();
			int x=Integer.parseInt(text);
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		catch(NumberFormatException e)
		{
			e.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
