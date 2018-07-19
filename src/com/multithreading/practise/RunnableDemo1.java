package com.multithreading.practise;
class ThreadA implements Runnable { // step 1
	
	Thread t;
	ThreadA()
	{
		t= new Thread(this, "Demo Thread");
		System.out.println("Child Thread: "+t);
		t.start(); 
		// start the thread
	}
	// entry point of thread
	public void run()
	{
		try
		{
			for (int i=5; i>0;i--)
			{
				System.out.println("Child Thread: "+i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("Exit from child Thread.");
	}
}

public class RunnableDemo1 {

	public static void main(String[] args) {
		new ThreadA();
		try
		{
			for(int i=5;i>0;i--)
			{
				System.out.println("Main Thread: "+i);
				Thread.sleep(2000);
			}
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("Main thread exiting.");
		

	}

}
