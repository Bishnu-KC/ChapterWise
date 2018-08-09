package com.d.classobject.pratise;

// Here, Box allows one object to initialize another.
class Boxes {
	double l;
	double b;
	double h;
	
	// construct clone of an object
	Boxes(Boxes ob)
	{
		// pass object to constructor
		l=ob.l;
		b=ob.b;
		h=ob.h;
	}
	// constructor used when all dimension specified
	Boxes(double x, double y, double z)
	{
		l=x;
		b=y;
		h=z;
	}
	
	// constructor used when no dimensions specified
	Boxes()
	{
		l=-1;
		b=-1;
		h=-1;
	}
	//constructor used when cube is created
	Boxes(double len)
	{
		l=b=h=len;
	}
	//compute and return volume
	double volume()
	
	{
		System.out.println("Volume: ");
		return l*b*h;
	}
}
public class ObjectParameterClassTypeConstructor {

	public static void main(String[] args) {
		Boxes obj=new Boxes(1,2,3);
		Boxes obj1=new Boxes();
		Boxes obj2=new Boxes(5);
		Boxes myclone =new Boxes(obj);
		double vol;
		vol=obj.volume();
		System.out.println(vol);
		vol=obj1.volume();
		System.out.println(vol);
		vol=obj2.volume();
		System.out.println(vol);
		vol=myclone.volume();
		System.out.println(vol);
		

	}

}
