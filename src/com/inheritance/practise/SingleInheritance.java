package com.inheritance.practise;

// Example of single inheritance
// We can add some more properties to an existing class without modifying it.

// Create super class
class Room {
	int length;
	int breadth;
	// creating constructor
	Room(int x, int y)
	{
		length=x;
		breadth=y;
	}
	// declare return type method
	int area()
	{
		return (length * breadth);
	}
}

// creating a subclass using extends keyword to inherit from super class
class BedRoom extends Room {  // Inheriting Room
	int height;
	//create constructor
	BedRoom(int x, int y, int z)
	{
		// super keywords allows to inherit variables from superclass
		super(x,y);  // pass values to superclass
		height=z;
	}
	int volume()
	{
		return (length * breadth *height);
	}
}

public class SingleInheritance {
	public static void main(String args[])
	{
		Room obj= new Room(3, 4); // super class method
		int area1 = obj.area();
		System.out.println("Area of Room is: " +area1);
		
		BedRoom obj2 =new BedRoom(5,6,7);
		int area2= obj2.area(); // super class method
		System.out.println("Area of Room is: " +area2);
		int volume=obj2.volume(); // baseclass method
		System.out.println("Volume of BedRoom is: "+volume);
	}

}
