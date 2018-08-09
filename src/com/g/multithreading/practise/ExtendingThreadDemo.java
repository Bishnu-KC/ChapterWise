package com.g.multithreading.practise;

class A extends Thread {
	public void run()
	{
		//thread codes lies here
		for (int i=1;i<=5;i++)
		{
			System.out.println("\t From Thread A: i= "+i);
		}
		System.out.println("Exit from A: ");
	}
}
// create class B 
class B extends Thread {
	public void run()
	{
		for(int j=1;j<=5;j++)
		{
			System.out.println("\t From Thread B: j= "+j);
		}
		System.out.println("Exit from B: ");
	}
}
// create class C
class C extends Thread {
	public void run()
	{
		for(int k=1; k<=5;k++)
		{
			System.out.println("\t From Thread C: k= "+k);
		}
		System.out.println("Exit from C: ");
	}
}
public class ExtendingThreadDemo {

	public static void main(String[] args) {
		A obj=new A();
		obj.start();
		//new A().start();
		//B obj1=new B();
		//obj1.start();
		new B().start();
		new C().start();
		

	}

}
