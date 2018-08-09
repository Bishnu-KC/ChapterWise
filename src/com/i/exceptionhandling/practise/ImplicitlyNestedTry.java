package com.i.exceptionhandling.practise;
import java.util.*;
class ImplicitlyNestedTry {
	public static void nTry(int a)
	{
		try
		{
			System.out.println("Enter for a:");
			if(a==1)
				a=a/(a-a);
			if(a==2)
			{
				int c[]= {1};
				c[10]=99;
			}
			
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		try
		{
			System.out.println("Enter for a:");
			int a=s.nextInt();
			int b=42/a;
			System.out.println("a: "+a);
			nTry(a);
			
			
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
			System.out.println("DBZ"+e);
		}
		

	}

}
