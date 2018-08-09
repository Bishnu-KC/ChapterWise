package com.h.inputoutput.practise;
import java.io.*;

public class BufferedOutputStreamEx {

	public static void main(String[] args) throws Exception
	{
		FileOutputStream fout=new FileOutputStream("buffer.txt");
		BufferedOutputStream bout=new BufferedOutputStream(fout);
		String s="Java is interesting.";
		byte b[]=s.getBytes();
		bout.write(b);
		bout.flush();
		bout.close();
		fout.close();
		System.out.println("Success..");
		

	}

}
