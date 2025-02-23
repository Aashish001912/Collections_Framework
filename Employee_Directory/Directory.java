package com.aashish.Employee_Directory;

import java.util.ArrayList;

public class Directory
{
  ArrayList<Employee>listOfEmployee=new ArrayList<>();
  
  public void addEmployee(Employee employee)
  {
	  listOfEmployee.add(employee);
  }
  
  public void displayAllEmployees()
  {
	  for(Employee emp:listOfEmployee)
	  {
		  System.out.println(emp);
	  }
  }
  

  // Update an employee's details
  public void updateEmployee(int index, String position, double salary)
  {
      if (index >= 0 && index < listOfEmployee.size())
      {
          Employee emp = listOfEmployee.get(index);
          emp.setPosition(position);
          emp.setSalary(salary);
      } else 
      {
          System.out.println("Invalid index");
      }
  }
  
  public void deleteEmployee(int index)
  {
	  if(index>=0 && index <listOfEmployee.size())
	  {
		  listOfEmployee.remove(index);
	  }
	  else {
		  System.out.println("Invalid index...");
	  }
  }
  
}
