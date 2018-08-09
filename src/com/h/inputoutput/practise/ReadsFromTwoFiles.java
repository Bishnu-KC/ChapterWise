package com.h.inputoutput.practise;
import java.io.*;

public class ReadsFromTwoFiles {

	public static void main(String[] args) throws Exception
	{
		FileInputStream f=new FileInputStream("testout1.txt");
		FileInputStream f1=new FileInputStream("buffer.txt");
		FileOutputStream f2=new FileOutputStream ("data.txt");
		SequenceInputStream sq=new SequenceInputStream(f,f1);
		int i;
		while((i=sq.read())!=-1)
		{
			f2.write(i);
		}
		f.close();
		f1.close();
		f2.close();
		sq.close();
		System.out.println("Success..");


	}

}
