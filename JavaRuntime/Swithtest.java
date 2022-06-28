package com.raystech.JavaRuntime;

public class Swithtest {
	
	public static void main(String[] args) {
		int day = 5;
		String dayString = null;
		switch (day) {
		case 0:
			dayString = "sunday";
			break;
		case 1:
			dayString = "monday";
			break;
		case 2:
			dayString = "tuesday";
			break;

		default:
			dayString = "day is comming";
			break;
		}
		System.out.println(dayString);
	}

}
