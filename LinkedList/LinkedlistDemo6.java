package com.aashish.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

record Product(Integer productId,String productName)
{
	
}
public class LinkedlistDemo6
{
	public static void main(String[] args) 
	{
	 List<Product>listOfProduct=new LinkedList<Product>();
	 listOfProduct.add(new Product(111, "Miphone"));
	 listOfProduct.add(new Product(222, "iphone"));
	 listOfProduct.add(new Product(333, "Motophone"));
	 listOfProduct.add(new Product(444, "vivophone"));
	 
	 System.out.println("Is list Empty:"+listOfProduct.isEmpty());
	 
	 Iterator<Product>ltr=listOfProduct.iterator();
	 ltr.forEachRemaining(prod->System.out.println(prod.productName().toUpperCase()));
	
	 String productName = listOfProduct.get(1).productName();
	 System.out.println("1st position product name is :"+productName);
	}

}
