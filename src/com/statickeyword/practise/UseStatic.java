package com.statickeyword.practise;

class Use {
	static int a=42;
	static int b=99;
	static void call()
	{
		System.out.println("A: "+a);
	}
}
class UseStatic {
	public static void main(String[] args) {
		Use.call();
		System.out.println("B: "+Use.b);
		

	}

}
