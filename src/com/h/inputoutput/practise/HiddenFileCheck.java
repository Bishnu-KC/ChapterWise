package com.h.inputoutput.practise;
import java.io.*;

public class HiddenFileCheck {

	public static void main(String[] args) throws IOException, SecurityException{
		// TODO Auto-generated method stub
		// Provide the complete file path here
    	File file = new File("a.txt");
 
    	if(file.isHidden()){
    		System.out.println("The specified file is hidden");
    	}else{
    		System.out.println("The specified file is not hidden");
    	}

	}

}
