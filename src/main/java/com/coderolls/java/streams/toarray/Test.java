package com.coderolls.java.streams.toarray;

import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,6,6,7,8);
		
		Object[] arr = list.stream().filter(i-> i>3).toArray();
		
		for(Object o :arr) {
			System.out.println(o.toString());
		}
		
		Integer[] arr2 = list.stream().filter(i-> i>3).toArray(
				Integer[]::new);
		System.out.println("===========================");
		for(Integer i:arr2) {
			System.out.println(i);
		}
	}

}
