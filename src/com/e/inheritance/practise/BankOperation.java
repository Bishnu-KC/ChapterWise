package com.e.inheritance.practise;

public class BankOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankNabil bn=new BankNabil();
		BankCitizen bc=new BankCitizen();
		BankNepal bn1=new BankNepal();
		
		System.out.println("Nabil Bank Interest Rate: "+bn.interestRate());
		System.out.println("Citizen Bank Interest Rate: "+bc.interestRate());
		System.out.println("Nepal Bank Interest Rate: "+bn1.interestRate());

	}

}
