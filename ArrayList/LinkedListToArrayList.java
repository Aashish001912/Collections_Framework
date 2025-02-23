package com.aashish.ArrayList;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListToArrayList 
{
	public static void main(String[] args) 
	{
	  LinkedList<String> listOfFruits=new LinkedList<>();
	  listOfFruits.add("Apple");
	  listOfFruits.add("Banana");
	  listOfFruits.add("Grapes");
	  listOfFruits.add("Guava");
	  listOfFruits.add("Kiwi");
	  System.out.println("List of Fruits in LinkedList:"+listOfFruits);
	  
	  //Coverted into ArrayList
	  ArrayList<String>listOfFruits2=new ArrayList<>(listOfFruits);
	  System.out.println("List of Fruits in ArrayList:"+listOfFruits2);
	}

}
