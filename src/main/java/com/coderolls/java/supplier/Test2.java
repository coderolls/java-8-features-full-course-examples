package com.coderolls.java.supplier;

import java.util.Random;
import java.util.function.Supplier;

public class Test2 {

	public static void main(String[] args) {
		
		Supplier<Integer> s = () -> new Random().nextInt(1000);
		
		System.out.println(s.get());

	}

}
