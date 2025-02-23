package com.aashish.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist_Demo
{
	public static void main(String[] args) 
	{
	 LinkedList<Object>list=new LinkedList<>();
	 list.add("Ravi");
	 list.add("Vijay");
	 list.add(null);
	 list.add("Ravi");
	 list.add(42);
	 System.out.println("1st Position Elemnet is:"+list.getFirst());
	 
	 //Iterator interface
	 Iterator<Object>itr=list.iterator();
	 itr.forEachRemaining(System.out::println);
	}

}
