package com.classobject.pratise;

//Demonstrate method overloading
class Demo {
	void test()
	{
		System.out.println("No Parameters.");
	}
	// overload test for one integer parameter.
	void test(int a)
	{
		System.out.println("a: "+a);
	}
	// overload test for two integer parameters
	void test(int a, int b)
	{
		System.out.println("a and b is : "+a+" "+b);
	}
	//overload test for a double parameter
	double test(double a)
	{
		System.out.println("Different return type: ");
		return a*a;
	}
}

public class MethodOverloding {

	public static void main(String[] args) {
		Demo obj=new Demo();
		double result;
		// call all the versions of test()
		obj.test();
		obj.test(10);
		obj.test(10,20);
		result=obj.test(30.0);
		System.out.println("Result: "+result);
		

	}

}
