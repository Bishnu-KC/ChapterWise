package com.g.multithreading.practise;



//Creating a Thread extending a Thread class

class Ax extends Thread {
	 public void run()
	 {
		 for (int i=1; i<=5;i++)
		 {
			 System.out.println("\t From Thread A: "+i);
		 }
		 System.out.println("Exit from A.");
	 }
}
class Bx extends Thread {
	 public void run()
	 {
		 for (int j=1; j<=5;j++)
		 {
			 System.out.println("\t From Thread B: "+j);
		 }
		 System.out.println("Exit from B.");
	 }
}
class Cx extends Thread {
	 public void run()
	 {
		 for (int k=1; k<=5;k++)
		 {
			 System.out.println("\t From Thread C: "+k);
		 }
		 System.out.println("Exit from C.");
	 }
}

public class AThreadDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ax().start();
		new Bx().start();
		new Cx().start();

	}

}
