package p1;

public class Derived extends Protection {
	Derived()
	{
		System.out.print("Derived Constructor: ");
		System.out.println("n: "+n);
		//class only
		//System.out.println("pri: "+pri);
		System.out.println("pro: "+pro);
		System.out.println("pub: "+pub);
	}

}
