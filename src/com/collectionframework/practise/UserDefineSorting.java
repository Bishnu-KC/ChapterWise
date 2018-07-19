package com.collectionframework.practise;
import java.util.*;
class Address {
	private String name;
	private String street;
	private String city;
	private String state;
	private String code;
	
	//constructor
	Address(String n, String s, String c, String st, String cd)
	{
		name=n;
		street=s;
		city=c;
		state=st;
		code=cd;
	}

	/*
	@Override
	public String toString() {
		return "Address [name=" + name + ", street=" + street + ", city=" + city + ", state=" + state + ", code=" + code
				+ "]";
	}*/
	public String toString() {
		return name + "\n" + street + "\n" +
		city + " " + state + " " + code;
	}
}

public class UserDefineSorting {

	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		
		//add elements to linked list
		ll.add(new Address("Bishnu ","8125 heatherton lane","Vienna","VA","22180 Apt 203"));
		ll.add(new Address("Anil ","8125 heatherton lane","Vienna","VA","22180 Apt 203"));
		ll.add(new Address("Gorakh ","8125 heatherton lane","Vienna","VA","22180 Apt 203"));
		Iterator itr=ll.iterator();
		while(itr.hasNext())
		{
			Object element=itr.next();
			System.out.println(element+ "\n");
		}
		System.out.println();

	}

}
