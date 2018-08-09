package com.j.collectionframework.practise;
import java.util.*;

// Demonstrate linkedlist
public class LinkedlistDemo2 {

	public static void main(String[] args) {
		
		// create a linked list
		
		LinkedList ll=new LinkedList();
		
		System.out.println("Size of LinkedList: "+ll.size());
		
		// add elements to linked list
		
		ll.add("France");
		ll.add("Belgium");
		ll.add("Denmark");
		ll.add("Estonia");
		ll.add("Croatia");
		System.out.println("Size after addition: "+ll.size());
		ll.addLast("Zerland");
		ll.addFirst("Austria");
		ll.add(1,"Norway");
		System.out.println("Size after addition: "+ll.size());
		System.out.println("Original contents of LinkedList: "+ ll);
		
		// remove elements from the linked list
		ll.remove("Belgium");
		ll.remove(2);
		System.out.println("Contents after deletions: "+ll);
		System.out.println("Size after deletions: "+ll.size());
		
		// remove first and last elements
		ll.removeFirst();
		ll.removeLast();
		System.out.println("Contents after deletions: "+ll);
		System.out.println("Size after changed: "+ll.size());
		
		// get and set a value
		
		Object val= ll.get(2);
		ll.set(2,(String) val+" changed");
		System.out.println("Contents after changed: "+ll);
		System.out.println("Size after changed: "+ll.size());

	}

}
