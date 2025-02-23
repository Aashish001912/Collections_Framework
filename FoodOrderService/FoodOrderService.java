package com.aashish.FoodOrderService;

import java.util.ArrayList;

public class FoodOrderService
{
  private ArrayList<FoodCustomer>customers=new ArrayList<>();
  
  public void placeOrder(FoodCustomer foodCustomer)
  {
	  customers.add(foodCustomer);
  }
  
  public boolean isFirstTimeCustomer (FoodCustomer foodCustomer)
  {
	  for(FoodCustomer c:customers)
	  {
		  if(c.getPhoneNumber().equals(foodCustomer.getPhoneNumber()))
		  {
			  return false;
		  }
	  }
	return true;
	  
  }
  public double calculateBill(FoodCustomer customer, double baseCharge) 
  {
	  return isFirstTimeCustomer(customer) ? 0.0 : baseCharge;
  }
  
  public String printBill(FoodCustomer customer, double billAmount) 
  {
      return "Order confirmed for " + customer.getCustomerName() + " with bill amount: " + billAmount;
  }
}
