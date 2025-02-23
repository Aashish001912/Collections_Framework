package com.aashish.Employee_Directory;

public class EmployeeDirectoryExample {

	public static void main(String[] args) 
	{
	  Directory d=new Directory();
	  
	  ///Adding EMployee
	  Employee e1=new Employee("Abhay", "developer", 12000);
	  Employee e2=new Employee("Aashish", " senior developer", 10000);
	  Employee e3=new Employee("pratyush", "helper", 1300);
	  d.addEmployee(e3);
	  d.addEmployee(e2);
	  d.addEmployee(e1);
	  
	  d.displayAllEmployees();
	  System.out.println("......................................");
	  
	  //update Index no 1 
	  d.updateEmployee(1,"Manager", 1200000);
	  System.out.println("After Updating in index no 1 Details:");
	  d.displayAllEmployees();
	  
	  System.out.println("......................................");
	  
	  //delete Index no 2
	  d.deleteEmployee(2);
	  System.out.println("After Delete Details:");
	  d.displayAllEmployees();
	}
	
	
	

}
