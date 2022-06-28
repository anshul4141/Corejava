package com.raystech.basic;

public class Exercise8 {
	public static void main(String[] args) {
		int[][] a = new int[9][10];
		
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 10; j++) {
				a[i][j] = i * 2;
				System.out.print(a[i][j] + "\t");
			}
			System.out.println(" ");
		}
			
		
	}

}
