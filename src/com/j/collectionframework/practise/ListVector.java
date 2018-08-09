package com.j.collectionframework.practise;
import java.util.*;

public class ListVector {

	public static void main(String[] args) {
		
		//Adding List to another List
		

				// Create first list
				List<String> a1= new Vector<>();
				
				System.out.println(a1.size());
				
				a1.add("Bishnu");
				a1.add("Bharma");
				a1.add("Maheshower");
				
				System.out.println(a1.size());
				System.out.println(a1);
				
				// Create Second list
				List<String> a2= new Vector<>();
				
				a2.add("Dalli");
				System.out.println(a2);
				
				// adding one list with another list
				a2.addAll(a1);
				System.out.println(a2);
				
				java.util.Collections.sort(a2);
				System.out.println(a2);
				
				java.util.Collections.sort(a2,Collections.reverseOrder());
				System.out.println(a2);

			}

		}

		

