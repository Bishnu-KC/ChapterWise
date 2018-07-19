package com.classobject.pratise;
// Objects are passed by reference
class Test1 {
	int a, b;
	Test1(int i, int j)
	{
		a=i;
		b=j;
	}
	//pass an object
	void meth(Test1 obj)
	{
		obj.a*=2;
		obj.b/=2;
	}
}

public class ArgumentByReference {

	public static void main(String[] args) {
		Test1 obj1=new Test1(15,20);
		System.out.println("Before Call: "+obj1.a+" "+obj1.b);
		obj1.meth(obj1);
		System.out.println("After Call: "+obj1.a+" "+obj1.b);
	}

}
