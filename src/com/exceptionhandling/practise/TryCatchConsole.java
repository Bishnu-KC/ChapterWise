package com.exceptionhandling.practise;
import java.util.Random;

public class TryCatchConsole {

	public static void main(String[] args) {
		int a=0,b=0,c=0;
		Random r=new Random();
		for (int i=0;i<3200;i++)
		{
			try
			{
				b=r.nextInt();
				c=r.nextInt();
				a=12345/(b/c);
				
			}
			catch(ArithmeticException e)
			{
				e.printStackTrace();
				System.out.println("Division by zero");
				a=0; // set a to zero and continue
			}
			System.out.println("a: "+a);
		}
		
		

	}

}
