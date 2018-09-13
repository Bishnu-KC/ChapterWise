package com.c.conditional.practise;

public class SwitchNested {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char branch='C';
		int collegeYear=4;
		
		switch(collegeYear)
		{
		case 1:
			System.out.println("English, Maths, Science");
			break;
		case 2:
			switch(branch)
			{
			case 'A':
				System.out.println("OS, JAVA,DATABASE");
				break;
			case 'B':
				System.out.println("WEB,EIS,SCM");
				break;
			case 'C':
				System.out.println("DL,CA,CO");
				break;
			}
			break;
		case 3:
			switch(branch) {
			case 'A':
				System.out.println("O, JAVA,DB");
				break;
			case 'B':
				System.out.println("W,EIS,S");
				break;
			case 'C':
				System.out.println("D,C,CO");
				break;
			
			}
			break;
		case 4:
			switch(branch) {
			case 'A':
				System.out.println("O1, JAVA,DB");
				break;
			case 'B':
				System.out.println("W1,EIS,S");
				break;
			case 'C':
				System.out.println("D1,C,CO");
				break;
			
			}
			break;
			default:
				System.out.println("Invalid.");
			
		}
		

	}

}
