package com.j.collectionframework.practise;
import java.util.*;

public class HashMapDemo {

	public static void main(String[] args) {
		// create a hash map
		HashMap hm=new HashMap();
		
		//put elements to the map
		hm.put("Bishnu K C", new Double(3.234));
		hm.put("Ruku", new Double(32.234));
		hm.put("Rupa", new Double(13.234));
		hm.put("Rubina", new Double(23.234));
		hm.put("Abc", new Double(223.234));
		
		// Get a set of the entries
		Set s=hm.entrySet();
		System.out.println(s);
		
		//Get an iterator
		Iterator obj=s.iterator();
		
		//display elements
		while(obj.hasNext())
		{
			Map.Entry m=(Map.Entry)obj.next();
			System.out.print(m.getKey()+ ":");
			System.out.println(m.getValue());
		}
		System.out.println();
		
		// deposit 1000 into Bishnu account
		double bal=((Double)hm.get("Bishnu K C")).doubleValue();
		hm.put("Bishnu K C", new Double(bal+1000));
		System.out.println("New Balance: "+hm.get("Bishnu K C"));
		

	}

}
