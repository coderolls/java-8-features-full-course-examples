package com.coderolls.java.lambda_expressions_in_collections;

import java.util.ArrayList;
import java.util.Collections;

public class Test {

	public static void main(String[] args) {
		
		// create an arraylist
		ArrayList<Employee> list = new ArrayList<Employee>();
		
		// create employee objects
		Employee e1 = new Employee(101, "John");
		Employee e2 = new Employee(103, "Ruby"); 
		Employee e3 = new Employee(104, "Mark"); 
		Employee e4 = new Employee(102, "Natasha"); 

		
		// add employee objects to the list
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		
		System.out.println("Before Sorting: \n"+ list);
		
		// sort it in asc order
		//Collections.sort(list, new SortById());
		
		Collections.sort(list,( eObj1, eObj2) -> eObj1.getId() - eObj2.getId());
		
		System.out.println("\nAfter Sorting: \n"+ list);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
