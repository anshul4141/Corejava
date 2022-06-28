package com.reystech.oop;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDoctor {
	public static void main(String[] args) throws ParseException {
SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		String t = "12/8/2002";
		
		Date e = sdf.parse(t);	
		
		Doctor d = new Doctor();
		
		d.setName("DR.MBBS Mishra");
		d.setAddress("Indore");
		d.setDob(e);
		d.setRegistrationNo("DR0100050002");
		
		System.out.println(d.getName());
		System.out.println(d.getAddress());
		System.out.println(d.getDob());
		System.out.println(d.getRegistrationNo());
	}

}
