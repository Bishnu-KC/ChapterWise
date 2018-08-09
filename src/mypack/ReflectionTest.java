package mypack;
class Simple{}
public class ReflectionTest {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		
		Class c=boolean.class;
		System.out.println(c.getName());
		
		Class c1=ReflectionTest.class;
		System.out.println(c1.getName());
		
		//Class c2=Class.forName("Simple");
		//System.out.println(c2.getName());
		

	}

}
