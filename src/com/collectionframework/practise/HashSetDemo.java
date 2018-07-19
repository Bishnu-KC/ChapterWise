package com.collectionframework.practise;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		// create a hash set
		HashSet hs=new HashSet();
		System.out.println("Size: "+hs.size());
		
		//add elements in hash set
		hs.add("A");
		hs.add("S");
		hs.add("D");
		hs.add("F");
		hs.add("Q");
		hs.add("W");
		System.out.println("Size  after additions: "+hs.size());
		System.out.println("Contents :"+hs);
		hs.remove("S");
		System.out.println("Contents :"+hs);
		hs.clear();
		System.out.println("Contents :"+hs);
		System.out.println("Size  after additions: "+hs.size());

	}

}
