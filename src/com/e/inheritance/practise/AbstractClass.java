package com.e.inheritance.practise;

abstract class A7 {
	abstract void callme();
	// abstract method has no body and end with semicolon
	
	void callmetoo()
	{
		System.out.println("This is regular method.");
	}
}
class B7 extends A7 {
	void callme()
	{
		
		System.out.println("Bis implementation of callme.");
	}
}

public class AbstractClass {

	public static void main(String[] args) {
		B7 b=new B7();
		b.callme();
		//b.callmetoo();
		

	}

}
