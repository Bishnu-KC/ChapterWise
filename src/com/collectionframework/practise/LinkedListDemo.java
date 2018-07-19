package com.collectionframework.practise;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// create a linkedlist
		LinkedList a=new LinkedList();
		System.out.println("Size of LinkedList: "+a.size());
		System.out.println("Contents: "+a);
		
		// add elements
		a.add("F");
		a.add("B");
		a.add("D");
		a.add("E");
		a.add("C");
		a.add("Z");
		a.add("A");
		a.add(1,"A2");
		System.out.println("Size after additions: "+a.size());
		System.out.println("Contents after additions: "+a);
		
		// remove first and last elements
		a.removeFirst();
		a.removeLast();
		System.out.println("After Deletions: "+a);
		
		// remove elements from the linked list
		a.remove("D");
		a.remove(2);
		System.out.println("Removed: "+a);
		
		//get and set a value
		Object val=a.get(2);
		a.set(2, (String)val +",Changed");
		System.out.println("Changed: "+a);
		

	}

}
