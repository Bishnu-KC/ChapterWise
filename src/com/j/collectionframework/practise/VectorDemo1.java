package com.j.collectionframework.practise;
import java.util.*;

public class VectorDemo1 {

	public static void main(String[] args) {
		Vector<String> v=new Vector<String>();
		v.add("Bishnu");
		v.add("Bhagwat");
		v.add("Yaman");
		v.add("Rup");
		//traversing elements using Enumeration
		
		Enumeration e=v.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}

	}

}
