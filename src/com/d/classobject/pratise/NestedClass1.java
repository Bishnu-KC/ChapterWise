package com.d.classobject.pratise;

import com.d.classobject.pratise.Outer.Inner;

// Demonstrate an inner class
class Outer1 {
	int x=100;
	void test()
	{
		Inner1 in=new Inner1();
		in.display();
	}
	//create an inner class
	class Inner1 {
		int y=10; // local to inner class
		void display()
		{
			System.out.println("Display x: "+x);
		}
	}
	void showy()
	{
		//System.out.println(y); // error, y not known here!
	}
}

public class NestedClass1 {

	public static void main(String[] args) {
		Outer obj=new Outer();
		obj.test();
		

	}

}
