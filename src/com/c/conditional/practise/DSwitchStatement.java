package com.c.conditional.practise;

import java.util.Scanner;

public class DSwitchStatement {

	public static void main(String[] args) {
		// Switch Fall -through- it means it executes all statements after first match if break statement is nit used with switch cases.
		
		//int number=20;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter valid number:");
		int number=s.nextInt();
		switch(number)
		{
		case 10: System.out.println("10");
		//break;
		case 20: System.out.println("20");
		//break;
		case 30: System.out.println("30");
		//break;
		default: System.out.println("Invalid Number.");
		}

	}

}
