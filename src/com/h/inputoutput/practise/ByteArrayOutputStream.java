package com.h.inputoutput.practise;
import java.io.*;

public class ByteArrayOutputStream {

	public static void main(String[] args) throws Exception
	{
		FileOutputStream f=new FileOutputStream("f1.txt");
		FileOutputStream f1=new FileOutputStream("f2.txt");
		
		ByteArrayOutputStream bout=new ByteArrayOutputStream();
		//byte b[]= {'A'};
		bout.write(65);
		bout.writeTo(f);
		bout.writeTo(f1);
		
		bout.flush();
		bout.close();
		System.out.println("Success...");
		

	}

	private void writeInt(int i) {
		// TODO Auto-generated method stub
		
	}

	private void close() {
		// TODO Auto-generated method stub
		
	}

	private void flush() {
		// TODO Auto-generated method stub
		
	}

	private void writeTo(FileOutputStream f) {
		// TODO Auto-generated method stub
		
	}

	private void write(int i) {
		// TODO Auto-generated method stub
		
	}

}
