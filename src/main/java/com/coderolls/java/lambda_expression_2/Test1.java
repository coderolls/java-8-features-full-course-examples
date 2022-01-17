package com.coderolls.java.lambda_expression_2;


interface Sumable{
	
	public int sum(int a, int b);
}

class SumClass implements Sumable{

	@Override
	public int sum(int a, int b) {
		
		return a+b;
	}
	
}

public class Test1 {

	public static void main(String[] args) {
		
		Sumable s1 = new SumClass();
		
		int result = s1.sum(10, 20);
		
		System.out.println("Sum is : "+result);

	}

}
