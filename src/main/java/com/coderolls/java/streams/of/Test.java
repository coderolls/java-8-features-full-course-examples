package com.coderolls.java.streams.of;

import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
		
		// group of values
		
		Stream<String> s1 = Stream.of("John", "Mark", "Apeksha", "Vikas");
		s1.forEach(System.out::println);
		
		// an array
		
		Integer[] arr = {1,2,3,4,5,6,7,8,9,10};
		
		Stream<Integer> s2 = Stream.of(arr);
		
		s2.filter(i->i>5).forEach(System.out::println);
		
	}

}
