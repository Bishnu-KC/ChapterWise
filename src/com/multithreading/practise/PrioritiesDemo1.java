package com.multithreading.practise;

class Clicker implements Runnable {
	int click =0;
	Thread t;
	private volatile boolean running=true;
	public Clicker(int p)
	{
		t=new Thread(this);
		t.setPriority(p);
	}
	public void run()
	{
		while(running)
		{
			click++;
		}
	}
	public void stop()
	{
		running =false;
	}
	public void start()
	{
		t.start();
	}
}

public class PrioritiesDemo1 {
	public static void main(String args[]) throws IllegalArgumentException
	{
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
		Clicker a=new Clicker(Thread.NORM_PRIORITY);
		Clicker b=new Clicker(Thread.MIN_PRIORITY);
		a.start();
		b.start();
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		a.stop();
		b.stop();
		
		// wait for child threads to terminate.
		try
		{
			a.t.join();
			b.t.join();
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("Low priority thread: "+a.click);
		System.out.println("High priority thread: "+b.click);
		
	}

}
