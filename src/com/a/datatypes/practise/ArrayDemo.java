package com.a.datatypes.practise;

import javax.swing.JOptionPane;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declares an array of integers
		int a[]; 
		
		//allocates memory for 5 integers
		
		a=new int[5];
		
		//initialize elements
		a[0]=10;//first element
		a[1]=20;//second element
		a[2]=30;//third element
		a[3]=40;//fourth element
		a[4]=50;//fifth element
		
		System.out.println("Element at index 0: "+a[0]);
		System.out.println("Element at index 1: "+a[1]);
		System.out.println("Element at index 2: "+a[2]);
		System.out.println("Element at index 3: "+a[3]);
		System.out.println("Element at index 4: "+a[4]);
		
		JOptionPane.showMessageDialog(null, "Element at index 0: "+a[0]+"\n"+"Element at index 1: "+a[1]+"\n"+"Element at index 2: "+a[2]+"\n"+"Element at index 3: "+a[3]+"\n"+"Element at index 4: "+a[4]);

	}

}
