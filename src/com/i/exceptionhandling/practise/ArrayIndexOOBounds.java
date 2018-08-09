package com.i.exceptionhandling.practise;

public class ArrayIndexOOBounds {

	public static void main(String[] args) {
		try{
	        int a[]=new int[10];
	        //Array has only 10 elements
	        a[11] = 9;
	      }
	      catch(ArrayIndexOutOfBoundsException e){
	         System.out.println ("ArrayIndexOutOfBounds");
	      }

	}

}
