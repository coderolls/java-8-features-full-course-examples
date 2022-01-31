package com.coderolls.java.streams.flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		
		List<Integer> list1 = Arrays.asList(1,2,3);
		List<Integer> list2 = Arrays.asList(4,5,6);
		List<Integer> list3 = Arrays.asList(7,8,9);
		
		List<List<Integer>> listOfLists= Arrays.asList(list1, list2, list3);
		
		System.out.println("listOfLists: "+ listOfLists);
		
		List<Integer> newList = listOfLists.stream().flatMap(x -> x.stream())
					.collect(Collectors.toList());
		
		System.out.println("newList: "+ newList);


	}

}
