package com.aashish.ArrayList;

import java.util.ArrayList;

record Customer(Integer custID,String custName,Double custSal)
{
	
}

public class ArrayListDemo3 
{
	public static void main(String[] args) 
	{
	 ArrayList<Customer>listOfCustomer=new ArrayList<>();
	 listOfCustomer.add(new Customer(111,"Scott", 12000d));
	 listOfCustomer.add(new Customer(222,"Alen", 14000d));
	 listOfCustomer.add(new Customer(333,"Smith", 18000d));
	 listOfCustomer.add(new Customer(444,"Martin", 15000d));
	 listOfCustomer.add(new Customer(555,"Alice", 17000d));
	 
	 listOfCustomer.forEach(System.out::println);
	}

}
