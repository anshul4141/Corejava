package com.raystec.exceptionHandling;

public class test {
	
	public static void main(String[] args) {
		double d = 10/0;
		try {
			System.out.println(d);
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
			// TODO: handle exception
		}
		
	}

}
