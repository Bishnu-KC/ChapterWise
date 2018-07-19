package com.classobject.pratise;
import java.util.*;

class Box6 {
	double l;
	double b;
	double h;
	Box6(Double x, double y, double z)
	{
		// this keyword is used to refer a current object
		// to resolve name space collisions
		this.l=x;
		this.b=y;
		h=z;
	}
	double volume()
	{
		System.out.print("Volume is: ");
		return l*b*h;
	}
}

public class ParameterizedConstructors {

	public static void main(String[] args) {
		Box6 obj=new Box6(2.0,4.0,6.0);
		double vol=obj.volume();
		System.out.println(vol);
		
		
	}

}
