package com.coderolls.java.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		
		// al of int
		
		List<Integer> al = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		System.out.println("al: \n"+ al);
		
		// al2 of int >5
		List<Integer> al2 = new ArrayList<Integer>();
		
		/// case 1 - without using streams
		/*
		 * for(Integer i:al) { if(i>5) al2.add(i); }
		 * 
		 * System.out.println("\nal2 - without using streams: \n"+ al2);
		 */
		
		// case 2 - with streams API
		
		al2 = al.stream().filter(i-> i>5).collect(Collectors.toList());
		
		System.out.println("\nal2 -  using streams: \n"+ al2);
	}

}
