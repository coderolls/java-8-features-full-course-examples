package com.coderolls.java.streams.collect;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,6,6,6,7);
		
		List<Integer> list2 = list.stream().map(i->i*2).collect(
				Collectors.toList());
		
		System.out.println(list2);
		
		Set<Integer> set = list.stream().collect(
				Collectors.toCollection(TreeSet::new));
		
		System.out.println(set);
		
		String join = list.stream().map(i->String.valueOf(i)).collect(
				Collectors.joining(", "));
		
		System.out.println(join);



	}

}
