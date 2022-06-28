package com.reystech.oop;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestPerson {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		String s = "25/01/2001";
		
		Date j = sdf.parse(s);
		
		Person i = new Person("anshul", "Indore", j);
		
		System.out.println("Name= " +  i.getName());
		System.out.println("Address= " + i.getAddress());
		System.out.println("Dob= " + i.getDob());
		System.out.println("Age= " +  Person.age);
		
		
	}
}
		
		

	

