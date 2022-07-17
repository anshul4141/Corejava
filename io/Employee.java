package com.raystec.io;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Employee implements Serializable {
	
	private int id;
	private String fName;
	private String lName;
	private transient String pas;
	
	public Employee() {
		
	}
    public Employee(int i, String f, String l, String p) {
    	
    	id = i;
    	fName = f;
    	lName = l;
    	pas = p;
		
	}
	public int getId() {
		return id;
	}
	public String getfName() {
		return fName;
	}
	public String getlName() {
		return lName;
	}
	public String getPas() {
		return pas;
	}

}
