package com.raystec.exceptionHandling;

public class TestArithmeticEx {
	
	public static void main(String[] args) {
		try {
			double a = 15/0;
			System.out.println(a);
		} catch (ArithmeticException e) {
			//System.out.println(e.getMessage());
			e.printStackTrace();
			// TODO: handle exception
		} finally {
			System.out.println("I am finally");
		}
		
		
	}
}
