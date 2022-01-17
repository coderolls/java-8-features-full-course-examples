package com.coderolls.java.streams.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		System.out.println("list: \n"+ list);

		//case 1 - without using streams 
		
		List<Integer> list2 = new ArrayList<Integer>();
		
		for(Integer i:list) {
			list2.add(i*i);
		}
		System.out.println("\nlist2- without using the Stream API\n"+ list2);
		
		// case 2 - using the stream API - map method
		
		List<Integer> list3 = new ArrayList<Integer>();
		
		list3 = list.stream().map(i-> i*i).collect(Collectors.toList());
		System.out.println("\nlist3- using the Stream API - map method\n"+ list3);

	}

}
