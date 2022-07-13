package com.raystec.collectionFramework;

public class Employee {
	
	private String name;
	private int age;
	private int salary;
	
	public Employee() {
		
		
	}
	
    public Employee(String n, int a, int s) {
		
		name = n;
		age = a;
		salary = s;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getSalary() {
		return salary;
	}
	
	

}
