package com.g.multithreading.practise;
 class X implements Runnable{ //step 1
	 public void run() // step 2
	 {
		// for (int i=1;i<=5;i++)
		// {
			// System.out.println("\t From Thread X: i= "+i);
			 try
			 {
				 for (int i=1;i<=5;i++) {
					 System.out.println("\t From Thread X: i= "+i);
				 Thread.sleep(1000);
				 }
			 }
			 catch(Exception e)
			 {
				 e.printStackTrace();
			 }
		// }
		 System.out.println("Exit From X.");
		 
	 }

	private void sleep(int i) {
		// TODO Auto-generated method stub
		
	}
	 
 }
public class RunnableInterface {

	public static void main(String[] args) {
		X obj=new X();
		Thread t=new Thread(obj); // step 3
		t.start(); // step 4
		System.out.println("End of main Thread.");
		

	}

}
