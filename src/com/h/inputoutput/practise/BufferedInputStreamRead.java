package com.h.inputoutput.practise;
import java.io.*;

public class BufferedInputStreamRead {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Specify the path of the file here
		File file=new File("b.txt");
		BufferedInputStream bis=null;
		FileInputStream fis=null;
		
		try
		{
			//FileInputStream to rerad the file
			fis =new FileInputStream(file);
			
			//Passed the FileInputStream to BufferedInputStream
			//for fast read using the buffer array
			
			bis=new BufferedInputStream(fis);
			//availabe() method of BufferedInputStream
			//returns 0 when there are no more bytes
			//present in the file to be read
			
			while(bis.available()>0)
			{
				System.out.print((char)bis.read());
			}
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		finally
		{
		}
		

	}

}
