package com.coderolls.java.consumer;

import java.util.function.Consumer;

public class Test2 {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		
		Consumer<Integer> c = i-> System.out.println(i*i);
		
		for(int num:arr) {
			c.accept(num);
		}

	}

}
