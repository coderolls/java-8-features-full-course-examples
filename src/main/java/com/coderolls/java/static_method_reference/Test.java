package com.coderolls.java.static_method_reference;

interface Printable{
	
	public void hello();
}

public class Test {

	public static void main(String[] args) {
		
		Printable p1 = ()-> System.out.println("Hello World!");
		p1.hello();
		
		Printable p2 = Test::printHello;
		p2.hello();
		
		Test t = new Test();
		Printable p3 = t::printHello2;
		p3.hello();

	}
	
	public static void printHello() {
		System.out.println("Hello World from static method");
	}
	
	public void printHello2() {
		System.out.println("Hello World from instance method");

	}

}
