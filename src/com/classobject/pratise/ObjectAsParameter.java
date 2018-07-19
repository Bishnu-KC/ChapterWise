package com.classobject.pratise;

//objects may be passed to methods
class Test {
	int a, b;
	Test(int i, int j)
	{
		a=i;
		b=j;
	}
	// return true if obj is equal to the invoking object
	boolean equals(Test obj)
	{
		if(obj.a==a && obj.b==b) return true;
		else return false;
	}
}

public class ObjectAsParameter {

	public static void main(String[] args) {
		Test o=new Test(10,20);
		Test p=new Test(10,20);
		Test q=new Test(5,5);
		System.out.println("o==p: "+ o.equals(p));
		System.out.println("o==q: "+ o.equals(q));
		
	}

}
