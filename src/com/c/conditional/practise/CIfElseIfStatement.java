package com.c.conditional.practise;

import java.util.Scanner;

public class CIfElseIfStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int mark=80;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your marks:");
		int marks=s.nextInt();
		if(marks<50)
		{
			System.out.println("Fail");
		}
		else if(marks>=50 && marks<60)
		{
			System.out.println("D Grade: "+marks);
		}
		else if(marks>=60 &&marks<70)
		{
			System.out.println("C grade: "+marks);
		}
		else if(marks>=70 &&marks<80)
		{
			System.out.println("B grade: "+marks);
		}
		else if(marks>=80 &&marks<90)
		{
			System.out.println("A grade: "+marks);
		}
		else if(marks>=90 && marks<100)
		{
			System.out.println("A+ grade: "+marks);
		}
		else
		{
			System.out.println("Invalid Marks!!");
		}

	}

}
