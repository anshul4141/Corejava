package com.reystech.oop;

public class Account {
	private String number;
	private String type;
	private double balance;
	
	public Account() {
		
		
	}
	
	public Account(String n, String t, double b ) {
		number = n;
		type = t;
		balance = b;
	}
	public String getNumber() {
		return number;
	}
	public String getType() {
		return type;
	}

	public double getBalance() {
		return balance;
	}

	public void deposite(double d) {
	  balance = balance+d;
		
	}
	public void withdrawl(double w) {
		balance= balance- w;
	}
	
	public void fundtransfer (double f) {
		balance = balance -f;
		
	}
	public void paybill (double p) {
		balance = balance -p;
		
	}
	
}
	
	


