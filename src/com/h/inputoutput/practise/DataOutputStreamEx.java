package com.h.inputoutput.practise;
import java.io.*;

public class DataOutputStreamEx {

	public static void main(String[] args) throws IOException
	{
		FileOutputStream file=new FileOutputStream("a.txt");
		DataOutputStream data=new DataOutputStream(file);
		data.writeInt(65);
		data.flush();
		data.close();
		System.out.println("Success..");
		

	}

}
