package com.inheritance.practise;

// this program uses inheritance to extend Box
class Box {
	double length;
	double breadth;
	double height;
	
	// construct clone of an object
	Box(Box ob)
	{
		length=ob.length;
		breadth=ob.breadth;
		height=ob.height;
		
	}
	
	// constructor used when all dimensions specified
	Box(double l, double b, double h)
	{
		length=l;
		breadth=b;
		height=h;
	}
	
	// constructor when no dimension specified
	Box()
	{
		// use -1 to indicate an uninitialized box
		length=-1;
		breadth=-1;
		height=-1;
		
	}
	
	// constructor used when cube is created
	Box(double width)
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
class BoxWeight extends Box{
	double weight;
	//constructor for subclass
	BoxWeight(double a, double b, double c, double m)
	{
		length=a;
		breadth=b;
		height=c;
		weight=m;
	}
}
public class UsingCOnstructorObject {

	public static void main(String[] args) {
		BoxWeight obj=new BoxWeight(2,3,4,5);
		BoxWeight obj1=new BoxWeight(6,7,8,9);
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

