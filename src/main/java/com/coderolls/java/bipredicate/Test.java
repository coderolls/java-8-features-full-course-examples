package com.coderolls.java.bipredicate;

import java.util.function.BiPredicate;

public class Test {

	public static void main(String[] args) {
		
		// num1, num2  - > num1+num2 > 5
		
		BiPredicate<Integer, Integer> p1 = (num1, num2) -> num1+num2 > 5;
		System.out.println(p1.test(5, 6));
		
		System.out.println(p1.test(1, 3));
	}

}
