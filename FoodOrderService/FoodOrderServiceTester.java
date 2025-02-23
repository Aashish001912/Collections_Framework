package com.aashish.FoodOrderService;

public class FoodOrderServiceTester
{
	public static void main(String[] args) 
	{
	 FoodOrderService fs=new FoodOrderService();
	 FoodCustomer fc1=new FoodCustomer(111,"Abhay","Jaunpur","98323");
	 FoodCustomer fc2=new FoodCustomer(222,"Pratyush","Varanasi","45678");
	 
	 fs.placeOrder(fc1);
	 fs.placeOrder(fc2);
	 
	 System.out.print(fs.isFirstTimeCustomer(fc1) ? "Yes, " : "No, ");
     System.out.print(fs.isFirstTimeCustomer(fc2) ? "Yes, " : "No, ");

     double bill1 = fs.calculateBill(fc1, 50.0);
     double bill2 = fs.calculateBill(fc2, 50.0);

     System.out.print(bill1 == 0.0 ? "Yes, " : "No, ");
     System.out.print(bill2 == 0.0 ? "Yes" : "No");

     System.out.println("\n" + fs.printBill(fc1, bill1));
     System.out.println(fs.printBill(fc2, bill2));
	}

}
