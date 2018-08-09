package com.j.collectionframework.practise;
import java.util.*;

public class HashSet1Custom {
	String name;
	long population;
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	
	public long getPopulation()
	{
		return population;
	}
	public void setPopulation(long population)
	{
		this.population=population;
	}
	
	public String toString()
	{
		return name;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if(this==obj)
			return true;
		if(obj==null)
			return false;
		if(getClass()!=obj.getClass())
			return false;
		HashSet1Custom other=(HashSet1Custom) obj;
		if(name==null)
		{
			if(other.name!=null)
				return false;
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		HashSet hs=new HashSet();
		HashSet1Custom obj=new HashSet1Custom();
		obj.setName("Nepal");
		obj.setPopulation(100000);
		
		HashSet1Custom obj1=new HashSet1Custom();
		obj1.setName("Nepal");
		obj1.setPopulation(100000);
		
		hs.add(obj);
		hs.add(obj1);
		hs.add(obj);
		hs.add(obj1);
		System.out.println("size of name: "+hs.size());
		System.out.println(hs);

	}

}
