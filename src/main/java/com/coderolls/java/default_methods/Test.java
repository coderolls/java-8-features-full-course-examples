package com.coderolls.java.default_methods;

interface Printable{
	
	public void hello();
	
	//public void printName();
	
	default void printName() {
		System.out.println("Default Impl: Gaurav");
	}
}


public class Test implements Printable{

	public static void main(String[] args) {
		Test t = new Test();
		
		t.printName();

	}

	@Override
	public void hello() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void printName() {
		System.out.println("Custom Impl: Ram");
	}

}
