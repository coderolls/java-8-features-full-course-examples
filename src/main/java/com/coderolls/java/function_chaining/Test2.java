package com.coderolls.java.function_chaining;

import java.util.function.Function;

public class Test2 {

	public static void main(String[] args) {
		
		Function<Integer, Integer> f1 = i -> i*i;
		
		Function<Integer, Integer> f2 = i -> i+2;
		
		// andThen
		
		Function<Integer, Integer> f3 = f1.andThen(f2);//16+2 = 18
		
		System.out.println(f3.apply(4));
		
		// compose
		Function<Integer, Integer> f4 = f1.compose(f2); // 6*6 = 36
		
		System.out.println(f4.apply(4));

	}

}
