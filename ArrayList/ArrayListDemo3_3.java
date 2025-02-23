package com.aashish.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

//Program to fetch the elements in forward and backward 
public class ArrayListDemo3_3 
{
	public static void main(String[] args) 
	{
	List<String>listOfName=Arrays.asList("Rohit","Akshar","Pallavi","Sweata");
	Collections.sort(listOfName);
	
    //Fetching the data in both the direction
	ListIterator<String>ltr=listOfName.listIterator();
	System.out.println("In forward Direction..");
	while(ltr.hasNext())
	{
		System.out.println(ltr.next());
	}
	
	System.out.println("In backword Direcytion..");
	while(ltr.hasPrevious())
	{
		System.out.println(ltr.previous());
	}
	}

}
