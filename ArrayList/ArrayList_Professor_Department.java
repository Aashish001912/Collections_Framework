package com.aashish.ArrayList;

import java.util.ArrayList;
import java.util.List;

record  Professor(String name,String specializaton)
{
	
}
class Department
{
	private String departmentName;
	private List<Professor>professors;
	public Department(String departmentName) 
	{
		super();
		this.departmentName = departmentName;
		this.professors = new ArrayList<Professor>(); //Composition
 
	}
	public void addProfessor(Professor prof)
	{
	this.professors.add(prof);
	}
	public String getDepartmentName()
	{
	return departmentName;
	}
	public List<Professor> getProfessors()
	{
	return professors;
	}

    
}



public class ArrayList_Professor_Department
{
	public static void main(String[] args) 
	{
	Department dept=new Department("Computer science");
	dept.addProfessor(new Professor("Ravi sharkar", "Core java"));
	dept.addProfessor(new Professor("Mr James","Java"));
	dept.addProfessor(new Professor("Mr Scott","Python"));
	dept.addProfessor(new Professor("Mr Smith","Adv Java"));
	dept.addProfessor(new Professor("Mr Martin",".NET"));
    
	System.out.println("Department Name is :"+dept.getDepartmentName());
	System.out.println("Professor in :"+dept.getDepartmentName()+" department :");
	List<Professor> professors = dept.getProfessors();
	professors.forEach(System.out::println);
	}

}
