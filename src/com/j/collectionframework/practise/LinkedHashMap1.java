package com.j.collectionframework.practise;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<String, String> hm=new LinkedHashMap<String, String>();
		hm.put("Nepal", "Kathmandu");
		hm.put("USA", "Washington DC");
		hm.put("Japan", "Tokyo");
		hm.put("England", "London");
		System.out.println("Country with their Capital");
		for(String s:hm.keySet())
		{
			System.out.println("Country: "+s+ " and Capital: "+hm.get(s));
		}
		System.out.println(".......................");


	}

}
