package com.aashish.ComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;

public class IntegerDesc
{
	public static void main(String[] args) 
	{
	ArrayList<Integer>al=new ArrayList<>();
	al.add(300);
	al.add(400);
	al.add(100);
	al.add(200);
    Collections.sort(al,(i1,i2)->i1.compareTo(i2));
    System.out.println(al);
	}

}
