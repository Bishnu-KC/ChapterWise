package com.e.inheritance.practise;
/*Constructors are called in order of derivation, from superclass to subclass.
 * super() must be the first statement executed in a subclass' constructor, 
 * this order is the same whether or not super() is used
 * if super () is not used , then the default, or parameterless constructor
 * of each superclass will be executed.
 * */

// Demonstrate when constructors are called
// Create a super class
class Aa {
	Aa()
	{
		System.out.println("Inside A's Constructor.");
	}
}
// Create a subclass by extending class A
class Bb extends Aa{
	Bb()
	{
		System.out.println("Instide B's Constructors.");
	}
}
// Create another subclass by extending B
class Cx extends Bb{
	Cx()
	{
		System.out.println("Inside C's Constructor.");
	}
}

public class ConstructorsCalled {

	public static void main(String[] args) {
		Cx c=new Cx();
		

	}

}
