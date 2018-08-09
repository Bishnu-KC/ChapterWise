package com.k.generics.practise;
import java.util.*;

public class MyGen<T> {
	T obj;
	void add(T obj)
	{
		this.obj=obj;
	}
	T get()
	{
		return obj;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyGen<Integer> m=new MyGen<Integer>();
		m.add(1);
		System.out.println(m.get());
		MyGen<String> m1=new MyGen<String>();
		m1.add("Bishnu");
		System.out.println(m1.get());


	}

}
