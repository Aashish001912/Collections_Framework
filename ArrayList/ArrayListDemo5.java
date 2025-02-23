package com.aashish.ArrayList;

import java.util.ArrayList;

public class ArrayListDemo5
{
	public static void main(String[] args) 
	{
	 ArrayList<Integer> AL=new ArrayList<>();
	 AL.add(23);
	 AL.add(43);
	 AL.add(53);
	 AL.add(273);
	 AL.add(253);
	 
	 System.out.println(AL);
	 
	 //using by index
	 AL.remove(2);
	 System.out.println(AL);
	 
	 //using by object
	 AL.remove(Integer.valueOf(43));
	 System.out.println(AL);
	}

}
