package com.g.multithreading.practise;

class CallMe {
	void call(String msg)
	{
		System.out.print("["+msg);
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
			System.out.println("Interrupted");
		}
		System.out.println("]");
	}
}
class Caller implements Runnable {
	String msg;
	CallMe target;
	Thread t;
	public Caller(CallMe targ, String s)
	{
		target=targ;
		msg=s;
		t=new Thread(this);
		t.start();
	}
	//synchronize calls to call
	public void run()
	{
		synchronized(target) // synchronized block
		{
			target.call(msg);
		}
	}
}

public class Synchronization {

	public static void main(String[] args) {
		CallMe target=new CallMe();
		Caller obj=new Caller(target,"Hello");
		Caller obj1=new Caller(target,"Synchronized");
		Caller obj2=new Caller(target,"World");
		
		// wait for threads to end
		try
		{
			obj.t.join();
			obj1.t.join();
			obj2.t.join();
			
		}
		catch(InterruptedException e)
		{
			
			e.printStackTrace();
		}
		
	}

}
