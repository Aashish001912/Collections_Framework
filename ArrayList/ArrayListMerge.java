package com.aashish.ArrayList;

import java.util.ArrayList;

public class ArrayListMerge {

	public static void main(String[] args)
	{
	 ArrayList<String> listOfFruits1=new ArrayList<>();
	 listOfFruits1.add("Apple");
	 listOfFruits1.add("Banana");
	 listOfFruits1.add("Guava");
	 System.out.println(listOfFruits1);
	 
	 ArrayList<String> listOfFruits2=new ArrayList<>();
	 listOfFruits2.add("Kiwi");
	 listOfFruits2.add("Grapes");
	 System.out.println(listOfFruits2);
	 
	 listOfFruits1.addAll(listOfFruits2);
	 System.out.println(listOfFruits1);
	 
	 
	}

}
