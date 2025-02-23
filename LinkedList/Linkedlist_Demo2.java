package com.aashish.LinkedList;

import java.util.LinkedList;

public class Linkedlist_Demo2

{
	public static void main(String[] args) 
	{
		LinkedList<String> list = new LinkedList<>();
		list.addFirst("Ravi"); // Rahul
		list.add("Rahul");
		list.addLast("Anand");
		System.out.println(list);
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		list.removeFirst();
		list.removeLast();
		System.out.println(list); //[Rahul]

	}

}
