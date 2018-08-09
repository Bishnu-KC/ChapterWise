package com.d.classobject.pratise;
// A simple example of recursion.
 class Factorial {
	 // this is recursive function
	 int fact(int n)
	 {
		 int result;
		 if (n==1) return 1;
		 result=fact(n-1)*n;
		 return result;
	 }
 }

public class Recursion {

	public static void main(String[] args) {
		Factorial f=new Factorial();
		System.out.println("Factorial of 1 : "+ f.fact(1));
		System.out.println("Factorial of 2 : "+ f.fact(2));
		System.out.println("Factorial of 3 : "+ f.fact(3));
		System.out.println("Factorial of 4 : "+ f.fact(4));
		System.out.println("Factorial of 5 : "+ f.fact(5));
		

	}

}
