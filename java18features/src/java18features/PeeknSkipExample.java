package com.learn;

import java.util.Arrays;
import java.util.List;


public class PeeknSkipExample {
	
	public static void main(String[] args) 
	{
		
		List<Integer> list = Arrays.asList(0,1,2,3,4,5);
		list.stream().skip(2) //skips first two items from the array
					 .filter((t) -> t != 2)
					 .peek((t) -> System.out.println(t))
					 .forEach(System.out::println);
		
		
	}

}
