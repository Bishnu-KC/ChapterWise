package com.inheritance.practise;

class Person1 {
	private String name;
	Person1(String s)
	{
		setName(s);
	}
	public void setName(String s)
	{
		name=s;
	}
	public String getName()
	{
		return name;
	}
	public void display()
	{
		System.out.println("Name of Person: "+name);
	}
}

class Staff extends Person1 {
	private int sId;
	Staff(String name, int sId)
	{
		super(name);
		setsID(sId);
	}
	public void setsID(int sId)
	{
		this.sId=sId;
	}
	public int getsID()
	{
		return sId;
	}
	public void display()
	{
		super.display();
		System.out.println("Staff ID : "+sId);
	}
}
class TempStaff extends Staff {
	private int days;
	private int hoursWorked;
	TempStaff(String name, int sId, int days, int hoursWorked)
	{
		super(name, sId);
		this.days=days;
		this.hoursWorked=hoursWorked;
	}
	public int Salary()
	{
		int salary=days*hoursWorked*50;
		return salary;
	}
	public void display()
	{
		super.display();
		System.out.println("Days: "+days);
		System.out.println("Total Hours Worked: "+hoursWorked);
		System.out.println("Total Salary: "+Salary());
	}
	
}

public class MultilevelDemo {

	public static void main(String[] args) {
		TempStaff ts=new TempStaff("Bishnu", 1, 15, 90);
		ts.display();

	}

}
