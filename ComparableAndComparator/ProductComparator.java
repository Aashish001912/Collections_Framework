package com.aashish.ComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;

record Product(Integer id,String name)
{
	
}
public class ProductComparator 
{
	public static void main(String[] args) 
	{
	ArrayList<Product>listOfProduct=new ArrayList<>();
	listOfProduct.add(new Product(333, "Laptop"));
	listOfProduct.add(new Product(111, "Mobile"));
	listOfProduct.add(new Product(222, "Camera"));
	System.out.println("Original Data");
	listOfProduct.forEach(System.out::println);
	System.out.println("**********************");
	System.out.println("Sorted Data based on Id:");
	Collections.sort(listOfProduct,(p1,p2)->p1.id().compareTo(p2.id()));
	listOfProduct.forEach(System.out::println);
	System.out.println("***********************");
	Collections.sort(listOfProduct,(p1,p2)->p1.name().compareTo(p2.name()));
	listOfProduct.forEach(System.out::println);
	}

}
