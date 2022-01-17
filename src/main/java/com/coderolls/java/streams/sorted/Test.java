package com.coderolls.java.streams.sorted;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,3,5,7,9,8,6,4,2,10);
		
		System.out.println("list: \n"+list);
		
		List<Integer>list2 = list.stream().sorted().collect(Collectors.toList());
		
		System.out.println("\nlist2: \n"+list2);
		
		Comparator<Integer> c = (i1, i2) -> i2.compareTo(i1);
		
		List<Integer> list3 = list.stream().sorted(c).collect(Collectors.toList());
		
		System.out.println("\nlist3: \n"+list3);

	}

}
