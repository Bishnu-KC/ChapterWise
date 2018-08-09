package com.d.classobject.pratise;

// simple types are passed by value
class Testt {
	void meth(int i, int j)
	{
		i*=2;
		j/=2;
	}
}

public class ArgumentPassByValue {

	public static void main(String[] args) {
		Testt obj=new Testt();
		int a=15;
		int b=20;
		System.out.println("Before Call: "+a+" "+b);
		obj.meth(a, b);
		System.out.println("After Call: "+a+" "+b);

	}

}
