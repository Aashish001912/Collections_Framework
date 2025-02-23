package com.aashish.ComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;

record Customer(Integer id,String name)implements Comparable<Customer>
{

	@Override
	public int compareTo(Customer c2) 
	{
		return this.id-c2.id;
	}
	
}

public class CustomerComparable 
{
	public static void main(String[] args) 
	{
     ArrayList<Customer>listOfCustomer=new ArrayList<>();
     listOfCustomer.add(new Customer(333, "Scott"));
     listOfCustomer.add(new Customer(111, "Zuber"));
     listOfCustomer.add(new Customer(222, "Aryan"));
     
     System.out.println("Original Data :");
     listOfCustomer.forEach(System.out::println);
     
     Collections.sort(listOfCustomer);
     System.out.println("Data After sorting based on the ID :");
     listOfCustomer.forEach(System.out::println);
	}

}
