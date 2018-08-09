package com.i.exceptionhandling.practise;

public class FinallyDemo {
	static void procA()
	{
		try
		{
			System.out.println("Inside A: ");
			throw new RuntimeException("Demo");
		}
		finally
		{
			System.out.println("A finally");
		}
	}
	
	// return from within a try block
	static void procB()
	{
		try
		{
			System.out.println("Inside B");
			return;
		}
		finally
		{
			System.out.println("B finally");
		}
	}
	static void procC()
	{
		try
		{
			System.out.println("Inside C: ");
		}
		finally
		{
			System.out.println("C Finally");
		}
	}

	public static void main(String[] args) {
		try
		{
			procA();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		procB();
		procC();
		
	}

}
