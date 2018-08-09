package com.h.inputoutput.practise;
import java.io.*;

public class ReaderEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			Reader reader=new FileReader("output.txt");
			int data=reader.read();
			while(data!=-1)
			{
				System.out.print((char)data);
				data=reader.read();
			}
			reader.close();
					
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
