package com.inheritance.practise;

abstract class A7 {
	abstract void callme();
	// abstract method has no body and end with semicolon
	
	void callmetoo()
	{
		System.out.println("This is regular method.");
	}
}
class B7 extends A6 {
	void callme()
	{
		
		System.out.println("Bis implementation of callme.");
	}
}

public class AbstractClass {

	public static void main(String[] args) {
		B6 b=new B6();
		b.callme();
		//b.callmetoo();
		

	}

}
