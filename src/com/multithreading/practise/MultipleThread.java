package com.multithreading.practise;

// create multiple threads.
class Thread1 implements Runnable {
	String name; //name of thread
	Thread t;
	Thread1(String threadname)
	{
		name=threadname;
		t=new Thread(this, name);
		t.start(); // start the thread
	}
	
	// this is the entry point for thread
	public void run()
	{
		try
		{
			for(int i=5; i>0;i--)
			{
				System.out.println(name+": "+i);
				Thread.sleep(1000);
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println(name+" exiting.");
	}
}

public class MultipleThread {

	public static void main(String[] args) {
		new Thread1("one"); // start threads
		new Thread1("Two");
		new Thread1("Three");
		try
		{
			// wait for other threads to end
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("Main thread exiting.");

	}

}
