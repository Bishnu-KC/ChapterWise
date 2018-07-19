package com.classobject.pratise;

class Box7 {
	double l, b, h;
	//constructor used when all dimensions specified
	Box7(double x, double y, double z)
	{
		l=x;
		b=y;
		h=z;
	}
	//constructor used when no dimension specified
	Box7()
	{
		l=-1;
		b=-1;
		h=-1;
	}
	//constructor used when cube is created
	Box7(double len)
	{
		l=b=h=len;
	}
	//compute and return volume
	double volume()
	{
		return l*b*h;
	}
	
}

public class ConstructorOverloading {

	public static void main(String[] args) {
		Box7 obj=new Box7(1,2,3);
		Box7 obj1=new Box7();
		Box7 obj2=new Box7(3);
		double vol;
		// get volume of first box
		vol=obj.volume();
		System.out.println(vol);
		// get volume of first box
		vol=obj1.volume();
		System.out.println(vol);
		// get volume of first box
		vol=obj2.volume();
		System.out.println(vol);
		

	}

}
