package com.aashish.LinkedHashSet;

import java.util.LinkedHashSet;

public class LinkedHashsetDemo1
{
	public static void main(String[] args) 
	{
	LinkedHashSet<Integer>lhs2=new LinkedHashSet<>();
	lhs2.add(10);
	lhs2.add(5);
	lhs2.add(15);
	lhs2.add(20);
	lhs2.add(5);
	
	System.out.println("LinkedHashSet elements:"+lhs2);
	System.out.println("LinkedHashSet elements:"+lhs2.size());
	
	int elementToCheck = 15;
	if (lhs2.contains(elementToCheck))
	{
	System.out.println(elementToCheck + " is present in the LinkedHashSet.");
	}
	else
	{
	System.out.println(elementToCheck + " is not present in the LinkedHashSet.");
	}
	int elementToRemove = 10;
	lhs2.remove(elementToRemove);
	System.out.println("After removing " + elementToRemove + ", LinkedHashSet elements: " +lhs2);
	lhs2.clear();
	System.out.println("After clearing, LinkedHashSet elements: " + lhs2);

	}

}
