package com.i.exceptionhandling.practise;
import java.lang.*;
 class MyException1 extends Exception {
	MyException1(String message)
	{
		super(message);
	}
	
}
class MyException{
	public static void main(String[] args) {
		int x=5, y=10000;
		try
		{
			float z=(float) x /(float)y;
			if(z<0.01)
			{
				throw new MyException1("Number is too small.");
			}
		}
		catch(MyException1 e)
		{
			System.out.println("Caught my exception.");
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("I am always here.");
		}

	}

}
