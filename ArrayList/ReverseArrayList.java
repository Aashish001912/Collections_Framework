package com.aashish.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList 
{

	public static void main(String[] args) 
	{
	 ArrayList<String> listOfBatters=new ArrayList<>();
	 listOfBatters.add("Virat Kholi");
	 listOfBatters.add("Rohit sharma");
	 listOfBatters.add("Bumrah");
	 listOfBatters.add("Hardik pandaya");
	 listOfBatters.add("Rishabh pant");
	 Collections.sort(listOfBatters);
	 System.out.println("Sorted List:"+listOfBatters);
	 Collections.reverse(listOfBatters);
	 System.out.println("Reverse list :"+listOfBatters);
	 
	}

}
