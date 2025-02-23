package com.aashish.ArrayList;

import java.util.ArrayList;
import java.util.Vector;

//Program on loose coupling

public class ArrayListDemo1
{
	public static void main(String[] args) 
	{
	 Vector<Integer> v1=new Vector<>();
	 v1.add(12);
	 v1.add(23);
	 v1.add(32);
	 v1.add(52);
	 System.out.println(v1);
	 
	 ArrayList<Integer> list=new ArrayList<>(v1);
	 System.out.println(list);
	}

}
