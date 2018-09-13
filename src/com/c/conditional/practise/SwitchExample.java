package com.c.conditional.practise;

public class SwitchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;
		switch(a)
		{
		case 5:
			System.out.println("5");
			break;
		case 10:
			System.out.println("10");
			break;
		case 15:
			System.out.println("15");
			default:
				System.out.println("Invalid number.");
		}
		System.out.println(a);

	}

}
