package com.coderolls.java.biconsumer;

import java.util.function.BiConsumer;

public class Test {

	public static void main(String[] args) {
		
		// name, marks
		
		BiConsumer<String, Integer> c1 = 
				(name, marks) -> System.out.println(name+ " got "+ marks+ " marks.");
		c1.accept("Ruby", 85);
		
		c1.accept("James", 53);
	}

}
