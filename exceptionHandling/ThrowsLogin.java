package com.raystec.exceptionHandling;

public class ThrowsLogin {
	
	public static void main(String[] args) throws LoginExeption     {
		
		auth ("vijay");
		
		}
	public static void auth(String login) throws LoginExeption     {
		
			second("dfdf");
		}
	private static void second(String string) throws LoginExeption  {
		
		LoginExeption l = new LoginExeption();
		
		throw l;
		
	}
	
	
	

}
