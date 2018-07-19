package com.classobject.pratise;

// Demonstrate an inner class
class Outer {
	int x=100;
	void test()
	{
		Inner in=new Inner();
		in.display();
	}
	//create an inner class
	class Inner {
		void display()
		{
			System.out.println("Display x: "+x);
		}
	}
}

public class NestedClass {

	public static void main(String[] args) {
		Outer obj=new Outer();
		obj.test();
		

	}

}
