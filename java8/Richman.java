package com.rays.java8;


public interface Richman {
	
	public void party();
	
	
	public void earnMoney();
	
	
	public void socialWorker();
	
	
	public default void testD() {
		
		System.out.println("Hello defoult");
	
	}
	

	public static void testStatic() {
		
		System.out.println("Hello Static");
		
	
		
		
	}	
		
	}
	


