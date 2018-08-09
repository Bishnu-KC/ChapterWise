package com.j.collectionframework.practise;
import java.util.*;

public class Hashmap1 {

	public static void main(String[] args) {
		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		hm.put(1, "Bishnu");
		hm.put(2, "Gupta");
		hm.put(3, "Bimala");
		hm.put(4, "Ruku");
		hm.put(5, "Rupa");
		hm.put(6, "Rubina");
		
		//Iterating HashMap using keySet() and for each loop
		System.out.println("Iterating HashMap using keySet() and for each loop.");
		System.out.println("..................");
		for(Integer id:hm.keySet())
		{
			System.out.println("Id: "+id+" and Name: "+hm.get(id));
		}
		System.out.println(".......................");

	}

}
