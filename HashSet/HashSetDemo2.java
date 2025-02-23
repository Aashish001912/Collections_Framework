package com.aashish.HashSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSetDemo2
{
	public static void main(String[] args) 
	{
	 Boolean arr[]= new Boolean[5];
	 Set<Object>set=new HashSet<>();
	 arr[0]=set.add(12);
	 arr[1]=set.add(12);
	 arr[2]=set.add(14);
	 arr[3]=set.add(14);
	 arr[4]=set.add(15);
	 
	 System.out.println(Arrays.toString(arr));
	 
	 //Data Fetch By Set
	 set.forEach(System.out::println);
	 
	 //Check 15 is available or not?
	 if(set.contains(15))
	 {
		 System.out.println("15 is available");
	 }
	 else 
	 {
		 System.out.println("15 is not available");
	 }
	}

}
