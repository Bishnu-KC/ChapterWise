package com.j.collectionframework.practise;

import java.util.*;

// reverse comparator
class MyComp implements Comparator
{
	public int compare(Object a, Object b)
	{
		String aStr, bStr;
		aStr=(String)a;
		bStr=(String)b;
		return bStr.compareTo(aStr); //reverse comparator
	}
}

public class ComparatorDemo {

	public static void main(String[] args) {
		
		TreeSet ts=new TreeSet(new MyComp());
		ts.add("C");
		ts.add("A");
		ts.add("B");
		ts.add("E");
		ts.add("F");
		ts.add("D");
		
		// Get an iterator
		Iterator i=ts.iterator();
		
		// Display elements
		while(i.hasNext())
		{
			Object e=i.next();
			System.out.print(e+ " ");
		}
		System.out.println();
		
	}

}
