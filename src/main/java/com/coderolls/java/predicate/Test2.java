package com.coderolls.java.predicate;

import java.util.function.Predicate;

public class Test2 {

	public static void main(String[] args) {

		Predicate<String> p = str -> str.contains("u");
		
		System.out.println(p.test("gaurav"));
		
		System.out.println(p.test("Mark"));

	}

}
