package com.coderolls.java.streams.limit;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		System.out.println("list: "+ list);

		
		List<Integer> list2 = list.stream().limit(5).collect(Collectors.toList());
		
		System.out.println("list2: "+ list2);
	}

}
