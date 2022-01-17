package com.coderolls.java.method_reference;

interface Printable{
	
	public void print();
}

class PrintClass {
	
	public static void printMethod() {
		System.out.println("Hello World from static method");
	}
	
	public void instancePrint() {
		System.out.println("Hello World from instance method");
	}
}

public class Test {
	
	public static void main(String[] args) {
		
		Printable p = PrintClass::printMethod;
		p.print();
		
		PrintClass pc = new PrintClass();
		Printable p3 = pc:: instancePrint;
		p3.print();
		
	}
}
