package com.d.classobject.pratise;

/*A program that uses the Box class.
 * Save this file Class.java
 * */
class Box {
	double length;
	double breadth;
	double height;
}

// this class declares an object of type Box
public class ClassDemo {

	public static void main(String[] args) {
		Box obj=new Box();
		double volume;
		// assign values to obj's instance variables
		obj.length=10;
		obj.height=20;
		obj.breadth=15;
		//compute volume of Box
		volume=obj.length*obj.breadth*obj.height;
		System.out.println("Volume of Box: "+volume);
		

	}

}
