package com.h.inputoutput.practise;
import java.io.*;

public class SequenceInputStreamEx {

	public static void main(String[] args) throws Exception
	{
		FileInputStream in=new FileInputStream("testout1.txt");
		FileInputStream in1=new FileInputStream("buffer.txt");
		SequenceInputStream sq=new SequenceInputStream(in,in1);
		int j;
		while((j=sq.read())!=-1)
		{
			System.out.print((char)j);
		}
		in.close();
		in1.close();
		sq.close();

	}

}
