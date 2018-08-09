package com.c.conditional.practise;

import java.util.Scanner;

public class ESwitchStatement {

	public static void main(String[] args) {
		
		String a,b,c,d,e,f,g;
		
		
		a="Meatball";
		b="Chicken Teriyarki";
		c="Oven Roasted Chicken";
		d="Turkey";
		e="BMT";
		f="Tuna";
		g="Black Forest Ham";
		
		System.out.println("Subway Special Day");
		System.out.println("Sunday:Meatball"+" \t"+"Monday:Chicken Teriyarki"+" \t"+"Tuesday:OvenRoasdtedChicken");
		System.out.println("Wednesday:Turkey"+"\t "+"Thursday:BMT"+"\t "+"Friday:Tuna");
		System.out.println("\t\tSaturday: Black Forest Ham");
		System.out.println("Select your day");
		String day;
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter Today's day.");
		day=s.nextLine();
		switch(day)
		{
		case "Sunday":System.out.println(a);
		break;
		case "Monday":System.out.println(b);
		break;
		case "Tuesday":System.out.println(c);
		break;
		case "Wednesday":System.out.println(d);
		break;
		case "Thursday":System.out.println(e);
		break;
		case "Friday":System.out.println(f);
		break;
		case "Saturday":System.out.println(g);
		break;
		default:System.out.println("You enter invalid day.");
		}

	}

}
