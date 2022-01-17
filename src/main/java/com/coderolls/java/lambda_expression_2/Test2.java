package com.coderolls.java.lambda_expression_2;

interface Sumable2{
	
	public int sum(int a, int b);
}

public class Test2 {

	public static void main(String[] args) {
		
		Sumable2 s2 = (a, b) -> a+b;
		int result2 = s2.sum(45, 30);
		
		System.out.println(result2);

	}

}
