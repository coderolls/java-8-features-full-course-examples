package com.coderolls.java.lambda_expression_3;

interface LengthInterface{
	
	public int len(String str);
}

class LengthClass implements LengthInterface{

	@Override
	public int len(String str) {
		return str.length();
	}
	
}

public class Demo1 {

	public static void main(String[] args) {
		
		LengthInterface l = new LengthClass();
		int strLength = l.len("coderolls");
		System.out.println("Str length is : "+ strLength);

	}

}
