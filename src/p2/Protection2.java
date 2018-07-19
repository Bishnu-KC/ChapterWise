package p2;

public class Protection2 extends p1.Protection {
	Protection2()
	{
		System.out.println("Derived other package constructor:");
		//class or package only
		//System.out.println("n: "+n);
		//class only
		//System.out.println("pri: "+pri);
		System.out.println("pro: "+pro);
		System.out.println("pub: "+pub);
	}
	

}
