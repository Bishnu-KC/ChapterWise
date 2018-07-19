package com.exceptionhandling.practise;
import java.util.*;

public class NestedTry {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		try
		{
			System.out.println("Enter for a: ");
			int a=s.nextInt();
			/*If no command line args are present , 
			 * a divide by zero exception is encounter
			 * */
			int b=41/a;
			System.out.println("a: "+a);
			
			// nested try block
			try
			{
				if(a==1)
					a=a/(a-a);
				// if two command line args are used
				if(a==2)
				{
					int c[]= {1};
					c[42]=99; // generates out of bounds exception
				}
				
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				e.printStackTrace();
				System.out.println("AIOOBE: "+e);
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("DBZ: "+e);
		}
		System.out.println("Outside of Try Catch Block.");

	}

}
