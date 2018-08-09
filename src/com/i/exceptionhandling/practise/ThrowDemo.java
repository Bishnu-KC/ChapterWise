package com.i.exceptionhandling.practise;

public class ThrowDemo {
	static void demoThrow()
	{
		try
		{
			throw new NullPointerException("Demo");
			
		}
		catch(NullPointerException e)
		{
			e.printStackTrace();
			System.out.println("Caught inside demoThrow.");
			throw e; // rethrow the exception
		}
	}

	public static void main(String[] args) {
		try
		{
			demoThrow();
		}
		catch(NullPointerException e)
		{
			System.out.println("Recaught: "+e);
		}
		

	}

}
