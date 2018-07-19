package p2;

public class OtherPackage {
	OtherPackage()
	{
		p1.Protection p=new p1.Protection();
		System.out.println("Other package constructor");
		//class or package only
		//System.out.println("n: "+p.n);
		//class only
		//System.out.println("pri: "+p.pri);
		//class, subclass or package only
		//System.out.println("pro: "+p.pro);
		
		System.out.println("pub: "+p.pub);
	}

}
