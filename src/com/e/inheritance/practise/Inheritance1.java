package com.e.inheritance.practise;

class Super {
	String dept ="Accounting";
	String company="Abc.com";
	void does()
	{
		System.out.println("Teaching"+"\n"+dept+"\n"+company);
	}
}
class Sub extends Super {
	String name="Bishnu";
	int code=123;
	void showSub()
	{
		System.out.println("The name of employee is: "+ name +"\n"+"Department"+dept
				+"\n"+"Company Name"+ company
	+"Department code: "+code);
	}
}
public class Inheritance1 {
	public static void main(String args[])
	{
		Super obj1=new Super();
		Sub obj2=new Sub();
		
		// Display the content of super class
		System.out.println("COntent of Super class:");
		obj1.does();
		
		
	// displayy the content of sub class
		System.out.println("COntent of Sub class:");
		obj2.does();
		obj2.showSub();
		
	}

}

