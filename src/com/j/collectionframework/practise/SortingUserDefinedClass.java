package com.j.collectionframework.practise;
import java.util.*;

// Create user defined class Address
class Address1 {
	 private String name;
	 private String street;
	 private String city;
	 private String state;
	 private String code;
	 
	// Defining constructor
	 /*
	  * Right click
	  * Click Source
	  * click Generate using constructor using fields
	  * */
	public Address1(String name, String street, String city, String state, String code) {
		super();
		this.name = name;
		this.street = street;
		this.city = city;
		this.state = state;
		this.code = code;
	}
	
	// Defining getter and setter methods
	/*
	  * Right click
	  * Click Source
	  * click Generate Getter and Setter Methods
	  * */

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	 
public String toString()
{
	return name +"\n"+street+" "+city+" "+state+" "+code;
	}
	 
	 
}

public class SortingUserDefinedClass {

	public static void main(String[] args) {
		
		// Create a LinkedList
		
		LinkedList ll= new LinkedList();
		
		// add elements to the linked list
		ll.add(new Address1("CollaboraIT", "119 Rowell Ct", "Falls Church","VA","22046"));
		ll.add(new Address1("ABC", "9451 Lee Hwy", "Fairfax","CA","22031"));
		ll.add(new Address1("Bishnu", "8125 Heatherton Lane", "Vienna","VA","22180"));
		//System.out.println(ll.toString());
		Iterator it=ll.iterator();
		while(it.hasNext())
		{
			Object element=it.next();
			System.out.println(element +"\n");
		}
		System.out.println();

	}

}
