package com.h.inputoutput.practise;
import java.io.*;

public class BufferedInputStreamEx {

	public static void main(String[] args) throws Exception
	{
		try
		{
			FileInputStream fis=new FileInputStream("buffer.txt");
			BufferedInputStream bin=new BufferedInputStream(fis);
			int i;
			while((i=bin.read())!=-1)
			{
				System.out.print((char)i);
			}
			bin.close();
			fis.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
