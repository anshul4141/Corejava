package com.raystech.DateAndTime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Dateclass {
	public static void main(String[] args) {
		Date a = new Date();{
			System.out.println(a);
			SimpleDateFormat b = new SimpleDateFormat("ww/dd/MM/yyyy");
			String c = b.format(a);
			System.out.println(c);
			
			
			
			
			
		}
	}

}
