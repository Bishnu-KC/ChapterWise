package com.h.inputoutput.practise;
import java.io.*;

public class Display {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File f=new File(args[0]);
		if(!f.exists()||!f.canRead())
			System.out.println("Cannot read a file");
		else
		{
			if(f.isDirectory())
			{
				String[] files=f.list();
				for(int i=0; i<files.length;i++)
				{
					System.out.println(files[i]);
				}
					
			}
			else
			{
				try
				{
					FileReader fr=new FileReader(f);
					BufferedReader bf=new BufferedReader(fr);
					String c;
					while((c=bf.readLine())!=null)
					{
						System.out.println(c);
					}
				}
				catch(ArrayIndexOutOfBoundsException e)
				{
					e.printStackTrace();
					System.out.println("Its java");
				}
				catch(FileNotFoundException e)
				{
					e.printStackTrace();
					System.out.println("Its java");
				}
				catch(IOException e)
				{
					System.out.println("Its java");
					e.printStackTrace();
				}
			}
		}

	}

}
