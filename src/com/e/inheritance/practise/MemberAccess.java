package com.e.inheritance.practise;

/*
 * In a class hierarchy , private members remain 
 * private to their class.
 * 
 * This program contains an error and will not compile.
 *  */

// Create a super class 
class A1 {
	int i; //public by default
	private int j; // private member of Class A
	int add;
	void setij(int x, int y)
	{
		i=x;
		j=y;
	}
	void sum()
	{
		add=i+j;
	}
}

// Create subclass B
// Class A's member j is not accessible here.
class B1 extends A1 {
	int k;
	int total;
	void setk(int z)
	{
		k=z;
	}
	void sum1()
	{
		//total =i+j+k;
		// A1.j is not visible here
	}
	void sum2()
	{
		total=i+k;
	}
}

public class MemberAccess {
	public static void main (String args[])
	{
		A1 obj=new A1();
		obj.setij(10, 12);
		obj.sum();
		System.out.println("The sum of i and j is: "+ obj.add);
		
		B1 obj1=new B1();
		obj1.setij(5, 6);
		obj1.setk(7);
		obj1.sum();
		System.out.println("The sum of i and j is: "+ obj1.add);
		obj1.sum1();
		System.out.println("The sum of i, j, and k is: "+ obj1.total);
		obj1.sum2();
		System.out.println("The sum of i and k is: "+ obj1.total);
		
	}

}
