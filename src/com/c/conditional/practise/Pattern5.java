package com.c.conditional.practise;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 1; i < 5; i++) {
			 System.out.println("Outside loop: i = " + i); 
			 for (int j = 1; j <= i; j++) { 
			  System.out.println(" Nested Loop: j = " + j); 
			 } 
			}

	}

}
