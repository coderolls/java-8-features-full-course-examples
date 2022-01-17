package com.coderolls.java.streams.sorted;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.coderolls.java.lambda_expressions_in_collections.Employee;

public class Test2 {

	public static void main(String[] args) {
		
		List<Employee> list = Arrays.asList(
				new Employee(101, "Shubham"),
				new Employee(103, "Gaurav"),
				new Employee(104, "Radha"),
				new Employee(102, "John"),
				new Employee(105, "Mike")
				);	
		
		System.out.println("list: \n"+ list);

		
		List<Employee> list2 = list.stream().sorted().collect(Collectors.toList());
		
		System.out.println("\nlist2: \n"+ list2);
		
		Comparator<Employee> c = (obj1, obj2) -> obj2.getId().compareTo(obj1.getId());
		
		List<Employee> list3 = list.stream().sorted(c).collect(Collectors.toList());
		
		System.out.println("\nlist3: \n"+ list3);
		
	}

}
