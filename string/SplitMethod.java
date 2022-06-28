package com.raystech.string;

public class SplitMethod {
	public static void main(String[] args) {
		String name = "Vijay Dinanath chouhan";
		String [] name1 = name.split(" ");
		 for (String s : name1) {
			 System.out.println(s);
		 }
	}

}