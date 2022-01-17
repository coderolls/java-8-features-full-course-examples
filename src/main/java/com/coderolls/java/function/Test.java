package com.coderolls.java.function;

import java.util.function.Function;

public class Test {

	public static void main(String[] args) {
		
		Function<String, Integer> fun = str -> str.length();
		
		System.out.println(fun.apply("coderolls"));
	}

}
