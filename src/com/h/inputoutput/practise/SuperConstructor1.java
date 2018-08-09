package com.h.inputoutput.practise;

import java.util.Scanner;

/* superclass Add */
class Add
{
    Add(int a, int b )
    {
    	int sum=a+b;
        System.out.println("The sum of two number is: "+sum);
    }
}
 
/* subclass Multiply extending the Add class */
class Multiply extends Add
{
    Multiply(int d, int e)
    {
        // invoke or call parent class constructor
        super(d, e);
        int product= d*e;
 
        System.out.println("The product of two number is : "+product);
    }
}
 
// Main class and method

public class SuperConstructor1 {
	
	 public static void main(String[] args)
	    {
		 	Scanner s= new Scanner(System.in);
		 	System.out.println("Enter first value.");
		 	int x= s.nextInt();
		 	System.out.println("Enter Second value.");
		 	int y= s.nextInt();
	        Multiply m = new Multiply(x,y);
	    }
}
