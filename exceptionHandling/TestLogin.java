package com.raystec.exceptionHandling;

public class TestLogin {
	
	public static void main(String[] args) {
		
		outhenticate ("Vijay");
	}
	private static void outhenticate(String login) {
	if (!login.equals("Vijay")) {
		
		LoginExeption e = new LoginExeption();
		
		try {
			throw e;
		} catch (LoginExeption e2) {
			System.out.println(e.getMessage());
			// TODO: handle exception
		}
		
	} else {
		System.out.println("xyz");
	}

}

}
