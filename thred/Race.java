package com.raystec.thred;

public class Race extends Thread {
	
	public static Account data = new Account();
	
	public Race() {
		
	}
	
	public Race (String name) {
		super(name);
	}
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			data.deposit(getName(), 1000);
			
		}
	}
	public static void main(String[] args) {
		Race u1 = new Race("Anshul");
		Race u2 = new Race("Hansa");
		u1.start();
		u2.start();
	}

}
