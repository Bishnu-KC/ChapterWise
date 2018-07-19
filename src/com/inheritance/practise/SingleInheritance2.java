package com.inheritance.practise;

// Create a superclass
class A {
	 int i,j;
	 void showij()
	 {
		 System.out.println("i and j : " +i + " and " + j);
	 }
	 void add()
		{
			int total;
			total=i+j;
			System.out.println("The sum of two number is: "+total);
		}
}

// Create a subclass by extending class A
class B extends A {
	int k;
	void showk()
	{
		System.out.println("k: " +k);
	}
	void sum()
	{
		int total;
		total=i+j+k;
		System.out.println("The sum of three number is: "+total);
	}
}

public class SingleInheritance2 {
	public static void main (String args[])
	{
		A obj= new A();
		
		// Superclass can used itself too
		obj.i=10;
		obj.j=20;
		System.out.println("The contents of superclass A are:");
		obj.showij();
		obj.add();
		
		B obj1= new B();
		// Subclass has access to all public member of its superclass
		
		obj1.i=2;
		obj1.j=3;
		obj1.k=4;
		System.out.println("The contents of subclass B are:");
		obj1.showij();
		obj1.add();
		obj1.showk();
		obj1.sum();
	}

}
