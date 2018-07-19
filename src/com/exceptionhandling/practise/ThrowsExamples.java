package com.exceptionhandling.practise;
import java.io.IOError;
import java.io.IOException;

public class ThrowsExamples {

	public static void main(String[] args) {
		
		/*
		public class ThrowsDemo {
			public static void main(String args[]) throws NullPointerException, ArithmeticException, NumberFormatException
			{
				myTest();
			}
			void myTest()
			{
				try
				{
					
				}
				catch(ArithmeticException e)
				{
					
				}
				catch(NumberFormatException num)
				{
					
				}
				catch(NullPointerException e1)
				{
					
				}
				
			}

		}
		*/
		
				try
				{
					Example ex=new Example();
					ex.myMethod(3);
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			}
			
		}
		class Example
		{
			void myMethod(int num) throws IOException, ClassNotFoundException
			{
				if(num==1)
					throw new IOException("IOExceptions");
				else
					throw new ClassNotFoundException("Class Not Found Exception");
			}
}
