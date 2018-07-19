package com.collectionframework.practise;

import java.util.*;

public class IteratorDemo {

	public static void main(String[] args) {
		// create a array list
		ArrayList al=new ArrayList();
		System.out.println("Size: "+al.size());
		System.out.println("Contains: "+al);
		
		// add element to the array list
		al.add("C");
		al.add("A");
		al.add("E");
		al.add("B");
		al.add("D");
		al.add("F");
		System.out.println("Size: "+al.size());
		System.out.println("Contains: "+al);
		
		// use iterator to display contents of al
		System.out.println("Original contents of al: "+al);
		
		Iterator itr=al.iterator();
		while(itr.hasNext()) // loop iterate as long as it returns true
		{
			Object element=itr.next();//obtain each element
			System.out.print(element +" ");
		}
		System.out.println();
		
		//modify objects being iterated
		ListIterator obj=al.listIterator();
		while(obj.hasNext())
		{
			Object element=obj.next();
					obj.set(element +"+");
		}
		System.out.println("Modification contents of al: ");
		itr=al.iterator();
		while(itr.hasNext())
		{
			Object element=itr.next();
			System.out.print(element +" ");
		}
		System.out.println();
		
		//display the list backwards
		System.out.println("Modification list backwards: ");
		while(obj.hasPrevious())
		{
			Object element=obj.previous();
			System.out.print(element +" ");
		}
		System.out.println();

	}

}
