package com.h.inputoutput.practise;
import java.io.*;

public class FilterInputStreamEx {

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		File data = new File("x.txt");  
        FileInputStream  file = new FileInputStream(data);  
        FilterInputStream filter = new BufferedInputStream(file);  
        int k =0;  
        while((k=filter.read())!=-1){  
            System.out.print((char)k);  
        }  
        file.close();  
        filter.close();  

	}

}
