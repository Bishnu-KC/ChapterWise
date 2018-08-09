package com.a.datatypes.practise;
import javax.swing.*;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x,y;
		int a,b,c;
		x=JOptionPane.showInputDialog("Enter a: ");
		a=Integer.parseInt(x);
		y=JOptionPane.showInputDialog("Enter b: ");
		b=Integer.parseInt(y);
		c=a+b;
		JOptionPane.showMessageDialog(null,"The sum of two number is: "+c);

	}

}
