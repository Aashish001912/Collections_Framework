package com.aashish.HashSet;

import java.util.HashSet;
import java.util.Scanner;

public class HashSetDemo3
{
	public static void main(String[] args) 
	{
	HashSet<String>listOfElement=new HashSet<>();
	Scanner sc=new Scanner(System.in);
	while(true)
	{
		System.out.println("Options:");
		System.out.println("1. Add element");
		System.out.println("2. Delete element");
		System.out.println("3. Display HashSet");
		System.out.println("4. Exit");
        
		System.out.println("Enterc your Choice:");
		int choice=sc.nextInt();
		
		switch(choice)
		{
		case 1:System.out.println("Enter the element tob add:");
		       String elementToAdd=sc.next();
		       if(listOfElement.add(elementToAdd))
		       {
		    	   System.out.println("Element add sucessfully");
		       }
		       else 
		       {
		    	   System.err.println("Elemnt not added");
		       }
		       break;
		case 2:System.out.println("Enter the element to delete:");
		       String elementToDelete=sc.next();
		       if(listOfElement.remove(elementToDelete))
		       {
		    	   System.out.println("Element to be deleted sucessfully");
		       }
		       else 
		       {
		    	   System.err.println("Element not deleted");
		       }
		       break;
		case 3:System.out.println("Elements of Hashset:");
		       listOfElement.forEach(System.out::println);
               break;
		case 4:System.out.println("Exiting Program");
		       sc.close();
		       System.exit(0);
		default:System.out.println("Invalid choice");
		
		}
		System.out.println();
	}
	}

}
