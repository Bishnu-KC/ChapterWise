package com.exceptionhandling.practise;

public class ThrowDemo1 {
	static void check(int age, int weight)
	{
		if(age<12 && weight<40)
		{
			throw new ArithmeticException("Student is not eligible for registration");
		}
		else
		{
			System.out.println("Student entry is Valid.");
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome to the registration process!!");
		check(10,39);
		System.out.println("Have a nice day.");
		

	}

}
