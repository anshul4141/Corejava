package com.raystec.thred;

public class Account  {
	
	private int balance;
	
	
	public int getBalance() {
		return balance;
	}

	public void setBalance(int b) {
		balance = b;
	}
	
   public void deposit(String nm, int amt) {
	  //  synchronized (this) {
	    	int bal = getBalance() + amt;
	    	setBalance(bal);
	    	System.out.println(nm + " = " + bal);
	    }
	   
   }  
   
	
	
	
	


