package com.a.datatypes.practise;

public class CopyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char source[]= {'b','i','s','h','n','u'};
		char target[]=new char[3];
		System.arraycopy(source,0,target,0,3);
		System.out.println(new String(target));

	}

}
