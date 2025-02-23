package com.aashish.Employee_Directory;

public class Employee 
{
  private String name;
  private String position;
  double Salary;
  public Employee(String name, String position, double salary) {
	super();
	this.name = name;
	this.position = position;
	Salary = salary;

  }
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPosition() {
	return position;
}
public void setPosition(String position) {
	this.position = position;
}
public double getSalary() {
	return Salary;
}
public void setSalary(double salary) {
	Salary = salary;
}
@Override
public String toString() {
	return "Employee [name=" + name + ", position=" + position + ", Salary=" + Salary + "]";
}
  
   
  
  
  
}
