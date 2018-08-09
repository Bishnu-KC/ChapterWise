package com.j.collectionframework.practise;
import java.util.*;

public class ListDemo2 {

		public static void main(String[] args) {
			
			// Create List
			// Both way are fine
			//List <String> st = new ArrayList<>();
			
			List st=new ArrayList();
			
			// calculate the size of list
			
			System.out.println(st.size());
			
			// add elements in list
			
			st.add("Bishnu");
			st.add("Ruku");
			st.add("Rupa");
			st.add("Rubina");
			
			// contents after adding elements
			System.out.println(st);
			
			st.add(1,"Gupta Bimala");
			System.out.println("Current List index. :  "+st);
			
			// Remove index or specific string
			st.remove(0);
			st.remove("Rubina");
			System.out.println(st);
			
			//Replace some element
			st.set(0, "RupSanu");
			System.out.println(st);
			System.out.println(st.size());
			

		}

	}



