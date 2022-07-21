package com.raystec.exceptionHandling;

public class LoginExeption extends Exception {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	public LoginExeption(String s) {
		super("Insufficent Balance");
	}
	public LoginExeption() {
		super("System Not Found");

}
	}
