package com.k.generics.practise;
import java.util.*;

public class GenericDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> al=new ArrayList<String>();
		al.add("Bishnu");
		al.add("Jung");
		al.add("K C");
		String s=al.get(1);
		System.out.println("Element is: "+al);
		Iterator<String> itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		ArrayList<Integer> al1=new ArrayList<Integer>();
		al1.add(1);
		al1.add(2);
		al1.add(3);
		//String s=al.get(1);
		System.out.println("Element is: "+al1);
		Iterator<Integer> itr1=al1.iterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}


	}

}
