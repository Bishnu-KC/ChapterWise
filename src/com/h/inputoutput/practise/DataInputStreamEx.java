package com.h.inputoutput.practise;
import java.io.*;

public class DataInputStreamEx {

	public static void main(String[] args)throws IOException
	{
		InputStream in=new FileInputStream("a.txt");
		DataInputStream dt=new DataInputStream(in);
		int i=in.available();
		byte b[]=new byte[i];
		dt.read(b);
		for(byte bt:b)
		{
			char k=(char)bt;
			System.out.print(k+"-");
		}

	}

}
