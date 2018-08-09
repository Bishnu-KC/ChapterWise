package com.j.collectionframework.practise;
import java.util.*;

public class TreeSet1 implements Comparable {
	String countryName;
	
	

	public TreeSet1(String countryName) {
		super();
		this.countryName = countryName;
	}
	@Override
	public int compareTo(Object arg0)
	{
		TreeSet1 obj=(TreeSet1)arg0;
		return (this.countryName.compareTo(obj.countryName));
	}
	
	public String getCountryName()
	{
		return countryName;
	}
	
	public void setCountryName(String countryName)
	{
		this.countryName=countryName;
	}



	public static void main(String[] args) {
		TreeSet ts=new TreeSet();
		TreeSet1 ts1=new TreeSet1("Nepal");
		TreeSet1 ts2=new TreeSet1("USA");
		TreeSet1 ts3=new TreeSet1("Germany");
		TreeSet1 ts4=new TreeSet1("Canada");
		TreeSet1 ts5=new TreeSet1("USA");
		TreeSet1 ts6=new TreeSet1("Nepal");
		
		ts.add(ts1);
		ts.add(ts2);
		ts.add(ts3);
		ts.add(ts4);
		ts.add(ts5);
		ts.add(ts6);
		
		Iterator ob1=ts.iterator(); //put debug point here
		while(ob1.hasNext())
		{
			System.out.println(ob1.next().toString());
		}

	}

}
