package com.rays.java8;

public class TestLambda {

	public static void main(String[] args) {
		
		SocialWorker s = () -> {
			
			System.out.println("Help To Other");
			
		};
		s.help();
		
		}
	
}
