package com.raystec.exceptionHandling;

public class StringException {
	
	public static void main(String[] args) {
		
		String s = "vijay";
		
		try {
			//double d = 15/0;
			System.out.println(s.length());
			System.out.println(s.charAt(5));
		} catch (NullPointerException e) {
			System.out.println("String is Emty now");
		} catch (StringIndexOutOfBoundsException r) {
			System.out.println(r.getMessage());
			
			
		}
	}

}
