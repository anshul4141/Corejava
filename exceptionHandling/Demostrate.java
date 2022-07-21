package com.raystec.exceptionHandling;

public class Demostrate {
	
	public static void main(String[] args) {
		
		String s = "vijay";
		//String i =
		
		try {
			System.out.println(s.length());
			System.out.println(s.charAt(5));
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
			// TODO: handle exception
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			// TODO: handle exception
		}
	}

}
