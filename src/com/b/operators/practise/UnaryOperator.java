package com.b.operators.practise;

public class UnaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Unary operators require only one operand.
		//Used for incrementing/decrementing a value by one
		//negating an expression
		//inverting the value of a boolean
		
		
		int x=10;
		System.out.println(x++);
		//System.out.println(x);
		System.out.println(++x);
		//System.out.println(x);
		System.out.println(x--);
		//System.out.println(x);
		System.out.println(--x);
		
		int b=10;
		int c=10;
		System.out.println(b++ + ++b);
		System.out.println(c++ + c++);
		

	}

}
