package com.reystech.oop;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestStudent {
	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		String t = "12/8/2002";
		
		Date e = sdf.parse(t);	
		
		Student s = new Student();
		s.setName("Naman Joshi");
		System.out.println(s.getName());
		s.setAddress("Indore");
		System.out.println(s.getAddress());
		s.setDob(e);
		System.out.println(s.getDob());
		s.setRollNo("2021");
		System.out.println(s.getRollNo());
		s.setMark(95);
		System.out.println(s.getMark());
		
		
		
	}

}
