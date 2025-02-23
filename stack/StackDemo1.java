package com.aashish.stack;

import java.util.Stack;

public class StackDemo1
{
	public static void main(String[] args) 
	{
	 Stack<Integer> s=new Stack<>();
	 try
	 {
		 s.push(12);
		 s.push(15);
		 s.push(17);
		 s.push(22);
		 s.push(27);
		 System.out.println("After insertion elements are :"+s);
		 
		 System.out.println("Fetching the elements using pop method");
		 System.out.println(s.pop());
		 System.out.println(s.pop());
		 System.out.println(s.pop());
		 System.out.println(s.pop());
		 System.out.println(s.pop());
         
		 System.out.println("After deletion elements are :"+s);
		 System.out.println("Is the Stack empty ? :"+s.empty());

	 }
	 catch (Exception e) {
		e.printStackTrace();
	}
	}

}
