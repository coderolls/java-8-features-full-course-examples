package com.coderolls.java.constructror_reference;

interface Printable{
	
	public PrintClass get();
}

class PrintClass{
	
	public PrintClass() {
		System.out.println("Using no org constructor!");
	}
}

public class Test {

	public static void main(String[] args) {
		
		Printable p1 = ()-> new PrintClass();
		p1.get();
		
		Printable p2 = PrintClass::new;
		p2.get();

	}

}
