package com.reystech.oop;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestBusinessman {
	public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		String t = "12/8/2002";
		
		Date e = sdf.parse(t);	
		
		Businessman b = new Businessman(75000);
		
		b.setName("xyz");
		b.setAddress("Indore");
		b.setDob(e);
		
		System.out.println(b.getName());
		System.out.println(b.getAddress());
		System.out.println(b.getDob());
		System.out.println(b.getIncome());
	}

}
