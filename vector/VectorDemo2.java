package com.aashish.vector;

import java.util.*;
import java.util.Vector;

//Array To Collection

public class VectorDemo2 
{
  public static void main(String[] args) 
  {
	Vector<Integer> v=new Vector<>();
	int x[]= {22,20,10,40,15,58};
	
	//Adding array values to Vector
	for(int i=0;i<x.length;i++)
	{
		v.add(x[i]);
	}
	Collections.sort(v);
	System.out.println("Maximum element is :"+Collections.max(v));
	System.out.println("Minimum element is :"+Collections.min(v));
	System.out.println("Vector element :");
	
	v.forEach(y->System.out.println(y));
	
	//Reverse
	System.out.println("________________________________");
	Collections.reverse(v);
	v.forEach(y->System.out.println(y));
	
	//Vector to Array
	Object[]array=v.toArray();
	System.out.println("Vector to array");
	System.out.println(Arrays.toString(array));
	
	
	
  }
}
