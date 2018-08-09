package com.e.inheritance.practise;

//this program uses inheritance to extend Box
class Box2 {
	double length;
	double breadth;
	double height;
	
	// construct clone of an object
	Box2(Box2 ob)
	{
		length=ob.length;
		breadth=ob.breadth;
		height=ob.height;
		
	}
	
	// constructor used when all dimensions specified
	Box2(double l, double b, double h)
	{
		length=l;
		breadth=b;
		height=h;
	}
	
	// constructor when no dimension specified
	Box2()
	{
		// use -1 to indicate an uninitialized box
		length=-1;
		breadth=-1;
		height=-1;
		
	}
	
	// constructor used when cube is created
	Box2(double width)
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
class BoxWeight2 extends Box2{
	double weight;
	//constructor for subclass
	//initialize length, breadth,height,and width using super()
	BoxWeight2(double a, double b, double c, double m)
	{
		super(a,b,c);
		weight=m;
	}
}

public class SuperKeywordForConstructor {
	public static void main(String args[])
	{
		BoxWeight2 obj=new BoxWeight2(2,3,4,5);
		BoxWeight2 obj1=new BoxWeight2(6,7,8,9);
		double vol;
		vol=obj.volume();
		System.out.println("Volume of First box: "+vol);
		System.out.println("Weight of First box: "+obj.weight);
		System.out.println();
		vol=obj1.volume();
		System.out.println("Volume of First box: "+vol);
		System.out.println("Weight of First box: "+obj1.weight);
		
	}

}
