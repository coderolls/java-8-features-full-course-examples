package com.coderolls.java.streams.min_max;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Test {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,4,7,8,5,2,3,6,9,10);
		
		Optional<Integer> min = list.stream().min(Comparator.naturalOrder());
		System.out.println(min.get());
		
		// max
		
		Optional<Integer> max = list.stream().max(Comparator.naturalOrder());
		System.out.println(max.get());
		

	}

}
