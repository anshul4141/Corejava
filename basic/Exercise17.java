package com.raystech.basic;

public class Exercise17 {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7};
		int[] b = {1,2,3,4,5,6};
		int x = 0;
		int y = 0;
		int miss = 0;
		
		for(int i : a){
			 x = x + i;
		}
		for (int j : b) {
			y = y + j;
		}
		miss = x - y;
		System.out.println(miss);
		
		
		
	}

}
