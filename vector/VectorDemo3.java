package com.aashish.vector;

import java.util.*;


record product(Integer id,String name)
{
	
}

public class VectorDemo3
{
	public static void main(String[] args) 
	{
	 Vector<product> listOfProduct=new Vector<>();
	 listOfProduct.add(new product(333,"Mobile"));
	 listOfProduct.add(new product(222,"Camera"));
	 listOfProduct.add(new product(111,"Laptop"));
	 listOfProduct.add(new product(444,"Tablet"));
	 
	 listOfProduct.forEach(System.out::println);
	}

}
