package com.statickeyword.practise;

// Demonstrate static variables, methods, and blocks
class StaticDemo {
	static int a=3;
	static int b;
	
	//declare static method
	static void meth(int x)
	{
		System.out.println("x: "+x);
		System.out.println("a: "+a);
		System.out.println("b: "+b);
	}
	
	//declare static block
	static
	{
		System.out.println("Static block initialized.");
		b=a*4;
	}
	public static void main(String[] args) {
		meth(42);
		

	}

}
