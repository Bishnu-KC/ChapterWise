package com.h.inputoutput.practise;
import java.io.*;

public class CopyFile111 {
	public static void main(String args[]) throws IOException
	{
		FileInputStream in=null;
		FileOutputStream out=null;
		try
		{
			in= new FileInputStream("/Users/bishnu/eclipse-workspace/DailyAssignmentBook/src/com/assignment/daily/input.txt");
			out= new FileOutputStream("/Users/bishnu/eclipse-workspace/DailyAssignmentBook/src/com/assignment/daily/output.txt");
			int c;
			while((c=in.read())!=-1)
			{
				out.write(c);
			}
		}
		finally
		{
			if(in!=null)
			{
				in.close();
			}
			if(out!=null)
			{
				out.close();
			}
		}
	}

}
