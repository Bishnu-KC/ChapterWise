package com.e.inheritance.practise;

public class AbstractionDemo 
{
	private static int num=10;
	private String str="Test";
	
	public static void main(String args[])
	{
		AbstractionDemo a=new AbstractionDemo();
		a.setNum(20);
		System.out.println((int)a.getNum());
		System.out.println(a.getStr());
			}
	public static int getNum() {
		return num;
	}
	public static void setNum(int num) {
		AbstractionDemo.num = num;
	}
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}

}