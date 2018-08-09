package com.i.exceptionhandling.practise;

public class ThrowExample {

	public static void main(String[] args) {
		
				eligibility(25,40);
			}
				//Syntax of throw
				/*
				 * 
				 */
				static void eligibility(int empId, int num)
				{
					if(empId<24 || num<55)
					{
						throw new ArithmeticException("Not eligible for bonous.");
					}
					else
					{
						System.out.println("Eligible for bonous.");
					}
				}

}
