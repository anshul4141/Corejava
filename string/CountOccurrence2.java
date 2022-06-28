package com.raystech.string;

public class CountOccurrence2 {
	public static void main(String[] args) {
		int r = 0;
		String name = "Vijay Dinanath Chouhan";
		for (int i = 0; i<name.length(); i++) {
		for (int j = 0; j<name.length(); j++) {
			if (name.charAt(i) == name.charAt(j)) {
				r++;
			}
		}
		System.out.println(name.charAt(i)+ "=" +r);
		r=0;
			
	}

}
	}
