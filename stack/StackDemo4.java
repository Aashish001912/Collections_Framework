package com.aashish.stack;

import java.util.Stack;

public class StackDemo4 {
	public static void main(String[] args) 
	{
		Stack<String> stk= new Stack<>();
		stk.push("Apple");
		stk.push("Grapes");
		stk.push("Mango");
		System.out.println("Offset Position is : " + stk.search("Mango")); //1
		System.out.println("Offset Position is : " + stk.search("Banana")); //-1
		System.out.println("Is stack empty ? "+stk.empty()); //false
		System.out.println("Index Position is : " + stk.indexOf("Mango")); //2

	}

}
