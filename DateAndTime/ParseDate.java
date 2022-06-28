package com.raystech.DateAndTime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ParseDate {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat a = new SimpleDateFormat("dd/MM/yy");
		String s = "17/06/2022";
		Date d = a.parse(s);
		System.out.println(d);
		
	}

}
