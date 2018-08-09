package com.i.exceptionhandling.practise;
import java.util.*;

public class FinallySimple {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	try
	{
		System.out.println("Enter for a: ");
		int a=s.nextInt();
		int b=10/a;
		System.out.println("b: "+b);
	}
	finally
	{
		System.out.println("This is finally block.");
		
	}

	}

}
