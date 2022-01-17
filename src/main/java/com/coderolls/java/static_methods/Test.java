package com.coderolls.java.static_methods;

import java.util.Date;

interface Printable{
	
	public static void printTime() {
		System.out.println(new Date());
	}
}

public class Test {

	public static void main(String[] args) {
		
		Printable.printTime();

	}

}
