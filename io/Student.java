package com.raystec.io;

import java.io.Serializable;

public class Student implements Serializable {
	
	private String fName;
	private String lName;
	private String address;
	private transient int age;
	
	public Student() {
		
	}
	public Student(String f,String l,String a,int ag) {
		
		fName = f;
		lName = l;
		address = a;
		age = ag;
		
	}
	public String getfName() {
		return fName;
	}
	public String getlName() {
		return lName;
	}
	public String getAddress() {
		return address;
	}
	public int getAge() {
		return age;
	}

}
