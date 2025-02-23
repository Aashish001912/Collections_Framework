package com.aashish.vector;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/*It is a default method provided inside
Enumeration interface from java 9V. It will return Iteartor interface Object so
we can apply Iterator interface method.*/

record product1(int productId,String productName)
{
	
}

public class VectorDemo6 
{
	public static void main(String[] args) 
	{
	 Vector<product1> listOfProduct1=new Vector<>();
	 listOfProduct1.add(new product1(111,"Laptop"));
	 listOfProduct1.add(new product1(222,"Cemra"));
	 listOfProduct1.add(new product1(333,"Mobile"));
	 listOfProduct1.add(new product1(444,"Bag"));
	 listOfProduct1.add(new product1(555,"Watch"));
	 
	 Enumeration<product1>ele=listOfProduct1.elements();
	 
	 Iterator<product1>itr=ele.asIterator();
	 itr.forEachRemaining(System.out::println);
	}

}
