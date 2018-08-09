package com.d.classobject.pratise;
import java.util.*;
class Box4 {
	double l;
	double b;
	double h;
	
	// compute and return volume
	double volume()
	{
		System.out.print("Volume is: ");
		return l*b*h;
	}
	
	// sets dimensions of box
	void setDim(double x, double y, double z)
	{
		l=x;
		b=y;
		h=z;
	}
}


public class ParameterizedMethod {

	public static void main(String[] args) {
		Box4 obj=new Box4();
		Scanner s=new Scanner(System.in);
		double vol;
		//obj.setDim(5, 10, 15);
		System.out.println("Enter Dimension: ");
		obj.setDim(
				s.nextDouble(), s.nextDouble(), s.nextDouble());
		vol=obj.volume();
		System.out.println(vol);

	}

}
