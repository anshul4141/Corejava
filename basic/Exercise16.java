package com.raystech.basic;

public class Exercise16 {
	public static void main(String[] args) {
		int[] a = {54,85,63,95,74,85,94,100};
		int b;
		
		for (int i = 0; i < a.length; i++) {
			for(int j = i + 1; j < a.length; j++) {
				if(a[i] < a[j]) {
					b = a[i];
					a[i] = a[j];
					a[j] = b;
				}
			}
		}
		System.out.println(a[1]);
	}

}
