package com.g.multithreading.practise;
class A2 extends Thread {
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("\t From Thread A: i = "+i);
		}
		System.out.println("Exit From A.");
	}
}
class B2 extends Thread {
	public void run()
	{
		for(int j=1;j<=5;j++)
		{
			System.out.println("\t From Thread B: j = "+j);
		}
		System.out.println("Exit From B.");
	}
}
class C2 extends Thread {
	public void run()
	{
		for(int k=1;k<=5;k++)
		{
			System.out.println("\t From Thread C: k = "+k);
		}
		System.out.println("Exit From C.");
	}
}

public class PrioritiesThread {

	public static void main(String[] args) {
		Thread t=Thread.currentThread();
		System.out.println(t);
		t.setPriority(1);
		System.out.println(t);
		System.out.println("Name of Thread: "+t.getName());
		
		A2 obj=new A2();
		obj.setPriority(7);
		System.out.println(obj);
		System.out.println("Name of Thread: "+obj.getName());
		System.out.println("Start Thread A");
		obj.start();
		
		B2 obj1=new B2();
		obj1.setPriority(Thread.NORM_PRIORITY);
		System.out.println(obj);
		System.out.println("Name of Thread: "+obj.getName());
		System.out.println("Start Thread B");
		obj1.start();
		
		C2 obj2=new C2();
		obj2.setPriority(Thread.MAX_PRIORITY);
		System.out.println(obj2);
		System.out.println("Name of Thread: "+obj2.getName());
		System.out.println("Start Thread B");
		obj2.start();
		
		
		
		
		

	}

}
