package com.collectionframework.practise;

import java.util.ArrayList;

public class ArrayListIntoArray {

	public static void main(String[] args) {
		// create an array list
		ArrayList al=new ArrayList();
		System.out.println("Size of ArrayList on Creation: "+al.size());
		
		// Add some elements to array list
		al.add(new Integer(1));
		al.add(new Integer(2));
		al.add(new Integer(3));
		al.add(new Integer(4));
		System.out.println("Size of array list after additions: "+al.size());
		// display the content of array list
		System.out.println("Contents of array list: "+al);
		
		//get array
		Object a[]=al.toArray();
		System.out.println(a.length);
		int sum=0;
		//sum the array
		for(int i=0;i<a.length;i++)
		{
			sum+=((Integer)a[i]).intValue();
		}
		System.out.println("Sum is : "+sum);
		
		al.clear();
		System.out.println(al);
		

	}

}
