package com.f.packageinterface.practise;

// define interface
interface Area {
	final static float pi=3.14f;
	float compute(float a, float b);
}
//implements interface
class Rectangle implements Area {
	public float compute(float a, float b)
	{
		return (a*b);
	}
}
//implements interface here too
class Circle implements Area {
	public float compute (float a, float b)
	{
		return(pi*a*b);
	}
}

public class InterfaceDemo {

	public static void main(String[] args) {
		Rectangle r=new Rectangle();
		Circle c=new Circle();
		Area a;
		a=r;
		System.out.println("Area of rectangle: "+a.compute(10, 20));
		a=c;
		System.out.println("Area of Circle: "+a.compute(5, 6));
		

	}

}
