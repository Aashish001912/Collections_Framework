package com.aashish.TreeSet;

import java.util.TreeSet;

record Student(Integer id,Double fees)
{
	
}
public class TreeSetDemo6 
{
	public static void main(String[] args) 
	{
	 TreeSet<Student>ts1=new TreeSet<>((s1,s2)->Integer.compare(s1.id(), s2.id()));
	 ts1.add(new Student(333, 25000D));
	 ts1.add(new Student(222, 2200D));
	 ts1.add(new Student(111, 20000D));
	 System.out.println("Sorting student data based on the Id");
	 
	 for(Student st:ts1)
	 {
		 System.out.println(st);
	 }
	 System.out.println("=================================");
	 TreeSet<Student> ts2 = new TreeSet<>((s1,s2) -> Double.compare(s1.fees(), s2.fees()));
	 ts2.add(new Student(333, 25000D));
	 ts2.add(new Student(222, 2200D));
	 ts2.add(new Student(111, 20000D));
	 System.out.println("Sorting student Data based on the Fees :");
	 for(Student st : ts2)
	 {
	 System.out.println(st);
	 }

	 
	}

}
