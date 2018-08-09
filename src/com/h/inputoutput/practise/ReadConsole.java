package com.h.inputoutput.practise;
import java.io.Console;

public class ReadConsole {

	public static void main(String[] args) throws Exception, NullPointerException{
		// TODO Auto-generated method stub
		
		Console c=System.console();
		System.out.println("Enter your name: ");
		String n=c.readLine();
		System.out.println("Welcome "+n);

	}

}
