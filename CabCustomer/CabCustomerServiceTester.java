package com.aashish.CabCustomer;

public class CabCustomerServiceTester {

	public static void main(String[] args)
	{
	CabCustomerService service=new CabCustomerService();
	CabCustomer customer1=new CabCustomer(1,"Abhay", "Ameerprt", "station", 2, "9711874290");
	CabCustomer customer2=new CabCustomer(2,"Abhi", "Ameerprt", "permapur", 150, "9713874290");
	CabCustomer customer3=new CabCustomer(3,"Pratyush", "Ameerprt", "delhi", 1200, "9211874290");	
	
	service.addCabCustomer(customer1);
	service.addCabCustomer(customer2);
	service.addCabCustomer(customer3);
	
	service.printBill(customer1);
	service.printBill(customer2);
	service.printBill(customer3);
	}

}
