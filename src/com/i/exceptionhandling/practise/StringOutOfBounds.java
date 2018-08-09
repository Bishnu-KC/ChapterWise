package com.i.exceptionhandling.practise;

public class StringOutOfBounds {

	public static void main(String[] args) {
		try
		{
			String str="Bishnujungkc";
			System.out.println(str.length());
			char c=str.charAt(0);
			c=str.charAt(40);
			System.out.println(c);
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("SOOBE!!!");
		}

	}

}
