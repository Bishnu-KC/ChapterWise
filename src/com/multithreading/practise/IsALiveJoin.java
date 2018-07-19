package com.multithreading.practise;

// Using join() to wait for threads to finish

class Thread2 implements Runnable {
	String name; //thread name
	Thread t;
	Thread2(String threadname)
	{
		name=threadname;
		t=new Thread(this, name);
		System.out.println("New Thread: "+t);
		t.start(); // Start the thread
	}
	
	public void run()
	{
		try
		{
			for(int i=5;i>0;i--)
			{
				System.out.println(name+": "+i);
				Thread.sleep(1000);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println(name+ "Exiting.");
		
	}
}

public class IsALiveJoin {
	public static void main(String args[])
	{
		Thread2 a=new Thread2("one");
		Thread2 b=new Thread2("two");
		Thread2 c=new Thread2("three");
		System.out.println("Thread one is alive: "+a.t.isAlive());
		System.out.println("Thread one is alive: "+b.t.isAlive());
		System.out.println("Thread one is alive: "+c.t.isAlive());
		// isAlive() determine if a thread is still running
		
		// wait for threads to finish
		try
		{
			System.out.println("Waiting for threads to finish.");
			a.t.join(); // wait for a thread to terminate
			b.t.join();
			c.t.join();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("Thread one is alive: "+a.t.isAlive());
		System.out.println("Thread one is alive: "+b.t.isAlive());
		System.out.println("Thread one is alive: "+c.t.isAlive());
		System.out.println("Exiting from main thread.");
		
	}

}
