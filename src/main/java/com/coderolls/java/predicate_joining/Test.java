package com.coderolls.java.predicate_joining;

import java.util.function.Predicate;

public class Test {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		
		Predicate<Integer> p1 = i -> i>5;
		
		/*
		 * for(int i:arr) { System.out.println(i+": "+p1.test(i)); }
		 */
		//System.out.println("==========");
		Predicate<Integer> p2 = p1.negate();
		
		/*
		 * for(int i:arr) { System.out.println(i+": "+p2.test(i)); }
		 */
		
		
		Predicate<Integer> p3 = i -> i%2==0;
		
		Predicate<Integer> p4 = p1.and(p3);
		
		/*
		 * for(int i:arr) { System.out.println(i+": "+p4.test(i)); }
		 */
		
		
		// or
		
		Predicate<Integer> p5 = p1.or(p3);
		
		for(int i:arr) {
			System.out.println(i+": "+p5.test(i));
		}

	}

}
