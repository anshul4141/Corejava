package com.raystech.DateAndTime;

import java.time.LocalDate;
import java.time.Period;

public class AgeCalculate {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		LocalDate employeebirthday = LocalDate.of(2002, 1, 25);
		Period diffrent = Period.between(employeebirthday, today);
		System.out.println(diffrent.getYears()   + " years");
		System.out.println(diffrent.getMonths()  + " months");
		System.out.println(diffrent.getDays()    + " days");
		
	}

}
