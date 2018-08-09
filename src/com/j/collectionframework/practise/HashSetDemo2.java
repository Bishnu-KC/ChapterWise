package com.j.collectionframework.practise;
import java.util.*;
public class HashSetDemo2 {

	public static void main(String[] args) {
	
		// Create a hash set
		HashSet hs= new HashSet();
		
		System.out.println("Size of HashSet is: "+hs.size());
		
		// add elements to the hash set
		hs.add("Java");
		hs.add("Python");
		hs.add("AWS");
		hs.add("AnjularJS");
		hs.add("C#");
		hs.add("Database");
		
		System.out.println("Contents after additions: "+ hs);
		System.out.println("Size of HashSet is: "+hs.size());
		// hs.addLast("CyberSecurity");
		 

	}

}
