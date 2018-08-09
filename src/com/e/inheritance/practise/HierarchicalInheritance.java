package com.e.inheritance.practise;

class Shape {
	int length;
	int breadth;
	Shape(int x, int y)
	{
		length =x;
		breadth=y;
	}
	void showDim()
	{
		System.out.println("Length: "+length+"\n"+"Breadth: "+breadth);
	}
}
class Area extends Shape {
	Area(int x, int y)
	{
		super(x,y);
	}
	void displayArea()
	{
		int a=length*breadth;
		System.out.println("Area of shape is: "+a);
	}
}
class Volume extends Shape {
	int height;
	Volume(int x, int y, int z)
	{
		super(x,y);
		height=z;
	}
	void displayVolume()
	{
		int vol=length*breadth*height;
		System.out.println("The volume of Shape is: "+vol);
	}
}
class Perimeter extends Shape {
	Perimeter(int x, int y)
	{
		super(x,y);
	}
	int displayPeri()
	{
		return 2*(length+breadth);
	}
}

public class HierarchicalInheritance {

	public static void main(String[] args) {
		Shape s= new Shape(5,10);
		System.out.println("Dimension of Shape:");
		s.showDim();
		Area a1=new Area(3,4);
		System.out.println("Content of class Area:");
		a1.showDim();
		a1.displayArea();
		Volume v= new Volume(10,20,30);
		System.out.println("Content of class Volume:");
		v.showDim();
		v.displayVolume();
		Perimeter p=new Perimeter(8,8);
		int hold=p.displayPeri();
		System.out.println("Content of class Perimeter: ");
		p.showDim();
		System.out.println("Perimeter of Shape is: "+hold);
		

	}

}
