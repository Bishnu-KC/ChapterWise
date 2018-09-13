package com.e.inheritance.practise;

public class AdrEmp {
	int id;
	String name;
	Address address;
	
	public AdrEmp(int id, String name, Address address)
	{
		this.id=id;
		this.name=name;
		this.address=address;
	}
	
	void display()
	{
		System.out.println(id + " " + name);
		System.out.println(address.city + " "+address.state + " "+ address.country);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Address a=new Address("Vienna","Virginia","USA");
		Address b=new Address("Chabahil","Kathmandu","Nepal");
		
		AdrEmp c=new AdrEmp(1,"Bishnu",a);
		AdrEmp d=new AdrEmp(2,"Unhsib",b);
		
		c.display();
		d.display();

		

	}

}
