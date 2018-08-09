package com.d.classobject.pratise;

public class GetterSetterDemo {
	static int a=10;
	static double b=13.5;
	String s="Bishnu";
	float f=3.5f;
	public static int getA() {
		return a;
	}
	public static void setA(int a) {
		GetterSetterDemo.a = a;
	}
	public static double getB() {
		return b;
	}
	public static void setB(double b) {
		GetterSetterDemo.b = b;
	}
	public String getS() {
		return s;
	}
	public void setS(String s) {
		this.s = s;
	}
	public float getF() {
		return f;
	}
	public void setF(float f) {
		this.f = f;
	}
	public static void main(String args[])
	{
		GetterSetterDemo x=new GetterSetterDemo();
		x.setA(20);
		System.out.println((int)x.getA());
		System.out.println(x.getB());
		System.out.println(x.getF());
		System.out.println(x.getS());
	}

}
