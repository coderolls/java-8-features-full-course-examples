package com.coderolls.java.functional_interface;

@FunctionalInterface
public interface Simple {
	
	public void method1();

}

@FunctionalInterface
interface Simple2{
	
	public void method2();
	
	default void method3() {
		
	}
	
	public static void method4() {
		
	}
}
@FunctionalInterface
interface Simple3{
	
	public void method2();
	
	default void method3() {
		
	}
	
	default void method4() {
		
	}
	
	public static void method5() {
		
	}
	public static void method6() {
		
	}
}

