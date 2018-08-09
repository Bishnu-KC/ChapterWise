package com.c.conditional.practise;

import java.util.Scanner;

public class BIfElseStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number =13;
		if(number%2==0)
		{
			System.out.println("Even number: "+number);
		}
		else
		{
			System.out.println("Odd number: "+number);
		}
		
		Scanner s=new Scanner(System.in);
		int a;
		System.out.println("Give value for a: ");
		a=s.nextInt();
		if(a%2==0)
		{
			System.out.println("Even number: "+a);
		}
		else
		{
			System.out.println("Odd number: "+a);
		}

	}

}
