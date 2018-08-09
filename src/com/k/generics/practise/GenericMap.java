package com.k.generics.practise;
import java.util.*;
public class GenericMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, String> m=new HashMap<Integer, String>();
		m.put(1, "Bishnu");
		m.put(2, "Jung");
		m.put(3, "K C");
		
		System.out.println("Size of Map is: "+m.size());
		System.out.println("Element of Map is: "+m);
		
		//Now use map.entry for set and iterator
		
		Set<Map.Entry<Integer,String>> set=m.entrySet();
		Iterator <Map.Entry<Integer, String>> itr=set.iterator();
		while(itr.hasNext())
		{
			Map.Entry e=itr.next();
			System.out.println(e.getKey()+" "+e.getValue());
		}

	}

}
