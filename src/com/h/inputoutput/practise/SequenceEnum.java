package com.h.inputoutput.practise;
import java.io.*;
import java.util.*;

public class SequenceEnum {

	public static void main(String[] args) throws IOException
	{
		// creating the FileInputStream objects for all the files
		FileInputStream f=new FileInputStream("city.txt");
		FileInputStream f1=new FileInputStream("b.txt");
		FileInputStream f2=new FileInputStream("hello.txt");
		FileInputStream f3=new FileInputStream("testout.txt");
		
		// creating vector object to all the stream
		Vector v=new Vector();
		byte b[];
		v.add(f);
		v.add(f1);
		v.add(f2);
		v.add(f3);
		
		//creating enumaration object in the constructor
		Enumeration e=v.elements();
		
		//passing the enumeration objects in the constructor
		
		SequenceInputStream sq=new SequenceInputStream(e);
		int i=0;
		while((i=sq.read())!=-1)
		{
			System.out.println((char)i);
		}
		sq.close();
		f.close();
		f1.close();
		f2.close();
		f3.close();
		

	}

}
