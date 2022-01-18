package com.coderolls.java.streams.distinct;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		
		
		List<Integer> list = Arrays.asList(1,3,3,3,4,5,5,6,9,9,5,8,7,2,1,6,4,2,3,3,10,6,7,3);
		System.out.println("list: \n "+ list);
		
		List<Integer>list2 = list.stream().distinct().collect(Collectors.toList());
		System.out.println("\nlist2: \n "+ list2);

	}

}
