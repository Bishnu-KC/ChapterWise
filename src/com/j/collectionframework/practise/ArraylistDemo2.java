package com.j.collectionframework.practise;

import java.util.ArrayList;
import java.util.*;

// Demonstrate ArrayList
public class ArraylistDemo2 {

	public static void main(String[] args) {
		
		
		//Create an array list
		ArrayList al=new ArrayList();
		System.out.println("Initial size of array list: "+al.size());
		
		// add elements to the array list
		
		al.add("Nepal");
		al.add("Holland");
		al.add("Switzerland");
		al.add("Norway");
		al.add("Finland");
		al.add("Denmark");
		al.add(1,"Germany");
		
		System.out.println("Size of array list after additions: "+al.size());
		
		// display the array list
		System.out.println("Contents of array list : "+al);
		
		//Remove elements from array list
		al.remove("Holland");
		al.remove(2);
		System.out.println("Size of array list after after deletions: "+al.size());
		System.out.println("Contents of array list : "+al);

	}

}
