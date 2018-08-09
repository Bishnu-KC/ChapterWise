package com.j.collectionframework.practise;
import java.util.*;
public class PropertyDemo1 {
	public static void main(String args[])
	{
		Properties defList = new Properties();
		defList.put("Florida", "Tallahassee");
		defList.put("Wisconsin", "Madison");
		Properties capitals = new Properties(defList);
		Set states;
		String str;
		capitals.put("Illinois", "Springfield");
		capitals.put("Missouri", "Jefferson City");
		capitals.put("Washington", "Olympia");
		capitals.put("California", "Sacramento");
		capitals.put("Indiana", "Indianapolis");
		// Show all states and capitals in hashtable.
		states = capitals.keySet(); // get set-view of keys
		Iterator itr = states.iterator();
		while(itr.hasNext()) {
		str = (String) itr.next();
		System.out.println("The capital of " +
				str + " is " +
				capitals.getProperty(str)
				+ ".");
				}
				System.out.println();
				// Florida will now be found in the default list.
				str = capitals.getProperty("Florida");
				System.out.println("The capital of Florida is "
				+ str + ".");
	}

}
