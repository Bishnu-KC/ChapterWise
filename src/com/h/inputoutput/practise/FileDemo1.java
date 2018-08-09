package com.h.inputoutput.practise;
import java.io.*;

public class FileDemo1 {

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		
		File path=new File("hello.txt");
		System.out.println("We got a file: "+path);
		
		System.out.println("Does it exist?"+path.exists());
		
		System.out.println("Wat?: "+path.isDirectory());
		/*
		String contentsToWrite="hello World";
		OutputStream os=new FileOutputStream(path);
		os.write(contentsToWrite.getBytes());
		os.close();
		*/
		
		BufferedReader rd=new BufferedReader(new InputStreamReader(new FileInputStream(path)));
		String f=rd.readLine();
		rd.close();
		System.out.println("Read a line : "+f);

	}

}
