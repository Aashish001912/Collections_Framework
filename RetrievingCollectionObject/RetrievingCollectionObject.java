package com.aashish.RetrievingCollectionObject;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Spliterator;
import java.util.Vector;

public class RetrievingCollectionObject 
{

	public static void main(String[] args)
	{
	  Vector<String>fruits=new Vector<>();
	  fruits.add("orange");
	  fruits.add("Apple");
	  fruits.add("Mango");
	  fruits.add("Kiwi");
	  fruits.add("Grapes");
	  
	  System.out.println("1) By Using To String Method:");
	  System.out.println(fruits.toString());
	  
	  System.out.println("2) BY USING ORDINARY FOR LOOP :");
	  for(int i=0;i<fruits.size();i++)
      {
    	  System.out.println(fruits.get(i));
      }
	  
	  System.out.println("3) BY USING FOR EACH LOOP :");
	  for(String fruit:fruits)
	  {
		  System.out.println(fruit);
	  }
	  
	  System.out.println("4) BY USING ENUMARATION INTERFACE :");
	  Enumeration<String> ele = fruits.elements();
	  while(ele.hasMoreElements())
	  {
	  System.out.println(ele.nextElement());
	  }
	  
	  System.out.println("5) BY USING ITERATOR INTERFACE :");
	  Iterator<String>itr=fruits.iterator();
	  itr.forEachRemaining(fruit->System.out.println(fruit));
	  
	  System.out.println("6) BY USING LISTITERATOR INTERFACE :");
      ListIterator<String>IstItr=fruits.listIterator();
      System.out.println("In forward Direction");
      while(IstItr.hasNext())
      {
    	  System.out.println(IstItr.next());
      }
      System.out.println("In Backward Direction :");
      while(IstItr.hasPrevious())
      {
      System.out.println(IstItr.previous());
      }
      
      System.out.println("7) BY USING SPLITERATOR INTERFACE");
      Spliterator<String> splltr=fruits.spliterator();
      splltr.forEachRemaining(fruit->System.out.println(fruit));
      
      System.out.println("8) BY USING FOREACH METHOD :");
      fruits.forEach(fruit->System.out.println(fruit));
	 
      System.out.println("9) BY USING METHOD REFERENCE :");
      fruits.forEach(System.out::println);

	}

}