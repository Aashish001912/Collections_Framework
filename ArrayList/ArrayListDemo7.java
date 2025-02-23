package com.aashish.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

//Collections class has provided static method called reverseOrder()
//to reverse the Collection data, the return type of this method is Comparator<T> interface.

public class ArrayListDemo7
{
   public static void main(String[] args) 
   {
	ArrayList<String>cities=new ArrayList<>();
	cities.add("Hyd");
	cities.add("gzb");
	cities.add("indore");
	cities.add("mumbai");
	cities.add("delhi");
	System.out.println("Before sorting:"+cities);
	
	Collections.sort(cities);
	System.out.println("After sorting(Ascending):"+cities);
	Collections.sort(cities, Collections.reverseOrder());
	System.out.println("After sorting (Descending):"+cities);
   }
}
