package com.j.collectionframework.practise;
import java.util.*;

public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		al.add("Bishnu");
		al.add("Gupta");
		al.add("Bimala");
		al.add("Ruku");
		al.add("Rupa");
		al.add("Rubina");
		System.out.println("Size of List: "+al.size());
		System.out.println(al);
		al.remove("Bishnu");
		System.out.println("Size of List: "+al.size());
		System.out.println(al);

	}

}
