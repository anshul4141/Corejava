package com.raystec.perameterise;

public class Person {
	private String fname;
	private String lname;
	private String address;
	
	public Person() {
		System.out.println("Defoult parameterise");
	}
	public Person(String fn, String ln) {
		fname = fn;
		lname = ln;
		System.out.println("2 parameterise constructar " + fname + lname);
	}
	public Person(String fn, String ln, String add) {
		this (fn,ln);
		address = add;
		System.out.println("3 parameterise constructar " + fname + lname + address);
		
	}
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Person p = new Person("Rays ","Tec ","Indore");
		
		
	}

}
