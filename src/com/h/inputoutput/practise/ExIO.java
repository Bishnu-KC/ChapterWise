package com.h.inputoutput.practise;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ExIO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStream in = null;
		try
		{
		  InputStream inner = new FileInputStream("/Users/bishnu/eclipse-workspace/IODemo/src/com/io/demo/myfile.txt");
		  in = new BufferedInputStream(inner);
		  
		  //process file
		} catch (IOException e)
		{
		  e.printStackTrace();
		}
		finally
		{
		  try { in.close(); } catch (Exception e) {}
		}


	}

}
