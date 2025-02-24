package com.aashish.TreeSet;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo4 
{
	public static void main(String[] args)
	{
	Set<String>t=new TreeSet<>((s1,s2)->s2.compareTo(s1));
	t.add("6");
	t.add("5");
	t.add("4");
	t.add("2");
	t.add("9");
    Iterator<String>itr=t.iterator();
    itr.forEachRemaining(x->System.out.println(x));
	}

}
