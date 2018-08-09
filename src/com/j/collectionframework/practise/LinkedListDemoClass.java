package com.j.collectionframework.practise;
import java.util.*;

public class LinkedListDemoClass {

	public static void main(String[] args) {
		
				linkedList();
			}
	
			public static void linkedList()
			{
				// Create LinkedList
				
				LinkedList<String> link= new LinkedList<>();
				
				// add elements in linked list
				
				link.add("DC");
				link.add("VA");
				link.add("LA");
				link.add("CA");
				
				System.out.println("Full city list:"+link);
				
				// adding elements in first and last
				link.addFirst("Chicago");
				link.addLast("Houston");
				System.out.println("After adding city: "+link);
				
				Object firstVar=link.get(0);
				Object thirdVar=link.get(3);
				System.out.println(firstVar+" "+thirdVar);
				
				link.set(0,"SFO");
				link.set(3,"Kensas");
				System.out.println("After Set:"+link);
				
				ArrayList<String> arrList=new ArrayList<String>();
				arrList.add("Phoenix");
				arrList.add("San Antonio");
				arrList.add("Dallas");
				
				link.addAll(arrList);
				System.out.println("After adding ArrayList:"+link);
				System.out.println("Index for VA:" +link.indexOf("VA"));
				System.out.println("Index for CA:" +link.indexOf("CA"));
				link.clear();
				System.out.println("Clear all List: "+link);
			}

		}

		

	