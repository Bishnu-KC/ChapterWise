package com.classobject.pratise;
import java.util.*;

// class with instance variables and method
class Box2 {
	double l;
	double b;
	double h;
	
	// display volume of a box
	void volume()
	{
		double vol;
		vol=l*b*h;
		System.out.println("Volume of Box is: "+vol);
		
	}
}

public class ClassWithMethod {

	public static void main(String[] args) {
		Box2 obj=new Box2();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the dimension of Box:");
		System.out.println("Enter Length: ");
		obj.l=s.nextDouble();
		System.out.println("Enter Breadth: ");
		obj.b=s.nextDouble();
		System.out.println("Enter Height: ");
		obj.h=s.nextDouble();
		
		/*
		// assign values to obj's instance variables
		obj.l=10;
		obj.b=20;
		obj.h=30;
		*/
		// display the volume of Box
		obj.volume();
		

	}

}
