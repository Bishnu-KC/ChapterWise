package com.d.classobject.pratise;

public class BankAccount {
	int acc_no;
	String name;
	float amount;
	
	
	public void insert(int i, String s, float f)
	{
		acc_no=i;
		name=s;
		amount=f;
	}
	
	public void deposit(float amounts)
	{
		amount=amount+amounts;
		System.out.println(amount + "Deposited");
	}
	
	
	public void withdraw(float amounts)
	{
		if(amount<amounts)
		{
			System.out.println("Insuffient Balance.");
		}
		else
		{
			amount=amount-amounts;
			System.out.println(amount +  "Withdrawed");
		}
	}
	
	public void checkBalance()
	{
		System.out.println("Balance is: "+amount);
	}
	
	public void display()
	{
		System.out.println(acc_no+ " "+ name +" "+ amount);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount b=new BankAccount();
		b.insert(12345, "Bishnu", 9999);
		b.display();
		b.checkBalance();
		
		b.deposit(999);
		b.checkBalance();
		
		b.withdraw(999);
		b.checkBalance();

	}

}
