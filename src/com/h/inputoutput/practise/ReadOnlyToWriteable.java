package com.h.inputoutput.practise;
import java.io.*;

public class ReadOnlyToWriteable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File myfile = new File("newfile.txt");
    	//changing the file mode to writable
    	myfile.setWritable(true);
    	//false for read only
    	if (myfile.canWrite())
    	{
    	   System.out.println("File is writable.");
    	}
    	else
    	{
    	   System.out.println("File is read only.");
    	}

	}

}
