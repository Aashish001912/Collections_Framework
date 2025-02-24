package com.aashish.TreeSet;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo5
{
	public static void main(String[] args) 
	{
	Set<Character>t=new TreeSet<>((c1,c2)->c2.compareTo(c1));
	t.add('A');
	t.add('C');
	t.add('B');
	t.add('E');
	t.add('D');
    Iterator<Character>itr=t.iterator();
    itr.forEachRemaining(x->System.out.println(x));
	}

}
