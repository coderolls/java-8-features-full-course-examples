package com.coderolls.java.function;

import java.util.function.Function;

public class Test2 {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		
		Function<Integer, Integer> fun = i -> i*i;
		
		for(int i : arr) {
			System.out.println(fun.apply(i));
		}
	}

}
