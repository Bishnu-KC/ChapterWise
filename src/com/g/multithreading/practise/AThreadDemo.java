package com.g.multithreading.practise;



//Create a second thread

class NewThreads implements Runnable
{
	Thread t;
	
	NewThreads()
	{
		// create a new, second thread
		t=new Thread(this,"Demo thread");
		System.out.println("Child Thread: "+ t);
		t.start();
	}
	
	//This is the entry point for the second thread
	
	public void run()
	{
		try
		{
			for (int i=5; i>0; i--)
			{
				System.out.println("Child Thread: "+i);
				Thread.sleep(500);
			}
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
			System.out.println("Child interrupted.");
		}
		System.out.println("Exiting child thread.");
	}
	
}


public class AThreadDemo {
	public static void main(String args[])
	{
		new NewThreads();
		//Create a new thread
		try
		{
			for(int i=5; i>0;i--)
			{
				System.out.println("Main Thread: "+i);
				Thread.sleep(1000);
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("Main thread interruptd.");
		}
		System.out.println("Main thread exist.");
	}

}
