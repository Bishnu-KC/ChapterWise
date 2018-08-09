package com.j.collectionframework.practise;
import java.util.*;
public class CallStudentArrayList extends Student{
	
		public CallStudentArrayList(String stuName, int rollNo, int stuAge)
		{
			super(stuName, rollNo, stuAge);
			
		}
		public static void main(String[] args) {
			
			sampleTestforPOJO();

		}
		public static void sampleTestforPOJO()
		{
			ArrayList<Student> arrayList= new ArrayList<Student>();
			arrayList.add(new Student("Bishnu",11,23));
			arrayList.add(new Student("Shiva",12,24));
			arrayList.add(new Student("Bharma",13,24));
			System.out.println(arrayList);
		}

	}

