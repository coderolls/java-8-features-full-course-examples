package com.coderolls.java.lambda_expression;


interface Printable{
	
	public void print();
}

class PrintClass implements Printable{

	@Override
	public void print() {
		System.out.println("Print method logic !");
		
	}
	
}

public class Test1 {

	public static void main(String[] args) {
		
		Printable p = new PrintClass();
		p.print();
	}

}
