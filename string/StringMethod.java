package com.raystech.string;

public class StringMethod {
	public static void main(String[] args) {
		String name = "Vijay Dinanath Chouhan";
		System.out.println(name.length());
		System.out.println(name.charAt(7));
		System.out.println(name.indexOf("i"));
		System.out.println(name.lastIndexOf("i"));
		System.out.println(name.replace("a", "@"));
		System.out.println(name.replaceAll("a", "@"));
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(name.startsWith("Vijay"));
		System.out.println(name.endsWith("Chouhan"));
		System.out.println(name.substring(15));
		
	}

}
