package com.j.collectionframework.practise;
import java.util.*;

// Demonstrate TreeSet

public class TreeSetDemo2 {

	public static void main(String[] args) {
		
		//Create a tree set
		TreeSet ts=new TreeSet();
		System.out.println("Size of TreeSet is: "+ts.size());
		
		// Add elements to the tree set
		ts.add("China");
		ts.add("Austria");
		ts.add("Belarus");
		ts.add("England");
		ts.add("France");
		ts.add("Denmark");
		
		System.out.println("Contents after additions: "+ts);
		System.out.println("Size of TreeSet is: "+ts.size());
		
		//ts.addFirst("D");
	
		
		

	}

}
