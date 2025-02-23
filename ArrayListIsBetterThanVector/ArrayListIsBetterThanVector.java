package com.aashish.ArrayListIsBetterThanVector;

import java.util.*;

public class ArrayListIsBetterThanVector
{
	public static void main(String[] args) 
	{
     ArrayList<Integer>AL=new ArrayList<>();
     
     long startTime=System.currentTimeMillis();
     for(int i=0;i<100000;i++)
     {
    	 AL.add(i);
     }
     long endTime=System.currentTimeMillis();
     System.out.println("Total time taken by ArrayList class :"+(endTime - startTime)+"ms ");
     Vector<Integer> v1 = new Vector<>();
     startTime = System.currentTimeMillis();
     for(int i=0; i<1000000; i++)
     {
     v1.add(i);
  	 }
  	 endTime = System.currentTimeMillis();
  	 System.out.println("Total time taken by Vector class :"+(endTime - startTime)+"ms ");

	}

}
