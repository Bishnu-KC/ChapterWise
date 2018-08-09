package com.g.multithreading.practise;

class A1 extends Thread {
	public void run()
	{
		for (int i=1;i<=5;i++)
		{
			if(i==3)
				yield();
			System.out.println("\t From Thread A: i= "+i);
		}
		System.out.println("Exit from A.");
	}
}

class B1 extends Thread {
	public void run()
	{
		for (int j=1;j<=5;j++)
		{
			System.out.println("\t From Thread B: j = "+j);
			if(j==3)
				stop();
		}
		System.out.println("Exit From B");
	}
}
class C1 extends Thread {
	public void run()
	{
		for(int k=1; k<=5;k++)
		{
			System.out.println("\t From Thread C: k = "+k);
			if(k==3)
			{
				try
				{
					sleep(1000);
				}
				catch(Exception e)
				{
					e.printStackTrace();
					System.out.print("Exception Occured:");
					
				}
			}
		}
		System.out.println("Exit from C.");
	}
}

public class SleepYieldStop {

	public static void main(String[] args) {
		System.out.println("Start Tread A:");
		new A1().start();
		System.out.println("Start Tread A:");
		new B1().start();
		System.out.println("Start Tread A:");
		new C1().start();
		System.out.println("End of main Thread:");
		
	}

}
