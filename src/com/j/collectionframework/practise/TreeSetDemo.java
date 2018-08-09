package com.j.collectionframework.practise;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		//Create a treeset
		TreeSet ts=new TreeSet();
		System.out.println("Size: "+ts.size());
		ts.add("C");
		ts.add("A");
		ts.add("B");
		ts.add("E");
		ts.add("F");
		ts.add("D");
		System.out.println("Size after additions: "+ts.size());
		System.out.println("Contents: "+ts);

	}

}
