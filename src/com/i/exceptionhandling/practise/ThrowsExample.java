package com.i.exceptionhandling.practise;
import java.io.*;
class ThrowsExample1{
	void myMethod(int num) throws IOException, ClassNotFoundException
	{
		if(num==1)
			throw new IOException("IOException Occurred.");
		else
			throw new ClassNotFoundException("ClassNotFoundException.");
	}
}
public class ThrowsExample {

	public static void main(String[] args) {
		try
		{
			ThrowsExample1 obj=new ThrowsExample1();
			obj.myMethod(12);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		

	}

}
