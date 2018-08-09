package com.e.inheritance.practise;

// final used in method disallow overridden
class Ax {
	/*final*/ void meth()
	{
		System.out.println("This is final method.");
	}
}
class Bx extends Ax {
	void meth()
	{
		System.out.println("This is illegal attempt.");
	}
}

public class FinalKeyMethod {

	public static void main(String[] args) {
		Ax a=new Ax();
		Bx b=new Bx();
		//Ax ref;
		//ref=b;
		b.meth();
		
		//System.out.println(b.meth());
		

	}

}
