package com.raystech.DateAndTime;

import java.time.LocalDate;

public class FindError {
	public static void main(String[] args) {
		LocalDate endDate = LocalDate.of(2020, 11, 25);
		LocalDate today = LocalDate.now();
		
		if (endDate.isBefore(today)) {
			System.out.println("Error");
		} else {
			System.out.println("Not Error");
		}
	}

} 
