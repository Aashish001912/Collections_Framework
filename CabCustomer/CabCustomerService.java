package com.aashish.CabCustomer;

import java.util.ArrayList;

public class CabCustomerService
{
 private ArrayList<CabCustomer>customerList=new ArrayList<>();
 
  public void  addCabCustomer(CabCustomer customer)
  {
	 customerList.add(customer);
  }
  public boolean isFirstCustomer(CabCustomer customer)
  {
	  for(CabCustomer c:customerList)
	  {
		  if(c.getPhone().equals(customer.getPhone()))
		  {
			  return false;//Existing customer
		  }
	  }
	  return true;  //new customer
  }
  public double calculateBill(CabCustomer customer)
  {
	  if(isFirstCustomer(customer))
	  {
		  return 0;
	  }
	  int distance=customer.getDistanca();
	  if(distance<=4)
	  {
		  return 80;
		 
	  }
	  else {
		  return 80+(6*distance);
	  }
  }
  public void printBill(CabCustomer customer)
  {
	  double billAmount=calculateBill(customer);
	  System.out.println(customer.getCustomerName()+ " "+billAmount+" Please pay");
  }
  
  
}
