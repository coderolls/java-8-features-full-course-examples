package com.coderolls.java.function_chaining;

import java.util.function.Function;

public class Test {

	public static void main(String[] args) {
		
		Function<String, String> f1 = str -> str.replaceAll(" ", "");
		
		Function<String, String> f2 = str -> str.toUpperCase();
		
		// andThen
		Function<String, String> f3 = f1.andThen(f2);
		
		System.out.println(f3.apply("c o d e r o l l s"));
		
		// compose
		Function<String, String> f4 = f1.compose(f2);
		
		System.out.println(f4.apply("c o d e r o l l s"));

	}

}
