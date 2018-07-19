package com.multithreading.practise;

public class MainThreadDemo {

	public static void main(String[] args) {
		Thread t=Thread.currentThread();
		System.out.println("Name of Thread: "+t.getName());
		System.out.println("Current Thread : "+t);
		System.out.println("Name of Thread: "+t.getName());
		
		// change the name of the thread
		t.setName("NewThread");
		System.out.println("Name Changed: "+t);
		
		try
		{
			for(int n=5; n>0;n--)
			{
				System.out.println("\t N: "+n);
				Thread.sleep(1000);
			}
		}
			
		catch(InterruptedException e)
		{
			e.printStackTrace();
			System.out.println("Main Thread Interrupted:");
		}
		System.out.println("Name of Thread: "+t.getName());

	}

}
