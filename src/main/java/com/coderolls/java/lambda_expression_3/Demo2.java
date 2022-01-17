package com.coderolls.java.lambda_expression_3;

interface LengthInterface2{
	
	public int len(String str);
	
}

public class Demo2 {

	public static void main(String[] args) {
		
		LengthInterface2 l2 = str -> str.length();
		int strLength2 = l2.len("coderolls.com");
		
		System.out.println("Str2 length is : "+strLength2);
	}

}
