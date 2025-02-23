package com.aashish.HashSet;

import java.util.Collections;
import java.util.HashSet;

public class HashSetDemo 
{
	public static void main(String[] args) 
	{
	 HashSet<Integer>hs=new HashSet<>();
	 hs.add(43);
	 hs.add(43);
	 hs.add(34);
	 hs.add(33);
	 hs.add(41);
	 hs.add(93);
	 hs.add(53);
	 hs.add(33);
	 hs.add(23);
	 
	 hs.forEach(num->System.out.println(num));
	}

}
