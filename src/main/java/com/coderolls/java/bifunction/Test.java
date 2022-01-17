package com.coderolls.java.bifunction;

import java.util.function.BiFunction;

public class Test {

	public static void main(String[] args) {
		
		// num1 num2 -> num1+num2
		
		BiFunction<Integer, Integer, Integer> f1 = (num1, num2)-> num1+num2;
		
		System.out.println(f1.apply(3, 6));
		
	}

}
