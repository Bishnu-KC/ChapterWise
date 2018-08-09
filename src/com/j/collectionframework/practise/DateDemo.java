package com.j.collectionframework.practise;
import java.util.*;

public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Instantiate a Date object
		Date date = new Date();
		// display time and date using toString()
		System.out.println(date);
		// Display number of milliseconds since midnight, January 1, 1970 GM
		long msec = date.getTime();
		System.out.println("Milliseconds since Jan. 1, 1970 GMT = " + msec);

	}

}
