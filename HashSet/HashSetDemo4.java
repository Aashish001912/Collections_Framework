package com.aashish.HashSet;

import java.util.HashSet;

public class HashSetDemo4
{
	public static void main(String[] args) 
	{
	HashSet<String>hs1=new HashSet<>();
	hs1.add(new String("India"));
	hs1.add(new String("India"));
	System.out.println(hs1.size());
	System.out.println(hs1);
	
	System.out.println(".............");
	HashSet<StringBuffer> hs2 = new HashSet<>();
	hs2.add(new StringBuffer("india"));
	hs2.add(new StringBuffer("india"));
	System.out.println(hs2.size());
	System.out.println(hs2);

	}

}
