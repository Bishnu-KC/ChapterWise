package com.d.classobject.pratise;
import java.util.*;

// method with return type
class Box3 {
	double l;
	double b;
	double h;
	
	// return type method
	double volume()
	{
		System.out.println("Volume is: ");
		return l*b*h;
	}
}

public class ClassReturnMethod {

	public static void main(String[] args) {
		Box3 obj=new Box3();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Length: ");
		obj.l=s.nextDouble();
		System.out.println("Enter Breadth: ");
		obj.b=s.nextDouble();
		System.out.println("Enter Height: ");
		obj.h=s.nextDouble();
		
		System.out.println(obj.volume());
		
		

	}

}
