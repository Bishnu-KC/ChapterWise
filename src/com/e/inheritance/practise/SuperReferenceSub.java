package com.e.inheritance.practise;

//this program uses inheritance to extend Box
class Box1 {
	double length;
	double breadth;
	double height;
	
	// construct clone of an object
	Box1(Box1 ob)
	{
		length=ob.length;
		breadth=ob.breadth;
		height=ob.height;
		
	}
	
	// constructor used when all dimensions specified
	Box1(double l, double b, double h)
	{
		length=l;
		breadth=b;
		height=h;
	}
	
	// constructor when no dimension specified
	Box1()
	{
		// use -1 to indicate an uninitialized box
		length=-1;
		breadth=-1;
		height=-1;
		
	}
	
	// constructor used when cube is created
	Box1(double width)
	{
		length=breadth=height=width;
	}
	
	//compute and return volume
	double volume()
	{
		return (length*breadth*height);
	}
}

//create subclass BoxWeight extending Box
class BoxWeight1 extends Box1{
	double weight;
	//constructor for subclass
	BoxWeight1(double a, double b, double c, double m)
	{
		length=a;
		breadth=b;
		height=c;
		weight=m;
	}
}
public class SuperReferenceSub {
	public static void main (String args[]) {
		BoxWeight1 obj=new BoxWeight1(1,2,3,4);
		Box1 refBox=new Box1();
		double vol;
		vol = obj.volume();
		System.out.println("Volume is: "+vol);
		System.out.println("Weight is: "+obj.weight);
		System.out.println();
		// assign BoxWeight reference to Box reference
		refBox=obj;
		vol=refBox.volume();
		System.out.println("Volume is: "+  vol);
		
		// invalid refBox does not define a weight member
		//System.out.println("Weight is: "refBox.weight);
		
	}

}
