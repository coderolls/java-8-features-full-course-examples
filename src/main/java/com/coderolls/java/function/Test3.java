package com.coderolls.java.function;

import java.util.function.Function;

public class Test3 {

	public static void main(String[] args) {
		
		Function<String, String> fun = str -> str.replaceAll(" ", "");
		
		System.out.println(fun.apply("c o d e r o l l s"));
	}

}
