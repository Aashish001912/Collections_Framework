package com.aashish.TreeSet;

import java.util.Comparator;
import java.util.TreeSet;

record Products(Integer pid,String pname)
{
	public Products
	{
		if(pid<=0)
		{
			throw new IllegalArgumentException("Product ID must be greater than zero."); 
		}
	}
}
public class ProductTreeSet 
{
	public static void main(String[] args) 
	{
	  TreeSet<Products>sortedByPidAsc=new TreeSet<>(Comparator.comparingInt(Products::pid));
	  TreeSet<Products>sortedByPidDesc=new TreeSet<>(Comparator.comparingInt(Products::pid).reversed());
	  TreeSet<Products> sortedByNameAsc = new TreeSet<>(Comparator.comparing(Products::pname));
	  TreeSet<Products> sortedByNameDesc = new TreeSet<>(Comparator.comparing(Products::pname).reversed());  
      
	  
	  //Example products to add to the TreeSet
	  Products products1 = new Products(1, "Apple");  
      Products products2 = new Products(2, "Banana");  
      Products products3 = new Products(3, "Cherry");  
      Products products4 = new Products(4, "Date");
      
      // Adding products to the TreeSets  
      sortedByPidAsc.add(products1);  
      sortedByPidAsc.add(products2);  
      sortedByPidAsc.add(products3);  
      sortedByPidAsc.add(products4);  

      sortedByPidDesc.add(products1);  
      sortedByPidDesc.add(products2);  
      sortedByPidDesc.add(products3);  
      sortedByPidDesc.add(products4);  

      sortedByNameAsc.add(products1);  
      sortedByNameAsc.add(products2);  
      sortedByNameAsc.add(products3);  
      sortedByNameAsc.add(products4);  

      sortedByNameDesc.add(products1);  
      sortedByNameDesc.add(products2);  
      sortedByNameDesc.add(products3);  
      sortedByNameDesc.add(products4); 
      
      // Printing the sorted products  
      System.out.println("Sorted by pid (Ascending): " + sortedByPidAsc);  
      System.out.println("Sorted by pid (Descending): " + sortedByPidDesc);  
      System.out.println("Sorted by pname (Alphabetical): " + sortedByNameAsc);  
      System.out.println("Sorted by pname (Reverse): " + sortedByNameDesc);  
	 
	}

}
