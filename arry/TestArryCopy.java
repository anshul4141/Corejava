package com.raystech.arry;

public class TestArryCopy {
	public static void main(String[] args) {
		char[] a = {'a','d','c','e','t','y'};
		char[] b = new char[3];
		System.arraycopy(a, 3, b, 0, 3);
		System.out.println(new String(b));
	}

}
