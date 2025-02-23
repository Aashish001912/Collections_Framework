package com.aashish.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo6
{
  public static void main(String[] args) 
  {
	  ArrayList<String> list = new ArrayList<>();
      list.add("Apple");
      list.add("Banana");
      list.add("Cherry");
      list.add("Date");
      list.add("Elderberry");
      
      //Forward traversal using Iterator
      System.out.println("Forward traversal using Iterator:");
      Iterator<String>itr=list.iterator();
      while(itr.hasNext())
      {
    	  System.out.println(itr.next());
      }
      
      //Backword traversal using ListIterator
      System.out.println("Backword traversal using Iterator:");
      ListIterator<String>litr=list.listIterator(list.size());
      while(litr.hasPrevious())
      {
    	  System.out.println(litr.previous());
      }
  }
}
