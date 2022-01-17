package com.coderolls.java.streams.filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		System.out.println("list \n"+ list);
		
		// case 1 - without using streams
		List<Integer> list2 = new ArrayList<Integer>();
		
		for(Integer i : list) {
			if(i%2==0)
				list2.add(i);
		}
		System.out.println("\nlist2- without using stream API\n"+ list2);
		
		
		//case2 - using streams
		
		List<Integer> list3 = new ArrayList<Integer>();
		
		list3 = list.stream().filter(i-> i%2==0).collect(Collectors.toList());
		System.out.println("\nlist3- using stream API\n"+ list3);

	}

}
