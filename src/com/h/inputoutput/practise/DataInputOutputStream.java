package com.h.inputoutput.practise;

import java.io.DataInputStream;
import java.io.IOException;

public class DataInputOutputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			DataInputStream dis=new DataInputStream(System.in);
			System.out.println("Enter the double value:");
			double d=dis.readDouble();
			System.out.println("Enter the integer value:");
			int i=dis.readInt();
			System.out.println("Enter the float value:");
			float f=dis.readFloat();
			System.out.println("Enter the character value:");
			char c=dis.readChar();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
