package com.reystech.oop;

import java.util.Date;

public class Person {
	private String name;
	private String address;
	private Date  dob;
	public static final int age = 21;

	public Person() {

	}

	public Person(String c, String d, Date e) {
		name = c;
		address = d;
		dob = e;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public Date getDob() {
		return dob;
	}

}
