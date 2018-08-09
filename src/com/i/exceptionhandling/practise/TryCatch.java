package com.i.exceptionhandling.practise;

public class TryCatch {

	public static void main(String[] args) {
		int d,a;
		try
		{
			d=0;
			a=100/d;
			System.out.println("This will not be printed.");
		}
			
		catch(ArithmeticException e)
		{
			System.out.println("Divide by Zero.");
		}
		System.out.println("After catch statement.");

	}

}
