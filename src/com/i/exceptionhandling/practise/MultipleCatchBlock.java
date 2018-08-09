package com.i.exceptionhandling.practise;

public class MultipleCatchBlock {

	public static void main(String[] args) {
		try
		{
			int a=10;//rgs.length;
			System.out.println("a: "+a);
			int b=42/a;
			int c[]= {1};
			c[42]=99;
			
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		System.out.println("After try catch blocks:");

	}

}
