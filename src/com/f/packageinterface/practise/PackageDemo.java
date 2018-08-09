package com.f.packageinterface.practise;

import mypack.Balance;
public class PackageDemo {

	public static void main(String[] args) {
		Balance current[]=new Balance[3];
		current[0]=new Balance("Bishnu K C",1000000.8988);
		current[1]=new Balance("Bhagwat ",11111000000.8988);
		current[2]=new Balance("Yaman",2233231000000.8988);
		for(int i=0;i<3;i++)
			current[i].show();
		

	}

}
