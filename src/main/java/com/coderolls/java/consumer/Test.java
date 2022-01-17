package com.coderolls.java.consumer;

import java.util.Random;
import java.util.function.Consumer;

public class Test {

	public static void main(String[] args) {
		
		Consumer<String> c = str -> System.out.println(str);
		
		c.accept("coderolls");

	}

}
