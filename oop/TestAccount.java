package com.reystech.oop;

import com.raystec.exceptionHandling.LoginExeption;

public class TestAccount {
	public static void main(String[] args) throws LoginExeption  {
		Account a = new Account();
		
		
		a.setBalance(2000);
		System.out.println(a.getBalance());
		
		a.withdrwl(5000);
		System.out.println(a.getBalance());
		
		
		
		
		
		
		
	}

}
