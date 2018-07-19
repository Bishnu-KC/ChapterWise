package com.collectionframework.practise;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// create an array list
		ArrayList al=new ArrayList();
		System.out.println("Initial size of ArrayList: "+al.size());
		
		// add elements to array list
		al.add("A");
		al.add("C");
		al.add("B");
		al.add("D");
		al.add("F");
		al.add(5);
		al.add(1,"A2");
		System.out.println("Size of ArrayList after additions: "+al.size());
		
		//display the content of Arraylist
		System.out.println("Contents of Arraylist: "+al);
		
		// Remove elements from the array list
		al.remove("F");
		al.remove(2);
		System.out.println("Size of ArrayList after deletions: "+al.size());
		System.out.println("Contents of Arraylist: "+al);
	}

}
