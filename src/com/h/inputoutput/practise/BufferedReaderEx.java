package com.h.inputoutput.practise;
import java.io.*;

public class BufferedReaderEx {

	public static void main(String[] args)  throws Exception{
		// TODO Auto-generated method stub
		 InputStreamReader r=new InputStreamReader(System.in);    
		    BufferedReader br=new BufferedReader(r);            
		    System.out.println("Enter your name");    
		    String name=br.readLine();    
		    System.out.println("Welcome "+name);    

	}

}
