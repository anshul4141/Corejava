package com.raystech.string;

public class CountOccurrence {
	public static void main(String[] args) {
		String name = "1144556";
		char search = '6';
		
		int a=0;
		for(int i=0; i<name.length(); i++) {
			if(name.charAt(i) == search)
				a++;
			}
		System.out.println("The Character "+search+
				" appears "+a+" times.");
		
	}

}



