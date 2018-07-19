package p1;

public class SamePackage {
	SamePackage()
	{
		Protection p=new Protection();
		System.out.println("Same package constructor:");
		System.out.println("n: "+p.n);
		// class only
		//System.out.println("pri: "+p.pri);
		System.out.println("pro: "+p.pro);
		System.out.println("pub: "+p.pub);
	}

}
