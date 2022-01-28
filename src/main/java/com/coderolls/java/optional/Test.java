package com.coderolls.java.optional;

import java.util.Optional;

public class Test {

	public static void main(String[] args) {
		
		String name = null;//"Mark";
		
		String optString = Optional.ofNullable(name)
				.orElse("Default fallback value!");
		
		System.out.println(optString);

	}

}
