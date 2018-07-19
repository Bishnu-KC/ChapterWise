package com.classobject.pratise;
import java.util.*;

// Here a class uses a constructor to initialize the dimensions of a box.
class Box5 {
	double l;
	double b;
	double h;
	
	// create a constructor
	Box5()
	{
		System.out.println("Constructiong Box: ");
		l=1;
		b=2;
		h=3;
	}
	// compute and return volume
	double volume()
	{
		System.out.print("Volume is: ");
		return l*b*h;
	}
}

public class ConstructorDemo {

	public static void main(String[] args) {
		
		// declare , allocate, and initialize Box objects
		Box5 obj=new Box5();
		double vol;
		vol=obj.volume();
		System.out.println(vol);
		

	}

}
