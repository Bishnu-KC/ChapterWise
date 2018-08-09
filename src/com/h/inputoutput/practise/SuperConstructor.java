package com.h.inputoutput.practise;



// Using super keyword for constructor
class A
{
	A ()
	{
		System.out.println("Inside A.");
	}
}

// creating subclass B by extending Class A
class B extends A
{
	B()
	{
		System.out.println("Inside B.");
	}
}
public class SuperConstructor {
	public static void main(String args[])
	{
		B b=new B();
	}

}
// Even we can inherit the members of super class constructors without using super keyword.