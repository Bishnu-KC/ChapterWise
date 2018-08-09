package com.h.inputoutput.practise;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class WriteStreamBuffer {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedWriter bw=null;
		
		try
		{
		
			String mycontent="This is java i/o bufferreader.";
			String mycontent2="I love Java Programming";
			File f=new File("/Users/bishnu/eclipse-workspace/JavaIO/src/com/java/io/b.txt");
			if(!f.exists())
			{
				f.createNewFile();
			}
			FileWriter fw=new FileWriter(f);
			bw= new BufferedWriter (fw);
			bw.write(mycontent+mycontent2);
			System.out.println("File was written successfully");
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
			System.out.println("File was not written successfully");
		}
		finally
		{
			try
			{
				if(bw!=null)
					bw.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
				System.out.println("File was not written successfully");
			}
			
		}
	
		
		

	}

}
