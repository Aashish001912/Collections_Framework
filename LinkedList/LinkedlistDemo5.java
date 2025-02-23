package com.aashish.LinkedList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedlistDemo5 
{
  public static void main(String[] args) 
  {
	List<String>listOfName=Arrays.asList("Ravi","Ashu","balu","scahin");
	LinkedList<String>list=new LinkedList<>(listOfName);
	list.forEach(System.out::println);
  }
}
