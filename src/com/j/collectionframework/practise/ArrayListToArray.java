package com.j.collectionframework.practise;
import java.util.*;

public class ArrayListToArray {

	public static void main(String[] args) {
		
		// Create an array list
		ArrayList al=new ArrayList();
		
		// Add elements to the array list
		
		al.add(new Integer(1));
		al.add(new Integer(2));
		al.add(new Integer(3));
		al.add(new Integer(4));
		
		System.out.println("Size of al: "+al.size());
		System.out.println("Contents of al: "+al);
		
		//get array
		
		Object obj[]=al.toArray();
		int sum=0;
		
		// sum of the array
		
		for(int i=0; i<obj.length; i++)
		{
			sum +=((Integer)obj[i]).intValue();
			//System.out.println("Sum is : "+sum);
		}
		System.out.println("Sum is : "+sum);

	}

}
