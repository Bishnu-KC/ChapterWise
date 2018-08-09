package com.h.inputoutput.practise;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Writer;

public class IODemo1
{
	private String firstName;
	private String lastName;
	private int empId;
	private boolean isActive;
	public IODemo1(String firstName, String lastName, int empId, boolean isActive) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.empId = empId;
		this.isActive = isActive;
	}
	public void writeBinary(OutputStream out) throws IOException
	{
		DataOutputStream dataOut=new DataOutputStream(out);
		dataOut.writeChars(firstName);
		dataOut.writeChars(lastName);
		dataOut.writeInt(empId);
		dataOut.writeBoolean(isActive);
	}
	public void writeText(Writer out)
	{
		PrintWriter pw=new PrintWriter(out);
		pw.println(firstName);
		pw.println(lastName);
		pw.println(empId);
		pw.println(isActive);
		
	}
	
	
	public static void main(String args[]) throws IOException
	{
		IODemo1 emp1=new IODemo1("Bishnu","K C", 1,true);
		try
		{
			FileOutputStream a= new FileOutputStream("/Users/bishnu/eclipse-workspace/DailyAssignmentBook/src/com/assignment/daily/input2.txt");
			emp1.writeBinary(a);
			a.close();
			FileWriter txt=new FileWriter("/Users/bishnu/eclipse-workspace/DailyAssignmentBook/src/com/assignment/daily/input2.txt");
			emp1.writeText(txt);
			txt.close();
			System.out.println("Requsted text has been printed Ram");
		}
		catch(IOException e)
		{
			e.printStackTrace();
			System.out.println("An exception has occured.");
		}
	}
}

