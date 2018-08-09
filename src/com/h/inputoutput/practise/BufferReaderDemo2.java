package com.h.inputoutput.practise;
import java.io.*;

public class BufferReaderDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BufferedReader br=null;
		BufferedReader br1=null;
		try
		{
			br=new BufferedReader(new FileReader("hello.txt"));
			//one way of reading the file
			System.out.println("Reading the file using readLine() method");
			String contentLine=br.readLine();
			while(contentLine!=null)
			{
				System.out.println(contentLine);
				contentLine=br.readLine();
			}
			
			br1=new BufferedReader(new FileReader("buffer.txt"));
			
			//second way of reading the file
			System.out.println("Reading the file using read() method");
			int num=0;
			char ch;
			while((num=br1.read())!=-1)
			{
				ch=(char)num;
				System.out.print(ch);
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				if(br!=null)
					br.close();
				if(br1!=null)
					br1.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}

	}

}
