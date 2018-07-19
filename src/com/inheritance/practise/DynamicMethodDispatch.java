package com.inheritance.practise;

class A6{
	void callme()
	{
		System.out.println("Inside A");
	}
}
class B6 extends A6 {
	// override callme()
	void callme()
	{
		System.out.println("Inside B");
	}
}
class C6 extends A6
{
	// overrides callme()
	void callme()
	{
		System.out.print("Inside C");
	}
}

public class DynamicMethodDispatch {

	public static void main(String[] args) {
		A6 a=new A6(); // object of type A
		B6 b=new B6(); // object of type B
		C6 c=new C6(); // object of type C
		A6 r; // obtain a reference of type A
		r=a;// r refers to an A object
		r.callme(); // calls A's version of callme
		//c.callme();
		r=b; // r refers to a B object
		r.callme(); // calls B's version of callme
		r=c; // r refers to a C object
		r.callme();// calls C's version of callme

	}

}
