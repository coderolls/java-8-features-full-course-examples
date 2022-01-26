package com.coderolls.java.streams.foreach;

import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		// case 1 - using for loop
		System.out.println("\nUsing simple for loop-");
		for(int i =0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		// case 2 - using foreach loop, enhanced for loop
		System.out.println("\nUsing foreach loop-");
		for(Integer i:list) {
			System.out.println(i);
		}
		
		//case 3 foreach method
		System.out.println("\nUsing foreach method-");

		list.stream().forEach(System.out:: println);
		
				
	}

}
