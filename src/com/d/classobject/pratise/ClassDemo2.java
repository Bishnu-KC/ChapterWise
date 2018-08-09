package com.d.classobject.pratise;

// Declare two Box1 Objects
class Box1 {
	double length;
	double breadth;
	double height;
}

public class ClassDemo2 {

	public static void main(String[] args) {
		Box1 obj=new Box1();
		Box1 obj1=new Box1();
		double volume;
		// assign values to obj's instance variables
		obj.length=10;
		obj.height=20;
		obj.breadth=15;
		
		// assign values to obj1's instance variables
		obj1.length=5;
		obj1.height=10;
		obj1.breadth=15;
		
		//compute volume of Box
		volume=obj.length*obj.breadth*obj.height;
		System.out.println("Volume of Box: "+volume);
		
		//compute volume of Box 2
		volume=obj1.length*obj1.breadth*obj1.height;
		System.out.println("Volume of Box: "+volume);

	}

}
