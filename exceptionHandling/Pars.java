package com.raystec.exceptionHandling;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Pars {
	public static void main(String[] args) throws ParseException {
		Date d = new Date();{
			System.out.println(d);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		String s = "7/4/2022";
		
		Date i = sdf.parse(s);
		
		System.out.println(i);
		}
		
		
		
	}
	
}

