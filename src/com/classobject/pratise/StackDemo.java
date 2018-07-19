package com.classobject.pratise;
class Stack {
	int stk[]=new int[10];
	int tos;
	
	// initialize top of stack
	Stack()
	{
		tos=-1;
	}
	
	// push an item onto the stack
	void push(int item)
	{
		if(tos==9)
		{
			System.out.println("Stack is full.");
		}
		else
			stk[++tos]=item;
	}
	// pop an item from the stack
	int pop()
	{
		if(tos<0)
		{
			System.out.println("Stack underflow.");
			return 0;
		}
		else
			return stk[tos--];
	}
}

public class StackDemo {

	public static void main(String[] args) {
		Stack obj=new Stack();
		
		// push some numbers onto the stack
		for(int i=0;i<10;i++) obj.push(i);
		
		//pop those numbers off the stack
		System.out.println("Stack in obj");
		for(int i=0; i<10;i++)
			System.out.println(obj.pop());
		

	}

}
