package com.coderolls.java.lambda_expression;

interface Printable2{
	
	public void print();
}


public class Test2 {

	public static void main(String[] args) {
		
		Printable2 p2 = () -> System.out.println("Print method logic from Printable2!");
		p2.print();
	}

}
