package com.coderolls.java.streams.count;

import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		
		List<Integer> list = Arrays.asList(1,2,5,6,3,4,7);
		
		System.out.println("List size:  "+ list.size());
		
		long count = list.stream().count();
		
		System.out.println("Count:  "+ count);
	}

}
