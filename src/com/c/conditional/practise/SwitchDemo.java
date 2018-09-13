package com.c.conditional.practise;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month=12;
		String monthType="";
		switch(month)
		{
		case 1:
			monthType="1-Janaurary";
			break;
		case 2:
			monthType="2-Feb";
			break;
		case 3:
			monthType="3-March";
			break;
		case 4:
			monthType="4-April";
			break;
		case 5:
			monthType="5-May";
			break;
		case 6:
			monthType="6-June";
			break;
		case 7:
			monthType="7-July";
			break;
		case 8:
			monthType="8-August";
			break;
		case 9:
			monthType="9-Sep";
			break;
		case 10:
			monthType="10-Oct";
			break;
		case 11:
			monthType="11-Nov";
			break;
		case 12:
			monthType="12-December";
			break;
			default:
				System.out.println("Invalid month.");
		}
		System.out.println(monthType);

	}

}
