package com.i.exceptionhandling.practise;

public class NumberFormatException1 {

	public static void main(String[] args) {
		try
		{
			int num=Integer.parseInt("XYZ");
			System.out.println(num);
		}
		catch(NumberFormatException e)
		{
			System.out.println("Number format exception occurred.");
		}
	}

}
