package com.inheritance.practise;

// using super to overcome name hiding
class Abc{
	int i;
}
//create a subclass by extending class Abc
class Bcd extends Abc {
	int i; // this i hides the i in A
	Bcd(int a , int b)
	{
		super.i=a; // i in Abc
		i=b; // i in Bcd
	}
	void show()
	{
		System.out.println("i in Super Class: "+super.i);
		System.out.println("i in subclass: "+i);
	}
}

public class SuperKeyMember {

	public static void main(String[] args) {
		Bcd obj=new Bcd(2,3);
		obj.show();
		

	}

}
