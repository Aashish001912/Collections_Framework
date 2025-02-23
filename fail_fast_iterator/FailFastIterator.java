package com.aashish.fail_fast_iterator;

/*
 * While retrieving the object from the collection by using Itearor interface or for each loop, if at any
   point of time the original structure is going to modify after the creation of Itearator then we will
   get java.util.ConcurrentModificationExacption.
*/

import java.util.Iterator;
import java.util.Vector;

class Concurrent extends Thread
{
	private Vector<String> cities=null;

	public Concurrent(Vector<String> cities) 
	{
		super();
		this.cities = cities;
	}

	@Override
	public void run() 
	{
	 try 
	 {
	  Thread.sleep(1000);	 
	 }
	 catch (Exception e)
	 {
	  e.printStackTrace();
	 }
	 cities.add("Ameerpet");
	}	
}

public class FailFastIterator 
{	
	public static void main(String[] args) throws InterruptedException 
	{
		Vector<String>cityName=new Vector<>();
		cityName.add("Indore");
		cityName.add("Bhudneswar");
		cityName.add("Hydrabad");
		cityName.add("Mumbai");
		
		Concurrent c1=new Concurrent(cityName);
		c1.start();
		
		Iterator<String>itr=cityName.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			Thread.sleep(500);
		}
	}

}
