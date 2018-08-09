package com.f.packageinterface.practise;

class Student {
	int rollNumber;
	void getNumber(int n)
	{
		rollNumber=n;
	}
	void setNumber()
	{
		System.out.println("Roll No: "+rollNumber);
	}
}
class Test extends Student {
	float part1, part2;
	void getMarks(float m1, float m2)
	{
		part1=m1;
		part2=m2;
	}
	void setMarks()
	{
		System.out.println("Marks Obtained:");
		System.out.println("part1: "+part1);
		System.out.println("part2: "+part2);
	}
}
interface Sports {
	float sportWt=6.0f;
	void setwt();
}
class Results extends Test implements Sports {
	float total;
	public void setwt()
	{
		System.out.println("Sports Wt: "+sportWt);
	}
	void display()
	{
		total=part1+part2+sportWt;
		setNumber();
		setMarks();
		setwt();
		System.out.println("Total score: "+total);
	}
}

public class MultipleInheritance {

	public static void main(String[] args) {
		Results r=new Results();
		r.getNumber(1234);
		r.getMarks(27.5f, 33.0f);
		r.display();
		

	}

}
