package com.h.inputoutput.practise;
import java.io.*;
public class RenameFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Old File
		File oldfile =new File("f2.txt");
		//New File
		File newfile =new File("f22.txt");
		/*renameTo() return boolean value
		 * It return true if rename operation is
		 * successful
		 */
	        boolean flag = oldfile.renameTo(newfile);
		if(flag){
		   System.out.println("File renamed successfully");
		}else{
		   System.out.println("Rename operation failed");
		 }

	}

}
