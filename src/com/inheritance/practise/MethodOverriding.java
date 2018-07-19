package com.inheritance.practise;

// Method overriding
class A5 {
	int i,j;
	A5(int a, int b)
	{
		i=a;
		j=b;
	}
	// display i and j
	void show()
	{
		System.out.println("i and j are: "+ i+ " "+j);
	}
}
class B5 extends A5 {
	int k;
	B5(int a, int b, int c)
	{
		super(a,b);
		k=c;
		
	}
	// display k
	// here is method show() is override
	void show()
	{
		super.show();// this calls A5 show()
		System.out.println("k: "+k);
	}
	
}

public class MethodOverriding {

	public static void main(String[] args) {
		B5 obj= new B5(1,2,3);
		obj.show(); // this calls show() in B
		

	}

}
