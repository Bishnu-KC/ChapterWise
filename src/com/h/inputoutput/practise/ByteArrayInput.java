package com.h.inputoutput.practise;
import java.io.*;

public class ByteArrayInput {

	public static void main(String[] args) throws IOException
	{
		byte b[]= {35,36,37,38};
		//Create the new byte array input stream
		ByteArrayInputStream by=new ByteArrayInputStream(b);
		int k=0;
		while((k=by.read())!=-1)
		{
			//conversion of a byte into character
			char ch=(char) k;
			System.out.println(" ASCII value of Character is: "+k+";Specific character is:"+ch);
		}
	}

}
