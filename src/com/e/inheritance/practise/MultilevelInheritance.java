package com.e.inheritance.practise;

// Example of multilevel inheritance
/* GrandFather 
 * Father
 * Child
 * */
class Person {
	String name;
	Person(String s)
	{
		name=s;
		
	}
	void display()
	{
		System.out.println("The name of Person is: "+name);
	}
}
class Account extends Person {
	int id;

	public Account(int i, String s) {
		super(s);
		id=i;
	}
	void display1()
	{
		System.out.println("Name: "+name + "\n" + "Id: "+id);
	}
}
class Department extends Account{
	String dept;
	public Department(String s, int i, String dept1)
	{
		super(i,s);
		dept=dept1;
	}
	void display2()
	{
		System.out.println("Name: "+name+"\n"+"Id: "+id+"\n"+"Department: "+dept);
	}
}
public class MultilevelInheritance {
	public static void main(String args[])
	{
		Department obj=new Department("Bishnu",1,"IT");
		System.out.println("Inside class Person: ");
		obj.display();
		System.out.println("Inside class Account: ");
		obj.display1();
		System.out.println("Inside class Department: ");
		obj.display2();
		
	}

}
