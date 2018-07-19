package com.exceptionhandling.practise;
import java.util.*;

public class FinallyExample {
	
	public static void main(String args[])
		{
			/*
			 * try
			 * {
			 * 	//statements;
			 * }
			 * catch()
			 * {
			 * 	//Handling Exception
			 * }
			 * finally
			 * {
			 * 	//statements;
			 * }
			 */
		Scanner s=new Scanner(System.in);
			try
			{
				System.out.println("Enter for a: ");
				int a=s.nextInt();
				int b=10/a;
				System.out.println("The value is: "+b);
				
			}
			catch(ArithmeticException e)
			{
				System.out.println("Divide by zero.");
			}
			finally
			{
				System.out.println("Finally block executes either there is exception or not in try/catch block.");
			}
			tryFinally();
		}
		public static int tryFinally()
		{
			try
			{
				return 234;
			}
			finally
			{
				System.out.println("Method Return some numbers");
			}
		}
		
			
		}