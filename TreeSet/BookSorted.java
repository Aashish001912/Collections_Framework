package com.aashish.TreeSet;

import java.util.TreeSet;

record Book (String name,String author) implements Comparable<Book>
{

	@Override
	public int compareTo(Book b)
	{
		return this.name.compareTo(b.name) ;
	}
	
}
public class BookSorted
{
	public static void main(String[] args)
	{
     TreeSet<Book>b1=new TreeSet<>();
     b1.add(new Book("Java", "James Ghosling"));
     b1.add(new Book("Orcale", "Vijay Kumar Sir"));
     b1.add(new Book("Html", "Shiv kumar Sir"));
     b1.add(new Book("C", "ksihore sir"));
     
     System.out.println("Sorted by Name:");
     for(Book b:b1)
     {
    	 System.out.println("Name: " + b.name() + ", Author: " + b.author()); 
     }
     
	}
	

}
