package com.coderolls.java.consumer_chaining;

import java.util.function.Consumer;

public class Test {

	public static void main(String[] args) {
		
		Consumer<String> c1 = str -> System.out.println("Logging "+ str);
		
		Consumer<String> c2 = str -> System.out.println("Saved "+str+" in th db!");
		
		Consumer<String> c3 = c1.andThen(c2);
		
		c3.accept("Simple message!");
		

	}

}
