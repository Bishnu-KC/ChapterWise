package com.inheritance.practise;

class Figure {
	double a, b;
	Figure(double x, double y)
	{
		a=x;
		b=y;
	}
	double area()
	{
		System.out.println("Superclass");
		return 0;
		
	}
}
class Rectangle extends Figure {
	Rectangle(double a, double b)
	{
		super(a,b);
	}
	double area()
	{
		System.out.println("Inside area of Rectangle");
		return a*b;
	}
}
class Triangle extends Figure {
	Triangle(double a, double b)
	{
		super (a,b);
	}
	double area()
	{
		System.out.println("Inside  Triangle");
		return 0.5*(a*b);
	}
}

public class MethodOverridingDemo {

	public static void main(String[] args) {
		Figure f=new Rectangle(10,10);
		
		Rectangle r=new Rectangle(5,5);
		Triangle t=new Triangle(6,6);
		Figure ref;
		ref=r;
		//f.area();
		//double hold;
		System.out.println("Area: "+r.area());
		ref=t;
		System.out.println("Area: "+t.area());
		ref=f;
		System.out.println("Area: "+f.area());
		ref=t;
		
		System.out.println("Area: "+f.area());
		

	}

}
