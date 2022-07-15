package com.raystec.thred;

public class TestThred extends Thread {
	
	private String name;
	
	public TestThred() {
		
		
	}
	public TestThred(String n) {
		name = n;
		
	}
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println(i + name);
			
		}
	} public static void main(String[] args) {
		TestThred t = new TestThred("Anshul");
		TestThred t1 = new TestThred("Pubg");
		t.start();
		System.out.println("m nai janta kon h niche");
		t1.start();
		
			}
	
	}
