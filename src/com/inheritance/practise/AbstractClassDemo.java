package com.inheritance.practise;

abstract class Figure1 {
	double x, y;
	Figure1(double a, double b)
	{
		x=a;
		y=b;
	}
	
	// abstract method
	abstract double area();
}

class Rectangle1 extends Figure1 {
	Rectangle1 (double a, double b)
	{
		super(a,b);
	}
	// override area for rectangle
	double area()
	{
		System.out.println("Inside Rectangle: ");
		return x*y;
	}
}

class Triangle1 extends Figure1 {
	Triangle1(double a, double b)
	{
		super(a,b);
	}
	double area()
	{
		System.out.println("Inside Triangle");
		return (x*y)/2;
	}
}

public class AbstractClassDemo {

	public static void main(String[] args) {
		//Figure1 f= new Figure1(10,10); // this is illegal here
		Rectangle1 r=new Rectangle1(9,5);
		Triangle1 t=new Triangle1(10,8);
		Figure1 ref; // this is ok, no object is created
		ref=r;
		System.out.println("Area: "+ref.area());
		ref=t;
		System.out.println("Area: "+ref.area());
		
	}

}
