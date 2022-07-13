package com.raystec.collectionFramework;

public class Employee2 {
	
	private String fname;
	private String lname;
	private int age;
	private int salary;
	
	public Employee2() {
		
		
	}
	
    public Employee2(String n, String l, int a, int s) {
		
		fname = n;
		lname = l;
		age = a;
		salary = s;
	}

	public String getFname() {
		return fname;
	}

	public String getLname() {
		return lname;
	}

	public int getAge() {
		return age;
	}

	public int getSalary() {
		return salary;
	}
	
	

}



