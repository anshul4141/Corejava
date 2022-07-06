package com.reystech.oop;

import com.raystec.exceptionHandling.LoginExeption;

public class Account {
	private String number;
	private String type;
	private double balance;
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void withdrwl(double w) throws LoginExeption{
		if (getBalance()>w) {
			double total = getBalance()-w;
			setBalance(total);
		} else {
			throw new LoginExeption("Insufficent balance");
		}
	}
	
	
		
}
	

	
	


