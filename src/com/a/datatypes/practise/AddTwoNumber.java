package com.a.datatypes.practise;
import javax.swing.*;
import java.util.*;

public class AddTwoNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b,c;
		a=10;
		b=20;
		c=a+b;
		System.out.println("Sum of two number is: "+c);
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a:");
		a=s.nextInt();
		System.out.println("Enter b :");
		b=s.nextInt();
		c=a+b;
		System.out.println("The sum of two number is : "+c);
		
		String x,y;
		x=JOptionPane.showInputDialog("Enter a: ");
		a=Integer.parseInt(x);
		y=JOptionPane.showInputDialog("Enter b: ");
		b=Integer.parseInt(y);
		c=a+b;
		JOptionPane.showMessageDialog(null,"The sum of two number is: "+c);

	}

}
