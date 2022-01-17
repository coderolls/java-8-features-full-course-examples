package com.coderolls.java.lambda_expressions_in_collections;

public class Employee implements Comparable<Employee>{
	
	private Integer id;
	
	private String name;

	public Employee(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Employee o) {
		
		return this.getId().compareTo(o.getId());
	}
	
}
